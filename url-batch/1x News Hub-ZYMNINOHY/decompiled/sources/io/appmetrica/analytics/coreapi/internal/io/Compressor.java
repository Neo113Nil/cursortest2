package io.appmetrica.analytics.coreapi.internal.io;

import java.io.IOException;

/* loaded from: classes.dex */
public interface Compressor {
    byte[] compress(byte[] bArr) throws IOException;

    byte[] uncompress(byte[] bArr) throws IOException;
}
