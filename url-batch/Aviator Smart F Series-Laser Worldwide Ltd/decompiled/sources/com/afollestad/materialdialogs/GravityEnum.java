package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import androidx.core.view.GravityCompat;

/* loaded from: classes.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;

    private static final boolean HAS_RTL = true;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$afollestad$materialdialogs$GravityEnum;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            $SwitchMap$com$afollestad$materialdialogs$GravityEnum = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$GravityEnum[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$afollestad$materialdialogs$GravityEnum[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i8 = a.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[ordinal()];
        if (i8 == 1) {
            if (HAS_RTL) {
                return GravityCompat.START;
            }
            return 3;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 != 3) {
            throw new IllegalStateException("Invalid gravity constant");
        }
        if (HAS_RTL) {
            return GravityCompat.END;
        }
        return 5;
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i8 = a.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[ordinal()];
        if (i8 != 2) {
            return i8 != 3 ? 5 : 6;
        }
        return 4;
    }
}
