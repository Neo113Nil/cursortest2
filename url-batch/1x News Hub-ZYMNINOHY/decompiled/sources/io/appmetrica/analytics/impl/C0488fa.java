package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488fa {

    /* renamed from: a, reason: collision with root package name */
    public final File f7310a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f7311b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f7312c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f7313d;

    /* renamed from: e, reason: collision with root package name */
    public int f7314e;

    public C0488fa(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f7310a, "rw");
            this.f7312c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f7313d = channel;
            if (this.f7314e == 0) {
                this.f7311b = channel.lock();
            }
            this.f7314e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f7310a.getAbsolutePath();
            int i3 = this.f7314e - 1;
            this.f7314e = i3;
            if (i3 == 0) {
                Qa.a(this.f7311b);
            }
            AbstractC0709no.a((Closeable) this.f7312c);
            AbstractC0709no.a((Closeable) this.f7313d);
            this.f7312c = null;
            this.f7311b = null;
            this.f7313d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0488fa(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C0488fa(File file) {
        this.f7314e = 0;
        this.f7310a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
