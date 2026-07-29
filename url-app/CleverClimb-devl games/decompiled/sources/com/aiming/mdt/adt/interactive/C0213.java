package com.aiming.mdt.adt.interactive;

import android.content.Context;
import com.aiming.mdt.adt.C0234;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.adt.InterfaceC0231;
import com.aiming.mdt.adt.bean.AdBean;

/* renamed from: com.aiming.mdt.adt.interactive.ʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0213 extends C0239 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private InterfaceC0212 f720;

    C0213(Context context, String str) {
        super(context, str, 3);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʼ, reason: contains not printable characters */
    protected final void mo811() {
        super.mo811();
        this.f752.m844(this.f755, InteractiveActivity.class, this.f753);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʽ */
    protected final void mo11() {
        super.mo11();
        C0234.m849(this.f753);
        this.f720 = null;
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʾ */
    protected final void mo13() {
        super.mo13();
        this.f720.onAdReady();
    }

    @Override // com.aiming.mdt.adt.C0239, com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʽ */
    public final void mo15(AdBean adBean) {
        super.mo15(adBean);
        ViewOnAttachStateChangeListenerC0206.m800().m803();
        m856();
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʽ */
    protected final void mo16(InterfaceC0231 interfaceC0231) {
        super.mo16(interfaceC0231);
        this.f720 = (InterfaceC0212) interfaceC0231;
        C0234.m848(this.f753, interfaceC0231);
    }
}
