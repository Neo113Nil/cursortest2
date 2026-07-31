package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.s7;

/* loaded from: classes2.dex */
public class pj extends s7 {

    /* renamed from: R, reason: collision with root package name */
    private static pj f18673R;

    /* renamed from: P, reason: collision with root package name */
    private String f18674P;

    /* renamed from: Q, reason: collision with root package name */
    private final bi f18675Q = nm.S().k();

    private pj() {
        this.f18979H = "ironbeast";
        this.f18978G = 2;
        this.f18980I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f18674P = "";
    }

    public static synchronized pj i() {
        pj pjVar;
        synchronized (pj.class) {
            try {
                if (f18673R == null) {
                    pj pjVar2 = new pj();
                    f18673R = pjVar2;
                    pjVar2.e();
                }
                pjVar = f18673R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pjVar;
    }

    @Override // com.ironsource.s7
    protected int c(zb zbVar) {
        bi biVar;
        IronSource.AD_UNIT ad_unit;
        int f4 = f(zbVar.c());
        if (f4 == s7.e.BANNER.a()) {
            biVar = this.f18675Q;
            ad_unit = IronSource.AD_UNIT.BANNER;
        } else if (f4 == s7.e.NATIVE_AD.a()) {
            biVar = this.f18675Q;
            ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        } else {
            biVar = this.f18675Q;
            ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        }
        return biVar.a(ad_unit);
    }

    @Override // com.ironsource.s7
    protected void d() {
        this.f18981J.add(Integer.valueOf(IronSourceConstants.IS_LOAD_CALLED));
        this.f18981J.add(2002);
        this.f18981J.add(2003);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS));
        this.f18981J.add(2200);
        this.f18981J.add(2213);
        this.f18981J.add(2211);
        this.f18981J.add(2212);
        this.f18981J.add(3001);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f18981J.add(3002);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f18981J.add(3005);
        this.f18981J.add(3300);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f18981J.add(3009);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.NT_LOAD));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.NT_CALLBACK_LOAD_ERROR));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.f18981J.add(Integer.valueOf(IronSourceConstants.NT_INSTANCE_SHOW));
    }

    @Override // com.ironsource.s7
    protected String e(int i4) {
        return this.f18674P;
    }

    @Override // com.ironsource.s7
    protected void f(zb zbVar) {
        this.f18674P = zbVar.b().optString("placement");
    }

    @Override // com.ironsource.s7
    protected boolean j(zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean d(zb zbVar) {
        int c4 = zbVar.c();
        return c4 == 2004 || c4 == 2005 || c4 == 2204 || c4 == 2301 || c4 == 2300 || c4 == 3009 || c4 == 3502 || c4 == 3501 || c4 == 4005 || c4 == 4009 || c4 == 4502 || c4 == 4501;
    }
}
