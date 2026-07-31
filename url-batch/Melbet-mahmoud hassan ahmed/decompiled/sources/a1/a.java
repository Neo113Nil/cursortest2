package a1;

import a1.e;
import java.util.Collections;
import o2.a0;
import r0.s1;
import t0.a;
import w0.e0;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f1e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f2b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3c;

    /* renamed from: d, reason: collision with root package name */
    private int f4d;

    public a(e0 e0Var) {
        super(e0Var);
    }

    @Override // a1.e
    protected boolean b(a0 a0Var) {
        s1.b f02;
        if (this.f2b) {
            a0Var.P(1);
        } else {
            int C = a0Var.C();
            int i7 = (C >> 4) & 15;
            this.f4d = i7;
            if (i7 == 2) {
                f02 = new s1.b().e0("audio/mpeg").H(1).f0(f1e[(C >> 2) & 3]);
            } else if (i7 == 7 || i7 == 8) {
                f02 = new s1.b().e0(i7 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000);
            } else {
                if (i7 != 10) {
                    throw new e.a("Audio format not supported: " + this.f4d);
                }
                this.f2b = true;
            }
            this.f26a.e(f02.E());
            this.f3c = true;
            this.f2b = true;
        }
        return true;
    }

    @Override // a1.e
    protected boolean c(a0 a0Var, long j7) {
        if (this.f4d == 2) {
            int a7 = a0Var.a();
            this.f26a.d(a0Var, a7);
            this.f26a.b(j7, 1, a7, 0, null);
            return true;
        }
        int C = a0Var.C();
        if (C != 0 || this.f3c) {
            if (this.f4d == 10 && C != 1) {
                return false;
            }
            int a8 = a0Var.a();
            this.f26a.d(a0Var, a8);
            this.f26a.b(j7, 1, a8, 0, null);
            return true;
        }
        int a9 = a0Var.a();
        byte[] bArr = new byte[a9];
        a0Var.j(bArr, 0, a9);
        a.b f7 = t0.a.f(bArr);
        this.f26a.e(new s1.b().e0("audio/mp4a-latm").I(f7.f21669c).H(f7.f21668b).f0(f7.f21667a).T(Collections.singletonList(bArr)).E());
        this.f3c = true;
        return false;
    }
}
