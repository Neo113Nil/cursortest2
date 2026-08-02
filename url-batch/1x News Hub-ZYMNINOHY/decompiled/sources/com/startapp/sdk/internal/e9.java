package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e9 {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f3723c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final e9 f3724d;

    /* renamed from: e, reason: collision with root package name */
    public static final e9 f3725e;
    public static final e9 f;

    /* renamed from: g, reason: collision with root package name */
    public static final e9 f3726g;

    /* renamed from: h, reason: collision with root package name */
    public static final e9 f3727h;

    /* renamed from: i, reason: collision with root package name */
    public static final e9 f3728i;

    /* renamed from: j, reason: collision with root package name */
    public static final e9 f3729j;

    /* renamed from: k, reason: collision with root package name */
    public static final e9 f3730k;

    /* renamed from: l, reason: collision with root package name */
    public static final e9 f3731l;

    /* renamed from: m, reason: collision with root package name */
    public static final e9 f3732m;

    /* renamed from: n, reason: collision with root package name */
    public static final e9 f3733n;
    public static final e9 o;

    /* renamed from: p, reason: collision with root package name */
    public static final e9 f3734p;

    /* renamed from: a, reason: collision with root package name */
    public final String f3735a;

    /* renamed from: b, reason: collision with root package name */
    public final g9 f3736b;

    static {
        f9 f9Var = new f9();
        f9Var.f3786b = 23;
        f9Var.f3787c = 50;
        f9Var.f3788d = true;
        i9 i9Var = new i9();
        String[] strArr = {"initialize"};
        ArrayList arrayList = i9Var.f3962a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            i9Var.f3962a = arrayList;
        }
        String str = strArr[0];
        if (str != null) {
            arrayList.add(str);
        }
        i9 a3 = i9Var.a("value");
        a3.f3965d = "8h";
        f9 a4 = f9Var.a(new j9(a3));
        i9 a5 = new i9().a("value", "details");
        a5.f3965d = "30m";
        f9 a6 = a4.a(new j9(a5));
        i9 i9Var2 = new i9();
        String[] strArr2 = {"CNS.shown", "CNS.closed"};
        ArrayList arrayList2 = i9Var2.f3963b;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            i9Var2.f3963b = arrayList2;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            String str2 = strArr2[i3];
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        i9 a7 = i9Var2.a("value");
        a7.f3965d = "10s";
        f9 a8 = a6.a(new j9(a7));
        a8.f3789e = "2h";
        a8.f = "2s";
        f3724d = new e9("general", new g9(a8));
        f9 f9Var2 = new f9();
        f9Var2.f3786b = 17;
        f9Var2.f3787c = 20;
        f9Var2.f3788d = true;
        i9 i9Var3 = new i9();
        String[] strArr3 = {"fake_click"};
        ArrayList arrayList3 = i9Var3.f3963b;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            i9Var3.f3963b = arrayList3;
        }
        String str3 = strArr3[0];
        if (str3 != null) {
            arrayList3.add(str3);
        }
        i9 a9 = i9Var3.a("appActivity", "value", "details");
        a9.f3965d = "30m";
        f9 a10 = f9Var2.a(new j9(a9));
        i9 i9Var4 = new i9();
        String[] strArr4 = {"fake_click"};
        ArrayList arrayList4 = i9Var4.f3963b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            i9Var4.f3963b = arrayList4;
        }
        String str4 = strArr4[0];
        if (str4 != null) {
            arrayList4.add(str4);
        }
        i9 a11 = i9Var4.a("appActivity", "value");
        a11.f3965d = "10s";
        f9 a12 = a10.a(new j9(a11));
        a12.f3789e = "4h";
        a12.f = "5s";
        f3725e = new e9("error", new g9(a12));
        f9 f9Var3 = new f9();
        f9Var3.f3785a = 0.0d;
        f9Var3.f3786b = 17;
        f9Var3.f3787c = 30;
        f9Var3.f3788d = true;
        i9 a13 = new i9().a("appActivity", "value", "details");
        a13.f3965d = "12h";
        f9 a14 = f9Var3.a(new j9(a13));
        i9 a15 = new i9().a("appActivity", "value");
        a15.f3965d = "1h";
        f9 a16 = a14.a(new j9(a15));
        a16.f3789e = "1d";
        a16.f = "5s";
        g9 g9Var = new g9(a16);
        f = new e9("exception", g9Var);
        new e9("exception_nt", g9Var);
        f9 f9Var4 = new f9();
        f9Var4.f3786b = 17;
        f9Var4.f3787c = 40;
        f9Var4.f3788d = true;
        i9 a17 = new i9().a("value", "details");
        a17.f3965d = "1h";
        f9 a18 = f9Var4.a(new j9(a17));
        a18.f3789e = "2d";
        a18.f = "5s";
        f3726g = new e9("exception_fatal", new g9(a18));
        f3727h = new e9("anr", g9Var);
        f9 f9Var5 = new f9();
        f9Var5.f3785a = 0.0d;
        f9Var5.f3786b = 17;
        f9Var5.f3787c = 10;
        f9Var5.f3788d = false;
        f9Var5.f = "10s";
        new e9("netdiag", new g9(f9Var5));
        f9 f9Var6 = new f9();
        f9Var6.f3786b = 3007;
        f9Var6.f3787c = 90;
        f9Var6.f3788d = true;
        i9 a19 = new i9().a("service");
        a19.f3965d = "1m";
        f9 a20 = f9Var6.a(new j9(a19));
        a20.f3789e = "1h";
        f3728i = new e9("periodic", new g9(a20));
        f9 f9Var7 = new f9();
        f9Var7.f3787c = 90;
        f9Var7.f3788d = true;
        f9Var7.f3789e = "4h";
        f3729j = new e9("nonimpression", new g9(f9Var7));
        f9 f9Var8 = new f9();
        f9Var8.f3786b = 17;
        f9Var8.f3787c = 10;
        f9Var8.f3788d = true;
        f9Var8.f3789e = "4h";
        f3730k = new e9("impression_responses", new g9(f9Var8));
        f9 f9Var9 = new f9();
        f9Var9.f3785a = 0.0d;
        f9Var9.f3786b = 17;
        f9Var9.f3787c = 60;
        f9Var9.f3788d = true;
        f9Var9.f3789e = "1d";
        f9Var9.f = "5s";
        f3731l = new e9("success_smart_redirect_hop_info", new g9(f9Var9));
        f9 f9Var10 = new f9();
        f9Var10.f3786b = 17;
        f9Var10.f3787c = 70;
        f9Var10.f3788d = false;
        new e9("triggeredLink", new g9(f9Var10));
        f9 f9Var11 = new f9();
        f9Var11.f3786b = 23;
        f9Var11.f3787c = 80;
        f9Var11.f3788d = true;
        f9Var11.f3789e = "1d";
        f3732m = new e9("ct", new g9(f9Var11));
        f9 f9Var12 = new f9();
        f9Var12.f3786b = 23;
        f9Var12.f3787c = 80;
        f9Var12.f3788d = true;
        f9Var12.f3789e = "1d";
        f3733n = new e9("lt", new g9(f9Var12));
        f9 f9Var13 = new f9();
        f9Var13.f3786b = 23;
        f9Var13.f3787c = 80;
        f9Var13.f3788d = true;
        f9Var13.f3789e = "1d";
        o = new e9("nir", new g9(f9Var13));
        f9 f9Var14 = new f9();
        f9Var14.f3786b = 19;
        f9Var14.f3787c = 10;
        f9Var14.f3788d = true;
        f9Var14.f3789e = "12h";
        f3734p = new e9("sensors", new g9(f9Var14));
    }

    public e9(String str, g9 g9Var) {
        this.f3735a = str;
        this.f3736b = g9Var;
        f3723c.put(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e9.class != obj.getClass()) {
            return false;
        }
        return si.a((Object) this.f3735a, (Object) ((e9) obj).f3735a);
    }

    public final int hashCode() {
        return this.f3735a.hashCode();
    }

    public final String toString() {
        return this.f3735a;
    }
}
