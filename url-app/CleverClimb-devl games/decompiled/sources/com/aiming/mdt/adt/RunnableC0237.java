package com.aiming.mdt.adt;

/* renamed from: com.aiming.mdt.adt.ʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0237 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ ActivityC0232 f750;

    RunnableC0237(ActivityC0232 activityC0232) {
        this.f750 = activityC0232;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f750.callbackWhenClose();
    }
}
