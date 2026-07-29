package com.aiming.mdt.adt;

/* renamed from: com.aiming.mdt.adt.ʻʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0230 implements Runnable {

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ C0239 f743;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ String f744;

    RunnableC0230(C0239 c0239, String str) {
        this.f743 = c0239;
        this.f744 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0231 interfaceC0231;
        InterfaceC0231 interfaceC02312;
        interfaceC0231 = this.f743.f757;
        if (interfaceC0231 == null) {
            return;
        }
        interfaceC02312 = this.f743.f757;
        interfaceC02312.onAdFailed(this.f744);
    }
}
