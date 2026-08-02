package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Yg extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f6907b;

    public Yg(C0457e5 c0457e5, IReporter iReporter) {
        super(c0457e5);
        this.f6907b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Nc nc = (Nc) Nc.f6368c.get(w5.f6818d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", nc.f6369a);
        hashMap.put("delivery_method", nc.f6370b);
        this.f6907b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
