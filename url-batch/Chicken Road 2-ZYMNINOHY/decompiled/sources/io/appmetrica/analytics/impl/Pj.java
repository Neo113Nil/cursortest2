package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Pj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f10827b;

    public Pj(String str, Map map) {
        this.f10826a = str;
        this.f10827b = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportEvent(this.f10826a, this.f10827b);
    }
}
