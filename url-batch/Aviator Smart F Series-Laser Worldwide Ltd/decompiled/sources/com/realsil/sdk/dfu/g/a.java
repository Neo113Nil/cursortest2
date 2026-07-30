package com.realsil.sdk.dfu.g;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.RtkDfu;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f15752d = RtkDfu.VDBG;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f15753e = RtkDfu.TDBG;

    /* renamed from: a, reason: collision with root package name */
    public int f15754a;

    /* renamed from: b, reason: collision with root package name */
    public int f15755b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f15756c;

    public a(int i8, int i9, byte[] bArr) {
        this.f15754a = i8;
        this.f15755b = i9;
        this.f15756c = bArr;
        f15752d = RtkDfu.VDBG;
    }

    public static List a(byte[] bArr) {
        boolean z7;
        String format;
        String format2;
        if (f15752d) {
            ZLogger.v(String.format("parseHeaders:(%d)%s", Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
        }
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        while (i8 < length) {
            short s7 = ByteArrayConverter.toShort(bArr, i8, 0);
            int i10 = i8 + 2;
            if (!a(s7)) {
                int i11 = length - 1;
                if (a(bArr, i10, i11, (byte) 0) || a(bArr, i10, i11, (byte) -1)) {
                    z7 = f15753e;
                    format = "no more data";
                    ZLogger.v(z7, format);
                    break;
                }
                ZLogger.v(RtkDfu.TDBG, String.format("undefined mp type: 0x%04X", Integer.valueOf(s7)));
            }
            i8 += 3;
            int i12 = bArr[i10] & 255;
            if (i12 != 0) {
                int i13 = i8 + i12;
                if (i13 > length) {
                    z7 = f15753e;
                    format = String.format("invalid mp header length(%d) for type=0x%04X", Integer.valueOf(i12), Integer.valueOf(s7));
                    ZLogger.v(z7, format);
                    break;
                }
                if (s7 != 1) {
                    if (s7 == 2) {
                        if (i12 != 4) {
                            format2 = String.format("invalid mp header length(%d) for type=0x%04X", Integer.valueOf(i12), Integer.valueOf(s7));
                            ZLogger.v(format2);
                            break;
                        }
                        i9 |= 2;
                    } else if (s7 == 35) {
                        if (i12 != 8) {
                            format2 = String.format("invalid mp header length(%d) for type=0x%04X", Integer.valueOf(i12), Integer.valueOf(s7));
                            ZLogger.v(format2);
                            break;
                        }
                        i9 |= 2;
                    } else if (s7 == 3) {
                        i9 |= 4;
                    } else if (s7 == 4) {
                        i9 |= 8;
                    }
                    arrayList.add(new a(s7, i12, Arrays.copyOfRange(bArr, i8, i13)));
                    i8 = i13;
                } else {
                    if (i12 != 2) {
                        format2 = String.format("invalid mp header length(%d) for type=0x%04X", Integer.valueOf(i12), Integer.valueOf(s7));
                        ZLogger.v(format2);
                        break;
                    }
                    i9 |= 1;
                    try {
                        arrayList.add(new a(s7, i12, Arrays.copyOfRange(bArr, i8, i13)));
                        i8 = i13;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (i9 == 15) {
            return arrayList;
        }
        ZLogger.w(String.format("miss required type 0x%04X", Integer.valueOf(i9)));
        return new ArrayList();
    }

    public int b() {
        return this.f15754a;
    }

    public String toString() {
        return String.format(Locale.US, "definedId:0x%04d, data: (%d) %s", Integer.valueOf(this.f15754a), Integer.valueOf(this.f15755b), DataConverter.bytes2Hex(this.f15756c));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i8) {
        if (i8 != 254 && i8 != 256 && i8 != 1 && i8 != 2 && i8 != 3 && i8 != 4) {
            switch (i8) {
                default:
                    switch (i8) {
                        default:
                            switch (i8) {
                                default:
                                    switch (i8) {
                                        case 80:
                                        case 81:
                                        case 82:
                                            break;
                                        default:
                                            return false;
                                    }
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                    return true;
                            }
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                            break;
                    }
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
            }
        }
        return true;
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        for (int length2 = bArr.length - 1; length2 >= 0; length2--) {
            byte b8 = bArr[length2];
            if (b8 == -1 || b8 == 0) {
                length--;
            }
        }
        return new String(bArr, 0, length, StandardCharsets.US_ASCII);
    }

    public static boolean a(byte[] bArr, int i8, int i9, byte b8) {
        while (i8 <= i9) {
            if ((bArr[i8] & 255) != b8) {
                return false;
            }
            i8++;
        }
        return true;
    }

    public byte[] a() {
        return this.f15756c;
    }
}
