package com.startapp.sdk.internal;

import java.io.RandomAccessFile;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xd implements AutoCloseable {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f497a;
    public final String b;
    public final List c;
    public final RandomAccessFile d;
    public final int e;

    public xd(String str, String str2, List list, RandomAccessFile randomAccessFile, int i) {
        this.f497a = str;
        this.b = str2;
        this.c = list;
        this.d = randomAccessFile;
        this.e = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
