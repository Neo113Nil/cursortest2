package net.oneformapp.encryptionlib;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HurlStack;
import com.miteksystems.misnap.core.DateUtil;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes9.dex */
public final class AES256JNCryptorInputStream extends InputStream {
    public final SecretKey decryptionKey;
    public boolean endOfStreamHandled = false;
    public final SecretKey hmacKey;
    public final InputStream in;
    public Mac mac;
    public PushbackInputStream pushbackInputStream;
    public TrailerInputStream trailerIn;

    public AES256JNCryptorInputStream(FileInputStream fileInputStream, SecretKey secretKey, SecretKey secretKey2) {
        this.decryptionKey = secretKey;
        this.hmacKey = secretKey2;
        this.in = fileInputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            PushbackInputStream pushbackInputStream = this.pushbackInputStream;
            if (pushbackInputStream != null) {
                pushbackInputStream.close();
            }
        } finally {
            TrailerInputStream trailerInputStream = this.trailerIn;
            if (trailerInputStream != null) {
                trailerInputStream.close();
            }
        }
    }

    public final void handleEndOfStream() {
        if (this.endOfStreamHandled) {
            return;
        }
        this.endOfStreamHandled = true;
        if (!AES256JNCryptor.arraysEqual((byte[]) this.trailerIn.trailerBuffer.clone(), this.mac.doFinal())) {
            throw new StreamIntegrityException("MAC validation failed.");
        }
    }

    public final void initializeStream() {
        InputStream inputStream;
        int read;
        byte[] bArr = new byte[18];
        int i = 0;
        while (true) {
            inputStream = this.in;
            if (i >= 18 || (read = inputStream.read(bArr, i, 18 - i)) == -1) {
                break;
            } else {
                i += read;
            }
        }
        if (i != 18) {
            throw new EOFException(String.format("Expected %d bytes but read %d bytes.", 18, Integer.valueOf(i)));
        }
        byte b = bArr[0];
        if (b != 3) {
            throw new IOException(String.format("Expected version %d but found %d.", 3, Byte.valueOf(b)));
        }
        if (bArr[1] != 0) {
            a$$ExternalSyntheticBUOutline0.m$4("Expected options byte to be zero.");
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 2, bArr2, 0, 16);
        this.trailerIn = new TrailerInputStream(inputStream);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, this.decryptionKey, new IvParameterSpec(bArr2));
            Mac mac = Mac.getInstance("HmacSHA256");
            this.mac = mac;
            mac.init(this.hmacKey);
            this.mac.update(bArr);
            this.pushbackInputStream = new PushbackInputStream(new CipherInputStream(new HurlStack.UrlConnectionInputStream(this.trailerIn, this.mac), cipher), 1);
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to initiate cipher.", e);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        DateUtil.notNull(bArr, "Byte array cannot be null.", new Object[0]);
        DateUtil.isTrue(i >= 0, "Offset cannot be negative.", new Object[0]);
        DateUtil.isTrue(i2 >= 0, "Length cannot be negative.", new Object[0]);
        DateUtil.isTrue(i2 + i <= bArr.length, "Length plus offset cannot be longer than byte array.", new Object[0]);
        if (i2 == 0) {
            return 0;
        }
        if (this.trailerIn == null) {
            initializeStream();
        }
        int read = this.pushbackInputStream.read(bArr, i, i2);
        if (read == -1) {
            handleEndOfStream();
            return read;
        }
        int read2 = this.pushbackInputStream.read();
        if (read2 == -1) {
            handleEndOfStream();
            return read;
        }
        this.pushbackInputStream.unread(read2);
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        DateUtil.notNull(bArr, "Array cannot be null.", new Object[0]);
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.trailerIn == null) {
            initializeStream();
        }
        int read = this.pushbackInputStream.read();
        if (read == -1) {
            handleEndOfStream();
            return read;
        }
        int read2 = this.pushbackInputStream.read();
        if (read2 == -1) {
            handleEndOfStream();
            return read;
        }
        this.pushbackInputStream.unread(read2);
        return read;
    }
}
