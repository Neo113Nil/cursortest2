package t1;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s1.C1183B;

/* loaded from: classes.dex */
public final class z extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1183B f10727e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.y f10728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S.o f10729j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S.c f10730k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f10731l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f10732m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f10733n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f10734o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function1 f10735p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10736q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(C1183B c1183b, s1.y yVar, S.o oVar, S.c cVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i2, int i4) {
        super(2);
        this.f10726d = i4;
        this.f10727e = c1183b;
        this.f10728i = yVar;
        this.f10729j = oVar;
        this.f10730k = cVar;
        this.f10731l = function1;
        this.f10732m = function12;
        this.f10733n = function13;
        this.f10734o = function14;
        this.f10735p = function15;
        this.f10736q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f10726d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f10736q | 1);
                Function1 function1 = this.f10732m;
                Function1 function12 = this.f10733n;
                m3.z.b(this.f10727e, this.f10728i, this.f10729j, this.f10730k, this.f10731l, function1, function12, this.f10734o, this.f10735p, (C0216p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f10736q | 1);
                Function1 function13 = this.f10732m;
                Function1 function14 = this.f10733n;
                m3.z.b(this.f10727e, this.f10728i, this.f10729j, this.f10730k, this.f10731l, function13, function14, this.f10734o, this.f10735p, (C0216p) obj, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0192d.U(this.f10736q | 1);
                Function1 function15 = this.f10732m;
                Function1 function16 = this.f10733n;
                m3.z.b(this.f10727e, this.f10728i, this.f10729j, this.f10730k, this.f10731l, function15, function16, this.f10734o, this.f10735p, (C0216p) obj, U5);
                break;
        }
        return Unit.f7487a;
    }
}
