package com.squareup.cash.userjourneys.tracker;

import android.os.Build;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.cdp.api.providers.ApplicationInfo;
import app.cash.cdp.api.providers.OperatingSystemInfo;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.userjourneys.data.JourneyContext;
import java.util.Locale;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class RealJourneyRequestContextProvider {
    public final RoomDatabase$closeBarrier$1 applicationInfoProvider;
    public final RoomDatabase$closeBarrier$1 deviceInfoProvider;
    public final RoomDatabase$closeBarrier$1 operatingSystemProvider;
    public final AppUpdateDetector$$ExternalSyntheticLambda0 sessionIdProvider;
    public final SessionManager sessionManager;

    public RealJourneyRequestContextProvider(RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1, AppUpdateDetector$$ExternalSyntheticLambda0 appUpdateDetector$$ExternalSyntheticLambda0, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$12, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$13, SessionManager sessionManager) {
        int i = UserJourneysAppModule$Companion$provideJourneyReporterContext$5.$r8$clinit;
        this.deviceInfoProvider = roomDatabase$closeBarrier$1;
        this.sessionIdProvider = appUpdateDetector$$ExternalSyntheticLambda0;
        this.operatingSystemProvider = roomDatabase$closeBarrier$12;
        this.applicationInfoProvider = roomDatabase$closeBarrier$13;
        this.sessionManager = sessionManager;
    }

    public final JourneyContext generateContext() {
        this.operatingSystemProvider.invoke();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.applicationInfoProvider.invoke();
        SessionManager sessionManager = this.sessionManager;
        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
        String str = (String) this.sessionIdProvider.invoke();
        String appTokenOrNull = PlatformKt.appTokenOrNull(sessionManager);
        OperatingSystemInfo.Name name = OperatingSystemInfo.Name.ANDROID;
        String str2 = Build.VERSION.RELEASE;
        this.deviceInfoProvider.invoke();
        String str3 = Build.MODEL;
        String str4 = applicationInfo.packageName;
        String str5 = applicationInfo.version;
        int i = UserJourneysAppModule$Companion$provideJourneyReporterContext$5.$r8$clinit;
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        return new JourneyContext(activeAccountTokenOrNull, str, appTokenOrNull, "ANDROID", str2, str3, str4, str5, languageTag);
    }
}
