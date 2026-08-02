package com.squareup.workflow1.ui.backstack;

import android.content.Context;
import android.view.ViewGroup;
import com.squareup.cash.R;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class BackStackContainer$Companion$1 extends Lambda implements Function4 {
    public static final BackStackContainer$Companion$1 INSTANCE = new BackStackContainer$Companion$1(4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BackStackScreen backStackScreen = (BackStackScreen) obj;
        ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
        Context context = (Context) obj3;
        backStackScreen.getClass();
        viewEnvironment.getClass();
        context.getClass();
        BackStackContainer backStackContainer = new BackStackContainer(context, null, 0, 14);
        backStackContainer.setId(R.id.workflow_back_stack_container);
        backStackContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewShowRenderingKt.bindShowRendering(backStackContainer, backStackScreen, viewEnvironment, new WorkApplet$applet$1(2, backStackContainer, BackStackContainer.class, "update", "update(Lcom/squareup/workflow1/ui/backstack/BackStackScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 23));
        return backStackContainer;
    }
}
