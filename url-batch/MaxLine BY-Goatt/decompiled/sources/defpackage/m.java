package defpackage;

import android.os.Build;
import com.facebook.AccessTokenManager;
import com.facebook.appevents.AnalyticsUserIDStore;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.instrument.anrreport.ANRDetector;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int m;

    public /* synthetic */ m(int i) {
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                ANRDetector.anrDetectorRunnable$lambda$0();
                return;
            case 1:
                AccessTokenManager.setCurrentAccessToken$lambda$0();
                return;
            case 2:
                InAppPurchaseManager.startTracking();
                return;
            case 3:
                ActivityLifecycleTracker.onActivityCreated$lambda$1();
                return;
            case 4:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 5:
                AnalyticsUserIDStore.initStore$lambda$0();
                return;
            case 6:
                jn1 jn1Var = t7.V0;
                synchronized (jn1Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = jn1Var.a;
                        int i3 = jn1Var.b;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                t7 t7Var = (t7) objArr[i4];
                                boolean showLayoutBounds = t7Var.getShowLayoutBounds();
                                Class cls = t7.S0;
                                t7Var.setShowLayoutBounds(bd3.v());
                                if (showLayoutBounds != t7Var.getShowLayoutBounds()) {
                                    t7.l(t7Var.getRoot());
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                t7.l(((t7) objArr[i4]).getRoot());
                                i4++;
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                AppEventQueue.persistToDisk$lambda$1();
                return;
            case 8:
                AppEventQueue.flushRunnable$lambda$0();
                return;
            case 9:
                AppEventsLoggerImpl.Companion.initializeTimersIfNeeded$lambda$6();
                return;
            case 10:
                InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.onActivityStopped$lambda$1();
                return;
            case 11:
                InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.onActivityResumed$lambda$0();
                return;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                MetadataIndexer.enable$lambda$0();
                return;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ModelManager.enableMTML$lambda$1();
                return;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ModelManager.enableMTML$lambda$2();
                return;
            case 15:
                ModelManager.enable$lambda$0();
                return;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                NativeProtocol.updateAllAvailableProtocolVersionsAsync$lambda$2();
                return;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                SuggestedEventsManager.enable$lambda$0();
                return;
            default:
                UserDataStore.clear$lambda$2();
                return;
        }
    }
}
