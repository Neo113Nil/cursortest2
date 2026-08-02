package net.oneformapp.encryptionlib;

import com.jakewharton.disklrucache.DiskLruCache$Editor$FaultHidingOutputStream;
import com.miteksystems.misnap.core.DateUtil;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
public final class AES256JNCryptorOutputStream extends OutputStream {
    public final CipherOutputStream cipherStream;
    public final byte[] iv;
    public final DiskLruCache$Editor$FaultHidingOutputStream macOutputStream;
    public boolean writtenHeader;

    public AES256JNCryptorOutputStream(FileOutputStream fileOutputStream, SecretKey secretKey, SecretKey secretKey2) {
        DateUtil.notNull(fileOutputStream, "Output stream cannot be null.", new Object[0]);
        DateUtil.notNull(secretKey, "Encryption key cannot be null.", new Object[0]);
        DateUtil.notNull(secretKey2, "HMAC key cannot be null.", new Object[0]);
        byte[] bArr = new byte[16];
        AES256JNCryptor.SECURE_RANDOM.nextBytes(bArr);
        this.iv = bArr;
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(secretKey2);
                this.macOutputStream = new DiskLruCache$Editor$FaultHidingOutputStream(fileOutputStream, mac);
                this.cipherStream = new CipherOutputStream(this.macOutputStream, cipher);
            } catch (GeneralSecurityException e) {
                throw new CryptorException("Failed to initialize HMac", e);
            }
        } catch (GeneralSecurityException e2) {
            throw new CryptorException("Failed to initialize AES cipher", e2);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.cipherStream.close();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (!this.writtenHeader) {
            this.macOutputStream.write(3);
            this.macOutputStream.write(0);
            this.macOutputStream.write(this.iv);
            this.writtenHeader = true;
        }
        this.cipherStream.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!this.writtenHeader) {
            this.macOutputStream.write(3);
            this.macOutputStream.write(0);
            this.macOutputStream.write(this.iv);
            this.writtenHeader = true;
        }
        this.cipherStream.write(bArr, i, i2);
    }
}
