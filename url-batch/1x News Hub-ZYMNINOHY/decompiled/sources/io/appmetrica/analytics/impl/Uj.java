package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Uj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f6769b;

    public Uj(String str, Map map) {
        this.f6768a = str;
        this.f6769b = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f6768a, this.f6769b);
    }
}
