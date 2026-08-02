package com.squareup.cash.util.cache;

import android.app.Activity;
import android.os.Build;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.work.ListenableWorker;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ScreenshotBugReporting;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentActionComplete;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager$1$1$emit$1;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.payments.common.RealPaymentListener;
import com.squareup.cash.payments.common.RealPaymentListener$onPaymentEnded$1;
import com.squareup.cash.security.backend.impl.RealPasswordManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SignoutSideEffectsPerformer;
import com.squareup.cash.session.backend.SyncState$Progress;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.shortcut.RealDynamicShortcutManager;
import com.squareup.cash.storage.ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1;
import com.squareup.cash.storage.ActiveStorageLinkFlowKt$activeStorageLinkFlow$3$1;
import com.squareup.cash.storage.SandboxingAnalyticsLogger;
import com.squareup.cash.storage.StorageLinkState;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor$setup$1$1$1;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor$setup$1$1$2;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.backend.real.RecordedTranscript;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.ui.ScreenshotReportingManager;
import com.squareup.cash.ui.ScreenshotReportingManager$initialize$3$1;
import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.userjourneys.tracker.JourneySelector$$ExternalSyntheticLambda0;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.Signal;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.workers.CardAppletWorker;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.postcard.app.RefreshCardTabSchemeRequest;
import com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.util.workmanager.SandboxedWork;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.Perfs$$ExternalSyntheticLambda2;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class Cache {
    public Object cache;
    public final Flow signOut;

    public Cache(Flow flow, CoroutineScope coroutineScope) {
        this.signOut = flow;
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this, null, 0), 3);
    }

    public final void set(Object obj) {
        obj.getClass();
        this.cache = obj;
    }

    /* renamed from: com.squareup.cash.util.cache.Cache$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((Cache) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass1((RealActivityPaymentManager) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass1((RealPaymentListener) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((RealPasswordManager) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1((TimeToLiveSyncState) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass1((DerivedStateFlow) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass1((RealSupportPhoneVerificationMonitor) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass1((RealPendingMessagesStore) obj2, continuation, 7);
                case 8:
                    return new AnonymousClass1((ScreenshotReportingManager) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass1((RealUserJourneySignalProcessor) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass1((RealCardAppletTileRepository) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass1((CardAppletWorker) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass1((SandboxedCoroutineWorker) obj2, continuation, 12);
                default:
                    return new AnonymousClass1((Flow) obj2, continuation, 13);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 5:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 11:
                    ((AnonymousClass1) create((SessionState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
        
            if (r12 != r5) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0175, code lost:
        
            if (com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor.access$handleTerminateStaleJourneys(r6, r13, r12) == r5) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
        
            if (r13 != r5) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0158, code lost:
        
            if (com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor.access$handleRetryCompletedJourneys(r6, r13, r12) == r5) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0144, code lost:
        
            if (r13 == r5) goto L91;
         */
        /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object collect;
            Object refreshCardTabScheme;
            List list;
            int i = this.$r8$classId;
            int i2 = 4;
            int i3 = 5;
            int i4 = 2;
            int i5 = 3;
            boolean z = false;
            z = false;
            Object obj2 = this.this$0;
            int i6 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Cache cache = (Cache) obj2;
                        Flow flow = cache.signOut;
                        C00671 c00671 = new C00671(cache, z ? 1 : 0);
                        this.label = 1;
                        if (flow.collect(c00671, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealActivityPaymentManager realActivityPaymentManager = (RealActivityPaymentManager) obj2;
                    SharedFlowImpl sharedFlowImpl = realActivityPaymentManager.paymentActionCompletionDispatcher.completedPaymentActions;
                    C00671 c006712 = new C00671(realActivityPaymentManager, i6);
                    this.label = 1;
                    sharedFlowImpl.collect(c006712, this);
                    return coroutineSingletons2;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealPaymentListener realPaymentListener = (RealPaymentListener) obj2;
                    SharedFlowImpl sharedFlowImpl2 = ((RealPaymentManager) realPaymentListener.paymentManager).paymentActions;
                    C00671 c006713 = new C00671(realPaymentListener, i4);
                    this.label = 1;
                    sharedFlowImpl2.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(c006713, 27), this);
                    return coroutineSingletons3;
                case 3:
                    RealPasswordManager realPasswordManager = (RealPasswordManager) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    DerivedStateFlow mapState = StateFlowKt.mapState(realPasswordManager.syncValueReader.getSingleValue(AndroidSyncValueSpecs.PasswordInfo), new MainActivity$$ExternalSyntheticLambda5(17));
                    C00671 c006714 = new C00671(realPasswordManager, i5);
                    this.label = 1;
                    mapState.collect(new FlowKt__MergeKt$flattenConcat$1$1(c006714, 16), this);
                    return coroutineSingletons4;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) obj2;
                        Flow flow2 = timeToLiveSyncState.signOut;
                        C00671 c006715 = new C00671(timeToLiveSyncState, i3);
                        this.label = 1;
                        if (flow2.collect(c006715, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    ((DerivedStateFlow) obj2).collect(ActiveStorageLinkFlowKt$activeStorageLinkFlow$3$1.INSTANCE, this);
                    return coroutineSingletons6;
                case 6:
                    RealSupportPhoneVerificationMonitor realSupportPhoneVerificationMonitor = (RealSupportPhoneVerificationMonitor) obj2;
                    SessionManager sessionManager = realSupportPhoneVerificationMonitor.sessionManager;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow safeFlow = new SafeFlow(new CoroutinesKt$until$2(new Flow[]{PlatformKt.getOnAuthenticated(sessionManager), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(sessionManager.getOnboardedAccountStatus(), 15)}, (Continuation) null, new RealSupportPhoneVerificationMonitor$setup$1$1$1(realSupportPhoneVerificationMonitor, null)));
                        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = FlowKt.defaultKeySelector;
                        RealSupportPhoneVerificationMonitor$setup$1$1$2 realSupportPhoneVerificationMonitor$setup$1$1$2 = RealSupportPhoneVerificationMonitor$setup$1$1$2.INSTANCE;
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, realSupportPhoneVerificationMonitor$setup$1$1$2);
                        DistinctFlowImpl distinctUntilChangedBy$FlowKt__DistinctKt = FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(safeFlow, saversKt$$ExternalSyntheticLambda2, realSupportPhoneVerificationMonitor$setup$1$1$2);
                        CoroutinesKt$until$2 coroutinesKt$until$2 = new CoroutinesKt$until$2(realSupportPhoneVerificationMonitor, continuation, 7);
                        this.label = 1;
                        if (FlowKt.collectLatest(distinctUntilChangedBy$FlowKt__DistinctKt, coroutinesKt$until$2, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    RealPendingMessagesStore realPendingMessagesStore = (RealPendingMessagesStore) obj2;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = realPendingMessagesStore.recordedMessagesStore.state;
                    C00671 c006716 = new C00671(realPendingMessagesStore, 8);
                    this.label = 1;
                    stateFlowImpl.collect(new FlowKt__MergeKt$flattenConcat$1$1(new FlowKt__MergeKt$flattenConcat$1$1(c006716, i2), i5), this);
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons8;
                case 8:
                    ScreenshotReportingManager screenshotReportingManager = (ScreenshotReportingManager) obj2;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(screenshotReportingManager.currentActivityFlow, ((RealFeatureFlagManager) screenshotReportingManager.featureFlagManager).peekValues(LaunchDarklyFeatureFlags$ScreenshotBugReporting.INSTANCE), new ScreenshotReportingManager$initialize$3$1(i5, continuation, z ? 1 : 0), z ? 1 : 0));
                        C00671 c006717 = new C00671(screenshotReportingManager, 10);
                        this.label = 1;
                        if (distinctUntilChanged.collect(c006717, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    RealUserJourneySignalProcessor realUserJourneySignalProcessor = (RealUserJourneySignalProcessor) obj2;
                    RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        obj = realUserJourneyRepository.getCompletedUserJourneys(this);
                        break;
                    } else if (i16 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i16 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 3;
                        obj = realUserJourneyRepository.removeStaleJourneys(this);
                        break;
                    } else if (i16 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        Set set = (Set) obj;
                        if (!set.isEmpty()) {
                            this.label = 4;
                            break;
                        }
                        this.label = 5;
                        collect = FlowKt.receiveAsFlow(realUserJourneySignalProcessor.signalQueue).collect(new C00671(realUserJourneySignalProcessor, 11), this);
                        if (collect != coroutineSingletons12) {
                        }
                    } else if (i16 == 4) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 5;
                        collect = FlowKt.receiveAsFlow(realUserJourneySignalProcessor.signalQueue).collect(new C00671(realUserJourneySignalProcessor, 11), this);
                        if (collect != coroutineSingletons12) {
                            collect = Unit.INSTANCE;
                            break;
                        }
                    } else {
                        if (i16 == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set2 = (Set) obj;
                    if (!set2.isEmpty()) {
                        this.label = 2;
                        break;
                    }
                    this.label = 3;
                    obj = realUserJourneyRepository.removeStaleJourneys(this);
                    break;
                case 10:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealCardAppletTileRepository realCardAppletTileRepository = (RealCardAppletTileRepository) obj2;
                        this.label = 1;
                        SyncTopic syncTopic = realCardAppletTileRepository.cardTopic;
                        ClientSyncConfig clientSyncConfig = (ClientSyncConfig) realCardAppletTileRepository.syncValueReader.getSingleValue(AndroidSyncValueSpecs.ClientSyncConfig).getValue();
                        if (clientSyncConfig != null && (list = clientSyncConfig.topic_sync_allowlist) != null) {
                            z = list.contains(new Integer(syncTopic.value));
                        }
                        if (z) {
                            refreshCardTabScheme = realCardAppletTileRepository.clientSyncer.sync(SyncTrigger.USER_ACTION, SetsKt__SetsJVMKt.setOf(syncTopic)).awaitInternal(this);
                            if (refreshCardTabScheme != coroutineSingletons13) {
                                refreshCardTabScheme = Unit.INSTANCE;
                            }
                        } else {
                            refreshCardTabScheme = realCardAppletTileRepository.postcardService.refreshCardTabScheme(new RefreshCardTabSchemeRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191)), this);
                            if (refreshCardTabScheme != coroutineSingletons13) {
                                refreshCardTabScheme = Unit.INSTANCE;
                            }
                        }
                        if (refreshCardTabScheme == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    CardAppletWorker cardAppletWorker = (CardAppletWorker) obj2;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow singleValueOrDefault = cardAppletWorker.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardTabScheme, new CardScheme(EmptyList.INSTANCE), new Matcher$$ExternalSyntheticLambda9(13));
                        CardAppletWorker$setup$1$2$1 cardAppletWorker$setup$1$2$1 = new CardAppletWorker$setup$1$2$1(cardAppletWorker, (Continuation) null, 0);
                        this.label = 1;
                        if (FlowKt.collectLatest(singleValueOrDefault, cardAppletWorker$setup$1$2$1, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("SharedFlow never completes, this call should never return.");
                    return null;
                case 12:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SandboxedCoroutineWorker sandboxedCoroutineWorker = (SandboxedCoroutineWorker) obj2;
                        SandboxedWork sandboxedWork = sandboxedCoroutineWorker.workCallback;
                        this.label = 1;
                        obj = sandboxedWork.work(sandboxedCoroutineWorker, this);
                        if (obj == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (ListenableWorker.Result) obj;
                default:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (FlowKt.collect((Flow) obj2, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* renamed from: com.squareup.cash.util.cache.Cache$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00671 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Object this$0;

            public /* synthetic */ C00671(Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Object value;
                RealPendingMessagesStore.MessagesState messagesState;
                int i = this.$r8$classId;
                Continuation continuation2 = null;
                final int i2 = 1;
                final int i3 = 0;
                Object obj2 = this.this$0;
                switch (i) {
                    case 0:
                        ((Cache) obj2).cache = null;
                        return Unit.INSTANCE;
                    case 1:
                        return emit((PaymentActionComplete) obj, continuation);
                    case 2:
                        RealPaymentListener realPaymentListener = (RealPaymentListener) obj2;
                        JobKt.launch$default(realPaymentListener.coroutineScope, null, null, new RealPaymentListener$onPaymentEnded$1(realPaymentListener, continuation2, i2), 3);
                        return Unit.INSTANCE;
                    case 3:
                        long longValue = ((Number) obj).longValue();
                        RealPasswordManager realPasswordManager = (RealPasswordManager) obj2;
                        SqlDriver sqlDriver = realPasswordManager.passwordInfoQueries.driver;
                        PasswordInfoQueries$$ExternalSyntheticLambda0 passwordInfoQueries$$ExternalSyntheticLambda0 = new PasswordInfoQueries$$ExternalSyntheticLambda0(i3);
                        sqlDriver.getClass();
                        Long l = (Long) new SimpleQuery(-1508591807, new String[]{"passwordInfo"}, sqlDriver, "PasswordInfo.sq", "select", "SELECT version FROM passwordInfo LIMIT 1", passwordInfoQueries$$ExternalSyntheticLambda0).executeAsOneOrNull();
                        if (l != null && l.longValue() == longValue) {
                            return Unit.INSTANCE;
                        }
                        realPasswordManager.updatePasswordVersion(longValue);
                        Object write = realPasswordManager.biometricsStore.write("biometric_enclave_key", null, continuation);
                        return write == CoroutineSingletons.COROUTINE_SUSPENDED ? write : Unit.INSTANCE;
                    case 4:
                        SignoutSideEffectsPerformer signoutSideEffectsPerformer = (SignoutSideEffectsPerformer) obj2;
                        ((Navigator) signoutSideEffectsPerformer.navigator).goTo(((RealFlowStarter) ((FlowStarter) signoutSideEffectsPerformer.flowStarter)).signOut());
                        ((MainActivity$navigatorSwitcher$1) signoutSideEffectsPerformer.navigatorSwitcher).unlock();
                        return Unit.INSTANCE;
                    case 5:
                        TimeToLiveSyncState timeToLiveSyncState = (TimeToLiveSyncState) obj2;
                        timeToLiveSyncState.progress = FlowKt.MutableStateFlow(SyncState$Progress.SUCCESS);
                        timeToLiveSyncState.lastAttemptedRefresh = 0L;
                        return Unit.INSTANCE;
                    case 6:
                        ((RealDynamicShortcutManager) obj2).shortcutManager.setDynamicShortcuts((List) obj);
                        return Unit.INSTANCE;
                    case 7:
                        return emit((StorageLinkState) obj, continuation);
                    case 8:
                        RecordedTranscript recordedTranscript = (RecordedTranscript) obj;
                        Collection values = recordedTranscript.getMessages().values();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            String idempotenceToken = ((RecordedMessage) it.next()).getIdempotenceToken();
                            if (idempotenceToken != null) {
                                arrayList.add(idempotenceToken);
                            }
                        }
                        RecordedMessage recordedMessage = (RecordedMessage) CollectionsKt.lastOrNull(recordedTranscript.getMessages().values());
                        StateFlowImpl stateFlowImpl = ((RealPendingMessagesStore) obj2).state;
                        do {
                            value = stateFlowImpl.getValue();
                            messagesState = (RealPendingMessagesStore.MessagesState) value;
                        } while (!stateFlowImpl.compareAndSet(value, RealPendingMessagesStore.MessagesState.copy$default(messagesState, MapsKt__MapsKt.minus(messagesState.pendingRequests, (Iterable) CollectionsKt.toSet(arrayList)), recordedMessage != null ? !recordedMessage.getSuggestedReplies().isEmpty() : false, null, 4)));
                        return Unit.INSTANCE;
                    case 9:
                        ThemeInfo themeInfo = (ThemeInfo) obj;
                        themeInfo.getClass();
                        ((MainActivity) obj2).themeInfo = themeInfo;
                        return Unit.INSTANCE;
                    case 10:
                        Pair pair = (Pair) obj;
                        ScreenshotReportingManager screenshotReportingManager = (ScreenshotReportingManager) obj2;
                        Activity activity = (Activity) pair.first;
                        boolean booleanValue = ((Boolean) pair.second).booleanValue();
                        if (activity != null && booleanValue && Build.VERSION.SDK_INT >= 34 && !screenshotReportingManager.activityCallbacks.containsKey(activity)) {
                            ScreenshotReportingManager.access$registerScreenshotDetection(screenshotReportingManager, activity);
                        }
                        return Unit.INSTANCE;
                    case 11:
                        Signal signal = (Signal) obj;
                        RealUserJourneySignalProcessor realUserJourneySignalProcessor = (RealUserJourneySignalProcessor) obj2;
                        RealUserJourneyRepository realUserJourneyRepository = realUserJourneySignalProcessor.userJourneyRepository;
                        if (signal instanceof Signal.Start) {
                            Object access$handleStartJourney = RealUserJourneySignalProcessor.access$handleStartJourney(realUserJourneySignalProcessor, (Signal.Start) signal, continuation);
                            return access$handleStartJourney == CoroutineSingletons.COROUTINE_SUSPENDED ? access$handleStartJourney : Unit.INSTANCE;
                        }
                        if (signal instanceof Signal.AddFriction) {
                            Signal.AddFriction addFriction = (Signal.AddFriction) signal;
                            final UserJourney$Name userJourney$Name = addFriction.journeyName;
                            Object updateUserJourney = realUserJourneyRepository.updateUserJourney(new Function1() { // from class: com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i4 = i3;
                                    boolean z = true;
                                    UserJourney$Name userJourney$Name2 = userJourney$Name;
                                    UserJourney userJourney = (UserJourney) obj3;
                                    switch (i4) {
                                        case 0:
                                            userJourney.getClass();
                                            if (userJourney$Name2 != null && userJourney.getName() != userJourney$Name2) {
                                                z = false;
                                            }
                                            return Boolean.valueOf(z);
                                        default:
                                            userJourney.getClass();
                                            if (userJourney$Name2 != null && userJourney.getName() != userJourney$Name2) {
                                                z = false;
                                            }
                                            return Boolean.valueOf(z);
                                    }
                                }
                            }, new AlertBannerKt$$ExternalSyntheticLambda3(addFriction.frictionSignal, realUserJourneySignalProcessor, 8), continuation);
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (updateUserJourney != coroutineSingletons) {
                                updateUserJourney = Unit.INSTANCE;
                            }
                            Object obj3 = updateUserJourney;
                            return obj3 == coroutineSingletons ? obj3 : Unit.INSTANCE;
                        }
                        if (signal instanceof Signal.AddFrustration) {
                            Signal.AddFrustration addFrustration = (Signal.AddFrustration) signal;
                            final UserJourney$Name userJourney$Name2 = addFrustration.journeyName;
                            Object updateUserJourney2 = realUserJourneyRepository.updateUserJourney(new Function1() { // from class: com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj32) {
                                    int i4 = i2;
                                    boolean z = true;
                                    UserJourney$Name userJourney$Name22 = userJourney$Name2;
                                    UserJourney userJourney = (UserJourney) obj32;
                                    switch (i4) {
                                        case 0:
                                            userJourney.getClass();
                                            if (userJourney$Name22 != null && userJourney.getName() != userJourney$Name22) {
                                                z = false;
                                            }
                                            return Boolean.valueOf(z);
                                        default:
                                            userJourney.getClass();
                                            if (userJourney$Name22 != null && userJourney.getName() != userJourney$Name22) {
                                                z = false;
                                            }
                                            return Boolean.valueOf(z);
                                    }
                                }
                            }, new AlertBannerKt$$ExternalSyntheticLambda3(addFrustration.frustrationSignal, realUserJourneySignalProcessor, 9), continuation);
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (updateUserJourney2 != coroutineSingletons2) {
                                updateUserJourney2 = Unit.INSTANCE;
                            }
                            Object obj4 = updateUserJourney2;
                            return obj4 == coroutineSingletons2 ? obj4 : Unit.INSTANCE;
                        }
                        if (signal instanceof Signal.AddTag) {
                            Signal.AddTag addTag = (Signal.AddTag) signal;
                            Object updateUserJourney3 = realUserJourneyRepository.updateUserJourney(new JourneySelector$$ExternalSyntheticLambda0(addTag.journeyName, 1), new Perfs$$ExternalSyntheticLambda2(1, addTag.tag, realUserJourneySignalProcessor), continuation);
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (updateUserJourney3 != coroutineSingletons3) {
                                updateUserJourney3 = Unit.INSTANCE;
                            }
                            Object obj5 = updateUserJourney3;
                            return obj5 == coroutineSingletons3 ? obj5 : Unit.INSTANCE;
                        }
                        if (signal instanceof Signal.EndJourney) {
                            Signal.EndJourney endJourney = (Signal.EndJourney) signal;
                            Object m3785access$handleEndJourneyexY8QGI = RealUserJourneySignalProcessor.m3785access$handleEndJourneyexY8QGI(realUserJourneySignalProcessor, endJourney.journeyName, endJourney.outcome, endJourney.journeyCompletedAtRealtime, continuation);
                            return m3785access$handleEndJourneyexY8QGI == CoroutineSingletons.COROUTINE_SUSPENDED ? m3785access$handleEndJourneyexY8QGI : Unit.INSTANCE;
                        }
                        if (!(signal instanceof Signal.SetVariant)) {
                            if (signal instanceof Signal.TimeOutJourney) {
                                Object access$checkForTimedOutJourney = RealUserJourneySignalProcessor.access$checkForTimedOutJourney(realUserJourneySignalProcessor, ((Signal.TimeOutJourney) signal).getJourneyId(), continuation);
                                return access$checkForTimedOutJourney == CoroutineSingletons.COROUTINE_SUSPENDED ? access$checkForTimedOutJourney : Unit.INSTANCE;
                            }
                            if (!(signal instanceof Signal.EndAllSubJourneys)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Signal.EndAllSubJourneys endAllSubJourneys = (Signal.EndAllSubJourneys) signal;
                            Object m3784access$handleEndAllSubJourneys8Mi8wO0 = RealUserJourneySignalProcessor.m3784access$handleEndAllSubJourneys8Mi8wO0(realUserJourneySignalProcessor, endAllSubJourneys.outcome, endAllSubJourneys.journeyCompletedAtRealtime, continuation);
                            return m3784access$handleEndAllSubJourneys8Mi8wO0 == CoroutineSingletons.COROUTINE_SUSPENDED ? m3784access$handleEndAllSubJourneys8Mi8wO0 : Unit.INSTANCE;
                        }
                        Signal.SetVariant setVariant = (Signal.SetVariant) signal;
                        UserJourney$Name userJourney$Name3 = setVariant.journeyName;
                        zzaag zzaagVar = setVariant.variant;
                        Timber.Forest.d(CameraSelector$$ExternalSyntheticOutline0.m("Handle set variant: journey=", userJourney$Name3.getLabel(), " variant=", zzaagVar.zza), new Object[0]);
                        Object updateUserJourney4 = realUserJourneyRepository.updateUserJourney(new JourneySelector$$ExternalSyntheticLambda0(userJourney$Name3, 0), new ViewTreeObservers$$ExternalSyntheticLambda3(realUserJourneySignalProcessor, userJourney$Name3, zzaagVar), continuation);
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (updateUserJourney4 != coroutineSingletons4) {
                            updateUserJourney4 = Unit.INSTANCE;
                        }
                        Object obj6 = updateUserJourney4;
                        return obj6 == coroutineSingletons4 ? obj6 : Unit.INSTANCE;
                    case 12:
                        Object send = ((BufferedChannel) obj2).send(obj, continuation);
                        return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
                    default:
                        ((Ref$ObjectRef) obj2).element = obj;
                        throw new AbortFlowException(this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object emit(StorageLinkState storageLinkState, Continuation continuation) {
                ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1 activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1;
                int i;
                if (continuation instanceof ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1) {
                    activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1 = (ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1) continuation;
                    int i2 = activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            SandboxingAnalyticsLogger sandboxingAnalyticsLogger = (SandboxingAnalyticsLogger) this.this$0;
                            activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.L$0 = storageLinkState;
                            activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.label = 1;
                            if (sandboxingAnalyticsLogger.log(storageLinkState, activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            storageLinkState = activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                        }
                        Timber.Forest.i("ActiveStorageLink: gatedLinkState emitted: " + storageLinkState.link, new Object[0]);
                        return Unit.INSTANCE;
                    }
                }
                activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1 = new ActiveStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1(this, continuation);
                Object obj2 = activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeStorageLinkFlowKt$activeStorageLinkFlow$2$1$emit$1.label;
                if (i != 0) {
                }
                Timber.Forest.i("ActiveStorageLink: gatedLinkState emitted: " + storageLinkState.link, new Object[0]);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
            
                if (r5.emit(r0, r1) != r7) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
            
                if (r6.emit(r5, r1) == r7) goto L38;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object emit(PaymentActionComplete paymentActionComplete, Continuation continuation) {
                RealActivityPaymentManager$1$1$emit$1 realActivityPaymentManager$1$1$emit$1;
                int i;
                RealActivityPaymentManager realActivityPaymentManager = (RealActivityPaymentManager) this.this$0;
                if (continuation instanceof RealActivityPaymentManager$1$1$emit$1) {
                    realActivityPaymentManager$1$1$emit$1 = (RealActivityPaymentManager$1$1$emit$1) continuation;
                    int i2 = realActivityPaymentManager$1$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        realActivityPaymentManager$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = realActivityPaymentManager$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realActivityPaymentManager$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            Object action = paymentActionComplete.getAction();
                            if (!(action instanceof PaymentAction.OpenDialogAction) && !(action instanceof PaymentAction.OpenUrlAction) && !(action instanceof PaymentAction.ShowPaymentDetailView) && !(action instanceof PaymentAction.ShowContact) && !(action instanceof PaymentAction.ShowProfile) && !(action instanceof PaymentAction.ShowShareSheet)) {
                                if ((action instanceof PaymentAction.HasPaymentToken) && (r5 = ((PaymentAction.HasPaymentToken) action).getPaymentToken()) != null) {
                                    SharedFlowImpl sharedFlowImpl = realActivityPaymentManager.activityItemUpdatesFlow;
                                    realActivityPaymentManager$1$1$emit$1.label = 1;
                                }
                            } else {
                                return Unit.INSTANCE;
                            }
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
                        SharedFlowImpl sharedFlowImpl2 = realActivityPaymentManager.activityFeedUpdatesFlow;
                        Integer num = new Integer(realActivityPaymentManager.activityFeedUpdatesCounter.incrementAndGet());
                        realActivityPaymentManager$1$1$emit$1.label = 2;
                    }
                }
                realActivityPaymentManager$1$1$emit$1 = new RealActivityPaymentManager$1$1$emit$1(this, continuation);
                Object obj2 = realActivityPaymentManager$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realActivityPaymentManager$1$1$emit$1.label;
                if (i != 0) {
                }
                SharedFlowImpl sharedFlowImpl22 = realActivityPaymentManager.activityFeedUpdatesFlow;
                Integer num2 = new Integer(realActivityPaymentManager.activityFeedUpdatesCounter.incrementAndGet());
                realActivityPaymentManager$1$1$emit$1.label = 2;
            }
        }
    }
}
