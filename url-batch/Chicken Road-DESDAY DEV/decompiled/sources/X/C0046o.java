package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0048q f1013e;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f1013e = abstractComponentCallbacksC0048q;
    }

    @Override // u1.l
    public final View L(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1013e;
        View view = abstractComponentCallbacksC0048q.f1027E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // u1.l
    public final boolean O() {
        return this.f1013e.f1027E != null;
    }
}
