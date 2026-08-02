package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f6789a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6790b;

    /* renamed from: c, reason: collision with root package name */
    public String f6791c;

    /* renamed from: d, reason: collision with root package name */
    public String f6792d;

    /* renamed from: e, reason: collision with root package name */
    public String f6793e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6794f;

    /* renamed from: g, reason: collision with root package name */
    public String f6795g;

    /* renamed from: h, reason: collision with root package name */
    public Long f6796h;

    /* renamed from: i, reason: collision with root package name */
    public String f6797i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6798j;

    /* renamed from: k, reason: collision with root package name */
    public String f6799k;

    public d9(e9 e9Var) {
        if (e9Var != e9.f6840f) {
            this.f6789a = e9Var;
        } else {
            this.f6789a = e9.f6839e;
        }
        e9 e9Var2 = this.f6789a;
        if (e9Var2 == e9.f6839e || e9Var2 == e9.f6838d) {
            this.f6797i = si.a(si.a(0));
        }
        this.f6790b = 0L;
    }

    public static void a(Throwable th) {
        try {
            new d9(th).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f6540U.f7743a;
            if (aVar != null) {
                ((t9) aVar.f6574q.a()).a(this);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, e9 e9Var) {
        try {
            new d9(th, e9Var).a();
        } catch (Throwable unused) {
        }
    }

    public d9(Throwable th) {
        this.f6789a = e9.f6840f;
        this.f6793e = si.b(th);
        this.f6792d = si.a(si.a(th));
        this.f6797i = si.a(si.a(1));
        this.f6790b = 0L;
    }

    public d9(Throwable th, e9 e9Var) {
        boolean z = e9Var == e9.f6841g;
        this.f6789a = e9Var;
        this.f6793e = si.b(th);
        this.f6792d = si.a(si.a(th));
        this.f6797i = z ? th.getClass().getName() : si.a(si.a(1));
        this.f6790b = 0L;
    }

    public d9(e9 e9Var, long j4) {
        this.f6789a = e9Var;
        this.f6790b = j4;
    }
}
