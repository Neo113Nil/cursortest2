package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3901a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3902b;

    /* renamed from: c, reason: collision with root package name */
    public int f3903c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3904e;

    /* renamed from: f, reason: collision with root package name */
    public int f3905f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3906g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3907j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3908k;

    /* renamed from: l, reason: collision with root package name */
    public int f3909l;

    public final void a(int i, float f2) {
        int i2 = this.f3905f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3904e;
            this.f3904e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3905f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3904e;
        this.f3905f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3903c;
        int[] iArr = this.f3901a;
        if (i3 >= iArr.length) {
            this.f3901a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3902b;
            this.f3902b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3901a;
        int i4 = this.f3903c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3902b;
        this.f3903c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3909l;
        int[] iArr = this.f3907j;
        if (i2 >= iArr.length) {
            this.f3907j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3908k;
            this.f3908k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3907j;
        int i3 = this.f3909l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3908k;
        this.f3909l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3906g;
        if (i2 >= iArr.length) {
            this.f3906g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3906g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
