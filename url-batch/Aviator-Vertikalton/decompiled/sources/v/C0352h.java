package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4327a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4328b;

    /* renamed from: c, reason: collision with root package name */
    public int f4329c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4330d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4331e;

    /* renamed from: f, reason: collision with root package name */
    public int f4332f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4333g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4334j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4335k;

    /* renamed from: l, reason: collision with root package name */
    public int f4336l;

    public final void a(int i, float f2) {
        int i2 = this.f4332f;
        int[] iArr = this.f4330d;
        if (i2 >= iArr.length) {
            this.f4330d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4331e;
            this.f4331e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4330d;
        int i3 = this.f4332f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4331e;
        this.f4332f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4329c;
        int[] iArr = this.f4327a;
        if (i3 >= iArr.length) {
            this.f4327a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4328b;
            this.f4328b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4327a;
        int i4 = this.f4329c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4328b;
        this.f4329c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4336l;
        int[] iArr = this.f4334j;
        if (i2 >= iArr.length) {
            this.f4334j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4335k;
            this.f4335k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4334j;
        int i3 = this.f4336l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4335k;
        this.f4336l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4333g;
        if (i2 >= iArr.length) {
            this.f4333g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4333g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
