package P0;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f3745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f3746e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f3747i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O.a f3748j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3749k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3750l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(E e4, Function0 function0, F f4, O.a aVar, int i2, int i4) {
        super(2);
        this.f3745d = e4;
        this.f3746e = function0;
        this.f3747i = f4;
        this.f3748j = aVar;
        this.f3749k = i2;
        this.f3750l = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f3749k | 1);
        O.a aVar = this.f3748j;
        Function0 function0 = this.f3746e;
        o.a(this.f3745d, function0, this.f3747i, aVar, (C0216p) obj, U3, this.f3750l);
        return Unit.f7487a;
    }
}
