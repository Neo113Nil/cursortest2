package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt__StringsJVMKt;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class DecimalPrecisionFilter implements InputFilter {
    public final Lazy pattern$delegate = LazyKt.lazy(new Choreographers$$ExternalSyntheticLambda1(this, 5));
    public final int precision;

    public DecimalPrecisionFilter(int i) {
        this.precision = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence.getClass();
        spanned.getClass();
        CharSequence subSequence = charSequence.subSequence(i, i2);
        CharSequence subSequence2 = spanned.subSequence(0, i3);
        CharSequence subSequence3 = spanned.subSequence(i4, spanned.length());
        StringBuilder sb = new StringBuilder();
        sb.append((Object) subSequence2);
        sb.append((Object) subSequence);
        sb.append((Object) subSequence3);
        String replace = StringsKt__StringsJVMKt.replace(sb.toString(), ',', '.', false);
        Object value = this.pattern$delegate.getValue();
        value.getClass();
        Matcher matcher = ((Pattern) value).matcher(replace);
        matcher.getClass();
        if (matcher.matches()) {
            return null;
        }
        return charSequence.length() == 0 ? spanned.subSequence(i3, i4) : "";
    }
}
