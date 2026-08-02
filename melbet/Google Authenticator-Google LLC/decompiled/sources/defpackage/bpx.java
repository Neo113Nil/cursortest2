package defpackage;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import j$.time.Instant;
import j$.util.DesugarDate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpx {
    private static final hkh a = hkh.l("com/google/android/apps/authenticator2/db/localencryption/SecretEncryptorImpl");
    private final Context b;
    private final Object c = new Object();
    private KeyPair d;
    private KeyStore.Entry e;
    private int f;
    private brn g;

    public bpx(Context context) {
        this.b = context;
    }

    private final KeyPair c() {
        KeyPair keyPair = this.d;
        if (keyPair != null) {
            return keyPair;
        }
        KeyStore.Entry d = d();
        if (!(d instanceof KeyStore.PrivateKeyEntry)) {
            throw new bpv("Key store entry is not of type PrivateKeyEntry");
        }
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) d;
        KeyPair keyPair2 = new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
        this.d = keyPair2;
        return keyPair2;
    }

    private final KeyStore.Entry d() {
        KeyStore.Entry entry = this.e;
        if (entry != null) {
            return entry;
        }
        if (!((KeyStore) f().a).containsAlias("Authenticator")) {
            throw new bpw();
        }
        KeyStore.Entry entry2 = ((KeyStore) f().a).getEntry("Authenticator", null);
        if (entry2 == null) {
            throw new bpv("Invalid entry in key store");
        }
        this.e = entry2;
        return entry2;
    }

    private final int e() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        try {
            if (d() instanceof KeyStore.PrivateKeyEntry) {
                this.f = 2;
                return 2;
            }
            this.f = 1;
            return 1;
        } catch (bpw unused) {
            this.f = 1;
            return 1;
        }
    }

    private final brn f() {
        if (this.g == null) {
            brn brnVar = new brn(KeyStore.getInstance("AndroidKeyStore"), (byte[]) null);
            this.g = brnVar;
            ((KeyStore) brnVar.a).load(null);
        }
        return this.g;
    }

    public final String a(String str) {
        byte[] a2;
        String str2;
        synchronized (this.c) {
            try {
                try {
                    if (e() - 1 != 0) {
                        byte[] decode = Base64.decode(str, 0);
                        Cipher Q = a.Q();
                        Q.init(2, c().getPrivate());
                        jjq r = jjq.r(decode);
                        a2 = jjq.z(new CipherInputStream(new ByteArrayInputStream(((jjo) r).a, 0, ((jjo) r).c()), Q)).x();
                    } else {
                        hwi.a();
                        a2 = new hyj().a(Base64.decode(str, 0), new byte[0]);
                    }
                    str2 = new String(a2, StandardCharsets.UTF_8);
                } finally {
                }
            } catch (bpw e) {
                e = e;
                throw new bpv(e);
            } catch (IOException e2) {
                e = e2;
                throw new bpv(e);
            } catch (GeneralSecurityException e3) {
                e = e3;
                throw new bpv(e);
            }
        }
        return str2;
    }

    public final String b(String str) {
        byte[] b;
        String encodeToString;
        KeyPair generateKeyPair;
        synchronized (this.c) {
            try {
                try {
                    if (e() - 1 != 0) {
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        Cipher Q = a.Q();
                        KeyPair keyPair = this.d;
                        if (keyPair == null) {
                            try {
                                generateKeyPair = c();
                            } catch (bpw unused) {
                                ((hkf) ((hkf) a.e()).i("com/google/android/apps/authenticator2/db/localencryption/SecretEncryptorImpl", "getOrCreateCipherEncryptionKeyPair", 277, "SecretEncryptorImpl.java")).s("Generating an encryption key for the first time for below M");
                                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                                keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(this.b).setAlias("Authenticator").setSubject(new X500Principal(String.format("CN=%s", "Authenticator"))).setSerialNumber(BigInteger.TEN).setStartDate(DesugarDate.from(Instant.now())).setEndDate(DesugarDate.from(Instant.now().plusMillis(630720000000L))).build());
                                generateKeyPair = keyPairGenerator.generateKeyPair();
                            }
                            keyPair = generateKeyPair;
                            this.d = keyPair;
                        }
                        Q.init(1, keyPair.getPublic());
                        jjq jjqVar = jjq.d;
                        jjp jjpVar = new jjp();
                        CipherOutputStream cipherOutputStream = new CipherOutputStream(jjpVar, Q);
                        try {
                            cipherOutputStream.write(bytes);
                            cipherOutputStream.close();
                            b = jjpVar.b().x();
                        } catch (Throwable th) {
                            try {
                                cipherOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        try {
                            d();
                        } catch (bpw unused2) {
                            ((hkf) ((hkf) a.e()).i("com/google/android/apps/authenticator2/db/localencryption/SecretEncryptorImpl", "generateAeadKeyIfNotPresent", 198, "SecretEncryptorImpl.java")).s("Generating an encryption key for the first time for M+");
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            keyGenerator.init(new KeyGenParameterSpec.Builder("Authenticator", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                            keyGenerator.generateKey();
                        }
                        hwi.a();
                        b = new hyj().b(str.getBytes(StandardCharsets.UTF_8), new byte[0]);
                    }
                    encodeToString = Base64.encodeToString(b, 0);
                } finally {
                }
            } catch (IOException e) {
                e = e;
                throw new bpv(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                throw new bpv(e);
            }
        }
        return encodeToString;
    }
}
