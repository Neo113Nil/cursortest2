package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2680hg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f39146a;

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f39147b;

    public RunnableC2680hg(File file, C6 c6) {
        this.f39146a = file;
        this.f39147b = c6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (!this.f39146a.exists() || !this.f39146a.isDirectory() || (listFiles = this.f39146a.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (File file : listFiles) {
            try {
                this.f39147b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
