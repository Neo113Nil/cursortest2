package com.chartboost.sdk.impl;

import java.util.function.Supplier;

/* loaded from: classes11.dex */
public class gh implements u7 {
    public final Supplier a;
    public volatile p7 b;
    public volatile boolean c;
    public final Object d = new Object();

    public gh(Supplier supplier) {
        if (supplier != null) {
            this.a = supplier;
            return;
        }
        throw new NullPointerException("Supplier must not be null");
    }

    @Override // com.chartboost.sdk.impl.u7
    public p7 a() {
        if (!this.c) {
            synchronized (this.d) {
                try {
                    if (!this.c) {
                        this.b = (p7) this.a.get();
                        if (this.b == null) {
                            xb.b("EventTracker supplier returned null", null);
                        }
                        this.c = true;
                    }
                } catch (Exception e) {
                    xb.b("Failed to obtain EventTracker from supplier", e);
                    return null;
                } finally {
                }
            }
        }
        return this.b;
    }
}
