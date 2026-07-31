package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface bx1 {

    public interface a<T extends bx1> {
        void a(T t4);
    }

    boolean continueLoading(long j4);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j4);
}
