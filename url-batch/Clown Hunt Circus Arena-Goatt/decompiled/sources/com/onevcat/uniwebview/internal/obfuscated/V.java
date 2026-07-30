package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class V extends Lambda implements Function0 {
    public final /* synthetic */ com.onevcat.uniwebview.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(com.onevcat.uniwebview.a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Enabling channel messaging for webview: " + this.a.getName();
    }
}
