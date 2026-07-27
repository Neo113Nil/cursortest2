package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p.C0935k;

/* renamed from: D.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166r1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1994d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f1995e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1996i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1997j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0164q1 f1998k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f1999l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0935k f2000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2001n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2002o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166r1(S.o oVar, boolean z4, boolean z5, C0164q1 c0164q1, Function2 function2, C0935k c0935k, Z.P p4, int i2) {
        super(2);
        this.f1995e = oVar;
        this.f1996i = z4;
        this.f1997j = z5;
        this.f1998k = c0164q1;
        this.f1999l = function2;
        this.f2000m = c0935k;
        this.f2002o = p4;
        this.f2001n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1994d) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0192d.U(this.f2001n | 1);
                Function2 function2 = this.f1999l;
                boolean z4 = this.f1997j;
                androidx.compose.material3.a.a(this.f1996i, (Function1) this.f2002o, this.f1995e, function2, z4, this.f1998k, this.f2000m, (C0216p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0192d.U(this.f2001n | 1);
                C0164q1 c0164q1 = this.f1998k;
                Function2 function22 = this.f1999l;
                androidx.compose.material3.a.b(this.f1995e, this.f1996i, this.f1997j, c0164q1, function22, this.f2000m, (Z.P) this.f2002o, (C0216p) obj, U4);
                break;
        }
        return Unit.f7487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166r1(boolean z4, Function1 function1, S.o oVar, Function2 function2, boolean z5, C0164q1 c0164q1, C0935k c0935k, int i2) {
        super(2);
        this.f1996i = z4;
        this.f2002o = function1;
        this.f1995e = oVar;
        this.f1999l = function2;
        this.f1997j = z5;
        this.f1998k = c0164q1;
        this.f2000m = c0935k;
        this.f2001n = i2;
    }
}
