package com.bytedance.sdk.openadsdk.nqi;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
final class mw {
    private final zg fb;
    private final boolean fs;
    private final String zmn;
    private final btk zn;

    static boolean zmn(char c) {
        return c >= '0' && c <= '9';
    }

    private enum zn {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        zn(String str) {
        }
    }

    mw(String str, Charset charset, boolean z, zg zgVar) {
        this.zmn = str;
        this.fs = z;
        this.zn = new btk(str, charset, -1);
        this.fb = zgVar;
    }

    static fs zmn(String str, kw kwVar, Charset charset, boolean z, zg zgVar) throws iqz {
        return new mw(str, charset, z, zgVar).zmn(kwVar);
    }

    fs zmn(kw kwVar) throws iqz {
        if (kwVar == null) {
            kw[] kwVarArr = {zmn(zn.SMALL), zmn(zn.MEDIUM), zmn(zn.LARGE)};
            fs[] fsVarArr = {zn(kwVarArr[0]), zn(kwVarArr[1]), zn(kwVarArr[2])};
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < 3; i3++) {
                int zmn2 = fsVarArr[i3].zmn();
                if (nps.zmn(zmn2, kwVarArr[i3], this.fb) && zmn2 < i) {
                    i2 = i3;
                    i = zmn2;
                }
            }
            if (i2 < 0) {
                throw new iqz("Data too big for any version");
            }
            return fsVarArr[i2];
        }
        fs zn2 = zn(kwVar);
        if (nps.zmn(zn2.zmn(), zmn(fs(zn2.fs())), this.fb)) {
            return zn2;
        }
        throw new iqz("Data too big for version".concat(String.valueOf(kwVar)));
    }

    static zn fs(kw kwVar) {
        return kwVar.zmn() <= 9 ? zn.SMALL : kwVar.zmn() <= 26 ? zn.MEDIUM : zn.LARGE;
    }

    static kw zmn(zn znVar) {
        int i = AnonymousClass1.zmn[znVar.ordinal()];
        if (i == 1) {
            return kw.zmn(9);
        }
        if (i == 2) {
            return kw.zmn(26);
        }
        return kw.zmn(40);
    }

    static boolean fs(char c) {
        return nps.zmn(String.valueOf(c));
    }

    static boolean zn(char c) {
        return nps.zmn(c) != -1;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.nqi.mw$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fs;
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[rt.values().length];
            fs = iArr;
            try {
                iArr[rt.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fs[rt.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fs[rt.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fs[rt.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                fs[rt.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[zn.values().length];
            zmn = iArr2;
            try {
                iArr2[zn.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zmn[zn.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zmn[zn.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    boolean zmn(rt rtVar, char c) {
        int i = AnonymousClass1.fs[rtVar.ordinal()];
        if (i == 1) {
            return fs(c);
        }
        if (i == 2) {
            return zn(c);
        }
        if (i != 3) {
            return i == 4;
        }
        return zmn(c);
    }

    static int zmn(rt rtVar) {
        int i;
        if (rtVar == null || (i = AnonymousClass1.fs[rtVar.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode ".concat(String.valueOf(rtVar)));
    }

    void zmn(zmn[][][] zmnVarArr, int i, zmn zmnVar) {
        zmn[] zmnVarArr2 = zmnVarArr[i + zmnVar.btk][zmnVar.fb];
        int zmn2 = zmn(zmnVar.fs);
        zmn zmnVar2 = zmnVarArr2[zmn2];
        if (zmnVar2 == null || zmnVar2.nps > zmnVar.nps) {
            zmnVarArr2[zmn2] = zmnVar;
        }
    }

    void zmn(kw kwVar, zmn[][][] zmnVarArr, int i, zmn zmnVar) {
        int i2;
        int zmn2 = this.zn.zmn();
        int fs2 = this.zn.fs();
        if (fs2 < 0 || !this.zn.zmn(this.zmn.charAt(i), fs2)) {
            fs2 = 0;
        } else {
            zmn2 = fs2 + 1;
        }
        int i3 = zmn2;
        for (int i4 = fs2; i4 < i3; i4++) {
            if (this.zn.zmn(this.zmn.charAt(i), i4)) {
                zmn(zmnVarArr, i, new zmn(this, rt.BYTE, i, i4, 1, zmnVar, kwVar, null));
            }
        }
        rt rtVar = rt.KANJI;
        if (zmn(rtVar, this.zmn.charAt(i))) {
            zmn(zmnVarArr, i, new zmn(this, rtVar, i, 0, 1, zmnVar, kwVar, null));
        }
        int length = this.zmn.length();
        rt rtVar2 = rt.ALPHANUMERIC;
        if (zmn(rtVar2, this.zmn.charAt(i))) {
            int i5 = i + 1;
            zmn(zmnVarArr, i, new zmn(this, rtVar2, i, 0, (i5 >= length || !zmn(rtVar2, this.zmn.charAt(i5))) ? 1 : 2, zmnVar, kwVar, null));
        }
        rt rtVar3 = rt.NUMERIC;
        if (zmn(rtVar3, this.zmn.charAt(i))) {
            int i6 = i + 1;
            if (i6 >= length || !zmn(rtVar3, this.zmn.charAt(i6))) {
                i2 = 1;
            } else {
                int i7 = i + 2;
                i2 = (i7 >= length || !zmn(rtVar3, this.zmn.charAt(i7))) ? 2 : 3;
            }
            zmn(zmnVarArr, i, new zmn(this, rtVar3, i, 0, i2, zmnVar, kwVar, null));
        }
    }

    fs zn(kw kwVar) throws iqz {
        int length = this.zmn.length();
        zmn[][][] zmnVarArr = (zmn[][][]) Array.newInstance((Class<?>) zmn.class, length + 1, this.zn.zmn(), 4);
        zmn(kwVar, zmnVarArr, 0, null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.zn.zmn(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    zmn zmnVar = zmnVarArr[i][i2][i3];
                    if (zmnVar != null && i < length) {
                        zmn(kwVar, zmnVarArr, i, zmnVar);
                    }
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < this.zn.zmn(); i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                zmn zmnVar2 = zmnVarArr[length][i7][i8];
                if (zmnVar2 != null && zmnVar2.nps < i5) {
                    i5 = zmnVar2.nps;
                    i4 = i7;
                    i6 = i8;
                }
            }
        }
        if (i4 < 0) {
            throw new iqz("Internal error: failed to encode \"" + this.zmn + "\"");
        }
        return new fs(kwVar, zmnVarArr[length][i4][i6]);
    }

    private final class zmn {
        private final int btk;
        private final int fb;
        private final rt fs;
        private final zmn hhw;
        private final int nps;
        private final int zn;

        /* synthetic */ zmn(mw mwVar, rt rtVar, int i, int i2, int i3, zmn zmnVar, kw kwVar, AnonymousClass1 anonymousClass1) {
            this(rtVar, i, i2, i3, zmnVar, kwVar);
        }

        private zmn(rt rtVar, int i, int i2, int i3, zmn zmnVar, kw kwVar) {
            this.fs = rtVar;
            this.zn = i;
            rt rtVar2 = rt.BYTE;
            int i4 = (rtVar == rtVar2 || zmnVar == null) ? i2 : zmnVar.fb;
            this.fb = i4;
            this.btk = i3;
            this.hhw = zmnVar;
            boolean z = false;
            int i5 = zmnVar != null ? zmnVar.nps : 0;
            if ((rtVar == rtVar2 && zmnVar == null && i4 != 0) || (zmnVar != null && i4 != zmnVar.fb)) {
                z = true;
            }
            i5 = (zmnVar == null || rtVar != zmnVar.fs || z) ? i5 + rtVar.zmn(kwVar) + 4 : i5;
            int i6 = AnonymousClass1.fs[rtVar.ordinal()];
            if (i6 == 1) {
                i5 += 13;
            } else if (i6 == 2) {
                i5 += i3 == 1 ? 6 : 11;
            } else if (i6 == 3) {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            } else if (i6 == 4) {
                i5 += mw.this.zn.zmn(mw.this.zmn.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    i5 += 12;
                }
            }
            this.nps = i5;
        }
    }

    final class fs {
        private final List<zmn> fs = new ArrayList();
        private final kw zn;

        fs(kw kwVar, zmn zmnVar) {
            int i;
            int i2;
            int i3 = 0;
            boolean z = false;
            while (true) {
                i = 1;
                if (zmnVar == null) {
                    break;
                }
                int i4 = i3 + zmnVar.btk;
                zmn zmnVar2 = zmnVar.hhw;
                boolean z2 = (zmnVar.fs == rt.BYTE && zmnVar2 == null && zmnVar.fb != 0) || !(zmnVar2 == null || zmnVar.fb == zmnVar2.fb);
                z = z2 ? true : z;
                if (zmnVar2 == null || zmnVar2.fs != zmnVar.fs || z2) {
                    this.fs.add(0, new zmn(zmnVar.fs, zmnVar.zn, zmnVar.fb, i4));
                    i4 = 0;
                }
                if (z2) {
                    this.fs.add(0, new zmn(rt.ECI, zmnVar.zn, zmnVar.fb, 0));
                }
                zmnVar = zmnVar2;
                i3 = i4;
            }
            if (mw.this.fs) {
                zmn zmnVar3 = this.fs.get(0);
                if (zmnVar3 != null) {
                    rt rtVar = zmnVar3.fs;
                    rt rtVar2 = rt.ECI;
                    if (rtVar != rtVar2 && z) {
                        this.fs.add(0, new zmn(rtVar2, 0, 0, 0));
                    }
                }
                this.fs.add(this.fs.get(0).fs == rt.ECI ? 1 : 0, new zmn(rt.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int zmn2 = kwVar.zmn();
            int i5 = AnonymousClass1.zmn[mw.fs(kwVar).ordinal()];
            if (i5 == 1) {
                i2 = 9;
            } else if (i5 != 2) {
                i = 27;
                i2 = 40;
            } else {
                i = 10;
                i2 = 26;
            }
            int zmn3 = zmn(kwVar);
            while (zmn2 < i2 && !nps.zmn(zmn3, kw.zmn(zmn2), mw.this.fb)) {
                zmn2++;
            }
            while (zmn2 > i && nps.zmn(zmn3, kw.zmn(zmn2 - 1), mw.this.fb)) {
                zmn2--;
            }
            this.zn = kw.zmn(zmn2);
        }

        int zmn() {
            return zmn(this.zn);
        }

        private int zmn(kw kwVar) {
            Iterator<zmn> it = this.fs.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().zmn(kwVar);
            }
            return i;
        }

        void zmn(com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) throws iqz {
            Iterator<zmn> it = this.fs.iterator();
            while (it.hasNext()) {
                it.next().zmn(zmnVar);
            }
        }

        kw fs() {
            return this.zn;
        }

        final class zmn {
            private final int btk;
            private final int fb;
            private final rt fs;
            private final int zn;

            zmn(rt rtVar, int i, int i2, int i3) {
                this.fs = rtVar;
                this.zn = i;
                this.fb = i2;
                this.btk = i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int zmn(kw kwVar) {
                int i;
                int i2;
                int zmn = this.fs.zmn(kwVar);
                int i3 = zmn + 4;
                int i4 = AnonymousClass1.fs[this.fs.ordinal()];
                if (i4 != 1) {
                    int i5 = 0;
                    if (i4 == 2) {
                        int i6 = this.btk;
                        i2 = i3 + ((i6 / 2) * 11);
                        if (i6 % 2 == 1) {
                            i5 = 6;
                        }
                    } else if (i4 == 3) {
                        int i7 = this.btk;
                        i2 = i3 + ((i7 / 3) * 10);
                        int i8 = i7 % 3;
                        if (i8 == 1) {
                            i5 = 4;
                        } else if (i8 == 2) {
                            i5 = 7;
                        }
                    } else {
                        if (i4 != 4) {
                            return i4 != 5 ? i3 : zmn + 12;
                        }
                        i = zmn() * 8;
                    }
                    return i2 + i5;
                }
                i = this.btk * 13;
                return i3 + i;
            }

            private int zmn() {
                if (this.fs != rt.BYTE) {
                    return this.btk;
                }
                btk btkVar = mw.this.zn;
                String str = mw.this.zmn;
                int i = this.zn;
                return btkVar.zmn(str.substring(i, this.btk + i), this.fb).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zmn(com.bytedance.sdk.openadsdk.nqi.zmn zmnVar) throws iqz {
                zmnVar.zmn(this.fs.zmn(), 4);
                if (this.btk > 0) {
                    zmnVar.zmn(zmn(), this.fs.zmn(fs.this.zn));
                }
                if (this.fs == rt.ECI) {
                    zmnVar.zmn(mw.this.zn.fs(this.fb), 8);
                } else if (this.btk > 0) {
                    String str = mw.this.zmn;
                    int i = this.zn;
                    nps.zmn(str.substring(i, this.btk + i), this.fs, zmnVar, mw.this.zn.zmn(this.fb));
                }
            }
        }
    }
}
