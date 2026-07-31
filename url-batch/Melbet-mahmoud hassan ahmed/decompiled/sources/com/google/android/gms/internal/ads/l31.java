package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l31 implements zn {

    /* renamed from: f, reason: collision with root package name */
    private eu0 f7804f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f7805g;

    /* renamed from: h, reason: collision with root package name */
    private final x21 f7806h;

    /* renamed from: i, reason: collision with root package name */
    private final v3.d f7807i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7808j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7809k = false;

    /* renamed from: l, reason: collision with root package name */
    private final a31 f7810l = new a31();

    public l31(Executor executor, x21 x21Var, v3.d dVar) {
        this.f7805g = executor;
        this.f7806h = x21Var;
        this.f7807i = dVar;
    }

    private final void f() {
        try {
            final JSONObject a7 = this.f7806h.a(this.f7810l);
            if (this.f7804f != null) {
                this.f7805g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k31
                    @Override // java.lang.Runnable
                    public final void run() {
                        l31.this.c(a7);
                    }
                });
            }
        } catch (JSONException e7) {
            a3.r1.l("Failed to call video active view js", e7);
        }
    }

    public final void a() {
        this.f7808j = false;
    }

    public final void b() {
        this.f7808j = true;
        f();
    }

    final /* synthetic */ void c(JSONObject jSONObject) {
        this.f7804f.b1("AFMA_updateActiveView", jSONObject);
    }

    public final void d(boolean z6) {
        this.f7809k = z6;
    }

    public final void e(eu0 eu0Var) {
        this.f7804f = eu0Var;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void o0(xn xnVar) {
        a31 a31Var = this.f7810l;
        a31Var.f2591a = this.f7809k ? false : xnVar.f14258j;
        a31Var.f2594d = this.f7807i.a();
        this.f7810l.f2596f = xnVar;
        if (this.f7808j) {
            f();
        }
    }
}
