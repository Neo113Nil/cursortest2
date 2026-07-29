package com.aiming.mdt.core;

import com.aiming.mdt.Callback;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.core.ʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0263 implements Callback {

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ AbstractC0256 f800;

    C0263(AbstractC0256 abstractC0256) {
        this.f800 = abstractC0256;
    }

    @Override // com.aiming.mdt.Callback
    public final void onError(String str) {
        this.f800.m893(str);
    }

    @Override // com.aiming.mdt.Callback
    public final void onSuccess() {
        C0282.m971("reInitSDK success do delayLoad");
        this.f800.m887();
    }
}
