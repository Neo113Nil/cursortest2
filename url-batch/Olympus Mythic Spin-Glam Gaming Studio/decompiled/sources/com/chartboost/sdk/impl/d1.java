package com.chartboost.sdk.impl;

/* loaded from: classes8.dex */
public abstract class d1 {
    public static final String b(int i) {
        if (i == 1) {
            return "STATE_IDLE";
        }
        if (i == 2) {
            return "STATE_BUFFERING";
        }
        if (i == 3) {
            return "STATE_READY";
        }
        if (i != 4) {
            return "UNKNOWN";
        }
        return "STATE_ENDED";
    }
}
