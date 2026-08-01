package l;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: l.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0273z0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z2) {
        popupWindow.setIsClippedToScreen(z2);
    }
}
