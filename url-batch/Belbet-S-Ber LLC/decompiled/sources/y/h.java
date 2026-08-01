package y;

import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4009a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4010b;

    /* renamed from: c, reason: collision with root package name */
    public int f4011c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4012e;

    /* renamed from: f, reason: collision with root package name */
    public int f4013f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4014g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4015j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4016k;

    /* renamed from: l, reason: collision with root package name */
    public int f4017l;

    public final void a(int i, float f5) {
        int i4 = this.f4013f;
        int[] iArr = this.d;
        if (i4 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4012e;
            this.f4012e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i5 = this.f4013f;
        iArr2[i5] = i;
        float[] fArr2 = this.f4012e;
        this.f4013f = i5 + 1;
        fArr2[i5] = f5;
    }

    public final void b(int i, int i4) {
        int i5 = this.f4011c;
        int[] iArr = this.f4009a;
        if (i5 >= iArr.length) {
            this.f4009a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4010b;
            this.f4010b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4009a;
        int i6 = this.f4011c;
        iArr3[i6] = i;
        int[] iArr4 = this.f4010b;
        this.f4011c = i6 + 1;
        iArr4[i6] = i4;
    }

    public final void c(int i, boolean z4) {
        int i4 = this.f4017l;
        int[] iArr = this.f4015j;
        if (i4 >= iArr.length) {
            this.f4015j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4016k;
            this.f4016k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4015j;
        int i5 = this.f4017l;
        iArr2[i5] = i;
        boolean[] zArr2 = this.f4016k;
        this.f4017l = i5 + 1;
        zArr2[i5] = z4;
    }

    public final void d(String str, int i) {
        int i4 = this.i;
        int[] iArr = this.f4014g;
        if (i4 >= iArr.length) {
            this.f4014g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4014g;
        int i5 = this.i;
        iArr2[i5] = i;
        String[] strArr2 = this.h;
        this.i = i5 + 1;
        strArr2[i5] = str;
    }
}
