package com.yandex.mobile.ads.impl;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zg1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t4, T t5) {
        return Z1.a.d(Integer.valueOf(((ScanResult) t5).level), Integer.valueOf(((ScanResult) t4).level));
    }
}
