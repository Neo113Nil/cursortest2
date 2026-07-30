package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    public final int f3595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f3596b;

    public O(Q q4, int i2) {
        this.f3596b = q4;
        this.f3595a = i2;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Q q4 = this.f3596b;
        ComponentCallbacksC0228t componentCallbacksC0228t = q4.f3636y;
        int i2 = this.f3595a;
        if (componentCallbacksC0228t == null || i2 >= 0 || !componentCallbacksC0228t.c().Q()) {
            return q4.R(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
