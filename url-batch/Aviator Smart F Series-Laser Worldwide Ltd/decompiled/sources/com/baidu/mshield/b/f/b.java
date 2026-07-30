package com.baidu.mshield.b.f;

import android.content.pm.Signature;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* loaded from: classes2.dex */
public class b {
    public static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(jarFile.getInputStream(jarEntry));
            do {
                try {
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        com.baidu.mshield.b.c.a.a(th);
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        return new Certificate[0];
                    } catch (Throwable th2) {
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th2;
                    }
                }
            } while (bufferedInputStream2.read(bArr, 0, bArr.length) != -1);
            Certificate[] certificates = jarEntry != null ? jarEntry.getCertificates() : null;
            try {
                bufferedInputStream2.close();
            } catch (IOException unused3) {
            }
            return certificates;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static PublicKey a(Signature signature) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
            try {
                PublicKey publicKey = certificateFactory.generateCertificate(byteArrayInputStream).getPublicKey();
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused) {
                }
                return publicKey;
            } catch (Throwable th) {
                th = th;
                try {
                    com.baidu.mshield.b.c.a.a(th);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        if (r3.length == r4.length) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PublicKey a(String str) {
        JarFile jarFile;
        byte[] bArr;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            bArr = new byte[8192];
            jarFile = new JarFile(str);
        } catch (Throwable unused) {
            jarFile = null;
        }
        try {
            Enumeration<JarEntry> entries = jarFile.entries();
            Certificate[] certificateArr = null;
            loop0: while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory()) {
                    String name = nextElement.getName();
                    if (!name.contains("../") && !name.startsWith("META-INF/")) {
                        Certificate[] a8 = a(jarFile, nextElement, bArr);
                        if (a8 != null && a8.length != 0) {
                            if (certificateArr != null) {
                                int i8 = 0;
                                while (i8 < certificateArr.length) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < a8.length) {
                                            Certificate certificate = certificateArr[i8];
                                            if (certificate != null && certificate.equals(a8[i9])) {
                                                break;
                                            }
                                            i9++;
                                        } else {
                                            break loop0;
                                        }
                                    }
                                    jarFile.close();
                                    try {
                                        jarFile.close();
                                    } catch (IOException unused2) {
                                    }
                                    return null;
                                }
                            }
                            certificateArr = a8;
                        }
                        jarFile.close();
                        try {
                            jarFile.close();
                        } catch (IOException unused3) {
                        }
                        return null;
                    }
                }
            }
            if (certificateArr == null || certificateArr.length <= 0) {
                try {
                    jarFile.close();
                } catch (IOException unused4) {
                }
                return null;
            }
            PublicKey publicKey = certificateArr[0].getPublicKey();
            try {
                jarFile.close();
            } catch (IOException unused5) {
            }
            return publicKey;
        } catch (Throwable unused6) {
            if (jarFile != null) {
                try {
                    jarFile.close();
                } catch (IOException unused7) {
                }
            }
            return null;
        }
    }
}
