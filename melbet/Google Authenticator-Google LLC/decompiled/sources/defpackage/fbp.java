package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbp implements far {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    public final void b() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [fbs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.far
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final File a(fym fymVar) {
        if (this.a) {
            if (fymVar.b.isEmpty()) {
                return fymVar.c.b((Uri) fymVar.a);
            }
            throw new fbg("Short circuit would skip transforms.");
        }
        fbe fbeVar = new fbe(fbq.b(fymVar));
        try {
            Closeable closeable = fbeVar.a;
            if (!(closeable instanceof fay)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File c = ((fay) closeable).c();
            fbeVar.close();
            return c;
        } catch (Throwable th) {
            try {
                fbeVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
