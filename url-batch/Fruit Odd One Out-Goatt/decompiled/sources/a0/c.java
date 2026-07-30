package a0;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
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
