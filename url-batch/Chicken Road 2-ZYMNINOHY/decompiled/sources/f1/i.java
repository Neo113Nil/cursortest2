package f1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f8603e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f8604a;

    /* renamed from: b, reason: collision with root package name */
    public int f8605b;

    /* renamed from: c, reason: collision with root package name */
    public int f8606c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8607d;

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f8604a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f8607d;
            int length = bArr2.length;
            int i7 = this.f8605b + i6;
            if (length < i7) {
                this.f8607d = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i4, this.f8607d, this.f8605b, i6);
            this.f8605b += i6;
        }
    }
}
