package com.withpersona.sdk2.inquiry.tracking;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcScanEventData;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J$\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J&\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J&\u0010\u000e\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J-\u0010\u000f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\f\u001a\u00020\bH&¢\u0006\u0002\u0010\u0012J5\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\f\u001a\u00020\bH&¢\u0006\u0002\u0010\u0016JY\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\f\u001a\u00020\bH&¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J<\u0010\u001f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010(\u001a\u00020\u00032\u0006\u0010&\u001a\u00020)2\b\b\u0002\u0010\f\u001a\u00020\bH'J\u001a\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020+2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010,\u001a\u00020\u00032\u0006\u0010&\u001a\u00020-2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010.\u001a\u00020\u00032\u0006\u0010&\u001a\u00020/2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\f\u001a\u00020\bH&J.\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u00109\u001a\u00020\u00032\u0006\u0010&\u001a\u00020:2\b\b\u0002\u0010\f\u001a\u00020\bH&J2\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010?\u001a\u00020\u00032\u0006\u0010&\u001a\u00020@2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010A\u001a\u00020\u00032\u0006\u0010&\u001a\u00020B2\b\b\u0002\u0010\f\u001a\u00020\bH&J\u001a\u0010C\u001a\u00020\u00032\u0006\u0010&\u001a\u00020D2\b\b\u0002\u0010\f\u001a\u00020\bH&J\"\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\bH&¨\u0006H"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "", "setSessionToken", "", "sessionToken", "", "setIsEnabled", "enabled", "", "logInquiryPageViewEvent", "stepName", "pageName", "force", "logForegroundEvent", "logBackgroundEvent", "logWebRtcIceCompleteEvent", "numCandidates", "", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "logVideoStartEvent", "videoCaptureMethod", "attempt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "logVideoStopEvent", "assetId", "elapsedTime", "chunksLength", "blobSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V", "logVideoStopRequestEvent", "logVideoErrorEvent", "errorName", "errorReason", "logPermissionEvent", "permissionData", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "logSelfieCaptureButtonClickedEvent", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "logSelfiePoseCaptureEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "logSelfieCaptureStateEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "logGovernmentIdButtonClickEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "logGovernmentIdStateEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "logInquiryStartEvent", "config", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "logInquiryEndEvent", "reason", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "durationMs", "", "errorDescription", "logIntegrationEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "logUiStepButtonEvent", "type", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "buttonName", "logCameraInfoEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "logNfcScanEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "logNfcErrorEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "logDebugLogEvent", "category", "message", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface TrackingEventsLogger {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void logBackgroundEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logBackgroundEvent");
                return;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            trackingEventsLogger.logBackgroundEvent(str, str2, z);
        }

        public static /* synthetic */ void logCameraInfoEvent$default(TrackingEventsLogger trackingEventsLogger, CameraInfoEventData cameraInfoEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logCameraInfoEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logCameraInfoEvent(cameraInfoEventData, z);
        }

        public static /* synthetic */ void logDebugLogEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logDebugLogEvent");
                return;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            trackingEventsLogger.logDebugLogEvent(str, str2, z);
        }

        public static /* synthetic */ void logForegroundEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logForegroundEvent");
                return;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            trackingEventsLogger.logForegroundEvent(str, str2, z);
        }

        public static /* synthetic */ void logGovernmentIdButtonClickEvent$default(TrackingEventsLogger trackingEventsLogger, GovernmentIdButtonEventData governmentIdButtonEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logGovernmentIdButtonClickEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logGovernmentIdButtonClickEvent(governmentIdButtonEventData, z);
        }

        public static /* synthetic */ void logGovernmentIdStateEvent$default(TrackingEventsLogger trackingEventsLogger, GovernmentIdStateEventData governmentIdStateEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logGovernmentIdStateEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logGovernmentIdStateEvent(governmentIdStateEventData, z);
        }

        public static /* synthetic */ void logInquiryEndEvent$default(TrackingEventsLogger trackingEventsLogger, InquiryEndReason inquiryEndReason, long j, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logInquiryEndEvent");
                return;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z = false;
            }
            trackingEventsLogger.logInquiryEndEvent(inquiryEndReason, j, str2, z);
        }

        public static /* synthetic */ void logInquiryPageViewEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logInquiryPageViewEvent");
                return;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            trackingEventsLogger.logInquiryPageViewEvent(str, str2, z);
        }

        public static /* synthetic */ void logInquiryStartEvent$default(TrackingEventsLogger trackingEventsLogger, InquiryConfigData inquiryConfigData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logInquiryStartEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logInquiryStartEvent(inquiryConfigData, z);
        }

        public static /* synthetic */ void logIntegrationEvent$default(TrackingEventsLogger trackingEventsLogger, IntegrationEventData integrationEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logIntegrationEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logIntegrationEvent(integrationEventData, z);
        }

        public static /* synthetic */ void logNfcErrorEvent$default(TrackingEventsLogger trackingEventsLogger, NfcErrorEventData nfcErrorEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logNfcErrorEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logNfcErrorEvent(nfcErrorEventData, z);
        }

        public static /* synthetic */ void logNfcScanEvent$default(TrackingEventsLogger trackingEventsLogger, NfcScanEventData nfcScanEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logNfcScanEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logNfcScanEvent(nfcScanEventData, z);
        }

        public static /* synthetic */ void logPermissionEvent$default(TrackingEventsLogger trackingEventsLogger, PermissionTrackingEventData permissionTrackingEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logPermissionEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logPermissionEvent(permissionTrackingEventData, z);
        }

        public static /* synthetic */ void logSelfieCaptureButtonClickedEvent$default(TrackingEventsLogger trackingEventsLogger, SelfieCaptureButtonEventData selfieCaptureButtonEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logSelfieCaptureButtonClickedEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logSelfieCaptureButtonClickedEvent(selfieCaptureButtonEventData, z);
        }

        public static /* synthetic */ void logSelfieCaptureStateEvent$default(TrackingEventsLogger trackingEventsLogger, SelfieCaptureStateEventData selfieCaptureStateEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logSelfieCaptureStateEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logSelfieCaptureStateEvent(selfieCaptureStateEventData, z);
        }

        public static /* synthetic */ void logSelfiePoseCaptureEvent$default(TrackingEventsLogger trackingEventsLogger, SelfiePoseEventData selfiePoseEventData, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logSelfiePoseCaptureEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logSelfiePoseCaptureEvent(selfiePoseEventData, z);
        }

        public static /* synthetic */ void logUiStepButtonEvent$default(TrackingEventsLogger trackingEventsLogger, UiStepButtonType uiStepButtonType, String str, String str2, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logUiStepButtonEvent");
                return;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            trackingEventsLogger.logUiStepButtonEvent(uiStepButtonType, str, str2, z);
        }

        public static /* synthetic */ void logVideoErrorEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logVideoErrorEvent");
                return;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                z = false;
            }
            trackingEventsLogger.logVideoErrorEvent(str, str2, str3, str4, z);
        }

        public static /* synthetic */ void logVideoStartEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, Integer num, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logVideoStartEvent");
                return;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            trackingEventsLogger.logVideoStartEvent(str, str2, num, z);
        }

        public static /* synthetic */ void logVideoStopEvent$default(TrackingEventsLogger trackingEventsLogger, String str, String str2, String str3, Integer num, Integer num2, Double d, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logVideoStopEvent");
                return;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                num2 = null;
            }
            if ((i & 32) != 0) {
                d = null;
            }
            if ((i & 64) != 0) {
                z = false;
            }
            trackingEventsLogger.logVideoStopEvent(str, str2, str3, num, num2, d, z);
        }

        public static /* synthetic */ void logVideoStopRequestEvent$default(TrackingEventsLogger trackingEventsLogger, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logVideoStopRequestEvent");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            trackingEventsLogger.logVideoStopRequestEvent(str, z);
        }

        public static /* synthetic */ void logWebRtcIceCompleteEvent$default(TrackingEventsLogger trackingEventsLogger, String str, Integer num, boolean z, int i, Object obj) {
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logWebRtcIceCompleteEvent");
                return;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            trackingEventsLogger.logWebRtcIceCompleteEvent(str, num, z);
        }
    }

    void logBackgroundEvent(String stepName, String pageName, boolean force);

    void logCameraInfoEvent(CameraInfoEventData data, boolean force);

    void logDebugLogEvent(String category, String message, boolean force);

    void logForegroundEvent(String stepName, String pageName, boolean force);

    void logGovernmentIdButtonClickEvent(GovernmentIdButtonEventData data, boolean force);

    void logGovernmentIdStateEvent(GovernmentIdStateEventData data, boolean force);

    void logInquiryEndEvent(InquiryEndReason reason, long durationMs, String errorDescription, boolean force);

    void logInquiryPageViewEvent(String stepName, String pageName, boolean force);

    void logInquiryStartEvent(InquiryConfigData config, boolean force);

    void logIntegrationEvent(IntegrationEventData data, boolean force);

    void logNfcErrorEvent(NfcErrorEventData data, boolean force);

    void logNfcScanEvent(NfcScanEventData data, boolean force);

    void logPermissionEvent(PermissionTrackingEventData permissionData, boolean force);

    void logSelfieCaptureButtonClickedEvent(SelfieCaptureButtonEventData data, boolean force);

    void logSelfieCaptureStateEvent(SelfieCaptureStateEventData data, boolean force);

    @Deprecated
    void logSelfiePoseCaptureEvent(SelfiePoseEventData data, boolean force);

    void logUiStepButtonEvent(UiStepButtonType type2, String buttonName, String stepName, boolean force);

    void logVideoErrorEvent(String stepName, String videoCaptureMethod, String errorName, String errorReason, boolean force);

    void logVideoStartEvent(String stepName, String videoCaptureMethod, Integer attempt, boolean force);

    void logVideoStopEvent(String stepName, String videoCaptureMethod, String assetId, Integer elapsedTime, Integer chunksLength, Double blobSize, boolean force);

    void logVideoStopRequestEvent(String stepName, boolean force);

    void logWebRtcIceCompleteEvent(String stepName, Integer numCandidates, boolean force);

    void setIsEnabled(boolean enabled);

    void setSessionToken(String sessionToken);
}
