package com.squareup.workflow1.ui;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class BackButtonScreen$viewFactory$2 extends Lambda implements Function4 {
    public static final BackButtonScreen$viewFactory$2 INSTANCE = new BackButtonScreen$viewFactory$2(4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        Function2 function2 = (Function2) obj2;
        BackButtonScreen backButtonScreen = (BackButtonScreen) obj3;
        ViewEnvironment viewEnvironment = (ViewEnvironment) obj4;
        view.getClass();
        function2.getClass();
        backButtonScreen.getClass();
        viewEnvironment.getClass();
        BackPressHandlerKt.setBackPressedHandler(view, backButtonScreen.onBackPressed);
        function2.invoke(backButtonScreen.wrapped, viewEnvironment);
        return Unit.INSTANCE;
    }
}
