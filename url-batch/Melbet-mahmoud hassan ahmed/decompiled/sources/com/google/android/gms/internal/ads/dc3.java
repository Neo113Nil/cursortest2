package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface dc3 extends ExecutorService {
    <T> cc3<T> E(Callable<T> callable);

    cc3<?> H(Runnable runnable);
}
