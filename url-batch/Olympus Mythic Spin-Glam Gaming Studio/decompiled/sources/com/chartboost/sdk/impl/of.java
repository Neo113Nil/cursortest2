package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class of {
    public final RandomAccessFile a;
    public final FileDescriptor b;

    public of(RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.a = randomAccessFile;
        FileDescriptor fd = randomAccessFile.getFD();
        Intrinsics.checkNotNullExpressionValue(fd, "getFD(...)");
        this.b = fd;
    }

    public final FileDescriptor b() {
        return this.b;
    }

    public final long c() {
        return this.a.length();
    }

    public final void a() {
        this.a.close();
    }
}
