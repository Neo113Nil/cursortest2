package com.squareup.workflow1;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes8.dex */
public final class TimerWorker implements Worker {
    public final long delayMs;
    public final String key;

    public TimerWorker(long j, String str) {
        this.delayMs = j;
        this.key = str;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return (worker instanceof TimerWorker) && ((TimerWorker) worker).key.equals(this.key);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimerWorker)) {
            return false;
        }
        TimerWorker timerWorker = (TimerWorker) obj;
        return this.delayMs == timerWorker.delayMs && this.key.equals(timerWorker.key);
    }

    public final int hashCode() {
        return this.key.hashCode() + (Long.hashCode(this.delayMs) * 31);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new TimerWorker$run$1(this, null, 0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimerWorker(delayMs=");
        sb.append(this.delayMs);
        sb.append(", key=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.key, ')');
    }
}
