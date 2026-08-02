package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Ae {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10046a;

    /* renamed from: b, reason: collision with root package name */
    public final C0857oo f10047b;

    /* renamed from: c, reason: collision with root package name */
    public final C0883po f10048c;

    public Ae(Context context) {
        this(context, new C0857oo(), new C0883po());
    }

    public final String a(String str) {
        try {
            this.f10048c.getClass();
            if (!C0883po.a(str)) {
                this.f10047b.getClass();
                str = w3.o.Y(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f10046a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ja.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ae(Context context, C0857oo c0857oo, C0883po c0883po) {
        this.f10046a = context;
        this.f10047b = c0857oo;
        this.f10048c = c0883po;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f10046a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f10046a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
