package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.iZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1467iZ implements InterfaceC1059bi {
    public final /* synthetic */ C7L A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1059bi
    public final void AAe() {
        AnonymousClass78 anonymousClass78;
        C6M c6m;
        anonymousClass78 = this.A00.A03;
        String A00 = anonymousClass78.A23().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        WN wn = new WN();
        c6m = this.A00.A04;
        WN.A0O(wn, c6m, WQ.A00(A00), this.A00.A7G());
    }

    public C1467iZ(C7L c7l) {
        this.A00 = c7l;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1059bi
    public final void AD8(C5G c5g) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1469ib(this, c5g), 1L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1059bi
    public final void ADO() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1059bi
    public final void AFS(View view, MotionEvent motionEvent) {
    }
}
