package com.kyleduo.switchbutton;

import android.content.res.ColorStateList;

/* loaded from: classes4.dex */
public class a {
    private static final int CHECKED_ATTR = 16842912;
    private static final int ENABLE_ATTR = 16842910;
    private static final int PRESSED_ATTR = 16842919;

    static ColorStateList generateBackColorWithTintColor(int i8) {
        int i9 = i8 - (-805306368);
        return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842912, 16842919}, new int[]{-16842912, 16842919}, new int[]{16842912}, new int[]{-16842912}}, new int[]{i8 - (-520093696), 268435456, i9, 536870912, i9, 536870912});
    }

    static ColorStateList generateThumbColorWithTintColor(int i8) {
        int i9 = i8 - (-1728053248);
        return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842919, -16842912}, new int[]{16842919, 16842912}, new int[]{16842912}, new int[]{-16842912}}, new int[]{i8 - (-1442840576), -4539718, i9, i9, i8 | (-16777216), -1118482});
    }
}
