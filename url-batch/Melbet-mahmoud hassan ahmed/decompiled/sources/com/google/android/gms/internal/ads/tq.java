package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes.dex */
final class tq extends PushbackInputStream {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ uq f12349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    tq(uq uqVar, InputStream inputStream, int i7) {
        super(inputStream, 1);
        this.f12349f = uqVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        wq.e(this.f12349f.f12911c);
        super.close();
    }
}
