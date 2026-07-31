package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2855oa {

    /* renamed from: a, reason: collision with root package name */
    public final Tl f39567a = new Tl();

    /* renamed from: b, reason: collision with root package name */
    public C2907qa f39568b = new C2907qa();

    public final synchronized void a(C2907qa c2907qa) {
        this.f39568b = c2907qa;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f39568b.f39652a) != null) {
                    boolean booleanValue = bool.booleanValue();
                    C2907qa c2907qa = this.f39568b;
                    IdentifierStatus identifierStatus = c2907qa.f39653b;
                    String str2 = c2907qa.f39654c;
                    if (booleanValue) {
                        str = com.ironsource.mediationsdk.metadata.a.f17681g;
                    } else {
                        if (booleanValue) {
                            throw new W1.m();
                        }
                        str = "false";
                    }
                    hashMap.put("appmetrica_lib_ssl_enabled", this.f39567a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
