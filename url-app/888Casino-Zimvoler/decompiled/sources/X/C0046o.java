package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0048q f936e;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f936e = abstractComponentCallbacksC0048q;
    }

    @Override // q1.d
    public final View c0(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f936e;
        View view = abstractComponentCallbacksC0048q.f950E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // q1.d
    public final boolean d0() {
        return this.f936e.f950E != null;
    }
}
