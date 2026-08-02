package T0;

import W.u;
import a.AbstractC0124a;
import java.io.EOFException;
import y0.o;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2921a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final u f2922b = new u(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    public int f2923c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2924d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2925e;

    public final int a(int i4) {
        int i5;
        int i6 = 0;
        this.f2924d = 0;
        do {
            int i7 = this.f2924d;
            int i8 = i4 + i7;
            f fVar = this.f2921a;
            if (i8 >= fVar.f2928c) {
                break;
            }
            int[] iArr = fVar.f2931f;
            this.f2924d = i7 + 1;
            i5 = iArr[i8];
            i6 += i5;
        } while (i5 == 255);
        return i6;
    }

    public final boolean b(o oVar) {
        int i4;
        AbstractC0124a.t(oVar != null);
        boolean z = this.f2925e;
        u uVar = this.f2922b;
        if (z) {
            this.f2925e = false;
            uVar.J(0);
        }
        while (!this.f2925e) {
            int i5 = this.f2923c;
            f fVar = this.f2921a;
            if (i5 < 0) {
                if (fVar.b(oVar, -1L) && fVar.a(oVar, true)) {
                    int i6 = fVar.f2929d;
                    if ((fVar.f2926a & 1) == 1 && uVar.f3353c == 0) {
                        i6 += a(0);
                        i4 = this.f2924d;
                    } else {
                        i4 = 0;
                    }
                    try {
                        oVar.v(i6);
                        this.f2923c = i4;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a3 = a(this.f2923c);
            int i7 = this.f2923c + this.f2924d;
            if (a3 > 0) {
                uVar.c(uVar.f3353c + a3);
                try {
                    oVar.readFully(uVar.f3351a, uVar.f3353c, a3);
                    uVar.L(uVar.f3353c + a3);
                    this.f2925e = fVar.f2931f[i7 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i7 == fVar.f2928c) {
                i7 = -1;
            }
            this.f2923c = i7;
        }
        return true;
    }
}
