package io.opentelemetry.contrib.disk.buffering.internal.storage.responses;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface ReadableResult<T> extends Closeable {
    void delete() throws IOException;

    Collection<T> getContent();
}
