package f1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f8624f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f8625a;

    /* renamed from: b, reason: collision with root package name */
    public int f8626b;

    /* renamed from: c, reason: collision with root package name */
    public int f8627c;

    /* renamed from: d, reason: collision with root package name */
    public int f8628d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f8629e;

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f8625a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f8629e;
            int length = bArr2.length;
            int i7 = this.f8627c + i6;
            if (length < i7) {
                this.f8629e = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i4, this.f8629e, this.f8627c, i6);
            this.f8627c += i6;
        }
    }
}
