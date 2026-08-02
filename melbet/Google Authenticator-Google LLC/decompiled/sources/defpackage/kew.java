package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kew extends jwy {
    private final kex a;

    public kew(kex kexVar, kmr kmrVar) {
        kexVar.getClass();
        this.a = kexVar;
        kmrVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.jwy
    public final void a(int i, String str) {
        Level c = c(i);
        if (kex.a.isLoggable(c)) {
            kex.a(this.a.c, c, str);
        }
        d(i);
    }

    @Override // defpackage.jwy
    public final void b(int i, String str, Object... objArr) {
        Level c = c(i);
        d(i);
        a(i, kex.a.isLoggable(c) ? MessageFormat.format(str, objArr) : null);
    }
}
