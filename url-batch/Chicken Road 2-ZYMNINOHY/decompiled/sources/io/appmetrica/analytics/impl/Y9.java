package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final File f11296a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f11297b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f11298c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f11299d;

    /* renamed from: e, reason: collision with root package name */
    public int f11300e;

    public Y9(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f11296a, "rw");
            this.f11298c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f11299d = channel;
            if (this.f11300e == 0) {
                this.f11297b = channel.lock();
            }
            this.f11300e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f11296a.getAbsolutePath();
            int i4 = this.f11300e - 1;
            this.f11300e = i4;
            if (i4 == 0) {
                Ja.a(this.f11297b);
            }
            AbstractC0779lo.a((Closeable) this.f11298c);
            AbstractC0779lo.a((Closeable) this.f11299d);
            this.f11298c = null;
            this.f11297b = null;
            this.f11299d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Y9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public Y9(File file) {
        this.f11300e = 0;
        this.f11296a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
