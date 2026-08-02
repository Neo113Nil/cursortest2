package A;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* renamed from: A.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0004e {
    public static /* synthetic */ ActivityManager.TaskDescription d(String str, int i2) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout j(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
