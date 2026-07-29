package com.tapjoy.internal;

import com.tapjoy.TJGetCurrencyBalanceListener;

/* loaded from: classes2.dex */
public class TJGetCurrencyBalanceListenerNative implements TJGetCurrencyBalanceListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f7791a;

    private static native void onGetCurrencyBalanceResponseFailureNative(long j, String str);

    private static native void onGetCurrencyBalanceResponseNative(long j, String str, int i);

    private TJGetCurrencyBalanceListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f7791a = j;
    }

    @Override // com.tapjoy.TJGetCurrencyBalanceListener
    public void onGetCurrencyBalanceResponse(String str, int i) {
        onGetCurrencyBalanceResponseNative(this.f7791a, str, i);
    }

    @Override // com.tapjoy.TJGetCurrencyBalanceListener
    public void onGetCurrencyBalanceResponseFailure(String str) {
        onGetCurrencyBalanceResponseFailureNative(this.f7791a, str);
    }

    @fu
    static Object create(long j) {
        return new TJGetCurrencyBalanceListenerNative(j);
    }
}
