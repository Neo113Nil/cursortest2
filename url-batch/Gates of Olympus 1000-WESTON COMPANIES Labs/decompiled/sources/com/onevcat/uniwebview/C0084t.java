package com.onevcat.uniwebview;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0084t extends Lambda implements Function0 {
    public final /* synthetic */ C0093w a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084t(C0093w c0093w) {
        super(0);
        this.a = c0093w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.get_webClient$uniwebview_release().g;
    }
}
