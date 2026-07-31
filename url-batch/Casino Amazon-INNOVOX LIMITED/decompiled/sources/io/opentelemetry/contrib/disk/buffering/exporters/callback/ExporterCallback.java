package io.opentelemetry.contrib.disk.buffering.exporters.callback;

import java.util.Collection;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExporterCallback<T> {
    void onExportError(Collection<T> collection, @Nullable Throwable th);

    void onExportSuccess(Collection<T> collection);

    void onShutdown();
}
