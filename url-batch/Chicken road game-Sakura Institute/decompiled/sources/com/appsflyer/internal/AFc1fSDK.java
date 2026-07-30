package com.appsflyer.internal;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.PointerIconCompat;
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
import okhttp3.internal.http.StatusLine;

/* loaded from: classes3.dex */
public class AFc1fSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    public static final Map<Integer, Object> afDebugLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static final Map<String, Object> afLogForce;
    private static long getCurrency;
    private static byte[] getLevel;
    private static int getPrice;
    private static byte[] getPurchaseToken;
    private static int getPurchaseType;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        r8 = r11;
        r11 = r10;
        r10 = r5;
        r5 = r1;
        r1 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = (i3 & 45) + (i3 | 45);
        $11 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = -b;
        int i7 = (i6 & 36) + (i6 | 36);
        int i8 = s + 41;
        int i9 = -s2;
        int i10 = (i9 & 950) + (i9 | 950);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        int i11 = (~i7) + (i7 << 1);
        if (bArr == null) {
            int i12 = i3 + 63;
            int i13 = i12 % 128;
            $11 = i13;
            if (i12 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i14 = i13 + 13;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i10;
            int i17 = 0;
            int i18 = (i10 ^ i8) + ((i8 & i10) << 1);
            i10 = i16 + 1;
            i8 = i18 + 1;
            int i19 = $11 + 103;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            i = i17;
            bArr2[i] = (byte) i8;
            if (i == i11) {
                String str = new String(bArr2, 0);
                int i21 = $11;
                int i22 = (i21 ^ 45) + ((i21 & 45) << 1);
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 51 / 0;
                }
                return str;
            }
            int i24 = i + 1;
            byte b2 = bArr[i10];
            int i25 = $10;
            int i26 = (i25 ^ 9) + ((i25 & 9) << 1);
            $11 = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 3 / 4;
            }
            int i28 = i10;
            i10 = i8;
            i8 = b2;
            i17 = i24;
            i16 = i28;
            int i182 = (i10 ^ i8) + ((i8 & i10) << 1);
            i10 = i16 + 1;
            i8 = i182 + 1;
            int i192 = $11 + 103;
            $10 = i192 % 128;
            int i202 = i192 % 2;
            i = i17;
            bArr2[i] = (byte) i8;
            if (i == i11) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i8;
            if (i == i11) {
            }
        }
    }

    public static int AFInAppEventType(int i) {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = i3 + 69;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Object obj = AFLogger$LogLevel;
        int i5 = i3 + 67;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c(r1[113], r1[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r1[36], (byte) (-$$a[342]), (short) 405), Integer.TYPE).invoke(obj, Integer.valueOf(i))).intValue();
            int i7 = $10 + 87;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 ^ 43) + ((i3 & 43) << 1);
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            byte[] bArr = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr, 0, 968);
            $$a = bArr;
            i = 12074;
        } else {
            byte[] bArr2 = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr2, 0, 968);
            $$a = bArr2;
            i = 143;
        }
        $$b = i;
    }

    public static int valueOf(Object obj) {
        int i = 2 % 2;
        int i2 = $11;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        $10 = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = AFLogger$LogLevel;
        int i5 = (i2 & 87) + (i2 | 87);
        $10 = i5 % 128;
        int i6 = i5 % 2;
        try {
            int intValue = ((Integer) Class.forName($$c(r1[113], r1[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r1[5], (byte) (-$$a[342]), (short) 576), Object.class).invoke(obj2, obj)).intValue();
            int i7 = $11;
            int i8 = (i7 & 87) + (i7 | 87);
            $10 = i8 % 128;
            int i9 = i8 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object valueOf(int i, int i2, char c) {
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 81;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object obj = AFLogger$LogLevel;
        int i7 = i4 + 115;
        int i8 = i7 % 128;
        $10 = i8;
        int i9 = i7 % 2;
        int i10 = (i8 & 77) + (i8 | 77);
        $11 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object invoke = Class.forName($$c(r7[113], r7[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r7[5], (byte) (-$$a[342]), (short) 576), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c));
            int i12 = $11 + 107;
            $10 = i12 % 128;
            if (i12 % 2 == 0) {
                return invoke;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFc1fSDK() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:861)(1:(1:972)(13:(1:974)(1:975)|863|864|865|866|867|(2:(6:870|871|872|(1:874)(1:878)|875|876)(2:881|882)|877)|883|884|(4:886|887|888|889)(1:(4:901|902|903|904)(14:(4:913|914|915|916)(10:924|925|926|928|929|930|931|932|933|892)|879|880|107|108|109|(2:111|(5:113|114|115|116|(4:118|119|120|121)(2:123|124))(2:129|(4:131|119|120|121)(2:132|124)))|133|134|135|136|137|138|139))|890|891|892))|862|863|864|865|866|867|(0)|883|884|(0)(0)|890|891|892) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:2|3|(1:5)(1:1041)|6|(2:7|8)|(32:10|11|(30:1031|1032|(30:15|16|(1:18)(1:1028)|19|(25:1023|1024|22|(1:24)(1:(1:1013)(3:1014|1015|1016))|(5:26|27|28|29|30)|(5:46|47|48|49|50)|58|59|60|61|62|(1:64)(1:1009)|65|(1:69)(1:1008)|70|71|(1:73)(1:1006)|74|75|(1:77)(1:1005)|78|79|(2:81|(3:83|(25:85|86|87|88|(11:90|(3:92|93|94)|147|148|149|150|151|152|153|154|156)|168|(13:849|850|851|852|853|854|855|856|857|858|(14:(1:861)(1:(1:972)(13:(1:974)(1:975)|863|864|865|866|867|(2:(6:870|871|872|(1:874)(1:878)|875|876)(2:881|882)|877)|883|884|(4:886|887|888|889)(1:(4:901|902|903|904)(14:(4:913|914|915|916)(10:924|925|926|928|929|930|931|932|933|892)|879|880|107|108|109|(2:111|(5:113|114|115|116|(4:118|119|120|121)(2:123|124))(2:129|(4:131|119|120|121)(2:132|124)))|133|134|135|136|137|138|139))|890|891|892))|862|863|864|865|866|867|(0)|883|884|(0)(0)|890|891|892)|976|977)(1:170)|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|187|(20:188|189|190|(1:822)|192|193|194|195|196|197|198|199|200|201|(11:203|(1:205)(1:763)|206|207|208|209|210|211|212|213|214)(23:764|765|766|767|768|769|770|771|772|773|774|775|776|777|778|779|780|781|782|783|784|785|786)|215|216|217|(2:219|(43:221|222|(1:224)(1:535)|(1:226)(1:534)|227|228|229|230|(3:232|233|234)|293|294|295|(10:297|298|299|300|301|302|303|304|(4:306|307|308|309)(0)|317)|519|520|317|318|319|320|321|322|323|324|325|326|327|328|329|330|331|332|333|334|335|336|337|338|339|340|341|342|(4:344|345|346|347)|354)(3:539|540|541))(52:542|543|544|545|546|547|548|549|550|551|552|(3:553|554|(5:556|557|558|559|(9:561|562|563|564|565|566|567|568|569)(1:583))(1:723))|584|585|586|587|588|589|591|592|593|594|595|596|597|598|599|600|601|602|603|604|605|606|607|608|609|610|611|612|613|614|615|616|617|618|619|(4:621|(3:644|645|646)(3:623|624|625)|626|643)|649|650|651|(2:653|(1:655)(7:656|657|658|659|660|661|663)))|(14:437|438|439|440|441|442|443|444|445|446|447|(1:449)|450|(23:364|365|366|367|368|369|370|371|372|(1:374)(1:410)|375|376|377|378|379|380|381|382|383|384|385|387|388)(3:419|420|421))(8:356|357|358|359|360|361|362|(0)(0))))(2:998|999)|122)(2:1000|1001))|1002|1003)|21|22|(0)(0)|(0)|(5:46|47|48|49|50)|58|59|60|61|62|(0)(0)|65|(13:67|69|70|71|(0)(0)|74|75|(0)(0)|78|79|(0)|1002|1003)|1008|70|71|(0)(0)|74|75|(0)(0)|78|79|(0)|1002|1003)|1030|(0)|21|22|(0)(0)|(0)|(0)|58|59|60|61|62|(0)(0)|65|(0)|1008|70|71|(0)(0)|74|75|(0)(0)|78|79|(0)|1002|1003)|13|(0)|1030|(0)|21|22|(0)(0)|(0)|(0)|58|59|60|61|62|(0)(0)|65|(0)|1008|70|71|(0)(0)|74|75|(0)(0)|78|79|(0)|1002|1003)|1035|1036|11|(0)|13|(0)|1030|(0)|21|22|(0)(0)|(0)|(0)|58|59|60|61|62|(0)(0)|65|(0)|1008|70|71|(0)(0)|74|75|(0)(0)|78|79|(0)|1002|1003|(2:(1:140)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:1011:0x0358, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03ce, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c((byte) (-r2[r11]), (byte) (-r2[120(0x78, float:1.68E-43)]), r14)).getMethod($$c(r2[222(0xde, float:3.11E-43)], r2[33], (short) 181), null).invoke(r15, null)).booleanValue() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:968:0x0795, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:1012:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x183f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c4 A[Catch: Exception -> 0x1923, TRY_ENTER, TRY_LEAVE, TryCatch #99 {Exception -> 0x1923, blocks: (B:3:0x0020, B:5:0x0038, B:26:0x01c4, B:33:0x1906, B:35:0x190d, B:37:0x190e, B:40:0x1910, B:42:0x1917, B:43:0x1918, B:47:0x0247, B:54:0x0298, B:56:0x029e, B:57:0x029f, B:58:0x02a0, B:61:0x02f5, B:71:0x0336, B:74:0x033f, B:78:0x0355, B:83:0x0371, B:113:0x184e, B:116:0x1853, B:119:0x185e, B:122:0x18e8, B:129:0x185a, B:135:0x1879, B:143:0x18c3, B:145:0x18c9, B:146:0x18ca, B:1014:0x017a, B:1019:0x191a, B:1021:0x1921, B:1022:0x1922, B:50:0x025b, B:138:0x188d, B:139:0x18c0, B:30:0x0210, B:28:0x01d6, B:1016:0x019c), top: B:2:0x0020, inners: #41, #67, #102, #108, #111 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x14cd  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1615 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x179c A[Catch: all -> 0x181d, TryCatch #113 {all -> 0x181d, blocks: (B:388:0x15d7, B:391:0x15f0, B:393:0x15f7, B:394:0x15f8, B:400:0x15fa, B:402:0x1603, B:403:0x1604, B:406:0x1606, B:408:0x160f, B:409:0x1610, B:420:0x1615, B:630:0x1666, B:639:0x16d7, B:641:0x16dd, B:642:0x16de, B:676:0x16e0, B:678:0x16ed, B:679:0x16ee, B:690:0x16fc, B:692:0x1705, B:693:0x1706, B:716:0x1711, B:718:0x171e, B:719:0x171f, B:726:0x1721, B:728:0x172f, B:729:0x1730, B:732:0x1732, B:734:0x1740, B:735:0x1741, B:738:0x1743, B:740:0x1751, B:741:0x1752, B:748:0x1757, B:750:0x1767, B:751:0x1768, B:791:0x1795, B:793:0x179c, B:794:0x179d, B:815:0x17c2, B:817:0x17c9, B:818:0x17ca, B:826:0x17e5, B:828:0x17ed, B:829:0x17ee, B:835:0x17f0, B:837:0x1804, B:838:0x1805, B:841:0x1807, B:843:0x181b, B:844:0x181c, B:554:0x1081, B:549:0x105f, B:546:0x1021, B:217:0x0aa9, B:633:0x16a1, B:634:0x16d4, B:609:0x1264, B:178:0x0846, B:379:0x1570, B:377:0x1534, B:175:0x0804, B:586:0x1153), top: B:387:0x15d7, inners: #0, #8, #12, #21, #73, #78, #87, #95, #101, #103, #109 }] */
    /* JADX WARN: Removed duplicated region for block: B:794:0x179d A[Catch: all -> 0x181d, TryCatch #113 {all -> 0x181d, blocks: (B:388:0x15d7, B:391:0x15f0, B:393:0x15f7, B:394:0x15f8, B:400:0x15fa, B:402:0x1603, B:403:0x1604, B:406:0x1606, B:408:0x160f, B:409:0x1610, B:420:0x1615, B:630:0x1666, B:639:0x16d7, B:641:0x16dd, B:642:0x16de, B:676:0x16e0, B:678:0x16ed, B:679:0x16ee, B:690:0x16fc, B:692:0x1705, B:693:0x1706, B:716:0x1711, B:718:0x171e, B:719:0x171f, B:726:0x1721, B:728:0x172f, B:729:0x1730, B:732:0x1732, B:734:0x1740, B:735:0x1741, B:738:0x1743, B:740:0x1751, B:741:0x1752, B:748:0x1757, B:750:0x1767, B:751:0x1768, B:791:0x1795, B:793:0x179c, B:794:0x179d, B:815:0x17c2, B:817:0x17c9, B:818:0x17ca, B:826:0x17e5, B:828:0x17ed, B:829:0x17ee, B:835:0x17f0, B:837:0x1804, B:838:0x1805, B:841:0x1807, B:843:0x181b, B:844:0x181c, B:554:0x1081, B:549:0x105f, B:546:0x1021, B:217:0x0aa9, B:633:0x16a1, B:634:0x16d4, B:609:0x1264, B:178:0x0846, B:379:0x1570, B:377:0x1534, B:175:0x0804, B:586:0x1153), top: B:387:0x15d7, inners: #0, #8, #12, #21, #73, #78, #87, #95, #101, #103, #109 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:886:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x0591  */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r2v171, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r5v140, types: [java.lang.Object] */
    static {
        Object obj;
        Object invoke;
        Object obj2;
        Object invoke2;
        boolean z;
        boolean z2;
        boolean[] zArr;
        String str;
        boolean[] zArr2;
        Object[] objArr;
        int i;
        boolean[] zArr3;
        int i2;
        boolean z3;
        Object obj3;
        int i3;
        boolean z4;
        Object obj4;
        boolean z5;
        Random random;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i4;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        int i5;
        int i6;
        ?? r38;
        int i7;
        int i8;
        Throwable cause;
        InputStream inputStream;
        int i9;
        Class cls;
        String str2;
        short s;
        Object newInstance;
        Object newInstance2;
        byte[] bArr;
        Object th;
        Object newInstance3;
        Exception exc;
        int i10;
        int i11;
        Class cls2;
        byte[] bArr2;
        boolean z6;
        Method declaredMethod;
        Object obj14;
        Exception exc2;
        Throwable th2;
        Throwable th3;
        byte[] bArr3;
        String str3;
        String str4;
        int i12;
        int i13;
        boolean z7;
        Method method;
        init$0();
        getCurrency = -4603906508329350488L;
        getPurchaseType = 0;
        getPrice = 2;
        afLogForce = new HashMap();
        afDebugLog = new HashMap();
        try {
            byte[] bArr4 = $$a;
            String $$c = $$c(bArr4[113], bArr4[33], (short) 236);
            String $$c2 = AFLogger$LogLevel == null ? $$c(bArr4[143], bArr4[33], bArr4[584]) : null;
            try {
                obj = Class.forName($$c(bArr4[25], (byte) (-bArr4[28]), (short) 261)).getMethod($$c(bArr4[83], bArr4[33], (short) 880), new Class[0]).invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            if (obj != null) {
                int i14 = $11;
                int i15 = ((i14 | 121) << 1) - (i14 ^ 121);
                $10 = i15 % 128;
                int i16 = i15 % 2;
                if (obj != null) {
                    try {
                        Class<?> cls3 = obj.getClass();
                        String $$c3 = $$c(r14[547], (byte) (-$$a[26]), (short) 720);
                        Method method2 = cls3.getMethod($$c3, null);
                        invoke = method2.invoke(obj, null);
                    } catch (Exception unused2) {
                    }
                    if (obj != null) {
                        int i17 = $11;
                        int i18 = (i17 ^ 27) + ((i17 & 27) << 1);
                        $10 = i18 % 128;
                        try {
                            if (i18 % 2 != 0) {
                                Class<?> cls4 = obj.getClass();
                                String $$c4 = $$c(r14[8885], (byte) (-$$a[52]), (short) 29102);
                                method = cls4.getMethod($$c4, null);
                            } else {
                                method = obj.getClass().getMethod($$c(r13[276], (byte) (-$$a[26]), (short) 627), null);
                            }
                            obj2 = method.invoke(obj, null);
                        } catch (Exception unused3) {
                        }
                        if (obj != null) {
                            try {
                                Class<?> cls5 = obj.getClass();
                                String $$c5 = $$c(r14[547], (byte) (-$$a[26]), (short) 700);
                                Method method3 = cls5.getMethod($$c5, null);
                                invoke2 = method3.invoke(obj, null);
                            } catch (Exception unused4) {
                            }
                            char c = 342;
                            if (invoke != null) {
                                int i19 = 2 % 2;
                            } else if ($$c2 == null) {
                                invoke = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                byte[] bArr5 = $$a;
                                try {
                                    invoke = Class.forName($$c((byte) (-bArr5[342]), (byte) (-bArr5[120]), (short) 108)).getDeclaredConstructor(String.class).newInstance(sb.append($$c(bArr5[547], bArr5[175], (short) 424)).append($$c2).toString());
                                } catch (Throwable th4) {
                                    Throwable cause2 = th4.getCause();
                                    if (cause2 == null) {
                                        throw th4;
                                    }
                                    throw cause2;
                                }
                            }
                            if (invoke2 == null) {
                                byte[] bArr6 = $$a;
                                try {
                                    Object[] objArr2 = {$$c(bArr6[245], (byte) (-bArr6[120]), (short) 330)};
                                    byte b = bArr6[30];
                                    byte b2 = (byte) (-bArr6[120]);
                                    try {
                                        invoke2 = Class.forName($$c((byte) (-bArr6[342]), (byte) (-bArr6[120]), (short) 108)).getDeclaredConstructor(String.class).newInstance(Class.forName($$c(b, b2, (short) ((b2 ^ 830) | (b2 & 830)))).getMethod($$c(bArr6[547], (byte) (-bArr6[26]), (short) 317), String.class).invoke(null, objArr2));
                                    } catch (Throwable th5) {
                                        Throwable cause3 = th5.getCause();
                                        if (cause3 == null) {
                                            throw th5;
                                        }
                                        throw cause3;
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause4 = th6.getCause();
                                    if (cause4 == null) {
                                        throw th6;
                                    }
                                    throw cause4;
                                }
                            }
                            if (obj2 == null && invoke != null) {
                                int i20 = $11;
                                int i21 = ((i20 | 61) << 1) - (i20 ^ 61);
                                $10 = i21 % 128;
                                int i22 = i21 % 2;
                                byte[] bArr7 = $$a;
                                try {
                                    short s2 = (short) 108;
                                    obj2 = Class.forName($$c((byte) (-bArr7[342]), (byte) (-bArr7[120]), s2)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr7[342]), (byte) (-bArr7[120]), s2)), String.class).newInstance(invoke, $$c(bArr7[168], bArr7[33], (short) 667));
                                } catch (Throwable th7) {
                                    Throwable cause5 = th7.getCause();
                                    if (cause5 == null) {
                                        throw th7;
                                    }
                                    throw cause5;
                                }
                            }
                            byte[] bArr8 = $$a;
                            short s3 = (short) 108;
                            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c((byte) (-bArr8[342]), (byte) (-bArr8[120]), s3)), 7);
                            objArr3[0] = null;
                            objArr3[1] = obj2;
                            objArr3[2] = invoke;
                            objArr3[3] = invoke2;
                            objArr3[4] = obj2;
                            objArr3[5] = invoke;
                            objArr3[6] = invoke2;
                            boolean[] zArr4 = {false, true, true, true, true, true, true};
                            boolean[] zArr5 = {false, false, false, false, true, true, true};
                            boolean[] zArr6 = {false, false, true, true, false, true, true};
                            Class<?> cls6 = Class.forName($$c(bArr8[14], (byte) (-bArr8[28]), (short) 845));
                            i13 = cls6.getDeclaredField($$c(bArr8[253], (byte) (-bArr8[244]), (short) 389)).getInt(cls6);
                            int i23 = i13 >= 34 ? 1 : 0;
                            zArr6[0] = i13 != 29 && i13 >= 26;
                            zArr6[1] = i13 < 21;
                            if (i13 < 21) {
                                int i24 = $11;
                                int i25 = (i24 & 73) + (i24 | 73);
                                $10 = i25 % 128;
                                int i26 = i25 % 2;
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zArr6[4] = z7;
                            z = false;
                            int i27 = 0;
                            while (!z) {
                                int i28 = $11;
                                int i29 = (i28 & 115) + (i28 | 115);
                                $10 = i29 % 128;
                                int i30 = i29 % 2;
                                if (i27 >= 9) {
                                    return;
                                }
                                if (zArr6[i27]) {
                                    try {
                                        z4 = zArr4[i27];
                                        obj4 = objArr3[i27];
                                        z5 = zArr5[i27];
                                        if (z4) {
                                            int i31 = ((i28 | 17) << 1) - (i28 ^ 17);
                                            $10 = i31 % 128;
                                            int i32 = i31 % 2;
                                            if (obj4 != null) {
                                                int i33 = i28 + 85;
                                                $10 = i33 % 128;
                                                int i34 = i33 % 2;
                                                try {
                                                    byte[] bArr9 = $$a;
                                                } catch (Throwable th8) {
                                                    try {
                                                        Throwable cause6 = th8.getCause();
                                                        if (cause6 == null) {
                                                            throw th8;
                                                        }
                                                        throw cause6;
                                                    } catch (Throwable th9) {
                                                        obj3 = th9;
                                                        z2 = z;
                                                        zArr = zArr4;
                                                        str = $$c;
                                                        zArr2 = zArr5;
                                                        objArr = objArr3;
                                                        i = i23;
                                                        zArr3 = zArr6;
                                                        i12 = i27;
                                                        i2 = i12;
                                                        while (i3 < 7) {
                                                        }
                                                        int i35 = $10 + 83;
                                                        $11 = i35 % 128;
                                                        int i36 = i35 % 2;
                                                        try {
                                                            throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                        } catch (Throwable th10) {
                                                            Throwable cause7 = th10.getCause();
                                                            if (cause7 == null) {
                                                                throw th10;
                                                            }
                                                            throw cause7;
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                byte[] bArr10 = $$a;
                                                z2 = z;
                                                try {
                                                    StringBuilder append = sb2.append($$c((byte) (-bArr10[193]), bArr10[222], (short) 588)).append(obj4);
                                                    byte b3 = (byte) (-bArr10[329]);
                                                    byte b4 = bArr10[67];
                                                    try {
                                                        throw ((Throwable) Class.forName($$c(bArr10[70], (byte) (-bArr10[120]), (short) 174)).getDeclaredConstructor(String.class).newInstance(append.append($$c(b3, b4, (short) ((b4 ^ 687) | (b4 & 687)))).toString()));
                                                    } catch (Throwable th11) {
                                                        Throwable cause8 = th11.getCause();
                                                        if (cause8 == null) {
                                                            throw th11;
                                                        }
                                                        throw cause8;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    obj3 = th;
                                                    zArr = zArr4;
                                                    str = $$c;
                                                    zArr2 = zArr5;
                                                    objArr = objArr3;
                                                    i = i23;
                                                    zArr3 = zArr6;
                                                    i12 = i27;
                                                    i2 = i12;
                                                    while (i3 < 7) {
                                                    }
                                                    int i352 = $10 + 83;
                                                    $11 = i352 % 128;
                                                    int i362 = i352 % 2;
                                                    throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                z2 = z;
                                            }
                                        }
                                        z2 = z;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        z2 = z;
                                        zArr = zArr4;
                                        str = $$c;
                                        zArr2 = zArr5;
                                        objArr = objArr3;
                                    }
                                    if (z4) {
                                        try {
                                            random = new Random();
                                            try {
                                                byte[] bArr11 = $$a;
                                                byte b5 = bArr11[30];
                                                byte b6 = (byte) (-bArr11[120]);
                                                zArr = zArr4;
                                                try {
                                                    try {
                                                        random.setSeed(((Long) Class.forName($$c(b5, b6, (short) ((b6 & 830) | (b6 ^ 830)))).getMethod($$c(bArr11[36], bArr11[33], (short) 93), null).invoke(null, null)).longValue() ^ (-1560353686));
                                                        obj5 = null;
                                                        obj6 = null;
                                                        obj7 = null;
                                                        obj8 = null;
                                                        i4 = i2;
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        str = $$c;
                                                        zArr2 = zArr5;
                                                        objArr = objArr3;
                                                        obj3 = th;
                                                        i = i23;
                                                        zArr3 = zArr6;
                                                        i12 = i27;
                                                        i2 = i12;
                                                        while (i3 < 7) {
                                                        }
                                                        int i3522 = $10 + 83;
                                                        $11 = i3522 % 128;
                                                        int i3622 = i3522 % 2;
                                                        throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                    }
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                    Throwable th17 = th;
                                                    Throwable cause9 = th17.getCause();
                                                    if (cause9 == null) {
                                                        throw th17;
                                                    }
                                                    throw cause9;
                                                }
                                            } catch (Throwable th18) {
                                                th = th18;
                                            }
                                        } catch (Throwable th19) {
                                            th = th19;
                                            zArr = zArr4;
                                        }
                                        while (obj5 == null) {
                                            if (obj6 == null) {
                                                i5 = 6;
                                            } else if (obj7 == null) {
                                                i5 = 5;
                                            } else {
                                                if (obj8 == null) {
                                                    obj13 = obj5;
                                                    i5 = 4;
                                                } else {
                                                    obj13 = obj5;
                                                    i5 = 3;
                                                }
                                                str = $$c;
                                                StringBuilder sb3 = new StringBuilder((i5 ^ 1) + ((i5 & 1) << 1));
                                                sb3.append('.');
                                                i6 = 0;
                                                while (i6 < i5) {
                                                    if (z5) {
                                                        zArr2 = zArr5;
                                                        objArr = objArr3;
                                                        try {
                                                            int nextInt = random.nextInt(26);
                                                            if (random.nextBoolean()) {
                                                                int i37 = -(-nextInt);
                                                                i7 = ((i37 | 65) << 1) - (i37 ^ 65);
                                                            } else {
                                                                int i38 = -(-nextInt);
                                                                i7 = (i38 ^ 96) + ((i38 & 96) << 1);
                                                            }
                                                            sb3.append((char) i7);
                                                        } catch (Throwable th20) {
                                                            th = th20;
                                                        }
                                                    } else {
                                                        zArr2 = zArr5;
                                                        objArr = objArr3;
                                                        sb3.append((char) (8191 - (~random.nextInt(12))));
                                                    }
                                                    int i39 = i6 + LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
                                                    i6 = (i39 | (-101)) + (i39 & (-101));
                                                    zArr5 = zArr2;
                                                    objArr3 = objArr;
                                                }
                                                zArr2 = zArr5;
                                                objArr = objArr3;
                                                String sb4 = sb3.toString();
                                                if (obj6 != null) {
                                                    int i40 = 2 % 2;
                                                    try {
                                                        Object[] objArr4 = {obj4, sb4};
                                                        byte[] bArr12 = $$a;
                                                        obj6 = Class.forName($$c((byte) (-bArr12[342]), (byte) (-bArr12[120]), s3)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr12[342]), (byte) (-bArr12[120]), s3)), String.class).newInstance(objArr4);
                                                    } catch (Throwable th21) {
                                                        Throwable cause10 = th21.getCause();
                                                        if (cause10 == null) {
                                                            throw th21;
                                                        }
                                                        throw cause10;
                                                    }
                                                } else {
                                                    if (obj7 != null) {
                                                        if (obj8 == null) {
                                                            try {
                                                                Object[] objArr5 = {obj4, sb4};
                                                                byte[] bArr13 = $$a;
                                                                obj8 = Class.forName($$c((byte) (-bArr13[342]), (byte) (-bArr13[120]), s3)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr13[342]), (byte) (-bArr13[120]), s3)), String.class).newInstance(objArr5);
                                                            } catch (Throwable th22) {
                                                                Throwable cause11 = th22.getCause();
                                                                if (cause11 == null) {
                                                                    throw th22;
                                                                }
                                                                throw cause11;
                                                            }
                                                        } else {
                                                            try {
                                                                try {
                                                                    Object[] objArr6 = {obj4, sb4};
                                                                    byte[] bArr14 = $$a;
                                                                    r38 = random;
                                                                    Object obj15 = obj6;
                                                                    Object newInstance4 = Class.forName($$c((byte) (-bArr14[342]), (byte) (-bArr14[120]), s3)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr14[342]), (byte) (-bArr14[120]), s3)), String.class).newInstance(objArr6);
                                                                    try {
                                                                        byte b7 = bArr14[14];
                                                                        byte b8 = (byte) (-bArr14[120]);
                                                                        short s4 = (short) ComposerKt.providerMapsKey;
                                                                        Object obj16 = obj7;
                                                                        Object obj17 = obj8;
                                                                        try {
                                                                            Class.forName($$c(bArr14[14], (byte) (-bArr14[120]), s4)).getMethod($$c((byte) (-bArr14[193]), bArr14[33], (short) 359), null).invoke(Class.forName($$c(b7, b8, s4)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr14[342]), (byte) (-bArr14[120]), s3))).newInstance(newInstance4), null);
                                                                            obj5 = newInstance4;
                                                                            obj6 = obj15;
                                                                            obj7 = obj16;
                                                                            obj8 = obj17;
                                                                            zArr5 = zArr2;
                                                                            objArr3 = objArr;
                                                                            $$c = str;
                                                                            random = r38;
                                                                            i4 = r38;
                                                                        } catch (Throwable th23) {
                                                                            Throwable cause12 = th23.getCause();
                                                                            if (cause12 == null) {
                                                                                throw th23;
                                                                            }
                                                                            throw cause12;
                                                                        }
                                                                    } catch (Throwable th24) {
                                                                        Throwable cause13 = th24.getCause();
                                                                        if (cause13 == null) {
                                                                            throw th24;
                                                                        }
                                                                        throw cause13;
                                                                    }
                                                                } catch (Exception e) {
                                                                    StringBuilder sb5 = new StringBuilder();
                                                                    byte[] bArr15 = $$a;
                                                                    StringBuilder append2 = sb5.append($$c((byte) (-bArr15[193]), bArr15[222], (short) 97)).append(random);
                                                                    byte b9 = (byte) (-bArr15[329]);
                                                                    byte b10 = bArr15[67];
                                                                    try {
                                                                        throw ((Throwable) Class.forName($$c(bArr15[70], (byte) (-bArr15[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance(append2.append($$c(b9, b10, (short) ((b10 ^ 687) | (b10 & 687)))).toString(), e));
                                                                    } catch (Throwable th25) {
                                                                        Throwable cause14 = th25.getCause();
                                                                        if (cause14 == null) {
                                                                            throw th25;
                                                                        }
                                                                        throw cause14;
                                                                    }
                                                                }
                                                            } catch (Throwable th26) {
                                                                Throwable cause15 = th26.getCause();
                                                                if (cause15 == null) {
                                                                    throw th26;
                                                                }
                                                                throw cause15;
                                                            }
                                                        }
                                                        th = th20;
                                                        obj3 = th;
                                                        i = i23;
                                                        zArr3 = zArr6;
                                                        i12 = i27;
                                                        i2 = i12;
                                                        for (i3 = i2 + 1; i3 < 7; i3++) {
                                                            int i41 = $10;
                                                            int i42 = (i41 & 89) + (i41 | 89);
                                                            $11 = i42 % 128;
                                                            if (i42 % 2 == 0) {
                                                                int i43 = 55 / 0;
                                                                if (zArr3[i3]) {
                                                                    AFLogger$LogLevel = null;
                                                                    AFPurchaseDetails = null;
                                                                    int i44 = 2 % 2;
                                                                    z3 = false;
                                                                }
                                                            } else if (zArr3[i3]) {
                                                                AFLogger$LogLevel = null;
                                                                AFPurchaseDetails = null;
                                                                int i442 = 2 % 2;
                                                                z3 = false;
                                                            }
                                                        }
                                                        int i35222 = $10 + 83;
                                                        $11 = i35222 % 128;
                                                        int i36222 = i35222 % 2;
                                                        throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                    }
                                                    try {
                                                        Object[] objArr7 = {obj4, sb4};
                                                        byte[] bArr16 = $$a;
                                                        obj7 = Class.forName($$c((byte) (-bArr16[342]), (byte) (-bArr16[120]), s3)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr16[342]), (byte) (-bArr16[120]), s3)), String.class).newInstance(objArr7);
                                                    } catch (Throwable th27) {
                                                        Throwable cause16 = th27.getCause();
                                                        if (cause16 == null) {
                                                            throw th27;
                                                        }
                                                        throw cause16;
                                                    }
                                                }
                                                r38 = random;
                                                obj5 = obj13;
                                                zArr5 = zArr2;
                                                objArr3 = objArr;
                                                $$c = str;
                                                random = r38;
                                                i4 = r38;
                                            }
                                            obj13 = obj5;
                                            str = $$c;
                                            StringBuilder sb32 = new StringBuilder((i5 ^ 1) + ((i5 & 1) << 1));
                                            sb32.append('.');
                                            i6 = 0;
                                            while (i6 < i5) {
                                            }
                                            zArr2 = zArr5;
                                            objArr = objArr3;
                                            String sb42 = sb32.toString();
                                            if (obj6 != null) {
                                            }
                                            r38 = random;
                                            obj5 = obj13;
                                            zArr5 = zArr2;
                                            objArr3 = objArr;
                                            $$c = str;
                                            random = r38;
                                            i4 = r38;
                                        }
                                        obj9 = obj5;
                                        obj10 = obj6;
                                        str = $$c;
                                        zArr2 = zArr5;
                                        objArr = objArr3;
                                        obj11 = obj7;
                                        obj12 = obj8;
                                        i2 = i4;
                                    } else {
                                        zArr = zArr4;
                                        str = $$c;
                                        zArr2 = zArr5;
                                        objArr = objArr3;
                                        obj9 = null;
                                        obj10 = null;
                                        obj11 = null;
                                        obj12 = null;
                                        i2 = i2;
                                    }
                                    try {
                                        byte[] bArr17 = new byte[6918];
                                        byte[] bArr18 = $$a;
                                        try {
                                            Object[] objArr8 = {AFc1fSDK.class.getResourceAsStream($$c(bArr18[25], bArr18[175], (short) 355))};
                                            byte b11 = bArr18[107];
                                            byte b12 = (byte) (-bArr18[120]);
                                            Object newInstance5 = Class.forName($$c(b11, b12, (short) ((b12 ^ 436) | (b12 & 436)))).getDeclaredConstructor(Class.forName($$c(bArr18[70], (byte) (-bArr18[120]), bArr18[67]))).newInstance(objArr8);
                                            int i45 = 2 % 2;
                                            try {
                                                byte b13 = bArr18[107];
                                                byte b14 = (byte) (-bArr18[120]);
                                                Class.forName($$c(b13, b14, (short) (b14 | 436))).getMethod($$c(bArr18[868], (byte) 73, (short) 760), byte[].class).invoke(newInstance5, bArr17);
                                                try {
                                                    byte b15 = bArr18[107];
                                                    byte b16 = (byte) (-bArr18[120]);
                                                    try {
                                                        Class.forName($$c(b15, b16, (short) ((b16 ^ 436) | (b16 & 436)))).getMethod($$c((byte) (-bArr18[193]), bArr18[33], (short) 359), null).invoke(newInstance5, null);
                                                        int i46 = 22;
                                                        int i47 = 6879;
                                                        String str5 = str;
                                                        Class cls7 = null;
                                                        int i48 = i2;
                                                        while (true) {
                                                            int i49 = (i46 & 1105) + (i46 | 1105);
                                                            byte b17 = bArr17[i46 + 6895];
                                                            bArr17[i49] = (byte) ((b17 & (-65)) + (b17 | (-65)));
                                                            int length = bArr17.length;
                                                            int i50 = -i46;
                                                            int i51 = (length ^ i50) + ((length & i50) << 1);
                                                            int i52 = $11;
                                                            int i53 = ((i52 | 49) << 1) - (i52 ^ 49);
                                                            $10 = i53 % 128;
                                                            if (i53 % 2 == 0) {
                                                                int i54 = 2 % 2;
                                                            }
                                                            try {
                                                                Object[] objArr9 = new Object[3];
                                                                try {
                                                                    objArr9[2] = Integer.valueOf(i51);
                                                                    objArr9[1] = Integer.valueOf(i46);
                                                                    objArr9[0] = bArr17;
                                                                    byte[] bArr19 = $$a;
                                                                    Class<?> cls8 = Class.forName($$c(bArr19[74], (byte) (-bArr19[120]), (short) 822));
                                                                    Class<?>[] clsArr = new Class[3];
                                                                    clsArr[0] = byte[].class;
                                                                    clsArr[1] = Integer.TYPE;
                                                                    ?? r15 = 2;
                                                                    clsArr[2] = Integer.TYPE;
                                                                    InputStream inputStream2 = (InputStream) cls8.getDeclaredConstructor(clsArr).newInstance(objArr9);
                                                                    Object obj18 = AFLogger$LogLevel;
                                                                    if (obj18 == null) {
                                                                        int i55 = $10 + 1;
                                                                        $11 = i55 % 128;
                                                                        if (i55 % 2 == 0) {
                                                                            str3 = "";
                                                                            str4 = "";
                                                                        } else {
                                                                            str3 = "";
                                                                            str4 = "";
                                                                        }
                                                                        try {
                                                                            Object[] objArr10 = {str3, str4, 0};
                                                                            Class<?> cls9 = Class.forName($$c(bArr19[9], (byte) (-bArr19[28]), (short) 156));
                                                                            byte b18 = bArr19[253];
                                                                            byte b19 = bArr19[112];
                                                                            i8 = i47;
                                                                            r15 = 2;
                                                                            int i56 = -((Integer) cls9.getMethod($$c(b18, b19, (short) ((b19 & 646) | (b19 ^ 646))), CharSequence.class, CharSequence.class, Integer.TYPE).invoke(null, objArr10)).intValue();
                                                                            int i57 = (994355071 ^ i56) + ((i56 & 994355071) << 1);
                                                                            try {
                                                                                int i58 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                short s5 = (short) ((i58 ^ 15) + ((i58 & 15) << 1));
                                                                                long j = getCurrency;
                                                                                r15 = zArr6;
                                                                                i48 = i27;
                                                                                int i59 = (int) (j >>> 32);
                                                                                int i60 = ~i57;
                                                                                int i61 = (int) j;
                                                                                try {
                                                                                    int[] iArr = {((~i59) & i57) | (i59 & i60), (i60 & i61) | ((~i61) & i57)};
                                                                                    i = getPurchaseType;
                                                                                    inputStream = new AFj1jSDK(inputStream2, iArr, i, getPurchaseToken, s5, getPrice);
                                                                                    zArr3 = r15;
                                                                                    i2 = i48;
                                                                                } catch (Throwable th28) {
                                                                                    th = th28;
                                                                                }
                                                                            } catch (Throwable th29) {
                                                                                th = th29;
                                                                                r15 = zArr6;
                                                                                i48 = i27;
                                                                                obj3 = th;
                                                                                i = i23;
                                                                                zArr3 = r15;
                                                                                i12 = i48;
                                                                                i2 = i12;
                                                                                while (i3 < 7) {
                                                                                }
                                                                                int i352222 = $10 + 83;
                                                                                $11 = i352222 % 128;
                                                                                int i362222 = i352222 % 2;
                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                            }
                                                                        } catch (Throwable th30) {
                                                                            Throwable cause17 = th30.getCause();
                                                                            if (cause17 == null) {
                                                                                throw th30;
                                                                            }
                                                                            throw cause17;
                                                                        }
                                                                    } else {
                                                                        i8 = i47;
                                                                        boolean[] zArr7 = zArr6;
                                                                        int i62 = i27;
                                                                        try {
                                                                            int i63 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                            int i64 = (i63 ^ 2) + ((i63 & 2) << 1);
                                                                            byte[] bArr20 = {-69, -54, 123, -110, 1, -42, 85, 6};
                                                                            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                                            try {
                                                                                Object[] objArr11 = new Object[4];
                                                                                try {
                                                                                    objArr11[3] = Integer.valueOf(((maximumDrawingCacheSize | 529586811) << 1) - (maximumDrawingCacheSize ^ 529586811));
                                                                                    objArr11[2] = bArr20;
                                                                                    objArr11[1] = Integer.valueOf(i64);
                                                                                    objArr11[0] = inputStream2;
                                                                                    try {
                                                                                        Class<?> cls10 = Class.forName($$c(bArr19[113], bArr19[33], (short) StatusLine.HTTP_TEMP_REDIRECT), true, (ClassLoader) AFPurchaseDetails);
                                                                                        String $$c6 = $$c(bArr19[306], (byte) 77, (short) 445);
                                                                                        Class<?>[] clsArr2 = new Class[4];
                                                                                        zArr3 = zArr7;
                                                                                        try {
                                                                                            clsArr2[0] = Class.forName($$c(bArr19[70], (byte) (-bArr19[120]), bArr19[67]));
                                                                                            clsArr2[1] = Integer.TYPE;
                                                                                            clsArr2[2] = byte[].class;
                                                                                            try {
                                                                                                clsArr2[3] = Integer.TYPE;
                                                                                                inputStream = (InputStream) cls10.getMethod($$c6, clsArr2).invoke(obj18, objArr11);
                                                                                                i2 = i62;
                                                                                            } catch (Throwable th31) {
                                                                                                th = th31;
                                                                                                Throwable th32 = th;
                                                                                                cause = th32.getCause();
                                                                                                if (cause == null) {
                                                                                                    throw th32;
                                                                                                }
                                                                                                throw cause;
                                                                                            }
                                                                                        } catch (Throwable th33) {
                                                                                            th = th33;
                                                                                            Throwable th322 = th;
                                                                                            cause = th322.getCause();
                                                                                            if (cause == null) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th34) {
                                                                                        th = th34;
                                                                                        Throwable th3222 = th;
                                                                                        cause = th3222.getCause();
                                                                                        if (cause == null) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th35) {
                                                                                    th = th35;
                                                                                }
                                                                            } catch (Throwable th36) {
                                                                                th = th36;
                                                                            }
                                                                        } catch (Throwable th37) {
                                                                            th = th37;
                                                                            i = i23;
                                                                            zArr3 = zArr7;
                                                                            i2 = i62;
                                                                            obj3 = th;
                                                                            i2 = i2;
                                                                            while (i3 < 7) {
                                                                            }
                                                                            int i3522222 = $10 + 83;
                                                                            $11 = i3522222 % 128;
                                                                            int i3622222 = i3522222 % 2;
                                                                            throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                        }
                                                                    }
                                                                    long j2 = 16;
                                                                    int i65 = $10 + 77;
                                                                    $11 = i65 % 128;
                                                                    int i66 = i65 % 2;
                                                                    try {
                                                                        ((Long) Class.forName($$c(bArr19[70], (byte) (-bArr19[120]), bArr19[67])).getMethod($$c(bArr19[50], (byte) ((-2) - (bArr19[357] ^ (-1))), (short) 440), Long.TYPE).invoke(inputStream, Long.valueOf(j2))).longValue();
                                                                        if (z4) {
                                                                            int i67 = $11;
                                                                            int i68 = (i67 ^ 121) + ((i67 & 121) << 1);
                                                                            int i69 = i68 % 128;
                                                                            $10 = i69;
                                                                            if (i68 % 2 != 0) {
                                                                                throw null;
                                                                            }
                                                                            try {
                                                                                Object obj19 = AFLogger$LogLevel;
                                                                                Object obj20 = obj19 == null ? obj10 : obj11;
                                                                                if (obj19 == null) {
                                                                                    int i70 = i69 + 97;
                                                                                    $11 = i70 % 128;
                                                                                    int i71 = i70 % 2;
                                                                                    int i72 = 2 % 2;
                                                                                    obj14 = obj12;
                                                                                } else {
                                                                                    obj14 = obj9;
                                                                                }
                                                                                int i73 = $11;
                                                                                int i74 = (i73 ^ 89) + ((i73 & 89) << 1);
                                                                                $10 = i74 % 128;
                                                                                int i75 = i74 % 2;
                                                                                try {
                                                                                    byte b20 = bArr19[14];
                                                                                    byte b21 = (byte) (-bArr19[120]);
                                                                                    short s6 = (short) ComposerKt.providerMapsKey;
                                                                                    cls = cls7;
                                                                                    i9 = i46;
                                                                                    Object newInstance6 = Class.forName($$c(b20, b21, s6)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr19[342]), (byte) (-bArr19[120]), s3))).newInstance(obj20);
                                                                                    if ((i23 ^ 1) != 1) {
                                                                                        int i76 = $10;
                                                                                        int i77 = (i76 & 105) + (i76 | 105);
                                                                                        $11 = i77 % 128;
                                                                                        int i78 = i77 % 2;
                                                                                        int i79 = 2 % 2;
                                                                                        try {
                                                                                            Class<?> cls11 = Class.forName($$c((byte) (-bArr19[342]), (byte) (-bArr19[120]), s3));
                                                                                            byte b22 = bArr19[547];
                                                                                            byte b23 = bArr19[357];
                                                                                            byte b24 = (byte) ((b23 ^ (-1)) + (b23 << 1));
                                                                                            ((Boolean) cls11.getMethod($$c(b22, b24, (short) (b24 | 437)), null).invoke(obj20, null)).booleanValue();
                                                                                        } catch (Throwable th38) {
                                                                                            try {
                                                                                                Throwable cause18 = th38.getCause();
                                                                                                if (cause18 == null) {
                                                                                                    throw th38;
                                                                                                }
                                                                                                throw cause18;
                                                                                            } catch (Exception e2) {
                                                                                                exc2 = e2;
                                                                                                i = i23;
                                                                                                try {
                                                                                                    StringBuilder sb6 = new StringBuilder();
                                                                                                    byte[] bArr21 = $$a;
                                                                                                    StringBuilder append3 = sb6.append($$c((byte) (-bArr21[193]), bArr21[222], (short) 584)).append(obj20);
                                                                                                    byte b25 = (byte) (-bArr21[329]);
                                                                                                    byte b26 = bArr21[67];
                                                                                                    try {
                                                                                                        throw ((Throwable) Class.forName($$c(bArr21[70], (byte) (-bArr21[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance(append3.append($$c(b25, b26, (short) (b26 | 687))).toString(), exc2));
                                                                                                    } catch (Throwable th39) {
                                                                                                        Throwable cause19 = th39.getCause();
                                                                                                        if (cause19 == null) {
                                                                                                            throw th39;
                                                                                                        }
                                                                                                        throw cause19;
                                                                                                    }
                                                                                                } catch (Throwable th40) {
                                                                                                    th3 = th40;
                                                                                                    th2 = th3;
                                                                                                    try {
                                                                                                        byte[] bArr22 = $$a;
                                                                                                        try {
                                                                                                            Class<?> cls12 = Class.forName($$c((byte) (-bArr22[342]), (byte) (-bArr22[120]), s3));
                                                                                                            byte b27 = bArr22[306];
                                                                                                            byte b28 = bArr22[33];
                                                                                                            byte b29 = (byte) ((b28 ^ 1) + ((b28 & 1) << 1));
                                                                                                            short s7 = (short) 414;
                                                                                                            ((Boolean) cls12.getMethod($$c(b27, b29, s7), null).invoke(obj20, null)).booleanValue();
                                                                                                            try {
                                                                                                                ((Boolean) Class.forName($$c((byte) (-bArr22[342]), (byte) (-bArr22[120]), s3)).getMethod($$c(bArr22[306], (byte) (bArr22[33] + 1), s7), null).invoke(obj14, null)).booleanValue();
                                                                                                                throw th2;
                                                                                                            } catch (Throwable th41) {
                                                                                                                Throwable cause20 = th41.getCause();
                                                                                                                if (cause20 == null) {
                                                                                                                    throw th41;
                                                                                                                }
                                                                                                                throw cause20;
                                                                                                            }
                                                                                                        } catch (Throwable th42) {
                                                                                                            th = th42;
                                                                                                            Throwable th43 = th;
                                                                                                            Throwable cause21 = th43.getCause();
                                                                                                            if (cause21 == null) {
                                                                                                                throw th43;
                                                                                                            }
                                                                                                            throw cause21;
                                                                                                        }
                                                                                                    } catch (Throwable th44) {
                                                                                                        th = th44;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th45) {
                                                                                                th2 = th45;
                                                                                                i = i23;
                                                                                                byte[] bArr222 = $$a;
                                                                                                Class<?> cls122 = Class.forName($$c((byte) (-bArr222[342]), (byte) (-bArr222[120]), s3));
                                                                                                byte b272 = bArr222[306];
                                                                                                byte b282 = bArr222[33];
                                                                                                byte b292 = (byte) ((b282 ^ 1) + ((b282 & 1) << 1));
                                                                                                short s72 = (short) 414;
                                                                                                ((Boolean) cls122.getMethod($$c(b272, b292, s72), null).invoke(obj20, null)).booleanValue();
                                                                                                ((Boolean) Class.forName($$c((byte) (-bArr222[342]), (byte) (-bArr222[120]), s3)).getMethod($$c(bArr222[306], (byte) (bArr222[33] + 1), s72), null).invoke(obj14, null)).booleanValue();
                                                                                                throw th2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int i80 = 2 % 2;
                                                                                    int i81 = 1024;
                                                                                    try {
                                                                                        byte[] bArr23 = new byte[1024];
                                                                                        int i82 = i8;
                                                                                        try {
                                                                                            while (i82 > 0) {
                                                                                                int min = Math.min(i81, i82);
                                                                                                int i83 = $10 + 113;
                                                                                                $11 = i83 % 128;
                                                                                                int i84 = i83 % 2;
                                                                                                try {
                                                                                                    Object[] objArr12 = {bArr23, 0, Integer.valueOf(min)};
                                                                                                    byte[] bArr24 = $$a;
                                                                                                    i = i23;
                                                                                                    try {
                                                                                                        str2 = str5;
                                                                                                        int intValue = ((Integer) Class.forName($$c(bArr24[70], (byte) (-bArr24[120]), bArr24[67])).getMethod($$c(bArr24[50], (byte) 73, (short) 690), byte[].class, Integer.TYPE, Integer.TYPE).invoke(inputStream, objArr12)).intValue();
                                                                                                        if (intValue != -1) {
                                                                                                            try {
                                                                                                                Class.forName($$c(bArr24[14], (byte) (-bArr24[120]), s6)).getMethod($$c((byte) (-bArr24[193]), (byte) 78, (short) 704), byte[].class, Integer.TYPE, Integer.TYPE).invoke(newInstance6, bArr23, 0, Integer.valueOf(intValue));
                                                                                                                int i85 = -intValue;
                                                                                                                i82 = (i82 ^ i85) + ((i85 & i82) << 1);
                                                                                                                i23 = i;
                                                                                                                str5 = str2;
                                                                                                                i81 = 1024;
                                                                                                            } catch (Throwable th46) {
                                                                                                                Throwable cause22 = th46.getCause();
                                                                                                                if (cause22 == null) {
                                                                                                                    throw th46;
                                                                                                                }
                                                                                                                throw cause22;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    } catch (Throwable th47) {
                                                                                                        th = th47;
                                                                                                        Throwable th48 = th;
                                                                                                        Throwable cause23 = th48.getCause();
                                                                                                        if (cause23 == null) {
                                                                                                            throw th48;
                                                                                                        }
                                                                                                        throw cause23;
                                                                                                    }
                                                                                                } catch (Throwable th49) {
                                                                                                    th = th49;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                            bArr3 = $$a;
                                                                                            Object invoke3 = Class.forName($$c(bArr3[14], (byte) (-bArr3[120]), s6)).getMethod($$c((byte) (-bArr3[193]), (byte) (-bArr3[26]), (short) 409), null).invoke(newInstance6, null);
                                                                                            try {
                                                                                                byte b30 = bArr3[9];
                                                                                                byte b31 = (byte) (-bArr3[120]);
                                                                                                Class.forName($$c(b30, b31, (short) ((b31 ^ 12) | (b31 & 12)))).getMethod($$c(bArr3[50], (byte) (bArr3[357] - 1), (short) 613), null).invoke(invoke3, null);
                                                                                                try {
                                                                                                    Class.forName($$c(bArr3[14], (byte) (-bArr3[120]), s6)).getMethod($$c((byte) (-bArr3[193]), bArr3[33], (short) 359), null).invoke(newInstance6, null);
                                                                                                    byte b32 = bArr3[575];
                                                                                                    byte b33 = bArr3[33];
                                                                                                    byte b34 = (byte) ((b33 & 1) + (b33 | 1));
                                                                                                    int i86 = $$b;
                                                                                                    Class<?> cls13 = Class.forName($$c(b32, b34, (short) ((i86 & 544) | (i86 ^ 544))));
                                                                                                    byte b35 = bArr3[253];
                                                                                                    byte b36 = (byte) (-bArr3[428]);
                                                                                                    try {
                                                                                                        short s8 = (short) 275;
                                                                                                        try {
                                                                                                            newInstance3 = cls13.getDeclaredMethod($$c(b35, b36, (short) ((b36 ^ 412) | (b36 & 412))), String.class, String.class, Integer.TYPE).invoke(null, Class.forName($$c((byte) (-bArr3[342]), (byte) (-bArr3[120]), s3)).getMethod($$c(bArr3[276], (byte) (-bArr3[26]), s8), null).invoke(obj20, null), Class.forName($$c((byte) (-bArr3[342]), (byte) (-bArr3[120]), s3)).getMethod($$c(bArr3[276], (byte) (-bArr3[26]), s8), null).invoke(obj14, null), 0);
                                                                                                            try {
                                                                                                                short s9 = (short) 414;
                                                                                                                ((Boolean) Class.forName($$c((byte) (-bArr3[342]), (byte) (-bArr3[120]), s3)).getMethod($$c(bArr3[306], (byte) (bArr3[33] + 1), s9), null).invoke(obj20, null)).booleanValue();
                                                                                                                int i87 = $11 + 19;
                                                                                                                $10 = i87 % 128;
                                                                                                                int i88 = i87 % 2;
                                                                                                                try {
                                                                                                                    ((Boolean) Class.forName($$c((byte) (-bArr3[342]), (byte) (-bArr3[120]), s3)).getMethod($$c(bArr3[306], (byte) (bArr3[33] + 1), s9), null).invoke(obj14, null)).booleanValue();
                                                                                                                    int i89 = $11 + 11;
                                                                                                                    $10 = i89 % 128;
                                                                                                                    int i90 = i89 % 2;
                                                                                                                } catch (Throwable th50) {
                                                                                                                    Throwable cause24 = th50.getCause();
                                                                                                                    if (cause24 == null) {
                                                                                                                        throw th50;
                                                                                                                    }
                                                                                                                    throw cause24;
                                                                                                                }
                                                                                                            } catch (Throwable th51) {
                                                                                                                Throwable cause25 = th51.getCause();
                                                                                                                if (cause25 == null) {
                                                                                                                    throw th51;
                                                                                                                }
                                                                                                                throw cause25;
                                                                                                            }
                                                                                                        } catch (Throwable th52) {
                                                                                                            Throwable cause26 = th52.getCause();
                                                                                                            if (cause26 == null) {
                                                                                                                throw th52;
                                                                                                            }
                                                                                                            throw cause26;
                                                                                                        }
                                                                                                    } catch (Throwable th53) {
                                                                                                        Throwable cause27 = th53.getCause();
                                                                                                        if (cause27 == null) {
                                                                                                            throw th53;
                                                                                                        }
                                                                                                        throw cause27;
                                                                                                    }
                                                                                                } catch (Throwable th54) {
                                                                                                    Throwable cause28 = th54.getCause();
                                                                                                    if (cause28 == null) {
                                                                                                        throw th54;
                                                                                                    }
                                                                                                    throw cause28;
                                                                                                }
                                                                                            } catch (Throwable th55) {
                                                                                                Throwable cause29 = th55.getCause();
                                                                                                if (cause29 == null) {
                                                                                                    throw th55;
                                                                                                }
                                                                                                throw cause29;
                                                                                            }
                                                                                        } catch (Throwable th56) {
                                                                                            Throwable cause30 = th56.getCause();
                                                                                            if (cause30 == null) {
                                                                                                throw th56;
                                                                                            }
                                                                                            throw cause30;
                                                                                        }
                                                                                        str2 = str5;
                                                                                        i = i23;
                                                                                    } catch (Throwable th57) {
                                                                                        th3 = th57;
                                                                                        i = i23;
                                                                                        th2 = th3;
                                                                                        byte[] bArr2222 = $$a;
                                                                                        Class<?> cls1222 = Class.forName($$c((byte) (-bArr2222[342]), (byte) (-bArr2222[120]), s3));
                                                                                        byte b2722 = bArr2222[306];
                                                                                        byte b2822 = bArr2222[33];
                                                                                        byte b2922 = (byte) ((b2822 ^ 1) + ((b2822 & 1) << 1));
                                                                                        short s722 = (short) 414;
                                                                                        ((Boolean) cls1222.getMethod($$c(b2722, b2922, s722), null).invoke(obj20, null)).booleanValue();
                                                                                        ((Boolean) Class.forName($$c((byte) (-bArr2222[342]), (byte) (-bArr2222[120]), s3)).getMethod($$c(bArr2222[306], (byte) (bArr2222[33] + 1), s722), null).invoke(obj14, null)).booleanValue();
                                                                                        throw th2;
                                                                                    }
                                                                                } catch (Throwable th58) {
                                                                                    i = i23;
                                                                                    try {
                                                                                        Throwable cause31 = th58.getCause();
                                                                                        if (cause31 == null) {
                                                                                            throw th58;
                                                                                        }
                                                                                        throw cause31;
                                                                                    } catch (Exception e3) {
                                                                                        exc2 = e3;
                                                                                        StringBuilder sb62 = new StringBuilder();
                                                                                        byte[] bArr212 = $$a;
                                                                                        StringBuilder append32 = sb62.append($$c((byte) (-bArr212[193]), bArr212[222], (short) 584)).append(obj20);
                                                                                        byte b252 = (byte) (-bArr212[329]);
                                                                                        byte b262 = bArr212[67];
                                                                                        throw ((Throwable) Class.forName($$c(bArr212[70], (byte) (-bArr212[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance(append32.append($$c(b252, b262, (short) (b262 | 687))).toString(), exc2));
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th59) {
                                                                                th = th59;
                                                                                i = i23;
                                                                            }
                                                                            try {
                                                                                if (AFPurchaseDetails == null) {
                                                                                    try {
                                                                                        AFPurchaseDetails = Class.class.getMethod($$c(bArr3[245], (byte) (-bArr3[26]), (short) 437), null).invoke(AFc1fSDK.class, null);
                                                                                    } catch (Throwable th60) {
                                                                                        Throwable cause32 = th60.getCause();
                                                                                        if (cause32 == null) {
                                                                                            throw th60;
                                                                                        }
                                                                                        throw cause32;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th61) {
                                                                                th = th61;
                                                                                obj3 = th;
                                                                                i12 = i2;
                                                                                i2 = i12;
                                                                                while (i3 < 7) {
                                                                                }
                                                                                int i35222222 = $10 + 83;
                                                                                $11 = i35222222 % 128;
                                                                                int i36222222 = i35222222 % 2;
                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                            }
                                                                        } else {
                                                                            i9 = i46;
                                                                            cls = cls7;
                                                                            str2 = str5;
                                                                            i = i23;
                                                                            try {
                                                                                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                try {
                                                                                    s = (short) 921;
                                                                                    newInstance = Class.forName($$c(bArr19[157], (byte) (-bArr19[120]), s)).getDeclaredConstructor(Class.forName($$c(bArr19[70], (byte) (-bArr19[120]), bArr19[67]))).newInstance(zipInputStream);
                                                                                    try {
                                                                                        byte b37 = bArr19[69];
                                                                                        byte b38 = (byte) (-bArr19[120]);
                                                                                        newInstance2 = Class.forName($$c(b37, b38, (short) (b38 | 408))).getDeclaredConstructor(null).newInstance(null);
                                                                                        byte[] bArr25 = new byte[1024];
                                                                                        int i91 = 0;
                                                                                        while (true) {
                                                                                            try {
                                                                                                bArr = $$a;
                                                                                                int intValue2 = ((Integer) Class.forName($$c(bArr[157], (byte) (-bArr[120]), s)).getMethod($$c(bArr[50], (byte) 73, (short) 690), byte[].class).invoke(newInstance, bArr25)).intValue();
                                                                                                if (intValue2 <= 0) {
                                                                                                    break;
                                                                                                }
                                                                                                int i92 = $11 + 57;
                                                                                                $10 = i92 % 128;
                                                                                                int i93 = i92 % 2;
                                                                                                byte[] bArr26 = bArr25;
                                                                                                try {
                                                                                                    if (i91 >= nextEntry.getSize()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    try {
                                                                                                        Object[] objArr13 = new Object[3];
                                                                                                        try {
                                                                                                            objArr13[2] = Integer.valueOf(intValue2);
                                                                                                            objArr13[1] = 0;
                                                                                                            objArr13[0] = bArr26;
                                                                                                            byte b39 = bArr[69];
                                                                                                            byte b40 = (byte) (-bArr[120]);
                                                                                                            try {
                                                                                                                Class.forName($$c(b39, b40, (short) (b40 | 408))).getMethod($$c((byte) (-bArr[193]), (byte) 78, (short) 704), byte[].class, Integer.TYPE, Integer.TYPE).invoke(newInstance2, objArr13);
                                                                                                                i91 += intValue2;
                                                                                                                bArr25 = bArr26;
                                                                                                            } catch (Throwable th62) {
                                                                                                                th = th62;
                                                                                                                Throwable th63 = th;
                                                                                                                Throwable cause33 = th63.getCause();
                                                                                                                if (cause33 == null) {
                                                                                                                    throw th63;
                                                                                                                }
                                                                                                                throw cause33;
                                                                                                            }
                                                                                                        } catch (Throwable th64) {
                                                                                                            th = th64;
                                                                                                        }
                                                                                                    } catch (Throwable th65) {
                                                                                                        th = th65;
                                                                                                    }
                                                                                                } catch (Throwable th66) {
                                                                                                    th = th66;
                                                                                                    obj3 = th;
                                                                                                    i2 = i2;
                                                                                                    while (i3 < 7) {
                                                                                                    }
                                                                                                    int i352222222 = $10 + 83;
                                                                                                    $11 = i352222222 % 128;
                                                                                                    int i362222222 = i352222222 % 2;
                                                                                                    throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                                }
                                                                                            } catch (Throwable th67) {
                                                                                                Throwable cause34 = th67.getCause();
                                                                                                if (cause34 == null) {
                                                                                                    throw th67;
                                                                                                }
                                                                                                throw cause34;
                                                                                            }
                                                                                        }
                                                                                        int i94 = $10 + 43;
                                                                                        $11 = i94 % 128;
                                                                                        int i95 = i94 % 2;
                                                                                    } catch (Throwable th68) {
                                                                                        Throwable cause35 = th68.getCause();
                                                                                        if (cause35 == null) {
                                                                                            throw th68;
                                                                                        }
                                                                                        throw cause35;
                                                                                    }
                                                                                } catch (Throwable th69) {
                                                                                    Throwable cause36 = th69.getCause();
                                                                                    if (cause36 == null) {
                                                                                        throw th69;
                                                                                    }
                                                                                    throw cause36;
                                                                                }
                                                                            } catch (Throwable th70) {
                                                                                th = th70;
                                                                                i2 = i2;
                                                                                obj3 = th;
                                                                                i2 = i2;
                                                                                while (i3 < 7) {
                                                                                }
                                                                                int i3522222222 = $10 + 83;
                                                                                $11 = i3522222222 % 128;
                                                                                int i3622222222 = i3522222222 % 2;
                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                            }
                                                                            try {
                                                                                byte b41 = bArr[69];
                                                                                byte b42 = (byte) (-bArr[120]);
                                                                                Object invoke4 = Class.forName($$c(b41, b42, (short) ((b42 ^ 408) | (b42 & 408)))).getMethod($$c(bArr[547], bArr[357], (short) (-bArr[28])), null).invoke(newInstance2, null);
                                                                                try {
                                                                                    Class.forName($$c(bArr[157], (byte) (-bArr[120]), s)).getMethod($$c((byte) (-bArr[193]), bArr[33], (short) 359), null).invoke(newInstance, null);
                                                                                    try {
                                                                                        byte[] bArr27 = $$a;
                                                                                        byte b43 = bArr27[69];
                                                                                        byte b44 = (byte) (-bArr27[120]);
                                                                                        Class.forName($$c(b43, b44, (short) (b44 | 408))).getMethod($$c((byte) (-bArr27[193]), bArr27[33], (short) 359), null).invoke(newInstance2, null);
                                                                                        try {
                                                                                            byte[] bArr28 = $$a;
                                                                                            try {
                                                                                                Object invoke5 = Class.class.getMethod($$c(bArr28[245], (byte) (-bArr28[26]), (short) 437), null).invoke(AFc1fSDK.class, null);
                                                                                                try {
                                                                                                    byte b45 = bArr28[67];
                                                                                                    Class<?> cls14 = Class.forName($$c(b45, (byte) ((b45 ^ 59) | (b45 & 59)), (short) 795));
                                                                                                    Class<?>[] clsArr3 = new Class[2];
                                                                                                    byte b46 = bArr28[70];
                                                                                                    byte b47 = (byte) (-bArr28[120]);
                                                                                                    clsArr3[0] = Class.forName($$c(b46, b47, (short) (b47 | 798)));
                                                                                                    try {
                                                                                                        clsArr3[1] = Class.forName($$c(bArr28[575], (byte) (-bArr28[120]), (short) 552));
                                                                                                        Constructor<?> declaredConstructor = cls14.getDeclaredConstructor(clsArr3);
                                                                                                        try {
                                                                                                            byte b48 = bArr28[70];
                                                                                                            byte b49 = (byte) (-bArr28[120]);
                                                                                                            newInstance3 = declaredConstructor.newInstance(Class.forName($$c(b48, b49, (short) ((b49 ^ 798) | (b49 & 798)))).getMethod($$c(bArr28[50], (byte) 78, bArr28[168]), byte[].class).invoke(null, invoke4), invoke5);
                                                                                                            try {
                                                                                                            } catch (Exception e4) {
                                                                                                                e = e4;
                                                                                                            }
                                                                                                        } catch (Throwable th71) {
                                                                                                            Throwable cause37 = th71.getCause();
                                                                                                            if (cause37 == null) {
                                                                                                                throw th71;
                                                                                                            }
                                                                                                            throw cause37;
                                                                                                        }
                                                                                                    } catch (Throwable th72) {
                                                                                                        th = th72;
                                                                                                        obj3 = th;
                                                                                                        i2 = i2;
                                                                                                        while (i3 < 7) {
                                                                                                        }
                                                                                                        int i35222222222 = $10 + 83;
                                                                                                        $11 = i35222222222 % 128;
                                                                                                        int i36222222222 = i35222222222 % 2;
                                                                                                        throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                                    }
                                                                                                } catch (Throwable th73) {
                                                                                                    th = th73;
                                                                                                }
                                                                                                try {
                                                                                                    Field declaredField = Class.forName($$c(bArr28[19], (byte) (bArr28[33] + 1), (short) 658)).getDeclaredField($$c(bArr28[222], (byte) (-bArr28[805]), (short) ($$b & PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW)));
                                                                                                    declaredField.setAccessible(true);
                                                                                                    Object obj21 = declaredField.get(invoke5);
                                                                                                    Class<?> cls15 = obj21.getClass();
                                                                                                    Field declaredField2 = cls15.getDeclaredField($$c(bArr28[14], bArr28[344], bArr28[143]));
                                                                                                    declaredField2.setAccessible(true);
                                                                                                    byte b50 = bArr28[5];
                                                                                                    byte b51 = bArr28[344];
                                                                                                    Field declaredField3 = cls15.getDeclaredField($$c(b50, b51, (short) ((b51 ^ 314) | (b51 & 314))));
                                                                                                    declaredField3.setAccessible(true);
                                                                                                    Object obj22 = declaredField2.get(obj21);
                                                                                                    Object obj23 = declaredField3.get(obj21);
                                                                                                    Object obj24 = declaredField.get(newInstance3);
                                                                                                    ArrayList arrayList = new ArrayList((List) obj22);
                                                                                                    Class<?> componentType = obj23.getClass().getComponentType();
                                                                                                    int length2 = Array.getLength(obj23);
                                                                                                    Object newInstance7 = Array.newInstance(componentType, length2);
                                                                                                    int i96 = 0;
                                                                                                    while (i96 < length2) {
                                                                                                        int i97 = $11;
                                                                                                        int i98 = (i97 & 39) + (i97 | 39);
                                                                                                        $10 = i98 % 128;
                                                                                                        if (i98 % 2 != 0) {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    Array.set(newInstance7, i96, Array.get(obj23, i96));
                                                                                                                    i10 = i96 ^ 113;
                                                                                                                    i11 = (i96 & 113) << 1;
                                                                                                                } catch (Throwable th74) {
                                                                                                                    th = th74;
                                                                                                                    obj3 = th;
                                                                                                                    i2 = i2;
                                                                                                                    while (i3 < 7) {
                                                                                                                    }
                                                                                                                    int i352222222222 = $10 + 83;
                                                                                                                    $11 = i352222222222 % 128;
                                                                                                                    int i362222222222 = i352222222222 % 2;
                                                                                                                    throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                                                }
                                                                                                            } catch (Exception e5) {
                                                                                                                exc = e5;
                                                                                                                StringBuilder sb7 = new StringBuilder();
                                                                                                                byte[] bArr29 = $$a;
                                                                                                                StringBuilder append4 = sb7.append($$c((byte) (-bArr29[193]), bArr29[222], (short) 580)).append(invoke5);
                                                                                                                byte b52 = (byte) (-bArr29[329]);
                                                                                                                byte b53 = bArr29[67];
                                                                                                                try {
                                                                                                                    throw ((Throwable) Class.forName($$c(bArr29[70], (byte) (-bArr29[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance(append4.append($$c(b52, b53, (short) ((b53 ^ 687) | (b53 & 687)))).toString(), exc));
                                                                                                                } catch (Throwable th75) {
                                                                                                                    Throwable cause38 = th75.getCause();
                                                                                                                    if (cause38 == null) {
                                                                                                                        throw th75;
                                                                                                                    }
                                                                                                                    throw cause38;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            Array.set(newInstance7, i96, Array.get(obj23, i96));
                                                                                                            int i99 = ((i96 | 56) << 1) - (i96 ^ 56);
                                                                                                            i11 = i99 ^ (-55);
                                                                                                            i10 = (i99 & (-55)) << 1;
                                                                                                        }
                                                                                                        i96 = i11 + i10;
                                                                                                    }
                                                                                                    declaredField2.set(obj24, arrayList);
                                                                                                    declaredField3.set(obj24, newInstance7);
                                                                                                    if (AFPurchaseDetails == null) {
                                                                                                        int i100 = $11;
                                                                                                        int i101 = (i100 ^ 49) + ((i100 & 49) << 1);
                                                                                                        $10 = i101 % 128;
                                                                                                        if (i101 % 2 != 0) {
                                                                                                            AFPurchaseDetails = newInstance3;
                                                                                                            Object obj25 = null;
                                                                                                            try {
                                                                                                                obj25.hashCode();
                                                                                                                throw null;
                                                                                                            } catch (Throwable th76) {
                                                                                                                th = th76;
                                                                                                                obj3 = th;
                                                                                                                i2 = i2;
                                                                                                                while (i3 < 7) {
                                                                                                                }
                                                                                                                int i3522222222222 = $10 + 83;
                                                                                                                $11 = i3522222222222 % 128;
                                                                                                                int i3622222222222 = i3522222222222 % 2;
                                                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                                            }
                                                                                                        }
                                                                                                        AFPurchaseDetails = newInstance3;
                                                                                                    }
                                                                                                } catch (Exception e6) {
                                                                                                    e = e6;
                                                                                                    exc = e;
                                                                                                    StringBuilder sb72 = new StringBuilder();
                                                                                                    byte[] bArr292 = $$a;
                                                                                                    StringBuilder append42 = sb72.append($$c((byte) (-bArr292[193]), bArr292[222], (short) 580)).append(invoke5);
                                                                                                    byte b522 = (byte) (-bArr292[329]);
                                                                                                    byte b532 = bArr292[67];
                                                                                                    throw ((Throwable) Class.forName($$c(bArr292[70], (byte) (-bArr292[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance(append42.append($$c(b522, b532, (short) ((b532 ^ 687) | (b532 & 687)))).toString(), exc));
                                                                                                } catch (Throwable th77) {
                                                                                                    th = th77;
                                                                                                    obj3 = th;
                                                                                                    i2 = i2;
                                                                                                    while (i3 < 7) {
                                                                                                    }
                                                                                                    int i35222222222222 = $10 + 83;
                                                                                                    $11 = i35222222222222 % 128;
                                                                                                    int i36222222222222 = i35222222222222 % 2;
                                                                                                    throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                                }
                                                                                            } catch (Throwable th78) {
                                                                                                th = th78;
                                                                                                Throwable th79 = th;
                                                                                                Throwable cause39 = th79.getCause();
                                                                                                if (cause39 == null) {
                                                                                                    throw th79;
                                                                                                }
                                                                                                throw cause39;
                                                                                            }
                                                                                        } catch (Throwable th80) {
                                                                                            th = th80;
                                                                                        }
                                                                                    } catch (Throwable th81) {
                                                                                        try {
                                                                                            Throwable cause40 = th81.getCause();
                                                                                            if (cause40 == null) {
                                                                                                throw th81;
                                                                                            }
                                                                                            throw cause40;
                                                                                        } catch (IOException unused5) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th82) {
                                                                                    try {
                                                                                        Throwable cause41 = th82.getCause();
                                                                                        if (cause41 == null) {
                                                                                            throw th82;
                                                                                        }
                                                                                        throw cause41;
                                                                                    } catch (IOException unused6) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th83) {
                                                                                Throwable cause42 = th83.getCause();
                                                                                if (cause42 == null) {
                                                                                    throw th83;
                                                                                }
                                                                                throw cause42;
                                                                            }
                                                                        }
                                                                        if (z4) {
                                                                            try {
                                                                                byte[] bArr30 = $$a;
                                                                                byte b54 = bArr30[575];
                                                                                byte b55 = bArr30[33];
                                                                                byte b56 = (byte) (((b55 | 1) << 1) - (b55 ^ 1));
                                                                                int i102 = $$b;
                                                                                Class<?> cls16 = Class.forName($$c(b54, b56, (short) ((i102 & 544) | (i102 ^ 544))));
                                                                                Method declaredMethod2 = cls16.getDeclaredMethod($$c(bArr30[868], (byte) (-bArr30[428]), bArr30[77]), String.class, Class.forName($$c(bArr30[575], (byte) (-bArr30[120]), (short) 552)));
                                                                                declaredMethod2.setAccessible(true);
                                                                                int i103 = $10;
                                                                                int i104 = (i103 & 81) + (i103 | 81);
                                                                                $11 = i104 % 128;
                                                                                int i105 = i104 % 2;
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            ?? invoke6 = declaredMethod2.invoke(newInstance3, str2, Class.class.getMethod($$c(bArr30[245], (byte) (-bArr30[26]), (short) 437), null).invoke(AFc1fSDK.class, null));
                                                                                            if (invoke6 != null) {
                                                                                                cls16.getDeclaredMethod($$c((byte) (-bArr30[193]), bArr30[33], (short) 359), new Class[0]).invoke(newInstance3, new Object[0]);
                                                                                            }
                                                                                            cls2 = invoke6;
                                                                                            if (cls2 != null) {
                                                                                                Constructor declaredConstructor2 = cls.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                declaredConstructor2.setAccessible(true);
                                                                                                AFLogger$LogLevel = declaredConstructor2.newInstance(newInstance3, Boolean.valueOf(!z4));
                                                                                                z3 = false;
                                                                                                z2 = true;
                                                                                                break;
                                                                                            }
                                                                                            int i106 = $11 + 93;
                                                                                            $10 = i106 % 128;
                                                                                            int i107 = i106 % 2;
                                                                                            try {
                                                                                                cls7 = cls2;
                                                                                                bArr2 = $$a;
                                                                                            } catch (Throwable th84) {
                                                                                                th = th84;
                                                                                                obj3 = th;
                                                                                                i2 = i2;
                                                                                                while (i3 < 7) {
                                                                                                }
                                                                                                int i352222222222222 = $10 + 83;
                                                                                                $11 = i352222222222222 % 128;
                                                                                                int i362222222222222 = i352222222222222 % 2;
                                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                            }
                                                                                            try {
                                                                                                str5 = $$c(bArr2[113], bArr2[33], (short) 752);
                                                                                                Constructor declaredConstructor3 = cls7.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                declaredConstructor3.setAccessible(true);
                                                                                                if (!z4) {
                                                                                                    int i108 = 2 % 2;
                                                                                                    z6 = true;
                                                                                                } else {
                                                                                                    z6 = false;
                                                                                                }
                                                                                                AFLogger$LogLevel = declaredConstructor3.newInstance(newInstance3, Boolean.valueOf(z6));
                                                                                                byte[] bArr31 = new byte[7110];
                                                                                                try {
                                                                                                    Object[] objArr14 = {AFc1fSDK.class.getResourceAsStream($$c(bArr2[25], bArr2[175], (short) 946))};
                                                                                                    byte b57 = bArr2[107];
                                                                                                    byte b58 = (byte) (-bArr2[120]);
                                                                                                    Object newInstance8 = Class.forName($$c(b57, b58, (short) (b58 | 436))).getDeclaredConstructor(Class.forName($$c(bArr2[70], (byte) (-bArr2[120]), bArr2[67]))).newInstance(objArr14);
                                                                                                    try {
                                                                                                        byte b59 = bArr2[107];
                                                                                                        byte b60 = (byte) (-bArr2[120]);
                                                                                                        Class.forName($$c(b59, b60, (short) ((b60 ^ 436) | (b60 & 436)))).getMethod($$c(bArr2[868], (byte) 73, (short) 760), byte[].class).invoke(newInstance8, bArr31);
                                                                                                        try {
                                                                                                            byte b61 = bArr2[107];
                                                                                                            byte b62 = (byte) (-bArr2[120]);
                                                                                                            try {
                                                                                                                Class.forName($$c(b61, b62, (short) (b62 | 436))).getMethod($$c((byte) (-bArr2[193]), bArr2[33], (short) 359), null).invoke(newInstance8, null);
                                                                                                                try {
                                                                                                                    i47 = 7064;
                                                                                                                    i27 = i2;
                                                                                                                    zArr6 = zArr3;
                                                                                                                    i23 = i;
                                                                                                                    i46 = Math.abs(i9);
                                                                                                                    bArr17 = bArr31;
                                                                                                                    i48 = i2;
                                                                                                                } catch (Throwable th85) {
                                                                                                                    th = th85;
                                                                                                                }
                                                                                                            } catch (Throwable th86) {
                                                                                                                th = th86;
                                                                                                                Throwable th87 = th;
                                                                                                                Throwable cause43 = th87.getCause();
                                                                                                                if (cause43 == null) {
                                                                                                                    throw th87;
                                                                                                                }
                                                                                                                throw cause43;
                                                                                                            }
                                                                                                        } catch (Throwable th88) {
                                                                                                            th = th88;
                                                                                                        }
                                                                                                    } catch (Throwable th89) {
                                                                                                        Throwable cause44 = th89.getCause();
                                                                                                        if (cause44 == null) {
                                                                                                            throw th89;
                                                                                                        }
                                                                                                        throw cause44;
                                                                                                    }
                                                                                                } catch (Throwable th90) {
                                                                                                    Throwable cause45 = th90.getCause();
                                                                                                    if (cause45 == null) {
                                                                                                        throw th90;
                                                                                                    }
                                                                                                    throw cause45;
                                                                                                }
                                                                                            } catch (Throwable th91) {
                                                                                                th = th91;
                                                                                                obj3 = th;
                                                                                                i2 = i2;
                                                                                                while (i3 < 7) {
                                                                                                }
                                                                                                int i3522222222222222 = $10 + 83;
                                                                                                $11 = i3522222222222222 % 128;
                                                                                                int i3622222222222222 = i3522222222222222 % 2;
                                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                            }
                                                                                        } catch (Throwable th92) {
                                                                                            th = th92;
                                                                                            obj3 = th;
                                                                                            i2 = i2;
                                                                                            while (i3 < 7) {
                                                                                            }
                                                                                            int i35222222222222222 = $10 + 83;
                                                                                            $11 = i35222222222222222 % 128;
                                                                                            int i36222222222222222 = i35222222222222222 % 2;
                                                                                            throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                                        }
                                                                                    } catch (Throwable th93) {
                                                                                        th = th93;
                                                                                        Throwable th94 = th;
                                                                                        Throwable cause46 = th94.getCause();
                                                                                        if (cause46 == null) {
                                                                                            throw th94;
                                                                                        }
                                                                                        throw cause46;
                                                                                    }
                                                                                } catch (Throwable th95) {
                                                                                    th = th95;
                                                                                }
                                                                            } catch (Throwable th96) {
                                                                                th = th96;
                                                                            }
                                                                        } else {
                                                                            String str6 = str2;
                                                                            try {
                                                                                byte[] bArr32 = $$a;
                                                                                declaredMethod = Class.forName($$c(bArr32[575], (byte) (-bArr32[120]), (short) 552)).getDeclaredMethod($$c(bArr32[868], (byte) (-bArr32[428]), bArr32[77]), String.class);
                                                                            } catch (Throwable th97) {
                                                                                th = th97;
                                                                                obj3 = th;
                                                                                i2 = i2;
                                                                                while (i3 < 7) {
                                                                                }
                                                                                int i352222222222222222 = $10 + 83;
                                                                                $11 = i352222222222222222 % 128;
                                                                                int i362222222222222222 = i352222222222222222 % 2;
                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    declaredMethod.setAccessible(true);
                                                                                    cls2 = declaredMethod.invoke(newInstance3, str6);
                                                                                    if (cls2 != null) {
                                                                                    }
                                                                                } catch (InvocationTargetException e7) {
                                                                                    try {
                                                                                        throw ((Exception) e7.getCause());
                                                                                    } catch (ClassNotFoundException unused7) {
                                                                                        cls2 = null;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th98) {
                                                                                obj3 = th98;
                                                                                i2 = i2;
                                                                                while (i3 < 7) {
                                                                                }
                                                                                int i3522222222222222222 = $10 + 83;
                                                                                $11 = i3522222222222222222 % 128;
                                                                                int i3622222222222222222 = i3522222222222222222 % 2;
                                                                                throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                                                            }
                                                                        }
                                                                    } catch (Throwable th99) {
                                                                        Throwable cause47 = th99.getCause();
                                                                        if (cause47 == null) {
                                                                            throw th99;
                                                                        }
                                                                        throw cause47;
                                                                    }
                                                                } catch (Throwable th100) {
                                                                    th = th100;
                                                                    Throwable th101 = th;
                                                                    Throwable cause48 = th101.getCause();
                                                                    if (cause48 == null) {
                                                                        throw th101;
                                                                    }
                                                                    throw cause48;
                                                                }
                                                            } catch (Throwable th102) {
                                                                th = th102;
                                                            }
                                                        }
                                                    } catch (Throwable th103) {
                                                        th = th103;
                                                        Throwable th104 = th;
                                                        Throwable cause49 = th104.getCause();
                                                        if (cause49 == null) {
                                                            throw th104;
                                                        }
                                                        throw cause49;
                                                    }
                                                } catch (Throwable th105) {
                                                    th = th105;
                                                }
                                            } catch (Throwable th106) {
                                                Throwable cause50 = th106.getCause();
                                                if (cause50 == null) {
                                                    throw th106;
                                                }
                                                throw cause50;
                                            }
                                        } catch (Throwable th107) {
                                            Throwable cause51 = th107.getCause();
                                            if (cause51 == null) {
                                                throw th107;
                                            }
                                            throw cause51;
                                        }
                                    } catch (Throwable th108) {
                                        th = th108;
                                        i = i23;
                                        zArr3 = zArr6;
                                        i2 = i27;
                                        obj3 = th;
                                        i2 = i2;
                                        while (i3 < 7) {
                                        }
                                        int i35222222222222222222 = $10 + 83;
                                        $11 = i35222222222222222222 % 128;
                                        int i36222222222222222222 = i35222222222222222222 % 2;
                                        throw ((Throwable) Class.forName($$c(r1[70], (byte) (-$$a[120]), (short) 174)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(r1[107], r1[222], (short) 610), obj3));
                                    }
                                } else {
                                    z2 = z;
                                    zArr = zArr4;
                                    str = $$c;
                                    zArr2 = zArr5;
                                    objArr = objArr3;
                                    i = i23;
                                    zArr3 = zArr6;
                                    i2 = i27;
                                    z3 = false;
                                }
                                i27 = ((i2 & 1) << 1) + (i2 ^ 1);
                                z = z2;
                                zArr4 = zArr;
                                zArr5 = zArr2;
                                objArr3 = objArr;
                                $$c = str;
                                zArr6 = zArr3;
                                i23 = i;
                                c = 342;
                            }
                        }
                        invoke2 = null;
                        char c2 = 342;
                        if (invoke != null) {
                        }
                        if (invoke2 == null) {
                        }
                        if (obj2 == null) {
                            int i202 = $11;
                            int i212 = ((i202 | 61) << 1) - (i202 ^ 61);
                            $10 = i212 % 128;
                            int i222 = i212 % 2;
                            byte[] bArr72 = $$a;
                            short s22 = (short) 108;
                            obj2 = Class.forName($$c((byte) (-bArr72[342]), (byte) (-bArr72[120]), s22)).getDeclaredConstructor(Class.forName($$c((byte) (-bArr72[342]), (byte) (-bArr72[120]), s22)), String.class).newInstance(invoke, $$c(bArr72[168], bArr72[33], (short) 667));
                        }
                        byte[] bArr82 = $$a;
                        short s32 = (short) 108;
                        Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c((byte) (-bArr82[342]), (byte) (-bArr82[120]), s32)), 7);
                        objArr32[0] = null;
                        objArr32[1] = obj2;
                        objArr32[2] = invoke;
                        objArr32[3] = invoke2;
                        objArr32[4] = obj2;
                        objArr32[5] = invoke;
                        objArr32[6] = invoke2;
                        boolean[] zArr42 = {false, true, true, true, true, true, true};
                        boolean[] zArr52 = {false, false, false, false, true, true, true};
                        boolean[] zArr62 = {false, false, true, true, false, true, true};
                        Class<?> cls62 = Class.forName($$c(bArr82[14], (byte) (-bArr82[28]), (short) 845));
                        i13 = cls62.getDeclaredField($$c(bArr82[253], (byte) (-bArr82[244]), (short) 389)).getInt(cls62);
                        if (i13 >= 34) {
                        }
                        if (i13 != 29) {
                            zArr62[0] = i13 != 29 && i13 >= 26;
                            zArr62[1] = i13 < 21;
                            if (i13 < 21) {
                            }
                            zArr62[4] = z7;
                            z = false;
                            int i272 = 0;
                            while (!z) {
                            }
                        }
                        zArr62[0] = i13 != 29 && i13 >= 26;
                        zArr62[1] = i13 < 21;
                        if (i13 < 21) {
                        }
                        zArr62[4] = z7;
                        z = false;
                        int i2722 = 0;
                        while (!z) {
                        }
                    }
                    obj2 = null;
                    if (obj != null) {
                    }
                    invoke2 = null;
                    char c22 = 342;
                    if (invoke != null) {
                    }
                    if (invoke2 == null) {
                    }
                    if (obj2 == null) {
                    }
                    byte[] bArr822 = $$a;
                    short s322 = (short) 108;
                    Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c((byte) (-bArr822[342]), (byte) (-bArr822[120]), s322)), 7);
                    objArr322[0] = null;
                    objArr322[1] = obj2;
                    objArr322[2] = invoke;
                    objArr322[3] = invoke2;
                    objArr322[4] = obj2;
                    objArr322[5] = invoke;
                    objArr322[6] = invoke2;
                    boolean[] zArr422 = {false, true, true, true, true, true, true};
                    boolean[] zArr522 = {false, false, false, false, true, true, true};
                    boolean[] zArr622 = {false, false, true, true, false, true, true};
                    Class<?> cls622 = Class.forName($$c(bArr822[14], (byte) (-bArr822[28]), (short) 845));
                    i13 = cls622.getDeclaredField($$c(bArr822[253], (byte) (-bArr822[244]), (short) 389)).getInt(cls622);
                    if (i13 >= 34) {
                    }
                    zArr622[0] = i13 != 29 && i13 >= 26;
                    zArr622[1] = i13 < 21;
                    if (i13 < 21) {
                    }
                    zArr622[4] = z7;
                    z = false;
                    int i27222 = 0;
                    while (!z) {
                    }
                }
                invoke = null;
                if (obj != null) {
                }
                obj2 = null;
                if (obj != null) {
                }
                invoke2 = null;
                char c222 = 342;
                if (invoke != null) {
                }
                if (invoke2 == null) {
                }
                if (obj2 == null) {
                }
                byte[] bArr8222 = $$a;
                short s3222 = (short) 108;
                Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c((byte) (-bArr8222[342]), (byte) (-bArr8222[120]), s3222)), 7);
                objArr3222[0] = null;
                objArr3222[1] = obj2;
                objArr3222[2] = invoke;
                objArr3222[3] = invoke2;
                objArr3222[4] = obj2;
                objArr3222[5] = invoke;
                objArr3222[6] = invoke2;
                boolean[] zArr4222 = {false, true, true, true, true, true, true};
                boolean[] zArr5222 = {false, false, false, false, true, true, true};
                boolean[] zArr6222 = {false, false, true, true, false, true, true};
                Class<?> cls6222 = Class.forName($$c(bArr8222[14], (byte) (-bArr8222[28]), (short) 845));
                i13 = cls6222.getDeclaredField($$c(bArr8222[253], (byte) (-bArr8222[244]), (short) 389)).getInt(cls6222);
                if (i13 >= 34) {
                }
                zArr6222[0] = i13 != 29 && i13 >= 26;
                zArr6222[1] = i13 < 21;
                if (i13 < 21) {
                }
                zArr6222[4] = z7;
                z = false;
                int i272222 = 0;
                while (!z) {
                }
            }
            byte[] bArr33 = $$a;
            obj = Class.forName($$c(bArr33[9], (byte) (-bArr33[28]), (short) 532)).getMethod($$c(bArr33[575], (byte) (-bArr33[26]), (short) ($$b & 992)), new Class[0]).invoke(null, null);
            if (obj != null) {
            }
            invoke = null;
            if (obj != null) {
            }
            obj2 = null;
            if (obj != null) {
            }
            invoke2 = null;
            char c2222 = 342;
            if (invoke != null) {
            }
            if (invoke2 == null) {
            }
            if (obj2 == null) {
            }
            byte[] bArr82222 = $$a;
            short s32222 = (short) 108;
            Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName($$c((byte) (-bArr82222[342]), (byte) (-bArr82222[120]), s32222)), 7);
            objArr32222[0] = null;
            objArr32222[1] = obj2;
            objArr32222[2] = invoke;
            objArr32222[3] = invoke2;
            objArr32222[4] = obj2;
            objArr32222[5] = invoke;
            objArr32222[6] = invoke2;
            boolean[] zArr42222 = {false, true, true, true, true, true, true};
            boolean[] zArr52222 = {false, false, false, false, true, true, true};
            boolean[] zArr62222 = {false, false, true, true, false, true, true};
            Class<?> cls62222 = Class.forName($$c(bArr82222[14], (byte) (-bArr82222[28]), (short) 845));
            i13 = cls62222.getDeclaredField($$c(bArr82222[253], (byte) (-bArr82222[244]), (short) 389)).getInt(cls62222);
            if (i13 >= 34) {
            }
            zArr62222[0] = i13 != 29 && i13 >= 26;
            zArr62222[1] = i13 < 21;
            if (i13 < 21) {
            }
            zArr62222[4] = z7;
            z = false;
            int i2722222 = 0;
            while (!z) {
            }
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
