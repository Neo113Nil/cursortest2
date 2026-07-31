package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.BuildConfig;
import java.util.Map;

/* loaded from: classes.dex */
public class AFi1jSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventParameterName;
    private static long afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static int afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    private static Object f13372d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f13373e;
    private static int force;

    /* renamed from: i, reason: collision with root package name */
    private static byte[] f13374i;
    private static byte[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private static int f13375v;

    /* renamed from: w, reason: collision with root package name */
    private static Object f13376w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b4, byte b5, short s4) {
        int i4;
        int i5 = b4 + 33;
        byte[] bArr = $$a;
        int i6 = 1161 - s4;
        byte[] bArr2 = new byte[49 - b5];
        int i7 = 48 - b5;
        if (bArr == null) {
            int i8 = i7;
            i5 = i6;
            i4 = 0;
            i6++;
            i5 += i8;
            $13 = ($12 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
                return new String(bArr2, 0);
            }
            i4++;
            i8 = bArr[i6];
            $13 = ($12 + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i6++;
            i5 += i8;
            $13 = ($12 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    static {
        /*
            Method dump skipped, instructions count: 7698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.<clinit>():void");
    }

    private AFi1jSDK() {
    }

    public static Object AFAdRevenueData(int i4, char c4, int i5) {
        Object obj;
        int i6 = $10;
        int i7 = i6 + 99;
        $11 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i7 % 2 == 0) {
            obj = f13376w;
            int i8 = 72 / 0;
        } else {
            obj = f13376w;
        }
        $11 = ((i6 & 37) + (i6 | 37)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i4), Character.valueOf(c4), Integer.valueOf(i5)};
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[104]);
            byte b5 = bArr[18];
            Class<?> cls = Class.forName($$c(b4, b5, (short) ((b5 ^ 556) | (b5 & 556))), true, (ClassLoader) f13372d);
            String $$c = $$c(bArr[239], bArr[449], bArr[55]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            $11 = ($10 + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMediationNetwork(int i4) {
        Object obj = f13376w;
        int i5 = ($10 + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $11 = i5;
        $10 = ((i5 & 67) + (i5 | 67)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {Integer.valueOf(i4)};
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[104]);
            byte b5 = bArr[18];
            return ((Integer) Class.forName($$c(b4, b5, (short) ((b5 ^ 556) | (b5 & 556))), true, (ClassLoader) f13372d).getMethod($$c(bArr[239], bArr[449], bArr[55]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getRevenue(int i4, int i5) {
        int i6 = $10;
        int i7 = (i6 & 97) + (i6 | 97);
        $11 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i7 % 2 == 0) {
            int i8 = 97 / 0;
        }
    }

    static void init$0() {
        int i4;
        int i5 = $10;
        int i6 = (i5 ^ 113) + ((i5 & 113) << 1);
        $11 = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            byte[] bArr = new byte[1170];
            System.arraycopy("\u000e\u0016«f\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»6\u000eï\u0016ê\u0001\nùÉ\u0016.ï\u0016ê\u0001\nùó\u000eüý\nïê!ñ\u0002\u0006\u000b\u0005\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È6ìñ\u0007\b\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿþ\u000fÒ#\u0003ù\u000eÑ%\tþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\tþ\u000fÏ\u001e\u0002\u0005ýß%\t5ý\u0013íÎ5ý\u0013íÎ÷\u0015ëÍ;\u0006¿\u0018#\u0003ù÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\t÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\bþ\u000fÜ\"ý\u0001õ\r\u0002\u0005\fõ\u0001ú\u0004þ\u0002\u0005ý\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿñ\u0007\u0014ê\u0005\u0006þ\ré\u001b÷\u000bñë\u0006ê\b÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\f\t\u0003\u0004òë\u0003í\b2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5Î\u0001\u0006)Ñ2Ôø\u0002\u0003ý\u0006ù0\u0001Êþ\u000fÞ\u0013\u000eü\u0006ýñ\u0002÷\u0015ëÍ@÷\u000fº'ýúþ\u000fÜ\u0011\u0013ô÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\fóü\u0003â/÷\u0000\r÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\f\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005%ÆEÝñ\u0007\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005#È6ìñ\u0007\b\u0000þ\u000fÏ2ý\u0000ó\tõ\u0016Ð*üÅþÿ\u0006\f,õ\u0001øþ\u0007óü\u0003ò\u000fÞ\u0013ü\u0003ë\u001fþ\rë\u0004ì\bû÷\u000bñþ\u000fÒþ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003\u0006õõý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\u0003ò\u0003à!\u0013þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\u0001\u0007ù\u000fñþ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Ù%\u0002\u0005ÿß!þóü\fþ\u000fÚ\u0017\u0013üÑ)\u0006þ\u0007÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Õ)\u0006þ\u0007þ\u000fß\u0016\u0011ë÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fûÓ7ûñÜ1\u0000ï\u0018÷\u0015ëÍ;\u0006¿\u0015)\u0003\u0004òü\u0001\nùý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\rûï\u000fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rñ\u0013ôä\u001d\n\u0001ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000eó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿþ\u000fÏ,þ\u0003ÿÿ÷\t\u0006à%÷õë\bè\b\u0003ò\u0003ß)õ\u0012\u0000\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È9éñ\u0007ÙS2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0007,\u0004ÿ\u0001Òú4Í2Ë\u0003\u0002ü5Í1Éë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµþ\u000fÞ\u0013\u0011ï\t\u0007ð".getBytes("ISO-8859-1"), 0, bArr, 0, 1170);
            $$a = bArr;
            i4 = 74;
        } else {
            byte[] bArr2 = new byte[1170];
            System.arraycopy("\u000e\u0016«f\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»6\u000eï\u0016ê\u0001\nùÉ\u0016.ï\u0016ê\u0001\nùó\u000eüý\nïê!ñ\u0002\u0006\u000b\u0005\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È6ìñ\u0007\b\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿ\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿþ\u000fÒ#\u0003ù\u000eÑ%\tþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\tþ\u000fÏ\u001e\u0002\u0005ýß%\t5ý\u0013íÎ5ý\u0013íÎ÷\u0015ëÍ;\u0006¿\u0018#\u0003ù÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\t÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\bþ\u000fÜ\"ý\u0001õ\r\u0002\u0005\fõ\u0001ú\u0004þ\u0002\u0005ý\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿñ\u0007\u0014ê\u0005\u0006þ\ré\u001b÷\u000bñë\u0006ê\b÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿ\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\f\t\u0003\u0004òë\u0003í\b2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ5Î\u0001\u0006)Ñ2Ôø\u0002\u0003ý\u0006ù0\u0001Êþ\u000fÞ\u0013\u000eü\u0006ýñ\u0002÷\u0015ëÍ@÷\u000fº'ýúþ\u000fÜ\u0011\u0013ô÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\fóü\u0003â/÷\u0000\r÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\f\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005%ÆEÝñ\u0007\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005#È6ìñ\u0007\b\u0000þ\u000fÏ2ý\u0000ó\tõ\u0016Ð*üÅþÿ\u0006\f,õ\u0001øþ\u0007óü\u0003ò\u000fÞ\u0013ü\u0003ë\u001fþ\rë\u0004ì\bû÷\u000bñþ\u000fÒþ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003\u0006õõý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\u0003ò\u0003à!\u0013þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\u0001\u0007ù\u000fñþ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Ù%\u0002\u0005ÿß!þóü\fþ\u000fÚ\u0017\u0013üÑ)\u0006þ\u0007÷\u0015ëÍGÿõ\u0003ÂLï\u0007¾,\u000f\u0007Õ)\u0006þ\u0007þ\u000fß\u0016\u0011ë÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fûÓ7ûñÜ1\u0000ï\u0018÷\u0015ëÍ;\u0006¿\u0015)\u0003\u0004òü\u0001\nùý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\r÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\rûï\u000fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rñ\u0013ôä\u001d\n\u0001ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000eó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿþ\u000fÏ,þ\u0003ÿÿ÷\t\u0006à%÷õë\bè\b\u0003ò\u0003ß)õ\u0012\u0000\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005#È9éñ\u0007ÙS2\u0012\u0000ò\u000fÿ¼4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0007,\u0004ÿ\u0001Òú4Í2Ë\u0003\u0002ü5Í1Éë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµþ\u000fÞ\u0013\u0011ï\t\u0007ð".getBytes("ISO-8859-1"), 0, bArr2, 0, 1170);
            $$a = bArr2;
            i4 = 56;
        }
        $$b = i4;
        int i7 = $11;
        int i8 = ((i7 | BuildConfig.API_LEVEL) << 1) - (i7 ^ BuildConfig.API_LEVEL);
        $10 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static int getMediationNetwork(Object obj) {
        int i4 = $11;
        int i5 = ((i4 & 27) + (i4 | 27)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $10 = i5;
        Object obj2 = f13376w;
        $11 = (((i5 | 47) << 1) - (i5 ^ 47)) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $11 = (i5 + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[104]);
            byte b5 = bArr[18];
            int intValue = ((Integer) Class.forName($$c(b4, b5, (short) ((b5 ^ 556) | (b5 & 556))), true, (ClassLoader) f13372d).getMethod($$c(bArr[239], bArr[311], (short) 540), Object.class).invoke(obj2, obj)).intValue();
            int i6 = $11;
            $10 = (((i6 | 83) << 1) - (i6 ^ 83)) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
