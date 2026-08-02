package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430d3 {

    /* renamed from: a, reason: collision with root package name */
    public final C0404c3 f7169a;

    /* renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f7170b;

    public C0430d3() {
        this(new C0404c3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C0404c3 c0404c3 = this.f7169a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c0404c3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f7170b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C0430d3(C0404c3 c0404c3, GZIPCompressor gZIPCompressor) {
        this.f7169a = c0404c3;
        this.f7170b = gZIPCompressor;
    }
}
