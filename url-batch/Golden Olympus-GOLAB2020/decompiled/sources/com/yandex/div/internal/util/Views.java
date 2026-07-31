package com.yandex.div.internal.util;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public abstract class Views {
    private static final int[] HIT_TEST_ARRAY = new int[2];

    @NonNull
    public static <T extends View> T findViewAndCast(@NonNull View view, int i4) {
        T t4 = (T) view.findViewById(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException("View with id [" + view.getResources().getResourceName(i4) + "] doesn't exist");
    }
}
