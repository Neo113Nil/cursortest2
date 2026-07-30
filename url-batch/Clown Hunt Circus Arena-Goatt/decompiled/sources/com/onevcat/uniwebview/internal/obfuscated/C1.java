package com.onevcat.uniwebview.internal.obfuscated;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class C1 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String b;
        Set set;
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        String domain = this.a;
        String fingerprint = this.b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        com.onevcat.uniwebview.c cVar = aVar.e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        String a = com.onevcat.uniwebview.c.a(domain);
        if (a != null && (b = com.onevcat.uniwebview.c.b(fingerprint)) != null && (set = (Set) cVar.j.get(a)) != null && set.remove(b)) {
            if (set.isEmpty()) {
                cVar.j.remove(a);
            }
            B b2 = B.b;
            String message = "Removed SSL fingerprint for domain '" + a + "'. Remaining count: " + set.size();
            b2.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b2.a(A.VERBOSE, message);
        }
        return Unit.INSTANCE;
    }
}
