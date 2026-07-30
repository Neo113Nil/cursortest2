package com.google.android.exoplayer2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* loaded from: classes3.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i8, int i9) {
        for (int i10 = 1; i10 <= 2; i10++) {
            int i11 = (i8 + i10) % 3;
            if (isRepeatModeEnabled(i11, i9)) {
                return i11;
            }
        }
        return i8;
    }

    public static boolean isRepeatModeEnabled(int i8, int i9) {
        if (i8 != 0) {
            return i8 != 1 ? i8 == 2 && (i9 & 2) != 0 : (i9 & 1) != 0;
        }
        return true;
    }
}
