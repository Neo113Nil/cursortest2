package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.view.InputDeviceCompat;
import com.facebook.imageutils.JfifUtil;
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
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class AFi1fSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static long afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static byte[] afLogForce;
    private static int afRDLog;
    private static int afVerboseLog;
    private static Object d;
    private static Object e;
    private static long force;
    private static byte[] i;
    public static final Map registerClient;
    private static byte[] unregisterClient;
    private static int v;
    public static final Map w;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, short s) {
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        byte[] bArr2;
        int i7 = 2 % 2;
        int i8 = $12 + 35;
        $13 = i8 % 128;
        int i9 = -1;
        if (i8 % 2 == 0) {
            int i10 = i2 * 87;
            bArr2 = $$a;
            i4 = i3 + 6;
            i5 = s + 61;
            bArr = new byte[i10];
            i6 = i10 + 41;
        } else {
            byte[] bArr3 = $$a;
            i4 = i3 + 33;
            i5 = s + 4;
            byte[] bArr4 = new byte[49 - i2];
            i6 = 48 - i2;
            if (bArr3 == null) {
                bArr = bArr4;
                bArr2 = bArr3;
                int i11 = i6;
                int i12 = i6 + (-i5);
                i5 = i5;
                bArr2 = bArr2;
                i9 = -1;
                bArr = bArr;
                i4 = i12;
                i6 = i11;
            } else {
                bArr = bArr4;
                bArr2 = bArr3;
            }
        }
        while (true) {
            int i13 = i9 + 1;
            bArr[i13] = (byte) i4;
            if (i13 == i6) {
                break;
            }
            int i14 = i5 + 1;
            int i15 = i4;
            int i16 = i6;
            byte[] bArr5 = bArr2;
            byte[] bArr6 = bArr;
            int i17 = i15 + (-bArr2[i14]);
            i5 = i14;
            bArr2 = bArr5;
            i9 = i13;
            bArr = bArr6;
            i4 = i17;
            i6 = i16;
        }
        String str = new String(bArr, 0);
        int i18 = $13 + 115;
        $12 = i18 % 128;
        if (i18 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = (i4 & 11) + (i4 | 11);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            byte[] bArr = new byte[1181];
            System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1181);
            $$a = bArr;
            i2 = 69;
        } else {
            byte[] bArr2 = new byte[1181];
            System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr2, 0, 1181);
            $$a = bArr2;
            i2 = 112;
        }
        $$b = i2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:17|(32:1054|1055|(0)|21|(0)|23|24|(0)|37|(0)|(0)|70|71|72|73|74|(0)(0)|77|(0)|1042|82|83|(0)(0)|86|(0)(0)|89|90|91|(0)|1036|1034|1035)|19|(0)|21|(0)|23|24|(0)|37|(0)|(0)|70|71|72|73|74|(0)(0)|77|(0)|1042|82|83|(0)(0)|86|(0)(0)|89|90|91|(0)|1036|1034|1035) */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x046e, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1045:0x046d, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x1c69, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x1c15, code lost:
    
        r1 = r0;
        r3 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01ef, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x19df, code lost:
    
        r8 = r45;
        r2 = r46.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r2.setAccessible(true);
        com.appsflyer.internal.AFi1fSDK.d = r2.newInstance(r1, java.lang.Boolean.valueOf(!r38));
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x1a0b, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x1a0e, code lost:
    
        r1 = com.appsflyer.internal.AFi1fSDK.$10 + 97;
        com.appsflyer.internal.AFi1fSDK.$11 = r1 % 128;
        r1 = r1 % 2;
        r4 = r43;
        r3 = 21;
        r10 = false;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x053d, code lost:
    
        if (r7 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x054d, code lost:
    
        if (r8 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x054f, code lost:
    
        r4 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x0551, code lost:
    
        if (r11 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x0553, code lost:
    
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x055b, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:944:0x054b, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:951:0x0549, code lost:
    
        if (r7 == null) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x1c67 A[Catch: all -> 0x1c69, TryCatch #24 {all -> 0x1c69, blocks: (B:164:0x1bda, B:163:0x1bd7, B:429:0x1a0b, B:769:0x1be9, B:771:0x1bf2, B:772:0x1bf3, B:779:0x1c01, B:781:0x1c0a, B:782:0x1c0b, B:1011:0x1c60, B:1013:0x1c67, B:1014:0x1c68, B:157:0x1bd1), top: B:428:0x1a0b, inners: #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x1c68 A[Catch: all -> 0x1c69, TRY_LEAVE, TryCatch #24 {all -> 0x1c69, blocks: (B:164:0x1bda, B:163:0x1bd7, B:429:0x1a0b, B:769:0x1be9, B:771:0x1bf2, B:772:0x1bf3, B:779:0x1c01, B:781:0x1c0a, B:782:0x1c0b, B:1011:0x1c60, B:1013:0x1c67, B:1014:0x1c68, B:157:0x1bd1), top: B:428:0x1a0b, inners: #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x1e3c  */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:1043:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x1d87  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1db0 A[Catch: Exception -> 0x1ea0, TRY_LEAVE, TryCatch #26 {Exception -> 0x1ea0, blocks: (B:10:0x0190, B:12:0x01a7, B:28:0x02a4, B:33:0x1e97, B:35:0x1e9e, B:36:0x1e9f, B:39:0x02ed, B:48:0x1e84, B:50:0x1e8a, B:51:0x1e8b, B:54:0x1e8d, B:56:0x1e94, B:57:0x1e95, B:60:0x0362, B:66:0x03ad, B:68:0x03b3, B:69:0x03b4, B:70:0x03b5, B:73:0x0407, B:83:0x0449, B:86:0x045f, B:89:0x0466, B:95:0x0479, B:167:0x1d2b, B:171:0x1d95, B:176:0x1dac, B:178:0x1db0, B:184:0x1dc3, B:192:0x1e34, B:194:0x1e3a, B:195:0x1e3b, B:173:0x1d9d, B:187:0x1e02, B:188:0x1e31, B:44:0x033e, B:41:0x0301, B:30:0x02c6, B:62:0x0378), top: B:9:0x0190, inners: #8, #32, #36, #37, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1dbd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1daa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x1780  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x19a8 A[Catch: all -> 0x1bc4, TryCatch #65 {all -> 0x1bc4, blocks: (B:382:0x197f, B:385:0x19a1, B:387:0x19a8, B:388:0x19a9, B:398:0x19ab, B:400:0x19b6, B:401:0x19b7, B:404:0x19b9, B:406:0x19c4, B:407:0x19c5, B:410:0x19c7, B:412:0x19d2, B:413:0x19d3, B:427:0x19df, B:315:0x1a50, B:324:0x1ac0, B:326:0x1ac6, B:327:0x1ac7, B:468:0x1a3c, B:470:0x1a42, B:471:0x1a43, B:483:0x1ad2, B:485:0x1add, B:486:0x1ade, B:510:0x1afd, B:512:0x1b06, B:513:0x1b07, B:519:0x1b09, B:521:0x1b1a, B:522:0x1b1b, B:721:0x1b52, B:723:0x1b59, B:724:0x1b5a, B:730:0x1b5c, B:732:0x1b6c, B:733:0x1b6d, B:737:0x1b82, B:739:0x1b89, B:740:0x1b8a, B:746:0x1b8c, B:748:0x1b9c, B:749:0x1b9d, B:752:0x1b9f, B:754:0x1baf, B:755:0x1bb0, B:758:0x1bb2, B:760:0x1bc2, B:761:0x1bc3, B:203:0x0b3f, B:134:0x0a7d, B:132:0x0a4d, B:370:0x18a1, B:130:0x0a1b, B:368:0x181e, B:318:0x1a8e, B:319:0x1abd, B:366:0x17ed, B:251:0x1369), top: B:381:0x197f, inners: #23, #35, #43, #46, #55, #59, #60, #66, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x19a9 A[Catch: all -> 0x1bc4, TryCatch #65 {all -> 0x1bc4, blocks: (B:382:0x197f, B:385:0x19a1, B:387:0x19a8, B:388:0x19a9, B:398:0x19ab, B:400:0x19b6, B:401:0x19b7, B:404:0x19b9, B:406:0x19c4, B:407:0x19c5, B:410:0x19c7, B:412:0x19d2, B:413:0x19d3, B:427:0x19df, B:315:0x1a50, B:324:0x1ac0, B:326:0x1ac6, B:327:0x1ac7, B:468:0x1a3c, B:470:0x1a42, B:471:0x1a43, B:483:0x1ad2, B:485:0x1add, B:486:0x1ade, B:510:0x1afd, B:512:0x1b06, B:513:0x1b07, B:519:0x1b09, B:521:0x1b1a, B:522:0x1b1b, B:721:0x1b52, B:723:0x1b59, B:724:0x1b5a, B:730:0x1b5c, B:732:0x1b6c, B:733:0x1b6d, B:737:0x1b82, B:739:0x1b89, B:740:0x1b8a, B:746:0x1b8c, B:748:0x1b9c, B:749:0x1b9d, B:752:0x1b9f, B:754:0x1baf, B:755:0x1bb0, B:758:0x1bb2, B:760:0x1bc2, B:761:0x1bc3, B:203:0x0b3f, B:134:0x0a7d, B:132:0x0a4d, B:370:0x18a1, B:130:0x0a1b, B:368:0x181e, B:318:0x1a8e, B:319:0x1abd, B:366:0x17ed, B:251:0x1369), top: B:381:0x197f, inners: #23, #35, #43, #46, #55, #59, #60, #66, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ed A[Catch: Exception -> 0x1ea0, TRY_ENTER, TRY_LEAVE, TryCatch #26 {Exception -> 0x1ea0, blocks: (B:10:0x0190, B:12:0x01a7, B:28:0x02a4, B:33:0x1e97, B:35:0x1e9e, B:36:0x1e9f, B:39:0x02ed, B:48:0x1e84, B:50:0x1e8a, B:51:0x1e8b, B:54:0x1e8d, B:56:0x1e94, B:57:0x1e95, B:60:0x0362, B:66:0x03ad, B:68:0x03b3, B:69:0x03b4, B:70:0x03b5, B:73:0x0407, B:83:0x0449, B:86:0x045f, B:89:0x0466, B:95:0x0479, B:167:0x1d2b, B:171:0x1d95, B:176:0x1dac, B:178:0x1db0, B:184:0x1dc3, B:192:0x1e34, B:194:0x1e3a, B:195:0x1e3b, B:173:0x1d9d, B:187:0x1e02, B:188:0x1e31, B:44:0x033e, B:41:0x0301, B:30:0x02c6, B:62:0x0378), top: B:9:0x0190, inners: #8, #32, #36, #37, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x19df A[EDGE_INSN: B:426:0x19df->B:427:0x19df BREAK  A[LOOP:1: B:144:0x0aed->B:382:0x197f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0cf6 A[Catch: all -> 0x0b11, TryCatch #110 {all -> 0x0b11, blocks: (B:150:0x0af4, B:543:0x0e95, B:688:0x0cf0, B:690:0x0cf6, B:691:0x0cf7), top: B:149:0x0af4 }] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0cf7 A[Catch: all -> 0x0b11, TRY_LEAVE, TryCatch #110 {all -> 0x0b11, blocks: (B:150:0x0af4, B:543:0x0e95, B:688:0x0cf0, B:690:0x0cf6, B:691:0x0cf7), top: B:149:0x0af4 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x047d  */
    /* JADX WARN: Type inference failed for: r10v209, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v39, types: [int, short] */
    /* JADX WARN: Type inference failed for: r11v59, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v64, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v206, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v195, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v215, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v296, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v303, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v312, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v146, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v116, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v143, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v117 */
    /* JADX WARN: Type inference failed for: r8v128, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r8v154 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v172 */
    /* JADX WARN: Type inference failed for: r8v177 */
    /* JADX WARN: Type inference failed for: r8v186 */
    /* JADX WARN: Type inference failed for: r8v192 */
    /* JADX WARN: Type inference failed for: r8v194 */
    /* JADX WARN: Type inference failed for: r8v195 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v79, types: [int] */
    /* JADX WARN: Type inference failed for: r8v83, types: [int] */
    static {
        String $$c;
        String $$c2;
        Object obj;
        Object invoke;
        Object invoke2;
        Object invoke3;
        short s;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        char c;
        boolean z;
        int i2;
        boolean z2;
        Class<byte[]> cls;
        boolean[] zArr4;
        String str;
        char c2;
        boolean z3;
        boolean z4;
        Object[] objArr2;
        boolean[] zArr5;
        boolean z5;
        short s2;
        boolean[] zArr6;
        int i3;
        int i4;
        Object obj2;
        int i5;
        boolean z6;
        boolean z7;
        Object obj3;
        boolean z8;
        Throwable cause;
        Random random;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        boolean z9;
        int i6;
        boolean z10;
        String sb;
        int i7;
        int i8;
        int i9;
        ?? r8;
        ZipFile zipFile;
        ZipFile zipFile2;
        Throwable th;
        ZipFile zipFile3;
        Class cls2;
        Object obj9;
        Object invoke4;
        char c3;
        ZipFile zipFile4;
        Object obj10;
        int i10;
        Object newInstance;
        String str2;
        int i11;
        short s3;
        Object invoke5;
        ZipFile zipFile5;
        ZipFile zipFile6;
        Class cls3;
        Throwable cause2;
        ZipFile zipFile7;
        byte[] bArr;
        Class<?> cls4;
        Method declaredMethod;
        Object obj11;
        byte b;
        ZipFile zipFile8;
        Exception exc;
        Throwable cause3;
        int i12;
        int i13;
        boolean z11;
        char c4;
        Class<byte[]> cls5 = byte[].class;
        init$0();
        try {
            byte[] bArr2 = $$a;
            boolean z12 = false;
            int intValue = ((Integer) Class.forName($$c(bArr2[452], bArr2[272], bArr2[16])).getMethod($$c(bArr2[406], bArr2[205], bArr2[38]), Integer.TYPE).invoke(null, 26)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i14 = 742772630 + (((~((~currentTimeMillis) | 1069991777)) | 2686996) * 98);
            int i15 = ~currentTimeMillis;
            int i16 = (~((i15 & 686539061) | (686539061 ^ i15))) | 1069991777;
            int i17 = ~(((-686539062) & currentTimeMillis) | ((-686539062) ^ currentTimeMillis));
            int i18 = ((i16 & i17) | (i16 ^ i17)) * (-49);
            int i19 = ~((currentTimeMillis & 1069991777) | (1069991777 ^ currentTimeMillis));
            int i20 = ((((i14 | i18) << 1) - (i18 ^ i14)) - (~(-(-(((i19 & 683852065) | (i19 ^ 683852065)) * 49))))) - 1;
            int i21 = (-1768142908) | (~intValue);
            int i22 = ~i21;
            int i23 = (i22 & (-1084853623)) | ((-1084853623) ^ i22);
            int i24 = i23 * 519;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i25 = ~i24;
            int i26 = ~currentTimeMillis2;
            int i27 = (i25 ^ i26) | (i26 & i25);
            int i28 = ~((i27 ^ i20) | (i27 & i20));
            int i29 = ~(i24 | i20 | currentTimeMillis2);
            int i30 = (((i23 * 157257) + (i20 * (-301))) - (~(-(-(((i28 ^ i29) | (i29 & i28)) * (-302)))))) - 1;
            int i31 = (i25 ^ i20) | (i25 & i20);
            int i32 = -(-((~((i31 & currentTimeMillis2) | (i31 ^ currentTimeMillis2))) * (-604)));
            int i33 = (i30 & i32) + (i32 | i30);
            int i34 = ~i20;
            int i35 = ~((i34 & i24) | (i34 ^ i24));
            int i36 = ~(i20 | currentTimeMillis2);
            int i37 = ((i35 & i36) | (i35 ^ i36)) * 302;
            int i38 = (i33 ^ i37) + ((i37 & i33) << 1);
            int i39 = ~((i21 ^ (-1084853623)) | (i21 & (-1084853623)));
            int i40 = ~(((-8914245) & intValue) | ((-8914245) ^ intValue));
            int i41 = (i39 & i40) | (i39 ^ i40);
            int i42 = i41 * (-519);
            int currentTimeMillis3 = (int) System.currentTimeMillis();
            int i43 = ((i41 * (-85635)) - (~(i38 * (-163)))) - 1;
            int i44 = ~currentTimeMillis3;
            int i45 = ~((i44 & i38) | (i44 ^ i38));
            int i46 = ((i45 & i42) | (i42 ^ i45)) * (-328);
            int i47 = (((i43 | i46) << 1) - (i43 ^ i46)) + (((i42 ^ currentTimeMillis3) | (i42 & currentTimeMillis3)) * 164);
            int i48 = ~i42;
            int i49 = ~i38;
            int i50 = ~((i48 & i49) | (i48 ^ i49));
            int i51 = ~((i49 & currentTimeMillis3) | (i49 ^ currentTimeMillis3));
            int i52 = (i50 & i51) | (i50 ^ i51);
            int i53 = ~currentTimeMillis3;
            int i54 = (i42 & i53) | (i53 ^ i42);
            int i55 = ~((i54 & i38) | (i54 ^ i38));
            int i56 = (i47 - (~(((i52 & i55) | (i52 ^ i55)) * 164))) - 1;
            int i57 = ~((intValue & (-1084853623)) | ((-1084853623) ^ intValue));
            if (i56 + (((i57 & 1768142907) | (1768142907 ^ i57)) * 519) == 0) {
                return;
            }
            afDebugLog = -1886363674448001814L;
            afRDLog = -2091678486;
            afVerboseLog = 3;
            afLogForce = new byte[]{38, 96, 106, -118, 84, -88, -26, -119};
            registerClient = new HashMap();
            w = new HashMap();
            try {
                $$c = $$c(bArr2[27], bArr2[82], bArr2[288]);
                $$c2 = d == null ? $$c(bArr2[240], bArr2[82], bArr2[1110]) : null;
                try {
                    obj = Class.forName($$c(bArr2[288], bArr2[272], bArr2[40])).getMethod($$c(bArr2[565], bArr2[82], (short) 92), new Class[0]).invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            if (obj != null) {
                try {
                    Class<?> cls6 = obj.getClass();
                    byte[] bArr3 = $$a;
                    String $$c3 = $$c(bArr3[753], bArr3[427], (short) 150);
                    Method method = cls6.getMethod($$c3, null);
                    invoke = method.invoke(obj, null);
                } catch (Exception unused2) {
                    invoke = null;
                    if (obj != null) {
                        try {
                            Class<?> cls7 = obj.getClass();
                            byte[] bArr4 = $$a;
                            String $$c4 = $$c(bArr4[171], bArr4[427], (short) 160);
                            Method method2 = cls7.getMethod($$c4, null);
                            invoke2 = method2.invoke(obj, null);
                        } catch (Exception unused3) {
                            invoke2 = null;
                            if (obj != null) {
                                try {
                                    Class<?> cls8 = obj.getClass();
                                    byte[] bArr5 = $$a;
                                    String $$c5 = $$c(bArr5[753], bArr5[427], (short) 174);
                                    Method method3 = cls8.getMethod($$c5, null);
                                    invoke3 = method3.invoke(obj, null);
                                } catch (Exception unused4) {
                                    invoke3 = null;
                                    if (invoke == null) {
                                        if ($$c2 == null) {
                                            invoke = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            byte[] bArr6 = $$a;
                                            try {
                                                invoke = Class.forName($$c(bArr6[91], (byte) 73, (short) 194)).getDeclaredConstructor(String.class).newInstance(sb2.append($$c(bArr6[753], bArr6[357], (short) 184)).append($$c2).toString());
                                            } catch (Throwable th2) {
                                                Throwable cause4 = th2.getCause();
                                                if (cause4 == null) {
                                                    throw th2;
                                                }
                                                throw cause4;
                                            }
                                        }
                                    }
                                    if (invoke3 == null) {
                                        byte[] bArr7 = $$a;
                                        byte b2 = (byte) 73;
                                        try {
                                            Object invoke6 = Class.forName($$c(bArr7[176], b2, (short) JfifUtil.MARKER_SOS)).getMethod($$c(bArr7[753], bArr7[427], (short) 233), String.class).invoke(null, $$c(bArr7[890], b2, (short) ((b2 ^ 132) | (b2 & 132))));
                                            int i58 = $11;
                                            int i59 = ((i58 | 27) << 1) - (i58 ^ 27);
                                            $10 = i59 % 128;
                                            int i60 = i59 % 2;
                                            try {
                                                invoke3 = Class.forName($$c(bArr7[91], b2, (short) 194)).getDeclaredConstructor(String.class).newInstance(invoke6);
                                            } catch (Throwable th3) {
                                                Throwable cause5 = th3.getCause();
                                                if (cause5 == null) {
                                                    throw th3;
                                                }
                                                throw cause5;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause6 = th4.getCause();
                                            if (cause6 == null) {
                                                throw th4;
                                            }
                                            throw cause6;
                                        }
                                    }
                                    if (invoke2 == null && invoke != null) {
                                        byte[] bArr8 = $$a;
                                        byte b3 = bArr8[718];
                                        byte b4 = bArr8[82];
                                        try {
                                            byte b5 = (byte) 73;
                                            short s4 = (short) 194;
                                            invoke2 = Class.forName($$c(bArr8[91], b5, s4)).getDeclaredConstructor(Class.forName($$c(bArr8[91], b5, s4)), String.class).newInstance(invoke, $$c(b3, b4, (short) ((b4 ^ 177) | (b4 & 177))));
                                        } catch (Throwable th5) {
                                            Throwable cause7 = th5.getCause();
                                            if (cause7 == null) {
                                                throw th5;
                                            }
                                            throw cause7;
                                        }
                                    }
                                    byte[] bArr9 = $$a;
                                    byte b6 = (byte) 73;
                                    s = (short) 194;
                                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9[91], b6, s)), 7);
                                    objArr[0] = null;
                                    objArr[1] = invoke2;
                                    objArr[2] = invoke;
                                    objArr[3] = invoke3;
                                    objArr[4] = invoke2;
                                    objArr[5] = invoke;
                                    objArr[6] = invoke3;
                                    zArr = new boolean[]{false, true, true, true, true, true, true};
                                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                    c = 21;
                                    byte b7 = bArr9[962];
                                    byte b8 = bArr9[272];
                                    Class<?> cls9 = Class.forName($$c(b7, b8, (short) ((b8 & 188) | (b8 ^ 188))));
                                    i12 = cls9.getDeclaredField($$c(bArr9[805], bArr9[193], (short) 275)).getInt(cls9);
                                    z = i12 < 34;
                                    zArr3[0] = i12 != 29 && i12 >= 26;
                                    if (i12 >= 21) {
                                        int i61 = $10 + 123;
                                        $11 = i61 % 128;
                                        i13 = 2;
                                        int i62 = i61 % 2;
                                        c4 = 1;
                                        z11 = true;
                                    } else {
                                        i13 = 2;
                                        z11 = false;
                                        c4 = 1;
                                    }
                                    zArr3[c4] = z11;
                                    zArr3[4] = i12 >= 21;
                                    int i63 = i13 % i13;
                                    int i64 = i13;
                                    int i65 = i64 % i64;
                                    i2 = 0;
                                    z2 = false;
                                    while (!z2 && i2 < 9) {
                                        if (zArr3[i2]) {
                                            cls = cls5;
                                            zArr4 = zArr;
                                            str = $$c;
                                            c2 = c;
                                            z3 = z;
                                            z4 = z2;
                                            objArr2 = objArr;
                                            zArr5 = zArr3;
                                            z5 = z12;
                                            s2 = s;
                                            zArr6 = zArr2;
                                            i3 = i2;
                                        } else {
                                            System.currentTimeMillis();
                                            System.currentTimeMillis();
                                            try {
                                                z7 = zArr[i2];
                                                try {
                                                    obj3 = objArr[i2];
                                                    z8 = zArr2[i2];
                                                    if (!z7) {
                                                        zArr4 = zArr;
                                                        str = $$c;
                                                    } else {
                                                        if (obj3 != null) {
                                                            try {
                                                                byte[] bArr10 = $$a;
                                                                zArr4 = zArr;
                                                                try {
                                                                    try {
                                                                        str = $$c;
                                                                        try {
                                                                            if (!((Boolean) Class.forName($$c(bArr10[91], b6, s)).getMethod($$c(bArr10[0], bArr10[82], (short) 281), null).invoke(obj3, null)).booleanValue()) {
                                                                                cls = cls5;
                                                                                i4 = i2;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            Throwable th7 = th;
                                                                            cause = th7.getCause();
                                                                            if (cause == null) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        Throwable th72 = th;
                                                                        cause = th72.getCause();
                                                                        if (cause == null) {
                                                                            throw th72;
                                                                        }
                                                                        throw cause;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    Throwable th722 = th;
                                                                    cause = th722.getCause();
                                                                    if (cause == null) {
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } else {
                                                            cls = cls5;
                                                            i4 = i2;
                                                            zArr4 = zArr;
                                                            str = $$c;
                                                        }
                                                        z3 = z;
                                                        z4 = z2;
                                                        objArr2 = objArr;
                                                        zArr5 = zArr3;
                                                        s2 = s;
                                                        zArr6 = zArr2;
                                                        try {
                                                            c2 = 21;
                                                            try {
                                                                try {
                                                                    throw ((Throwable) Class.forName($$c(r2[506], b6, (short) (b6 << 2))).getDeclaredConstructor(String.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[21]), r2[240], (short) 288)).append(obj3).append($$c(r2[527], r2[15], (short) 292)).toString()));
                                                                } catch (Throwable th11) {
                                                                    Throwable cause8 = th11.getCause();
                                                                    if (cause8 == null) {
                                                                        throw th11;
                                                                    }
                                                                    throw cause8;
                                                                }
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                                obj2 = th;
                                                                int currentTimeMillis4 = (int) System.currentTimeMillis();
                                                                i3 = i4;
                                                                int i66 = i3 * (-675);
                                                                int i67 = ((677 | i66) << 1) - (i66 ^ 677);
                                                                int i68 = (currentTimeMillis4 ^ 1) | (currentTimeMillis4 & 1);
                                                                int i69 = ~i3;
                                                                int i70 = i67 + (((i68 & i69) | (i68 ^ i69)) * (-676));
                                                                int i71 = ~((i69 ^ 1) | (i69 & 1));
                                                                int i72 = ~currentTimeMillis4;
                                                                int i73 = (i71 | (~((i72 & 1) | (i72 ^ 1)))) * 676;
                                                                int i74 = ((i70 | i73) << 1) - (i73 ^ i70);
                                                                int i75 = ~i3;
                                                                int i76 = ~(((-2) & i75) | ((-2) ^ i75));
                                                                int i77 = ~currentTimeMillis4;
                                                                int i78 = ~((i75 & i77) | (i75 ^ i77));
                                                                int i79 = (i78 & i76) | (i76 ^ i78);
                                                                int i80 = (i3 ^ 1) | (i3 & 1);
                                                                int i81 = ~((currentTimeMillis4 & i80) | (i80 ^ currentTimeMillis4));
                                                                int i82 = ((i81 & i79) | (i79 ^ i81)) * 676;
                                                                i5 = (i74 ^ i82) + ((i82 & i74) << 1);
                                                                while (true) {
                                                                    if (i5 < 7) {
                                                                    }
                                                                    int i83 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                                    i5 = (i83 ^ (-42)) + ((i83 & (-42)) << 1);
                                                                }
                                                                if (!(!z6)) {
                                                                }
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            c2 = 21;
                                                        }
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    cls = cls5;
                                                    i4 = i2;
                                                    zArr4 = zArr;
                                                    str = $$c;
                                                    z3 = z;
                                                    z4 = z2;
                                                    objArr2 = objArr;
                                                }
                                            } catch (Throwable th15) {
                                                th = th15;
                                                cls = cls5;
                                                i4 = i2;
                                                zArr4 = zArr;
                                                str = $$c;
                                                c2 = c;
                                                z3 = z;
                                                z4 = z2;
                                                objArr2 = objArr;
                                                zArr5 = zArr3;
                                                s2 = s;
                                                zArr6 = zArr2;
                                            }
                                            if (z7) {
                                                try {
                                                    random = new Random();
                                                    int i84 = $10;
                                                    int i85 = ((i84 | 37) << 1) - (i84 ^ 37);
                                                    $11 = i85 % 128;
                                                    if (i85 % 2 == 0) {
                                                        int i86 = 4 % 4;
                                                    }
                                                    try {
                                                        byte[] bArr11 = $$a;
                                                        z4 = z2;
                                                        try {
                                                            try {
                                                                random.setSeed(((Long) Class.forName($$c(bArr11[176], b6, (short) JfifUtil.MARKER_SOS)).getMethod($$c(bArr11[321], bArr11[82], (short) 310), null).invoke(null, null)).longValue() ^ (-1388578780));
                                                                obj4 = null;
                                                                obj5 = null;
                                                                obj6 = null;
                                                                obj7 = null;
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                                cls = cls5;
                                                                i4 = i2;
                                                                z3 = z;
                                                                objArr2 = objArr;
                                                                zArr5 = zArr3;
                                                                zArr6 = zArr2;
                                                                obj2 = th;
                                                                s2 = s;
                                                                c2 = 21;
                                                                int currentTimeMillis42 = (int) System.currentTimeMillis();
                                                                i3 = i4;
                                                                int i662 = i3 * (-675);
                                                                int i672 = ((677 | i662) << 1) - (i662 ^ 677);
                                                                int i682 = (currentTimeMillis42 ^ 1) | (currentTimeMillis42 & 1);
                                                                int i692 = ~i3;
                                                                int i702 = i672 + (((i682 & i692) | (i682 ^ i692)) * (-676));
                                                                int i712 = ~((i692 ^ 1) | (i692 & 1));
                                                                int i722 = ~currentTimeMillis42;
                                                                int i732 = (i712 | (~((i722 & 1) | (i722 ^ 1)))) * 676;
                                                                int i742 = ((i702 | i732) << 1) - (i732 ^ i702);
                                                                int i752 = ~i3;
                                                                int i762 = ~(((-2) & i752) | ((-2) ^ i752));
                                                                int i772 = ~currentTimeMillis42;
                                                                int i782 = ~((i752 & i772) | (i752 ^ i772));
                                                                int i792 = (i782 & i762) | (i762 ^ i782);
                                                                int i802 = (i3 ^ 1) | (i3 & 1);
                                                                int i812 = ~((currentTimeMillis42 & i802) | (i802 ^ currentTimeMillis42));
                                                                int i822 = ((i812 & i792) | (i792 ^ i812)) * 676;
                                                                i5 = (i742 ^ i822) + ((i822 & i742) << 1);
                                                                while (true) {
                                                                    if (i5 < 7) {
                                                                    }
                                                                    int i832 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                                    i5 = (i832 ^ (-42)) + ((i832 & (-42)) << 1);
                                                                }
                                                                if (!(!z6)) {
                                                                }
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            Throwable th18 = th;
                                                            Throwable cause9 = th18.getCause();
                                                            if (cause9 == null) {
                                                                throw th18;
                                                            }
                                                            throw cause9;
                                                        }
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                    }
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    cls = cls5;
                                                    i4 = i2;
                                                    z3 = z;
                                                    z4 = z2;
                                                }
                                                while (obj4 == null) {
                                                    int i87 = $10;
                                                    Object obj12 = obj4;
                                                    int i88 = (i87 & 111) + (i87 | 111);
                                                    objArr2 = objArr;
                                                    $11 = i88 % 128;
                                                    if (i88 % 2 == 0) {
                                                        try {
                                                            int i89 = 75 / 0;
                                                        } catch (Throwable th21) {
                                                            th = th21;
                                                            cls = cls5;
                                                            i4 = i2;
                                                            z3 = z;
                                                            zArr5 = zArr3;
                                                            s2 = s;
                                                            zArr6 = zArr2;
                                                            c2 = 21;
                                                            obj2 = th;
                                                            int currentTimeMillis422 = (int) System.currentTimeMillis();
                                                            i3 = i4;
                                                            int i6622 = i3 * (-675);
                                                            int i6722 = ((677 | i6622) << 1) - (i6622 ^ 677);
                                                            int i6822 = (currentTimeMillis422 ^ 1) | (currentTimeMillis422 & 1);
                                                            int i6922 = ~i3;
                                                            int i7022 = i6722 + (((i6822 & i6922) | (i6822 ^ i6922)) * (-676));
                                                            int i7122 = ~((i6922 ^ 1) | (i6922 & 1));
                                                            int i7222 = ~currentTimeMillis422;
                                                            int i7322 = (i7122 | (~((i7222 & 1) | (i7222 ^ 1)))) * 676;
                                                            int i7422 = ((i7022 | i7322) << 1) - (i7322 ^ i7022);
                                                            int i7522 = ~i3;
                                                            int i7622 = ~(((-2) & i7522) | ((-2) ^ i7522));
                                                            int i7722 = ~currentTimeMillis422;
                                                            int i7822 = ~((i7522 & i7722) | (i7522 ^ i7722));
                                                            int i7922 = (i7822 & i7622) | (i7622 ^ i7822);
                                                            int i8022 = (i3 ^ 1) | (i3 & 1);
                                                            int i8122 = ~((currentTimeMillis422 & i8022) | (i8022 ^ currentTimeMillis422));
                                                            int i8222 = ((i8122 & i7922) | (i7922 ^ i8122)) * 676;
                                                            i5 = (i7422 ^ i8222) + ((i8222 & i7422) << 1);
                                                            while (true) {
                                                                if (i5 < 7) {
                                                                }
                                                                int i8322 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                                i5 = (i8322 ^ (-42)) + ((i8322 & (-42)) << 1);
                                                            }
                                                            if (!(!z6)) {
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        z10 = z7;
                                                        zArr6 = zArr2;
                                                        try {
                                                            int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                            int i90 = i6 * 408;
                                                            int i91 = ((-813) ^ i90) + (((-813) & i90) << 1);
                                                            int i92 = ~i6;
                                                            zArr5 = zArr3;
                                                            int i93 = ~((i92 ^ 1) | (i92 & 1));
                                                            i4 = i2;
                                                            int i94 = ~((currentTimeMillis5 ^ 1) | (currentTimeMillis5 & 1));
                                                            int i95 = ((i93 ^ i94) | (i93 & i94)) * (-814);
                                                            int i96 = (i91 & i95) + (i91 | i95);
                                                            int i97 = ~currentTimeMillis5;
                                                            int i98 = ~((i92 ^ i97) | (i97 & i92));
                                                            int i99 = ((-2) ^ i6) | ((-2) & i6);
                                                            z3 = z;
                                                            int i100 = ~i99;
                                                            int i101 = (i98 ^ i100) | (i100 & i98);
                                                            int i102 = i96 + (((i94 & i101) | (i101 ^ i94)) * 407);
                                                            int i103 = (~i99) | (~(((-2) ^ currentTimeMillis5) | ((-2) & currentTimeMillis5)));
                                                            int i104 = ~((i6 ^ currentTimeMillis5) | (i6 & currentTimeMillis5));
                                                            try {
                                                                StringBuilder sb3 = new StringBuilder((i102 - (~(-(-(((i103 & i104) | (i103 ^ i104)) * 407))))) - 1);
                                                                sb3.append('.');
                                                                int i105 = 0;
                                                                while (i105 < i6) {
                                                                    if (z8) {
                                                                        int nextInt = random.nextInt(26);
                                                                        if (random.nextBoolean()) {
                                                                            int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                            int i106 = (nextInt * 371) + 24115;
                                                                            int i107 = ~currentTimeMillis6;
                                                                            i7 = i6;
                                                                            int i108 = ~(((-66) ^ i107) | ((-66) & i107));
                                                                            cls = cls5;
                                                                            int i109 = ~nextInt;
                                                                            int i110 = ~((i109 ^ currentTimeMillis6) | (i109 & currentTimeMillis6));
                                                                            int i111 = -(-(((i108 ^ i110) | (i110 & i108)) * (-370)));
                                                                            int i112 = (i106 ^ i111) + ((i111 & i106) << 1);
                                                                            int i113 = ~nextInt;
                                                                            int i114 = ~((i113 & i107) | (i113 ^ i107));
                                                                            int i115 = ~(((-66) & currentTimeMillis6) | ((-66) ^ currentTimeMillis6));
                                                                            int i116 = (nextInt & 65) | (nextInt ^ 65);
                                                                            int i117 = -(-(((i114 & i115) | (i114 ^ i115) | (~i116)) * (-370)));
                                                                            int i118 = (i112 & i117) + (i117 | i112);
                                                                            int i119 = -(-((~i116) * 370));
                                                                            i8 = i118 & i119;
                                                                            i9 = i119 | i118;
                                                                        } else {
                                                                            cls = cls5;
                                                                            i7 = i6;
                                                                            int i120 = -(-nextInt);
                                                                            i8 = i120 & 96;
                                                                            i9 = i120 | 96;
                                                                        }
                                                                        try {
                                                                            sb3.append((char) (i8 + i9));
                                                                        } catch (Throwable th22) {
                                                                            th = th22;
                                                                            obj2 = th;
                                                                            s2 = s;
                                                                            c2 = 21;
                                                                            int currentTimeMillis4222 = (int) System.currentTimeMillis();
                                                                            i3 = i4;
                                                                            int i66222 = i3 * (-675);
                                                                            int i67222 = ((677 | i66222) << 1) - (i66222 ^ 677);
                                                                            int i68222 = (currentTimeMillis4222 ^ 1) | (currentTimeMillis4222 & 1);
                                                                            int i69222 = ~i3;
                                                                            int i70222 = i67222 + (((i68222 & i69222) | (i68222 ^ i69222)) * (-676));
                                                                            int i71222 = ~((i69222 ^ 1) | (i69222 & 1));
                                                                            int i72222 = ~currentTimeMillis4222;
                                                                            int i73222 = (i71222 | (~((i72222 & 1) | (i72222 ^ 1)))) * 676;
                                                                            int i74222 = ((i70222 | i73222) << 1) - (i73222 ^ i70222);
                                                                            int i75222 = ~i3;
                                                                            int i76222 = ~(((-2) & i75222) | ((-2) ^ i75222));
                                                                            int i77222 = ~currentTimeMillis4222;
                                                                            int i78222 = ~((i75222 & i77222) | (i75222 ^ i77222));
                                                                            int i79222 = (i78222 & i76222) | (i76222 ^ i78222);
                                                                            int i80222 = (i3 ^ 1) | (i3 & 1);
                                                                            int i81222 = ~((currentTimeMillis4222 & i80222) | (i80222 ^ currentTimeMillis4222));
                                                                            int i82222 = ((i81222 & i79222) | (i79222 ^ i81222)) * 676;
                                                                            i5 = (i74222 ^ i82222) + ((i82222 & i74222) << 1);
                                                                            while (true) {
                                                                                if (i5 < 7) {
                                                                                    z6 = false;
                                                                                    break;
                                                                                }
                                                                                int i121 = $11;
                                                                                int i122 = ((i121 | 31) << 1) - (i121 ^ 31);
                                                                                $10 = i122 % 128;
                                                                                int i123 = i122 % 2;
                                                                                if (!(!zArr5[i5])) {
                                                                                    z6 = true;
                                                                                    break;
                                                                                } else {
                                                                                    int i83222 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                                                    i5 = (i83222 ^ (-42)) + ((i83222 & (-42)) << 1);
                                                                                }
                                                                            }
                                                                            if (!(!z6)) {
                                                                                System.currentTimeMillis();
                                                                                System.currentTimeMillis();
                                                                                byte b9 = $$a[452];
                                                                                int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                                int i124 = 1335 + (b9 * (-667));
                                                                                int i125 = ~b9;
                                                                                int i126 = ~(((-1) ^ currentTimeMillis7) | currentTimeMillis7);
                                                                                int i127 = ((i125 & i126) | (i125 ^ i126)) * (-668);
                                                                                int i128 = (i124 ^ i127) + ((i127 & i124) << 1);
                                                                                int i129 = ~b9;
                                                                                int i130 = ~((i129 & currentTimeMillis7) | (i129 ^ currentTimeMillis7));
                                                                                try {
                                                                                    throw ((Throwable) Class.forName($$c(r2[506], b6, (short) (b6 << 2))).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) ((i128 - (~((i130 | ((-1) ^ i130)) * 1336))) - 669), r2[240], (short) 1106), obj2));
                                                                                } catch (Throwable th23) {
                                                                                    Throwable cause10 = th23.getCause();
                                                                                    if (cause10 == null) {
                                                                                        throw th23;
                                                                                    }
                                                                                    throw cause10;
                                                                                }
                                                                            }
                                                                            d = null;
                                                                            e = null;
                                                                            z5 = false;
                                                                            i2 = i3 + 1;
                                                                            c = c2;
                                                                            z12 = z5;
                                                                            s = s2;
                                                                            zArr = zArr4;
                                                                            $$c = str;
                                                                            z2 = z4;
                                                                            objArr = objArr2;
                                                                            zArr2 = zArr6;
                                                                            z = z3;
                                                                            cls5 = cls;
                                                                            zArr3 = zArr5;
                                                                        }
                                                                    } else {
                                                                        cls = cls5;
                                                                        i7 = i6;
                                                                        int nextInt2 = random.nextInt(12);
                                                                        int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                        int i131 = (nextInt2 * 46) + 376832;
                                                                        int i132 = ~currentTimeMillis8;
                                                                        int i133 = ~((i132 & (-8193)) | ((-8193) ^ i132));
                                                                        int i134 = -(-(((i133 & nextInt2) | (nextInt2 ^ i133)) * (-90)));
                                                                        int i135 = (i131 & i134) + (i131 | i134);
                                                                        int i136 = ~((-8193) | currentTimeMillis8);
                                                                        int i137 = ~((nextInt2 ^ 8192) | (nextInt2 & 8192));
                                                                        int i138 = i135 + (((i136 & i137) | (i136 ^ i137)) * (-45));
                                                                        int i139 = ~nextInt2;
                                                                        int i140 = ~((i139 & currentTimeMillis8) | (i139 ^ currentTimeMillis8));
                                                                        int i141 = ~currentTimeMillis8;
                                                                        int i142 = -(-(((~((nextInt2 & i141) | (i141 ^ nextInt2))) | (i140 & (-8193)) | ((-8193) ^ i140)) * 45));
                                                                        sb3.append((char) (((i138 | i142) << 1) - (i142 ^ i138)));
                                                                    }
                                                                    int i143 = (i105 & (-71)) + (i105 | (-71));
                                                                    i105 = (i143 & 72) + (i143 | 72);
                                                                    cls5 = cls;
                                                                    i6 = i7;
                                                                }
                                                                cls = cls5;
                                                                sb = sb3.toString();
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                                cls = cls5;
                                                            }
                                                        } catch (Throwable th25) {
                                                            th = th25;
                                                            cls = cls5;
                                                            i4 = i2;
                                                            z3 = z;
                                                            zArr5 = zArr3;
                                                        }
                                                    } catch (Throwable th26) {
                                                        th = th26;
                                                        cls = cls5;
                                                        i4 = i2;
                                                        z3 = z;
                                                        zArr5 = zArr3;
                                                        zArr6 = zArr2;
                                                        obj2 = th;
                                                        s2 = s;
                                                        c2 = 21;
                                                        int currentTimeMillis42222 = (int) System.currentTimeMillis();
                                                        i3 = i4;
                                                        int i662222 = i3 * (-675);
                                                        int i672222 = ((677 | i662222) << 1) - (i662222 ^ 677);
                                                        int i682222 = (currentTimeMillis42222 ^ 1) | (currentTimeMillis42222 & 1);
                                                        int i692222 = ~i3;
                                                        int i702222 = i672222 + (((i682222 & i692222) | (i682222 ^ i692222)) * (-676));
                                                        int i712222 = ~((i692222 ^ 1) | (i692222 & 1));
                                                        int i722222 = ~currentTimeMillis42222;
                                                        int i732222 = (i712222 | (~((i722222 & 1) | (i722222 ^ 1)))) * 676;
                                                        int i742222 = ((i702222 | i732222) << 1) - (i732222 ^ i702222);
                                                        int i752222 = ~i3;
                                                        int i762222 = ~(((-2) & i752222) | ((-2) ^ i752222));
                                                        int i772222 = ~currentTimeMillis42222;
                                                        int i782222 = ~((i752222 & i772222) | (i752222 ^ i772222));
                                                        int i792222 = (i782222 & i762222) | (i762222 ^ i782222);
                                                        int i802222 = (i3 ^ 1) | (i3 & 1);
                                                        int i812222 = ~((currentTimeMillis42222 & i802222) | (i802222 ^ currentTimeMillis42222));
                                                        int i822222 = ((i812222 & i792222) | (i792222 ^ i812222)) * 676;
                                                        i5 = (i742222 ^ i822222) + ((i822222 & i742222) << 1);
                                                        while (true) {
                                                            if (i5 < 7) {
                                                            }
                                                            int i832222 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                            i5 = (i832222 ^ (-42)) + ((i832222 & (-42)) << 1);
                                                        }
                                                        if (!(!z6)) {
                                                        }
                                                    }
                                                    if (obj5 == null) {
                                                        try {
                                                            Object[] objArr3 = {obj3, sb};
                                                            byte[] bArr12 = $$a;
                                                            obj5 = Class.forName($$c(bArr12[91], b6, s)).getDeclaredConstructor(Class.forName($$c(bArr12[91], b6, s)), String.class).newInstance(objArr3);
                                                            obj6 = obj6;
                                                        } catch (Throwable th27) {
                                                            Throwable cause11 = th27.getCause();
                                                            if (cause11 == null) {
                                                                throw th27;
                                                            }
                                                            throw cause11;
                                                        }
                                                    } else if (obj6 == null) {
                                                        try {
                                                            Object[] objArr4 = {obj3, sb};
                                                            byte[] bArr13 = $$a;
                                                            obj6 = Class.forName($$c(bArr13[91], b6, s)).getDeclaredConstructor(Class.forName($$c(bArr13[91], b6, s)), String.class).newInstance(objArr4);
                                                        } catch (Throwable th28) {
                                                            Throwable cause12 = th28.getCause();
                                                            if (cause12 == null) {
                                                                throw th28;
                                                            }
                                                            throw cause12;
                                                        }
                                                    } else {
                                                        if (obj7 == null) {
                                                            int i144 = $11;
                                                            int i145 = (i144 ^ 11) + ((i144 & 11) << 1);
                                                            $10 = i145 % 128;
                                                            if (i145 % 2 == 0) {
                                                                int i146 = i144 + 85;
                                                                $10 = i146 % 128;
                                                                int i147 = i146 % 2;
                                                                try {
                                                                    Object[] objArr5 = {obj3, sb};
                                                                    byte[] bArr14 = $$a;
                                                                    obj7 = Class.forName($$c(bArr14[91], b6, s)).getDeclaredConstructor(Class.forName($$c(bArr14[91], b6, s)), String.class).newInstance(objArr5);
                                                                    obj6 = obj6;
                                                                } catch (Throwable th29) {
                                                                    Throwable cause13 = th29.getCause();
                                                                    if (cause13 == null) {
                                                                        throw th29;
                                                                    }
                                                                    throw cause13;
                                                                }
                                                            } else {
                                                                Object obj13 = null;
                                                                try {
                                                                    obj13.hashCode();
                                                                    throw null;
                                                                } catch (Throwable th30) {
                                                                    th = th30;
                                                                    obj2 = th;
                                                                    s2 = s;
                                                                    c2 = 21;
                                                                    int currentTimeMillis422222 = (int) System.currentTimeMillis();
                                                                    i3 = i4;
                                                                    int i6622222 = i3 * (-675);
                                                                    int i6722222 = ((677 | i6622222) << 1) - (i6622222 ^ 677);
                                                                    int i6822222 = (currentTimeMillis422222 ^ 1) | (currentTimeMillis422222 & 1);
                                                                    int i6922222 = ~i3;
                                                                    int i7022222 = i6722222 + (((i6822222 & i6922222) | (i6822222 ^ i6922222)) * (-676));
                                                                    int i7122222 = ~((i6922222 ^ 1) | (i6922222 & 1));
                                                                    int i7222222 = ~currentTimeMillis422222;
                                                                    int i7322222 = (i7122222 | (~((i7222222 & 1) | (i7222222 ^ 1)))) * 676;
                                                                    int i7422222 = ((i7022222 | i7322222) << 1) - (i7322222 ^ i7022222);
                                                                    int i7522222 = ~i3;
                                                                    int i7622222 = ~(((-2) & i7522222) | ((-2) ^ i7522222));
                                                                    int i7722222 = ~currentTimeMillis422222;
                                                                    int i7822222 = ~((i7522222 & i7722222) | (i7522222 ^ i7722222));
                                                                    int i7922222 = (i7822222 & i7622222) | (i7622222 ^ i7822222);
                                                                    int i8022222 = (i3 ^ 1) | (i3 & 1);
                                                                    int i8122222 = ~((currentTimeMillis422222 & i8022222) | (i8022222 ^ currentTimeMillis422222));
                                                                    int i8222222 = ((i8122222 & i7922222) | (i7922222 ^ i8122222)) * 676;
                                                                    i5 = (i7422222 ^ i8222222) + ((i8222222 & i7422222) << 1);
                                                                    while (true) {
                                                                        if (i5 < 7) {
                                                                        }
                                                                        int i8322222 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                                        i5 = (i8322222 ^ (-42)) + ((i8322222 & (-42)) << 1);
                                                                    }
                                                                    if (!(!z6)) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                try {
                                                                    Object[] objArr6 = {obj3, sb};
                                                                    byte[] bArr15 = $$a;
                                                                    Object newInstance2 = Class.forName($$c(bArr15[91], b6, s)).getDeclaredConstructor(Class.forName($$c(bArr15[91], b6, s)), String.class).newInstance(objArr6);
                                                                    try {
                                                                        short s5 = (short) 326;
                                                                        try {
                                                                            Class.forName($$c(bArr15[962], b6, s5)).getMethod($$c((byte) (-bArr15[21]), bArr15[82], (short) 349), null).invoke(Class.forName($$c(bArr15[962], b6, s5)).getDeclaredConstructor(Class.forName($$c(bArr15[91], b6, s))).newInstance(newInstance2), null);
                                                                            obj4 = newInstance2;
                                                                            objArr = objArr2;
                                                                            zArr2 = zArr6;
                                                                            z7 = z10;
                                                                            z = z3;
                                                                            cls5 = cls;
                                                                            zArr3 = zArr5;
                                                                            i2 = i4;
                                                                            obj6 = obj6;
                                                                        } catch (Throwable th31) {
                                                                            Throwable cause14 = th31.getCause();
                                                                            if (cause14 == null) {
                                                                                throw th31;
                                                                            }
                                                                            throw cause14;
                                                                        }
                                                                    } catch (Throwable th32) {
                                                                        Throwable cause15 = th32.getCause();
                                                                        if (cause15 == null) {
                                                                            throw th32;
                                                                        }
                                                                        throw cause15;
                                                                    }
                                                                } catch (Throwable th33) {
                                                                    Throwable cause16 = th33.getCause();
                                                                    if (cause16 == null) {
                                                                        throw th33;
                                                                    }
                                                                    throw cause16;
                                                                }
                                                            } catch (Exception e3) {
                                                                try {
                                                                    throw ((Throwable) Class.forName($$c(r4[506], b6, (short) (b6 << 2))).getDeclaredConstructor(String.class, Throwable.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[21]), r4[240], (short) 353)).append((Object) 2).append($$c(r4[527], r4[15], (short) 292)).toString(), e3));
                                                                } catch (Throwable th34) {
                                                                    Throwable cause17 = th34.getCause();
                                                                    if (cause17 == null) {
                                                                        throw th34;
                                                                    }
                                                                    throw cause17;
                                                                }
                                                            }
                                                        }
                                                        th = th22;
                                                        obj2 = th;
                                                        s2 = s;
                                                        c2 = 21;
                                                        int currentTimeMillis4222222 = (int) System.currentTimeMillis();
                                                        i3 = i4;
                                                        int i66222222 = i3 * (-675);
                                                        int i67222222 = ((677 | i66222222) << 1) - (i66222222 ^ 677);
                                                        int i68222222 = (currentTimeMillis4222222 ^ 1) | (currentTimeMillis4222222 & 1);
                                                        int i69222222 = ~i3;
                                                        int i70222222 = i67222222 + (((i68222222 & i69222222) | (i68222222 ^ i69222222)) * (-676));
                                                        int i71222222 = ~((i69222222 ^ 1) | (i69222222 & 1));
                                                        int i72222222 = ~currentTimeMillis4222222;
                                                        int i73222222 = (i71222222 | (~((i72222222 & 1) | (i72222222 ^ 1)))) * 676;
                                                        int i74222222 = ((i70222222 | i73222222) << 1) - (i73222222 ^ i70222222);
                                                        int i75222222 = ~i3;
                                                        int i76222222 = ~(((-2) & i75222222) | ((-2) ^ i75222222));
                                                        int i77222222 = ~currentTimeMillis4222222;
                                                        int i78222222 = ~((i75222222 & i77222222) | (i75222222 ^ i77222222));
                                                        int i79222222 = (i78222222 & i76222222) | (i76222222 ^ i78222222);
                                                        int i80222222 = (i3 ^ 1) | (i3 & 1);
                                                        int i81222222 = ~((currentTimeMillis4222222 & i80222222) | (i80222222 ^ currentTimeMillis4222222));
                                                        int i82222222 = ((i81222222 & i79222222) | (i79222222 ^ i81222222)) * 676;
                                                        i5 = (i74222222 ^ i82222222) + ((i82222222 & i74222222) << 1);
                                                        while (true) {
                                                            if (i5 < 7) {
                                                            }
                                                            int i83222222 = ((i5 | 43) << 1) - (i5 ^ 43);
                                                            i5 = (i83222222 ^ (-42)) + ((i83222222 & (-42)) << 1);
                                                        }
                                                        if (!(!z6)) {
                                                        }
                                                    }
                                                    obj4 = obj12;
                                                    objArr = objArr2;
                                                    zArr2 = zArr6;
                                                    z7 = z10;
                                                    z = z3;
                                                    cls5 = cls;
                                                    zArr3 = zArr5;
                                                    i2 = i4;
                                                    obj6 = obj6;
                                                }
                                                cls = cls5;
                                                i4 = i2;
                                                obj8 = obj4;
                                                z3 = z;
                                                objArr2 = objArr;
                                                zArr5 = zArr3;
                                                z9 = z7;
                                                zArr6 = zArr2;
                                                r8 = obj6;
                                            } else {
                                                cls = cls5;
                                                i4 = i2;
                                                z3 = z;
                                                z4 = z2;
                                                objArr2 = objArr;
                                                zArr5 = zArr3;
                                                z9 = z7;
                                                zArr6 = zArr2;
                                                obj5 = null;
                                                r8 = 0;
                                                obj7 = null;
                                                obj8 = null;
                                            }
                                            try {
                                                byte[] bArr16 = $$a;
                                                String $$c6 = $$c(bArr16[33], bArr16[357], (short) 357);
                                                int i148 = $11 + 47;
                                                $10 = i148 % 128;
                                                int i149 = i148 % 2;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                String str3 = (String) Class.forName($$c(bArr16[91], b6, (short) 415)).getMethod($$c(bArr16[805], bArr16[427], (short) 426), null).invoke(Class.class.getMethod($$c(bArr16[753], bArr16[427], (short) 405), String.class).invoke(AFi1fSDK.class, $$c6), null);
                                                                StringBuilder sb4 = new StringBuilder();
                                                                byte b10 = bArr16[527];
                                                                byte b11 = bArr16[33];
                                                                ZipFile zipFile9 = new ZipFile(str3.substring(5, str3.lastIndexOf(sb4.append($$c(b10, b11, (short) ((b11 ^ 432) | (b11 & 432)))).append($$c6).toString())));
                                                                try {
                                                                    byte[] bArr17 = new byte[6609];
                                                                    try {
                                                                        short s6 = (short) 458;
                                                                        try {
                                                                            short s7 = (short) 476;
                                                                            Object newInstance3 = Class.forName($$c((byte) (bArr16[452] - 1), b6, s7)).getDeclaredConstructor(Class.forName($$c(bArr16[506], b6, s6))).newInstance(Class.forName($$c(bArr16[283], b6, (short) 432)).getDeclaredConstructor(Class.forName($$c(bArr16[506], b6, s6))).newInstance(zipFile9.getInputStream(zipFile9.getEntry($$c6.substring(1)))));
                                                                            try {
                                                                                ?? cls10 = Class.forName($$c((byte) (bArr16[452] - 1), b6, s7));
                                                                                int i150 = $$b;
                                                                                cls10.getMethod($$c((byte) ((-2) - (bArr16[0] ^ (-1))), (byte) 81, (short) ((i150 ^ 386) | (i150 & 386))), cls).invoke(newInstance3, bArr17);
                                                                                try {
                                                                                    try {
                                                                                        Class.forName($$c((byte) ((-2) - (bArr16[452] ^ (-1))), b6, s7)).getMethod($$c((byte) (-bArr16[21]), bArr16[82], (short) 349), null).invoke(newInstance3, null);
                                                                                        int i151 = 17;
                                                                                        int i152 = 6575;
                                                                                        byte[] bArr18 = bArr17;
                                                                                        String str4 = str;
                                                                                        Class cls11 = null;
                                                                                        int i153 = 1;
                                                                                        Object obj14 = r8;
                                                                                        while (true) {
                                                                                            long j = i153;
                                                                                            int i154 = 0;
                                                                                            Object obj15 = obj14;
                                                                                            while (i154 < bArr18.length) {
                                                                                                try {
                                                                                                    j = ((bArr18[i154] + (j << 6)) + (j << 16)) - j;
                                                                                                    i154++;
                                                                                                    i152 = i152;
                                                                                                    obj5 = obj5;
                                                                                                    obj15 = obj15;
                                                                                                } catch (Throwable th35) {
                                                                                                    th = th35;
                                                                                                    th = th;
                                                                                                    zipFile5 = zipFile9;
                                                                                                    s2 = s;
                                                                                                    zipFile7 = zipFile5;
                                                                                                    zipFile3 = zipFile7;
                                                                                                    try {
                                                                                                        zipFile3.close();
                                                                                                        throw th;
                                                                                                    } catch (Throwable th36) {
                                                                                                        th.addSuppressed(th36);
                                                                                                        throw th;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            int i155 = i152;
                                                                                            Object obj16 = obj5;
                                                                                            Object obj17 = obj15;
                                                                                            bArr18[(i151 ^ 145) + ((i151 & 145) << 1)] = (byte) (bArr18[((i151 | 3471) << 1) - (i151 ^ 3471)] - 89);
                                                                                            int length = bArr18.length;
                                                                                            int i156 = -i151;
                                                                                            r8 = (length & i156) + (length | i156);
                                                                                            try {
                                                                                                Object[] objArr7 = {bArr18, Integer.valueOf(i151), Integer.valueOf((int) r8)};
                                                                                                byte[] bArr19 = $$a;
                                                                                                byte b12 = bArr19[201];
                                                                                                r8 = $$b;
                                                                                                Object newInstance4 = Class.forName($$c(b12, b6, (short) ((r8 ^ 394) | (r8 & 394)))).getDeclaredConstructor(cls, Integer.TYPE, Integer.TYPE).newInstance(objArr7);
                                                                                                Object obj18 = d;
                                                                                                if (obj18 == null) {
                                                                                                    int i157 = $10;
                                                                                                    int i158 = (i157 ^ 121) + ((i157 & 121) << 1);
                                                                                                    $11 = i158 % 128;
                                                                                                    int i159 = i158 % 2;
                                                                                                    try {
                                                                                                        force = j;
                                                                                                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                                                                        int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                                        int i160 = (keyRepeatDelay * 193) - 1172727512;
                                                                                                        int i161 = ~currentTimeMillis9;
                                                                                                        int i162 = ~keyRepeatDelay;
                                                                                                        obj9 = obj7;
                                                                                                        int i163 = ~((i162 ^ (-1741866200)) | (i162 & (-1741866200)));
                                                                                                        int i164 = ((i161 ^ i163) | (i163 & i161)) * (-192);
                                                                                                        int i165 = (i160 & i164) + (i160 | i164);
                                                                                                        int i166 = ~((1741866199 & i162) | (i162 ^ 1741866199));
                                                                                                        int i167 = ~(1741866199 | (~currentTimeMillis9));
                                                                                                        int i168 = ((i166 ^ i167) | (i166 & i167)) * (-384);
                                                                                                        int i169 = (i165 ^ i168) + ((i165 & i168) << 1);
                                                                                                        int i170 = i162 | 1741866199;
                                                                                                        int i171 = ~((i170 & currentTimeMillis9) | (i170 ^ currentTimeMillis9));
                                                                                                        int i172 = (1741866199 ^ i161) | (i161 & 1741866199);
                                                                                                        int i173 = ~((i172 & keyRepeatDelay) | (i172 ^ keyRepeatDelay));
                                                                                                        int i174 = (i171 & i173) | (i171 ^ i173);
                                                                                                        int i175 = keyRepeatDelay | (-1741866200);
                                                                                                        int i176 = ~((i175 & currentTimeMillis9) | (i175 ^ currentTimeMillis9));
                                                                                                        int i177 = i169 + (((i176 & i174) | (i174 ^ i176)) * JfifUtil.MARKER_SOFn);
                                                                                                        int elapsedCpuTime = (int) (force ^ ((Process.getElapsedCpuTime() >> 48) - 627654607517401133L));
                                                                                                        int[] iArr = new int[(int) (force ^ ((-627654607517401132L) - (SystemClock.elapsedRealtime() >> 48)))];
                                                                                                        cls2 = cls11;
                                                                                                        iArr[(int) (force ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) - 627654607517401130L))] = ((int) (afDebugLog >>> ((byte) (31 - (~(-(-KeyEvent.keyCodeFromString("")))))))) ^ i177;
                                                                                                        int i178 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                                                        int i179 = (int) afDebugLog;
                                                                                                        iArr[i178] = ((~i179) & i177) | ((~i177) & i179);
                                                                                                        int i180 = afRDLog;
                                                                                                        byte[] bArr20 = afLogForce;
                                                                                                        try {
                                                                                                            Object[] objArr8 = new Object[6];
                                                                                                            try {
                                                                                                                try {
                                                                                                                    objArr8[5] = Integer.valueOf(afVerboseLog);
                                                                                                                    objArr8[4] = Integer.valueOf(elapsedCpuTime);
                                                                                                                    objArr8[3] = bArr20;
                                                                                                                    objArr8[2] = Integer.valueOf(i180);
                                                                                                                    objArr8[1] = iArr;
                                                                                                                    objArr8[0] = newInstance4;
                                                                                                                    ?? cls12 = Class.forName($$c(bArr19[603], bArr19[82], (short) 533));
                                                                                                                    try {
                                                                                                                        Class[] clsArr = new Class[6];
                                                                                                                        clsArr[0] = Class.forName($$c(bArr19[506], b6, (short) 458));
                                                                                                                        clsArr[1] = int[].class;
                                                                                                                        clsArr[2] = Integer.TYPE;
                                                                                                                        clsArr[3] = cls;
                                                                                                                        clsArr[4] = Integer.TYPE;
                                                                                                                        try {
                                                                                                                            clsArr[5] = Integer.TYPE;
                                                                                                                            invoke4 = cls12.getDeclaredConstructor(clsArr).newInstance(objArr8);
                                                                                                                            c3 = 506;
                                                                                                                        } catch (Throwable th37) {
                                                                                                                            th = th37;
                                                                                                                            Throwable th38 = th;
                                                                                                                            cause3 = th38.getCause();
                                                                                                                            if (cause3 != null) {
                                                                                                                                throw th38;
                                                                                                                            }
                                                                                                                            throw cause3;
                                                                                                                        }
                                                                                                                    } catch (Throwable th39) {
                                                                                                                        th = th39;
                                                                                                                        Throwable th382 = th;
                                                                                                                        cause3 = th382.getCause();
                                                                                                                        if (cause3 != null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (Throwable th40) {
                                                                                                                    th = th40;
                                                                                                                }
                                                                                                            } catch (Throwable th41) {
                                                                                                                th = th41;
                                                                                                            }
                                                                                                        } catch (Throwable th42) {
                                                                                                            th = th42;
                                                                                                        }
                                                                                                    } catch (Throwable th43) {
                                                                                                        th = th43;
                                                                                                        th = th;
                                                                                                        zipFile5 = zipFile9;
                                                                                                        s2 = s;
                                                                                                        zipFile7 = zipFile5;
                                                                                                        zipFile3 = zipFile7;
                                                                                                        zipFile3.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } else {
                                                                                                    cls2 = cls11;
                                                                                                    obj9 = obj7;
                                                                                                    afInfoLog = j;
                                                                                                    int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                                                                    int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                                                    int i181 = touchSlop * (-375);
                                                                                                    int i182 = (i181 ^ (-38015879)) + ((i181 & (-38015879)) << 1);
                                                                                                    int i183 = ~touchSlop;
                                                                                                    int i184 = ~((i183 ^ (-870548082)) | (i183 & (-870548082)));
                                                                                                    int i185 = (i184 & currentTimeMillis10) | (currentTimeMillis10 ^ i184);
                                                                                                    int i186 = ~((touchSlop ^ 870548081) | (touchSlop & 870548081));
                                                                                                    int i187 = ((i185 ^ i186) | (i185 & i186)) * 376;
                                                                                                    int i188 = ((i182 | i187) << 1) - (i182 ^ i187);
                                                                                                    int i189 = ~currentTimeMillis10;
                                                                                                    int i190 = ~((i189 ^ touchSlop) | (i189 & touchSlop));
                                                                                                    int i191 = ((i190 ^ i186) | (i186 & i190)) * (-376);
                                                                                                    int i192 = (i188 ^ i191) + ((i188 & i191) << 1);
                                                                                                    int i193 = -(-(((~((~touchSlop) | currentTimeMillis10)) | 870548081) * 376));
                                                                                                    try {
                                                                                                        try {
                                                                                                            invoke4 = Class.forName($$c(bArr19[27], bArr19[82], (short) 563), true, (ClassLoader) e).getMethod($$c(bArr19[171], bArr19[321], (short) 595), Class.forName($$c(bArr19[506], b6, (short) 458)), Integer.TYPE, Integer.TYPE, Short.TYPE).invoke(obj18, newInstance4, Integer.valueOf((i192 & i193) + (i193 | i192)), Integer.valueOf((int) (afInfoLog ^ (8933485866122133065L - (SystemClock.uptimeMillis() >> 48)))), Short.valueOf((short) (3 - TextUtils.indexOf((CharSequence) "", '0'))));
                                                                                                            c3 = 506;
                                                                                                        } catch (Throwable th44) {
                                                                                                            th = th44;
                                                                                                            Throwable th45 = th;
                                                                                                            Throwable cause18 = th45.getCause();
                                                                                                            if (cause18 == null) {
                                                                                                                throw th45;
                                                                                                            }
                                                                                                            throw cause18;
                                                                                                        }
                                                                                                    } catch (Throwable th46) {
                                                                                                        th = th46;
                                                                                                    }
                                                                                                }
                                                                                                short s8 = (short) 458;
                                                                                                Class<?> cls13 = Class.forName($$c(bArr19[c3], b6, s8));
                                                                                                try {
                                                                                                    byte b13 = bArr19[406];
                                                                                                    byte b14 = bArr19[1127];
                                                                                                    int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                                                    int i194 = b14 * (-463);
                                                                                                    int i195 = (((-465) | i194) << 1) - ((-465) ^ i194);
                                                                                                    int i196 = ~b14;
                                                                                                    int i197 = ~currentTimeMillis11;
                                                                                                    int i198 = ~((i196 ^ i197) | (i196 & i197));
                                                                                                    int i199 = ~((i197 ^ (-1)) | i197);
                                                                                                    int i200 = i195 + (((i198 ^ i199) | (i198 & i199)) * 464);
                                                                                                    int i201 = -(-(((currentTimeMillis11 ^ i196) | (currentTimeMillis11 & i196)) * (-464)));
                                                                                                    int i202 = (i200 & i201) + (i200 | i201);
                                                                                                    int i203 = (~((i196 ^ (-1)) | i196)) * 464;
                                                                                                    cls13.getMethod($$c(b13, (byte) ((i202 & i203) + (i203 | i202)), (short) 609), Long.TYPE).invoke(invoke4, 16);
                                                                                                    if (z9) {
                                                                                                        try {
                                                                                                            Object obj19 = d;
                                                                                                            Object obj20 = obj19 == null ? obj16 : obj17;
                                                                                                            if (obj19 == null) {
                                                                                                                int i204 = $11;
                                                                                                                int i205 = (i204 ^ 45) + ((i204 & 45) << 1);
                                                                                                                $10 = i205 % 128;
                                                                                                                if (i205 % 2 != 0) {
                                                                                                                    int i206 = 61 / 0;
                                                                                                                }
                                                                                                                obj10 = obj9;
                                                                                                            } else {
                                                                                                                obj10 = obj8;
                                                                                                            }
                                                                                                            Method method4 = Class.forName($$c(bArr19[506], b6, s8)).getMethod($$c(bArr19[406], (byte) 81, (short) 612), cls, Integer.TYPE, Integer.TYPE);
                                                                                                            ?? cls14 = Class.forName($$c(bArr19[962], b6, (short) 326));
                                                                                                            try {
                                                                                                                i10 = i151;
                                                                                                                newInstance = cls14.getConstructor(Class.forName($$c(bArr19[91], b6, s))).newInstance(obj20);
                                                                                                                boolean z13 = z3;
                                                                                                                if (!z13) {
                                                                                                                    zipFile4 = zipFile9;
                                                                                                                    str2 = str4;
                                                                                                                    z3 = z13;
                                                                                                                } else {
                                                                                                                    z3 = z13;
                                                                                                                    try {
                                                                                                                        zipFile4 = zipFile9;
                                                                                                                        try {
                                                                                                                            str2 = str4;
                                                                                                                            ((Boolean) Class.forName($$c(bArr19[91], b6, s)).getMethod($$c(bArr19[753], (byte) ((-2) - (bArr19[1127] ^ (-1))), (short) 615), null).invoke(obj20, null)).booleanValue();
                                                                                                                        } catch (Throwable th47) {
                                                                                                                            th = th47;
                                                                                                                            Throwable th48 = th;
                                                                                                                            try {
                                                                                                                                Throwable cause19 = th48.getCause();
                                                                                                                                if (cause19 == null) {
                                                                                                                                    throw th48;
                                                                                                                                }
                                                                                                                                throw cause19;
                                                                                                                            } catch (Exception e4) {
                                                                                                                                e = e4;
                                                                                                                                try {
                                                                                                                                    throw ((Throwable) Class.forName($$c(r3[506], b6, (short) (b6 << 2))).getDeclaredConstructor(String.class, Throwable.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[21]), r3[240], (short) ($$b | InputDeviceCompat.SOURCE_DPAD))).append(obj20).append($$c(r3[527], r3[15], (short) 292)).toString(), e));
                                                                                                                                } catch (Throwable th49) {
                                                                                                                                    Throwable cause20 = th49.getCause();
                                                                                                                                    if (cause20 == null) {
                                                                                                                                        throw th49;
                                                                                                                                    }
                                                                                                                                    throw cause20;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (Throwable th50) {
                                                                                                                        th = th50;
                                                                                                                        zipFile4 = zipFile9;
                                                                                                                    }
                                                                                                                }
                                                                                                                int i207 = $10;
                                                                                                                int i208 = (i207 & 121) + (i207 | 121);
                                                                                                                $11 = i208 % 128;
                                                                                                                int i209 = i208 % 2;
                                                                                                                i11 = 1024;
                                                                                                            } catch (Exception e5) {
                                                                                                                e = e5;
                                                                                                                zipFile4 = zipFile9;
                                                                                                            } catch (Throwable th51) {
                                                                                                                th = th51;
                                                                                                                zipFile4 = zipFile9;
                                                                                                                Throwable th52 = th;
                                                                                                                try {
                                                                                                                    byte[] bArr21 = $$a;
                                                                                                                    short s9 = (short) 701;
                                                                                                                    ((Boolean) Class.forName($$c(bArr21[91], b6, s)).getMethod($$c(bArr21[137], bArr21[40], s9), null).invoke(obj20, null)).booleanValue();
                                                                                                                    try {
                                                                                                                        ((Boolean) Class.forName($$c(bArr21[91], b6, s)).getMethod($$c(bArr21[137], bArr21[40], s9), null).invoke(obj10, null)).booleanValue();
                                                                                                                        throw th52;
                                                                                                                    } catch (Throwable th53) {
                                                                                                                        Throwable cause21 = th53.getCause();
                                                                                                                        if (cause21 == null) {
                                                                                                                            throw th53;
                                                                                                                        }
                                                                                                                        throw cause21;
                                                                                                                    }
                                                                                                                } catch (Throwable th54) {
                                                                                                                    Throwable cause22 = th54.getCause();
                                                                                                                    if (cause22 == null) {
                                                                                                                        throw th54;
                                                                                                                    }
                                                                                                                    throw cause22;
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                byte[] bArr22 = new byte[1024];
                                                                                                                Method method5 = cls14.getMethod($$c((byte) (-bArr19[21]), (byte) 86, (short) (r8 | 517)), cls, Integer.TYPE, Integer.TYPE);
                                                                                                                int i210 = i155;
                                                                                                                while (i210 > 0) {
                                                                                                                    int intValue2 = ((Integer) method4.invoke(invoke4, bArr22, 0, Integer.valueOf(Math.min(i11, i210)))).intValue();
                                                                                                                    if (intValue2 == -1) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    method5.invoke(newInstance, bArr22, 0, Integer.valueOf(intValue2));
                                                                                                                    i210 = (i210 - (~(-intValue2))) - 1;
                                                                                                                    i11 = 1024;
                                                                                                                }
                                                                                                                byte[] bArr23 = $$a;
                                                                                                                byte b15 = (byte) (-bArr23[21]);
                                                                                                                byte b16 = bArr23[427];
                                                                                                                int i211 = $$b;
                                                                                                                Object invoke7 = cls14.getMethod($$c(b15, b16, (short) ((i211 & 521) | (i211 ^ 521))), new Class[0]).invoke(newInstance, new Object[0]);
                                                                                                                Class<?> cls15 = Class.forName($$c(bArr23[452], b6, (short) (b6 | 564)));
                                                                                                                byte b17 = bArr23[406];
                                                                                                                byte b18 = bArr23[1127];
                                                                                                                int currentTimeMillis12 = (int) System.currentTimeMillis();
                                                                                                                int i212 = -(-(b18 * (-445)));
                                                                                                                int i213 = ((445 | i212) << 1) - (i212 ^ 445);
                                                                                                                int i214 = ~b18;
                                                                                                                int i215 = ~i214;
                                                                                                                s3 = s8;
                                                                                                                int i216 = ~currentTimeMillis12;
                                                                                                                int i217 = -(-(((~((i214 ^ i216) | (i216 & i214))) | i215) * 446));
                                                                                                                int i218 = (i213 & i217) + (i213 | i217);
                                                                                                                int i219 = ~b18;
                                                                                                                int i220 = ~(((-1) ^ currentTimeMillis12) | currentTimeMillis12);
                                                                                                                int i221 = ((i219 & i220) | (i219 ^ i220)) * 446;
                                                                                                                int i222 = ((i218 | i221) << 1) - (i221 ^ i218);
                                                                                                                int i223 = (~i214) * 446;
                                                                                                                cls15.getMethod($$c(b17, (byte) ((i222 & i223) + (i223 | i222)), (short) 658), new Class[0]).invoke(invoke7, new Object[0]);
                                                                                                                cls14.getMethod($$c((byte) (-bArr23[21]), bArr23[82], (short) 349), new Class[0]).invoke(newInstance, new Object[0]);
                                                                                                                try {
                                                                                                                    short s10 = (short) 687;
                                                                                                                    try {
                                                                                                                        invoke5 = Class.forName($$c(bArr23[953], bArr23[40], (short) 661)).getDeclaredMethod($$c(bArr23[805], bArr23[1132], (short) 681), String.class, String.class, Integer.TYPE).invoke(null, Class.forName($$c(bArr23[91], b6, s)).getMethod($$c(bArr23[171], bArr23[427], s10), null).invoke(obj20, null), Class.forName($$c(bArr23[91], b6, s)).getMethod($$c(bArr23[171], bArr23[427], s10), null).invoke(obj10, null), 0);
                                                                                                                        try {
                                                                                                                            short s11 = (short) 701;
                                                                                                                            ((Boolean) Class.forName($$c(bArr23[91], b6, s)).getMethod($$c(bArr23[137], bArr23[40], s11), null).invoke(obj20, null)).booleanValue();
                                                                                                                            int i224 = $10;
                                                                                                                            int i225 = (i224 & 69) + (i224 | 69);
                                                                                                                            $11 = i225 % 128;
                                                                                                                            int i226 = i225 % 2;
                                                                                                                            try {
                                                                                                                                ((Boolean) Class.forName($$c(bArr23[91], b6, s)).getMethod($$c(bArr23[137], bArr23[40], s11), null).invoke(obj10, null)).booleanValue();
                                                                                                                                int i227 = $11 + 19;
                                                                                                                                $10 = i227 % 128;
                                                                                                                                int i228 = i227 % 2;
                                                                                                                                try {
                                                                                                                                    if (e == null) {
                                                                                                                                        try {
                                                                                                                                            e = Class.class.getMethod($$c(bArr23[890], bArr23[427], (short) 706), null).invoke(AFi1fSDK.class, null);
                                                                                                                                        } catch (Throwable th55) {
                                                                                                                                            Throwable cause23 = th55.getCause();
                                                                                                                                            if (cause23 == null) {
                                                                                                                                                throw th55;
                                                                                                                                            }
                                                                                                                                            throw cause23;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    s2 = s;
                                                                                                                                } catch (Throwable th56) {
                                                                                                                                    th = th56;
                                                                                                                                    th = th;
                                                                                                                                    s2 = s;
                                                                                                                                    zipFile5 = zipFile4;
                                                                                                                                    zipFile7 = zipFile5;
                                                                                                                                    zipFile3 = zipFile7;
                                                                                                                                    zipFile3.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th57) {
                                                                                                                                Throwable cause24 = th57.getCause();
                                                                                                                                if (cause24 == null) {
                                                                                                                                    throw th57;
                                                                                                                                }
                                                                                                                                throw cause24;
                                                                                                                            }
                                                                                                                        } catch (Throwable th58) {
                                                                                                                            Throwable cause25 = th58.getCause();
                                                                                                                            if (cause25 == null) {
                                                                                                                                throw th58;
                                                                                                                            }
                                                                                                                            throw cause25;
                                                                                                                        }
                                                                                                                    } catch (Throwable th59) {
                                                                                                                        Throwable cause26 = th59.getCause();
                                                                                                                        if (cause26 == null) {
                                                                                                                            throw th59;
                                                                                                                        }
                                                                                                                        throw cause26;
                                                                                                                    }
                                                                                                                } catch (Throwable th60) {
                                                                                                                    Throwable cause27 = th60.getCause();
                                                                                                                    if (cause27 == null) {
                                                                                                                        throw th60;
                                                                                                                    }
                                                                                                                    throw cause27;
                                                                                                                }
                                                                                                            } catch (Throwable th61) {
                                                                                                                th = th61;
                                                                                                                Throwable th522 = th;
                                                                                                                byte[] bArr212 = $$a;
                                                                                                                short s92 = (short) 701;
                                                                                                                ((Boolean) Class.forName($$c(bArr212[91], b6, s)).getMethod($$c(bArr212[137], bArr212[40], s92), null).invoke(obj20, null)).booleanValue();
                                                                                                                ((Boolean) Class.forName($$c(bArr212[91], b6, s)).getMethod($$c(bArr212[137], bArr212[40], s92), null).invoke(obj10, null)).booleanValue();
                                                                                                                throw th522;
                                                                                                            }
                                                                                                        } catch (Throwable th62) {
                                                                                                            th = th62;
                                                                                                            zipFile4 = zipFile9;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i10 = i151;
                                                                                                        zipFile4 = zipFile9;
                                                                                                        str2 = str4;
                                                                                                        try {
                                                                                                            ?? cls16 = Class.forName($$c(bArr19[201], b6, (short) ((b6 ^ 646) | (b6 & 646))));
                                                                                                            short s12 = s8;
                                                                                                            ?? cls17 = Class.forName($$c(bArr19[506], b6, s12));
                                                                                                            Object newInstance5 = cls16.getConstructor(new Class[]{cls17}).newInstance(invoke4);
                                                                                                            try {
                                                                                                                Object invoke8 = cls16.getMethod($$c(bArr19[91], bArr19[427], (short) 746), new Class[0]).invoke(newInstance5, new Object[0]);
                                                                                                                try {
                                                                                                                    Method method6 = Class.forName($$c(bArr19[452], b6, (short) ((r8 ^ 645) | (r8 & 645)))).getMethod($$c(bArr19[805], bArr19[427], (short) 778), new Class[0]);
                                                                                                                    try {
                                                                                                                        Method method7 = cls17.getMethod($$c(bArr19[406], (byte) 81, (short) 612), cls);
                                                                                                                        try {
                                                                                                                            Object newInstance6 = Class.forName($$c(bArr19[283], b6, (short) 432)).getDeclaredConstructor(Class.forName($$c(bArr19[506], b6, s12))).newInstance(newInstance5);
                                                                                                                            int i229 = $10;
                                                                                                                            int i230 = (i229 ^ 61) + ((i229 & 61) << 1);
                                                                                                                            $11 = i230 % 128;
                                                                                                                            int i231 = i230 % 2;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    Object invoke9 = Class.class.getMethod($$c(bArr19[890], bArr19[427], (short) 706), null).invoke(AFi1fSDK.class, null);
                                                                                                                                    ?? cls18 = Class.forName($$c(bArr19[38], b6, (short) 784));
                                                                                                                                    Object newInstance7 = cls18.getConstructor(new Class[0]).newInstance(new Object[0]);
                                                                                                                                    byte b19 = (byte) 86;
                                                                                                                                    Method method8 = cls18.getMethod($$c((byte) (-bArr19[21]), b19, (short) (r8 | 517)), cls, Integer.TYPE, Integer.TYPE);
                                                                                                                                    s2 = s;
                                                                                                                                    try {
                                                                                                                                        Method method9 = cls18.getMethod($$c(bArr19[753], bArr19[1127], (short) 812), new Class[0]);
                                                                                                                                        try {
                                                                                                                                            Method method10 = Class.forName($$c(bArr19[321], b6, (short) 822)).getMethod($$c((byte) (-bArr19[21]), bArr19[82], (short) 349), new Class[0]);
                                                                                                                                            byte[] bArr24 = new byte[1024];
                                                                                                                                            int i232 = 0;
                                                                                                                                            while (true) {
                                                                                                                                                int intValue3 = ((Integer) method7.invoke(newInstance6, bArr24)).intValue();
                                                                                                                                                if (intValue3 <= 0) {
                                                                                                                                                    s3 = s12;
                                                                                                                                                    obj11 = invoke9;
                                                                                                                                                    b = b19;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                Method method11 = method7;
                                                                                                                                                int i233 = $11 + 31;
                                                                                                                                                s3 = s12;
                                                                                                                                                $10 = i233 % 128;
                                                                                                                                                int i234 = i233 % 2;
                                                                                                                                                obj11 = invoke9;
                                                                                                                                                b = b19;
                                                                                                                                                try {
                                                                                                                                                    if (i232 >= ((Long) method6.invoke(invoke8, new Object[0])).longValue()) {
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    int i235 = $11 + 55;
                                                                                                                                                    $10 = i235 % 128;
                                                                                                                                                    int i236 = i235 % 2;
                                                                                                                                                    method8.invoke(newInstance7, bArr24, 0, Integer.valueOf(intValue3));
                                                                                                                                                    int i237 = -(-intValue3);
                                                                                                                                                    i232 = ((i232 | i237) << 1) - (i237 ^ i232);
                                                                                                                                                    s12 = s3;
                                                                                                                                                    method7 = method11;
                                                                                                                                                    invoke9 = obj11;
                                                                                                                                                    b19 = b;
                                                                                                                                                } catch (Throwable th63) {
                                                                                                                                                    th = th63;
                                                                                                                                                    zipFile5 = zipFile4;
                                                                                                                                                    zipFile7 = zipFile5;
                                                                                                                                                    zipFile3 = zipFile7;
                                                                                                                                                    zipFile3.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            byte[] bArr25 = (byte[]) method9.invoke(newInstance7, new Object[0]);
                                                                                                                                            try {
                                                                                                                                                method10.invoke(newInstance6, new Object[0]);
                                                                                                                                                method10.invoke(newInstance7, new Object[0]);
                                                                                                                                            } catch (Exception unused5) {
                                                                                                                                            }
                                                                                                                                            byte[] bArr26 = $$a;
                                                                                                                                            short s13 = (short) ((b6 ^ 800) | (b6 & 800));
                                                                                                                                            Constructor<?> declaredConstructor = Class.forName($$c(bArr26[35], bArr26[40], (short) 838)).getDeclaredConstructor(Class.forName($$c(bArr26[506], b6, s13)), Class.forName($$c(bArr26[953], b6, (short) ((b6 ^ 818) | (b6 & 818)))));
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    Object invoke10 = Class.forName($$c(bArr26[506], b6, s13)).getMethod($$c(bArr26[406], b, (short) 911), cls).invoke(null, bArr25);
                                                                                                                                                    Object obj21 = obj11;
                                                                                                                                                    Object newInstance8 = declaredConstructor.newInstance(invoke10, obj21);
                                                                                                                                                    try {
                                                                                                                                                        Field declaredField = Class.forName($$c(bArr26[13], bArr26[40], (short) 914)).getDeclaredField($$c(bArr26[0], bArr26[1117], (short) 945));
                                                                                                                                                        declaredField.setAccessible(true);
                                                                                                                                                        Object obj22 = declaredField.get(obj21);
                                                                                                                                                        Class<?> cls19 = obj22.getClass();
                                                                                                                                                        byte b20 = (byte) 77;
                                                                                                                                                        Field declaredField2 = cls19.getDeclaredField($$c(bArr26[962], b20, (short) 952));
                                                                                                                                                        declaredField2.setAccessible(true);
                                                                                                                                                        Field declaredField3 = cls19.getDeclaredField($$c(bArr26[325], b20, (short) (b20 | 898)));
                                                                                                                                                        declaredField3.setAccessible(true);
                                                                                                                                                        Object obj23 = declaredField2.get(obj22);
                                                                                                                                                        Object obj24 = declaredField3.get(obj22);
                                                                                                                                                        Object obj25 = declaredField.get(newInstance8);
                                                                                                                                                        ArrayList arrayList = new ArrayList((List) obj23);
                                                                                                                                                        Class<?> cls20 = obj24.getClass();
                                                                                                                                                        try {
                                                                                                                                                            byte b21 = bArr26[176];
                                                                                                                                                            try {
                                                                                                                                                                byte b22 = bArr26[427];
                                                                                                                                                                Class cls21 = (Class) Class.class.getMethod($$c(b21, b22, (short) (b22 | 929)), null).invoke(cls20, null);
                                                                                                                                                                int length2 = Array.getLength(obj24);
                                                                                                                                                                Object newInstance9 = Array.newInstance((Class<?>) cls21, length2);
                                                                                                                                                                for (int i238 = 0; i238 < length2; i238++) {
                                                                                                                                                                    try {
                                                                                                                                                                        Array.set(newInstance9, i238, Array.get(obj24, i238));
                                                                                                                                                                    } catch (Exception e6) {
                                                                                                                                                                        exc = e6;
                                                                                                                                                                        r8 = zipFile4;
                                                                                                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                                                                                                        byte[] bArr27 = $$a;
                                                                                                                                                                        byte b23 = (byte) (-bArr27[21]);
                                                                                                                                                                        byte b24 = bArr27[240];
                                                                                                                                                                        try {
                                                                                                                                                                            throw ((Throwable) Class.forName($$c(bArr27[506], b6, (short) (b6 << 2))).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb5.append($$c(b23, b24, (short) ((b24 ^ 978) | (b24 & 978)))).append(obj21).append($$c(bArr27[527], bArr27[15], (short) 292)).toString(), exc));
                                                                                                                                                                        } catch (Throwable th64) {
                                                                                                                                                                            Throwable cause28 = th64.getCause();
                                                                                                                                                                            if (cause28 == null) {
                                                                                                                                                                                throw th64;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause28;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                declaredField2.set(obj25, arrayList);
                                                                                                                                                                declaredField3.set(obj25, newInstance9);
                                                                                                                                                                if (e == null) {
                                                                                                                                                                    e = newInstance8;
                                                                                                                                                                }
                                                                                                                                                                invoke5 = newInstance8;
                                                                                                                                                            } catch (Throwable th65) {
                                                                                                                                                                th = th65;
                                                                                                                                                                zipFile8 = zipFile4;
                                                                                                                                                                Throwable th66 = th;
                                                                                                                                                                try {
                                                                                                                                                                    Throwable cause29 = th66.getCause();
                                                                                                                                                                    if (cause29 == null) {
                                                                                                                                                                        throw th66;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause29;
                                                                                                                                                                } catch (Exception e7) {
                                                                                                                                                                    e = e7;
                                                                                                                                                                    exc = e;
                                                                                                                                                                    r8 = zipFile8;
                                                                                                                                                                    StringBuilder sb52 = new StringBuilder();
                                                                                                                                                                    byte[] bArr272 = $$a;
                                                                                                                                                                    byte b232 = (byte) (-bArr272[21]);
                                                                                                                                                                    byte b242 = bArr272[240];
                                                                                                                                                                    throw ((Throwable) Class.forName($$c(bArr272[506], b6, (short) (b6 << 2))).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb52.append($$c(b232, b242, (short) ((b242 ^ 978) | (b242 & 978)))).append(obj21).append($$c(bArr272[527], bArr272[15], (short) 292)).toString(), exc));
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th67) {
                                                                                                                                                            th = th67;
                                                                                                                                                            zipFile8 = zipFile4;
                                                                                                                                                        }
                                                                                                                                                    } catch (Exception e8) {
                                                                                                                                                        e = e8;
                                                                                                                                                        zipFile8 = zipFile4;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th68) {
                                                                                                                                                    th = th68;
                                                                                                                                                    Throwable th69 = th;
                                                                                                                                                    Throwable cause30 = th69.getCause();
                                                                                                                                                    if (cause30 == null) {
                                                                                                                                                        throw th69;
                                                                                                                                                    }
                                                                                                                                                    throw cause30;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th70) {
                                                                                                                                                th = th70;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th71) {
                                                                                                                                            th = th71;
                                                                                                                                            r8 = zipFile4;
                                                                                                                                            th = th;
                                                                                                                                            zipFile3 = r8;
                                                                                                                                            zipFile3.close();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th73) {
                                                                                                                                        th = th73;
                                                                                                                                        zipFile = zipFile4;
                                                                                                                                        zipFile2 = zipFile;
                                                                                                                                        r8 = zipFile2;
                                                                                                                                        th = th;
                                                                                                                                        zipFile3 = r8;
                                                                                                                                        zipFile3.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th74) {
                                                                                                                                    th = th74;
                                                                                                                                    Throwable th75 = th;
                                                                                                                                    Throwable cause31 = th75.getCause();
                                                                                                                                    if (cause31 == null) {
                                                                                                                                        throw th75;
                                                                                                                                    }
                                                                                                                                    throw cause31;
                                                                                                                                }
                                                                                                                            } catch (Throwable th76) {
                                                                                                                                th = th76;
                                                                                                                            }
                                                                                                                        } catch (Throwable th77) {
                                                                                                                            Throwable cause32 = th77.getCause();
                                                                                                                            if (cause32 == null) {
                                                                                                                                throw th77;
                                                                                                                            }
                                                                                                                            throw cause32;
                                                                                                                        }
                                                                                                                    } catch (Throwable th78) {
                                                                                                                        th = th78;
                                                                                                                        s2 = s;
                                                                                                                        zipFile2 = zipFile4;
                                                                                                                        r8 = zipFile2;
                                                                                                                        th = th;
                                                                                                                        zipFile3 = r8;
                                                                                                                        zipFile3.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th79) {
                                                                                                                    th = th79;
                                                                                                                    s2 = s;
                                                                                                                    zipFile6 = zipFile4;
                                                                                                                    r8 = zipFile6;
                                                                                                                    th = th;
                                                                                                                    zipFile3 = r8;
                                                                                                                    zipFile3.close();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th80) {
                                                                                                                th = th80;
                                                                                                            }
                                                                                                        } catch (Throwable th81) {
                                                                                                            th = th81;
                                                                                                            s2 = s;
                                                                                                        }
                                                                                                    }
                                                                                                    if (z9) {
                                                                                                        int i239 = $11;
                                                                                                        int i240 = (i239 ^ 55) + ((i239 & 55) << 1);
                                                                                                        $10 = i240 % 128;
                                                                                                        int i241 = i240 % 2;
                                                                                                        try {
                                                                                                            bArr = $$a;
                                                                                                            try {
                                                                                                                cls4 = Class.forName($$c(bArr[953], bArr[40], (short) 661));
                                                                                                                byte b25 = (byte) (bArr[0] - 1);
                                                                                                                byte b26 = bArr[1132];
                                                                                                                int i242 = $$b;
                                                                                                                declaredMethod = cls4.getDeclaredMethod($$c(b25, b26, (short) ((i242 & 906) | (i242 ^ 906))), String.class, Class.forName($$c(bArr[953], b6, (short) (b6 | 818))));
                                                                                                                declaredMethod.setAccessible(true);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                    } catch (Throwable th82) {
                                                                                                                        th = th82;
                                                                                                                        Throwable th83 = th;
                                                                                                                        Throwable cause33 = th83.getCause();
                                                                                                                        if (cause33 == null) {
                                                                                                                            throw th83;
                                                                                                                        }
                                                                                                                        throw cause33;
                                                                                                                    }
                                                                                                                } catch (Throwable th84) {
                                                                                                                    th = th84;
                                                                                                                }
                                                                                                            } catch (Throwable th85) {
                                                                                                                th = th85;
                                                                                                                th = th;
                                                                                                                zipFile7 = zipFile4;
                                                                                                                zipFile3 = zipFile7;
                                                                                                                zipFile3.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (Throwable th86) {
                                                                                                            th = th86;
                                                                                                        }
                                                                                                        try {
                                                                                                            ?? invoke11 = declaredMethod.invoke(invoke5, str2, Class.class.getMethod($$c(bArr[890], bArr[427], (short) 706), null).invoke(AFi1fSDK.class, null));
                                                                                                            if (invoke11 != null) {
                                                                                                                int i243 = $11;
                                                                                                                int i244 = (i243 & 117) + (i243 | 117);
                                                                                                                $10 = i244 % 128;
                                                                                                                int i245 = i244 % 2;
                                                                                                                cls4.getDeclaredMethod($$c((byte) (-bArr[21]), bArr[82], (short) 349), new Class[0]).invoke(invoke5, new Object[0]);
                                                                                                            }
                                                                                                            cls3 = invoke11;
                                                                                                        } catch (Throwable th87) {
                                                                                                            th = th87;
                                                                                                            th = th;
                                                                                                            zipFile7 = zipFile4;
                                                                                                            zipFile3 = zipFile7;
                                                                                                            zipFile3.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } else {
                                                                                                        String str5 = str2;
                                                                                                        byte[] bArr28 = $$a;
                                                                                                        Class<?> cls22 = Class.forName($$c(bArr28[953], b6, (short) ((b6 ^ 818) | (b6 & 818))));
                                                                                                        byte b27 = bArr28[0];
                                                                                                        int currentTimeMillis13 = (int) System.currentTimeMillis();
                                                                                                        int i246 = b27 * (-271);
                                                                                                        int i247 = ((-273) & i246) + (i246 | (-273));
                                                                                                        int i248 = ~b27;
                                                                                                        int i249 = ~currentTimeMillis13;
                                                                                                        int i250 = ~((i248 & i249) | (i248 ^ i249));
                                                                                                        int i251 = ((-1) ^ b27) | b27;
                                                                                                        int i252 = ~((i251 & currentTimeMillis13) | (i251 ^ currentTimeMillis13));
                                                                                                        int i253 = i247 + (((i250 & i252) | (i250 ^ i252)) * (-272));
                                                                                                        int i254 = ~b27;
                                                                                                        int i255 = ~currentTimeMillis13;
                                                                                                        int i256 = ((i254 & i255) | (i254 ^ i255)) * (-272);
                                                                                                        int i257 = ((i253 | i256) << 1) - (i256 ^ i253);
                                                                                                        int i258 = ~(currentTimeMillis13 | ((-1) ^ currentTimeMillis13));
                                                                                                        int i259 = ((i258 & b27) | (b27 ^ i258)) * 272;
                                                                                                        Method declaredMethod2 = cls22.getDeclaredMethod($$c((byte) ((i257 & i259) + (i259 | i257)), bArr28[1132], (short) ($$b | 906)), String.class);
                                                                                                        try {
                                                                                                            declaredMethod2.setAccessible(true);
                                                                                                            cls3 = declaredMethod2.invoke(invoke5, str5);
                                                                                                        } catch (InvocationTargetException e9) {
                                                                                                            try {
                                                                                                                throw ((Exception) e9.getCause());
                                                                                                            } catch (ClassNotFoundException unused6) {
                                                                                                                cls3 = null;
                                                                                                                if (cls3 != null) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    if (cls3 != null) {
                                                                                                        break;
                                                                                                    }
                                                                                                    int i260 = $10;
                                                                                                    int i261 = ((i260 | 69) << 1) - (i260 ^ 69);
                                                                                                    $11 = i261 % 128;
                                                                                                    int i262 = i261 % 2;
                                                                                                    try {
                                                                                                        cls11 = cls3;
                                                                                                        byte[] bArr29 = $$a;
                                                                                                        try {
                                                                                                            String $$c7 = $$c(bArr29[27], bArr29[82], (short) 1026);
                                                                                                            Constructor declaredConstructor2 = cls11.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                            declaredConstructor2.setAccessible(true);
                                                                                                            d = declaredConstructor2.newInstance(invoke5, Boolean.valueOf(!z9));
                                                                                                            byte[] bArr30 = new byte[3489];
                                                                                                            r8 = zipFile4;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    short s14 = s3;
                                                                                                                    try {
                                                                                                                        Object[] objArr9 = {Class.forName($$c(bArr29[283], b6, (short) 432)).getDeclaredConstructor(Class.forName($$c(bArr29[506], b6, s14))).newInstance(r8.getInputStream(r8.getEntry($$c(bArr29[33], bArr29[357], (short) 1058).substring(1))))};
                                                                                                                        byte b28 = bArr29[452];
                                                                                                                        int currentTimeMillis14 = (int) System.currentTimeMillis();
                                                                                                                        int i263 = 518 - (~(b28 * 521));
                                                                                                                        int i264 = ~b28;
                                                                                                                        int i265 = ~currentTimeMillis14;
                                                                                                                        int i266 = ~((i264 ^ i265) | (i264 & i265));
                                                                                                                        int i267 = ~((b28 ^ currentTimeMillis14) | (b28 & currentTimeMillis14));
                                                                                                                        int i268 = -(-(((i266 ^ i267) | (i267 & i266)) * 520));
                                                                                                                        int i269 = ((i263 | i268) << 1) - (i263 ^ i268);
                                                                                                                        int i270 = ~b28;
                                                                                                                        int i271 = ~currentTimeMillis14;
                                                                                                                        int i272 = (~((i271 & i270) | (i270 ^ i271))) * (-1040);
                                                                                                                        int i273 = ((i269 | i272) << 1) - (i272 ^ i269);
                                                                                                                        int i274 = ~i265;
                                                                                                                        int i275 = ~(i270 | (i270 ^ (-1)));
                                                                                                                        int i276 = (i275 & i274) | (i274 ^ i275);
                                                                                                                        int i277 = ~(currentTimeMillis14 | ((-1) ^ currentTimeMillis14));
                                                                                                                        int i278 = ((i277 & i276) | (i276 ^ i277)) * 520;
                                                                                                                        short s15 = (short) 476;
                                                                                                                        Object newInstance10 = Class.forName($$c((byte) (((i273 | i278) << 1) - (i278 ^ i273)), b6, s15)).getDeclaredConstructor(Class.forName($$c(bArr29[506], b6, s14))).newInstance(objArr9);
                                                                                                                        try {
                                                                                                                            ?? cls23 = Class.forName($$c((byte) (bArr29[452] - 1), b6, s15));
                                                                                                                            byte b29 = bArr29[0];
                                                                                                                            int currentTimeMillis15 = (int) System.currentTimeMillis();
                                                                                                                            int i279 = -(-(b29 * 421));
                                                                                                                            int i280 = ((((419 & i279) + (i279 | 419)) + ((~((b29 ^ currentTimeMillis15) | (b29 & currentTimeMillis15))) * 420)) - (~(b29 * (-420)))) - 1;
                                                                                                                            int i281 = ~(~b29);
                                                                                                                            int i282 = ~currentTimeMillis15;
                                                                                                                            int i283 = $$b;
                                                                                                                            cls23.getMethod($$c((byte) ((i280 - (~(-(-(((~((i282 & b29) | (i282 ^ b29))) | i281) * 420))))) - 1), (byte) 81, (short) ((i283 & 386) | (i283 ^ 386))), cls).invoke(newInstance10, bArr30);
                                                                                                                            int i284 = $10 + 53;
                                                                                                                            $11 = i284 % 128;
                                                                                                                            int i285 = i284 % 2;
                                                                                                                            try {
                                                                                                                                byte b30 = bArr29[452];
                                                                                                                                int currentTimeMillis16 = (int) System.currentTimeMillis();
                                                                                                                                int i286 = -(-(b30 * 407));
                                                                                                                                int i287 = (405 & i286) + (i286 | 405);
                                                                                                                                int i288 = ~b30;
                                                                                                                                int i289 = ~((i288 & currentTimeMillis16) | (i288 ^ currentTimeMillis16));
                                                                                                                                int i290 = ~currentTimeMillis16;
                                                                                                                                int i291 = (i290 ^ (-1)) | i290;
                                                                                                                                int i292 = i287 + ((i289 | (~((i291 ^ b30) | (i291 & b30)))) * (-406));
                                                                                                                                int i293 = ~b30;
                                                                                                                                int i294 = (i293 & i290) | (i293 ^ i290);
                                                                                                                                int i295 = -(-((~(i294 | (i294 ^ (-1)))) * (-406)));
                                                                                                                                int i296 = ((i292 | i295) << 1) - (i295 ^ i292);
                                                                                                                                int i297 = ((~currentTimeMillis16) | (~(b30 | i290))) * 406;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        Class.forName($$c((byte) (((i296 | i297) << 1) - (i297 ^ i296)), b6, s15)).getMethod($$c((byte) (-bArr29[21]), bArr29[82], (short) 349), null).invoke(newInstance10, null);
                                                                                                                                        try {
                                                                                                                                            zipFile9 = r8;
                                                                                                                                            str4 = $$c7;
                                                                                                                                            s = s2;
                                                                                                                                            obj5 = obj16;
                                                                                                                                            obj14 = obj17;
                                                                                                                                            obj7 = obj9;
                                                                                                                                            i153 = 1;
                                                                                                                                            bArr18 = bArr30;
                                                                                                                                            i151 = Math.abs(i10);
                                                                                                                                            i152 = 3454;
                                                                                                                                        } catch (Throwable th88) {
                                                                                                                                            th = th88;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th89) {
                                                                                                                                        th = th89;
                                                                                                                                        Throwable th90 = th;
                                                                                                                                        cause2 = th90.getCause();
                                                                                                                                        if (cause2 != null) {
                                                                                                                                            throw th90;
                                                                                                                                        }
                                                                                                                                        throw cause2;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th91) {
                                                                                                                                    th = th91;
                                                                                                                                    Throwable th902 = th;
                                                                                                                                    cause2 = th902.getCause();
                                                                                                                                    if (cause2 != null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Throwable th92) {
                                                                                                                                th = th92;
                                                                                                                            }
                                                                                                                        } catch (Throwable th93) {
                                                                                                                            Throwable cause34 = th93.getCause();
                                                                                                                            if (cause34 == null) {
                                                                                                                                throw th93;
                                                                                                                            }
                                                                                                                            throw cause34;
                                                                                                                        }
                                                                                                                    } catch (Throwable th94) {
                                                                                                                        Throwable cause35 = th94.getCause();
                                                                                                                        if (cause35 == null) {
                                                                                                                            throw th94;
                                                                                                                        }
                                                                                                                        throw cause35;
                                                                                                                    }
                                                                                                                } catch (Throwable th95) {
                                                                                                                    Throwable cause36 = th95.getCause();
                                                                                                                    if (cause36 == null) {
                                                                                                                        throw th95;
                                                                                                                    }
                                                                                                                    throw cause36;
                                                                                                                }
                                                                                                            } catch (Throwable th96) {
                                                                                                                th = th96;
                                                                                                                zipFile6 = r8;
                                                                                                                r8 = zipFile6;
                                                                                                                th = th;
                                                                                                                zipFile3 = r8;
                                                                                                                zipFile3.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (Throwable th97) {
                                                                                                            th = th97;
                                                                                                            r8 = zipFile4;
                                                                                                            th = th;
                                                                                                            zipFile3 = r8;
                                                                                                            zipFile3.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th98) {
                                                                                                        th = th98;
                                                                                                        zipFile6 = zipFile4;
                                                                                                        r8 = zipFile6;
                                                                                                        th = th;
                                                                                                        zipFile3 = r8;
                                                                                                        zipFile3.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Throwable th99) {
                                                                                                    th = th99;
                                                                                                    zipFile2 = zipFile9;
                                                                                                    s2 = s;
                                                                                                }
                                                                                            } catch (Throwable th100) {
                                                                                                Throwable cause37 = th100.getCause();
                                                                                                if (cause37 == null) {
                                                                                                    throw th100;
                                                                                                }
                                                                                                throw cause37;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th101) {
                                                                                        th = th101;
                                                                                        Throwable th102 = th;
                                                                                        Throwable cause38 = th102.getCause();
                                                                                        if (cause38 == null) {
                                                                                            throw th102;
                                                                                        }
                                                                                        throw cause38;
                                                                                    }
                                                                                } catch (Throwable th103) {
                                                                                    th = th103;
                                                                                }
                                                                            } catch (Throwable th104) {
                                                                                Throwable cause39 = th104.getCause();
                                                                                if (cause39 == null) {
                                                                                    throw th104;
                                                                                }
                                                                                throw cause39;
                                                                            }
                                                                        } catch (Throwable th105) {
                                                                            Throwable cause40 = th105.getCause();
                                                                            if (cause40 == null) {
                                                                                throw th105;
                                                                            }
                                                                            throw cause40;
                                                                        }
                                                                    } catch (Throwable th106) {
                                                                        Throwable cause41 = th106.getCause();
                                                                        if (cause41 == null) {
                                                                            throw th106;
                                                                        }
                                                                        throw cause41;
                                                                    }
                                                                } catch (Throwable th107) {
                                                                    th = th107;
                                                                    zipFile = zipFile9;
                                                                    s2 = s;
                                                                }
                                                            } catch (Throwable th108) {
                                                                th = th108;
                                                                Throwable th109 = th;
                                                                Throwable cause42 = th109.getCause();
                                                                if (cause42 == null) {
                                                                    throw th109;
                                                                }
                                                                throw cause42;
                                                            }
                                                        } catch (Throwable th110) {
                                                            th = th110;
                                                        }
                                                    } catch (Throwable th111) {
                                                        th = th111;
                                                        Throwable th112 = th;
                                                        Throwable cause43 = th112.getCause();
                                                        if (cause43 == null) {
                                                            throw th112;
                                                        }
                                                        throw cause43;
                                                    }
                                                } catch (Throwable th113) {
                                                    th = th113;
                                                }
                                            } catch (Throwable th114) {
                                                th = th114;
                                                s2 = s;
                                            }
                                        }
                                        i2 = i3 + 1;
                                        c = c2;
                                        z12 = z5;
                                        s = s2;
                                        zArr = zArr4;
                                        $$c = str;
                                        z2 = z4;
                                        objArr = objArr2;
                                        zArr2 = zArr6;
                                        z = z3;
                                        cls5 = cls;
                                        zArr3 = zArr5;
                                    }
                                    int i298 = $10 + 125;
                                    $11 = i298 % 128;
                                    int i299 = i298 % 2;
                                }
                                if (invoke == null) {
                                }
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                    byte[] bArr82 = $$a;
                                    byte b32 = bArr82[718];
                                    byte b42 = bArr82[82];
                                    byte b52 = (byte) 73;
                                    short s42 = (short) 194;
                                    invoke2 = Class.forName($$c(bArr82[91], b52, s42)).getDeclaredConstructor(Class.forName($$c(bArr82[91], b52, s42)), String.class).newInstance(invoke, $$c(b32, b42, (short) ((b42 ^ 177) | (b42 & 177))));
                                }
                                byte[] bArr92 = $$a;
                                byte b62 = (byte) 73;
                                s = (short) 194;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92[91], b62, s)), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = invoke3;
                                objArr[4] = invoke2;
                                objArr[5] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                                c = 21;
                                byte b72 = bArr92[962];
                                byte b82 = bArr92[272];
                                Class<?> cls92 = Class.forName($$c(b72, b82, (short) ((b82 & 188) | (b82 ^ 188))));
                                i12 = cls92.getDeclaredField($$c(bArr92[805], bArr92[193], (short) 275)).getInt(cls92);
                                if (i12 < 34) {
                                }
                                if (i12 != 29) {
                                    zArr3[0] = i12 != 29 && i12 >= 26;
                                    if (i12 >= 21) {
                                    }
                                    zArr3[c4] = z11;
                                    zArr3[4] = i12 >= 21;
                                    int i632 = i13 % i13;
                                    int i642 = i13;
                                    int i652 = i642 % i642;
                                    i2 = 0;
                                    z2 = false;
                                    while (!z2) {
                                        if (zArr3[i2]) {
                                        }
                                        i2 = i3 + 1;
                                        c = c2;
                                        z12 = z5;
                                        s = s2;
                                        zArr = zArr4;
                                        $$c = str;
                                        z2 = z4;
                                        objArr = objArr2;
                                        zArr2 = zArr6;
                                        z = z3;
                                        cls5 = cls;
                                        zArr3 = zArr5;
                                    }
                                    int i2982 = $10 + 125;
                                    $11 = i2982 % 128;
                                    int i2992 = i2982 % 2;
                                }
                                zArr3[0] = i12 != 29 && i12 >= 26;
                                if (i12 >= 21) {
                                }
                                zArr3[c4] = z11;
                                zArr3[4] = i12 >= 21;
                                int i6322 = i13 % i13;
                                int i6422 = i13;
                                int i6522 = i6422 % i6422;
                                i2 = 0;
                                z2 = false;
                                while (!z2) {
                                }
                                int i29822 = $10 + 125;
                                $11 = i29822 % 128;
                                int i29922 = i29822 % 2;
                            }
                            invoke3 = null;
                            if (invoke == null) {
                            }
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr922 = $$a;
                            byte b622 = (byte) 73;
                            s = (short) 194;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr922[91], b622, s)), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[]{false, false, true, true, false, true, true};
                            c = 21;
                            byte b722 = bArr922[962];
                            byte b822 = bArr922[272];
                            Class<?> cls922 = Class.forName($$c(b722, b822, (short) ((b822 & 188) | (b822 ^ 188))));
                            i12 = cls922.getDeclaredField($$c(bArr922[805], bArr922[193], (short) 275)).getInt(cls922);
                            if (i12 < 34) {
                            }
                            zArr3[0] = i12 != 29 && i12 >= 26;
                            if (i12 >= 21) {
                            }
                            zArr3[c4] = z11;
                            zArr3[4] = i12 >= 21;
                            int i63222 = i13 % i13;
                            int i64222 = i13;
                            int i65222 = i64222 % i64222;
                            i2 = 0;
                            z2 = false;
                            while (!z2) {
                            }
                            int i298222 = $10 + 125;
                            $11 = i298222 % 128;
                            int i299222 = i298222 % 2;
                        }
                        if (obj != null) {
                        }
                        invoke3 = null;
                        if (invoke == null) {
                        }
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr9222 = $$a;
                        byte b6222 = (byte) 73;
                        s = (short) 194;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9222[91], b6222, s)), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = invoke3;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        c = 21;
                        byte b7222 = bArr9222[962];
                        byte b8222 = bArr9222[272];
                        Class<?> cls9222 = Class.forName($$c(b7222, b8222, (short) ((b8222 & 188) | (b8222 ^ 188))));
                        i12 = cls9222.getDeclaredField($$c(bArr9222[805], bArr9222[193], (short) 275)).getInt(cls9222);
                        if (i12 < 34) {
                        }
                        zArr3[0] = i12 != 29 && i12 >= 26;
                        if (i12 >= 21) {
                        }
                        zArr3[c4] = z11;
                        zArr3[4] = i12 >= 21;
                        int i632222 = i13 % i13;
                        int i642222 = i13;
                        int i652222 = i642222 % i642222;
                        i2 = 0;
                        z2 = false;
                        while (!z2) {
                        }
                        int i2982222 = $10 + 125;
                        $11 = i2982222 % 128;
                        int i2992222 = i2982222 % 2;
                    }
                    invoke2 = null;
                    if (obj != null) {
                    }
                    invoke3 = null;
                    if (invoke == null) {
                    }
                    if (invoke3 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr92222 = $$a;
                    byte b62222 = (byte) 73;
                    s = (short) 194;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92222[91], b62222, s)), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = invoke3;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                    c = 21;
                    byte b72222 = bArr92222[962];
                    byte b82222 = bArr92222[272];
                    Class<?> cls92222 = Class.forName($$c(b72222, b82222, (short) ((b82222 & 188) | (b82222 ^ 188))));
                    i12 = cls92222.getDeclaredField($$c(bArr92222[805], bArr92222[193], (short) 275)).getInt(cls92222);
                    if (i12 < 34) {
                    }
                    zArr3[0] = i12 != 29 && i12 >= 26;
                    if (i12 >= 21) {
                    }
                    zArr3[c4] = z11;
                    zArr3[4] = i12 >= 21;
                    int i6322222 = i13 % i13;
                    int i6422222 = i13;
                    int i6522222 = i6422222 % i6422222;
                    i2 = 0;
                    z2 = false;
                    while (!z2) {
                    }
                    int i29822222 = $10 + 125;
                    $11 = i29822222 % 128;
                    int i29922222 = i29822222 % 2;
                }
                if (obj != null) {
                }
                invoke2 = null;
                if (obj != null) {
                }
                invoke3 = null;
                if (invoke == null) {
                }
                if (invoke3 == null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr922222 = $$a;
                byte b622222 = (byte) 73;
                s = (short) 194;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr922222[91], b622222, s)), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = invoke3;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                c = 21;
                byte b722222 = bArr922222[962];
                byte b822222 = bArr922222[272];
                Class<?> cls922222 = Class.forName($$c(b722222, b822222, (short) ((b822222 & 188) | (b822222 ^ 188))));
                i12 = cls922222.getDeclaredField($$c(bArr922222[805], bArr922222[193], (short) 275)).getInt(cls922222);
                if (i12 < 34) {
                }
                zArr3[0] = i12 != 29 && i12 >= 26;
                if (i12 >= 21) {
                }
                zArr3[c4] = z11;
                zArr3[4] = i12 >= 21;
                int i63222222 = i13 % i13;
                int i64222222 = i13;
                int i65222222 = i64222222 % i64222222;
                i2 = 0;
                z2 = false;
                while (!z2) {
                }
                int i298222222 = $10 + 125;
                $11 = i298222222 % 128;
                int i299222222 = i298222222 % 2;
            }
            invoke = null;
            if (obj != null) {
            }
            invoke2 = null;
            if (obj != null) {
            }
            invoke3 = null;
            if (invoke == null) {
            }
            if (invoke3 == null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr9222222 = $$a;
            byte b6222222 = (byte) 73;
            s = (short) 194;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr9222222[91], b6222222, s)), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = invoke3;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = invoke3;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[]{false, false, true, true, false, true, true};
            c = 21;
            byte b7222222 = bArr9222222[962];
            byte b8222222 = bArr9222222[272];
            Class<?> cls9222222 = Class.forName($$c(b7222222, b8222222, (short) ((b8222222 & 188) | (b8222222 ^ 188))));
            i12 = cls9222222.getDeclaredField($$c(bArr9222222[805], bArr9222222[193], (short) 275)).getInt(cls9222222);
            if (i12 < 34) {
            }
            zArr3[0] = i12 != 29 && i12 >= 26;
            if (i12 >= 21) {
            }
            zArr3[c4] = z11;
            zArr3[4] = i12 >= 21;
            int i632222222 = i13 % i13;
            int i642222222 = i13;
            int i652222222 = i642222222 % i642222222;
            i2 = 0;
            z2 = false;
            while (!z2) {
            }
            int i2982222222 = $10 + 125;
            $11 = i2982222222 % 128;
            int i2992222222 = i2982222222 % 2;
            try {
                byte[] bArr31 = $$a;
                byte b31 = bArr31[452];
                byte b33 = bArr31[272];
                Method method12 = Class.forName($$c(b31, b33, (short) ((b33 ^ 45) | (b33 & 45)))).getMethod($$c(bArr31[953], bArr31[427], (short) 130), new Class[0]);
                obj = method12.invoke(null, null);
            } catch (Exception unused7) {
            }
            if (obj != null) {
            }
            invoke = null;
            if (obj != null) {
            }
            invoke2 = null;
            if (obj != null) {
            }
            invoke3 = null;
            if (invoke == null) {
            }
            if (invoke3 == null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr92222222 = $$a;
            byte b62222222 = (byte) 73;
            s = (short) 194;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr92222222[91], b62222222, s)), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = invoke3;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = invoke3;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[]{false, false, true, true, false, true, true};
            c = 21;
            byte b72222222 = bArr92222222[962];
            byte b82222222 = bArr92222222[272];
            Class<?> cls92222222 = Class.forName($$c(b72222222, b82222222, (short) ((b82222222 & 188) | (b82222222 ^ 188))));
            i12 = cls92222222.getDeclaredField($$c(bArr92222222[805], bArr92222222[193], (short) 275)).getInt(cls92222222);
            if (i12 < 34) {
            }
            zArr3[0] = i12 != 29 && i12 >= 26;
            if (i12 >= 21) {
            }
            zArr3[c4] = z11;
            zArr3[4] = i12 >= 21;
            int i6322222222 = i13 % i13;
            int i6422222222 = i13;
            int i6522222222 = i6422222222 % i6422222222;
            i2 = 0;
            z2 = false;
            while (!z2) {
            }
            int i29822222222 = $10 + 125;
            $11 = i29822222222 % 128;
            int i29922222222 = i29822222222 % 2;
        } catch (Throwable th115) {
            Throwable cause44 = th115.getCause();
            if (cause44 == null) {
                throw th115;
            }
            throw cause44;
        }
    }

    public static int getCurrencyIso4217Code(int i2) {
        Object obj;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 97;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            obj = d;
            int i6 = 11 / 0;
        } else {
            obj = d;
        }
        int i7 = (i4 ^ 85) + ((i4 & 85) << 1);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) e).getMethod($$c(bArr[718], bArr[427], (short) 1167), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getCurrencyIso4217Code(Object obj) {
        Object obj2;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 & 63) + (i3 | 63);
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            obj2 = d;
            int i6 = 46 / 0;
        } else {
            obj2 = d;
        }
        int i7 = i5 + 51;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 3 % 5;
        }
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) e).getMethod($$c(bArr[452], bArr[427], (short) ($$b | 1034)), Object.class).invoke(obj2, obj)).intValue();
            int i9 = $11 + 9;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(char c, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 & 89) + (i5 | 89);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = d;
        int i8 = (i5 & 105) + (i5 | 105);
        int i9 = i8 % 128;
        $11 = i9;
        int i10 = i8 % 2;
        int i11 = (i9 & 79) + (i9 | 79);
        $10 = i11 % 128;
        int i12 = i11 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i2), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            return Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) e).getMethod($$c(bArr[506], bArr[427], (short) 1128), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFi1fSDK() {
    }

    private static void getRevenue(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10 + 49;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
