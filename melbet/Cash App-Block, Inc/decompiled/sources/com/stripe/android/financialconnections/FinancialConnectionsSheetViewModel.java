package com.stripe.android.financialconnections;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.cct.StringMerger;
import com.google.android.gms.common.zzz;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.attestation.IntegrityStandardRequestManager;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.InvalidParameterException;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import net.idrnd.face.iad.capture.internal.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetViewModel extends FinancialConnectionsViewModel {
    public static final InitializerViewModelFactory Factory;
    public final FinancialConnectionsAnalyticsTrackerImpl analyticsTracker;
    public final String applicationId;
    public final RealStandardIntegrityManagerFactory browserManager;
    public final DefaultFinancialConnectionsEventReporter eventReporter;
    public final Lazy fetchFinancialConnectionsSession;
    public final o0 fetchFinancialConnectionsSessionForToken;
    public final GetOrFetchSync getOrFetchSync;
    public final FinancialConnectionsSheetState initialState;
    public final IntegrityStandardRequestManager integrityRequestManager;
    public final IntegrityVerdictManager integrityVerdictManager;
    public final CoroutineDispatcher ioDispatcher;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final MutexImpl mutex;
    public final ToolbarTuckTargets nativeRouter;

    public abstract class AttestationInitResult {
        public final boolean supportsAppVerification;

        public final class Failure extends AttestationInitResult {
            public final Throwable error;

            public Failure(Throwable th) {
                super(false);
                this.error = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && this.error.equals(((Failure) obj).error);
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.error);
            }
        }

        public final class Skipped extends AttestationInitResult {
            public static final Skipped INSTANCE = new Skipped(false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Skipped);
            }

            public final int hashCode() {
                return 1584305905;
            }

            public final String toString() {
                return "Skipped";
            }
        }

        public final class Success extends AttestationInitResult {
            public static final Success INSTANCE = new Success(true);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public final int hashCode() {
                return 1864658884;
            }

            public final String toString() {
                return "Success";
            }
        }

        public AttestationInitResult(boolean z) {
            this.supportsAppVerification = z;
        }
    }

    static {
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        chunkIndexMerger.addInitializer(Reflection.factory.getOrCreateKotlinClass(FinancialConnectionsSheetViewModel.class), new MarkdownParser$$ExternalSyntheticLambda0(7));
        Factory = chunkIndexMerger.build();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel(String str, SavedStateHandle savedStateHandle, GetOrFetchSync getOrFetchSync, IntegrityStandardRequestManager integrityStandardRequestManager, IntegrityVerdictManager integrityVerdictManager, Lazy lazy, o0 o0Var, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory, DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, ToolbarTuckTargets toolbarTuckTargets, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsSheetState financialConnectionsSheetState, CoroutineDispatcher coroutineDispatcher) {
        super(financialConnectionsSheetState, nativeAuthFlowCoordinator);
        Object failure;
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState2;
        str.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        defaultFinancialConnectionsEventReporter.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        nativeAuthFlowCoordinator.getClass();
        coroutineDispatcher.getClass();
        this.applicationId = str;
        this.getOrFetchSync = getOrFetchSync;
        this.integrityRequestManager = integrityStandardRequestManager;
        this.integrityVerdictManager = integrityVerdictManager;
        this.fetchFinancialConnectionsSession = lazy;
        this.fetchFinancialConnectionsSessionForToken = o0Var;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.browserManager = realStandardIntegrityManagerFactory;
        this.eventReporter = defaultFinancialConnectionsEventReporter;
        this.analyticsTracker = financialConnectionsAnalyticsTrackerImpl;
        this.nativeRouter = toolbarTuckTargets;
        this.initialState = financialConnectionsSheetState;
        this.ioDispatcher = coroutineDispatcher;
        this.mutex = new MutexImpl();
        NavHostFragment$$ExternalSyntheticLambda1 navHostFragment$$ExternalSyntheticLambda1 = new NavHostFragment$$ExternalSyntheticLambda1(this, 4);
        JWECryptoParts jWECryptoParts = savedStateHandle.impl;
        jWECryptoParts.getClass();
        ((LinkedHashMap) jWECryptoParts.encryptedKey).put("financial_connections_sheet_state", navHostFragment$$ExternalSyntheticLambda1);
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = financialConnectionsSheetState.initialArgs;
        try {
            Result.Companion companion = Result.Companion;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (StringsKt.isBlank(financialConnectionsSheetActivityArgs.getConfiguration().financialConnectionsSessionClientSecret)) {
            throw new InvalidParameterException("The session client secret cannot be an empty string.");
        }
        if (StringsKt.isBlank(financialConnectionsSheetActivityArgs.getConfiguration().publishableKey)) {
            throw new InvalidParameterException("The publishable key cannot be an empty string.");
        }
        failure = Unit.INSTANCE;
        if (failure instanceof Result.Failure) {
            FinancialConnectionsSheetActivityResult.Failed failed = new FinancialConnectionsSheetActivityResult.Failed(new IllegalStateException("Invalid configuration provided when instantiating activity"));
            StateFlowImpl stateFlowImpl = this._stateFlow;
            do {
                value = stateFlowImpl.getValue();
                financialConnectionsSheetState2 = (FinancialConnectionsSheetState) value;
                financialConnectionsSheetState2.getClass();
            } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState2, false, null, null, new FinancialConnectionsSheetViewEffect$FinishWithResult(failed), 15)));
            return;
        }
        DefaultFinancialConnectionsEventReporter defaultFinancialConnectionsEventReporter2 = this.eventReporter;
        defaultFinancialConnectionsEventReporter2.getClass();
        DefaultFinancialConnectionsEventReporter.Event.Code code = DefaultFinancialConnectionsEventReporter.Event.Code.SheetPresented;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        JobKt.launch$default(JobKt.CoroutineScope(defaultFinancialConnectionsEventReporter2.workContext), null, null, new InquiryViewModel.AnonymousClass1(defaultFinancialConnectionsEventReporter2, new DefaultFinancialConnectionsEventReporter.Event(code, emptyMap), null, 2), 3);
        if (this.initialState.manifest == null) {
            JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GovernmentIdFeed$analyze$5(this, null), 3);
        }
    }

    public static final void access$onFlowSuccess(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, FinancialConnectionsSheetState financialConnectionsSheetState, Uri uri) {
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState2;
        if (uri == null) {
            finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(new Exception("Intent url received from web flow is null")), 6);
            return;
        }
        StateFlowImpl stateFlowImpl = financialConnectionsSheetViewModel._stateFlow;
        do {
            value = stateFlowImpl.getValue();
            financialConnectionsSheetState2 = (FinancialConnectionsSheetState) value;
            financialConnectionsSheetState2.getClass();
        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState2, false, null, FinancialConnectionsSheetState.AuthFlowStatus.NONE, null, 23)));
        int ordinal = StringMerger.getFlowType(financialConnectionsSheetState.initialArgs).ordinal();
        int i = 1;
        Continuation continuation = null;
        if (ordinal == 0) {
            JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetViewModel), null, null, new FinancialConnectionsSheetViewModel$onUserCancel$1(financialConnectionsSheetViewModel, financialConnectionsSheetState, continuation, i), 3);
            return;
        }
        if (ordinal != 1) {
            int i2 = 2;
            if (ordinal == 2) {
                JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetViewModel), null, null, new FinancialConnectionsSheetViewModel$onUserCancel$1(financialConnectionsSheetViewModel, financialConnectionsSheetState, continuation, i2), 3);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        Object m2000fromUriIoAF18A = zzz.m2000fromUriIoAF18A(uri);
        Result.Companion companion = Result.Companion;
        if (!(m2000fromUriIoAF18A instanceof Result.Failure)) {
            finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Completed((InstantDebitsResult) m2000fromUriIoAF18A, null, null), 6);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m2000fromUriIoAF18A);
        if (m4120exceptionOrNullimpl != null) {
            financialConnectionsSheetViewModel.logger.error("Could not retrieve payment method parameters from success url", m4120exceptionOrNullimpl);
            finishWithResult$default(financialConnectionsSheetViewModel, new FinancialConnectionsSheetActivityResult.Failed(m4120exceptionOrNullimpl), 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$prepareStandardRequestManager(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, ContinuationImpl continuationImpl) {
        FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1 financialConnectionsSheetViewModel$prepareStandardRequestManager$1;
        int i;
        Object m4078prepareIoAF18A;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1) {
            financialConnectionsSheetViewModel$prepareStandardRequestManager$1 = (FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1) continuationImpl;
            int i2 = financialConnectionsSheetViewModel$prepareStandardRequestManager$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsSheetViewModel$prepareStandardRequestManager$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsSheetViewModel$prepareStandardRequestManager$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsSheetViewModel$prepareStandardRequestManager$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (financialConnectionsSheetViewModel.integrityVerdictManager.verdictFailed) {
                        return AttestationInitResult.Skipped.INSTANCE;
                    }
                    IntegrityStandardRequestManager integrityStandardRequestManager = financialConnectionsSheetViewModel.integrityRequestManager;
                    financialConnectionsSheetViewModel$prepareStandardRequestManager$1.label = 1;
                    m4078prepareIoAF18A = integrityStandardRequestManager.m4078prepareIoAF18A(financialConnectionsSheetViewModel$prepareStandardRequestManager$1);
                    if (m4078prepareIoAF18A == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m4078prepareIoAF18A = ((Result) obj).value;
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4078prepareIoAF18A);
                if (m4120exceptionOrNullimpl == null) {
                    return new AttestationInitResult.Failure(m4120exceptionOrNullimpl);
                }
                return AttestationInitResult.Success.INSTANCE;
            }
        }
        financialConnectionsSheetViewModel$prepareStandardRequestManager$1 = new FinancialConnectionsSheetViewModel$prepareStandardRequestManager$1(financialConnectionsSheetViewModel, continuationImpl);
        Object obj2 = financialConnectionsSheetViewModel$prepareStandardRequestManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsSheetViewModel$prepareStandardRequestManager$1.label;
        if (i != 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4078prepareIoAF18A);
        if (m4120exceptionOrNullimpl == null) {
        }
    }

    public static void finishWithResult$default(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, int i) {
        Object value;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        boolean z = (i & 2) == 0;
        financialConnectionsSheetViewModel.getClass();
        boolean z2 = financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed;
        Continuation continuation = null;
        if (z2) {
            Throwable th = ((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).error;
            if (th instanceof FinancialConnectionsAttestationError) {
                financialConnectionsSheetViewModel.integrityVerdictManager.verdictFailed = true;
                JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsSheetViewModel), null, null, new WorkerWorkflow$render$1(financialConnectionsSheetViewModel, ((FinancialConnectionsAttestationError) th).prefillDetails, continuation, 24), 3);
                return;
            }
        }
        JobKt.launch$default(GlobalScope.INSTANCE, financialConnectionsSheetViewModel.ioDispatcher, null, new WorkerWorkflow$render$1(financialConnectionsSheetViewModel, financialConnectionsSheetActivityResult, continuation, 23), 2);
        if (!z) {
            if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.SUCCESS, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
            } else if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.CANCEL, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
            } else {
                if (!z2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.ErrorCode.UNEXPECTED_ERROR, 3));
            }
        }
        StateFlowImpl stateFlowImpl = financialConnectionsSheetViewModel._stateFlow;
        do {
            value = stateFlowImpl.getValue();
            financialConnectionsSheetState = (FinancialConnectionsSheetState) value;
            financialConnectionsSheetState.getClass();
        } while (!stateFlowImpl.compareAndSet(value, FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, false, null, null, new FinancialConnectionsSheetViewEffect$FinishWithResult(financialConnectionsSheetActivityResult), 15)));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ((FinancialConnectionsSheetState) obj).getClass();
        return null;
    }
}
