package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865u implements InterfaceC0917w {

    /* renamed from: a, reason: collision with root package name */
    public final String f8384a = "yandex";

    public final String a() {
        try {
            return new JSONArray((Collection) c2.e.V(AbstractC0129a.r(this.f8384a), C0585j4.l().m().f7355d)).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
