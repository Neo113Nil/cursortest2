package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements I {

    /* renamed from: a, reason: collision with root package name */
    public final int f1209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f1210b;

    public J(K k2, int i) {
        this.f1210b = k2;
        this.f1209a = i;
    }

    @Override // androidx.fragment.app.I
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        K k2 = this.f1210b;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = k2.f1243w;
        int i = this.f1209a;
        if (abstractComponentCallbacksC0060q == null || i >= 0 || !abstractComponentCallbacksC0060q.c().M(-1, 0)) {
            return k2.N(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
