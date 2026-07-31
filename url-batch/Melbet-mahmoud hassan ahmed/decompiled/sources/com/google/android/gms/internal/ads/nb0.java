package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class nb0 {

    /* renamed from: b, reason: collision with root package name */
    private final Context f9013b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9014c;

    /* renamed from: d, reason: collision with root package name */
    private final po0 f9015d;

    /* renamed from: e, reason: collision with root package name */
    private final a3.h0<ha0> f9016e;

    /* renamed from: f, reason: collision with root package name */
    private final a3.h0<ha0> f9017f;

    /* renamed from: g, reason: collision with root package name */
    private mb0 f9018g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f9012a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private int f9019h = 1;

    public nb0(Context context, po0 po0Var, String str, a3.h0<ha0> h0Var, a3.h0<ha0> h0Var2) {
        this.f9014c = str;
        this.f9013b = context.getApplicationContext();
        this.f9015d = po0Var;
        this.f9016e = h0Var;
        this.f9017f = h0Var2;
    }

    public final hb0 b(gb gbVar) {
        synchronized (this.f9012a) {
            synchronized (this.f9012a) {
                mb0 mb0Var = this.f9018g;
                if (mb0Var != null && this.f9019h == 0) {
                    mb0Var.e(new fp0() { // from class: com.google.android.gms.internal.ads.ua0
                        @Override // com.google.android.gms.internal.ads.fp0
                        public final void c(Object obj) {
                            nb0.this.j((ha0) obj);
                        }
                    }, new dp0() { // from class: com.google.android.gms.internal.ads.sa0
                        @Override // com.google.android.gms.internal.ads.dp0
                        public final void zza() {
                        }
                    });
                }
            }
            mb0 mb0Var2 = this.f9018g;
            if (mb0Var2 != null && mb0Var2.a() != -1) {
                int i7 = this.f9019h;
                if (i7 == 0) {
                    return this.f9018g.f();
                }
                if (i7 != 1) {
                    return this.f9018g.f();
                }
                this.f9019h = 2;
                d(null);
                return this.f9018g.f();
            }
            this.f9019h = 2;
            mb0 d7 = d(null);
            this.f9018g = d7;
            return d7.f();
        }
    }

    protected final mb0 d(gb gbVar) {
        final mb0 mb0Var = new mb0(this.f9017f);
        final gb gbVar2 = null;
        wo0.f13898e.execute(new Runnable(gbVar2, mb0Var) { // from class: com.google.android.gms.internal.ads.wa0

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ mb0 f13780g;

            {
                this.f13780g = mb0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nb0.this.i(null, this.f13780g);
            }
        });
        mb0Var.e(new cb0(this, mb0Var), new db0(this, mb0Var));
        return mb0Var;
    }

    final /* synthetic */ void h(mb0 mb0Var, final ha0 ha0Var) {
        synchronized (this.f9012a) {
            if (mb0Var.a() != -1 && mb0Var.a() != 1) {
                mb0Var.c();
                wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.va0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ha0.this.c();
                    }
                });
                a3.r1.k("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    final /* synthetic */ void i(gb gbVar, mb0 mb0Var) {
        try {
            pa0 pa0Var = new pa0(this.f9013b, this.f9015d, null, null);
            pa0Var.r0(new ra0(this, mb0Var, pa0Var));
            pa0Var.X("/jsLoaded", new ya0(this, mb0Var, pa0Var));
            a3.h1 h1Var = new a3.h1();
            za0 za0Var = new za0(this, null, pa0Var, h1Var);
            h1Var.b(za0Var);
            pa0Var.X("/requestReload", za0Var);
            if (this.f9014c.endsWith(".js")) {
                pa0Var.Q(this.f9014c);
            } else if (this.f9014c.startsWith("<html>")) {
                pa0Var.z(this.f9014c);
            } else {
                pa0Var.q0(this.f9014c);
            }
            a3.g2.f72i.postDelayed(new bb0(this, mb0Var, pa0Var), 60000L);
        } catch (Throwable th) {
            io0.e("Error creating webview.", th);
            y2.t.p().s(th, "SdkJavascriptFactory.loadJavascriptEngine");
            mb0Var.c();
        }
    }

    final /* synthetic */ void j(ha0 ha0Var) {
        if (ha0Var.h()) {
            this.f9019h = 1;
        }
    }
}
