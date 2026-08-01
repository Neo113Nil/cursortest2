package Y;

import android.view.View;

/* renamed from: Y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048o extends H1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0050q f1432a;

    public C0048o(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        this.f1432a = abstractComponentCallbacksC0050q;
    }

    @Override // H1.l
    public final View V(int i) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1432a;
        View view = abstractComponentCallbacksC0050q.f1446E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050q + " does not have a view");
    }

    @Override // H1.l
    public final boolean W() {
        return this.f1432a.f1446E != null;
    }
}
