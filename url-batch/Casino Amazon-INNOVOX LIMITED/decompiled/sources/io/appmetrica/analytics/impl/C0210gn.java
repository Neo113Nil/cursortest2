package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0210gn implements InterfaceC0514t {
    public final C0564v b;

    /* renamed from: a, reason: collision with root package name */
    public final C0539u f1278a = new C0539u();
    public final Lazy c = LazyKt.lazy(new C0184fn(this));

    public C0210gn(Context context) {
        this.b = new C0564v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0514t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.c.getValue());
        return map;
    }
}
