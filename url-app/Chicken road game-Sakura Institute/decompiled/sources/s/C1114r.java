package s;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: s.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114r extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9957d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9958e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9960j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9961k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9962l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114r(Object obj, int i2, w wVar, O.a aVar, int i4) {
        super(2);
        this.f9958e = obj;
        this.f9959i = i2;
        this.f9961k = wVar;
        this.f9962l = aVar;
        this.f9960j = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f9957d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f9960j | 1);
                Object obj3 = this.f9962l;
                m3.z.d((r.h) this.f9961k, this.f9958e, this.f9959i, obj3, (C0216p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f9960j | 1);
                O.a aVar = (O.a) this.f9962l;
                m3.s.b(this.f9958e, this.f9959i, (w) this.f9961k, aVar, (C0216p) obj, U4);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114r(r.h hVar, Object obj, int i2, Object obj2, int i4) {
        super(2);
        this.f9961k = hVar;
        this.f9958e = obj;
        this.f9959i = i2;
        this.f9962l = obj2;
        this.f9960j = i4;
    }
}
