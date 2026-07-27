package A;

import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import w.EnumC1256E;

/* renamed from: A.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010f extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0019o f132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f133e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f134i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010f(InterfaceC0019o interfaceC0019o, boolean z4, boolean z5) {
        super(1);
        this.f132d = interfaceC0019o;
        this.f133e = z4;
        this.f134i = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y0.i iVar = (y0.i) obj;
        long a4 = this.f132d.a();
        iVar.s(G.f23c, new F(this.f133e ? EnumC1256E.f11020e : EnumC1256E.f11021i, a4, this.f134i ? 1 : 3, AbstractC0345a.z(a4)));
        return Unit.f7487a;
    }
}
