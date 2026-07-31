package com.onevcat.uniwebview;

import com.imaginationoverflow.unity.referrer.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class h2 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s0 it = (s0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this.a;
        if (str == null) {
            it.p.loadUrl(BuildConfig.FLAVOR);
        } else {
            it.p.loadUrl(str);
        }
        return Unit.INSTANCE;
    }
}
