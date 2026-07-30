package com.anythink.basead.mixad.e;

import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c extends y implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final int f9716o;

    /* renamed from: p, reason: collision with root package name */
    private final int f9717p;

    /* renamed from: q, reason: collision with root package name */
    private final int f9718q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9719r;

    public c(com.anythink.core.common.l.g.a aVar) {
        y(aVar.d());
        r(aVar.c());
        b(aVar.b() * 1000);
        s(aVar.a());
        A(aVar.e());
        z(aVar.f());
        e(aVar.n());
        this.f9718q = aVar.j();
        int k6 = aVar.k();
        this.f9716o = k6;
        this.f9717p = aVar.m();
        if (aVar instanceof d) {
            this.f9719r = ((d) aVar).p();
        }
        f(String.valueOf(k6));
        ap(aVar.o());
    }

    public final boolean a() {
        return this.f9718q == 1;
    }

    public final int b() {
        return this.f9716o;
    }

    public final int c() {
        return this.f9717p;
    }

    public final boolean d() {
        return this.f9719r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdSetting{adSourceInterType=");
        sb.append(this.f9716o);
        sb.append(", adSourceShakeType=");
        sb.append(this.f9717p);
        sb.append(", nativeRenderingType=");
        sb.append(this.f9718q);
        sb.append(", isShowCloseButton=");
        sb.append(this.f9719r);
        sb.append(", probabilityForDelayShowCloseButtonInEndCard=");
        sb.append(this.f14363e);
        sb.append(", MinDelayTimeWhenShowCloseButton=");
        sb.append(this.f14364f);
        sb.append(", MaxDelayTimeWhenShowCloseButton=");
        sb.append(this.f14365g);
        sb.append(", interstitialType='");
        sb.append(this.f14366h);
        sb.append("', rewardTime=");
        sb.append(this.i);
        sb.append(", isRewardForPlayFail=");
        sb.append(this.f14367j);
        sb.append(", closeClickType=");
        sb.append(this.f14368k);
        sb.append(", splashImageScaleType=");
        sb.append(this.f14369l);
        sb.append(", impressionMonitorTime=");
        return D.y.m(sb, this.f14370m, '}');
    }
}
