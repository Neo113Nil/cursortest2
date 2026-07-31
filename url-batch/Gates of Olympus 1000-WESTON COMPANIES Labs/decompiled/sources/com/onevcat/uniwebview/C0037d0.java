package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0037d0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037d0(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0093w c0093w = it.p;
        String domain = this.a;
        c0093w.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        c0093w.e.i.add(domain);
        return Unit.INSTANCE;
    }
}
