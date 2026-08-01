package v;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3919a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3920b;

    /* renamed from: c, reason: collision with root package name */
    public int f3921c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3922e;

    /* renamed from: f, reason: collision with root package name */
    public int f3923f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3924g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3925j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3926k;

    /* renamed from: l, reason: collision with root package name */
    public int f3927l;

    public final void a(int i, float f2) {
        int i2 = this.f3923f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3922e;
            this.f3922e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3923f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3922e;
        this.f3923f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3921c;
        int[] iArr = this.f3919a;
        if (i3 >= iArr.length) {
            this.f3919a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3920b;
            this.f3920b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3919a;
        int i4 = this.f3921c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3920b;
        this.f3921c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3927l;
        int[] iArr = this.f3925j;
        if (i2 >= iArr.length) {
            this.f3925j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3926k;
            this.f3926k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3925j;
        int i3 = this.f3927l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3926k;
        this.f3927l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3924g;
        if (i2 >= iArr.length) {
            this.f3924g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3924g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
