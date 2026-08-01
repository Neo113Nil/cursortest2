package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0048q f941e;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f941e = abstractComponentCallbacksC0048q;
    }

    @Override // q1.d
    public final View d0(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f941e;
        View view = abstractComponentCallbacksC0048q.f955E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // q1.d
    public final boolean e0() {
        return this.f941e.f955E != null;
    }
}
