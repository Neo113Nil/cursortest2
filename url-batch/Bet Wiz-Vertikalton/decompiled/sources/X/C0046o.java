package X;

import android.view.View;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046o extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0048q f1053e;

    public C0046o(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f1053e = abstractComponentCallbacksC0048q;
    }

    @Override // x1.d
    public final View N(int i) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1053e;
        View view = abstractComponentCallbacksC0048q.f1067E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " does not have a view");
    }

    @Override // x1.d
    public final boolean Q() {
        return this.f1053e.f1067E != null;
    }
}
