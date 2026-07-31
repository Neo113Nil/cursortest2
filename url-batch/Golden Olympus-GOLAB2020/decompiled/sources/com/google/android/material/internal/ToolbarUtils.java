package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public abstract class ToolbarUtils {
    public static TextView getSubtitleTextView(Toolbar toolbar) {
        return getTextView(toolbar, toolbar.getSubtitle());
    }

    private static TextView getTextView(Toolbar toolbar, CharSequence charSequence) {
        for (int i4 = 0; i4 < toolbar.getChildCount(); i4++) {
            View childAt = toolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static TextView getTitleTextView(Toolbar toolbar) {
        return getTextView(toolbar, toolbar.getTitle());
    }
}
