package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1066an implements OW {
    public final /* synthetic */ C1063ak A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.OW
    public final void A97() {
        F6 f6;
        C0457Dz c0457Dz;
        f6 = this.A00.A02;
        String A00 = f6.A0z().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        KZ kz = new KZ();
        c0457Dz = this.A00.A03;
        KZ.A0L(kz, c0457Dz, C0611Kc.A00(A00), this.A00.A6N());
    }

    public C1066an(C1063ak c1063ak) {
        this.A00 = c1063ak;
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ABE(AnonymousClass95 anonymousClass95) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1067ao(this, anonymousClass95), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ABT() {
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ADB(View view, MotionEvent motionEvent) {
    }
}
