package com.crrepa.b1;

import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;

/* loaded from: classes2.dex */
public class i {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10881a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10882b;

        static {
            int[] iArr = new int[CRPWatchFaceLayoutInfo.CompressionType.values().length];
            f10882b = iArr;
            try {
                iArr[CRPWatchFaceLayoutInfo.CompressionType.LZO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10882b[CRPWatchFaceLayoutInfo.CompressionType.RGB_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10882b[CRPWatchFaceLayoutInfo.CompressionType.SIFLI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10882b[CRPWatchFaceLayoutInfo.CompressionType.BLUETRUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10882b[CRPWatchFaceLayoutInfo.CompressionType.RTK_8773.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10882b[CRPWatchFaceLayoutInfo.CompressionType.JIELI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[b.values().length];
            f10881a = iArr2;
            try {
                iArr2[b.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10881a[b.LZO.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10881a[b.AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10881a[b.RGB_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10881a[b.SIFLI.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10881a[b.BLUETRUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10881a[b.RTK_8773.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10881a[b.JIELI.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public enum b {
        ORIGINAL,
        LZO,
        RGB_LINE,
        AVATAR,
        SIFLI,
        BLUETRUM,
        RTK_8773,
        JIELI
    }

    public static b a(CRPWatchFaceLayoutInfo.CompressionType compressionType) {
        if (compressionType == null) {
            return b.ORIGINAL;
        }
        switch (a.f10882b[compressionType.ordinal()]) {
        }
        return b.ORIGINAL;
    }

    public static com.crrepa.l0.b a(b bVar) {
        switch (a.f10881a[bVar.ordinal()]) {
            case 1:
                return new com.crrepa.b1.b();
            case 2:
                return new e();
            case 3:
                return new com.crrepa.n0.a();
            case 4:
                return new d();
            case 5:
                return new g();
            case 6:
                return new com.crrepa.b1.a();
            case 7:
                return new f();
            case 8:
                return new c();
            default:
                throw new IllegalStateException("BaseWatchFaceBackgroudTransInitiator Unexpected value: " + bVar);
        }
    }
}
