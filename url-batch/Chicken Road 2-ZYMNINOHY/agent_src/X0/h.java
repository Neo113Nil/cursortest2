package X0;

import N3.A;
import V0.k;
import V0.l;
import W.AbstractC0108a;
import W.InterfaceC0113f;
import W.J;
import W.t;
import W.u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import v2.G;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f3597h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f3598i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f3599j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3600a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3601b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f3602c;

    /* renamed from: d, reason: collision with root package name */
    public final b f3603d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3604e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3605f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f3606g;

    public h(List list) {
        u uVar = new u((byte[]) list.get(0));
        int G4 = uVar.G();
        int G5 = uVar.G();
        Paint paint = new Paint();
        this.f3600a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f3601b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f3602c = new Canvas();
        this.f3603d = new b(719, 575, 0, 719, 0, 575);
        this.f3604e = new a(0, new int[]{0, -1, -16777216, -8421505}, e(), f());
        this.f3605f = new g(G4, G5);
    }

    public static byte[] d(int i4, int i5, t tVar) {
        byte[] bArr = new byte[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = (byte) tVar.i(i5);
        }
        return bArr;
    }

    public static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i4 = 1; i4 < 16; i4++) {
            if (i4 < 8) {
                iArr[i4] = g(KotlinVersion.MAX_COMPONENT_VALUE, (i4 & 1) != 0 ? 255 : 0, (i4 & 2) != 0 ? 255 : 0, (i4 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i4] = g(KotlinVersion.MAX_COMPONENT_VALUE, (i4 & 1) != 0 ? 127 : 0, (i4 & 2) != 0 ? 127 : 0, (i4 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] f() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i4 < 8) {
                int i6 = (i4 & 1) != 0 ? 255 : 0;
                int i7 = (i4 & 2) != 0 ? 255 : 0;
                if ((i4 & 4) == 0) {
                    i5 = 0;
                }
                iArr[i4] = g(63, i6, i7, i5);
            } else {
                int i8 = i4 & 136;
                if (i8 == 0) {
                    iArr[i4] = g(KotlinVersion.MAX_COMPONENT_VALUE, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i4] = g(127, ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i4] = g(KotlinVersion.MAX_COMPONENT_VALUE, ((i4 & 1) != 0 ? 43 : 0) + 127 + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + 127 + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + 127 + ((i4 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i4] = g(KotlinVersion.MAX_COMPONENT_VALUE, ((i4 & 1) != 0 ? 43 : 0) + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + ((i4 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int g(int i4, int i5, int i6, int i7) {
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(byte[] bArr, int[] iArr, int i4, int i5, int i6, Paint paint, Canvas canvas) {
        char c4;
        char c5;
        boolean z;
        int i7;
        int i8;
        int i9;
        byte[] bArr2;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        int i16;
        int i17;
        Paint paint2 = paint;
        t tVar = new t(bArr.length, bArr);
        int i18 = i5;
        int i19 = i6;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (tVar.b() != 0) {
            int i20 = 8;
            int i21 = tVar.i(8);
            if (i21 != 240) {
                int i22 = 3;
                int i23 = 2;
                int i24 = 4;
                switch (i21) {
                    case 16:
                        byte[] bArr6 = i4 == 3 ? bArr3 == null ? f3598i : bArr3 : i4 == 2 ? bArr5 == null ? f3597h : bArr5 : null;
                        boolean z6 = false;
                        while (true) {
                            int i25 = tVar.i(2);
                            if (i25 != 0) {
                                z = z6;
                                i7 = i25;
                                i8 = 1;
                            } else if (tVar.h()) {
                                int i26 = tVar.i(3) + 3;
                                z = z6;
                                i7 = tVar.i(2);
                                i8 = i26;
                            } else {
                                if (tVar.h()) {
                                    z = z6;
                                    i8 = 1;
                                    c4 = '\b';
                                    c5 = 4;
                                } else {
                                    int i27 = tVar.i(2);
                                    if (i27 == 0) {
                                        c4 = '\b';
                                        c5 = 4;
                                        z = true;
                                    } else if (i27 == 1) {
                                        c4 = '\b';
                                        c5 = 4;
                                        z = z6;
                                        i8 = 2;
                                    } else if (i27 == 2) {
                                        c4 = '\b';
                                        c5 = 4;
                                        i8 = tVar.i(4) + 12;
                                        i7 = tVar.i(2);
                                        z = z6;
                                        if (i8 != 0) {
                                        }
                                        i9 = i18;
                                        i18 = i9 + i8;
                                        if (z) {
                                        }
                                    } else if (i27 != 3) {
                                        z = z6;
                                        c4 = '\b';
                                        c5 = 4;
                                    } else {
                                        c4 = '\b';
                                        int i28 = tVar.i(8) + 29;
                                        i7 = tVar.i(2);
                                        z = z6;
                                        i8 = i28;
                                        c5 = 4;
                                        if (i8 != 0 || paint2 == null) {
                                            i9 = i18;
                                        } else {
                                            if (bArr6 != 0) {
                                                i7 = bArr6[i7];
                                            }
                                            paint2.setColor(iArr[i7]);
                                            i9 = i18;
                                            canvas.drawRect(i18, i19, i18 + i8, i19 + 1, paint2);
                                        }
                                        i18 = i9 + i8;
                                        if (z) {
                                            tVar.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z6 = z;
                                        }
                                    }
                                    i7 = 0;
                                    i8 = 0;
                                    if (i8 != 0) {
                                    }
                                    i9 = i18;
                                    i18 = i9 + i8;
                                    if (z) {
                                    }
                                }
                                i7 = 0;
                                if (i8 != 0) {
                                }
                                i9 = i18;
                                i18 = i9 + i8;
                                if (z) {
                                }
                            }
                            c4 = '\b';
                            c5 = 4;
                            if (i8 != 0) {
                            }
                            i9 = i18;
                            i18 = i9 + i8;
                            if (z) {
                            }
                        }
                    case 17:
                        if (i4 == 3) {
                            bArr2 = bArr4 == null ? f3599j : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z7 = false;
                        while (true) {
                            int i29 = tVar.i(i24);
                            if (i29 != 0) {
                                z4 = z7;
                                i12 = i29;
                                i10 = 1;
                            } else if (tVar.h()) {
                                if (tVar.h()) {
                                    int i30 = tVar.i(i23);
                                    if (i30 == 0) {
                                        z4 = z7;
                                        i10 = 1;
                                    } else if (i30 != 1) {
                                        if (i30 == i23) {
                                            i10 = tVar.i(i24) + 9;
                                            i11 = tVar.i(i24);
                                        } else if (i30 != i22) {
                                            z4 = z7;
                                            i10 = 0;
                                        } else {
                                            i10 = tVar.i(i20) + 25;
                                            i11 = tVar.i(i24);
                                        }
                                        i12 = i11;
                                    } else {
                                        z4 = z7;
                                        i10 = i23;
                                    }
                                    i12 = 0;
                                } else {
                                    i10 = tVar.i(i23) + 4;
                                    i12 = tVar.i(i24);
                                }
                                z4 = z7;
                            } else {
                                int i31 = tVar.i(i22);
                                if (i31 != 0) {
                                    i10 = i31 + 2;
                                    z4 = z7;
                                    i12 = 0;
                                } else {
                                    z4 = true;
                                    i10 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i10 == 0 || paint2 == null) {
                                i13 = i18;
                                i14 = i22;
                                i15 = i23;
                            } else {
                                if (bArr2 != 0) {
                                    i12 = bArr2[i12];
                                }
                                paint2.setColor(iArr[i12]);
                                i14 = i22;
                                i15 = 2;
                                i13 = i18;
                                canvas.drawRect(i18, i19, i18 + i10, i19 + 1, paint2);
                            }
                            i18 = i13 + i10;
                            if (z4) {
                                tVar.c();
                                break;
                            } else {
                                z7 = z4;
                                i22 = i14;
                                i23 = i15;
                                i24 = 4;
                                i20 = 8;
                            }
                        }
                    case 18:
                        boolean z8 = false;
                        while (true) {
                            int i32 = tVar.i(8);
                            if (i32 != 0) {
                                z5 = z8;
                                i16 = 1;
                            } else if (tVar.h()) {
                                z5 = z8;
                                i16 = tVar.i(7);
                                i32 = tVar.i(8);
                            } else {
                                int i33 = tVar.i(7);
                                if (i33 != 0) {
                                    z5 = z8;
                                    i16 = i33;
                                    i32 = 0;
                                } else {
                                    z5 = true;
                                    i32 = 0;
                                    i16 = 0;
                                }
                            }
                            if (i16 == 0 || paint2 == null) {
                                i17 = i18;
                            } else {
                                paint2.setColor(iArr[i32]);
                                i17 = i18;
                                canvas.drawRect(i18, i19, i18 + i16, i19 + 1, paint2);
                            }
                            i18 = i17 + i16;
                            if (z5) {
                                break;
                            } else {
                                z8 = z5;
                            }
                        }
                        break;
                    default:
                        switch (i21) {
                            case Build.API_LEVELS.API_32 /* 32 */:
                                bArr5 = d(4, 4, tVar);
                                break;
                            case Build.API_LEVELS.API_33 /* 33 */:
                                bArr3 = d(4, 8, tVar);
                                break;
                            case Build.API_LEVELS.API_34 /* 34 */:
                                bArr4 = d(16, 8, tVar);
                                break;
                        }
                }
            } else {
                i19 += 2;
                i18 = i5;
            }
            paint2 = paint;
        }
    }

    public static a i(t tVar, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 8;
        int i11 = tVar.i(8);
        tVar.t(8);
        int i12 = 2;
        int i13 = i4 - 2;
        int i14 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] e4 = e();
        int[] f4 = f();
        while (i13 > 0) {
            int i15 = tVar.i(i10);
            int i16 = tVar.i(i10);
            int[] iArr2 = (i16 & 128) != 0 ? iArr : (i16 & 64) != 0 ? e4 : f4;
            if ((i16 & 1) != 0) {
                i8 = tVar.i(i10);
                i9 = tVar.i(i10);
                i5 = tVar.i(i10);
                i7 = tVar.i(i10);
                i6 = i13 - 6;
            } else {
                int i17 = tVar.i(6) << i12;
                int i18 = tVar.i(4) << 4;
                i5 = tVar.i(4) << 4;
                i6 = i13 - 4;
                i7 = tVar.i(i12) << 6;
                i8 = i17;
                i9 = i18;
            }
            if (i8 == 0) {
                i9 = i14;
                i5 = i9;
                i7 = 255;
            }
            double d4 = i8;
            double d5 = i9 - 128;
            double d6 = i5 - 128;
            iArr2[i15] = g((byte) (255 - (i7 & KotlinVersion.MAX_COMPONENT_VALUE)), J.j((int) ((1.402d * d5) + d4), 0, KotlinVersion.MAX_COMPONENT_VALUE), J.j((int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), J.j((int) ((d6 * 1.772d) + d4), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i13 = i6;
            i14 = 0;
            i11 = i11;
            f4 = f4;
            i10 = 8;
            i12 = 2;
        }
        return new a(i11, iArr, e4, f4);
    }

    public static c j(t tVar) {
        byte[] bArr;
        int i4 = tVar.i(16);
        tVar.t(4);
        int i5 = tVar.i(2);
        boolean h2 = tVar.h();
        tVar.t(1);
        byte[] bArr2 = J.f3264b;
        if (i5 == 1) {
            tVar.t(tVar.i(8) * 16);
        } else if (i5 == 0) {
            int i6 = tVar.i(16);
            int i7 = tVar.i(16);
            if (i6 > 0) {
                bArr2 = new byte[i6];
                tVar.l(i6, bArr2);
            }
            if (i7 > 0) {
                bArr = new byte[i7];
                tVar.l(i7, bArr);
                return new c(i4, h2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i4, h2, bArr2, bArr);
    }

    @Override // V0.l
    public final void b(byte[] bArr, int i4, int i5, k kVar, InterfaceC0113f interfaceC0113f) {
        g gVar;
        boolean z;
        V0.a aVar;
        char c4;
        char c5;
        char c6;
        int i6;
        ArrayList arrayList;
        int i7;
        b bVar;
        g gVar2;
        e eVar;
        int i8;
        int i9;
        int i10;
        int i11;
        e eVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        t tVar = new t(i4 + i5, bArr);
        tVar.q(i4);
        while (true) {
            int b4 = tVar.b();
            gVar = this.f3605f;
            z = true;
            if (b4 >= 48 && tVar.i(8) == 15) {
                int i16 = tVar.i(8);
                int i17 = tVar.i(16);
                int i18 = tVar.i(16);
                int f4 = tVar.f() + i18;
                if (i18 * 8 > tVar.b()) {
                    AbstractC0108a.s("DvbParser", "Data field length exceeds limit");
                    tVar.t(tVar.b());
                } else {
                    switch (i16) {
                        case 16:
                            if (i17 == gVar.f3588a) {
                                A a3 = gVar.f3596i;
                                tVar.i(8);
                                int i19 = tVar.i(4);
                                int i20 = tVar.i(2);
                                tVar.t(2);
                                int i21 = i18 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i21 > 0) {
                                    int i22 = tVar.i(8);
                                    tVar.t(8);
                                    i21 -= 6;
                                    sparseArray.put(i22, new d(tVar.i(16), tVar.i(16)));
                                }
                                A a4 = new A(i19, i20, sparseArray);
                                if (i20 != 0) {
                                    gVar.f3596i = a4;
                                    gVar.f3590c.clear();
                                    gVar.f3591d.clear();
                                    gVar.f3592e.clear();
                                    break;
                                } else if (a3 != null && a3.f1810a != i19) {
                                    gVar.f3596i = a4;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            A a5 = gVar.f3596i;
                            SparseArray sparseArray2 = gVar.f3590c;
                            if (i17 == gVar.f3588a && a5 != null) {
                                int i23 = tVar.i(8);
                                tVar.t(4);
                                boolean h2 = tVar.h();
                                tVar.t(3);
                                int i24 = tVar.i(16);
                                int i25 = tVar.i(16);
                                tVar.i(3);
                                int i26 = tVar.i(3);
                                tVar.t(2);
                                int i27 = tVar.i(8);
                                int i28 = tVar.i(8);
                                int i29 = tVar.i(4);
                                int i30 = tVar.i(2);
                                tVar.t(2);
                                int i31 = i18 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i31 > 0) {
                                    int i32 = tVar.i(16);
                                    int i33 = tVar.i(2);
                                    tVar.i(2);
                                    int i34 = tVar.i(12);
                                    tVar.t(4);
                                    int i35 = tVar.i(12);
                                    int i36 = i31 - 6;
                                    if (i33 == 1 || i33 == 2) {
                                        tVar.i(8);
                                        tVar.i(8);
                                        i31 -= 8;
                                    } else {
                                        i31 = i36;
                                    }
                                    sparseArray3.put(i32, new f(i34, i35));
                                }
                                e eVar3 = new e(i23, h2, i24, i25, i26, i27, i28, i29, i30, sparseArray3);
                                if (a5.f1811b == 0 && (eVar2 = (e) sparseArray2.get(i23)) != null) {
                                    SparseArray sparseArray4 = eVar2.f3585j;
                                    for (int i37 = 0; i37 < sparseArray4.size(); i37++) {
                                        eVar3.f3585j.put(sparseArray4.keyAt(i37), (f) sparseArray4.valueAt(i37));
                                    }
                                }
                                sparseArray2.put(eVar3.f3576a, eVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i17 == gVar.f3588a) {
                                a i38 = i(tVar, i18);
                                gVar.f3591d.put(i38.f3560a, i38);
                                break;
                            } else if (i17 == gVar.f3589b) {
                                a i39 = i(tVar, i18);
                                gVar.f3593f.put(i39.f3560a, i39);
                                break;
                            }
                            break;
                        case C0583e9.f11743C /* 19 */:
                            if (i17 == gVar.f3588a) {
                                c j4 = j(tVar);
                                gVar.f3592e.put(j4.f3570a, j4);
                                break;
                            } else if (i17 == gVar.f3589b) {
                                c j5 = j(tVar);
                                gVar.f3594g.put(j5.f3570a, j5);
                                break;
                            }
                            break;
                        case C0583e9.f11744D /* 20 */:
                            if (i17 == gVar.f3588a) {
                                tVar.t(4);
                                boolean h4 = tVar.h();
                                tVar.t(3);
                                int i40 = tVar.i(16);
                                int i41 = tVar.i(16);
                                if (h4) {
                                    int i42 = tVar.i(16);
                                    i12 = tVar.i(16);
                                    i15 = tVar.i(16);
                                    i13 = tVar.i(16);
                                    i14 = i42;
                                } else {
                                    i12 = i40;
                                    i13 = i41;
                                    i14 = 0;
                                    i15 = 0;
                                }
                                gVar.f3595h = new b(i40, i41, i14, i12, i15, i13);
                                break;
                            }
                            break;
                    }
                    tVar.u(f4 - tVar.f());
                }
            }
        }
        A a6 = gVar.f3596i;
        if (a6 == null) {
            G g4 = I.f15571b;
            aVar = new V0.a(-9223372036854775807L, -9223372036854775807L, a0.f15605e);
        } else {
            b bVar2 = gVar.f3595h;
            if (bVar2 == null) {
                bVar2 = this.f3603d;
            }
            Bitmap bitmap = this.f3606g;
            Canvas canvas = this.f3602c;
            if (bitmap == null || bVar2.f3564a + 1 != bitmap.getWidth() || bVar2.f3565b + 1 != this.f3606g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f3564a + 1, bVar2.f3565b + 1, Bitmap.Config.ARGB_8888);
                this.f3606g = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) a6.f1812c;
            int i43 = 0;
            while (i43 < sparseArray5.size()) {
                canvas.save();
                d dVar = (d) sparseArray5.valueAt(i43);
                e eVar4 = (e) gVar.f3590c.get(sparseArray5.keyAt(i43));
                int i44 = dVar.f3574a + bVar2.f3566c;
                int i45 = dVar.f3575b + bVar2.f3568e;
                int i46 = eVar4.f3578c;
                int i47 = eVar4.f3581f;
                int i48 = eVar4.f3579d;
                boolean z4 = z;
                int i49 = i44 + i46;
                int i50 = i45 + i48;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i44, i45, Math.min(i49, bVar2.f3567d), Math.min(i50, bVar2.f3569f));
                a aVar2 = (a) gVar.f3591d.get(i47);
                if (aVar2 == null && (aVar2 = (a) gVar.f3593f.get(i47)) == null) {
                    aVar2 = this.f3604e;
                }
                SparseArray sparseArray7 = eVar4.f3585j;
                int i51 = i43;
                int i52 = 0;
                while (i52 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i52);
                    SparseArray sparseArray8 = sparseArray7;
                    f fVar = (f) sparseArray7.valueAt(i52);
                    int i53 = i45;
                    c cVar = (c) gVar.f3592e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) gVar.f3594g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.f3571b ? null : this.f3600a;
                        int i54 = i44;
                        int i55 = eVar4.f3580e;
                        gVar2 = gVar;
                        int i56 = i54 + fVar.f3586a;
                        int i57 = i53 + fVar.f3587b;
                        int i58 = i48;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i9 = i46;
                        i8 = i54;
                        arrayList = arrayList2;
                        i7 = i53;
                        e eVar5 = eVar4;
                        int[] iArr = i55 == 3 ? aVar2.f3563d : i55 == 2 ? aVar2.f3562c : aVar2.f3561b;
                        eVar = eVar5;
                        i10 = i52;
                        i11 = i58;
                        h(cVar2.f3572c, iArr, i55, i56, i57, paint2, canvas);
                        h(cVar2.f3573d, iArr, i55, i56, i57 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i7 = i53;
                        bVar = bVar2;
                        gVar2 = gVar;
                        eVar = eVar4;
                        i8 = i44;
                        i9 = i46;
                        i10 = i52;
                        i11 = i48;
                    }
                    i52 = i10 + 1;
                    i46 = i9;
                    i45 = i7;
                    eVar4 = eVar;
                    i44 = i8;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    gVar = gVar2;
                    i48 = i11;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                g gVar3 = gVar;
                int i59 = i45;
                e eVar6 = eVar4;
                int i60 = i44;
                int i61 = i46;
                int i62 = i48;
                if (eVar6.f3577b) {
                    int i63 = eVar6.f3580e;
                    if (i63 == 3) {
                        i6 = aVar2.f3563d[eVar6.f3582g];
                        c6 = 2;
                    } else {
                        c6 = 2;
                        i6 = i63 == 2 ? aVar2.f3562c[eVar6.f3583h] : aVar2.f3561b[eVar6.f3584i];
                    }
                    Paint paint3 = this.f3601b;
                    paint3.setColor(i6);
                    c4 = c6;
                    c5 = 3;
                    canvas.drawRect(i60, i59, i49, i50, paint3);
                } else {
                    c4 = 2;
                    c5 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.f3606g, i60, i59, i61, i62);
                float f5 = bVar3.f3564a;
                float f6 = bVar3.f3565b;
                arrayList3.add(new V.b(null, null, null, createBitmap2, i59 / f6, 0, 0, i60 / f5, 0, Integer.MIN_VALUE, -3.4028235E38f, i61 / f5, i62 / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i43 = i51 + 1;
                z = z4;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                gVar = gVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new V0.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        interfaceC0113f.accept(aVar);
    }

    @Override // V0.l
    public final int c() {
        return 2;
    }

    @Override // V0.l
    public final void reset() {
        g gVar = this.f3605f;
        gVar.f3590c.clear();
        gVar.f3591d.clear();
        gVar.f3592e.clear();
        gVar.f3593f.clear();
        gVar.f3594g.clear();
        gVar.f3595h = null;
        gVar.f3596i = null;
    }
}
