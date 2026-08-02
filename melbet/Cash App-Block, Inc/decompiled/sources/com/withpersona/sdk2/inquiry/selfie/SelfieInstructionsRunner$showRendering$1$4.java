package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieInstructionsBinding;
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
public final class SelfieInstructionsRunner$showRendering$1$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ int $rawRes;
    public final /* synthetic */ SelfieWorkflow.Screen.InstructionsScreen $rendering;
    public final /* synthetic */ Pi2SelfieInstructionsBinding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieInstructionsRunner$showRendering$1$4(Pi2SelfieInstructionsBinding pi2SelfieInstructionsBinding, int i, SelfieWorkflow.Screen.InstructionsScreen instructionsScreen, String str, Continuation continuation) {
        super(2, continuation);
        this.$this_with = pi2SelfieInstructionsBinding;
        this.$rawRes = i;
        this.$rendering = instructionsScreen;
        this.$cacheKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SelfieInstructionsRunner$showRendering$1$4(this.$this_with, this.$rawRes, this.$rendering, this.$cacheKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelfieInstructionsRunner$showRendering$1$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Pi2SelfieInstructionsBinding pi2SelfieInstructionsBinding = this.$this_with;
        InputStream openRawResource = pi2SelfieInstructionsBinding.instructionAnimation.getContext().getResources().openRawResource(this.$rawRes);
        openRawResource.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), PKIFailureInfo.certRevoked);
        try {
            String readText = AppUpdateData.readText(bufferedReader);
            bufferedReader.close();
            StepStyles.SelfieStepStyle selfieStepStyle = this.$rendering.styles;
            pi2SelfieInstructionsBinding.instructionAnimation.setAnimationFromJson(ImageStylingKt.applyStyleToLottieJson(readText, selfieStepStyle != null ? selfieStepStyle.getSelfieStartIconStyle() : null, new String[]{"#01099C", "#02089C"}, new String[]{"#7378FD"}, new String[]{"#D3D5FF"}, new String[]{"#FFFFFF"}), this.$cacheKey);
            return Unit.INSTANCE;
        } finally {
        }
    }
}
