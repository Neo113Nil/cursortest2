package androidx.media3.common.util;

import android.os.Trace;

@UnstableApi
/* loaded from: classes5.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
