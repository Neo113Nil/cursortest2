package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.4p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01634p extends DV {
    public final /* synthetic */ C01614n A00;

    public C01634p(C01614n c01614n) {
        this.A00 = c01614n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1085c8(this));
    }
}
