package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes.dex */
public final class Zf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f6947a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f6948b;

    public Zf(File file, C0691n6 c0691n6) {
        this.f6947a = file;
        this.f6948b = c0691n6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f6947a.exists() || !this.f6947a.isDirectory() || (listFiles = this.f6947a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f6948b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
