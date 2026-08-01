package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends s1.l {
    public final /* synthetic */ AbstractComponentCallbacksC0048q h;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.h = abstractComponentCallbacksC0048q;
    }

    @Override // s1.l
    public final View O(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.h;
        View view = abstractComponentCallbacksC0048q.f995E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // s1.l
    public final boolean R() {
        return this.h.f995E != null;
    }
}
