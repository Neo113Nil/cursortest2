package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class id1 extends sf1 implements Function2 {
    public wq i;
    public vq j;
    public vq k;
    public Context l;
    public wc1 m;
    public String n;
    public String o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ ix s;
    public final /* synthetic */ ka t;
    public final /* synthetic */ rz u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id1(Context context, ix ixVar, ka kaVar, rz rzVar, dn dnVar) {
        super(2, dnVar);
        this.r = context;
        this.s = ixVar;
        this.t = kaVar;
        this.u = rzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return ((id1) h((dn) obj2, (sn) obj)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        id1 id1Var = new id1(this.r, this.s, this.t, this.u, dnVar);
        id1Var.q = obj;
        return id1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Type inference failed for: r2v14, types: [vq] */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        wq w;
        wq w2;
        vq vqVar;
        Context context;
        wc1 wc1Var;
        vq vqVar2;
        Object v;
        String str;
        Context context2;
        Object v2;
        String str2;
        wc1 wc1Var2;
        Object V;
        sn snVar = (sn) this.q;
        tn tnVar = tn.d;
        int i = this.p;
        int i2 = 1;
        dn dnVar = null;
        if (i == 0) {
            ca0.v(obj);
            ka kaVar = this.t;
            wq w3 = uq1.w(snVar, new gd1(kaVar, null, 1));
            w = uq1.w(snVar, new gd1(kaVar, null, 0));
            rz rzVar = this.u;
            wq w4 = uq1.w(snVar, new hd1(rzVar, dnVar, i2));
            w2 = uq1.w(snVar, new hd1(rzVar, dnVar, 0));
            this.q = null;
            this.i = w;
            this.j = w4;
            this.k = w2;
            Context context3 = this.r;
            this.l = context3;
            this.p = 1;
            obj = w3.D(this);
            if (obj != tnVar) {
                vqVar = w4;
                context = context3;
            }
        }
        if (i != 1) {
            if (i == 2) {
                wc1Var = this.m;
                context = this.l;
                vqVar2 = this.k;
                vqVar = this.j;
                ca0.v(obj);
                String str3 = (String) obj;
                this.q = null;
                this.i = null;
                this.j = null;
                this.k = vqVar2;
                this.l = context;
                this.m = wc1Var;
                this.n = str3;
                this.p = 3;
                v = vqVar.v(this);
                if (v != tnVar) {
                    Context context4 = context;
                    str = str3;
                    obj = v;
                    context2 = context4;
                    String str4 = (String) obj;
                    this.q = null;
                    this.i = null;
                    this.j = null;
                    this.k = null;
                    this.l = context2;
                    this.m = wc1Var;
                    this.n = str;
                    this.o = str4;
                    this.p = 4;
                    v2 = vqVar2.v(this);
                    if (v2 != tnVar) {
                    }
                }
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                    return obj;
                }
                str2 = this.o;
                str = this.n;
                wc1Var2 = this.m;
                context2 = this.l;
                ca0.v(obj);
                xc1 h = t80.h(context2, wc1Var2, str, str2, (String) obj);
                this.q = null;
                this.i = null;
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = 5;
                ix ixVar = this.s;
                ixVar.getClass();
                if (StringsKt.n("https://featherrdash.com/config.php")) {
                    nq nqVar = ls.a;
                    V = uq1.V(fq.g, new k8(ixVar, h, (dn) null), this);
                } else {
                    V = zc1.a;
                }
                return V != tnVar ? tnVar : V;
            }
            String str5 = this.n;
            wc1 wc1Var3 = this.m;
            context2 = this.l;
            vqVar2 = this.k;
            ca0.v(obj);
            str = str5;
            wc1Var = wc1Var3;
            String str42 = (String) obj;
            this.q = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = context2;
            this.m = wc1Var;
            this.n = str;
            this.o = str42;
            this.p = 4;
            v2 = vqVar2.v(this);
            if (v2 != tnVar) {
                wc1 wc1Var4 = wc1Var;
                str2 = str42;
                obj = v2;
                wc1Var2 = wc1Var4;
                xc1 h2 = t80.h(context2, wc1Var2, str, str2, (String) obj);
                this.q = null;
                this.i = null;
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = 5;
                ix ixVar2 = this.s;
                ixVar2.getClass();
                if (StringsKt.n("https://featherrdash.com/config.php")) {
                }
                if (V != tnVar) {
                }
            }
        }
        Context context5 = this.l;
        ?? r2 = this.k;
        vqVar = this.j;
        w = this.i;
        ca0.v(obj);
        context = context5;
        w2 = r2;
        wc1 wc1Var5 = (wc1) obj;
        this.q = null;
        this.i = null;
        this.j = vqVar;
        this.k = w2;
        this.l = context;
        this.m = wc1Var5;
        this.p = 2;
        Object v3 = w.v(this);
        if (v3 != tnVar) {
            wq wqVar = w2;
            wc1Var = wc1Var5;
            obj = v3;
            vqVar2 = wqVar;
            String str32 = (String) obj;
            this.q = null;
            this.i = null;
            this.j = null;
            this.k = vqVar2;
            this.l = context;
            this.m = wc1Var;
            this.n = str32;
            this.p = 3;
            v = vqVar.v(this);
            if (v != tnVar) {
            }
        }
    }
}
