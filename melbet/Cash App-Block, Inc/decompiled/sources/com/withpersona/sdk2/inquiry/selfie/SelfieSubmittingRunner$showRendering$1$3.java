package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieSubmittingScreenBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SelfieSubmittingRunner$showRendering$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ SelfieWorkflow.Screen.SubmittingScreen $rendering;
    public final /* synthetic */ Pi2SelfieSubmittingScreenBinding $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieSubmittingRunner$showRendering$1$3(Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding, SelfieWorkflow.Screen.SubmittingScreen submittingScreen, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = pi2SelfieSubmittingScreenBinding;
        this.$rendering = submittingScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelfieSubmittingRunner$showRendering$1$3(this.$this_apply, this.$rendering, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelfieSubmittingRunner$showRendering$1$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding = this.$this_apply;
        InputStream openRawResource = pi2SelfieSubmittingScreenBinding.pendingAnimation.getContext().getResources().openRawResource(R.raw.pi2_selfie_processing);
        openRawResource.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), PKIFailureInfo.certRevoked);
        try {
            String readText = AppUpdateData.readText(bufferedReader);
            bufferedReader.close();
            StepStyles.SelfieStepStyle selfieStepStyle = this.$rendering.styles;
            pi2SelfieSubmittingScreenBinding.pendingAnimation.setAnimationFromJson(ImageStylingKt.applyStyleToLottieJson(readText, selfieStepStyle != null ? selfieStepStyle.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), "pi2_selfie_processing");
            return Unit.INSTANCE;
        } finally {
        }
    }
}
