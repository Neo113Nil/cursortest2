package com.tapjoy.internal;

import com.tapjoy.TJVideoListener;

/* loaded from: classes2.dex */
public class TJVideoListenerNative implements TJVideoListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f7794a;

    private static native void onVideoCompleteNative(long j);

    private static native void onVideoErrorNative(long j, int i);

    private static native void onVideoStartNative(long j);

    private TJVideoListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f7794a = j;
    }

    @Override // com.tapjoy.TJVideoListener
    public void onVideoStart() {
        onVideoStartNative(this.f7794a);
    }

    @Override // com.tapjoy.TJVideoListener
    public void onVideoError(int i) {
        onVideoErrorNative(this.f7794a, i);
    }

    @Override // com.tapjoy.TJVideoListener
    public void onVideoComplete() {
        onVideoCompleteNative(this.f7794a);
    }

    @fu
    static Object create(long j) {
        return new TJVideoListenerNative(j);
    }
}
