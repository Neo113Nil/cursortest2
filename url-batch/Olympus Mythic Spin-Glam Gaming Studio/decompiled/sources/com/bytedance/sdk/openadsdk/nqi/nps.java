package com.bytedance.sdk.openadsdk.nqi;

import com.bytedance.sdk.openadsdk.nqi.kw;
import com.bytedance.sdk.openadsdk.nqi.mw;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class nps {
    private static final int[] fs = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset zmn = StandardCharsets.ISO_8859_1;

    private static int zmn(zn znVar) {
        return rc.zmn(znVar) + rc.fs(znVar) + rc.zn(znVar) + rc.fb(znVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0130, code lost:
    
        if (com.bytedance.sdk.openadsdk.nqi.cn.zmn(r8) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cn zmn(String str, zg zgVar, Map<hhw, ?> map) throws iqz {
        boolean z;
        boolean z2;
        kw zmn2;
        kw kwVar;
        com.bytedance.sdk.openadsdk.nqi.zmn zmnVar;
        fb zmn3;
        int i;
        boolean z3 = false;
        if (map != null) {
            hhw hhwVar = hhw.GS1_FORMAT;
            if (map.containsKey(hhwVar) && Boolean.parseBoolean(map.get(hhwVar).toString())) {
                z = true;
                if (map != null) {
                    hhw hhwVar2 = hhw.QR_COMPACT;
                    if (map.containsKey(hhwVar2) && Boolean.parseBoolean(map.get(hhwVar2).toString())) {
                        z2 = true;
                        Charset charset = zmn;
                        if (map != null && map.containsKey(hhw.CHARACTER_SET)) {
                            z3 = true;
                        }
                        if (z3) {
                            try {
                                charset = Charset.forName(map.get(hhw.CHARACTER_SET).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                        }
                        if (z2) {
                            rt rtVar = rt.NUMERIC;
                            if (charset.equals(zmn)) {
                                charset = null;
                            }
                            mw.fs zmn4 = mw.zmn(str, null, charset, z, zgVar);
                            zmnVar = new com.bytedance.sdk.openadsdk.nqi.zmn();
                            zmn4.zmn(zmnVar);
                            kwVar = zmn4.fs();
                        } else {
                            rt zmn5 = zmn(str, charset);
                            com.bytedance.sdk.openadsdk.nqi.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.nqi.zmn();
                            rt rtVar2 = rt.BYTE;
                            if (zmn5 == rtVar2 && z3 && (zmn3 = fb.zmn(charset)) != null) {
                                zmn(zmn3, zmnVar2);
                            }
                            if (z) {
                                zmn(rt.FNC1_FIRST_POSITION, zmnVar2);
                            }
                            zmn(zmn5, zmnVar2);
                            com.bytedance.sdk.openadsdk.nqi.zmn zmnVar3 = new com.bytedance.sdk.openadsdk.nqi.zmn();
                            zmn(str, zmn5, zmnVar3, charset);
                            if (map != null) {
                                hhw hhwVar3 = hhw.QR_VERSION;
                                if (map.containsKey(hhwVar3)) {
                                    zmn2 = kw.zmn(Integer.parseInt(map.get(hhwVar3).toString()));
                                    if (!zmn(zmn(zmn5, zmnVar2, zmnVar3, zmn2), zmn2, zgVar)) {
                                        throw new iqz("Data too big for requested version");
                                    }
                                    com.bytedance.sdk.openadsdk.nqi.zmn zmnVar4 = new com.bytedance.sdk.openadsdk.nqi.zmn();
                                    zmnVar4.zmn(zmnVar2);
                                    zmn(zmn5 != rtVar2 ? zmnVar3.fs() : str.length(), zmn2, zmn5, zmnVar4);
                                    zmnVar4.zmn(zmnVar3);
                                    kwVar = zmn2;
                                    zmnVar = zmnVar4;
                                }
                            }
                            zmn2 = zmn(zgVar, zmn5, zmnVar2, zmnVar3);
                            com.bytedance.sdk.openadsdk.nqi.zmn zmnVar42 = new com.bytedance.sdk.openadsdk.nqi.zmn();
                            zmnVar42.zmn(zmnVar2);
                            zmn(zmn5 != rtVar2 ? zmnVar3.fs() : str.length(), zmn2, zmn5, zmnVar42);
                            zmnVar42.zmn(zmnVar3);
                            kwVar = zmn2;
                            zmnVar = zmnVar42;
                        }
                        kw.fs zmn6 = kwVar.zmn(zgVar);
                        int fs2 = kwVar.fs() - zmn6.zn();
                        zmn(fs2, zmnVar);
                        com.bytedance.sdk.openadsdk.nqi.zmn zmn7 = zmn(zmnVar, kwVar.fs(), fs2, zmn6.fs());
                        cn cnVar = new cn();
                        int zn = kwVar.zn();
                        zn znVar = new zn(zn, zn);
                        if (map != null) {
                            hhw hhwVar4 = hhw.QR_MASK_PATTERN;
                            if (map.containsKey(hhwVar4)) {
                                i = Integer.parseInt(map.get(hhwVar4).toString());
                            }
                        }
                        i = -1;
                        if (i == -1) {
                            i = zmn(zmn7, zgVar, kwVar, znVar);
                        }
                        klz.zmn(zmn7, zgVar, kwVar, i, znVar);
                        cnVar.zmn(znVar);
                        return cnVar;
                    }
                }
                z2 = false;
                Charset charset2 = zmn;
                if (map != null) {
                    z3 = true;
                }
                if (z3) {
                }
                if (z2) {
                }
                kw.fs zmn62 = kwVar.zmn(zgVar);
                int fs22 = kwVar.fs() - zmn62.zn();
                zmn(fs22, zmnVar);
                com.bytedance.sdk.openadsdk.nqi.zmn zmn72 = zmn(zmnVar, kwVar.fs(), fs22, zmn62.fs());
                cn cnVar2 = new cn();
                int zn2 = kwVar.zn();
                zn znVar2 = new zn(zn2, zn2);
                if (map != null) {
                }
                i = -1;
                if (i == -1) {
                }
                klz.zmn(zmn72, zgVar, kwVar, i, znVar2);
                cnVar2.zmn(znVar2);
                return cnVar2;
            }
        }
        z = false;
        if (map != null) {
        }
        z2 = false;
        Charset charset22 = zmn;
        if (map != null) {
        }
        if (z3) {
        }
        if (z2) {
        }
        kw.fs zmn622 = kwVar.zmn(zgVar);
        int fs222 = kwVar.fs() - zmn622.zn();
        zmn(fs222, zmnVar);
        com.bytedance.sdk.openadsdk.nqi.zmn zmn722 = zmn(zmnVar, kwVar.fs(), fs222, zmn622.fs());
        cn cnVar22 = new cn();
        int zn22 = kwVar.zn();
        zn znVar22 = new zn(zn22, zn22);
        if (map != null) {
        }
        i = -1;
        if (i == -1) {
        }
        klz.zmn(zmn722, zgVar, kwVar, i, znVar22);
        cnVar22.zmn(znVar22);
        return cnVar22;
    }

    private static kw zmn(zg zgVar, rt rtVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar2) throws iqz {
        return zmn(zmn(rtVar, zmnVar, zmnVar2, zmn(zmn(rtVar, zmnVar, zmnVar2, kw.zmn(1)), zgVar)), zgVar);
    }

    private static int zmn(rt rtVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar2, kw kwVar) {
        return zmnVar.zmn() + rtVar.zmn(kwVar) + zmnVar2.zmn();
    }

    static int zmn(int i) {
        int[] iArr = fs;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static rt zmn(String str, Charset charset) {
        Charset charset2 = kgc.zmn;
        if (charset2 != null && charset2.equals(charset) && zmn(str)) {
            return rt.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (zmn(charAt) == -1) {
                    return rt.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return rt.ALPHANUMERIC;
        }
        if (z2) {
            return rt.NUMERIC;
        }
        return rt.BYTE;
    }

    static boolean zmn(String str) {
        byte[] bytes = str.getBytes(kgc.zmn);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static int zmn(com.bytedance.sdk.openadsdk.nqi.zmn zmnVar, zg zgVar, kw kwVar, zn znVar) throws iqz {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            klz.zmn(zmnVar, zgVar, kwVar, i3, znVar);
            int zmn2 = zmn(znVar);
            if (zmn2 < i) {
                i2 = i3;
                i = zmn2;
            }
        }
        return i2;
    }

    private static kw zmn(int i, zg zgVar) throws iqz {
        for (int i2 = 1; i2 <= 40; i2++) {
            kw zmn2 = kw.zmn(i2);
            if (zmn(i, zmn2, zgVar)) {
                return zmn2;
            }
        }
        throw new iqz("Data too big");
    }

    static boolean zmn(int i, kw kwVar, zg zgVar) {
        return kwVar.fs() - kwVar.zmn(zgVar).zn() >= (i + 7) / 8;
    }

    static void zmn(int i, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) throws iqz {
        int i2 = i * 8;
        if (zmnVar.zmn() > i2) {
            throw new iqz("data bits cannot fit in the QR Code" + zmnVar.zmn() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && zmnVar.zmn() < i2; i3++) {
            zmnVar.zmn(false);
        }
        int zmn2 = zmnVar.zmn() & 7;
        if (zmn2 > 0) {
            while (zmn2 < 8) {
                zmnVar.zmn(false);
                zmn2++;
            }
        }
        int fs2 = i - zmnVar.fs();
        for (int i4 = 0; i4 < fs2; i4++) {
            zmnVar.zmn((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (zmnVar.zmn() != i2) {
            throw new iqz("Bits size does not equal capacity");
        }
    }

    static void zmn(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws iqz {
        if (i4 >= i3) {
            throw new iqz("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new iqz("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new iqz("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new iqz("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    static com.bytedance.sdk.openadsdk.nqi.zmn zmn(com.bytedance.sdk.openadsdk.nqi.zmn zmnVar, int i, int i2, int i3) throws iqz {
        if (zmnVar.fs() != i2) {
            throw new iqz("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            zmn(i, i2, i3, i7, iArr, iArr2);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            zmnVar.zmn(i4 * 8, bArr, 0, i8);
            byte[] zmn2 = zmn(bArr, iArr2[0]);
            arrayList.add(new zmn(bArr, zmn2));
            i5 = Math.max(i5, i8);
            i6 = Math.max(i6, zmn2.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new iqz("Data bytes does not match offset");
        }
        com.bytedance.sdk.openadsdk.nqi.zmn zmnVar2 = new com.bytedance.sdk.openadsdk.nqi.zmn();
        for (int i9 = 0; i9 < i5; i9++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] zmn3 = ((zmn) it.next()).zmn();
                if (i9 < zmn3.length) {
                    zmnVar2.zmn(zmn3[i9], 8);
                }
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] fs2 = ((zmn) it2.next()).fs();
                if (i10 < fs2.length) {
                    zmnVar2.zmn(fs2[i10], 8);
                }
            }
        }
        if (i == zmnVar2.fs()) {
            return zmnVar2;
        }
        throw new iqz("Interleaving error: " + i + " and " + zmnVar2.fs() + " differ.");
    }

    static byte[] zmn(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        new olo(bvs.zmn).zmn(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void zmn(rt rtVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) {
        zmnVar.zmn(rtVar.zmn(), 4);
    }

    static void zmn(int i, kw kwVar, rt rtVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) throws iqz {
        int zmn2 = rtVar.zmn(kwVar);
        int i2 = 1 << zmn2;
        if (i >= i2) {
            throw new iqz(i + " is bigger than " + (i2 - 1));
        }
        zmnVar.zmn(i, zmn2);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.nqi.nps$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[rt.values().length];
            zmn = iArr;
            try {
                iArr[rt.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[rt.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[rt.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[rt.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void zmn(String str, rt rtVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar, Charset charset) throws iqz {
        int i = AnonymousClass1.zmn[rtVar.ordinal()];
        if (i == 1) {
            zmn((CharSequence) str, zmnVar);
            return;
        }
        if (i == 2) {
            fs(str, zmnVar);
        } else if (i == 3) {
            zmn(str, zmnVar, charset);
        } else {
            if (i == 4) {
                zmn(str, zmnVar);
                return;
            }
            throw new iqz("Invalid mode: ".concat(String.valueOf(rtVar)));
        }
    }

    static void zmn(CharSequence charSequence, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                zmnVar.zmn((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    zmnVar.zmn((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    zmnVar.zmn(charAt, 4);
                }
            }
        }
    }

    static void fs(CharSequence charSequence, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) throws iqz {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int zmn2 = zmn(charSequence.charAt(i));
            if (zmn2 == -1) {
                throw new iqz();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int zmn3 = zmn(charSequence.charAt(i2));
                if (zmn3 == -1) {
                    throw new iqz();
                }
                zmnVar.zmn((zmn2 * 45) + zmn3, 11);
                i += 2;
            } else {
                zmnVar.zmn(zmn2, 6);
                i = i2;
            }
        }
    }

    static void zmn(String str, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar, Charset charset) {
        for (byte b : str.getBytes(charset)) {
            zmnVar.zmn(b, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[LOOP:0: B:6:0x0011->B:13:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void zmn(String str, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) throws iqz {
        int i;
        Charset charset = kgc.zmn;
        if (charset == null) {
            throw new iqz("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new iqz("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = ((bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            int i4 = 33088;
            if (i3 < 33088 || i3 > 40956) {
                if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                    if (i != -1) {
                        throw new iqz("Invalid byte sequence");
                    }
                    zmnVar.zmn(((i >> 8) * 192) + (i & 255), 13);
                } else {
                    i4 = 49472;
                }
            }
            i = i3 - i4;
            if (i != -1) {
            }
        }
    }

    private static void zmn(fb fbVar, com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) {
        zmnVar.zmn(rt.ECI.zmn(), 4);
        zmnVar.zmn(fbVar.zmn(), 8);
    }

    static final class zmn {
        private final byte[] fs;
        private final byte[] zmn;

        zmn(byte[] bArr, byte[] bArr2) {
            this.zmn = bArr;
            this.fs = bArr2;
        }

        public byte[] zmn() {
            return this.zmn;
        }

        public byte[] fs() {
            return this.fs;
        }
    }
}
