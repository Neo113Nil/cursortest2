package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class ke extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i3, int i10) {
        ((FilterOutputStream) this).out.write(bArr, i3, i10);
    }
}
