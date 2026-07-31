package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class tc3 {
    public static <V> V a(Future<V> future) {
        V v6;
        boolean z6 = false;
        while (true) {
            try {
                v6 = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return v6;
    }
}
