package androidx.core.os;

import android.os.Trace;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, f6.a aVar) {
        Trace.beginSection(str);
        try {
            return (T) aVar.invoke();
        } finally {
            r.finallyStart(1);
            Trace.endSection();
            r.finallyEnd(1);
        }
    }
}
