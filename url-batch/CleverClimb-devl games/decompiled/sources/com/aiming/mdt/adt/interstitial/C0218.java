package com.aiming.mdt.adt.interstitial;

import android.content.Context;
import com.aiming.mdt.adt.C0234;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.adt.InterfaceC0231;
import com.aiming.mdt.adt.bean.AdBean;

/* renamed from: com.aiming.mdt.adt.interstitial.ʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0218 extends C0239 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private InterfaceC0216 f725;

    C0218(Context context, String str) {
        super(context, str, 4);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʼ */
    protected final void mo811() {
        super.mo811();
        this.f752.m844(this.f755, InterstitialActivity.class, this.f753);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʽ */
    protected final void mo11() {
        super.mo11();
        C0234.m849(this.f753);
        this.f725 = null;
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʾ */
    protected final void mo13() {
        super.mo13();
        this.f725.onAdReady();
    }

    @Override // com.aiming.mdt.adt.C0239, com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʽ */
    public final void mo15(AdBean adBean) {
        super.mo15(adBean);
        m856();
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʽ */
    protected final void mo16(InterfaceC0231 interfaceC0231) {
        super.mo16(interfaceC0231);
        this.f725 = (InterfaceC0216) interfaceC0231;
        C0234.m848(this.f753, interfaceC0231);
    }
}
