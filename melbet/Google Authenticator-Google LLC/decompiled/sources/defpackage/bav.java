package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bav implements bar {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final afr j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public bat f = new bat();

    public bav(afr afrVar, bat batVar, ByteBuffer byteBuffer, int i) {
        this.j = afrVar;
        c(batVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bed, java.lang.Object] */
    private final Bitmap e() {
        Boolean bool = this.h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.i;
        Bitmap b = this.j.b.b(this.t, this.s, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b0, code lost:
    
        if (r9.j == r5.h) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046c A[Catch: all -> 0x049f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x006e, B:34:0x0072, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:40:0x0085, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:49:0x009a, B:52:0x00a0, B:54:0x00a4, B:56:0x00ac, B:58:0x00b3, B:59:0x00c7, B:61:0x00cb, B:63:0x00d0, B:65:0x00d5, B:69:0x00db, B:71:0x00df, B:73:0x00ee, B:75:0x00f7, B:76:0x0104, B:78:0x0108, B:80:0x0113, B:82:0x0119, B:83:0x011d, B:85:0x0121, B:86:0x0125, B:88:0x0129, B:89:0x012f, B:91:0x0144, B:93:0x0150, B:97:0x0171, B:144:0x0196, B:145:0x0256, B:147:0x025f, B:150:0x0267, B:152:0x027d, B:156:0x029b, B:158:0x02a3, B:160:0x02a7, B:162:0x02ab, B:167:0x02b2, B:170:0x02ba, B:172:0x02be, B:176:0x02d2, B:177:0x0468, B:179:0x046c, B:183:0x0473, B:185:0x0477, B:186:0x047d, B:187:0x048c, B:191:0x02c7, B:198:0x02da, B:200:0x0301, B:203:0x0309, B:210:0x032e, B:211:0x0335, B:213:0x0339, B:220:0x0353, B:222:0x035e, B:224:0x036c, B:227:0x0365, B:232:0x0446, B:233:0x0371, B:235:0x037a, B:236:0x038e, B:238:0x0394, B:241:0x039d, B:243:0x03a8, B:245:0x03c4, B:249:0x03cb, B:250:0x03ce, B:252:0x03d3, B:255:0x03dc, B:257:0x03e7, B:259:0x0405, B:267:0x0428, B:269:0x0436, B:272:0x042f, B:276:0x0414, B:291:0x0456, B:295:0x0462, B:296:0x045e, B:102:0x01a3, B:105:0x01c0, B:109:0x01e1, B:111:0x01eb, B:116:0x01fc, B:119:0x0206, B:121:0x020f, B:123:0x021b, B:127:0x022c, B:130:0x0239, B:297:0x017e, B:301:0x010b, B:302:0x00ff, B:306:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb A[Catch: all -> 0x049f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x006e, B:34:0x0072, B:35:0x0078, B:37:0x007c, B:39:0x0080, B:40:0x0085, B:43:0x008d, B:45:0x0091, B:47:0x0095, B:49:0x009a, B:52:0x00a0, B:54:0x00a4, B:56:0x00ac, B:58:0x00b3, B:59:0x00c7, B:61:0x00cb, B:63:0x00d0, B:65:0x00d5, B:69:0x00db, B:71:0x00df, B:73:0x00ee, B:75:0x00f7, B:76:0x0104, B:78:0x0108, B:80:0x0113, B:82:0x0119, B:83:0x011d, B:85:0x0121, B:86:0x0125, B:88:0x0129, B:89:0x012f, B:91:0x0144, B:93:0x0150, B:97:0x0171, B:144:0x0196, B:145:0x0256, B:147:0x025f, B:150:0x0267, B:152:0x027d, B:156:0x029b, B:158:0x02a3, B:160:0x02a7, B:162:0x02ab, B:167:0x02b2, B:170:0x02ba, B:172:0x02be, B:176:0x02d2, B:177:0x0468, B:179:0x046c, B:183:0x0473, B:185:0x0477, B:186:0x047d, B:187:0x048c, B:191:0x02c7, B:198:0x02da, B:200:0x0301, B:203:0x0309, B:210:0x032e, B:211:0x0335, B:213:0x0339, B:220:0x0353, B:222:0x035e, B:224:0x036c, B:227:0x0365, B:232:0x0446, B:233:0x0371, B:235:0x037a, B:236:0x038e, B:238:0x0394, B:241:0x039d, B:243:0x03a8, B:245:0x03c4, B:249:0x03cb, B:250:0x03ce, B:252:0x03d3, B:255:0x03dc, B:257:0x03e7, B:259:0x0405, B:267:0x0428, B:269:0x0436, B:272:0x042f, B:276:0x0414, B:291:0x0456, B:295:0x0462, B:296:0x045e, B:102:0x01a3, B:105:0x01c0, B:109:0x01e1, B:111:0x01eb, B:116:0x01fc, B:119:0x0206, B:121:0x020f, B:123:0x021b, B:127:0x022c, B:130:0x0239, B:297:0x017e, B:301:0x010b, B:302:0x00ff, B:306:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v48, types: [short] */
    /* JADX WARN: Type inference failed for: r2v50 */
    @Override // defpackage.bar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap a() {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        boolean z;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        short s;
        int i12;
        Bitmap bitmap;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f.c <= 0 || this.e < 0) {
            this.q = 1;
        }
        int i17 = this.q;
        if (i17 != 1 && i17 != 2) {
            byte b2 = 0;
            this.q = 0;
            if (this.b == null) {
                this.b = this.j.A(255);
            }
            bas basVar = (bas) this.f.e.get(this.e);
            int i18 = -1;
            int i19 = this.e - 1;
            bas basVar2 = i19 >= 0 ? (bas) this.f.e.get(i19) : null;
            int[] iArr2 = basVar.k;
            if (iArr2 == null) {
                iArr2 = this.f.a;
            }
            this.k = iArr2;
            if (iArr2 == null) {
                this.q = 1;
                return null;
            }
            if (basVar.f) {
                int[] iArr3 = this.l;
                System.arraycopy(iArr2, 0, iArr3, 0, 256);
                this.k = iArr3;
                iArr3[basVar.h] = 0;
                if (basVar.g == 2 && this.e == 0) {
                    this.h = true;
                }
            }
            int[] iArr4 = this.d;
            if (basVar2 == null) {
                Bitmap bitmap2 = this.g;
                if (bitmap2 != null) {
                    this.j.y(bitmap2);
                }
                this.g = null;
                Arrays.fill(iArr4, 0);
            }
            if (basVar2 != null && basVar2.g == 3 && this.g == null) {
                Arrays.fill(iArr4, 0);
            }
            if (basVar2 != null && (i12 = basVar2.g) > 0) {
                if (i12 == 2) {
                    if (!basVar.f) {
                        bat batVar = this.f;
                        i13 = batVar.l;
                        if (basVar.k != null) {
                        }
                        int i20 = basVar2.d;
                        int i21 = this.r;
                        int i22 = i20 / i21;
                        int i23 = basVar2.b / i21;
                        int i24 = basVar2.c / i21;
                        int i25 = basVar2.a / i21;
                        int i26 = this.t;
                        i14 = (i23 * i26) + i25;
                        i15 = i22 * i26;
                        i16 = i14;
                        while (i16 < i14 + i15) {
                            int i27 = i16 + i24;
                            for (int i28 = i16; i28 < i27; i28++) {
                                iArr4[i28] = i13;
                            }
                            i16 += this.t;
                        }
                    }
                    i13 = 0;
                    int i202 = basVar2.d;
                    int i212 = this.r;
                    int i222 = i202 / i212;
                    int i232 = basVar2.b / i212;
                    int i242 = basVar2.c / i212;
                    int i252 = basVar2.a / i212;
                    int i262 = this.t;
                    i14 = (i232 * i262) + i252;
                    i15 = i222 * i262;
                    i16 = i14;
                    while (i16 < i14 + i15) {
                    }
                } else if (i12 == 3 && (bitmap = this.g) != null) {
                    int i29 = this.t;
                    bitmap.getPixels(iArr4, 0, i29, 0, 0, i29, this.s);
                }
            }
            if (basVar != null) {
                this.a.position(basVar.j);
            }
            if (basVar == null) {
                bat batVar2 = this.f;
                i = batVar2.f * batVar2.g;
            } else {
                i = basVar.d * basVar.c;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null || bArr2.length < i) {
                bArr2 = this.j.A(i);
                this.c = bArr2;
            }
            short[] sArr = this.m;
            if (sArr == null) {
                sArr = new short[4096];
                this.m = sArr;
            }
            byte[] bArr3 = this.n;
            if (bArr3 == null) {
                bArr3 = new byte[4096];
                this.n = bArr3;
            }
            byte[] bArr4 = this.o;
            if (bArr4 == null) {
                bArr4 = new byte[4097];
                this.o = bArr4;
            }
            int d = d();
            int i30 = 1 << d;
            int i31 = i30 + 1;
            int i32 = i30 + 2;
            int i33 = d + 1;
            int i34 = (1 << i33) - 1;
            int i35 = 0;
            while (i35 < i30) {
                sArr[i35] = 0;
                bArr3[i35] = (byte) i35;
                i35++;
                i18 = i18;
            }
            int i36 = i18;
            byte[] bArr5 = this.b;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = i33;
            int i46 = i32;
            int i47 = i34;
            int i48 = i36;
            while (true) {
                if (i37 >= i) {
                    b = b2;
                    break;
                }
                if (i38 == 0) {
                    int d2 = d();
                    if (d2 <= 0) {
                        i38 = b2;
                        i11 = i37;
                        bArr = bArr5;
                    } else {
                        ByteBuffer byteBuffer = this.a;
                        i11 = i37;
                        bArr = bArr5;
                        i38 = d2;
                        byteBuffer.get(this.b, 0, Math.min(d2, byteBuffer.remaining()));
                    }
                    if (i38 <= 0) {
                        this.q = 3;
                        b = 0;
                        break;
                    }
                    i41 = 0;
                } else {
                    i11 = i37;
                    bArr = bArr5;
                }
                i40 += (bArr[i41] & 255) << i39;
                i41++;
                i38--;
                int i49 = i39 + 8;
                int i50 = i46;
                int i51 = i45;
                int i52 = i43;
                int i53 = i11;
                while (true) {
                    int i54 = i49;
                    if (i49 < i51) {
                        i43 = i52;
                        i45 = i51;
                        i37 = i53;
                        i39 = i54;
                        bArr5 = bArr;
                        b2 = 0;
                        i36 = -1;
                        break;
                    }
                    int i55 = i40 & i47;
                    i40 >>= i51;
                    int i56 = i54 - i51;
                    if (i55 == i30) {
                        i51 = i33;
                        i50 = i32;
                        i47 = i34;
                        i48 = i36;
                        i49 = i56;
                    } else {
                        if (i55 == i31) {
                            i43 = i52;
                            i45 = i51;
                            i37 = i53;
                            i39 = i56;
                            bArr5 = bArr;
                            b2 = 0;
                            break;
                        }
                        i53++;
                        int i57 = i42 + 1;
                        int i58 = i31;
                        if (i48 == i36) {
                            bArr2[i42] = bArr3[i55];
                            i52 = i55;
                            i48 = i52;
                            i49 = i56;
                            i42 = i57;
                        } else {
                            if (i55 >= i50) {
                                bArr4[i44] = (byte) i52;
                                i44++;
                                s = i48;
                            } else {
                                s = i55;
                            }
                            while (s >= i30) {
                                bArr4[i44] = bArr3[s];
                                s = sArr[s];
                                i44++;
                            }
                            int i59 = bArr3[s] & 255;
                            byte b3 = (byte) i59;
                            bArr2[i42] = b3;
                            i42 = i57;
                            while (i44 > 0) {
                                i44--;
                                bArr2[i42] = bArr4[i44];
                                i53++;
                                i42++;
                            }
                            if (i50 < 4096) {
                                sArr[i50] = (short) i48;
                                bArr3[i50] = b3;
                                i50++;
                                if ((i50 & i47) == 0 && i50 < 4096) {
                                    i47 += i50;
                                    i51++;
                                }
                            }
                            i52 = i59;
                            i48 = i55;
                            i49 = i56;
                        }
                        i31 = i58;
                        i36 = -1;
                    }
                }
                i46 = i50;
            }
            Arrays.fill(bArr2, i42, i, b);
            if (!basVar.e && this.r == 1) {
                int[] iArr5 = this.d;
                int i60 = basVar.d;
                int i61 = basVar.b;
                int i62 = basVar.c;
                int i63 = basVar.a;
                int i64 = this.e;
                int i65 = this.t;
                byte[] bArr6 = this.c;
                int[] iArr6 = this.k;
                int i66 = b;
                byte b4 = -1;
                while (i66 < i60) {
                    int i67 = (i66 + i61) * i65;
                    int i68 = i67 + i63;
                    int i69 = i68 + i62;
                    int i70 = i67 + i65;
                    int[] iArr7 = iArr5;
                    int i71 = basVar.c * i66;
                    int i72 = i68;
                    while (true) {
                        if (i70 < i69) {
                            i9 = i60;
                            i10 = i70;
                        } else {
                            i9 = i60;
                            i10 = i69;
                        }
                        if (i72 < i10) {
                            byte b5 = bArr6[i71];
                            int i73 = i72;
                            int i74 = b5 & 255;
                            if (i74 != b4) {
                                int i75 = iArr6[i74];
                                if (i75 != 0) {
                                    iArr7[i73] = i75;
                                } else {
                                    b4 = b5;
                                }
                            }
                            i72 = i73 + 1;
                            i71++;
                            i60 = i9;
                        }
                    }
                    i66++;
                    iArr5 = iArr7;
                    i60 = i9;
                }
                Boolean bool = this.h;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                    }
                    z = true;
                    this.h = Boolean.valueOf(z);
                    if (this.p || !((i8 = basVar.g) == 0 || i8 == 1)) {
                        iArr = iArr4;
                    } else {
                        Bitmap bitmap3 = this.g;
                        if (bitmap3 == null) {
                            bitmap3 = e();
                            this.g = bitmap3;
                        }
                        int i76 = this.t;
                        iArr = iArr4;
                        bitmap3.setPixels(iArr, 0, i76, 0, 0, i76, this.s);
                    }
                    Bitmap e = e();
                    int i77 = this.t;
                    e.setPixels(iArr, 0, i77, 0, 0, i77, this.s);
                    return e;
                }
                if (this.h == null && i64 == 0 && b4 != -1) {
                    z = true;
                    this.h = Boolean.valueOf(z);
                    if (this.p) {
                    }
                    iArr = iArr4;
                    Bitmap e2 = e();
                    int i772 = this.t;
                    e2.setPixels(iArr, 0, i772, 0, 0, i772, this.s);
                    return e2;
                }
                z = false;
                this.h = Boolean.valueOf(z);
                if (this.p) {
                }
                iArr = iArr4;
                Bitmap e22 = e();
                int i7722 = this.t;
                e22.setPixels(iArr, 0, i7722, 0, 0, i7722, this.s);
                return e22;
            }
            int[] iArr8 = this.d;
            int i78 = basVar.d;
            int i79 = this.r;
            int i80 = i78 / i79;
            int i81 = basVar.b / i79;
            int i82 = basVar.c / i79;
            int i83 = basVar.a / i79;
            int i84 = this.e;
            int i85 = this.t;
            int i86 = this.s;
            byte[] bArr7 = this.c;
            int[] iArr9 = this.k;
            Boolean bool2 = this.h;
            int i87 = 8;
            int i88 = 0;
            int i89 = 0;
            int i90 = 1;
            while (i89 < i80) {
                int i91 = i81;
                if (basVar.e) {
                    if (i88 >= i80) {
                        int i92 = i90 + 1;
                        i2 = i88;
                        if (i92 == 2) {
                            i2 = 4;
                        } else if (i92 == 3) {
                            i87 = 4;
                            i90 = i92;
                            i2 = 2;
                        } else if (i92 == 4) {
                            i90 = i92;
                            i87 = 2;
                            i2 = 1;
                        }
                        i90 = i92;
                    } else {
                        i2 = i88;
                    }
                    i88 = i2 + i87;
                } else {
                    i2 = i89;
                }
                int i93 = i2 + i91;
                if (i93 < i86) {
                    int i94 = i93 * i85;
                    int i95 = i94 + i83;
                    i3 = i88;
                    int i96 = i95 + i82;
                    int i97 = i94 + i85;
                    i4 = i80;
                    int i98 = i89 * i79 * basVar.c;
                    if (i97 < i96) {
                        i96 = i97;
                    }
                    if (i79 == 1) {
                        int i99 = i95;
                        while (i99 < i96) {
                            int i100 = i99;
                            int i101 = iArr9[bArr7[i98] & 255];
                            if (i101 != 0) {
                                iArr8[i100] = i101;
                            } else if (i84 == 0 && bool2 == null) {
                                bool2 = true;
                            }
                            i99 = i100 + 1;
                            i98++;
                        }
                    } else {
                        int i102 = i98 + ((i96 - i95) * i79);
                        int i103 = i95;
                        while (i103 < i96) {
                            int i104 = i96;
                            int i105 = basVar.c;
                            int i106 = i79;
                            int i107 = i98;
                            int i108 = 0;
                            int i109 = 0;
                            int i110 = 0;
                            int i111 = 0;
                            int i112 = 0;
                            while (true) {
                                if (i107 >= i98 + this.r) {
                                    i5 = i103;
                                    break;
                                }
                                byte[] bArr8 = this.c;
                                i5 = i103;
                                if (i107 >= bArr8.length || i107 >= i102) {
                                    break;
                                }
                                int i113 = this.k[bArr8[i107] & 255];
                                if (i113 != 0) {
                                    i7 = i107;
                                    i108 += (i113 >> 24) & 255;
                                    i109 += (i113 >> 16) & 255;
                                    i110 += (i113 >> 8) & 255;
                                    i111 += i113 & 255;
                                    i112++;
                                } else {
                                    i7 = i107;
                                }
                                i107 = i7 + 1;
                                i103 = i5;
                            }
                            int i114 = i98 + i105;
                            int i115 = i114;
                            while (i115 < this.r + i114) {
                                byte[] bArr9 = this.c;
                                int i116 = i114;
                                if (i115 >= bArr9.length || i115 >= i102) {
                                    break;
                                }
                                int i117 = this.k[bArr9[i115] & 255];
                                if (i117 != 0) {
                                    i6 = i102;
                                    i108 += (i117 >> 24) & 255;
                                    i109 += (i117 >> 16) & 255;
                                    i110 += (i117 >> 8) & 255;
                                    i111 += i117 & 255;
                                    i112++;
                                } else {
                                    i6 = i102;
                                }
                                i115++;
                                i114 = i116;
                                i102 = i6;
                            }
                            int i118 = i102;
                            int i119 = i112 == 0 ? 0 : ((i108 / i112) << 24) | ((i109 / i112) << 16) | ((i110 / i112) << 8) | (i111 / i112);
                            if (i119 != 0) {
                                iArr8[i5] = i119;
                            } else if (i84 == 0 && bool2 == null) {
                                bool2 = true;
                            }
                            i98 += i106;
                            i103 = i5 + 1;
                            i96 = i104;
                            i79 = i106;
                            i102 = i118;
                        }
                    }
                } else {
                    i3 = i88;
                    i4 = i80;
                }
                i89++;
                i81 = i91;
                i88 = i3;
                i80 = i4;
                i79 = i79;
            }
            if (this.h == null) {
                this.h = Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
            }
            if (this.p) {
            }
            iArr = iArr4;
            Bitmap e222 = e();
            int i77222 = this.t;
            e222.setPixels(iArr, 0, i77222, 0, 0, i77222, this.s);
            return e222;
        }
        return null;
    }

    @Override // defpackage.bar
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(bat batVar, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.Y(i, "Sample size must be >=0, not: "));
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.q = 0;
        this.f = batVar;
        this.e = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.p = false;
        Iterator it = batVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((bas) it.next()).g == 3) {
                this.p = true;
                break;
            }
        }
        this.r = highestOneBit;
        int i2 = batVar.f;
        this.t = i2 / highestOneBit;
        int i3 = batVar.g;
        this.s = i3 / highestOneBit;
        afr afrVar = this.j;
        this.c = afrVar.A(i2 * i3);
        this.d = (int[]) ((bek) afrVar.a).a(this.t * this.s, int[].class);
    }
}
