package com.cmplay.gppay.b;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final h f4134a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4135b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4136c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4137d;
    private final String e;
    private final b f;

    e(h hVar, b bVar, d dVar, int i, String str, String str2) {
        this.f4134a = hVar;
        this.f = bVar;
        this.f4135b = dVar;
        this.f4136c = i;
        this.f4137d = str;
        this.e = str2;
    }

    private void a(int i) {
        this.f4135b.c(i);
    }

    private void a(int i, j jVar) {
        this.f4134a.a(i, jVar);
        if (this.f4134a.a()) {
            this.f4135b.a(i);
        } else {
            this.f4135b.b(i);
        }
    }

    private void d() {
        this.f4135b.b(561);
    }

    public d a() {
        return this.f4135b;
    }

    public void a(PublicKey publicKey, int i, String str, String str2) {
        String str3;
        int a2;
        String str4;
        String str5;
        j jVar = null;
        if (i == 0 || i == 1 || i == 2) {
            try {
                if (TextUtils.isEmpty(str)) {
                    Log.e("LicenseValidator", "Signature verification failed: signedData is empty. (Device not signed-in to any Google accounts?)");
                    d();
                    return;
                }
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (!signature.verify(com.cmplay.gppay.b.a.a.a(str2))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    d();
                    return;
                }
                try {
                    jVar = j.a(str);
                    if (jVar.f4141a != i) {
                        Log.e("LicenseValidator", "Response codes don't match.");
                        d();
                        return;
                    }
                    if (jVar.f4142b != this.f4136c) {
                        Log.e("LicenseValidator", "Nonce doesn't match.");
                        d();
                        return;
                    }
                    if (!jVar.f4143c.equals(this.f4137d)) {
                        Log.e("LicenseValidator", "Package name doesn't match.");
                        d();
                        return;
                    } else if (!jVar.f4144d.equals(this.e)) {
                        Log.e("LicenseValidator", "Version codes don't match.");
                        d();
                        return;
                    } else {
                        str3 = jVar.e;
                        if (TextUtils.isEmpty(str3)) {
                            Log.e("LicenseValidator", "User identifier is empty.");
                            d();
                            return;
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    Log.e("LicenseValidator", "Could not parse response.");
                    d();
                    return;
                }
            } catch (com.cmplay.gppay.b.a.b unused2) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                d();
                return;
            } catch (InvalidKeyException unused3) {
                a(5);
                return;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (SignatureException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            str3 = null;
        }
        switch (i) {
            case 0:
            case 2:
                a2 = this.f.a(str3);
                a(a2, jVar);
                return;
            case 1:
                a2 = 561;
                a(a2, jVar);
                return;
            case 3:
                a(3);
                return;
            case 4:
                str4 = "LicenseValidator";
                str5 = "An error has occurred on the licensing server.";
                break;
            case 5:
                str4 = "LicenseValidator";
                str5 = "Licensing server is refusing to talk to this device, over quota.";
                break;
            default:
                switch (i) {
                    case 257:
                        str4 = "LicenseValidator";
                        str5 = "Error contacting licensing server.";
                        break;
                    case 258:
                        a(1);
                        return;
                    case 259:
                        a(2);
                        return;
                    default:
                        Log.e("LicenseValidator", "Unknown response code for license check.");
                        d();
                        return;
                }
        }
        Log.w(str4, str5);
        a(291, jVar);
    }

    public int b() {
        return this.f4136c;
    }

    public String c() {
        return this.f4137d;
    }
}
