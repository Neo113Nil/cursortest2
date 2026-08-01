package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058o extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0060q f1366g;

    public C0058o(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        this.f1366g = abstractComponentCallbacksC0060q;
    }

    @Override // q1.l
    public final View Q(int i) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1366g;
        View view = abstractComponentCallbacksC0060q.f1381E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0060q + " does not have a view");
    }

    @Override // q1.l
    public final boolean T() {
        return this.f1366g.f1381E != null;
    }
}
