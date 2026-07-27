package l0;

import W2.C0286h;
import W2.r0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C0914u0;
import r0.AbstractC1065f;
import s0.P0;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* renamed from: l0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800A implements M0.b, C2.a {

    /* renamed from: d, reason: collision with root package name */
    public final C0286h f7867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0802C f7868e;

    /* renamed from: i, reason: collision with root package name */
    public C0286h f7869i;

    /* renamed from: j, reason: collision with root package name */
    public EnumC0812j f7870j = EnumC0812j.f7911e;

    /* renamed from: k, reason: collision with root package name */
    public final kotlin.coroutines.i f7871k = kotlin.coroutines.i.f7498d;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f7872l;

    public C0800A(C0802C c0802c, C0286h c0286h) {
        this.f7872l = c0802c;
        this.f7867d = c0286h;
        this.f7868e = c0802c;
    }

    @Override // M0.b
    public final long E(long j4) {
        return this.f7868e.E(j4);
    }

    @Override // M0.b
    public final long I(float f4) {
        return this.f7868e.I(f4);
    }

    @Override // M0.b
    public final long J(long j4) {
        return this.f7868e.J(j4);
    }

    @Override // M0.b
    public final float L(float f4) {
        return this.f7868e.e() * f4;
    }

    @Override // M0.b
    public final float M(long j4) {
        return this.f7868e.M(j4);
    }

    public final Object a(EnumC0812j enumC0812j, E2.a frame) {
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        this.f7870j = enumC0812j;
        this.f7869i = c0286h;
        Object r2 = c0286h.r();
        if (r2 == D2.a.f2163d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2;
    }

    @Override // M0.b
    public final long a0(float f4) {
        return this.f7868e.a0(f4);
    }

    public final long b() {
        C0802C c0802c = this.f7872l;
        c0802c.getClass();
        long E3 = c0802c.E(AbstractC1065f.v(c0802c).f9612y.g());
        long j4 = c0802c.f7876C;
        return u3.l.N(Math.max(0.0f, Y.f.d(E3) - ((int) (j4 >> 32))) / 2.0f, Math.max(0.0f, Y.f.b(E3) - ((int) (j4 & 4294967295L))) / 2.0f);
    }

    public final P0 d() {
        C0802C c0802c = this.f7872l;
        c0802c.getClass();
        return AbstractC1065f.v(c0802c).f9612y;
    }

    @Override // M0.b
    public final float e() {
        return this.f7868e.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [W2.c0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [W2.c0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j4, Function2 function2, E2.a aVar) {
        x xVar;
        int i2;
        C0286h c0286h;
        try {
            if (aVar instanceof x) {
                xVar = (x) aVar;
                int i4 = xVar.f7955m;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    xVar.f7955m = i4 - Integer.MIN_VALUE;
                    Object obj = xVar.f7953k;
                    D2.a aVar2 = D2.a.f2163d;
                    i2 = xVar.f7955m;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        if (j4 <= 0 && (c0286h = this.f7869i) != null) {
                            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                            c0286h.u(AbstractC1343r.a(new C0813k(j4)));
                        }
                        r0 m4 = W2.B.m(this.f7872l.p0(), null, null, new y(j4, this, null), 3);
                        xVar.f7952j = m4;
                        xVar.f7955m = 1;
                        obj = function2.h(this, xVar);
                        j4 = m4;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r0 r0Var = xVar.f7952j;
                        AbstractC1343r.b(obj);
                        j4 = r0Var;
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            return obj;
        } finally {
            j4.a(C0804b.f7885d);
        }
        xVar = new x(this, aVar);
        Object obj2 = xVar.f7953k;
        D2.a aVar22 = D2.a.f2163d;
        i2 = xVar.f7955m;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j4, C0914u0 c0914u0, E2.a aVar) {
        z zVar;
        int i2;
        try {
            if (aVar instanceof z) {
                zVar = (z) aVar;
                int i4 = zVar.f7961l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    zVar.f7961l = i4 - Integer.MIN_VALUE;
                    Object obj = zVar.f7959j;
                    Object obj2 = D2.a.f2163d;
                    i2 = zVar.f7961l;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        zVar.f7961l = 1;
                        obj = f(j4, c0914u0, zVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1343r.b(obj);
                    }
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            return obj;
        } catch (C0813k unused) {
            return null;
        }
        zVar = new z(this, aVar);
        Object obj3 = zVar.f7959j;
        Object obj22 = D2.a.f2163d;
        i2 = zVar.f7961l;
    }

    @Override // M0.b
    public final int h0(long j4) {
        return this.f7868e.h0(j4);
    }

    @Override // M0.b
    public final float i0(int i2) {
        return this.f7868e.i0(i2);
    }

    @Override // M0.b
    public final float j0(long j4) {
        return this.f7868e.j0(j4);
    }

    @Override // M0.b
    public final float k0(float f4) {
        return f4 / this.f7868e.e();
    }

    @Override // M0.b
    public final int l(float f4) {
        return this.f7868e.l(f4);
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f7871k;
    }

    @Override // M0.b
    public final float q() {
        return this.f7868e.q();
    }

    @Override // C2.a
    public final void u(Object obj) {
        C0802C c0802c = this.f7872l;
        synchronized (c0802c.f7883z) {
            c0802c.f7883z.m(this);
            Unit unit = Unit.f7487a;
        }
        this.f7867d.u(obj);
    }
}
