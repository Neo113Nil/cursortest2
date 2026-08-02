package io.opentelemetry.api.trace;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ArrayBasedTraceStateBuilder {
    public static final AutoValue_ArrayBasedTraceState EMPTY;

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY = new AutoValue_ArrayBasedTraceState();
    }
}
