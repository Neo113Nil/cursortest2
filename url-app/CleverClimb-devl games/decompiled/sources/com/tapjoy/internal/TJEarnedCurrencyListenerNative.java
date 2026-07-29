package com.tapjoy.internal;

import com.tapjoy.TJEarnedCurrencyListener;

/* loaded from: classes2.dex */
public class TJEarnedCurrencyListenerNative implements TJEarnedCurrencyListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f7790a;

    private static native void onEarnedCurrencyNative(long j, String str, int i);

    private TJEarnedCurrencyListenerNative(long j) {
        if (j == 0) {
            throw new IllegalArgumentException();
        }
        this.f7790a = j;
    }

    @Override // com.tapjoy.TJEarnedCurrencyListener
    public void onEarnedCurrency(String str, int i) {
        onEarnedCurrencyNative(this.f7790a, str, i);
    }

    @fu
    static Object create(long j) {
        return new TJEarnedCurrencyListenerNative(j);
    }
}
