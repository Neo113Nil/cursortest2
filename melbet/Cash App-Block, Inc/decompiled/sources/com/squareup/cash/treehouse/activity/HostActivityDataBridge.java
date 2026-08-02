package com.squareup.cash.treehouse.activity;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.zipline.ZiplineManifest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.backend.ActivityZiplineManifestWatcher;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.treehouse.ActivityTreehouseCompatibility$Method;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class HostActivityDataBridge implements ActivityDataBridge {
    public final ReadonlyStateFlow delegateFlow;
    public final ImageLoader$Builder$$ExternalSyntheticLambda1 manifestProvider;
    public final RealTreehouseApp treehouseApp;

    public HostActivityDataBridge(RealTreehouseApp realTreehouseApp, ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1, CoroutineScope coroutineScope) {
        realTreehouseApp.getClass();
        this.treehouseApp = realTreehouseApp;
        this.manifestProvider = imageLoader$Builder$$ExternalSyntheticLambda1;
        this.delegateFlow = FlowKt.stateIn(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realTreehouseApp.codeHost.mutableZipline, 20), coroutineScope, SharingStarted.Companion.Eagerly, null);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object applyDynamicFormatting(SerializableActivityItem serializableActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem, String str, ContinuationImpl continuationImpl) {
        return withDelegate(new TaxWebAppPresenter$models$1$1(serializableActivityItem, serializableRenderedActivityItem, str, (Continuation) null, 25), continuationImpl);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object cacheActivityItemAndCheckEnrichedReceipt(SerializableActivityItem serializableActivityItem, Continuation continuation) {
        return withDelegate(new HostActivityDataBridge$setCachedActivityItem$4(serializableActivityItem, null, 1), continuation);
    }

    public final boolean canUse(ActivityTreehouseCompatibility$Method activityTreehouseCompatibility$Method) {
        Map metadata;
        String str;
        ZiplineManifest ziplineManifest = ((ActivityZiplineManifestWatcher) this.manifestProvider.f$0).latestZiplineManifest;
        if (Intrinsics.areEqual(ziplineManifest != null ? ziplineManifest.getVersion() : null, "local")) {
            return true;
        }
        return (ziplineManifest == null || (metadata = ziplineManifest.getMetadata()) == null || (str = (String) metadata.get("committed_at")) == null || activityTreehouseCompatibility$Method.getMinTimestamp().compareTo(str) >= 0) ? false : true;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object format(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        return withDelegate(new WorkflowLayout$start$1(str, str2, str3, str4, (Continuation) null, 10), continuationImpl);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object getCachedActivityItem(SuspendLambda suspendLambda) {
        return withDelegate(new RealTabProvider$setup$1$5(10), suspendLambda);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object offlinePaymentHistoryData(String str, ContinuationImpl continuationImpl) {
        return withDelegate(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 3), continuationImpl);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object offlineTransferHistoryData(String str, ContinuationImpl continuationImpl) {
        return withDelegate(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 4), continuationImpl);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setCachedActivityItem(ByteString byteString, Continuation continuation) {
        Object withDelegate = withDelegate(new TaxWebAppBridge.AnonymousClass3(byteString, null, 17), continuation);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setCachedActivityItemFromInitiatePaymentRequest(ByteString byteString, String str, long j, Continuation continuation) {
        Object withDelegate = withDelegate(new RepeatOnIntervalTaskRunner$repeatOn$2(byteString, str, j, (Continuation) null, 15), continuation);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setCachedActivityItemFromTransferFundsRequest(ByteString byteString, long j, Continuation continuation) {
        Object withDelegate = withDelegate(new ToastKt$Toast$8$1(byteString, j, (Continuation) null, 12), continuation);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setNativeActivityFlowToken(String str, ContinuationImpl continuationImpl) {
        Object withDelegate = withDelegate(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 5), continuationImpl);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setNativeQueryToken(String str, ContinuationImpl continuationImpl) {
        Object withDelegate = withDelegate(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 0), continuationImpl);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setNativeSearchFlowToken(String str, ContinuationImpl continuationImpl) {
        Object withDelegate = withDelegate(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 6), continuationImpl);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object withDelegate(Function2 function2, Continuation continuation) {
        HostActivityDataBridge$withDelegate$1 hostActivityDataBridge$withDelegate$1;
        int i;
        Function2 function22;
        if (continuation instanceof HostActivityDataBridge$withDelegate$1) {
            hostActivityDataBridge$withDelegate$1 = (HostActivityDataBridge$withDelegate$1) continuation;
            int i2 = hostActivityDataBridge$withDelegate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                hostActivityDataBridge$withDelegate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = hostActivityDataBridge$withDelegate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hostActivityDataBridge$withDelegate$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(20, DurationUnit.SECONDS);
                    ExoPlayerVideoView.AnonymousClass2 anonymousClass2 = new ExoPlayerVideoView.AnonymousClass2(this, continuation2, 11);
                    hostActivityDataBridge$withDelegate$1.L$0 = (SuspendLambda) function2;
                    hostActivityDataBridge$withDelegate$1.label = 1;
                    obj = JobKt.m4184withTimeoutKLykuaI(duration, anonymousClass2, hostActivityDataBridge$withDelegate$1);
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) hostActivityDataBridge$withDelegate$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function22 = function23;
                }
                ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = this.treehouseApp.dispatchers.zipline;
                TaxWebAppBridge.AnonymousClass3 anonymousClass3 = new TaxWebAppBridge.AnonymousClass3(function22, (ActivityDataBridge) obj, continuation2, 18);
                hostActivityDataBridge$withDelegate$1.L$0 = null;
                hostActivityDataBridge$withDelegate$1.label = 2;
                Object withContext = JobKt.withContext(executorCoroutineDispatcherImpl, anonymousClass3, hostActivityDataBridge$withDelegate$1);
                return withContext != coroutineSingletons ? coroutineSingletons : withContext;
            }
        }
        hostActivityDataBridge$withDelegate$1 = new HostActivityDataBridge$withDelegate$1(this, continuation);
        Object obj2 = hostActivityDataBridge$withDelegate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hostActivityDataBridge$withDelegate$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl2 = this.treehouseApp.dispatchers.zipline;
        TaxWebAppBridge.AnonymousClass3 anonymousClass32 = new TaxWebAppBridge.AnonymousClass3(function22, (ActivityDataBridge) obj2, continuation22, 18);
        hostActivityDataBridge$withDelegate$1.L$0 = null;
        hostActivityDataBridge$withDelegate$1.label = 2;
        Object withContext2 = JobKt.withContext(executorCoroutineDispatcherImpl2, anonymousClass32, hostActivityDataBridge$withDelegate$1);
        if (withContext2 != coroutineSingletons2) {
        }
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object applyDynamicFormatting(SerializableActivityItem serializableActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem, ContinuationImpl continuationImpl) {
        return applyDynamicFormatting(serializableActivityItem, serializableRenderedActivityItem, null, continuationImpl);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object format(SerializableActivityItem serializableActivityItem, String str, Continuation continuation) {
        return withDelegate(new TaxWebAppBridge.AnonymousClass4(serializableActivityItem, str, (Continuation) null, 27), continuation);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object format(List list, Continuation continuation) {
        return format((String) null, list, continuation);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object format(String str, List list, Continuation continuation) {
        return withDelegate(new TaxWebAppBridge.AnonymousClass4(list, str, (Continuation) null, 28), continuation);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object format(SerializableActivityItem serializableActivityItem, Continuation continuation) {
        return format(serializableActivityItem, (String) null, continuation);
    }

    @Override // com.squareup.cash.treehouse.activity.ActivityDataBridge
    public final Object setCachedActivityItem(SerializableActivityItem serializableActivityItem, Continuation continuation) {
        Object withDelegate = withDelegate(new HostActivityDataBridge$setCachedActivityItem$4(serializableActivityItem, null, 0), continuation);
        return withDelegate == CoroutineSingletons.COROUTINE_SUSPENDED ? withDelegate : Unit.INSTANCE;
    }
}
