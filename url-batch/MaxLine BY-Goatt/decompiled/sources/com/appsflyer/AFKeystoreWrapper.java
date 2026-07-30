package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.google.firebase.encoders.json.BuildConfig;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context valueOf;
    public KeyStore values;
    public final Object AFInAppEventParameterName = new Object();
    public String AFKeystoreWrapper = BuildConfig.FLAVOR;
    public int AFInAppEventType = 0;

    public AFKeystoreWrapper(Context context) {
        this.valueOf = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.values = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public final String AFInAppEventParameterName() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFInAppEventParameterName) {
            sb.append(this.AFKeystoreWrapper);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.AFInAppEventType);
        }
        return sb.toString();
    }

    public final int AFInAppEventType() {
        int i;
        synchronized (this.AFInAppEventParameterName) {
            i = this.AFInAppEventType;
        }
        return i;
    }

    public final String AFKeystoreWrapper() {
        String str;
        synchronized (this.AFInAppEventParameterName) {
            str = this.AFKeystoreWrapper;
        }
        return str;
    }

    public final void valueOf(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFInAppEventParameterName) {
                try {
                    if (this.values.containsAlias(str)) {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(build);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th2.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th2);
        }
    }

    private static boolean AFInAppEventType(String str) {
        return str.startsWith("com.appsflyer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        r1 = r3.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r1.length != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(r3));
        r2 = true;
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r3.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r1.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r6.AFKeystoreWrapper = r3[1].trim();
        r6.AFInAppEventType = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean valueOf() {
        boolean z;
        synchronized (this.AFInAppEventParameterName) {
            try {
                KeyStore keyStore = this.values;
                z = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> aliases = keyStore.aliases();
                        while (true) {
                            if (!aliases.hasMoreElements()) {
                                break;
                            }
                            String nextElement = aliases.nextElement();
                            if (nextElement != null && AFInAppEventType(nextElement)) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb.append(th.getClass().getName());
                        AFLogger.afErrorLog(sb.toString(), th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }
}
