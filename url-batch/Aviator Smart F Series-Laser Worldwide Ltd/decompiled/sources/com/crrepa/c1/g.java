package com.crrepa.c1;

import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;

/* loaded from: classes3.dex */
public class g {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12344a;

        static {
            int[] iArr = new int[CRPWatchFaceLayoutInfo.CompressionType.values().length];
            f12344a = iArr;
            try {
                iArr[CRPWatchFaceLayoutInfo.CompressionType.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12344a[CRPWatchFaceLayoutInfo.CompressionType.LZO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12344a[CRPWatchFaceLayoutInfo.CompressionType.RGB_LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12344a[CRPWatchFaceLayoutInfo.CompressionType.SIFLI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12344a[CRPWatchFaceLayoutInfo.CompressionType.BLUETRUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12344a[CRPWatchFaceLayoutInfo.CompressionType.JIELI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12344a[CRPWatchFaceLayoutInfo.CompressionType.JIELI_707.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static com.crrepa.l0.b a(CRPWatchFaceLayoutInfo.CompressionType compressionType, boolean z7) {
        switch (a.f12344a[compressionType.ordinal()]) {
            case 1:
                return new b(z7);
            case 2:
                return new e(z7);
            case 3:
                return new d(z7);
            case 4:
                return new f(z7);
            case 5:
                return new com.crrepa.c1.a(z7);
            case 6:
            case 7:
                return new c(compressionType, z7);
            default:
                throw new IllegalStateException("BaseWatchFaceBackgroudTransInitiator Unexpected value: " + compressionType);
        }
    }
}
