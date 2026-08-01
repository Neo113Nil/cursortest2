package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3993a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3994b;

    /* renamed from: c, reason: collision with root package name */
    public int f3995c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3996e;

    /* renamed from: f, reason: collision with root package name */
    public int f3997f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3998g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3999j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4000k;

    /* renamed from: l, reason: collision with root package name */
    public int f4001l;

    public final void a(int i, float f2) {
        int i2 = this.f3997f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3996e;
            this.f3996e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3997f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3996e;
        this.f3997f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3995c;
        int[] iArr = this.f3993a;
        if (i3 >= iArr.length) {
            this.f3993a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3994b;
            this.f3994b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3993a;
        int i4 = this.f3995c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3994b;
        this.f3995c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4001l;
        int[] iArr = this.f3999j;
        if (i2 >= iArr.length) {
            this.f3999j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4000k;
            this.f4000k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3999j;
        int i3 = this.f4001l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4000k;
        this.f4001l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3998g;
        if (i2 >= iArr.length) {
            this.f3998g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3998g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
