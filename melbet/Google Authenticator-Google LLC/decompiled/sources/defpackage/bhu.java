package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bhu {
    public static final bhu b;
    public static final bhu c;
    public static final bhu d;
    public static final bhu e;
    public static final bhu f;
    public static final bbk g;
    static final boolean h;

    static {
        int i = bhn.a;
        int i2 = bho.a;
        b = new bhs();
        c = new bhp();
        d = new bhq();
        e = new bht();
        bhr bhrVar = new bhr();
        f = bhrVar;
        g = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bhrVar, bbk.a);
        h = true;
    }

    public abstract float a(int i, int i2, int i3, int i4);

    public abstract int b(int i, int i2, int i3, int i4);
}
