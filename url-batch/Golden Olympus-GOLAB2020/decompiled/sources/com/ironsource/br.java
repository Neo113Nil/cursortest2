package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class br extends s7 {

    /* renamed from: R, reason: collision with root package name */
    private static br f15645R;

    /* renamed from: P, reason: collision with root package name */
    private String f15646P;

    /* renamed from: Q, reason: collision with root package name */
    private final bi f15647Q = nm.S().k();

    private br() {
        this.f18979H = "outcome";
        this.f18978G = 3;
        this.f18980I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f15646P = "";
    }

    public static synchronized br i() {
        br brVar;
        synchronized (br.class) {
            try {
                if (f15645R == null) {
                    br brVar2 = new br();
                    f15645R = brVar2;
                    brVar2.e();
                }
                brVar = f15645R;
            } catch (Throwable th) {
                throw th;
            }
        }
        return brVar;
    }

    @Override // com.ironsource.s7
    protected int c(zb zbVar) {
        return this.f15647Q.a(IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.s7
    protected void d() {
        this.f18981J.add(1000);
        this.f18981J.add(1001);
        this.f18981J.add(1002);
        this.f18981J.add(1003);
        this.f18981J.add(1200);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f18981J.add(1210);
        this.f18981J.add(1211);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f18981J.add(1213);
        this.f18981J.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.s7
    protected String e(int i4) {
        return (i4 == 15 || (i4 >= 300 && i4 < 400)) ? this.f15646P : "";
    }

    @Override // com.ironsource.s7
    protected void f(zb zbVar) {
        if (zbVar.c() == 15 || (zbVar.c() >= 300 && zbVar.c() < 400)) {
            this.f15646P = zbVar.b().optString("placement");
        }
    }

    @Override // com.ironsource.s7
    protected boolean j(zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean d(zb zbVar) {
        int c4 = zbVar.c();
        return c4 == 14 || c4 == 514 || c4 == 515 || c4 == 516 || c4 == 1003 || c4 == 1005 || c4 == 1203 || c4 == 1010 || c4 == 1301 || c4 == 1302;
    }
}
