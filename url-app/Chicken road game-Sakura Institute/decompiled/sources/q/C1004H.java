package q;

import i.C0673h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0954O;

/* renamed from: q.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004H extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1005I f9161e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1008L f9162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1004H(C1005I c1005i, C1008L c1008l, int i2) {
        super(1);
        this.f9160d = i2;
        this.f9161e = c1005i;
        this.f9162i = c1008l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i2;
        int i4;
        int i5;
        int i6;
        switch (this.f9160d) {
            case 0:
                AbstractC0954O abstractC0954O = (AbstractC0954O) obj;
                if (abstractC0954O != null) {
                    this.f9162i.getClass();
                    i2 = abstractC0954O.g0();
                    i4 = abstractC0954O.f0();
                } else {
                    i2 = 0;
                    i4 = 0;
                }
                C0673h c0673h = new C0673h(C0673h.a(i2, i4));
                C1005I c1005i = this.f9161e;
                c1005i.f9169g = c0673h;
                c1005i.f9166d = abstractC0954O;
                break;
            default:
                AbstractC0954O abstractC0954O2 = (AbstractC0954O) obj;
                if (abstractC0954O2 != null) {
                    this.f9162i.getClass();
                    i5 = abstractC0954O2.g0();
                    i6 = abstractC0954O2.f0();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                C0673h c0673h2 = new C0673h(C0673h.a(i5, i6));
                C1005I c1005i2 = this.f9161e;
                c1005i2.f9170h = c0673h2;
                c1005i2.f9168f = abstractC0954O2;
                break;
        }
        return Unit.f7487a;
    }
}
