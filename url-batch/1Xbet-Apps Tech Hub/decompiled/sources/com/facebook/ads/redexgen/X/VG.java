package com.facebook.ads.redexgen.X;

import android.content.Context;

/* loaded from: assets/audience_network.dex */
public final class VG implements InterfaceC0511Gb {
    public final Context A00;
    public final InterfaceC0511Gb A01;
    public final InterfaceC0532Gy<? super InterfaceC0512Gc> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public VG(Context context, InterfaceC0532Gy<? super InterfaceC0512Gc> interfaceC0532Gy, InterfaceC0511Gb interfaceC0511Gb) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0532Gy;
        this.A01 = interfaceC0511Gb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public VG(Context context, String str, InterfaceC0532Gy<? super InterfaceC0512Gc> interfaceC0532Gy) {
        this(context, interfaceC0532Gy, new C2P(str, interfaceC0532Gy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0511Gb
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final VH A4U() {
        return new VH(this.A00, this.A02, this.A01.A4U());
    }
}
