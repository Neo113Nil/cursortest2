package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C19823c extends AbstractC2238Dt {
    public final /* synthetic */ C2226Dh A00;

    public C19823c(C2226Dh c2226Dh) {
        this.A00 = c2226Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2239Du c2239Du) {
        C2255Ek c2255Ek;
        Handler handler;
        c2255Ek = this.A00.A01;
        if (c2255Ek == null || c2239Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C3119f7(this));
    }
}
