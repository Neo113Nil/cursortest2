package com.withpersona.sdk2.inquiry.workflows;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.internal.NavControllerImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.be;
import com.google.android.play.core.integrity.bx;
import com.google.android.play.core.integrity.i;
import com.google.android.play.core.integrity.k;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.uicore.navigation.NavigationIntent;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.integrity.RealStandardIntegrityManagerFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$awaitResponse$2$2;

/* loaded from: classes9.dex */
public final class WorkflowContextAdapter$updateState$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $newState;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowContextAdapter$updateState$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = obj;
        this.this$0 = obj2;
        this.L$2 = obj3;
        this.$newState = obj4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$newState;
        switch (i) {
            case 0:
                return new WorkflowContextAdapter$updateState$1((SubtreeManager) this.this$0, (WorkflowState) obj2, continuation);
            case 1:
                WorkflowContextAdapter$updateState$1 workflowContextAdapter$updateState$1 = new WorkflowContextAdapter$updateState$1((Activity) this.L$1, (RealWebSocket$connect$1) this.this$0, (NavHostController) this.L$2, (Function1) obj2, continuation, 1);
                workflowContextAdapter$updateState$1.L$0 = obj;
                return workflowContextAdapter$updateState$1;
            case 2:
                return new WorkflowContextAdapter$updateState$1((UiStepSavedStateHelper) this.L$1, (String) this.this$0, (String) this.L$2, (String) obj2, continuation, 2);
            default:
                return new WorkflowContextAdapter$updateState$1((PlayIntegrityHelper) this.L$2, (String) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((WorkflowContextAdapter$updateState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:3|(1:(3:(1:(1:(5:13|14|15|16|17)(2:10|11))(8:22|23|24|25|26|(3:28|(3:30|31|32)|33)(1:34)|16|17))(10:39|40|41|42|43|(3:45|31|32)|26|(0)(0)|16|17)|20|21)(1:49))(1:62)|50|51|(3:53|54|55)(2:56|(3:58|31|32)(7:59|43|(0)|26|(0)(0)|16|17))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0177, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a7, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        r13 = r15;
        r15 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008d, code lost:
    
        if (r15.lock(r14) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0130 A[Catch: all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:26:0x0126, B:28:0x0130, B:34:0x014e, B:43:0x00c6, B:51:0x0091, B:53:0x009f, B:56:0x00ad), top: B:50:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #3 {all -> 0x00a7, blocks: (B:26:0x0126, B:28:0x0130, B:34:0x014e, B:43:0x00c6, B:51:0x0091, B:53:0x009f, B:56:0x00ad), top: B:50:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.navigation.NavDestination, androidx.navigation.NavGraph] */
    /* JADX WARN: Type inference failed for: r3v30, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r4v21, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r7v13, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SubtreeManager subtreeManager;
        MutexImpl mutexImpl;
        WorkflowState workflowState;
        UiStepSavedStateHelper.UiStepUiComponentConfig uiStepUiComponentConfig;
        UiStepSavedStateHelper.UiStepUiComponentConfig uiStepUiComponentConfig2;
        PlayIntegrityHelper playIntegrityHelper;
        MutexImpl mutexImpl2;
        String str;
        Throwable th;
        Mutex mutex;
        PlayIntegrityHelper playIntegrityHelper2;
        Object result;
        Throwable m4120exceptionOrNullimpl;
        int i = this.$r8$classId;
        Object obj2 = this.$newState;
        ?? r4 = "call to 'resume' before 'invoke' with coroutine";
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    subtreeManager = (SubtreeManager) this.this$0;
                    MutexImpl mutexImpl3 = (MutexImpl) subtreeManager.emitActionToParent;
                    WorkflowState workflowState2 = (WorkflowState) obj2;
                    this.L$0 = mutexImpl3;
                    this.L$1 = subtreeManager;
                    this.L$2 = workflowState2;
                    this.label = 1;
                    if (mutexImpl3.lock(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutexImpl = mutexImpl3;
                    workflowState = workflowState2;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    workflowState = (WorkflowState) this.L$2;
                    subtreeManager = (SubtreeManager) this.L$1;
                    mutexImpl = (MutexImpl) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                try {
                    WorkflowState state = subtreeManager.getState();
                    if (workflowState == null || (state != null && !state.isSameStateAs(workflowState))) {
                        JobKt.cancel((ContextScope) subtreeManager.workflowSession, (CancellationException) null);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        subtreeManager.workflowSession = JobKt.CoroutineScope(MainDispatcherLoader.dispatcher.plus(JobKt.SupervisorJob$default()));
                        ((LinkedHashMap) subtreeManager.interceptor).clear();
                    }
                    ((SavedStateHandle) subtreeManager.snapshotCache).set(workflowState, "WorkflowContextAdapter.state");
                    ((Function1) subtreeManager.children).invoke(workflowState);
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                } finally {
                    mutexImpl.unlock(null);
                }
            case 1:
                NavHostController navHostController = (NavHostController) this.L$2;
                NavigationIntent navigationIntent = (NavigationIntent) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Activity activity = (Activity) this.L$1;
                    if (activity != null && activity.isFinishing()) {
                        return Unit.INSTANCE;
                    }
                    RealWebSocket$connect$1 realWebSocket$connect$1 = (RealWebSocket$connect$1) this.this$0;
                    this.L$0 = navigationIntent;
                    this.label = 1;
                    if (realWebSocket$connect$1.dismiss(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (navigationIntent instanceof NavigationIntent.NavigateTo) {
                    NavDestination currentDestination$navigation_runtime_release = navHostController.impl.getCurrentDestination$navigation_runtime_release();
                    String str2 = currentDestination$navigation_runtime_release != null ? currentDestination$navigation_runtime_release.impl.route : null;
                    String str3 = ((NavigationIntent.NavigateTo) navigationIntent).route;
                    if (str3.length() > 0 && !str3.equals(str2)) {
                        CardTransitionKt$$ExternalSyntheticLambda4 cardTransitionKt$$ExternalSyntheticLambda4 = new CardTransitionKt$$ExternalSyntheticLambda4(navigationIntent, navHostController, str2, 29);
                        NavControllerImpl navControllerImpl = navHostController.impl;
                        navControllerImpl.getClass();
                        NavOptions navOptions = NavOptionsBuilderKt.navOptions(cardTransitionKt$$ExternalSyntheticLambda4);
                        if (navControllerImpl._graph == null) {
                            Path$$ExternalSyntheticBUOutline0.m(46, str3, ". Navigation graph has not been set for NavController ", navControllerImpl, "Cannot navigate to ");
                            return null;
                        }
                        ?? topGraph$navigation_runtime_release = navControllerImpl.getTopGraph$navigation_runtime_release();
                        NavDestination.DeepLinkMatch matchRouteComprehensive = topGraph$navigation_runtime_release.matchRouteComprehensive(str3, true, topGraph$navigation_runtime_release);
                        if (matchRouteComprehensive == null) {
                            Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Navigation destination that matches route ", str3, " cannot be found in the navigation graph "), navControllerImpl._graph);
                            return null;
                        }
                        NavDestination navDestination = matchRouteComprehensive.destination;
                        Bundle addInDefaultArgs = navDestination.addInDefaultArgs(matchRouteComprehensive.matchingArgs);
                        if (addInDefaultArgs == null) {
                            EmptyMap.INSTANCE.getClass();
                            addInDefaultArgs = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        }
                        int i4 = NavDestination.$r8$clinit;
                        String str4 = navDestination.impl.route;
                        Uri parse = Uri.parse(str4 != null ? "android-app://androidx.navigation/".concat(str4) : "");
                        parse.getClass();
                        Intent intent = new Intent();
                        intent.setDataAndType(parse, null);
                        intent.setAction(null);
                        addInDefaultArgs.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                        navControllerImpl.navigate$navigation_runtime_release(navDestination, addInDefaultArgs, navOptions);
                    }
                } else {
                    if (!Intrinsics.areEqual(navigationIntent, NavigationIntent.NavigateBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((Function1) obj2).invoke(Boolean.valueOf(navHostController.popBackStack()));
                }
                return Unit.INSTANCE;
            case 2:
                UiStepSavedStateHelper uiStepSavedStateHelper = (UiStepSavedStateHelper) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                try {
                    try {
                        try {
                        } catch (Exception unused) {
                            return null;
                        }
                    } catch (Exception unused2) {
                        r4.recycle();
                        uiStepUiComponentConfig = null;
                    }
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!uiStepSavedStateHelper.configFile.exists()) {
                            return null;
                        }
                        Parcel obtain = Parcel.obtain();
                        obtain.getClass();
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        InquiryViewModel.AnonymousClass1 anonymousClass1 = new InquiryViewModel.AnonymousClass1(uiStepSavedStateHelper, obtain, continuation, 21);
                        this.L$0 = obtain;
                        this.label = 1;
                        r4 = obtain;
                        if (JobKt.withContext(defaultIoScheduler, anonymousClass1, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            uiStepUiComponentConfig2 = (UiStepSavedStateHelper.UiStepUiComponentConfig) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            return uiStepUiComponentConfig2.uiComponentConfig;
                        }
                        Parcel parcel = (Parcel) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        r4 = parcel;
                    }
                    r4.setDataPosition(0);
                    Bundle readBundle = r4.readBundle(UiStepSavedStateHelper.UiStepUiComponentConfig.class.getClassLoader());
                    uiStepUiComponentConfig = readBundle != null ? (UiStepSavedStateHelper.UiStepUiComponentConfig) SizeKt.getParcelable(readBundle, "data", UiStepSavedStateHelper.UiStepUiComponentConfig.class) : null;
                    r4.recycle();
                    if (uiStepUiComponentConfig != null && Intrinsics.areEqual(uiStepUiComponentConfig.sessionToken, (String) this.this$0) && Intrinsics.areEqual(uiStepUiComponentConfig.inquiryId, (String) this.L$2) && Intrinsics.areEqual(uiStepUiComponentConfig.stepName, (String) obj2)) {
                        DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                        HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                        InquiryViewModel.AnonymousClass1 anonymousClass12 = new InquiryViewModel.AnonymousClass1(uiStepSavedStateHelper, uiStepUiComponentConfig, continuation, 20);
                        this.L$0 = uiStepUiComponentConfig;
                        this.label = 2;
                        if (JobKt.withContext(handlerContext, anonymousClass12, this) != coroutineSingletons3) {
                            uiStepUiComponentConfig2 = uiStepUiComponentConfig;
                            return uiStepUiComponentConfig2.uiComponentConfig;
                        }
                        return coroutineSingletons3;
                    }
                    return null;
                } catch (Throwable th2) {
                    r4.recycle();
                    throw th2;
                }
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    playIntegrityHelper = (PlayIntegrityHelper) this.L$2;
                    mutexImpl2 = playIntegrityHelper.mutex;
                    str = (String) obj2;
                    this.L$0 = mutexImpl2;
                    this.L$1 = playIntegrityHelper;
                    this.this$0 = str;
                    this.label = 1;
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            String str5 = (String) this.this$0;
                            PlayIntegrityHelper playIntegrityHelper3 = (PlayIntegrityHelper) this.L$1;
                            ?? r42 = (Mutex) this.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                str = str5;
                                playIntegrityHelper2 = playIntegrityHelper3;
                                mutexImpl2 = r42;
                                RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = playIntegrityHelper2.standardIntegrityManagerFactory;
                                Context context = playIntegrityHelper2.applicationContext;
                                realStandardIntegrityManagerFactory.getClass();
                                context.getClass();
                                be createStandard = IntegrityManagerFactory.createStandard(context);
                                createStandard.getClass();
                                i builder = k.builder();
                                builder.a = Long.parseLong(str);
                                builder.c = (byte) (builder.c | 1);
                                k build = builder.build();
                                this.L$0 = mutexImpl2;
                                this.L$1 = playIntegrityHelper2;
                                this.this$0 = createStandard;
                                this.label = 3;
                                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                                cancellableContinuationImpl.initCancellability();
                                zzw zzwVar = (zzw) createStandard.prepareIntegrityToken(build);
                                zzwVar.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new o0(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, 6), 13));
                                zzwVar.addOnFailureListener(new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl, 4));
                                result = cancellableContinuationImpl.getResult();
                                if (result == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                Object obj3 = ((Result) result).value;
                                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj3);
                                if (m4120exceptionOrNullimpl != null) {
                                }
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                th = th3;
                                mutex = r42;
                            }
                        } else if (i6 == 3) {
                            playIntegrityHelper2 = (PlayIntegrityHelper) this.L$1;
                            ?? r3 = (Mutex) this.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                result = obj;
                                mutexImpl2 = r3;
                                Object obj32 = ((Result) result).value;
                                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj32);
                                if (m4120exceptionOrNullimpl != null) {
                                    playIntegrityHelper2.logger.error("integrity:prepare:" + m4120exceptionOrNullimpl.getMessage());
                                    StateFlowImpl stateFlowImpl = playIntegrityHelper2.playIntegrityState;
                                    PlayIntegrityHelper.PlayIntegrityState.Error error = PlayIntegrityHelper.PlayIntegrityState.Error.INSTANCE;
                                    this.L$0 = mutexImpl2;
                                    this.L$1 = null;
                                    this.this$0 = null;
                                    this.label = 5;
                                    stateFlowImpl.getClass();
                                    stateFlowImpl.updateState(null, error);
                                    break;
                                } else {
                                    StateFlowImpl stateFlowImpl2 = playIntegrityHelper2.playIntegrityState;
                                    PlayIntegrityHelper.PlayIntegrityState.Ready ready = new PlayIntegrityHelper.PlayIntegrityState.Ready((bx) obj32);
                                    this.L$0 = mutexImpl2;
                                    this.L$1 = null;
                                    this.this$0 = null;
                                    this.label = 4;
                                    stateFlowImpl2.getClass();
                                    stateFlowImpl2.updateState(null, ready);
                                    if (Unit.INSTANCE == coroutineSingletons4) {
                                        return coroutineSingletons4;
                                    }
                                    mutex = mutexImpl2;
                                }
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                mutex = r3;
                            }
                        } else {
                            if (i6 != 4 && i6 != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = (Mutex) this.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        mutex.unlock(null);
                        throw th;
                    }
                    str = (String) this.this$0;
                    playIntegrityHelper = (PlayIntegrityHelper) this.L$1;
                    ?? r7 = (Mutex) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl2 = r7;
                }
                if (!Intrinsics.areEqual(playIntegrityHelper.playIntegrityState.getValue(), PlayIntegrityHelper.PlayIntegrityState.NotStarted.INSTANCE)) {
                    return Unit.INSTANCE;
                }
                StateFlowImpl stateFlowImpl3 = playIntegrityHelper.playIntegrityState;
                PlayIntegrityHelper.PlayIntegrityState.Preparing preparing = PlayIntegrityHelper.PlayIntegrityState.Preparing.INSTANCE;
                this.L$0 = mutexImpl2;
                this.L$1 = playIntegrityHelper;
                this.this$0 = str;
                this.label = 2;
                stateFlowImpl3.getClass();
                stateFlowImpl3.updateState(null, preparing);
                if (Unit.INSTANCE == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                playIntegrityHelper2 = playIntegrityHelper;
                RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory2 = playIntegrityHelper2.standardIntegrityManagerFactory;
                Context context2 = playIntegrityHelper2.applicationContext;
                realStandardIntegrityManagerFactory2.getClass();
                context2.getClass();
                be createStandard2 = IntegrityManagerFactory.createStandard(context2);
                createStandard2.getClass();
                i builder2 = k.builder();
                builder2.a = Long.parseLong(str);
                builder2.c = (byte) (builder2.c | 1);
                k build2 = builder2.build();
                this.L$0 = mutexImpl2;
                this.L$1 = playIntegrityHelper2;
                this.this$0 = createStandard2;
                this.label = 3;
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                cancellableContinuationImpl2.initCancellability();
                zzw zzwVar2 = (zzw) createStandard2.prepareIntegrityToken(build2);
                zzwVar2.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new o0(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl2, 6), 13));
                zzwVar2.addOnFailureListener(new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl2, 4));
                result = cancellableContinuationImpl2.getResult();
                if (result == coroutineSingletons4) {
                }
                Object obj322 = ((Result) result).value;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj322);
                if (m4120exceptionOrNullimpl != null) {
                }
                mutex.unlock(null);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowContextAdapter$updateState$1(PlayIntegrityHelper playIntegrityHelper, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.L$2 = playIntegrityHelper;
        this.$newState = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowContextAdapter$updateState$1(SubtreeManager subtreeManager, WorkflowState workflowState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.this$0 = subtreeManager;
        this.$newState = workflowState;
    }
}
