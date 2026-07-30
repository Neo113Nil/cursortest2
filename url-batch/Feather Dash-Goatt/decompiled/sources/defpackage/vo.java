package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vo extends sf1 implements Function1 {
    public Object i;
    public Serializable j;
    public Object k;
    public Object l;
    public Iterator m;
    public int n;
    public int o;
    public final /* synthetic */ mp p;
    public final /* synthetic */ o91 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(mp mpVar, o91 o91Var, dn dnVar) {
        super(1, dnVar);
        this.p = mpVar;
        this.q = o91Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new vo(this.p, this.q, (dn) obj).k(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        oo0 oo0Var;
        v11 v11Var;
        z11 z11Var;
        z11 z11Var2;
        oo0 oo0Var2;
        Iterator it;
        oo0 oo0Var3;
        v11 v11Var2;
        z11 z11Var3;
        uo uoVar;
        z11 z11Var4;
        v11 v11Var3;
        Integer a;
        Object obj2;
        int i;
        tn tnVar = tn.d;
        int i2 = this.o;
        o91 o91Var = this.q;
        mp mpVar = this.p;
        if (i2 == 0) {
            ca0.v(obj);
            oo0Var = new oo0();
            v11Var = new v11();
            z11Var = new z11();
            this.i = oo0Var;
            this.j = v11Var;
            this.k = z11Var;
            this.l = z11Var;
            this.o = 1;
            obj = mp.f(mpVar, true, this);
            if (obj != tnVar) {
                z11Var2 = z11Var;
            }
            return tnVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.n;
                    obj2 = this.i;
                    ca0.v(obj);
                    return new ko(i, ((Number) obj).intValue(), obj2);
                }
                oo0Var2 = (oo0) this.k;
                z11Var4 = (z11) this.j;
                v11Var3 = (v11) this.i;
                ca0.v(obj);
                try {
                    v11Var3.d = true;
                    oo0Var2.h(null);
                    Object obj3 = z11Var4.d;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    ua1 g = mpVar.g();
                    this.i = obj3;
                    this.j = null;
                    this.k = null;
                    this.n = hashCode;
                    this.o = 4;
                    a = g.a();
                    if (a != tnVar) {
                        obj = a;
                        obj2 = obj3;
                        i = hashCode;
                        return new ko(i, ((Number) obj).intValue(), obj2);
                    }
                    return tnVar;
                } catch (Throwable th) {
                    oo0Var2.h(null);
                    throw th;
                }
            }
            it = this.m;
            uoVar = (uo) this.l;
            z11Var3 = (z11) this.k;
            v11Var2 = (v11) this.j;
            oo0Var3 = (oo0) this.i;
            ca0.v(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.i = oo0Var3;
                this.j = v11Var2;
                this.k = z11Var3;
                this.l = uoVar;
                this.m = it;
                this.o = 2;
                if (function2.b(uoVar, this) == tnVar) {
                    break;
                }
            }
            z11Var2 = z11Var3;
            v11Var = v11Var2;
            oo0Var2 = oo0Var3;
            o91Var.g = null;
            this.i = v11Var;
            this.j = z11Var2;
            this.k = oo0Var2;
            this.l = null;
            this.m = null;
            this.o = 3;
            if (oo0Var2.e(this) != tnVar) {
                z11Var4 = z11Var2;
                v11Var3 = v11Var;
                v11Var3.d = true;
                oo0Var2.h(null);
                Object obj32 = z11Var4.d;
                if (obj32 == null) {
                }
                ua1 g2 = mpVar.g();
                this.i = obj32;
                this.j = null;
                this.k = null;
                this.n = hashCode;
                this.o = 4;
                a = g2.a();
                if (a != tnVar) {
                }
            }
            return tnVar;
        }
        z11Var = (z11) this.l;
        z11Var2 = (z11) this.k;
        v11Var = (v11) this.j;
        oo0Var = (oo0) this.i;
        ca0.v(obj);
        z11Var.d = ((ko) obj).b;
        uo uoVar2 = new uo(oo0Var, v11Var, z11Var2, mpVar);
        List list = (List) o91Var.g;
        if (list == null) {
            oo0Var2 = oo0Var;
            o91Var.g = null;
            this.i = v11Var;
            this.j = z11Var2;
            this.k = oo0Var2;
            this.l = null;
            this.m = null;
            this.o = 3;
            if (oo0Var2.e(this) != tnVar) {
            }
            return tnVar;
        }
        it = list.iterator();
        oo0Var3 = oo0Var;
        v11Var2 = v11Var;
        z11Var3 = z11Var2;
        uoVar = uoVar2;
        while (it.hasNext()) {
        }
        z11Var2 = z11Var3;
        v11Var = v11Var2;
        oo0Var2 = oo0Var3;
        o91Var.g = null;
        this.i = v11Var;
        this.j = z11Var2;
        this.k = oo0Var2;
        this.l = null;
        this.m = null;
        this.o = 3;
        if (oo0Var2.e(this) != tnVar) {
        }
        return tnVar;
    }
}
