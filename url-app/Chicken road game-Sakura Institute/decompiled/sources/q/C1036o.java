package q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0947H;

/* renamed from: q.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036o extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f9291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0944E f9292e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f9293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9294j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9295k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1038q f9296l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036o(AbstractC0954O abstractC0954O, InterfaceC0944E interfaceC0944E, InterfaceC0947H interfaceC0947H, int i2, int i4, C1038q c1038q) {
        super(1);
        this.f9291d = abstractC0954O;
        this.f9292e = interfaceC0944E;
        this.f9293i = interfaceC0947H;
        this.f9294j = i2;
        this.f9295k = i4;
        this.f9296l = c1038q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        M0.k layoutDirection = this.f9293i.getLayoutDirection();
        S.g gVar = this.f9296l.f9325a;
        AbstractC1035n.b((AbstractC0953N) obj, this.f9291d, this.f9292e, layoutDirection, this.f9294j, this.f9295k, gVar);
        return Unit.f7487a;
    }
}
