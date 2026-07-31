package b3;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1137a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f1138b;

    /* renamed from: c, reason: collision with root package name */
    public int f1139c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1140d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1141e;

    /* renamed from: f, reason: collision with root package name */
    public int f1142f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f1143g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f1144h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1145j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f1146k;

    /* renamed from: l, reason: collision with root package name */
    public int f1147l;

    public final void a(int i, float f6) {
        int i8 = this.f1142f;
        int[] iArr = this.f1140d;
        if (i8 >= iArr.length) {
            this.f1140d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1141e;
            this.f1141e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1140d;
        int i9 = this.f1142f;
        iArr2[i9] = i;
        float[] fArr2 = this.f1141e;
        this.f1142f = i9 + 1;
        fArr2[i9] = f6;
    }

    public final void b(int i, int i8) {
        int i9 = this.f1139c;
        int[] iArr = this.f1137a;
        if (i9 >= iArr.length) {
            this.f1137a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f1138b;
            this.f1138b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f1137a;
        int i10 = this.f1139c;
        iArr3[i10] = i;
        int[] iArr4 = this.f1138b;
        this.f1139c = i10 + 1;
        iArr4[i10] = i8;
    }

    public final void c(int i, boolean z3) {
        int i8 = this.f1147l;
        int[] iArr = this.f1145j;
        if (i8 >= iArr.length) {
            this.f1145j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f1146k;
            this.f1146k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f1145j;
        int i9 = this.f1147l;
        iArr2[i9] = i;
        boolean[] zArr2 = this.f1146k;
        this.f1147l = i9 + 1;
        zArr2[i9] = z3;
    }

    public final void d(String str, int i) {
        int i8 = this.i;
        int[] iArr = this.f1143g;
        if (i8 >= iArr.length) {
            this.f1143g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1144h;
            this.f1144h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f1143g;
        int i9 = this.i;
        iArr2[i9] = i;
        String[] strArr2 = this.f1144h;
        this.i = i9 + 1;
        strArr2[i9] = str;
    }
}
