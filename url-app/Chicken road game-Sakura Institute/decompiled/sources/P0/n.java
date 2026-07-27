package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import q.AbstractC1024c;

/* loaded from: classes.dex */
public final class n extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f3752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(AbstractC0954O abstractC0954O, int i2) {
        super(1);
        this.f3751d = i2;
        this.f3752e = abstractC0954O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3751d) {
            case 0:
                AbstractC0953N.f((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 1:
                AbstractC0953N.f((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 2:
                AbstractC0953N.d((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 3:
                AbstractC0953N.d((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 4:
                AbstractC0953N.g((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 5:
                AbstractC0953N.f((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 6:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                M0.k b4 = abstractC0953N.b();
                M0.k kVar = M0.k.f3555d;
                AbstractC0954O abstractC0954O = this.f3752e;
                if (b4 == kVar || abstractC0953N.c() == 0) {
                    AbstractC0953N.a(abstractC0953N, abstractC0954O);
                    abstractC0954O.n0(M0.h.c(0L, abstractC0954O.f9009k), 0.0f, null);
                } else {
                    int i2 = (int) 0;
                    long g4 = j0.c.g((abstractC0953N.c() - abstractC0954O.f9005d) - i2, i2);
                    AbstractC0953N.a(abstractC0953N, abstractC0954O);
                    abstractC0954O.n0(M0.h.c(g4, abstractC0954O.f9009k), 0.0f, null);
                }
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0953N.f((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0953N.f((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case AbstractC1024c.f9242c /* 9 */:
                AbstractC0953N.f((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            case 10:
                AbstractC0953N.d((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
            default:
                AbstractC0953N.d((AbstractC0953N) obj, this.f3752e, 0, 0);
                break;
        }
        return Unit.f7487a;
    }
}
