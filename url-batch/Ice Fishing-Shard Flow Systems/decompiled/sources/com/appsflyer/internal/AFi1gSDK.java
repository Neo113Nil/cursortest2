package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes.dex */
public class AFi1gSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventParameterName;
    private static long afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static int afLogForce;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4311d;

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f4312e;
    private static int force;

    /* renamed from: i, reason: collision with root package name */
    private static Object f4313i;
    private static byte[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private static long f4314v;

    /* renamed from: w, reason: collision with root package name */
    private static Object f4315w;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:4:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s7, byte b7, int i2) {
        int i5;
        int i7;
        int i8 = $13;
        $12 = (i8 + 7) % 128;
        byte[] bArr = $$a;
        int i9 = 1151 - i2;
        int i10 = b7 + 1;
        int i11 = 119 - s7;
        byte[] bArr2 = new byte[i10];
        if (bArr == null) {
            $12 = (i8 + 109) % 128;
            int i12 = i9;
            i7 = 0;
            int i13 = i10;
            i11 = (i13 + (-i11)) - 3;
            i9 = i12 + 1;
            i5 = i7;
            i7 = i5 + 1;
            bArr2[i5] = (byte) i11;
            if (i7 == i10) {
                String str = new String(bArr2, 0);
                int i14 = $12 + 93;
                $13 = i14 % 128;
                if (i14 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            int i15 = bArr[i9];
            $13 = ($12 + 55) % 128;
            int i16 = i9;
            i13 = i11;
            i11 = i15;
            i12 = i16;
            i11 = (i13 + (-i11)) - 3;
            i9 = i12 + 1;
            i5 = i7;
            i7 = i5 + 1;
            bArr2[i5] = (byte) i11;
            if (i7 == i10) {
            }
        } else {
            i5 = 0;
            i7 = i5 + 1;
            bArr2[i5] = (byte) i11;
            if (i7 == i10) {
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 7532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1gSDK.<clinit>():void");
    }

    private AFi1gSDK() {
    }

    public static int getCurrencyIso4217Code(int i2) {
        int i5 = $11;
        int i7 = ((i5 ^ 21) + ((i5 & 21) << 1)) % 128;
        $10 = i7;
        Object obj = f4315w;
        $11 = ((i7 ^ 11) + ((i7 & 11) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[289], bArr[894], (short) 583), true, (ClassLoader) f4313i).getMethod($$c(bArr[56], bArr[326], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
            $11 = ($10 + 97) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(int i2, int i5, char c7) {
        int i7 = $10;
        int i8 = (i7 & 25) + (i7 | 25);
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        Object obj = f4315w;
        $11 = ((i7 & 73) + (i7 | 73)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i5), Character.valueOf(c7)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[289], bArr[894], (short) 583), true, (ClassLoader) f4313i);
            byte b7 = bArr[232];
            byte b8 = bArr[13];
            String $$c = $$c(b7, b8, b8);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i9 = $10;
            $11 = ((i9 & 121) + (i9 | 121)) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) {
        int currentTimeMillis = (int) System.currentTimeMillis();
        int i2 = ~(380291229 | currentTimeMillis);
        int i5 = ~currentTimeMillis;
        int i7 = ~((380291229 & i5) | (380291229 ^ i5));
        int i8 = (((i7 & 310411396) | (i7 ^ 310411396)) * 345) + ((((i2 & 332130) | (332130 ^ i2)) * 345) - 1845393600);
        int i9 = -(-((~((currentTimeMillis & (-332131)) | ((-332131) ^ currentTimeMillis))) * 345));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int currentTimeMillis2 = (int) System.currentTimeMillis();
        int i11 = ~((~currentTimeMillis2) | 875520558);
        int i12 = -(-(((i11 & (-939486207)) | ((-939486207) ^ i11)) * (-712)));
        int i13 = (124585913 ^ i12) + ((i12 & 124585913) << 1);
        int i14 = ~currentTimeMillis2;
        int i15 = (66472924 ^ i14) | (66472924 & i14);
        int i16 = ~((i15 & 875520558) | (i15 ^ 875520558));
        int i17 = ~((currentTimeMillis2 & (-63965649)) | ((-63965649) ^ currentTimeMillis2));
        int i18 = -(-(((i17 & i16) | (i16 ^ i17)) * (-712)));
        int i19 = ((i13 | i18) << 1) - (i18 ^ i13);
        int i20 = -(-(((~(i14 | 875520558)) | 66472924) * 712));
        if (i10 > ((i19 | i20) << 1) - (i20 ^ i19)) {
            throw null;
        }
        Object obj2 = f4315w;
        $10 = ($11 + 47) % 128;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[289], bArr[894], (short) 583), true, (ClassLoader) f4313i).getMethod($$c(bArr[56], bArr[326], bArr[7]), Object.class).invoke(obj2, obj)).intValue();
            int i21 = $11 + 39;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 42 / 0;
            }
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i2 = $11;
        $10 = ((i2 ^ 27) + ((i2 & 27) << 1)) % 128;
        byte[] bArr = new byte[1172];
        System.arraycopy("\t\u009bf\u000fð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úúò\nýôñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5È\u0010\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È/ü÷Ô,Ë)\u0005ûú\u0000÷\u0004Íü3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7º\u001e\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5È\u0010\föõýÿî$åþø\u0005ê\b÷þ\u001dæîú\u0005ú\u0004\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Ç\u0011\fö$·Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:öÑùþü+\u0003É0Ë2úû\u0001È0Ì4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010ÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 174;
        $10 = ($11 + 27) % 128;
    }

    private static void getCurrencyIso4217Code(int i2, int i5) {
        int i7 = $10 + 119;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 21 / 0;
        }
    }
}
