package com.squareup.workflow1.ui;

import com.squareup.workflow1.ui.NamedViewFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public final class BackButtonScreen implements AndroidViewRendering {
    public final Function0 onBackPressed;
    public final DecorativeViewFactory viewFactory;
    public final Object wrapped;

    public BackButtonScreen(Object obj, Function0 function0) {
        obj.getClass();
        this.wrapped = obj;
        this.onBackPressed = function0;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(BackButtonScreen.class), NamedViewFactory.AnonymousClass1.INSTANCE$1, 4);
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }
}
