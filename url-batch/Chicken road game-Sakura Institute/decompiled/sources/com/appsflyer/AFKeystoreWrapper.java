package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventParameterName;
    private Context values;
    public final Object valueOf = new Object();
    public String AFKeystoreWrapper = "";
    public int AFInAppEventType = 0;

    public AFKeystoreWrapper(Context context) {
        this.values = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventParameterName = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        r1 = r3.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r1.length != 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r3)));
        r2 = true;
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r3.length != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r1.length != 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r6.AFKeystoreWrapper = r3[1].trim();
        r6.AFInAppEventType = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFInAppEventParameterName() {
        boolean z;
        synchronized (this.valueOf) {
            KeyStore keyStore = this.AFInAppEventParameterName;
            z = false;
            if (keyStore != null) {
                try {
                    Enumeration<String> aliases = keyStore.aliases();
                    while (true) {
                        if (!aliases.hasMoreElements()) {
                            break;
                        }
                        String nextElement = aliases.nextElement();
                        if (nextElement != null && values(nextElement)) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder("Couldn't list KeyStore Aliases: ").append(th.getClass().getName()).toString(), th);
                }
            }
        }
        return z;
    }

    public final void AFInAppEventParameterName(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.valueOf) {
                if (!this.AFInAppEventParameterName.containsAlias(str)) {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(build);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Exception ").append(th.getMessage()).append(" occurred").toString(), th);
        }
    }

    private static boolean values(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFKeystoreWrapper() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.valueOf) {
            sb.append(this.AFKeystoreWrapper).append(",KSAppsFlyerRICounter=");
            sb.append(this.AFInAppEventType);
        }
        return sb.toString();
    }

    public final String AFInAppEventType() {
        String str;
        synchronized (this.valueOf) {
            str = this.AFKeystoreWrapper;
        }
        return str;
    }

    public final int values() {
        int i;
        synchronized (this.valueOf) {
            i = this.AFInAppEventType;
        }
        return i;
    }
}
