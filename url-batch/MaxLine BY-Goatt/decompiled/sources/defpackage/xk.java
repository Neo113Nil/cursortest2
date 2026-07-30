package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xk extends pr2 implements xt0 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ ym0 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk(int i, o30 o30Var, Object obj) {
        super(3, o30Var);
        this.m = i;
        this.q = obj;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        Object obj4 = this.q;
        ym0 ym0Var = (ym0) obj;
        switch (i) {
            case 0:
                xk xkVar = new xk(0, (o30) obj3, (zk) obj4);
                xkVar.o = ym0Var;
                xkVar.p = obj2;
                return xkVar.invokeSuspend(Unit.a);
            case 1:
                xk xkVar2 = new xk((Function2) obj4, (o30) obj3, 1);
                xkVar2.o = ym0Var;
                xkVar2.p = obj2;
                return xkVar2.invokeSuspend(Unit.a);
            case 2:
                xk xkVar3 = new xk(2, (o30) obj3, (hg2) obj4);
                xkVar3.o = ym0Var;
                xkVar3.p = (Object[]) obj2;
                return xkVar3.invokeSuspend(Unit.a);
            case 3:
                xk xkVar4 = new xk(3, (o30) obj3, (e61) obj4);
                xkVar4.o = ym0Var;
                xkVar4.p = (Object[]) obj2;
                return xkVar4.invokeSuspend(Unit.a);
            case 4:
                xk xkVar5 = new xk(4, (o30) obj3, (yk) obj4);
                xkVar5.o = ym0Var;
                xkVar5.p = (Object[]) obj2;
                return xkVar5.invokeSuspend(Unit.a);
            case 5:
                xk xkVar6 = new xk((wk) obj4, (o30) obj3, 5);
                xkVar6.o = ym0Var;
                xkVar6.p = (Object[]) obj2;
                return xkVar6.invokeSuspend(Unit.a);
            default:
                xk xkVar7 = new xk(6, (o30) obj3, (f61) obj4);
                xkVar7.o = ym0Var;
                xkVar7.p = obj2;
                return xkVar7.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dd, code lost:
    
        if (r13 == r0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r1.d(r13, r12) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r13 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0109, code lost:
    
        if (r1.d(r13, r12) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016a, code lost:
    
        if (r1.d(r13, r12) == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ad, code lost:
    
        if (r1.d(r13, r12) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a2, code lost:
    
        if (r13 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e8, code lost:
    
        if (r1.d(r13, r12) == r0) goto L92;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ym0 ym0Var;
        ym0 ym0Var2;
        ym0 ym0Var3;
        ym0 ym0Var4;
        ym0 ym0Var5;
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.n;
                if (i2 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var6 = this.o;
                    Pair pair = (Pair) this.p;
                    jk jkVar = (jk) pair.m;
                    String str = (String) pair.n;
                    boolean y = up2.y(str);
                    ij1 ij1Var = ((zk) obj2).b;
                    qn0 c = y ? ij1Var.c(jkVar) : ij1Var.f(str);
                    this.o = null;
                    this.p = null;
                    this.n = 1;
                    if (iv1.v(ym0Var6, c, this) == b50Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            case 1:
                b50 b50Var2 = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    ym0Var = this.o;
                    Object obj3 = this.p;
                    this.o = ym0Var;
                    this.n = 1;
                    obj = ((Function2) obj2).invoke(obj3, this);
                    break;
                } else if (i3 == 1) {
                    ym0Var = this.o;
                    ca2.b(obj);
                } else if (i3 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    break;
                }
                this.o = null;
                this.n = 2;
                break;
            case 2:
                b50 b50Var3 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    ym0Var2 = this.o;
                    Object[] objArr = (Object[]) this.p;
                    Object obj4 = objArr[0];
                    Object obj5 = objArr[1];
                    Object obj6 = objArr[2];
                    this.o = ym0Var2;
                    this.n = 1;
                    obj = ((hg2) obj2).b(obj4, obj5, obj6, this);
                    break;
                } else if (i4 == 1) {
                    ym0Var2 = this.o;
                    ca2.b(obj);
                } else if (i4 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    break;
                }
                this.o = null;
                this.n = 2;
                break;
            case 3:
                b50 b50Var4 = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var7 = this.o;
                    Object[] objArr2 = (Object[]) this.p;
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    Object obj9 = objArr2[2];
                    Object obj10 = objArr2[3];
                    this.o = ym0Var7;
                    this.n = 1;
                    e61 e61Var = new e61(5, this);
                    e61Var.m = (List) obj7;
                    e61Var.n = (String) obj8;
                    e61Var.o = (String) obj9;
                    e61Var.p = (String) obj10;
                    Object invokeSuspend = e61Var.invokeSuspend(Unit.a);
                    if (invokeSuspend != b50Var4) {
                        ym0Var3 = ym0Var7;
                        obj = invokeSuspend;
                    }
                    break;
                } else if (i5 == 1) {
                    ym0Var3 = this.o;
                    ca2.b(obj);
                } else if (i5 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    break;
                }
                this.o = null;
                this.n = 2;
                break;
            case 4:
                b50 b50Var5 = b50.m;
                int i6 = this.n;
                if (i6 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var8 = this.o;
                    Object[] objArr3 = (Object[]) this.p;
                    Object obj11 = objArr3[0];
                    Object obj12 = objArr3[1];
                    Object obj13 = objArr3[2];
                    Object obj14 = objArr3[3];
                    Object obj15 = objArr3[4];
                    this.o = ym0Var8;
                    this.n = 1;
                    int intValue = ((Number) obj13).intValue();
                    int intValue2 = ((Number) obj14).intValue();
                    yk ykVar = new yk(((yk) obj2).r, this);
                    ykVar.m = (List) obj11;
                    ykVar.n = (Map) obj12;
                    ykVar.o = intValue;
                    ykVar.p = intValue2;
                    ykVar.q = (jk) obj15;
                    Object invokeSuspend2 = ykVar.invokeSuspend(Unit.a);
                    if (invokeSuspend2 != b50Var5) {
                        ym0Var4 = ym0Var8;
                        obj = invokeSuspend2;
                    }
                    break;
                } else if (i6 == 1) {
                    ym0Var4 = this.o;
                    ca2.b(obj);
                } else if (i6 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    break;
                }
                this.o = null;
                this.n = 2;
                break;
            case 5:
                b50 b50Var6 = b50.m;
                int i7 = this.n;
                if (i7 == 0) {
                    ca2.b(obj);
                    ym0Var5 = this.o;
                    Object[] objArr4 = (Object[]) this.p;
                    Object obj16 = objArr4[0];
                    Object obj17 = objArr4[1];
                    this.o = ym0Var5;
                    this.n = 1;
                    obj = ((wk) obj2).a(obj16, obj17, this);
                    break;
                } else if (i7 == 1) {
                    ym0Var5 = this.o;
                    ca2.b(obj);
                } else if (i7 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                    break;
                }
                this.o = null;
                this.n = 2;
                break;
            default:
                b50 b50Var7 = b50.m;
                int i8 = this.n;
                if (i8 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var9 = this.o;
                    String str2 = (String) this.p;
                    boolean y2 = up2.y(str2);
                    ij1 ij1Var2 = ((f61) obj2).b;
                    qn0 p = y2 ? bd3.p(ij1Var2.c.a, new String[]{"jewelry_item"}, new zd(14)) : ij1Var2.g(str2);
                    this.o = null;
                    this.p = null;
                    this.n = 1;
                    if (iv1.v(ym0Var9, p, this) == b50Var7) {
                        break;
                    }
                } else if (i8 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk(tt0 tt0Var, o30 o30Var, int i) {
        super(3, o30Var);
        this.m = i;
        this.q = tt0Var;
    }
}
