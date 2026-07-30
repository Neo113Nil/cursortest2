package s7;

import java.io.Closeable;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class u implements Closeable {
    public abstract long b();

    public abstract n c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t7.b.c(k());
    }

    public abstract f8.h k();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String n() {
        Charset charset;
        String str;
        f8.h k8 = k();
        try {
            n c4 = c();
            if (c4 != null) {
                charset = z6.a.f10114a;
                String[] strArr = c4.f8620b;
                int i7 = 0;
                int x8 = a.a.x(0, strArr.length - 1, 2);
                if (x8 >= 0) {
                    while (!z6.o.p(true, strArr[i7], "charset")) {
                        if (i7 != x8) {
                            i7 += 2;
                        }
                    }
                    str = strArr[i7 + 1];
                    if (str != null) {
                        try {
                            charset = Charset.forName(str);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
            }
            charset = z6.a.f10114a;
            String S = k8.S(t7.b.q(k8, charset));
            k8.close();
            return S;
        } finally {
        }
    }
}
