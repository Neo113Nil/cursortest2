package io.opentelemetry.context;

import io.opentelemetry.api.trace.PropagatedSpan;

/* loaded from: classes9.dex */
public interface Context {
    Object get();

    Context with(PropagatedSpan propagatedSpan);
}
