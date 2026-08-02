package S0;

import W.AbstractC0108a;
import a.AbstractC0124a;
import y0.E;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2549a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2550b;

    /* renamed from: c, reason: collision with root package name */
    public final E f2551c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2552d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2553e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(boolean z, String str, int i4, byte[] bArr, int i5, int i6, byte[] bArr2) {
        char c4 = 0;
        int i7 = 1;
        AbstractC0124a.h((i4 == 0) ^ (bArr2 == null));
        this.f2549a = z;
        this.f2550b = str;
        this.f2552d = i4;
        this.f2553e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                    i7 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    AbstractC0108a.s("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f2551c = new E(i7, i5, i6, bArr);
    }
}
