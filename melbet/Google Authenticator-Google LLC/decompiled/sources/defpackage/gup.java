package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gup implements gut {
    private final gty a;

    public gup(gty gtyVar) {
        this.a = gtyVar;
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
