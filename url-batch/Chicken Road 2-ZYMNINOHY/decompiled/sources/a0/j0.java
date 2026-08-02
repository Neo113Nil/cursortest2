package a0;

import W.AbstractC0108a;
import a.AbstractC0124a;
import android.os.Looper;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f4168a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f4169b;

    /* renamed from: c, reason: collision with root package name */
    public int f4170c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4171d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f4172e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4173f;

    public j0(h0 h0Var, i0 i0Var, T.T t4, int i4, Looper looper) {
        this.f4169b = h0Var;
        this.f4168a = i0Var;
        this.f4172e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        AbstractC0124a.t(!this.f4173f);
        this.f4173f = true;
        M m4 = (M) this.f4169b;
        if (!m4.f3933J && m4.f3964j.getThread().isAlive()) {
            m4.f3962h.a(14, this).b();
        } else {
            AbstractC0108a.s("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
