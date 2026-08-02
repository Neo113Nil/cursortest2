package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359aa {

    /* renamed from: a, reason: collision with root package name */
    public final Xl f6997a = new Xl();

    /* renamed from: b, reason: collision with root package name */
    public C0411ca f6998b = new C0411ca();

    public final synchronized void a(C0411ca c0411ca) {
        this.f6998b = c0411ca;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.j.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f6998b.f7132a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C0411ca c0411ca = this.f6998b;
                    IdentifierStatus identifierStatus = c0411ca.f7133b;
                    String str2 = c0411ca.f7134c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new O0.b();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f6997a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
