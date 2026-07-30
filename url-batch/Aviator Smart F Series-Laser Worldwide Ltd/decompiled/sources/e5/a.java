package e5;

import android.util.Base64;
import com.moyoung.dafit.module.common.network.f;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
public class a {
    private Cipher cipher;

    private Cipher getCipher() {
        SecretKey secretKey = f.getSecretKey();
        IvParameterSpec ivParameter = f.getIvParameter();
        Cipher cipher = Cipher.getInstance(f.TRANSFORMATION);
        cipher.init(2, secretKey, ivParameter);
        return cipher;
    }

    public byte[] decrypt(byte[] bArr) {
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (this.cipher == null) {
                this.cipher = getCipher();
            }
            Cipher cipher = getCipher();
            this.cipher = cipher;
            return cipher.doFinal(decode);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public byte[] decryptWhatOver(byte[] bArr) {
        byte[] decode = Base64.decode(bArr, 0);
        if (this.cipher == null) {
            this.cipher = getCipher();
        }
        Cipher cipher = getCipher();
        this.cipher = cipher;
        return cipher.doFinal(decode);
    }
}
