package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraRestartBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieRestartCameraRunner$Companion$2 extends FunctionReferenceImpl implements Function1 {
    public static final SelfieRestartCameraRunner$Companion$2 INSTANCE = new SelfieRestartCameraRunner$Companion$2(1, SelfieRestartCameraRunner.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraRestartBinding;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Pi2SelfieCameraRestartBinding) obj).getClass();
        return new SelfieRestartCameraRunner();
    }
}
