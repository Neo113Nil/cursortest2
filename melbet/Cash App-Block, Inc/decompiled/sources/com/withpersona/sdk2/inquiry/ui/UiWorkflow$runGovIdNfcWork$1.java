package com.withpersona.sdk2.inquiry.ui;

import androidx.compose.material.SliderKt$$ExternalSyntheticLambda4;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.ui.UiState;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiWorkflow$runGovIdNfcWork$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GovernmentIdNfcScan.Attributes $attributes;
    public final /* synthetic */ StatefulWorkflow.RenderContext $context;
    public final /* synthetic */ Date $dateOfBirth;
    public final /* synthetic */ String $documentNumber;
    public final /* synthetic */ Date $expirationDate;
    public final /* synthetic */ UiState.Displaying.NfcScan $nfcScan;
    public final /* synthetic */ UiState.Displaying $renderState;
    public final /* synthetic */ UiWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiWorkflow$runGovIdNfcWork$1(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, GovernmentIdNfcScan.Attributes attributes, String str, Date date, Date date2, UiState.Displaying.NfcScan nfcScan, UiState.Displaying displaying, Continuation continuation) {
        super(2, continuation);
        this.$context = renderContext;
        this.this$0 = uiWorkflow;
        this.$attributes = attributes;
        this.$documentNumber = str;
        this.$dateOfBirth = date;
        this.$expirationDate = date2;
        this.$nfcScan = nfcScan;
        this.$renderState = displaying;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UiWorkflow$runGovIdNfcWork$1(this.$context, this.this$0, this.$attributes, this.$documentNumber, this.$dateOfBirth, this.$expirationDate, this.$nfcScan, this.$renderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UiWorkflow$runGovIdNfcWork$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Sink actionSink = this.$context.$$delegate_0.getActionSink();
        GovernmentIdNfcScan.Attributes attributes = this.$attributes;
        UiWorkflow uiWorkflow = this.this$0;
        actionSink.send(Workflows.action$default(uiWorkflow, new SliderKt$$ExternalSyntheticLambda4(attributes, uiWorkflow, this.$documentNumber, this.$dateOfBirth, this.$expirationDate, this.$nfcScan, this.$renderState, 7)));
        return Unit.INSTANCE;
    }
}
