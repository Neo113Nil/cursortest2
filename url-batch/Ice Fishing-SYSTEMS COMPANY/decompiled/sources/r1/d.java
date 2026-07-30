package r1;

import S0.e;
import android.graphics.Bitmap;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.C3112dq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f40259a;

    /* renamed from: c, reason: collision with root package name */
    public final e f40261c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f40262d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f40263e;

    /* renamed from: f, reason: collision with root package name */
    public short[] f40264f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f40265g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40266h;
    public byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f40267j;

    /* renamed from: k, reason: collision with root package name */
    public int f40268k;

    /* renamed from: l, reason: collision with root package name */
    public b f40269l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f40270m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f40271n;

    /* renamed from: o, reason: collision with root package name */
    public int f40272o;

    /* renamed from: p, reason: collision with root package name */
    public final int f40273p;

    /* renamed from: q, reason: collision with root package name */
    public final int f40274q;

    /* renamed from: r, reason: collision with root package name */
    public final int f40275r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f40276s;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f40260b = new int[256];

    /* renamed from: t, reason: collision with root package name */
    public Bitmap.Config f40277t = Bitmap.Config.ARGB_8888;

    public d(e eVar, b bVar, ByteBuffer byteBuffer, int i) {
        this.f40261c = eVar;
        this.f40269l = new b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.f40272o = 0;
                this.f40269l = bVar;
                this.f40268k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f40262d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f40262d.order(ByteOrder.LITTLE_ENDIAN);
                this.f40271n = false;
                Iterator it = bVar.f40249e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((C4956a) it.next()).f40241g == 3) {
                        this.f40271n = true;
                        break;
                    }
                }
                this.f40273p = highestOneBit;
                int i4 = bVar.f40250f;
                this.f40275r = i4 / highestOneBit;
                int i9 = bVar.f40251g;
                this.f40274q = i9 / highestOneBit;
                int i10 = i4 * i9;
                C3112dq c3112dq = (C3112dq) this.f40261c.f2892v;
                this.i = c3112dq == null ? new byte[i10] : (byte[]) c3112dq.f(i10, byte[].class);
                e eVar2 = this.f40261c;
                int i11 = this.f40275r * this.f40274q;
                C3112dq c3112dq2 = (C3112dq) eVar2.f2892v;
                this.f40267j = c3112dq2 == null ? new int[i11] : (int[]) c3112dq2.f(i11, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f40276s;
        Bitmap c4 = ((InterfaceC5117a) this.f40261c.f2891u).c(this.f40275r, this.f40274q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f40277t);
        c4.setHasAlpha(true);
        return c4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0040, B:14:0x004a, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:20:0x005e, B:21:0x0068, B:23:0x0079, B:24:0x0085, B:27:0x008e, B:29:0x0092, B:31:0x009a, B:32:0x00ad, B:36:0x00b1, B:38:0x00b5, B:40:0x00c7, B:42:0x00cb, B:43:0x00cf, B:46:0x008a, B:48:0x00d5, B:50:0x00dd, B:53:0x0017, B:55:0x001f, B:56:0x003e), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap b() {
        int i;
        int[] iArr;
        try {
            if (this.f40269l.f40247c > 0) {
                if (this.f40268k < 0) {
                }
                i = this.f40272o;
                if (i != 1 && i != 2) {
                    this.f40272o = 0;
                    if (this.f40263e == null) {
                        C3112dq c3112dq = (C3112dq) this.f40261c.f2892v;
                        this.f40263e = c3112dq == null ? new byte[p.f8630b] : (byte[]) c3112dq.f(p.f8630b, byte[].class);
                    }
                    C4956a c4956a = (C4956a) this.f40269l.f40249e.get(this.f40268k);
                    int i4 = this.f40268k - 1;
                    C4956a c4956a2 = i4 < 0 ? (C4956a) this.f40269l.f40249e.get(i4) : null;
                    iArr = c4956a.f40244k;
                    if (iArr != null) {
                        iArr = this.f40269l.f40245a;
                    }
                    this.f40259a = iArr;
                    if (iArr != null) {
                        if (Log.isLoggable("d", 3)) {
                            Log.d("d", "No valid color table found for frame #" + this.f40268k);
                        }
                        this.f40272o = 1;
                        return null;
                    }
                    if (c4956a.f40240f) {
                        System.arraycopy(iArr, 0, this.f40260b, 0, iArr.length);
                        int[] iArr2 = this.f40260b;
                        this.f40259a = iArr2;
                        iArr2[c4956a.f40242h] = 0;
                        if (c4956a.f40241g == 2 && this.f40268k == 0) {
                            this.f40276s = Boolean.TRUE;
                        }
                    }
                    return d(c4956a, c4956a2);
                }
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, status=" + this.f40272o);
                }
                return null;
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, frameCount=" + this.f40269l.f40247c + ", framePointer=" + this.f40268k);
            }
            this.f40272o = 1;
            i = this.f40272o;
            if (i != 1) {
                this.f40272o = 0;
                if (this.f40263e == null) {
                }
                C4956a c4956a3 = (C4956a) this.f40269l.f40249e.get(this.f40268k);
                int i42 = this.f40268k - 1;
                if (i42 < 0) {
                }
                iArr = c4956a3.f40244k;
                if (iArr != null) {
                }
                this.f40259a = iArr;
                if (iArr != null) {
                }
            }
            if (Log.isLoggable("d", 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f40277t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r4.f40253j == r36.f40242h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(C4956a c4956a, C4956a c4956a2) {
        int[] iArr;
        byte b9;
        int i;
        int i4;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        short[] sArr;
        short s3;
        short s6;
        int i12;
        Bitmap bitmap;
        int i13;
        int i14;
        int i15;
        int[] iArr3 = this.f40267j;
        e eVar = this.f40261c;
        byte b10 = 0;
        if (c4956a2 == null) {
            Bitmap bitmap2 = this.f40270m;
            if (bitmap2 != null) {
                ((InterfaceC5117a) eVar.f2891u).d(bitmap2);
            }
            this.f40270m = null;
            Arrays.fill(iArr3, 0);
        }
        if (c4956a2 != null && c4956a2.f40241g == 3 && this.f40270m == null) {
            Arrays.fill(iArr3, 0);
        }
        if (c4956a2 != null && (i12 = c4956a2.f40241g) > 0) {
            if (i12 == 2) {
                if (!c4956a.f40240f) {
                    b bVar = this.f40269l;
                    i13 = bVar.f40254k;
                    if (c4956a.f40244k != null) {
                    }
                    int i16 = c4956a2.f40238d;
                    int i17 = this.f40273p;
                    int i18 = i16 / i17;
                    int i19 = c4956a2.f40236b / i17;
                    int i20 = c4956a2.f40237c / i17;
                    int i21 = c4956a2.f40235a / i17;
                    int i22 = this.f40275r;
                    i14 = (i19 * i22) + i21;
                    i15 = (i18 * i22) + i14;
                    while (i14 < i15) {
                        int i23 = i14 + i20;
                        for (int i24 = i14; i24 < i23; i24++) {
                            iArr3[i24] = i13;
                        }
                        i14 += this.f40275r;
                    }
                }
                i13 = 0;
                int i162 = c4956a2.f40238d;
                int i172 = this.f40273p;
                int i182 = i162 / i172;
                int i192 = c4956a2.f40236b / i172;
                int i202 = c4956a2.f40237c / i172;
                int i212 = c4956a2.f40235a / i172;
                int i222 = this.f40275r;
                i14 = (i192 * i222) + i212;
                i15 = (i182 * i222) + i14;
                while (i14 < i15) {
                }
            } else if (i12 == 3 && (bitmap = this.f40270m) != null) {
                int i25 = this.f40275r;
                bitmap.getPixels(iArr3, 0, i25, 0, 0, i25, this.f40274q);
            }
        }
        int[] iArr4 = iArr3;
        this.f40262d.position(c4956a.f40243j);
        int i26 = c4956a.f40237c * c4956a.f40238d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i26) {
            C3112dq c3112dq = (C3112dq) eVar.f2892v;
            this.i = c3112dq == null ? new byte[i26] : (byte[]) c3112dq.f(i26, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f40264f == null) {
            this.f40264f = new short[4096];
        }
        short[] sArr2 = this.f40264f;
        if (this.f40265g == null) {
            this.f40265g = new byte[4096];
        }
        byte[] bArr3 = this.f40265g;
        if (this.f40266h == null) {
            this.f40266h = new byte[4097];
        }
        byte[] bArr4 = this.f40266h;
        int i27 = this.f40262d.get() & 255;
        int i28 = 1;
        int i29 = 1 << i27;
        int i30 = i29 + 1;
        int i31 = i29 + 2;
        int i32 = i27 + 1;
        int i33 = (1 << i32) - 1;
        int i34 = 0;
        while (i34 < i29) {
            sArr2[i34] = 0;
            bArr3[i34] = (byte) i34;
            i34++;
            i28 = i28;
        }
        int i35 = i28;
        byte[] bArr5 = this.f40263e;
        int i36 = i32;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = i31;
        int i46 = i33;
        short s9 = -1;
        while (true) {
            if (i37 >= i26) {
                iArr = iArr4;
                b9 = b10;
                break;
            }
            if (i38 == 0) {
                s3 = -1;
                int i47 = this.f40262d.get() & 255;
                if (i47 <= 0) {
                    iArr = iArr4;
                    sArr = sArr2;
                } else {
                    ByteBuffer byteBuffer = this.f40262d;
                    iArr = iArr4;
                    sArr = sArr2;
                    byteBuffer.get(this.f40263e, 0, Math.min(i47, byteBuffer.remaining()));
                }
                if (i47 <= 0) {
                    this.f40272o = 3;
                    b9 = 0;
                    break;
                }
                i38 = i47;
                i39 = 0;
            } else {
                iArr = iArr4;
                sArr = sArr2;
                s3 = -1;
            }
            i41 += (bArr5[i39] & 255) << i40;
            i39++;
            i38--;
            int i48 = i40 + 8;
            int i49 = i45;
            int i50 = i36;
            short s10 = s9;
            int i51 = i43;
            while (true) {
                i40 = i48;
                if (i48 < i50) {
                    i36 = i50;
                    s9 = s10;
                    i43 = i51;
                    iArr4 = iArr;
                    b10 = 0;
                    i45 = i49;
                    sArr2 = sArr;
                    break;
                }
                int i52 = i41 & i46;
                i41 >>= i50;
                i40 -= i50;
                if (i52 == i29) {
                    i50 = i32;
                    i49 = i31;
                    i46 = i33;
                    i48 = i40;
                    s10 = s3;
                } else {
                    if (i52 == i30) {
                        i45 = i49;
                        i36 = i50;
                        s9 = s10;
                        i43 = i51;
                        iArr4 = iArr;
                        sArr2 = sArr;
                        b10 = 0;
                        break;
                    }
                    int i53 = i37;
                    if (s10 == s3) {
                        bArr2[i42] = bArr3[i52 == true ? 1 : 0];
                        i42++;
                        i37 = i53 + 1;
                        s10 = i52 == true ? 1 : 0;
                        i51 = s10;
                        i48 = i40;
                    } else {
                        if (i52 >= i49) {
                            bArr4[i44] = (byte) i51;
                            i44++;
                            s6 = s10;
                        } else {
                            s6 = i52 == true ? 1 : 0;
                        }
                        while (s6 >= i29) {
                            bArr4[i44] = bArr3[s6];
                            i44++;
                            s6 = sArr[s6];
                        }
                        i51 = bArr3[s6] & 255;
                        byte b11 = (byte) i51;
                        bArr2[i42] = b11;
                        while (true) {
                            i42++;
                            i53++;
                            if (i44 <= 0) {
                                break;
                            }
                            i44--;
                            bArr2[i42] = bArr4[i44];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = s10;
                            bArr3[i49] = b11;
                            i49++;
                            if ((i49 & i46) == 0 && i49 < 4096) {
                                i50++;
                                i46 += i49;
                            }
                        }
                        i48 = i40;
                        i37 = i53;
                        s10 = i52 == true ? 1 : 0;
                    }
                    s3 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i42, i26, b9);
        if (c4956a.f40239e || this.f40273p != i35) {
            int[] iArr5 = this.f40267j;
            int i54 = c4956a.f40238d;
            int i55 = this.f40273p;
            int i56 = i54 / i55;
            int i57 = c4956a.f40236b / i55;
            int i58 = c4956a.f40237c / i55;
            int i59 = c4956a.f40235a / i55;
            boolean z8 = this.f40268k == 0;
            int i60 = this.f40275r;
            int i61 = this.f40274q;
            byte[] bArr6 = this.i;
            int[] iArr6 = this.f40259a;
            Boolean bool = this.f40276s;
            int i62 = 8;
            int i63 = 0;
            int i64 = 1;
            int i65 = 0;
            while (i65 < i56) {
                int[] iArr7 = iArr5;
                if (c4956a.f40239e) {
                    if (i63 >= i56) {
                        i64++;
                        if (i64 == 2) {
                            i63 = 4;
                        } else if (i64 == 3) {
                            i62 = 4;
                            i63 = 2;
                        } else if (i64 == 4) {
                            i63 = 1;
                            i62 = 2;
                        }
                    }
                    i = i63 + i62;
                } else {
                    i = i63;
                    i63 = i65;
                }
                int i66 = i63 + i57;
                int i67 = i;
                boolean z9 = i55 == 1;
                if (i66 < i61) {
                    int i68 = i66 * i60;
                    int i69 = i68 + i59;
                    boolean z10 = z9;
                    int i70 = i69 + i58;
                    int i71 = i68 + i60;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    i4 = i56;
                    int i72 = i65 * i55 * c4956a.f40237c;
                    if (z10) {
                        int i73 = i69;
                        while (i73 < i70) {
                            int i74 = i73;
                            int i75 = iArr6[bArr6[i72] & p.f8630b];
                            if (i75 != 0) {
                                iArr7[i74] = i75;
                            } else if (z8 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i55;
                            i73 = i74 + 1;
                        }
                    } else {
                        int i76 = ((i70 - i69) * i55) + i72;
                        i9 = i55;
                        int i77 = i69;
                        while (i77 < i70) {
                            int i78 = i70;
                            int i79 = c4956a.f40237c;
                            int i80 = i77;
                            int i81 = i72;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            while (true) {
                                if (i81 >= this.f40273p + i72) {
                                    i10 = i57;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i10 = i57;
                                if (i81 >= bArr7.length || i81 >= i76) {
                                    break;
                                }
                                int i87 = this.f40259a[bArr7[i81] & p.f8630b];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & p.f8630b;
                                    i83 += (i87 >> 16) & p.f8630b;
                                    i84 += (i87 >> 8) & p.f8630b;
                                    i85 += i87 & p.f8630b;
                                    i86++;
                                }
                                i81++;
                                i57 = i10;
                            }
                            int i88 = i72 + i79;
                            int i89 = i88;
                            while (i89 < this.f40273p + i88) {
                                byte[] bArr8 = this.i;
                                int i90 = i88;
                                if (i89 >= bArr8.length || i89 >= i76) {
                                    break;
                                }
                                int i91 = this.f40259a[bArr8[i89] & p.f8630b];
                                if (i91 != 0) {
                                    i82 += (i91 >> 24) & p.f8630b;
                                    i83 += (i91 >> 16) & p.f8630b;
                                    i84 += (i91 >> 8) & p.f8630b;
                                    i85 += i91 & p.f8630b;
                                    i86++;
                                }
                                i89++;
                                i88 = i90;
                            }
                            int i92 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                            if (i92 != 0) {
                                iArr7[i80] = i92;
                            } else if (z8 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i9;
                            i77 = i80 + 1;
                            i70 = i78;
                            i57 = i10;
                        }
                        i65++;
                        iArr5 = iArr7;
                        i63 = i67;
                        i55 = i9;
                        i56 = i4;
                        i57 = i57;
                    }
                } else {
                    i4 = i56;
                }
                i9 = i55;
                i65++;
                iArr5 = iArr7;
                i63 = i67;
                i55 = i9;
                i56 = i4;
                i57 = i57;
            }
            if (this.f40276s == null) {
                this.f40276s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr8 = this.f40267j;
            int i93 = c4956a.f40238d;
            int i94 = c4956a.f40236b;
            int i95 = c4956a.f40237c;
            int i96 = c4956a.f40235a;
            byte b12 = this.f40268k == 0 ? (byte) 1 : b9;
            int i97 = this.f40275r;
            byte[] bArr9 = this.i;
            int[] iArr9 = this.f40259a;
            int i98 = -1;
            for (int i99 = b9; i99 < i93; i99++) {
                int i100 = (i99 + i94) * i97;
                int i101 = i100 + i96;
                int i102 = i101 + i95;
                int i103 = i100 + i97;
                if (i103 < i102) {
                    i102 = i103;
                }
                int i104 = c4956a.f40237c * i99;
                while (i101 < i102) {
                    int[] iArr10 = iArr8;
                    int i105 = bArr9[i104];
                    int i106 = i93;
                    int i107 = i105 & p.f8630b;
                    if (i107 != i98) {
                        int i108 = iArr9[i107];
                        if (i108 != 0) {
                            iArr10[i101] = i108;
                        } else {
                            i98 = i105;
                        }
                    }
                    i104++;
                    i101++;
                    iArr8 = iArr10;
                    i93 = i106;
                }
            }
            Boolean bool2 = this.f40276s;
            this.f40276s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f40276s != null || b12 == 0 || i98 == -1));
        }
        if (this.f40271n && ((i11 = c4956a.f40241g) == 0 || i11 == 1)) {
            if (this.f40270m == null) {
                this.f40270m = a();
            }
            Bitmap bitmap3 = this.f40270m;
            int i109 = this.f40275r;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i109, 0, 0, i109, this.f40274q);
        } else {
            iArr2 = iArr;
        }
        Bitmap a9 = a();
        int i110 = this.f40275r;
        a9.setPixels(iArr2, 0, i110, 0, 0, i110, this.f40274q);
        return a9;
    }
}
