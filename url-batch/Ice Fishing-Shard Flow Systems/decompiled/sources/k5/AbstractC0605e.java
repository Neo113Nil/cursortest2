package k5;

import java.io.OutputStream;

/* renamed from: k5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0605e {
    public abstract int a();

    public final void b(OutputStream outputStream) {
        j jVar = new j(outputStream);
        try {
            c(jVar);
            jVar.close();
        } catch (Throwable th) {
            try {
                jVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void c(l lVar);
}
