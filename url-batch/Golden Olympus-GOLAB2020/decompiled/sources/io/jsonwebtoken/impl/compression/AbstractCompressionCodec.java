package io.jsonwebtoken.impl.compression;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionException;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class AbstractCompressionCodec implements CompressionCodec {

    interface StreamWrapper {
        OutputStream wrap(OutputStream outputStream);
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public final byte[] compress(byte[] bArr) {
        Assert.notNull(bArr, "payload cannot be null.");
        try {
            return doCompress(bArr);
        } catch (IOException e4) {
            throw new CompressionException("Unable to compress payload.", e4);
        }
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public final byte[] decompress(byte[] bArr) {
        Assert.notNull(bArr, "compressed bytes cannot be null.");
        try {
            return doDecompress(bArr);
        } catch (IOException e4) {
            throw new CompressionException("Unable to decompress bytes.", e4);
        }
    }

    protected abstract byte[] doCompress(byte[] bArr);

    protected abstract byte[] doDecompress(byte[] bArr);

    byte[] readAndClose(InputStream inputStream) {
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_NONE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UserVerificationMethods.USER_VERIFY_NONE);
        try {
            int read = inputStream.read(bArr);
            while (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            Objects.nullSafeClose(inputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Objects.nullSafeClose(inputStream);
            throw th;
        }
    }

    byte[] writeAndClose(byte[] bArr, StreamWrapper streamWrapper) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UserVerificationMethods.USER_VERIFY_NONE);
        OutputStream wrap = streamWrapper.wrap(byteArrayOutputStream);
        try {
            wrap.write(bArr);
            wrap.flush();
            Objects.nullSafeClose(wrap);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Objects.nullSafeClose(wrap);
            throw th;
        }
    }
}
