package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.net.Uri;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ow {
    public ow() {
    }

    private static int a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    static int c(BiometricManager biometricManager) {
        int canAuthenticate;
        canAuthenticate = biometricManager.canAuthenticate();
        return canAuthenticate;
    }

    static BiometricManager d(Context context) {
        return di$$ExternalSyntheticApiModelOutline0.m52m(context.getSystemService(di$$ExternalSyntheticApiModelOutline0.m54m()));
    }

    static Method e() {
        try {
            return di$$ExternalSyntheticApiModelOutline0.m54m().getMethod("canAuthenticate", gd$$ExternalSyntheticApiModelOutline0.m79m$1());
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject f(pc pcVar) {
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (pcVar == null) {
            return null;
        }
        Cipher cipher = pcVar.b;
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = pcVar.a;
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = pcVar.c;
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = pcVar.e) != null) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }
        if (Build.VERSION.SDK_INT >= 33 && (presentationSession = pcVar.f) != null) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }
        if (Build.VERSION.SDK_INT >= 36 && h() >= 3600001 && (keyAgreement = pcVar.d) != null) {
            return new BiometricPrompt.CryptoObject(keyAgreement);
        }
        if (Build.VERSION.SDK_INT < 35) {
            return null;
        }
        long j = pcVar.g;
        if (j != 0) {
            return new BiometricPrompt.CryptoObject(j);
        }
        return null;
    }

    public static pc g() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new pc(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static /* synthetic */ int h() {
        int i;
        if (Build.VERSION.SDK_INT < 36) {
            return Build.VERSION.SDK_INT * 100000;
        }
        i = Build.VERSION.SDK_INT_FULL;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b9, code lost:
    
        if (r8.d == r9) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
    
        if (r6.d == r12) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0739 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0753 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x071a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(se seVar, rv rvVar, ArrayList arrayList, int i) {
        int i2;
        sb[] sbVarArr;
        int i3;
        int i4;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        sd sdVar;
        int i5;
        sb[] sbVarArr2;
        sd sdVar2;
        sd sdVar3;
        sd sdVar4;
        rv rvVar2;
        sd sdVar5;
        sd sdVar6;
        int i6;
        int i7;
        boolean z5;
        sd sdVar7;
        sd sdVar8;
        ry ryVar;
        ry ryVar2;
        sc scVar;
        ry ryVar3;
        sd sdVar9;
        ry ryVar4;
        int i8;
        sd sdVar10;
        int i9;
        sd sdVar11;
        sc scVar2;
        ry ryVar5;
        sd sdVar12;
        boolean z6;
        int i10;
        ry ryVar6;
        int i11;
        int i12;
        ry ryVar7;
        int size;
        ArrayList arrayList2;
        int i13;
        float f3;
        int i14;
        float f4;
        boolean z7;
        int i15;
        int i16;
        sb[] sbVarArr3;
        sd sdVar13;
        int i17;
        int i18;
        int i19;
        sd sdVar14;
        int h;
        se seVar2 = seVar;
        rv rvVar3 = rvVar;
        ArrayList arrayList3 = arrayList;
        int i20 = 2;
        if (i == 0) {
            i2 = seVar2.au;
            sbVarArr = seVar2.ax;
            i3 = 0;
        } else {
            i2 = seVar2.av;
            sbVarArr = seVar2.aw;
            i3 = 2;
        }
        int i21 = i2;
        sb[] sbVarArr4 = sbVarArr;
        int i22 = 0;
        while (i22 < i21) {
            sb sbVar = sbVarArr4[i22];
            int i23 = 3;
            int i24 = 8;
            ry ryVar8 = null;
            if (sbVar.t) {
                i4 = i22;
                f = 0.0f;
            } else {
                int i25 = sbVar.o;
                int i26 = i25 + i25;
                f = 0.0f;
                sd sdVar15 = sbVar.a;
                sd sdVar16 = sdVar15;
                sd sdVar17 = sdVar16;
                boolean z8 = false;
                while (!z8) {
                    int i27 = i26 + 1;
                    sbVar.i++;
                    sdVar16.ao[i25] = null;
                    sdVar16.an[i25] = null;
                    if (sdVar16.ai != i24) {
                        sbVar.l++;
                        if (sdVar16.N(i25) != i23) {
                            int i28 = sbVar.m;
                            if (i25 == 0) {
                                h = sdVar16.j();
                                i19 = 0;
                            } else {
                                h = sdVar16.h();
                                i19 = 1;
                            }
                            sbVar.m = i28 + h;
                        } else {
                            i19 = i25;
                        }
                        int i29 = sbVar.m;
                        sc[] scVarArr = sdVar16.S;
                        int b = i29 + scVarArr[i26].b();
                        sbVar.m = b;
                        sbVar.m = b + scVarArr[i27].b();
                        int b2 = sbVar.n + scVarArr[i26].b();
                        sbVar.n = b2;
                        sbVar.n = b2 + scVarArr[i27].b();
                        if (sbVar.b == null) {
                            sbVar.b = sdVar16;
                        }
                        sbVar.d = sdVar16;
                        int i30 = sdVar16.ar[i19];
                        if (i30 == i23) {
                            int i31 = sdVar16.v[i19];
                            if (i31 != 0 && i31 != i23) {
                                if (i31 == i20) {
                                    i31 = i20;
                                }
                            }
                            sbVar.j++;
                            float f5 = sdVar16.am[i19];
                            if (f5 > 0.0f) {
                                sbVar.k += f5;
                            }
                            i18 = i22;
                            if (sdVar16.ai != 8 && i30 == 3 && (i31 == 0 || i31 == 3)) {
                                if (f5 < 0.0f) {
                                    sbVar.q = true;
                                } else {
                                    sbVar.r = true;
                                }
                                if (sbVar.h == null) {
                                    sbVar.h = new ArrayList();
                                }
                                sbVar.h.add(sdVar16);
                            }
                            if (sbVar.f == null) {
                                sbVar.f = sdVar16;
                            }
                            sd sdVar18 = sbVar.g;
                            if (sdVar18 != null) {
                                sdVar18.an[i19] = sdVar16;
                            }
                            sbVar.g = sdVar16;
                        }
                        i18 = i22;
                    } else {
                        i18 = i22;
                        i19 = i25;
                    }
                    sd sdVar19 = sdVar17;
                    if (sdVar19 != sdVar16) {
                        sdVar19.ao[i19] = sdVar16;
                    }
                    sc scVar3 = sdVar16.S[i27].e;
                    if (scVar3 != null) {
                        sdVar14 = scVar3.d;
                        sc scVar4 = sdVar14.S[i26].e;
                        if (scVar4 != null) {
                        }
                    }
                    sdVar14 = null;
                    z8 = sdVar14 == null;
                    if (sdVar14 == null) {
                        sdVar14 = sdVar16;
                    }
                    sdVar17 = sdVar16;
                    i23 = 3;
                    i24 = 8;
                    i20 = 2;
                    sdVar16 = sdVar14;
                    i22 = i18;
                }
                i4 = i22;
                sd sdVar20 = sbVar.b;
                if (sdVar20 != null) {
                    sbVar.m -= sdVar20.S[i26].b();
                }
                sd sdVar21 = sbVar.d;
                if (sdVar21 != null) {
                    sbVar.m -= sdVar21.S[i26 + 1].b();
                }
                sbVar.c = sdVar16;
                if (i25 == 0 && sbVar.p) {
                    sbVar.e = sbVar.c;
                } else {
                    sbVar.e = sdVar15;
                }
                sbVar.s = sbVar.r && sbVar.q;
            }
            sbVar.t = true;
            if (arrayList3 == null || arrayList3.contains(sbVar.a)) {
                sd sdVar22 = sbVar.a;
                sd sdVar23 = sbVar.c;
                sd sdVar24 = sbVar.b;
                sd sdVar25 = sbVar.d;
                sd sdVar26 = sbVar.e;
                float f6 = sbVar.k;
                sd sdVar27 = sbVar.f;
                sd sdVar28 = sbVar.g;
                int i32 = seVar2.ar[i];
                if (i == 0) {
                    int i33 = sdVar26.ak;
                    boolean z9 = i33 == 0;
                    boolean z10 = i33 == 1;
                    z = i33 == 2;
                    sdVar = sdVar22;
                    z4 = z10;
                    z2 = z9;
                    z3 = false;
                    f2 = f6;
                } else {
                    int i34 = sdVar26.al;
                    boolean z11 = i34 == 0;
                    boolean z12 = i34 == 1;
                    f2 = f6;
                    z = i34 == 2;
                    z2 = z11;
                    z3 = false;
                    z4 = z12;
                    sdVar = sdVar22;
                }
                while (!z3) {
                    int i35 = i3 + 1;
                    sc[] scVarArr2 = sdVar.S;
                    sc scVar5 = scVarArr2[i3];
                    int i36 = true != z ? 4 : 1;
                    int b3 = scVar5.b();
                    boolean z13 = z;
                    int[] iArr = sdVar.ar;
                    int i37 = b3;
                    boolean z14 = iArr[i] == 3 && sdVar.v[i] == 0;
                    sc scVar6 = scVar5.e;
                    if (scVar6 != null && sdVar != sdVar22) {
                        i37 += scVar6.b();
                    }
                    boolean z15 = z14;
                    int i38 = i37;
                    if (z13 && sdVar != sdVar22 && sdVar != sdVar24) {
                        i36 = 8;
                    }
                    if (scVar6 != null) {
                        if (sdVar == sdVar24) {
                            i16 = i21;
                            sbVarArr3 = sbVarArr4;
                            rvVar3.g(scVar5.h, scVar6.h, i38, 6);
                        } else {
                            i16 = i21;
                            sbVarArr3 = sbVarArr4;
                            rvVar3.g(scVar5.h, scVar6.h, i38, 8);
                        }
                        if (z15 && !z13) {
                            i36 = 5;
                        }
                        rvVar3.m(scVar5.h, scVar5.e.h, i38, (sdVar == sdVar24 && z13 && sdVar.U[i]) ? 5 : i36);
                    } else {
                        i16 = i21;
                        sbVarArr3 = sbVarArr4;
                    }
                    if (i32 == 2) {
                        if (sdVar.ai == 8 || iArr[i] != 3) {
                            i17 = 0;
                        } else {
                            i17 = 0;
                            rvVar3.g(scVarArr2[i35].h, scVarArr2[i3].h, 0, 5);
                        }
                        rvVar3.g(scVarArr2[i3].h, seVar2.S[i3].h, i17, 8);
                    }
                    sc scVar7 = scVarArr2[i35].e;
                    if (scVar7 != null) {
                        sdVar13 = scVar7.d;
                        sc scVar8 = sdVar13.S[i3].e;
                        if (scVar8 != null) {
                        }
                    }
                    sdVar13 = null;
                    z3 = sdVar13 == null;
                    if (sdVar13 != null) {
                        sdVar = sdVar13;
                    }
                    z = z13;
                    i21 = i16;
                    sbVarArr4 = sbVarArr3;
                }
                boolean z16 = z;
                i5 = i21;
                sbVarArr2 = sbVarArr4;
                if (sdVar25 != null) {
                    int i39 = i3 + 1;
                    sc[] scVarArr3 = sdVar23.S;
                    if (scVarArr3[i39].e != null) {
                        sc scVar9 = sdVar25.S[i39];
                        if (sdVar25.ar[i] == 3 && sdVar25.v[i] == 0 && !z16) {
                            sc scVar10 = scVar9.e;
                            if (scVar10.d == seVar2) {
                                i15 = i39;
                                rvVar3.m(scVar9.h, scVar10.h, -scVar9.b(), 5);
                                rvVar3.h(scVar9.h, scVarArr3[i15].e.h, -scVar9.b(), 6);
                            }
                        }
                        i15 = i39;
                        if (z16) {
                            sc scVar11 = scVar9.e;
                            if (scVar11.d == seVar2) {
                                rvVar3.m(scVar9.h, scVar11.h, -scVar9.b(), 4);
                            }
                        }
                        rvVar3.h(scVar9.h, scVarArr3[i15].e.h, -scVar9.b(), 6);
                    }
                }
                if (i32 == 2) {
                    int i40 = i3 + 1;
                    ry ryVar9 = seVar2.S[i40].h;
                    sc scVar12 = sdVar23.S[i40];
                    rvVar3.g(ryVar9, scVar12.h, scVar12.b(), 8);
                }
                ArrayList arrayList4 = sbVar.h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (sbVar.q && !sbVar.s) {
                        f2 = sbVar.j;
                    }
                    sd sdVar29 = null;
                    float f7 = f;
                    int i41 = 0;
                    while (i41 < size) {
                        sd sdVar30 = (sd) arrayList4.get(i41);
                        float f8 = sdVar30.am[i];
                        if (f8 < f) {
                            if (sbVar.s) {
                                sc[] scVarArr4 = sdVar30.S;
                                arrayList2 = arrayList4;
                                rvVar3.m(scVarArr4[i3 + 1].h, scVarArr4[i3].h, 0, 4);
                                z7 = false;
                                i13 = size;
                                i14 = i41;
                                f4 = f;
                                i41 = i14 + 1;
                                arrayList4 = arrayList2;
                                size = i13;
                                f = f4;
                            } else {
                                f8 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList4;
                        if (f8 == f) {
                            sc[] scVarArr5 = sdVar30.S;
                            z7 = false;
                            rvVar3.m(scVarArr5[i3 + 1].h, scVarArr5[i3].h, 0, 8);
                            i13 = size;
                            i14 = i41;
                            f4 = f;
                            i41 = i14 + 1;
                            arrayList4 = arrayList2;
                            size = i13;
                            f = f4;
                        } else {
                            if (sdVar29 != null) {
                                int i42 = i3 + 1;
                                sc[] scVarArr6 = sdVar29.S;
                                ry ryVar10 = scVarArr6[i3].h;
                                ry ryVar11 = scVarArr6[i42].h;
                                sc[] scVarArr7 = sdVar30.S;
                                ry ryVar12 = scVarArr7[i3].h;
                                i13 = size;
                                ry ryVar13 = scVarArr7[i42].h;
                                float f9 = f7;
                                ru a = rvVar3.a();
                                f3 = f8;
                                float f10 = f;
                                a.b = f10;
                                f4 = f10;
                                if (f2 == f10 || f9 == f3) {
                                    i14 = i41;
                                    a.e.g(ryVar10, 1.0f);
                                    a.e.g(ryVar11, -1.0f);
                                    a.e.g(ryVar13, 1.0f);
                                    a.e.g(ryVar12, -1.0f);
                                } else {
                                    if (f9 == f4) {
                                        a.e.g(ryVar10, 1.0f);
                                        a.e.g(ryVar11, -1.0f);
                                    } else if (f8 == f) {
                                        a.e.g(ryVar12, 1.0f);
                                        a.e.g(ryVar13, -1.0f);
                                    } else {
                                        i14 = i41;
                                        a.e.g(ryVar10, 1.0f);
                                        a.e.g(ryVar11, -1.0f);
                                        float f11 = (f9 / f2) / (f3 / f2);
                                        a.e.g(ryVar13, f11);
                                        a.e.g(ryVar12, -f11);
                                    }
                                    i14 = i41;
                                }
                                rvVar3.e(a);
                            } else {
                                i13 = size;
                                f3 = f8;
                                i14 = i41;
                                f4 = f;
                            }
                            sdVar29 = sdVar30;
                            f7 = f3;
                            i41 = i14 + 1;
                            arrayList4 = arrayList2;
                            size = i13;
                            f = f4;
                        }
                    }
                }
                if (sdVar24 == null || !(sdVar24 == sdVar25 || z16)) {
                    sdVar2 = sdVar24;
                    sdVar3 = sdVar25;
                    if (!z2) {
                        sdVar4 = sdVar2;
                    } else if (sdVar2 != null) {
                        int i43 = sbVar.j;
                        boolean z17 = i43 > 0 && sbVar.i == i43;
                        sd sdVar31 = sdVar2;
                        sd sdVar32 = sdVar31;
                        while (sdVar32 != null) {
                            sd sdVar33 = sdVar32.ao[i];
                            while (true) {
                                if (sdVar33 == null) {
                                    i9 = 8;
                                    break;
                                }
                                i9 = 8;
                                if (sdVar33.ai != 8) {
                                    break;
                                } else {
                                    sdVar33 = sdVar33.ao[i];
                                }
                            }
                            if (sdVar33 != null || sdVar32 == sdVar3) {
                                int i44 = i3 + 1;
                                sc[] scVarArr8 = sdVar32.S;
                                sc scVar13 = scVarArr8[i3];
                                ry ryVar14 = scVar13.h;
                                sc scVar14 = scVar13.e;
                                ry ryVar15 = scVar14 != null ? scVar14.h : null;
                                if (sdVar31 != sdVar32) {
                                    ryVar15 = sdVar31.S[i44].h;
                                } else if (sdVar32 == sdVar2) {
                                    sc scVar15 = sdVar22.S[i3].e;
                                    ryVar15 = scVar15 != null ? scVar15.h : null;
                                }
                                int b4 = scVar13.b();
                                int b5 = scVarArr8[i44].b();
                                if (sdVar33 != null) {
                                    scVar2 = sdVar33.S[i3];
                                    sdVar11 = sdVar33;
                                    ryVar5 = scVar2.h;
                                } else {
                                    sdVar11 = sdVar33;
                                    scVar2 = sdVar23.S[i44].e;
                                    ryVar5 = scVar2 != null ? scVar2.h : null;
                                }
                                ry ryVar16 = scVarArr8[i44].h;
                                if (scVar2 != null) {
                                    b5 += scVar2.b();
                                }
                                int b6 = b4 + sdVar31.S[i44].b();
                                if (ryVar14 == null || ryVar15 == null || ryVar5 == null || ryVar16 == null) {
                                    sdVar12 = sdVar31;
                                    z6 = z17;
                                    i10 = 8;
                                } else {
                                    if (sdVar32 == sdVar2) {
                                        b6 = sdVar2.S[i3].b();
                                    }
                                    int i45 = b6;
                                    if (sdVar32 == sdVar3) {
                                        b5 = sdVar3.S[i44].b();
                                    }
                                    if (true != z17) {
                                        ryVar6 = ryVar15;
                                        i11 = b5;
                                        i12 = 5;
                                    } else {
                                        ryVar6 = ryVar15;
                                        i11 = b5;
                                        i12 = 8;
                                    }
                                    sdVar12 = sdVar31;
                                    z6 = z17;
                                    i10 = 8;
                                    rvVar.d(ryVar14, ryVar6, i45, 0.5f, ryVar5, ryVar16, i11, i12);
                                }
                            } else {
                                sdVar12 = sdVar31;
                                sdVar11 = sdVar33;
                                z6 = z17;
                                i10 = i9;
                            }
                            sdVar31 = sdVar32.ai != i10 ? sdVar32 : sdVar12;
                            sdVar32 = sdVar11;
                            z17 = z6;
                        }
                    } else {
                        sdVar4 = null;
                    }
                    int i46 = 8;
                    if (!z4 || sdVar2 == null) {
                        rvVar2 = rvVar;
                        sdVar5 = sdVar4;
                    } else {
                        int i47 = i3 + 1;
                        int i48 = sbVar.j;
                        boolean z18 = i48 > 0 && sbVar.i == i48;
                        sd sdVar34 = sdVar2;
                        sd sdVar35 = sdVar34;
                        while (sdVar34 != null) {
                            sd sdVar36 = sdVar34.ao[i];
                            while (sdVar36 != null && sdVar36.ai == i46) {
                                sdVar36 = sdVar36.ao[i];
                            }
                            if (sdVar34 == sdVar2 || sdVar34 == sdVar3 || sdVar36 == null) {
                                z5 = z18;
                                sdVar7 = sdVar34;
                                sdVar8 = sdVar35;
                                sdVar34 = sdVar36;
                            } else {
                                if (sdVar36 == sdVar3) {
                                    sdVar36 = null;
                                }
                                sc[] scVarArr9 = sdVar34.S;
                                sc scVar16 = scVarArr9[i3];
                                sd sdVar37 = sdVar34;
                                ry ryVar17 = scVar16.h;
                                sc scVar17 = scVar16.e;
                                sc[] scVarArr10 = sdVar35.S;
                                ry ryVar18 = scVarArr10[i47].h;
                                int b7 = scVar16.b();
                                int b8 = scVarArr9[i47].b();
                                if (sdVar36 != null) {
                                    scVar = sdVar36.S[i3];
                                    ryVar2 = scVar.h;
                                    ryVar = ryVar17;
                                    sc scVar18 = scVar.e;
                                    ryVar3 = scVar18 != null ? scVar18.h : null;
                                } else {
                                    ryVar = ryVar17;
                                    sc scVar19 = sdVar3.S[i3];
                                    ryVar2 = scVar19 != null ? scVar19.h : null;
                                    ry ryVar19 = scVarArr9[i47].h;
                                    scVar = scVar19;
                                    ryVar3 = ryVar19;
                                }
                                if (scVar != null) {
                                    b8 += scVar.b();
                                }
                                int b9 = b7 + scVarArr10[i47].b();
                                if (true != z18) {
                                    sdVar9 = sdVar35;
                                    ryVar4 = ryVar18;
                                    i8 = 4;
                                } else {
                                    sdVar9 = sdVar35;
                                    ryVar4 = ryVar18;
                                    i8 = 8;
                                }
                                if (ryVar == null || ryVar4 == null || ryVar2 == null || ryVar3 == null) {
                                    z5 = z18;
                                    sdVar10 = sdVar36;
                                    sdVar7 = sdVar37;
                                    sdVar8 = sdVar9;
                                } else {
                                    ry ryVar20 = ryVar3;
                                    ry ryVar21 = ryVar;
                                    sdVar8 = sdVar9;
                                    int i49 = b8;
                                    sdVar10 = sdVar36;
                                    ry ryVar22 = ryVar2;
                                    sdVar7 = sdVar37;
                                    z5 = z18;
                                    rvVar.d(ryVar21, ryVar4, b9, 0.5f, ryVar22, ryVar20, i49, i8);
                                }
                                sdVar34 = sdVar10;
                            }
                            sdVar35 = sdVar7.ai != 8 ? sdVar7 : sdVar8;
                            i46 = 8;
                            z18 = z5;
                        }
                        rvVar2 = rvVar;
                        sc scVar20 = sdVar2.S[i3];
                        sc scVar21 = sdVar22.S[i3].e;
                        sc scVar22 = sdVar3.S[i47];
                        sc scVar23 = sdVar23.S[i47].e;
                        if (scVar21 != null) {
                            if (sdVar2 != sdVar3) {
                                i7 = 5;
                                rvVar2.m(scVar20.h, scVar21.h, scVar20.b(), 5);
                            } else {
                                i7 = 5;
                                if (scVar23 != null) {
                                    sdVar5 = sdVar4;
                                    i6 = 5;
                                    rvVar2.d(scVar20.h, scVar21.h, scVar20.b(), 0.5f, scVar22.h, scVar23.h, scVar22.b(), 5);
                                }
                            }
                            sdVar5 = sdVar4;
                            i6 = i7;
                        } else {
                            sdVar5 = sdVar4;
                            i6 = 5;
                        }
                        if (scVar23 != null && sdVar2 != sdVar3) {
                            rvVar2.m(scVar22.h, scVar23.h, -scVar22.b(), i6);
                        }
                    }
                    sdVar6 = sdVar5;
                    if ((!z2 || z4) && sdVar6 != null && sdVar6 != sdVar3) {
                        int i50 = i3 + 1;
                        sc[] scVarArr11 = sdVar6.S;
                        sc scVar24 = scVarArr11[i3];
                        if (sdVar3 == null) {
                            sdVar3 = sdVar6;
                        }
                        sc[] scVarArr12 = sdVar3.S;
                        sc scVar25 = scVarArr12[i50];
                        sc scVar26 = scVar24.e;
                        ryVar7 = scVar26 == null ? scVar26.h : null;
                        sc scVar27 = scVar25.e;
                        ry ryVar23 = scVar27 == null ? scVar27.h : null;
                        if (sdVar23 != sdVar3) {
                            sc scVar28 = sdVar23.S[i50].e;
                            if (scVar28 != null) {
                                ryVar23 = scVar28.h;
                            }
                            if (sdVar6 == sdVar3) {
                                scVar25 = scVarArr11[i50];
                            }
                            if (ryVar7 == null && ryVar8 != null) {
                                rvVar2.d(scVar24.h, ryVar7, scVar24.b(), 0.5f, ryVar8, scVar25.h, scVarArr12[i50].b(), 5);
                            }
                        }
                        ryVar8 = ryVar23;
                        if (sdVar6 == sdVar3) {
                        }
                        if (ryVar7 == null) {
                            rvVar2.d(scVar24.h, ryVar7, scVar24.b(), 0.5f, ryVar8, scVar25.h, scVarArr12[i50].b(), 5);
                        }
                    }
                } else {
                    int i51 = i3 + 1;
                    sc scVar29 = sdVar22.S[i3];
                    sc scVar30 = sdVar23.S[i51];
                    sc scVar31 = scVar29.e;
                    ry ryVar24 = scVar31 != null ? scVar31.h : null;
                    sc scVar32 = scVar30.e;
                    ry ryVar25 = scVar32 != null ? scVar32.h : null;
                    sc scVar33 = sdVar24.S[i3];
                    if (sdVar25 != null) {
                        scVar30 = sdVar25.S[i51];
                    }
                    if (ryVar24 == null || ryVar25 == null) {
                        sdVar2 = sdVar24;
                        sdVar3 = sdVar25;
                    } else {
                        sdVar3 = sdVar25;
                        sdVar2 = sdVar24;
                        rvVar3.d(scVar33.h, ryVar24, scVar33.b(), i == 0 ? sdVar26.af : sdVar26.ag, ryVar25, scVar30.h, scVar30.b(), 7);
                    }
                }
                rvVar2 = rvVar;
                sdVar6 = sdVar2;
                if (!z2) {
                }
                int i502 = i3 + 1;
                sc[] scVarArr112 = sdVar6.S;
                sc scVar242 = scVarArr112[i3];
                if (sdVar3 == null) {
                }
                sc[] scVarArr122 = sdVar3.S;
                sc scVar252 = scVarArr122[i502];
                sc scVar262 = scVar242.e;
                if (scVar262 == null) {
                }
                sc scVar272 = scVar252.e;
                if (scVar272 == null) {
                }
                if (sdVar23 != sdVar3) {
                }
                ryVar8 = ryVar23;
                if (sdVar6 == sdVar3) {
                }
                if (ryVar7 == null) {
                }
            } else {
                i5 = i21;
                sbVarArr2 = sbVarArr4;
            }
            i22 = i4 + 1;
            seVar2 = seVar;
            rvVar3 = rvVar;
            arrayList3 = arrayList;
            i21 = i5;
            sbVarArr4 = sbVarArr2;
            i20 = 2;
        }
    }

    public static Object j(hvi hviVar, kqj kqjVar) {
        try {
            if (hviVar.isDone()) {
                int i = rl.c;
                return a.n(hviVar);
            }
            kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
            kuwVar.y();
            hviVar.c(new auf(hviVar, (kuv) kuwVar, 1), rr.a);
            kuwVar.b(new kzc(hviVar, 1));
            return kuwVar.l();
        } catch (ExecutionException e) {
            throw k(e);
        }
    }

    public static Throwable k(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static hvi l(ro roVar) {
        rm rmVar = new rm();
        rq rqVar = new rq(rmVar);
        rmVar.b = rqVar;
        rmVar.a = roVar.getClass();
        try {
            rmVar.a = roVar.a(rmVar);
            return rqVar;
        } catch (Exception e) {
            rqVar.a(e);
            return rqVar;
        }
    }

    public static /* synthetic */ int m(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int n(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int o(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static long p(byte[] bArr) {
        long j;
        long j2;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j3 = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long b = b(bArr2, 0) * (-5435081209227447693L);
                long b2 = b(bArr2, 8);
                long j4 = (length + length) - 7286425919675154353L;
                long b3 = b(bArr2, length - 8) * j4;
                long b4 = b(bArr2, length - 16) * (-7286425919675154353L);
                long rotateRight = Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30);
                long rotateRight2 = b + Long.rotateRight(b2 - 7286425919675154353L, 18) + b3;
                long j5 = ((rotateRight + b4) ^ rotateRight2) * j4;
                long j6 = ((j5 ^ (j5 >>> 47)) ^ rotateRight2) * j4;
                return (j6 ^ (j6 >>> 47)) * j4;
            }
            if (length >= 8) {
                j = (length + length) - 7286425919675154353L;
                long b5 = b(bArr2, 0) - 7286425919675154353L;
                long b6 = b(bArr2, length - 8);
                long rotateRight3 = Long.rotateRight(b6, 37) * j;
                long rotateRight4 = (Long.rotateRight(b5, 25) + b6) * j;
                long j7 = ((rotateRight3 + b5) ^ rotateRight4) * j;
                j2 = (j7 ^ (j7 >>> 47)) ^ rotateRight4;
            } else {
                if (length < 4) {
                    if (length <= 0) {
                        return -7286425919675154353L;
                    }
                    long j8 = (((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L));
                    return (j8 ^ (j8 >>> 47)) * (-7286425919675154353L);
                }
                j = (length + length) - 7286425919675154353L;
                long a = a(bArr2, 0);
                long a2 = a(bArr2, length - 4);
                long j9 = length + ((a & 4294967295L) << 3);
                long j10 = 4294967295L & a2;
                long j11 = (j9 ^ j10) * j;
                j2 = j10 ^ (j11 ^ (j11 >>> 47));
            }
            long j12 = j2 * j;
            return (j12 ^ (j12 >>> 47)) * j;
        }
        char c = '@';
        if (length <= 64) {
            long b7 = b(bArr2, 0) * (-7286425919675154353L);
            long b8 = b(bArr2, 8);
            long j13 = (length + length) - 7286425919675154353L;
            long b9 = b(bArr2, length - 8) * j13;
            long b10 = b(bArr2, length - 16) * (-7286425919675154353L);
            long rotateRight5 = Long.rotateRight(b7 + b8, 43) + Long.rotateRight(b9, 30);
            long rotateRight6 = Long.rotateRight(b8 - 7286425919675154353L, 18) + b7;
            long b11 = b(bArr2, 16) * j13;
            long b12 = b(bArr2, 24);
            long j14 = rotateRight5 + b10;
            long b13 = j14 + b(bArr2, length - 32);
            long j15 = rotateRight6 + b9;
            long j16 = (j14 ^ j15) * j13;
            long j17 = ((j16 ^ (j16 >>> 47)) ^ j15) * j13;
            long b14 = ((j17 ^ (j17 >>> 47)) * j13) + b(bArr2, length - 24);
            long j18 = b13 * j13;
            long rotateRight7 = Long.rotateRight(b11 + b12, 43) + Long.rotateRight(j18, 30);
            long rotateRight8 = b11 + Long.rotateRight(b12 + b7, 18) + j18;
            long j19 = ((rotateRight7 + (b14 * j13)) ^ rotateRight8) * j13;
            long j20 = (rotateRight8 ^ (j19 ^ (j19 >>> 47))) * j13;
            return (j20 ^ (j20 >>> 47)) * j13;
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long b15 = b(bArr2, 0) + 95310865018149119L;
        long j21 = 1390051526045402406L;
        long j22 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long rotateRight9 = Long.rotateRight(b15 + j22 + jArr[z2 ? 1 : 0] + b(bArr2, i + 8), 37) * j3;
            long rotateRight10 = Long.rotateRight(j22 + jArr[1] + b(bArr2, i + 48), 42) * j3;
            long j23 = rotateRight9 ^ jArr2[1];
            long j24 = j3;
            long b16 = b(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long rotateRight11 = Long.rotateRight(j21 + jArr2[z2 ? 1 : 0], 33) * j24;
            int i4 = i;
            v(bArr2, i4, jArr[1] * j24, j23 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j22 = rotateRight10 + b16;
            v(bArr2, i4 + 32, rotateRight11 + jArr2[1], b(bArr2, i4 + 16) + j22, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j25 = j23 & 255;
                long j26 = j25 + j25 + j24;
                long j27 = jArr2[z2 ? 1 : 0] + i5;
                long j28 = jArr3[z2 ? 1 : 0] + j27;
                jArr3[z2 ? 1 : 0] = j28;
                jArr2[z2 ? 1 : 0] = j27 + j28;
                long rotateRight12 = Long.rotateRight(rotateRight11 + j22 + j28 + b(bArr2, i6 - 55), 37) * j26;
                long rotateRight13 = Long.rotateRight(j22 + jArr3[1] + b(bArr2, i6 - 15), 42) * j26;
                long j29 = jArr2[1] * 9;
                long b17 = (jArr3[z2 ? 1 : 0] * 9) + b(bArr2, i6 - 23);
                long rotateRight14 = Long.rotateRight(j23 + jArr2[z2 ? 1 : 0], 33) * j26;
                long j30 = rotateRight12 ^ j29;
                v(bArr2, i6 - 63, jArr3[1] * j26, j30 + jArr2[z2 ? 1 : 0], jArr3);
                long j31 = rotateRight13 + b17;
                v(bArr2, i6 - 31, jArr2[1] + rotateRight14, b(bArr2, i6 - 47) + j31, jArr2);
                long j32 = jArr3[z2 ? 1 : 0];
                long j33 = jArr2[z2 ? 1 : 0];
                long j34 = (j32 ^ j33) * j26;
                long j35 = jArr3[1];
                long j36 = jArr2[1];
                long j37 = (j35 ^ j36) * j26;
                long j38 = ((j37 ^ (j37 >>> 47)) ^ j36) * j26;
                long j39 = ((j34 ^ (j34 >>> 47)) ^ j33) * j26;
                long j40 = ((j38 ^ (j38 >>> 47)) * j26) + rotateRight14;
                long j41 = (((((j39 ^ (j39 >>> 47)) * j26) + (((j31 >>> 47) ^ j31) * (-4348849565147123417L))) + j30) ^ j40) * j26;
                long j42 = ((j41 ^ (j41 >>> 47)) ^ j40) * j26;
                return (j42 ^ (j42 >>> 47)) * j26;
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            j21 = j23;
            j3 = j24;
            b15 = rotateRight11;
            jArr = jArr3;
        }
    }

    public static Intent q(PendingIntent pendingIntent) {
        oy.au(pendingIntent, "The target cannot be null!");
        return new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(String.valueOf(String.valueOf(UUID.randomUUID()))))).putExtra("target", pendingIntent);
    }

    public static void r(String str, String str2, Throwable th) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, th);
        }
    }

    public static void s(String str, Object obj) {
        if (Log.isLoggable("TRuntime.CctTransportBackend", 5)) {
            Log.w("TRuntime.CctTransportBackend", String.format(str, obj));
        }
    }

    public static cfh t(String str, List list) {
        return new cfh(str, DesugarCollections.unmodifiableList(list));
    }

    public static String u(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    private static void v(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = j + b(bArr, i);
        long b2 = b(bArr, i + 8);
        long b3 = b(bArr, i + 16);
        long b4 = b(bArr, i + 24);
        long j3 = b2 + b + b3;
        long rotateRight = Long.rotateRight(j2 + b + b4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + b4;
        jArr[1] = rotateRight + b;
    }

    public ow(byte[] bArr) {
    }
}
