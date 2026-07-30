package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ur2 implements ca0, o30 {
    public final /* synthetic */ vr2 m;
    public final fs n;
    public fs o;
    public n22 p = n22.n;
    public final h q = h.m;
    public final /* synthetic */ vr2 r;

    public ur2(vr2 vr2Var, fs fsVar) {
        this.r = vr2Var;
        this.m = vr2Var;
        this.n = fsVar;
    }

    @Override // defpackage.ca0
    public final long A(float f) {
        return this.m.A(f);
    }

    @Override // defpackage.ca0
    public final long C(long j) {
        return this.m.C(j);
    }

    @Override // defpackage.ca0
    public final float D(float f) {
        return this.m.d() * f;
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        return this.m.K(j);
    }

    @Override // defpackage.ca0
    public final int R(float f) {
        return this.m.R(f);
    }

    public final Object a(n22 n22Var, hn hnVar) {
        fs fsVar = new fs(1, q41.b(hnVar));
        fsVar.u();
        this.p = n22Var;
        this.o = fsVar;
        Object s = fsVar.s();
        b50 b50Var = b50.m;
        return s;
    }

    public final long b() {
        vr2 vr2Var = this.r;
        long c0 = vr2Var.c0(s03.J(vr2Var).K.g());
        long j = vr2Var.K;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (c0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (c0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    @Override // defpackage.ca0
    public final long c0(long j) {
        return this.m.c0(j);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m.d();
    }

    @Override // defpackage.ca0
    public final float g0(long j) {
        return this.m.g0(j);
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.q;
    }

    public final g53 h() {
        return s03.J(this.r).K;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, Function2 function2, hn hnVar) {
        tr2 tr2Var;
        int i;
        Throwable th;
        jo2 jo2Var;
        fs fsVar;
        if (hnVar instanceof tr2) {
            tr2Var = (tr2) hnVar;
            int i2 = tr2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tr2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = tr2Var.n;
                Object obj2 = b50.m;
                i = tr2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    if (j <= 0 && (fsVar = this.o) != null) {
                        aa2.a aVar = aa2.m;
                        fsVar.resumeWith(new ba2(new o22(j)));
                    }
                    jo2 H = z71.H(this.r.u0(), null, new nh2(j, this, (o30) null), 3);
                    try {
                        tr2Var.m = H;
                        tr2Var.p = 1;
                        obj = function2.invoke(this, tr2Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                        jo2Var = H;
                    } catch (Throwable th2) {
                        th = th2;
                        jo2Var = H;
                        jo2Var.f(cs.n);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jo2Var = tr2Var.m;
                    try {
                        ca2.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        jo2Var.f(cs.n);
                        throw th;
                    }
                }
                jo2Var.f(cs.n);
                return obj;
            }
        }
        tr2Var = new tr2(this, hnVar);
        Object obj3 = tr2Var.n;
        Object obj22 = b50.m;
        i = tr2Var.p;
        if (i != 0) {
        }
        jo2Var.f(cs.n);
        return obj3;
    }

    @Override // defpackage.ca0
    public final long l0(float f) {
        return this.m.l0(f);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.m.p();
    }

    @Override // defpackage.ca0
    public final float p0(int i) {
        return this.m.p0(i);
    }

    @Override // defpackage.ca0
    public final float r0(float f) {
        return f / this.m.d();
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        vr2 vr2Var = this.r;
        synchronized (vr2Var.H) {
            vr2Var.G.k(this);
            Unit unit = Unit.a;
        }
        this.n.resumeWith(obj);
    }
}
