package com.squareup.cash.tax.presenters;

import android.content.SharedPreferences;
import com.squareup.preferences.BooleanPreference;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes7.dex */
public final class RealTaxDesktopTooltipPreference {
    public final BooleanPreference desktopTooltipPreference;
    public final CoroutineContext ioDispatcher;

    public RealTaxDesktopTooltipPreference(SharedPreferences sharedPreferences, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        this.desktopTooltipPreference = new BooleanPreference(sharedPreferences, "taxes-desktop-tooltip-seen", false);
    }
}
