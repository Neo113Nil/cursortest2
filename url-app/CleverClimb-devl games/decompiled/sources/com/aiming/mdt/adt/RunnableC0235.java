package com.aiming.mdt.adt;

/* renamed from: com.aiming.mdt.adt.ʻʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0235 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f747;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ ActivityC0232 f748;

    RunnableC0235(ActivityC0232 activityC0232, String str) {
        this.f748 = activityC0232;
        this.f747 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f748.mAdListener.get().onAdFailed(this.f747);
    }
}
