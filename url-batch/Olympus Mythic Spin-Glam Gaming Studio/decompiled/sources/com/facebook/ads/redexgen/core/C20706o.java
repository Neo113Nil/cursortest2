package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.6o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C20706o extends E8 {
    public final /* synthetic */ C20626g A00;

    public C20706o(C20626g c20626g) {
        this.A00 = c20626g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2775Yx(this));
    }
}
