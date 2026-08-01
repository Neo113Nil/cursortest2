package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3923a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3924b;

    /* renamed from: c, reason: collision with root package name */
    public int f3925c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3926e;

    /* renamed from: f, reason: collision with root package name */
    public int f3927f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3928g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3929j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3930k;

    /* renamed from: l, reason: collision with root package name */
    public int f3931l;

    public final void a(int i, float f2) {
        int i2 = this.f3927f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3926e;
            this.f3926e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f3927f;
        iArr2[i3] = i;
        float[] fArr2 = this.f3926e;
        this.f3927f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f3925c;
        int[] iArr = this.f3923a;
        if (i3 >= iArr.length) {
            this.f3923a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3924b;
            this.f3924b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3923a;
        int i4 = this.f3925c;
        iArr3[i4] = i;
        int[] iArr4 = this.f3924b;
        this.f3925c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f3931l;
        int[] iArr = this.f3929j;
        if (i2 >= iArr.length) {
            this.f3929j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3930k;
            this.f3930k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3929j;
        int i3 = this.f3931l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f3930k;
        this.f3931l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f3928g;
        if (i2 >= iArr.length) {
            this.f3928g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3928g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
