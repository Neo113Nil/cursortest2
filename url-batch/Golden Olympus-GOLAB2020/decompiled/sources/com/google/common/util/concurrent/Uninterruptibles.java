package com.google.common.util.concurrent;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class Uninterruptibles {
    public static <V> V getUninterruptibly(Future<V> future) {
        V v4;
        boolean z4 = false;
        while (true) {
            try {
                v4 = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return v4;
    }
}
