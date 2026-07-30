package com.artillery.ctc.base;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public final class JobStatus {
    public static final int CREATE = 0;
    public static final int FAIL = 2;
    public static final JobStatus INSTANCE = new JobStatus();
    public static final int RUNNING = 1;
    public static final int SUCCESS = 3;

    private JobStatus() {
    }
}
