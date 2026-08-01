package m;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class D0 {
    public static int a(PopupWindow popupWindow, View view, int i, boolean z2) {
        return popupWindow.getMaxAvailableHeight(view, i, z2);
    }
}
