package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes.dex */
public final class Zf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f7787a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f7788b;

    public Zf(File file, C0842n6 c0842n6) {
        this.f7787a = file;
        this.f7788b = c0842n6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f7787a.exists() || !this.f7787a.isDirectory() || (listFiles = this.f7787a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f7788b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
