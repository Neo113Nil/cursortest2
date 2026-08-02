package com.withpersona.sdk2.inquiry.ui.state;

import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.ui.UiState;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiStepStateManager$runGovIdNfcWork$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ GovernmentIdNfcScan.Attributes $attributes;
    public final /* synthetic */ Date $dateOfBirth;
    public final /* synthetic */ String $documentNumber;
    public final /* synthetic */ Date $expirationDate;
    public final /* synthetic */ UiState.Displaying.NfcScan $nfcScan;
    public final /* synthetic */ UiState.Displaying $renderState;
    public final /* synthetic */ UiStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStepStateManager$runGovIdNfcWork$1(GovernmentIdNfcScan.Attributes attributes, UiStepStateManager uiStepStateManager, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, Continuation continuation) {
        super(1, continuation);
        this.$attributes = attributes;
        this.this$0 = uiStepStateManager;
        this.$documentNumber = str;
        this.$dateOfBirth = date;
        this.$expirationDate = date2;
        this.$nfcScan = nfcScan;
        this.$renderState = displaying;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UiStepStateManager$runGovIdNfcWork$1(this.$attributes, this.this$0, this.$documentNumber, this.$dateOfBirth, this.$expirationDate, this.$nfcScan, this.$renderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UiStepStateManager$runGovIdNfcWork$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UiStepStateManager uiStepStateManager = this.this$0;
        GovernmentIdNfcScan.Attributes attributes = this.$attributes;
        if (attributes == null || (string2 = attributes.getRequiredText()) == null) {
            string2 = uiStepStateManager.applicationContext.getString(R.string.pi2_retry);
            string2.getClass();
        }
        if (StringsKt.isBlank(this.$documentNumber)) {
            linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string2);
        }
        if (this.$dateOfBirth == null) {
            linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string2);
        }
        if (this.$expirationDate == null) {
            linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string2);
        }
        uiStepStateManager.updateState(UiState.Displaying.copy$default(this.$renderState, null, CollectionsKt__CollectionsJVMKt.listOf(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.$nfcScan.component.name, null, linkedHashMap, 2, null)), null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.DQT_MARKER));
        return Unit.INSTANCE;
    }
}
