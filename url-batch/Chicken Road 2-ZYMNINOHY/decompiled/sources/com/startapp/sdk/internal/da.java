package com.startapp.sdk.internal;

import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;

/* loaded from: classes.dex */
public final class da {
    public static final String a(InputMethodSubtype inputMethodSubtype) {
        String languageTag = inputMethodSubtype.getLanguageTag();
        return TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale() : languageTag;
    }
}
