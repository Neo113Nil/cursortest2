package t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.InterfaceC0835w;
import s2.EnumC0967a;
import u2.AbstractC1155g;
import u2.C1145C;
import u2.C1154f;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049b extends AbstractC1155g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9011i = AtomicIntegerFieldUpdater.newUpdater(C1049b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final s2.g f9012g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9013h;

    public /* synthetic */ C1049b(s2.g gVar, boolean z3) {
        this(gVar, z3, V1.j.f4558d, -3, EnumC0967a.f8359d);
    }

    @Override // u2.AbstractC1155g, t2.InterfaceC1053f
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        R1.y yVar = R1.y.f4171a;
        W1.a aVar = W1.a.f4608d;
        if (this.f9692e != -3) {
            Object d3 = super.d(interfaceC1054g, dVar);
            return d3 == aVar ? d3 : yVar;
        }
        boolean z3 = this.f9013h;
        if (z3 && f9011i.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object i3 = AbstractC1035F.i(interfaceC1054g, this.f9012g, z3, dVar);
        return i3 == aVar ? i3 : yVar;
    }

    @Override // u2.AbstractC1155g
    public final String e() {
        return "channel=" + this.f9012g;
    }

    @Override // u2.AbstractC1155g
    public final Object f(s2.t tVar, C1154f c1154f) {
        Object i3 = AbstractC1035F.i(new C1145C(tVar), this.f9012g, this.f9013h, c1154f);
        return i3 == W1.a.f4608d ? i3 : R1.y.f4171a;
    }

    @Override // u2.AbstractC1155g
    public final AbstractC1155g g(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return new C1049b(this.f9012g, this.f9013h, iVar, i3, enumC0967a);
    }

    @Override // u2.AbstractC1155g
    public final InterfaceC1053f h() {
        return new C1049b(this.f9012g, this.f9013h);
    }

    @Override // u2.AbstractC1155g
    public final s2.v i(InterfaceC0835w interfaceC0835w) {
        if (!this.f9013h || f9011i.getAndSet(this, 1) == 0) {
            return this.f9692e == -3 ? this.f9012g : super.i(interfaceC0835w);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public C1049b(s2.g gVar, boolean z3, V1.i iVar, int i3, EnumC0967a enumC0967a) {
        super(iVar, i3, enumC0967a);
        this.f9012g = gVar;
        this.f9013h = z3;
        this.consumed$volatile = 0;
    }
}
