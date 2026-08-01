package Y;

import android.view.View;

/* renamed from: Y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049o extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0051q f1100a;

    public C0049o(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        this.f1100a = abstractComponentCallbacksC0051q;
    }

    @Override // z1.d
    public final View b0(int i) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1100a;
        View view = abstractComponentCallbacksC0051q.f1114E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0051q + " does not have a view");
    }

    @Override // z1.d
    public final boolean e0() {
        return this.f1100a.f1114E != null;
    }
}
