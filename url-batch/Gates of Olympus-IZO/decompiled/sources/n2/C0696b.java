package n2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k2.InterfaceC0550w;
import m2.EnumC0626a;
import o2.AbstractC0758g;
import o2.C0757f;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696b extends AbstractC0758g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6328i = AtomicIntegerFieldUpdater.newUpdater(C0696b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final m2.e f6329g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6330h;

    public /* synthetic */ C0696b(m2.e eVar, boolean z3) {
        this(eVar, z3, P1.j.f3073d, -3, EnumC0626a.f5929d);
    }

    @Override // o2.AbstractC0758g, n2.InterfaceC0700f
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        L1.z zVar = L1.z.f2729a;
        if (this.f6708e != -3) {
            Object collect = super.collect(interfaceC0701g, dVar);
            return collect == Q1.a.f3113d ? collect : zVar;
        }
        boolean z3 = this.f6330h;
        if (z3 && f6328i.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object h3 = AbstractC0682G.h(interfaceC0701g, this.f6329g, z3, dVar);
        return h3 == Q1.a.f3113d ? h3 : zVar;
    }

    @Override // o2.AbstractC0758g
    public final String d() {
        return "channel=" + this.f6329g;
    }

    @Override // o2.AbstractC0758g
    public final Object e(m2.r rVar, C0757f c0757f) {
        Object h3 = AbstractC0682G.h(new o2.w(rVar), this.f6329g, this.f6330h, c0757f);
        return h3 == Q1.a.f3113d ? h3 : L1.z.f2729a;
    }

    @Override // o2.AbstractC0758g
    public final AbstractC0758g f(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return new C0696b(this.f6329g, this.f6330h, iVar, i3, enumC0626a);
    }

    @Override // o2.AbstractC0758g
    public final InterfaceC0700f g() {
        return new C0696b(this.f6329g, this.f6330h);
    }

    @Override // o2.AbstractC0758g
    public final m2.s h(InterfaceC0550w interfaceC0550w) {
        if (!this.f6330h || f6328i.getAndSet(this, 1) == 0) {
            return this.f6708e == -3 ? this.f6329g : super.h(interfaceC0550w);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public C0696b(m2.e eVar, boolean z3, P1.i iVar, int i3, EnumC0626a enumC0626a) {
        super(iVar, i3, enumC0626a);
        this.f6329g = eVar;
        this.f6330h = z3;
        this.consumed$volatile = 0;
    }
}
