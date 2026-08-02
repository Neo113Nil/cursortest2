package com.squareup.wire;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextHelper;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.Thread_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import app.cash.api.ApiResult;
import app.cash.onboarding.global.config.RealOnboardingConfigManager$fetchOnboardingConfig$1;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.size.DimensionKt;
import coil3.util.AndroidSystemCallbacks;
import com.google.android.gms.dynamite.zzh;
import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzacf;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzadq;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafj;
import com.google.android.gms.internal.measurement.zzj;
import com.google.android.gms.internal.measurement.zzky;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzlg;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzni;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzqn;
import com.google.android.gms.internal.measurement.zzqv;
import com.google.android.gms.internal.measurement.zzru;
import com.google.android.gms.internal.measurement.zztw;
import com.google.android.gms.maps.zzah;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.squareup.cash.activity.backend.ActivityFormattingResult;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.contacts.DeviceContactItemTransformer;
import com.squareup.cash.activity.backend.contacts.RealDeviceContactItemTransformer;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.FormattingFailedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.FormattingPageRequestHandler$requestPage$1;
import com.squareup.cash.activity.backend.loader.PaymentHistoryActivityData;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.api.ApiResultCallAdapterFactory$get$3$adapt$1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.semaphore.api.GetOnboardingConfigRequest;
import com.squareup.protos.cash.semaphore.api.GetOnboardingConfigResponse;
import com.squareup.protos.cash.semaphore.api.SemaphoreService;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.Strings;
import com.squareup.util.cash.Regions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.logging.Level;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.CompletableFutureCallAdapterFactory;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class GrpcMethod implements ActivitiesManager.ActivityPageHandler, CallAdapter {
    public static Boolean zza;
    public Object path;
    public Object requestAdapter;
    public Object responseAdapter;

    public GrpcMethod(int i, boolean z) {
        int i2 = 4;
        switch (i) {
            case 5:
                this.path = new AtomicReference(Expect_jvmKt.emptyThreadMap);
                this.requestAdapter = new Object();
                break;
            case 8:
                this.path = new MemoryCacheService(11);
                this.requestAdapter = new MemoryCacheService(11);
                this.responseAdapter = new MemoryCacheService(11);
                break;
            case 10:
                this.path = new LruCache(16);
                long[] jArr = ScatterMapKt.EmptyGroup;
                this.requestAdapter = new MutableScatterMap();
                this.responseAdapter = new Trifle(i2);
                break;
            case 12:
                this.responseAdapter = new Trifle(i2);
                break;
            case 13:
                this.path = new WeakHashMap();
                this.requestAdapter = new WeakHashMap();
                this.responseAdapter = new WeakHashMap();
                break;
            case 17:
                List list = Collections.EMPTY_LIST;
                this.path = list;
                this.requestAdapter = list;
                break;
            case 21:
                this.path = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.requestAdapter = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.responseAdapter = new ConcurrentHashMap();
                break;
            default:
                TextFieldPreparedSelectionState textFieldPreparedSelectionState = new TextFieldPreparedSelectionState();
                textFieldPreparedSelectionState.cachedX = Float.NaN;
                this.path = textFieldPreparedSelectionState;
                this.requestAdapter = new DeadKeyCombiner();
                break;
        }
    }

    public static GrpcMethod obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new GrpcMethod(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static void rename(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0121 -> B:12:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0127 -> B:12:0x0154). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object requestPage$suspendImpl(GrpcMethod grpcMethod, ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, ContinuationImpl continuationImpl) {
        FormattingPageRequestHandler$requestPage$1 formattingPageRequestHandler$requestPage$1;
        int i;
        ActivitiesManager.ActivityPage activityPage;
        GrpcMethod grpcMethod2;
        ArrayList arrayList;
        ActivitiesManager.ActivityPage activityPage2;
        GrpcMethod grpcMethod3;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        GrpcMethod grpcMethod4 = grpcMethod;
        if (continuationImpl instanceof FormattingPageRequestHandler$requestPage$1) {
            formattingPageRequestHandler$requestPage$1 = (FormattingPageRequestHandler$requestPage$1) continuationImpl;
            int i4 = formattingPageRequestHandler$requestPage$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                formattingPageRequestHandler$requestPage$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = formattingPageRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formattingPageRequestHandler$requestPage$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager.ActivityPageHandler activityPageHandler = (ActivitiesManager.ActivityPageHandler) grpcMethod4.requestAdapter;
                    formattingPageRequestHandler$requestPage$1.L$0 = grpcMethod4;
                    formattingPageRequestHandler$requestPage$1.label = 1;
                    obj = activityPageHandler.requestPage(activityContext, pageOffset, formattingPageRequestHandler$requestPage$1);
                } else if (i == 1) {
                    grpcMethod4 = formattingPageRequestHandler$requestPage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    arrayList = formattingPageRequestHandler$requestPage$1.L$5;
                    activityPage = formattingPageRequestHandler$requestPage$1.L$3;
                    grpcMethod2 = formattingPageRequestHandler$requestPage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ArrayList zip = CollectionsKt.zip(arrayList, (Iterable) obj);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10));
                    activityPage2 = activityPage;
                    grpcMethod3 = grpcMethod2;
                    i2 = 0;
                    it = zip.iterator();
                    collection = arrayList2;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = formattingPageRequestHandler$requestPage$1.I$1;
                    i2 = formattingPageRequestHandler$requestPage$1.I$0;
                    collection = formattingPageRequestHandler$requestPage$1.L$12;
                    it = formattingPageRequestHandler$requestPage$1.L$8;
                    Collection collection2 = formattingPageRequestHandler$requestPage$1.L$7;
                    activityPage2 = formattingPageRequestHandler$requestPage$1.L$3;
                    grpcMethod3 = formattingPageRequestHandler$requestPage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    collection.add(obj);
                    collection = collection2;
                    if (!it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        PaymentHistoryActivityData paymentHistoryActivityData = (PaymentHistoryActivityData) pair.first;
                        ActivityFormattingResult activityFormattingResult = (ActivityFormattingResult) pair.second;
                        if (activityFormattingResult instanceof FormattedPaymentHistoryActivityItem) {
                            DeviceContactItemTransformer deviceContactItemTransformer = (DeviceContactItemTransformer) grpcMethod3.responseAdapter;
                            ActivityItemGlobalId activityItemGlobalId = paymentHistoryActivityData.getActivityItemGlobalId();
                            formattingPageRequestHandler$requestPage$1.L$0 = grpcMethod3;
                            formattingPageRequestHandler$requestPage$1.L$3 = activityPage2;
                            formattingPageRequestHandler$requestPage$1.L$5 = null;
                            Collection collection3 = collection;
                            formattingPageRequestHandler$requestPage$1.L$7 = collection3;
                            formattingPageRequestHandler$requestPage$1.L$8 = it;
                            formattingPageRequestHandler$requestPage$1.L$12 = collection3;
                            formattingPageRequestHandler$requestPage$1.I$0 = i2;
                            formattingPageRequestHandler$requestPage$1.I$1 = i3;
                            formattingPageRequestHandler$requestPage$1.label = 3;
                            obj = ((RealDeviceContactItemTransformer) deviceContactItemTransformer).transformActivityItem((FormattedPaymentHistoryActivityItem) activityFormattingResult, activityItemGlobalId, formattingPageRequestHandler$requestPage$1);
                            if (obj != coroutineSingletons) {
                                collection2 = collection;
                            }
                            return coroutineSingletons;
                        }
                        if (!(activityFormattingResult instanceof FormattingFailedActivityItem)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FormattingFailedActivityItem formattingFailedActivityItem = (FormattingFailedActivityItem) activityFormattingResult;
                        FormattingFailedPaymentHistoryActivityData formattingFailedPaymentHistoryActivityData = new FormattingFailedPaymentHistoryActivityData(formattingFailedActivityItem.getUiPayment(), formattingFailedActivityItem.getUiSender(), formattingFailedActivityItem.getUiRecipient(), formattingFailedActivityItem.isBadged(), formattingFailedActivityItem.getVersion(), formattingFailedActivityItem.getSection(), paymentHistoryActivityData.getActivityItemGlobalId(), formattingFailedActivityItem.getRowId(), formattingFailedActivityItem.getProductClassifiers());
                        collection2 = collection;
                        obj = formattingFailedPaymentHistoryActivityData;
                        collection.add(obj);
                        collection = collection2;
                        if (!it.hasNext()) {
                            return ActivitiesManager.ActivityPage.copy$default(activityPage2, (List) collection);
                        }
                    }
                }
                activityPage = (ActivitiesManager.ActivityPage) obj;
                if (activityPage != null) {
                    return null;
                }
                if (!(CollectionsKt.firstOrNull(activityPage.getActivities()) instanceof PaymentHistoryActivityData)) {
                    return activityPage;
                }
                List activities = activityPage.getActivities();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : activities) {
                    if (obj2 instanceof PaymentHistoryActivityData) {
                        arrayList3.add(obj2);
                    }
                }
                ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) grpcMethod4.path;
                formattingPageRequestHandler$requestPage$1.L$0 = grpcMethod4;
                formattingPageRequestHandler$requestPage$1.L$3 = activityPage;
                formattingPageRequestHandler$requestPage$1.L$5 = arrayList3;
                formattingPageRequestHandler$requestPage$1.label = 2;
                obj = JobKt.withContext(ziplineActivityItemFormatter.computationDispatcher, new NetworkFetcher$doFetch$2(ziplineActivityItemFormatter, arrayList3, continuation, 16), formattingPageRequestHandler$requestPage$1);
                if (obj != coroutineSingletons) {
                    grpcMethod2 = grpcMethod4;
                    arrayList = arrayList3;
                    ArrayList zip2 = CollectionsKt.zip(arrayList, (Iterable) obj);
                    ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip2, 10));
                    activityPage2 = activityPage;
                    grpcMethod3 = grpcMethod2;
                    i2 = 0;
                    it = zip2.iterator();
                    collection = arrayList22;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        formattingPageRequestHandler$requestPage$1 = new FormattingPageRequestHandler$requestPage$1(grpcMethod4, continuationImpl);
        Object obj3 = formattingPageRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formattingPageRequestHandler$requestPage$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        activityPage = (ActivitiesManager.ActivityPage) obj3;
        if (activityPage != null) {
        }
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        Object adapt = ((CallAdapter) this.requestAdapter).adapt(call);
        adapt.getClass();
        return new ApiResultCallAdapterFactory$get$3$adapt$1((Call) adapt, (CompletableFutureCallAdapterFactory) this.responseAdapter);
    }

    public void add(LayoutNode layoutNode, Invalidation invalidation) {
        MemoryCacheService memoryCacheService = (MemoryCacheService) this.path;
        MemoryCacheService memoryCacheService2 = (MemoryCacheService) this.requestAdapter;
        MemoryCacheService memoryCacheService3 = (MemoryCacheService) this.responseAdapter;
        int ordinal = invalidation.ordinal();
        if (ordinal == 0) {
            memoryCacheService.add(layoutNode);
            memoryCacheService3.add(layoutNode);
            return;
        }
        if (ordinal == 1) {
            memoryCacheService2.add(layoutNode);
            memoryCacheService3.add(layoutNode);
            return;
        }
        if (ordinal == 2) {
            if (layoutNode.lookaheadRoot != null) {
                memoryCacheService3.add(layoutNode);
                return;
            } else {
                memoryCacheService.add(layoutNode);
                return;
            }
        }
        if (ordinal != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else if (layoutNode.lookaheadRoot != null) {
            memoryCacheService3.add(layoutNode);
        } else {
            memoryCacheService2.add(layoutNode);
        }
    }

    public OneTimeWorkRequest build() {
        List split$default;
        OneTimeWorkRequest oneTimeWorkRequest = new OneTimeWorkRequest((UUID) this.path, (WorkSpec) this.requestAdapter, (Set) this.responseAdapter);
        Constraints constraints = ((WorkSpec) this.requestAdapter).constraints;
        boolean z = !constraints.contentUriTriggers.isEmpty() || constraints.requiresBatteryNotLow || constraints.requiresCharging || constraints.requiresDeviceIdle;
        WorkSpec workSpec = (WorkSpec) this.requestAdapter;
        if (workSpec.expedited) {
            if (z) {
                a$$ExternalSyntheticBUOutline0.m$3("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (workSpec.initialDelay > 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = workSpec.traceTag;
        if (str == null) {
            split$default = StringsKt__StringsKt.split$default(workSpec.workerClassName, new String[]{"."}, false, 0, 6, null);
            String str2 = split$default.size() == 1 ? (String) split$default.get(0) : (String) CollectionsKt.last(split$default);
            if (str2.length() > 127) {
                str2 = StringsKt___StringsKt.take(127, str2);
            }
            workSpec.traceTag = str2;
        } else if (str.length() > 127) {
            ((WorkSpec) this.requestAdapter).traceTag = StringsKt___StringsKt.take(127, str);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.path = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        WorkSpec workSpec2 = (WorkSpec) this.requestAdapter;
        workSpec2.getClass();
        this.requestAdapter = new WorkSpec(uuid, workSpec2.state, workSpec2.workerClassName, workSpec2.inputMergerClassName, new Data(workSpec2.input), new Data(workSpec2.output), workSpec2.initialDelay, workSpec2.intervalDuration, workSpec2.flexDuration, new Constraints(workSpec2.constraints), workSpec2.runAttemptCount, workSpec2.backoffPolicy, workSpec2.backoffDelayDuration, workSpec2.lastEnqueueTime, workSpec2.minimumRetentionDuration, workSpec2.scheduleRequestedAt, workSpec2.expedited, workSpec2.outOfQuotaPolicy, workSpec2.periodCount, workSpec2.nextScheduleTimeOverride, workSpec2.nextScheduleTimeOverrideGeneration, workSpec2.stopReason, workSpec2.traceTag, workSpec2.backOffOnSystemInterruptions, PKIFailureInfo.signerNotTrusted);
        return oneTimeWorkRequest;
    }

    public int canAuthenticateWithFingerprint() {
        zzh zzhVar = (zzh) this.responseAdapter;
        if (zzhVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        zzhVar.getClass();
        return 12;
    }

    public boolean contains(LayoutNode layoutNode) {
        return !(layoutNode.lookaheadRoot == null) && (((SortedSet) ((MemoryCacheService) this.path).imageLoader).contains(layoutNode) || ((SortedSet) ((MemoryCacheService) this.requestAdapter).imageLoader).contains(layoutNode));
    }

    public void failWrite(FileOutputStream fileOutputStream) {
        File file = (File) this.requestAdapter;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchOnboardingConfig(ContinuationImpl continuationImpl) {
        RealOnboardingConfigManager$fetchOnboardingConfig$1 realOnboardingConfigManager$fetchOnboardingConfig$1;
        int i;
        Country guessCountry;
        ApiResult apiResult;
        if (continuationImpl instanceof RealOnboardingConfigManager$fetchOnboardingConfig$1) {
            realOnboardingConfigManager$fetchOnboardingConfig$1 = (RealOnboardingConfigManager$fetchOnboardingConfig$1) continuationImpl;
            int i2 = realOnboardingConfigManager$fetchOnboardingConfig$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOnboardingConfigManager$fetchOnboardingConfig$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOnboardingConfigManager$fetchOnboardingConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOnboardingConfigManager$fetchOnboardingConfig$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SemaphoreService semaphoreService = (SemaphoreService) this.path;
                    RealRegionProvider realRegionProvider = (RealRegionProvider) this.requestAdapter;
                    Region region = realRegionProvider.profileRegion;
                    if (region != null) {
                        guessCountry = Regions.toCountry(region);
                    } else {
                        Country country = (Country) realRegionProvider.country.blockingGet();
                        guessCountry = country == null ? realRegionProvider.guessCountry() : country;
                    }
                    GetOnboardingConfigRequest getOnboardingConfigRequest = new GetOnboardingConfigRequest(guessCountry, ByteString.EMPTY);
                    realOnboardingConfigManager$fetchOnboardingConfig$1.label = 1;
                    obj = semaphoreService.getOnboardingConfig(getOnboardingConfigRequest, realOnboardingConfigManager$fetchOnboardingConfig$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    List list = ((GetOnboardingConfigResponse) ((ApiResult.Success) apiResult).response).feature_flags;
                    if (list.isEmpty()) {
                        Timber.Forest.e(new Exception("Received empty login feature flags from onboarding config response."));
                    }
                    RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler = (RealLoginFeatureFlagsHandler) this.responseAdapter;
                    realOnboardingConfigManager$fetchOnboardingConfig$1.label = 2;
                    Object withContext = JobKt.withContext(realLoginFeatureFlagsHandler.ioDispatcher, new RealGcmRegistrar$unregister$2(realLoginFeatureFlagsHandler, list, continuation, 18), realOnboardingConfigManager$fetchOnboardingConfig$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realOnboardingConfigManager$fetchOnboardingConfig$1 = new RealOnboardingConfigManager$fetchOnboardingConfig$1(this, continuationImpl);
        Object obj2 = realOnboardingConfigManager$fetchOnboardingConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOnboardingConfigManager$fetchOnboardingConfig$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    public void finishWrite(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        rename((File) this.requestAdapter, (File) this.path);
    }

    public Object get() {
        long currentThreadId = Expect_jvmKt.currentThreadId();
        if (currentThreadId == Thread_androidKt.MainThreadId) {
            return this.responseAdapter;
        }
        ThreadMap threadMap = (ThreadMap) ((AtomicReference) this.path).get();
        int find = threadMap.find(currentThreadId);
        if (find >= 0) {
            return threadMap.values[find];
        }
        return null;
    }

    public Canvas getCanvas() {
        return ((CanvasDrawScope) this.responseAdapter).drawParams.canvas;
    }

    public ColorStateList getColorStateList(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.requestAdapter;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = Strings.getColorStateList((Context) this.path, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (((Trifle) this.responseAdapter)) {
            try {
                LocaleList localeList2 = (LocaleList) this.requestAdapter;
                if (localeList2 != null && localeList == ((android.os.LocaleList) this.path)) {
                    return localeList2;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new Locale(localeList.get(i)));
                }
                LocaleList localeList3 = new LocaleList(arrayList);
                this.path = localeList;
                this.requestAdapter = localeList3;
                return localeList3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Density getDensity() {
        return ((CanvasDrawScope) this.responseAdapter).drawParams.density;
    }

    public Drawable getDrawable(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.requestAdapter;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : DimensionKt.getDrawable((Context) this.path, resourceId);
    }

    public Drawable getDrawableIfKnown(int i) {
        int resourceId;
        Drawable drawable;
        if (!((TypedArray) this.requestAdapter).hasValue(i) || (resourceId = ((TypedArray) this.requestAdapter).getResourceId(i, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        Context context = (Context) this.path;
        synchronized (appCompatDrawableManager) {
            drawable = appCompatDrawableManager.mResourceManager.getDrawable(context, resourceId, true);
        }
        return drawable;
    }

    public Typeface getFont(int i, int i2, AppCompatTextHelper.AnonymousClass1 anonymousClass1) {
        int resourceId = ((TypedArray) this.requestAdapter).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.responseAdapter) == null) {
            this.responseAdapter = new TypedValue();
        }
        return ResourcesCompat.getFont((Context) this.path, resourceId, (TypedValue) this.responseAdapter, i2, anonymousClass1);
    }

    public LayoutDirection getLayoutDirection() {
        return ((CanvasDrawScope) this.responseAdapter).drawParams.layoutDirection;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public long m3999getSizeNHjbRc() {
        return ((CanvasDrawScope) this.responseAdapter).drawParams.size;
    }

    public boolean isNotEmpty() {
        return !(((SortedSet) ((MemoryCacheService) this.path).imageLoader).isEmpty() && ((SortedSet) ((MemoryCacheService) this.responseAdapter).imageLoader).isEmpty() && ((SortedSet) ((MemoryCacheService) this.requestAdapter).imageLoader).isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void perform(AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken) {
        appMessageActionTaken.getClass();
        Timber.Forest.d("Action tapped: " + appMessageActionTaken, new Object[0]);
        JobKt.launch$default((CoroutineScope) this.requestAdapter, null, null, new MLKitTitleGenerator$prepareModel$1(this, appMessageActionTaken, null, 10), 3);
        RealRouter realRouter = (RealRouter) this.responseAdapter;
        String url = appMessageActionTaken.getUrl();
        AnalyticsParams.InAppNotificationParams inAppNotificationParams = new AnalyticsParams.InAppNotificationParams(appMessageActionTaken.getMessageToken());
        realRouter.route(new RoutingParams(null, 0 == true ? 1 : 0, appMessageActionTaken.getExitScreen(), null, inAppNotificationParams, null, 471), url);
    }

    public byte[] readFully() {
        File file = (File) this.requestAdapter;
        File file2 = (File) this.path;
        File file3 = (File) this.responseAdapter;
        if (file3.exists()) {
            rename(file3, file2);
        }
        if (file.exists() && file2.exists() && !file.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + file);
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            int i = 0;
            while (true) {
                int read = fileInputStream.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = fileInputStream.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStream.close();
        }
    }

    public void recycle() {
        ((TypedArray) this.requestAdapter).recycle();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    public Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        return requestPage$suspendImpl(this, activityContext, pageOffset, (ContinuationImpl) continuation);
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return (Type) this.path;
    }

    public void set(Object obj) {
        long currentThreadId = Expect_jvmKt.currentThreadId();
        if (currentThreadId == Thread_androidKt.MainThreadId) {
            this.responseAdapter = obj;
            return;
        }
        synchronized (this.requestAdapter) {
            ThreadMap threadMap = (ThreadMap) ((AtomicReference) this.path).get();
            int find = threadMap.find(currentThreadId);
            if (find < 0) {
                ((AtomicReference) this.path).set(threadMap.newWith(obj, currentThreadId));
            } else {
                threadMap.values[find] = obj;
            }
        }
    }

    public void setCanvas(Canvas canvas) {
        ((CanvasDrawScope) this.responseAdapter).drawParams.canvas = canvas;
    }

    public void setDensity(Density density) {
        ((CanvasDrawScope) this.responseAdapter).drawParams.density = density;
    }

    public void setInitialDelay(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        ((WorkSpec) this.requestAdapter).initialDelay = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > ((WorkSpec) this.requestAdapter).initialDelay) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("The given initial delay is too large and will cause an overflow!");
    }

    public void setKeySizeBytes(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.path = Integer.valueOf(i);
    }

    public void setLayoutDirection(LayoutDirection layoutDirection) {
        ((CanvasDrawScope) this.responseAdapter).drawParams.layoutDirection = layoutDirection;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m4000setSizeuvyYCjk(long j) {
        ((CanvasDrawScope) this.responseAdapter).drawParams.size = j;
    }

    public void setTagSizeBytes(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.requestAdapter = Integer.valueOf(i);
    }

    public FileOutputStream startWrite() {
        File file = (File) this.requestAdapter;
        File file2 = (File) this.responseAdapter;
        if (file2.exists()) {
            rename(file2, (File) this.path);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                a$$ExternalSyntheticBUOutline0.m$3(file, "Failed to create directory for ");
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public void unregister() {
        MutableScatterMap mutableScatterMap = (MutableScatterMap) this.requestAdapter;
        String str = (String) this.path;
        List list = (List) mutableScatterMap.remove(str);
        if (list != null) {
            list.remove((Function0) this.responseAdapter);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        mutableScatterMap.set(str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidSystemCallbacks zza() {
        String substring;
        int i;
        zznv zznvVar;
        zznv zznvVar2;
        String str;
        zznd zzndVar;
        String str2 = (String) this.path;
        zzlk zzlkVar = (zzlk) this.requestAdapter;
        Supplier supplier = zzlkVar.zzl;
        if (!zzky.zzi(zzlkVar.zzh)) {
            return new AndroidSystemCallbacks(zzqv.zzi(), new NestedScrollingParentHelper(3, 17));
        }
        if (zza == null) {
            zza = Boolean.valueOf(Process.isIsolated());
        }
        if (zza.booleanValue()) {
            return new AndroidSystemCallbacks(zzqv.zzi(), new NestedScrollingParentHelper(3, 18));
        }
        zzqn zzc = zzlkVar.zzm.zzc();
        zzacr zzacrVar = zzc.zzc;
        zzabz zzabzVar = zzabz.FILE;
        ArrayMap arrayMap = zzlg.zzb;
        int indexOf = str2.indexOf("#");
        boolean z = false;
        if (indexOf >= 0) {
            substring = str2.substring(0, indexOf);
        } else {
            if (str2.contains("@")) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid package name: ".concat(str2));
                return null;
            }
            substring = str2;
        }
        if (!zzc.zzh) {
            i = 14;
        } else if (!zzc.zza || !zzc.zzb.contains(zzabzVar)) {
            i = 3;
        } else if (zzacrVar.zzb() != 0) {
            List list = zzc.zzf;
            i = (list.isEmpty() || list.contains(substring)) ? zzc.zzg.contains(substring) ? 6 : 0 : 5;
        } else {
            i = 4;
        }
        if (i != 0) {
            zznvVar2 = new zznv(null, new NestedScrollingParentHelper(i));
        } else {
            try {
                str = zzc.zze;
            } catch (Exception e) {
                zzlf.zzc(Level.WARNING, zzlkVar.zzg(), e, "Failed to read shared file for %s", str2);
                zznvVar = new zznv(zznd.zza, new NestedScrollingParentHelper(3, 10));
            }
            if (str.isEmpty()) {
                Optional optional = (Optional) zzlkVar.zzn.get();
                if (optional.isPresent()) {
                    str = ((ApplicationInfo) optional.get()).dataDir;
                } else {
                    zzlf.zzc(Level.WARNING, zzlkVar.zzg(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                    zznvVar = new zznv(zznd.zza, new NestedScrollingParentHelper(3, 7));
                    zznvVar2 = zznvVar;
                }
            }
            String str3 = File.separator;
            String str4 = zzc.zzd;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append(str);
            sb.append(str3);
            sb.append(str4);
            String sb2 = sb.toString();
            zzah zzahVar = new zzah(zzacrVar, str2);
            Uri.Builder scheme = new Uri.Builder().scheme("file");
            String obj = zzahVar.zza().toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + sb2.length() + String.valueOf(str3).length() + obj.length());
            sb3.append(str3);
            sb3.append(sb2);
            sb3.append(str3);
            sb3.append(obj);
            Uri build = scheme.appendEncodedPath(sb3.toString()).build();
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            try {
                try {
                    try {
                        zznvVar2 = new zznv((zznd) ((zzru) supplier.get()).zza(build, new VorbisUtil$Mode(zzc.zzk.zza(), z)), new NestedScrollingParentHelper(5, 2));
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (FileNotFoundException unused) {
                    zzlf.zzc(Level.INFO, zzlkVar.zzg(), null, "Shared storage file not found for %s", str2);
                    zznvVar2 = new zznv(null, new NestedScrollingParentHelper(8));
                    NestedScrollingParentHelper nestedScrollingParentHelper = zznvVar2.zzb;
                    zzndVar = zznvVar2.zza;
                    if (zzndVar != null) {
                    }
                }
            } catch (zzaeh e2) {
                zzlf.zzc(Level.SEVERE, zzlkVar.zzg(), e2, "Failed to parse snapshot from shared storage for %s", str2);
                zznvVar2 = new zznv(null, new NestedScrollingParentHelper(9));
                NestedScrollingParentHelper nestedScrollingParentHelper2 = zznvVar2.zzb;
                zzndVar = zznvVar2.zza;
                if (zzndVar != null) {
                }
            }
        }
        NestedScrollingParentHelper nestedScrollingParentHelper22 = zznvVar2.zzb;
        zzndVar = zznvVar2.zza;
        if (zzndVar != null) {
            return new AndroidSystemCallbacks(zzndVar, nestedScrollingParentHelper22);
        }
        int i2 = nestedScrollingParentHelper22.mNestedScrollAxesNonTouch;
        try {
            zzru zzruVar = (zzru) supplier.get();
            Uri uri = (Uri) this.responseAdapter;
            zzafj zzafjVar = (zzafj) zzqv.zzi().zzg(7);
            zzadf zzadfVar = zzadf.zzd;
            int i3 = zzacf.$r8$clinit;
            zzadf zzadfVar2 = zzadf.zza;
            InputStream zzc2 = zzlf.zzc(zzruVar.zze(uri));
            try {
                zzadu zza2 = ((zzadq) zzafjVar).zza(zzc2, zzadfVar2);
                if (zzc2 != null) {
                    zzc2.close();
                }
                return new AndroidSystemCallbacks((zzqv) zza2, new NestedScrollingParentHelper(4, i2));
            } finally {
            }
        } catch (IOException | RuntimeException unused2) {
            zzlf.zzc(Level.INFO, zzlkVar.zzg(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str2);
            return zzb() ? new AndroidSystemCallbacks(zznd.zza, new NestedScrollingParentHelper(3, 16)) : new AndroidSystemCallbacks(zzqv.zzi(), new NestedScrollingParentHelper(3, 11));
        }
    }

    public boolean zzb() {
        zzni zzg = ((zzlk) this.requestAdapter).zzm.zzg();
        return zzg.zzc() && ((AbstractCollection) zzg.zzi()).contains(zzabz.FILE);
    }

    public static GrpcMethod obtainStyledAttributes(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new GrpcMethod(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public GrpcMethod(String str, ProtoAdapter protoAdapter, ProtoAdapter protoAdapter2) {
        protoAdapter.getClass();
        protoAdapter2.getClass();
        this.path = str;
        this.requestAdapter = protoAdapter;
        this.responseAdapter = protoAdapter2;
    }

    public /* synthetic */ GrpcMethod(Object obj, Object obj2, Object obj3) {
        this.path = obj;
        this.requestAdapter = obj2;
        this.responseAdapter = obj3;
    }

    public GrpcMethod(File file) {
        this.path = file;
        this.requestAdapter = new File(file.getPath() + ".new");
        this.responseAdapter = new File(file.getPath() + ".bak");
    }

    public GrpcMethod(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.path = randomUUID;
        String uuid = ((UUID) this.path).toString();
        uuid.getClass();
        this.requestAdapter = new WorkSpec(uuid, (WorkInfo.State) null, cls.getName(), (String) null, (Data) null, (Data) null, 0L, 0L, 0L, (Constraints) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.responseAdapter = SetsKt__SetsKt.mutableSetOf(cls.getName());
    }

    public GrpcMethod(Context context, TypedArray typedArray) {
        this.path = context;
        this.requestAdapter = typedArray;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesCmacParameters m4001build() {
        Integer num = (Integer) this.path;
        if (num != null) {
            if (((Integer) this.requestAdapter) != null) {
                if (((AesCmacParameters.Variant) this.responseAdapter) != null) {
                    return new AesCmacParameters(num.intValue(), ((Integer) this.requestAdapter).intValue(), (AesCmacParameters.Variant) this.responseAdapter);
                }
                a$$ExternalSyntheticBUOutline0.m$6("variant not set");
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$6("tag size not set");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("key size not set");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zza(zzacr zzacrVar, Set set, String str) {
        zzok[] zzokVarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.path).getAndSet(true)) {
            zzj.zza().zzb(new zztw(11));
        }
        final byte[] zzm = zzacrVar.zzm();
        ((ConcurrentHashMap) this.requestAdapter).compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.zzoi
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = zzm;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.responseAdapter).putIfAbsent((String) it.next(), new AtomicReference(new zzok(str, zzm)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof zzok) {
                        zzok zzokVar = (zzok) obj;
                        if (str.equals(zzokVar.zza())) {
                            zzokVar.zzb(zzm);
                            break;
                        }
                        zzok zzokVar2 = new zzok(str, zzm);
                        zzokVarArr = str.compareTo(zzokVar.zza()) < 0 ? new zzok[]{zzokVar2, zzokVar} : new zzok[]{zzokVar, zzokVar2};
                        while (!atomicReference.compareAndSet(obj, zzokVarArr)) {
                            if (atomicReference.get() != obj) {
                                break;
                            }
                        }
                    } else {
                        zzok[] zzokVarArr2 = (zzok[]) obj;
                        int binarySearch = Arrays.binarySearch(zzokVarArr2, str);
                        if (binarySearch >= 0) {
                            zzokVarArr2[binarySearch].zzb(zzm);
                            break;
                        }
                        int i = ~binarySearch;
                        int length = zzokVarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            zzokVarArr = (zzok[]) Arrays.copyOf(zzokVarArr2, i2);
                        } else {
                            zzok[] zzokVarArr3 = new zzok[i2];
                            System.arraycopy(zzokVarArr2, 0, zzokVarArr3, 0, i);
                            System.arraycopy(zzokVarArr2, i, zzokVarArr3, i + 1, i3);
                            zzokVarArr = zzokVarArr3;
                        }
                        zzokVarArr[i] = new zzok(str, zzm);
                        while (!atomicReference.compareAndSet(obj, zzokVarArr)) {
                        }
                    }
                }
            }
        }
    }
}
