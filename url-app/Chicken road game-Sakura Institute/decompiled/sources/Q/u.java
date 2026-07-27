package Q;

import B1.C0097d;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import r.C1057a;
import s.AbstractC1085A;
import s.C1094J;

/* loaded from: classes.dex */
public final class u extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3894e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3895i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i2, int i4, Object obj) {
        super(1);
        this.f3893d = i4;
        this.f3895i = obj;
        this.f3894e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3893d) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(this.f3894e, (Collection) this.f3895i));
            case 1:
                Boolean C3 = X.d.C((X.t) obj, this.f3894e);
                ((M2.E) this.f3895i).f3580d = C3;
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : false);
            default:
                s.x xVar = (s.x) obj;
                C1057a c1057a = ((r.v) this.f3895i).f9551a;
                AbstractC0274j c4 = w.c();
                w.f(c4, w.d(c4), c4 != null ? c4.f() : null);
                for (int i2 = 0; i2 < c1057a.f9433a; i2++) {
                    int i4 = this.f3894e + i2;
                    xVar.getClass();
                    long j4 = AbstractC1085A.f9874a;
                    s.z zVar = xVar.f9977b;
                    C0097d c0097d = zVar.f9980c;
                    if (c0097d != null) {
                        xVar.f9976a.add(new C1094J(c0097d, i4, j4, zVar.f9979b));
                    }
                }
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i2, Collection collection) {
        super(1);
        this.f3893d = 0;
        this.f3894e = i2;
        this.f3895i = collection;
    }
}
