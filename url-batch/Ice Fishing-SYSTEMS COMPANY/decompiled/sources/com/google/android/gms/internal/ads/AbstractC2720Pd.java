package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.anythink.core.common.d.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Pd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2720Pd {

    /* renamed from: D, reason: collision with root package name */
    public static final C2945am f26979D;

    /* renamed from: z, reason: collision with root package name */
    public static final C3940t8 f26989z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26990n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f26984u = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f26985v = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f26986w = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: x, reason: collision with root package name */
    public static final C3398j5 f26987x = new C3398j5("gads:pan:experiment_id", "", 4);

    /* renamed from: y, reason: collision with root package name */
    public static final C3940t8 f26988y = new C3940t8(13);

    /* renamed from: A, reason: collision with root package name */
    public static final C2945am f26976A = new C2945am(7);

    /* renamed from: B, reason: collision with root package name */
    public static final C2945am f26977B = new C2945am(14);

    /* renamed from: C, reason: collision with root package name */
    public static final C2945am f26978C = new C2945am(20);

    /* renamed from: E, reason: collision with root package name */
    public static final C3225ft f26980E = new C3225ft(6);

    /* renamed from: F, reason: collision with root package name */
    public static final C3225ft f26981F = new C3225ft(12);

    /* renamed from: G, reason: collision with root package name */
    public static final C3225ft f26982G = new C3225ft(17);

    /* renamed from: H, reason: collision with root package name */
    public static final String[] f26983H = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        int i = 27;
        f26989z = new C3940t8(i);
        f26979D = new C2945am(i);
    }

    public /* synthetic */ AbstractC2720Pd(int i) {
        this.f26990n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r12 = Q(r6);
        r13 = Q(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r12 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r13 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] A(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer Y = Y(byteBuffer);
        ByteBuffer Y8 = Y(byteBuffer);
        byte[] Z8 = Z(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i4 = 0;
        while (Y8.hasRemaining()) {
            i4++;
            try {
                ByteBuffer Y9 = Y(Y8);
                if (Y9.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i9 = Y9.getInt();
                arrayList.add(Integer.valueOf(i9));
                if (i9 != 513 && i9 != 514 && i9 != 769) {
                    switch (i9) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = Z(Y9);
                i = i9;
            } catch (IOException e6) {
                e = e6;
                throw new SecurityException(D.y.j(i4, "Failed to parse signature record #", new StringBuilder(String.valueOf(i4).length() + 34)), e);
            } catch (BufferUnderflowException e9) {
                e = e9;
                throw new SecurityException(D.y.j(i4, "Failed to parse signature record #", new StringBuilder(String.valueOf(i4).length() + 34)), e);
            }
        }
        if (i == -1) {
            if (i4 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Z8));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(Y);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            Y.clear();
            ByteBuffer Y10 = Y(Y);
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (Y10.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer Y11 = Y(Y10);
                    if (Y11.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i11 = Y11.getInt();
                    arrayList2.add(Integer.valueOf(i11));
                    if (i11 == i) {
                        bArr = Z(Y11);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(D.y.j(i10, "Failed to parse digest record #", new StringBuilder(String.valueOf(i10).length() + 31)), e);
                } catch (BufferUnderflowException e11) {
                    e = e11;
                    throw new IOException(D.y.j(i10, "Failed to parse digest record #", new StringBuilder(String.valueOf(i10).length() + 31)), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int Q3 = Q(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(Q3), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(R(Q3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer Y12 = Y(Y);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (Y12.hasRemaining()) {
                i12++;
                byte[] Z9 = Z(Y12);
                try {
                    arrayList3.add(new R4((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(Z9)), Z9));
                } catch (CertificateException e12) {
                    throw new SecurityException(D.y.j(i12, "Failed to decode certificate #", new StringBuilder(String.valueOf(i12).length() + 30)), e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(Z8, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new SecurityException(D.y.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e14) {
            e = e14;
            throw new SecurityException(D.y.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new SecurityException(D.y.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e16) {
            e = e16;
            throw new SecurityException(D.y.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e17) {
            e = e17;
            throw new SecurityException(D.y.o(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static int B(Er er) {
        int h9 = er.h(4);
        if (h9 == 15) {
            if (er.b() >= 24) {
                return er.h(24);
            }
            throw W4.a(null, "AAC header insufficient data");
        }
        if (h9 < 13) {
            return f26984u[h9];
        }
        throw W4.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static C3675oC C(byte[] bArr, int i, int i4) {
        if (i4 >= bArr.length) {
            return UB.j("");
        }
        SB sb = UB.f27942u;
        p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int U7 = U(bArr, i4, i);
        int i9 = 0;
        while (i4 < U7) {
            String str = new String(bArr, i4, U7 - i4, O(i));
            int length = objArr.length;
            int i10 = i9 + 1;
            int d2 = PB.d(length, i10);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = str;
            i4 = X(i) + U7;
            U7 = U(bArr, i4, i);
            i9 = i10;
        }
        C3675oC p6 = UB.p(objArr, i9);
        return p6.isEmpty() ? UB.j("") : p6;
    }

    public static void D(Bundle bundle, String str, boolean z8, boolean z9) {
        if (z9) {
            bundle.putBoolean(str, z8);
        }
    }

    public static void E(File file, boolean z8) {
        if (z8 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void F(List list, InterfaceC2916aB interfaceC2916aB, int i, int i4) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i4) {
                break;
            } else if (interfaceC2916aB.b(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i4--;
            if (i4 < i) {
                return;
            } else {
                list.remove(i4);
            }
        }
    }

    public static int G(int i, Lr lr) {
        byte[] bArr = lr.f26233a;
        int i4 = lr.f26234b;
        int i9 = i4;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= i4 + i) {
                return i;
            }
            if ((bArr[i9] & 255) == 255 && bArr[i10] == 0) {
                System.arraycopy(bArr, i9 + 2, bArr, i10, (i - (i9 - i4)) - 2);
                i--;
            }
            i9 = i10;
        }
    }

    public static TextView H(Context context, String str, int i, int i4, float f6, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        P(-2, -2, textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f6, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i4);
        textView.setText(str);
        return textView;
    }

    public static void I(Er er) {
        er.f(3);
        er.f(8);
        boolean g9 = er.g();
        boolean g10 = er.g();
        if (g9) {
            er.f(5);
        }
        if (g10) {
            er.f(6);
        }
    }

    public static void J(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static boolean K(File file) {
        boolean z8;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z8 = true;
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                z8 = file2 != null && K(file2) && z8;
            }
        } else {
            z8 = true;
        }
        return file.delete() && z8;
    }

    public static byte[][] L(int[] iArr, O4[] o4Arr) {
        long j9;
        int i;
        int length;
        char c4;
        int i4 = 0;
        long j10 = 0;
        while (true) {
            j9 = 1048576;
            if (i4 >= 3) {
                break;
            }
            j10 += (o4Arr[i4].a() + 1048575) / 1048576;
            i4++;
        }
        if (j10 >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j10);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i9 = 0;
        while (true) {
            length = iArr.length;
            c4 = 5;
            if (i9 >= length) {
                break;
            }
            int i10 = (int) j10;
            byte[] bArr2 = new byte[(T(iArr[i9]) * i10) + 5];
            bArr2[0] = 90;
            b0(i10, bArr2);
            bArr[i9] = bArr2;
            i9++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            String R8 = R(iArr[i11]);
            try {
                messageDigestArr[i11] = MessageDigest.getInstance(R8);
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(R8.concat(" digest not supported"), e6);
            }
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (i = 3; i12 < i; i = 3) {
            O4 o42 = o4Arr[i12];
            int i15 = i12;
            long a9 = o42.a();
            long j11 = 0;
            while (a9 > 0) {
                char c9 = c4;
                int i16 = i13;
                int min = (int) Math.min(a9, j9);
                b0(min, bArr3);
                for (int i17 = 0; i17 < length; i17++) {
                    messageDigestArr[i17].update(bArr3);
                }
                try {
                    o42.d(messageDigestArr, j11, min);
                    int i18 = 0;
                    while (i18 < iArr.length) {
                        int i19 = iArr[i18];
                        byte[] bArr4 = bArr[i18];
                        int T8 = T(i19);
                        O4 o43 = o42;
                        MessageDigest messageDigest = messageDigestArr[i18];
                        long j12 = a9;
                        int digest = messageDigest.digest(bArr4, (i16 * T8) + 5, T8);
                        if (digest != T8) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i18++;
                        o42 = o43;
                        a9 = j12;
                    }
                    O4 o44 = o42;
                    long j13 = min;
                    j11 += j13;
                    a9 -= j13;
                    i13 = i16 + 1;
                    c4 = c9;
                    o42 = o44;
                    j9 = 1048576;
                } catch (IOException e9) {
                    throw new DigestException(D.y.n(new StringBuilder(String.valueOf(i16).length() + 37 + String.valueOf(i14).length()), "Failed to digest chunk #", i16, " of section #", i14), e9);
                }
            }
            i14++;
            i12 = i15 + 1;
            j9 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            byte[] bArr6 = bArr[i20];
            String R9 = R(i21);
            try {
                bArr5[i20] = MessageDigest.getInstance(R9).digest(bArr6);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(R9.concat(" digest not supported"), e10);
            }
        }
        return bArr5;
    }

    public static int M(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return j.v.f12757w;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static int N(Er er, int i, int i4, int i9) {
        PA.n(Math.max(Math.max(i, i4), i9) <= 31);
        int i10 = (1 << i) - 1;
        int i11 = (1 << i4) - 1;
        Math.addExact(Math.addExact(i10, i11), 1 << i9);
        if (er.b() >= i) {
            int h9 = er.h(i);
            if (h9 == i10) {
                if (er.b() >= i4) {
                    int h10 = er.h(i4);
                    h9 += h10;
                    if (h10 == i11) {
                        if (er.b() >= i9) {
                            return er.h(i9) + h9;
                        }
                    }
                }
            }
            return h9;
        }
        return -1;
    }

    public static Charset O(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static void P(int i, int i4, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i4;
        view.setLayoutParams(layoutParams2);
    }

    public static int Q(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static String R(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(D.y.j(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
    }

    public static String S(int i, int i4, int i9, int i10, int i11) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int T(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(D.y.j(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
    }

    public static int U(byte[] bArr, int i, int i4) {
        int V8 = V(i, bArr);
        if (i4 == 0 || i4 == 3) {
            return V8;
        }
        while (true) {
            int length = bArr.length;
            if (V8 >= length - 1) {
                return length;
            }
            int i9 = V8 + 1;
            if ((V8 - i) % 2 == 0 && bArr[i9] == 0) {
                return V8;
            }
            V8 = V(i9, bArr);
        }
    }

    public static int V(int i, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static ByteBuffer W(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i4 = i + position;
        if (i4 < position || i4 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i4);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i4);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static int X(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static ByteBuffer Y(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException(D.y.j(remaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(remaining).length() + 82)));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return W(i, byteBuffer);
        }
        int remaining2 = byteBuffer.remaining();
        throw new IOException(D.y.n(new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(remaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", remaining2));
    }

    public static byte[] Z(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        throw new IOException(D.y.n(new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(remaining).length()), "Underflow while reading length-prefixed value. Length: ", i, ", available: ", remaining));
    }

    public static long a(double d2) {
        PA.u("not a normal value", r(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    public static String a0(byte[] bArr, int i, int i4, Charset charset) {
        return (i4 <= i || i4 > bArr.length) ? "" : new String(bArr, i, i4 - i, charset);
    }

    public static Bundle b(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void b0(int i, byte[] bArr) {
        bArr[1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[2] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[3] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[4] = (byte) (i >> 24);
    }

    public static File c(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(x(str, file), str2);
    }

    public static Object d(InterfaceC3404jB interfaceC3404jB) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC3404jB.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static Provider e() {
        String[] strArr = f26983H;
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static void g(J3.a aVar, String str, Executor executor) {
        aVar.c(new MD(0, aVar, new LE(str, 4)), executor);
    }

    public static void h(InterfaceC3612n3 interfaceC3612n3, X1.b bVar) {
        for (int i = 0; i < interfaceC3612n3.a(); i++) {
            long t9 = interfaceC3612n3.t(i);
            ArrayList c4 = interfaceC3612n3.c(t9);
            if (!c4.isEmpty()) {
                if (i == interfaceC3612n3.a() - 1) {
                    throw new IllegalStateException();
                }
                long t10 = interfaceC3612n3.t(i + 1) - interfaceC3612n3.t(i);
                if (t10 > 0) {
                    bVar.mo2b(new C3558m3(c4, t9, t10));
                }
            }
        }
    }

    public static void i(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        throw new NullPointerException(D.y.o(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
    }

    public static void j(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void k(String str, boolean z8) {
        if (!z8) {
            throw W4.a(null, str);
        }
    }

    public static X509Certificate[][] l(String str) {
        RandomAccessFile randomAccessFile;
        Pair v6;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, com.anythink.expressad.foundation.d.d.bv);
        try {
            if (randomAccessFile2.length() < 22) {
                v6 = null;
            } else {
                v6 = AbstractC2655Lg.v(randomAccessFile2, 0);
                if (v6 == null) {
                    v6 = AbstractC2655Lg.v(randomAccessFile2, 65535);
                }
            }
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (v6 == null) {
                long length = randomAccessFile2.length();
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new Q4(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) v6.first;
            long longValue = ((Long) v6.second).longValue();
            long j9 = (-20) + longValue;
            if (j9 >= 0) {
                randomAccessFile2.seek(j9);
                if (randomAccessFile2.readInt() == 1347094023) {
                    throw new Q4("ZIP64 APK not supported");
                }
            }
            AbstractC2655Lg.z(byteBuffer);
            long j10 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j10 >= longValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 82 + String.valueOf(longValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j10);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new Q4(sb2.toString());
            }
            AbstractC2655Lg.z(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j10 != longValue) {
                throw new Q4("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j10 < 32) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j10);
                throw new Q4(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile2.seek(j10 - allocate.capacity());
            randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new Q4("No APK Signing Block before ZIP Central Directory");
            }
            long j11 = allocate.getLong(0);
            if (j11 < allocate.capacity() || j11 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(j11).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j11);
                throw new Q4(sb4.toString());
            }
            int i = (int) (8 + j11);
            long j12 = j10 - i;
            if (j12 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j12).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j12);
                throw new Q4(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile2.seek(j12);
            long j13 = j10;
            randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j14 = allocate2.getLong(0);
            if (j14 != j11) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j14).length() + 63 + String.valueOf(j11).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j14);
                sb6.append(" vs ");
                sb6.append(j11);
                throw new Q4(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            randomAccessFile = randomAccessFile2;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < 8");
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i4 = 0;
                while (slice.hasRemaining()) {
                    i4++;
                    if (slice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(String.valueOf(i4).length() + 59);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i4);
                        throw new Q4(sb9.toString());
                    }
                    long j15 = slice.getLong();
                    if (j15 < 4 || j15 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i4).length() + 45 + String.valueOf(j15).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i4);
                        sb10.append(" size out of range: ");
                        sb10.append(j15);
                        throw new Q4(sb10.toString());
                    }
                    int i9 = (int) j15;
                    int position2 = slice.position() + i9;
                    if (i9 > slice.remaining()) {
                        int remaining = slice.remaining();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(i4).length() + 45 + String.valueOf(i9).length() + 13 + String.valueOf(remaining).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i4);
                        sb11.append(" size out of range: ");
                        sb11.append(i9);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new Q4(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] u7 = u(randomAccessFile.getChannel(), new P4(W(i9 - 4, slice), longValue2, j13, longValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return u7;
                    }
                    long j16 = j13;
                    slice.position(position2);
                    j13 = j16;
                }
                throw new Q4("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4202y0 m(Er er, boolean z8) {
        int i;
        int h9 = er.h(5);
        if (h9 == 31) {
            h9 = er.h(6) + 32;
        }
        int B8 = B(er);
        int h10 = er.h(4);
        String j9 = D.y.j(h9, "mp4a.40.", new StringBuilder(String.valueOf(h9).length() + 8));
        if (h9 == 5 || h9 == 29) {
            B8 = B(er);
            int h11 = er.h(5);
            if (h11 == 31) {
                h11 = er.h(6) + 32;
            }
            h9 = h11;
            if (h9 == 22) {
                h10 = er.h(4);
            }
        }
        if (z8) {
            int i4 = 3;
            if (h9 != 1 && h9 != 2 && h9 != 3 && h9 != 4 && h9 != 6 && h9 != 7 && h9 != 17) {
                switch (h9) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(h9).length() + 31);
                        sb.append("Unsupported audio object type: ");
                        sb.append(h9);
                        throw W4.c(sb.toString());
                }
            }
            if (er.g()) {
                AbstractC3217fl.I("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (er.g()) {
                er.f(14);
            }
            boolean g9 = er.g();
            if (h10 == 0) {
                throw new UnsupportedOperationException();
            }
            if (h9 != 6) {
                if (h9 == 20) {
                    h9 = 20;
                }
                if (g9) {
                    if (h9 == 22) {
                        er.f(16);
                        i = 22;
                    } else {
                        i = h9;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        er.f(3);
                    }
                    er.f(1);
                }
                switch (h9) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int h12 = er.h(2);
                        if (h12 == 2) {
                            i4 = h12;
                        }
                        StringBuilder sb2 = new StringBuilder(CL.b(i4, 22));
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(i4);
                        throw W4.c(sb2.toString());
                }
            }
            er.f(3);
            if (g9) {
            }
            switch (h9) {
            }
        }
        int i9 = f26985v[h10];
        if (i9 != -1) {
            return new C4202y0(B8, i9, j9);
        }
        throw W4.a(null, null);
    }

    public static Object n(C4106wC c4106wC, String str) {
        C3081dC c3081dC = new C3081dC(c4106wC, c4106wC.f34960n, c4106wC.f34961u);
        return c3081dC.hasNext() ? c3081dC.next() : str;
    }

    public static HashMap o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("Pd", "decode object failure");
            return null;
        }
    }

    public static void p(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void q(Bundle bundle, String str, String str2, boolean z8) {
        if (!z8 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static boolean r(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean s(Lr lr, int i, int i4, boolean z8) {
        boolean z9;
        int O8;
        long O9;
        int i9;
        int i10;
        int i11 = lr.f26234b;
        while (true) {
            try {
                z9 = true;
                z9 = true;
                int i12 = 1;
                int i13 = 1;
                if (lr.B() < i4) {
                    break;
                }
                if (i >= 3) {
                    O8 = lr.b();
                    O9 = lr.P();
                    i9 = lr.L();
                } else {
                    O8 = lr.O();
                    O9 = lr.O();
                    i9 = 0;
                }
                if (O8 != 0 || O9 != 0 || i9 != 0) {
                    if (i == 4 && !z8) {
                        if ((8421504 & O9) != 0) {
                            break;
                        }
                        O9 = ((O9 >> 24) << 21) | (((O9 >> 16) & 255) << 14) | (O9 & 255) | (((O9 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i9 & 64) == 0) {
                            i12 = 0;
                        }
                        int i14 = i12;
                        i13 = i9 & 1;
                        i10 = i14;
                    } else if (i == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                        if ((i9 & 128) == 0) {
                            i13 = 0;
                        }
                    } else {
                        i10 = 0;
                        i13 = 0;
                    }
                    if (i13 != 0) {
                        i10 += 4;
                    }
                    if (O9 >= i10 && lr.B() >= O9) {
                        lr.G((int) O9);
                    }
                }
            } finally {
                lr.E(i11);
            }
        }
        return z9;
    }

    public static boolean t(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                S2.b.c(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                S2.b.c(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                S2.b.c(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static X509Certificate[][] u(FileChannel fileChannel, P4 p42) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer Y = Y((ByteBuffer) p42.f26837d);
                int i = 0;
                while (Y.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(A(Y(Y), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e6) {
                        throw new SecurityException(AbstractC5051n.d(i, "Failed to parse/verify signer #", " block", new StringBuilder(String.valueOf(i).length() + 37)), e6);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                long j9 = p42.f26834a;
                N1.l lVar = new N1.l(fileChannel, 0L, j9);
                long j10 = p42.f26836c;
                long j11 = p42.f26835b;
                N1.l lVar2 = new N1.l(fileChannel, j11, j10 - j11);
                ByteBuffer duplicate = ((ByteBuffer) p42.f26838e).duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                AbstractC2655Lg.z(duplicate);
                int position = duplicate.position() + 16;
                if (j9 < 0 || j9 > 4294967295L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 27);
                    sb.append("uint32 value of out range: ");
                    sb.append(j9);
                    throw new IllegalArgumentException(sb.toString());
                }
                duplicate.putInt(duplicate.position() + position, (int) j9);
                Rx rx = new Rx(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    iArr[i4] = ((Integer) it.next()).intValue();
                    i4++;
                }
                try {
                    byte[][] L8 = L(iArr, new O4[]{lVar, lVar2, rx});
                    for (int i9 = 0; i9 < size; i9++) {
                        int i10 = iArr[i9];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i10)), L8[i9])) {
                            throw new SecurityException(R(i10).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e9) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e9);
                }
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00cd, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0088, code lost:
    
        return new com.google.android.gms.internal.ads.C2(r13, r3, r15);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3234g1 v(P0 p02, boolean z8) {
        InterfaceC3234g1 interfaceC3234g1;
        long j9;
        Lr lr;
        int i;
        int i4;
        Lr lr2;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        long q6 = p02.q();
        long j10 = -1;
        long j11 = 4096;
        if (q6 != -1 && q6 <= 4096) {
            j11 = q6;
        }
        Lr lr3 = new Lr(64);
        int i12 = (int) j11;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i12) {
                interfaceC3234g1 = null;
                break;
            }
            lr3.y(8);
            if (!p02.I(lr3.f26233a, i13, 8, true)) {
                interfaceC3234g1 = null;
                break;
            }
            long P8 = lr3.P();
            int b9 = lr3.b();
            if (P8 == 1) {
                p02.B(lr3.f26233a, 8, 8);
                i = 16;
                lr3.C(16);
                j9 = lr3.d();
                lr = lr3;
            } else {
                if (P8 == 0) {
                    long q9 = p02.q();
                    if (q9 != j10) {
                        P8 = (q9 - p02.m()) + 8;
                    }
                }
                j9 = P8;
                lr = lr3;
                i = 8;
            }
            long j12 = i;
            if (j9 < j12) {
                interfaceC3234g1 = null;
                if (b9 != 1718773093) {
                    break;
                }
                if (i != 8) {
                    b9 = 1718773093;
                    break;
                }
                b9 = 1718773093;
                j9 = 8;
            } else {
                interfaceC3234g1 = null;
            }
            i14 += i;
            if (b9 != 1836019574) {
                if (b9 == 1970628964) {
                    b9 = 1970628964;
                } else {
                    i4 = 1;
                    if (b9 != 1953653099 || b9 == 1835297121 || b9 == 1835626086) {
                        lr2 = lr;
                    } else {
                        if (b9 == 1836019558 || b9 == 1836475768) {
                            break;
                        }
                        i15 |= (b9 == 1835295092 ? 0 : i4) ^ 1;
                        if (b9 == 1937007212) {
                            if (j9 > 1000000) {
                                break;
                            }
                            b9 = 1937007212;
                        }
                        int i16 = b9;
                        if ((i14 + j9) - j12 >= i12) {
                            break;
                        }
                        int i17 = (int) (j9 - j12);
                        i14 += i17;
                        if (i16 != 1718909296) {
                            lr2 = lr;
                            if (i17 != 0) {
                                p02.u(i17);
                            }
                        } else {
                            if (i17 < 8) {
                                return new C2(1718909296, i17, 8);
                            }
                            lr2 = lr;
                            lr2.y(i17);
                            p02.B(lr2.f26233a, 0, i17);
                            int b10 = lr2.b();
                            int i18 = b10 >>> 8;
                            int[] iArr2 = f26986w;
                            int i19 = 3368816;
                            if (i18 != 3368816) {
                                for (int i20 = 0; i20 < 29; i20++) {
                                    if (iArr2[i20] != b10) {
                                    }
                                }
                                i9 = 0;
                                i10 = i9 | i15;
                                lr2.G(4);
                                int B8 = lr2.B() / 4;
                                if (i10 == 0 || B8 <= 0) {
                                    i11 = i10;
                                    iArr = interfaceC3234g1;
                                } else {
                                    int[] iArr3 = new int[B8];
                                    int i21 = 0;
                                    while (i21 < B8) {
                                        int b11 = lr2.b();
                                        iArr3[i21] = b11;
                                        if ((b11 >>> 8) != i19) {
                                            for (int i22 = 0; i22 < 29; i22++) {
                                                if (iArr2[i22] != b11) {
                                                }
                                            }
                                            i21++;
                                            i19 = 3368816;
                                        }
                                        iArr = iArr3;
                                        i11 = i4;
                                        break;
                                    }
                                    i11 = i10;
                                    iArr = iArr3;
                                }
                                if (i11 != 0) {
                                    return new G1.a(b10, 6, iArr);
                                }
                                i15 = i11;
                            }
                            i9 = i4;
                            i10 = i9 | i15;
                            lr2.G(4);
                            int B82 = lr2.B() / 4;
                            if (i10 == 0) {
                            }
                            i11 = i10;
                            iArr = interfaceC3234g1;
                            if (i11 != 0) {
                            }
                        }
                    }
                    lr3 = lr2;
                    j10 = -1;
                    i13 = 0;
                }
            }
            i12 += (int) j9;
            i4 = 1;
            if (q6 != -1 && i12 > q6) {
                i12 = (int) q6;
            }
            if (b9 == 1836019574) {
                lr3 = lr;
                j10 = -1;
                i13 = 0;
            }
            if (b9 != 1953653099) {
            }
            lr2 = lr;
            lr3 = lr2;
            j10 = -1;
            i13 = 0;
        }
        i13 = 0;
        return i15 == 0 ? T2.f27687u : z8 != i13 ? i13 != 0 ? O2.f26637v : O2.f26638w : interfaceC3234g1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:79|(2:81|(1:91)(3:86|(1:88)(1:90)|89))|92|(1:93)|(2:95|(7:117|118|119|(4:(6:125|126|(5:128|129|130|(1:132)|133)(2:139|(1:141)(1:142))|134|(1:136)(1:138)|137)|143|144|(2:(1:(1:(1:227)(4:222|(1:224)|225|226))(12:191|(1:193)(1:215)|194|(1:196)|197|198|(4:201|(3:203|204|205)(1:207)|206|199)|208|209|(1:211)(1:214)|212|213))(2:161|(2:163|154)(8:164|(1:166)(1:184)|167|(1:169)(1:183)|170|(4:173|(3:175|176|177)(1:179)|178|171)|180|181))|182)(3:152|(1:155)|154))(9:228|(1:(1:(0)))|143|144|(1:146)|(1:157)|(1:186)|(1:217)|227)|55|(1:57)|58)(2:98|(9:102|103|104|105|(1:107)(1:109)|108|55|(0)|58)(1:101)))|237|118|119|(0)(0)|55|(0)|58) */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0283, code lost:
    
        if (r8 == 67) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Y1 w(int i, Lr lr, boolean z8, T2 t22) {
        int h9;
        int i4;
        int i9;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        String str;
        Y1 y12;
        int i11;
        Y1 t12;
        Y1 c2962b2;
        int V8;
        String concat;
        int K8 = lr.K();
        int K9 = lr.K();
        int K10 = lr.K();
        int K11 = i >= 3 ? lr.K() : 0;
        if (i == 4) {
            h9 = lr.h();
            if (!z8) {
                h9 = ((h9 >> 24) << 21) | (h9 & com.anythink.basead.exoplayer.k.p.f8630b) | (((h9 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b) << 7) | (((h9 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b) << 14);
            }
        } else {
            h9 = i == 3 ? lr.h() : lr.O();
        }
        int L8 = i >= 3 ? lr.L() : 0;
        if (K8 == 0 && K9 == 0 && K10 == 0 && K11 == 0 && h9 == 0 && L8 == 0) {
            lr.E(lr.f26235c);
            return null;
        }
        int D8 = lr.D() + h9;
        if (D8 > lr.f26235c) {
            AbstractC3217fl.I("Id3Decoder", "Frame size exceeds remaining tag data");
            lr.E(lr.f26235c);
            return null;
        }
        if (t22 != null) {
            lr.E(D8);
            return null;
        }
        if (i == 3) {
            int i12 = L8 & 64;
            i4 = (L8 & 128) != 0 ? 1 : 0;
            z11 = false;
            z10 = i12 != 0;
            z9 = (L8 & 32) != 0;
            i9 = i4;
        } else if (i == 4) {
            boolean z12 = (L8 & 64) != 0;
            int i13 = (L8 & 8) != 0 ? 1 : 0;
            z10 = (L8 & 4) != 0;
            z11 = (L8 & 2) != 0;
            i9 = L8 & 1;
            int i14 = i13;
            z9 = z12;
            i4 = i14;
        } else {
            i4 = 0;
            i9 = 0;
            z9 = false;
            z10 = false;
            z11 = false;
        }
        if (i4 != 0 || z10) {
            AbstractC3217fl.I("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            lr.E(D8);
            return null;
        }
        if (z9) {
            lr.G(1);
            h9--;
        }
        if (i9 != 0) {
            lr.G(4);
            h9 -= 4;
        }
        if (z11) {
            h9 = G(h9, lr);
        }
        try {
            try {
            } catch (Throwable th) {
                lr.E(D8);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            i10 = K8;
            str = "Id3Decoder";
            lr.E(D8);
            y12 = null;
            if (y12 == null) {
            }
            return y12;
        } catch (OutOfMemoryError e9) {
            e = e9;
            i10 = K8;
            str = "Id3Decoder";
            lr.E(D8);
            y12 = null;
            if (y12 == null) {
            }
            return y12;
        }
        if (K8 == 84 && K9 == 88 && K10 == 88 && (i == 2 || K11 == 88)) {
            if (h9 > 0) {
                int K12 = lr.K();
                int i15 = h9 - 1;
                byte[] bArr = new byte[i15];
                lr.H(bArr, 0, i15);
                int U7 = U(bArr, 0, K12);
                t12 = new C3071d2("TXXX", new String(bArr, 0, U7, O(K12)), C(bArr, K12, U7 + X(K12)));
                i10 = K8;
            }
            i10 = K8;
            t12 = null;
        } else {
            if (K8 == 84) {
                String S8 = S(i, 84, K9, K10, K11);
                if (h9 > 0) {
                    int K13 = lr.K();
                    int i16 = h9 - 1;
                    byte[] bArr2 = new byte[i16];
                    lr.H(bArr2, 0, i16);
                    i10 = K8;
                    t12 = new C3071d2(S8, null, C(bArr2, K13, 0));
                }
            } else {
                if (K8 == 87) {
                    if (K9 != 88 || K10 != 88 || (i != 2 && K11 != 88)) {
                        i11 = 87;
                    }
                    int K14 = lr.K();
                    int i17 = h9 - 1;
                    byte[] bArr3 = new byte[i17];
                    lr.H(bArr3, 0, i17);
                    int U8 = U(bArr3, 0, K14);
                    String str2 = new String(bArr3, 0, U8, O(K14));
                    int X8 = U8 + X(K14);
                    t12 = new C3125e2("WXXX", str2, a0(bArr3, X8, V(X8, bArr3), StandardCharsets.ISO_8859_1));
                    i10 = K8;
                } else {
                    i11 = K8;
                }
                if (i11 != 87) {
                    if (i11 == 80) {
                        if (K9 == 82 && K10 == 73 && K11 == 86) {
                            byte[] bArr4 = new byte[h9];
                            lr.H(bArr4, 0, h9);
                            int V9 = V(0, bArr4);
                            String str3 = new String(bArr4, 0, V9, StandardCharsets.ISO_8859_1);
                            int i18 = V9 + 1;
                            t12 = new C3016c2(str3, h9 <= i18 ? AbstractC3548lu.f32614b : Arrays.copyOfRange(bArr4, i18, h9));
                        } else {
                            i11 = 80;
                        }
                    }
                    try {
                    } catch (Exception e10) {
                        e = e10;
                    } catch (OutOfMemoryError e11) {
                        e = e11;
                    }
                    if (i11 == 71) {
                        if (K9 != 69 || K10 != 79) {
                            str = "Id3Decoder";
                            i11 = 71;
                            if (i != 2) {
                                if (i11 == 80 && K9 == 73 && K10 == 67) {
                                    int K15 = lr.K();
                                    Charset O8 = O(K15);
                                    int i19 = h9 - 1;
                                    byte[] bArr5 = new byte[i19];
                                    lr.H(bArr5, 0, i19);
                                    if (i == 2) {
                                        i10 = K8;
                                        concat = "image/".concat(String.valueOf(AbstractC3035cL.f(new String(bArr5, 0, 3, StandardCharsets.ISO_8859_1))));
                                        if ("image/jpg".equals(concat)) {
                                            concat = "image/jpeg";
                                        }
                                        V8 = 2;
                                    } else {
                                        i10 = K8;
                                        V8 = V(0, bArr5);
                                        String f6 = AbstractC3035cL.f(new String(bArr5, 0, V8, StandardCharsets.ISO_8859_1));
                                        concat = f6.indexOf(47) == -1 ? "image/".concat(f6) : f6;
                                    }
                                    int i20 = bArr5[V8 + 1] & 255;
                                    int i21 = V8 + 2;
                                    int U9 = U(bArr5, i21, K15);
                                    String str4 = new String(bArr5, i21, U9 - i21, O8);
                                    int X9 = U9 + X(K15);
                                    t12 = new S1(concat, str4, i20, i19 <= X9 ? AbstractC3548lu.f32614b : Arrays.copyOfRange(bArr5, X9, i19));
                                }
                                i10 = K8;
                                if (i11 != 67 && K9 == 79 && K10 == 77 && (K11 == 77 || i == 2)) {
                                    if (h9 >= 4) {
                                        int K16 = lr.K();
                                        Charset O9 = O(K16);
                                        byte[] bArr6 = new byte[3];
                                        lr.H(bArr6, 0, 3);
                                        String str5 = new String(bArr6, 0, 3);
                                        int i22 = h9 - 4;
                                        byte[] bArr7 = new byte[i22];
                                        lr.H(bArr7, 0, i22);
                                        int U10 = U(bArr7, 0, K16);
                                        String str6 = new String(bArr7, 0, U10, O9);
                                        int X10 = U10 + X(K16);
                                        t12 = new W1(str5, str6, a0(bArr7, X10, U(bArr7, X10, K16), O9));
                                    }
                                    t12 = null;
                                } else {
                                    if (i11 != 67 && K9 == 72 && K10 == 65 && K11 == 80) {
                                        int D9 = lr.D();
                                        int V10 = V(D9, lr.F());
                                        String str7 = new String(lr.F(), D9, V10 - D9, StandardCharsets.ISO_8859_1);
                                        lr.E(V10 + 1);
                                        int b9 = lr.b();
                                        int b10 = lr.b();
                                        if (b9 > b10) {
                                            t12 = null;
                                        } else {
                                            long P8 = lr.P();
                                            long j9 = P8 == 4294967295L ? -1L : P8;
                                            long P9 = lr.P();
                                            long j10 = P9 == 4294967295L ? -1L : P9;
                                            ArrayList arrayList = new ArrayList();
                                            int i23 = D9 + h9;
                                            while (lr.D() < i23) {
                                                Y1 w9 = w(i, lr, z8, null);
                                                if (w9 != null) {
                                                    arrayList.add(w9);
                                                }
                                            }
                                            c2962b2 = new U1(str7, b9, b10, j9, j10, (Y1[]) arrayList.toArray(new Y1[0]));
                                        }
                                    } else if (i11 != 67 && K9 == 84 && K10 == 79 && K11 == 67) {
                                        int D10 = lr.D();
                                        int V11 = V(D10, lr.F());
                                        String str8 = new String(lr.F(), D10, V11 - D10, StandardCharsets.ISO_8859_1);
                                        lr.E(V11 + 1);
                                        int K17 = lr.K();
                                        boolean z13 = (K17 & 2) != 0;
                                        int i24 = K17 & 1;
                                        int K18 = lr.K();
                                        String[] strArr = new String[K18];
                                        int i25 = 0;
                                        while (i25 < K18) {
                                            int D11 = lr.D();
                                            int V12 = V(D11, lr.F());
                                            strArr[i25] = new String(lr.F(), D11, V12 - D11, StandardCharsets.ISO_8859_1);
                                            lr.E(V12 + 1);
                                            i25++;
                                            D10 = D10;
                                            K18 = K18;
                                            str8 = str8;
                                        }
                                        int i26 = D10;
                                        String str9 = str8;
                                        ArrayList arrayList2 = new ArrayList();
                                        int i27 = i26 + h9;
                                        while (lr.D() < i27) {
                                            Y1 w10 = w(i, lr, z8, null);
                                            if (w10 != null) {
                                                arrayList2.add(w10);
                                            }
                                        }
                                        c2962b2 = new V1(str9, z13, 1 == i24, strArr, (Y1[]) arrayList2.toArray(new Y1[0]));
                                    } else if (i11 != 77 && K9 == 76 && K10 == 76 && K11 == 84) {
                                        int L9 = lr.L();
                                        int O10 = lr.O();
                                        int O11 = lr.O();
                                        int K19 = lr.K();
                                        int K20 = lr.K();
                                        Er er = new Er();
                                        er.a(lr);
                                        int i28 = ((h9 - 10) * 8) / (K19 + K20);
                                        int[] iArr = new int[i28];
                                        int[] iArr2 = new int[i28];
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            int h10 = er.h(K19);
                                            int h11 = er.h(K20);
                                            iArr[i29] = h10;
                                            iArr2[i29] = h11;
                                        }
                                        c2962b2 = new C2962b2(L9, O10, O11, iArr, iArr2);
                                    } else {
                                        String S9 = S(i, i11, K9, K10, K11);
                                        byte[] bArr8 = new byte[h9];
                                        lr.H(bArr8, 0, h9);
                                        t12 = new T1(S9, bArr8);
                                    }
                                    t12 = c2962b2;
                                }
                            } else {
                                if (i11 == 65) {
                                    if (K9 == 80) {
                                        if (K10 == 73) {
                                        }
                                    }
                                }
                                i10 = K8;
                                if (i11 != 67) {
                                }
                                if (i11 != 67) {
                                }
                                if (i11 != 67) {
                                }
                                if (i11 != 77) {
                                }
                                String S92 = S(i, i11, K9, K10, K11);
                                byte[] bArr82 = new byte[h9];
                                lr.H(bArr82, 0, h9);
                                t12 = new T1(S92, bArr82);
                            }
                            lr.E(D8);
                            y12 = t12;
                            e = null;
                            if (y12 == null) {
                                String S10 = S(i, i10, K9, K10, K11);
                                StringBuilder sb = new StringBuilder(S10.length() + 39 + String.valueOf(h9).length());
                                sb.append("Failed to decode frame: id=");
                                sb.append(S10);
                                sb.append(", frameSize=");
                                sb.append(h9);
                                AbstractC3217fl.O(str, sb.toString(), e);
                            }
                            return y12;
                        }
                        if (K11 == 66 || i == 2) {
                            try {
                                int K21 = lr.K();
                                Charset O12 = O(K21);
                                int i30 = h9 - 1;
                                byte[] bArr9 = new byte[i30];
                                lr.H(bArr9, 0, i30);
                                int V13 = V(0, bArr9);
                                str = "Id3Decoder";
                                String h12 = K4.h(new String(bArr9, 0, V13, StandardCharsets.ISO_8859_1));
                                int i31 = V13 + 1;
                                int U11 = U(bArr9, i31, K21);
                                String a02 = a0(bArr9, i31, U11, O12);
                                int X11 = U11 + X(K21);
                                int U12 = U(bArr9, X11, K21);
                                String a03 = a0(bArr9, X11, U12, O12);
                                int X12 = U12 + X(K21);
                                i10 = K8;
                                t12 = new X1(h12, a02, a03, i30 <= X12 ? AbstractC3548lu.f32614b : Arrays.copyOfRange(bArr9, X12, i30));
                                lr.E(D8);
                                y12 = t12;
                                e = null;
                            } catch (Exception e12) {
                                e = e12;
                                str = "Id3Decoder";
                                i10 = K8;
                                lr.E(D8);
                                y12 = null;
                                if (y12 == null) {
                                }
                                return y12;
                            } catch (OutOfMemoryError e13) {
                                e = e13;
                                str = "Id3Decoder";
                                i10 = K8;
                                lr.E(D8);
                                y12 = null;
                                if (y12 == null) {
                                }
                                return y12;
                            }
                            if (y12 == null) {
                            }
                            return y12;
                        }
                        i11 = 71;
                    }
                    str = "Id3Decoder";
                    if (i != 2) {
                    }
                    lr.E(D8);
                    y12 = t12;
                    e = null;
                    if (y12 == null) {
                    }
                    return y12;
                }
                String S11 = S(i, 87, K9, K10, K11);
                byte[] bArr10 = new byte[h9];
                lr.H(bArr10, 0, h9);
                t12 = new C3125e2(S11, null, new String(bArr10, 0, V(0, bArr10), StandardCharsets.ISO_8859_1));
                i10 = K8;
            }
            i10 = K8;
            t12 = null;
        }
        str = "Id3Decoder";
        lr.E(D8);
        y12 = t12;
        e = null;
        if (y12 == null) {
        }
        return y12;
    }

    public static File x(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        E(file2, false);
        return file2;
    }

    public static void y(Bundle bundle, String str, int i, boolean z8) {
        if (z8) {
            bundle.putInt(str, i);
        }
    }

    public static void z(Er er) {
        int h9;
        int h10 = er.h(2);
        if (h10 == 0) {
            er.f(6);
            return;
        }
        int N8 = N(er, 5, 8, 16) + 1;
        if (h10 == 1) {
            er.f(N8 * 7);
            return;
        }
        if (h10 == 2) {
            boolean g9 = er.g();
            int i = true != g9 ? 5 : 1;
            int i4 = true == g9 ? 7 : 5;
            int i9 = true == g9 ? 8 : 6;
            int i10 = 0;
            while (i10 < N8) {
                if (er.g()) {
                    er.f(7);
                    h9 = 0;
                } else {
                    if (er.h(2) == 3 && er.h(i4) * i != 0) {
                        er.e();
                    }
                    h9 = er.h(i9) * i;
                    if (h9 != 0 && h9 != 180) {
                        er.e();
                    }
                    er.e();
                }
                if (h9 != 0 && h9 != 180 && er.g()) {
                    i10++;
                }
                i10++;
            }
        }
    }

    public abstract HashMap f();

    public String toString() {
        switch (this.f26990n) {
            case 19:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(f());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC2720Pd(boolean z8) {
        this.f26990n = 26;
    }
}
