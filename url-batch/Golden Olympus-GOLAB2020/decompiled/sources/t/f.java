package t;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import s.AbstractC3405e;
import s.C3404d;
import t.C3423e;
import u.C3447b;
import u.C3450e;

/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: C0, reason: collision with root package name */
    int f46166C0;

    /* renamed from: D0, reason: collision with root package name */
    int f46167D0;

    /* renamed from: E0, reason: collision with root package name */
    int f46168E0;

    /* renamed from: F0, reason: collision with root package name */
    int f46169F0;

    /* renamed from: x0, reason: collision with root package name */
    C3447b f46184x0 = new C3447b(this);

    /* renamed from: y0, reason: collision with root package name */
    public C3450e f46185y0 = new C3450e(this);

    /* renamed from: z0, reason: collision with root package name */
    protected C3447b.InterfaceC0282b f46186z0 = null;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f46164A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    protected C3404d f46165B0 = new C3404d();

    /* renamed from: G0, reason: collision with root package name */
    int f46170G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    int f46171H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    C3421c[] f46172I0 = new C3421c[4];

    /* renamed from: J0, reason: collision with root package name */
    C3421c[] f46173J0 = new C3421c[4];

    /* renamed from: K0, reason: collision with root package name */
    public boolean f46174K0 = false;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f46175L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f46176M0 = false;

    /* renamed from: N0, reason: collision with root package name */
    public int f46177N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    public int f46178O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    private int f46179P0 = 263;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f46180Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f46181R0 = false;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f46182S0 = false;

    /* renamed from: T0, reason: collision with root package name */
    int f46183T0 = 0;

    private void L0(C3423e c3423e) {
        int i4 = this.f46170G0 + 1;
        C3421c[] c3421cArr = this.f46173J0;
        if (i4 >= c3421cArr.length) {
            this.f46173J0 = (C3421c[]) Arrays.copyOf(c3421cArr, c3421cArr.length * 2);
        }
        this.f46173J0[this.f46170G0] = new C3421c(c3423e, 0, W0());
        this.f46170G0++;
    }

    private void M0(C3423e c3423e) {
        int i4 = this.f46171H0 + 1;
        C3421c[] c3421cArr = this.f46172I0;
        if (i4 >= c3421cArr.length) {
            this.f46172I0 = (C3421c[]) Arrays.copyOf(c3421cArr, c3421cArr.length * 2);
        }
        this.f46172I0[this.f46171H0] = new C3421c(c3423e, 1, W0());
        this.f46171H0++;
    }

    private void a1() {
        this.f46170G0 = 0;
        this.f46171H0 = 0;
    }

    @Override // t.C3423e
    public void E0(boolean z4, boolean z5) {
        super.E0(z4, z5);
        int size = this.f46197w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C3423e) this.f46197w0.get(i4)).E0(z4, z5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // t.k
    public void G0() {
        ?? r16;
        boolean z4;
        int i4 = 0;
        this.f46102S = 0;
        this.f46103T = 0;
        int max = Math.max(0, N());
        int max2 = Math.max(0, t());
        this.f46181R0 = false;
        this.f46182S0 = false;
        boolean z5 = Z0(64) || Z0(UserVerificationMethods.USER_VERIFY_PATTERN);
        C3404d c3404d = this.f46165B0;
        c3404d.f45895g = false;
        c3404d.f45896h = false;
        if (this.f46179P0 != 0 && z5) {
            c3404d.f45896h = true;
        }
        C3423e.b[] bVarArr = this.f46096M;
        C3423e.b bVar = bVarArr[1];
        C3423e.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.f46197w0;
        C3423e.b w4 = w();
        C3423e.b bVar3 = C3423e.b.WRAP_CONTENT;
        boolean z6 = w4 == bVar3 || K() == bVar3;
        a1();
        int size = this.f46197w0.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3423e c3423e = (C3423e) this.f46197w0.get(i5);
            if (c3423e instanceof k) {
                ((k) c3423e).G0();
            }
        }
        int i6 = 0;
        boolean z7 = false;
        boolean z8 = true;
        while (z8) {
            int i7 = i6 + 1;
            try {
                this.f46165B0.E();
                a1();
                j(this.f46165B0);
                for (int i8 = i4; i8 < size; i8++) {
                    ((C3423e) this.f46197w0.get(i8)).j(this.f46165B0);
                }
                z8 = K0(this.f46165B0);
                if (z8) {
                    this.f46165B0.A();
                }
                r16 = i4;
            } catch (Exception e4) {
                e4.printStackTrace();
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                r16 = i4;
                sb.append("EXCEPTION : ");
                sb.append(e4);
                printStream.println(sb.toString());
            }
            if (z8) {
                e1(this.f46165B0, j.f46196a);
            } else {
                F0(this.f46165B0);
                for (int i9 = r16; i9 < size; i9++) {
                    ((C3423e) this.f46197w0.get(i9)).F0(this.f46165B0);
                }
            }
            if (z6 && i7 < 8 && j.f46196a[2]) {
                int i10 = r16;
                int i11 = i10;
                int i12 = i11;
                while (i10 < size) {
                    C3423e c3423e2 = (C3423e) this.f46197w0.get(i10);
                    i11 = Math.max(i11, c3423e2.f46102S + c3423e2.N());
                    i12 = Math.max(i12, c3423e2.f46103T + c3423e2.t());
                    i10++;
                }
                int max3 = Math.max(this.f46109Z, i11);
                int max4 = Math.max(this.f46111a0, i12);
                C3423e.b bVar4 = C3423e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || N() >= max3) {
                    z4 = r16;
                } else {
                    A0(max3);
                    this.f46096M[r16] = bVar4;
                    z4 = true;
                    z7 = true;
                }
                if (bVar == bVar4 && t() < max4) {
                    e0(max4);
                    this.f46096M[1] = bVar4;
                    z4 = true;
                    z7 = true;
                }
            } else {
                z4 = r16;
            }
            int max5 = Math.max(this.f46109Z, N());
            if (max5 > N()) {
                A0(max5);
                this.f46096M[r16] = C3423e.b.FIXED;
                z4 = true;
                z7 = true;
            }
            int max6 = Math.max(this.f46111a0, t());
            if (max6 > t()) {
                e0(max6);
                this.f46096M[1] = C3423e.b.FIXED;
                z4 = true;
                z7 = true;
            }
            if (!z7) {
                C3423e.b bVar5 = this.f46096M[r16];
                C3423e.b bVar6 = C3423e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && N() > max) {
                    this.f46181R0 = true;
                    this.f46096M[r16] = C3423e.b.FIXED;
                    A0(max);
                    z4 = true;
                    z7 = true;
                }
                if (this.f46096M[1] == bVar6 && max2 > 0 && t() > max2) {
                    this.f46182S0 = true;
                    this.f46096M[1] = C3423e.b.FIXED;
                    e0(max2);
                    z8 = true;
                    z7 = true;
                    i6 = i7;
                    i4 = r16;
                }
            }
            z8 = z4;
            i6 = i7;
            i4 = r16;
        }
        int i13 = i4;
        this.f46197w0 = arrayList;
        if (z7) {
            C3423e.b[] bVarArr2 = this.f46096M;
            bVarArr2[i13] = bVar2;
            bVarArr2[1] = bVar;
        }
        X(this.f46165B0.w());
    }

    void J0(C3423e c3423e, int i4) {
        if (i4 == 0) {
            L0(c3423e);
        } else if (i4 == 1) {
            M0(c3423e);
        }
    }

    public boolean K0(C3404d c3404d) {
        f(c3404d);
        int size = this.f46197w0.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C3423e c3423e = (C3423e) this.f46197w0.get(i4);
            c3423e.l0(0, false);
            c3423e.l0(1, false);
            if (c3423e instanceof C3419a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                C3423e c3423e2 = (C3423e) this.f46197w0.get(i5);
                if (c3423e2 instanceof C3419a) {
                    ((C3419a) c3423e2).J0();
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C3423e c3423e3 = (C3423e) this.f46197w0.get(i6);
            if (c3423e3.e()) {
                c3423e3.f(c3404d);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C3423e c3423e4 = (C3423e) this.f46197w0.get(i7);
            if (c3423e4 instanceof f) {
                C3423e.b[] bVarArr = c3423e4.f46096M;
                C3423e.b bVar = bVarArr[0];
                C3423e.b bVar2 = bVarArr[1];
                C3423e.b bVar3 = C3423e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    c3423e4.i0(C3423e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    c3423e4.w0(C3423e.b.FIXED);
                }
                c3423e4.f(c3404d);
                if (bVar == bVar3) {
                    c3423e4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    c3423e4.w0(bVar2);
                }
            } else {
                j.a(this, c3404d, c3423e4);
                if (!c3423e4.e()) {
                    c3423e4.f(c3404d);
                }
            }
        }
        if (this.f46170G0 > 0) {
            AbstractC3420b.a(this, c3404d, 0);
        }
        if (this.f46171H0 > 0) {
            AbstractC3420b.a(this, c3404d, 1);
        }
        return true;
    }

    public boolean N0(boolean z4) {
        return this.f46185y0.f(z4);
    }

    public boolean O0(boolean z4) {
        return this.f46185y0.g(z4);
    }

    public boolean P0(boolean z4, int i4) {
        return this.f46185y0.h(z4, i4);
    }

    public void Q0(AbstractC3405e abstractC3405e) {
        this.f46165B0.v(abstractC3405e);
    }

    public C3447b.InterfaceC0282b R0() {
        return this.f46186z0;
    }

    public int S0() {
        return this.f46179P0;
    }

    public void T0() {
        this.f46185y0.j();
    }

    public void U0() {
        this.f46185y0.k();
    }

    public boolean V0() {
        return this.f46182S0;
    }

    @Override // t.k, t.C3423e
    public void W() {
        this.f46165B0.E();
        this.f46166C0 = 0;
        this.f46168E0 = 0;
        this.f46167D0 = 0;
        this.f46169F0 = 0;
        this.f46180Q0 = false;
        super.W();
    }

    public boolean W0() {
        return this.f46164A0;
    }

    public boolean X0() {
        return this.f46181R0;
    }

    public long Y0(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f46166C0 = i11;
        this.f46167D0 = i12;
        return this.f46184x0.d(this, i4, i11, i12, i5, i6, i7, i8, i9, i10);
    }

    public boolean Z0(int i4) {
        return (this.f46179P0 & i4) == i4;
    }

    public void b1(C3447b.InterfaceC0282b interfaceC0282b) {
        this.f46186z0 = interfaceC0282b;
        this.f46185y0.n(interfaceC0282b);
    }

    public void c1(int i4) {
        this.f46179P0 = i4;
        C3404d.f45886r = j.b(i4, UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    public void d1(boolean z4) {
        this.f46164A0 = z4;
    }

    public void e1(C3404d c3404d, boolean[] zArr) {
        zArr[2] = false;
        F0(c3404d);
        int size = this.f46197w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C3423e) this.f46197w0.get(i4)).F0(c3404d);
        }
    }

    public void f1() {
        this.f46184x0.e(this);
    }
}
