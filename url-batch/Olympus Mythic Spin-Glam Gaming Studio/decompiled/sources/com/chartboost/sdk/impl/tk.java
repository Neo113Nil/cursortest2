package com.chartboost.sdk.impl;

/* loaded from: classes4.dex */
public interface tk {

    public interface b {
        long a();
    }

    void a();

    void a(long j);

    public static final class a {
        public static /* synthetic */ void a(tk tkVar, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProgressUpdate");
            }
            if ((i & 1) != 0) {
                j = 500;
            }
            tkVar.a(j);
        }
    }
}
