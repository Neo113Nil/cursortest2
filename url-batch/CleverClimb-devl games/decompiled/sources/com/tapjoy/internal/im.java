package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class im extends ij {

    /* renamed from: c, reason: collision with root package name */
    private final fb f8388c;

    /* renamed from: d, reason: collision with root package name */
    private final ev f8389d;
    private final fi e;
    private final String f;

    @Override // com.tapjoy.internal.ca
    public final String c() {
        return "api/v1/tokens";
    }

    private im(fb fbVar, ev evVar, fi fiVar, String str) {
        this.f8388c = fbVar;
        this.f8389d = evVar;
        this.e = fiVar;
        this.f = str;
    }

    public im(fc fcVar, String str) {
        this(fcVar.f8070d, fcVar.e, fcVar.f, str);
    }

    @Override // com.tapjoy.internal.ij, com.tapjoy.internal.ca
    public final Map e() {
        Map e = super.e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new bm(hq.a(this.f8388c)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new bm(hq.a(this.f8389d)));
        e.put("user", new bm(hq.a(this.e)));
        if (!al.a(this.f)) {
            e.put("push_token", this.f);
        }
        return e;
    }
}
