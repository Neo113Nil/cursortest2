package com.tapjoy.internal;

import com.tapjoy.TJAwardCurrencyListener;

/* loaded from: classes2.dex */
public class TJAwardCurrencyListenerNative implements TJAwardCurrencyListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f7788a;

    private static native void onAwardCurrencyResponseFailureNative(long j, String str);

    private static native void onAwardCurrencyResponseNative(long j, String str, int i);

    private TJAwardCurrencyListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f7788a = j;
    }

    @Override // com.tapjoy.TJAwardCurrencyListener
    public void onAwardCurrencyResponse(String str, int i) {
        onAwardCurrencyResponseNative(this.f7788a, str, i);
    }

    @Override // com.tapjoy.TJAwardCurrencyListener
    public void onAwardCurrencyResponseFailure(String str) {
        onAwardCurrencyResponseFailureNative(this.f7788a, str);
    }

    @fu
    static Object create(long j) {
        return new TJAwardCurrencyListenerNative(j);
    }
}
