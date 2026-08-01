package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3998a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3999b;

    /* renamed from: c, reason: collision with root package name */
    public int f4000c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4001e;

    /* renamed from: f, reason: collision with root package name */
    public int f4002f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4003g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4004j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4005k;

    /* renamed from: l, reason: collision with root package name */
    public int f4006l;

    public final void a(int i, float f2) {
        int i2 = this.f4002f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4001e;
            this.f4001e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f4002f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4001e;
        this.f4002f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4000c;
        int[] iArr = this.f3998a;
        if (i3 >= iArr.length) {
            this.f3998a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3999b;
            this.f3999b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3998a;
        int i4 = this.f4000c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3999b;
        this.f4000c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4006l;
        int[] iArr = this.f4004j;
        if (i2 >= iArr.length) {
            this.f4004j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4005k;
            this.f4005k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4004j;
        int i3 = this.f4006l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4005k;
        this.f4006l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4003g;
        if (i2 >= iArr.length) {
            this.f4003g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4003g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
