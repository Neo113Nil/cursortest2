package w1;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k0 implements r2.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f7702d;

    /* renamed from: e, reason: collision with root package name */
    public long f7703e = 9223372034707292159L;

    /* renamed from: f, reason: collision with root package name */
    public long f7704f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f7705g;

    public k0(n0 n0Var) {
        this.f7705g = n0Var;
    }

    public final u1.p a() {
        this.f7702d = true;
        n0 n0Var = this.f7705g;
        u1.p j02 = n0Var.j0();
        if (r2.i.a(this.f7703e, 9223372034707292159L)) {
            this.f7703e = m.a.K(j02.d(0L));
            this.f7704f = j02.G();
        }
        n0Var.l0().G.b();
        return j02;
    }

    @Override // r2.c
    public final float b() {
        return this.f7705g.b();
    }

    public final void d(u1.m mVar, float f6) {
        n0 n0Var = this.f7705g;
        l.n nVar = n0Var.f7732p;
        if (nVar == null) {
            nVar = new l.n();
            n0Var.f7732p = nVar;
        }
        int P = d6.l.P((u1.m[]) nVar.f4349b, mVar);
        if (P >= 0) {
            float[] fArr = (float[]) nVar.f4350c;
            if (fArr[P] != f6) {
                fArr[P] = f6;
                ((byte[]) nVar.f4351d)[P] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) nVar.f4351d;
                if (bArr[P] == 2) {
                    bArr[P] = 0;
                    return;
                }
                return;
            }
        }
        int i = nVar.f4348a;
        u1.m[] mVarArr = (u1.m[]) nVar.f4349b;
        if (i == mVarArr.length) {
            int i8 = i * 2;
            Object[] copyOf = Arrays.copyOf(mVarArr, i8);
            q6.i.d(copyOf, "copyOf(...)");
            nVar.f4349b = (u1.m[]) copyOf;
            float[] copyOf2 = Arrays.copyOf((float[]) nVar.f4350c, i8);
            q6.i.d(copyOf2, "copyOf(...)");
            nVar.f4350c = copyOf2;
            byte[] copyOf3 = Arrays.copyOf((byte[]) nVar.f4351d, i8);
            q6.i.d(copyOf3, "copyOf(...)");
            nVar.f4351d = copyOf3;
        }
        ((u1.m[]) nVar.f4349b)[i] = mVar;
        ((byte[]) nVar.f4351d)[i] = 3;
        ((float[]) nVar.f4350c)[i] = f6;
        nVar.f4348a++;
    }

    @Override // r2.c
    public final float i() {
        return this.f7705g.i();
    }
}
