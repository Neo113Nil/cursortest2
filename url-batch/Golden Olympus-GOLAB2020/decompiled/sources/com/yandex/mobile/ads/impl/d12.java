package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;

/* loaded from: classes3.dex */
public final class d12 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i4, int i5) {
        for (Object obj2 : spannableStringBuilder.getSpans(i4, i5, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i4 && spannableStringBuilder.getSpanEnd(obj2) == i5 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i4, i5, 33);
    }
}
