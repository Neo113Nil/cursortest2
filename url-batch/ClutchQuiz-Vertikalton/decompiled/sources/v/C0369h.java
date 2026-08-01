package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3870a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3871b;

    /* renamed from: c, reason: collision with root package name */
    public int f3872c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3873e;

    /* renamed from: f, reason: collision with root package name */
    public int f3874f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3875g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3876j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3877k;

    /* renamed from: l, reason: collision with root package name */
    public int f3878l;

    public final void a(int i, float f2) {
        int i2 = this.f3874f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3873e;
            this.f3873e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3874f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3873e;
        this.f3874f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3872c;
        int[] iArr = this.f3870a;
        if (i3 >= iArr.length) {
            this.f3870a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3871b;
            this.f3871b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3870a;
        int i4 = this.f3872c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3871b;
        this.f3872c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3878l;
        int[] iArr = this.f3876j;
        if (i2 >= iArr.length) {
            this.f3876j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3877k;
            this.f3877k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3876j;
        int i3 = this.f3878l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3877k;
        this.f3878l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3875g;
        if (i2 >= iArr.length) {
            this.f3875g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3875g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
