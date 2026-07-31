package io.opentelemetry.contrib.disk.buffering.exporters.callback;

import java.util.Collection;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class NoopExporterCallback<T> implements ExporterCallback<T> {
    @Override // io.opentelemetry.contrib.disk.buffering.exporters.callback.ExporterCallback
    public void onExportError(Collection<T> collection, @Nullable Throwable th) {
    }

    @Override // io.opentelemetry.contrib.disk.buffering.exporters.callback.ExporterCallback
    public void onExportSuccess(Collection<T> collection) {
    }

    @Override // io.opentelemetry.contrib.disk.buffering.exporters.callback.ExporterCallback
    public void onShutdown() {
    }
}
