package A;

import R1.y;
import e2.InterfaceC0424c;
import r.AbstractC0856c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* loaded from: classes.dex */
public final class i extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f55f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(AbstractC0893O abstractC0893O, int i3) {
        super(1);
        this.f54e = i3;
        this.f55f = abstractC0893O;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f54e) {
            case 0:
                AbstractC0892N.d((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case 1:
                AbstractC0892N.d((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0892N.f((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0892N.f((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0892N.d((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case 5:
                AbstractC0892N.d((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case 6:
                AbstractC0892N.d((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0892N.f((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                O0.k b3 = abstractC0892N.b();
                O0.k kVar = O0.k.f3741d;
                AbstractC0893O abstractC0893O = this.f55f;
                if (b3 == kVar || abstractC0892N.c() == 0) {
                    AbstractC0892N.a(abstractC0892N, abstractC0893O);
                    abstractC0893O.f0(O0.h.c(0L, abstractC0893O.f8130h), 0.0f, null);
                } else {
                    int i3 = (int) 0;
                    long c2 = l0.c.c((abstractC0892N.c() - abstractC0893O.f8126d) - i3, i3);
                    AbstractC0892N.a(abstractC0892N, abstractC0893O);
                    abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, null);
                }
                break;
            case AbstractC0856c.f8037c /* 9 */:
                AbstractC0892N.f((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case AbstractC0856c.f8039e /* 10 */:
                AbstractC0892N.f((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            case 11:
                AbstractC0892N.g((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
            default:
                AbstractC0892N.f((AbstractC0892N) obj, this.f55f, 0, 0);
                break;
        }
        return y.f4171a;
    }
}
