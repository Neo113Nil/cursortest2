package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f910b;

    public H(I i, int i2) {
        this.f910b = i;
        this.f909a = i2;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f910b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f942w;
        int i2 = this.f909a;
        if (abstractComponentCallbacksC0048q == null || i2 >= 0 || !abstractComponentCallbacksC0048q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
