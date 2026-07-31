package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0114d4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0065b7 f1208a;
    public C0526tb b;
    public C0551ub c;
    public C0044ac d;

    public C0114d4(File file) {
        this.f1208a = new C0065b7(file);
    }

    public final synchronized Ia a(Context context) {
        C0551ub c0551ub;
        c0551ub = this.c;
        if (c0551ub == null) {
            c0551ub = new C0551ub(c(context));
            this.c = c0551ub;
        }
        return c0551ub;
    }

    public final synchronized Ia b(Context context) {
        return c(context);
    }

    public final Ia c(Context context) {
        C0044ac c0044ac;
        C0526tb c0526tb = this.b;
        if (c0526tb != null) {
            return c0526tb;
        }
        synchronized (this) {
            c0044ac = this.d;
            if (c0044ac == null) {
                C0065b7 c0065b7 = this.f1208a;
                String a2 = new C0039a7(c0065b7.f1179a, c0065b7.b, true).a(context, new O3());
                N6 n6 = AbstractC0620x5.c;
                n6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0545u5.f1509a);
                C0261in c0261in = n6.c;
                X6 x6 = n6.f965a;
                T6 t6 = x6.c;
                U6 u6 = x6.d;
                C0451qa c0451qa = new C0451qa(false);
                c0451qa.a(112, new P3());
                C0339ln c0339ln = new C0339ln("service database", hashMap);
                c0261in.getClass();
                c0044ac = new C0044ac(context, a2, new Z9(a2), new C0287jn(t6, u6, c0451qa, c0339ln));
                this.d = c0044ac;
            }
        }
        C0526tb c0526tb2 = new C0526tb(c0044ac);
        this.b = c0526tb2;
        return c0526tb2;
    }
}
