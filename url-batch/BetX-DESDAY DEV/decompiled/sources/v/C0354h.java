package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4331a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4332b;

    /* renamed from: c, reason: collision with root package name */
    public int f4333c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4334d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4335e;

    /* renamed from: f, reason: collision with root package name */
    public int f4336f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4337g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4338j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4339k;

    /* renamed from: l, reason: collision with root package name */
    public int f4340l;

    public final void a(int i, float f2) {
        int i2 = this.f4336f;
        int[] iArr = this.f4334d;
        if (i2 >= iArr.length) {
            this.f4334d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4335e;
            this.f4335e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4334d;
        int i3 = this.f4336f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4335e;
        this.f4336f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4333c;
        int[] iArr = this.f4331a;
        if (i3 >= iArr.length) {
            this.f4331a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4332b;
            this.f4332b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4331a;
        int i4 = this.f4333c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4332b;
        this.f4333c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4340l;
        int[] iArr = this.f4338j;
        if (i2 >= iArr.length) {
            this.f4338j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4339k;
            this.f4339k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4338j;
        int i3 = this.f4340l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4339k;
        this.f4340l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4337g;
        if (i2 >= iArr.length) {
            this.f4337g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4337g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
