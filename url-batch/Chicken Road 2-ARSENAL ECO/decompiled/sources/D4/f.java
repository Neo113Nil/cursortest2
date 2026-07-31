package D4;

import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class f {
    public abstract int a();

    public final void b(OutputStream outputStream) {
        l lVar = new l(outputStream);
        try {
            c(lVar);
            lVar.close();
        } catch (Throwable th) {
            try {
                lVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void c(n nVar);
}
