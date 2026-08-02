package papa;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AppStart$AppStartData {
    public final List appTasks;
    public final AppUpdateData appUpdateData;
    public final Long applicationInstantiatedElapsedUptimeMillis;
    public final Long classLoaderInstantiatedElapsedUptimeMillis;
    public final Map customFirstEvents;
    public final ActivityTouchEvent firstActivityOnCreate;
    public final AndroidComponentEvent firstActivityOnResume;
    public final AndroidComponentEvent firstActivityOnStart;
    public final long firstAppClassLoadElapsedUptimeMillis;
    public final AndroidComponentEvent firstComponentInstantiated;
    public final AndroidComponentEvent firstDraw;
    public final AndroidComponentEvent firstGlobalLayout;
    public final AndroidComponentEvent firstIdleAfterFirstDraw;
    public final Long firstIdleElapsedUptimeMillis;
    public final AndroidComponentEvent firstPostAfterFirstDraw;
    public final Long firstPostAtFrontElapsedUptimeMillis;
    public final Long firstPostElapsedUptimeMillis;
    public final AndroidComponentEvent firstPreDraw;
    public final ActivityTouchEvent firstTouchEvent;
    public final Long handleBindApplicationElapsedUptimeMillis;
    public final int importance;
    public final int importanceAfterFirstPost;
    public final int importanceReasonCode;
    public final int importanceReasonPid;
    public final Long lastAppAliveElapsedTimeMillis;
    public final AppVisibilityState lastAppVisibilityState;
    public final Long lastVisibilityChangeElapsedTimeMillis;
    public final long perfsInitElapsedUptimeMillis;
    public final long processStartRealtimeMillis;
    public final long processStartUptimeMillis;
    public final String startImportanceReasonComponent;

    public AppStart$AppStartData(long j, long j2, Long l, long j3, long j4, int i, int i2, int i3, int i4, String str, AppVisibilityState appVisibilityState, Long l2, Long l3, List list, Long l4, Long l5, Long l6, AppUpdateData appUpdateData, Long l7, Long l8, AndroidComponentEvent androidComponentEvent, ActivityTouchEvent activityTouchEvent, AndroidComponentEvent androidComponentEvent2, AndroidComponentEvent androidComponentEvent3, AndroidComponentEvent androidComponentEvent4, AndroidComponentEvent androidComponentEvent5, AndroidComponentEvent androidComponentEvent6, AndroidComponentEvent androidComponentEvent7, AndroidComponentEvent androidComponentEvent8, ActivityTouchEvent activityTouchEvent2, Map map) {
        appUpdateData.getClass();
        map.getClass();
        this.processStartRealtimeMillis = j;
        this.processStartUptimeMillis = j2;
        this.handleBindApplicationElapsedUptimeMillis = l;
        this.firstAppClassLoadElapsedUptimeMillis = j3;
        this.perfsInitElapsedUptimeMillis = j4;
        this.importance = i;
        this.importanceAfterFirstPost = i2;
        this.importanceReasonCode = i3;
        this.importanceReasonPid = i4;
        this.startImportanceReasonComponent = str;
        this.lastAppVisibilityState = appVisibilityState;
        this.lastVisibilityChangeElapsedTimeMillis = l2;
        this.lastAppAliveElapsedTimeMillis = l3;
        this.appTasks = list;
        this.classLoaderInstantiatedElapsedUptimeMillis = l4;
        this.applicationInstantiatedElapsedUptimeMillis = l5;
        this.firstIdleElapsedUptimeMillis = l6;
        this.appUpdateData = appUpdateData;
        this.firstPostElapsedUptimeMillis = l7;
        this.firstPostAtFrontElapsedUptimeMillis = l8;
        this.firstComponentInstantiated = androidComponentEvent;
        this.firstActivityOnCreate = activityTouchEvent;
        this.firstActivityOnStart = androidComponentEvent2;
        this.firstActivityOnResume = androidComponentEvent3;
        this.firstGlobalLayout = androidComponentEvent4;
        this.firstPreDraw = androidComponentEvent5;
        this.firstDraw = androidComponentEvent6;
        this.firstIdleAfterFirstDraw = androidComponentEvent7;
        this.firstPostAfterFirstDraw = androidComponentEvent8;
        this.firstTouchEvent = activityTouchEvent2;
        this.customFirstEvents = map;
    }

    public static AppStart$AppStartData copy$default(AppStart$AppStartData appStart$AppStartData, Long l, AppUpdateData appUpdateData, Long l2, Long l3, AndroidComponentEvent androidComponentEvent, ActivityTouchEvent activityTouchEvent, AndroidComponentEvent androidComponentEvent2, AndroidComponentEvent androidComponentEvent3, AndroidComponentEvent androidComponentEvent4, AndroidComponentEvent androidComponentEvent5, AndroidComponentEvent androidComponentEvent6, AndroidComponentEvent androidComponentEvent7, AndroidComponentEvent androidComponentEvent8, ActivityTouchEvent activityTouchEvent2, int i) {
        Long l4;
        Long l5;
        long j = appStart$AppStartData.processStartRealtimeMillis;
        long j2 = appStart$AppStartData.processStartUptimeMillis;
        Long l6 = appStart$AppStartData.handleBindApplicationElapsedUptimeMillis;
        long j3 = appStart$AppStartData.firstAppClassLoadElapsedUptimeMillis;
        long j4 = appStart$AppStartData.perfsInitElapsedUptimeMillis;
        int i2 = appStart$AppStartData.importance;
        int i3 = appStart$AppStartData.importanceAfterFirstPost;
        int i4 = appStart$AppStartData.importanceReasonCode;
        int i5 = appStart$AppStartData.importanceReasonPid;
        String str = appStart$AppStartData.startImportanceReasonComponent;
        AppVisibilityState appVisibilityState = appStart$AppStartData.lastAppVisibilityState;
        Long l7 = appStart$AppStartData.lastVisibilityChangeElapsedTimeMillis;
        Long l8 = appStart$AppStartData.lastAppAliveElapsedTimeMillis;
        List list = appStart$AppStartData.appTasks;
        Long l9 = appStart$AppStartData.classLoaderInstantiatedElapsedUptimeMillis;
        Long l10 = appStart$AppStartData.applicationInstantiatedElapsedUptimeMillis;
        if ((i & 65536) != 0) {
            l4 = l10;
            l5 = appStart$AppStartData.firstIdleElapsedUptimeMillis;
        } else {
            l4 = l10;
            l5 = l;
        }
        Long l11 = l5;
        AppUpdateData appUpdateData2 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? appStart$AppStartData.appUpdateData : appUpdateData;
        Long l12 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? appStart$AppStartData.firstPostElapsedUptimeMillis : l2;
        Long l13 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? appStart$AppStartData.firstPostAtFrontElapsedUptimeMillis : l3;
        AndroidComponentEvent androidComponentEvent9 = (i & PKIFailureInfo.badCertTemplate) != 0 ? appStart$AppStartData.firstComponentInstantiated : androidComponentEvent;
        ActivityTouchEvent activityTouchEvent3 = (i & PKIFailureInfo.badSenderNonce) != 0 ? appStart$AppStartData.firstActivityOnCreate : activityTouchEvent;
        AndroidComponentEvent androidComponentEvent10 = (i & 4194304) != 0 ? appStart$AppStartData.firstActivityOnStart : androidComponentEvent2;
        AndroidComponentEvent androidComponentEvent11 = (i & 8388608) != 0 ? appStart$AppStartData.firstActivityOnResume : androidComponentEvent3;
        AndroidComponentEvent androidComponentEvent12 = (i & 16777216) != 0 ? appStart$AppStartData.firstGlobalLayout : androidComponentEvent4;
        AndroidComponentEvent androidComponentEvent13 = (i & 33554432) != 0 ? appStart$AppStartData.firstPreDraw : androidComponentEvent5;
        AndroidComponentEvent androidComponentEvent14 = (i & 67108864) != 0 ? appStart$AppStartData.firstDraw : androidComponentEvent6;
        AndroidComponentEvent androidComponentEvent15 = (i & 134217728) != 0 ? appStart$AppStartData.firstIdleAfterFirstDraw : androidComponentEvent7;
        AndroidComponentEvent androidComponentEvent16 = (i & 268435456) != 0 ? appStart$AppStartData.firstPostAfterFirstDraw : androidComponentEvent8;
        ActivityTouchEvent activityTouchEvent4 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? appStart$AppStartData.firstTouchEvent : activityTouchEvent2;
        appStart$AppStartData.getClass();
        Map map = appStart$AppStartData.customFirstEvents;
        appStart$AppStartData.getClass();
        appUpdateData2.getClass();
        map.getClass();
        return new AppStart$AppStartData(j, j2, l6, j3, j4, i2, i3, i4, i5, str, appVisibilityState, l7, l8, list, l9, l4, l11, appUpdateData2, l12, l13, androidComponentEvent9, activityTouchEvent3, androidComponentEvent10, androidComponentEvent11, androidComponentEvent12, androidComponentEvent13, androidComponentEvent14, androidComponentEvent15, androidComponentEvent16, activityTouchEvent4, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStart$AppStartData)) {
            return false;
        }
        AppStart$AppStartData appStart$AppStartData = (AppStart$AppStartData) obj;
        return this.processStartRealtimeMillis == appStart$AppStartData.processStartRealtimeMillis && this.processStartUptimeMillis == appStart$AppStartData.processStartUptimeMillis && this.handleBindApplicationElapsedUptimeMillis.equals(appStart$AppStartData.handleBindApplicationElapsedUptimeMillis) && this.firstAppClassLoadElapsedUptimeMillis == appStart$AppStartData.firstAppClassLoadElapsedUptimeMillis && this.perfsInitElapsedUptimeMillis == appStart$AppStartData.perfsInitElapsedUptimeMillis && this.importance == appStart$AppStartData.importance && this.importanceAfterFirstPost == appStart$AppStartData.importanceAfterFirstPost && this.importanceReasonCode == appStart$AppStartData.importanceReasonCode && this.importanceReasonPid == appStart$AppStartData.importanceReasonPid && Intrinsics.areEqual(this.startImportanceReasonComponent, appStart$AppStartData.startImportanceReasonComponent) && this.lastAppVisibilityState == appStart$AppStartData.lastAppVisibilityState && Intrinsics.areEqual(this.lastVisibilityChangeElapsedTimeMillis, appStart$AppStartData.lastVisibilityChangeElapsedTimeMillis) && this.lastAppAliveElapsedTimeMillis.equals(appStart$AppStartData.lastAppAliveElapsedTimeMillis) && this.appTasks.equals(appStart$AppStartData.appTasks) && Intrinsics.areEqual(this.classLoaderInstantiatedElapsedUptimeMillis, appStart$AppStartData.classLoaderInstantiatedElapsedUptimeMillis) && Intrinsics.areEqual(this.applicationInstantiatedElapsedUptimeMillis, appStart$AppStartData.applicationInstantiatedElapsedUptimeMillis) && Intrinsics.areEqual(this.firstIdleElapsedUptimeMillis, appStart$AppStartData.firstIdleElapsedUptimeMillis) && Intrinsics.areEqual(this.appUpdateData, appStart$AppStartData.appUpdateData) && Intrinsics.areEqual(this.firstPostElapsedUptimeMillis, appStart$AppStartData.firstPostElapsedUptimeMillis) && Intrinsics.areEqual(this.firstPostAtFrontElapsedUptimeMillis, appStart$AppStartData.firstPostAtFrontElapsedUptimeMillis) && Intrinsics.areEqual(this.firstComponentInstantiated, appStart$AppStartData.firstComponentInstantiated) && Intrinsics.areEqual(this.firstActivityOnCreate, appStart$AppStartData.firstActivityOnCreate) && Intrinsics.areEqual(this.firstActivityOnStart, appStart$AppStartData.firstActivityOnStart) && Intrinsics.areEqual(this.firstActivityOnResume, appStart$AppStartData.firstActivityOnResume) && Intrinsics.areEqual(this.firstGlobalLayout, appStart$AppStartData.firstGlobalLayout) && Intrinsics.areEqual(this.firstPreDraw, appStart$AppStartData.firstPreDraw) && Intrinsics.areEqual(this.firstDraw, appStart$AppStartData.firstDraw) && Intrinsics.areEqual(this.firstIdleAfterFirstDraw, appStart$AppStartData.firstIdleAfterFirstDraw) && Intrinsics.areEqual(this.firstPostAfterFirstDraw, appStart$AppStartData.firstPostAfterFirstDraw) && Intrinsics.areEqual(this.firstTouchEvent, appStart$AppStartData.firstTouchEvent) && Intrinsics.areEqual(this.customFirstEvents, appStart$AppStartData.customFirstEvents);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.importanceReasonPid, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.importanceReasonCode, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.importanceAfterFirstPost, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.importance, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.handleBindApplicationElapsedUptimeMillis, Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.processStartRealtimeMillis) * 31, 31, this.processStartUptimeMillis), 31), 31, this.firstAppClassLoadElapsedUptimeMillis), 31, this.perfsInitElapsedUptimeMillis), 31), 31), 31), 31);
        String str = this.startImportanceReasonComponent;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        AppVisibilityState appVisibilityState = this.lastAppVisibilityState;
        int hashCode2 = (hashCode + (appVisibilityState == null ? 0 : appVisibilityState.hashCode())) * 31;
        Long l = this.lastVisibilityChangeElapsedTimeMillis;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.lastAppAliveElapsedTimeMillis, (hashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31), 31, this.appTasks);
        Long l2 = this.classLoaderInstantiatedElapsedUptimeMillis;
        int hashCode3 = (m2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.applicationInstantiatedElapsedUptimeMillis;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.firstIdleElapsedUptimeMillis;
        int hashCode5 = (this.appUpdateData.hashCode() + ((hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31)) * 31;
        Long l5 = this.firstPostElapsedUptimeMillis;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.firstPostAtFrontElapsedUptimeMillis;
        int hashCode7 = (hashCode6 + (l6 == null ? 0 : l6.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent = this.firstComponentInstantiated;
        int hashCode8 = (hashCode7 + (androidComponentEvent == null ? 0 : androidComponentEvent.hashCode())) * 31;
        ActivityTouchEvent activityTouchEvent = this.firstActivityOnCreate;
        int hashCode9 = (hashCode8 + (activityTouchEvent == null ? 0 : activityTouchEvent.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent2 = this.firstActivityOnStart;
        int hashCode10 = (hashCode9 + (androidComponentEvent2 == null ? 0 : androidComponentEvent2.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent3 = this.firstActivityOnResume;
        int hashCode11 = (hashCode10 + (androidComponentEvent3 == null ? 0 : androidComponentEvent3.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent4 = this.firstGlobalLayout;
        int hashCode12 = (hashCode11 + (androidComponentEvent4 == null ? 0 : androidComponentEvent4.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent5 = this.firstPreDraw;
        int hashCode13 = (hashCode12 + (androidComponentEvent5 == null ? 0 : androidComponentEvent5.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent6 = this.firstDraw;
        int hashCode14 = (hashCode13 + (androidComponentEvent6 == null ? 0 : androidComponentEvent6.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent7 = this.firstIdleAfterFirstDraw;
        int hashCode15 = (hashCode14 + (androidComponentEvent7 == null ? 0 : androidComponentEvent7.hashCode())) * 31;
        AndroidComponentEvent androidComponentEvent8 = this.firstPostAfterFirstDraw;
        int hashCode16 = (hashCode15 + (androidComponentEvent8 == null ? 0 : androidComponentEvent8.hashCode())) * 31;
        ActivityTouchEvent activityTouchEvent2 = this.firstTouchEvent;
        return this.customFirstEvents.hashCode() + ((hashCode16 + (activityTouchEvent2 != null ? activityTouchEvent2.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "AppStartData(processStartRealtimeMillis=" + this.processStartRealtimeMillis + ", processStartUptimeMillis=" + this.processStartUptimeMillis + ", handleBindApplicationElapsedUptimeMillis=" + this.handleBindApplicationElapsedUptimeMillis + ", firstAppClassLoadElapsedUptimeMillis=" + this.firstAppClassLoadElapsedUptimeMillis + ", perfsInitElapsedUptimeMillis=" + this.perfsInitElapsedUptimeMillis + ", importance=" + this.importance + ", importanceAfterFirstPost=" + this.importanceAfterFirstPost + ", importanceReasonCode=" + this.importanceReasonCode + ", importanceReasonPid=" + this.importanceReasonPid + ", startImportanceReasonComponent=" + this.startImportanceReasonComponent + ", lastAppVisibilityState=" + this.lastAppVisibilityState + ", lastVisibilityChangeElapsedTimeMillis=" + this.lastVisibilityChangeElapsedTimeMillis + ", lastAppAliveElapsedTimeMillis=" + this.lastAppAliveElapsedTimeMillis + ", appTasks=" + this.appTasks + ", classLoaderInstantiatedElapsedUptimeMillis=" + this.classLoaderInstantiatedElapsedUptimeMillis + ", applicationInstantiatedElapsedUptimeMillis=" + this.applicationInstantiatedElapsedUptimeMillis + ", firstIdleElapsedUptimeMillis=" + this.firstIdleElapsedUptimeMillis + ", appUpdateData=" + this.appUpdateData + ", firstPostElapsedUptimeMillis=" + this.firstPostElapsedUptimeMillis + ", firstPostAtFrontElapsedUptimeMillis=" + this.firstPostAtFrontElapsedUptimeMillis + ", firstComponentInstantiated=" + this.firstComponentInstantiated + ", firstActivityOnCreate=" + this.firstActivityOnCreate + ", firstActivityOnStart=" + this.firstActivityOnStart + ", firstActivityOnResume=" + this.firstActivityOnResume + ", firstGlobalLayout=" + this.firstGlobalLayout + ", firstPreDraw=" + this.firstPreDraw + ", firstDraw=" + this.firstDraw + ", firstIdleAfterFirstDraw=" + this.firstIdleAfterFirstDraw + ", firstPostAfterFirstDraw=" + this.firstPostAfterFirstDraw + ", firstTouchEvent=" + this.firstTouchEvent + ", firstFrameAfterFullyDrawnElapsedUptimeMillis=null, customFirstEvents=" + this.customFirstEvents + ')';
    }
}
