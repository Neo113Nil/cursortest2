package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gtz {
    private static final gtz a = new gtz(3, null, true);
    private static final gtz b = new gtz(2, null, true);
    private final Object c;
    private boolean d;
    private final int e;

    public gtz(int i, Object obj, boolean z) {
        this.e = i;
        this.c = obj;
        this.d = z;
    }

    public static gtz d(int i) {
        return i + (-1) != 1 ? a : b;
    }

    public final Object a() {
        if (this.d && this.e == 1) {
            return this.c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    public final boolean b() {
        this.d = true;
        return this.e == 1;
    }

    public final int c() {
        this.d = true;
        return this.e;
    }
}
