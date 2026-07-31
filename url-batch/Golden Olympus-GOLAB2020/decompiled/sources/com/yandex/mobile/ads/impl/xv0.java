package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bx1;

/* loaded from: classes3.dex */
public interface xv0 extends bx1 {

    public interface a extends bx1.a<xv0> {
        void a(xv0 xv0Var);
    }

    long a(long j4, uw1 uw1Var);

    long a(x60[] x60VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4);

    void a(a aVar, long j4);

    void discardBuffer(long j4, boolean z4);

    o52 getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j4);
}
