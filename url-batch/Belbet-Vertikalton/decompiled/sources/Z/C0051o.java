package Z;

import android.view.View;

/* renamed from: Z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051o extends H1.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0053q f1581b;

    public C0051o(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        this.f1581b = abstractComponentCallbacksC0053q;
    }

    @Override // H1.d
    public final View S(int i) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1581b;
        View view = abstractComponentCallbacksC0053q.f1595E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0053q + " does not have a view");
    }

    @Override // H1.d
    public final boolean T() {
        return this.f1581b.f1595E != null;
    }
}
