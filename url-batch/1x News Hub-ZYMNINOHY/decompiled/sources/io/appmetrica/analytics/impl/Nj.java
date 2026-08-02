package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Nj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f6383a;

    public Nj(Map map) {
        this.f6383a = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportAnr(this.f6383a);
    }
}
