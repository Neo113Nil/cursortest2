package com.aiming.mdt.core;

import android.app.Activity;
import com.aiming.mdt.Callback;

/* renamed from: com.aiming.mdt.core.ʼʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0258 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ String f791;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ Callback f792;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ Activity f793;

    RunnableC0258(Activity activity, String str, Callback callback) {
        this.f793 = activity;
        this.f791 = str;
        this.f792 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0249.m863(this.f793, this.f791, this.f792);
    }
}
