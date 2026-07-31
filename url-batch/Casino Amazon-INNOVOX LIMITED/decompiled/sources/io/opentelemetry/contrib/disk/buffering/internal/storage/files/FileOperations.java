package io.opentelemetry.contrib.disk.buffering.internal.storage.files;

import java.io.Closeable;
import java.io.File;

/* loaded from: classes3.dex */
public interface FileOperations extends Closeable {
    File getFile();

    boolean hasExpired();

    boolean isClosed();
}
