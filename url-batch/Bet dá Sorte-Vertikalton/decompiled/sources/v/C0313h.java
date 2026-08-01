package v;

import java.util.Arrays;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4054a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4055b;

    /* renamed from: c, reason: collision with root package name */
    public int f4056c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f4057e;

    /* renamed from: f, reason: collision with root package name */
    public int f4058f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4059g;
    public String[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4060j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f4061k;

    /* renamed from: l, reason: collision with root package name */
    public int f4062l;

    public final void a(int i, float f2) {
        int i2 = this.f4058f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4057e;
            this.f4057e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f4058f;
        iArr2[i3] = i;
        float[] fArr2 = this.f4057e;
        this.f4058f = i3 + 1;
        fArr2[i3] = f2;
    }

    public final void b(int i, int i2) {
        int i3 = this.f4056c;
        int[] iArr = this.f4054a;
        if (i3 >= iArr.length) {
            this.f4054a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4055b;
            this.f4055b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4054a;
        int i4 = this.f4056c;
        iArr3[i4] = i;
        int[] iArr4 = this.f4055b;
        this.f4056c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, boolean z2) {
        int i2 = this.f4062l;
        int[] iArr = this.f4060j;
        if (i2 >= iArr.length) {
            this.f4060j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4061k;
            this.f4061k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4060j;
        int i3 = this.f4062l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f4061k;
        this.f4062l = i3 + 1;
        zArr2[i3] = z2;
    }

    public final void d(String str, int i) {
        int i2 = this.i;
        int[] iArr = this.f4059g;
        if (i2 >= iArr.length) {
            this.f4059g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4059g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }
}
