package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.util.Log;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.emoji2.text.MetadataListReader;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.fillr.core.utilities.AppPreferenceStore;
import com.google.android.datatransport.cct.StringMerger;
import com.google.android.gms.common.zzc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.appmessages.views.InAppNotificationView$setModel$4$2;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastState;
import com.squareup.cash.shopping.viewmodels.ShoppingJavascriptViewModel;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import com.squareup.cash.work.views.ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.StateFlowKt$combineUndispatched$1$1$1$1;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.utils.Experiment;
import com.stripe.android.financialconnections.utils.HostedAuthUrlBuilder;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.Cache;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes8.dex */
public final class GovernmentIdFeed$analyze$5 extends SuspendLambda implements Function2 {
    public Object $image;
    public final /* synthetic */ int $r8$classId;
    public int $rotationDegrees;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$5(PatternStampState patternStampState, int i, int i2, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.L$0 = patternStampState;
        this.label = i;
        this.$rotationDegrees = i2;
        this.$image = mutableFloatState;
        this.this$0 = mutableFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new GovernmentIdFeed$analyze$5((Image) this.$image, (GovernmentIdFeed) this.this$0, this.$rotationDegrees, continuation, 0);
            case 1:
                return new GovernmentIdFeed$analyze$5((List) this.L$0, continuation, (CapturePipelineImpl) this.$image, this.$rotationDegrees);
            case 2:
                return new GovernmentIdFeed$analyze$5((LazyListState) this.L$0, this.$rotationDegrees, (IntRange) this.$image, (CalendarMonth) this.this$0, continuation, 2);
            case 3:
                return new GovernmentIdFeed$analyze$5((PatternStampState) this.L$0, this.label, this.$rotationDegrees, (MutableFloatState) this.$image, (MutableFloatState) this.this$0, continuation);
            case 4:
                GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$5 = new GovernmentIdFeed$analyze$5((AnimationState) this.$image, (CollapsingToolbarState) this.this$0, this.$rotationDegrees, continuation, 4);
                governmentIdFeed$analyze$5.L$0 = obj;
                return governmentIdFeed$analyze$5;
            case 5:
                return new GovernmentIdFeed$analyze$5((LazyListState) this.L$0, this.$rotationDegrees, (ParcelableSnapshotMutableIntState) this.$image, (MutableState) this.this$0, continuation, 5);
            case 6:
                return new GovernmentIdFeed$analyze$5((String) this.L$0, this.$rotationDegrees, (MutableState) this.$image, (MutableState) this.this$0, continuation, 6);
            case 7:
                GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$52 = new GovernmentIdFeed$analyze$5((LazyListState) this.$image, this.$rotationDegrees, (Ref$FloatRef) this.this$0, continuation);
                governmentIdFeed$analyze$52.L$0 = obj;
                return governmentIdFeed$analyze$52;
            case 8:
                return new GovernmentIdFeed$analyze$5((RealShoppingJavascriptPresenter) this.L$0, (MutableState) this.$image, (MutableState) this.this$0, continuation);
            case 9:
                return new GovernmentIdFeed$analyze$5(this.$rotationDegrees, (Animatable) this.L$0, (SpringSpec) this.$image, (MutableState) this.this$0, continuation);
            case 10:
                return new GovernmentIdFeed$analyze$5((ScheduleCalendarViewModel) this.L$0, (PagerState) this.$image, this.$rotationDegrees, (YearMonth) this.this$0, continuation, 10);
            case 11:
                return new GovernmentIdFeed$analyze$5((PagerState) this.L$0, (YearMonth) this.$image, this.$rotationDegrees, (MutableState) this.this$0, continuation, 11);
            case 12:
                return new GovernmentIdFeed$analyze$5((StateFlow[]) this.L$0, this.$rotationDegrees, (AtomicInteger) this.$image, (BufferedChannel) this.this$0, continuation, 12);
            case 13:
                return new GovernmentIdFeed$analyze$5((ListsKt$$ExternalSyntheticLambda0) this.L$0, (Iterable) this.$image, this.$rotationDegrees, (DefaultStripeNetworkClient) this.this$0, continuation, 13);
            case 14:
                return new GovernmentIdFeed$analyze$5((FinancialConnectionsSheetViewModel) this.this$0, continuation);
            default:
                return new GovernmentIdFeed$analyze$5((DefaultStripeImageLoader) this.L$0, (String) this.$image, this.$rotationDegrees, (AndroidImageBitmap) this.this$0, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 12:
                ((GovernmentIdFeed$analyze$5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((GovernmentIdFeed$analyze$5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ad, code lost:
    
        if (r0 == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0298, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r18) == r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03fb, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, null, null, r18, 12) == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03e1, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, null, null, r18, 12) == r9) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0491, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(3600, r18) == r1) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0467, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(2000, r18) == r1) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0744, code lost:
    
        if (r3.unlock3APostCapture(r2) == r0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0724, code lost:
    
        if (r1 == r0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06fb, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r1, r18) == r0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x07b4, code lost:
    
        if (r0.emit(r2, r18) == r1) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x079f, code lost:
    
        if (r3 == r1) goto L347;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:29:0x006c, B:31:0x00b6, B:35:0x0101, B:36:0x0106, B:87:0x00c6, B:89:0x00ce, B:90:0x00f1, B:92:0x00f5, B:93:0x0109, B:94:0x010e, B:98:0x0080, B:100:0x009b, B:106:0x008a), top: B:24:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c6 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:29:0x006c, B:31:0x00b6, B:35:0x0101, B:36:0x0106, B:87:0x00c6, B:89:0x00ce, B:90:0x00f1, B:92:0x00f5, B:93:0x0109, B:94:0x010e, B:98:0x0080, B:100:0x009b, B:106:0x008a), top: B:24:0x005e }] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Result] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Image image;
        Object m4088access$analyzegIAlus;
        Object acquireSession;
        Object animateScrollToPage;
        Object withContext;
        Object obj2;
        Throwable m4120exceptionOrNullimpl;
        boolean z;
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        Object value2;
        FinancialConnectionsSheetState financialConnectionsSheetState2;
        FinancialConnectionsSheetState.AuthFlowStatus authFlowStatus;
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs;
        Object access$prepareStandardRequestManager;
        int i;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
        Object invoke;
        FinancialConnectionsSheetViewModel.AttestationInitResult attestationInitResult;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2;
        FinancialConnectionsAnalyticsEvent.Click click;
        Object obj3;
        int i2 = 2;
        r2 = 0;
        r2 = 0;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                GovernmentIdFeed governmentIdFeed = (GovernmentIdFeed) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ?? r2 = this.label;
                try {
                    if (r2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        image = (Image) this.$image;
                        int i4 = this.$rotationDegrees;
                        image.getClass();
                        ImageToAnalyzeKt$toImageToAnalyze$1 imageToAnalyzeKt$toImageToAnalyze$1 = new ImageToAnalyzeKt$toImageToAnalyze$1(image, i4);
                        this.L$0 = image;
                        this.label = 1;
                        m4088access$analyzegIAlus = GovernmentIdFeed.m4088access$analyzegIAlus(governmentIdFeed, imageToAnalyzeKt$toImageToAnalyze$1, this);
                        break;
                    } else {
                        if (r2 != 1) {
                            if (r2 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        image = (Image) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        m4088access$analyzegIAlus = ((Result) obj).value;
                    }
                    Cache.Companion.closeFinally(image, null);
                    ?? r0 = governmentIdFeed.resultFlow;
                    r2 = new Result(m4088access$analyzegIAlus);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Cache.Companion.closeFinally(r2, th);
                        throw th2;
                    }
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ?? r1 = this.label;
                try {
                    if (r1 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal");
                        }
                        List list = (List) this.L$0;
                        this.label = 1;
                        break;
                    } else if (r1 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else {
                        if (r1 != 2) {
                            if (r1 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AutoCloseable autoCloseable = (AutoCloseable) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            r1 = autoCloseable;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A done");
                            }
                            Cache.Companion.closeFinally(r1, null);
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        acquireSession = obj;
                        AutoCloseable autoCloseable2 = (AutoCloseable) acquireSession;
                        CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable2;
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A");
                        }
                        boolean z2 = this.$rotationDegrees == 0;
                        this.this$0 = autoCloseable2;
                        this.label = 3;
                        r1 = autoCloseable2;
                        break;
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done");
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for unlocking 3A");
                    }
                    CameraGraphImpl graph = ((CapturePipelineImpl) this.$image).useCaseGraphContext.getGraph();
                    this.label = 2;
                    acquireSession = graph.acquireSession(this);
                    break;
                } catch (Throwable th3) {
                    AutoCloseable autoCloseable3 = r1;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        Cache.Companion.closeFinally(autoCloseable3, th3);
                        throw th4;
                    }
                }
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LazyListState lazyListState = (LazyListState) this.L$0;
                    int i6 = (((this.$rotationDegrees - ((IntRange) this.$image).first) * 12) + ((CalendarMonth) this.this$0).month) - 1;
                    this.label = 1;
                    WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                    if (lazyListState.scrollToItem(i6, 0, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                MutableFloatState mutableFloatState = (MutableFloatState) this.this$0;
                MutableFloatState mutableFloatState2 = (MutableFloatState) this.$image;
                int i7 = this.$rotationDegrees;
                int i8 = this.label;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PatternStampState patternStampState = (PatternStampState) this.L$0;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = patternStampState.boxHeight$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = patternStampState.boxWidth$delegate;
                if (parcelableSnapshotMutableIntState2.getIntValue() == 0 && parcelableSnapshotMutableIntState.getIntValue() == 0) {
                    parcelableSnapshotMutableIntState2.setIntValue(i8);
                    parcelableSnapshotMutableIntState.setIntValue(i7);
                    patternStampState.generateStampsFromOriginals();
                } else {
                    float floatValue = i8 / ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                    float floatValue2 = i7 / ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                    for (TransformedStamp transformedStamp : patternStampState.getStamps$customizations()) {
                        transformedStamp.transform.postTranslate(-(transformedStamp.bounds().centerX() - (transformedStamp.bounds().centerX() * floatValue)), -(transformedStamp.bounds().centerY() - (transformedStamp.bounds().centerY() * floatValue2)));
                        transformedStamp.transform.postScale(floatValue, floatValue2, transformedStamp.bounds().centerX(), transformedStamp.bounds().centerY());
                    }
                    parcelableSnapshotMutableIntState2.setIntValue(i8);
                    parcelableSnapshotMutableIntState.setIntValue(i7);
                }
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(i7);
                ((ParcelableSnapshotMutableFloatState) mutableFloatState2).setFloatValue(i8);
                return Unit.INSTANCE;
            case 4:
                AnimationState animationState = (AnimationState) this.$image;
                ScrollScope scrollScope = (ScrollScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    ref$FloatRef.element = ((Number) animationState.value$delegate.getValue()).floatValue();
                    Float f = new Float(((CollapsingToolbarState) this.this$0).maxHeightState$delegate.getIntValue());
                    TweenSpec tween$default = AnimatableKt.tween$default(this.$rotationDegrees, 0, null, 6);
                    CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0 collapsingToolbarState$expand$2$$ExternalSyntheticLambda0 = new CollapsingToolbarState$expand$2$$ExternalSyntheticLambda0(0, scrollScope, ref$FloatRef);
                    this.L$0 = null;
                    this.label = 1;
                    if (AnimatableKt.animateTo$default(animationState, f, tween$default, false, collapsingToolbarState$expand$2$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i11 = this.$rotationDegrees;
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) this.$image;
                    MutableState mutableState = (MutableState) this.this$0;
                    parcelableSnapshotMutableIntState3.setIntValue(i11);
                    mutableState.setValue(null);
                    LazyListState lazyListState2 = (LazyListState) this.L$0;
                    this.label = 1;
                    if (CardViewApi21Impl.access$scrollToBottom(lazyListState2, true, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) this.this$0;
                String str = (String) this.L$0;
                MutableState mutableState3 = (MutableState) this.$image;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual((String) mutableState3.getValue(), str)) {
                        mutableState2.setValue(Boolean.TRUE);
                        long j = this.$rotationDegrees;
                        this.label = 1;
                        if (JobKt.delay(j, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState3.setValue(str);
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                ScrollScope scrollScope2 = (ScrollScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float calculateDistanceTo = new PagerScrollScopeKt$LazyLayoutScrollScope$1(scrollScope2, (LazyListState) this.$image, r4).calculateDistanceTo(this.$rotationDegrees);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(900, 0, null, 6);
                    ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0 scoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0 = new ScoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0(0, scrollScope2, (Ref$FloatRef) this.this$0);
                    this.L$0 = null;
                    this.label = 1;
                    if (AnimatableKt.animate$default(RecyclerView.DECELERATION_RATE, calculateDistanceTo, tween$default2, scoreSummaryKt$ScoreDigit$1$1$1$$ExternalSyntheticLambda0, this, 4) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState4 = (MutableState) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.$rotationDegrees;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState5 = (MutableState) this.$image;
                    List list2 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    if (((Boolean) mutableState5.getValue()).booleanValue()) {
                        Float access$getCapDiscountAmount = MetadataListReader.access$getCapDiscountAmount(((RealShoppingJavascriptPresenter) this.L$0).args);
                        if ((access$getCapDiscountAmount != null ? access$getCapDiscountAmount.floatValue() : 0.0f) > RecyclerView.DECELERATION_RATE && ((ShoppingJavascriptViewModel) mutableState4.getValue()).paykitInfoToastState == PaykitInfoToastState.PAYKIT_LOADING) {
                            i3 = 1;
                        }
                    }
                    if (i3 != 0) {
                        this.label = i3;
                        this.$rotationDegrees = 1;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    List list3 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                    mutableState4.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState4.getValue(), null, PaykitInfoToastState.PAYKIT_TIMEOUT_INFO_SHOWN, 1));
                    return Unit.INSTANCE;
                }
                i3 = this.label;
                SafeTrace.throwOnFailure(obj);
                List list4 = RealShoppingJavascriptPresenter.validAfterpayURLs;
                if (((ShoppingJavascriptViewModel) mutableState4.getValue()).paykitInfoToastState == PaykitInfoToastState.PAYKIT_LOADING) {
                    mutableState4.setValue(ShoppingJavascriptViewModel.copy$default((ShoppingJavascriptViewModel) mutableState4.getValue(), null, PaykitInfoToastState.PAYKIT_TIMEOUT, 1));
                    this.label = i3;
                    this.$rotationDegrees = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 9:
                MutableState mutableState6 = (MutableState) this.this$0;
                int i15 = this.$rotationDegrees;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (i15 == 0 || i15 <= ((Number) mutableState6.getValue()).intValue()) {
                        return Unit.INSTANCE;
                    }
                    mutableState6.setValue(Integer.valueOf(i15));
                    Animatable animatable = (Animatable) this.L$0;
                    Float f2 = new Float(25.0f);
                    TweenSpec tween$default3 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, UtilsKt.EaseInOutSineEasing, 2);
                    this.label = 1;
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Animatable animatable2 = (Animatable) this.L$0;
                Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                SpringSpec springSpec = (SpringSpec) this.$image;
                this.label = 2;
                break;
            case 10:
                PagerState pagerState = (PagerState) this.$image;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int between = this.$rotationDegrees + ((int) ChronoUnit.MONTHS.between((YearMonth) this.this$0, ((ScheduleCalendarViewModel) this.L$0).viewedMonth));
                    if (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() != between) {
                        this.label = 1;
                        animateScrollToPage = pagerState.animateScrollToPage(between, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                        if (animateScrollToPage == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
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
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(FlowKt.distinctUntilChanged(new ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1(Updater.snapshotFlow(new PagerState$$ExternalSyntheticLambda1((PagerState) this.L$0, 11)), (YearMonth) this.$image, this.$rotationDegrees)), 1);
                    InAppNotificationView$setModel$4$2 inAppNotificationView$setModel$4$2 = new InAppNotificationView$setModel$4$2(i2, (Function1) ((MutableState) this.this$0).getValue());
                    this.label = 1;
                    if (drop.collect(inAppNotificationView$setModel$4$2, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                BufferedChannel bufferedChannel = (BufferedChannel) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                try {
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow[] stateFlowArr = (StateFlow[]) this.L$0;
                        int i20 = this.$rotationDegrees;
                        StateFlow stateFlow = stateFlowArr[i20];
                        StateFlowKt$combineUndispatched$1$1$1$1 stateFlowKt$combineUndispatched$1$1$1$1 = new StateFlowKt$combineUndispatched$1$1$1$1(bufferedChannel, i20, 0);
                        this.label = 1;
                        if (stateFlow.collect(stateFlowKt$combineUndispatched$1$1$1$1, this) == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th5) {
                    if (((AtomicInteger) this.$image).decrementAndGet() == 0) {
                        bufferedChannel.close(null);
                    }
                    throw th5;
                }
            case 13:
                Iterable iterable = (Iterable) this.$image;
                ListsKt$$ExternalSyntheticLambda0 listsKt$$ExternalSyntheticLambda0 = (ListsKt$$ExternalSyntheticLambda0) this.L$0;
                DefaultStripeNetworkClient defaultStripeNetworkClient = (DefaultStripeNetworkClient) this.this$0;
                int i21 = this.$rotationDegrees;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StripeResponse stripeResponse = (StripeResponse) listsKt$$ExternalSyntheticLambda0.invoke();
                    int i23 = stripeResponse.code;
                    if (!CollectionsKt.contains(iterable, new Integer(i23)) || i21 <= 0) {
                        return stripeResponse;
                    }
                    defaultStripeNetworkClient.logger.info(Recorder$$ExternalSyntheticOutline2.m(i23, i21, "Request failed with code ", ". Retrying up to ", " more time(s)."));
                    long m4010getDelay3nIYWDw = defaultStripeNetworkClient.retryDelaySupplier.m4010getDelay3nIYWDw(i21);
                    this.label = 1;
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                        return (StripeResponse) withContext;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.label = 2;
                withContext = JobKt.withContext(defaultStripeNetworkClient.workContext, new GovernmentIdFeed$analyze$5(listsKt$$ExternalSyntheticLambda0, iterable, i21 - 1, defaultStripeNetworkClient, (Continuation) null, 13), this);
                break;
            case 14:
                FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel3 = (FinancialConnectionsSheetViewModel) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.$rotationDegrees;
                try {
                } catch (Throwable th6) {
                    Result.Companion companion = Result.Companion;
                    obj2 = new Result.Failure(th6);
                }
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion2 = Result.Companion;
                    this.L$0 = financialConnectionsSheetViewModel3;
                    this.label = 0;
                    this.$rotationDegrees = 1;
                    access$prepareStandardRequestManager = FinancialConnectionsSheetViewModel.access$prepareStandardRequestManager(financialConnectionsSheetViewModel3, this);
                    if (access$prepareStandardRequestManager == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                    i = 0;
                    financialConnectionsSheetViewModel = financialConnectionsSheetViewModel3;
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        attestationInitResult = (FinancialConnectionsSheetViewModel.AttestationInitResult) this.$image;
                        financialConnectionsSheetViewModel2 = (FinancialConnectionsSheetViewModel) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) invoke;
                        FinancialConnectionsSessionManifest.Pane pane = synchronizeSessionResponse.manifest.nextPane;
                        if (!Intrinsics.areEqual(attestationInitResult, FinancialConnectionsSheetViewModel.AttestationInitResult.Success.INSTANCE)) {
                            click = null;
                        } else if (Intrinsics.areEqual(attestationInitResult, FinancialConnectionsSheetViewModel.AttestationInitResult.Skipped.INSTANCE)) {
                            pane.getClass();
                            FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                            click = new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "attestation.init_skipped", true);
                        } else {
                            if (!(attestationInitResult instanceof FinancialConnectionsSheetViewModel.AttestationInitResult.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            click = new FinancialConnectionsAnalyticsEvent.Click(pane, ((FinancialConnectionsSheetViewModel.AttestationInitResult.Failure) attestationInitResult).error);
                        }
                        if (click != null) {
                            financialConnectionsSheetViewModel2.analyticsTracker.track(click);
                        }
                        Result.Companion companion3 = Result.Companion;
                        obj2 = synchronizeSessionResponse;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                        if (m4120exceptionOrNullimpl != null) {
                            FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(m4120exceptionOrNullimpl), 6);
                        }
                        if (!(obj2 instanceof Result.Failure)) {
                            SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) obj2;
                            InitializerViewModelFactory initializerViewModelFactory = FinancialConnectionsSheetViewModel.Factory;
                            StateFlowImpl stateFlowImpl = financialConnectionsSheetViewModel3._stateFlow;
                            ToolbarTuckTargets toolbarTuckTargets = financialConnectionsSheetViewModel3.nativeRouter;
                            RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = financialConnectionsSheetViewModel3.browserManager;
                            realStandardIntegrityManagerFactory.getClass();
                            Uri parse = Uri.parse("https://");
                            parse.getClass();
                            if (realStandardIntegrityManagerFactory.getPackageToHandleUri(parse) != null) {
                                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = synchronizeSessionResponse2.manifest;
                                toolbarTuckTargets.getClass();
                                AppPreferenceStore appPreferenceStore = (AppPreferenceStore) toolbarTuckTargets.endCornerCenterX$delegate;
                                financialConnectionsSessionManifest.getClass();
                                Boolean bool = financialConnectionsSessionManifest.isLinkWithStripe;
                                Boolean overriddenNative$financial_connections_release = appPreferenceStore.getOverriddenNative$financial_connections_release();
                                if (overriddenNative$financial_connections_release != null) {
                                    z = overriddenNative$financial_connections_release.booleanValue();
                                } else {
                                    if (!ToolbarTuckTargets.nativeKillSwitchActive(financialConnectionsSessionManifest)) {
                                        if ((bool != null ? bool.booleanValue() : false) || Intrinsics.areEqual(zzc.experimentAssignment(financialConnectionsSessionManifest, Experiment.CONNECTIONS_MOBILE_NATIVE), "treatment")) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                r4 = appPreferenceStore.getOverriddenNative$financial_connections_release() == null ? 0 : 1;
                                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                if (r4 == 0 && !booleanValue && !ToolbarTuckTargets.nativeKillSwitchActive(financialConnectionsSessionManifest)) {
                                    zzc.trackExposure((FinancialConnectionsAnalyticsTrackerImpl) toolbarTuckTargets.startCornerCenterX$delegate, Experiment.CONNECTIONS_MOBILE_NATIVE, financialConnectionsSessionManifest);
                                }
                                FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs2 = financialConnectionsSheetViewModel3.initialState.initialArgs;
                                String str2 = financialConnectionsSessionManifest.hostedAuthUrl;
                                ElementsSessionContext elementsSessionContext = financialConnectionsSheetActivityArgs2.getElementsSessionContext();
                                String create = HostedAuthUrlBuilder.create(financialConnectionsSheetActivityArgs2, str2, elementsSessionContext != null ? elementsSessionContext.prefillDetails : null);
                                if (create == null) {
                                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(new IllegalArgumentException("hostedAuthUrl is required!")), 6);
                                } else {
                                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.OPEN, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                                    if (z) {
                                        do {
                                            value2 = stateFlowImpl.getValue();
                                            financialConnectionsSheetState2 = (FinancialConnectionsSheetState) value2;
                                            financialConnectionsSheetState2.getClass();
                                            authFlowStatus = FinancialConnectionsSheetState.AuthFlowStatus.NONE;
                                            financialConnectionsSheetActivityArgs = financialConnectionsSheetState2.initialArgs;
                                        } while (!stateFlowImpl.compareAndSet(value2, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState2, false, financialConnectionsSessionManifest, authFlowStatus, new FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow(StringMerger.getFlowType(financialConnectionsSheetActivityArgs), financialConnectionsSheetActivityArgs.getConfiguration(), synchronizeSessionResponse2, financialConnectionsSheetActivityArgs.getElementsSessionContext()), 3)));
                                    } else {
                                        FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.FLOW_LAUNCHED_IN_BROWSER, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                                        do {
                                            value = stateFlowImpl.getValue();
                                            financialConnectionsSheetState = (FinancialConnectionsSheetState) value;
                                            financialConnectionsSheetState.getClass();
                                        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, false, financialConnectionsSessionManifest, FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY, new FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl(create), 3)));
                                    }
                                }
                            } else {
                                AppInitializationError appInitializationError = new AppInitializationError(null, null, 0, null, "No Web browser available to launch AuthFlow");
                                Matchers.logError(financialConnectionsSheetViewModel3.analyticsTracker, "error Launching the Auth Flow", appInitializationError, financialConnectionsSheetViewModel3.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
                                FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel3, new FinancialConnectionsSheetActivityResult.Failed(appInitializationError), 6);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i25 = this.label;
                    financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i = i25;
                    access$prepareStandardRequestManager = obj;
                }
                FinancialConnectionsSheetViewModel.AttestationInitResult attestationInitResult2 = (FinancialConnectionsSheetViewModel.AttestationInitResult) access$prepareStandardRequestManager;
                GetOrFetchSync getOrFetchSync = financialConnectionsSheetViewModel.getOrFetchSync;
                GetOrFetchSync.RefetchCondition.Always always = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                boolean z3 = attestationInitResult2.supportsAppVerification;
                this.L$0 = financialConnectionsSheetViewModel;
                this.$image = attestationInitResult2;
                this.label = i;
                this.$rotationDegrees = 2;
                invoke = getOrFetchSync.invoke(always, z3, this);
                if (invoke != coroutineSingletons15) {
                    attestationInitResult = attestationInitResult2;
                    financialConnectionsSheetViewModel2 = financialConnectionsSheetViewModel;
                    SynchronizeSessionResponse synchronizeSessionResponse3 = (SynchronizeSessionResponse) invoke;
                    FinancialConnectionsSessionManifest.Pane pane2 = synchronizeSessionResponse3.manifest.nextPane;
                    if (!Intrinsics.areEqual(attestationInitResult, FinancialConnectionsSheetViewModel.AttestationInitResult.Success.INSTANCE)) {
                    }
                    if (click != null) {
                    }
                    Result.Companion companion32 = Result.Companion;
                    obj2 = synchronizeSessionResponse3;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    if (!(obj2 instanceof Result.Failure)) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons15;
            default:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultStripeImageLoader defaultStripeImageLoader = (DefaultStripeImageLoader) this.L$0;
                    String str3 = (String) this.$image;
                    int i27 = this.$rotationDegrees;
                    this.label = 1;
                    Object m4077loadBWLJW6A = defaultStripeImageLoader.m4077loadBWLJW6A(str3, i27, i27, this);
                    if (m4077loadBWLJW6A != obj4) {
                        obj3 = m4077loadBWLJW6A;
                    }
                    return obj4;
                }
                if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                obj3 = ((Result) obj).value;
                Result.Companion companion4 = Result.Companion;
                Bitmap bitmap = (Bitmap) (obj3 instanceof Result.Failure ? null : obj3);
                if (bitmap == null) {
                    return (AndroidImageBitmap) this.this$0;
                }
                obj4 = new AndroidImageBitmap(bitmap);
                return obj4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$5(LazyListState lazyListState, int i, Ref$FloatRef ref$FloatRef, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.$image = lazyListState;
        this.$rotationDegrees = i;
        this.this$0 = ref$FloatRef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$5(int i, Animatable animatable, SpringSpec springSpec, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 9;
        this.$rotationDegrees = i;
        this.L$0 = animatable;
        this.$image = springSpec;
        this.this$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$5(RealShoppingJavascriptPresenter realShoppingJavascriptPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.L$0 = realShoppingJavascriptPresenter;
        this.$image = mutableState;
        this.this$0 = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$5(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 14;
        this.this$0 = financialConnectionsSheetViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GovernmentIdFeed$analyze$5(Object obj, int i, Object obj2, Object obj3, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.L$0 = obj;
        this.$rotationDegrees = i;
        this.$image = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GovernmentIdFeed$analyze$5(Object obj, Object obj2, int i, Object obj3, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.L$0 = obj;
        this.$image = obj2;
        this.$rotationDegrees = i;
        this.this$0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GovernmentIdFeed$analyze$5(Object obj, Object obj2, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.$image = obj;
        this.this$0 = obj2;
        this.$rotationDegrees = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdFeed$analyze$5(List list, Continuation continuation, CapturePipelineImpl capturePipelineImpl, int i) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.L$0 = list;
        this.$image = capturePipelineImpl;
        this.$rotationDegrees = i;
    }
}
