package com.appsflyer.internal;

import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.window.core.layout.WindowSizeClass;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class AFa1uSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFLogger$LogLevel;
    private static Object AFVersionDeclaration;
    private static int AppsFlyer2dXConversionCallback;
    private static Object afErrorLogForExcManagerOnly;
    private static byte[] afLogForce;
    public static final Map<Integer, Object> afVerboseLog;
    private static final Map<String, Object> getLevel;
    private static byte[] init;
    private static int onAppOpenAttributionNative;
    private static long onInstallConversionDataLoadedNative;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r10 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        byte[] bArr2;
        int i5;
        int i6 = 2 % 2;
        int i7 = $11;
        int i8 = ((i7 | 73) << 1) - (i7 ^ 73);
        int i9 = i8 % 128;
        $10 = i9;
        if (i8 % 2 != 0) {
            int i10 = 59 >>> s;
            i4 = ((i & 114) + (i | 114)) - 27;
            int i11 = (b ^ (-9)) + ((b & (-9)) << 1);
            i2 = ((i11 | 19) << 1) - (i11 ^ 19);
            bArr2 = $$a;
            bArr = new byte[i10];
            i3 = (i10 & 21) + (i10 | 21);
            i5 = 1;
        } else {
            int i12 = -s;
            int i13 = (i12 & 36) + (i12 | 36);
            int i14 = ((i | (-36)) << 1) - (i ^ (-36));
            int i15 = (i14 & 40) + (i14 | 40);
            i2 = b + 41;
            byte[] bArr3 = $$a;
            bArr = new byte[i13];
            int i16 = (i13 ^ (-87)) + ((i13 & (-87)) << 1);
            i3 = ((i16 | 86) << 1) - (i16 ^ 86);
            i4 = i15;
            bArr2 = bArr3;
            if (bArr3 == null) {
                i5 = 0;
                int i17 = ((i9 | ModuleDescriptor.MODULE_VERSION) << 1) - (i9 ^ ModuleDescriptor.MODULE_VERSION);
                int i18 = i17 % 128;
                $11 = i18;
                int i19 = i17 % 2;
                int i20 = (i18 & 21) + (i18 | 21);
                $10 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = i3;
                int i23 = -(-(-i2));
                i2 = ((i3 | i23) << 1) - (i23 ^ i3);
                int i24 = $10;
                int i25 = (i24 ^ 85) + ((i24 & 85) << 1);
                $11 = i25 % 128;
                int i26 = i25 % 2;
                i3 = i22;
            } else {
                i5 = 0;
            }
        }
        while (true) {
            bArr[i5] = (byte) i2;
            if (i5 == i3) {
                String str = new String(bArr, 0);
                int i27 = $11 + 43;
                $10 = i27 % 128;
                int i28 = i27 % 2;
                return str;
            }
            i5 = ((i5 & 1) << 1) + (i5 ^ 1);
            int i29 = (i4 ^ 28) + ((i4 & 28) << 1);
            i4 = ((i29 | (-27)) << 1) - (i29 ^ (-27));
            int i30 = i3;
            int i31 = i2;
            int i32 = -(-(-bArr2[i4]));
            i2 = ((i31 | i32) << 1) - (i32 ^ i31);
            int i33 = $10;
            int i34 = (i33 ^ 85) + ((i33 & 85) << 1);
            $11 = i34 % 128;
            int i35 = i34 % 2;
            i3 = i30;
        }
    }

    public static int AFInAppEventParameterName(int i) {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 ^ 39) + ((i3 & 39) << 1);
        int i5 = i4 % 128;
        $11 = i5;
        int i6 = i4 % 2;
        Object obj = afErrorLogForExcManagerOnly;
        int i7 = ((i5 | 25) << 1) - (i5 ^ 25);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i5 + 15;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c((byte) (-$$a[311]), (short) 566, r1[46]), true, (ClassLoader) AFVersionDeclaration).getMethod($$c(r1[362], (short) 278, r1[308]), Integer.TYPE).invoke(obj, Integer.valueOf(i))).intValue();
            int i11 = $10 + 29;
            $11 = i11 % 128;
            int i12 = i11 % 2;
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
        int i2 = $11;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        int i5 = ((i4 | 91) << 1) - (i4 ^ 91);
        $11 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 85;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        try {
            return ((Integer) Class.forName($$c((byte) (-$$a[311]), (short) 566, r0[46]), true, (ClassLoader) AFVersionDeclaration).getMethod($$c(r0[362], (short) 359, r0[35]), Object.class).invoke(obj2, obj)).intValue();
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
        int i2 = $11;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        $10 = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[972];
        System.arraycopy("s<Ås\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷û\nÿí)é\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ú\u000b\u000bûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0·'\u000fù'\u0000\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u000eñ\"í\u0004ý\u0015á\u0002óÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßí\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\u0002ñ1âñý&Þ\u000bÿô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûå0·'\u000fù'\u0000\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001ó\nò\u0003\u0006\u00056º\u000fí\u0004FÚïí\u0004\u001fá\u000býù\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûå0¼\"\u000fù'\u00ad\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 972);
        $$a = bArr;
        $$b = 197;
        int i5 = $10;
        int i6 = (i5 & 33) + (i5 | 33);
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static Object valueOf(char c, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = $11 + 63;
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = afErrorLogForExcManagerOnly;
        int i6 = i5 + 5;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            return Class.forName($$c((byte) (-$$a[311]), (short) 566, r8[46]), true, (ClassLoader) AFVersionDeclaration).getMethod($$c(r8[362], (short) 278, r8[308]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj2, Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFa1uSDK() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:893|10|(38:876|877|878|879|880|(0)|15|16|17|(0)(0)|863|860|(0)|29|(0)|(0)|61|62|63|64|65|66|67|68|(0)(0)|71|(0)|838|76|77|(0)(0)|80|(0)(0)|83|84|(0)|832|833)|12|13|(0)|15|16|17|(0)(0)|863|860|(0)|29|(0)|(0)|61|62|63|64|65|66|67|68|(0)(0)|71|(0)|838|76|77|(0)(0)|80|(0)(0)|83|84|(0)|832|833) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x039c, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r32[r22], r10, r32[r21])).getMethod($$c((byte) (-com.appsflyer.internal.AFa1uSDK.$$a[r17]), (short) 736, r32[790(0x316, float:1.107E-42)]), r6).invoke(r0, r6)).booleanValue() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x171b A[Catch: Exception -> 0x17d2, TRY_ENTER, TryCatch #89 {Exception -> 0x17d2, blocks: (B:3:0x002b, B:5:0x0044, B:31:0x01c5, B:38:0x17b8, B:40:0x17be, B:42:0x17bf, B:45:0x17c1, B:47:0x17c7, B:48:0x17c8, B:52:0x023c, B:57:0x028b, B:59:0x0291, B:60:0x0292, B:61:0x0293, B:64:0x02e1, B:67:0x02ec, B:77:0x0334, B:80:0x033e, B:83:0x0348, B:88:0x0358, B:117:0x171b, B:121:0x171f, B:124:0x179c, B:119:0x172c, B:126:0x1731, B:133:0x177a, B:135:0x1780, B:136:0x1781, B:847:0x016b, B:854:0x17ca, B:856:0x17d0, B:857:0x17d1, B:35:0x0208, B:33:0x01d6, B:850:0x019d, B:129:0x1741, B:130:0x1778, B:54:0x0254), top: B:2:0x002b, inners: #13, #17, #23, #70, #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x13ec A[Catch: all -> 0x16f7, TRY_LEAVE, TryCatch #66 {all -> 0x16f7, blocks: (B:302:0x135a, B:305:0x13ba, B:307:0x13c4, B:257:0x1439, B:264:0x1527, B:267:0x1543, B:269:0x1549, B:270:0x154a, B:273:0x154c, B:275:0x1552, B:276:0x1553, B:279:0x1555, B:281:0x155b, B:282:0x155c, B:284:0x155d, B:287:0x1587, B:311:0x13e4, B:313:0x13ea, B:314:0x13eb, B:253:0x13ec, B:255:0x1422, B:293:0x142f, B:294:0x1435, B:509:0x15a1, B:517:0x1617, B:519:0x161d, B:520:0x161e, B:523:0x1620, B:525:0x1628, B:526:0x1629, B:529:0x162b, B:531:0x1633, B:532:0x1634, B:550:0x1636, B:552:0x163e, B:553:0x163f, B:561:0x1645, B:563:0x164b, B:564:0x164c, B:570:0x164e, B:572:0x1656, B:573:0x1657, B:577:0x165d, B:579:0x1663, B:580:0x1664, B:586:0x1669, B:588:0x1673, B:589:0x1674, B:626:0x168e, B:628:0x1694, B:629:0x1695, B:643:0x169b, B:645:0x16a9, B:646:0x16aa, B:652:0x16ac, B:654:0x16bc, B:655:0x16bd, B:658:0x16bf, B:660:0x16cf, B:661:0x16d0, B:664:0x16d2, B:666:0x16e2, B:667:0x16e3, B:670:0x16e5, B:672:0x16f5, B:673:0x16f6, B:490:0x11f7, B:157:0x0870, B:482:0x115d, B:151:0x0825, B:263:0x14fb, B:261:0x14c3, B:440:0x104d, B:149:0x07ef, B:259:0x1491, B:304:0x13a0, B:147:0x07b7, B:173:0x0ae7, B:498:0x129a, B:500:0x1325, B:502:0x1330, B:512:0x15de, B:513:0x1615, B:494:0x125b), top: B:301:0x135a, inners: #4, #5, #10, #15, #19, #26, #29, #36, #38, #51, #52, #56, #59, #94, #96 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x1439 A[Catch: all -> 0x16f7, TRY_ENTER, TRY_LEAVE, TryCatch #66 {all -> 0x16f7, blocks: (B:302:0x135a, B:305:0x13ba, B:307:0x13c4, B:257:0x1439, B:264:0x1527, B:267:0x1543, B:269:0x1549, B:270:0x154a, B:273:0x154c, B:275:0x1552, B:276:0x1553, B:279:0x1555, B:281:0x155b, B:282:0x155c, B:284:0x155d, B:287:0x1587, B:311:0x13e4, B:313:0x13ea, B:314:0x13eb, B:253:0x13ec, B:255:0x1422, B:293:0x142f, B:294:0x1435, B:509:0x15a1, B:517:0x1617, B:519:0x161d, B:520:0x161e, B:523:0x1620, B:525:0x1628, B:526:0x1629, B:529:0x162b, B:531:0x1633, B:532:0x1634, B:550:0x1636, B:552:0x163e, B:553:0x163f, B:561:0x1645, B:563:0x164b, B:564:0x164c, B:570:0x164e, B:572:0x1656, B:573:0x1657, B:577:0x165d, B:579:0x1663, B:580:0x1664, B:586:0x1669, B:588:0x1673, B:589:0x1674, B:626:0x168e, B:628:0x1694, B:629:0x1695, B:643:0x169b, B:645:0x16a9, B:646:0x16aa, B:652:0x16ac, B:654:0x16bc, B:655:0x16bd, B:658:0x16bf, B:660:0x16cf, B:661:0x16d0, B:664:0x16d2, B:666:0x16e2, B:667:0x16e3, B:670:0x16e5, B:672:0x16f5, B:673:0x16f6, B:490:0x11f7, B:157:0x0870, B:482:0x115d, B:151:0x0825, B:263:0x14fb, B:261:0x14c3, B:440:0x104d, B:149:0x07ef, B:259:0x1491, B:304:0x13a0, B:147:0x07b7, B:173:0x0ae7, B:498:0x129a, B:500:0x1325, B:502:0x1330, B:512:0x15de, B:513:0x1615, B:494:0x125b), top: B:301:0x135a, inners: #4, #5, #10, #15, #19, #26, #29, #36, #38, #51, #52, #56, #59, #94, #96 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x155d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x134a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c5 A[Catch: Exception -> 0x17d2, TRY_ENTER, TRY_LEAVE, TryCatch #89 {Exception -> 0x17d2, blocks: (B:3:0x002b, B:5:0x0044, B:31:0x01c5, B:38:0x17b8, B:40:0x17be, B:42:0x17bf, B:45:0x17c1, B:47:0x17c7, B:48:0x17c8, B:52:0x023c, B:57:0x028b, B:59:0x0291, B:60:0x0292, B:61:0x0293, B:64:0x02e1, B:67:0x02ec, B:77:0x0334, B:80:0x033e, B:83:0x0348, B:88:0x0358, B:117:0x171b, B:121:0x171f, B:124:0x179c, B:119:0x172c, B:126:0x1731, B:133:0x177a, B:135:0x1780, B:136:0x1781, B:847:0x016b, B:854:0x17ca, B:856:0x17d0, B:857:0x17d1, B:35:0x0208, B:33:0x01d6, B:850:0x019d, B:129:0x1741, B:130:0x1778, B:54:0x0254), top: B:2:0x002b, inners: #13, #17, #23, #70, #87 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1325 A[Catch: Exception -> 0x15a0, all -> 0x1665, LOOP:5: B:499:0x1323->B:500:0x1325, LOOP_END, TryCatch #53 {all -> 0x1665, blocks: (B:238:0x0e84, B:244:0x0eb3, B:247:0x0eb7, B:249:0x0ebd, B:250:0x0ebe, B:299:0x134a, B:317:0x0ec4, B:319:0x0eca, B:320:0x0ecb, B:323:0x0ecd, B:325:0x0ed3, B:326:0x0ed4, B:377:0x0fec, B:385:0x0ff7, B:387:0x0ffd, B:388:0x0ffe, B:379:0x0fee, B:381:0x0ff4, B:382:0x0ff5, B:429:0x1002, B:430:0x1009, B:431:0x100a, B:442:0x106e, B:472:0x1150, B:474:0x1156, B:475:0x1157, B:492:0x1215, B:495:0x1290, B:498:0x129a, B:500:0x1325, B:502:0x1330, B:503:0x1336, B:505:0x133a, B:536:0x11ed, B:538:0x11f3, B:539:0x11f4, B:543:0x11b5, B:545:0x11bb, B:546:0x11bc, B:243:0x0e99, B:237:0x0e59, B:234:0x0e1f, B:374:0x0fc1, B:372:0x0f91), top: B:298:0x134a, inners: #11, #20, #28, #58, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x133a A[Catch: all -> 0x1665, TRY_LEAVE, TryCatch #53 {all -> 0x1665, blocks: (B:238:0x0e84, B:244:0x0eb3, B:247:0x0eb7, B:249:0x0ebd, B:250:0x0ebe, B:299:0x134a, B:317:0x0ec4, B:319:0x0eca, B:320:0x0ecb, B:323:0x0ecd, B:325:0x0ed3, B:326:0x0ed4, B:377:0x0fec, B:385:0x0ff7, B:387:0x0ffd, B:388:0x0ffe, B:379:0x0fee, B:381:0x0ff4, B:382:0x0ff5, B:429:0x1002, B:430:0x1009, B:431:0x100a, B:442:0x106e, B:472:0x1150, B:474:0x1156, B:475:0x1157, B:492:0x1215, B:495:0x1290, B:498:0x129a, B:500:0x1325, B:502:0x1330, B:503:0x1336, B:505:0x133a, B:536:0x11ed, B:538:0x11f3, B:539:0x11f4, B:543:0x11b5, B:545:0x11bb, B:546:0x11bc, B:243:0x0e99, B:237:0x0e59, B:234:0x0e1f, B:374:0x0fc1, B:372:0x0f91), top: B:298:0x134a, inners: #11, #20, #28, #58, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x1694 A[Catch: all -> 0x16f7, TryCatch #66 {all -> 0x16f7, blocks: (B:302:0x135a, B:305:0x13ba, B:307:0x13c4, B:257:0x1439, B:264:0x1527, B:267:0x1543, B:269:0x1549, B:270:0x154a, B:273:0x154c, B:275:0x1552, B:276:0x1553, B:279:0x1555, B:281:0x155b, B:282:0x155c, B:284:0x155d, B:287:0x1587, B:311:0x13e4, B:313:0x13ea, B:314:0x13eb, B:253:0x13ec, B:255:0x1422, B:293:0x142f, B:294:0x1435, B:509:0x15a1, B:517:0x1617, B:519:0x161d, B:520:0x161e, B:523:0x1620, B:525:0x1628, B:526:0x1629, B:529:0x162b, B:531:0x1633, B:532:0x1634, B:550:0x1636, B:552:0x163e, B:553:0x163f, B:561:0x1645, B:563:0x164b, B:564:0x164c, B:570:0x164e, B:572:0x1656, B:573:0x1657, B:577:0x165d, B:579:0x1663, B:580:0x1664, B:586:0x1669, B:588:0x1673, B:589:0x1674, B:626:0x168e, B:628:0x1694, B:629:0x1695, B:643:0x169b, B:645:0x16a9, B:646:0x16aa, B:652:0x16ac, B:654:0x16bc, B:655:0x16bd, B:658:0x16bf, B:660:0x16cf, B:661:0x16d0, B:664:0x16d2, B:666:0x16e2, B:667:0x16e3, B:670:0x16e5, B:672:0x16f5, B:673:0x16f6, B:490:0x11f7, B:157:0x0870, B:482:0x115d, B:151:0x0825, B:263:0x14fb, B:261:0x14c3, B:440:0x104d, B:149:0x07ef, B:259:0x1491, B:304:0x13a0, B:147:0x07b7, B:173:0x0ae7, B:498:0x129a, B:500:0x1325, B:502:0x1330, B:512:0x15de, B:513:0x1615, B:494:0x125b), top: B:301:0x135a, inners: #4, #5, #10, #15, #19, #26, #29, #36, #38, #51, #52, #56, #59, #94, #96 }] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x1695 A[Catch: all -> 0x16f7, TryCatch #66 {all -> 0x16f7, blocks: (B:302:0x135a, B:305:0x13ba, B:307:0x13c4, B:257:0x1439, B:264:0x1527, B:267:0x1543, B:269:0x1549, B:270:0x154a, B:273:0x154c, B:275:0x1552, B:276:0x1553, B:279:0x1555, B:281:0x155b, B:282:0x155c, B:284:0x155d, B:287:0x1587, B:311:0x13e4, B:313:0x13ea, B:314:0x13eb, B:253:0x13ec, B:255:0x1422, B:293:0x142f, B:294:0x1435, B:509:0x15a1, B:517:0x1617, B:519:0x161d, B:520:0x161e, B:523:0x1620, B:525:0x1628, B:526:0x1629, B:529:0x162b, B:531:0x1633, B:532:0x1634, B:550:0x1636, B:552:0x163e, B:553:0x163f, B:561:0x1645, B:563:0x164b, B:564:0x164c, B:570:0x164e, B:572:0x1656, B:573:0x1657, B:577:0x165d, B:579:0x1663, B:580:0x1664, B:586:0x1669, B:588:0x1673, B:589:0x1674, B:626:0x168e, B:628:0x1694, B:629:0x1695, B:643:0x169b, B:645:0x16a9, B:646:0x16aa, B:652:0x16ac, B:654:0x16bc, B:655:0x16bd, B:658:0x16bf, B:660:0x16cf, B:661:0x16d0, B:664:0x16d2, B:666:0x16e2, B:667:0x16e3, B:670:0x16e5, B:672:0x16f5, B:673:0x16f6, B:490:0x11f7, B:157:0x0870, B:482:0x115d, B:151:0x0825, B:263:0x14fb, B:261:0x14c3, B:440:0x104d, B:149:0x07ef, B:259:0x1491, B:304:0x13a0, B:147:0x07b7, B:173:0x0ae7, B:498:0x129a, B:500:0x1325, B:502:0x1330, B:512:0x15de, B:513:0x1615, B:494:0x125b), top: B:301:0x135a, inners: #4, #5, #10, #15, #19, #26, #29, #36, #38, #51, #52, #56, #59, #94, #96 }] */
    /* JADX WARN: Removed duplicated region for block: B:692:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x1782  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:876:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035c  */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v65, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v101, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v11 */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v16 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v34 */
    /* JADX WARN: Type inference failed for: r42v35 */
    /* JADX WARN: Type inference failed for: r42v36 */
    /* JADX WARN: Type inference failed for: r42v37 */
    /* JADX WARN: Type inference failed for: r42v38 */
    /* JADX WARN: Type inference failed for: r42v39 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v10 */
    /* JADX WARN: Type inference failed for: r45v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r45v18 */
    /* JADX WARN: Type inference failed for: r45v19 */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v20 */
    /* JADX WARN: Type inference failed for: r45v23 */
    /* JADX WARN: Type inference failed for: r45v24 */
    /* JADX WARN: Type inference failed for: r45v25 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r45v30 */
    /* JADX WARN: Type inference failed for: r45v31 */
    /* JADX WARN: Type inference failed for: r45v32 */
    /* JADX WARN: Type inference failed for: r45v33 */
    /* JADX WARN: Type inference failed for: r45v34 */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r4v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v80, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v82, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v70, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v73, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v174, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v81, types: [java.lang.Class] */
    static {
        Object obj;
        char c;
        Class<?> cls;
        byte[] bArr;
        char c2;
        Object invoke;
        char c3;
        Object invoke2;
        char c4;
        char c5;
        Object obj2;
        char c6;
        char c7;
        Object[] objArr;
        char c8;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i;
        boolean z;
        boolean z2;
        int i2;
        Class<byte[]> cls2;
        boolean[] zArr4;
        String str;
        boolean z3;
        Class<?>[] clsArr;
        boolean[] zArr5;
        ?? r42;
        boolean z4;
        boolean[] zArr6;
        boolean z5;
        int i3;
        char c9;
        int i4;
        int i5;
        int i6;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i7;
        int i8;
        int i9;
        Random random;
        int i10;
        int i11;
        int i12;
        int i13;
        Throwable cause;
        InputStream inputStream;
        Object obj8;
        Object obj9;
        byte[] bArr2;
        Object invoke3;
        Object newInstance;
        int length;
        int i14;
        char c10;
        byte[] bArr3;
        byte b;
        int i15;
        Class cls3;
        boolean z6;
        byte[] bArr4;
        Object obj10;
        byte[] bArr5;
        Object[] objArr2;
        int i16;
        boolean z7;
        Class<byte[]> cls4 = byte[].class;
        init$0();
        onInstallConversionDataLoadedNative = 6767228546589119605L;
        onAppOpenAttributionNative = -1924772718;
        init = new byte[]{-114, 58, 10, Ascii.FS, -57, 85, -114, -126};
        AppsFlyer2dXConversionCallback = 3;
        getLevel = new HashMap();
        afVerboseLog = new HashMap();
        try {
            byte[] bArr6 = $$a;
            String $$c = $$c((byte) (-bArr6[311]), (short) 293, bArr6[46]);
            Class<?>[] clsArr2 = null;
            String $$c2 = afErrorLogForExcManagerOnly == null ? $$c((byte) (-bArr6[311]), (short) 879, bArr6[332]) : null;
            boolean z8 = true;
            try {
                byte b2 = bArr6[38];
                Class<?> cls5 = Class.forName($$c((byte) ((b2 ^ (-1)) + (b2 << 1)), (short) 688, bArr6[81]));
                byte b3 = (byte) (-bArr6[311]);
                Method method = cls5.getMethod($$c(b3, (short) (b3 & 236), (byte) (-bArr6[45])), new Class[0]);
                obj = method.invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            try {
                byte[] bArr7 = $$a;
                c = 311;
                try {
                    Method method2 = Class.forName($$c((byte) (bArr7[38] - 1), (short) TypedValues.CycleType.TYPE_ALPHA, bArr7[161])).getMethod($$c(bArr7[300], (short) 789, bArr7[13]), new Class[0]);
                    obj = method2.invoke(null, null);
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                c = 311;
                if (obj != null) {
                    try {
                        cls = obj.getClass();
                        bArr = $$a;
                        c2 = 608;
                    } catch (Exception unused4) {
                        c2 = 608;
                        invoke = null;
                        if (obj != null) {
                            try {
                                Class<?> cls6 = obj.getClass();
                                byte[] bArr8 = $$a;
                                c3 = '\r';
                                try {
                                    String $$c3 = $$c(bArr8[300], (short) 261, bArr8[6]);
                                    Method method3 = cls6.getMethod($$c3, null);
                                    invoke2 = method3.invoke(obj, null);
                                } catch (Exception unused5) {
                                    invoke2 = null;
                                    int i17 = 2;
                                    if (obj == null) {
                                    }
                                    c5 = 300;
                                    obj2 = null;
                                    if (invoke == null) {
                                    }
                                    c6 = 362;
                                    c7 = '\n';
                                    if (obj2 == null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr9 = $$a;
                                    short s = (short) 809;
                                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9[c7], s, bArr9[c6])), 7);
                                    objArr[0] = null;
                                    objArr[1] = invoke2;
                                    objArr[2] = invoke;
                                    objArr[3] = obj2;
                                    c8 = 4;
                                    objArr[4] = invoke2;
                                    objArr[5] = invoke;
                                    objArr[6] = obj2;
                                    zArr = new boolean[]{false, true, true, true, true, true, true};
                                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                    int i18 = 0;
                                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                    i = -1;
                                    Class<?> cls7 = Class.forName($$c((byte) (bArr9[c4] - 1), bArr9[351], bArr9[92]));
                                    i16 = cls7.getDeclaredField($$c(bArr9[508], (short) 550, (byte) (-bArr9[472]))).getInt(cls7);
                                    if (i16 < 34) {
                                    }
                                    if (i16 != 29) {
                                    }
                                    int i19 = 2 % 2;
                                    z7 = false;
                                    zArr3[0] = z7;
                                    zArr3[1] = i16 >= 21;
                                    zArr3[4] = i16 >= 21;
                                    z2 = false;
                                    i2 = 0;
                                    while (!z2) {
                                    }
                                }
                            } catch (Exception unused6) {
                                c3 = '\r';
                                invoke2 = null;
                                int i172 = 2;
                                if (obj == null) {
                                }
                                c5 = 300;
                                obj2 = null;
                                if (invoke == null) {
                                }
                                c6 = 362;
                                c7 = '\n';
                                if (obj2 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr92 = $$a;
                                short s2 = (short) 809;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92[c7], s2, bArr92[c6])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = obj2;
                                c8 = 4;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = obj2;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                int i182 = 0;
                                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                i = -1;
                                Class<?> cls72 = Class.forName($$c((byte) (bArr92[c4] - 1), bArr92[351], bArr92[92]));
                                i16 = cls72.getDeclaredField($$c(bArr92[508], (short) 550, (byte) (-bArr92[472]))).getInt(cls72);
                                if (i16 < 34) {
                                }
                                if (i16 != 29) {
                                }
                                int i192 = 2 % 2;
                                z7 = false;
                                zArr3[0] = z7;
                                zArr3[1] = i16 >= 21;
                                zArr3[4] = i16 >= 21;
                                z2 = false;
                                i2 = 0;
                                while (!z2) {
                                }
                            }
                            int i1722 = 2;
                            if (obj == null) {
                                int i20 = $11 + 19;
                                $10 = i20 % 128;
                                int i21 = i20 % 2;
                                try {
                                    Class<?> cls8 = obj.getClass();
                                    byte[] bArr10 = $$a;
                                    c4 = '&';
                                    try {
                                        c5 = 300;
                                    } catch (Exception unused7) {
                                        c5 = 300;
                                        obj2 = null;
                                        if (invoke == null) {
                                        }
                                        c6 = 362;
                                        c7 = '\n';
                                        if (obj2 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr922 = $$a;
                                        short s22 = (short) 809;
                                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr922[c7], s22, bArr922[c6])), 7);
                                        objArr[0] = null;
                                        objArr[1] = invoke2;
                                        objArr[2] = invoke;
                                        objArr[3] = obj2;
                                        c8 = 4;
                                        objArr[4] = invoke2;
                                        objArr[5] = invoke;
                                        objArr[6] = obj2;
                                        zArr = new boolean[]{false, true, true, true, true, true, true};
                                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                        int i1822 = 0;
                                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                        i = -1;
                                        Class<?> cls722 = Class.forName($$c((byte) (bArr922[c4] - 1), bArr922[351], bArr922[92]));
                                        i16 = cls722.getDeclaredField($$c(bArr922[508], (short) 550, (byte) (-bArr922[472]))).getInt(cls722);
                                        if (i16 < 34) {
                                        }
                                        if (i16 != 29) {
                                        }
                                        int i1922 = 2 % 2;
                                        z7 = false;
                                        zArr3[0] = z7;
                                        zArr3[1] = i16 >= 21;
                                        zArr3[4] = i16 >= 21;
                                        z2 = false;
                                        i2 = 0;
                                        while (!z2) {
                                        }
                                    }
                                    try {
                                        obj2 = cls8.getMethod($$c(bArr10[300], (short) 188, bArr10[c2]), null).invoke(obj, null);
                                    } catch (Exception unused8) {
                                        obj2 = null;
                                        if (invoke == null) {
                                        }
                                        c6 = 362;
                                        c7 = '\n';
                                        if (obj2 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr9222 = $$a;
                                        short s222 = (short) 809;
                                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9222[c7], s222, bArr9222[c6])), 7);
                                        objArr[0] = null;
                                        objArr[1] = invoke2;
                                        objArr[2] = invoke;
                                        objArr[3] = obj2;
                                        c8 = 4;
                                        objArr[4] = invoke2;
                                        objArr[5] = invoke;
                                        objArr[6] = obj2;
                                        zArr = new boolean[]{false, true, true, true, true, true, true};
                                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                        int i18222 = 0;
                                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                        i = -1;
                                        Class<?> cls7222 = Class.forName($$c((byte) (bArr9222[c4] - 1), bArr9222[351], bArr9222[92]));
                                        i16 = cls7222.getDeclaredField($$c(bArr9222[508], (short) 550, (byte) (-bArr9222[472]))).getInt(cls7222);
                                        if (i16 < 34) {
                                        }
                                        if (i16 != 29) {
                                        }
                                        int i19222 = 2 % 2;
                                        z7 = false;
                                        zArr3[0] = z7;
                                        zArr3[1] = i16 >= 21;
                                        zArr3[4] = i16 >= 21;
                                        z2 = false;
                                        i2 = 0;
                                        while (!z2) {
                                        }
                                    }
                                } catch (Exception unused9) {
                                    c4 = '&';
                                }
                                if (invoke == null) {
                                    if ($$c2 != null) {
                                        StringBuilder sb = new StringBuilder();
                                        byte[] bArr11 = $$a;
                                        c6 = 362;
                                        c7 = '\n';
                                        String sb2 = sb.append($$c(bArr11[41], (short) 531, bArr11[c2])).append($$c2).toString();
                                        int i22 = $10;
                                        int i23 = (i22 & 49) + (i22 | 49);
                                        $11 = i23 % 128;
                                        int i24 = i23 % 2;
                                        try {
                                            invoke = Class.forName($$c(bArr11[10], (short) 809, bArr11[362])).getDeclaredConstructor(String.class).newInstance(sb2);
                                            int i25 = 2 % 2;
                                            if (obj2 == null) {
                                                byte[] bArr12 = $$a;
                                                try {
                                                    try {
                                                        obj2 = Class.forName($$c(bArr12[c7], (short) 809, bArr12[c6])).getDeclaredConstructor(String.class).newInstance(Class.forName($$c(bArr12[c7], bArr12[c2], bArr12[308])).getMethod($$c(bArr12[c5], (short) 664, bArr12[c2]), String.class).invoke(null, $$c(bArr12[c7], (short) 651, bArr12[354])));
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
                                            if (invoke2 == null) {
                                                int i26 = $11;
                                                int i27 = ((i26 | 115) << 1) - (i26 ^ 115);
                                                $10 = i27 % 128;
                                                int i28 = i27 % 2;
                                                if (invoke != null) {
                                                    byte b4 = (byte) (-$$a[c]);
                                                    int i29 = $$b;
                                                    try {
                                                        short s3 = (short) 809;
                                                        invoke2 = Class.forName($$c(r5[c7], s3, r5[c6])).getDeclaredConstructor(Class.forName($$c(r5[c7], s3, r5[c6])), String.class).newInstance(invoke, $$c(b4, (short) ((i29 & 24) | (i29 ^ 24)), (byte) (r5[19] - 1)));
                                                    } catch (Throwable th3) {
                                                        Throwable cause4 = th3.getCause();
                                                        if (cause4 == null) {
                                                            throw th3;
                                                        }
                                                        throw cause4;
                                                    }
                                                }
                                            }
                                            byte[] bArr92222 = $$a;
                                            short s2222 = (short) 809;
                                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92222[c7], s2222, bArr92222[c6])), 7);
                                            objArr[0] = null;
                                            objArr[1] = invoke2;
                                            objArr[2] = invoke;
                                            objArr[3] = obj2;
                                            c8 = 4;
                                            objArr[4] = invoke2;
                                            objArr[5] = invoke;
                                            objArr[6] = obj2;
                                            zArr = new boolean[]{false, true, true, true, true, true, true};
                                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                            int i182222 = 0;
                                            zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                            i = -1;
                                            Class<?> cls72222 = Class.forName($$c((byte) (bArr92222[c4] - 1), bArr92222[351], bArr92222[92]));
                                            i16 = cls72222.getDeclaredField($$c(bArr92222[508], (short) 550, (byte) (-bArr92222[472]))).getInt(cls72222);
                                            if (i16 < 34) {
                                                z = true;
                                            } else {
                                                int i30 = 2 % 2;
                                                z = false;
                                            }
                                            if (i16 != 29 && i16 >= 26) {
                                                int i31 = $11 + 3;
                                                $10 = i31 % 128;
                                                int i32 = i31 % 2;
                                                int i33 = 2 % 2;
                                                z7 = true;
                                            } else {
                                                int i192222 = 2 % 2;
                                                z7 = false;
                                            }
                                            zArr3[0] = z7;
                                            zArr3[1] = i16 >= 21;
                                            zArr3[4] = i16 >= 21;
                                            z2 = false;
                                            i2 = 0;
                                            while (!z2 && i2 < 9) {
                                                if (zArr3[i2]) {
                                                    cls2 = cls4;
                                                    zArr4 = zArr;
                                                    str = $$c;
                                                    z3 = z;
                                                    clsArr = clsArr2;
                                                    zArr5 = zArr2;
                                                    r42 = objArr;
                                                    z4 = z2;
                                                    zArr6 = zArr3;
                                                    z5 = z8;
                                                    i3 = i1722;
                                                    c9 = c8;
                                                } else {
                                                    try {
                                                        boolean z9 = zArr[i2];
                                                        Object obj11 = objArr[i2];
                                                        boolean z10 = zArr2[i2];
                                                        if (z9) {
                                                            if (obj11 != null) {
                                                                try {
                                                                    i6 = 782;
                                                                    i5 = i1722;
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
                                                            } else {
                                                                i6 = 782;
                                                            }
                                                            StringBuilder sb3 = new StringBuilder();
                                                            byte[] bArr13 = $$a;
                                                            StringBuilder append = sb3.append($$c(bArr13[790], (short) 347, bArr13[i6])).append(obj11);
                                                            byte b5 = bArr13[14];
                                                            try {
                                                                Object[] objArr3 = {append.append($$c(b5, (short) ((b5 ^ 201) | (b5 & 201)), bArr13[74])).toString()};
                                                                byte b6 = bArr13[c7];
                                                                Class<?> cls9 = Class.forName($$c(b6, (short) ((b6 ^ 678) | (b6 & 678)), bArr13[97]));
                                                                Class<?>[] clsArr3 = new Class[1];
                                                                clsArr3[i182222] = String.class;
                                                                throw ((Throwable) cls9.getDeclaredConstructor(clsArr3).newInstance(objArr3));
                                                            } catch (Throwable th6) {
                                                                Throwable cause6 = th6.getCause();
                                                                if (cause6 == null) {
                                                                    throw th6;
                                                                }
                                                                throw cause6;
                                                            }
                                                        }
                                                        i5 = i1722;
                                                        i6 = 782;
                                                        if (z9) {
                                                            try {
                                                                Random random2 = new Random();
                                                                try {
                                                                    random2.setSeed(((Long) Class.forName($$c(r12[c7], r12[c2], r12[308])).getMethod($$c((byte) (-$$a[c]), (short) 824, r12[474]), null).invoke(null, null)).longValue() ^ (-1617165123));
                                                                    Object obj12 = null;
                                                                    Object obj13 = null;
                                                                    Object obj14 = null;
                                                                    obj3 = null;
                                                                    Random random3 = r42;
                                                                    while (obj12 == null) {
                                                                        try {
                                                                            try {
                                                                                if (obj13 == null) {
                                                                                    i8 = 6;
                                                                                } else if (obj14 == null) {
                                                                                    i8 = 5;
                                                                                } else {
                                                                                    if (obj3 == null) {
                                                                                        int i34 = $11;
                                                                                        cls2 = cls4;
                                                                                        int i35 = (i34 ^ 27) + ((i34 & 27) << 1);
                                                                                        obj7 = obj12;
                                                                                        $10 = i35 % 128;
                                                                                        int i36 = i35 % 2;
                                                                                        i7 = 4;
                                                                                    } else {
                                                                                        cls2 = cls4;
                                                                                        obj7 = obj12;
                                                                                        i7 = 3;
                                                                                    }
                                                                                    zArr4 = zArr;
                                                                                    StringBuilder sb4 = new StringBuilder((i7 ^ 1) + ((i7 & 1) << 1));
                                                                                    sb4.append('.');
                                                                                    i9 = i182222;
                                                                                    while (i9 < i7) {
                                                                                        if (z10) {
                                                                                            i10 = i7;
                                                                                            int nextInt = random2.nextInt(26);
                                                                                            if (random2.nextBoolean()) {
                                                                                                int i37 = $10;
                                                                                                i11 = i9;
                                                                                                int i38 = (i37 & 87) + (i37 | 87);
                                                                                                str = $$c;
                                                                                                $11 = i38 % 128;
                                                                                                if (i38 % 2 == 0) {
                                                                                                    try {
                                                                                                        i12 = 78 % nextInt;
                                                                                                    } catch (Throwable th7) {
                                                                                                        th = th7;
                                                                                                        z3 = z;
                                                                                                        zArr5 = zArr2;
                                                                                                        objArr2 = objArr;
                                                                                                        z4 = z2;
                                                                                                        zArr6 = zArr3;
                                                                                                        r42 = objArr2;
                                                                                                        c9 = 4;
                                                                                                        while (i4 < 7) {
                                                                                                        }
                                                                                                        byte[] bArr14 = $$a;
                                                                                                        try {
                                                                                                            Object[] objArr4 = {$$c(bArr14[790], (short) 325, bArr14[17]), th};
                                                                                                            byte b7 = bArr14[c7];
                                                                                                            throw ((Throwable) Class.forName($$c(b7, (short) ((b7 ^ 678) | (b7 & 678)), bArr14[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4));
                                                                                                        } catch (Throwable th8) {
                                                                                                            Throwable cause7 = th8.getCause();
                                                                                                            if (cause7 == null) {
                                                                                                                throw th8;
                                                                                                            }
                                                                                                            throw cause7;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    i12 = 64 - (~(-(-nextInt)));
                                                                                                }
                                                                                            } else {
                                                                                                i11 = i9;
                                                                                                str = $$c;
                                                                                                int i39 = -(-nextInt);
                                                                                                i12 = (i39 & 96) + (i39 | 96);
                                                                                                int i40 = i5 % i5;
                                                                                            }
                                                                                            sb4.append((char) i12);
                                                                                        } else {
                                                                                            i10 = i7;
                                                                                            i11 = i9;
                                                                                            str = $$c;
                                                                                            sb4.append((char) (8191 - (~(-(-random2.nextInt(12))))));
                                                                                        }
                                                                                        i9 = i11 + 1;
                                                                                        i7 = i10;
                                                                                        $$c = str;
                                                                                    }
                                                                                    str = $$c;
                                                                                    String sb5 = sb4.toString();
                                                                                    if (obj13 != null) {
                                                                                        try {
                                                                                            Object[] objArr5 = new Object[i5];
                                                                                            objArr5[1] = sb5;
                                                                                            objArr5[i182222] = obj11;
                                                                                            byte[] bArr15 = $$a;
                                                                                            Class<?> cls10 = Class.forName($$c(bArr15[c7], s2222, bArr15[c6]));
                                                                                            Class<?>[] clsArr4 = new Class[2];
                                                                                            clsArr4[i182222] = Class.forName($$c(bArr15[c7], s2222, bArr15[c6]));
                                                                                            clsArr4[1] = String.class;
                                                                                            obj13 = cls10.getDeclaredConstructor(clsArr4).newInstance(objArr5);
                                                                                            z3 = z;
                                                                                            random = random2;
                                                                                            obj12 = obj7;
                                                                                        } catch (Throwable th9) {
                                                                                            Throwable cause8 = th9.getCause();
                                                                                            if (cause8 == null) {
                                                                                                throw th9;
                                                                                            }
                                                                                            throw cause8;
                                                                                        }
                                                                                    } else if (obj14 == null) {
                                                                                        try {
                                                                                            Object[] objArr6 = new Object[2];
                                                                                            objArr6[1] = sb5;
                                                                                            objArr6[i182222] = obj11;
                                                                                            byte[] bArr16 = $$a;
                                                                                            Class<?> cls11 = Class.forName($$c(bArr16[c7], s2222, bArr16[c6]));
                                                                                            Class<?>[] clsArr5 = new Class[2];
                                                                                            clsArr5[i182222] = Class.forName($$c(bArr16[c7], s2222, bArr16[c6]));
                                                                                            clsArr5[1] = String.class;
                                                                                            obj14 = cls11.getDeclaredConstructor(clsArr5).newInstance(objArr6);
                                                                                            z3 = z;
                                                                                            random = random2;
                                                                                            obj12 = obj7;
                                                                                        } catch (Throwable th10) {
                                                                                            Throwable cause9 = th10.getCause();
                                                                                            if (cause9 == null) {
                                                                                                throw th10;
                                                                                            }
                                                                                            throw cause9;
                                                                                        }
                                                                                    } else if (obj3 == null) {
                                                                                        int i41 = $11;
                                                                                        int i42 = ((i41 | 97) << 1) - (i41 ^ 97);
                                                                                        int i43 = i42 % 128;
                                                                                        $10 = i43;
                                                                                        int i44 = i42 % 2;
                                                                                        int i45 = (i43 & 7) + (i43 | 7);
                                                                                        $11 = i45 % 128;
                                                                                        int i46 = i45 % 2;
                                                                                        try {
                                                                                            Object[] objArr7 = new Object[2];
                                                                                            objArr7[1] = sb5;
                                                                                            objArr7[i182222] = obj11;
                                                                                            byte[] bArr17 = $$a;
                                                                                            Class<?> cls12 = Class.forName($$c(bArr17[c7], s2222, bArr17[c6]));
                                                                                            Class<?>[] clsArr6 = new Class[2];
                                                                                            clsArr6[i182222] = Class.forName($$c(bArr17[c7], s2222, bArr17[c6]));
                                                                                            clsArr6[1] = String.class;
                                                                                            obj3 = cls12.getDeclaredConstructor(clsArr6).newInstance(objArr7);
                                                                                            z3 = z;
                                                                                            random = random2;
                                                                                            obj12 = obj7;
                                                                                        } catch (Throwable th11) {
                                                                                            Throwable cause10 = th11.getCause();
                                                                                            if (cause10 == null) {
                                                                                                throw th11;
                                                                                            }
                                                                                            throw cause10;
                                                                                        }
                                                                                    } else {
                                                                                        try {
                                                                                            Object[] objArr8 = new Object[2];
                                                                                            objArr8[1] = sb5;
                                                                                            objArr8[i182222] = obj11;
                                                                                            byte[] bArr18 = $$a;
                                                                                            Class<?> cls13 = Class.forName($$c(bArr18[c7], s2222, bArr18[c6]));
                                                                                            Class<?>[] clsArr7 = new Class[2];
                                                                                            z3 = z;
                                                                                            try {
                                                                                                clsArr7[i182222] = Class.forName($$c(bArr18[c7], s2222, bArr18[c6]));
                                                                                                clsArr7[1] = String.class;
                                                                                                Object newInstance2 = cls13.getDeclaredConstructor(clsArr7).newInstance(objArr8);
                                                                                                int i47 = $10;
                                                                                                int i48 = (i47 & 25) + (i47 | 25);
                                                                                                $11 = i48 % 128;
                                                                                                int i49 = i48 % 2;
                                                                                                try {
                                                                                                    try {
                                                                                                        byte b8 = bArr18[c7];
                                                                                                        Class<?> cls14 = Class.forName($$c(b8, (short) ((b8 ^ 648) | (b8 & 648)), bArr18[92]));
                                                                                                        Class<?>[] clsArr8 = new Class[1];
                                                                                                        random = random2;
                                                                                                        clsArr8[i182222] = Class.forName($$c(bArr18[c7], s2222, bArr18[c6]));
                                                                                                        Object newInstance3 = cls14.getDeclaredConstructor(clsArr8).newInstance(newInstance2);
                                                                                                        try {
                                                                                                            byte b9 = bArr18[c7];
                                                                                                            Class.forName($$c(b9, (short) ((b9 ^ 648) | (b9 & 648)), bArr18[92])).getMethod($$c((byte) (-bArr18[c]), (short) 622, bArr18[i6]), null).invoke(newInstance3, null);
                                                                                                            obj12 = newInstance2;
                                                                                                        } catch (Throwable th12) {
                                                                                                            Throwable cause11 = th12.getCause();
                                                                                                            if (cause11 == null) {
                                                                                                                throw th12;
                                                                                                            }
                                                                                                            throw cause11;
                                                                                                        }
                                                                                                    } catch (Exception e) {
                                                                                                        try {
                                                                                                            StringBuilder sb6 = new StringBuilder();
                                                                                                            byte[] bArr19 = $$a;
                                                                                                            StringBuilder append2 = sb6.append($$c(bArr19[790], (short) 820, bArr19[i6])).append(newInstance2);
                                                                                                            byte b10 = bArr19[14];
                                                                                                            String sb7 = append2.append($$c(b10, (short) (b10 | 201), bArr19[74])).toString();
                                                                                                            try {
                                                                                                                Object[] objArr9 = new Object[2];
                                                                                                                objArr9[1] = e;
                                                                                                                objArr9[i182222] = sb7;
                                                                                                                byte b11 = bArr19[c7];
                                                                                                                Class<?> cls15 = Class.forName($$c(b11, (short) ((b11 ^ 678) | (b11 & 678)), bArr19[97]));
                                                                                                                Class<?>[] clsArr9 = new Class[2];
                                                                                                                clsArr9[i182222] = String.class;
                                                                                                                clsArr9[1] = Throwable.class;
                                                                                                                throw ((Throwable) cls15.getDeclaredConstructor(clsArr9).newInstance(objArr9));
                                                                                                            } catch (Throwable th13) {
                                                                                                                Throwable cause12 = th13.getCause();
                                                                                                                if (cause12 == null) {
                                                                                                                    throw th13;
                                                                                                                }
                                                                                                                throw cause12;
                                                                                                            }
                                                                                                        } catch (Throwable th14) {
                                                                                                            th = th14;
                                                                                                            zArr5 = zArr2;
                                                                                                            objArr2 = objArr;
                                                                                                            z4 = z2;
                                                                                                            zArr6 = zArr3;
                                                                                                            r42 = objArr2;
                                                                                                            c9 = 4;
                                                                                                            while (i4 < 7) {
                                                                                                            }
                                                                                                            byte[] bArr142 = $$a;
                                                                                                            Object[] objArr42 = {$$c(bArr142[790], (short) 325, bArr142[17]), th};
                                                                                                            byte b72 = bArr142[c7];
                                                                                                            throw ((Throwable) Class.forName($$c(b72, (short) ((b72 ^ 678) | (b72 & 678)), bArr142[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42));
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th15) {
                                                                                                    Throwable cause13 = th15.getCause();
                                                                                                    if (cause13 == null) {
                                                                                                        throw th15;
                                                                                                    }
                                                                                                    throw cause13;
                                                                                                }
                                                                                            } catch (Throwable th16) {
                                                                                                th = th16;
                                                                                                Throwable cause14 = th.getCause();
                                                                                                if (cause14 == null) {
                                                                                                    throw th;
                                                                                                }
                                                                                                throw cause14;
                                                                                            }
                                                                                        } catch (Throwable th17) {
                                                                                            th = th17;
                                                                                        }
                                                                                    }
                                                                                    z = z3;
                                                                                    cls4 = cls2;
                                                                                    $$c = str;
                                                                                    zArr = zArr4;
                                                                                    random2 = random;
                                                                                    i5 = 2;
                                                                                    random3 = random;
                                                                                }
                                                                                StringBuilder sb42 = new StringBuilder((i7 ^ 1) + ((i7 & 1) << 1));
                                                                                sb42.append('.');
                                                                                i9 = i182222;
                                                                                while (i9 < i7) {
                                                                                }
                                                                                str = $$c;
                                                                                String sb52 = sb42.toString();
                                                                                if (obj13 != null) {
                                                                                }
                                                                                z = z3;
                                                                                cls4 = cls2;
                                                                                $$c = str;
                                                                                zArr = zArr4;
                                                                                random2 = random;
                                                                                i5 = 2;
                                                                                random3 = random;
                                                                            } catch (Throwable th18) {
                                                                                th = th18;
                                                                                str = $$c;
                                                                                z3 = z;
                                                                                zArr5 = zArr2;
                                                                                objArr2 = objArr;
                                                                                z4 = z2;
                                                                                zArr6 = zArr3;
                                                                                r42 = objArr2;
                                                                                c9 = 4;
                                                                                while (i4 < 7) {
                                                                                }
                                                                                byte[] bArr1422 = $$a;
                                                                                Object[] objArr422 = {$$c(bArr1422[790], (short) 325, bArr1422[17]), th};
                                                                                byte b722 = bArr1422[c7];
                                                                                throw ((Throwable) Class.forName($$c(b722, (short) ((b722 ^ 678) | (b722 & 678)), bArr1422[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr422));
                                                                            }
                                                                            zArr4 = zArr;
                                                                        } catch (Throwable th19) {
                                                                            th = th19;
                                                                            zArr4 = zArr;
                                                                            str = $$c;
                                                                            z3 = z;
                                                                            zArr5 = zArr2;
                                                                            objArr2 = objArr;
                                                                            z4 = z2;
                                                                            zArr6 = zArr3;
                                                                            r42 = objArr2;
                                                                            c9 = 4;
                                                                            while (i4 < 7) {
                                                                            }
                                                                            byte[] bArr14222 = $$a;
                                                                            Object[] objArr4222 = {$$c(bArr14222[790], (short) 325, bArr14222[17]), th};
                                                                            byte b7222 = bArr14222[c7];
                                                                            throw ((Throwable) Class.forName($$c(b7222, (short) ((b7222 ^ 678) | (b7222 & 678)), bArr14222[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4222));
                                                                        }
                                                                        cls2 = cls4;
                                                                        i7 = i8;
                                                                        obj7 = obj12;
                                                                    }
                                                                    cls2 = cls4;
                                                                    obj4 = obj12;
                                                                    obj5 = obj14;
                                                                    obj6 = obj13;
                                                                    r42 = random3;
                                                                } catch (Throwable th20) {
                                                                    Throwable cause15 = th20.getCause();
                                                                    if (cause15 == null) {
                                                                        throw th20;
                                                                    }
                                                                    throw cause15;
                                                                }
                                                            } catch (Throwable th21) {
                                                                th = th21;
                                                                cls2 = cls4;
                                                            }
                                                        } else {
                                                            cls2 = cls4;
                                                            obj5 = null;
                                                            obj6 = null;
                                                            obj3 = null;
                                                            obj4 = null;
                                                            r42 = r42;
                                                        }
                                                        zArr4 = zArr;
                                                        str = $$c;
                                                        z3 = z;
                                                        byte[] bArr20 = new byte[7128];
                                                        byte[] bArr21 = $$a;
                                                        try {
                                                            Object[] objArr10 = {AFa1uSDK.class.getResourceAsStream($$c(bArr21[41], (short) 626, bArr21[81]))};
                                                            byte b12 = bArr21[c7];
                                                            Class<?> cls16 = Class.forName($$c(b12, (short) ((b12 ^ 394) | (b12 & 394)), bArr21[17]));
                                                            Class<?>[] clsArr10 = new Class[1];
                                                            Object obj15 = obj5;
                                                            clsArr10[i182222] = Class.forName($$c(bArr21[c7], (short) 949, bArr21[97]));
                                                            Object newInstance4 = cls16.getDeclaredConstructor(clsArr10).newInstance(objArr10);
                                                            try {
                                                                byte b13 = bArr21[c7];
                                                                ?? cls17 = Class.forName($$c(b13, (short) ((b13 ^ 394) | (b13 & 394)), bArr21[17]));
                                                                String $$c4 = $$c((byte) (-bArr21[324]), (short) 160, bArr21[19]);
                                                                Class[] clsArr11 = new Class[1];
                                                                clsArr11[i182222] = cls2;
                                                                cls17.getMethod($$c4, clsArr11).invoke(newInstance4, bArr20);
                                                                try {
                                                                    byte b14 = bArr21[c7];
                                                                    Class.forName($$c(b14, (short) ((b14 ^ 394) | (b14 & 394)), bArr21[17])).getMethod($$c((byte) (-bArr21[c]), (short) 622, bArr21[i6]), null).invoke(newInstance4, null);
                                                                    int i50 = 16;
                                                                    int i51 = 7089;
                                                                    String str2 = str;
                                                                    Class cls18 = null;
                                                                    r42 = r42;
                                                                    zArr6 = zArr6;
                                                                    while (true) {
                                                                        int i52 = (i50 & 205) + (i50 | 205);
                                                                        byte b15 = bArr20[i50 + 7111];
                                                                        bArr20[i52] = (byte) ((b15 & (-86)) + (b15 | (-86)));
                                                                        try {
                                                                            Object[] objArr11 = new Object[3];
                                                                            objArr11[2] = Integer.valueOf((bArr20.length - (~(-i50))) - 1);
                                                                            objArr11[1] = Integer.valueOf(i50);
                                                                            objArr11[i182222] = bArr20;
                                                                            byte[] bArr22 = $$a;
                                                                            r42 = 94;
                                                                            int i53 = i50;
                                                                            ?? cls19 = Class.forName($$c(bArr22[c7], (short) ($$b >>> 1), bArr22[94]));
                                                                            Class[] clsArr12 = new Class[3];
                                                                            clsArr12[i182222] = cls2;
                                                                            clsArr12[1] = Integer.TYPE;
                                                                            clsArr12[2] = Integer.TYPE;
                                                                            zArr6 = (InputStream) cls19.getDeclaredConstructor(clsArr12).newInstance(objArr11);
                                                                            Object obj16 = afErrorLogForExcManagerOnly;
                                                                            if (obj16 == null) {
                                                                                try {
                                                                                    Object[] objArr12 = new Object[4];
                                                                                    objArr12[3] = Integer.valueOf(i182222);
                                                                                    objArr12[2] = Integer.valueOf(i182222);
                                                                                    objArr12[1] = "";
                                                                                    objArr12[i182222] = "";
                                                                                    byte b16 = (byte) ((-2) - (bArr22[c4] ^ (-1)));
                                                                                    Class<?> cls20 = Class.forName($$c(b16, (short) ((b16 ^ 705) | (b16 & 705)), bArr22[161]));
                                                                                    i13 = i51;
                                                                                    String $$c5 = $$c(bArr22[95], (short) 178, (byte) (-bArr22[472]));
                                                                                    Class<?>[] clsArr13 = new Class[4];
                                                                                    clsArr13[i182222] = CharSequence.class;
                                                                                    clsArr13[1] = CharSequence.class;
                                                                                    clsArr13[2] = Integer.TYPE;
                                                                                    clsArr13[3] = Integer.TYPE;
                                                                                    int i54 = -((Integer) cls20.getMethod($$c5, clsArr13).invoke(null, objArr12)).intValue();
                                                                                    int i55 = (i54 & 244218572) + (i54 | 244218572);
                                                                                    try {
                                                                                        Object[] objArr13 = new Object[3];
                                                                                        objArr13[2] = Integer.valueOf(i182222);
                                                                                        objArr13[1] = Integer.valueOf(i182222);
                                                                                        objArr13[i182222] = "";
                                                                                        byte b17 = (byte) ((-2) - (bArr22[c4] ^ (-1)));
                                                                                        Class<?> cls21 = Class.forName($$c(b17, (short) ((b17 ^ 705) | (b17 & 705)), bArr22[161]));
                                                                                        String $$c6 = $$c(bArr22[c5], (short) 556, bArr22[c2]);
                                                                                        Class<?>[] clsArr14 = new Class[3];
                                                                                        clsArr14[i182222] = CharSequence.class;
                                                                                        clsArr14[1] = Integer.TYPE;
                                                                                        clsArr14[2] = Integer.TYPE;
                                                                                        short s4 = (short) (11 - (~(-((Integer) cls21.getMethod($$c6, clsArr14).invoke(null, objArr13)).intValue())));
                                                                                        long j = onInstallConversionDataLoadedNative;
                                                                                        int i56 = (int) (j >>> 32);
                                                                                        int i57 = (int) j;
                                                                                        zArr5 = zArr2;
                                                                                        r42 = objArr;
                                                                                        inputStream = new AFj1zSDK(zArr6, new int[]{(i56 | i55) & (~(i56 & i55)), (i57 | i55) & (~(i57 & i55))}, onAppOpenAttributionNative, init, s4, AppsFlyer2dXConversionCallback);
                                                                                        z4 = z2;
                                                                                    } catch (Throwable th22) {
                                                                                        Throwable cause16 = th22.getCause();
                                                                                        if (cause16 == null) {
                                                                                            throw th22;
                                                                                        }
                                                                                        throw cause16;
                                                                                    }
                                                                                } catch (Throwable th23) {
                                                                                    Throwable cause17 = th23.getCause();
                                                                                    if (cause17 == null) {
                                                                                        throw th23;
                                                                                    }
                                                                                    throw cause17;
                                                                                }
                                                                            } else {
                                                                                i13 = i51;
                                                                                byte[] bArr23 = {69, -94, 123, -91, 86, 46, -11, 47};
                                                                                int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                                                                int i58 = (packedPositionType ^ 2) + ((packedPositionType & 2) << 1);
                                                                                try {
                                                                                    Object[] objArr14 = new Object[3];
                                                                                    objArr14[2] = Integer.valueOf(i182222);
                                                                                    objArr14[1] = Integer.valueOf(i182222);
                                                                                    objArr14[i182222] = "";
                                                                                    byte b18 = (byte) ((-2) - (bArr22[c4] ^ (-1)));
                                                                                    Class<?> cls22 = Class.forName($$c(b18, (short) ((b18 & 705) | (b18 ^ 705)), bArr22[161]));
                                                                                    zArr5 = zArr2;
                                                                                    try {
                                                                                        String $$c7 = $$c(bArr22[c5], (short) 556, bArr22[c2]);
                                                                                        Class<?>[] clsArr15 = new Class[3];
                                                                                        clsArr15[i182222] = CharSequence.class;
                                                                                        clsArr15[1] = Integer.TYPE;
                                                                                        clsArr15[2] = Integer.TYPE;
                                                                                        int intValue = ((Integer) cls22.getMethod($$c7, clsArr15).invoke(null, objArr14)).intValue() + 1484931062;
                                                                                        try {
                                                                                            ?? r5 = new Object[4];
                                                                                            try {
                                                                                                r5[3] = Integer.valueOf(intValue);
                                                                                                r5[2] = Integer.valueOf(i58);
                                                                                                r5[1] = bArr23;
                                                                                                r5[i182222] = zArr6;
                                                                                                ?? cls23 = Class.forName($$c((byte) (-bArr22[c]), (short) 566, bArr22[46]), true, (ClassLoader) AFVersionDeclaration);
                                                                                                String $$c8 = $$c(bArr22[c6], (short) 359, bArr22[35]);
                                                                                                try {
                                                                                                    Class[] clsArr16 = new Class[4];
                                                                                                    r42 = objArr;
                                                                                                    z4 = z2;
                                                                                                    try {
                                                                                                        clsArr16[i182222] = Class.forName($$c(bArr22[c7], (short) 949, bArr22[97]));
                                                                                                        clsArr16[1] = cls2;
                                                                                                        clsArr16[2] = Integer.TYPE;
                                                                                                        clsArr16[3] = Integer.TYPE;
                                                                                                        inputStream = (InputStream) cls23.getMethod($$c8, clsArr16).invoke(obj16, r5);
                                                                                                    } catch (Throwable th24) {
                                                                                                        th = th24;
                                                                                                        cause = th.getCause();
                                                                                                        if (cause != null) {
                                                                                                            throw th;
                                                                                                        }
                                                                                                        throw cause;
                                                                                                    }
                                                                                                } catch (Throwable th25) {
                                                                                                    th = th25;
                                                                                                    cause = th.getCause();
                                                                                                    if (cause != null) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th26) {
                                                                                                th = th26;
                                                                                            }
                                                                                        } catch (Throwable th27) {
                                                                                            th = th27;
                                                                                        }
                                                                                    } catch (Throwable th28) {
                                                                                        th = th28;
                                                                                        Throwable cause18 = th.getCause();
                                                                                        if (cause18 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause18;
                                                                                    }
                                                                                } catch (Throwable th29) {
                                                                                    th = th29;
                                                                                }
                                                                            }
                                                                            long j2 = 20;
                                                                            int i59 = $11 + 29;
                                                                            $10 = i59 % 128;
                                                                            int i60 = i59 % 2;
                                                                            int i61 = 2 % 2;
                                                                            try {
                                                                                Object[] objArr15 = {Long.valueOf(j2)};
                                                                                short s5 = (short) 949;
                                                                                Class<?> cls24 = Class.forName($$c(bArr22[c7], s5, bArr22[97]));
                                                                                String $$c9 = $$c((byte) (bArr22[351] - 1), (short) 515, bArr22[294]);
                                                                                Class<?>[] clsArr17 = new Class[1];
                                                                                clsArr17[i182222] = Long.TYPE;
                                                                                ((Long) cls24.getMethod($$c9, clsArr17).invoke(inputStream, objArr15)).longValue();
                                                                                if (z9) {
                                                                                    int i62 = $10;
                                                                                    int i63 = (i62 ^ 43) + ((i62 & 43) << 1);
                                                                                    int i64 = i63 % 128;
                                                                                    $11 = i64;
                                                                                    if (i63 % 2 == 0) {
                                                                                        Object obj17 = null;
                                                                                        obj17.hashCode();
                                                                                        throw null;
                                                                                    }
                                                                                    try {
                                                                                        Object obj18 = afErrorLogForExcManagerOnly;
                                                                                        Object obj19 = obj18 == null ? obj6 : obj15;
                                                                                        if (obj18 == null) {
                                                                                            int i65 = (i64 & 49) + (i64 | 49);
                                                                                            $10 = i65 % 128;
                                                                                            int i66 = i65 % 2;
                                                                                            obj10 = obj3;
                                                                                        } else {
                                                                                            obj10 = obj4;
                                                                                        }
                                                                                        int i67 = $10;
                                                                                        int i68 = (i67 ^ 113) + ((i67 & 113) << 1);
                                                                                        $11 = i68 % 128;
                                                                                        int i69 = i68 % 2;
                                                                                        try {
                                                                                            try {
                                                                                                Object[] objArr16 = {obj19};
                                                                                                byte b19 = bArr22[c7];
                                                                                                Class<?> cls25 = Class.forName($$c(b19, (short) ((b19 ^ 648) | (b19 & 648)), bArr22[92]));
                                                                                                Class<?>[] clsArr18 = new Class[1];
                                                                                                zArr6 = zArr3;
                                                                                                try {
                                                                                                    clsArr18[i182222] = Class.forName($$c(bArr22[c7], s2222, bArr22[c6]));
                                                                                                    Object newInstance5 = cls25.getDeclaredConstructor(clsArr18).newInstance(objArr16);
                                                                                                    if (z3) {
                                                                                                        try {
                                                                                                            ((Boolean) Class.forName($$c(bArr22[c7], s2222, bArr22[c6])).getMethod($$c((byte) (bArr22[351] - 1), (short) TypedValues.CycleType.TYPE_WAVE_OFFSET, bArr22[c2]), null).invoke(obj19, null)).booleanValue();
                                                                                                        } catch (Throwable th30) {
                                                                                                            Throwable cause19 = th30.getCause();
                                                                                                            if (cause19 == null) {
                                                                                                                throw th30;
                                                                                                            }
                                                                                                            throw cause19;
                                                                                                        }
                                                                                                    }
                                                                                                    int i70 = $10 + 5;
                                                                                                    $11 = i70 % 128;
                                                                                                    if (i70 % 2 == 0) {
                                                                                                        try {
                                                                                                            bArr5 = new byte[31842];
                                                                                                        } catch (Throwable th31) {
                                                                                                            th = th31;
                                                                                                        }
                                                                                                    } else {
                                                                                                        bArr5 = new byte[1024];
                                                                                                    }
                                                                                                    int i71 = i13;
                                                                                                    while (true) {
                                                                                                        if (i71 <= 0) {
                                                                                                            obj8 = obj6;
                                                                                                            break;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                Object[] objArr17 = new Object[3];
                                                                                                                objArr17[2] = Integer.valueOf(Math.min(bArr5.length, i71));
                                                                                                                objArr17[1] = Integer.valueOf(i182222);
                                                                                                                objArr17[i182222] = bArr5;
                                                                                                                byte[] bArr24 = $$a;
                                                                                                                int i72 = i71;
                                                                                                                ?? cls26 = Class.forName($$c(bArr24[c7], s5, bArr24[97]));
                                                                                                                obj8 = obj6;
                                                                                                                String $$c10 = $$c((byte) (-bArr24[324]), (short) ($$b + 1), bArr24[294]);
                                                                                                                Class[] clsArr19 = new Class[3];
                                                                                                                clsArr19[i182222] = cls2;
                                                                                                                clsArr19[1] = Integer.TYPE;
                                                                                                                clsArr19[2] = Integer.TYPE;
                                                                                                                int intValue2 = ((Integer) cls26.getMethod($$c10, clsArr19).invoke(inputStream, objArr17)).intValue();
                                                                                                                if (intValue2 == i) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                int i73 = $11 + 7;
                                                                                                                $10 = i73 % 128;
                                                                                                                int i74 = i73 % 2;
                                                                                                                try {
                                                                                                                    Object[] objArr18 = new Object[3];
                                                                                                                    objArr18[2] = Integer.valueOf(intValue2);
                                                                                                                    objArr18[1] = Integer.valueOf(i182222);
                                                                                                                    objArr18[i182222] = bArr5;
                                                                                                                    byte b20 = bArr24[c7];
                                                                                                                    ?? cls27 = Class.forName($$c(b20, (short) ((b20 ^ 648) | (b20 & 648)), bArr24[92]));
                                                                                                                    byte b21 = bArr24[336];
                                                                                                                    Object obj20 = obj3;
                                                                                                                    String $$c11 = $$c((byte) ((b21 ^ (-1)) + (b21 << 1)), (short) 184, bArr24[i6]);
                                                                                                                    Class[] clsArr20 = new Class[3];
                                                                                                                    clsArr20[i182222] = cls2;
                                                                                                                    clsArr20[1] = Integer.TYPE;
                                                                                                                    clsArr20[2] = Integer.TYPE;
                                                                                                                    cls27.getMethod($$c11, clsArr20).invoke(newInstance5, objArr18);
                                                                                                                    int i75 = -intValue2;
                                                                                                                    i71 = (i72 | i75) + (i72 & i75);
                                                                                                                    obj3 = obj20;
                                                                                                                    obj6 = obj8;
                                                                                                                    i = -1;
                                                                                                                } catch (Throwable th32) {
                                                                                                                    Throwable cause20 = th32.getCause();
                                                                                                                    if (cause20 == null) {
                                                                                                                        throw th32;
                                                                                                                    }
                                                                                                                    throw cause20;
                                                                                                                }
                                                                                                            } catch (Throwable th33) {
                                                                                                                Throwable cause21 = th33.getCause();
                                                                                                                if (cause21 == null) {
                                                                                                                    throw th33;
                                                                                                                }
                                                                                                                throw cause21;
                                                                                                            }
                                                                                                        } catch (Throwable th34) {
                                                                                                            th = th34;
                                                                                                            i = -1;
                                                                                                            try {
                                                                                                                byte[] bArr25 = $$a;
                                                                                                                short s6 = (short) 541;
                                                                                                                ((Boolean) Class.forName($$c(bArr25[c7], s2222, bArr25[c6])).getMethod($$c((byte) (-bArr25[2]), s6, bArr25[168]), null).invoke(obj19, null)).booleanValue();
                                                                                                                try {
                                                                                                                    ((Boolean) Class.forName($$c(bArr25[c7], s2222, bArr25[c6])).getMethod($$c((byte) (-bArr25[2]), s6, bArr25[168]), null).invoke(obj10, null)).booleanValue();
                                                                                                                    throw th;
                                                                                                                } catch (Throwable th35) {
                                                                                                                    Throwable cause22 = th35.getCause();
                                                                                                                    if (cause22 == null) {
                                                                                                                        throw th35;
                                                                                                                    }
                                                                                                                    throw cause22;
                                                                                                                }
                                                                                                            } catch (Throwable th36) {
                                                                                                                Throwable cause23 = th36.getCause();
                                                                                                                if (cause23 == null) {
                                                                                                                    throw th36;
                                                                                                                }
                                                                                                                throw cause23;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    obj9 = obj3;
                                                                                                    int i76 = $11;
                                                                                                    int i77 = (i76 ^ 75) + ((i76 & 75) << 1);
                                                                                                    $10 = i77 % 128;
                                                                                                    int i78 = i77 % 2;
                                                                                                    try {
                                                                                                        byte[] bArr26 = $$a;
                                                                                                        byte b22 = bArr26[c7];
                                                                                                        Object invoke4 = Class.forName($$c(b22, (short) (b22 | 648), bArr26[92])).getMethod($$c(bArr26[c5], (short) 546, bArr26[i6]), null).invoke(newInstance5, null);
                                                                                                        int i79 = $11 + 87;
                                                                                                        $10 = i79 % 128;
                                                                                                        int i80 = i79 % 2;
                                                                                                        try {
                                                                                                            i = -1;
                                                                                                            try {
                                                                                                                Class.forName($$c(bArr26[c7], (short) WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND, bArr26[161])).getMethod($$c((byte) (bArr26[351] - 1), (short) 275, bArr26[294]), null).invoke(invoke4, null);
                                                                                                                try {
                                                                                                                    byte b23 = bArr26[c7];
                                                                                                                    Class.forName($$c(b23, (short) ((b23 ^ 648) | (b23 & 648)), bArr26[92])).getMethod($$c((byte) (-bArr26[c]), (short) 622, bArr26[i6]), null).invoke(newInstance5, null);
                                                                                                                    Class<?> cls28 = Class.forName($$c((byte) (-bArr26[2]), (short) ($$b + 4), bArr26[c3]));
                                                                                                                    String $$c12 = $$c(bArr26[310], (short) 481, (byte) (-bArr26[472]));
                                                                                                                    Class<?>[] clsArr21 = new Class[3];
                                                                                                                    clsArr21[i182222] = String.class;
                                                                                                                    clsArr21[1] = String.class;
                                                                                                                    clsArr21[2] = Integer.TYPE;
                                                                                                                    try {
                                                                                                                        short s7 = (short) 674;
                                                                                                                        try {
                                                                                                                            newInstance = cls28.getDeclaredMethod($$c12, clsArr21).invoke(null, Class.forName($$c(bArr26[c7], s2222, bArr26[c6])).getMethod($$c(bArr26[c5], s7, bArr26[6]), null).invoke(obj19, null), Class.forName($$c(bArr26[c7], s2222, bArr26[c6])).getMethod($$c(bArr26[c5], s7, bArr26[6]), null).invoke(obj10, null), Integer.valueOf(i182222));
                                                                                                                            try {
                                                                                                                                short s8 = (short) 541;
                                                                                                                                ((Boolean) Class.forName($$c(bArr26[c7], s2222, bArr26[c6])).getMethod($$c((byte) (-bArr26[2]), s8, bArr26[168]), null).invoke(obj19, null)).booleanValue();
                                                                                                                                int i81 = $10 + 31;
                                                                                                                                $11 = i81 % 128;
                                                                                                                                int i82 = i81 % 2;
                                                                                                                                try {
                                                                                                                                    ((Boolean) Class.forName($$c(bArr26[c7], s2222, bArr26[c6])).getMethod($$c((byte) (-bArr26[2]), s8, bArr26[168]), null).invoke(obj10, null)).booleanValue();
                                                                                                                                    if (AFVersionDeclaration == null) {
                                                                                                                                        int i83 = $11;
                                                                                                                                        int i84 = (i83 & 53) + (i83 | 53);
                                                                                                                                        $10 = i84 % 128;
                                                                                                                                        int i85 = i84 % 2;
                                                                                                                                        try {
                                                                                                                                            AFVersionDeclaration = Class.class.getMethod($$c(bArr26[c5], (short) 518, bArr26[354]), null).invoke(AFa1uSDK.class, null);
                                                                                                                                        } catch (Throwable th37) {
                                                                                                                                            Throwable cause24 = th37.getCause();
                                                                                                                                            if (cause24 == null) {
                                                                                                                                                throw th37;
                                                                                                                                            }
                                                                                                                                            throw cause24;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    c10 = 2;
                                                                                                                                    zArr6 = zArr6;
                                                                                                                                } catch (Throwable th38) {
                                                                                                                                    Throwable cause25 = th38.getCause();
                                                                                                                                    if (cause25 == null) {
                                                                                                                                        throw th38;
                                                                                                                                    }
                                                                                                                                    throw cause25;
                                                                                                                                }
                                                                                                                            } catch (Throwable th39) {
                                                                                                                                Throwable cause26 = th39.getCause();
                                                                                                                                if (cause26 == null) {
                                                                                                                                    throw th39;
                                                                                                                                }
                                                                                                                                throw cause26;
                                                                                                                            }
                                                                                                                        } catch (Throwable th40) {
                                                                                                                            Throwable cause27 = th40.getCause();
                                                                                                                            if (cause27 == null) {
                                                                                                                                throw th40;
                                                                                                                            }
                                                                                                                            throw cause27;
                                                                                                                        }
                                                                                                                    } catch (Throwable th41) {
                                                                                                                        Throwable cause28 = th41.getCause();
                                                                                                                        if (cause28 == null) {
                                                                                                                            throw th41;
                                                                                                                        }
                                                                                                                        throw cause28;
                                                                                                                    }
                                                                                                                } catch (Throwable th42) {
                                                                                                                    Throwable cause29 = th42.getCause();
                                                                                                                    if (cause29 == null) {
                                                                                                                        throw th42;
                                                                                                                    }
                                                                                                                    throw cause29;
                                                                                                                }
                                                                                                            } catch (Throwable th43) {
                                                                                                                th = th43;
                                                                                                                Throwable cause30 = th.getCause();
                                                                                                                if (cause30 == null) {
                                                                                                                    throw th;
                                                                                                                }
                                                                                                                throw cause30;
                                                                                                            }
                                                                                                        } catch (Throwable th44) {
                                                                                                            th = th44;
                                                                                                        }
                                                                                                    } catch (Throwable th45) {
                                                                                                        Throwable cause31 = th45.getCause();
                                                                                                        if (cause31 == null) {
                                                                                                            throw th45;
                                                                                                        }
                                                                                                        throw cause31;
                                                                                                    }
                                                                                                } catch (Throwable th46) {
                                                                                                    th = th46;
                                                                                                    Throwable cause32 = th.getCause();
                                                                                                    if (cause32 == null) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                    throw cause32;
                                                                                                }
                                                                                            } catch (Exception e2) {
                                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                                byte[] bArr27 = $$a;
                                                                                                byte b24 = bArr27[790];
                                                                                                StringBuilder append3 = sb8.append($$c(b24, (short) ((b24 ^ 323) | (b24 & 323)), bArr27[i6])).append(obj19);
                                                                                                byte b25 = bArr27[14];
                                                                                                String sb9 = append3.append($$c(b25, (short) ((b25 ^ 201) | (b25 & 201)), bArr27[74])).toString();
                                                                                                try {
                                                                                                    Object[] objArr19 = new Object[2];
                                                                                                    objArr19[1] = e2;
                                                                                                    objArr19[i182222] = sb9;
                                                                                                    byte b26 = bArr27[c7];
                                                                                                    Class<?> cls29 = Class.forName($$c(b26, (short) ((b26 ^ 678) | (b26 & 678)), bArr27[97]));
                                                                                                    Class<?>[] clsArr22 = new Class[2];
                                                                                                    clsArr22[i182222] = String.class;
                                                                                                    clsArr22[1] = Throwable.class;
                                                                                                    throw ((Throwable) cls29.getDeclaredConstructor(clsArr22).newInstance(objArr19));
                                                                                                } catch (Throwable th47) {
                                                                                                    Throwable cause33 = th47.getCause();
                                                                                                    if (cause33 == null) {
                                                                                                        throw th47;
                                                                                                    }
                                                                                                    throw cause33;
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th48) {
                                                                                            th = th48;
                                                                                        }
                                                                                    } catch (Throwable th49) {
                                                                                        th = th49;
                                                                                        objArr2 = r42;
                                                                                        zArr6 = zArr3;
                                                                                        r42 = objArr2;
                                                                                        c9 = 4;
                                                                                        while (i4 < 7) {
                                                                                        }
                                                                                        byte[] bArr142222 = $$a;
                                                                                        Object[] objArr42222 = {$$c(bArr142222[790], (short) 325, bArr142222[17]), th};
                                                                                        byte b72222 = bArr142222[c7];
                                                                                        throw ((Throwable) Class.forName($$c(b72222, (short) ((b72222 ^ 678) | (b72222 & 678)), bArr142222[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42222));
                                                                                    }
                                                                                } else {
                                                                                    zArr6 = zArr3;
                                                                                    obj8 = obj6;
                                                                                    obj9 = obj3;
                                                                                    ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                    try {
                                                                                        Object[] objArr20 = {zipInputStream};
                                                                                        c9 = 4;
                                                                                        try {
                                                                                            Class<?> cls30 = Class.forName($$c(bArr22[c7], bArr22[42], bArr22[4]));
                                                                                            Class<?>[] clsArr23 = new Class[1];
                                                                                            clsArr23[i182222] = Class.forName($$c(bArr22[c7], s5, bArr22[97]));
                                                                                            Object newInstance6 = cls30.getDeclaredConstructor(clsArr23).newInstance(objArr20);
                                                                                            try {
                                                                                                byte b27 = bArr22[c7];
                                                                                                Object newInstance7 = Class.forName($$c(b27, (short) ((b27 ^ 422) | (b27 & 422)), bArr22[37])).getDeclaredConstructor(null).newInstance(null);
                                                                                                byte[] bArr28 = new byte[1024];
                                                                                                int i86 = i182222;
                                                                                                while (true) {
                                                                                                    int i87 = $10;
                                                                                                    int i88 = ((i87 | 49) << 1) - (i87 ^ 49);
                                                                                                    $11 = i88 % 128;
                                                                                                    int i89 = i88 % 2;
                                                                                                    try {
                                                                                                        Object[] objArr21 = {bArr28};
                                                                                                        bArr2 = $$a;
                                                                                                        c9 = 4;
                                                                                                        try {
                                                                                                            ?? cls31 = Class.forName($$c(bArr2[c7], bArr2[42], bArr2[4]));
                                                                                                            byte b28 = (byte) (-bArr2[324]);
                                                                                                            int i90 = $$b;
                                                                                                            ZipEntry zipEntry = nextEntry;
                                                                                                            String $$c13 = $$c(b28, (short) (((i90 | 1) << 1) - (i90 ^ 1)), bArr2[294]);
                                                                                                            Class[] clsArr24 = new Class[1];
                                                                                                            clsArr24[i182222] = cls2;
                                                                                                            int intValue3 = ((Integer) cls31.getMethod($$c13, clsArr24).invoke(newInstance6, objArr21)).intValue();
                                                                                                            if (intValue3 <= 0) {
                                                                                                                break;
                                                                                                            }
                                                                                                            try {
                                                                                                                if (i86 >= zipEntry.getSize()) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                int i91 = $11 + 35;
                                                                                                                $10 = i91 % 128;
                                                                                                                int i92 = i91 % 2 != 0 ? 1 : i182222;
                                                                                                                try {
                                                                                                                    Object[] objArr22 = new Object[3];
                                                                                                                    try {
                                                                                                                        objArr22[2] = Integer.valueOf(intValue3);
                                                                                                                        objArr22[1] = Integer.valueOf(i92);
                                                                                                                        objArr22[i182222] = bArr28;
                                                                                                                        byte b29 = bArr2[c7];
                                                                                                                        ?? cls32 = Class.forName($$c(b29, (short) ((b29 ^ 422) | (b29 & 422)), bArr2[37]));
                                                                                                                        String $$c14 = $$c((byte) (bArr2[336] - 1), (short) 184, bArr2[i6]);
                                                                                                                        Class[] clsArr25 = new Class[3];
                                                                                                                        clsArr25[i182222] = cls2;
                                                                                                                        clsArr25[1] = Integer.TYPE;
                                                                                                                        clsArr25[2] = Integer.TYPE;
                                                                                                                        cls32.getMethod($$c14, clsArr25).invoke(newInstance7, objArr22);
                                                                                                                        int i93 = -(-intValue3);
                                                                                                                        i86 = (i86 ^ i93) + ((i93 & i86) << 1);
                                                                                                                        nextEntry = zipEntry;
                                                                                                                    } catch (Throwable th50) {
                                                                                                                        th = th50;
                                                                                                                        Throwable cause34 = th.getCause();
                                                                                                                        if (cause34 == null) {
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        throw cause34;
                                                                                                                    }
                                                                                                                } catch (Throwable th51) {
                                                                                                                    th = th51;
                                                                                                                }
                                                                                                            } catch (Throwable th52) {
                                                                                                                th = th52;
                                                                                                                r42 = r42;
                                                                                                                zArr6 = zArr6;
                                                                                                                c9 = 4;
                                                                                                                for (i4 = ((i2 | 1) << 1) - (i2 ^ 1); i4 < 7; i4++) {
                                                                                                                    if (zArr6[i4]) {
                                                                                                                        clsArr = null;
                                                                                                                        afErrorLogForExcManagerOnly = null;
                                                                                                                        AFVersionDeclaration = null;
                                                                                                                        i3 = 2;
                                                                                                                        i182222 = 0;
                                                                                                                        z5 = true;
                                                                                                                        r42 = r42;
                                                                                                                        zArr6 = zArr6;
                                                                                                                        z2 = z4;
                                                                                                                        i2++;
                                                                                                                        i1722 = i3;
                                                                                                                        c8 = c9;
                                                                                                                        clsArr2 = clsArr;
                                                                                                                        z8 = z5;
                                                                                                                        z = z3;
                                                                                                                        cls4 = cls2;
                                                                                                                        $$c = str;
                                                                                                                        zArr = zArr4;
                                                                                                                        objArr = r42;
                                                                                                                        zArr3 = zArr6;
                                                                                                                        zArr2 = zArr5;
                                                                                                                    }
                                                                                                                }
                                                                                                                byte[] bArr1422222 = $$a;
                                                                                                                Object[] objArr422222 = {$$c(bArr1422222[790], (short) 325, bArr1422222[17]), th};
                                                                                                                byte b722222 = bArr1422222[c7];
                                                                                                                throw ((Throwable) Class.forName($$c(b722222, (short) ((b722222 ^ 678) | (b722222 & 678)), bArr1422222[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr422222));
                                                                                                            }
                                                                                                        } catch (Throwable th53) {
                                                                                                            th = th53;
                                                                                                            Throwable cause35 = th.getCause();
                                                                                                            if (cause35 == null) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                            throw cause35;
                                                                                                        }
                                                                                                    } catch (Throwable th54) {
                                                                                                        th = th54;
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    byte b30 = bArr2[c7];
                                                                                                    Object invoke5 = Class.forName($$c(b30, (short) (b30 | 422), bArr2[37])).getMethod($$c(bArr2[351], (short) 861, bArr2[c2]), null).invoke(newInstance7, null);
                                                                                                    try {
                                                                                                        c9 = 4;
                                                                                                        Class.forName($$c(bArr2[c7], bArr2[42], bArr2[4])).getMethod($$c((byte) (-bArr2[c]), (short) 622, bArr2[i6]), null).invoke(newInstance6, null);
                                                                                                        try {
                                                                                                            byte[] bArr29 = $$a;
                                                                                                            byte b31 = bArr29[c7];
                                                                                                            Class.forName($$c(b31, (short) ((b31 ^ 422) | (b31 & 422)), bArr29[37])).getMethod($$c((byte) (-bArr29[c]), (short) 622, bArr29[i6]), null).invoke(newInstance7, null);
                                                                                                            try {
                                                                                                                byte[] bArr30 = $$a;
                                                                                                                invoke3 = Class.class.getMethod($$c(bArr30[c5], (short) 518, bArr30[354]), null).invoke(AFa1uSDK.class, null);
                                                                                                                Class<?> cls33 = Class.forName($$c((byte) (-bArr30[2]), (short) ComposerImplKt.nodeKey, bArr30[14]));
                                                                                                                Class<?>[] clsArr26 = new Class[2];
                                                                                                                clsArr26[i182222] = Class.forName($$c(bArr30[c7], bArr30[c4], bArr30[97]));
                                                                                                                byte b32 = bArr30[c7];
                                                                                                                clsArr26[1] = Class.forName($$c(b32, (short) ((b32 ^ 318) | (b32 & 318)), bArr30[c3]));
                                                                                                                Constructor<?> declaredConstructor = cls33.getDeclaredConstructor(clsArr26);
                                                                                                                try {
                                                                                                                    ?? cls34 = Class.forName($$c(bArr30[c7], bArr30[c4], bArr30[97]));
                                                                                                                    String $$c15 = $$c((byte) (bArr30[336] - 1), (short) 891, bArr30[294]);
                                                                                                                    Class[] clsArr27 = new Class[1];
                                                                                                                    clsArr27[i182222] = cls2;
                                                                                                                    newInstance = declaredConstructor.newInstance(cls34.getMethod($$c15, clsArr27).invoke(null, invoke5), invoke3);
                                                                                                                    try {
                                                                                                                        Field declaredField = Class.forName($$c((byte) (-bArr30[2]), (short) 230, bArr30[28])).getDeclaredField($$c((byte) (bArr30[777] + 1), (short) i6, bArr30[790]));
                                                                                                                        declaredField.setAccessible(true);
                                                                                                                        Object obj21 = declaredField.get(invoke3);
                                                                                                                        Class<?> cls35 = obj21.getClass();
                                                                                                                        Field declaredField2 = cls35.getDeclaredField($$c(bArr30[89], (short) 926, bArr30[92]));
                                                                                                                        declaredField2.setAccessible(true);
                                                                                                                        Field declaredField3 = cls35.getDeclaredField($$c(bArr30[89], (short) 598, bArr30[35]));
                                                                                                                        declaredField3.setAccessible(true);
                                                                                                                        Object obj22 = declaredField2.get(obj21);
                                                                                                                        Object obj23 = declaredField3.get(obj21);
                                                                                                                        Object obj24 = declaredField.get(newInstance);
                                                                                                                        ArrayList arrayList = new ArrayList((List) obj22);
                                                                                                                        Class<?> componentType = obj23.getClass().getComponentType();
                                                                                                                        length = Array.getLength(obj23);
                                                                                                                        Object newInstance8 = Array.newInstance(componentType, length);
                                                                                                                        while (i14 < length) {
                                                                                                                        }
                                                                                                                        declaredField2.set(obj24, arrayList);
                                                                                                                        declaredField3.set(obj24, newInstance8);
                                                                                                                        if (AFVersionDeclaration == null) {
                                                                                                                        }
                                                                                                                        int i94 = $11 + ModuleDescriptor.MODULE_VERSION;
                                                                                                                        $10 = i94 % 128;
                                                                                                                        c10 = 2;
                                                                                                                        int i95 = i94 % 2;
                                                                                                                        zArr6 = zArr6;
                                                                                                                    } catch (Exception e3) {
                                                                                                                        c9 = 4;
                                                                                                                        StringBuilder sb10 = new StringBuilder();
                                                                                                                        byte[] bArr31 = $$a;
                                                                                                                        StringBuilder append4 = sb10.append($$c(bArr31[790], (short) 355, bArr31[782])).append(invoke3);
                                                                                                                        byte b33 = bArr31[14];
                                                                                                                        try {
                                                                                                                            Object[] objArr23 = {append4.append($$c(b33, (short) ((b33 ^ 201) | (b33 & 201)), bArr31[74])).toString(), e3};
                                                                                                                            byte b34 = bArr31[c7];
                                                                                                                            throw ((Throwable) Class.forName($$c(b34, (short) ((b34 ^ 678) | (b34 & 678)), bArr31[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr23));
                                                                                                                        } catch (Throwable th55) {
                                                                                                                            Throwable cause36 = th55.getCause();
                                                                                                                            if (cause36 == null) {
                                                                                                                                throw th55;
                                                                                                                            }
                                                                                                                            throw cause36;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (Throwable th56) {
                                                                                                                    Throwable cause37 = th56.getCause();
                                                                                                                    if (cause37 == null) {
                                                                                                                        throw th56;
                                                                                                                    }
                                                                                                                    throw cause37;
                                                                                                                }
                                                                                                            } catch (Throwable th57) {
                                                                                                                Throwable cause38 = th57.getCause();
                                                                                                                if (cause38 == null) {
                                                                                                                    throw th57;
                                                                                                                }
                                                                                                                throw cause38;
                                                                                                            }
                                                                                                        } catch (Throwable th58) {
                                                                                                            try {
                                                                                                                Throwable cause39 = th58.getCause();
                                                                                                                if (cause39 == null) {
                                                                                                                    throw th58;
                                                                                                                }
                                                                                                                throw cause39;
                                                                                                            } catch (IOException unused10) {
                                                                                                                byte[] bArr302 = $$a;
                                                                                                                invoke3 = Class.class.getMethod($$c(bArr302[c5], (short) 518, bArr302[354]), null).invoke(AFa1uSDK.class, null);
                                                                                                                Class<?> cls332 = Class.forName($$c((byte) (-bArr302[2]), (short) ComposerImplKt.nodeKey, bArr302[14]));
                                                                                                                Class<?>[] clsArr262 = new Class[2];
                                                                                                                clsArr262[i182222] = Class.forName($$c(bArr302[c7], bArr302[c4], bArr302[97]));
                                                                                                                byte b322 = bArr302[c7];
                                                                                                                clsArr262[1] = Class.forName($$c(b322, (short) ((b322 ^ 318) | (b322 & 318)), bArr302[c3]));
                                                                                                                Constructor<?> declaredConstructor2 = cls332.getDeclaredConstructor(clsArr262);
                                                                                                                ?? cls342 = Class.forName($$c(bArr302[c7], bArr302[c4], bArr302[97]));
                                                                                                                String $$c152 = $$c((byte) (bArr302[336] - 1), (short) 891, bArr302[294]);
                                                                                                                Class[] clsArr272 = new Class[1];
                                                                                                                clsArr272[i182222] = cls2;
                                                                                                                newInstance = declaredConstructor2.newInstance(cls342.getMethod($$c152, clsArr272).invoke(null, invoke5), invoke3);
                                                                                                                Field declaredField4 = Class.forName($$c((byte) (-bArr302[2]), (short) 230, bArr302[28])).getDeclaredField($$c((byte) (bArr302[777] + 1), (short) i6, bArr302[790]));
                                                                                                                declaredField4.setAccessible(true);
                                                                                                                Object obj212 = declaredField4.get(invoke3);
                                                                                                                Class<?> cls352 = obj212.getClass();
                                                                                                                Field declaredField22 = cls352.getDeclaredField($$c(bArr302[89], (short) 926, bArr302[92]));
                                                                                                                declaredField22.setAccessible(true);
                                                                                                                Field declaredField32 = cls352.getDeclaredField($$c(bArr302[89], (short) 598, bArr302[35]));
                                                                                                                declaredField32.setAccessible(true);
                                                                                                                Object obj222 = declaredField22.get(obj212);
                                                                                                                Object obj232 = declaredField32.get(obj212);
                                                                                                                Object obj242 = declaredField4.get(newInstance);
                                                                                                                ArrayList arrayList2 = new ArrayList((List) obj222);
                                                                                                                Class<?> componentType2 = obj232.getClass().getComponentType();
                                                                                                                length = Array.getLength(obj232);
                                                                                                                Object newInstance82 = Array.newInstance(componentType2, length);
                                                                                                                for (i14 = i182222; i14 < length; i14++) {
                                                                                                                    Array.set(newInstance82, i14, Array.get(obj232, i14));
                                                                                                                }
                                                                                                                declaredField22.set(obj242, arrayList2);
                                                                                                                declaredField32.set(obj242, newInstance82);
                                                                                                                if (AFVersionDeclaration == null) {
                                                                                                                    AFVersionDeclaration = newInstance;
                                                                                                                }
                                                                                                                int i942 = $11 + ModuleDescriptor.MODULE_VERSION;
                                                                                                                $10 = i942 % 128;
                                                                                                                c10 = 2;
                                                                                                                int i952 = i942 % 2;
                                                                                                                zArr6 = zArr6;
                                                                                                                if (z9) {
                                                                                                                    try {
                                                                                                                        bArr3 = $$a;
                                                                                                                        b = (byte) (-bArr3[c10]);
                                                                                                                        i15 = $$b;
                                                                                                                        c9 = 4;
                                                                                                                    } catch (Throwable th59) {
                                                                                                                        th = th59;
                                                                                                                        r42 = r42;
                                                                                                                        zArr6 = zArr6;
                                                                                                                        c9 = 4;
                                                                                                                        while (i4 < 7) {
                                                                                                                        }
                                                                                                                        byte[] bArr14222222 = $$a;
                                                                                                                        Object[] objArr4222222 = {$$c(bArr14222222[790], (short) 325, bArr14222222[17]), th};
                                                                                                                        byte b7222222 = bArr14222222[c7];
                                                                                                                        throw ((Throwable) Class.forName($$c(b7222222, (short) ((b7222222 ^ 678) | (b7222222 & 678)), bArr14222222[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4222222));
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        Class<?> cls36 = Class.forName($$c(b, (short) ((i15 & 4) + (i15 | 4)), bArr3[c3]));
                                                                                                                        byte b35 = bArr3[310];
                                                                                                                        String $$c16 = $$c(b35, (short) ((b35 ^ 804) | (b35 & 804)), bArr3[19]);
                                                                                                                        Class<?>[] clsArr28 = new Class[2];
                                                                                                                        clsArr28[i182222] = String.class;
                                                                                                                        byte b36 = bArr3[c7];
                                                                                                                        clsArr28[1] = Class.forName($$c(b36, (short) ((b36 ^ 318) | (b36 & 318)), bArr3[c3]));
                                                                                                                        Method declaredMethod = cls36.getDeclaredMethod($$c16, clsArr28);
                                                                                                                        declaredMethod.setAccessible(true);
                                                                                                                        try {
                                                                                                                            ?? invoke6 = declaredMethod.invoke(newInstance, str2, Class.class.getMethod($$c(bArr3[c5], (short) 518, bArr3[354]), null).invoke(AFa1uSDK.class, null));
                                                                                                                            if (invoke6 != null) {
                                                                                                                                int i96 = i182222;
                                                                                                                                cls36.getDeclaredMethod($$c((byte) (-bArr3[c]), (short) 622, bArr3[782]), new Class[i96]).invoke(newInstance, new Object[i96]);
                                                                                                                            }
                                                                                                                            cls3 = invoke6;
                                                                                                                        } catch (Throwable th60) {
                                                                                                                            Throwable cause40 = th60.getCause();
                                                                                                                            if (cause40 == null) {
                                                                                                                                throw th60;
                                                                                                                            }
                                                                                                                            throw cause40;
                                                                                                                        }
                                                                                                                    } catch (Throwable th61) {
                                                                                                                        th = th61;
                                                                                                                        while (i4 < 7) {
                                                                                                                        }
                                                                                                                        byte[] bArr142222222 = $$a;
                                                                                                                        Object[] objArr42222222 = {$$c(bArr142222222[790], (short) 325, bArr142222222[17]), th};
                                                                                                                        byte b72222222 = bArr142222222[c7];
                                                                                                                        throw ((Throwable) Class.forName($$c(b72222222, (short) ((b72222222 ^ 678) | (b72222222 & 678)), bArr142222222[97])).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42222222));
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c9 = 4;
                                                                                                                    byte[] bArr32 = $$a;
                                                                                                                    byte b37 = bArr32[c7];
                                                                                                                    Class<?> cls37 = Class.forName($$c(b37, (short) ((b37 ^ 318) | (b37 & 318)), bArr32[c3]));
                                                                                                                    byte b38 = bArr32[310];
                                                                                                                    Method declaredMethod2 = cls37.getDeclaredMethod($$c(b38, (short) (b38 | 804), bArr32[19]), String.class);
                                                                                                                    try {
                                                                                                                        declaredMethod2.setAccessible(true);
                                                                                                                        cls3 = declaredMethod2.invoke(newInstance, str2);
                                                                                                                    } catch (InvocationTargetException e4) {
                                                                                                                        try {
                                                                                                                            throw ((Exception) e4.getCause());
                                                                                                                        } catch (ClassNotFoundException unused11) {
                                                                                                                            cls3 = null;
                                                                                                                            if (cls3 == null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                if (cls3 == null) {
                                                                                                                    cls18 = cls3;
                                                                                                                    byte[] bArr33 = $$a;
                                                                                                                    byte b39 = (byte) (-bArr33[c]);
                                                                                                                    str2 = $$c(b39, (short) ((b39 ^ 836) | (b39 & 836)), bArr33[46]);
                                                                                                                    Constructor declaredConstructor3 = cls18.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                    declaredConstructor3.setAccessible(true);
                                                                                                                    afErrorLogForExcManagerOnly = declaredConstructor3.newInstance(newInstance, Boolean.valueOf(!z9));
                                                                                                                    bArr4 = new byte[12304];
                                                                                                                    try {
                                                                                                                        Object[] objArr24 = {AFa1uSDK.class.getResourceAsStream($$c(bArr33[41], (short) 434, bArr33[81]))};
                                                                                                                        byte b40 = bArr33[c7];
                                                                                                                        Object newInstance9 = Class.forName($$c(b40, (short) (b40 | 394), bArr33[17])).getDeclaredConstructor(Class.forName($$c(bArr33[c7], s5, bArr33[97]))).newInstance(objArr24);
                                                                                                                        try {
                                                                                                                            byte b41 = bArr33[c7];
                                                                                                                            Class.forName($$c(b41, (short) ((b41 ^ 394) | (b41 & 394)), bArr33[17])).getMethod($$c((byte) (-bArr33[324]), (short) 160, bArr33[19]), cls2).invoke(newInstance9, bArr4);
                                                                                                                            try {
                                                                                                                                byte b42 = bArr33[c7];
                                                                                                                                Class.forName($$c(b42, (short) ((b42 ^ 394) | (b42 & 394)), bArr33[17])).getMethod($$c((byte) (-bArr33[c]), (short) 622, bArr33[782]), null).invoke(newInstance9, null);
                                                                                                                                i51 = 12265;
                                                                                                                                i50 = Math.abs(i53);
                                                                                                                                bArr20 = bArr4;
                                                                                                                                objArr = r42;
                                                                                                                                z2 = z4;
                                                                                                                                zArr3 = zArr6;
                                                                                                                                zArr2 = zArr5;
                                                                                                                                obj3 = obj9;
                                                                                                                                obj6 = obj8;
                                                                                                                                i182222 = 0;
                                                                                                                                i6 = 782;
                                                                                                                                r42 = r42;
                                                                                                                                zArr6 = zArr6;
                                                                                                                            } catch (Throwable th62) {
                                                                                                                                Throwable cause41 = th62.getCause();
                                                                                                                                if (cause41 == null) {
                                                                                                                                    throw th62;
                                                                                                                                }
                                                                                                                                throw cause41;
                                                                                                                            }
                                                                                                                        } catch (Throwable th63) {
                                                                                                                            Throwable cause42 = th63.getCause();
                                                                                                                            if (cause42 == null) {
                                                                                                                                throw th63;
                                                                                                                            }
                                                                                                                            throw cause42;
                                                                                                                        }
                                                                                                                    } catch (Throwable th64) {
                                                                                                                        Throwable cause43 = th64.getCause();
                                                                                                                        if (cause43 == null) {
                                                                                                                            throw th64;
                                                                                                                        }
                                                                                                                        throw cause43;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    Constructor declaredConstructor4 = cls18.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                    declaredConstructor4.setAccessible(true);
                                                                                                                    if (z9) {
                                                                                                                        z6 = false;
                                                                                                                    } else {
                                                                                                                        int i97 = $11;
                                                                                                                        int i98 = (i97 ^ 115) + ((i97 & 115) << 1);
                                                                                                                        $10 = i98 % 128;
                                                                                                                        int i99 = i98 % 2;
                                                                                                                        z6 = true;
                                                                                                                    }
                                                                                                                    afErrorLogForExcManagerOnly = declaredConstructor4.newInstance(newInstance, Boolean.valueOf(z6));
                                                                                                                    i3 = 2;
                                                                                                                    z2 = true;
                                                                                                                    i182222 = 0;
                                                                                                                    clsArr = null;
                                                                                                                    z5 = true;
                                                                                                                    i2++;
                                                                                                                    i1722 = i3;
                                                                                                                    c8 = c9;
                                                                                                                    clsArr2 = clsArr;
                                                                                                                    z8 = z5;
                                                                                                                    z = z3;
                                                                                                                    cls4 = cls2;
                                                                                                                    $$c = str;
                                                                                                                    zArr = zArr4;
                                                                                                                    objArr = r42;
                                                                                                                    zArr3 = zArr6;
                                                                                                                    zArr2 = zArr5;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th65) {
                                                                                                        try {
                                                                                                            Throwable cause44 = th65.getCause();
                                                                                                            if (cause44 == null) {
                                                                                                                throw th65;
                                                                                                            }
                                                                                                            throw cause44;
                                                                                                        } catch (IOException unused12) {
                                                                                                            byte[] bArr292 = $$a;
                                                                                                            byte b312 = bArr292[c7];
                                                                                                            Class.forName($$c(b312, (short) ((b312 ^ 422) | (b312 & 422)), bArr292[37])).getMethod($$c((byte) (-bArr292[c]), (short) 622, bArr292[i6]), null).invoke(newInstance7, null);
                                                                                                            byte[] bArr3022 = $$a;
                                                                                                            invoke3 = Class.class.getMethod($$c(bArr3022[c5], (short) 518, bArr3022[354]), null).invoke(AFa1uSDK.class, null);
                                                                                                            Class<?> cls3322 = Class.forName($$c((byte) (-bArr3022[2]), (short) ComposerImplKt.nodeKey, bArr3022[14]));
                                                                                                            Class<?>[] clsArr2622 = new Class[2];
                                                                                                            clsArr2622[i182222] = Class.forName($$c(bArr3022[c7], bArr3022[c4], bArr3022[97]));
                                                                                                            byte b3222 = bArr3022[c7];
                                                                                                            clsArr2622[1] = Class.forName($$c(b3222, (short) ((b3222 ^ 318) | (b3222 & 318)), bArr3022[c3]));
                                                                                                            Constructor<?> declaredConstructor22 = cls3322.getDeclaredConstructor(clsArr2622);
                                                                                                            ?? cls3422 = Class.forName($$c(bArr3022[c7], bArr3022[c4], bArr3022[97]));
                                                                                                            String $$c1522 = $$c((byte) (bArr3022[336] - 1), (short) 891, bArr3022[294]);
                                                                                                            Class[] clsArr2722 = new Class[1];
                                                                                                            clsArr2722[i182222] = cls2;
                                                                                                            newInstance = declaredConstructor22.newInstance(cls3422.getMethod($$c1522, clsArr2722).invoke(null, invoke5), invoke3);
                                                                                                            Field declaredField42 = Class.forName($$c((byte) (-bArr3022[2]), (short) 230, bArr3022[28])).getDeclaredField($$c((byte) (bArr3022[777] + 1), (short) i6, bArr3022[790]));
                                                                                                            declaredField42.setAccessible(true);
                                                                                                            Object obj2122 = declaredField42.get(invoke3);
                                                                                                            Class<?> cls3522 = obj2122.getClass();
                                                                                                            Field declaredField222 = cls3522.getDeclaredField($$c(bArr3022[89], (short) 926, bArr3022[92]));
                                                                                                            declaredField222.setAccessible(true);
                                                                                                            Field declaredField322 = cls3522.getDeclaredField($$c(bArr3022[89], (short) 598, bArr3022[35]));
                                                                                                            declaredField322.setAccessible(true);
                                                                                                            Object obj2222 = declaredField222.get(obj2122);
                                                                                                            Object obj2322 = declaredField322.get(obj2122);
                                                                                                            Object obj2422 = declaredField42.get(newInstance);
                                                                                                            ArrayList arrayList22 = new ArrayList((List) obj2222);
                                                                                                            Class<?> componentType22 = obj2322.getClass().getComponentType();
                                                                                                            length = Array.getLength(obj2322);
                                                                                                            Object newInstance822 = Array.newInstance(componentType22, length);
                                                                                                            while (i14 < length) {
                                                                                                            }
                                                                                                            declaredField222.set(obj2422, arrayList22);
                                                                                                            declaredField322.set(obj2422, newInstance822);
                                                                                                            if (AFVersionDeclaration == null) {
                                                                                                            }
                                                                                                            int i9422 = $11 + ModuleDescriptor.MODULE_VERSION;
                                                                                                            $10 = i9422 % 128;
                                                                                                            c10 = 2;
                                                                                                            int i9522 = i9422 % 2;
                                                                                                            zArr6 = zArr6;
                                                                                                            if (z9) {
                                                                                                            }
                                                                                                            if (cls3 == null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th66) {
                                                                                                    Throwable cause45 = th66.getCause();
                                                                                                    if (cause45 == null) {
                                                                                                        throw th66;
                                                                                                    }
                                                                                                    throw cause45;
                                                                                                }
                                                                                            } catch (Throwable th67) {
                                                                                                Throwable cause46 = th67.getCause();
                                                                                                if (cause46 == null) {
                                                                                                    throw th67;
                                                                                                }
                                                                                                throw cause46;
                                                                                            }
                                                                                        } catch (Throwable th68) {
                                                                                            th = th68;
                                                                                            Throwable cause47 = th.getCause();
                                                                                            if (cause47 == null) {
                                                                                                throw th;
                                                                                            }
                                                                                            throw cause47;
                                                                                        }
                                                                                    } catch (Throwable th69) {
                                                                                        th = th69;
                                                                                    }
                                                                                }
                                                                                if (z9) {
                                                                                }
                                                                                if (cls3 == null) {
                                                                                }
                                                                                i51 = 12265;
                                                                                i50 = Math.abs(i53);
                                                                                bArr20 = bArr4;
                                                                                objArr = r42;
                                                                                z2 = z4;
                                                                                zArr3 = zArr6;
                                                                                zArr2 = zArr5;
                                                                                obj3 = obj9;
                                                                                obj6 = obj8;
                                                                                i182222 = 0;
                                                                                i6 = 782;
                                                                                r42 = r42;
                                                                                zArr6 = zArr6;
                                                                            } catch (Throwable th70) {
                                                                                Throwable cause48 = th70.getCause();
                                                                                if (cause48 == null) {
                                                                                    throw th70;
                                                                                }
                                                                                throw cause48;
                                                                            }
                                                                        } catch (Throwable th71) {
                                                                            Throwable cause49 = th71.getCause();
                                                                            if (cause49 == null) {
                                                                                throw th71;
                                                                            }
                                                                            throw cause49;
                                                                        }
                                                                    }
                                                                } catch (Throwable th72) {
                                                                    Throwable cause50 = th72.getCause();
                                                                    if (cause50 == null) {
                                                                        throw th72;
                                                                    }
                                                                    throw cause50;
                                                                }
                                                            } catch (Throwable th73) {
                                                                Throwable cause51 = th73.getCause();
                                                                if (cause51 == null) {
                                                                    throw th73;
                                                                }
                                                                throw cause51;
                                                            }
                                                        } catch (Throwable th74) {
                                                            Throwable cause52 = th74.getCause();
                                                            if (cause52 == null) {
                                                                throw th74;
                                                            }
                                                            throw cause52;
                                                        }
                                                    } catch (Throwable th75) {
                                                        th = th75;
                                                        cls2 = cls4;
                                                        zArr4 = zArr;
                                                        str = $$c;
                                                        z3 = z;
                                                        zArr5 = zArr2;
                                                        r42 = objArr;
                                                        z4 = z2;
                                                        zArr6 = zArr3;
                                                        c9 = c8;
                                                    }
                                                }
                                                z2 = z4;
                                                i2++;
                                                i1722 = i3;
                                                c8 = c9;
                                                clsArr2 = clsArr;
                                                z8 = z5;
                                                z = z3;
                                                cls4 = cls2;
                                                $$c = str;
                                                zArr = zArr4;
                                                objArr = r42;
                                                zArr3 = zArr6;
                                                zArr2 = zArr5;
                                            }
                                            return;
                                        } catch (Throwable th76) {
                                            Throwable cause53 = th76.getCause();
                                            if (cause53 == null) {
                                                throw th76;
                                            }
                                            throw cause53;
                                        }
                                    }
                                    invoke = null;
                                }
                                c6 = 362;
                                c7 = '\n';
                                if (obj2 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr922222 = $$a;
                                short s22222 = (short) 809;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr922222[c7], s22222, bArr922222[c6])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = obj2;
                                c8 = 4;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = obj2;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                int i1822222 = 0;
                                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                i = -1;
                                Class<?> cls722222 = Class.forName($$c((byte) (bArr922222[c4] - 1), bArr922222[351], bArr922222[92]));
                                i16 = cls722222.getDeclaredField($$c(bArr922222[508], (short) 550, (byte) (-bArr922222[472]))).getInt(cls722222);
                                if (i16 < 34) {
                                }
                                if (i16 != 29) {
                                    int i312 = $11 + 3;
                                    $10 = i312 % 128;
                                    int i322 = i312 % 2;
                                    int i332 = 2 % 2;
                                    z7 = true;
                                    zArr3[0] = z7;
                                    zArr3[1] = i16 >= 21;
                                    zArr3[4] = i16 >= 21;
                                    z2 = false;
                                    i2 = 0;
                                    while (!z2) {
                                        if (zArr3[i2]) {
                                        }
                                        z2 = z4;
                                        i2++;
                                        i1722 = i3;
                                        c8 = c9;
                                        clsArr2 = clsArr;
                                        z8 = z5;
                                        z = z3;
                                        cls4 = cls2;
                                        $$c = str;
                                        zArr = zArr4;
                                        objArr = r42;
                                        zArr3 = zArr6;
                                        zArr2 = zArr5;
                                    }
                                }
                                int i1922222 = 2 % 2;
                                z7 = false;
                                zArr3[0] = z7;
                                zArr3[1] = i16 >= 21;
                                zArr3[4] = i16 >= 21;
                                z2 = false;
                                i2 = 0;
                                while (!z2) {
                                }
                            }
                            c4 = '&';
                            c5 = 300;
                            obj2 = null;
                            if (invoke == null) {
                            }
                            c6 = 362;
                            c7 = '\n';
                            if (obj2 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr9222222 = $$a;
                            short s222222 = (short) 809;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9222222[c7], s222222, bArr9222222[c6])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = obj2;
                            c8 = 4;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = obj2;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            int i18222222 = 0;
                            zArr3 = new boolean[]{false, false, true, true, false, true, true};
                            i = -1;
                            Class<?> cls7222222 = Class.forName($$c((byte) (bArr9222222[c4] - 1), bArr9222222[351], bArr9222222[92]));
                            i16 = cls7222222.getDeclaredField($$c(bArr9222222[508], (short) 550, (byte) (-bArr9222222[472]))).getInt(cls7222222);
                            if (i16 < 34) {
                            }
                            if (i16 != 29) {
                            }
                            int i19222222 = 2 % 2;
                            z7 = false;
                            zArr3[0] = z7;
                            zArr3[1] = i16 >= 21;
                            zArr3[4] = i16 >= 21;
                            z2 = false;
                            i2 = 0;
                            while (!z2) {
                            }
                        }
                        c3 = '\r';
                        invoke2 = null;
                        int i17222 = 2;
                        if (obj == null) {
                        }
                        c5 = 300;
                        obj2 = null;
                        if (invoke == null) {
                        }
                        c6 = 362;
                        c7 = '\n';
                        if (obj2 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr92222222 = $$a;
                        short s2222222 = (short) 809;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92222222[c7], s2222222, bArr92222222[c6])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = obj2;
                        c8 = 4;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = obj2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        int i182222222 = 0;
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        i = -1;
                        Class<?> cls72222222 = Class.forName($$c((byte) (bArr92222222[c4] - 1), bArr92222222[351], bArr92222222[92]));
                        i16 = cls72222222.getDeclaredField($$c(bArr92222222[508], (short) 550, (byte) (-bArr92222222[472]))).getInt(cls72222222);
                        if (i16 < 34) {
                        }
                        if (i16 != 29) {
                        }
                        int i192222222 = 2 % 2;
                        z7 = false;
                        zArr3[0] = z7;
                        zArr3[1] = i16 >= 21;
                        zArr3[4] = i16 >= 21;
                        z2 = false;
                        i2 = 0;
                        while (!z2) {
                        }
                    }
                    try {
                        String $$c17 = $$c(bArr[300], (short) 168, bArr[608]);
                        Method method4 = cls.getMethod($$c17, null);
                        invoke = method4.invoke(obj, null);
                    } catch (Exception unused13) {
                        invoke = null;
                        if (obj != null) {
                        }
                        c3 = '\r';
                        invoke2 = null;
                        int i172222 = 2;
                        if (obj == null) {
                        }
                        c5 = 300;
                        obj2 = null;
                        if (invoke == null) {
                        }
                        c6 = 362;
                        c7 = '\n';
                        if (obj2 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr922222222 = $$a;
                        short s22222222 = (short) 809;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr922222222[c7], s22222222, bArr922222222[c6])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = obj2;
                        c8 = 4;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = obj2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        int i1822222222 = 0;
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        i = -1;
                        Class<?> cls722222222 = Class.forName($$c((byte) (bArr922222222[c4] - 1), bArr922222222[351], bArr922222222[92]));
                        i16 = cls722222222.getDeclaredField($$c(bArr922222222[508], (short) 550, (byte) (-bArr922222222[472]))).getInt(cls722222222);
                        if (i16 < 34) {
                        }
                        if (i16 != 29) {
                        }
                        int i1922222222 = 2 % 2;
                        z7 = false;
                        zArr3[0] = z7;
                        zArr3[1] = i16 >= 21;
                        zArr3[4] = i16 >= 21;
                        z2 = false;
                        i2 = 0;
                        while (!z2) {
                        }
                    }
                    if (obj != null) {
                    }
                    c3 = '\r';
                    invoke2 = null;
                    int i1722222 = 2;
                    if (obj == null) {
                    }
                    c5 = 300;
                    obj2 = null;
                    if (invoke == null) {
                    }
                    c6 = 362;
                    c7 = '\n';
                    if (obj2 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr9222222222 = $$a;
                    short s222222222 = (short) 809;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9222222222[c7], s222222222, bArr9222222222[c6])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = obj2;
                    c8 = 4;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = obj2;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    int i18222222222 = 0;
                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                    i = -1;
                    Class<?> cls7222222222 = Class.forName($$c((byte) (bArr9222222222[c4] - 1), bArr9222222222[351], bArr9222222222[92]));
                    i16 = cls7222222222.getDeclaredField($$c(bArr9222222222[508], (short) 550, (byte) (-bArr9222222222[472]))).getInt(cls7222222222);
                    if (i16 < 34) {
                    }
                    if (i16 != 29) {
                    }
                    int i19222222222 = 2 % 2;
                    z7 = false;
                    zArr3[0] = z7;
                    zArr3[1] = i16 >= 21;
                    zArr3[4] = i16 >= 21;
                    z2 = false;
                    i2 = 0;
                    while (!z2) {
                    }
                }
                c2 = 608;
                invoke = null;
                if (obj != null) {
                }
                c3 = '\r';
                invoke2 = null;
                int i17222222 = 2;
                if (obj == null) {
                }
                c5 = 300;
                obj2 = null;
                if (invoke == null) {
                }
                c6 = 362;
                c7 = '\n';
                if (obj2 == null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr92222222222 = $$a;
                short s2222222222 = (short) 809;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92222222222[c7], s2222222222, bArr92222222222[c6])), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = obj2;
                c8 = 4;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = obj2;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                int i182222222222 = 0;
                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                i = -1;
                Class<?> cls72222222222 = Class.forName($$c((byte) (bArr92222222222[c4] - 1), bArr92222222222[351], bArr92222222222[92]));
                i16 = cls72222222222.getDeclaredField($$c(bArr92222222222[508], (short) 550, (byte) (-bArr92222222222[472]))).getInt(cls72222222222);
                if (i16 < 34) {
                }
                if (i16 != 29) {
                }
                int i192222222222 = 2 % 2;
                z7 = false;
                zArr3[0] = z7;
                zArr3[1] = i16 >= 21;
                zArr3[4] = i16 >= 21;
                z2 = false;
                i2 = 0;
                while (!z2) {
                }
            }
            if (obj != null) {
            }
            c2 = 608;
            invoke = null;
            if (obj != null) {
            }
            c3 = '\r';
            invoke2 = null;
            int i172222222 = 2;
            if (obj == null) {
            }
            c5 = 300;
            obj2 = null;
            if (invoke == null) {
            }
            c6 = 362;
            c7 = '\n';
            if (obj2 == null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr922222222222 = $$a;
            short s22222222222 = (short) 809;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr922222222222[c7], s22222222222, bArr922222222222[c6])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = obj2;
            c8 = 4;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = obj2;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            int i1822222222222 = 0;
            zArr3 = new boolean[]{false, false, true, true, false, true, true};
            try {
                i = -1;
            } catch (ClassNotFoundException unused14) {
                i = -1;
            }
            try {
                Class<?> cls722222222222 = Class.forName($$c((byte) (bArr922222222222[c4] - 1), bArr922222222222[351], bArr922222222222[92]));
                i16 = cls722222222222.getDeclaredField($$c(bArr922222222222[508], (short) 550, (byte) (-bArr922222222222[472]))).getInt(cls722222222222);
                if (i16 < 34) {
                }
                if (i16 != 29) {
                }
                int i1922222222222 = 2 % 2;
                z7 = false;
                zArr3[0] = z7;
                zArr3[1] = i16 >= 21;
                zArr3[4] = i16 >= 21;
            } catch (ClassNotFoundException unused15) {
                z = false;
                z2 = false;
                i2 = 0;
                while (!z2) {
                }
            }
            z2 = false;
            i2 = 0;
            while (!z2) {
            }
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
