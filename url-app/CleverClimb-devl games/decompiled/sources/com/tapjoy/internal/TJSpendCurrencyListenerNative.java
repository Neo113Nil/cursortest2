package com.tapjoy.internal;

import com.tapjoy.TJSpendCurrencyListener;

/* loaded from: classes2.dex */
public class TJSpendCurrencyListenerNative implements TJSpendCurrencyListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f7793a;

    private static native void onSpendCurrencyResponseFailureNative(long j, String str);

    private static native void onSpendCurrencyResponseNative(long j, String str, int i);

    private TJSpendCurrencyListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f7793a = j;
    }

    @Override // com.tapjoy.TJSpendCurrencyListener
    public void onSpendCurrencyResponse(String str, int i) {
        onSpendCurrencyResponseNative(this.f7793a, str, i);
    }

    @Override // com.tapjoy.TJSpendCurrencyListener
    public void onSpendCurrencyResponseFailure(String str) {
        onSpendCurrencyResponseFailureNative(this.f7793a, str);
    }

    @fu
    static Object create(long j) {
        return new TJSpendCurrencyListenerNative(j);
    }
}
