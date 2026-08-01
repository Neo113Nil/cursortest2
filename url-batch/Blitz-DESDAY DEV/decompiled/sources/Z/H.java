package Z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f1019b;

    public H(I i, int i2) {
        this.f1019b = i;
        this.f1018a = i2;
    }

    @Override // Z.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i = this.f1019b;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = i.f1051w;
        int i2 = this.f1018a;
        if (abstractComponentCallbacksC0047q == null || i2 >= 0 || !abstractComponentCallbacksC0047q.g().M(-1, 0)) {
            return i.N(arrayList, arrayList2, i2, 1);
        }
        return false;
    }
}
