package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final Tl f10988a = new Tl();

    /* renamed from: b, reason: collision with root package name */
    public V9 f10989b = new V9();

    public final synchronized void a(V9 v9) {
        this.f10989b = v9;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.i.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f10989b.f11110a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    V9 v9 = this.f10989b;
                    IdentifierStatus identifierStatus = v9.f11111b;
                    String str2 = v9.f11112c;
                    if (booleanValue) {
                        str = "true";
                    } else {
                        if (booleanValue) {
                            throw new G1.a();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f10988a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
