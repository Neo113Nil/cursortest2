package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f60 extends pr2 implements Function2 {
    public ty2 m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ lb2 r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(o30 o30Var, lb2 lb2Var, Function1 function1, boolean z, boolean z2) {
        super(2, o30Var);
        this.p = z;
        this.q = z2;
        this.r = lb2Var;
        this.s = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        f60 f60Var = new f60(o30Var, this.r, this.s, this.p, this.q);
        f60Var.o = obj;
        return f60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f60) create((uy2) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r12 != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ty2 ty2Var;
        uy2 uy2Var;
        ty2 ty2Var2;
        uy2 uy2Var2;
        uy2 uy2Var3;
        Object obj2;
        b50 b50Var = b50.m;
        int i = this.n;
        Function1 function1 = this.s;
        lb2 lb2Var = this.r;
        boolean z = this.q;
        if (i == 0) {
            ca2.b(obj);
            uy2 uy2Var4 = (uy2) this.o;
            if (!this.p) {
                uy2Var4.getClass();
                return function1.invoke(((e62) uy2Var4).c());
            }
            ty2Var = z ? ty2.m : ty2.n;
            if (!z) {
                this.o = uy2Var4;
                this.m = ty2Var;
                this.n = 1;
                Object d = uy2Var4.d(this);
                if (d != b50Var) {
                    uy2Var2 = uy2Var4;
                    obj = d;
                }
                return b50Var;
            }
            ty2 ty2Var3 = ty2Var;
            uy2Var = uy2Var4;
            ty2Var2 = ty2Var3;
            p50 p50Var = new p50(function1, null);
            this.o = uy2Var;
            this.m = null;
            this.n = 3;
            obj = uy2Var.a(ty2Var2, p50Var, this);
        } else if (i == 1) {
            ty2Var = this.m;
            uy2Var2 = (uy2) this.o;
            ca2.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.o;
                    ca2.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        lb2Var.d().a();
                    }
                    return obj2;
                }
                uy2Var = (uy2) this.o;
                ca2.b(obj);
                if (z) {
                    return obj;
                }
                this.o = obj;
                this.n = 4;
                Object d2 = uy2Var.d(this);
                if (d2 != b50Var) {
                    Object obj3 = obj;
                    obj = d2;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return b50Var;
            }
            ty2Var = this.m;
            uy2Var3 = (uy2) this.o;
            ca2.b(obj);
            ty2Var2 = ty2Var;
            uy2Var = uy2Var3;
            p50 p50Var2 = new p50(function1, null);
            this.o = uy2Var;
            this.m = null;
            this.n = 3;
            obj = uy2Var.a(ty2Var2, p50Var2, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            z41 d3 = lb2Var.d();
            this.o = uy2Var2;
            this.m = ty2Var;
            this.n = 2;
            if (d3.b(this) != b50Var) {
                uy2Var3 = uy2Var2;
                ty2Var2 = ty2Var;
                uy2Var = uy2Var3;
                p50 p50Var22 = new p50(function1, null);
                this.o = uy2Var;
                this.m = null;
                this.n = 3;
                obj = uy2Var.a(ty2Var2, p50Var22, this);
            }
            return b50Var;
        }
        ty2Var2 = ty2Var;
        uy2Var = uy2Var2;
        p50 p50Var222 = new p50(function1, null);
        this.o = uy2Var;
        this.m = null;
        this.n = 3;
        obj = uy2Var.a(ty2Var2, p50Var222, this);
    }
}
