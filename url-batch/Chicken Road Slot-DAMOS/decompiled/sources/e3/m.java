package e3;

import android.app.Notification;
import android.graphics.Path;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class m {
    public static Path a(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static void b(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
