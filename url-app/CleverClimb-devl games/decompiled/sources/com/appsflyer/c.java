package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
class c {

    /* renamed from: b, reason: collision with root package name */
    private KeyStore f3438b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3439c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3437a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private String f3440d = "";
    private int e = 0;

    public c(Context context) {
        this.f3439c = context;
        d.d("Initialising KeyStore..");
        try {
            this.f3438b = KeyStore.getInstance("AndroidKeyStore");
            this.f3438b.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            d.a("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    final void a(String str) {
        this.f3440d = str;
        this.e = 0;
        b(e());
    }

    final void a() {
        String e = e();
        synchronized (this.f3437a) {
            this.e++;
            d.d("Deleting key with alias: ".concat(String.valueOf(e)));
            try {
                synchronized (this.f3437a) {
                    this.f3438b.deleteEntry(e);
                }
            } catch (KeyStoreException e2) {
                StringBuilder sb = new StringBuilder("Exception ");
                sb.append(e2.getMessage());
                sb.append(" occurred");
                d.a(sb.toString(), e2);
            }
        }
        b(e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r1 = r4.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        if (r1.length != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        com.appsflyer.d.d("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r3.length != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r1.length != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        r7.f3440d = r3[1].trim();
        r7.e = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r3 = new java.lang.StringBuilder("Couldn't list KeyStore Aliases: ");
        r3.append(r1.getClass().getName());
        com.appsflyer.d.a(r3.toString(), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean b() {
        boolean z;
        synchronized (this.f3437a) {
            z = true;
            if (this.f3438b != null) {
                try {
                    Enumeration<String> aliases = this.f3438b.aliases();
                    while (true) {
                        if (!aliases.hasMoreElements()) {
                            break;
                        }
                        String nextElement = aliases.nextElement();
                        if (nextElement != null && nextElement.startsWith("com.appsflyer")) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
            }
            z = false;
        }
        return z;
    }

    private void b(String str) {
        d.d("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f3437a) {
                if (!this.f3438b.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (Build.VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f3439c).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(algorithmParameterSpec);
                    keyPairGenerator.generateKeyPair();
                } else {
                    d.d("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            d.a(sb.toString(), th);
        }
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f3437a) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.f3440d);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.e);
        }
        return sb.toString();
    }

    final String c() {
        String str;
        synchronized (this.f3437a) {
            str = this.f3440d;
        }
        return str;
    }

    final int d() {
        int i;
        synchronized (this.f3437a) {
            i = this.e;
        }
        return i;
    }
}
