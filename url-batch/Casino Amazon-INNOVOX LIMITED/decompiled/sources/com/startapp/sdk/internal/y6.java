package com.startapp.sdk.internal;

import java.io.ByteArrayOutputStream;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class y6 extends ByteArrayOutputStream {
    public y6(int i) {
        super(i);
    }

    public final byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public final int b() {
        return ((ByteArrayOutputStream) this).count;
    }
}
