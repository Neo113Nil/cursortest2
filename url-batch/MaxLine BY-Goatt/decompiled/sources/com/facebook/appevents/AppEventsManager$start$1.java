package com.facebook.appevents;

import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.gps.topics.GpsTopicsManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BannedParamManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.integrity.StdParamsEnforcementManager;
import com.facebook.appevents.integrity.VVPManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.lh;
import defpackage.w6;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsManager$start$1 implements FetchedAppSettingsManager.FetchedAppSettingsCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$0(boolean z) {
        if (z) {
            MetadataIndexer.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$1(boolean z) {
        if (z) {
            RestrictiveDataManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$10(boolean z) {
        if (z) {
            RedactedEventsManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$11(boolean z) {
        if (z) {
            SensitiveParamsManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$12(boolean z) {
        if (z) {
            AppEventsCAPIManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$13(boolean z) {
        if (z) {
            GpsAraTriggersManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$14(boolean z) {
        if (z) {
            PACustomAudienceClient.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$15(boolean z) {
        if (z) {
            GpsTopicsManager.enableTopicsObservation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$16(boolean z) {
        if (z) {
            VVPManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$2(boolean z) {
        if (z) {
            ModelManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$3(boolean z) {
        if (z) {
            EventDeactivationManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$4(boolean z) {
        if (z) {
            BannedParamManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$5(boolean z) {
        if (z) {
            InAppPurchaseManager.enableAutoLogging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$6(boolean z) {
        if (z) {
            StdParamsEnforcementManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$7(boolean z) {
        if (z) {
            ProtectedModeManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$8(boolean z) {
        if (z) {
            MACARuleMatchingManager.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$9(boolean z) {
        if (z) {
            BlocklistEventsManager.enable();
        }
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public void onSuccess(FetchedAppSettings fetchedAppSettings) {
        FeatureManager.checkFeature(FeatureManager.Feature.AAM, new w6(27));
        FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, new lh(12));
        FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, new lh(13));
        FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, new w6(28));
        FeatureManager.checkFeature(FeatureManager.Feature.BannedParamFiltering, new w6(29));
        FeatureManager.checkFeature(FeatureManager.Feature.IapLogging, new lh(0));
        FeatureManager.checkFeature(FeatureManager.Feature.StdParamEnforcement, new lh(1));
        FeatureManager.checkFeature(FeatureManager.Feature.ProtectedMode, new lh(2));
        FeatureManager.checkFeature(FeatureManager.Feature.MACARuleMatching, new lh(3));
        FeatureManager.checkFeature(FeatureManager.Feature.BlocklistEvents, new lh(4));
        FeatureManager.checkFeature(FeatureManager.Feature.FilterRedactedEvents, new lh(5));
        FeatureManager.checkFeature(FeatureManager.Feature.FilterSensitiveParams, new lh(6));
        FeatureManager.checkFeature(FeatureManager.Feature.CloudBridge, new lh(7));
        FeatureManager.checkFeature(FeatureManager.Feature.GPSARATriggers, new lh(8));
        FeatureManager.checkFeature(FeatureManager.Feature.GPSPACAProcessing, new lh(9));
        FeatureManager.checkFeature(FeatureManager.Feature.GPSTopicsObservation, new lh(10));
        FeatureManager.checkFeature(FeatureManager.Feature.VVP, new lh(11));
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public void onError() {
    }
}
