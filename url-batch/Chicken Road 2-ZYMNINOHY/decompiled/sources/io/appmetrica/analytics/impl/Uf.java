package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* loaded from: classes.dex */
public final class Uf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f11052a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f11053b;

    public Uf(File file, C0632g6 c0632g6) {
        this.f11052a = file;
        this.f11053b = c0632g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f11052a.exists() || !this.f11052a.isDirectory() || (listFiles = this.f11052a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f11053b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
