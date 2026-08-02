package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.jax;
import defpackage.lhl;
import defpackage.lhm;
import defpackage.lho;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new lho(new lhl(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new lho(new lhl(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new lhm(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return jax.e(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return jax.e(bArr, i, i2);
    }
}
