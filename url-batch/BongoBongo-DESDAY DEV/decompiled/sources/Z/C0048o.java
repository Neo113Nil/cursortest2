package Z;

import android.view.View;

/* renamed from: Z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048o extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0050q f1151e;

    public C0048o(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        this.f1151e = abstractComponentCallbacksC0050q;
    }

    @Override // A1.d
    public final View Y(int i) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1151e;
        View view = abstractComponentCallbacksC0050q.f1166E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050q + " does not have a view");
    }

    @Override // A1.d
    public final boolean Z() {
        return this.f1151e.f1166E != null;
    }
}
