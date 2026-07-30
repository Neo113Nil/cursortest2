package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vq extends pr2 implements Function2 {
    public int m;
    public final /* synthetic */ jc n;
    public final /* synthetic */ float o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ a41 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(jc jcVar, float f, boolean z, s03 s03Var, a41 a41Var, o30 o30Var) {
        super(2, o30Var);
        this.n = jcVar;
        this.o = f;
        this.p = z;
        this.q = a41Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new vq(this.n, this.o, this.p, null, this.q, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vq) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r13.e(r12, r1) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r12 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        if ((r13 instanceof defpackage.jo0) != false) goto L45;
     */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        b50 b50Var = b50.m;
        int i = this.m;
        h03 h03Var = null;
        if (i == 0) {
            ca2.b(obj);
            jc jcVar = this.n;
            float f = ((pc0) jcVar.e.getValue()).m;
            float f2 = this.o;
            if (!pc0.a(f, f2)) {
                if (this.p) {
                    float f3 = ((pc0) jcVar.e.getValue()).m;
                    Object u42Var = pc0.a(f3, 0.0f) ? new u42(0L) : pc0.a(f3, 1.0f) ? new cy0() : pc0.a(f3, 0.0f) ? new jo0() : null;
                    this.m = 2;
                    h03 h03Var2 = uf0.b;
                    h03 h03Var3 = uf0.a;
                    a41 a41Var = this.q;
                    if (a41Var != null) {
                        if ((a41Var instanceof u42) || (a41Var instanceof od0) || (a41Var instanceof cy0) || (a41Var instanceof jo0)) {
                            h03Var = h03Var3;
                        }
                    } else if (u42Var != null) {
                        if (!(u42Var instanceof u42) && !(u42Var instanceof od0)) {
                            if (u42Var instanceof cy0) {
                                h03Var = uf0.c;
                            }
                        }
                        h03Var = h03Var2;
                    }
                    h03 h03Var4 = h03Var;
                    jc jcVar2 = this.n;
                    if (h03Var4 != null) {
                        e = jc.c(jcVar2, new pc0(f2), h03Var4, null, this, 12);
                        if (e != b50Var) {
                            e = Unit.a;
                        }
                    } else {
                        e = jcVar2.e(this, new pc0(f2));
                        if (e != b50Var) {
                            e = Unit.a;
                        }
                    }
                } else {
                    pc0 pc0Var = new pc0(f2);
                    this.m = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ca2.b(obj);
        }
        return Unit.a;
    }
}
