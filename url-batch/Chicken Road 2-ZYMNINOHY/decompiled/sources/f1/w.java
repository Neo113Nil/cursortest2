package f1;

import W.G;
import W.J;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8783a;

    /* renamed from: b, reason: collision with root package name */
    public final G f8784b;

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8785c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8786d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8787e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8788f;

    /* renamed from: g, reason: collision with root package name */
    public long f8789g;

    /* renamed from: h, reason: collision with root package name */
    public long f8790h;

    /* renamed from: i, reason: collision with root package name */
    public long f8791i;

    public w(int i4) {
        this.f8783a = i4;
        switch (i4) {
            case 1:
                this.f8784b = new G(0L);
                this.f8789g = -9223372036854775807L;
                this.f8790h = -9223372036854775807L;
                this.f8791i = -9223372036854775807L;
                this.f8785c = new W.u();
                break;
            default:
                this.f8784b = new G(0L);
                this.f8789g = -9223372036854775807L;
                this.f8790h = -9223372036854775807L;
                this.f8791i = -9223372036854775807L;
                this.f8785c = new W.u();
                break;
        }
    }

    public static int b(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public static long c(W.u uVar) {
        int i4 = uVar.f3352b;
        if (uVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uVar.k(bArr, 0, 9);
        uVar.M(i4);
        byte b4 = bArr[0];
        if ((b4 & 196) == 68) {
            byte b5 = bArr[2];
            if ((b5 & 4) == 4) {
                byte b6 = bArr[4];
                if ((b6 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j4 = b4;
                    long j5 = b5;
                    return ((j5 & 3) << 13) | ((j4 & 3) << 28) | (((56 & j4) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j5 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b6 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(y0.o oVar) {
        switch (this.f8783a) {
            case 0:
                byte[] bArr = J.f3264b;
                W.u uVar = this.f8785c;
                uVar.getClass();
                uVar.K(bArr.length, bArr);
                this.f8786d = true;
                oVar.u();
                break;
            default:
                byte[] bArr2 = J.f3264b;
                W.u uVar2 = this.f8785c;
                uVar2.getClass();
                uVar2.K(bArr2.length, bArr2);
                this.f8786d = true;
                oVar.u();
                break;
        }
    }
}
