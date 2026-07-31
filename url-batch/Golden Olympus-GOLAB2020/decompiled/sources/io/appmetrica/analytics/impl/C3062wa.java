package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3062wa implements InterfaceC3128yo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40035a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40036b;

    public C3062wa(@NotNull Context context, @NotNull String str) {
        this.f40035a = context;
        this.f40036b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    @Nullable
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f40035a, this.f40036b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f40035a, this.f40036b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return f2.i.e(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3128yo
    public final void a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f40035a, this.f40036b);
            if (fileFromSdkStorage != null) {
                f2.i.h(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
