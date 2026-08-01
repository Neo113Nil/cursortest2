package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3924a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3925b;

    /* renamed from: c, reason: collision with root package name */
    public int f3926c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3927e;

    /* renamed from: f, reason: collision with root package name */
    public int f3928f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3929g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3930j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3931k;

    /* renamed from: l, reason: collision with root package name */
    public int f3932l;

    public final void a(int i, float f2) {
        int i2 = this.f3928f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3927e;
            this.f3927e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3928f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3927e;
        this.f3928f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3926c;
        int[] iArr = this.f3924a;
        if (i3 >= iArr.length) {
            this.f3924a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3925b;
            this.f3925b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3924a;
        int i4 = this.f3926c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3925b;
        this.f3926c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3932l;
        int[] iArr = this.f3930j;
        if (i2 >= iArr.length) {
            this.f3930j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3931k;
            this.f3931k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3930j;
        int i3 = this.f3932l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3931k;
        this.f3932l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3929g;
        if (i2 >= iArr.length) {
            this.f3929g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3929g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
