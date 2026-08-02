package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggn {
    public static final ggn a = new ggn(new aji(10), 2, null, false);
    public static final ggn b = new ggn(new aji(11), 2, null, false);
    public static final ggn c = new ggn(new aji(13), 2, null, true);
    public final kri d;
    public final jll e;
    public final boolean f;
    public final int g;

    public ggn(kri kriVar, int i, jll jllVar, boolean z) {
        this.d = kriVar;
        this.g = i;
        this.e = jllVar;
        this.f = z;
    }

    public final long a() {
        Object a2 = this.d.a();
        a2.getClass();
        return ((Long) a2).longValue();
    }

    public final jll b() {
        Object a2 = this.d.a();
        a2.getClass();
        return (jll) a2;
    }

    public final boolean c() {
        Object a2 = this.d.a();
        a2.getClass();
        return ((Boolean) a2).booleanValue();
    }
}
