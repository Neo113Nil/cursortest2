package com.yanzhenjie.kalle.simple;

import com.yanzhenjie.kalle.simple.cache.CacheMode;
import com.yanzhenjie.kalle.t;

/* loaded from: classes4.dex */
public interface i {
    String cacheKey();

    CacheMode cacheMode();

    e converter();

    com.yanzhenjie.kalle.i headers();

    t url();
}
