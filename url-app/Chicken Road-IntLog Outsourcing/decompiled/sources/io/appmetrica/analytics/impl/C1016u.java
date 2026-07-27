package io.appmetrica.analytics.impl;

import g4.AbstractC0465j;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016u implements InterfaceC1068w {

    /* renamed from: a, reason: collision with root package name */
    public final String f9328a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) AbstractC0465j.N0(K1.b.W(this.f9328a), C0736j4.l().m().f8225d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
