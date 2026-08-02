package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Ij implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f10447a;

    public Ij(Map map) {
        this.f10447a = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportAnr(this.f10447a);
    }
}
