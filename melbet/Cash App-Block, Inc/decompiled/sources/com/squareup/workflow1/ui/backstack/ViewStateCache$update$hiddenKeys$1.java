package com.squareup.workflow1.ui.backstack;

import com.squareup.workflow1.ui.Named;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class ViewStateCache$update$hiddenKeys$1 extends Lambda implements Function1 {
    public static final ViewStateCache$update$hiddenKeys$1 INSTANCE = new ViewStateCache$update$hiddenKeys$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Named named = (Named) obj;
        named.getClass();
        return named.compatibilityKey;
    }
}
