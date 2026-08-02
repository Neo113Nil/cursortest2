package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldn extends ldo {
    public static final ldn a = new ldn();

    private ldn() {
        super(ldr.c, ldr.d, ldr.e, ldr.a);
    }

    @Override // defpackage.ldo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.kvj
    public final kvj g(int i) {
        ixl.a(i);
        return i >= ldr.c ? this : super.g(i);
    }

    @Override // defpackage.kvj
    public final String toString() {
        return "Dispatchers.Default";
    }
}
