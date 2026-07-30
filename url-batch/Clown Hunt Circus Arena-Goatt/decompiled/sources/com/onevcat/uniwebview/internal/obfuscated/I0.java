package com.onevcat.uniwebview.internal.obfuscated;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class I0 extends Lambda implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(String str, String str2) {
        super(1);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
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
        if (a == null) {
            B b = B.b;
            String message = "Cannot pin SSL fingerprint. Invalid domain: '" + domain + '\'';
            b.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b.a(A.CRITICAL, message);
        } else {
            String b2 = com.onevcat.uniwebview.c.b(fingerprint);
            if (b2 == null) {
                B b3 = B.b;
                String message2 = "Cannot pin SSL fingerprint for '" + a + "'. Invalid fingerprint: '" + fingerprint + '\'';
                b3.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                b3.a(A.CRITICAL, message2);
            } else {
                LinkedHashMap linkedHashMap = cVar.j;
                Object obj2 = linkedHashMap.get(a);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(a, obj2);
                }
                ((Set) obj2).add(b2);
                B b4 = B.b;
                String message3 = "Registered SSL fingerprint for domain '" + a + "'.";
                b4.getClass();
                Intrinsics.checkNotNullParameter(message3, "message");
                b4.a(A.VERBOSE, message3);
            }
        }
        return Unit.INSTANCE;
    }
}
