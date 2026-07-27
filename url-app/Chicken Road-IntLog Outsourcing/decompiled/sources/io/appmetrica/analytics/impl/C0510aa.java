package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510aa {

    /* renamed from: a, reason: collision with root package name */
    public final Xl f7841a = new Xl();

    /* renamed from: b, reason: collision with root package name */
    public C0562ca f7842b = new C0562ca();

    public final synchronized void a(C0562ca c0562ca) {
        this.f7842b = c0562ca;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.i.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f7842b.f7988a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C0562ca c0562ca = this.f7842b;
                    IdentifierStatus identifierStatus = c0562ca.f7989b;
                    String str2 = c0562ca.f7990c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new C1.b();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f7841a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
