package B;

import e2.InterfaceC0424c;
import java.util.ArrayList;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* loaded from: classes.dex */
public final class Q extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f311f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(int i3, ArrayList arrayList) {
        super(1);
        this.f310e = i3;
        this.f311f = arrayList;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f310e) {
            case 0:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                ArrayList arrayList = this.f311f;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC0892N.d(abstractC0892N, (AbstractC0893O) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                AbstractC0892N abstractC0892N2 = (AbstractC0892N) obj;
                ArrayList arrayList2 = this.f311f;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC0892N.f(abstractC0892N2, (AbstractC0893O) arrayList2.get(i4), 0, 0);
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0892N abstractC0892N3 = (AbstractC0892N) obj;
                ArrayList arrayList3 = this.f311f;
                int z02 = S1.m.z0(arrayList3);
                if (z02 >= 0) {
                    int i5 = 0;
                    while (true) {
                        AbstractC0892N.f(abstractC0892N3, (AbstractC0893O) arrayList3.get(i5), 0, 0);
                        if (i5 != z02) {
                            i5++;
                        }
                    }
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0892N abstractC0892N4 = (AbstractC0892N) obj;
                ArrayList arrayList4 = this.f311f;
                int size3 = arrayList4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    AbstractC0892N.d(abstractC0892N4, (AbstractC0893O) arrayList4.get(i6), 0, 0);
                }
                break;
            default:
                AbstractC0892N abstractC0892N5 = (AbstractC0892N) obj;
                ArrayList arrayList5 = this.f311f;
                int size4 = arrayList5.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    AbstractC0892N.g(abstractC0892N5, (AbstractC0893O) arrayList5.get(i7), 0, 0);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
