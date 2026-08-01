package X;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f884b;

    public H(I i, int i2) {
        this.f884b = i;
        this.f883a = i2;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f884b;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = i.f916w;
        int i2 = this.f883a;
        if (abstractComponentCallbacksC0047q == null || i2 >= 0 || !abstractComponentCallbacksC0047q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
