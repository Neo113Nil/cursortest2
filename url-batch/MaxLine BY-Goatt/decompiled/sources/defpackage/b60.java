package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b60 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public ty2 n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ lb2 q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b60(lb2 lb2Var, o30 o30Var, Function1 function1, int i) {
        super(2, o30Var);
        this.m = i;
        this.q = lb2Var;
        this.r = function1;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Function1 function1 = this.r;
        lb2 lb2Var = this.q;
        switch (i) {
            case 0:
                b60 b60Var = new b60(lb2Var, o30Var, function1, 0);
                b60Var.p = obj;
                return b60Var;
            default:
                b60 b60Var2 = new b60(lb2Var, o30Var, function1, 1);
                b60Var2.p = obj;
                return b60Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        uy2 uy2Var = (uy2) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((b60) create(uy2Var, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r13 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
    
        if (r13 == r0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
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
        ty2 ty2Var3;
        uy2 uy2Var4;
        ty2 ty2Var4;
        uy2 uy2Var5;
        uy2 uy2Var6;
        Object obj3;
        int i = this.m;
        lb2 lb2Var = this.q;
        Function1 function1 = this.r;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i2 = this.o;
                if (i2 == 0) {
                    ca2.b(obj);
                    uy2 uy2Var7 = (uy2) this.p;
                    ty2Var = ty2.n;
                    this.p = uy2Var7;
                    this.n = ty2Var;
                    this.o = 1;
                    Object d = uy2Var7.d(this);
                    if (d != b50Var) {
                        uy2Var = uy2Var7;
                        obj = d;
                    }
                    return b50Var;
                }
                if (i2 == 1) {
                    ty2Var = this.n;
                    uy2Var = (uy2) this.p;
                    ca2.b(obj);
                } else if (i2 == 2) {
                    ty2Var = this.n;
                    uy2Var3 = (uy2) this.p;
                    ca2.b(obj);
                    ty2Var2 = ty2Var;
                    uy2Var2 = uy2Var3;
                    a60 a60Var = new a60(null, function1, 0);
                    this.p = uy2Var2;
                    this.n = null;
                    this.o = 3;
                    obj = uy2Var2.a(ty2Var2, a60Var, this);
                    break;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                ca2.b(obj);
                                return obj;
                            }
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.p;
                        ca2.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            lb2Var.d().a();
                        }
                        return obj2;
                    }
                    uy2Var2 = (uy2) this.p;
                    ca2.b(obj);
                    this.p = obj;
                    this.o = 4;
                    Object d2 = uy2Var2.d(this);
                    if (d2 != b50Var) {
                        Object obj4 = obj;
                        obj = d2;
                        obj2 = obj4;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    }
                    return b50Var;
                }
                if (!((Boolean) obj).booleanValue()) {
                    z41 d3 = lb2Var.d();
                    this.p = uy2Var;
                    this.n = ty2Var;
                    this.o = 2;
                    if (d3.b(this) != b50Var) {
                        uy2Var3 = uy2Var;
                        ty2Var2 = ty2Var;
                        uy2Var2 = uy2Var3;
                        a60 a60Var2 = new a60(null, function1, 0);
                        this.p = uy2Var2;
                        this.n = null;
                        this.o = 3;
                        obj = uy2Var2.a(ty2Var2, a60Var2, this);
                    }
                    return b50Var;
                }
                ty2Var2 = ty2Var;
                uy2Var2 = uy2Var;
                a60 a60Var22 = new a60(null, function1, 0);
                this.p = uy2Var2;
                this.n = null;
                this.o = 3;
                obj = uy2Var2.a(ty2Var2, a60Var22, this);
            default:
                b50 b50Var2 = b50.m;
                int i3 = this.o;
                if (i3 == 0) {
                    ca2.b(obj);
                    uy2 uy2Var8 = (uy2) this.p;
                    ty2Var3 = ty2.n;
                    this.p = uy2Var8;
                    this.n = ty2Var3;
                    this.o = 1;
                    Object d4 = uy2Var8.d(this);
                    if (d4 != b50Var2) {
                        uy2Var4 = uy2Var8;
                        obj = d4;
                    }
                    return b50Var2;
                }
                if (i3 == 1) {
                    ty2Var3 = this.n;
                    uy2Var4 = (uy2) this.p;
                    ca2.b(obj);
                } else if (i3 == 2) {
                    ty2Var3 = this.n;
                    uy2Var6 = (uy2) this.p;
                    ca2.b(obj);
                    ty2Var4 = ty2Var3;
                    uy2Var5 = uy2Var6;
                    a60 a60Var3 = new a60(null, function1, 1);
                    this.p = uy2Var5;
                    this.n = null;
                    this.o = 3;
                    obj = uy2Var5.a(ty2Var4, a60Var3, this);
                    break;
                } else {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                ca2.b(obj);
                                return obj;
                            }
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = this.p;
                        ca2.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            lb2Var.d().a();
                        }
                        return obj3;
                    }
                    uy2Var5 = (uy2) this.p;
                    ca2.b(obj);
                    this.p = obj;
                    this.o = 4;
                    Object d5 = uy2Var5.d(this);
                    if (d5 != b50Var2) {
                        Object obj5 = obj;
                        obj = d5;
                        obj3 = obj5;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj3;
                    }
                    return b50Var2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    z41 d6 = lb2Var.d();
                    this.p = uy2Var4;
                    this.n = ty2Var3;
                    this.o = 2;
                    if (d6.b(this) != b50Var2) {
                        uy2Var6 = uy2Var4;
                        ty2Var4 = ty2Var3;
                        uy2Var5 = uy2Var6;
                        a60 a60Var32 = new a60(null, function1, 1);
                        this.p = uy2Var5;
                        this.n = null;
                        this.o = 3;
                        obj = uy2Var5.a(ty2Var4, a60Var32, this);
                    }
                    return b50Var2;
                }
                ty2Var4 = ty2Var3;
                uy2Var5 = uy2Var4;
                a60 a60Var322 = new a60(null, function1, 1);
                this.p = uy2Var5;
                this.n = null;
                this.o = 3;
                obj = uy2Var5.a(ty2Var4, a60Var322, this);
        }
    }
}
