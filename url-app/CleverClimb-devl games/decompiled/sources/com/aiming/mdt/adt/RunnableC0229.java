package com.aiming.mdt.adt;

/* renamed from: com.aiming.mdt.adt.ʻʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0229 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ ActivityC0232 f742;

    RunnableC0229(ActivityC0232 activityC0232) {
        this.f742 = activityC0232;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f742.mAdListener.get().onAdClicked();
    }
}
