package ru.rustore.sdk.imaging.internal;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final File f43652a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f43653b;

    public e(d cacheDirProvider) {
        Intrinsics.checkNotNullParameter(cacheDirProvider, "cacheDirProvider");
        cacheDirProvider.getClass();
        File file = new File(cacheDirProvider.f43651a.getCacheDir(), "imaging_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f43652a = file;
        this.f43653b = new Object();
    }
}
