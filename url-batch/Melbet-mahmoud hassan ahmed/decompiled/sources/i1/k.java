package i1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private int f16936a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f16937b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f16938c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f16939d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f16940e;

    public k() {
        this.f16940e = r0.length - 1;
    }

    private void c() {
        int[] iArr = this.f16939d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i7 = this.f16936a;
        int i8 = length2 - i7;
        System.arraycopy(iArr, i7, iArr2, 0, i8);
        System.arraycopy(this.f16939d, 0, iArr2, i8, i7);
        this.f16936a = 0;
        this.f16937b = this.f16938c - 1;
        this.f16939d = iArr2;
        this.f16940e = iArr2.length - 1;
    }

    public void a(int i7) {
        if (this.f16938c == this.f16939d.length) {
            c();
        }
        int i8 = (this.f16937b + 1) & this.f16940e;
        this.f16937b = i8;
        this.f16939d[i8] = i7;
        this.f16938c++;
    }

    public void b() {
        this.f16936a = 0;
        this.f16937b = -1;
        this.f16938c = 0;
    }

    public boolean d() {
        return this.f16938c == 0;
    }

    public int e() {
        int i7 = this.f16938c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f16939d;
        int i8 = this.f16936a;
        int i9 = iArr[i8];
        this.f16936a = (i8 + 1) & this.f16940e;
        this.f16938c = i7 - 1;
        return i9;
    }
}
