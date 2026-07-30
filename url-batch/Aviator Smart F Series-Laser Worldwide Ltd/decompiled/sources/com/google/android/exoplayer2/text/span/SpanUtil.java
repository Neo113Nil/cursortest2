package com.google.android.exoplayer2.text.span;

import android.text.Spannable;

@Deprecated
/* loaded from: classes3.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i8, int i9, int i10) {
        for (Object obj2 : spannable.getSpans(i8, i9, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i8 && spannable.getSpanEnd(obj2) == i9 && spannable.getSpanFlags(obj2) == i10) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i8, i9, i10);
    }
}
