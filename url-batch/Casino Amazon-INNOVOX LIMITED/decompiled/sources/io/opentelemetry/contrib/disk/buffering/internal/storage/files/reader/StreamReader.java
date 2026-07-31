package io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface StreamReader extends Closeable {

    public interface Factory {
        StreamReader create(InputStream inputStream);
    }

    @Nullable
    byte[] readNext() throws IOException;
}
