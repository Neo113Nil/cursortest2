package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01243i extends C0362Dc {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C1156dO A01;
    public boolean A02;
    public final AbstractC0776Tf<C01193d> A03;
    public final AbstractC0776Tf<C3Y> A04;
    public final AbstractC0776Tf<DQ> A05;
    public final AbstractC0776Tf<C3Q> A06;
    public final AbstractC0776Tf<DL> A07;
    public final AbstractC0776Tf<DJ> A08;
    public final AbstractC0776Tf<DI> A09;
    public final AbstractC0776Tf<DD> A0A;
    public final AbstractC0776Tf<DC> A0B;
    public final E1 A0C;
    public final DN A0D;
    public final DE A0E;

    public C01243i(C1153dL c1153dL, US us, E1 e1, String str) {
        this(c1153dL, us, e1, str, 0, 0, false, null, null);
    }

    public C01243i(C1153dL c1153dL, US us, E1 e1, String str, int i, int i2, boolean z, Bundle bundle, Map<String, String> map) {
        super(c1153dL, us, e1, str, !e1.A0p(), i, i2, z, bundle, map, new C0361Db(c1153dL, e1));
        this.A0E = new DE() { // from class: com.facebook.ads.redexgen.X.3j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df) {
                C01243i.this.A0f();
            }
        };
        this.A08 = new C0372Dm(this);
        this.A04 = new C0371Dl(this);
        this.A05 = new C0370Dk(this);
        this.A06 = new C0369Dj(this);
        this.A03 = new C0368Di(this);
        this.A07 = new C0367Dh(this);
        this.A0A = new C0366Dg(this);
        this.A0B = new C0365Df(this);
        this.A09 = new C0377Dr(this);
        this.A0D = new DN() { // from class: com.facebook.ads.redexgen.X.3k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r3) {
                E1 e12;
                C01243i c01243i = C01243i.this;
                e12 = C01243i.this.A0C;
                c01243i.A00 = e12.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = e1;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (U7.A2m(c1153dL)) {
            this.A01 = new C1156dO(e1, str, z, null);
        }
    }

    public C01243i(C1153dL c1153dL, US us, E1 e1, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1153dL, us, e1, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.instagram.common.viewpoint.core.C0362Dc
    public final void A0n(EnumC1160dS enumC1160dS, Map<String, String> map) {
        super.A0n(enumC1160dS, map);
        if (this.A01 != null && enumC1160dS == EnumC1160dS.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C0374Do c0374Do = new C0374Do(this);
        if (this.A0C.A0t()) {
            XJ.A00(c0374Do);
            return;
        }
        E1 e1 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        e1.getStateHandler().post(c0374Do);
    }
}
