package com.onevcat.uniwebview;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class x extends Lambda implements Function0 {
    public final /* synthetic */ b0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var) {
        super(0);
        this.a = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.get_webClient$uniwebview_release().g;
    }
}
