package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3907a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3908b;

    /* renamed from: c, reason: collision with root package name */
    public int f3909c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3910e;

    /* renamed from: f, reason: collision with root package name */
    public int f3911f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3912g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3913j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3914k;

    /* renamed from: l, reason: collision with root package name */
    public int f3915l;

    public final void a(int i, float f2) {
        int i2 = this.f3911f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3910e;
            this.f3910e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3911f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3910e;
        this.f3911f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3909c;
        int[] iArr = this.f3907a;
        if (i3 >= iArr.length) {
            this.f3907a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3908b;
            this.f3908b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3907a;
        int i4 = this.f3909c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3908b;
        this.f3909c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3915l;
        int[] iArr = this.f3913j;
        if (i2 >= iArr.length) {
            this.f3913j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3914k;
            this.f3914k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3913j;
        int i3 = this.f3915l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3914k;
        this.f3915l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3912g;
        if (i2 >= iArr.length) {
            this.f3912g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3912g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
