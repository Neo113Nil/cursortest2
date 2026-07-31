package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.ironsource.C4701ic;

/* loaded from: classes.dex */
class p6 extends i5 {
    private final s7 g;
    private final AppLovinAdLoadListener h;

    p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.h = appLovinAdLoadListener;
        this.g = s7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2 = a8.a(this.g);
        if (!StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Resolving VAST ad with depth " + this.g.d() + " at " + a2);
        }
        try {
            this.a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).b(a2).c(C4701ic.a).a(p8.f).a(((Integer) this.a.a(x4.U4)).intValue()).c(((Integer) this.a.a(x4.V4)).intValue()).a(false).a(), this.a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i) {
            this.a.q0().a(h6.a(p8Var, p6.this.g, p6.this.h, p6.this.a));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            p6.this.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
                return;
            }
            return;
        }
        a8.a(this.g, this.h, i == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i, this.a);
    }
}
