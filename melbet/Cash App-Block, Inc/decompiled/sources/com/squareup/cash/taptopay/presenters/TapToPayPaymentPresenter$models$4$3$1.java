package com.squareup.cash.taptopay.presenters;

import androidx.compose.runtime.MutableState;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.taptopay.backend.api.EmvAlertType;
import com.squareup.cash.taptopay.backend.api.TagCommunicationData;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.kotterknife.Lazy;
import com.squareup.scannerview.TextSetter;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class TapToPayPaymentPresenter$models$4$3$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState $state$delegate;
    public final /* synthetic */ CardLockPresenter this$0;

    public TapToPayPaymentPresenter$models$4$3$1(CardLockPresenter cardLockPresenter, MutableState mutableState) {
        this.this$0 = cardLockPresenter;
        this.$state$delegate = mutableState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        SpanTracking startTrackingSpan$default;
        List list;
        TapToPayPaymentViewModel.AlertTone alertTone;
        switch (this.$r8$classId) {
            case 0:
                TagCommunicationData tagCommunicationData = (TagCommunicationData) obj;
                byte[] bArr = tagCommunicationData.data;
                CardLockPresenter cardLockPresenter = this.this$0;
                zzai zzaiVar = (zzai) cardLockPresenter.args;
                if (bArr != null) {
                    startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) zzaiVar.zab, null, "send_response_apdu", null, null, 12);
                    try {
                        TextSetter textSetter = (TextSetter) zzaiVar.zza;
                        if (!textSetter.getEmbeddedCardReader().isReaderStopped()) {
                            textSetter.getEmbeddedCardReader().sendResponseApdu(bArr);
                        }
                    } finally {
                    }
                } else {
                    zzaiVar.notifyCardError();
                    MutableState mutableState = this.$state$delegate;
                    TapToPayPaymentPresenter$State.FailureReason failureReason = TapToPayPaymentPresenter$State.FailureReason.APDU_TRANSCEIVE_ERROR;
                    String str = tagCommunicationData.errorMsg;
                    zzai zzaiVar2 = (zzai) cardLockPresenter.args;
                    startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default((RealObservabilityManager) zzaiVar2.zab, null, "get_packaged_logs", null, null, 12);
                    try {
                        Lazy lazy = (Lazy) ((AssetPublicSuffixList) zzaiVar2.zad).path;
                        synchronized (lazy.value) {
                            list = CollectionsKt.toList((ArrayDeque) lazy.initializer);
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63);
                        SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                        mutableState.setValue(new TapToPayPaymentPresenter$State.RetryableFailure(failureReason, str, joinToString$default));
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            default:
                EmvAlertType emvAlertType = (EmvAlertType) obj;
                MutableState mutableState2 = this.$state$delegate;
                int i = emvAlertType == null ? -1 : TapToPayPaymentPresenter$WhenMappings.$EnumSwitchMapping$1[emvAlertType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Timber.Forest.i("PlayAlertTone", new Object[0]);
                        ((RealCashVibrator) this.this$0.analytics).error();
                        alertTone = TapToPayPaymentViewModel.AlertTone.FAILURE;
                    }
                    return Unit.INSTANCE;
                }
                Timber.Forest.i("PlaySuccessTone", new Object[0]);
                alertTone = TapToPayPaymentViewModel.AlertTone.SUCCESS;
                mutableState2.setValue(alertTone);
                return Unit.INSTANCE;
        }
    }

    public TapToPayPaymentPresenter$models$4$3$1(CoroutineScope coroutineScope, CardLockPresenter cardLockPresenter, MutableState mutableState) {
        this.this$0 = cardLockPresenter;
        this.$state$delegate = mutableState;
    }
}
