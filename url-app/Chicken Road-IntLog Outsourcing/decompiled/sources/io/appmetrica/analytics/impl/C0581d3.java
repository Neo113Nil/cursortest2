package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581d3 {

    /* renamed from: a, reason: collision with root package name */
    public final C0555c3 f8026a;

    /* renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f8027b;

    public C0581d3() {
        this(new C0555c3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C0555c3 c0555c3 = this.f8026a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c0555c3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f8027b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0581d3(C0555c3 c0555c3, GZIPCompressor gZIPCompressor) {
        this.f8026a = c0555c3;
        this.f8027b = gZIPCompressor;
    }
}
