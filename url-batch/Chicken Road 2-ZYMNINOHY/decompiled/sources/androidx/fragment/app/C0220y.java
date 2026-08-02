package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220y extends N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f4996a;

    public C0220y(F f4) {
        this.f4996a = f4;
    }

    @Override // androidx.fragment.app.N
    public final View b(int i4) {
        F f4 = this.f4996a;
        View view = f4.mView;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + f4 + " does not have a view");
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        return this.f4996a.mView != null;
    }
}
