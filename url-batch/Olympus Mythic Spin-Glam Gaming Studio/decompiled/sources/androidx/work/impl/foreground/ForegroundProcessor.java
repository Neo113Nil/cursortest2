package androidx.work.impl.foreground;

import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

@RestrictTo
/* loaded from: classes8.dex */
public interface ForegroundProcessor {
    boolean isEnqueuedInForeground(String str);

    void startForeground(String str, ForegroundInfo foregroundInfo);

    void stopForeground(String str);
}
