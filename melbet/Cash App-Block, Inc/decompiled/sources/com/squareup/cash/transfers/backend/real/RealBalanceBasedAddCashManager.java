package com.squareup.cash.transfers.backend.real;

import androidx.core.text.TextUtilsCompat;
import androidx.media3.ui.compose.state.PresentationStateKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashManager$DisableResult$Success;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.DisableBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealBalanceBasedAddCashManager {
    public final AppService appService;
    public final StateFlowImpl cachedOverride = FlowKt.MutableStateFlow(null);
    public final RealInstrumentManager instrumentManager;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public RealBalanceBasedAddCashManager(SyncValueReader syncValueReader, RealInstrumentManager realInstrumentManager, AndroidStringManager androidStringManager, RealIcuStringFormatter realIcuStringFormatter, AppService appService) {
        this.syncValueReader = syncValueReader;
        this.instrumentManager = realInstrumentManager;
        this.stringManager = androidStringManager;
        this.appService = appService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object disableOptimistically(ContinuationImpl continuationImpl) {
        RealBalanceBasedAddCashManager$disableOptimistically$1 realBalanceBasedAddCashManager$disableOptimistically$1;
        int i;
        Object obj;
        if (continuationImpl instanceof RealBalanceBasedAddCashManager$disableOptimistically$1) {
            realBalanceBasedAddCashManager$disableOptimistically$1 = (RealBalanceBasedAddCashManager$disableOptimistically$1) continuationImpl;
            int i2 = realBalanceBasedAddCashManager$disableOptimistically$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBalanceBasedAddCashManager$disableOptimistically$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realBalanceBasedAddCashManager$disableOptimistically$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBalanceBasedAddCashManager$disableOptimistically$1.label;
                AndroidStringManager androidStringManager = this.stringManager;
                StateFlowImpl stateFlowImpl = this.cachedOverride;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    BalanceBasedAddCashPreference balanceBasedAddCashPreference = new BalanceBasedAddCashPreference(androidStringManager.get(R.string.balance_based_add_cash_preference_title), androidStringManager.get(R.string.balance_based_add_cash_preference_disabled_subtitle), BalanceBasedAddCashPreference.State.Disabled.INSTANCE);
                    realBalanceBasedAddCashManager$disableOptimistically$1.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, balanceBasedAddCashPreference);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = realBalanceBasedAddCashManager$disableOptimistically$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        final String str = TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) obj, null).message;
                        return new PresentationStateKt(str) { // from class: com.squareup.cash.transfers.backend.api.BalanceBasedAddCashManager$DisableResult$Failure
                            public final String errorMessage;

                            {
                                this.errorMessage = str;
                            }

                            public final boolean equals(Object obj3) {
                                if (this == obj3) {
                                    return true;
                                }
                                return (obj3 instanceof BalanceBasedAddCashManager$DisableResult$Failure) && Intrinsics.areEqual(this.errorMessage, ((BalanceBasedAddCashManager$DisableResult$Failure) obj3).errorMessage);
                            }

                            public final int hashCode() {
                                String str2 = this.errorMessage;
                                if (str2 == null) {
                                    return 0;
                                }
                                return str2.hashCode();
                            }

                            public final String toString() {
                                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(errorMessage=", this.errorMessage, ")");
                            }
                        };
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = (ApiResult) obj2;
                    if (obj instanceof ApiResult.Success) {
                        return BalanceBasedAddCashManager$DisableResult$Success.INSTANCE;
                    }
                    if (!(obj instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    realBalanceBasedAddCashManager$disableOptimistically$1.L$0 = (ApiResult.Failure) obj;
                    realBalanceBasedAddCashManager$disableOptimistically$1.label = 3;
                    stateFlowImpl.setValue(null);
                }
                DisableBalanceBasedAddCashPreferenceRequest disableBalanceBasedAddCashPreferenceRequest = new DisableBalanceBasedAddCashPreferenceRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                realBalanceBasedAddCashManager$disableOptimistically$1.label = 2;
                obj2 = this.appService.disableBalanceBasedAddCashPreference(disableBalanceBasedAddCashPreferenceRequest, realBalanceBasedAddCashManager$disableOptimistically$1);
            }
        }
        realBalanceBasedAddCashManager$disableOptimistically$1 = new RealBalanceBasedAddCashManager$disableOptimistically$1(this, continuationImpl);
        Object obj22 = realBalanceBasedAddCashManager$disableOptimistically$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBalanceBasedAddCashManager$disableOptimistically$1.label;
        AndroidStringManager androidStringManager2 = this.stringManager;
        StateFlowImpl stateFlowImpl2 = this.cachedOverride;
        if (i != 0) {
        }
        DisableBalanceBasedAddCashPreferenceRequest disableBalanceBasedAddCashPreferenceRequest2 = new DisableBalanceBasedAddCashPreferenceRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
        realBalanceBasedAddCashManager$disableOptimistically$1.label = 2;
        obj22 = this.appService.disableBalanceBasedAddCashPreference(disableBalanceBasedAddCashPreferenceRequest2, realBalanceBasedAddCashManager$disableOptimistically$1);
    }

    public final Flow preferences() {
        Continuation continuation = null;
        int i = 0;
        return FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BalanceBasedAddCashPreference), this.instrumentManager.forType(CashInstrumentType.DEBIT_CARD), new CardModelView$getActiveHeat$2$2(this, continuation, 19), i), this.cachedOverride, new RealPasscodeProvider$getPasscode$1(this, continuation, 11), i));
    }
}
