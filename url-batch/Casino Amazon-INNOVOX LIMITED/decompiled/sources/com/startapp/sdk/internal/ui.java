package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ui implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoListener f458a;

    public ui(VideoListener videoListener, Context context) {
        this.f458a = videoListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f458a.onVideoCompleted();
        } catch (Throwable th) {
            zh.a((Object) this.f458a, th);
        }
    }
}
