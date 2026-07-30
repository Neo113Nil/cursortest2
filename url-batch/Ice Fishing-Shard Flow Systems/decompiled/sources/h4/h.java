package h4;

import android.app.ActivityManager;
import android.webkit.TracingConfig;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ ActivityManager.TaskDescription a(int i2, String str) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* synthetic */ TracingConfig.Builder h() {
        return new TracingConfig.Builder();
    }
}
