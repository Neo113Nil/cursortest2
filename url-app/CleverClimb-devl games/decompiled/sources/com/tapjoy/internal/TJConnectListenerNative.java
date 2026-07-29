package com.tapjoy.internal;

import com.tapjoy.TJConnectListener;

/* loaded from: classes2.dex */
public class TJConnectListenerNative implements TJConnectListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f7789a;

    private static native void onConnectFailureNative(long j);

    private static native void onConnectSuccessNative(long j);

    private TJConnectListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f7789a = j;
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectSuccess() {
        onConnectSuccessNative(this.f7789a);
    }

    @Override // com.tapjoy.TJConnectListener
    public void onConnectFailure() {
        onConnectFailureNative(this.f7789a);
    }

    @fu
    static Object create(long j) {
        return new TJConnectListenerNative(j);
    }
}
