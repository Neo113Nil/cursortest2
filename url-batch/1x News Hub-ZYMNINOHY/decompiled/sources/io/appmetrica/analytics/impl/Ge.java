package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Ge {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6040a;

    /* renamed from: b, reason: collision with root package name */
    public final C0787qo f6041b;

    /* renamed from: c, reason: collision with root package name */
    public final C0812ro f6042c;

    public Ge(Context context) {
        this(context, new C0787qo(), new C0812ro());
    }

    public final String a(String str) {
        try {
            this.f6042c.getClass();
            if (!C0812ro.a(str)) {
                this.f6041b.getClass();
                str = s2.n.V(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f6040a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Qa.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ge(Context context, C0787qo c0787qo, C0812ro c0812ro) {
        this.f6040a = context;
        this.f6041b = c0787qo;
        this.f6042c = c0812ro;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f6040a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f6040a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
