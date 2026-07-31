package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes3.dex */
public final class Vf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f1090a;
    public final Consumer b;

    public Vf(File file, C0219h6 c0219h6) {
        this.f1090a = file;
        this.b = c0219h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f1090a.exists() || !this.f1090a.isDirectory() || (listFiles = this.f1090a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
