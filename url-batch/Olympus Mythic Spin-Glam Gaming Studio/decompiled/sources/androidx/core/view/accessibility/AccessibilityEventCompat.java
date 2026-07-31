package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes15.dex */
public final class AccessibilityEventCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ContentChangeType {
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @RequiresApi
    static class Api34Impl {
        @DoNotInline
        static boolean isAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        @DoNotInline
        static void setAccessibilityDataSensitive(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }
    }
}
