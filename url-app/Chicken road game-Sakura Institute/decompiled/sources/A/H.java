package A;

import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.C0790p;

/* loaded from: classes.dex */
public final class H extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final H f24e = new H(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final H f25i = new H(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final H f26j = new H(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i2, int i4) {
        super(i2);
        this.f27d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27d) {
            case 0:
                long j4 = ((Y.c) obj).f4372a;
                return AbstractC0345a.z(j4) ? new C0790p(Y.c.d(j4), Y.c.e(j4)) : O.f45a;
            case 1:
                C0790p c0790p = (C0790p) obj;
                return new Y.c(AbstractC0345a.c(c0790p.f7823a, c0790p.f7824b));
            default:
                return Unit.f7487a;
        }
    }
}
