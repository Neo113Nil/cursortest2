package v;

import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3491a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3492b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3493d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3494e;

    /* renamed from: f, reason: collision with root package name */
    public int f3495f;
    public int[] g;
    public String[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f3496i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3497j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3498k;

    /* renamed from: l, reason: collision with root package name */
    public int f3499l;

    public final void a(int i4, float f4) {
        int i5 = this.f3495f;
        int[] iArr = this.f3493d;
        if (i5 >= iArr.length) {
            this.f3493d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3494e;
            this.f3494e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f3493d;
        int i6 = this.f3495f;
        iArr2[i6] = i4;
        float[] fArr2 = this.f3494e;
        this.f3495f = i6 + 1;
        fArr2[i6] = f4;
    }

    public final void b(int i4, int i5) {
        int i6 = this.c;
        int[] iArr = this.f3491a;
        if (i6 >= iArr.length) {
            this.f3491a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3492b;
            this.f3492b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3491a;
        int i7 = this.c;
        iArr3[i7] = i4;
        int[] iArr4 = this.f3492b;
        this.c = i7 + 1;
        iArr4[i7] = i5;
    }

    public final void c(int i4, boolean z3) {
        int i5 = this.f3499l;
        int[] iArr = this.f3497j;
        if (i5 >= iArr.length) {
            this.f3497j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3498k;
            this.f3498k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3497j;
        int i6 = this.f3499l;
        iArr2[i6] = i4;
        boolean[] zArr2 = this.f3498k;
        this.f3499l = i6 + 1;
        zArr2[i6] = z3;
    }

    public final void d(String str, int i4) {
        int i5 = this.f3496i;
        int[] iArr = this.g;
        if (i5 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i6 = this.f3496i;
        iArr2[i6] = i4;
        String[] strArr2 = this.h;
        this.f3496i = i6 + 1;
        strArr2[i6] = str;
    }
}
