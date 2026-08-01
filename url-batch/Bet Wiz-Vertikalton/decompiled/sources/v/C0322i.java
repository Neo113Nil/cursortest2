package v;

import java.util.Arrays;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3921a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3922b;

    /* renamed from: c, reason: collision with root package name */
    public int f3923c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3924e;

    /* renamed from: f, reason: collision with root package name */
    public int f3925f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3926g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3927j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3928k;

    /* renamed from: l, reason: collision with root package name */
    public int f3929l;

    public final void a(int i, float f2) {
        int i2 = this.f3925f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3924e;
            this.f3924e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3925f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3924e;
        this.f3925f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3923c;
        int[] iArr = this.f3921a;
        if (i3 >= iArr.length) {
            this.f3921a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3922b;
            this.f3922b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3921a;
        int i4 = this.f3923c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3922b;
        this.f3923c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3929l;
        int[] iArr = this.f3927j;
        if (i2 >= iArr.length) {
            this.f3927j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3928k;
            this.f3928k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3927j;
        int i3 = this.f3929l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3928k;
        this.f3929l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3926g;
        if (i2 >= iArr.length) {
            this.f3926g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3926g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
