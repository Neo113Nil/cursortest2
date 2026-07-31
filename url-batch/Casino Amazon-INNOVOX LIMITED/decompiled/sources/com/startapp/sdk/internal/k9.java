package com.startapp.sdk.internal;

import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k9 {
    public static final String a(InputMethodSubtype inputMethodSubtype) {
        String languageTag = inputMethodSubtype.getLanguageTag();
        return TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale() : languageTag;
    }
}
