package q;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: q.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000D extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f9147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1027f f9148e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1029h f9149i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9150j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9151k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1009M f9152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.a f9153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9154n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000D(S.o oVar, InterfaceC1027f interfaceC1027f, InterfaceC1029h interfaceC1029h, int i2, int i4, C1009M c1009m, O.a aVar, int i5) {
        super(2);
        this.f9147d = oVar;
        this.f9148e = interfaceC1027f;
        this.f9149i = interfaceC1029h;
        this.f9150j = i2;
        this.f9151k = i4;
        this.f9152l = c1009m;
        this.f9153m = aVar;
        this.f9154n = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f9154n | 1);
        O.a aVar = this.f9153m;
        int i2 = this.f9150j;
        int i4 = this.f9151k;
        AbstractC1003G.a(this.f9147d, this.f9148e, this.f9149i, i2, i4, this.f9152l, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
