package io.appmetrica.analytics.impl;

import com.facebook.hermes.intl.Constants;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U9 {

    /* renamed from: a, reason: collision with root package name */
    public final Ul f1074a = new Ul();
    public W9 b = new W9();

    public final synchronized void a(W9 w9) {
        this.b = w9;
    }

    public final synchronized void a(List list, HashMap hashMap) {
        Boolean bool;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.b.f1103a) != null) {
                boolean booleanValue = bool.booleanValue();
                W9 w9 = this.b;
                IdentifierStatus identifierStatus = w9.b;
                String str2 = w9.c;
                if (booleanValue) {
                    str = "true";
                } else {
                    if (booleanValue) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = Constants.CASEFIRST_FALSE;
                }
                hashMap.put("appmetrica_lib_ssl_enabled", this.f1074a.a(new IdentifiersResult(str, identifierStatus, str2)));
            }
        }
    }
}
