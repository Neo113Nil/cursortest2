package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d70 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ boolean o;
    public final /* synthetic */ i70 p;
    public final /* synthetic */ int q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d70(i70 i70Var, int i, o30 o30Var, int i2) {
        super(2, o30Var);
        this.m = i2;
        this.p = i70Var;
        this.q = i;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        int i2 = this.q;
        i70 i70Var = this.p;
        switch (i) {
            case 0:
                d70 d70Var = new d70(i70Var, i2, o30Var, 0);
                d70Var.o = ((Boolean) obj).booleanValue();
                return d70Var;
            default:
                d70 d70Var2 = new d70(i70Var, i2, o30Var, 1);
                d70Var2.o = ((Boolean) obj).booleanValue();
                return d70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        o30 o30Var = (o30) obj2;
        switch (i) {
        }
        return ((d70) create(bool, o30Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        boolean z;
        qo2 qo2Var;
        boolean z2;
        Object obj2;
        int i = this.m;
        int i2 = this.q;
        boolean z3 = false;
        i70 i70Var = this.p;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i3 = this.n;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3) {
                        ll2 h = i70Var.h();
                        this.r = th;
                        this.o = z3;
                        this.n = 2;
                        Integer a = h.a();
                        if (a != b50Var) {
                            obj = a;
                            th = th;
                            z = z3;
                        }
                    }
                }
                if (i3 == 0) {
                    ca2.b(obj);
                    z3 = this.o;
                    this.o = z3;
                    this.n = 1;
                    obj = i70.g(i70Var, z3, this);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.o;
                        th = (Throwable) this.r;
                        ca2.b(obj);
                        i2 = ((Number) obj).intValue();
                        th = th;
                        z3 = z;
                        qo2Var = new g62(th, i2);
                        return new Pair(qo2Var, Boolean.valueOf(z3));
                    }
                    z3 = this.o;
                    ca2.b(obj);
                }
                qo2Var = (qo2) obj;
                return new Pair(qo2Var, Boolean.valueOf(z3));
            default:
                b50 b50Var2 = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    z2 = this.o;
                    this.o = z2;
                    this.n = 1;
                    obj = i70Var.j(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.r;
                        ca2.b(obj);
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                        return new h60(obj == null ? obj.hashCode() : 0, i2, obj);
                    }
                    z2 = this.o;
                    ca2.b(obj);
                }
                if (z2) {
                    ll2 h2 = i70Var.h();
                    this.r = obj;
                    this.n = 2;
                    Integer a2 = h2.a();
                    if (a2 != b50Var2) {
                        Object obj3 = obj;
                        obj = a2;
                        obj2 = obj3;
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return b50Var2;
                }
                return new h60(obj == null ? obj.hashCode() : 0, i2, obj);
        }
    }
}
