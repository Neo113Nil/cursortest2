package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qn extends o81 implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Function2 B;
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ String n;
    public final /* synthetic */ ch2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ tt0 u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(mv2 mv2Var, String str, Function2 function2, ch2 ch2Var, Function2 function22, Function2 function23, Function2 function24, boolean z, boolean z2, b41 b41Var, yx1 yx1Var, du2 du2Var, Function2 function25, int i, int i2) {
        super(2);
        this.t = mv2Var;
        this.n = str;
        this.u = function2;
        this.o = ch2Var;
        this.v = function22;
        this.w = function23;
        this.x = function24;
        this.p = z;
        this.q = z2;
        this.y = b41Var;
        this.z = yx1Var;
        this.A = du2Var;
        this.B = function25;
        this.r = i;
        this.s = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        Object obj8 = this.v;
        tt0 tt0Var = this.u;
        Object obj9 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                my myVar = (my) this.B;
                int R = s03.R(1);
                String str = this.n;
                boolean z = this.p;
                boolean z2 = this.q;
                int i2 = this.r;
                int i3 = this.s;
                ch2 ch2Var = this.o;
                rn.a(str, (Function1) obj9, (vl1) obj8, z, (pw2) obj7, (g81) obj6, (f81) obj5, z2, i2, i3, ch2Var, (Function1) tt0Var, (bn1) obj4, (nn2) obj3, myVar, (a00) obj, R);
                break;
            default:
                ((Number) obj2).intValue();
                int R2 = s03.R(this.r | 1);
                int R3 = s03.R(this.s);
                String str2 = this.n;
                ch2 ch2Var2 = this.o;
                boolean z3 = this.p;
                boolean z4 = this.q;
                pu2.a((mv2) obj9, str2, (Function2) tt0Var, ch2Var2, (Function2) obj8, (Function2) obj7, (Function2) obj6, z3, z4, (b41) obj5, (yx1) obj4, (du2) obj3, this.B, (a00) obj, R2, R3);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(String str, Function1 function1, vl1 vl1Var, boolean z, pw2 pw2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, ch2 ch2Var, Function1 function12, bn1 bn1Var, nn2 nn2Var, my myVar, int i3) {
        super(2);
        this.n = str;
        this.t = function1;
        this.v = vl1Var;
        this.p = z;
        this.w = pw2Var;
        this.x = g81Var;
        this.y = f81Var;
        this.q = z2;
        this.r = i;
        this.s = i2;
        this.o = ch2Var;
        this.u = function12;
        this.z = bn1Var;
        this.A = nn2Var;
        this.B = myVar;
    }
}
