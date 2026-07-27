package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Ge {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6833a;

    /* renamed from: b, reason: collision with root package name */
    public final C0938qo f6834b;

    /* renamed from: c, reason: collision with root package name */
    public final C0963ro f6835c;

    public Ge(Context context) {
        this(context, new C0938qo(), new C0963ro());
    }

    public final String a(String str) {
        try {
            this.f6835c.getClass();
            if (!C0963ro.a(str)) {
                this.f6834b.getClass();
                str = B4.r.M(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f6833a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Qa.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ge(Context context, C0938qo c0938qo, C0963ro c0963ro) {
        this.f6833a = context;
        this.f6834b = c0938qo;
        this.f6835c = c0963ro;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f6833a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f6833a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
