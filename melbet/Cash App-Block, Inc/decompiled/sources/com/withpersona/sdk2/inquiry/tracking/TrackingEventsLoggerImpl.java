package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.DebugLogEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndEventData;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryStartEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.NfcScanEventData;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingUiEvent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.VideoErrorEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoIceCompleteEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStartEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStopEventData;
import com.withpersona.sdk2.inquiry.tracking.model.VideoStopRequestEventData;
import com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest;
import com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse;
import com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService;
import com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponentManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 f2\u00020\u0001:\u0003efgB;\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J$\u0010%\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J$\u0010&\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J)\u0010'\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010*J1\u0010+\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010.JO\u0010/\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r2\b\u00101\u001a\u0004\u0018\u00010)2\b\u00102\u001a\u0004\u0018\u00010)2\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0002\u00105J\u0018\u00106\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J6\u00107\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\r2\b\u00108\u001a\u0004\u0018\u00010\r2\b\u00109\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020?2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010@\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020A2\u0006\u0010$\u001a\u00020\u0018H\u0017J\u0018\u0010B\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020C2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010D\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020E2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010F\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020G2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020J2\u0006\u0010$\u001a\u00020\u0018H\u0016J*\u0010K\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010Q\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020R2\u0006\u0010$\u001a\u00020\u0018H\u0016J,\u0010S\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010W\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020X2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010Y\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020Z2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010[\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\\2\u0006\u0010$\u001a\u00020\u0018H\u0016J \u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u0018\u0010`\u001a\u00020\u001c2\u0006\u0010a\u001a\u00020b2\u0006\u0010$\u001a\u00020\u0018H\u0002J\u000e\u0010c\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010 J\b\u0010d\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLoggerImpl;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "context", "Landroid/content/Context;", "cache", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "moshi", "Lcom/squareup/moshi/Moshi;", "metadataProvider", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "trackingEventServerEndpoint", "", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lcom/squareup/moshi/Moshi;Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;Ljava/lang/String;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "workManager", "Landroidx/work/WorkManager;", "iso8601Formatter", "Ljava/text/SimpleDateFormat;", "sessionToken", "isEnabled", "", "cachedPublicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "setSessionToken", "", "setIsEnabled", "enabled", "fetchPublicKey", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logInquiryPageViewEvent", "stepName", "pageName", "force", "logForegroundEvent", "logBackgroundEvent", "logWebRtcIceCompleteEvent", "numCandidates", "", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "logVideoStartEvent", "videoCaptureMethod", "attempt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "logVideoStopEvent", "assetId", "elapsedTime", "chunksLength", "blobSize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Z)V", "logVideoStopRequestEvent", "logVideoErrorEvent", "errorName", "errorReason", "logPermissionEvent", "permissionData", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "logSelfieCaptureButtonClickedEvent", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "logSelfiePoseCaptureEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "logSelfieCaptureStateEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "logGovernmentIdButtonClickEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "logGovernmentIdStateEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "logInquiryStartEvent", "config", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "logInquiryEndEvent", "reason", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndReason;", "durationMs", "", "errorDescription", "logIntegrationEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "logUiStepButtonEvent", "type", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "buttonName", "logCameraInfoEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "logNfcScanEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "logNfcErrorEvent", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "logDebugLogEvent", "category", "message", "logEvent", BreadcrumbHelper.Category.EVENT, "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "flush", "nowToIso8601Utc", "Factory", "Companion", "TrackingEventsWorker", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl implements TrackingEventsLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_ENCRYPTED_REQUEST_FILE = "encrypted_request_file";
    public static final String KEY_PUBLIC_KEY = "public_key";
    public static final String KEY_PUBLIC_KEY_VERSION = "public_key_version";
    public static final String KEY_SERVER_ENDPOINT = "server_endpoint";
    public static final String KEY_SESSION_TOKEN = "session_token";
    public static final String KEY_TRACKING_EVENTS = "tracking_events";
    private static final int MEMORY_THRESHOLD = 10;
    public static final String WORK_NAME = "tracking_events_work";
    private static JsonAdapter trackingEventsJsonAdapter;
    private final TrackingEventsCache cache;
    private volatile PublicKeyResponse cachedPublicKeyResponse;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private volatile boolean isEnabled;
    private final SimpleDateFormat iso8601Formatter;
    private final TrackingMetadataProvider metadataProvider;
    private final Moshi moshi;
    private final SdkFilesManager sdkFilesManager;
    private volatile String sessionToken;
    private final String trackingEventServerEndpoint;
    private final WorkManager workManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLoggerImpl$Factory;", "", "create", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLoggerImpl;", "trackingEventServerEndpoint", "", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        TrackingEventsLoggerImpl create(String trackingEventServerEndpoint);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLoggerImpl$TrackingEventsWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrackingEventsWorker extends CoroutineWorker {
        private final Context context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackingEventsWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            context.getClass();
            workerParameters.getClass();
            this.context = context;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|97|6|7|8) */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0040, code lost:
        
            r12 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0185, code lost:
        
            r13 = com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.INSTANCE.getInstance();
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x018b, code lost:
        
            if (r13 != null) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x018d, code lost:
        
            r0.L$0 = r12;
            r0.label = 6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0196, code lost:
        
            if (r13.onFlushFinished(r0) == r1) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x016c A[Catch: Exception -> 0x0040, LOOP:1: B:25:0x016a->B:26:0x016c, LOOP_END, TryCatch #0 {Exception -> 0x0040, blocks: (B:23:0x003b, B:24:0x014e, B:26:0x016c, B:28:0x017a, B:31:0x0043, B:32:0x0131, B:35:0x004c, B:36:0x0112, B:38:0x0118, B:40:0x0125, B:44:0x0136, B:46:0x0141, B:50:0x0055, B:51:0x00f2, B:53:0x005a, B:54:0x00b5, B:57:0x0061, B:59:0x006d, B:61:0x0073, B:63:0x007f, B:65:0x0085, B:67:0x0091, B:69:0x0097, B:71:0x00a2, B:73:0x00aa, B:76:0x00bb, B:80:0x00dd, B:82:0x00e8, B:85:0x00f8), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:23:0x003b, B:24:0x014e, B:26:0x016c, B:28:0x017a, B:31:0x0043, B:32:0x0131, B:35:0x004c, B:36:0x0112, B:38:0x0118, B:40:0x0125, B:44:0x0136, B:46:0x0141, B:50:0x0055, B:51:0x00f2, B:53:0x005a, B:54:0x00b5, B:57:0x0061, B:59:0x006d, B:61:0x0073, B:63:0x007f, B:65:0x0085, B:67:0x0091, B:69:0x0097, B:71:0x00a2, B:73:0x00aa, B:76:0x00bb, B:80:0x00dd, B:82:0x00e8, B:85:0x00f8), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:23:0x003b, B:24:0x014e, B:26:0x016c, B:28:0x017a, B:31:0x0043, B:32:0x0131, B:35:0x004c, B:36:0x0112, B:38:0x0118, B:40:0x0125, B:44:0x0136, B:46:0x0141, B:50:0x0055, B:51:0x00f2, B:53:0x005a, B:54:0x00b5, B:57:0x0061, B:59:0x006d, B:61:0x0073, B:63:0x007f, B:65:0x0085, B:67:0x0091, B:69:0x0097, B:71:0x00a2, B:73:0x00aa, B:76:0x00bb, B:80:0x00dd, B:82:0x00e8, B:85:0x00f8), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0136 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:23:0x003b, B:24:0x014e, B:26:0x016c, B:28:0x017a, B:31:0x0043, B:32:0x0131, B:35:0x004c, B:36:0x0112, B:38:0x0118, B:40:0x0125, B:44:0x0136, B:46:0x0141, B:50:0x0055, B:51:0x00f2, B:53:0x005a, B:54:0x00b5, B:57:0x0061, B:59:0x006d, B:61:0x0073, B:63:0x007f, B:65:0x0085, B:67:0x0091, B:69:0x0097, B:71:0x00a2, B:73:0x00aa, B:76:0x00bb, B:80:0x00dd, B:82:0x00e8, B:85:0x00f8), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0055 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:23:0x003b, B:24:0x014e, B:26:0x016c, B:28:0x017a, B:31:0x0043, B:32:0x0131, B:35:0x004c, B:36:0x0112, B:38:0x0118, B:40:0x0125, B:44:0x0136, B:46:0x0141, B:50:0x0055, B:51:0x00f2, B:53:0x005a, B:54:0x00b5, B:57:0x0061, B:59:0x006d, B:61:0x0073, B:63:0x007f, B:65:0x0085, B:67:0x0091, B:69:0x0097, B:71:0x00a2, B:73:0x00aa, B:76:0x00bb, B:80:0x00dd, B:82:0x00e8, B:85:0x00f8), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x005a A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:23:0x003b, B:24:0x014e, B:26:0x016c, B:28:0x017a, B:31:0x0043, B:32:0x0131, B:35:0x004c, B:36:0x0112, B:38:0x0118, B:40:0x0125, B:44:0x0136, B:46:0x0141, B:50:0x0055, B:51:0x00f2, B:53:0x005a, B:54:0x00b5, B:57:0x0061, B:59:0x006d, B:61:0x0073, B:63:0x007f, B:65:0x0085, B:67:0x0091, B:69:0x0097, B:71:0x00a2, B:73:0x00aa, B:76:0x00bb, B:80:0x00dd, B:82:0x00e8, B:85:0x00f8), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
            TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1 trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1;
            String string2;
            String string3;
            EncryptedTrackingEventsRequest encryptedTrackingEventsRequest;
            Object m4105sendEvents0E7RQCE$tracking_events_release;
            File file;
            Throwable m4120exceptionOrNullimpl;
            Throwable th;
            int i;
            if (continuation instanceof TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1) {
                trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1 = (TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1) continuation;
                int i2 = trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            String string4 = getInputData().getString(TrackingEventsLoggerImpl.KEY_SESSION_TOKEN);
                            if (string4 != null && (string2 = getInputData().getString(TrackingEventsLoggerImpl.KEY_SERVER_ENDPOINT)) != null && (string3 = getInputData().getString(TrackingEventsLoggerImpl.KEY_ENCRYPTED_REQUEST_FILE)) != null) {
                                File file2 = new File(string3);
                                if (!file2.exists()) {
                                    TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
                                    if (companion != null) {
                                        trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label = 1;
                                        if (companion.onFlushFinished(trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1) == coroutineSingletons) {
                                        }
                                    }
                                    return new ListenableWorker.Result.Failure();
                                }
                                try {
                                    encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) new Moshi(new Moshi.Builder()).adapter(EncryptedTrackingEventsRequest.class, Util.NO_ANNOTATIONS, null).fromJson(FilesKt__FileReadWriteKt.readText(file2, Charsets.UTF_8));
                                } catch (Exception unused) {
                                    encryptedTrackingEventsRequest = null;
                                }
                                if (encryptedTrackingEventsRequest == null) {
                                    file2.delete();
                                    TrackingEventsCache companion2 = TrackingEventsCache.INSTANCE.getInstance();
                                    if (companion2 != null) {
                                        trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label = 2;
                                        if (companion2.onFlushFinished(trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1) == coroutineSingletons) {
                                        }
                                    }
                                    return new ListenableWorker.Result.Failure();
                                }
                                TrackingEventsService trackingEventsService = TrackingEventsServiceComponentManager.INSTANCE.getInstance(this.context, string2).trackingEventsService();
                                trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.L$0 = file2;
                                trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label = 3;
                                m4105sendEvents0E7RQCE$tracking_events_release = trackingEventsService.m4105sendEvents0E7RQCE$tracking_events_release(string4, encryptedTrackingEventsRequest, trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1);
                                if (m4105sendEvents0E7RQCE$tracking_events_release != coroutineSingletons) {
                                    file = file2;
                                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4105sendEvents0E7RQCE$tracking_events_release);
                                    if (m4120exceptionOrNullimpl != null) {
                                        file.delete();
                                        TrackingEventsCache companion3 = TrackingEventsCache.INSTANCE.getInstance();
                                        if (companion3 != null) {
                                            trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.L$0 = null;
                                            trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label = 4;
                                            if (companion3.onFlushFinished(trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1) == coroutineSingletons) {
                                            }
                                        }
                                        return ListenableWorker.Result.success();
                                    }
                                    file.delete();
                                    TrackingEventsCache companion4 = TrackingEventsCache.INSTANCE.getInstance();
                                    if (companion4 != null) {
                                        trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.L$0 = m4120exceptionOrNullimpl;
                                        trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label = 5;
                                        if (companion4.onFlushFinished(trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1) == coroutineSingletons) {
                                        }
                                    }
                                    th = m4120exceptionOrNullimpl;
                                    Pair[] pairArr = {new Pair("error_message", th.getMessage()), new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(th))};
                                    Data.Builder builder = new Data.Builder();
                                    for (i = 0; i < 2; i++) {
                                        Pair pair = pairArr[i];
                                        builder.put((String) pair.first, pair.second);
                                    }
                                    return new ListenableWorker.Result.Failure(builder.build());
                                }
                                return coroutineSingletons;
                            }
                            return new ListenableWorker.Result.Failure();
                        case 1:
                            SafeTrace.throwOnFailure(obj);
                            return new ListenableWorker.Result.Failure();
                        case 2:
                            SafeTrace.throwOnFailure(obj);
                            return new ListenableWorker.Result.Failure();
                        case 3:
                            file = (File) trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            m4105sendEvents0E7RQCE$tracking_events_release = ((Result) obj).value;
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4105sendEvents0E7RQCE$tracking_events_release);
                            if (m4120exceptionOrNullimpl != null) {
                            }
                            return coroutineSingletons;
                        case 4:
                            SafeTrace.throwOnFailure(obj);
                            return ListenableWorker.Result.success();
                        case 5:
                            th = (Throwable) trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Pair[] pairArr2 = {new Pair("error_message", th.getMessage()), new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(th))};
                            Data.Builder builder2 = new Data.Builder();
                            while (i < 2) {
                            }
                            return new ListenableWorker.Result.Failure(builder2.build());
                        case 6:
                            e = (Exception) trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            Pair[] pairArr3 = {new Pair("error_message", message), new Pair("error_stacktrace", ExceptionsKt__ExceptionsKt.stackTraceToString(e))};
                            Data.Builder builder3 = new Data.Builder();
                            for (int i3 = 0; i3 < 2; i3++) {
                                Pair pair2 = pairArr3[i3];
                                builder3.put((String) pair2.first, pair2.second);
                            }
                            return new ListenableWorker.Result.Failure(builder3.build());
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1 = new TrackingEventsLoggerImpl$TrackingEventsWorker$doWork$1(this, continuation);
            Object obj2 = trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (trackingEventsLoggerImpl$TrackingEventsWorker$doWork$1.label) {
            }
        }
    }

    public TrackingEventsLoggerImpl(Context context, TrackingEventsCache trackingEventsCache, Moshi moshi, TrackingMetadataProvider trackingMetadataProvider, SdkFilesManager sdkFilesManager, String str) {
        context.getClass();
        trackingEventsCache.getClass();
        moshi.getClass();
        trackingMetadataProvider.getClass();
        sdkFilesManager.getClass();
        str.getClass();
        this.context = context;
        this.cache = trackingEventsCache;
        this.moshi = moshi;
        this.metadataProvider = trackingMetadataProvider;
        this.sdkFilesManager = sdkFilesManager;
        this.trackingEventServerEndpoint = str;
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.SupervisorJob$default()));
        this.workManager = WorkManagerImpl.getInstance$1(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.iso8601Formatter = simpleDateFormat;
        trackingEventsJsonAdapter = moshi.adapter(Types.newParameterizedType(List.class, TrackingEvent.class));
        TrackingEventsCache.INSTANCE.setInstance(trackingEventsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:21|22))(2:23|(1:25)(2:26|(1:28)(2:29|(1:31))))|11|(1:13)|14|(2:16|17)|20))|33|6|7|(0)(0)|11|(0)|14|(0)|20) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:10:0x0024, B:11:0x0056, B:14:0x005d, B:16:0x0061, B:29:0x003f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchPublicKey(Continuation<? super PublicKeyResponse> continuation) {
        TrackingEventsLoggerImpl$fetchPublicKey$1 trackingEventsLoggerImpl$fetchPublicKey$1;
        int i;
        Object m4104getPublicKeygIAlus$tracking_events_release;
        PublicKeyResponse publicKeyResponse;
        if (continuation instanceof TrackingEventsLoggerImpl$fetchPublicKey$1) {
            trackingEventsLoggerImpl$fetchPublicKey$1 = (TrackingEventsLoggerImpl$fetchPublicKey$1) continuation;
            int i2 = trackingEventsLoggerImpl$fetchPublicKey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                trackingEventsLoggerImpl$fetchPublicKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = trackingEventsLoggerImpl$fetchPublicKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingEventsLoggerImpl$fetchPublicKey$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PublicKeyResponse publicKeyResponse2 = this.cachedPublicKeyResponse;
                    if (publicKeyResponse2 != null) {
                        return publicKeyResponse2;
                    }
                    String str = this.sessionToken;
                    if (str == null) {
                        return null;
                    }
                    TrackingEventsService trackingEventsService = TrackingEventsServiceComponentManager.INSTANCE.getInstance(this.context, this.trackingEventServerEndpoint).trackingEventsService();
                    trackingEventsLoggerImpl$fetchPublicKey$1.label = 1;
                    m4104getPublicKeygIAlus$tracking_events_release = trackingEventsService.m4104getPublicKeygIAlus$tracking_events_release(str, trackingEventsLoggerImpl$fetchPublicKey$1);
                    if (m4104getPublicKeygIAlus$tracking_events_release == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4104getPublicKeygIAlus$tracking_events_release = ((Result) obj).value;
                }
                Result.Companion companion = Result.Companion;
                if (m4104getPublicKeygIAlus$tracking_events_release instanceof Result.Failure) {
                    m4104getPublicKeygIAlus$tracking_events_release = null;
                }
                publicKeyResponse = (PublicKeyResponse) m4104getPublicKeygIAlus$tracking_events_release;
                if (publicKeyResponse != null) {
                    this.cachedPublicKeyResponse = publicKeyResponse;
                    return publicKeyResponse;
                }
                return null;
            }
        }
        trackingEventsLoggerImpl$fetchPublicKey$1 = new TrackingEventsLoggerImpl$fetchPublicKey$1(this, continuation);
        Object obj2 = trackingEventsLoggerImpl$fetchPublicKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingEventsLoggerImpl$fetchPublicKey$1.label;
        if (i != 0) {
        }
        Result.Companion companion2 = Result.Companion;
        if (m4104getPublicKeygIAlus$tracking_events_release instanceof Result.Failure) {
        }
        publicKeyResponse = (PublicKeyResponse) m4104getPublicKeygIAlus$tracking_events_release;
        if (publicKeyResponse != null) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|93|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x023c, code lost:
    
        if (r9.onFlushFinished(r3) == r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
    
        if (r8.beginFlush(r3) == r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d9, code lost:
    
        if (r1 != r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0063, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0175 A[Catch: Exception -> 0x022c, TRY_LEAVE, TryCatch #0 {Exception -> 0x022c, blocks: (B:27:0x0049, B:28:0x0171, B:30:0x0175, B:33:0x018d, B:35:0x0202, B:37:0x0210), top: B:26:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d A[Catch: Exception -> 0x022c, TRY_ENTER, TryCatch #0 {Exception -> 0x022c, blocks: (B:27:0x0049, B:28:0x0171, B:30:0x0175, B:33:0x018d, B:35:0x0202, B:37:0x0210), top: B:26:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:40:0x005e, B:41:0x0153, B:44:0x015b, B:49:0x0076, B:50:0x0131, B:52:0x0135, B:53:0x0137, B:54:0x013f, B:60:0x00f6, B:62:0x011d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flush(Continuation<? super Unit> continuation) {
        TrackingEventsLoggerImpl$flush$1 trackingEventsLoggerImpl$flush$1;
        TrackingEventsCache trackingEventsCache;
        TrackingEventsCache trackingEventsCache2;
        String str;
        String str2;
        TrackingEventsCache trackingEventsCache3;
        Constraints constraints;
        JsonAdapter jsonAdapter;
        String str3;
        Constraints constraints2;
        Constraints constraints3;
        Object obj;
        Constraints constraints4;
        String str4;
        EncryptedTrackingEventsRequest encryptedTrackingEventsRequest;
        if (continuation instanceof TrackingEventsLoggerImpl$flush$1) {
            trackingEventsLoggerImpl$flush$1 = (TrackingEventsLoggerImpl$flush$1) continuation;
            int i = trackingEventsLoggerImpl$flush$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                trackingEventsLoggerImpl$flush$1.label = i - PKIFailureInfo.systemUnavail;
                Object obj2 = trackingEventsLoggerImpl$flush$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (trackingEventsLoggerImpl$flush$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj2);
                        TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
                        if (companion == null) {
                            return Unit.INSTANCE;
                        }
                        trackingEventsLoggerImpl$flush$1.L$0 = companion;
                        trackingEventsLoggerImpl$flush$1.label = 1;
                        Object isFlushing = companion.isFlushing(trackingEventsLoggerImpl$flush$1);
                        if (isFlushing != obj3) {
                            trackingEventsCache2 = companion;
                            obj2 = isFlushing;
                            if (((Boolean) obj2).booleanValue() && (str = this.sessionToken) != null) {
                                trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache2;
                                trackingEventsLoggerImpl$flush$1.L$1 = str;
                                trackingEventsLoggerImpl$flush$1.label = 2;
                                obj2 = trackingEventsCache2.currentCount(trackingEventsLoggerImpl$flush$1);
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        return obj3;
                    case 1:
                        TrackingEventsCache trackingEventsCache4 = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        trackingEventsCache2 = trackingEventsCache4;
                        if (((Boolean) obj2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache2;
                        trackingEventsLoggerImpl$flush$1.L$1 = str;
                        trackingEventsLoggerImpl$flush$1.label = 2;
                        obj2 = trackingEventsCache2.currentCount(trackingEventsLoggerImpl$flush$1);
                        break;
                    case 2:
                        str = (String) trackingEventsLoggerImpl$flush$1.L$1;
                        trackingEventsCache2 = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        if (((Number) obj2).intValue() == 0) {
                            return Unit.INSTANCE;
                        }
                        trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache2;
                        trackingEventsLoggerImpl$flush$1.L$1 = str;
                        trackingEventsLoggerImpl$flush$1.label = 3;
                        break;
                    case 3:
                        str = (String) trackingEventsLoggerImpl$flush$1.L$1;
                        trackingEventsCache2 = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        str2 = str;
                        trackingEventsCache3 = trackingEventsCache2;
                        NetworkType networkType = NetworkType.NOT_REQUIRED;
                        constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, CollectionsKt.toSet(new LinkedHashSet()));
                        jsonAdapter = trackingEventsJsonAdapter;
                        if (jsonAdapter != null) {
                            trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache3;
                            trackingEventsLoggerImpl$flush$1.L$1 = str2;
                            trackingEventsLoggerImpl$flush$1.L$2 = constraints;
                            trackingEventsLoggerImpl$flush$1.L$3 = jsonAdapter;
                            trackingEventsLoggerImpl$flush$1.label = 4;
                            obj2 = trackingEventsCache3.peekAll(trackingEventsLoggerImpl$flush$1);
                            if (obj2 == obj3) {
                                return obj3;
                            }
                            constraints2 = constraints;
                            obj = (List) obj2;
                            if (obj == null) {
                                obj = EmptyList.INSTANCE;
                            }
                            str3 = jsonAdapter.toJson(obj);
                            constraints = constraints2;
                            trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache3;
                            trackingEventsLoggerImpl$flush$1.L$1 = str2;
                            trackingEventsLoggerImpl$flush$1.L$2 = constraints;
                            trackingEventsLoggerImpl$flush$1.L$3 = str3;
                            trackingEventsLoggerImpl$flush$1.label = 5;
                            obj2 = fetchPublicKey(trackingEventsLoggerImpl$flush$1);
                            if (obj2 == obj3) {
                                return obj3;
                            }
                            constraints3 = constraints;
                            PublicKeyResponse publicKeyResponse = (PublicKeyResponse) obj2;
                            Companion companion2 = INSTANCE;
                            if (str3 == null) {
                                str3 = "";
                            }
                            trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache3;
                            trackingEventsLoggerImpl$flush$1.L$1 = str2;
                            trackingEventsLoggerImpl$flush$1.L$2 = constraints3;
                            trackingEventsLoggerImpl$flush$1.L$3 = null;
                            trackingEventsLoggerImpl$flush$1.label = 6;
                            obj2 = companion2.createTrackingEventsRequest(str3, publicKeyResponse, trackingEventsLoggerImpl$flush$1);
                            if (obj2 != obj3) {
                                constraints4 = constraints3;
                                str4 = str2;
                                trackingEventsCache = trackingEventsCache3;
                                encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj2;
                                if (encryptedTrackingEventsRequest == null) {
                                    SdkFilesManager sdkFilesManager = this.sdkFilesManager;
                                    sdkFilesManager.getClass();
                                    File file = sdkFilesManager.sessionCacheDir;
                                    SdkFilesManager.ensureFolder(file);
                                    File file2 = new File(file, UUID.randomUUID() + ".json");
                                    String json = new Moshi(new Moshi.Builder()).adapter(EncryptedTrackingEventsRequest.class, Util.NO_ANNOTATIONS, null).toJson(encryptedTrackingEventsRequest);
                                    json.getClass();
                                    FilesKt__FileReadWriteKt.writeText$default(file2, json);
                                    GrpcMethod grpcMethod = new GrpcMethod(TrackingEventsWorker.class);
                                    constraints4.getClass();
                                    ((WorkSpec) grpcMethod.requestAdapter).constraints = constraints4;
                                    Pair[] pairArr = {new Pair(KEY_SERVER_ENDPOINT, this.trackingEventServerEndpoint), new Pair(KEY_SESSION_TOKEN, str4), new Pair(KEY_ENCRYPTED_REQUEST_FILE, file2.getAbsolutePath())};
                                    Data.Builder builder = new Data.Builder();
                                    for (int i2 = 0; i2 < 3; i2++) {
                                        Pair pair = pairArr[i2];
                                        builder.put((String) pair.first, pair.second);
                                    }
                                    ((WorkSpec) grpcMethod.requestAdapter).input = builder.build();
                                    this.workManager.enqueueUniqueWork(WORK_NAME, ExistingWorkPolicy.REPLACE, grpcMethod.build()).getClass();
                                    return Unit.INSTANCE;
                                }
                                trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache;
                                trackingEventsLoggerImpl$flush$1.L$1 = null;
                                trackingEventsLoggerImpl$flush$1.L$2 = null;
                                trackingEventsLoggerImpl$flush$1.label = 7;
                                if (trackingEventsCache.onFlushFinished(trackingEventsLoggerImpl$flush$1) != obj3) {
                                    return Unit.INSTANCE;
                                }
                            }
                            return obj3;
                        }
                        str3 = null;
                        trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache3;
                        trackingEventsLoggerImpl$flush$1.L$1 = str2;
                        trackingEventsLoggerImpl$flush$1.L$2 = constraints;
                        trackingEventsLoggerImpl$flush$1.L$3 = str3;
                        trackingEventsLoggerImpl$flush$1.label = 5;
                        obj2 = fetchPublicKey(trackingEventsLoggerImpl$flush$1);
                        if (obj2 == obj3) {
                        }
                    case 4:
                        jsonAdapter = (JsonAdapter) trackingEventsLoggerImpl$flush$1.L$3;
                        constraints2 = (Constraints) trackingEventsLoggerImpl$flush$1.L$2;
                        str2 = (String) trackingEventsLoggerImpl$flush$1.L$1;
                        trackingEventsCache3 = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        obj = (List) obj2;
                        if (obj == null) {
                        }
                        str3 = jsonAdapter.toJson(obj);
                        constraints = constraints2;
                        trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache3;
                        trackingEventsLoggerImpl$flush$1.L$1 = str2;
                        trackingEventsLoggerImpl$flush$1.L$2 = constraints;
                        trackingEventsLoggerImpl$flush$1.L$3 = str3;
                        trackingEventsLoggerImpl$flush$1.label = 5;
                        obj2 = fetchPublicKey(trackingEventsLoggerImpl$flush$1);
                        if (obj2 == obj3) {
                        }
                        break;
                    case 5:
                        str3 = (String) trackingEventsLoggerImpl$flush$1.L$3;
                        constraints3 = (Constraints) trackingEventsLoggerImpl$flush$1.L$2;
                        str2 = (String) trackingEventsLoggerImpl$flush$1.L$1;
                        trackingEventsCache3 = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        PublicKeyResponse publicKeyResponse2 = (PublicKeyResponse) obj2;
                        Companion companion22 = INSTANCE;
                        if (str3 == null) {
                        }
                        trackingEventsLoggerImpl$flush$1.L$0 = trackingEventsCache3;
                        trackingEventsLoggerImpl$flush$1.L$1 = str2;
                        trackingEventsLoggerImpl$flush$1.L$2 = constraints3;
                        trackingEventsLoggerImpl$flush$1.L$3 = null;
                        trackingEventsLoggerImpl$flush$1.label = 6;
                        obj2 = companion22.createTrackingEventsRequest(str3, publicKeyResponse2, trackingEventsLoggerImpl$flush$1);
                        if (obj2 != obj3) {
                        }
                        return obj3;
                    case 6:
                        constraints4 = (Constraints) trackingEventsLoggerImpl$flush$1.L$2;
                        str4 = (String) trackingEventsLoggerImpl$flush$1.L$1;
                        trackingEventsCache = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) obj2;
                            if (encryptedTrackingEventsRequest == null) {
                            }
                        } catch (Exception unused) {
                            trackingEventsLoggerImpl$flush$1.L$0 = null;
                            trackingEventsLoggerImpl$flush$1.L$1 = null;
                            trackingEventsLoggerImpl$flush$1.L$2 = null;
                            trackingEventsLoggerImpl$flush$1.L$3 = null;
                            trackingEventsLoggerImpl$flush$1.label = 8;
                            break;
                        }
                        break;
                    case 7:
                        TrackingEventsCache trackingEventsCache5 = (TrackingEventsCache) trackingEventsLoggerImpl$flush$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        } catch (Exception unused2) {
                            trackingEventsCache = trackingEventsCache5;
                            trackingEventsLoggerImpl$flush$1.L$0 = null;
                            trackingEventsLoggerImpl$flush$1.L$1 = null;
                            trackingEventsLoggerImpl$flush$1.L$2 = null;
                            trackingEventsLoggerImpl$flush$1.L$3 = null;
                            trackingEventsLoggerImpl$flush$1.label = 8;
                            break;
                        }
                    case 8:
                        SafeTrace.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        trackingEventsLoggerImpl$flush$1 = new TrackingEventsLoggerImpl$flush$1(this, continuation);
        Object obj22 = trackingEventsLoggerImpl$flush$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (trackingEventsLoggerImpl$flush$1.label) {
        }
    }

    private final void logEvent(TrackingEvent event, boolean force) {
        if (this.isEnabled) {
            JobKt.launch$default(this.coroutineScope, null, null, new TrackingEventsLoggerImpl$logEvent$1(event, force, this, null), 3);
        }
    }

    private final String nowToIso8601Utc() {
        String format2 = this.iso8601Formatter.format(new Date());
        format2.getClass();
        return format2;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logBackgroundEvent(String stepName, String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryBackgroundEvent(a.a("toString(...)"), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logCameraInfoEvent(CameraInfoEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryCameraInfoEvent(a.a("toString(...)"), CameraInfoEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logDebugLogEvent(String category, String message, boolean force) {
        category.getClass();
        message.getClass();
        logEvent(new TrackingEvent.InquiryDebugLogEvent(a.a("toString(...)"), new DebugLogEventData(category, message, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logForegroundEvent(String stepName, String pageName, boolean force) {
        logEvent(new TrackingEvent.InquiryForegroundEvent(a.a("toString(...)"), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdButtonClickEvent(GovernmentIdButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdButtonEvent(a.a("toString(...)"), GovernmentIdButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logGovernmentIdStateEvent(GovernmentIdStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryGovernmentIdStateEvent(a.a("toString(...)"), GovernmentIdStateEventData.copy$default(data, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryEndEvent(InquiryEndReason reason, long durationMs, String errorDescription, boolean force) {
        reason.getClass();
        logEvent(new TrackingEvent.InquiryEndEvent(a.a("toString(...)"), new InquiryEndEventData(reason, Long.valueOf(durationMs), errorDescription, this.metadataProvider.collect()), nowToIso8601Utc()), true);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryPageViewEvent(String stepName, String pageName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.PageViewTrackingEvent(a.a("toString(...)"), new TrackingUiEvent(pageName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logInquiryStartEvent(InquiryConfigData config, boolean force) {
        config.getClass();
        logEvent(new TrackingEvent.InquiryStartEvent(a.a("toString(...)"), new InquiryStartEventData(config, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logIntegrationEvent(IntegrationEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryIntegrationEvent(a.a("toString(...)"), IntegrationEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcErrorEvent(NfcErrorEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcErrorEvent(a.a("toString(...)"), NfcErrorEventData.copy$default(data, null, null, null, null, null, null, null, null, this.metadataProvider.collect(), 255, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logNfcScanEvent(NfcScanEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquiryNfcScanEvent(a.a("toString(...)"), NfcScanEventData.copy$default(data, null, null, null, null, null, null, this.metadataProvider.collect(), 63, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logPermissionEvent(PermissionTrackingEventData permissionData, boolean force) {
        permissionData.getClass();
        logEvent(new TrackingEvent.InquiryPermissionEvent(a.a("toString(...)"), PermissionTrackingEventData.copy$default(permissionData, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureButtonClickedEvent(SelfieCaptureButtonEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieClickEvent(a.a("toString(...)"), SelfieCaptureButtonEventData.copy$default(data, null, this.metadataProvider.collect(), 1, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logSelfieCaptureStateEvent(SelfieCaptureStateEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfieCaptureStateEvent(a.a("toString(...)"), SelfieCaptureStateEventData.copy$default(data, null, null, null, this.metadataProvider.collect(), 7, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    @Deprecated
    public void logSelfiePoseCaptureEvent(SelfiePoseEventData data, boolean force) {
        data.getClass();
        logEvent(new TrackingEvent.InquirySelfiePoseEvent(a.a("toString(...)"), SelfiePoseEventData.copy$default(data, null, null, this.metadataProvider.collect(), 3, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logUiStepButtonEvent(UiStepButtonType type2, String buttonName, String stepName, boolean force) {
        type2.getClass();
        logEvent(new TrackingEvent.InquiryUiStepButtonEvent(a.a("toString(...)"), new UiStepButtonEventData(type2, buttonName, stepName, this.metadataProvider.collect()), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoErrorEvent(String stepName, String videoCaptureMethod, String errorName, String errorReason, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoErrorEvent(a.a("toString(...)"), new VideoErrorEventData(stepName, null, videoCaptureMethod, errorName, errorReason, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStartEvent(String stepName, String videoCaptureMethod, Integer attempt, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStartEvent(a.a("toString(...)"), new VideoStartEventData(stepName, null, videoCaptureMethod, attempt, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopEvent(String stepName, String videoCaptureMethod, String assetId, Integer elapsedTime, Integer chunksLength, Double blobSize, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopEvent(a.a("toString(...)"), new VideoStopEventData(stepName, null, videoCaptureMethod, assetId, elapsedTime, chunksLength, blobSize, this.metadataProvider.collect(), 2, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logVideoStopRequestEvent(String stepName, boolean force) {
        stepName.getClass();
        logEvent(new TrackingEvent.InquiryVideoStopRequestEvent(a.a("toString(...)"), new VideoStopRequestEventData(stepName, null, null, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void logWebRtcIceCompleteEvent(String stepName, Integer numCandidates, boolean force) {
        logEvent(new TrackingEvent.InquiryVideoIceCompleteEvent(a.a("toString(...)"), new VideoIceCompleteEventData(stepName, null, null, numCandidates, this.metadataProvider.collect(), 6, null), nowToIso8601Utc()), force);
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setIsEnabled(boolean enabled) {
        if (this.isEnabled == enabled) {
            return;
        }
        this.isEnabled = enabled;
        if (this.isEnabled) {
            return;
        }
        this.cachedPublicKeyResponse = null;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger
    public void setSessionToken(String sessionToken) {
        sessionToken.getClass();
        this.sessionToken = sessionToken;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLoggerImpl$Companion;", "", "<init>", "()V", "MEMORY_THRESHOLD", "", "KEY_SESSION_TOKEN", "", "KEY_TRACKING_EVENTS", "KEY_SERVER_ENDPOINT", "KEY_PUBLIC_KEY_VERSION", "KEY_PUBLIC_KEY", "KEY_ENCRYPTED_REQUEST_FILE", "WORK_NAME", "trackingEventsJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "createTrackingEventsRequest", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "json", "publicKeyResponse", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        
            if (r5 == r8) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object createTrackingEventsRequest(String str, PublicKeyResponse publicKeyResponse, Continuation<? super EncryptedTrackingEventsRequest> continuation) {
            TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1 trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1;
            int i;
            String str2;
            String str3;
            if (continuation instanceof TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1) {
                trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1 = (TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1) continuation;
                int i2 = trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            publicKeyResponse = (PublicKeyResponse) trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            ObfuscationResult obfuscationResult = (ObfuscationResult) obj;
                            return new EncryptedTrackingEventsRequest(publicKeyResponse.getVersion(), obfuscationResult.getEncryptedKey(), obfuscationResult.getEncryptedPayload());
                        }
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.L$1;
                        str3 = (String) trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        return new EncryptedTrackingEventsRequest(str3, str2, (String) obj);
                    }
                    SafeTrace.throwOnFailure(obj);
                    String str4 = "{\"events\": " + str + "}";
                    JsonAdapter jsonAdapter = TrackingEventsLoggerImpl.trackingEventsJsonAdapter;
                    List list = jsonAdapter != null ? (List) jsonAdapter.fromJson(str) : null;
                    if (list == null || list.isEmpty()) {
                        return null;
                    }
                    if (publicKeyResponse != null) {
                        String publicKey = publicKeyResponse.getPublicKey();
                        trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.L$0 = publicKeyResponse;
                        trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.label = 1;
                        obj = TrackingEventUtilsKt.obfuscatePayload(str4, publicKey, trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1);
                    } else {
                        str2 = "";
                        trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.L$0 = "";
                        trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.L$1 = "";
                        trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.label = 2;
                        obj = TrackingEventUtilsKt.obfuscatePayload(str4, trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1);
                        if (obj != coroutineSingletons) {
                            str3 = "";
                            return new EncryptedTrackingEventsRequest(str3, str2, (String) obj);
                        }
                    }
                    return coroutineSingletons;
                }
            }
            trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1 = new TrackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1(this, continuation);
            Object obj2 = trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = trackingEventsLoggerImpl$Companion$createTrackingEventsRequest$1.label;
            if (i == 0) {
            }
        }

        private Companion() {
        }
    }
}
