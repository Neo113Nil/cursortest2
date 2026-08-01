package x;

import java.util.Arrays;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4038a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4039b;

    /* renamed from: c, reason: collision with root package name */
    public int f4040c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4041e;

    /* renamed from: f, reason: collision with root package name */
    public int f4042f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4043g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4044j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4045k;

    /* renamed from: l, reason: collision with root package name */
    public int f4046l;

    public final void a(int i, float f2) {
        int i2 = this.f4042f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4041e;
            this.f4041e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f4042f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4041e;
        this.f4042f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4040c;
        int[] iArr = this.f4038a;
        if (i3 >= iArr.length) {
            this.f4038a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4039b;
            this.f4039b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4038a;
        int i4 = this.f4040c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4039b;
        this.f4040c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4046l;
        int[] iArr = this.f4044j;
        if (i2 >= iArr.length) {
            this.f4044j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4045k;
            this.f4045k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4044j;
        int i3 = this.f4046l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4045k;
        this.f4046l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4043g;
        if (i2 >= iArr.length) {
            this.f4043g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4043g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
