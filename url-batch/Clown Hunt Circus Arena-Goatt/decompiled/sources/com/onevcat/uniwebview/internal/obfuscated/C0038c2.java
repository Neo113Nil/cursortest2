package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.CookieManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038c2 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038c2(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        CookieManager.getInstance().setAcceptThirdPartyCookies(it.v, this.a);
        return Unit.INSTANCE;
    }
}
