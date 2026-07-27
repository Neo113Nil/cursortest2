package l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777c0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2.E f7693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7694e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0783i f7695i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0788n f7696j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f7697k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777c0(M2.E e4, float f4, InterfaceC0783i interfaceC0783i, C0788n c0788n, Function1 function1) {
        super(1);
        this.f7693d = e4;
        this.f7694e = f4;
        this.f7695i = interfaceC0783i;
        this.f7696j = c0788n;
        this.f7697k = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f7693d.f3580d;
        Intrinsics.c(obj2);
        AbstractC0779e.g((C0786l) obj2, longValue, this.f7694e, this.f7695i, this.f7696j, this.f7697k);
        return Unit.f7487a;
    }
}
