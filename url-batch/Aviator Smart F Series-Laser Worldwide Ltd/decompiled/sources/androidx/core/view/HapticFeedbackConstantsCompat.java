package androidx.core.view;

import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class HapticFeedbackConstantsCompat {
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;

    @VisibleForTesting
    static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;

    @VisibleForTesting
    static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface HapticFeedbackFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface HapticFeedbackType {
    }

    private HapticFeedbackConstantsCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (r6 != 17) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int getFeedbackConstantOrFallback(int i8) {
        int i9 = -1;
        if (i8 == -1) {
            return -1;
        }
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        if (i10 < 34) {
            switch (i8) {
                case 21:
                case 23:
                case 26:
                    i8 = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i8 = 4;
                    break;
                case 25:
                    i8 = 0;
                    break;
            }
        }
        if (i10 < 30) {
            if (i8 != 12) {
                if (i8 == 13) {
                    i11 = 6;
                } else if (i8 != 16) {
                }
                if (i10 < 27 || (i11 != 7 && i11 != 8 && i11 != 9)) {
                    i9 = i11;
                }
                if (i10 < 23 || i9 != 6) {
                    return i9;
                }
                return 4;
            }
            i11 = 1;
            if (i10 < 27) {
            }
            i9 = i11;
            if (i10 < 23) {
            }
            return i9;
        }
        i11 = i8;
        if (i10 < 27) {
        }
        i9 = i11;
        if (i10 < 23) {
        }
        return i9;
    }
}
