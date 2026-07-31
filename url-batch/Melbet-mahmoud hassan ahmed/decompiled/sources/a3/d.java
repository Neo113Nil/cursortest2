package a3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import java.util.Locale;

@TargetApi(28)
/* loaded from: classes.dex */
public final class d extends b {
    static final /* synthetic */ WindowInsets u(Activity activity, View view, WindowInsets windowInsets) {
        if (y2.t.p().h().k() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                t1 h7 = y2.t.p().h();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                h7.O(str);
            } else {
                y2.t.p().h().O("");
            }
        }
        v(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void v(boolean z6, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i7 = attributes.layoutInDisplayCutoutMode;
        int i8 = true != z6 ? 2 : 1;
        if (i8 != i7) {
            attributes.layoutInDisplayCutoutMode = i8;
            window.setAttributes(attributes);
        }
    }

    @Override // a3.f
    public final void q(final Activity activity) {
        if (((Boolean) sw.c().b(m10.T0)).booleanValue() && y2.t.p().h().k() == null && !activity.isInMultiWindowMode()) {
            v(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: a3.c
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return d.u(activity, view, windowInsets);
                }
            });
        }
    }
}
