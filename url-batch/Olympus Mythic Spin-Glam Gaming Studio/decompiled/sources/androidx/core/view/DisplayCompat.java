package androidx.core.view;

import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class DisplayCompat {

    @RequiresApi
    static class Api23Impl {
    }

    public static final class ModeCompat {

        @RequiresApi
        static class Api23Impl {
            @DoNotInline
            static int getPhysicalWidth(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }

            @DoNotInline
            static int getPhysicalHeight(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }
        }
    }
}
