package A;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import z2.C1441y;

/* loaded from: classes.dex */
public final class S extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f54e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(int i2, ArrayList arrayList) {
        super(1);
        this.f53d = i2;
        this.f54e = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53d) {
            case 0:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                ArrayList arrayList = this.f54e;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0953N.d(abstractC0953N, (AbstractC0954O) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                this.f54e.get(((Number) obj).intValue());
                break;
            case 2:
                this.f54e.get(((Number) obj).intValue());
                break;
            case 3:
                this.f54e.get(((Number) obj).intValue());
                break;
            case 4:
                AbstractC0953N abstractC0953N2 = (AbstractC0953N) obj;
                ArrayList arrayList2 = this.f54e;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC0953N.f(abstractC0953N2, (AbstractC0954O) arrayList2.get(i4), 0, 0);
                }
                break;
            case 5:
                AbstractC0953N abstractC0953N3 = (AbstractC0953N) obj;
                ArrayList arrayList3 = this.f54e;
                int d4 = C1441y.d(arrayList3);
                if (d4 >= 0) {
                    int i5 = 0;
                    while (true) {
                        AbstractC0953N.f(abstractC0953N3, (AbstractC0954O) arrayList3.get(i5), 0, 0);
                        if (i5 != d4) {
                            i5++;
                        }
                    }
                }
                break;
            case 6:
                AbstractC0953N abstractC0953N4 = (AbstractC0953N) obj;
                ArrayList arrayList4 = this.f54e;
                int size3 = arrayList4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    AbstractC0953N.d(abstractC0953N4, (AbstractC0954O) arrayList4.get(i6), 0, 0);
                }
                break;
            default:
                AbstractC0953N abstractC0953N5 = (AbstractC0953N) obj;
                ArrayList arrayList5 = this.f54e;
                int size4 = arrayList5.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    AbstractC0953N.g(abstractC0953N5, (AbstractC0954O) arrayList5.get(i7), 0, 0);
                }
                break;
        }
        return Unit.f7487a;
    }
}
