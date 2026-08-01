package x;

import java.util.Arrays;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4597a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4598b;

    /* renamed from: c, reason: collision with root package name */
    public int f4599c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4600d;
    public float[] e;

    /* renamed from: f, reason: collision with root package name */
    public int f4601f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4602g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f4603h;
    public int i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4604k;

    /* renamed from: l, reason: collision with root package name */
    public int f4605l;

    public final void a(int i, float f2) {
        int i2 = this.f4601f;
        int[] iArr = this.f4600d;
        if (i2 >= iArr.length) {
            this.f4600d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4600d;
        int i3 = this.f4601f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f4601f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4599c;
        int[] iArr = this.f4597a;
        if (i3 >= iArr.length) {
            this.f4597a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4598b;
            this.f4598b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4597a;
        int i4 = this.f4599c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4598b;
        this.f4599c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4605l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4604k;
            this.f4604k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.f4605l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4604k;
        this.f4605l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4602g;
        if (i2 >= iArr.length) {
            this.f4602g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4603h;
            this.f4603h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4602g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.f4603h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
