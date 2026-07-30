package okhttp3.logging;

import j6.v;
import java.io.EOFException;
import kotlin.jvm.internal.s;
import okio.c;

/* loaded from: classes5.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(c cVar) {
        long coerceAtMost;
        s.checkNotNullParameter(cVar, "<this>");
        try {
            c cVar2 = new c();
            coerceAtMost = v.coerceAtMost(cVar.size(), 64L);
            cVar.copyTo(cVar2, 0L, coerceAtMost);
            int i8 = 0;
            while (i8 < 16) {
                i8++;
                if (cVar2.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = cVar2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
