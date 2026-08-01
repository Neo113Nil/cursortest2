package y;

import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f3685a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3686b;

    /* renamed from: c, reason: collision with root package name */
    public int f3687c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3688e;

    /* renamed from: f, reason: collision with root package name */
    public int f3689f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f3690g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f3691h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3692j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f3693k;

    /* renamed from: l, reason: collision with root package name */
    public int f3694l;

    public final void a(int i, float f2) {
        int i4 = this.f3689f;
        int[] iArr = this.d;
        if (i4 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f3688e;
            this.f3688e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i5 = this.f3689f;
        iArr2[i5] = i;
        float[] fArr2 = this.f3688e;
        this.f3689f = i5 + 1;
        fArr2[i5] = f2;
    }

    public final void b(int i, int i4) {
        int i5 = this.f3687c;
        int[] iArr = this.f3685a;
        if (i5 >= iArr.length) {
            this.f3685a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f3686b;
            this.f3686b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f3685a;
        int i6 = this.f3687c;
        iArr3[i6] = i;
        int[] iArr4 = this.f3686b;
        this.f3687c = i6 + 1;
        iArr4[i6] = i4;
    }

    public final void c(int i, boolean z3) {
        int i4 = this.f3694l;
        int[] iArr = this.f3692j;
        if (i4 >= iArr.length) {
            this.f3692j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f3693k;
            this.f3693k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f3692j;
        int i5 = this.f3694l;
        iArr2[i5] = i;
        boolean[] zArr2 = this.f3693k;
        this.f3694l = i5 + 1;
        zArr2[i5] = z3;
    }

    public final void d(String str, int i) {
        int i4 = this.i;
        int[] iArr = this.f3690g;
        if (i4 >= iArr.length) {
            this.f3690g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f3691h;
            this.f3691h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f3690g;
        int i5 = this.i;
        iArr2[i5] = i;
        String[] strArr2 = this.f3691h;
        this.i = i5 + 1;
        strArr2[i5] = str;
    }
}
