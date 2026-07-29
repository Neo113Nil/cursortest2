package com.aiming.mdt.a;

import com.aiming.mdt.adt.bean.AdBean;

/* renamed from: com.aiming.mdt.a.ʻʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0022 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ String f5;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ AdBean f6;

    RunnableC0022(AdBean adBean, String str) {
        this.f6 = adBean;
        this.f5 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6 == null) {
            return;
        }
        C0042.m100(this.f6, this.f5);
    }
}
