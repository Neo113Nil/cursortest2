package D0;

import T.r;
import y0.C1573e;
import y0.C1574f;
import y0.InterfaceC1575g;
import y0.h;
import y0.i;
import y0.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C1573e f335a;

    /* renamed from: b, reason: collision with root package name */
    public final i f336b;

    /* renamed from: c, reason: collision with root package name */
    public C1574f f337c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338d;

    public c(InterfaceC1575g interfaceC1575g, i iVar, long j4, long j5, long j6, long j7, long j8, int i4) {
        this.f336b = iVar;
        this.f338d = i4;
        this.f335a = new C1573e(interfaceC1575g, j4, j5, j6, j7, j8);
    }

    public static int a(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public static int c(o oVar, long j4, r rVar) {
        if (j4 == oVar.getPosition()) {
            return 0;
        }
        rVar.f2881a = j4;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(o oVar, r rVar) {
        while (true) {
            C1574f c1574f = this.f337c;
            c1574f.getClass();
            long j4 = c1574f.f16153f;
            long j5 = c1574f.f16154g;
            long j6 = c1574f.f16155h;
            long j7 = j5 - j4;
            long j8 = this.f338d;
            i iVar = this.f336b;
            if (j7 <= j8) {
                this.f337c = null;
                iVar.y();
                return c(oVar, j4, rVar);
            }
            long position = j6 - oVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            oVar.v((int) position);
            oVar.u();
            h j9 = iVar.j(oVar, c1574f.f16149b);
            int i4 = j9.f16157a;
            long j10 = j9.f16158b;
            long j11 = j9.f16159c;
            if (i4 == -3) {
                this.f337c = null;
                iVar.y();
                return c(oVar, j6, rVar);
            }
            if (i4 == -2) {
                c1574f.f16151d = j10;
                c1574f.f16153f = j11;
                c1574f.f16155h = C1574f.a(c1574f.f16149b, j10, c1574f.f16152e, j11, c1574f.f16154g, c1574f.f16150c);
            } else {
                if (i4 != -1) {
                    if (i4 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j11 - oVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        oVar.v((int) position2);
                    }
                    this.f337c = null;
                    iVar.y();
                    return c(oVar, j11, rVar);
                }
                c1574f.f16152e = j10;
                c1574f.f16154g = j11;
                c1574f.f16155h = C1574f.a(c1574f.f16149b, c1574f.f16151d, j10, c1574f.f16153f, j11, c1574f.f16150c);
            }
        }
    }

    public final void d(long j4) {
        C1574f c1574f = this.f337c;
        if (c1574f == null || c1574f.f16148a != j4) {
            C1573e c1573e = this.f335a;
            this.f337c = new C1574f(j4, c1573e.f16142a.b(j4), c1573e.f16144c, c1573e.f16145d, c1573e.f16146e, c1573e.f16147f);
        }
    }
}
