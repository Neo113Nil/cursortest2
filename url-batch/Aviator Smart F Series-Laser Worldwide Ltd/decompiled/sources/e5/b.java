package e5;

import android.util.Base64;
import com.moyoung.dafit.module.common.network.f;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
public class b {
    private Cipher cipher;

    private Cipher getCipher() {
        SecretKey secretKey = f.getSecretKey();
        IvParameterSpec ivParameter = f.getIvParameter();
        Cipher cipher = Cipher.getInstance(f.TRANSFORMATION);
        cipher.init(1, secretKey, ivParameter);
        return cipher;
    }

    public byte[] encrypt(byte[] bArr) {
        try {
            if (this.cipher == null) {
                this.cipher = getCipher();
            }
            return Base64.encode(this.cipher.doFinal(bArr), 0);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
