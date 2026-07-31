package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class l2 extends Lambda implements Function0 {
    public final /* synthetic */ y4 a;
    public final /* synthetic */ UniWebViewNativeChannel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(y4 y4Var, UniWebViewNativeChannel uniWebViewNativeChannel) {
        super(0);
        this.a = y4Var;
        this.b = uniWebViewNativeChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y4 y4Var = this.a;
        UniWebViewNativeChannel uniWebViewNativeChannel = this.b;
        y4Var.getClass();
        UniWebViewInterface.channel = uniWebViewNativeChannel;
        return Unit.INSTANCE;
    }
}
