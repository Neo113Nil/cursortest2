package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pw extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Serializable r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pw(n12[] n12VarArr, qw qwVar, int i, qj1 qj1Var, int[] iArr) {
        super(1);
        this.m = 0;
        this.o = n12VarArr;
        this.p = qwVar;
        this.n = i;
        this.q = qj1Var;
        this.r = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Object obj2 = this.r;
        int i2 = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                m12 m12Var = (m12) obj;
                n12[] n12VarArr = (n12[]) obj5;
                qw qwVar = (qw) obj4;
                qj1 qj1Var = (qj1) obj3;
                int[] iArr = (int[]) obj2;
                int length = n12VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    n12 n12Var = n12VarArr[i3];
                    int i5 = i4 + 1;
                    n12Var.getClass();
                    Object i6 = n12Var.i();
                    dc2 dc2Var = i6 instanceof dc2 ? (dc2) i6 : null;
                    u81 layoutDirection = qj1Var.getLayoutDirection();
                    j50 j50Var = dc2Var != null ? dc2Var.c : null;
                    m12.g(m12Var, n12Var, j50Var != null ? j50Var.o(i2 - n12Var.m, layoutDirection) : qwVar.b.a(0, i2 - n12Var.m, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return Unit.a;
            case 1:
                vn vnVar = (vn) obj;
                yo0 yo0Var = (yo0) obj4;
                if (((yo0) obj5) != ((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).h) {
                    return Boolean.TRUE;
                }
                boolean J = yj1.J(yo0Var, (yo0) obj3, i2, (oc) obj2);
                Boolean valueOf = Boolean.valueOf(J);
                if (J || !vnVar.a()) {
                    return valueOf;
                }
                return null;
            default:
                vn vnVar2 = (vn) obj;
                yo0 yo0Var2 = (yo0) obj4;
                if (((yo0) obj5) != ((po0) ((t7) s03.K(yo0Var2)).getFocusOwner()).h) {
                    return Boolean.TRUE;
                }
                boolean o = mh2.o(i2, (oc) obj2, yo0Var2, (w72) obj3);
                Boolean valueOf2 = Boolean.valueOf(o);
                if (o || !vnVar2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(yo0 yo0Var, yo0 yo0Var2, Object obj, int i, oc ocVar, int i2) {
        super(1);
        this.m = i2;
        this.o = yo0Var;
        this.p = yo0Var2;
        this.q = obj;
        this.n = i;
        this.r = ocVar;
    }
}
