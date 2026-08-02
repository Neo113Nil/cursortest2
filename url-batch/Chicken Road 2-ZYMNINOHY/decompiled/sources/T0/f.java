package T0;

import T.G;
import W.u;
import a.AbstractC0124a;
import java.io.EOFException;
import kotlin.KotlinVersion;
import y0.o;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f2926a;

    /* renamed from: b, reason: collision with root package name */
    public long f2927b;

    /* renamed from: c, reason: collision with root package name */
    public int f2928c;

    /* renamed from: d, reason: collision with root package name */
    public int f2929d;

    /* renamed from: e, reason: collision with root package name */
    public int f2930e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2931f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g, reason: collision with root package name */
    public final u f2932g = new u(KotlinVersion.MAX_COMPONENT_VALUE);

    public final boolean a(o oVar, boolean z) {
        boolean z4;
        boolean z5;
        this.f2926a = 0;
        this.f2927b = 0L;
        this.f2928c = 0;
        this.f2929d = 0;
        this.f2930e = 0;
        u uVar = this.f2932g;
        uVar.J(27);
        try {
            z4 = oVar.l(uVar.f3351a, 0, 27, z);
        } catch (EOFException e4) {
            if (!z) {
                throw e4;
            }
            z4 = false;
        }
        if (z4 && uVar.B() == 1332176723) {
            if (uVar.z() == 0) {
                this.f2926a = uVar.z();
                this.f2927b = uVar.p();
                uVar.q();
                uVar.q();
                uVar.q();
                int z6 = uVar.z();
                this.f2928c = z6;
                this.f2929d = z6 + 27;
                uVar.J(z6);
                try {
                    z5 = oVar.l(uVar.f3351a, 0, this.f2928c, z);
                } catch (EOFException e5) {
                    if (!z) {
                        throw e5;
                    }
                    z5 = false;
                }
                if (z5) {
                    for (int i4 = 0; i4 < this.f2928c; i4++) {
                        int z7 = uVar.z();
                        this.f2931f[i4] = z7;
                        this.f2930e += z7;
                    }
                    return true;
                }
            } else if (!z) {
                throw G.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(o oVar, long j4) {
        boolean z;
        AbstractC0124a.h(oVar.getPosition() == oVar.m());
        u uVar = this.f2932g;
        uVar.J(4);
        while (true) {
            if (j4 != -1 && oVar.getPosition() + 4 >= j4) {
                break;
            }
            try {
                z = oVar.l(uVar.f3351a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            uVar.M(0);
            if (uVar.B() == 1332176723) {
                oVar.u();
                return true;
            }
            oVar.v(1);
        }
        do {
            if (j4 != -1 && oVar.getPosition() >= j4) {
                break;
            }
        } while (oVar.q(1) != -1);
        return false;
    }
}
