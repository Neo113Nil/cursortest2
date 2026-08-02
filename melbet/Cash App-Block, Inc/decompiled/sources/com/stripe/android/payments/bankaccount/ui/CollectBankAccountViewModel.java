package com.stripe.android.payments.bankaccount.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzje;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class CollectBankAccountViewModel extends ViewModel {
    public final SharedFlowImpl _viewEffect;
    public final CollectBankAccountContract.Args args;
    public final AttachFinancialConnectionsSession attachFinancialConnectionsSession;
    public final o0 createFinancialConnectionsSession;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final Payload retrieveStripeIntent;
    public final SavedStateHandle savedStateHandle;
    public final SharedFlowImpl viewEffect;

    public CollectBankAccountViewModel(CollectBankAccountContract.Args args, SharedFlowImpl sharedFlowImpl, o0 o0Var, AttachFinancialConnectionsSession attachFinancialConnectionsSession, Payload payload, SavedStateHandle savedStateHandle, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        this.args = args;
        this._viewEffect = sharedFlowImpl;
        this.createFinancialConnectionsSession = o0Var;
        this.attachFinancialConnectionsSession = attachFinancialConnectionsSession;
        this.retrieveStripeIntent = payload;
        this.savedStateHandle = savedStateHandle;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.viewEffect = sharedFlowImpl;
        if (Intrinsics.areEqual(savedStateHandle.get("key_has_launched"), Boolean.TRUE)) {
            return;
        }
        JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HazeSourceNode$launchPreDraw$1(this, null, 5), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$createFinancialConnectionsSession(CollectBankAccountViewModel collectBankAccountViewModel, ContinuationImpl continuationImpl) {
        CollectBankAccountViewModel$createFinancialConnectionsSession$1 collectBankAccountViewModel$createFinancialConnectionsSession$1;
        CollectBankAccountViewModel$createFinancialConnectionsSession$1 collectBankAccountViewModel$createFinancialConnectionsSession$12;
        Object m4267forSetupIntenthUnOzRk;
        String str;
        LinkMode linkMode;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        Throwable m4120exceptionOrNullimpl;
        CollectBankAccountContract.Args args = collectBankAccountViewModel.args;
        if (continuationImpl instanceof CollectBankAccountViewModel$createFinancialConnectionsSession$1) {
            collectBankAccountViewModel$createFinancialConnectionsSession$1 = (CollectBankAccountViewModel$createFinancialConnectionsSession$1) continuationImpl;
            int i = collectBankAccountViewModel$createFinancialConnectionsSession$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                collectBankAccountViewModel$createFinancialConnectionsSession$1.label = i - PKIFailureInfo.systemUnavail;
                collectBankAccountViewModel$createFinancialConnectionsSession$12 = collectBankAccountViewModel$createFinancialConnectionsSession$1;
                Object obj4 = collectBankAccountViewModel$createFinancialConnectionsSession$12.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (collectBankAccountViewModel$createFinancialConnectionsSession$12.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj4);
                        if (args instanceof CollectBankAccountContract.Args.ForDeferredPaymentIntent) {
                            CollectBankAccountContract.Args.ForDeferredPaymentIntent forDeferredPaymentIntent = (CollectBankAccountContract.Args.ForDeferredPaymentIntent) args;
                            ElementsSessionContext access$retrieveElementsSessionContext = zzje.access$retrieveElementsSessionContext(forDeferredPaymentIntent.configuration);
                            o0 o0Var = collectBankAccountViewModel.createFinancialConnectionsSession;
                            String str3 = forDeferredPaymentIntent.publishableKey;
                            String str4 = forDeferredPaymentIntent.stripeAccountId;
                            String str5 = forDeferredPaymentIntent.hostedSurface;
                            String str6 = "instant_debits";
                            String str7 = forDeferredPaymentIntent.elementsSessionId;
                            String str8 = forDeferredPaymentIntent.customerId;
                            String str9 = forDeferredPaymentIntent.onBehalfOf;
                            LinkMode linkMode2 = access$retrieveElementsSessionContext != null ? access$retrieveElementsSessionContext.linkMode : null;
                            Integer num = forDeferredPaymentIntent.amount;
                            String str10 = forDeferredPaymentIntent.currency;
                            CollectBankAccountConfiguration configuration = args.getConfiguration();
                            if (configuration instanceof CollectBankAccountConfiguration.InstantDebits) {
                                obj2 = null;
                            } else {
                                if (!(configuration instanceof CollectBankAccountConfiguration.USBankAccountInternal) && !(configuration instanceof CollectBankAccountConfiguration.USBankAccount)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                obj2 = null;
                                str6 = null;
                            }
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.L$0 = obj2;
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.label = 1;
                            m4267forSetupIntenthUnOzRk = o0Var.m4265forDeferredIntent5p_uFSQ(str3, str4, str7, str8, str9, str5, linkMode2, num, str10, str6, collectBankAccountViewModel$createFinancialConnectionsSession$12);
                            if (m4267forSetupIntenthUnOzRk == obj5) {
                                return obj5;
                            }
                        } else if (args instanceof CollectBankAccountContract.Args.ForDeferredSetupIntent) {
                            CollectBankAccountContract.Args.ForDeferredSetupIntent forDeferredSetupIntent = (CollectBankAccountContract.Args.ForDeferredSetupIntent) args;
                            ElementsSessionContext access$retrieveElementsSessionContext2 = zzje.access$retrieveElementsSessionContext(forDeferredSetupIntent.configuration);
                            o0 o0Var2 = collectBankAccountViewModel.createFinancialConnectionsSession;
                            String str11 = forDeferredSetupIntent.publishableKey;
                            String str12 = forDeferredSetupIntent.stripeAccountId;
                            String str13 = forDeferredSetupIntent.hostedSurface;
                            String str14 = forDeferredSetupIntent.elementsSessionId;
                            String str15 = forDeferredSetupIntent.customerId;
                            String str16 = forDeferredSetupIntent.onBehalfOf;
                            if (access$retrieveElementsSessionContext2 != null) {
                                linkMode = access$retrieveElementsSessionContext2.linkMode;
                                str = "instant_debits";
                            } else {
                                str = "instant_debits";
                                linkMode = null;
                            }
                            CollectBankAccountConfiguration configuration2 = args.getConfiguration();
                            if (configuration2 instanceof CollectBankAccountConfiguration.InstantDebits) {
                                str2 = str;
                                obj = null;
                            } else {
                                if (!(configuration2 instanceof CollectBankAccountConfiguration.USBankAccountInternal) && !(configuration2 instanceof CollectBankAccountConfiguration.USBankAccount)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                obj = null;
                                str2 = null;
                            }
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.L$0 = obj;
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.label = 2;
                            m4267forSetupIntenthUnOzRk = o0Var2.m4265forDeferredIntent5p_uFSQ(str11, str12, str14, str15, str16, str13, linkMode, null, null, str2, collectBankAccountViewModel$createFinancialConnectionsSession$12);
                            if (m4267forSetupIntenthUnOzRk == obj5) {
                                return obj5;
                            }
                        } else if (args instanceof CollectBankAccountContract.Args.ForPaymentIntent) {
                            o0 o0Var3 = collectBankAccountViewModel.createFinancialConnectionsSession;
                            CollectBankAccountContract.Args.ForPaymentIntent forPaymentIntent = (CollectBankAccountContract.Args.ForPaymentIntent) args;
                            String str17 = forPaymentIntent.publishableKey;
                            String str18 = forPaymentIntent.stripeAccountId;
                            String str19 = forPaymentIntent.hostedSurface;
                            String str20 = forPaymentIntent.clientSecret;
                            CollectBankAccountConfiguration collectBankAccountConfiguration = forPaymentIntent.configuration;
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.label = 3;
                            m4267forSetupIntenthUnOzRk = o0Var3.m4266forPaymentIntenthUnOzRk(str17, str20, str18, str19, collectBankAccountConfiguration, collectBankAccountViewModel$createFinancialConnectionsSession$12);
                            if (m4267forSetupIntenthUnOzRk == obj5) {
                                return obj5;
                            }
                        } else {
                            if (!(args instanceof CollectBankAccountContract.Args.ForSetupIntent)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            o0 o0Var4 = collectBankAccountViewModel.createFinancialConnectionsSession;
                            CollectBankAccountContract.Args.ForSetupIntent forSetupIntent = (CollectBankAccountContract.Args.ForSetupIntent) args;
                            String str21 = forSetupIntent.publishableKey;
                            String str22 = forSetupIntent.stripeAccountId;
                            String str23 = forSetupIntent.hostedSurface;
                            String str24 = forSetupIntent.clientSecret;
                            CollectBankAccountConfiguration collectBankAccountConfiguration2 = forSetupIntent.configuration;
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.label = 4;
                            m4267forSetupIntenthUnOzRk = o0Var4.m4267forSetupIntenthUnOzRk(str21, str24, str22, str23, collectBankAccountConfiguration2, collectBankAccountViewModel$createFinancialConnectionsSession$12);
                            if (m4267forSetupIntenthUnOzRk == obj5) {
                                return obj5;
                            }
                        }
                        Result.Companion companion = Result.Companion;
                        if (!(m4267forSetupIntenthUnOzRk instanceof Result.Failure)) {
                            try {
                                m4267forSetupIntenthUnOzRk = ((FinancialConnectionsSession) m4267forSetupIntenthUnOzRk).clientSecret;
                                if (m4267forSetupIntenthUnOzRk == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                m4267forSetupIntenthUnOzRk = new Result.Failure(th);
                            }
                        }
                        if (!(m4267forSetupIntenthUnOzRk instanceof Result.Failure)) {
                            String str25 = (String) m4267forSetupIntenthUnOzRk;
                            collectBankAccountViewModel.logger.debug("Bank account session created! " + str25 + ".");
                            collectBankAccountViewModel.savedStateHandle.set(Boolean.TRUE, "key_has_launched");
                            ElementsSessionContext access$retrieveElementsSessionContext3 = zzje.access$retrieveElementsSessionContext(args.getConfiguration());
                            SharedFlowImpl sharedFlowImpl = collectBankAccountViewModel._viewEffect;
                            CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow = new CollectBankAccountViewEffect.OpenConnectionsFlow(args.getPublishableKey(), str25, args.getStripeAccountId(), access$retrieveElementsSessionContext3);
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.L$0 = m4267forSetupIntenthUnOzRk;
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.label = 5;
                            if (sharedFlowImpl.emit(openConnectionsFlow, collectBankAccountViewModel$createFinancialConnectionsSession$12) == obj5) {
                                return obj5;
                            }
                            obj3 = m4267forSetupIntenthUnOzRk;
                            m4267forSetupIntenthUnOzRk = obj3;
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4267forSetupIntenthUnOzRk);
                        if (m4120exceptionOrNullimpl != null) {
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.L$0 = m4267forSetupIntenthUnOzRk;
                            collectBankAccountViewModel$createFinancialConnectionsSession$12.label = 6;
                            if (collectBankAccountViewModel.finishWithError(m4120exceptionOrNullimpl, collectBankAccountViewModel$createFinancialConnectionsSession$12) == obj5) {
                                return obj5;
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        SafeTrace.throwOnFailure(obj4);
                        m4267forSetupIntenthUnOzRk = ((Result) obj4).value;
                        Result.Companion companion3 = Result.Companion;
                        if (!(m4267forSetupIntenthUnOzRk instanceof Result.Failure)) {
                        }
                        if (!(m4267forSetupIntenthUnOzRk instanceof Result.Failure)) {
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4267forSetupIntenthUnOzRk);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        obj3 = collectBankAccountViewModel$createFinancialConnectionsSession$12.L$0;
                        SafeTrace.throwOnFailure(obj4);
                        m4267forSetupIntenthUnOzRk = obj3;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4267forSetupIntenthUnOzRk);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        SafeTrace.throwOnFailure(obj4);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        collectBankAccountViewModel$createFinancialConnectionsSession$1 = new CollectBankAccountViewModel$createFinancialConnectionsSession$1(collectBankAccountViewModel, continuationImpl);
        collectBankAccountViewModel$createFinancialConnectionsSession$12 = collectBankAccountViewModel$createFinancialConnectionsSession$1;
        Object obj42 = collectBankAccountViewModel$createFinancialConnectionsSession$12.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (collectBankAccountViewModel$createFinancialConnectionsSession$12.label) {
        }
    }

    public final Object finishWithError(Throwable th, ContinuationImpl continuationImpl) {
        this.logger.error("Error", new Exception(th));
        Object finishWithResult = finishWithResult(new CollectBankAccountResultInternal.Failed(th), continuationImpl);
        return finishWithResult == CoroutineSingletons.COROUTINE_SUSPENDED ? finishWithResult : Unit.INSTANCE;
    }

    public final Object finishWithResult(CollectBankAccountResultInternal collectBankAccountResultInternal, ContinuationImpl continuationImpl) {
        Object emit = this._viewEffect.emit(new CollectBankAccountViewEffect.FinishWithResult(collectBankAccountResultInternal), continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
    }
}
