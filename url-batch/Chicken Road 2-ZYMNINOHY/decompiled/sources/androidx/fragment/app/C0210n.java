package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210n extends AbstractC0207k {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4928b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4929c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210n(B0 b02, boolean z, boolean z4) {
        super(b02);
        F f4 = b02.f4725c;
        this.f4928b = b02.f4723a == 2 ? z ? f4.getReenterTransition() : f4.getEnterTransition() : z ? f4.getReturnTransition() : f4.getExitTransition();
        this.f4929c = b02.f4723a == 2 ? z ? f4.getAllowReturnTransitionOverlap() : f4.getAllowEnterTransitionOverlap() : true;
        this.f4930d = z4 ? z ? f4.getSharedElementReturnTransition() : f4.getSharedElementEnterTransition() : null;
    }

    public final w0 b() {
        Object obj = this.f4928b;
        w0 c4 = c(obj);
        Object obj2 = this.f4930d;
        w0 c5 = c(obj2);
        if (c4 == null || c5 == null || c4 == c5) {
            return c4 == null ? c5 : c4;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f4893a.f4725c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final w0 c(Object obj) {
        if (obj == null) {
            return null;
        }
        u0 u0Var = p0.f4951a;
        if (obj instanceof Transition) {
            return u0Var;
        }
        w0 w0Var = p0.f4952b;
        if (w0Var != null && w0Var.e(obj)) {
            return w0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f4893a.f4725c + " is not a valid framework Transition or AndroidX Transition");
    }
}
