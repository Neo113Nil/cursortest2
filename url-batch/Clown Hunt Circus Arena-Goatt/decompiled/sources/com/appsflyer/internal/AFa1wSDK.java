package com.appsflyer.internal;

import android.view.ViewConfiguration;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class AFa1wSDK {
    private static Object AppsFlyer2dXConversionCallback = null;
    public static byte[] afWarnLog = null;
    private static Object init = null;
    public static byte[] onAppOpenAttributionNative = null;
    public static final int onAttributionFailureNative = 0;
    public static byte[] onConversionDataSuccess = null;
    private static int onDeepLinking = 1;
    private static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    public static long onInstallConversionFailureNative;
    public static final byte[] onResponseErrorNative = null;
    public static int onResponseNative;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onDeepLinkingNative + 41;
        int i5 = i4 % 128;
        onDeepLinking = i5;
        int i6 = i4 % 2;
        int i7 = ((s | 4) << 1) - (s ^ 4);
        int i8 = -i;
        int i9 = (i8 ^ 119) + ((i8 & 119) << 1);
        byte[] bArr = onResponseErrorNative;
        byte[] bArr2 = new byte[s2 + 1];
        if (bArr == null) {
            int i10 = i5 + 65;
            onDeepLinkingNative = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i7;
            int i13 = 0;
            int i14 = (i9 - (~(-(-i7)))) - 1;
            i9 = (i14 | (-3)) + (i14 & (-3));
            int i15 = onDeepLinkingNative;
            int i16 = (i15 ^ 83) + ((i15 & 83) << 1);
            onDeepLinking = i16 % 128;
            int i17 = i16 % 2;
            i7 = i12;
            i2 = i13;
            bArr2[i2] = (byte) i9;
            int i18 = i2 + 1;
            if (i2 == s2) {
                return new String(bArr2, 0);
            }
            int i19 = i7 + 1;
            i12 = i19;
            i7 = bArr[i19];
            i13 = i18;
            int i142 = (i9 - (~(-(-i7)))) - 1;
            i9 = (i142 | (-3)) + (i142 & (-3));
            int i152 = onDeepLinkingNative;
            int i162 = (i152 ^ 83) + ((i152 & 83) << 1);
            onDeepLinking = i162 % 128;
            int i172 = i162 % 2;
            i7 = i12;
            i2 = i13;
            bArr2[i2] = (byte) i9;
            int i182 = i2 + 1;
            if (i2 == s2) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i9;
            int i1822 = i2 + 1;
            if (i2 == s2) {
            }
        }
    }

    public static int AFInAppEventParameterName(int i) {
        int i2 = 2 % 2;
        int i3 = onDeepLinkingNative + 19;
        int i4 = i3 % 128;
        onDeepLinking = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = init;
        int i5 = i4 + 75;
        onDeepLinkingNative = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            int i7 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            int intValue = ((Integer) Class.forName($$c((short) ((i7 ^ 674) | (i7 & 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) (i7 | 390), bArr[18], bArr[25]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i8 = onDeepLinking;
            int i9 = (i8 ^ 119) + ((i8 & 119) << 1);
            onDeepLinkingNative = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 39 / 0;
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

    public static int AFKeystoreWrapper(Object obj) {
        int i = 2 % 2;
        int i2 = onDeepLinking + 57;
        int i3 = i2 % 128;
        onDeepLinkingNative = i3;
        int i4 = i2 % 2;
        Object obj2 = init;
        int i5 = i3 + 113;
        int i6 = i5 % 128;
        onDeepLinking = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 53;
        onDeepLinkingNative = i8 % 128;
        int i9 = i8 % 2;
        try {
            int i10 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            int intValue = ((Integer) Class.forName($$c((short) ((i10 ^ 674) | (i10 & 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) ((i10 & 390) | (i10 ^ 390)), bArr[18], bArr[25]), Object.class).invoke(obj2, obj)).intValue();
            int i11 = onDeepLinkingNative;
            int i12 = (i11 ^ 95) + ((i11 & 95) << 1);
            onDeepLinking = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 16 / 0;
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

    public static Object AFKeystoreWrapper(int i, int i2, char c) {
        int i3 = 2 % 2;
        int i4 = onDeepLinking;
        int i5 = i4 + 85;
        onDeepLinkingNative = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Object obj2 = init;
        int i6 = i4 + 31;
        onDeepLinkingNative = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            int i8 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            Object invoke = Class.forName($$c((short) ((i8 & 674) | (i8 ^ 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) 661, bArr[29], bArr[25]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj2, objArr);
            int i9 = onDeepLinkingNative + 117;
            onDeepLinking = i9 % 128;
            int i10 = i9 % 2;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i = 2 % 2;
        int i2 = onDeepLinkingNative + 1;
        onDeepLinking = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = new byte[1090];
        System.arraycopy("p \u0005à\u000f\u0001\u0006ÿü\u0016ß\u001eÚ)\u0006õ\u0016ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøø\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓLÜô\nÜ\u0003î\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\b\u0006(Ö2\u0003Ø4ò\f\tß\u0014\u0014ò\u000fû\u0012ô\u0010ß\u0016\u000fûú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ö\u0011ÿ\u0000\ròñ\u0019\u0014îß0ùò$ð\u0016ôú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0001\u0012Ô*ø\u0012\u0006õ\u0002â0\bâ\u0018\u0007ûû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001\b\b\u001d\u0017ý\u0004þ\u0006öõ\u001eò\u0012\u0003ø\u0010ô\n\u0017í\b\t\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓLÜô\nÜ\u0003ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓIßô\nÜB\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0010ù\u0011\u0000ýþÍJ\u0002ø\u0006Å)(úø\u0002õ\u000e\u000e\fó\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1090);
        onResponseErrorNative = bArr;
        onAttributionFailureNative = 9;
        int i4 = onDeepLinkingNative;
        int i5 = ((i4 | 37) << 1) - (i4 ^ 37);
        onDeepLinking = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private AFa1wSDK() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:856|857|(42:852|853|12|(0)(0)|15|(0)|17|18|(0)|20|21|(0)(0)|(0)|38|39|40|41|42|43|44|45|46|47|48|(0)|793|53|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|64|(0)(0)|67|68|69|(0)|786|787)|11|12|(0)(0)|15|(0)|17|18|(0)|20|21|(0)(0)|(0)|38|39|40|41|42|43|44|45|46|47|48|(0)|793|53|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|64|(0)(0)|67|68|69|(0)|786|787) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0417, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r10, r14[r19], r14[r20])).getMethod($$c((short) 853, r14[83], r14[r17]), r7).invoke(r0, r7)).booleanValue() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x133e, code lost:
    
        if (r3 != null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x1340, code lost:
    
        r5 = r18;
        r0.getDeclaredMethod($$c((short) 739, r2[55], r2[r17]), new java.lang.Class[r5]).invoke(r1, new java.lang.Object[r5]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x135a, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x131b, code lost:
    
        if (r3 != null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0504, code lost:
    
        if (r11 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0513, code lost:
    
        if (r14 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0515, code lost:
    
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0518, code lost:
    
        if (r15 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x051a, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x051d, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x0509, code lost:
    
        r4 = r4 + 51;
        com.appsflyer.internal.AFa1wSDK.onDeepLinking = r4 % 128;
        r4 = r4 % 2;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0507, code lost:
    
        if (r11 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x03a8, code lost:
    
        r22 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x1627 A[Catch: Exception -> 0x16f2, TRY_ENTER, TryCatch #9 {Exception -> 0x16f2, blocks: (B:3:0x001d, B:5:0x0039, B:27:0x0231, B:33:0x0288, B:35:0x028e, B:37:0x028f, B:42:0x02c9, B:45:0x031b, B:48:0x0320, B:53:0x0366, B:57:0x037c, B:60:0x0386, B:63:0x0390, B:68:0x03a5, B:72:0x03be, B:104:0x1627, B:108:0x162b, B:111:0x16ac, B:106:0x163a, B:113:0x1641, B:120:0x168b, B:122:0x1691, B:123:0x1692, B:799:0x16cf, B:801:0x16d5, B:802:0x16d6, B:804:0x01bd, B:811:0x16d8, B:813:0x16de, B:814:0x16df, B:817:0x16e1, B:819:0x16e7, B:820:0x16e8, B:823:0x0158, B:829:0x16ea, B:831:0x16f0, B:832:0x16f1, B:40:0x0292, B:808:0x0204, B:806:0x01c7, B:826:0x018d, B:30:0x0248, B:116:0x1655, B:117:0x1689), top: B:2:0x001d, inners: #36, #43, #52, #56, #71, #72 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x129e A[Catch: all -> 0x15df, TRY_LEAVE, TryCatch #51 {all -> 0x15df, blocks: (B:161:0x09a9, B:166:0x0b16, B:228:0x0dfb, B:233:0x0e19, B:236:0x0e1e, B:238:0x0e24, B:239:0x0e25, B:241:0x129e, B:289:0x1315, B:251:0x13ad, B:258:0x148f, B:261:0x14a2, B:263:0x14a8, B:264:0x14a9, B:267:0x14ab, B:269:0x14b1, B:270:0x14b2, B:273:0x14b4, B:275:0x14ba, B:276:0x14bb, B:278:0x14bc, B:283:0x14e9, B:248:0x1340, B:246:0x1338, B:293:0x135d, B:295:0x1363, B:296:0x1364, B:297:0x1365, B:299:0x1399, B:303:0x13a3, B:304:0x13a9, B:310:0x0e28, B:313:0x0e2a, B:315:0x0e30, B:316:0x0e31, B:319:0x0e33, B:321:0x0e39, B:322:0x0e3a, B:370:0x0f44, B:372:0x0f46, B:374:0x0f4c, B:375:0x0f4d, B:378:0x0f4f, B:380:0x0f55, B:381:0x0f56, B:407:0x0b38, B:408:0x0b3b, B:411:0x0f57, B:419:0x0fe1, B:441:0x10a3, B:443:0x10a9, B:444:0x10aa, B:462:0x1161, B:465:0x11d9, B:468:0x11e6, B:470:0x1263, B:472:0x1279, B:473:0x1281, B:476:0x1298, B:480:0x1502, B:488:0x1572, B:490:0x1578, B:491:0x1579, B:494:0x157b, B:496:0x1581, B:497:0x1582, B:500:0x1584, B:502:0x158a, B:503:0x158b, B:507:0x113d, B:509:0x1143, B:510:0x1144, B:515:0x1108, B:517:0x110e, B:518:0x110f, B:522:0x158d, B:524:0x1593, B:525:0x1594, B:532:0x1596, B:534:0x159c, B:535:0x159d, B:538:0x159f, B:540:0x15a5, B:541:0x15a6, B:544:0x15a8, B:546:0x15ae, B:547:0x15af, B:550:0x15b1, B:552:0x15b7, B:553:0x15b8, B:556:0x09c1, B:558:0x09c9, B:559:0x09ca, B:567:0x0a51, B:573:0x15ba, B:575:0x15c0, B:576:0x15c1, B:579:0x15c3, B:581:0x15c9, B:582:0x15ca, B:585:0x15cc, B:587:0x15d2, B:588:0x15d3, B:591:0x15d5, B:593:0x15dd, B:594:0x15de, B:597:0x15e2, B:599:0x15ea, B:600:0x15eb, B:603:0x15ed, B:605:0x15f5, B:606:0x15f6, B:609:0x15f8, B:611:0x1600, B:612:0x1601, B:257:0x146c, B:414:0x0f79, B:225:0x0dbe, B:255:0x143b, B:164:0x0ad3, B:222:0x0d8d, B:253:0x1401, B:570:0x0a58, B:156:0x091c, B:565:0x0a17, B:367:0x0f1c, B:562:0x09d1, B:364:0x0ee7, B:151:0x08d3, B:287:0x12f7, B:244:0x131e, B:145:0x0889, B:143:0x085a, B:483:0x153c, B:484:0x1570, B:180:0x0b78, B:185:0x0b8f, B:197:0x0c52, B:199:0x0c58, B:200:0x0c59, B:355:0x0c5b, B:357:0x0c61, B:358:0x0c62, B:359:0x0b98, B:212:0x0cf4, B:219:0x0d7b, B:325:0x0e3c, B:327:0x0e42, B:328:0x0e43, B:331:0x0e45, B:333:0x0e4b, B:334:0x0e4c, B:337:0x0e4e, B:339:0x0e54, B:340:0x0e55, B:343:0x0e57, B:345:0x0e5d, B:346:0x0e5e, B:349:0x0e60, B:351:0x0e66, B:352:0x0e67, B:385:0x0e6d, B:387:0x0e73, B:388:0x0e74, B:390:0x0e78, B:398:0x0edf, B:400:0x0ee5, B:401:0x0ee6, B:141:0x0822, B:464:0x11aa, B:461:0x1147, B:453:0x10b2, B:422:0x0fe5, B:232:0x0e01, B:417:0x0fc4), top: B:160:0x09a9, inners: #1, #3, #5, #6, #10, #11, #12, #14, #19, #20, #24, #30, #35, #40, #45, #49, #53, #59, #60, #62, #63, #64, #67, #73, #77, #84, #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x13ad A[Catch: all -> 0x15df, TRY_ENTER, TRY_LEAVE, TryCatch #51 {all -> 0x15df, blocks: (B:161:0x09a9, B:166:0x0b16, B:228:0x0dfb, B:233:0x0e19, B:236:0x0e1e, B:238:0x0e24, B:239:0x0e25, B:241:0x129e, B:289:0x1315, B:251:0x13ad, B:258:0x148f, B:261:0x14a2, B:263:0x14a8, B:264:0x14a9, B:267:0x14ab, B:269:0x14b1, B:270:0x14b2, B:273:0x14b4, B:275:0x14ba, B:276:0x14bb, B:278:0x14bc, B:283:0x14e9, B:248:0x1340, B:246:0x1338, B:293:0x135d, B:295:0x1363, B:296:0x1364, B:297:0x1365, B:299:0x1399, B:303:0x13a3, B:304:0x13a9, B:310:0x0e28, B:313:0x0e2a, B:315:0x0e30, B:316:0x0e31, B:319:0x0e33, B:321:0x0e39, B:322:0x0e3a, B:370:0x0f44, B:372:0x0f46, B:374:0x0f4c, B:375:0x0f4d, B:378:0x0f4f, B:380:0x0f55, B:381:0x0f56, B:407:0x0b38, B:408:0x0b3b, B:411:0x0f57, B:419:0x0fe1, B:441:0x10a3, B:443:0x10a9, B:444:0x10aa, B:462:0x1161, B:465:0x11d9, B:468:0x11e6, B:470:0x1263, B:472:0x1279, B:473:0x1281, B:476:0x1298, B:480:0x1502, B:488:0x1572, B:490:0x1578, B:491:0x1579, B:494:0x157b, B:496:0x1581, B:497:0x1582, B:500:0x1584, B:502:0x158a, B:503:0x158b, B:507:0x113d, B:509:0x1143, B:510:0x1144, B:515:0x1108, B:517:0x110e, B:518:0x110f, B:522:0x158d, B:524:0x1593, B:525:0x1594, B:532:0x1596, B:534:0x159c, B:535:0x159d, B:538:0x159f, B:540:0x15a5, B:541:0x15a6, B:544:0x15a8, B:546:0x15ae, B:547:0x15af, B:550:0x15b1, B:552:0x15b7, B:553:0x15b8, B:556:0x09c1, B:558:0x09c9, B:559:0x09ca, B:567:0x0a51, B:573:0x15ba, B:575:0x15c0, B:576:0x15c1, B:579:0x15c3, B:581:0x15c9, B:582:0x15ca, B:585:0x15cc, B:587:0x15d2, B:588:0x15d3, B:591:0x15d5, B:593:0x15dd, B:594:0x15de, B:597:0x15e2, B:599:0x15ea, B:600:0x15eb, B:603:0x15ed, B:605:0x15f5, B:606:0x15f6, B:609:0x15f8, B:611:0x1600, B:612:0x1601, B:257:0x146c, B:414:0x0f79, B:225:0x0dbe, B:255:0x143b, B:164:0x0ad3, B:222:0x0d8d, B:253:0x1401, B:570:0x0a58, B:156:0x091c, B:565:0x0a17, B:367:0x0f1c, B:562:0x09d1, B:364:0x0ee7, B:151:0x08d3, B:287:0x12f7, B:244:0x131e, B:145:0x0889, B:143:0x085a, B:483:0x153c, B:484:0x1570, B:180:0x0b78, B:185:0x0b8f, B:197:0x0c52, B:199:0x0c58, B:200:0x0c59, B:355:0x0c5b, B:357:0x0c61, B:358:0x0c62, B:359:0x0b98, B:212:0x0cf4, B:219:0x0d7b, B:325:0x0e3c, B:327:0x0e42, B:328:0x0e43, B:331:0x0e45, B:333:0x0e4b, B:334:0x0e4c, B:337:0x0e4e, B:339:0x0e54, B:340:0x0e55, B:343:0x0e57, B:345:0x0e5d, B:346:0x0e5e, B:349:0x0e60, B:351:0x0e66, B:352:0x0e67, B:385:0x0e6d, B:387:0x0e73, B:388:0x0e74, B:390:0x0e78, B:398:0x0edf, B:400:0x0ee5, B:401:0x0ee6, B:141:0x0822, B:464:0x11aa, B:461:0x1147, B:453:0x10b2, B:422:0x0fe5, B:232:0x0e01, B:417:0x0fc4), top: B:160:0x09a9, inners: #1, #3, #5, #6, #10, #11, #12, #14, #19, #20, #24, #30, #35, #40, #45, #49, #53, #59, #60, #62, #63, #64, #67, #73, #77, #84, #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x14bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1365 A[Catch: all -> 0x15df, TRY_LEAVE, TryCatch #51 {all -> 0x15df, blocks: (B:161:0x09a9, B:166:0x0b16, B:228:0x0dfb, B:233:0x0e19, B:236:0x0e1e, B:238:0x0e24, B:239:0x0e25, B:241:0x129e, B:289:0x1315, B:251:0x13ad, B:258:0x148f, B:261:0x14a2, B:263:0x14a8, B:264:0x14a9, B:267:0x14ab, B:269:0x14b1, B:270:0x14b2, B:273:0x14b4, B:275:0x14ba, B:276:0x14bb, B:278:0x14bc, B:283:0x14e9, B:248:0x1340, B:246:0x1338, B:293:0x135d, B:295:0x1363, B:296:0x1364, B:297:0x1365, B:299:0x1399, B:303:0x13a3, B:304:0x13a9, B:310:0x0e28, B:313:0x0e2a, B:315:0x0e30, B:316:0x0e31, B:319:0x0e33, B:321:0x0e39, B:322:0x0e3a, B:370:0x0f44, B:372:0x0f46, B:374:0x0f4c, B:375:0x0f4d, B:378:0x0f4f, B:380:0x0f55, B:381:0x0f56, B:407:0x0b38, B:408:0x0b3b, B:411:0x0f57, B:419:0x0fe1, B:441:0x10a3, B:443:0x10a9, B:444:0x10aa, B:462:0x1161, B:465:0x11d9, B:468:0x11e6, B:470:0x1263, B:472:0x1279, B:473:0x1281, B:476:0x1298, B:480:0x1502, B:488:0x1572, B:490:0x1578, B:491:0x1579, B:494:0x157b, B:496:0x1581, B:497:0x1582, B:500:0x1584, B:502:0x158a, B:503:0x158b, B:507:0x113d, B:509:0x1143, B:510:0x1144, B:515:0x1108, B:517:0x110e, B:518:0x110f, B:522:0x158d, B:524:0x1593, B:525:0x1594, B:532:0x1596, B:534:0x159c, B:535:0x159d, B:538:0x159f, B:540:0x15a5, B:541:0x15a6, B:544:0x15a8, B:546:0x15ae, B:547:0x15af, B:550:0x15b1, B:552:0x15b7, B:553:0x15b8, B:556:0x09c1, B:558:0x09c9, B:559:0x09ca, B:567:0x0a51, B:573:0x15ba, B:575:0x15c0, B:576:0x15c1, B:579:0x15c3, B:581:0x15c9, B:582:0x15ca, B:585:0x15cc, B:587:0x15d2, B:588:0x15d3, B:591:0x15d5, B:593:0x15dd, B:594:0x15de, B:597:0x15e2, B:599:0x15ea, B:600:0x15eb, B:603:0x15ed, B:605:0x15f5, B:606:0x15f6, B:609:0x15f8, B:611:0x1600, B:612:0x1601, B:257:0x146c, B:414:0x0f79, B:225:0x0dbe, B:255:0x143b, B:164:0x0ad3, B:222:0x0d8d, B:253:0x1401, B:570:0x0a58, B:156:0x091c, B:565:0x0a17, B:367:0x0f1c, B:562:0x09d1, B:364:0x0ee7, B:151:0x08d3, B:287:0x12f7, B:244:0x131e, B:145:0x0889, B:143:0x085a, B:483:0x153c, B:484:0x1570, B:180:0x0b78, B:185:0x0b8f, B:197:0x0c52, B:199:0x0c58, B:200:0x0c59, B:355:0x0c5b, B:357:0x0c61, B:358:0x0c62, B:359:0x0b98, B:212:0x0cf4, B:219:0x0d7b, B:325:0x0e3c, B:327:0x0e42, B:328:0x0e43, B:331:0x0e45, B:333:0x0e4b, B:334:0x0e4c, B:337:0x0e4e, B:339:0x0e54, B:340:0x0e55, B:343:0x0e57, B:345:0x0e5d, B:346:0x0e5e, B:349:0x0e60, B:351:0x0e66, B:352:0x0e67, B:385:0x0e6d, B:387:0x0e73, B:388:0x0e74, B:390:0x0e78, B:398:0x0edf, B:400:0x0ee5, B:401:0x0ee6, B:141:0x0822, B:464:0x11aa, B:461:0x1147, B:453:0x10b2, B:422:0x0fe5, B:232:0x0e01, B:417:0x0fc4), top: B:160:0x09a9, inners: #1, #3, #5, #6, #10, #11, #12, #14, #19, #20, #24, #30, #35, #40, #45, #49, #53, #59, #60, #62, #63, #64, #67, #73, #77, #84, #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1263 A[Catch: Exception -> 0x1501, all -> 0x15df, LOOP:5: B:469:0x1261->B:470:0x1263, LOOP_END, TryCatch #49 {Exception -> 0x1501, blocks: (B:468:0x11e6, B:470:0x1263, B:472:0x1279), top: B:467:0x11e6, outer: #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x1285  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x05da A[Catch: all -> 0x05dc, TryCatch #46 {all -> 0x05dc, blocks: (B:662:0x05d4, B:664:0x05da, B:665:0x05db, B:679:0x062b, B:681:0x0631, B:682:0x0632, B:690:0x0685, B:692:0x068b, B:693:0x068c, B:676:0x05e6, B:687:0x063f), top: B:675:0x05e6, inners: #7, #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x05db A[Catch: all -> 0x05dc, TRY_LEAVE, TryCatch #46 {all -> 0x05dc, blocks: (B:662:0x05d4, B:664:0x05da, B:665:0x05db, B:679:0x062b, B:681:0x0631, B:682:0x0632, B:690:0x0685, B:692:0x068b, B:693:0x068c, B:676:0x05e6, B:687:0x063f), top: B:675:0x05e6, inners: #7, #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x1693  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:842:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:852:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v88, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v89, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v52 */
    /* JADX WARN: Type inference failed for: r18v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v214, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v128, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r3v130 */
    /* JADX WARN: Type inference failed for: r3v131, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v85, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v135, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v157, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v229, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Class[], java.lang.Object, java.lang.Object[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.reflect.Method] */
    static {
        Object obj;
        Object invoke;
        char c;
        Object obj2;
        char c2;
        Class<?> cls;
        short s;
        byte[] bArr;
        boolean z;
        Object invoke2;
        char c3;
        char c4;
        int i;
        int i2;
        int i3;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i4;
        boolean z2;
        ?? r8;
        Class<byte[]> cls2;
        boolean[] zArr4;
        boolean[] zArr5;
        int i5;
        String str;
        boolean[] zArr6;
        Object obj3;
        byte[] bArr2;
        int i6;
        char c5;
        int i7;
        int i8;
        boolean z3;
        ?? r82;
        char c6;
        int i9;
        int i10;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i11;
        Throwable cause;
        int i12;
        int i13;
        int i14;
        String str2;
        InputStream inputStream;
        Object obj8;
        char c7;
        byte[] bArr3;
        Object invoke3;
        Object newInstance;
        int length;
        int i15;
        Object obj9;
        Class cls3;
        boolean z4;
        ?? invoke4;
        Object obj10;
        int min;
        int i16;
        int i17;
        boolean z5;
        boolean z6;
        boolean z7;
        char c8;
        Class<byte[]> cls4 = byte[].class;
        init$0();
        onResponseNative = 3;
        onConversionDataSuccess = new byte[]{-66, -122, -76, 76, -57, 112, -30, 44};
        onInstallConversionDataLoadedNative = -1949472556;
        onInstallConversionFailureNative = 3282160799635402978L;
        try {
            int i18 = onAttributionFailureNative;
            byte[] bArr4 = onResponseErrorNative;
            int i19 = 1;
            String $$c = $$c((short) ((i18 & 324) | (i18 ^ 324)), bArr4[1], bArr4[416]);
            ?? r7 = 0;
            String $$c2 = init == null ? $$c((short) 1029, bArr4[62], bArr4[416]) : null;
            char c9 = 29;
            int i20 = 9;
            try {
                obj = Class.forName($$c((short) 805, bArr4[259], bArr4[9])).getMethod($$c(bArr4[126], bArr4[77], bArr4[416]), new Class[0]).invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            try {
                short s2 = (short) (onAttributionFailureNative | 434);
                byte[] bArr5 = onResponseErrorNative;
                Method method = Class.forName($$c(s2, bArr5[58], bArr5[9])).getMethod($$c((short) 917, bArr5[416], bArr5[29]), new Class[0]);
                obj = method.invoke(null, null);
            } catch (Exception unused2) {
            }
            try {
                if (obj != null) {
                    try {
                        Class<?> cls5 = obj.getClass();
                        byte[] bArr6 = onResponseErrorNative;
                        String $$c3 = $$c((short) 214, bArr6[180], bArr6[29]);
                        Method method2 = cls5.getMethod($$c3, null);
                        invoke = method2.invoke(obj, null);
                    } catch (Exception unused3) {
                        invoke = null;
                        int i21 = 2;
                        if (obj == null) {
                            try {
                                Class<?> cls6 = obj.getClass();
                                int i22 = onAttributionFailureNative;
                                short s3 = (short) ((i22 & 292) | (i22 ^ 292));
                                byte[] bArr7 = onResponseErrorNative;
                                c = 416;
                                try {
                                    String $$c4 = $$c(s3, bArr7[161], bArr7[29]);
                                    Method method3 = cls6.getMethod($$c4, null);
                                    obj2 = method3.invoke(obj, null);
                                    c8 = c;
                                } catch (Exception unused4) {
                                    obj2 = null;
                                    c2 = c;
                                    if (obj != null) {
                                    }
                                    z = false;
                                    invoke2 = null;
                                    if (invoke == null) {
                                    }
                                    c3 = '9';
                                    c4 = Typography.cent;
                                    if (invoke2 != null) {
                                    }
                                    if (obj2 == null) {
                                    }
                                    int i23 = 2 % 2;
                                    int i24 = onAttributionFailureNative;
                                    byte[] bArr8 = onResponseErrorNative;
                                    Object invoke5 = Class.forName($$c((short) ((i24 ^ 580) | (i24 & 580)), bArr8[58], bArr8[9])).getMethod($$c((short) 464, bArr8[604], bArr8[29]), null).invoke(null, null);
                                    Object[] objArr = (Object[]) Array.newInstance(Class.forName($$c((short) ((i24 ^ 928) | (i24 & 928)), bArr8[c3], bArr8[c4])), 9);
                                    objArr[z ? 1 : 0] = null;
                                    objArr[1] = obj2;
                                    objArr[2] = invoke;
                                    objArr[i2] = invoke2;
                                    objArr[i] = invoke5;
                                    i3 = 5;
                                    objArr[5] = obj2;
                                    objArr[6] = invoke;
                                    objArr[7] = invoke2;
                                    objArr[8] = invoke5;
                                    zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                                    zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                                    zArr3 = new boolean[9];
                                    zArr3[z ? 1 : 0] = z;
                                    zArr3[1] = z;
                                    zArr3[2] = true;
                                    zArr3[i2] = true;
                                    zArr3[i] = z;
                                    zArr3[5] = z;
                                    zArr3[6] = true;
                                    zArr3[7] = true;
                                    zArr3[8] = z;
                                    char c10 = 24;
                                    Class<?> cls7 = Class.forName($$c((short) (i24 | 96), bArr8[24], bArr8[9]));
                                    i17 = cls7.getDeclaredField($$c((short) 677, bArr8[6], bArr8[38])).getInt(cls7);
                                    if (i17 != 29) {
                                    }
                                    z5 = z ? 1 : 0;
                                    zArr3[z ? 1 : 0] = z5;
                                    if (i17 < 21) {
                                    }
                                    zArr3[1] = z6;
                                    zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                                    zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                                    if (i17 >= 16) {
                                    }
                                    zArr3[8] = z7;
                                    int i25 = onDeepLinkingNative;
                                    int i26 = ((i25 | 89) << 1) - (i25 ^ 89);
                                    onDeepLinking = i26 % 128;
                                    int i27 = i26 % 2;
                                    boolean z8 = z ? 1 : 0;
                                    i4 = z8 ? 1 : 0;
                                    r8 = z8;
                                    z2 = z;
                                    while (r8 == 0) {
                                    }
                                }
                            } catch (Exception unused5) {
                                c = 416;
                            }
                        } else {
                            c8 = 416;
                            obj2 = null;
                        }
                        int i28 = 2 % 2;
                        c2 = c8;
                        if (obj != null) {
                            try {
                                cls = obj.getClass();
                                s = (short) 228;
                                bArr = onResponseErrorNative;
                                z = false;
                            } catch (Exception unused6) {
                                z = false;
                                invoke2 = null;
                                if (invoke == null) {
                                }
                                c3 = '9';
                                c4 = Typography.cent;
                                if (invoke2 != null) {
                                }
                                if (obj2 == null) {
                                }
                                int i232 = 2 % 2;
                                int i242 = onAttributionFailureNative;
                                byte[] bArr82 = onResponseErrorNative;
                                Object invoke52 = Class.forName($$c((short) ((i242 ^ 580) | (i242 & 580)), bArr82[58], bArr82[9])).getMethod($$c((short) 464, bArr82[604], bArr82[29]), null).invoke(null, null);
                                Object[] objArr2 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i242 ^ 928) | (i242 & 928)), bArr82[c3], bArr82[c4])), 9);
                                objArr2[z ? 1 : 0] = null;
                                objArr2[1] = obj2;
                                objArr2[2] = invoke;
                                objArr2[i2] = invoke2;
                                objArr2[i] = invoke52;
                                i3 = 5;
                                objArr2[5] = obj2;
                                objArr2[6] = invoke;
                                objArr2[7] = invoke2;
                                objArr2[8] = invoke52;
                                zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                                zArr3 = new boolean[9];
                                zArr3[z ? 1 : 0] = z;
                                zArr3[1] = z;
                                zArr3[2] = true;
                                zArr3[i2] = true;
                                zArr3[i] = z;
                                zArr3[5] = z;
                                zArr3[6] = true;
                                zArr3[7] = true;
                                zArr3[8] = z;
                                char c102 = 24;
                                Class<?> cls72 = Class.forName($$c((short) (i242 | 96), bArr82[24], bArr82[9]));
                                i17 = cls72.getDeclaredField($$c((short) 677, bArr82[6], bArr82[38])).getInt(cls72);
                                if (i17 != 29) {
                                }
                                z5 = z ? 1 : 0;
                                zArr3[z ? 1 : 0] = z5;
                                if (i17 < 21) {
                                }
                                zArr3[1] = z6;
                                zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                                zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                                if (i17 >= 16) {
                                }
                                zArr3[8] = z7;
                                int i252 = onDeepLinkingNative;
                                int i262 = ((i252 | 89) << 1) - (i252 ^ 89);
                                onDeepLinking = i262 % 128;
                                int i272 = i262 % 2;
                                boolean z82 = z ? 1 : 0;
                                i4 = z82 ? 1 : 0;
                                r8 = z82;
                                z2 = z;
                                while (r8 == 0) {
                                }
                            }
                            try {
                                String $$c5 = $$c(s, bArr[180], bArr[29]);
                                Method method4 = cls.getMethod($$c5, null);
                                invoke2 = method4.invoke(obj, null);
                            } catch (Exception unused7) {
                                invoke2 = null;
                                if (invoke == null) {
                                }
                                c3 = '9';
                                c4 = Typography.cent;
                                if (invoke2 != null) {
                                }
                                if (obj2 == null) {
                                }
                                int i2322 = 2 % 2;
                                int i2422 = onAttributionFailureNative;
                                byte[] bArr822 = onResponseErrorNative;
                                Object invoke522 = Class.forName($$c((short) ((i2422 ^ 580) | (i2422 & 580)), bArr822[58], bArr822[9])).getMethod($$c((short) 464, bArr822[604], bArr822[29]), null).invoke(null, null);
                                Object[] objArr22 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i2422 ^ 928) | (i2422 & 928)), bArr822[c3], bArr822[c4])), 9);
                                objArr22[z ? 1 : 0] = null;
                                objArr22[1] = obj2;
                                objArr22[2] = invoke;
                                objArr22[i2] = invoke2;
                                objArr22[i] = invoke522;
                                i3 = 5;
                                objArr22[5] = obj2;
                                objArr22[6] = invoke;
                                objArr22[7] = invoke2;
                                objArr22[8] = invoke522;
                                zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                                zArr3 = new boolean[9];
                                zArr3[z ? 1 : 0] = z;
                                zArr3[1] = z;
                                zArr3[2] = true;
                                zArr3[i2] = true;
                                zArr3[i] = z;
                                zArr3[5] = z;
                                zArr3[6] = true;
                                zArr3[7] = true;
                                zArr3[8] = z;
                                char c1022 = 24;
                                Class<?> cls722 = Class.forName($$c((short) (i2422 | 96), bArr822[24], bArr822[9]));
                                i17 = cls722.getDeclaredField($$c((short) 677, bArr822[6], bArr822[38])).getInt(cls722);
                                if (i17 != 29) {
                                }
                                z5 = z ? 1 : 0;
                                zArr3[z ? 1 : 0] = z5;
                                if (i17 < 21) {
                                }
                                zArr3[1] = z6;
                                zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                                zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                                if (i17 >= 16) {
                                }
                                zArr3[8] = z7;
                                int i2522 = onDeepLinkingNative;
                                int i2622 = ((i2522 | 89) << 1) - (i2522 ^ 89);
                                onDeepLinking = i2622 % 128;
                                int i2722 = i2622 % 2;
                                boolean z822 = z ? 1 : 0;
                                i4 = z822 ? 1 : 0;
                                r8 = z822;
                                z2 = z;
                                while (r8 == 0) {
                                }
                            }
                            if (invoke == null) {
                                if ($$c2 != null) {
                                    StringBuilder sb = new StringBuilder();
                                    c3 = '9';
                                    byte b = onResponseErrorNative[180];
                                    c4 = Typography.cent;
                                    String sb2 = sb.append($$c((short) 642, b, r15[166])).append($$c2).toString();
                                    int i29 = onDeepLinkingNative;
                                    int i30 = ((i29 | 17) << 1) - (i29 ^ 17);
                                    onDeepLinking = i30 % 128;
                                    int i31 = i30 % 2;
                                    try {
                                        Class<?> cls8 = Class.forName($$c((short) (onAttributionFailureNative | 928), r15[57], r15[162]));
                                        Class<?>[] clsArr = new Class[1];
                                        clsArr[z ? 1 : 0] = String.class;
                                        invoke = cls8.getDeclaredConstructor(clsArr).newInstance(sb2);
                                        if (invoke2 != null) {
                                            i2 = 3;
                                            i = 4;
                                        } else {
                                            short s4 = (short) 768;
                                            byte b2 = onResponseErrorNative[c4];
                                            try {
                                                Object[] objArr3 = {$$c(s4, b2, b2)};
                                                Class<?> cls9 = Class.forName($$c(r3[190], r3[4], r3[c4]));
                                                int i32 = onAttributionFailureNative;
                                                i = 4;
                                                i2 = 3;
                                                String $$c6 = $$c((short) ((i32 & 772) | (i32 ^ 772)), r3[180], r3[29]);
                                                Class<?>[] clsArr2 = new Class[1];
                                                clsArr2[z ? 1 : 0] = String.class;
                                                try {
                                                    Object[] objArr4 = {cls9.getMethod($$c6, clsArr2).invoke(null, objArr3)};
                                                    Class<?> cls10 = Class.forName($$c((short) ((i32 ^ 928) | (i32 & 928)), r3[c3], r3[c4]));
                                                    Class<?>[] clsArr3 = new Class[1];
                                                    clsArr3[z ? 1 : 0] = String.class;
                                                    invoke2 = cls10.getDeclaredConstructor(clsArr3).newInstance(objArr4);
                                                } catch (Throwable th) {
                                                    Throwable cause2 = th.getCause();
                                                    if (cause2 == null) {
                                                        throw th;
                                                    }
                                                    throw cause2;
                                                }
                                            } catch (Throwable th2) {
                                                Throwable cause3 = th2.getCause();
                                                if (cause3 == null) {
                                                    throw th2;
                                                }
                                                throw cause3;
                                            }
                                        }
                                        if (obj2 == null && invoke != null) {
                                            short s5 = (short) 261;
                                            int i33 = onAttributionFailureNative;
                                            byte[] bArr9 = onResponseErrorNative;
                                            String $$c7 = $$c(s5, (byte) i33, bArr9[c2]);
                                            int i34 = 2 % 2;
                                            int i35 = onDeepLinking + 71;
                                            onDeepLinkingNative = i35 % 128;
                                            int i36 = i35 % 2;
                                            try {
                                                Object[] objArr5 = new Object[2];
                                                objArr5[1] = $$c7;
                                                objArr5[z ? 1 : 0] = invoke;
                                                Class<?> cls11 = Class.forName($$c((short) ((i33 ^ 928) | (i33 & 928)), bArr9[c3], bArr9[c4]));
                                                Class<?>[] clsArr4 = new Class[2];
                                                clsArr4[z ? 1 : 0] = Class.forName($$c((short) ((i33 & 928) | (i33 ^ 928)), bArr9[c3], bArr9[c4]));
                                                clsArr4[1] = String.class;
                                                obj2 = cls11.getDeclaredConstructor(clsArr4).newInstance(objArr5);
                                            } catch (Throwable th3) {
                                                Throwable cause4 = th3.getCause();
                                                if (cause4 == null) {
                                                    throw th3;
                                                }
                                                throw cause4;
                                            }
                                        }
                                        int i23222 = 2 % 2;
                                        int i24222 = onAttributionFailureNative;
                                        byte[] bArr8222 = onResponseErrorNative;
                                        Object invoke5222 = Class.forName($$c((short) ((i24222 ^ 580) | (i24222 & 580)), bArr8222[58], bArr8222[9])).getMethod($$c((short) 464, bArr8222[604], bArr8222[29]), null).invoke(null, null);
                                        Object[] objArr222 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i24222 ^ 928) | (i24222 & 928)), bArr8222[c3], bArr8222[c4])), 9);
                                        objArr222[z ? 1 : 0] = null;
                                        objArr222[1] = obj2;
                                        objArr222[2] = invoke;
                                        objArr222[i2] = invoke2;
                                        objArr222[i] = invoke5222;
                                        i3 = 5;
                                        objArr222[5] = obj2;
                                        objArr222[6] = invoke;
                                        objArr222[7] = invoke2;
                                        objArr222[8] = invoke5222;
                                        zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                                        zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                                        zArr3 = new boolean[9];
                                        zArr3[z ? 1 : 0] = z;
                                        zArr3[1] = z;
                                        zArr3[2] = true;
                                        zArr3[i2] = true;
                                        zArr3[i] = z;
                                        zArr3[5] = z;
                                        zArr3[6] = true;
                                        zArr3[7] = true;
                                        zArr3[8] = z;
                                        char c10222 = 24;
                                        Class<?> cls7222 = Class.forName($$c((short) (i24222 | 96), bArr8222[24], bArr8222[9]));
                                        i17 = cls7222.getDeclaredField($$c((short) 677, bArr8222[6], bArr8222[38])).getInt(cls7222);
                                        if (i17 != 29 && i17 >= 26) {
                                            int i37 = onDeepLinkingNative;
                                            int i38 = (i37 ^ 83) + ((i37 & 83) << 1);
                                            int i39 = i38 % 128;
                                            onDeepLinking = i39;
                                            int i40 = i38 % 2;
                                            int i41 = ((i39 | 69) << 1) - (i39 ^ 69);
                                            onDeepLinkingNative = i41 % 128;
                                            int i42 = i41 % 2;
                                            z5 = true;
                                        } else {
                                            z5 = z ? 1 : 0;
                                        }
                                        zArr3[z ? 1 : 0] = z5;
                                        if (i17 < 21) {
                                            int i43 = onDeepLinking;
                                            int i44 = (i43 & 93) + (i43 | 93);
                                            onDeepLinkingNative = i44 % 128;
                                            int i45 = i44 % 2;
                                            z6 = true;
                                        } else {
                                            z6 = z ? 1 : 0;
                                        }
                                        zArr3[1] = z6;
                                        zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                                        zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                                        if (i17 >= 16) {
                                            int i46 = onDeepLinking + 87;
                                            onDeepLinkingNative = i46 % 128;
                                            int i47 = i46 % 2;
                                            z7 = true;
                                        } else {
                                            z7 = z ? 1 : 0;
                                        }
                                        zArr3[8] = z7;
                                        int i25222 = onDeepLinkingNative;
                                        int i26222 = ((i25222 | 89) << 1) - (i25222 ^ 89);
                                        onDeepLinking = i26222 % 128;
                                        int i27222 = i26222 % 2;
                                        boolean z8222 = z ? 1 : 0;
                                        i4 = z8222 ? 1 : 0;
                                        r8 = z8222;
                                        z2 = z;
                                        while (r8 == 0 && i4 < i20) {
                                            if (zArr3[i4]) {
                                                cls2 = cls4;
                                                zArr4 = zArr;
                                                zArr5 = zArr2;
                                                i5 = i19;
                                                str = $$c;
                                                zArr6 = zArr3;
                                                obj3 = r7;
                                                bArr2 = r8 == true ? 1 : 0;
                                                i6 = i21;
                                                c5 = c9;
                                                i7 = i20;
                                                i8 = i3;
                                                z3 = z2;
                                            } else {
                                                try {
                                                    boolean z9 = zArr[i4];
                                                    Object obj11 = objArr222[i4];
                                                    boolean z10 = zArr2[i4];
                                                    if (z9) {
                                                        c5 = c9;
                                                        int i48 = onDeepLinking + 11;
                                                        i8 = i3;
                                                        onDeepLinkingNative = i48 % 128;
                                                        if (i48 % i21 != 0) {
                                                            throw r7;
                                                        }
                                                        if (obj11 != null) {
                                                            try {
                                                                short s6 = (short) (onAttributionFailureNative | 928);
                                                                byte[] bArr10 = onResponseErrorNative;
                                                                c6 = 'A';
                                                                try {
                                                                    i7 = i20;
                                                                    try {
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        Throwable cause5 = th.getCause();
                                                                        if (cause5 == null) {
                                                                            throw th;
                                                                        }
                                                                        throw cause5;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                            }
                                                        } else {
                                                            i7 = i20;
                                                            c6 = 'A';
                                                        }
                                                        try {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            short s7 = (short) 387;
                                                            byte[] bArr11 = onResponseErrorNative;
                                                            StringBuilder append = sb3.append($$c(s7, bArr11[55], bArr11[c6])).append(obj11);
                                                            byte b3 = bArr11[59];
                                                            try {
                                                                Object[] objArr6 = {append.append($$c((short) 241, b3, (byte) ((b3 ^ 78) | (b3 & 78)))).toString()};
                                                                Class<?> cls12 = Class.forName($$c((short) 860, bArr11[220], bArr11[c4]));
                                                                Class<?>[] clsArr5 = new Class[i19];
                                                                clsArr5[z2 ? 1 : 0] = String.class;
                                                                throw ((Throwable) cls12.getDeclaredConstructor(clsArr5).newInstance(objArr6));
                                                            } catch (Throwable th7) {
                                                                Throwable cause6 = th7.getCause();
                                                                if (cause6 == null) {
                                                                    throw th7;
                                                                }
                                                                throw cause6;
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            cls2 = cls4;
                                                            zArr4 = zArr;
                                                            zArr5 = zArr2;
                                                            str = $$c;
                                                            zArr6 = zArr3;
                                                            bArr2 = r8 == true ? 1 : 0;
                                                            i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                            for (i10 = i7; i9 < i10; i10 = 9) {
                                                            }
                                                            short s8 = (short) (onAttributionFailureNative | 356);
                                                            byte[] bArr12 = onResponseErrorNative;
                                                            try {
                                                                throw ((Throwable) Class.forName($$c((short) 860, bArr12[220], bArr12[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s8, bArr12[9], bArr12[c6]), th));
                                                            } catch (Throwable th9) {
                                                                Throwable cause7 = th9.getCause();
                                                                if (cause7 == null) {
                                                                    throw th9;
                                                                }
                                                                throw cause7;
                                                            }
                                                        }
                                                    }
                                                    c5 = c9;
                                                    i7 = i20;
                                                    i8 = i3;
                                                    c6 = 'A';
                                                    int i49 = i21;
                                                    if (z9) {
                                                        try {
                                                            Random random = new Random();
                                                            try {
                                                                byte[] bArr13 = onResponseErrorNative;
                                                                random.setSeed(((Long) Class.forName($$c(bArr13[190], bArr13[i], bArr13[c4])).getMethod($$c((short) 974, bArr13[c5], bArr13[c2]), r7).invoke(r7, r7)).longValue() ^ (-1617105541));
                                                                obj4 = r7;
                                                                obj5 = obj4;
                                                                obj6 = obj5;
                                                                obj7 = obj6;
                                                                while (obj4 == null) {
                                                                    int i50 = onDeepLinking + 67;
                                                                    int i51 = i19;
                                                                    int i52 = i50 % 128;
                                                                    onDeepLinkingNative = i52;
                                                                    if (i50 % 2 != 0) {
                                                                        int i53 = 52 / 0;
                                                                    }
                                                                    cls2 = cls4;
                                                                    try {
                                                                        StringBuilder sb4 = new StringBuilder(i11 + 1);
                                                                        sb4.append('.');
                                                                        int i54 = z2 ? 1 : 0;
                                                                        while (i54 < i11) {
                                                                            if (z10) {
                                                                                i12 = i54;
                                                                                int nextInt = random.nextInt(26);
                                                                                sb4.append((char) (random.nextBoolean() ? (nextInt & 65) + (nextInt | 65) : ((nextInt | 96) << 1) - (nextInt ^ 96)));
                                                                            } else {
                                                                                i12 = i54;
                                                                                sb4.append((char) (8191 - (~(-(-random.nextInt(12))))));
                                                                            }
                                                                            i54 = (i12 & 1) + (i12 | 1);
                                                                        }
                                                                        String sb5 = sb4.toString();
                                                                        if (obj5 == null) {
                                                                            int i55 = onDeepLinkingNative + 115;
                                                                            onDeepLinking = i55 % 128;
                                                                            int i56 = i55 % 2;
                                                                            try {
                                                                                Object[] objArr7 = new Object[i49];
                                                                                objArr7[i51] = sb5;
                                                                                objArr7[z2 ? 1 : 0] = obj11;
                                                                                int i57 = onAttributionFailureNative;
                                                                                short s9 = (short) ((i57 ^ 928) | (i57 & 928));
                                                                                byte[] bArr14 = onResponseErrorNative;
                                                                                zArr4 = zArr;
                                                                                try {
                                                                                    zArr5 = zArr2;
                                                                                    try {
                                                                                        Class<?> cls13 = Class.forName($$c(s9, bArr14[c3], bArr14[c4]));
                                                                                        Class<?>[] clsArr6 = new Class[2];
                                                                                        clsArr6[z2 ? 1 : 0] = Class.forName($$c((short) (i57 | 928), bArr14[c3], bArr14[c4]));
                                                                                        clsArr6[i51] = String.class;
                                                                                        obj5 = cls13.getDeclaredConstructor(clsArr6).newInstance(objArr7);
                                                                                    } catch (Throwable th10) {
                                                                                        th = th10;
                                                                                        cause = th.getCause();
                                                                                        if (cause != null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause;
                                                                                    }
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                            }
                                                                        } else {
                                                                            zArr4 = zArr;
                                                                            zArr5 = zArr2;
                                                                            if (obj6 == null) {
                                                                                try {
                                                                                    try {
                                                                                        Object[] objArr8 = new Object[2];
                                                                                        objArr8[i51] = sb5;
                                                                                        objArr8[z2 ? 1 : 0] = obj11;
                                                                                        int i58 = onAttributionFailureNative;
                                                                                        byte[] bArr15 = onResponseErrorNative;
                                                                                        Class<?> cls14 = Class.forName($$c((short) ((i58 ^ 928) | (i58 & 928)), bArr15[c3], bArr15[c4]));
                                                                                        Class<?>[] clsArr7 = new Class[2];
                                                                                        clsArr7[z2 ? 1 : 0] = Class.forName($$c((short) ((i58 & 928) | (i58 ^ 928)), bArr15[c3], bArr15[c4]));
                                                                                        clsArr7[i51] = String.class;
                                                                                        obj6 = cls14.getDeclaredConstructor(clsArr7).newInstance(objArr8);
                                                                                    } catch (Throwable th13) {
                                                                                        Throwable cause8 = th13.getCause();
                                                                                        if (cause8 == null) {
                                                                                            throw th13;
                                                                                        }
                                                                                        throw cause8;
                                                                                    }
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                    str = $$c;
                                                                                    zArr6 = zArr3;
                                                                                    bArr2 = r8 == true ? 1 : 0;
                                                                                    i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                                                    while (i9 < i10) {
                                                                                    }
                                                                                    short s82 = (short) (onAttributionFailureNative | 356);
                                                                                    byte[] bArr122 = onResponseErrorNative;
                                                                                    throw ((Throwable) Class.forName($$c((short) 860, bArr122[220], bArr122[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s82, bArr122[9], bArr122[c6]), th));
                                                                                }
                                                                            } else if (obj7 == null) {
                                                                                int i59 = onDeepLinking + 15;
                                                                                onDeepLinkingNative = i59 % 128;
                                                                                int i60 = i59 % 2;
                                                                                try {
                                                                                    Object[] objArr9 = new Object[2];
                                                                                    objArr9[i51] = sb5;
                                                                                    objArr9[z2 ? 1 : 0] = obj11;
                                                                                    int i61 = onAttributionFailureNative;
                                                                                    byte[] bArr16 = onResponseErrorNative;
                                                                                    Class<?> cls15 = Class.forName($$c((short) ((i61 ^ 928) | (i61 & 928)), bArr16[c3], bArr16[c4]));
                                                                                    Class<?>[] clsArr8 = new Class[2];
                                                                                    clsArr8[z2 ? 1 : 0] = Class.forName($$c((short) ((i61 & 928) | (i61 ^ 928)), bArr16[c3], bArr16[c4]));
                                                                                    clsArr8[i51] = String.class;
                                                                                    obj7 = cls15.getDeclaredConstructor(clsArr8).newInstance(objArr9);
                                                                                } catch (Throwable th15) {
                                                                                    Throwable cause9 = th15.getCause();
                                                                                    if (cause9 == null) {
                                                                                        throw th15;
                                                                                    }
                                                                                    throw cause9;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    Object[] objArr10 = new Object[2];
                                                                                    objArr10[i51] = sb5;
                                                                                    objArr10[z2 ? 1 : 0] = obj11;
                                                                                    int i62 = onAttributionFailureNative;
                                                                                    byte[] bArr17 = onResponseErrorNative;
                                                                                    Class<?> cls16 = Class.forName($$c((short) (i62 | 928), bArr17[c3], bArr17[c4]));
                                                                                    Class<?>[] clsArr9 = new Class[2];
                                                                                    bArr2 = bArr17;
                                                                                    str = $$c;
                                                                                    try {
                                                                                        try {
                                                                                            clsArr9[z2 ? 1 : 0] = Class.forName($$c((short) ((i62 & 928) | (i62 ^ 928)), bArr2[c3], bArr2[c4]));
                                                                                            clsArr9[i51] = String.class;
                                                                                            obj4 = cls16.getDeclaredConstructor(clsArr9).newInstance(objArr10);
                                                                                            try {
                                                                                                Object[] objArr11 = {obj4};
                                                                                                short s10 = (short) 830;
                                                                                                Class<?> cls17 = Class.forName($$c(s10, bArr2[c10222], bArr2[c4]));
                                                                                                Class<?>[] clsArr10 = new Class[i51];
                                                                                                zArr6 = zArr3;
                                                                                                try {
                                                                                                    clsArr10[z2 ? 1 : 0] = Class.forName($$c((short) ((i62 & 928) | (i62 ^ 928)), bArr2[c3], bArr2[c4]));
                                                                                                    try {
                                                                                                        Class.forName($$c(s10, bArr2[c10222], bArr2[c4])).getMethod($$c((short) 739, bArr2[55], bArr2[c2]), null).invoke(cls17.getDeclaredConstructor(clsArr10).newInstance(objArr11), null);
                                                                                                    } catch (Throwable th16) {
                                                                                                        Throwable cause10 = th16.getCause();
                                                                                                        if (cause10 == null) {
                                                                                                            throw th16;
                                                                                                        }
                                                                                                        throw cause10;
                                                                                                    }
                                                                                                } catch (Throwable th17) {
                                                                                                    th = th17;
                                                                                                    Throwable cause11 = th.getCause();
                                                                                                    if (cause11 == null) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                    throw cause11;
                                                                                                }
                                                                                            } catch (Throwable th18) {
                                                                                                th = th18;
                                                                                            }
                                                                                        } catch (Throwable th19) {
                                                                                            th = th19;
                                                                                            Throwable cause12 = th.getCause();
                                                                                            if (cause12 == null) {
                                                                                                throw th;
                                                                                            }
                                                                                            throw cause12;
                                                                                        }
                                                                                    } catch (Exception e) {
                                                                                        try {
                                                                                            StringBuilder sb6 = new StringBuilder();
                                                                                            byte[] bArr18 = onResponseErrorNative;
                                                                                            StringBuilder append2 = sb6.append($$c((short) 948, bArr18[55], bArr18[c6])).append(clsArr9);
                                                                                            byte b4 = bArr18[59];
                                                                                            String sb7 = append2.append($$c((short) 241, b4, (byte) ((b4 ^ 78) | (b4 & 78)))).toString();
                                                                                            try {
                                                                                                Object[] objArr12 = new Object[2];
                                                                                                objArr12[1] = e;
                                                                                                objArr12[z2 ? 1 : 0] = sb7;
                                                                                                Class<?> cls18 = Class.forName($$c((short) 860, bArr18[220], bArr18[c4]));
                                                                                                Class<?>[] clsArr11 = new Class[2];
                                                                                                clsArr11[z2 ? 1 : 0] = String.class;
                                                                                                clsArr11[1] = Throwable.class;
                                                                                                throw ((Throwable) cls18.getDeclaredConstructor(clsArr11).newInstance(objArr12));
                                                                                            } catch (Throwable th20) {
                                                                                                Throwable cause13 = th20.getCause();
                                                                                                if (cause13 == null) {
                                                                                                    throw th20;
                                                                                                }
                                                                                                throw cause13;
                                                                                            }
                                                                                        } catch (Throwable th21) {
                                                                                            th = th21;
                                                                                            bArr2 = r8 == true ? 1 : 0;
                                                                                            i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                                                            while (i9 < i10) {
                                                                                            }
                                                                                            short s822 = (short) (onAttributionFailureNative | 356);
                                                                                            byte[] bArr1222 = onResponseErrorNative;
                                                                                            throw ((Throwable) Class.forName($$c((short) 860, bArr1222[220], bArr1222[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s822, bArr1222[9], bArr1222[c6]), th));
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th22) {
                                                                                    th = th22;
                                                                                }
                                                                            }
                                                                            cls4 = cls2;
                                                                            zArr = zArr4;
                                                                            zArr2 = zArr5;
                                                                            $$c = str;
                                                                            zArr3 = zArr6;
                                                                            i19 = 1;
                                                                            i49 = 2;
                                                                        }
                                                                        str = $$c;
                                                                        zArr6 = zArr3;
                                                                        cls4 = cls2;
                                                                        zArr = zArr4;
                                                                        zArr2 = zArr5;
                                                                        $$c = str;
                                                                        zArr3 = zArr6;
                                                                        i19 = 1;
                                                                        i49 = 2;
                                                                    } catch (Throwable th23) {
                                                                        th = th23;
                                                                        zArr4 = zArr;
                                                                        zArr5 = zArr2;
                                                                        str = $$c;
                                                                        zArr6 = zArr3;
                                                                        bArr2 = r8 == true ? 1 : 0;
                                                                        i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                                        while (i9 < i10) {
                                                                        }
                                                                        short s8222 = (short) (onAttributionFailureNative | 356);
                                                                        byte[] bArr12222 = onResponseErrorNative;
                                                                        throw ((Throwable) Class.forName($$c((short) 860, bArr12222[220], bArr12222[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s8222, bArr12222[9], bArr12222[c6]), th));
                                                                    }
                                                                }
                                                            } catch (Throwable th24) {
                                                                Throwable cause14 = th24.getCause();
                                                                if (cause14 == null) {
                                                                    throw th24;
                                                                }
                                                                throw cause14;
                                                            }
                                                        } catch (Throwable th25) {
                                                            th = th25;
                                                            cls2 = cls4;
                                                            zArr4 = zArr;
                                                            zArr5 = zArr2;
                                                            str = $$c;
                                                            zArr6 = zArr3;
                                                            bArr2 = r8 == true ? 1 : 0;
                                                            i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                            while (i9 < i10) {
                                                            }
                                                            short s82222 = (short) (onAttributionFailureNative | 356);
                                                            byte[] bArr122222 = onResponseErrorNative;
                                                            throw ((Throwable) Class.forName($$c((short) 860, bArr122222[220], bArr122222[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s82222, bArr122222[9], bArr122222[c6]), th));
                                                        }
                                                    } else {
                                                        obj4 = null;
                                                        obj5 = null;
                                                        obj6 = null;
                                                        obj7 = null;
                                                    }
                                                    cls2 = cls4;
                                                    zArr4 = zArr;
                                                    zArr5 = zArr2;
                                                    str = $$c;
                                                    zArr6 = zArr3;
                                                    byte[] bArr19 = new byte[7288];
                                                    byte[] bArr20 = onResponseErrorNative;
                                                    try {
                                                        Object[] objArr13 = {AFa1wSDK.class.getResourceAsStream($$c((short) 743, bArr20[259], bArr20[166]))};
                                                        short s11 = (short) 515;
                                                        Class<?> cls19 = Class.forName($$c(s11, bArr20[i7], bArr20[c4]));
                                                        Class<?>[] clsArr12 = new Class[1];
                                                        int i63 = onAttributionFailureNative;
                                                        clsArr12[z2 ? 1 : 0] = Class.forName($$c((short) ((i63 & 1058) | (i63 ^ 1058)), bArr20[220], bArr20[c4]));
                                                        Object newInstance2 = cls19.getDeclaredConstructor(clsArr12).newInstance(objArr13);
                                                        try {
                                                            ?? cls20 = Class.forName($$c(s11, bArr20[i7], bArr20[c4]));
                                                            String $$c8 = $$c((short) 190, bArr20[35], bArr20[2]);
                                                            Class[] clsArr13 = new Class[1];
                                                            clsArr13[z2 ? 1 : 0] = cls2;
                                                            cls20.getMethod($$c8, clsArr13).invoke(newInstance2, bArr19);
                                                            try {
                                                                Class.forName($$c(s11, bArr20[i7], bArr20[c4])).getMethod($$c((short) 739, bArr20[55], bArr20[c2]), null).invoke(newInstance2, null);
                                                                int i64 = 16;
                                                                int i65 = 7249;
                                                                String str3 = str;
                                                                Class cls21 = null;
                                                                byte[] bArr21 = r8;
                                                                ?? r18 = z2;
                                                                while (true) {
                                                                    int i66 = (i64 & 611) + (i64 | 611);
                                                                    byte b5 = bArr19[(i64 & 7271) + (i64 | 7271)];
                                                                    bArr19[i66] = (byte) ((b5 & Byte.MIN_VALUE) + (b5 | Byte.MIN_VALUE));
                                                                    int length2 = bArr19.length;
                                                                    int i67 = -i64;
                                                                    int i68 = (length2 ^ i67) + ((length2 & i67) << 1);
                                                                    try {
                                                                        Object[] objArr14 = new Object[i2];
                                                                        objArr14[2] = Integer.valueOf(i68);
                                                                        objArr14[1] = Integer.valueOf(i64);
                                                                        objArr14[r18] = bArr19;
                                                                        byte[] bArr22 = onResponseErrorNative;
                                                                        ?? cls22 = Class.forName($$c((short) 128, bArr22[148], bArr22[c4]));
                                                                        Class[] clsArr14 = new Class[3];
                                                                        clsArr14[r18] = cls2;
                                                                        clsArr14[1] = Integer.TYPE;
                                                                        clsArr14[2] = Integer.TYPE;
                                                                        InputStream inputStream2 = (InputStream) cls22.getDeclaredConstructor(clsArr14).newInstance(objArr14);
                                                                        Object obj12 = init;
                                                                        if (obj12 == null) {
                                                                            try {
                                                                                Object[] objArr15 = new Object[3];
                                                                                objArr15[2] = Integer.valueOf((int) r18);
                                                                                objArr15[1] = Integer.valueOf((int) r18);
                                                                                objArr15[r18] = Integer.valueOf((int) r18);
                                                                                Class<?> cls23 = Class.forName($$c((short) 198, bArr22[c5], bArr22[i7]));
                                                                                int i69 = onAttributionFailureNative;
                                                                                i13 = i64;
                                                                                String $$c9 = $$c((short) ((i69 & 534) | (i69 ^ 534)), bArr22[220], bArr22[2]);
                                                                                Class<?>[] clsArr15 = new Class[3];
                                                                                clsArr15[r18] = Integer.TYPE;
                                                                                clsArr15[1] = Integer.TYPE;
                                                                                clsArr15[2] = Integer.TYPE;
                                                                                int i70 = -((Integer) cls23.getMethod($$c9, clsArr15).invoke(null, objArr15)).intValue();
                                                                                int i71 = (i70 ^ 2110627654) + ((i70 & 2110627654) << 1);
                                                                                short jumpTapTimeout = (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 6);
                                                                                int i72 = i65;
                                                                                long j = onInstallConversionFailureNative;
                                                                                i14 = i72;
                                                                                bArr2 = bArr21;
                                                                                int i73 = (int) (j >>> 32);
                                                                                int i74 = (int) j;
                                                                                try {
                                                                                    inputStream = new AFg1oSDK(inputStream2, new int[]{((~i73) & i71) | ((~i71) & i73), (i74 | i71) & (~(i74 & i71))}, onInstallConversionDataLoadedNative, onConversionDataSuccess, jumpTapTimeout, onResponseNative);
                                                                                    str2 = str3;
                                                                                } catch (Throwable th26) {
                                                                                    th = th26;
                                                                                    i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                                                    while (i9 < i10) {
                                                                                    }
                                                                                    short s822222 = (short) (onAttributionFailureNative | 356);
                                                                                    byte[] bArr1222222 = onResponseErrorNative;
                                                                                    throw ((Throwable) Class.forName($$c((short) 860, bArr1222222[220], bArr1222222[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s822222, bArr1222222[9], bArr1222222[c6]), th));
                                                                                }
                                                                            } catch (Throwable th27) {
                                                                                Throwable cause15 = th27.getCause();
                                                                                if (cause15 == null) {
                                                                                    throw th27;
                                                                                }
                                                                                throw cause15;
                                                                            }
                                                                        } else {
                                                                            i13 = i64;
                                                                            i14 = i65;
                                                                            bArr2 = bArr21;
                                                                            try {
                                                                                Object[] objArr16 = {Integer.valueOf((int) r18)};
                                                                                byte b6 = bArr22[i7];
                                                                                Class<?> cls24 = Class.forName($$c((short) 952, b6, b6));
                                                                                String $$c10 = $$c(bArr22[7], bArr22[c4], bArr22[c2]);
                                                                                Class<?>[] clsArr16 = new Class[1];
                                                                                clsArr16[r18] = Integer.TYPE;
                                                                                int i75 = 1 - (~(-(((Float) cls24.getMethod($$c10, clsArr16).invoke(null, objArr16)).floatValue() > 0.0f ? 1 : (((Float) cls24.getMethod($$c10, clsArr16).invoke(null, objArr16)).floatValue() == 0.0f ? 0 : -1))));
                                                                                try {
                                                                                    Class<?> cls25 = Class.forName($$c((short) (-bArr22[214]), bArr22[77], bArr22[i7]));
                                                                                    byte b7 = bArr22[c5];
                                                                                    int i76 = 1721452554 - (~(-(((Long) cls25.getMethod($$c((short) 610, b7, b7), null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls25.getMethod($$c((short) 610, b7, b7), null).invoke(null, null)).longValue() == 0L ? 0 : -1))));
                                                                                    try {
                                                                                        Object[] objArr17 = new Object[i];
                                                                                        objArr17[3] = new byte[]{-76, -68, 103, -50, 121, Base64.padSymbol, 94, -46};
                                                                                        objArr17[2] = Integer.valueOf(i76);
                                                                                        objArr17[1] = Integer.valueOf(i75);
                                                                                        objArr17[r18] = inputStream2;
                                                                                        int i77 = onAttributionFailureNative;
                                                                                        ?? cls26 = Class.forName($$c((short) (i77 | 674), bArr22[1], bArr22[c2]), true, (ClassLoader) AppsFlyer2dXConversionCallback);
                                                                                        String $$c11 = $$c((short) ((i77 ^ 306) | (i77 & 306)), bArr22[4], bArr22[25]);
                                                                                        Class[] clsArr17 = new Class[4];
                                                                                        str2 = str3;
                                                                                        clsArr17[r18] = Class.forName($$c((short) ((i77 & 1058) | (i77 ^ 1058)), bArr22[220], bArr22[c4]));
                                                                                        clsArr17[1] = Integer.TYPE;
                                                                                        clsArr17[2] = Integer.TYPE;
                                                                                        clsArr17[3] = cls2;
                                                                                        inputStream = (InputStream) cls26.getMethod($$c11, clsArr17).invoke(obj12, objArr17);
                                                                                    } catch (Throwable th28) {
                                                                                        Throwable cause16 = th28.getCause();
                                                                                        if (cause16 == null) {
                                                                                            throw th28;
                                                                                        }
                                                                                        throw cause16;
                                                                                    }
                                                                                } catch (Throwable th29) {
                                                                                    Throwable cause17 = th29.getCause();
                                                                                    if (cause17 == null) {
                                                                                        throw th29;
                                                                                    }
                                                                                    throw cause17;
                                                                                }
                                                                            } catch (Throwable th30) {
                                                                                Throwable cause18 = th30.getCause();
                                                                                if (cause18 == null) {
                                                                                    throw th30;
                                                                                }
                                                                                throw cause18;
                                                                            }
                                                                        }
                                                                        try {
                                                                            Object[] objArr18 = {Long.valueOf(22)};
                                                                            int i78 = onAttributionFailureNative;
                                                                            Class<?> cls27 = Class.forName($$c((short) ((i78 ^ 1058) | (i78 & 1058)), bArr22[220], bArr22[c4]));
                                                                            String $$c12 = $$c((short) 626, bArr22[27], bArr22[55]);
                                                                            Class<?>[] clsArr18 = new Class[1];
                                                                            clsArr18[r18] = Long.TYPE;
                                                                            ((Long) cls27.getMethod($$c12, clsArr18).invoke(inputStream, objArr18)).longValue();
                                                                            if (z9) {
                                                                                Object obj13 = init;
                                                                                Object obj14 = obj13 == null ? obj5 : obj6;
                                                                                if (obj13 == null) {
                                                                                    int i79 = onDeepLinking;
                                                                                    int i80 = (i79 ^ 85) + ((i79 & 85) << 1);
                                                                                    onDeepLinkingNative = i80 % 128;
                                                                                    if (i80 % 2 != 0) {
                                                                                        Object obj15 = null;
                                                                                        super.hashCode();
                                                                                        throw null;
                                                                                    }
                                                                                    obj10 = obj7;
                                                                                } else {
                                                                                    obj10 = obj4;
                                                                                }
                                                                                try {
                                                                                    Object[] objArr19 = {obj14};
                                                                                    short s12 = (short) 830;
                                                                                    c7 = 728;
                                                                                    try {
                                                                                        Class<?> cls28 = Class.forName($$c(s12, bArr22[c10222], bArr22[c4]));
                                                                                        Class<?>[] clsArr19 = new Class[1];
                                                                                        obj8 = obj4;
                                                                                        clsArr19[r18] = Class.forName($$c((short) (i78 | 928), bArr22[c3], bArr22[c4]));
                                                                                        Object newInstance3 = cls28.getDeclaredConstructor(clsArr19).newInstance(objArr19);
                                                                                        int i81 = 1024;
                                                                                        try {
                                                                                            byte[] bArr23 = new byte[1024];
                                                                                            int i82 = i14;
                                                                                            while (i82 > 0) {
                                                                                                int i83 = onDeepLinking;
                                                                                                int i84 = (i83 & 65) + (i83 | 65);
                                                                                                onDeepLinkingNative = i84 % 128;
                                                                                                if (i84 % 2 != 0) {
                                                                                                    min = Math.min(i81, i82);
                                                                                                    i16 = 1;
                                                                                                } else {
                                                                                                    min = Math.min(i81, i82);
                                                                                                    i16 = r18;
                                                                                                }
                                                                                                byte[] bArr24 = bArr23;
                                                                                                try {
                                                                                                    Object[] objArr20 = new Object[3];
                                                                                                    objArr20[2] = Integer.valueOf(min);
                                                                                                    objArr20[1] = Integer.valueOf(i16);
                                                                                                    objArr20[r18] = bArr24;
                                                                                                    short s13 = (short) (onAttributionFailureNative | 1058);
                                                                                                    byte[] bArr25 = onResponseErrorNative;
                                                                                                    int i85 = i82;
                                                                                                    ?? cls29 = Class.forName($$c(s13, bArr25[220], bArr25[c4]));
                                                                                                    String $$c13 = $$c((short) 238, bArr25[27], bArr25[2]);
                                                                                                    Class[] clsArr20 = new Class[3];
                                                                                                    clsArr20[r18] = cls2;
                                                                                                    clsArr20[1] = Integer.TYPE;
                                                                                                    clsArr20[2] = Integer.TYPE;
                                                                                                    int intValue = ((Integer) cls29.getMethod($$c13, clsArr20).invoke(inputStream, objArr20)).intValue();
                                                                                                    if (intValue == -1) {
                                                                                                        break;
                                                                                                    }
                                                                                                    try {
                                                                                                        Object[] objArr21 = new Object[3];
                                                                                                        objArr21[2] = Integer.valueOf(intValue);
                                                                                                        objArr21[1] = Integer.valueOf((int) r18);
                                                                                                        objArr21[r18] = bArr24;
                                                                                                        ?? cls30 = Class.forName($$c(s12, bArr25[c10222], bArr25[c4]));
                                                                                                        String $$c14 = $$c((short) 224, bArr25[55], bArr25[59]);
                                                                                                        Class[] clsArr21 = new Class[3];
                                                                                                        clsArr21[r18] = cls2;
                                                                                                        clsArr21[1] = Integer.TYPE;
                                                                                                        clsArr21[2] = Integer.TYPE;
                                                                                                        cls30.getMethod($$c14, clsArr21).invoke(newInstance3, objArr21);
                                                                                                        i82 = i85 - intValue;
                                                                                                        bArr23 = bArr24;
                                                                                                        i81 = 1024;
                                                                                                    } catch (Throwable th31) {
                                                                                                        Throwable cause19 = th31.getCause();
                                                                                                        if (cause19 == null) {
                                                                                                            throw th31;
                                                                                                        }
                                                                                                        throw cause19;
                                                                                                    }
                                                                                                } catch (Throwable th32) {
                                                                                                    Throwable cause20 = th32.getCause();
                                                                                                    if (cause20 == null) {
                                                                                                        throw th32;
                                                                                                    }
                                                                                                    throw cause20;
                                                                                                }
                                                                                            }
                                                                                            int i86 = onDeepLinking + 5;
                                                                                            onDeepLinkingNative = i86 % 128;
                                                                                            int i87 = i86 % 2;
                                                                                            try {
                                                                                                byte[] bArr26 = onResponseErrorNative;
                                                                                                try {
                                                                                                    Class.forName($$c((short) 990, bArr26[58], bArr26[c4])).getMethod($$c((short) 330, bArr26[27], bArr26[55]), null).invoke(Class.forName($$c(s12, bArr26[c10222], bArr26[c4])).getMethod($$c((short) 657, bArr26[55], bArr26[c5]), null).invoke(newInstance3, null), null);
                                                                                                    int i88 = onDeepLinkingNative;
                                                                                                    int i89 = (i88 & 87) + (i88 | 87);
                                                                                                    onDeepLinking = i89 % 128;
                                                                                                    int i90 = i89 % 2;
                                                                                                    try {
                                                                                                        Class.forName($$c(s12, bArr26[c10222], bArr26[c4])).getMethod($$c((short) 739, bArr26[55], bArr26[c2]), null).invoke(newInstance3, null);
                                                                                                        Class<?> cls31 = Class.forName($$c((short) 241, bArr26[c2], bArr26[728]));
                                                                                                        int i91 = onAttributionFailureNative;
                                                                                                        String $$c15 = $$c((short) (i91 | 528), bArr26[6], bArr26[c3]);
                                                                                                        Class<?>[] clsArr22 = new Class[3];
                                                                                                        clsArr22[r18] = String.class;
                                                                                                        clsArr22[1] = String.class;
                                                                                                        clsArr22[2] = Integer.TYPE;
                                                                                                        try {
                                                                                                            short s14 = (short) 791;
                                                                                                            try {
                                                                                                                obj9 = cls31.getDeclaredMethod($$c15, clsArr22).invoke(null, Class.forName($$c((short) ((i91 ^ 928) | (i91 & 928)), bArr26[c3], bArr26[c4])).getMethod($$c(s14, bArr26[161], bArr26[c5]), null).invoke(obj14, null), Class.forName($$c((short) (i91 | 928), bArr26[c3], bArr26[c4])).getMethod($$c(s14, bArr26[161], bArr26[c5]), null).invoke(obj10, null), Integer.valueOf((int) r18));
                                                                                                                try {
                                                                                                                    short s15 = (short) 652;
                                                                                                                    ((Boolean) Class.forName($$c((short) ((i91 ^ 928) | (i91 & 928)), bArr26[c3], bArr26[c4])).getMethod($$c(s15, bArr26[2], bArr26[728]), null).invoke(obj14, null)).booleanValue();
                                                                                                                    try {
                                                                                                                        ((Boolean) Class.forName($$c((short) ((i91 & 928) | (i91 ^ 928)), bArr26[c3], bArr26[c4])).getMethod($$c(s15, bArr26[2], bArr26[728]), null).invoke(obj10, null)).booleanValue();
                                                                                                                        int i92 = onDeepLinking;
                                                                                                                        int i93 = ((i92 | 23) << 1) - (i92 ^ 23);
                                                                                                                        onDeepLinkingNative = i93 % 128;
                                                                                                                        if (i93 % 2 != 0) {
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        if (AppsFlyer2dXConversionCallback == null) {
                                                                                                                            try {
                                                                                                                                AppsFlyer2dXConversionCallback = Class.class.getMethod($$c((short) 629, bArr26[c4], bArr26[c5]), null).invoke(AFa1wSDK.class, null);
                                                                                                                            } catch (Throwable th33) {
                                                                                                                                Throwable cause21 = th33.getCause();
                                                                                                                                if (cause21 == null) {
                                                                                                                                    throw th33;
                                                                                                                                }
                                                                                                                                throw cause21;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (Throwable th34) {
                                                                                                                        Throwable cause22 = th34.getCause();
                                                                                                                        if (cause22 == null) {
                                                                                                                            throw th34;
                                                                                                                        }
                                                                                                                        throw cause22;
                                                                                                                    }
                                                                                                                } catch (Throwable th35) {
                                                                                                                    Throwable cause23 = th35.getCause();
                                                                                                                    if (cause23 == null) {
                                                                                                                        throw th35;
                                                                                                                    }
                                                                                                                    throw cause23;
                                                                                                                }
                                                                                                            } catch (Throwable th36) {
                                                                                                                Throwable cause24 = th36.getCause();
                                                                                                                if (cause24 == null) {
                                                                                                                    throw th36;
                                                                                                                }
                                                                                                                throw cause24;
                                                                                                            }
                                                                                                        } catch (Throwable th37) {
                                                                                                            Throwable cause25 = th37.getCause();
                                                                                                            if (cause25 == null) {
                                                                                                                throw th37;
                                                                                                            }
                                                                                                            throw cause25;
                                                                                                        }
                                                                                                    } catch (Throwable th38) {
                                                                                                        Throwable cause26 = th38.getCause();
                                                                                                        if (cause26 == null) {
                                                                                                            throw th38;
                                                                                                        }
                                                                                                        throw cause26;
                                                                                                    }
                                                                                                } catch (Throwable th39) {
                                                                                                    Throwable cause27 = th39.getCause();
                                                                                                    if (cause27 == null) {
                                                                                                        throw th39;
                                                                                                    }
                                                                                                    throw cause27;
                                                                                                }
                                                                                            } catch (Throwable th40) {
                                                                                                Throwable cause28 = th40.getCause();
                                                                                                if (cause28 == null) {
                                                                                                    throw th40;
                                                                                                }
                                                                                                throw cause28;
                                                                                            }
                                                                                        } catch (Throwable th41) {
                                                                                            try {
                                                                                                int i94 = onAttributionFailureNative;
                                                                                                byte[] bArr27 = onResponseErrorNative;
                                                                                                short s16 = (short) 652;
                                                                                                ((Boolean) Class.forName($$c((short) (i94 | 928), bArr27[c3], bArr27[c4])).getMethod($$c(s16, bArr27[2], bArr27[c7]), null).invoke(obj14, null)).booleanValue();
                                                                                                try {
                                                                                                    ((Boolean) Class.forName($$c((short) (i94 | 928), bArr27[c3], bArr27[c4])).getMethod($$c(s16, bArr27[2], bArr27[c7]), null).invoke(obj10, null)).booleanValue();
                                                                                                    throw th41;
                                                                                                } catch (Throwable th42) {
                                                                                                    Throwable cause29 = th42.getCause();
                                                                                                    if (cause29 == null) {
                                                                                                        throw th42;
                                                                                                    }
                                                                                                    throw cause29;
                                                                                                }
                                                                                            } catch (Throwable th43) {
                                                                                                Throwable cause30 = th43.getCause();
                                                                                                if (cause30 == null) {
                                                                                                    throw th43;
                                                                                                }
                                                                                                throw cause30;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th44) {
                                                                                        th = th44;
                                                                                        try {
                                                                                            Throwable cause31 = th.getCause();
                                                                                            if (cause31 == null) {
                                                                                                throw th;
                                                                                            }
                                                                                            throw cause31;
                                                                                        } catch (Exception e2) {
                                                                                            StringBuilder sb8 = new StringBuilder();
                                                                                            byte[] bArr28 = onResponseErrorNative;
                                                                                            StringBuilder append3 = sb8.append($$c((short) 391, bArr28[55], bArr28[c6])).append(obj14);
                                                                                            byte b8 = bArr28[59];
                                                                                            String sb9 = append3.append($$c((short) 241, b8, (byte) ((b8 ^ 78) | (b8 & 78)))).toString();
                                                                                            try {
                                                                                                Object[] objArr23 = new Object[2];
                                                                                                objArr23[1] = e2;
                                                                                                objArr23[r18] = sb9;
                                                                                                Class<?> cls32 = Class.forName($$c((short) 860, bArr28[220], bArr28[c4]));
                                                                                                Class<?>[] clsArr23 = new Class[2];
                                                                                                clsArr23[r18] = String.class;
                                                                                                clsArr23[1] = Throwable.class;
                                                                                                throw ((Throwable) cls32.getDeclaredConstructor(clsArr23).newInstance(objArr23));
                                                                                            } catch (Throwable th45) {
                                                                                                Throwable cause32 = th45.getCause();
                                                                                                if (cause32 == null) {
                                                                                                    throw th45;
                                                                                                }
                                                                                                throw cause32;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th46) {
                                                                                    th = th46;
                                                                                    c7 = 728;
                                                                                }
                                                                            } else {
                                                                                obj8 = obj4;
                                                                                c7 = 728;
                                                                                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                int i95 = onDeepLinkingNative;
                                                                                int i96 = (i95 ^ 85) + ((i95 & 85) << 1);
                                                                                onDeepLinking = i96 % 128;
                                                                                int i97 = i96 % 2;
                                                                                try {
                                                                                    Class<?> cls33 = Class.forName($$c(bArr22[62], bArr22[604], bArr22[c4]));
                                                                                    Class<?>[] clsArr24 = new Class[1];
                                                                                    clsArr24[r18] = Class.forName($$c((short) ((i78 & 1058) | (i78 ^ 1058)), bArr22[220], bArr22[c4]));
                                                                                    Object newInstance4 = cls33.getDeclaredConstructor(clsArr24).newInstance(zipInputStream);
                                                                                    int i98 = onDeepLinking + 65;
                                                                                    onDeepLinkingNative = i98 % 128;
                                                                                    int i99 = i98 % 2;
                                                                                    short s17 = (short) 561;
                                                                                    try {
                                                                                        Object newInstance5 = Class.forName($$c(s17, (byte) (bArr22[668] - 1), bArr22[c4])).getDeclaredConstructor(null).newInstance(null);
                                                                                        byte[] bArr29 = new byte[1024];
                                                                                        int i100 = r18;
                                                                                        while (true) {
                                                                                            try {
                                                                                                Object[] objArr24 = {bArr29};
                                                                                                bArr3 = onResponseErrorNative;
                                                                                                byte[] bArr30 = bArr29;
                                                                                                ?? cls34 = Class.forName($$c(bArr3[62], bArr3[604], bArr3[c4]));
                                                                                                String $$c16 = $$c((short) 238, bArr3[27], bArr3[2]);
                                                                                                Class[] clsArr25 = new Class[1];
                                                                                                clsArr25[r18] = cls2;
                                                                                                int intValue2 = ((Integer) cls34.getMethod($$c16, clsArr25).invoke(newInstance4, objArr24)).intValue();
                                                                                                if (intValue2 <= 0) {
                                                                                                    break;
                                                                                                }
                                                                                                try {
                                                                                                    if (i100 >= nextEntry.getSize()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    int i101 = onDeepLinkingNative + 43;
                                                                                                    onDeepLinking = i101 % 128;
                                                                                                    int i102 = i101 % 2;
                                                                                                    try {
                                                                                                        Object[] objArr25 = new Object[3];
                                                                                                        try {
                                                                                                            objArr25[2] = Integer.valueOf(intValue2);
                                                                                                            objArr25[1] = Integer.valueOf((int) r18);
                                                                                                            objArr25[r18] = bArr30;
                                                                                                            ?? cls35 = Class.forName($$c(s17, (byte) ((-2) - (bArr3[668] ^ (-1))), bArr3[c4]));
                                                                                                            int i103 = i100;
                                                                                                            String $$c17 = $$c((short) 224, bArr3[55], bArr3[59]);
                                                                                                            try {
                                                                                                                Class[] clsArr26 = new Class[3];
                                                                                                                clsArr26[r18] = cls2;
                                                                                                                clsArr26[1] = Integer.TYPE;
                                                                                                                clsArr26[2] = Integer.TYPE;
                                                                                                                cls35.getMethod($$c17, clsArr26).invoke(newInstance5, objArr25);
                                                                                                                int i104 = -(-intValue2);
                                                                                                                i100 = (i103 ^ i104) + ((i103 & i104) << 1);
                                                                                                                bArr29 = bArr30;
                                                                                                            } catch (Throwable th47) {
                                                                                                                th = th47;
                                                                                                                Throwable cause33 = th.getCause();
                                                                                                                if (cause33 == null) {
                                                                                                                    throw th;
                                                                                                                }
                                                                                                                throw cause33;
                                                                                                            }
                                                                                                        } catch (Throwable th48) {
                                                                                                            th = th48;
                                                                                                        }
                                                                                                    } catch (Throwable th49) {
                                                                                                        th = th49;
                                                                                                    }
                                                                                                } catch (Throwable th50) {
                                                                                                    th = th50;
                                                                                                    i9 = ((i4 | 1) << 1) - (i4 ^ 1);
                                                                                                    while (i9 < i10) {
                                                                                                        if (zArr6[i9]) {
                                                                                                            obj3 = null;
                                                                                                            init = null;
                                                                                                            AppsFlyer2dXConversionCallback = null;
                                                                                                            i6 = 2;
                                                                                                            z3 = false;
                                                                                                            i7 = 9;
                                                                                                            i5 = 1;
                                                                                                            r82 = bArr2;
                                                                                                            i4 = (i4 & 1) + (i4 | 1);
                                                                                                            i21 = i6;
                                                                                                            i3 = i8;
                                                                                                            c9 = c5;
                                                                                                            i20 = i7;
                                                                                                            i19 = i5;
                                                                                                            r7 = obj3;
                                                                                                            cls4 = cls2;
                                                                                                            zArr = zArr4;
                                                                                                            zArr2 = zArr5;
                                                                                                            $$c = str;
                                                                                                            zArr3 = zArr6;
                                                                                                            i = 4;
                                                                                                            i2 = 3;
                                                                                                            r8 = r82;
                                                                                                            z2 = z3;
                                                                                                        } else {
                                                                                                            i9++;
                                                                                                        }
                                                                                                    }
                                                                                                    short s8222222 = (short) (onAttributionFailureNative | 356);
                                                                                                    byte[] bArr12222222 = onResponseErrorNative;
                                                                                                    throw ((Throwable) Class.forName($$c((short) 860, bArr12222222[220], bArr12222222[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s8222222, bArr12222222[9], bArr12222222[c6]), th));
                                                                                                }
                                                                                            } catch (Throwable th51) {
                                                                                                Throwable cause34 = th51.getCause();
                                                                                                if (cause34 == null) {
                                                                                                    throw th51;
                                                                                                }
                                                                                                throw cause34;
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            Object invoke6 = Class.forName($$c(s17, (byte) (bArr3[668] - 1), bArr3[c4])).getMethod($$c((short) PointerIconCompat.TYPE_COPY, bArr3[180], bArr3[27]), null).invoke(newInstance5, null);
                                                                                            try {
                                                                                                Class.forName($$c(bArr3[62], bArr3[604], bArr3[c4])).getMethod($$c((short) 739, bArr3[55], bArr3[c2]), null).invoke(newInstance4, null);
                                                                                                try {
                                                                                                    byte[] bArr31 = onResponseErrorNative;
                                                                                                    Class.forName($$c(s17, (byte) (bArr31[668] - 1), bArr31[c4])).getMethod($$c((short) 739, bArr31[55], bArr31[c2]), null).invoke(newInstance5, null);
                                                                                                    try {
                                                                                                        byte[] bArr32 = onResponseErrorNative;
                                                                                                        invoke3 = Class.class.getMethod($$c((short) 629, bArr32[c4], bArr32[c5]), null).invoke(AFa1wSDK.class, null);
                                                                                                        int i105 = onAttributionFailureNative;
                                                                                                        Class<?> cls36 = Class.forName($$c((short) ((i105 ^ 146) | (i105 & 146)), (byte) (bArr32[38] - 1), bArr32[728]));
                                                                                                        Class<?>[] clsArr27 = new Class[2];
                                                                                                        short s18 = (short) 87;
                                                                                                        clsArr27[r18] = Class.forName($$c(s18, bArr32[220], bArr32[c4]));
                                                                                                        clsArr27[1] = Class.forName($$c((short) 423, bArr32[c2], bArr32[c4]));
                                                                                                        Constructor<?> declaredConstructor = cls36.getDeclaredConstructor(clsArr27);
                                                                                                        try {
                                                                                                            ?? cls37 = Class.forName($$c(s18, bArr32[220], bArr32[c4]));
                                                                                                            String $$c18 = $$c((short) 1041, bArr32[27], bArr32[59]);
                                                                                                            Class[] clsArr28 = new Class[1];
                                                                                                            clsArr28[r18] = cls2;
                                                                                                            newInstance = declaredConstructor.newInstance(cls37.getMethod($$c18, clsArr28).invoke(null, invoke6), invoke3);
                                                                                                            try {
                                                                                                                Class<?> cls38 = Class.forName($$c((short) 270, bArr32[990], bArr32[728]));
                                                                                                                byte b9 = bArr32[83];
                                                                                                                Field declaredField = cls38.getDeclaredField($$c((short) 878, b9, b9));
                                                                                                                declaredField.setAccessible(true);
                                                                                                                Object obj16 = declaredField.get(invoke3);
                                                                                                                Class<?> cls39 = obj16.getClass();
                                                                                                                Field declaredField2 = cls39.getDeclaredField($$c((short) 1044, bArr32[c10222], (byte) i105));
                                                                                                                declaredField2.setAccessible(true);
                                                                                                                Field declaredField3 = cls39.getDeclaredField($$c((short) ((i105 ^ 706) | (i105 & 706)), bArr32[18], (byte) i105));
                                                                                                                declaredField3.setAccessible(true);
                                                                                                                Object obj17 = declaredField2.get(obj16);
                                                                                                                Object obj18 = declaredField3.get(obj16);
                                                                                                                Object obj19 = declaredField.get(newInstance);
                                                                                                                ArrayList arrayList = new ArrayList((List) obj17);
                                                                                                                Class<?> componentType = obj18.getClass().getComponentType();
                                                                                                                length = Array.getLength(obj18);
                                                                                                                Object newInstance6 = Array.newInstance(componentType, length);
                                                                                                                i15 = r18;
                                                                                                                while (i15 < length) {
                                                                                                                    Array.set(newInstance6, i15, Array.get(obj18, i15));
                                                                                                                    i15 = ((i15 | 1) << 1) - (i15 ^ 1);
                                                                                                                    newInstance = newInstance;
                                                                                                                }
                                                                                                                Object obj20 = newInstance;
                                                                                                                declaredField2.set(obj19, arrayList);
                                                                                                                declaredField3.set(obj19, newInstance6);
                                                                                                                if (AppsFlyer2dXConversionCallback == null) {
                                                                                                                    int i106 = onDeepLinkingNative;
                                                                                                                    int i107 = ((i106 | 5) << 1) - (i106 ^ 5);
                                                                                                                    onDeepLinking = i107 % 128;
                                                                                                                    int i108 = i107 % 2;
                                                                                                                    AppsFlyer2dXConversionCallback = obj20;
                                                                                                                }
                                                                                                                obj9 = obj20;
                                                                                                            } catch (Exception e3) {
                                                                                                                StringBuilder sb10 = new StringBuilder();
                                                                                                                int i109 = onAttributionFailureNative;
                                                                                                                byte[] bArr33 = onResponseErrorNative;
                                                                                                                StringBuilder append4 = sb10.append($$c((short) ((i109 & 386) | (i109 ^ 386)), bArr33[55], bArr33[c6])).append(invoke3);
                                                                                                                byte b10 = bArr33[59];
                                                                                                                try {
                                                                                                                    throw ((Throwable) Class.forName($$c((short) 860, bArr33[220], bArr33[c4])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append4.append($$c((short) 241, b10, (byte) ((b10 ^ 78) | (b10 & 78)))).toString(), e3));
                                                                                                                } catch (Throwable th52) {
                                                                                                                    Throwable cause35 = th52.getCause();
                                                                                                                    if (cause35 == null) {
                                                                                                                        throw th52;
                                                                                                                    }
                                                                                                                    throw cause35;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th53) {
                                                                                                            Throwable cause36 = th53.getCause();
                                                                                                            if (cause36 == null) {
                                                                                                                throw th53;
                                                                                                            }
                                                                                                            throw cause36;
                                                                                                        }
                                                                                                    } catch (Throwable th54) {
                                                                                                        Throwable cause37 = th54.getCause();
                                                                                                        if (cause37 == null) {
                                                                                                            throw th54;
                                                                                                        }
                                                                                                        throw cause37;
                                                                                                    }
                                                                                                } catch (Throwable th55) {
                                                                                                    try {
                                                                                                        Throwable cause38 = th55.getCause();
                                                                                                        if (cause38 == null) {
                                                                                                            throw th55;
                                                                                                        }
                                                                                                        throw cause38;
                                                                                                    } catch (IOException unused8) {
                                                                                                        byte[] bArr322 = onResponseErrorNative;
                                                                                                        invoke3 = Class.class.getMethod($$c((short) 629, bArr322[c4], bArr322[c5]), null).invoke(AFa1wSDK.class, null);
                                                                                                        int i1052 = onAttributionFailureNative;
                                                                                                        Class<?> cls362 = Class.forName($$c((short) ((i1052 ^ 146) | (i1052 & 146)), (byte) (bArr322[38] - 1), bArr322[728]));
                                                                                                        Class<?>[] clsArr272 = new Class[2];
                                                                                                        short s182 = (short) 87;
                                                                                                        clsArr272[r18] = Class.forName($$c(s182, bArr322[220], bArr322[c4]));
                                                                                                        clsArr272[1] = Class.forName($$c((short) 423, bArr322[c2], bArr322[c4]));
                                                                                                        Constructor<?> declaredConstructor2 = cls362.getDeclaredConstructor(clsArr272);
                                                                                                        ?? cls372 = Class.forName($$c(s182, bArr322[220], bArr322[c4]));
                                                                                                        String $$c182 = $$c((short) 1041, bArr322[27], bArr322[59]);
                                                                                                        Class[] clsArr282 = new Class[1];
                                                                                                        clsArr282[r18] = cls2;
                                                                                                        newInstance = declaredConstructor2.newInstance(cls372.getMethod($$c182, clsArr282).invoke(null, invoke6), invoke3);
                                                                                                        Class<?> cls382 = Class.forName($$c((short) 270, bArr322[990], bArr322[728]));
                                                                                                        byte b92 = bArr322[83];
                                                                                                        Field declaredField4 = cls382.getDeclaredField($$c((short) 878, b92, b92));
                                                                                                        declaredField4.setAccessible(true);
                                                                                                        Object obj162 = declaredField4.get(invoke3);
                                                                                                        Class<?> cls392 = obj162.getClass();
                                                                                                        Field declaredField22 = cls392.getDeclaredField($$c((short) 1044, bArr322[c10222], (byte) i1052));
                                                                                                        declaredField22.setAccessible(true);
                                                                                                        Field declaredField32 = cls392.getDeclaredField($$c((short) ((i1052 ^ 706) | (i1052 & 706)), bArr322[18], (byte) i1052));
                                                                                                        declaredField32.setAccessible(true);
                                                                                                        Object obj172 = declaredField22.get(obj162);
                                                                                                        Object obj182 = declaredField32.get(obj162);
                                                                                                        Object obj192 = declaredField4.get(newInstance);
                                                                                                        ArrayList arrayList2 = new ArrayList((List) obj172);
                                                                                                        Class<?> componentType2 = obj182.getClass().getComponentType();
                                                                                                        length = Array.getLength(obj182);
                                                                                                        Object newInstance62 = Array.newInstance(componentType2, length);
                                                                                                        i15 = r18;
                                                                                                        while (i15 < length) {
                                                                                                        }
                                                                                                        Object obj202 = newInstance;
                                                                                                        declaredField22.set(obj192, arrayList2);
                                                                                                        declaredField32.set(obj192, newInstance62);
                                                                                                        if (AppsFlyer2dXConversionCallback == null) {
                                                                                                        }
                                                                                                        obj9 = obj202;
                                                                                                        if (z9) {
                                                                                                        }
                                                                                                        if (cls3 == null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th56) {
                                                                                                try {
                                                                                                    Throwable cause39 = th56.getCause();
                                                                                                    if (cause39 == null) {
                                                                                                        throw th56;
                                                                                                    }
                                                                                                    throw cause39;
                                                                                                } catch (IOException unused9) {
                                                                                                    byte[] bArr312 = onResponseErrorNative;
                                                                                                    Class.forName($$c(s17, (byte) (bArr312[668] - 1), bArr312[c4])).getMethod($$c((short) 739, bArr312[55], bArr312[c2]), null).invoke(newInstance5, null);
                                                                                                    byte[] bArr3222 = onResponseErrorNative;
                                                                                                    invoke3 = Class.class.getMethod($$c((short) 629, bArr3222[c4], bArr3222[c5]), null).invoke(AFa1wSDK.class, null);
                                                                                                    int i10522 = onAttributionFailureNative;
                                                                                                    Class<?> cls3622 = Class.forName($$c((short) ((i10522 ^ 146) | (i10522 & 146)), (byte) (bArr3222[38] - 1), bArr3222[728]));
                                                                                                    Class<?>[] clsArr2722 = new Class[2];
                                                                                                    short s1822 = (short) 87;
                                                                                                    clsArr2722[r18] = Class.forName($$c(s1822, bArr3222[220], bArr3222[c4]));
                                                                                                    clsArr2722[1] = Class.forName($$c((short) 423, bArr3222[c2], bArr3222[c4]));
                                                                                                    Constructor<?> declaredConstructor22 = cls3622.getDeclaredConstructor(clsArr2722);
                                                                                                    ?? cls3722 = Class.forName($$c(s1822, bArr3222[220], bArr3222[c4]));
                                                                                                    String $$c1822 = $$c((short) 1041, bArr3222[27], bArr3222[59]);
                                                                                                    Class[] clsArr2822 = new Class[1];
                                                                                                    clsArr2822[r18] = cls2;
                                                                                                    newInstance = declaredConstructor22.newInstance(cls3722.getMethod($$c1822, clsArr2822).invoke(null, invoke6), invoke3);
                                                                                                    Class<?> cls3822 = Class.forName($$c((short) 270, bArr3222[990], bArr3222[728]));
                                                                                                    byte b922 = bArr3222[83];
                                                                                                    Field declaredField42 = cls3822.getDeclaredField($$c((short) 878, b922, b922));
                                                                                                    declaredField42.setAccessible(true);
                                                                                                    Object obj1622 = declaredField42.get(invoke3);
                                                                                                    Class<?> cls3922 = obj1622.getClass();
                                                                                                    Field declaredField222 = cls3922.getDeclaredField($$c((short) 1044, bArr3222[c10222], (byte) i10522));
                                                                                                    declaredField222.setAccessible(true);
                                                                                                    Field declaredField322 = cls3922.getDeclaredField($$c((short) ((i10522 ^ 706) | (i10522 & 706)), bArr3222[18], (byte) i10522));
                                                                                                    declaredField322.setAccessible(true);
                                                                                                    Object obj1722 = declaredField222.get(obj1622);
                                                                                                    Object obj1822 = declaredField322.get(obj1622);
                                                                                                    Object obj1922 = declaredField42.get(newInstance);
                                                                                                    ArrayList arrayList22 = new ArrayList((List) obj1722);
                                                                                                    Class<?> componentType22 = obj1822.getClass().getComponentType();
                                                                                                    length = Array.getLength(obj1822);
                                                                                                    Object newInstance622 = Array.newInstance(componentType22, length);
                                                                                                    i15 = r18;
                                                                                                    while (i15 < length) {
                                                                                                    }
                                                                                                    Object obj2022 = newInstance;
                                                                                                    declaredField222.set(obj1922, arrayList22);
                                                                                                    declaredField322.set(obj1922, newInstance622);
                                                                                                    if (AppsFlyer2dXConversionCallback == null) {
                                                                                                    }
                                                                                                    obj9 = obj2022;
                                                                                                    if (z9) {
                                                                                                    }
                                                                                                    if (cls3 == null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th57) {
                                                                                            Throwable cause40 = th57.getCause();
                                                                                            if (cause40 == null) {
                                                                                                throw th57;
                                                                                            }
                                                                                            throw cause40;
                                                                                        }
                                                                                    } catch (Throwable th58) {
                                                                                        Throwable cause41 = th58.getCause();
                                                                                        if (cause41 == null) {
                                                                                            throw th58;
                                                                                        }
                                                                                        throw cause41;
                                                                                    }
                                                                                } catch (Throwable th59) {
                                                                                    Throwable cause42 = th59.getCause();
                                                                                    if (cause42 == null) {
                                                                                        throw th59;
                                                                                    }
                                                                                    throw cause42;
                                                                                }
                                                                            }
                                                                            if (z9) {
                                                                                byte[] bArr34 = onResponseErrorNative;
                                                                                Class<?> cls40 = Class.forName($$c((short) 241, bArr34[c2], bArr34[c7]));
                                                                                String $$c19 = $$c((short) (onAttributionFailureNative | PointerIconCompat.TYPE_NO_DROP), bArr34[35], bArr34[c3]);
                                                                                Class<?>[] clsArr29 = new Class[2];
                                                                                clsArr29[r18] = String.class;
                                                                                clsArr29[1] = Class.forName($$c((short) 423, bArr34[c2], bArr34[c4]));
                                                                                Method declaredMethod = cls40.getDeclaredMethod($$c19, clsArr29);
                                                                                Object[] objArr26 = new Object[2];
                                                                                objArr26[r18] = str2;
                                                                                int i110 = onDeepLinkingNative + 103;
                                                                                onDeepLinking = i110 % 128;
                                                                                if (i110 % 2 == 0) {
                                                                                    try {
                                                                                        objArr26[1] = Class.class.getMethod($$c((short) 27037, bArr34[4060], bArr34[91]), null).invoke(AFa1wSDK.class, null);
                                                                                        invoke4 = declaredMethod.invoke(obj9, objArr26);
                                                                                    } catch (Throwable th60) {
                                                                                        Throwable cause43 = th60.getCause();
                                                                                        if (cause43 == null) {
                                                                                            throw th60;
                                                                                        }
                                                                                        throw cause43;
                                                                                    }
                                                                                } else {
                                                                                    objArr26[1] = Class.class.getMethod($$c((short) 629, bArr34[c4], bArr34[c5]), null).invoke(AFa1wSDK.class, null);
                                                                                    invoke4 = declaredMethod.invoke(obj9, objArr26);
                                                                                }
                                                                            } else {
                                                                                byte[] bArr35 = onResponseErrorNative;
                                                                                Class<?> cls41 = Class.forName($$c((short) 423, bArr35[c2], bArr35[c4]));
                                                                                int i111 = onAttributionFailureNative;
                                                                                try {
                                                                                    cls3 = cls41.getDeclaredMethod($$c((short) ((i111 & PointerIconCompat.TYPE_NO_DROP) | (i111 ^ PointerIconCompat.TYPE_NO_DROP)), bArr35[35], bArr35[c3]), String.class).invoke(obj9, str2);
                                                                                } catch (InvocationTargetException e4) {
                                                                                    try {
                                                                                        throw ((Exception) e4.getCause());
                                                                                    } catch (ClassNotFoundException unused10) {
                                                                                        cls3 = null;
                                                                                        if (cls3 == null) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (cls3 == null) {
                                                                                cls21 = cls3;
                                                                                byte[] bArr36 = onResponseErrorNative;
                                                                                str3 = $$c((short) 885, bArr36[1], bArr36[c2]);
                                                                                Constructor declaredConstructor3 = cls21.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                declaredConstructor3.setAccessible(true);
                                                                                init = declaredConstructor3.newInstance(obj9, Boolean.valueOf(!z9));
                                                                                bArr19 = new byte[13512];
                                                                                try {
                                                                                    Object[] objArr27 = {AFa1wSDK.class.getResourceAsStream($$c((short) 490, bArr36[259], bArr36[166]))};
                                                                                    short s19 = (short) 515;
                                                                                    Class<?> cls42 = Class.forName($$c(s19, bArr36[i7], bArr36[c4]));
                                                                                    int i112 = onAttributionFailureNative;
                                                                                    Object newInstance7 = cls42.getDeclaredConstructor(Class.forName($$c((short) ((i112 & 1058) | (i112 ^ 1058)), bArr36[220], bArr36[c4]))).newInstance(objArr27);
                                                                                    try {
                                                                                        Class.forName($$c(s19, bArr36[i7], bArr36[c4])).getMethod($$c((short) 190, bArr36[35], bArr36[2]), cls2).invoke(newInstance7, bArr19);
                                                                                        try {
                                                                                            Class.forName($$c(s19, bArr36[i7], bArr36[c4])).getMethod($$c((short) 739, bArr36[55], bArr36[c2]), null).invoke(newInstance7, null);
                                                                                            i64 = Math.abs(i13);
                                                                                            i65 = 13472;
                                                                                            bArr21 = bArr2;
                                                                                            obj4 = obj8;
                                                                                            i = 4;
                                                                                            r18 = 0;
                                                                                            i2 = 3;
                                                                                        } catch (Throwable th61) {
                                                                                            Throwable cause44 = th61.getCause();
                                                                                            if (cause44 == null) {
                                                                                                throw th61;
                                                                                            }
                                                                                            throw cause44;
                                                                                        }
                                                                                    } catch (Throwable th62) {
                                                                                        Throwable cause45 = th62.getCause();
                                                                                        if (cause45 == null) {
                                                                                            throw th62;
                                                                                        }
                                                                                        throw cause45;
                                                                                    }
                                                                                } catch (Throwable th63) {
                                                                                    Throwable cause46 = th63.getCause();
                                                                                    if (cause46 == null) {
                                                                                        throw th63;
                                                                                    }
                                                                                    throw cause46;
                                                                                }
                                                                            } else {
                                                                                Constructor declaredConstructor4 = cls21.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                declaredConstructor4.setAccessible(true);
                                                                                if (!z9) {
                                                                                    int i113 = onDeepLinkingNative;
                                                                                    int i114 = ((i113 | 123) << 1) - (i113 ^ 123);
                                                                                    onDeepLinking = i114 % 128;
                                                                                    if (i114 % 2 != 0) {
                                                                                        z4 = true;
                                                                                        init = declaredConstructor4.newInstance(obj9, Boolean.valueOf(z4));
                                                                                        i6 = 2;
                                                                                        r82 = 1;
                                                                                        z3 = false;
                                                                                        i5 = 1;
                                                                                        obj3 = null;
                                                                                    }
                                                                                }
                                                                                z4 = false;
                                                                                init = declaredConstructor4.newInstance(obj9, Boolean.valueOf(z4));
                                                                                i6 = 2;
                                                                                r82 = 1;
                                                                                z3 = false;
                                                                                i5 = 1;
                                                                                obj3 = null;
                                                                            }
                                                                        } catch (Throwable th64) {
                                                                            Throwable cause47 = th64.getCause();
                                                                            if (cause47 == null) {
                                                                                throw th64;
                                                                            }
                                                                            throw cause47;
                                                                        }
                                                                    } catch (Throwable th65) {
                                                                        Throwable cause48 = th65.getCause();
                                                                        if (cause48 == null) {
                                                                            throw th65;
                                                                        }
                                                                        throw cause48;
                                                                    }
                                                                }
                                                            } catch (Throwable th66) {
                                                                boolean z11 = r8 == true ? 1 : 0;
                                                                Throwable cause49 = th66.getCause();
                                                                if (cause49 == null) {
                                                                    throw th66;
                                                                }
                                                                throw cause49;
                                                            }
                                                        } catch (Throwable th67) {
                                                            boolean z12 = r8 == true ? 1 : 0;
                                                            Throwable cause50 = th67.getCause();
                                                            if (cause50 == null) {
                                                                throw th67;
                                                            }
                                                            throw cause50;
                                                        }
                                                    } catch (Throwable th68) {
                                                        boolean z13 = r8 == true ? 1 : 0;
                                                        Throwable cause51 = th68.getCause();
                                                        if (cause51 == null) {
                                                            throw th68;
                                                        }
                                                        throw cause51;
                                                    }
                                                } catch (Throwable th69) {
                                                    th = th69;
                                                    cls2 = cls4;
                                                    zArr4 = zArr;
                                                    zArr5 = zArr2;
                                                    str = $$c;
                                                    zArr6 = zArr3;
                                                    bArr2 = r8 == true ? 1 : 0;
                                                    c5 = c9;
                                                    i7 = i20;
                                                    i8 = i3;
                                                    c6 = 'A';
                                                }
                                            }
                                            r82 = bArr2;
                                            i4 = (i4 & 1) + (i4 | 1);
                                            i21 = i6;
                                            i3 = i8;
                                            c9 = c5;
                                            i20 = i7;
                                            i19 = i5;
                                            r7 = obj3;
                                            cls4 = cls2;
                                            zArr = zArr4;
                                            zArr2 = zArr5;
                                            $$c = str;
                                            zArr3 = zArr6;
                                            i = 4;
                                            i2 = 3;
                                            r8 = r82;
                                            z2 = z3;
                                        }
                                        return;
                                    } catch (Throwable th70) {
                                        Throwable cause52 = th70.getCause();
                                        if (cause52 == null) {
                                            throw th70;
                                        }
                                        throw cause52;
                                    }
                                }
                                int i115 = onDeepLinking;
                                int i116 = ((i115 | 35) << 1) - (i115 ^ 35);
                                onDeepLinkingNative = i116 % 128;
                                int i117 = i116 % 2;
                                invoke = null;
                            }
                            c3 = '9';
                            c4 = Typography.cent;
                            if (invoke2 != null) {
                            }
                            if (obj2 == null) {
                                short s52 = (short) 261;
                                int i332 = onAttributionFailureNative;
                                byte[] bArr92 = onResponseErrorNative;
                                String $$c72 = $$c(s52, (byte) i332, bArr92[c2]);
                                int i342 = 2 % 2;
                                int i352 = onDeepLinking + 71;
                                onDeepLinkingNative = i352 % 128;
                                int i362 = i352 % 2;
                                Object[] objArr52 = new Object[2];
                                objArr52[1] = $$c72;
                                objArr52[z ? 1 : 0] = invoke;
                                Class<?> cls112 = Class.forName($$c((short) ((i332 ^ 928) | (i332 & 928)), bArr92[c3], bArr92[c4]));
                                Class<?>[] clsArr42 = new Class[2];
                                clsArr42[z ? 1 : 0] = Class.forName($$c((short) ((i332 & 928) | (i332 ^ 928)), bArr92[c3], bArr92[c4]));
                                clsArr42[1] = String.class;
                                obj2 = cls112.getDeclaredConstructor(clsArr42).newInstance(objArr52);
                            }
                            int i232222 = 2 % 2;
                            int i242222 = onAttributionFailureNative;
                            byte[] bArr82222 = onResponseErrorNative;
                            Object invoke52222 = Class.forName($$c((short) ((i242222 ^ 580) | (i242222 & 580)), bArr82222[58], bArr82222[9])).getMethod($$c((short) 464, bArr82222[604], bArr82222[29]), null).invoke(null, null);
                            Object[] objArr2222 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i242222 ^ 928) | (i242222 & 928)), bArr82222[c3], bArr82222[c4])), 9);
                            objArr2222[z ? 1 : 0] = null;
                            objArr2222[1] = obj2;
                            objArr2222[2] = invoke;
                            objArr2222[i2] = invoke2;
                            objArr2222[i] = invoke52222;
                            i3 = 5;
                            objArr2222[5] = obj2;
                            objArr2222[6] = invoke;
                            objArr2222[7] = invoke2;
                            objArr2222[8] = invoke52222;
                            zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                            zArr3 = new boolean[9];
                            zArr3[z ? 1 : 0] = z;
                            zArr3[1] = z;
                            zArr3[2] = true;
                            zArr3[i2] = true;
                            zArr3[i] = z;
                            zArr3[5] = z;
                            zArr3[6] = true;
                            zArr3[7] = true;
                            zArr3[8] = z;
                            char c102222 = 24;
                            Class<?> cls72222 = Class.forName($$c((short) (i242222 | 96), bArr82222[24], bArr82222[9]));
                            i17 = cls72222.getDeclaredField($$c((short) 677, bArr82222[6], bArr82222[38])).getInt(cls72222);
                            if (i17 != 29) {
                                int i372 = onDeepLinkingNative;
                                int i382 = (i372 ^ 83) + ((i372 & 83) << 1);
                                int i392 = i382 % 128;
                                onDeepLinking = i392;
                                int i402 = i382 % 2;
                                int i412 = ((i392 | 69) << 1) - (i392 ^ 69);
                                onDeepLinkingNative = i412 % 128;
                                int i422 = i412 % 2;
                                z5 = true;
                                zArr3[z ? 1 : 0] = z5;
                                if (i17 < 21) {
                                }
                                zArr3[1] = z6;
                                zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                                zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                                if (i17 >= 16) {
                                }
                                zArr3[8] = z7;
                                int i252222 = onDeepLinkingNative;
                                int i262222 = ((i252222 | 89) << 1) - (i252222 ^ 89);
                                onDeepLinking = i262222 % 128;
                                int i272222 = i262222 % 2;
                                boolean z82222 = z ? 1 : 0;
                                i4 = z82222 ? 1 : 0;
                                r8 = z82222;
                                z2 = z;
                                while (r8 == 0) {
                                    if (zArr3[i4]) {
                                    }
                                    r82 = bArr2;
                                    i4 = (i4 & 1) + (i4 | 1);
                                    i21 = i6;
                                    i3 = i8;
                                    c9 = c5;
                                    i20 = i7;
                                    i19 = i5;
                                    r7 = obj3;
                                    cls4 = cls2;
                                    zArr = zArr4;
                                    zArr2 = zArr5;
                                    $$c = str;
                                    zArr3 = zArr6;
                                    i = 4;
                                    i2 = 3;
                                    r8 = r82;
                                    z2 = z3;
                                }
                            }
                            z5 = z ? 1 : 0;
                            zArr3[z ? 1 : 0] = z5;
                            if (i17 < 21) {
                            }
                            zArr3[1] = z6;
                            zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                            zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                            if (i17 >= 16) {
                            }
                            zArr3[8] = z7;
                            int i2522222 = onDeepLinkingNative;
                            int i2622222 = ((i2522222 | 89) << 1) - (i2522222 ^ 89);
                            onDeepLinking = i2622222 % 128;
                            int i2722222 = i2622222 % 2;
                            boolean z822222 = z ? 1 : 0;
                            i4 = z822222 ? 1 : 0;
                            r8 = z822222;
                            z2 = z;
                            while (r8 == 0) {
                            }
                        }
                        z = false;
                        invoke2 = null;
                        if (invoke == null) {
                        }
                        c3 = '9';
                        c4 = Typography.cent;
                        if (invoke2 != null) {
                        }
                        if (obj2 == null) {
                        }
                        int i2322222 = 2 % 2;
                        int i2422222 = onAttributionFailureNative;
                        byte[] bArr822222 = onResponseErrorNative;
                        Object invoke522222 = Class.forName($$c((short) ((i2422222 ^ 580) | (i2422222 & 580)), bArr822222[58], bArr822222[9])).getMethod($$c((short) 464, bArr822222[604], bArr822222[29]), null).invoke(null, null);
                        Object[] objArr22222 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i2422222 ^ 928) | (i2422222 & 928)), bArr822222[c3], bArr822222[c4])), 9);
                        objArr22222[z ? 1 : 0] = null;
                        objArr22222[1] = obj2;
                        objArr22222[2] = invoke;
                        objArr22222[i2] = invoke2;
                        objArr22222[i] = invoke522222;
                        i3 = 5;
                        objArr22222[5] = obj2;
                        objArr22222[6] = invoke;
                        objArr22222[7] = invoke2;
                        objArr22222[8] = invoke522222;
                        zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                        zArr3 = new boolean[9];
                        zArr3[z ? 1 : 0] = z;
                        zArr3[1] = z;
                        zArr3[2] = true;
                        zArr3[i2] = true;
                        zArr3[i] = z;
                        zArr3[5] = z;
                        zArr3[6] = true;
                        zArr3[7] = true;
                        zArr3[8] = z;
                        char c1022222 = 24;
                        Class<?> cls722222 = Class.forName($$c((short) (i2422222 | 96), bArr822222[24], bArr822222[9]));
                        i17 = cls722222.getDeclaredField($$c((short) 677, bArr822222[6], bArr822222[38])).getInt(cls722222);
                        if (i17 != 29) {
                        }
                        z5 = z ? 1 : 0;
                        zArr3[z ? 1 : 0] = z5;
                        if (i17 < 21) {
                        }
                        zArr3[1] = z6;
                        zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                        zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                        if (i17 >= 16) {
                        }
                        zArr3[8] = z7;
                        int i25222222 = onDeepLinkingNative;
                        int i26222222 = ((i25222222 | 89) << 1) - (i25222222 ^ 89);
                        onDeepLinking = i26222222 % 128;
                        int i27222222 = i26222222 % 2;
                        boolean z8222222 = z ? 1 : 0;
                        i4 = z8222222 ? 1 : 0;
                        r8 = z8222222;
                        z2 = z;
                        while (r8 == 0) {
                        }
                    }
                    int i212 = 2;
                    if (obj == null) {
                    }
                    int i282 = 2 % 2;
                    c2 = c8;
                    if (obj != null) {
                    }
                    z = false;
                    invoke2 = null;
                    if (invoke == null) {
                    }
                    c3 = '9';
                    c4 = Typography.cent;
                    if (invoke2 != null) {
                    }
                    if (obj2 == null) {
                    }
                    int i23222222 = 2 % 2;
                    int i24222222 = onAttributionFailureNative;
                    byte[] bArr8222222 = onResponseErrorNative;
                    Object invoke5222222 = Class.forName($$c((short) ((i24222222 ^ 580) | (i24222222 & 580)), bArr8222222[58], bArr8222222[9])).getMethod($$c((short) 464, bArr8222222[604], bArr8222222[29]), null).invoke(null, null);
                    Object[] objArr222222 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i24222222 ^ 928) | (i24222222 & 928)), bArr8222222[c3], bArr8222222[c4])), 9);
                    objArr222222[z ? 1 : 0] = null;
                    objArr222222[1] = obj2;
                    objArr222222[2] = invoke;
                    objArr222222[i2] = invoke2;
                    objArr222222[i] = invoke5222222;
                    i3 = 5;
                    objArr222222[5] = obj2;
                    objArr222222[6] = invoke;
                    objArr222222[7] = invoke2;
                    objArr222222[8] = invoke5222222;
                    zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                    zArr3 = new boolean[9];
                    zArr3[z ? 1 : 0] = z;
                    zArr3[1] = z;
                    zArr3[2] = true;
                    zArr3[i2] = true;
                    zArr3[i] = z;
                    zArr3[5] = z;
                    zArr3[6] = true;
                    zArr3[7] = true;
                    zArr3[8] = z;
                    char c10222222 = 24;
                    Class<?> cls7222222 = Class.forName($$c((short) (i24222222 | 96), bArr8222222[24], bArr8222222[9]));
                    i17 = cls7222222.getDeclaredField($$c((short) 677, bArr8222222[6], bArr8222222[38])).getInt(cls7222222);
                    if (i17 != 29) {
                    }
                    z5 = z ? 1 : 0;
                    zArr3[z ? 1 : 0] = z5;
                    if (i17 < 21) {
                    }
                    zArr3[1] = z6;
                    zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                    zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                    if (i17 >= 16) {
                    }
                    zArr3[8] = z7;
                    int i252222222 = onDeepLinkingNative;
                    int i262222222 = ((i252222222 | 89) << 1) - (i252222222 ^ 89);
                    onDeepLinking = i262222222 % 128;
                    int i272222222 = i262222222 % 2;
                    boolean z82222222 = z ? 1 : 0;
                    i4 = z82222222 ? 1 : 0;
                    r8 = z82222222;
                    z2 = z;
                    while (r8 == 0) {
                    }
                }
                int i242222222 = onAttributionFailureNative;
                byte[] bArr82222222 = onResponseErrorNative;
                Object invoke52222222 = Class.forName($$c((short) ((i242222222 ^ 580) | (i242222222 & 580)), bArr82222222[58], bArr82222222[9])).getMethod($$c((short) 464, bArr82222222[604], bArr82222222[29]), null).invoke(null, null);
                Object[] objArr2222222 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i242222222 ^ 928) | (i242222222 & 928)), bArr82222222[c3], bArr82222222[c4])), 9);
                objArr2222222[z ? 1 : 0] = null;
                objArr2222222[1] = obj2;
                objArr2222222[2] = invoke;
                objArr2222222[i2] = invoke2;
                objArr2222222[i] = invoke52222222;
                i3 = 5;
                objArr2222222[5] = obj2;
                objArr2222222[6] = invoke;
                objArr2222222[7] = invoke2;
                objArr2222222[8] = invoke52222222;
                zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
                zArr3 = new boolean[9];
                zArr3[z ? 1 : 0] = z;
                zArr3[1] = z;
                zArr3[2] = true;
                zArr3[i2] = true;
                zArr3[i] = z;
                zArr3[5] = z;
                zArr3[6] = true;
                zArr3[7] = true;
                zArr3[8] = z;
                char c102222222 = 24;
                Class<?> cls72222222 = Class.forName($$c((short) (i242222222 | 96), bArr82222222[24], bArr82222222[9]));
                i17 = cls72222222.getDeclaredField($$c((short) 677, bArr82222222[6], bArr82222222[38])).getInt(cls72222222);
                if (i17 != 29) {
                }
                z5 = z ? 1 : 0;
                zArr3[z ? 1 : 0] = z5;
                if (i17 < 21) {
                }
                zArr3[1] = z6;
                zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
                zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
                if (i17 >= 16) {
                }
                zArr3[8] = z7;
                int i2522222222 = onDeepLinkingNative;
                int i2622222222 = ((i2522222222 | 89) << 1) - (i2522222222 ^ 89);
                onDeepLinking = i2622222222 % 128;
                int i2722222222 = i2622222222 % 2;
                boolean z822222222 = z ? 1 : 0;
                i4 = z822222222 ? 1 : 0;
                r8 = z822222222;
                z2 = z;
                while (r8 == 0) {
                }
            } catch (Throwable th71) {
                Throwable cause53 = th71.getCause();
                if (cause53 == null) {
                    throw th71;
                }
                throw cause53;
            }
            invoke = null;
            int i2122 = 2;
            if (obj == null) {
            }
            int i2822 = 2 % 2;
            c2 = c8;
            if (obj != null) {
            }
            z = false;
            invoke2 = null;
            if (invoke == null) {
            }
            c3 = '9';
            c4 = Typography.cent;
            if (invoke2 != null) {
            }
            if (obj2 == null) {
            }
            int i232222222 = 2 % 2;
            if (obj != null) {
            }
            invoke = null;
            int i21222 = 2;
            if (obj == null) {
            }
            int i28222 = 2 % 2;
            c2 = c8;
            if (obj != null) {
            }
            z = false;
            invoke2 = null;
            if (invoke == null) {
            }
            c3 = '9';
            c4 = Typography.cent;
            if (invoke2 != null) {
            }
            if (obj2 == null) {
            }
            int i2322222222 = 2 % 2;
            int i2422222222 = onAttributionFailureNative;
            byte[] bArr822222222 = onResponseErrorNative;
            Object invoke522222222 = Class.forName($$c((short) ((i2422222222 ^ 580) | (i2422222222 & 580)), bArr822222222[58], bArr822222222[9])).getMethod($$c((short) 464, bArr822222222[604], bArr822222222[29]), null).invoke(null, null);
            Object[] objArr22222222 = (Object[]) Array.newInstance(Class.forName($$c((short) ((i2422222222 ^ 928) | (i2422222222 & 928)), bArr822222222[c3], bArr822222222[c4])), 9);
            objArr22222222[z ? 1 : 0] = null;
            objArr22222222[1] = obj2;
            objArr22222222[2] = invoke;
            objArr22222222[i2] = invoke2;
            objArr22222222[i] = invoke522222222;
            i3 = 5;
            objArr22222222[5] = obj2;
            objArr22222222[6] = invoke;
            objArr22222222[7] = invoke2;
            objArr22222222[8] = invoke522222222;
            zArr = new boolean[]{false, true, true, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, false, true, true, true, true};
            zArr3 = new boolean[9];
            zArr3[z ? 1 : 0] = z;
            zArr3[1] = z;
            zArr3[2] = true;
            zArr3[i2] = true;
            zArr3[i] = z;
            zArr3[5] = z;
            zArr3[6] = true;
            zArr3[7] = true;
            zArr3[8] = z;
            char c1022222222 = 24;
            Class<?> cls722222222 = Class.forName($$c((short) (i2422222222 | 96), bArr822222222[24], bArr822222222[9]));
            i17 = cls722222222.getDeclaredField($$c((short) 677, bArr822222222[6], bArr822222222[38])).getInt(cls722222222);
            if (i17 != 29) {
            }
            z5 = z ? 1 : 0;
            zArr3[z ? 1 : 0] = z5;
            if (i17 < 21) {
            }
            zArr3[1] = z6;
            zArr3[5] = i17 < 21 ? true : z ? 1 : 0;
            zArr3[i] = i17 >= 16 ? true : z ? 1 : 0;
            if (i17 >= 16) {
            }
            zArr3[8] = z7;
            int i25222222222 = onDeepLinkingNative;
            int i26222222222 = ((i25222222222 | 89) << 1) - (i25222222222 ^ 89);
            onDeepLinking = i26222222222 % 128;
            int i27222222222 = i26222222222 % 2;
            boolean z8222222222 = z ? 1 : 0;
            i4 = z8222222222 ? 1 : 0;
            r8 = z8222222222;
            z2 = z;
            while (r8 == 0) {
            }
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
