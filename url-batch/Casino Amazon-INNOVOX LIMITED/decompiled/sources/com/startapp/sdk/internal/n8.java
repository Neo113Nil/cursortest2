package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    public final o8 f348a;
    public final long b;
    public String c;
    public String d;
    public String e;
    public Object f;
    public String g;
    public Long h;
    public String i;
    public boolean j;
    public String k;

    public n8(o8 o8Var) {
        if (o8Var != o8.f) {
            this.f348a = o8Var;
        } else {
            this.f348a = o8.e;
        }
        o8 o8Var2 = this.f348a;
        if (o8Var2 == o8.e || o8Var2 == o8.d) {
            this.i = zh.a(zh.a(0));
        }
        this.b = 0L;
    }

    public static void a(Throwable th) {
        try {
            new n8(th).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.T.f374a;
            if (aVar != null) {
                ((d9) aVar.p.a()).a(this);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, o8 o8Var) {
        try {
            new n8(th, o8Var).a();
        } catch (Throwable unused) {
        }
    }

    public n8(Throwable th) {
        this.f348a = o8.f;
        this.e = zh.b(th);
        this.d = zh.a(zh.a(th));
        this.i = zh.a(zh.a(1));
        this.b = 0L;
    }

    public n8(Throwable th, o8 o8Var) {
        boolean z = o8Var == o8.g;
        this.f348a = o8Var;
        this.e = zh.b(th);
        this.d = zh.a(zh.a(th));
        this.i = z ? th.getClass().getName() : zh.a(zh.a(1));
        this.b = 0L;
    }

    public n8(o8 o8Var, long j) {
        this.f348a = o8Var;
        this.b = j;
    }
}
