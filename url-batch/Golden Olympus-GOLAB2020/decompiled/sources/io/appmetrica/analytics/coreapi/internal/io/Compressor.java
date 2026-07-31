package io.appmetrica.analytics.coreapi.internal.io;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface Compressor {
    byte[] compress(@NonNull byte[] bArr);

    byte[] uncompress(@NonNull byte[] bArr);
}
