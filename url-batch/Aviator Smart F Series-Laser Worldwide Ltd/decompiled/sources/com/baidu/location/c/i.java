package com.baidu.location.c;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5100a = false;

    /* renamed from: b, reason: collision with root package name */
    private static g f5101b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5102c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5103d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5104e = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5105a;

        static {
            int[] iArr = new int[b.values().length];
            f5105a = iArr;
            try {
                iArr[b.ONLY_CELL_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5105a[b.ONLY_WIFI_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5105a[b.GET_ALL_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        ONLY_CELL_MODE,
        ONLY_WIFI_MODE,
        GET_ALL_DATA
    }

    public static g i() {
        return f5101b;
    }

    public com.baidu.location.c.b a(com.baidu.location.c.b bVar, TelephonyManager telephonyManager) {
        return com.baidu.location.c.a.a.a().b(bVar, telephonyManager);
    }

    public HashSet<String> b(com.baidu.location.c.b bVar) {
        return com.baidu.location.c.a.a.a().c(bVar);
    }

    public long c() {
        return com.baidu.location.c.a.b.a().c();
    }

    public List<CellInfo> d() {
        return com.baidu.location.c.a.a.a().d();
    }

    public com.baidu.location.c.b e(int i8) {
        if (this.f5104e && this.f5102c) {
            return com.baidu.location.c.a.a.a().d(i8);
        }
        return null;
    }

    public m f(int i8) {
        if (this.f5104e && this.f5103d) {
            return com.baidu.location.c.a.b.a().a(i8);
        }
        return null;
    }

    public WifiInfo g() {
        return com.baidu.location.c.a.b.a().f();
    }

    public m h() {
        return com.baidu.location.c.a.b.a().d();
    }

    public String a(int i8, boolean z7, m mVar, int i9) {
        return com.baidu.location.c.a.b.a().a(i8, z7, mVar, i9);
    }

    public void b() {
        if (this.f5102c) {
            com.baidu.location.c.a.a.a().b();
        }
        if (this.f5103d) {
            com.baidu.location.c.a.b.a().b();
        }
        this.f5104e = false;
    }

    public String c(com.baidu.location.c.b bVar) {
        return com.baidu.location.c.a.a.a().b(bVar);
    }

    public void d(int i8) {
        com.baidu.location.c.a.a.a().b(Math.max(i8, 29));
    }

    public boolean e() {
        return com.baidu.location.c.a.a.a().c();
    }

    public String f() {
        return com.baidu.location.c.a.b.a().e();
    }

    public String a(WifiInfo wifiInfo, String str) {
        return com.baidu.location.c.a.b.a().a(wifiInfo, str);
    }

    public void b(int i8) {
        com.baidu.location.c.a.a.a().c(i8);
    }

    public void c(int i8) {
        if (i8 >= 0) {
            com.baidu.location.c.a.b.a().a(i8);
        }
    }

    public String a(com.baidu.location.c.b bVar) {
        return com.baidu.location.c.a.a.a().a(bVar);
    }

    public void b(boolean z7) {
        com.baidu.location.c.a.a.a().b(z7);
    }

    public String a(m mVar, int i8, String str, boolean z7, int i9) {
        return com.baidu.location.c.a.b.a().a(mVar, i8, str, z7, i9);
    }

    public void a(int i8) {
        if (i8 >= 0) {
            com.baidu.location.c.a.a.a().a(i8);
        }
    }

    public void a(Context context, List<String> list) {
        if (this.f5102c) {
            com.baidu.location.c.a.a.a().a(context);
        }
        if (this.f5103d) {
            com.baidu.location.c.a.b.a().a(context, list);
        }
        this.f5104e = true;
    }

    public void a(g gVar) {
        f5101b = gVar;
    }

    public void a(b bVar) {
        int i8 = a.f5105a[bVar.ordinal()];
        if (i8 == 1) {
            this.f5102c = true;
            this.f5103d = false;
            return;
        }
        if (i8 == 2) {
            this.f5102c = false;
        } else {
            if (i8 != 3) {
                throw new IllegalArgumentException("Illegal this mode : " + bVar);
            }
            this.f5102c = true;
        }
        this.f5103d = true;
    }

    public void a(boolean z7) {
        com.baidu.location.c.a.a.a().a(z7);
    }

    public static boolean a() {
        return f5100a;
    }

    public boolean a(com.baidu.location.c.b bVar, com.baidu.location.c.b bVar2) {
        return com.baidu.location.c.a.a.a().a(bVar, bVar2);
    }
}
