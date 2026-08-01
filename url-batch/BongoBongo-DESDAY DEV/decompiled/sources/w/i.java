package w;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4066a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4067b;

    /* renamed from: c, reason: collision with root package name */
    public int f4068c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4069e;

    /* renamed from: f, reason: collision with root package name */
    public int f4070f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4071g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f4072h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4073j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4074k;

    /* renamed from: l, reason: collision with root package name */
    public int f4075l;

    public final void a(int i, float f2) {
        int i2 = this.f4070f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4069e;
            this.f4069e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f4070f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4069e;
        this.f4070f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4068c;
        int[] iArr = this.f4066a;
        if (i3 >= iArr.length) {
            this.f4066a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4067b;
            this.f4067b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4066a;
        int i4 = this.f4068c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4067b;
        this.f4068c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4075l;
        int[] iArr = this.f4073j;
        if (i2 >= iArr.length) {
            this.f4073j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4074k;
            this.f4074k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4073j;
        int i3 = this.f4075l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4074k;
        this.f4075l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4071g;
        if (i2 >= iArr.length) {
            this.f4071g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4072h;
            this.f4072h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4071g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.f4072h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
