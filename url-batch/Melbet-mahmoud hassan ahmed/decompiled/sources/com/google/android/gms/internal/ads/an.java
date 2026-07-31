package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f2869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2870b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2871c;

    private an(List<byte[]> list, int i7, int i8, int i9, float f7) {
        this.f2869a = list;
        this.f2870b = i7;
        this.f2871c = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: ArrayIndexOutOfBoundsException -> 0x01b1, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01b1, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a4, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01ab, B:112:0x01b0), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[Catch: ArrayIndexOutOfBoundsException -> 0x01b1, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01b1, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a4, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01ab, B:112:0x01b0), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e A[Catch: ArrayIndexOutOfBoundsException -> 0x01b1, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01b1, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a4, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01ab, B:112:0x01b0), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a A[Catch: ArrayIndexOutOfBoundsException -> 0x01b1, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01b1, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:9:0x002a, B:11:0x0031, B:15:0x0040, B:37:0x00dc, B:39:0x00e5, B:40:0x0104, B:42:0x011e, B:43:0x0121, B:45:0x012e, B:48:0x014e, B:54:0x014b, B:56:0x0156, B:58:0x015c, B:60:0x0162, B:62:0x016a, B:65:0x0176, B:68:0x017f, B:69:0x0184, B:71:0x01a4, B:75:0x00eb, B:76:0x00f9, B:78:0x00fe, B:80:0x008e, B:82:0x0094, B:83:0x009a, B:89:0x00b3, B:97:0x00ca, B:101:0x00d6, B:104:0x00d9, B:111:0x01ab, B:112:0x01b0), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static an a(rm rmVar) {
        int i7;
        int i8;
        float f7;
        int c7;
        int i9;
        int c8;
        boolean e7;
        int a7;
        try {
            rmVar.w(4);
            int g7 = (rmVar.g() & 3) + 1;
            if (g7 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int g8 = rmVar.g() & 31;
            for (int i10 = 0; i10 < g8; i10++) {
                arrayList.add(b(rmVar));
            }
            int g9 = rmVar.g();
            for (int i11 = 0; i11 < g9; i11++) {
                arrayList.add(b(rmVar));
            }
            float f8 = 1.0f;
            if (g8 > 0) {
                sm smVar = new sm((byte[]) arrayList.get(0), g7, ((byte[]) arrayList.get(0)).length);
                smVar.d(8);
                int a8 = smVar.a(8);
                smVar.d(16);
                smVar.c();
                if (a8 != 100 && a8 != 110 && a8 != 122 && a8 != 244 && a8 != 44 && a8 != 83 && a8 != 86 && a8 != 118 && a8 != 128 && a8 != 138) {
                    c7 = 1;
                    smVar.c();
                    c8 = smVar.c();
                    if (c8 != 0) {
                        smVar.c();
                    } else if (c8 == 1) {
                        smVar.e();
                        smVar.b();
                        smVar.b();
                        long c9 = smVar.c();
                        for (int i12 = 0; i12 < c9; i12++) {
                            smVar.c();
                        }
                    }
                    smVar.c();
                    smVar.d(1);
                    int c10 = smVar.c() + 1;
                    int c11 = smVar.c() + 1;
                    e7 = smVar.e();
                    int i13 = 2 - (e7 ? 1 : 0);
                    int i14 = c11 * i13;
                    if (!e7) {
                        smVar.d(1);
                    }
                    smVar.d(1);
                    int i15 = c10 * 16;
                    int i16 = i14 * 16;
                    if (smVar.e()) {
                        int c12 = smVar.c();
                        int c13 = smVar.c();
                        int c14 = smVar.c();
                        int c15 = smVar.c();
                        if (c7 != 0) {
                            int i17 = c7 == 3 ? 1 : 2;
                            i13 *= c7 == 1 ? 2 : 1;
                            r3 = i17;
                        }
                        i15 -= (c12 + c13) * r3;
                        i16 -= (c14 + c15) * i13;
                    }
                    if (smVar.e() && smVar.e()) {
                        a7 = smVar.a(8);
                        if (a7 != 255) {
                            int a9 = smVar.a(16);
                            int a10 = smVar.a(16);
                            if (a9 != 0 && a10 != 0) {
                                f8 = a9 / a10;
                            }
                        } else if (a7 < 17) {
                            f8 = pm.f10273b[a7];
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Unexpected aspect_ratio_idc value: ");
                            sb.append(a7);
                            Log.w("NalUnitUtil", sb.toString());
                        }
                    }
                    f7 = f8;
                    i8 = i16;
                    i7 = i15;
                }
                c7 = smVar.c();
                if (c7 == 3) {
                    smVar.e();
                    i9 = 3;
                } else {
                    i9 = c7;
                }
                smVar.c();
                smVar.c();
                smVar.d(1);
                if (smVar.e()) {
                    int i18 = i9 != 3 ? 8 : 12;
                    int i19 = 0;
                    while (i19 < i18) {
                        if (smVar.e()) {
                            int i20 = i19 < 6 ? 16 : 64;
                            int i21 = 8;
                            int i22 = 8;
                            for (int i23 = 0; i23 < i20; i23++) {
                                if (i21 != 0) {
                                    i21 = ((smVar.b() + i22) + 256) % 256;
                                }
                                if (i21 != 0) {
                                    i22 = i21;
                                }
                            }
                        }
                        i19++;
                    }
                }
                smVar.c();
                c8 = smVar.c();
                if (c8 != 0) {
                }
                smVar.c();
                smVar.d(1);
                int c102 = smVar.c() + 1;
                int c112 = smVar.c() + 1;
                e7 = smVar.e();
                int i132 = 2 - (e7 ? 1 : 0);
                int i142 = c112 * i132;
                if (!e7) {
                }
                smVar.d(1);
                int i152 = c102 * 16;
                int i162 = i142 * 16;
                if (smVar.e()) {
                }
                if (smVar.e()) {
                    a7 = smVar.a(8);
                    if (a7 != 255) {
                    }
                }
                f7 = f8;
                i8 = i162;
                i7 = i152;
            } else {
                i7 = -1;
                i8 = -1;
                f7 = 1.0f;
            }
            return new an(arrayList, g7, i7, i8, f7);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw new af("Error parsing AVC config", e8);
        }
    }

    private static byte[] b(rm rmVar) {
        int j7 = rmVar.j();
        int c7 = rmVar.c();
        rmVar.w(j7);
        return km.b(rmVar.f11225a, c7, j7);
    }
}
