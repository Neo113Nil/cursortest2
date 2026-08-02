package io.opentelemetry.api.trace;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class AutoValue_ArrayBasedTraceState {
    public final List entries;

    public AutoValue_ArrayBasedTraceState() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            this.entries = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null entries");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_ArrayBasedTraceState) {
            return this.entries.equals(((AutoValue_ArrayBasedTraceState) obj).entries);
        }
        return false;
    }

    public final int hashCode() {
        return this.entries.hashCode() ^ 1000003;
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("ArrayBasedTraceState{entries="), Collections.EMPTY_LIST, "}");
    }
}
