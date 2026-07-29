package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f793b;

    public H(I i, int i2) {
        this.f793b = i;
        this.f792a = i2;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f793b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f825w;
        int i2 = this.f792a;
        if (abstractComponentCallbacksC0048q == null || i2 >= 0 || !abstractComponentCallbacksC0048q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
