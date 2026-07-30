package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044d3 extends Lambda implements Function0 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044d3(boolean z) {
        super(0);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WebView.setWebContentsDebuggingEnabled(this.a);
        return Unit.INSTANCE;
    }
}
