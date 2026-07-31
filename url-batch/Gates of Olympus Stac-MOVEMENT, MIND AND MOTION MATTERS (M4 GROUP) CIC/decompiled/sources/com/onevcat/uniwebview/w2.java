package com.onevcat.uniwebview;

import android.webkit.CookieManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class w2 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        CookieManager.getInstance().setAcceptThirdPartyCookies(it.p, this.a);
        return Unit.INSTANCE;
    }
}
