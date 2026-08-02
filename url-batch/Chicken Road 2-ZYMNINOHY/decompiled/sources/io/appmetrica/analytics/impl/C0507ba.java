package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import m3.AbstractC1314b;
import w3.AbstractC1504a;

/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507ba implements Bo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11498a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11499b;

    public C0507ba(Context context, String str) {
        this.f11498a = context;
        this.f11499b = str;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f11498a, this.f11499b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f11498a, this.f11499b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return AbstractC1314b.O(fileFromSdkStorage);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String text) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f11498a, this.f11499b);
            if (fileFromSdkStorage == null) {
                return;
            }
            Charset charset = AbstractC1504a.f15936a;
            kotlin.jvm.internal.i.e(text, "text");
            kotlin.jvm.internal.i.e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromSdkStorage);
            try {
                AbstractC1314b.P(fileOutputStream, text, charset);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
