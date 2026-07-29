package com.aiming.mdt.core;

/* renamed from: com.aiming.mdt.core.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0243 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ boolean f760;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ AbstractC0256 f761;

    RunnableC0243(AbstractC0256 abstractC0256, boolean z) {
        this.f761 = abstractC0256;
        this.f760 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f761.mo75(this.f760);
    }
}
