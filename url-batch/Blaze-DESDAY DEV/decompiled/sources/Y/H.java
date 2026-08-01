package Y;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f957b;

    public H(I i, int i2) {
        this.f957b = i;
        this.f956a = i2;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f957b;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = i.f989w;
        int i2 = this.f956a;
        if (abstractComponentCallbacksC0051q == null || i2 >= 0 || !abstractComponentCallbacksC0051q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
