package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06033c extends AbstractC0859Dt {
    public final /* synthetic */ C0847Dh A00;

    public C06033c(C0847Dh c0847Dh) {
        this.A00 = c0847Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0860Du c0860Du) {
        C0876Ek c0876Ek;
        Handler handler;
        c0876Ek = this.A00.A01;
        if (c0876Ek == null || c0860Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C1740f7(this));
    }
}
