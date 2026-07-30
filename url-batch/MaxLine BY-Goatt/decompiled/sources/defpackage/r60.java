package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r60 extends pr2 implements Function1 {
    public Object m;
    public Serializable n;
    public Object o;
    public Object p;
    public Iterator q;
    public int r;
    public int s;
    public final /* synthetic */ i70 t;
    public final /* synthetic */ js0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(i70 i70Var, js0 js0Var, o30 o30Var) {
        super(1, o30Var);
        this.t = i70Var;
        this.u = js0Var;
    }

    @Override // defpackage.hn
    public final o30 create(o30 o30Var) {
        return new r60(this.t, this.u, o30Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r60) create((o30) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oo1 qo1Var;
        y72 y72Var;
        c82 c82Var;
        c82 c82Var2;
        oo1 oo1Var;
        Iterator it;
        oo1 oo1Var2;
        y72 y72Var2;
        c82 c82Var3;
        q60 q60Var;
        c82 c82Var4;
        y72 y72Var3;
        Integer a;
        Object obj2;
        int i;
        b50 b50Var = b50.m;
        int i2 = this.s;
        js0 js0Var = this.u;
        i70 i70Var = this.t;
        if (i2 == 0) {
            ca2.b(obj);
            qo1Var = new qo1();
            y72Var = new y72();
            c82Var = new c82();
            this.m = qo1Var;
            this.n = y72Var;
            this.o = c82Var;
            this.p = c82Var;
            this.s = 1;
            obj = i70.g(i70Var, true, this);
            if (obj != b50Var) {
                c82Var2 = c82Var;
            }
            return b50Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.r;
                    obj2 = this.m;
                    ca2.b(obj);
                    return new h60(i, ((Number) obj).intValue(), obj2);
                }
                oo1Var = (oo1) this.o;
                c82Var4 = (c82) this.n;
                y72Var3 = (y72) this.m;
                ca2.b(obj);
                try {
                    y72Var3.m = true;
                    Unit unit = Unit.a;
                    oo1Var.b(null);
                    Object obj3 = c82Var4.m;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    ll2 h = i70Var.h();
                    this.m = obj3;
                    this.n = null;
                    this.o = null;
                    this.r = hashCode;
                    this.s = 4;
                    a = h.a();
                    if (a != b50Var) {
                        obj = a;
                        obj2 = obj3;
                        i = hashCode;
                        return new h60(i, ((Number) obj).intValue(), obj2);
                    }
                    return b50Var;
                } catch (Throwable th) {
                    oo1Var.b(null);
                    throw th;
                }
            }
            it = this.q;
            q60Var = (q60) this.p;
            c82Var3 = (c82) this.o;
            y72Var2 = (y72) this.n;
            oo1Var2 = (oo1) this.m;
            ca2.b(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.m = oo1Var2;
                this.n = y72Var2;
                this.o = c82Var3;
                this.p = q60Var;
                this.q = it;
                this.s = 2;
                if (function2.invoke(q60Var, this) == b50Var) {
                    break;
                }
            }
            c82Var2 = c82Var3;
            y72Var = y72Var2;
            oo1Var = oo1Var2;
            js0Var.o = null;
            this.m = y72Var;
            this.n = c82Var2;
            this.o = oo1Var;
            this.p = null;
            this.q = null;
            this.s = 3;
            if (oo1Var.f(this) != b50Var) {
                c82Var4 = c82Var2;
                y72Var3 = y72Var;
                y72Var3.m = true;
                Unit unit2 = Unit.a;
                oo1Var.b(null);
                Object obj32 = c82Var4.m;
                if (obj32 == null) {
                }
                ll2 h2 = i70Var.h();
                this.m = obj32;
                this.n = null;
                this.o = null;
                this.r = hashCode;
                this.s = 4;
                a = h2.a();
                if (a != b50Var) {
                }
            }
            return b50Var;
        }
        c82Var = (c82) this.p;
        c82Var2 = (c82) this.o;
        y72Var = (y72) this.n;
        qo1Var = (oo1) this.m;
        ca2.b(obj);
        c82Var.m = ((h60) obj).b;
        q60 q60Var2 = new q60(qo1Var, y72Var, c82Var2, i70Var);
        List list = (List) js0Var.o;
        if (list == null) {
            oo1Var = qo1Var;
            js0Var.o = null;
            this.m = y72Var;
            this.n = c82Var2;
            this.o = oo1Var;
            this.p = null;
            this.q = null;
            this.s = 3;
            if (oo1Var.f(this) != b50Var) {
            }
            return b50Var;
        }
        it = list.iterator();
        oo1Var2 = qo1Var;
        y72Var2 = y72Var;
        c82Var3 = c82Var2;
        q60Var = q60Var2;
        while (it.hasNext()) {
        }
        c82Var2 = c82Var3;
        y72Var = y72Var2;
        oo1Var = oo1Var2;
        js0Var.o = null;
        this.m = y72Var;
        this.n = c82Var2;
        this.o = oo1Var;
        this.p = null;
        this.q = null;
        this.s = 3;
        if (oo1Var.f(this) != b50Var) {
        }
        return b50Var;
    }
}
