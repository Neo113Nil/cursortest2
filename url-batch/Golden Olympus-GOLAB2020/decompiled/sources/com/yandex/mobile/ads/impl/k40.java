package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.uu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class k40 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f27997h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f27998i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f27999j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f28000a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f28001b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f28002c;

    /* renamed from: d, reason: collision with root package name */
    private final b f28003d;

    /* renamed from: e, reason: collision with root package name */
    private final a f28004e;

    /* renamed from: f, reason: collision with root package name */
    private final h f28005f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f28006g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f28007a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f28008b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f28009c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f28010d;

        public a(int i4, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f28007a = i4;
            this.f28008b = iArr;
            this.f28009c = iArr2;
            this.f28010d = iArr3;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28011a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28012b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28013c;

        /* renamed from: d, reason: collision with root package name */
        public final int f28014d;

        /* renamed from: e, reason: collision with root package name */
        public final int f28015e;

        /* renamed from: f, reason: collision with root package name */
        public final int f28016f;

        public b(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f28011a = i4;
            this.f28012b = i5;
            this.f28013c = i6;
            this.f28014d = i7;
            this.f28015e = i8;
            this.f28016f = i9;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f28017a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28018b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f28019c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f28020d;

        public c(int i4, boolean z4, byte[] bArr, byte[] bArr2) {
            this.f28017a = i4;
            this.f28018b = z4;
            this.f28019c = bArr;
            this.f28020d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f28021a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28022b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f28023c;

        public d(int i4, int i5, SparseArray sparseArray) {
            this.f28021a = i4;
            this.f28022b = i5;
            this.f28023c = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f28024a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28025b;

        public e(int i4, int i5) {
            this.f28024a = i4;
            this.f28025b = i5;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f28026a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28027b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28028c;

        /* renamed from: d, reason: collision with root package name */
        public final int f28029d;

        /* renamed from: e, reason: collision with root package name */
        public final int f28030e;

        /* renamed from: f, reason: collision with root package name */
        public final int f28031f;

        /* renamed from: g, reason: collision with root package name */
        public final int f28032g;

        /* renamed from: h, reason: collision with root package name */
        public final int f28033h;

        /* renamed from: i, reason: collision with root package name */
        public final int f28034i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f28035j;

        public f(int i4, boolean z4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, SparseArray sparseArray) {
            this.f28026a = i4;
            this.f28027b = z4;
            this.f28028c = i5;
            this.f28029d = i6;
            this.f28030e = i7;
            this.f28031f = i8;
            this.f28032g = i9;
            this.f28033h = i10;
            this.f28034i = i11;
            this.f28035j = sparseArray;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f28036a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28037b;

        public g(int i4, int i5) {
            this.f28036a = i4;
            this.f28037b = i5;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f28038a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28039b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f28040c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f28041d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f28042e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f28043f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f28044g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public b f28045h;

        /* renamed from: i, reason: collision with root package name */
        public d f28046i;

        public h(int i4, int i5) {
            this.f28038a = i4;
            this.f28039b = i5;
        }
    }

    public k40(int i4, int i5) {
        Paint paint = new Paint();
        this.f28000a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f28001b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f28002c = new Canvas();
        this.f28003d = new b(719, 575, 0, 719, 0, 575);
        this.f28004e = new a(0, a(), b(), c());
        this.f28005f = new h(i4, i5);
    }

    private static int a(int i4, int i5, int i6, int i7) {
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i4 = 1; i4 < 16; i4++) {
            if (i4 < 8) {
                iArr[i4] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i4 & 1) != 0 ? 255 : 0, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i4] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i4 & 1) != 0 ? 127 : 0, (i4 & 2) != 0 ? 127 : 0, (i4 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i4 < 8) {
                int i6 = (i4 & 1) != 0 ? 255 : 0;
                int i7 = (i4 & 2) != 0 ? 255 : 0;
                if ((i4 & 4) == 0) {
                    i5 = 0;
                }
                iArr[i4] = a(63, i6, i7, i5);
            } else {
                int i8 = i4 & 136;
                if (i8 == 0) {
                    iArr[i4] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i4] = a(127, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i4] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i4 & 1) != 0 ? 43 : 0) + 127 + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + 127 + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + 127 + ((i4 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i4] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i4 & 1) != 0 ? 43 : 0) + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + ((i4 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public final void d() {
        h hVar = this.f28005f;
        hVar.f28040c.clear();
        hVar.f28041d.clear();
        hVar.f28042e.clear();
        hVar.f28043f.clear();
        hVar.f28044g.clear();
        hVar.f28045h = null;
        hVar.f28046i = null;
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b A[LOOP:3: B:83:0x0181->B:95:0x021b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0214 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte[] bArr, int[] iArr, int i4, int i5, int i6, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z4;
        int b4;
        char c4;
        boolean z5;
        int i7;
        int i8;
        int b5;
        int b6;
        int i9;
        byte[] bArr4;
        int i10;
        int b7;
        int b8;
        boolean z6;
        int i11;
        int i12;
        int i13;
        int b9;
        int i14;
        Paint paint2 = paint;
        rf1 rf1Var = new rf1(bArr.length, bArr);
        int i15 = i5;
        int i16 = i6;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (rf1Var.b() != 0) {
            int b10 = rf1Var.b(8);
            if (b10 != 240) {
                int i17 = 4;
                int i18 = 2;
                int i19 = 1;
                switch (b10) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = f27997h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            z4 = false;
                            while (true) {
                                b4 = rf1Var.b(2);
                                if (b4 != 0) {
                                }
                                z5 = z4;
                                c4 = 4;
                                if (i8 != 0) {
                                }
                                i9 = i15;
                                i15 = i9 + i8;
                                if (z5) {
                                }
                                paint2 = paint;
                                z4 = z5;
                            }
                        } else if (bArr5 == null) {
                            bArr3 = f27998i;
                            bArr2 = bArr3;
                            z4 = false;
                            while (true) {
                                b4 = rf1Var.b(2);
                                if (b4 != 0) {
                                    i8 = 1;
                                    i7 = b4;
                                } else {
                                    if (rf1Var.f()) {
                                        b5 = rf1Var.b(3) + 3;
                                        b6 = rf1Var.b(2);
                                    } else {
                                        if (rf1Var.f()) {
                                            i8 = 1;
                                            z5 = z4;
                                            i7 = 0;
                                        } else {
                                            int b11 = rf1Var.b(2);
                                            if (b11 == 0) {
                                                c4 = 4;
                                                z5 = true;
                                                i7 = 0;
                                                i8 = 0;
                                            } else if (b11 == 1) {
                                                c4 = 4;
                                                z5 = z4;
                                                i8 = 2;
                                                i7 = 0;
                                            } else if (b11 == 2) {
                                                c4 = 4;
                                                int b12 = rf1Var.b(4) + 12;
                                                i7 = rf1Var.b(2);
                                                i8 = b12;
                                                z5 = z4;
                                            } else if (b11 != 3) {
                                                z5 = z4;
                                                i7 = 0;
                                                i8 = 0;
                                            } else {
                                                b5 = rf1Var.b(8) + 29;
                                                b6 = rf1Var.b(2);
                                            }
                                            if (i8 != 0 || paint2 == null) {
                                                i9 = i15;
                                            } else {
                                                if (bArr2 != 0) {
                                                    i7 = bArr2[i7];
                                                }
                                                paint2.setColor(iArr[i7]);
                                                i9 = i15;
                                                canvas.drawRect(i15, i16, i15 + i8, i16 + 1, paint2);
                                            }
                                            i15 = i9 + i8;
                                            if (z5) {
                                                rf1Var.c();
                                                break;
                                            } else {
                                                paint2 = paint;
                                                z4 = z5;
                                            }
                                        }
                                        c4 = 4;
                                        if (i8 != 0) {
                                        }
                                        i9 = i15;
                                        i15 = i9 + i8;
                                        if (z5) {
                                        }
                                    }
                                    i7 = b6;
                                    i8 = b5;
                                }
                                z5 = z4;
                                c4 = 4;
                                if (i8 != 0) {
                                }
                                i9 = i15;
                                i15 = i9 + i8;
                                if (z5) {
                                }
                            }
                        } else {
                            bArr2 = bArr5;
                            z4 = false;
                            while (true) {
                                b4 = rf1Var.b(2);
                                if (b4 != 0) {
                                }
                                z5 = z4;
                                c4 = 4;
                                if (i8 != 0) {
                                }
                                i9 = i15;
                                i15 = i9 + i8;
                                if (z5) {
                                }
                                paint2 = paint;
                                z4 = z5;
                            }
                        }
                    case 17:
                        if (i4 == 3) {
                            bArr4 = bArr6 == null ? f27999j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        boolean z7 = false;
                        while (true) {
                            int b13 = rf1Var.b(i17);
                            if (b13 != 0) {
                                i10 = 1;
                                z6 = z7;
                            } else if (!rf1Var.f()) {
                                int b14 = rf1Var.b(3);
                                if (b14 != 0) {
                                    i10 = b14 + 2;
                                    z6 = z7;
                                    b13 = 0;
                                } else {
                                    z6 = true;
                                    b13 = 0;
                                    i10 = 0;
                                }
                            } else {
                                if (!rf1Var.f()) {
                                    b7 = rf1Var.b(i18) + i17;
                                    b8 = rf1Var.b(i17);
                                } else {
                                    int b15 = rf1Var.b(i18);
                                    if (b15 == 0) {
                                        i10 = 1;
                                    } else if (b15 == 1) {
                                        i10 = i18;
                                    } else if (b15 == i18) {
                                        b7 = rf1Var.b(i17) + 9;
                                        b8 = rf1Var.b(i17);
                                    } else if (b15 != 3) {
                                        z6 = z7;
                                        b13 = 0;
                                        i10 = 0;
                                    } else {
                                        b7 = rf1Var.b(8) + 25;
                                        b8 = rf1Var.b(i17);
                                    }
                                    z6 = z7;
                                    b13 = 0;
                                }
                                i10 = b7;
                                z6 = z7;
                                b13 = b8;
                            }
                            if (i10 == 0 || paint2 == null) {
                                i11 = i15;
                                i12 = i18;
                            } else {
                                if (bArr4 != 0) {
                                    b13 = bArr4[b13];
                                }
                                paint2.setColor(iArr[b13]);
                                i11 = i15;
                                i12 = 2;
                                canvas.drawRect(i15, i16, i15 + i10, i16 + 1, paint2);
                            }
                            i15 = i11 + i10;
                            if (z6) {
                                rf1Var.c();
                                continue;
                            } else {
                                i18 = i12;
                                z7 = z6;
                                i17 = 4;
                            }
                        }
                    case 18:
                        int i20 = i15;
                        int i21 = 0;
                        while (true) {
                            int b16 = rf1Var.b(8);
                            if (b16 != 0) {
                                i13 = i21;
                                b9 = i19;
                            } else if (!rf1Var.f()) {
                                int b17 = rf1Var.b(7);
                                if (b17 != 0) {
                                    i13 = i21;
                                    b9 = b17;
                                    b16 = 0;
                                } else {
                                    i13 = i19;
                                    b16 = 0;
                                    b9 = 0;
                                }
                            } else {
                                i13 = i21;
                                b9 = rf1Var.b(7);
                                b16 = rf1Var.b(8);
                            }
                            if (b9 == 0 || paint2 == null) {
                                i14 = i19;
                            } else {
                                paint2.setColor(iArr[b16]);
                                i14 = i19;
                                canvas.drawRect(i20, i16, i20 + b9, i16 + 1, paint2);
                            }
                            i20 += b9;
                            if (i13 != 0) {
                                i15 = i20;
                                continue;
                            } else {
                                i19 = i14;
                                i21 = i13;
                            }
                        }
                    default:
                        switch (b10) {
                            case 32:
                                bArr7 = new byte[4];
                                for (int i22 = 0; i22 < 4; i22++) {
                                    bArr7[i22] = (byte) rf1Var.b(4);
                                }
                                break;
                            case 33:
                                bArr5 = new byte[4];
                                for (int i23 = 0; i23 < 4; i23++) {
                                    bArr5[i23] = (byte) rf1Var.b(8);
                                }
                                break;
                            case 34:
                                bArr6 = new byte[16];
                                for (int i24 = 0; i24 < 16; i24++) {
                                    bArr6[i24] = (byte) rf1Var.b(8);
                                }
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i16 += 2;
                i15 = i5;
            }
            paint2 = paint;
        }
    }

    private static a a(rf1 rf1Var, int i4) {
        int b4;
        int i5;
        int b5;
        int i6;
        int i7;
        int i8 = 8;
        int b6 = rf1Var.b(8);
        rf1Var.d(8);
        int i9 = 2;
        int i10 = i4 - 2;
        int[] a4 = a();
        int[] b7 = b();
        int[] c4 = c();
        while (i10 > 0) {
            int b8 = rf1Var.b(i8);
            int b9 = rf1Var.b(i8);
            int[] iArr = (b9 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? a4 : (b9 & 64) != 0 ? b7 : c4;
            if ((b9 & 1) != 0) {
                i6 = rf1Var.b(i8);
                i7 = rf1Var.b(i8);
                b4 = rf1Var.b(i8);
                b5 = rf1Var.b(i8);
                i5 = i10 - 6;
            } else {
                int b10 = rf1Var.b(6) << i9;
                int b11 = rf1Var.b(4) << 4;
                b4 = rf1Var.b(4) << 4;
                i5 = i10 - 4;
                b5 = rf1Var.b(i9) << 6;
                i6 = b10;
                i7 = b11;
            }
            if (i6 == 0) {
                b5 = 255;
                i7 = 0;
                b4 = 0;
            }
            byte b12 = (byte) (255 - (b5 & KotlinVersion.MAX_COMPONENT_VALUE));
            double d4 = i6;
            int i11 = b6;
            double d5 = i7 - 128;
            int i12 = (int) ((1.402d * d5) + d4);
            double d6 = b4 - 128;
            int i13 = (int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d));
            int i14 = (int) ((d6 * 1.772d) + d4);
            int i15 = u82.f32873a;
            iArr[b8] = a(b12, Math.max(0, Math.min(i12, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i13, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i14, KotlinVersion.MAX_COMPONENT_VALUE)));
            i10 = i5;
            b6 = i11;
            i8 = 8;
            i9 = 2;
        }
        return new a(b6, a4, b7, c4);
    }

    private static c a(rf1 rf1Var) {
        byte[] bArr;
        int b4 = rf1Var.b(16);
        rf1Var.d(4);
        int b5 = rf1Var.b(2);
        boolean f4 = rf1Var.f();
        rf1Var.d(1);
        byte[] bArr2 = u82.f32878f;
        if (b5 == 1) {
            rf1Var.d(rf1Var.b(8) * 16);
        } else if (b5 == 0) {
            int b6 = rf1Var.b(16);
            int b7 = rf1Var.b(16);
            if (b6 > 0) {
                bArr2 = new byte[b6];
                rf1Var.b(bArr2, b6);
            }
            if (b7 > 0) {
                bArr = new byte[b7];
                rf1Var.b(bArr, b7);
                return new c(b4, f4, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(b4, f4, bArr2, bArr);
    }

    public final List a(int i4, byte[] bArr) {
        boolean z4;
        char c4;
        int i5;
        int[] iArr;
        f fVar;
        int i6;
        int i7;
        int i8;
        int i9;
        rf1 rf1Var = new rf1(i4, bArr);
        while (true) {
            z4 = true;
            if (rf1Var.b() >= 48 && rf1Var.b(8) == 15) {
                h hVar = this.f28005f;
                int b4 = rf1Var.b(8);
                int b5 = rf1Var.b(16);
                int b6 = rf1Var.b(16);
                int d4 = rf1Var.d() + b6;
                if (b6 * 8 > rf1Var.b()) {
                    ms0.d("DvbParser", "Data field length exceeds limit");
                    rf1Var.d(rf1Var.b());
                } else {
                    switch (b4) {
                        case 16:
                            if (b5 == hVar.f28038a) {
                                d dVar = hVar.f28046i;
                                rf1Var.b(8);
                                int b7 = rf1Var.b(4);
                                int b8 = rf1Var.b(2);
                                rf1Var.d(2);
                                int i10 = b6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i10 > 0) {
                                    int b9 = rf1Var.b(8);
                                    rf1Var.d(8);
                                    i10 -= 6;
                                    sparseArray.put(b9, new e(rf1Var.b(16), rf1Var.b(16)));
                                }
                                d dVar2 = new d(b7, b8, sparseArray);
                                if (b8 != 0) {
                                    hVar.f28046i = dVar2;
                                    hVar.f28040c.clear();
                                    hVar.f28041d.clear();
                                    hVar.f28042e.clear();
                                    break;
                                } else if (dVar != null && dVar.f28021a != b7) {
                                    hVar.f28046i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f28046i;
                            if (b5 == hVar.f28038a && dVar3 != null) {
                                int b10 = rf1Var.b(8);
                                rf1Var.d(4);
                                boolean f4 = rf1Var.f();
                                rf1Var.d(3);
                                int b11 = rf1Var.b(16);
                                int b12 = rf1Var.b(16);
                                rf1Var.b(3);
                                int b13 = rf1Var.b(3);
                                rf1Var.d(2);
                                int b14 = rf1Var.b(8);
                                int b15 = rf1Var.b(8);
                                int b16 = rf1Var.b(4);
                                int b17 = rf1Var.b(2);
                                rf1Var.d(2);
                                int i11 = b6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i11 > 0) {
                                    int b18 = rf1Var.b(16);
                                    int b19 = rf1Var.b(2);
                                    rf1Var.b(2);
                                    int b20 = rf1Var.b(12);
                                    rf1Var.d(4);
                                    int b21 = rf1Var.b(12);
                                    int i12 = i11 - 6;
                                    if (b19 == 1 || b19 == 2) {
                                        rf1Var.b(8);
                                        rf1Var.b(8);
                                        i11 -= 8;
                                    } else {
                                        i11 = i12;
                                    }
                                    sparseArray2.put(b18, new g(b20, b21));
                                }
                                f fVar2 = new f(b10, f4, b11, b12, b13, b14, b15, b16, b17, sparseArray2);
                                if (dVar3.f28022b == 0 && (fVar = hVar.f28040c.get(b10)) != null) {
                                    SparseArray<g> sparseArray3 = fVar.f28035j;
                                    for (int i13 = 0; i13 < sparseArray3.size(); i13++) {
                                        fVar2.f28035j.put(sparseArray3.keyAt(i13), sparseArray3.valueAt(i13));
                                    }
                                }
                                hVar.f28040c.put(fVar2.f28026a, fVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (b5 == hVar.f28038a) {
                                a a4 = a(rf1Var, b6);
                                hVar.f28041d.put(a4.f28007a, a4);
                                break;
                            } else if (b5 == hVar.f28039b) {
                                a a5 = a(rf1Var, b6);
                                hVar.f28043f.put(a5.f28007a, a5);
                                break;
                            }
                            break;
                        case 19:
                            if (b5 == hVar.f28038a) {
                                c a6 = a(rf1Var);
                                hVar.f28042e.put(a6.f28017a, a6);
                                break;
                            } else if (b5 == hVar.f28039b) {
                                c a7 = a(rf1Var);
                                hVar.f28044g.put(a7.f28017a, a7);
                                break;
                            }
                            break;
                        case 20:
                            if (b5 == hVar.f28038a) {
                                rf1Var.d(4);
                                boolean f5 = rf1Var.f();
                                rf1Var.d(3);
                                int b22 = rf1Var.b(16);
                                int b23 = rf1Var.b(16);
                                if (f5) {
                                    int b24 = rf1Var.b(16);
                                    i6 = rf1Var.b(16);
                                    i9 = rf1Var.b(16);
                                    i7 = rf1Var.b(16);
                                    i8 = b24;
                                } else {
                                    i6 = b22;
                                    i7 = b23;
                                    i8 = 0;
                                    i9 = 0;
                                }
                                hVar.f28045h = new b(b22, b23, i8, i6, i9, i7);
                                break;
                            }
                            break;
                    }
                    rf1Var.e(d4 - rf1Var.d());
                }
            }
        }
        h hVar2 = this.f28005f;
        d dVar4 = hVar2.f28046i;
        if (dVar4 == null) {
            return Collections.EMPTY_LIST;
        }
        b bVar = hVar2.f28045h;
        if (bVar == null) {
            bVar = this.f28003d;
        }
        Bitmap bitmap = this.f28006g;
        if (bitmap == null || bVar.f28011a + 1 != bitmap.getWidth() || bVar.f28012b + 1 != this.f28006g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f28011a + 1, bVar.f28012b + 1, Bitmap.Config.ARGB_8888);
            this.f28006g = createBitmap;
            this.f28002c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray4 = dVar4.f28023c;
        int i14 = 0;
        while (i14 < sparseArray4.size()) {
            this.f28002c.save();
            e valueAt = sparseArray4.valueAt(i14);
            f fVar3 = this.f28005f.f28040c.get(sparseArray4.keyAt(i14));
            int i15 = valueAt.f28024a + bVar.f28013c;
            int i16 = valueAt.f28025b + bVar.f28015e;
            this.f28002c.clipRect(i15, i16, Math.min(fVar3.f28028c + i15, bVar.f28014d), Math.min(fVar3.f28029d + i16, bVar.f28016f));
            a aVar = this.f28005f.f28041d.get(fVar3.f28031f);
            if (aVar == null && (aVar = this.f28005f.f28043f.get(fVar3.f28031f)) == null) {
                aVar = this.f28004e;
            }
            SparseArray<g> sparseArray5 = fVar3.f28035j;
            int i17 = 0;
            while (i17 < sparseArray5.size()) {
                int keyAt = sparseArray5.keyAt(i17);
                g valueAt2 = sparseArray5.valueAt(i17);
                boolean z5 = z4;
                c cVar = this.f28005f.f28042e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f28005f.f28044g.get(keyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.f28018b ? null : this.f28000a;
                    int i18 = fVar3.f28030e;
                    int i19 = i15 + valueAt2.f28036a;
                    int i20 = i16 + valueAt2.f28037b;
                    Canvas canvas = this.f28002c;
                    if (i18 == 3) {
                        iArr = aVar.f28010d;
                    } else if (i18 == 2) {
                        iArr = aVar.f28009c;
                    } else {
                        iArr = aVar.f28008b;
                    }
                    int[] iArr2 = iArr;
                    a(cVar.f28019c, iArr2, i18, i19, i20, paint, canvas);
                    a(cVar.f28020d, iArr2, i18, i19, i20 + 1, paint, canvas);
                }
                i17++;
                z4 = z5;
            }
            boolean z6 = z4;
            if (fVar3.f28027b) {
                int i21 = fVar3.f28030e;
                if (i21 == 3) {
                    i5 = aVar.f28010d[fVar3.f28032g];
                    c4 = 2;
                } else {
                    c4 = 2;
                    if (i21 == 2) {
                        i5 = aVar.f28009c[fVar3.f28033h];
                    } else {
                        i5 = aVar.f28008b[fVar3.f28034i];
                    }
                }
                this.f28001b.setColor(i5);
                this.f28002c.drawRect(i15, i16, fVar3.f28028c + i15, fVar3.f28029d + i16, this.f28001b);
            } else {
                c4 = 2;
            }
            arrayList.add(new uu.a().a(Bitmap.createBitmap(this.f28006g, i15, i16, fVar3.f28028c, fVar3.f28029d)).b(i15 / bVar.f28011a).b(0).a(0, i16 / bVar.f28012b).a(0).d(fVar3.f28028c / bVar.f28011a).a(fVar3.f28029d / bVar.f28012b).a());
            this.f28002c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f28002c.restore();
            i14++;
            z4 = z6;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
