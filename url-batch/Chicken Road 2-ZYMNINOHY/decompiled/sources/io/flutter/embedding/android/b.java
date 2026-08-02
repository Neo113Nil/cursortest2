package io.flutter.embedding.android;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ AutofillManager c(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue e(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return AutofillManager.class;
    }

    public static /* synthetic */ Locale.LanguageRange k(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void m() {
    }
}
