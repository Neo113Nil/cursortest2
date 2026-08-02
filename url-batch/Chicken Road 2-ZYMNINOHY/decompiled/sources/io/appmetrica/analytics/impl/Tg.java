package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Tg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f11003b;

    public Tg(X4 x4, IReporter iReporter) {
        super(x4);
        this.f11003b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        Gc gc = (Gc) Gc.f10313c.get(p5.f10797d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", gc.f10314a);
        hashMap.put("delivery_method", gc.f10315b);
        this.f11003b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
