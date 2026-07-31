package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes9.dex */
public class TooltipCompat {
    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(view, charSequence);
        } else {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }
}
