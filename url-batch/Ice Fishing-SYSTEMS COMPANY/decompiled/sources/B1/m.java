package B1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f102b = new m(2);

    /* renamed from: c, reason: collision with root package name */
    public static final m f103c = new m(0);

    /* renamed from: d, reason: collision with root package name */
    public static final m f104d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f105e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f106f;

    /* renamed from: g, reason: collision with root package name */
    public static final s1.g f107g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f108h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109a;

    static {
        m mVar = new m(1);
        f104d = mVar;
        f105e = new m(3);
        f106f = mVar;
        f107g = s1.g.a(mVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f108h = true;
    }

    public /* synthetic */ m(int i) {
        this.f109a = i;
    }

    public final int a(int i, int i4, int i9, int i10) {
        switch (this.f109a) {
            case 0:
                if (b(i, i4, i9, i10) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f108h) {
                }
                break;
        }
        return 2;
    }

    public final float b(int i, int i4, int i9, int i10) {
        switch (this.f109a) {
            case 0:
                return Math.min(1.0f, f102b.b(i, i4, i9, i10));
            case 1:
                return Math.max(i9 / i, i10 / i4);
            case 2:
                if (f108h) {
                    return Math.min(i9 / i, i10 / i4);
                }
                if (Math.max(i4 / i10, i / i9) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
