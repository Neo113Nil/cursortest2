package com.startapp.sdk.internal;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class o8 {
    public static final HashMap c = new HashMap();
    public static final o8 d;
    public static final o8 e;
    public static final o8 f;
    public static final o8 g;
    public static final o8 h;
    public static final o8 i;
    public static final o8 j;
    public static final o8 k;
    public static final o8 l;
    public static final o8 m;

    /* renamed from: a, reason: collision with root package name */
    public final String f361a;
    public final q8 b;

    static {
        p8 p8Var = new p8();
        p8Var.b = 23;
        p8Var.c = 50;
        p8Var.d = true;
        s8 s8Var = new s8();
        String[] strArr = {"initialize"};
        ArrayList arrayList = s8Var.f418a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            s8Var.f418a = arrayList;
        }
        String str = strArr[0];
        if (str != null) {
            arrayList.add(str);
        }
        s8 a2 = s8Var.a("value");
        a2.d = "8h";
        p8 a3 = p8Var.a(new t8(a2));
        s8 a4 = new s8().a("value", "details");
        a4.d = "30m";
        p8 a5 = a3.a(new t8(a4));
        s8 s8Var2 = new s8();
        String[] strArr2 = {"CNS.shown", "CNS.closed"};
        ArrayList arrayList2 = s8Var2.b;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            s8Var2.b = arrayList2;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String str2 = strArr2[i2];
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        s8 a6 = s8Var2.a("value");
        a6.d = "10s";
        p8 a7 = a5.a(new t8(a6));
        a7.e = "2h";
        a7.f = "2s";
        d = new o8("general", new q8(a7));
        p8 p8Var2 = new p8();
        p8Var2.b = 17;
        p8Var2.c = 20;
        p8Var2.d = true;
        s8 s8Var3 = new s8();
        String[] strArr3 = {"fake_click"};
        ArrayList arrayList3 = s8Var3.b;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            s8Var3.b = arrayList3;
        }
        String str3 = strArr3[0];
        if (str3 != null) {
            arrayList3.add(str3);
        }
        s8 a8 = s8Var3.a("appActivity", "value", "details");
        a8.d = "30m";
        p8 a9 = p8Var2.a(new t8(a8));
        s8 s8Var4 = new s8();
        String[] strArr4 = {"fake_click"};
        ArrayList arrayList4 = s8Var4.b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            s8Var4.b = arrayList4;
        }
        String str4 = strArr4[0];
        if (str4 != null) {
            arrayList4.add(str4);
        }
        s8 a10 = s8Var4.a("appActivity", "value");
        a10.d = "10s";
        p8 a11 = a9.a(new t8(a10));
        a11.e = "4h";
        a11.f = "5s";
        e = new o8(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new q8(a11));
        p8 p8Var3 = new p8();
        p8Var3.f376a = 0.0d;
        p8Var3.b = 17;
        p8Var3.c = 30;
        p8Var3.d = true;
        s8 a12 = new s8().a("appActivity", "value", "details");
        a12.d = "12h";
        p8 a13 = p8Var3.a(new t8(a12));
        s8 a14 = new s8().a("appActivity", "value");
        a14.d = "1h";
        p8 a15 = a13.a(new t8(a14));
        a15.e = "1d";
        a15.f = "5s";
        q8 q8Var = new q8(a15);
        f = new o8("exception", q8Var);
        new o8("exception_nt", q8Var);
        p8 p8Var4 = new p8();
        p8Var4.b = 17;
        p8Var4.c = 40;
        p8Var4.d = true;
        s8 a16 = new s8().a("value", "details");
        a16.d = "1h";
        p8 a17 = p8Var4.a(new t8(a16));
        a17.e = "2d";
        a17.f = "5s";
        g = new o8("exception_fatal", new q8(a17));
        h = new o8("anr", q8Var);
        p8 p8Var5 = new p8();
        p8Var5.f376a = 0.0d;
        p8Var5.b = 17;
        p8Var5.c = 10;
        p8Var5.d = false;
        p8Var5.f = "10s";
        new o8("netdiag", new q8(p8Var5));
        p8 p8Var6 = new p8();
        p8Var6.b = 3007;
        p8Var6.c = 90;
        p8Var6.d = true;
        s8 a18 = new s8().a(NotificationCompat.CATEGORY_SERVICE);
        a18.d = "1m";
        p8 a19 = p8Var6.a(new t8(a18));
        a19.e = "1h";
        i = new o8("periodic", new q8(a19));
        p8 p8Var7 = new p8();
        p8Var7.c = 90;
        p8Var7.d = true;
        p8Var7.e = "4h";
        j = new o8("nonimpression", new q8(p8Var7));
        p8 p8Var8 = new p8();
        p8Var8.b = 17;
        p8Var8.c = 10;
        p8Var8.d = true;
        p8Var8.e = "4h";
        k = new o8("impression_responses", new q8(p8Var8));
        p8 p8Var9 = new p8();
        p8Var9.f376a = 0.0d;
        p8Var9.b = 17;
        p8Var9.c = 60;
        p8Var9.d = true;
        p8Var9.e = "1d";
        p8Var9.f = "5s";
        l = new o8("success_smart_redirect_hop_info", new q8(p8Var9));
        p8 p8Var10 = new p8();
        p8Var10.b = 17;
        p8Var10.c = 70;
        p8Var10.d = false;
        new o8("triggeredLink", new q8(p8Var10));
        p8 p8Var11 = new p8();
        p8Var11.b = 19;
        p8Var11.c = 10;
        p8Var11.d = true;
        p8Var11.e = "12h";
        m = new o8("sensors", new q8(p8Var11));
    }

    public o8(String str, q8 q8Var) {
        this.f361a = str;
        this.b = q8Var;
        c.put(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o8.class != obj.getClass()) {
            return false;
        }
        return this.f361a.equals(((o8) obj).f361a);
    }

    public final int hashCode() {
        return this.f361a.hashCode();
    }

    public final String toString() {
        return this.f361a;
    }
}
