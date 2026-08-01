package b3;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1066a = new i();

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.top;
        int i11 = rect.bottom;
        return i3 - (i10 + (i11 > i3 ? i11 - i3 : 0));
    }
}
