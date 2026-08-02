package io.appmetrica.analytics.impl;

import android.content.Context;
import b2.C0193g;
import b2.InterfaceC0189c;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578in implements InterfaceC0839t {

    /* renamed from: b, reason: collision with root package name */
    public final C0891v f7575b;

    /* renamed from: a, reason: collision with root package name */
    public final C0865u f7574a = new C0865u();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0189c f7576c = new C0193g(new C0553hn(this));

    public C0578in(Context context) {
        this.f7575b = new C0891v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0839t
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) ((C0193g) this.f7576c).a());
        return map;
    }
}
