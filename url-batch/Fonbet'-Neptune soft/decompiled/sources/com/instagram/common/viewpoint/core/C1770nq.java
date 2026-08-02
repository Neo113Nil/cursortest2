package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.nq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1770nq implements InterfaceC01363u {
    public Message A00;
    public C1769np A01;

    public C1770nq() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C1769np.A01(this);
    }

    public final C1770nq A01(Message message, C1769np c1769np) {
        this.A00 = message;
        this.A01 = c1769np;
        return this;
    }

    public final void A02() {
        ((Message) C3M.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) C3M.A01(this.A00));
        A00();
        return success;
    }
}
