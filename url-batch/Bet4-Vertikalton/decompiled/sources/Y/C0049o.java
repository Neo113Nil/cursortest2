package Y;

import android.view.View;

/* renamed from: Y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049o extends w1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0051q f1073e;

    public C0049o(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        this.f1073e = abstractComponentCallbacksC0051q;
    }

    @Override // w1.l
    public final View I(int i) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1073e;
        View view = abstractComponentCallbacksC0051q.f1087E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0051q + " does not have a view");
    }

    @Override // w1.l
    public final boolean J() {
        return this.f1073e.f1087E != null;
    }
}
