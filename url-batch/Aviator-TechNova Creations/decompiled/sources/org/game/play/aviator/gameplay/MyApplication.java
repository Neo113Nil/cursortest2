package org.game.play.aviator.gameplay;

import android.app.Application;
import android.util.Base64;
import com.pesonal.adsdk.ADS_SplashActivity;
import com.pesonal.adsdk.AppManage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class MyApplication extends Application {
    public static AppOpenManager appOpenManager;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        appOpenManager = new AppOpenManager(this);
    }

    public static String DecryptUrl(String str, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("md5").digest(str.getBytes(StandardCharsets.UTF_16LE)), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(bArr), StandardCharsets.UTF_16LE);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getConvertedUrl(String str) {
        if (AppManage.isEncrypt == 1) {
            str = DecryptUrl(ADS_SplashActivity.auth_key, Base64.decode(String.valueOf(str).getBytes(StandardCharsets.UTF_16LE), 0));
        }
        return validateUrl(str) ? str : "https://www.example.com";
    }

    private static boolean validateUrl(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
