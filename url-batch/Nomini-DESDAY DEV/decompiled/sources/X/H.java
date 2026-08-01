package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f792b;

    public H(I i, int i2) {
        this.f792b = i;
        this.f791a = i2;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f792b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f824w;
        int i2 = this.f791a;
        if (abstractComponentCallbacksC0048q == null || i2 >= 0 || !abstractComponentCallbacksC0048q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
