package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;

/* loaded from: classes9.dex */
public final class SelfieRestartCameraRunner implements LayoutRunner {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(6);

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
        viewEnvironment.getClass();
        ((SelfieWorkflow.Screen.RestartCameraScreen) obj).rendered.invoke();
    }
}
