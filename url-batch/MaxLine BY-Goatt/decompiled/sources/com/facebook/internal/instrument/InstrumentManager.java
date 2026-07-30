package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;
import defpackage.dm0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InstrumentManager {
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    private InstrumentManager() {
    }

    public static final void start() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, new dm0(25));
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new dm0(26));
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, new dm0(27));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(boolean z) {
        if (z) {
            CrashHandler.Companion.enable();
            if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield)) {
                ExceptionAnalyzer.enable();
                CrashShieldHandler.enable();
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
                ThreadCheckHandler.enable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(boolean z) {
        if (z) {
            ErrorReportHandler.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$2(boolean z) {
        if (z) {
            ANRHandler.enable();
        }
    }
}
