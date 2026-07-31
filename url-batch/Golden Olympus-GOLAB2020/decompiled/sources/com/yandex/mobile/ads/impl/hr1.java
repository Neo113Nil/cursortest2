package com.yandex.mobile.ads.impl;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class hr1 extends BufferedOutputStream implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26893a;

    public hr1(FileOutputStream fileOutputStream, int i4) {
        super(fileOutputStream, i4);
    }

    public final void a(OutputStream outputStream) {
        if (!this.f26893a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f26893a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26893a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i4 = u82.f32873a;
        throw th;
    }

    public hr1(OutputStream outputStream) {
        super(outputStream);
    }
}
