package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class id {

    /* renamed from: d, reason: collision with root package name */
    private static final String f8360d = "id";

    /* renamed from: a, reason: collision with root package name */
    int f8361a;

    /* renamed from: b, reason: collision with root package name */
    int f8362b;

    /* renamed from: c, reason: collision with root package name */
    Cif f8363c;
    private int[] e;
    private final int[] f;
    private ByteBuffer g;
    private byte[] h;

    @Nullable
    private byte[] i;
    private int j;
    private int k;
    private ig l;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private int[] q;
    private a r;
    private Bitmap s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private boolean y;

    interface a {
        @Nonnull
        Bitmap a(int i, int i2, Bitmap.Config config);

        byte[] a(int i);

        int[] b(int i);
    }

    id(a aVar, Cif cif, ByteBuffer byteBuffer) {
        this(aVar, cif, byteBuffer, (byte) 0);
    }

    private id(a aVar, Cif cif, ByteBuffer byteBuffer, byte b2) {
        this(aVar);
        b(cif, byteBuffer);
    }

    private id(a aVar) {
        this.f = new int[256];
        this.j = 0;
        this.k = 0;
        this.r = aVar;
        this.f8363c = new Cif();
    }

    id() {
        this(new ii());
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x036e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0222 A[Catch: all -> 0x03fa, LOOP:9: B:207:0x0220->B:208:0x0222, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0026, B:10:0x002b, B:13:0x0031, B:15:0x0044, B:16:0x0050, B:18:0x0054, B:19:0x005b, B:21:0x0061, B:25:0x006f, B:27:0x0073, B:28:0x0087, B:30:0x008b, B:33:0x0091, B:35:0x0095, B:37:0x0099, B:39:0x009d, B:41:0x00a5, B:45:0x00b5, B:46:0x00ae, B:48:0x00b2, B:49:0x00b9, B:51:0x00bd, B:53:0x00c1, B:54:0x00c5, B:55:0x00eb, B:57:0x00f1, B:59:0x00fa, B:60:0x0107, B:62:0x010d, B:64:0x011a, B:66:0x0120, B:67:0x0124, B:69:0x0128, B:70:0x012c, B:72:0x0130, B:73:0x0136, B:75:0x0147, B:81:0x0171, B:85:0x0177, B:180:0x017d, B:182:0x019a, B:218:0x01aa, B:189:0x01b3, B:194:0x01c7, B:197:0x01da, B:199:0x01ef, B:201:0x0204, B:205:0x0217, B:208:0x0222, B:88:0x026d, B:90:0x0275, B:95:0x0297, B:99:0x029e, B:100:0x02a0, B:105:0x02ab, B:106:0x02b0, B:108:0x02b5, B:110:0x02c2, B:111:0x02c5, B:113:0x02d8, B:115:0x02df, B:117:0x0384, B:119:0x0390, B:120:0x0387, B:123:0x038d, B:127:0x02ef, B:128:0x02fe, B:130:0x0303, B:133:0x030a, B:135:0x0318, B:137:0x0330, B:140:0x0335, B:141:0x0339, B:143:0x033e, B:146:0x0345, B:148:0x0351, B:150:0x0369, B:155:0x0370, B:161:0x039f, B:166:0x03b2, B:168:0x03b6, B:170:0x03ba, B:172:0x03bf, B:174:0x03c3, B:175:0x03c9, B:176:0x03d8, B:226:0x0112, B:227:0x0103, B:228:0x0057, B:231:0x03ed, B:234:0x0010), top: B:3:0x0003 }] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v39, types: [short] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized Bitmap a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        short s;
        int i10;
        if (this.f8363c.f8370c <= 0 || this.f8361a < 0) {
            Object[] objArr = {Integer.valueOf(this.f8363c.f8370c), Integer.valueOf(this.f8361a)};
            this.u = 1;
        }
        if (this.u != 1 && this.u != 2) {
            this.u = 0;
            ie ieVar = (ie) this.f8363c.e.get(this.f8361a);
            int i11 = this.f8361a - 1;
            ie ieVar2 = i11 >= 0 ? (ie) this.f8363c.e.get(i11) : null;
            this.e = ieVar.k != null ? ieVar.k : this.f8363c.f8368a;
            if (this.e == null) {
                new Object[1][0] = Integer.valueOf(this.f8361a);
                this.u = 1;
                return null;
            }
            if (ieVar.f) {
                System.arraycopy(this.e, 0, this.f, 0, this.e.length);
                this.e = this.f;
                this.e[ieVar.h] = 0;
            }
            int[] iArr = this.q;
            if (ieVar2 == null) {
                Arrays.fill(iArr, 0);
            }
            int i12 = 3;
            if (ieVar2 != null && ieVar2.g > 0) {
                if (ieVar2.g == 2) {
                    if (!ieVar.f) {
                        i10 = this.f8363c.l;
                        if (ieVar.k != null && this.f8363c.j == ieVar.h) {
                        }
                        a(iArr, ieVar2, i10);
                    } else if (this.f8361a == 0) {
                        this.y = true;
                    }
                    i10 = 0;
                    a(iArr, ieVar2, i10);
                } else if (ieVar2.g == 3) {
                    if (this.s == null) {
                        a(iArr, ieVar2, 0);
                    } else {
                        int i13 = ieVar2.f8367d / this.v;
                        int i14 = ieVar2.f8365b / this.v;
                        int i15 = ieVar2.f8366c / this.v;
                        int i16 = ieVar2.f8364a / this.v;
                        this.s.getPixels(iArr, (this.x * i14) + i16, this.x, i16, i14, i15, i13);
                    }
                }
            }
            this.j = 0;
            this.k = 0;
            if (ieVar != null) {
                this.g.position(ieVar.j);
            }
            if (ieVar == null) {
                i = this.f8363c.f;
                i2 = this.f8363c.g;
            } else {
                i = ieVar.f8366c;
                i2 = ieVar.f8367d;
            }
            int i17 = i * i2;
            if (this.p == null || this.p.length < i17) {
                this.p = this.r.a(i17);
            }
            if (this.m == null) {
                this.m = new short[4096];
            }
            if (this.n == null) {
                this.n = new byte[4096];
            }
            if (this.o == null) {
                this.o = new byte[4097];
            }
            int c2 = c();
            int i18 = 1 << c2;
            int i19 = i18 + 1;
            int i20 = i18 + 2;
            int i21 = c2 + 1;
            int i22 = (1 << i21) - 1;
            for (int i23 = 0; i23 < i18; i23++) {
                this.m[i23] = 0;
                this.n[i23] = (byte) i23;
            }
            int i24 = -1;
            int i25 = i21;
            int i26 = i20;
            int i27 = i22;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = -1;
            int i35 = 0;
            int i36 = 0;
            while (true) {
                if (i28 >= i17) {
                    break;
                }
                if (i29 == 0) {
                    i29 = d();
                    if (i29 <= 0) {
                        this.u = i12;
                        break;
                    }
                    i31 = 0;
                }
                i30 += (this.h[i31] & 255) << i32;
                i31++;
                i29 += i24;
                int i37 = i32 + 8;
                int i38 = i26;
                int i39 = i34;
                int i40 = i35;
                int i41 = i28;
                int i42 = i25;
                while (i37 >= i42) {
                    int i43 = i30 & i27;
                    i30 >>= i42;
                    i37 -= i42;
                    if (i43 != i18) {
                        if (i43 > i38) {
                            this.u = i12;
                        } else if (i43 != i19) {
                            if (i39 == -1) {
                                this.o[i36] = this.n[i43 == true ? 1 : 0];
                                i39 = i43 == true ? 1 : 0;
                                i40 = i39;
                                i36++;
                            } else {
                                if (i43 >= i38) {
                                    byte[] bArr = this.o;
                                    i9 = i36 + 1;
                                    i8 = i43 == true ? 1 : 0;
                                    bArr[i36] = (byte) i40;
                                    s = i39;
                                } else {
                                    i8 = i43 == true ? 1 : 0;
                                    i9 = i36;
                                    s = i43;
                                }
                                while (s >= i18) {
                                    this.o[i9] = this.n[s];
                                    s = this.m[s];
                                    i9++;
                                    i37 = i37;
                                }
                                int i44 = i37;
                                int i45 = this.n[s] & 255;
                                int i46 = i9 + 1;
                                byte b2 = (byte) i45;
                                this.o[i9] = b2;
                                if (i38 < 4096) {
                                    this.m[i38] = (short) i39;
                                    this.n[i38] = b2;
                                    i38++;
                                    if ((i38 & i27) == 0) {
                                        if (i38 < 4096) {
                                            i42++;
                                            i27 += i38;
                                        }
                                        i36 = i46;
                                        while (i36 > 0) {
                                            i36--;
                                            this.p[i33] = this.o[i36];
                                            i41++;
                                            i33++;
                                        }
                                        i40 = i45;
                                        i39 = i8;
                                        i37 = i44;
                                    }
                                }
                                i36 = i46;
                                while (i36 > 0) {
                                }
                                i40 = i45;
                                i39 = i8;
                                i37 = i44;
                            }
                            i12 = 3;
                        }
                        i35 = i40;
                        i26 = i38;
                        i34 = i39;
                        i25 = i42;
                        i28 = i41;
                        i32 = i37;
                        i24 = -1;
                        i12 = 3;
                        break;
                    }
                    i42 = i21;
                    i38 = i20;
                    i27 = i22;
                    i39 = -1;
                }
                i35 = i40;
                i26 = i38;
                i34 = i39;
                i25 = i42;
                i28 = i41;
                i24 = -1;
                i32 = i37;
            }
            for (int i47 = i33; i47 < i17; i47++) {
                this.p[i47] = 0;
            }
            int i48 = ieVar.f8367d / this.v;
            int i49 = ieVar.f8365b / this.v;
            int i50 = ieVar.f8366c / this.v;
            int i51 = ieVar.f8364a / this.v;
            boolean z = this.f8361a == 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 1;
            int i55 = 8;
            while (i52 < i48) {
                if (ieVar.e) {
                    if (i53 >= i48) {
                        i54++;
                        switch (i54) {
                            case 2:
                                i53 = 4;
                                break;
                            case 3:
                                i53 = 2;
                                i55 = 4;
                                break;
                            case 4:
                                i53 = 1;
                                i55 = 2;
                                break;
                        }
                    }
                    i3 = i53 + i55;
                } else {
                    i3 = i53;
                    i53 = i52;
                }
                int i56 = i53 + i49;
                if (i56 < this.w) {
                    int i57 = i56 * this.x;
                    int i58 = i57 + i51;
                    int i59 = i58 + i50;
                    if (this.x + i57 < i59) {
                        i59 = this.x + i57;
                    }
                    int i60 = this.v * i52 * ieVar.f8366c;
                    i4 = i48;
                    int i61 = ((i59 - i58) * this.v) + i60;
                    while (i58 < i59) {
                        int i62 = i49;
                        if (this.v == 1) {
                            i7 = this.e[this.p[i60] & 255];
                            i5 = i50;
                            i6 = i51;
                        } else {
                            int i63 = ieVar.f8366c;
                            i5 = i50;
                            int i64 = i60;
                            int i65 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            int i68 = 0;
                            int i69 = 0;
                            while (i64 < this.v + i60 && i64 < this.p.length && i64 < i61) {
                                int i70 = i51;
                                int i71 = this.e[this.p[i64] & 255];
                                if (i71 != 0) {
                                    i65 += (i71 >> 24) & 255;
                                    i66 += (i71 >> 16) & 255;
                                    i67 += (i71 >> 8) & 255;
                                    i68 += i71 & 255;
                                    i69++;
                                }
                                i64++;
                                i51 = i70;
                            }
                            i6 = i51;
                            int i72 = i63 + i60;
                            for (int i73 = i72; i73 < this.v + i72 && i73 < this.p.length && i73 < i61; i73++) {
                                int i74 = this.e[this.p[i73] & 255];
                                if (i74 != 0) {
                                    i65 += (i74 >> 24) & 255;
                                    i66 += (i74 >> 16) & 255;
                                    i67 += (i74 >> 8) & 255;
                                    i68 += i74 & 255;
                                    i69++;
                                }
                            }
                            i7 = ((i65 / i69) << 24) | ((i66 / i69) << 16) | ((i67 / i69) << 8) | (i68 / i69);
                        }
                        if (i7 != 0) {
                            iArr[i58] = i7;
                        } else if (!this.y && z) {
                            this.y = true;
                        }
                        i60 += this.v;
                        i58++;
                        i49 = i62;
                        i50 = i5;
                        i51 = i6;
                    }
                } else {
                    i4 = i48;
                }
                i52++;
                i53 = i3;
                i48 = i4;
                i49 = i49;
                i50 = i50;
                i51 = i51;
            }
            if (this.t && (ieVar.g == 0 || ieVar.g == 1)) {
                if (this.s == null) {
                    this.s = e();
                }
                this.s.setPixels(iArr, 0, this.x, 0, 0, this.x, this.w);
            }
            Bitmap e = e();
            e.setPixels(iArr, 0, this.x, 0, 0, this.x, this.w);
            return e;
        }
        new Object[1][0] = Integer.valueOf(this.u);
        return null;
    }

    private synchronized void a(Cif cif, byte[] bArr) {
        a(cif, ByteBuffer.wrap(bArr));
    }

    private synchronized void a(Cif cif, ByteBuffer byteBuffer) {
        b(cif, byteBuffer);
    }

    private synchronized void b(Cif cif, ByteBuffer byteBuffer) {
        int highestOneBit = Integer.highestOneBit(1);
        this.u = 0;
        this.f8363c = cif;
        this.y = false;
        this.f8361a = -1;
        this.f8362b = 0;
        this.g = byteBuffer.asReadOnlyBuffer();
        this.g.position(0);
        this.g.order(ByteOrder.LITTLE_ENDIAN);
        this.t = false;
        Iterator it = cif.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((ie) it.next()).g == 3) {
                this.t = true;
                break;
            }
        }
        this.v = highestOneBit;
        this.x = cif.f / highestOneBit;
        this.w = cif.g / highestOneBit;
        this.p = this.r.a(cif.f * cif.g);
        this.q = this.r.b(this.x * this.w);
    }

    private void a(int[] iArr, ie ieVar, int i) {
        int i2 = ieVar.f8367d / this.v;
        int i3 = ieVar.f8365b / this.v;
        int i4 = ieVar.f8366c / this.v;
        int i5 = (i3 * this.x) + (ieVar.f8364a / this.v);
        int i6 = (i2 * this.x) + i5;
        while (i5 < i6) {
            int i7 = i5 + i4;
            for (int i8 = i5; i8 < i7; i8++) {
                iArr[i8] = i;
            }
            i5 += this.x;
        }
    }

    private void b() {
        if (this.j > this.k) {
            return;
        }
        if (this.i == null) {
            this.i = this.r.a(16384);
        }
        this.k = 0;
        this.j = Math.min(this.g.remaining(), 16384);
        this.g.get(this.i, 0, this.j);
    }

    private int c() {
        try {
            b();
            byte[] bArr = this.i;
            int i = this.k;
            this.k = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.u = 1;
            return 0;
        }
    }

    private int d() {
        int c2 = c();
        if (c2 > 0) {
            try {
                if (this.h == null) {
                    this.h = this.r.a(255);
                }
                int i = this.j - this.k;
                if (i >= c2) {
                    System.arraycopy(this.i, this.k, this.h, 0, c2);
                    this.k += c2;
                } else if (this.g.remaining() + i >= c2) {
                    System.arraycopy(this.i, this.k, this.h, 0, i);
                    this.k = this.j;
                    b();
                    int i2 = c2 - i;
                    System.arraycopy(this.i, 0, this.h, i, i2);
                    this.k += i2;
                } else {
                    this.u = 1;
                }
            } catch (Exception e) {
                new Object[1][0] = e;
                this.u = 1;
            }
        }
        return c2;
    }

    private Bitmap e() {
        Bitmap a2 = this.r.a(this.x, this.w, this.y ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        if (Build.VERSION.SDK_INT >= 12) {
            a2.setHasAlpha(true);
        }
        return a2;
    }

    final synchronized int a(byte[] bArr) {
        if (this.l == null) {
            this.l = new ig();
        }
        this.f8363c = this.l.a(bArr).a();
        if (bArr != null) {
            a(this.f8363c, bArr);
        }
        return this.u;
    }
}
