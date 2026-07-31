package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class no2 {
    public static void a(ln2 ln2Var) {
        if (!ln2Var.h()) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (ln2Var.k()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
