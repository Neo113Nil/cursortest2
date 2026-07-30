package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.ProgressOutputStream;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.SessionEventsState;
import com.facebook.appevents.aam.MetadataViewObserver;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.ViewIndexer$schedule$indexingTask$1;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.LoginLogger;
import com.facebook.login.widget.LoginButton;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.ImageDownload;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ q1(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cf cfVar;
        int i = this.m;
        int i2 = 0;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                AccessTokenManager.refreshCurrentAccessToken$lambda$1((AccessTokenManager) obj2, (AccessToken.AccessTokenRefreshCallback) obj);
                return;
            case 1:
                t8.a((v8) obj2, (LongSparseArray) obj);
                return;
            case 2:
                cfVar = (cf) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                }
            case 3:
                AppEventQueue.add$lambda$3((AccessTokenAppIdPair) obj2, (AppEvent) obj);
                return;
            case 4:
                AppEventQueue.handleResponse$lambda$5((AccessTokenAppIdPair) obj2, (SessionEventsState) obj);
                return;
            case 5:
                AppEventsLoggerImpl.Companion.initializeLib$lambda$4((Context) obj2, (AppEventsLoggerImpl) obj);
                return;
            case 6:
                CodelessLoggingEventListener.logEvent$lambda$0((String) obj2, (Bundle) obj);
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                kr0 kr0Var = (kr0) obj2;
                kr0Var.getLifecycle().a(new nx(i2, (ru1) obj, kr0Var));
                return;
            case 8:
                FacebookSdk.publishInstallAsync$lambda$15((Context) obj2, (String) obj);
                return;
            case 9:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) obj2).onSuccess((FetchedAppSettings) obj);
                return;
            case 10:
                e63 e63Var = (e63) obj;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat((String) obj2), e63Var);
                throw e63Var;
            case 11:
                GraphRequest.Companion.runCallbacks$lambda$2((ArrayList) obj2, (GraphRequestBatch) obj);
                return;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((ImageDownload) obj2).lambda$start$0((kt2) obj);
                return;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                int i3 = JobInfoSchedulerService.m;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                LoginButton.checkToolTipSettings$lambda$3$lambda$2((LoginButton) obj2, (FetchedAppSettings) obj);
                return;
            case 15:
                LoginButton.checkToolTipSettings$lambda$3((String) obj2, (LoginButton) obj);
                return;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                LoginLogger.logHeartbeatEvent$lambda$0((LoginLogger) obj2, (Bundle) obj);
                return;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                MetadataViewObserver.process$lambda$0((View) obj2, (MetadataViewObserver) obj);
                return;
            case 18:
                ProgressOutputStream.reportBatchProgress$lambda$0((GraphRequestBatch.OnProgressCallback) obj2, (ProgressOutputStream) obj);
                return;
            case 19:
                ((sg) obj2).m((Typeface) obj);
                return;
            case 20:
                Task.Companion.delay$lambda$1((ScheduledFuture) obj2, (TaskCompletionSource) obj);
                return;
            case 21:
                cfVar = (cf) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                }
            case 22:
                ViewIndexer.schedule$lambda$0((ViewIndexer) obj2, (ViewIndexer$schedule$indexingTask$1) obj);
                return;
            default:
                ViewIndexer.sendToServer$lambda$1((String) obj2, (ViewIndexer) obj);
                return;
        }
    }
}
