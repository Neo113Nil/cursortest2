package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends T.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0048q f1079a;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f1079a = abstractComponentCallbacksC0048q;
    }

    @Override // T.d
    public final View C(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1079a;
        View view = abstractComponentCallbacksC0048q.f1093E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // T.d
    public final boolean D() {
        return this.f1079a.f1093E != null;
    }
}
