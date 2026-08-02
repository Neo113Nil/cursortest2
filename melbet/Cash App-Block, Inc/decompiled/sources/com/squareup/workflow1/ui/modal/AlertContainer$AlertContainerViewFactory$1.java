package com.squareup.workflow1.ui.modal;

import android.content.Context;
import android.view.ViewGroup;
import com.squareup.cash.R;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class AlertContainer$AlertContainerViewFactory$1 extends Lambda implements Function4 {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) obj;
        ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
        Context context = (Context) obj3;
        alertContainerScreen.getClass();
        viewEnvironment.getClass();
        context.getClass();
        AlertContainer alertContainer = new AlertContainer(context, null, 0, 14);
        alertContainer.setId(R.id.workflow_alert_container);
        alertContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewShowRenderingKt.bindShowRendering(alertContainer, alertContainerScreen, viewEnvironment, new WorkApplet$applet$1(2, alertContainer, AlertContainer.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 24));
        return alertContainer;
    }
}
