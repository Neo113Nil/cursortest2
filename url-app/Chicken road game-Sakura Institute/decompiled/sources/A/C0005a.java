package A;

import G.C0192d;
import G.C0216p;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p0.AbstractC0960V;
import p0.C0963Y;
import s.C1092H;
import s0.AbstractC1144g0;
import s1.C1193i;

/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005a extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f80e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f82j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f83k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005a(O.a aVar, Object obj, Object obj2, int i2) {
        super(2);
        this.f79d = 1;
        this.f80e = aVar;
        this.f82j = obj;
        this.f83k = obj2;
        this.f81i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f79d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f81i | 1);
                S.c cVar = (S.c) this.f83k;
                O.a aVar = (O.a) this.f80e;
                M1.a.e((InterfaceC0019o) this.f82j, cVar, aVar, (C0216p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f81i) | 1;
                Object obj3 = this.f82j;
                Object obj4 = this.f83k;
                ((O.a) this.f80e).b(obj3, obj4, (C0216p) obj, U4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int U5 = C0192d.U(this.f81i | 1);
                O.a aVar2 = (O.a) this.f80e;
                ((P.i) this.f82j).d(this.f83k, aVar2, (C0216p) obj, U5);
                break;
            case 3:
                ((Number) obj2).intValue();
                int U6 = C0192d.U(this.f81i | 1);
                O.a aVar3 = (O.a) this.f80e;
                AbstractC0345a.a((Function0) this.f82j, (P0.w) this.f83k, aVar3, (C0216p) obj, U6);
                break;
            case 4:
                ((Number) obj2).intValue();
                int U7 = C0192d.U(this.f81i | 1);
                O.a aVar4 = (O.a) this.f80e;
                n.r.a((n.c) this.f82j, (S.o) this.f83k, aVar4, (C0216p) obj, U7);
                break;
            case 5:
                ((Number) obj2).intValue();
                int U8 = C0192d.U(this.f81i | 1);
                Function2 function2 = this.f80e;
                AbstractC0960V.c((C0963Y) this.f82j, (S.o) this.f83k, function2, (C0216p) obj, U8);
                break;
            case 6:
                ((Number) obj2).intValue();
                int U9 = C0192d.U(this.f81i | 1);
                O.a aVar5 = (O.a) this.f80e;
                ((C1092H) this.f82j).d(this.f83k, aVar5, (C0216p) obj, U9);
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                int U10 = C0192d.U(this.f81i | 1);
                AbstractC1144g0.a((r0.g0) this.f82j, (s0.X) this.f83k, (O.a) this.f80e, (C0216p) obj, U10);
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Number) obj2).intValue();
                int U11 = C0192d.U(this.f81i | 1);
                O.a aVar6 = (O.a) this.f80e;
                m3.o.b((C1193i) this.f82j, (P.i) this.f83k, aVar6, (C0216p) obj, U11);
                break;
            default:
                ((Number) obj2).intValue();
                int U12 = C0192d.U(this.f81i | 1);
                a0 a0Var = (a0) this.f83k;
                O.a aVar7 = (O.a) this.f80e;
                w.M.d((S.o) this.f82j, a0Var, aVar7, (C0216p) obj, U12);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0005a(Object obj, Object obj2, Function2 function2, int i2, int i4) {
        super(2);
        this.f79d = i4;
        this.f82j = obj;
        this.f83k = obj2;
        this.f80e = function2;
        this.f81i = i2;
    }
}
