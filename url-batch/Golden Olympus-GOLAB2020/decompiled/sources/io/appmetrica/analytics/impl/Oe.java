package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class Oe {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38078a;

    /* renamed from: b, reason: collision with root package name */
    public final C2791lo f38079b;

    /* renamed from: c, reason: collision with root package name */
    public final C2817mo f38080c;

    public Oe(Context context) {
        this(context, new C2791lo(), new C2817mo());
    }

    public final String a(String str) {
        try {
            this.f38080c.getClass();
            if (!C2817mo.a(str)) {
                this.f38079b.getClass();
                str = StringsKt.G(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f38078a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC2595eb.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Oe(Context context, C2791lo c2791lo, C2817mo c2817mo) {
        this.f38078a = context;
        this.f38079b = c2791lo;
        this.f38080c = c2817mo;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f38078a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f38078a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
