package e2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o2.m0;
import o2.r;
import o2.z;

/* loaded from: classes.dex */
final class b {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f16013h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f16014i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f16015j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f16016a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f16017b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f16018c;

    /* renamed from: d, reason: collision with root package name */
    private final C0058b f16019d;

    /* renamed from: e, reason: collision with root package name */
    private final a f16020e;

    /* renamed from: f, reason: collision with root package name */
    private final h f16021f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f16022g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16023a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f16024b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f16025c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f16026d;

        public a(int i7, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f16023a = i7;
            this.f16024b = iArr;
            this.f16025c = iArr2;
            this.f16026d = iArr3;
        }
    }

    /* renamed from: e2.b$b, reason: collision with other inner class name */
    private static final class C0058b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16027a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16028b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16029c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16030d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16031e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16032f;

        public C0058b(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f16027a = i7;
            this.f16028b = i8;
            this.f16029c = i9;
            this.f16030d = i10;
            this.f16031e = i11;
            this.f16032f = i12;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f16033a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16034b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16035c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f16036d;

        public c(int i7, boolean z6, byte[] bArr, byte[] bArr2) {
            this.f16033a = i7;
            this.f16034b = z6;
            this.f16035c = bArr;
            this.f16036d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f16037a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16038b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16039c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f16040d;

        public d(int i7, int i8, int i9, SparseArray<e> sparseArray) {
            this.f16037a = i7;
            this.f16038b = i8;
            this.f16039c = i9;
            this.f16040d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f16041a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16042b;

        public e(int i7, int i8) {
            this.f16041a = i7;
            this.f16042b = i8;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f16043a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16044b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16045c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16046d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16047e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16048f;

        /* renamed from: g, reason: collision with root package name */
        public final int f16049g;

        /* renamed from: h, reason: collision with root package name */
        public final int f16050h;

        /* renamed from: i, reason: collision with root package name */
        public final int f16051i;

        /* renamed from: j, reason: collision with root package name */
        public final int f16052j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f16053k;

        public f(int i7, boolean z6, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, SparseArray<g> sparseArray) {
            this.f16043a = i7;
            this.f16044b = z6;
            this.f16045c = i8;
            this.f16046d = i9;
            this.f16047e = i10;
            this.f16048f = i11;
            this.f16049g = i12;
            this.f16050h = i13;
            this.f16051i = i14;
            this.f16052j = i15;
            this.f16053k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f16053k;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                this.f16053k.put(sparseArray.keyAt(i7), sparseArray.valueAt(i7));
            }
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f16054a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16055b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16056c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16057d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16058e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16059f;

        public g(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f16054a = i7;
            this.f16055b = i8;
            this.f16056c = i9;
            this.f16057d = i10;
            this.f16058e = i11;
            this.f16059f = i12;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f16060a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16061b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f16062c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f16063d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f16064e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f16065f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f16066g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0058b f16067h;

        /* renamed from: i, reason: collision with root package name */
        public d f16068i;

        public h(int i7, int i8) {
            this.f16060a = i7;
            this.f16061b = i8;
        }

        public void a() {
            this.f16062c.clear();
            this.f16063d.clear();
            this.f16064e.clear();
            this.f16065f.clear();
            this.f16066g.clear();
            this.f16067h = null;
            this.f16068i = null;
        }
    }

    public b(int i7, int i8) {
        Paint paint = new Paint();
        this.f16016a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f16017b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f16018c = new Canvas();
        this.f16019d = new C0058b(719, 575, 0, 719, 0, 575);
        this.f16020e = new a(0, c(), d(), e());
        this.f16021f = new h(i7, i8);
    }

    private static byte[] a(int i7, int i8, z zVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) zVar.h(i8);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = f(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = f(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = f(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = f(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = f(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = f(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = f(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[LOOP:0: B:2:0x0009->B:13:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int g(z zVar, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z6;
        int i9;
        int h7;
        int i10 = i7;
        boolean z7 = false;
        while (true) {
            int h8 = zVar.h(2);
            if (h8 != 0) {
                z6 = z7;
            } else {
                if (zVar.g()) {
                    h7 = zVar.h(3) + 3;
                } else if (zVar.g()) {
                    z6 = z7;
                    h8 = 0;
                } else {
                    int h9 = zVar.h(2);
                    if (h9 == 0) {
                        h8 = 0;
                        z6 = true;
                    } else if (h9 == 1) {
                        z6 = z7;
                        h8 = 0;
                        i9 = 2;
                        if (i9 != 0 && paint != null) {
                            if (bArr != null) {
                                h8 = bArr[h8];
                            }
                            paint.setColor(iArr[h8]);
                            canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
                        }
                        i10 += i9;
                        if (!z6) {
                            return i10;
                        }
                        z7 = z6;
                    } else if (h9 == 2) {
                        h7 = zVar.h(4) + 12;
                    } else if (h9 != 3) {
                        z6 = z7;
                        h8 = 0;
                    } else {
                        h7 = zVar.h(8) + 29;
                    }
                    i9 = 0;
                    if (i9 != 0) {
                        if (bArr != null) {
                        }
                        paint.setColor(iArr[h8]);
                        canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
                    }
                    i10 += i9;
                    if (!z6) {
                    }
                }
                z6 = z7;
                i9 = h7;
                h8 = zVar.h(2);
                if (i9 != 0) {
                }
                i10 += i9;
                if (!z6) {
                }
            }
            i9 = 1;
            if (i9 != 0) {
            }
            i10 += i9;
            if (!z6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085 A[LOOP:0: B:2:0x0009->B:13:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int h(z zVar, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z6;
        int i9;
        int h7;
        int i10 = i7;
        boolean z7 = false;
        while (true) {
            int h8 = zVar.h(4);
            if (h8 != 0) {
                z6 = z7;
            } else {
                if (zVar.g()) {
                    if (zVar.g()) {
                        int h9 = zVar.h(2);
                        if (h9 == 0) {
                            z6 = z7;
                            h8 = 0;
                        } else if (h9 == 1) {
                            z6 = z7;
                            h8 = 0;
                            i9 = 2;
                        } else if (h9 == 2) {
                            h7 = zVar.h(4) + 9;
                        } else if (h9 != 3) {
                            z6 = z7;
                            h8 = 0;
                            i9 = 0;
                        } else {
                            h7 = zVar.h(8) + 25;
                        }
                    } else {
                        h7 = zVar.h(2) + 4;
                    }
                    h8 = zVar.h(4);
                    z6 = z7;
                    i9 = h7;
                } else {
                    int h10 = zVar.h(3);
                    if (h10 != 0) {
                        z6 = z7;
                        i9 = h10 + 2;
                        h8 = 0;
                    } else {
                        h8 = 0;
                        z6 = true;
                        i9 = 0;
                    }
                }
                if (i9 != 0 && paint != null) {
                    if (bArr != null) {
                        h8 = bArr[h8];
                    }
                    paint.setColor(iArr[h8]);
                    canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
                }
                i10 += i9;
                if (!z6) {
                    return i10;
                }
                z7 = z6;
            }
            i9 = 1;
            if (i9 != 0) {
                if (bArr != null) {
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
            }
            i10 += i9;
            if (!z6) {
            }
        }
    }

    private static int i(z zVar, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z6;
        int h7;
        int i9 = i7;
        boolean z7 = false;
        while (true) {
            int h8 = zVar.h(8);
            if (h8 != 0) {
                z6 = z7;
                h7 = 1;
            } else if (zVar.g()) {
                z6 = z7;
                h7 = zVar.h(7);
                h8 = zVar.h(8);
            } else {
                int h9 = zVar.h(7);
                if (h9 != 0) {
                    z6 = z7;
                    h7 = h9;
                    h8 = 0;
                } else {
                    h8 = 0;
                    z6 = true;
                    h7 = 0;
                }
            }
            if (h7 != 0 && paint != null) {
                if (bArr != null) {
                    h8 = bArr[h8];
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i9, i8, i9 + h7, i8 + 1, paint);
            }
            i9 += h7;
            if (z6) {
                return i9;
            }
            z7 = z6;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        z zVar = new z(bArr);
        int i10 = i8;
        int i11 = i9;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zVar.b() != 0) {
            int h7 = zVar.h(8);
            if (h7 != 240) {
                switch (h7) {
                    case 16:
                        if (i7 != 3) {
                            if (i7 != 2) {
                                bArr2 = null;
                                i10 = g(zVar, iArr, bArr2, i10, i11, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f16013h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f16014i : bArr5;
                        }
                        bArr2 = bArr3;
                        i10 = g(zVar, iArr, bArr2, i10, i11, paint, canvas);
                    case 17:
                        if (i7 == 3) {
                            bArr4 = bArr6 == null ? f16015j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i10 = h(zVar, iArr, bArr4, i10, i11, paint, canvas);
                        break;
                    case 18:
                        i10 = i(zVar, iArr, null, i10, i11, paint, canvas);
                        continue;
                    default:
                        switch (h7) {
                            case 32:
                                bArr7 = a(4, 4, zVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, zVar);
                                break;
                            case 34:
                                bArr6 = a(16, 8, zVar);
                                break;
                            default:
                                continue;
                        }
                }
                zVar.c();
            } else {
                i11 += 2;
                i10 = i8;
            }
        }
    }

    private static void k(c cVar, a aVar, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        int[] iArr = i7 == 3 ? aVar.f16026d : i7 == 2 ? aVar.f16025c : aVar.f16024b;
        j(cVar.f16035c, iArr, i7, i8, i9, paint, canvas);
        j(cVar.f16036d, iArr, i7, i8, i9 + 1, paint, canvas);
    }

    private static a l(z zVar, int i7) {
        int h7;
        int i8;
        int h8;
        int i9;
        int i10;
        int i11 = 8;
        int h9 = zVar.h(8);
        zVar.r(8);
        int i12 = 2;
        int i13 = i7 - 2;
        int[] c7 = c();
        int[] d7 = d();
        int[] e7 = e();
        while (i13 > 0) {
            int h10 = zVar.h(i11);
            int h11 = zVar.h(i11);
            int i14 = i13 - 2;
            int[] iArr = (h11 & 128) != 0 ? c7 : (h11 & 64) != 0 ? d7 : e7;
            if ((h11 & 1) != 0) {
                i9 = zVar.h(i11);
                i10 = zVar.h(i11);
                h7 = zVar.h(i11);
                h8 = zVar.h(i11);
                i8 = i14 - 4;
            } else {
                int h12 = zVar.h(6) << i12;
                int h13 = zVar.h(4) << 4;
                h7 = zVar.h(4) << 4;
                i8 = i14 - 2;
                h8 = zVar.h(i12) << 6;
                i9 = h12;
                i10 = h13;
            }
            if (i9 == 0) {
                i10 = 0;
                h7 = 0;
                h8 = 255;
            }
            double d8 = i9;
            double d9 = i10 - 128;
            Double.isNaN(d9);
            Double.isNaN(d8);
            double d10 = h7 - 128;
            Double.isNaN(d10);
            Double.isNaN(d8);
            Double.isNaN(d9);
            Double.isNaN(d10);
            Double.isNaN(d8);
            iArr[h10] = f((byte) (255 - (h8 & 255)), m0.q((int) (d8 + (1.402d * d9)), 0, 255), m0.q((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), m0.q((int) (d8 + (d10 * 1.772d)), 0, 255));
            i13 = i8;
            h9 = h9;
            i11 = 8;
            i12 = 2;
        }
        return new a(h9, c7, d7, e7);
    }

    private static C0058b m(z zVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        zVar.r(4);
        boolean g7 = zVar.g();
        zVar.r(3);
        int h7 = zVar.h(16);
        int h8 = zVar.h(16);
        if (g7) {
            int h9 = zVar.h(16);
            int h10 = zVar.h(16);
            int h11 = zVar.h(16);
            i8 = zVar.h(16);
            i7 = h10;
            i10 = h11;
            i9 = h9;
        } else {
            i7 = h7;
            i8 = h8;
            i9 = 0;
            i10 = 0;
        }
        return new C0058b(h7, h8, i9, i7, i10, i8);
    }

    private static c n(z zVar) {
        byte[] bArr;
        int h7 = zVar.h(16);
        zVar.r(4);
        int h8 = zVar.h(2);
        boolean g7 = zVar.g();
        zVar.r(1);
        byte[] bArr2 = m0.f19757f;
        if (h8 == 1) {
            zVar.r(zVar.h(8) * 16);
        } else if (h8 == 0) {
            int h9 = zVar.h(16);
            int h10 = zVar.h(16);
            if (h9 > 0) {
                bArr2 = new byte[h9];
                zVar.k(bArr2, 0, h9);
            }
            if (h10 > 0) {
                bArr = new byte[h10];
                zVar.k(bArr, 0, h10);
                return new c(h7, g7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h7, g7, bArr2, bArr);
    }

    private static d o(z zVar, int i7) {
        int h7 = zVar.h(8);
        int h8 = zVar.h(4);
        int h9 = zVar.h(2);
        zVar.r(2);
        int i8 = i7 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int h10 = zVar.h(8);
            zVar.r(8);
            i8 -= 6;
            sparseArray.put(h10, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(h7, h8, h9, sparseArray);
    }

    private static f p(z zVar, int i7) {
        int h7;
        int h8;
        int h9 = zVar.h(8);
        zVar.r(4);
        boolean g7 = zVar.g();
        zVar.r(3);
        int i8 = 16;
        int h10 = zVar.h(16);
        int h11 = zVar.h(16);
        int h12 = zVar.h(3);
        int h13 = zVar.h(3);
        int i9 = 2;
        zVar.r(2);
        int h14 = zVar.h(8);
        int h15 = zVar.h(8);
        int h16 = zVar.h(4);
        int h17 = zVar.h(2);
        zVar.r(2);
        int i10 = i7 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int h18 = zVar.h(i8);
            int h19 = zVar.h(i9);
            int h20 = zVar.h(i9);
            int h21 = zVar.h(12);
            int i11 = h17;
            zVar.r(4);
            int h22 = zVar.h(12);
            i10 -= 6;
            if (h19 == 1 || h19 == 2) {
                i10 -= 2;
                h7 = zVar.h(8);
                h8 = zVar.h(8);
            } else {
                h7 = 0;
                h8 = 0;
            }
            sparseArray.put(h18, new g(h19, h20, h21, h22, h7, h8));
            h17 = i11;
            i9 = 2;
            i8 = 16;
        }
        return new f(h9, g7, h10, h11, h12, h13, h14, h15, h16, h17, sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void q(z zVar, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i7;
        a aVar2;
        c cVar;
        int h7 = zVar.h(8);
        int h8 = zVar.h(16);
        int h9 = zVar.h(16);
        int d7 = zVar.d() + h9;
        if (h9 * 8 > zVar.b()) {
            r.i("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (h7) {
            case 16:
                if (h8 == hVar.f16060a) {
                    d dVar = hVar.f16068i;
                    d o7 = o(zVar, h9);
                    if (o7.f16039c == 0) {
                        if (dVar != null && dVar.f16038b != o7.f16038b) {
                            hVar.f16068i = o7;
                            break;
                        }
                    } else {
                        hVar.f16068i = o7;
                        hVar.f16062c.clear();
                        hVar.f16063d.clear();
                        hVar.f16064e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f16068i;
                if (h8 == hVar.f16060a && dVar2 != null) {
                    f p7 = p(zVar, h9);
                    if (dVar2.f16039c == 0 && (fVar = hVar.f16062c.get(p7.f16043a)) != null) {
                        p7.a(fVar);
                    }
                    hVar.f16062c.put(p7.f16043a, p7);
                    break;
                }
                break;
            case 18:
                if (h8 == hVar.f16060a) {
                    a l7 = l(zVar, h9);
                    sparseArray = hVar.f16063d;
                    aVar = l7;
                } else if (h8 == hVar.f16061b) {
                    a l8 = l(zVar, h9);
                    sparseArray = hVar.f16065f;
                    aVar = l8;
                }
                i7 = aVar.f16023a;
                aVar2 = aVar;
                sparseArray.put(i7, aVar2);
                break;
            case 19:
                if (h8 == hVar.f16060a) {
                    c n7 = n(zVar);
                    sparseArray = hVar.f16064e;
                    cVar = n7;
                } else if (h8 == hVar.f16061b) {
                    c n8 = n(zVar);
                    sparseArray = hVar.f16066g;
                    cVar = n8;
                }
                i7 = cVar.f16033a;
                aVar2 = cVar;
                sparseArray.put(i7, aVar2);
                break;
            case 20:
                if (h8 == hVar.f16060a) {
                    hVar.f16067h = m(zVar);
                    break;
                }
                break;
        }
        zVar.s(d7 - zVar.d());
    }

    public List<c2.b> b(byte[] bArr, int i7) {
        int i8;
        SparseArray<g> sparseArray;
        z zVar = new z(bArr, i7);
        while (zVar.b() >= 48 && zVar.h(8) == 15) {
            q(zVar, this.f16021f);
        }
        h hVar = this.f16021f;
        d dVar = hVar.f16068i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0058b c0058b = hVar.f16067h;
        if (c0058b == null) {
            c0058b = this.f16019d;
        }
        Bitmap bitmap = this.f16022g;
        if (bitmap == null || c0058b.f16027a + 1 != bitmap.getWidth() || c0058b.f16028b + 1 != this.f16022g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0058b.f16027a + 1, c0058b.f16028b + 1, Bitmap.Config.ARGB_8888);
            this.f16022g = createBitmap;
            this.f16018c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f16040d;
        for (int i9 = 0; i9 < sparseArray2.size(); i9++) {
            this.f16018c.save();
            e valueAt = sparseArray2.valueAt(i9);
            f fVar = this.f16021f.f16062c.get(sparseArray2.keyAt(i9));
            int i10 = valueAt.f16041a + c0058b.f16029c;
            int i11 = valueAt.f16042b + c0058b.f16031e;
            this.f16018c.clipRect(i10, i11, Math.min(fVar.f16045c + i10, c0058b.f16030d), Math.min(fVar.f16046d + i11, c0058b.f16032f));
            a aVar = this.f16021f.f16063d.get(fVar.f16049g);
            if (aVar == null && (aVar = this.f16021f.f16065f.get(fVar.f16049g)) == null) {
                aVar = this.f16020e;
            }
            SparseArray<g> sparseArray3 = fVar.f16053k;
            int i12 = 0;
            while (i12 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i12);
                g valueAt2 = sparseArray3.valueAt(i12);
                c cVar = this.f16021f.f16064e.get(keyAt);
                c cVar2 = cVar == null ? this.f16021f.f16066g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i8 = i12;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f16048f, valueAt2.f16056c + i10, i11 + valueAt2.f16057d, cVar2.f16034b ? null : this.f16016a, this.f16018c);
                } else {
                    i8 = i12;
                    sparseArray = sparseArray3;
                }
                i12 = i8 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f16044b) {
                int i13 = fVar.f16048f;
                this.f16017b.setColor(i13 == 3 ? aVar.f16026d[fVar.f16050h] : i13 == 2 ? aVar.f16025c[fVar.f16051i] : aVar.f16024b[fVar.f16052j]);
                this.f16018c.drawRect(i10, i11, fVar.f16045c + i10, fVar.f16046d + i11, this.f16017b);
            }
            arrayList.add(new b.C0043b().f(Bitmap.createBitmap(this.f16022g, i10, i11, fVar.f16045c, fVar.f16046d)).k(i10 / c0058b.f16027a).l(0).h(i11 / c0058b.f16028b, 0).i(0).n(fVar.f16045c / c0058b.f16027a).g(fVar.f16046d / c0058b.f16028b).a());
            this.f16018c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f16018c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f16021f.a();
    }
}
