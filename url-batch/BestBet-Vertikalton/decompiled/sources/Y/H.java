package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f1288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1289b;

    public H(I i, int i2) {
        this.f1289b = i;
        this.f1288a = i2;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f1289b;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = i.f1321w;
        int i2 = this.f1288a;
        if (abstractComponentCallbacksC0050q == null || i2 >= 0 || !abstractComponentCallbacksC0050q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
