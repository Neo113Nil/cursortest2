package e1;

import r0.s1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f15970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15971b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15972c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15973d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15974e;

    /* renamed from: f, reason: collision with root package name */
    public final s1 f15975f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15976g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f15977h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f15978i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15979j;

    /* renamed from: k, reason: collision with root package name */
    private final p[] f15980k;

    public o(int i7, int i8, long j7, long j8, long j9, s1 s1Var, int i9, p[] pVarArr, int i10, long[] jArr, long[] jArr2) {
        this.f15970a = i7;
        this.f15971b = i8;
        this.f15972c = j7;
        this.f15973d = j8;
        this.f15974e = j9;
        this.f15975f = s1Var;
        this.f15976g = i9;
        this.f15980k = pVarArr;
        this.f15979j = i10;
        this.f15977h = jArr;
        this.f15978i = jArr2;
    }

    public p a(int i7) {
        p[] pVarArr = this.f15980k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i7];
    }
}
