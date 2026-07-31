package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
final class j93 extends OutputStream {
    j93() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        Objects.requireNonNull(bArr);
    }
}
