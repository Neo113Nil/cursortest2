package l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: l.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775b0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2.E f7684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7685e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0783i f7686i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0792s f7687j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0788n f7688k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f7689l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f7690m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0775b0(M2.E e4, Object obj, InterfaceC0783i interfaceC0783i, AbstractC0792s abstractC0792s, C0788n c0788n, float f4, Function1 function1) {
        super(1);
        this.f7684d = e4;
        this.f7685e = obj;
        this.f7686i = interfaceC0783i;
        this.f7687j = abstractC0792s;
        this.f7688k = c0788n;
        this.f7689l = f4;
        this.f7690m = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC0783i interfaceC0783i = this.f7686i;
        v0 d4 = interfaceC0783i.d();
        Object e4 = interfaceC0783i.e();
        A.I i2 = new A.I(this.f7688k, 1);
        C0786l c0786l = new C0786l(this.f7685e, d4, this.f7687j, longValue, e4, longValue, i2);
        AbstractC0779e.g(c0786l, longValue, this.f7689l, this.f7686i, this.f7688k, this.f7690m);
        this.f7684d.f3580d = c0786l;
        return Unit.f7487a;
    }
}
