package com.squareup.cash.work.data.real;

import com.squareup.cash.localization.RealLocaleManager;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes7.dex */
public final class RealPersonNameFormatter {
    public static final Set FAMILY_NAME_FIRST_LANGUAGES = ArraysKt___ArraysKt.toSet(new String[]{"zh", "ja", "ko", "vi", "hu"});
    public final RealLocaleManager localeManager;

    public RealPersonNameFormatter(RealLocaleManager realLocaleManager) {
        this.localeManager = realLocaleManager;
    }
}
