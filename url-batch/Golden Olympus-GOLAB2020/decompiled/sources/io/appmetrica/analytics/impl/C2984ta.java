package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2984ta {

    /* renamed from: a, reason: collision with root package name */
    public final File f39849a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f39850b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f39851c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f39852d;

    /* renamed from: e, reason: collision with root package name */
    public int f39853e;

    public C2984ta(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f39849a, "rw");
            this.f39851c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f39852d = channel;
            if (this.f39853e == 0) {
                this.f39850b = channel.lock();
            }
            this.f39853e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f39849a.getAbsolutePath();
            int i4 = this.f39853e - 1;
            this.f39853e = i4;
            if (i4 == 0) {
                AbstractC2595eb.a(this.f39850b);
            }
            AbstractC2713io.a((Closeable) this.f39851c);
            AbstractC2713io.a((Closeable) this.f39852d);
            this.f39851c = null;
            this.f39850b = null;
            this.f39852d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2984ta(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C2984ta(File file) {
        this.f39853e = 0;
        this.f39849a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
