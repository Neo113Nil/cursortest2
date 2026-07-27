package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Uj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f7601b;

    public Uj(String str, Map map) {
        this.f7600a = str;
        this.f7601b = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f7600a, this.f7601b);
    }
}
