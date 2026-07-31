package f2;

import W1.AbstractC1233c;
import java.io.Closeable;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2420c {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1233c.a(th, th2);
            }
        }
    }
}
