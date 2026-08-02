package com.squareup.cash.timestampformatter.impl;

import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import java.util.Locale;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes.dex */
public final class RealTimestampFormatter$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public RealTimestampFormatter$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final AssetPublicSuffixList create$1(Locale locale, TimestampFormatter$DisplayContext timestampFormatter$DisplayContext) {
        locale.getClass();
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        AndroidClock androidClock = (AndroidClock) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        androidStringManager.getClass();
        androidClock.getClass();
        androidDateFormatManager.getClass();
        return new AssetPublicSuffixList(androidStringManager, androidClock, androidDateFormatManager, locale, timestampFormatter$DisplayContext);
    }
}
