package com.tapjoy.internal;

import com.tapjoy.internal.ex;
import java.util.Map;

/* loaded from: classes2.dex */
public final class il extends ij {

    /* renamed from: c, reason: collision with root package name */
    private final ex.a f8386c = new ex.a();

    /* renamed from: d, reason: collision with root package name */
    private ez f8387d = null;

    @Override // com.tapjoy.internal.ca
    public final String c() {
        return this.f8387d == ez.USAGES ? "api/v1/usages" : "api/v1/cevs";
    }

    public final boolean a(ew ewVar) {
        if (this.f8387d == null) {
            this.f8387d = ewVar.n;
        } else if (ewVar.n != this.f8387d) {
            return false;
        }
        this.f8386c.f8050c.add(ewVar);
        return true;
    }

    public final int g() {
        return this.f8386c.f8050c.size();
    }

    @Override // com.tapjoy.internal.ij, com.tapjoy.internal.ca
    public final Map e() {
        Map e = super.e();
        e.put("events", new bm(hq.a(this.f8386c.b())));
        return e;
    }
}
