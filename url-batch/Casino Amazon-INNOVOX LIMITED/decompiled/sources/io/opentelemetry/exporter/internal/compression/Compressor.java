package io.opentelemetry.exporter.internal.compression;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface Compressor {
    OutputStream compress(OutputStream outputStream) throws IOException;

    String getEncoding();
}
