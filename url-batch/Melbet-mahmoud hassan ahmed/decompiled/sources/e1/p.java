package e1;

import w0.e0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15981a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15982b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.a f15983c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15984d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f15985e;

    public p(boolean z6, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        o2.a.a((bArr2 == null) ^ (i7 == 0));
        this.f15981a = z6;
        this.f15982b = str;
        this.f15984d = i7;
        this.f15985e = bArr2;
        this.f15983c = new e0.a(a(str), bArr, i8, i9);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c7 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c7 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c7 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c7 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c7 = 3;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
            case 1:
                return 2;
            default:
                o2.r.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
