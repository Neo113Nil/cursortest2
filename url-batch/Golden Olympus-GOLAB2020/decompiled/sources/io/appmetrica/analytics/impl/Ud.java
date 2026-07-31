package io.appmetrica.analytics.impl;

import f2.AbstractC2419b;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Ud implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final Wd f38358a;

    /* renamed from: b, reason: collision with root package name */
    public final Td f38359b;

    public Ud(@NotNull Wd wd, @NotNull Td td) {
        this.f38358a = wd;
        this.f38359b = td;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0015, B:13:0x0020, B:19:0x002c, B:29:0x001a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String apply(@NotNull File file) {
        byte[] bArr;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                } catch (Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    bArr = AbstractC2419b.c(fileInputStream);
                    AbstractC2713io.a((Closeable) fileInputStream);
                } catch (Throwable unused2) {
                    AbstractC2713io.a((Closeable) fileInputStream);
                    bArr = null;
                    if (bArr == null) {
                    }
                }
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    bArr = null;
                }
                if (bArr != null) {
                    return Base64Utils.compressBase64(MessageNano.toByteArray(this.f38359b.fromModel(new Zd(bArr, this.f38358a))));
                }
                return null;
            }
            bArr = null;
            if (bArr == null) {
            }
        } catch (Throwable unused3) {
            return null;
        }
    }
}
