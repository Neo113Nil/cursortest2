package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
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
import java.util.Map;

/* loaded from: classes.dex */
public final class f5 {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> c7 = g5.c(randomAccessFile);
            if (c7 == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new c5(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) c7.first;
            long longValue = ((Long) c7.second).longValue();
            long j7 = (-20) + longValue;
            if (j7 >= 0) {
                randomAccessFile.seek(j7);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new c5("ZIP64 APK not supported");
                }
            }
            long a7 = g5.a(byteBuffer);
            if (a7 >= longValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(a7);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new c5(sb2.toString());
            }
            if (g5.b(byteBuffer) + a7 != longValue) {
                throw new c5("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (a7 < 32) {
                StringBuilder sb3 = new StringBuilder(87);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(a7);
                throw new c5(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(a7 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new c5("No APK Signing Block before ZIP Central Directory");
            }
            int i7 = 0;
            long j8 = allocate.getLong(0);
            if (j8 < allocate.capacity() || j8 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(57);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j8);
                throw new c5(sb4.toString());
            }
            int i8 = (int) (8 + j8);
            long j9 = a7 - i8;
            if (j9 < 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j9);
                throw new c5(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i8);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j9);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j10 = allocate2.getLong(0);
            if (j10 != j8) {
                StringBuilder sb6 = new StringBuilder(103);
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j10);
                sb6.append(" vs ");
                sb6.append(j8);
                throw new c5(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j9));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(38);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < ");
                sb7.append(8);
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(41);
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
                while (slice.hasRemaining()) {
                    i7++;
                    if (slice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(70);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i7);
                        throw new c5(sb9.toString());
                    }
                    long j11 = slice.getLong();
                    if (j11 < 4 || j11 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(76);
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i7);
                        sb10.append(" size out of range: ");
                        sb10.append(j11);
                        throw new c5(sb10.toString());
                    }
                    int i9 = (int) j11;
                    int position2 = slice.position() + i9;
                    if (i9 > slice.remaining()) {
                        int remaining = slice.remaining();
                        StringBuilder sb11 = new StringBuilder(91);
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i7);
                        sb11.append(" size out of range: ");
                        sb11.append(i9);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new c5(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] l7 = l(randomAccessFile.getChannel(), new b5(e(slice, i9 - 4), longValue2, a7, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return l7;
                    }
                    slice.position(position2);
                }
                throw new c5("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int b(int i7) {
        if (i7 == 1) {
            return 32;
        }
        if (i7 == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int c(int i7) {
        if (i7 == 513) {
            return 1;
        }
        if (i7 == 514) {
            return 2;
        }
        if (i7 == 769) {
            return 1;
        }
        switch (i7) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString(i7));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static String d(int i7) {
        if (i7 == 1) {
            return "SHA-256";
        }
        if (i7 == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer e(ByteBuffer byteBuffer, int i7) {
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i8 = i7 + position;
        if (i8 < position || i8 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i8);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i8);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            return e(byteBuffer, i7);
        }
        int remaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i7);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new IOException(sb2.toString());
    }

    private static void g(int i7, byte[] bArr, int i8) {
        bArr[1] = (byte) (i7 & 255);
        bArr[2] = (byte) ((i7 >>> 8) & 255);
        bArr[3] = (byte) ((i7 >>> 16) & 255);
        bArr[4] = (byte) (i7 >> 24);
    }

    private static void h(Map<Integer, byte[]> map, FileChannel fileChannel, long j7, long j8, long j9, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        a5 a5Var = new a5(fileChannel, 0L, j7);
        a5 a5Var2 = new a5(fileChannel, j8, j9 - j8);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        g5.d(duplicate, j7);
        y4 y4Var = new y4(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = it.next().intValue();
            i7++;
        }
        try {
            byte[][] k7 = k(iArr, new z4[]{a5Var, a5Var2, y4Var});
            for (int i8 = 0; i8 < size; i8++) {
                int i9 = iArr[i8];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i9)), k7[i8])) {
                    throw new SecurityException(d(i9).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e7) {
            throw new SecurityException("Failed to compute digest(s) of contents", e7);
        }
    }

    private static byte[] i(ByteBuffer byteBuffer) {
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IOException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i7);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = c(r5);
        r12 = c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b A[Catch: SignatureException -> 0x026f, InvalidAlgorithmParameterException -> 0x0271, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0275, NoSuchAlgorithmException -> 0x0277, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x0275, blocks: (B:76:0x0135, B:78:0x014b, B:79:0x014e), top: B:75:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static X509Certificate[] j(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) {
        String str;
        String str2;
        Pair pair;
        String str3;
        AlgorithmParameterSpec algorithmParameterSpec;
        Signature signature;
        PSSParameterSpec pSSParameterSpec;
        String str4;
        ByteBuffer f7 = f(byteBuffer);
        ByteBuffer f8 = f(byteBuffer);
        byte[] i7 = i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i8 = -1;
        int i9 = 0;
        while (f8.hasRemaining()) {
            i9++;
            try {
                ByteBuffer f9 = f(f8);
                if (f9.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i10 = f9.getInt();
                arrayList.add(Integer.valueOf(i10));
                if (i10 != 513 && i10 != 514 && i10 != 769) {
                    switch (i10) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = i(f9);
                i8 = i10;
            } catch (IOException | BufferUnderflowException e7) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i9);
                throw new SecurityException(sb.toString(), e7);
            }
        }
        if (i8 == -1) {
            if (i9 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i8 == 513 || i8 == 514) {
            str = "EC";
        } else if (i8 != 769) {
            switch (i8) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String valueOf = String.valueOf(Long.toHexString(i8));
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            str = "DSA";
        }
        try {
            if (i8 == 513) {
                str2 = "SHA256withECDSA";
            } else if (i8 == 514) {
                str2 = "SHA512withECDSA";
            } else if (i8 != 769) {
                switch (i8) {
                    case 257:
                        pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                        str4 = "SHA256withRSA/PSS";
                        pair = Pair.create(str4, pSSParameterSpec);
                        str3 = (String) pair.first;
                        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
                        PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i7));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(generatePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(f7);
                        if (!signature.verify(bArr2)) {
                            throw new SecurityException(String.valueOf(str3).concat(" signature did not verify"));
                        }
                        f7.clear();
                        ByteBuffer f10 = f(f7);
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = 0;
                        while (f10.hasRemaining()) {
                            i11++;
                            try {
                                ByteBuffer f11 = f(f10);
                                if (f11.remaining() < 8) {
                                    throw new IOException("Record too short");
                                }
                                int i12 = f11.getInt();
                                arrayList2.add(Integer.valueOf(i12));
                                if (i12 == i8) {
                                    bArr = i(f11);
                                }
                            } catch (IOException | BufferUnderflowException e8) {
                                StringBuilder sb2 = new StringBuilder(42);
                                sb2.append("Failed to parse digest record #");
                                sb2.append(i11);
                                throw new IOException(sb2.toString(), e8);
                            }
                        }
                        if (!arrayList.equals(arrayList2)) {
                            throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                        }
                        int c7 = c(i8);
                        byte[] put = map.put(Integer.valueOf(c7), bArr);
                        if (put != null && !MessageDigest.isEqual(put, bArr)) {
                            throw new SecurityException(d(c7).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                        ByteBuffer f12 = f(f7);
                        ArrayList arrayList3 = new ArrayList();
                        int i13 = 0;
                        while (f12.hasRemaining()) {
                            i13++;
                            byte[] i14 = i(f12);
                            try {
                                arrayList3.add(new d5((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(i14)), i14));
                            } catch (CertificateException e9) {
                                StringBuilder sb3 = new StringBuilder(41);
                                sb3.append("Failed to decode certificate #");
                                sb3.append(i13);
                                throw new SecurityException(sb3.toString(), e9);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            throw new SecurityException("No certificates listed");
                        }
                        if (Arrays.equals(i7, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    case 258:
                        pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                        str4 = "SHA512withRSA/PSS";
                        pair = Pair.create(str4, pSSParameterSpec);
                        str3 = (String) pair.first;
                        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
                        PublicKey generatePublic2 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i7));
                        signature = Signature.getInstance(str3);
                        signature.initVerify(generatePublic2);
                        if (algorithmParameterSpec != null) {
                        }
                        signature.update(f7);
                        if (!signature.verify(bArr2)) {
                        }
                        break;
                    case 259:
                        str2 = "SHA256withRSA";
                        break;
                    case 260:
                        str2 = "SHA512withRSA";
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString(i8));
                        throw new IllegalArgumentException(valueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf2) : new String("Unknown signature algorithm: 0x"));
                }
            } else {
                str2 = "SHA256withDSA";
            }
            PublicKey generatePublic22 = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i7));
            signature = Signature.getInstance(str3);
            signature.initVerify(generatePublic22);
            if (algorithmParameterSpec != null) {
            }
            signature.update(f7);
            if (!signature.verify(bArr2)) {
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e10) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 27);
            sb4.append("Failed to verify ");
            sb4.append(str3);
            sb4.append(" signature");
            throw new SecurityException(sb4.toString(), e10);
        }
        pair = Pair.create(str2, null);
        str3 = (String) pair.first;
        algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
    }

    private static byte[][] k(int[] iArr, z4[] z4VarArr) {
        long j7;
        int i7;
        int length;
        long j8 = 0;
        int i8 = 0;
        long j9 = 0;
        int i9 = 0;
        while (true) {
            j7 = 1048576;
            if (i9 >= 3) {
                break;
            }
            j9 += (z4VarArr[i9].zza() + 1048575) / 1048576;
            i9++;
        }
        if (j9 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j9);
            throw new DigestException(sb.toString());
        }
        int i10 = (int) j9;
        byte[][] bArr = new byte[iArr.length][];
        int i11 = 0;
        while (true) {
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(b(iArr[i11]) * i10) + 5];
            bArr2[0] = 90;
            g(i10, bArr2, 1);
            bArr[i11] = bArr2;
            i11++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            String d7 = d(iArr[i12]);
            try {
                messageDigestArr[i12] = MessageDigest.getInstance(d7);
            } catch (NoSuchAlgorithmException e7) {
                throw new RuntimeException(d7.concat(" digest not supported"), e7);
            }
        }
        int i13 = 0;
        int i14 = 0;
        for (i7 = 3; i13 < i7; i7 = 3) {
            z4 z4Var = z4VarArr[i13];
            long j10 = j8;
            long zza = z4Var.zza();
            while (zza > j8) {
                int min = (int) Math.min(zza, j7);
                g(min, bArr3, 1);
                for (int i15 = 0; i15 < length; i15++) {
                    messageDigestArr[i15].update(bArr3);
                }
                long j11 = j10;
                try {
                    z4Var.a(messageDigestArr, j11, min);
                    byte[] bArr4 = bArr3;
                    int i16 = 0;
                    while (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        z4 z4Var2 = z4Var;
                        byte[] bArr5 = bArr[i16];
                        int b7 = b(i17);
                        int i18 = length;
                        MessageDigest messageDigest = messageDigestArr[i16];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i14 * b7) + 5, b7);
                        if (digest != b7) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i16++;
                        z4Var = z4Var2;
                        length = i18;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j12 = min;
                    long j13 = j11 + j12;
                    zza -= j12;
                    i14++;
                    bArr3 = bArr4;
                    j8 = 0;
                    j10 = j13;
                    j7 = 1048576;
                } catch (IOException e8) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i14);
                    sb3.append(" of section #");
                    sb3.append(i8);
                    throw new DigestException(sb3.toString(), e8);
                }
            }
            i8++;
            i13++;
            j8 = 0;
            j7 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i19 = 0; i19 < iArr.length; i19++) {
            int i20 = iArr[i19];
            byte[] bArr7 = bArr[i19];
            String d8 = d(i20);
            try {
                bArr6[i19] = MessageDigest.getInstance(d8).digest(bArr7);
            } catch (NoSuchAlgorithmException e9) {
                throw new RuntimeException(d8.concat(" digest not supported"), e9);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, b5 b5Var) {
        ByteBuffer byteBuffer;
        long j7;
        long j8;
        long j9;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = b5Var.f3247a;
                ByteBuffer f7 = f(byteBuffer);
                int i7 = 0;
                while (f7.hasRemaining()) {
                    i7++;
                    try {
                        arrayList.add(j(f(f7), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e7) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i7);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e7);
                    }
                }
                if (i7 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                j7 = b5Var.f3248b;
                j8 = b5Var.f3249c;
                j9 = b5Var.f3250d;
                byteBuffer2 = b5Var.f3251e;
                h(hashMap, fileChannel, j7, j8, j9, byteBuffer2);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }
}
