package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final e9 f3677a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3678b;

    /* renamed from: c, reason: collision with root package name */
    public String f3679c;

    /* renamed from: d, reason: collision with root package name */
    public String f3680d;

    /* renamed from: e, reason: collision with root package name */
    public String f3681e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public String f3682g;

    /* renamed from: h, reason: collision with root package name */
    public Long f3683h;

    /* renamed from: i, reason: collision with root package name */
    public String f3684i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3685j;

    /* renamed from: k, reason: collision with root package name */
    public String f3686k;

    public d9(e9 e9Var) {
        if (e9Var != e9.f) {
            this.f3677a = e9Var;
        } else {
            this.f3677a = e9.f3725e;
        }
        e9 e9Var2 = this.f3677a;
        if (e9Var2 == e9.f3725e || e9Var2 == e9.f3724d) {
            this.f3684i = si.a(si.a(0));
        }
        this.f3678b = 0L;
    }

    public static void a(Throwable th) {
        try {
            new d9(th).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3442U.f4601a;
            if (aVar != null) {
                ((t9) aVar.f3476q.a()).a(this);
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
        this.f3677a = e9.f;
        this.f3681e = si.b(th);
        this.f3680d = si.a(si.a(th));
        this.f3684i = si.a(si.a(1));
        this.f3678b = 0L;
    }

    public d9(Throwable th, e9 e9Var) {
        boolean z = e9Var == e9.f3726g;
        this.f3677a = e9Var;
        this.f3681e = si.b(th);
        this.f3680d = si.a(si.a(th));
        this.f3684i = z ? th.getClass().getName() : si.a(si.a(1));
        this.f3678b = 0L;
    }

    public d9(e9 e9Var, long j3) {
        this.f3677a = e9Var;
        this.f3678b = j3;
    }
}
