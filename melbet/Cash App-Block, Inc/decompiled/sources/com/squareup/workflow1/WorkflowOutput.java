package com.squareup.workflow1;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WorkflowOutput {
    public final Object value;

    public WorkflowOutput(Object obj) {
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowOutput)) {
            return false;
        }
        return Intrinsics.areEqual(this.value, ((WorkflowOutput) obj).value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("WorkflowOutput("), this.value, ')');
    }
}
