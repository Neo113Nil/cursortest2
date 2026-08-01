package Z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1000b;

    public H(I i, int i2) {
        this.f1000b = i;
        this.f999a = i2;
    }

    @Override // Z.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f1000b;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = i.f1033w;
        int i2 = this.f999a;
        if (abstractComponentCallbacksC0050q == null || i2 >= 0 || !abstractComponentCallbacksC0050q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
