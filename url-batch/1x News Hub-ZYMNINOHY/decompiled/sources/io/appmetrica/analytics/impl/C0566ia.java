package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566ia implements Do {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7528b;

    public C0566ia(Context context, String str) {
        this.f7527a = context;
        this.f7528b = str;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7527a, this.f7528b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f7527a, this.f7528b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return j2.b.a0(fileFromSdkStorage);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String text) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7527a, this.f7528b);
            if (fileFromSdkStorage == null) {
                return;
            }
            Charset charset = s2.a.f10316a;
            kotlin.jvm.internal.j.e(text, "text");
            kotlin.jvm.internal.j.e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromSdkStorage);
            try {
                j2.b.b0(fileOutputStream, text, charset);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
