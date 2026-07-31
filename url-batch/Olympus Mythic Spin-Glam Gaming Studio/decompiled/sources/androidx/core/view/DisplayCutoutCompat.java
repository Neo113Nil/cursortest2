package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import java.util.List;

/* loaded from: classes15.dex */
public final class DisplayCutoutCompat {
    private final DisplayCutout mDisplayCutout;

    private DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.mDisplayCutout = displayCutout;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetTop(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetBottom(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetLeft(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getSafeInsetRight(this.mDisplayCutout);
        }
        return 0;
    }

    public Insets getWaterfallInsets() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Insets.toCompatInsets(Api30Impl.getWaterfallInsets(this.mDisplayCutout));
        }
        return Insets.NONE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(this.mDisplayCutout, ((DisplayCutoutCompat) obj).mDisplayCutout);
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.mDisplayCutout;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static DisplayCutoutCompat wrap(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static DisplayCutout createDisplayCutout(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @DoNotInline
        static int getSafeInsetTop(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        @DoNotInline
        static int getSafeInsetBottom(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @DoNotInline
        static int getSafeInsetLeft(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @DoNotInline
        static int getSafeInsetRight(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @DoNotInline
        static List<Rect> getBoundingRects(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }
    }

    @RequiresApi
    static class Api30Impl {
        @DoNotInline
        static DisplayCutout createDisplayCutout(android.graphics.Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, android.graphics.Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @DoNotInline
        static android.graphics.Insets getWaterfallInsets(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static DisplayCutout createDisplayCutout(android.graphics.Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }
}
