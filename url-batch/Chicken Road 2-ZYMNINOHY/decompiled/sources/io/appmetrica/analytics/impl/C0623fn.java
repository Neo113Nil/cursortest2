package io.appmetrica.analytics.impl;

import android.content.Context;
import c3.C0295g;
import c3.InterfaceC0291c;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623fn implements InterfaceC0961t {

    /* renamed from: b, reason: collision with root package name */
    public final C1013v f11883b;

    /* renamed from: a, reason: collision with root package name */
    public final C0987u f11882a = new C0987u();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0291c f11884c = new C0295g(new C0597en(this));

    public C0623fn(Context context) {
        this.f11883b = new C1013v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0961t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) ((C0295g) this.f11884c).a());
        return map;
    }
}
