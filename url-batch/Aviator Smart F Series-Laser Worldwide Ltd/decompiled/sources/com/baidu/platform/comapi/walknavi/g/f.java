package com.baidu.platform.comapi.walknavi.g;

import android.text.TextUtils;
import com.baidu.ar.npc.BaiduArView;
import com.baidu.platform.comapi.walknavi.fsm.RGState;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class f implements com.baidu.platform.comapi.walknavi.g.i.f.a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9966a = true;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.b f9968c;

    /* renamed from: d, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.c f9969d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9971f;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9977l;

    /* renamed from: o, reason: collision with root package name */
    private c f9980o;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9972g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f9973h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9974i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9975j = true;

    /* renamed from: k, reason: collision with root package name */
    public String f9976k = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f9978m = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9979n = false;

    /* renamed from: b, reason: collision with root package name */
    public d f9967b = new d();

    /* renamed from: e, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.g.i.b f9970e = new com.baidu.platform.comapi.walknavi.g.i.b(com.baidu.platform.comapi.h.t.q.a.a());

    class a implements com.baidu.platform.comapi.walknavi.g.i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.baidu.platform.comapi.walknavi.g.c f9981a;

        a(com.baidu.platform.comapi.walknavi.g.c cVar) {
            this.f9981a = cVar;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.a
        public void a(boolean z7, float f8) {
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.a
        public void a(int i8) {
            com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", "download onProgress = " + i8);
            if (i8 == 100) {
                f.this.f9979n = false;
                d dVar = f.this.f9967b;
                dVar.f9987c = 0;
                dVar.f9986b = "";
            }
            if (f.this.f9980o != null) {
                f fVar = f.this;
                fVar.f9967b.f9987c = i8;
                fVar.f9980o.a(f.this.f9967b);
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.a
        public void a(int i8, String str) {
            com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", "download onResponse = " + this.f9981a);
            f.this.f9979n = false;
            d dVar = f.this.f9967b;
            dVar.f9987c = 0;
            dVar.f9986b = "";
            com.baidu.platform.comapi.walknavi.g.c cVar = this.f9981a;
            if (cVar != null) {
                cVar.a(i8, str);
            }
        }
    }

    public interface c {
        void a(d dVar);
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public String f9985a;

        /* renamed from: b, reason: collision with root package name */
        public String f9986b;

        /* renamed from: c, reason: collision with root package name */
        public int f9987c;

        public d() {
        }
    }

    f() {
    }

    public void a(c cVar) {
        this.f9980o = cVar;
    }

    void b(boolean z7) {
        this.f9972g = z7;
    }

    public String c() {
        return this.f9976k;
    }

    public boolean d() {
        return this.f9975j;
    }

    boolean e() {
        if (this.f9969d != null) {
            this.f9971f = true;
        } else {
            this.f9971f = false;
        }
        return this.f9971f;
    }

    public boolean f() {
        return this.f9977l;
    }

    public boolean g() {
        return this.f9970e.g();
    }

    void h() {
        if (this.f9969d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f9969d.a();
            this.f9973h = null;
            this.f9971f = false;
            this.f9969d = null;
            this.f9968c = null;
            this.f9972g = false;
            this.f9977l = false;
            a(currentTimeMillis, "onDestroy");
        }
    }

    void i() {
        if (this.f9969d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f9969d.c();
            a(currentTimeMillis, "onPause");
        }
    }

    void j() {
        if (this.f9969d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f9969d.e();
            a(currentTimeMillis, "onResume");
        }
    }

    void k() {
        if (this.f9969d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f9969d.d();
            a(currentTimeMillis, "pauseByUser");
        }
    }

    void l() {
        if (this.f9969d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f9969d.f();
            a(currentTimeMillis, "resumeByUser");
        }
    }

    public void m() {
        this.f9969d.a(45.0f);
    }

    class b implements com.baidu.platform.comapi.walknavi.g.i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.baidu.platform.comapi.walknavi.g.c f9983a;

        b(com.baidu.platform.comapi.walknavi.g.c cVar) {
            this.f9983a = cVar;
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.a
        public void a(boolean z7, float f8) {
            com.baidu.platform.comapi.h.g.a.b("aaaaa MainActivity isUpdate=" + z7 + ", size=" + f8);
            this.f9983a.a(z7, f8);
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.a
        public void a(int i8) {
            com.baidu.platform.comapi.walknavi.g.c cVar = this.f9983a;
            if (cVar != null) {
                cVar.a(i8);
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.g.i.a
        public void a(int i8, String str) {
            com.baidu.platform.comapi.walknavi.g.c cVar = this.f9983a;
            if (cVar != null) {
                cVar.a(i8, str);
            }
        }
    }

    public void a(boolean z7) {
        this.f9977l = z7;
    }

    BaiduArView b() {
        com.baidu.platform.comapi.walknavi.g.i.c cVar = this.f9969d;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public void c(boolean z7) {
        this.f9975j = z7;
    }

    public void b(String str, com.baidu.platform.comapi.walknavi.g.c cVar) {
        this.f9970e.a(str, new b(cVar));
    }

    public void c(String str) {
        com.baidu.platform.comapi.walknavi.b.n().x().b("walknavi_current_npc_token", str);
        this.f9976k = str;
        d dVar = this.f9967b;
        dVar.f9985a = str;
        c cVar = this.f9980o;
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public String b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        String a8 = this.f9970e.a(str);
        a(currentTimeMillis, "queryLocalResource");
        return a8;
    }

    @Override // com.baidu.platform.comapi.walknavi.g.i.f.a
    public void a(int i8, HashMap<String, Object> hashMap) {
        com.baidu.platform.comapi.walknavi.g.b bVar = this.f9968c;
        if (bVar == null) {
            return;
        }
        bVar.a(i8, hashMap);
    }

    private void a(long j8, String str) {
        if (f9966a) {
            com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", str + "time:" + (System.currentTimeMillis() - j8));
            return;
        }
        com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", str);
    }

    void a(com.baidu.platform.comapi.walknavi.g.b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f9968c = bVar;
        this.f9969d = new com.baidu.platform.comapi.walknavi.g.i.c(com.baidu.platform.comapi.h.t.q.a.a(), this);
        a(currentTimeMillis, "createArManager");
    }

    void a(double d8, double d9, double d10, String str) {
        com.baidu.platform.comapi.walknavi.g.i.c cVar;
        if (!this.f9972g || (cVar = this.f9969d) == null) {
            return;
        }
        cVar.a((float) d8, (float) d9, (float) d10, str);
    }

    void a(String str, String str2) {
        if (this.f9969d == null || !this.f9975j) {
            return;
        }
        if (!TextUtils.equals(str2, this.f9973h) || TextUtils.equals(str2, "turnAndSayHi")) {
            this.f9969d.a(str, str2);
            this.f9973h = str2;
        }
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(this.f9973h)) {
            return TextUtils.equals(str, RGState.METHOD_NAME_ENTER);
        }
        return TextUtils.equals(str, "withoutGPS") || TextUtils.equals(str, "turnRight") || TextUtils.equals(str, "turnLeft") || TextUtils.equals(str, "helpless") || TextUtils.equals(str, "turnAndCry");
    }

    public void a(String str, com.baidu.platform.comapi.walknavi.g.c cVar) {
        com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", "download start = ");
        this.f9979n = true;
        d dVar = this.f9967b;
        dVar.f9986b = str;
        c cVar2 = this.f9980o;
        if (cVar2 != null) {
            cVar2.a(dVar);
        }
        this.f9970e.b(str, new a(cVar));
    }

    public void a() {
        com.baidu.platform.comapi.h.g.a.c("NpcSDKManagerImp", "downloadCancel");
        long currentTimeMillis = System.currentTimeMillis();
        this.f9970e.c();
        a(currentTimeMillis, "downloadCancel");
        this.f9979n = false;
        d dVar = this.f9967b;
        dVar.f9987c = 0;
        dVar.f9986b = "";
    }

    public boolean a(String str, boolean z7) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a8 = this.f9970e.a(str, z7);
        a(currentTimeMillis, "clearARResource");
        return a8;
    }
}
