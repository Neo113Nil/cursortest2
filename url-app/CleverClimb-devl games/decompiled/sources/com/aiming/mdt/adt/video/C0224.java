package com.aiming.mdt.adt.video;

import android.content.Context;
import com.aiming.mdt.a.C0139;
import com.aiming.mdt.adt.C0234;
import com.aiming.mdt.adt.C0239;
import com.aiming.mdt.adt.InterfaceC0231;
import com.aiming.mdt.adt.bean.AdBean;
import java.io.File;

/* renamed from: com.aiming.mdt.adt.video.ʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0224 extends C0239 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private InterfaceC0221 f730;

    C0224(Context context, String str) {
        super(context, str, 2);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʼ */
    protected final void mo811() {
        super.mo811();
        this.f752.m844(this.f755, VideoActivity.class, this.f753);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʽ */
    protected final void mo11() {
        super.mo11();
        C0234.m849(this.f753);
        this.f730 = null;
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʻʾ */
    protected final void mo13() {
        super.mo13();
        if (this.f730 != null) {
            this.f730.onAdReady();
        }
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean mo818() {
        try {
            boolean mo818 = super.mo818();
            File m530 = C0139.m530(this.f755, this.f752.m841().getVideoUrl(), null);
            if (mo818 && m530.exists()) {
                return m530.length() > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.aiming.mdt.adt.C0239, com.aiming.mdt.adt.C0226.InterfaceC0227
    /* renamed from: ʽ */
    public final void mo15(AdBean adBean) {
        String str;
        super.mo15(adBean);
        if (this.f755 == null) {
            str = "Context error";
        } else {
            if (adBean != null && C0139.m530(this.f755, adBean.getVideoUrl(), null).length() != 0) {
                m856();
                return;
            }
            str = "No Fill";
        }
        m855(str);
    }

    @Override // com.aiming.mdt.adt.C0239
    /* renamed from: ʽ */
    protected final void mo16(InterfaceC0231 interfaceC0231) {
        super.mo16(interfaceC0231);
        this.f730 = (InterfaceC0221) interfaceC0231;
        C0234.m848(this.f753, interfaceC0231);
    }
}
