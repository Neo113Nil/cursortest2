package com.ironsource.sdk.controller;

import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.fr;
import com.ironsource.gb;
import com.ironsource.hh;
import com.ironsource.mh;
import com.ironsource.o9;
import com.ironsource.oh;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1560d {

    /* renamed from: h, reason: collision with root package name */
    static final String f19142h = "controllerSourceData";

    /* renamed from: i, reason: collision with root package name */
    private static final String f19143i = "next_";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19144j = "fallback_";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19145k = "controllerSourceCode";

    /* renamed from: a, reason: collision with root package name */
    private long f19146a;

    /* renamed from: b, reason: collision with root package name */
    private int f19147b;

    /* renamed from: c, reason: collision with root package name */
    private c f19148c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC0157d f19149d = EnumC0157d.NONE;

    /* renamed from: e, reason: collision with root package name */
    private String f19150e;

    /* renamed from: f, reason: collision with root package name */
    private String f19151f;

    /* renamed from: g, reason: collision with root package name */
    private gb f19152g;

    /* renamed from: com.ironsource.sdk.controller.d$a */
    class a extends JSONObject {
        a() {
            putOpt(b9.a.f15296j, Integer.valueOf(C1560d.this.f19147b));
            putOpt(C1560d.f19145k, Integer.valueOf(C1560d.this.f19149d.a()));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.d$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19154a;

        static {
            int[] iArr = new int[c.values().length];
            f19154a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19154a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19154a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.d$c */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0157d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: a, reason: collision with root package name */
        private int f19166a;

        EnumC0157d(int i4) {
            this.f19166a = i4;
        }

        public int a() {
            return this.f19166a;
        }
    }

    C1560d(JSONObject jSONObject, String str, String str2, gb gbVar) {
        int optInt = jSONObject.optInt(b9.a.f15296j, -1);
        this.f19147b = optInt;
        this.f19148c = a(optInt);
        this.f19150e = str;
        this.f19151f = str2;
        this.f19152g = gbVar;
    }

    private void c() {
        try {
            oh g4 = g();
            if (g4.exists()) {
                oh h4 = h();
                if (h4.exists()) {
                    h4.delete();
                }
                IronSourceStorageUtils.renameFile(g4.getPath(), h4.getPath());
            }
        } catch (Exception e4) {
            o9.d().a(e4);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private oh h() {
        return new oh(this.f19150e, "fallback_mobileController.html");
    }

    private oh i() {
        return new oh(this.f19150e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        hh a4 = new hh().a(cc.f15753y, Integer.valueOf(this.f19147b));
        if (this.f19146a > 0) {
            a4.a(cc.f15709B, Long.valueOf(System.currentTimeMillis() - this.f19146a));
        }
        mh.a(fr.f16296x, a4.a());
    }

    JSONObject f() {
        return new a();
    }

    oh g() {
        return new oh(this.f19150e, b9.f15268f);
    }

    boolean k() {
        oh ohVar;
        int i4 = b.f19154a[this.f19148c.ordinal()];
        if (i4 == 1) {
            e();
            ohVar = new oh(this.f19150e, SDKUtils.getFileName(this.f19151f));
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    try {
                        oh g4 = g();
                        oh i5 = i();
                        if (!i5.exists() && !g4.exists()) {
                            a(new oh(this.f19150e, SDKUtils.getFileName(this.f19151f)));
                            return false;
                        }
                        if (!i5.exists() && g4.exists()) {
                            EnumC0157d enumC0157d = EnumC0157d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f19149d = enumC0157d;
                            a(enumC0157d);
                            a(new oh(this.f19150e, i5.getName()));
                            return true;
                        }
                        c();
                        if (b()) {
                            EnumC0157d enumC0157d2 = EnumC0157d.PREPARED_CONTROLLER_LOADED;
                            this.f19149d = enumC0157d2;
                            a(enumC0157d2);
                            d();
                            a(new oh(this.f19150e, i5.getName()));
                            return true;
                        }
                        if (!a()) {
                            a(new oh(this.f19150e, SDKUtils.getFileName(this.f19151f)));
                            return false;
                        }
                        EnumC0157d enumC0157d3 = EnumC0157d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f19149d = enumC0157d3;
                        a(enumC0157d3);
                        a(new oh(this.f19150e, i5.getName()));
                        return true;
                    } catch (Exception e4) {
                        o9.d().a(e4);
                    }
                }
                return false;
            }
            c();
            ohVar = new oh(this.f19150e, SDKUtils.getFileName(this.f19151f));
        }
        a(ohVar);
        return false;
    }

    boolean m() {
        return this.f19149d != EnumC0157d.NONE;
    }

    private c a(int i4) {
        return i4 != 1 ? i4 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    void a(hh hhVar) {
        hhVar.a(cc.f15753y, Integer.valueOf(this.f19147b));
        mh.a(fr.f16294v, hhVar.a());
        this.f19146a = System.currentTimeMillis();
    }

    private void a(oh ohVar) {
        if (this.f19152g.c()) {
            return;
        }
        this.f19152g.a(ohVar, this.f19151f);
    }

    private void a(EnumC0157d enumC0157d) {
        hh a4 = new hh().a(cc.f15753y, Integer.valueOf(this.f19147b)).a(cc.f15754z, Integer.valueOf(enumC0157d.a()));
        if (this.f19146a > 0) {
            a4.a(cc.f15709B, Long.valueOf(System.currentTimeMillis() - this.f19146a));
        }
        mh.a(fr.f16295w, a4.a());
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f19148c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0157d enumC0157d = EnumC0157d.CONTROLLER_FROM_SERVER;
        this.f19149d = enumC0157d;
        a(enumC0157d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f19148c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
        } else {
            EnumC0157d enumC0157d = EnumC0157d.FALLBACK_CONTROLLER_RECOVERY;
            this.f19149d = enumC0157d;
            a(enumC0157d);
            runnable.run();
        }
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e4) {
            o9.d().a(e4);
            return false;
        }
    }
}
