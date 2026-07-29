package com.umeng.commonsdk.proguard;

import java.io.ByteArrayOutputStream;

/* compiled from: TByteArrayOutputStream.java */
/* loaded from: classes2.dex */
public class k extends ByteArrayOutputStream {
    public k(int i) {
        super(i);
    }

    public k() {
    }

    public byte[] a() {
        return this.buf;
    }

    public int b() {
        return this.count;
    }
}
