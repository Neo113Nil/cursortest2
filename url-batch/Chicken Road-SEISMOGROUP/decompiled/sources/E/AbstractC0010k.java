package E;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* renamed from: E.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0010k {
    public static /* synthetic */ ActivityManager.TaskDescription b(String str, int i2) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout h(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
