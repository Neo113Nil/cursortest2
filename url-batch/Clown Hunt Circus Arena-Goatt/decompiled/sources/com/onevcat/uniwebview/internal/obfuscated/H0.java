package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class H0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        String domain = this.a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        com.onevcat.uniwebview.c cVar = aVar.e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        String a = com.onevcat.uniwebview.c.a(domain);
        if (a == null) {
            B b = B.b;
            String message = "Cannot add SSL exception domain. Invalid input: '" + domain + '\'';
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
        } else {
            cVar.i.add(a);
            if (!cVar.k) {
                B b2 = B.b;
                b2.getClass();
                Intrinsics.checkNotNullParameter("AddSslExceptionDomain is deprecated and no longer bypasses SSL errors. Use AddSslPinnedFingerprint instead.", "message");
                b2.a(A.CRITICAL, "AddSslExceptionDomain is deprecated and no longer bypasses SSL errors. Use AddSslPinnedFingerprint instead.");
                cVar.k = true;
            }
        }
        return Unit.INSTANCE;
    }
}
