package i;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i4) {
        callback.onProvideKeyboardShortcuts(list, menu, i4);
    }
}
