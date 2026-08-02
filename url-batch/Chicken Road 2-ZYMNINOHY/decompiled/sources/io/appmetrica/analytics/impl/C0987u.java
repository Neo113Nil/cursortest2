package io.appmetrica.analytics.impl;

import a.AbstractC0124a;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987u implements InterfaceC1039w {

    /* renamed from: a, reason: collision with root package name */
    public final String f12793a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) d3.i.j0(AbstractC0124a.H(this.f12793a), C0501b4.l().m().f11286d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
