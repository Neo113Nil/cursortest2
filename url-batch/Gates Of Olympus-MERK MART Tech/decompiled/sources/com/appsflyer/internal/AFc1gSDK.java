package com.appsflyer.internal;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerImplKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
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
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class AFc1gSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger$LogLevel;
    private static byte[] AFVersionDeclaration;
    public static final Map<Integer, Object> afErrorLog;
    private static final Map<String, Object> afErrorLogForExcManagerOnly;
    private static Object afLogForce;
    private static byte[] getLevel;
    private static int init;
    private static int onAppOpenAttributionNative;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:9:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = (i5 & 35) + (i5 | 35);
        int i7 = i6 % 128;
        $10 = i7;
        int i8 = i6 % 2;
        byte[] bArr = $$a;
        int i9 = -b;
        int i10 = ((i9 | 119) << 1) - (i9 ^ 119);
        int i11 = i2 + 1;
        int i12 = i + 4;
        byte[] bArr2 = new byte[i11];
        int i13 = (~i11) + (i11 << 1);
        if (bArr == null) {
            int i14 = i7 + 57;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            int i15 = i7 + 71;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 5 % 2;
            }
            i3 = 0;
            int i17 = i10;
            i10 = i13;
            i10 = (i10 & i17) + (i10 | i17) + 1;
            bArr2[i3] = (byte) i10;
            if (i3 == i13) {
                String str = new String(bArr2, 0);
                int i18 = $10;
                int i19 = ((i18 | 19) << 1) - (i18 ^ 19);
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 25 / 0;
                }
                return str;
            }
            int i21 = ((i12 | 1) << 1) - (i12 ^ 1);
            int i22 = bArr[i21];
            i3++;
            int i23 = $11 + 63;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            i17 = i22;
            i12 = i21;
            i10 = (i10 & i17) + (i10 | i17) + 1;
            bArr2[i3] = (byte) i10;
            if (i3 == i13) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i10;
            if (i3 == i13) {
            }
        }
    }

    public static int AFInAppEventParameterName(Object obj) {
        Object obj2;
        int i = 2 % 2;
        int i2 = $11;
        int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            obj2 = afLogForce;
            int i4 = 39 / 0;
        } else {
            obj2 = afLogForce;
        }
        int i5 = ((i2 | 119) << 1) - (i2 ^ 119);
        $10 = i5 % 128;
        int i6 = i5 % 2;
        try {
            byte b = $$a[30];
            int intValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 97) | (b & 97)), r1[50]), true, (ClassLoader) AFLogger$LogLevel).getMethod($$c(r1[46], (short) 752, r1[151]), Object.class).invoke(obj2, obj)).intValue();
            int i7 = $11 + 39;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                return intValue;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFInAppEventType(int i) {
        int i2 = 2 % 2;
        int i3 = $10 + 71;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        Object obj = afLogForce;
        int i6 = i4 + 13;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            byte b = bArr[30];
            int intValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 97) | (b & 97)), bArr[50]), true, (ClassLoader) AFLogger$LogLevel).getMethod($$c(bArr[113], (short) 380, (byte) (-bArr[353])), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i8 = $11 + 57;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                return intValue;
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

    static void init$0() {
        int i;
        int i2 = 2 % 2;
        int i3 = $11 + 11;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            byte[] bArr = new byte[PointerIconCompat.TYPE_CELL];
            System.arraycopy("(_\u008eÜ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þ\fõ\rüùúÉ@\u0003º!!üó\u0001\rÿö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ4ìð\u0006Øÿ\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\fý\u000eÑ\"\u0002ø\rÐ$\búö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006Øÿñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eð\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fý\u000eÑýð\u0006\u0013é\u0004\u0005\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ5ëð\u0006ØUò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004ý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002ê\n\bïé\u0016ö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002ø\u000bý\u0002ûø\u0012Û\u001aÖ+î\u0001\u0010ô\u0005þê\u0002ì\u0007\fõ\rüùúÉFþô\u0002Á%$öôþñ\n\n\bï\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000bÚ\u0014ú\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr, 0, PointerIconCompat.TYPE_CELL);
            $$a = bArr;
            i = 23850;
        } else {
            byte[] bArr2 = new byte[PointerIconCompat.TYPE_CELL];
            System.arraycopy("(_\u008eÜ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þ\fõ\rüùúÉ@\u0003º!!üó\u0001\rÿö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ4ìð\u0006Øÿ\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\fý\u000eÑ\"\u0002ø\rÐ$\búö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006Øÿñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eð\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fý\u000eÑýð\u0006\u0013é\u0004\u0005\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ5ëð\u0006ØUò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004ý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002ê\n\bïé\u0016ö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002ø\u000bý\u0002ûø\u0012Û\u001aÖ+î\u0001\u0010ô\u0005þê\u0002ì\u0007\fõ\rüùúÉFþô\u0002Á%$öôþñ\n\n\bï\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000bÚ\u0014ú\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr2, 0, PointerIconCompat.TYPE_CELL);
            $$a = bArr2;
            i = 147;
        }
        $$b = i;
    }

    public static Object values(int i, int i2, char c) {
        int i3 = 2 % 2;
        int i4 = $11 + 23;
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = afLogForce;
        int i6 = ((i5 | 105) << 1) - (i5 ^ 105);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = $$a;
            byte b = bArr[30];
            Class<?> cls = Class.forName($$c(b, (short) (b | 97), bArr[50]), true, (ClassLoader) AFLogger$LogLevel);
            byte b2 = bArr[46];
            Object invoke = cls.getMethod($$c(b2, (short) ((b2 ^ Ascii.RS) | (b2 & Ascii.RS)), bArr[13]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj2, objArr);
            int i8 = $11;
            int i9 = ((i8 | 63) << 1) - (i8 ^ 63);
            $10 = i9 % 128;
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

    private AFc1gSDK() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:872|873|14|(37:868|869|(0)|18|19|(0)|21|22|23|(0)|25|26|(0)(0)|(0)|44|45|46|47|48|49|50|51|(0)(0)|54|(0)|809|59|60|(0)(0)|63|64|(0)(0)|70|71|(0)|802|803)|16|(0)|18|19|(0)|21|22|23|(0)|25|26|(0)(0)|(0)|44|45|46|47|48|49|50|51|(0)(0)|54|(0)|809|59|60|(0)(0)|63|64|(0)(0)|70|71|(0)|802|803) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x039a, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r30[89], r9, r30[r19])).getMethod($$c(r30[r16], (short) 781, r30[69]), r5).invoke(r0, r5)).booleanValue() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a6, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x129d, code lost:
    
        if (r3 != null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x129f, code lost:
    
        r4 = com.appsflyer.internal.AFc1gSDK.$10;
        r5 = (r4 & 5) + (r4 | 5);
        com.appsflyer.internal.AFc1gSDK.$11 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x12ae, code lost:
    
        if ((r5 % 2) != 0) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x12b2, code lost:
    
        r4 = r0[21];
        r2.getDeclaredMethod($$c(r4, (short) ((r4 & (-30338)) | ((~r4) & 30337)), r0[101(0x65, float:1.42E-43)]), new java.lang.Class[r24]).invoke(r1, new java.lang.Object[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x12d4, code lost:
    
        r4 = r0[r16];
        r2.getDeclaredMethod($$c(r4, (short) ((r4 ^ 641) | (r4 & 641)), r0[19]), new java.lang.Class[0]).invoke(r1, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x12f0, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x127a, code lost:
    
        if (r3 != null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x034c, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x034a, code lost:
    
        r24 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1608 A[Catch: Exception -> 0x16c3, TRY_ENTER, TryCatch #89 {Exception -> 0x16c3, blocks: (B:3:0x001d, B:9:0x004b, B:34:0x0237, B:39:0x027f, B:41:0x0285, B:43:0x0286, B:44:0x0287, B:47:0x02d6, B:50:0x02e4, B:60:0x031f, B:63:0x0329, B:70:0x0347, B:75:0x0357, B:140:0x1608, B:144:0x160c, B:147:0x1690, B:142:0x1619, B:149:0x162a, B:156:0x1670, B:158:0x1676, B:159:0x1677, B:817:0x01bc, B:821:0x01bf, B:829:0x16a9, B:831:0x16af, B:832:0x16b0, B:835:0x16b2, B:837:0x16b8, B:838:0x16b9, B:841:0x0163, B:846:0x16bb, B:848:0x16c1, B:849:0x16c2, B:878:0x005b, B:826:0x0207, B:823:0x01cc, B:843:0x0185, B:152:0x163a, B:153:0x166e, B:36:0x0248), top: B:2:0x001d, inners: #4, #7, #16, #61, #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x11eb  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x1341  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1486 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x12fb A[Catch: all -> 0x15b4, TRY_LEAVE, TryCatch #11 {all -> 0x15b4, blocks: (B:340:0x0eb7, B:348:0x0ec2, B:350:0x0ec8, B:351:0x0ec9, B:342:0x0eb9, B:344:0x0ebf, B:345:0x0ec0, B:403:0x0d5d, B:409:0x0d89, B:412:0x0d8e, B:414:0x0d94, B:415:0x0d95, B:419:0x11fe, B:476:0x1274, B:434:0x1354, B:437:0x138e, B:445:0x1454, B:448:0x146c, B:450:0x1472, B:451:0x1473, B:454:0x1475, B:456:0x147b, B:457:0x147c, B:460:0x147e, B:462:0x1484, B:463:0x1485, B:466:0x1486, B:469:0x14ae, B:429:0x12b2, B:430:0x12d4, B:424:0x1297, B:480:0x12f3, B:482:0x12f9, B:483:0x12fa, B:484:0x12fb, B:486:0x132a, B:490:0x1337, B:491:0x133d, B:497:0x0d97, B:499:0x0d9d, B:500:0x0d9e, B:503:0x0da0, B:505:0x0da6, B:506:0x0da7, B:573:0x0ecd, B:579:0x0f34, B:600:0x0fe6, B:602:0x0fec, B:603:0x0fed, B:623:0x10a6, B:626:0x111b, B:628:0x1123, B:632:0x11c3, B:634:0x11ce, B:636:0x11e3, B:638:0x11e7, B:641:0x14ca, B:649:0x1532, B:651:0x1538, B:652:0x1539, B:655:0x153b, B:657:0x1541, B:658:0x1542, B:661:0x1544, B:663:0x154a, B:664:0x154b, B:668:0x1082, B:670:0x1088, B:671:0x1089, B:675:0x104e, B:677:0x1054, B:678:0x1055, B:681:0x154d, B:683:0x1553, B:684:0x1554, B:691:0x1556, B:693:0x155c, B:694:0x155d, B:697:0x155f, B:699:0x1565, B:700:0x1566, B:703:0x1568, B:705:0x156e, B:706:0x156f, B:709:0x1571, B:711:0x157d, B:712:0x157e, B:733:0x1584, B:735:0x1590, B:736:0x1591, B:742:0x1593, B:744:0x15a1, B:745:0x15a2, B:748:0x15a4, B:750:0x15b2, B:751:0x15b3, B:754:0x15b7, B:756:0x15c5, B:757:0x15c6, B:760:0x15c8, B:762:0x15d6, B:763:0x15d7, B:766:0x15d9, B:768:0x15e7, B:769:0x15e8, B:274:0x080f, B:644:0x14fc, B:645:0x1530, B:268:0x07c1, B:337:0x0e91, B:625:0x10e9, B:335:0x0e66, B:622:0x108c, B:266:0x0790, B:613:0x0ff3, B:582:0x0f38, B:263:0x0748, B:577:0x0f16, B:575:0x0ede, B:444:0x142e, B:285:0x09ee, B:474:0x1256, B:422:0x127d, B:441:0x13ee, B:439:0x13b7, B:408:0x0d71, B:721:0x08fc, B:402:0x0d37, B:400:0x0d0e), top: B:418:0x11fe, inners: #2, #9, #13, #15, #17, #20, #21, #23, #25, #29, #33, #37, #49, #55, #63, #66, #67, #75, #82, #84, #87, #88, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x11af  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x11e7 A[Catch: all -> 0x15b4, TRY_LEAVE, TryCatch #11 {all -> 0x15b4, blocks: (B:340:0x0eb7, B:348:0x0ec2, B:350:0x0ec8, B:351:0x0ec9, B:342:0x0eb9, B:344:0x0ebf, B:345:0x0ec0, B:403:0x0d5d, B:409:0x0d89, B:412:0x0d8e, B:414:0x0d94, B:415:0x0d95, B:419:0x11fe, B:476:0x1274, B:434:0x1354, B:437:0x138e, B:445:0x1454, B:448:0x146c, B:450:0x1472, B:451:0x1473, B:454:0x1475, B:456:0x147b, B:457:0x147c, B:460:0x147e, B:462:0x1484, B:463:0x1485, B:466:0x1486, B:469:0x14ae, B:429:0x12b2, B:430:0x12d4, B:424:0x1297, B:480:0x12f3, B:482:0x12f9, B:483:0x12fa, B:484:0x12fb, B:486:0x132a, B:490:0x1337, B:491:0x133d, B:497:0x0d97, B:499:0x0d9d, B:500:0x0d9e, B:503:0x0da0, B:505:0x0da6, B:506:0x0da7, B:573:0x0ecd, B:579:0x0f34, B:600:0x0fe6, B:602:0x0fec, B:603:0x0fed, B:623:0x10a6, B:626:0x111b, B:628:0x1123, B:632:0x11c3, B:634:0x11ce, B:636:0x11e3, B:638:0x11e7, B:641:0x14ca, B:649:0x1532, B:651:0x1538, B:652:0x1539, B:655:0x153b, B:657:0x1541, B:658:0x1542, B:661:0x1544, B:663:0x154a, B:664:0x154b, B:668:0x1082, B:670:0x1088, B:671:0x1089, B:675:0x104e, B:677:0x1054, B:678:0x1055, B:681:0x154d, B:683:0x1553, B:684:0x1554, B:691:0x1556, B:693:0x155c, B:694:0x155d, B:697:0x155f, B:699:0x1565, B:700:0x1566, B:703:0x1568, B:705:0x156e, B:706:0x156f, B:709:0x1571, B:711:0x157d, B:712:0x157e, B:733:0x1584, B:735:0x1590, B:736:0x1591, B:742:0x1593, B:744:0x15a1, B:745:0x15a2, B:748:0x15a4, B:750:0x15b2, B:751:0x15b3, B:754:0x15b7, B:756:0x15c5, B:757:0x15c6, B:760:0x15c8, B:762:0x15d6, B:763:0x15d7, B:766:0x15d9, B:768:0x15e7, B:769:0x15e8, B:274:0x080f, B:644:0x14fc, B:645:0x1530, B:268:0x07c1, B:337:0x0e91, B:625:0x10e9, B:335:0x0e66, B:622:0x108c, B:266:0x0790, B:613:0x0ff3, B:582:0x0f38, B:263:0x0748, B:577:0x0f16, B:575:0x0ede, B:444:0x142e, B:285:0x09ee, B:474:0x1256, B:422:0x127d, B:441:0x13ee, B:439:0x13b7, B:408:0x0d71, B:721:0x08fc, B:402:0x0d37, B:400:0x0d0e), top: B:418:0x11fe, inners: #2, #9, #13, #15, #17, #20, #21, #23, #25, #29, #33, #37, #49, #55, #63, #66, #67, #75, #82, #84, #87, #88, #91 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x1678  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x01bf A[Catch: Exception -> 0x16c3, TRY_ENTER, TRY_LEAVE, TryCatch #89 {Exception -> 0x16c3, blocks: (B:3:0x001d, B:9:0x004b, B:34:0x0237, B:39:0x027f, B:41:0x0285, B:43:0x0286, B:44:0x0287, B:47:0x02d6, B:50:0x02e4, B:60:0x031f, B:63:0x0329, B:70:0x0347, B:75:0x0357, B:140:0x1608, B:144:0x160c, B:147:0x1690, B:142:0x1619, B:149:0x162a, B:156:0x1670, B:158:0x1676, B:159:0x1677, B:817:0x01bc, B:821:0x01bf, B:829:0x16a9, B:831:0x16af, B:832:0x16b0, B:835:0x16b2, B:837:0x16b8, B:838:0x16b9, B:841:0x0163, B:846:0x16bb, B:848:0x16c1, B:849:0x16c2, B:878:0x005b, B:826:0x0207, B:823:0x01cc, B:843:0x0185, B:152:0x163a, B:153:0x166e, B:36:0x0248), top: B:2:0x001d, inners: #4, #7, #16, #61, #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:839:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:850:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:859:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:868:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v233, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v91, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v70, types: [java.lang.Class] */
    static {
        String str;
        Object obj;
        Object invoke;
        Class<?> cls;
        byte[] bArr;
        char c;
        Object invoke2;
        Class<?> cls2;
        byte[] bArr2;
        char c2;
        Object invoke3;
        int i;
        char c3;
        char c4;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        short s;
        short s2;
        int i2;
        Class<byte[]> cls3;
        boolean[] zArr4;
        String str2;
        short s3;
        Class<?>[] clsArr;
        boolean z;
        Object[] objArr2;
        short s4;
        int i3;
        boolean[] zArr5;
        int i4;
        int i5;
        int i6;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i7;
        String str3;
        Object obj6;
        InputStream inputStream;
        char c5;
        byte[] bArr3;
        Object invoke4;
        Object newInstance;
        int length;
        int i8;
        Class cls4;
        int i9;
        boolean z2;
        boolean z3;
        byte[] bArr4;
        ?? invoke5;
        Object obj7;
        Throwable th;
        int min;
        short s5;
        Object obj8;
        int i10;
        Random random;
        int i11;
        int i12;
        boolean z4;
        Class<byte[]> cls5 = byte[].class;
        init$0();
        init = -1812804333;
        onAppOpenAttributionNative = 775122793;
        afErrorLogForExcManagerOnly = new HashMap();
        afErrorLog = new HashMap();
        try {
            byte[] bArr5 = $$a;
            byte b = bArr5[30];
            String $$c = $$c(b, (short) ((b ^ 425) | (b & 425)), bArr5[50]);
            Class<?>[] clsArr2 = null;
            int i13 = 2;
            boolean z5 = true;
            if (afLogForce == null) {
                int i14 = $11;
                int i15 = (i14 ^ 105) + ((i14 & 105) << 1);
                $10 = i15 % 128;
                str = i15 % 2 != 0 ? $$c(bArr5[70], (short) 9788, bArr5[112]) : $$c(bArr5[30], (short) 945, bArr5[14]);
            } else {
                str = null;
            }
            try {
                byte b2 = bArr5[762];
                Method method = Class.forName($$c(b2, (short) ((b2 ^ 705) | (b2 & 705)), bArr5[586])).getMethod($$c(bArr5[30], (short) (-bArr5[169]), bArr5[70]), new Class[0]);
                obj = method.invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
            try {
                byte[] bArr6 = $$a;
                obj = Class.forName($$c(bArr6[762], (short) TypedValues.CycleType.TYPE_WAVE_OFFSET, bArr6[287])).getMethod($$c(bArr6[397], (short) 813, bArr6[30]), new Class[0]).invoke(null, null);
            } catch (Exception unused2) {
            }
            if (obj != null) {
                try {
                    Class<?> cls6 = obj.getClass();
                    byte b3 = $$a[397];
                    String $$c2 = $$c(b3, (short) (b3 | 226), r13[25]);
                    Method method2 = cls6.getMethod($$c2, null);
                    invoke = method2.invoke(obj, null);
                } catch (Exception unused3) {
                    invoke = null;
                    if (obj != null) {
                        try {
                            cls = obj.getClass();
                            bArr = $$a;
                            c = 30;
                        } catch (Exception unused4) {
                            c = 30;
                            invoke2 = null;
                            if (obj != null) {
                            }
                            c2 = 762;
                            invoke3 = null;
                            if (invoke == null) {
                            }
                            i = 5;
                            if (invoke3 != null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr7 = $$a;
                            short s6 = (short) 833;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7[89], s6, bArr7[i])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[i] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = false;
                            zArr3[i] = true;
                            zArr3[6] = true;
                            byte b4 = bArr7[c2];
                            int i16 = $$b;
                            short s7 = (short) ((i16 & 2) + (i16 | 2));
                            short s8 = 0;
                            Class<?> cls7 = Class.forName($$c(b4, s7, bArr7[192]));
                            i12 = cls7.getDeclaredField($$c(bArr7[45], (short) 599, bArr7[151])).getInt(cls7);
                            if (i12 >= 34) {
                            }
                            zArr3[0] = i12 != 29 && i12 >= 26;
                            zArr3[1] = i12 < 21;
                            if (i12 < 21) {
                            }
                            zArr3[4] = z4;
                            s2 = s8;
                            i2 = s2;
                            while (s2 == 0) {
                            }
                        }
                        try {
                            String $$c3 = $$c(bArr[397], (short) 329, bArr[9]);
                            Method method3 = cls.getMethod($$c3, null);
                            invoke2 = method3.invoke(obj, null);
                        } catch (Exception unused5) {
                            invoke2 = null;
                            if (obj != null) {
                            }
                            c2 = 762;
                            invoke3 = null;
                            if (invoke == null) {
                            }
                            i = 5;
                            if (invoke3 != null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr72 = $$a;
                            short s62 = (short) 833;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr72[89], s62, bArr72[i])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[i] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = false;
                            zArr3[i] = true;
                            zArr3[6] = true;
                            byte b42 = bArr72[c2];
                            int i162 = $$b;
                            short s72 = (short) ((i162 & 2) + (i162 | 2));
                            short s82 = 0;
                            Class<?> cls72 = Class.forName($$c(b42, s72, bArr72[192]));
                            i12 = cls72.getDeclaredField($$c(bArr72[45], (short) 599, bArr72[151])).getInt(cls72);
                            if (i12 >= 34) {
                            }
                            zArr3[0] = i12 != 29 && i12 >= 26;
                            zArr3[1] = i12 < 21;
                            if (i12 < 21) {
                            }
                            zArr3[4] = z4;
                            s2 = s82;
                            i2 = s2;
                            while (s2 == 0) {
                            }
                        }
                        if (obj != null) {
                            try {
                                cls2 = obj.getClass();
                                bArr2 = $$a;
                                c2 = 762;
                            } catch (Exception unused6) {
                                c2 = 762;
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                i = 5;
                                if (invoke3 != null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr722 = $$a;
                                short s622 = (short) 833;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr722[89], s622, bArr722[i])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = invoke3;
                                objArr[4] = invoke2;
                                objArr[i] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[1] = false;
                                zArr3[2] = true;
                                zArr3[3] = true;
                                zArr3[4] = false;
                                zArr3[i] = true;
                                zArr3[6] = true;
                                byte b422 = bArr722[c2];
                                int i1622 = $$b;
                                short s722 = (short) ((i1622 & 2) + (i1622 | 2));
                                short s822 = 0;
                                Class<?> cls722 = Class.forName($$c(b422, s722, bArr722[192]));
                                i12 = cls722.getDeclaredField($$c(bArr722[45], (short) 599, bArr722[151])).getInt(cls722);
                                if (i12 >= 34) {
                                }
                                zArr3[0] = i12 != 29 && i12 >= 26;
                                zArr3[1] = i12 < 21;
                                if (i12 < 21) {
                                }
                                zArr3[4] = z4;
                                s2 = s822;
                                i2 = s2;
                                while (s2 == 0) {
                                }
                            }
                            try {
                                String $$c4 = $$c(bArr2[397], (short) 256, bArr2[25]);
                                Method method4 = cls2.getMethod($$c4, null);
                                invoke3 = method4.invoke(obj, null);
                            } catch (Exception unused7) {
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                i = 5;
                                if (invoke3 != null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr7222 = $$a;
                                short s6222 = (short) 833;
                                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7222[89], s6222, bArr7222[i])), 7);
                                objArr[0] = null;
                                objArr[1] = invoke2;
                                objArr[2] = invoke;
                                objArr[3] = invoke3;
                                objArr[4] = invoke2;
                                objArr[i] = invoke;
                                objArr[6] = invoke3;
                                zArr = new boolean[]{false, true, true, true, true, true, true};
                                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                zArr3 = new boolean[7];
                                zArr3[0] = false;
                                zArr3[1] = false;
                                zArr3[2] = true;
                                zArr3[3] = true;
                                zArr3[4] = false;
                                zArr3[i] = true;
                                zArr3[6] = true;
                                byte b4222 = bArr7222[c2];
                                int i16222 = $$b;
                                short s7222 = (short) ((i16222 & 2) + (i16222 | 2));
                                short s8222 = 0;
                                Class<?> cls7222 = Class.forName($$c(b4222, s7222, bArr7222[192]));
                                i12 = cls7222.getDeclaredField($$c(bArr7222[45], (short) 599, bArr7222[151])).getInt(cls7222);
                                if (i12 >= 34) {
                                }
                                zArr3[0] = i12 != 29 && i12 >= 26;
                                zArr3[1] = i12 < 21;
                                if (i12 < 21) {
                                }
                                zArr3[4] = z4;
                                s2 = s8222;
                                i2 = s2;
                                while (s2 == 0) {
                                }
                            }
                            if (invoke == null) {
                                if (str != null) {
                                    StringBuilder sb = new StringBuilder();
                                    byte[] bArr8 = $$a;
                                    i = 5;
                                    try {
                                        invoke = Class.forName($$c(bArr8[89], (short) 833, bArr8[5])).getDeclaredConstructor(String.class).newInstance(sb.append($$c((byte) 72, (short) 564, bArr8[25])).append(str).toString());
                                        if (invoke3 != null) {
                                            int i17 = $10 + 107;
                                            $11 = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                throw null;
                                            }
                                            c3 = '%';
                                            c4 = 397;
                                        } else {
                                            byte[] bArr9 = $$a;
                                            byte b5 = bArr9[89];
                                            try {
                                                Object[] objArr3 = {$$c(b5, (short) 690, b5)};
                                                c3 = '%';
                                                Class<?> cls8 = Class.forName($$c(bArr9[89], bArr9[37], bArr9[650]));
                                                byte b6 = bArr9[397];
                                                c4 = 397;
                                                Object invoke6 = cls8.getMethod($$c(b6, (short) ((b6 & 687) | (b6 ^ 687)), bArr9[25]), String.class).invoke(null, objArr3);
                                                int i18 = 2 % 2;
                                                try {
                                                    invoke3 = Class.forName($$c(bArr9[89], (short) 833, bArr9[i])).getDeclaredConstructor(String.class).newInstance(invoke6);
                                                } catch (Throwable th2) {
                                                    Throwable cause = th2.getCause();
                                                    if (cause == null) {
                                                        throw th2;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (Throwable th3) {
                                                Throwable cause2 = th3.getCause();
                                                if (cause2 == null) {
                                                    throw th3;
                                                }
                                                throw cause2;
                                            }
                                        }
                                        if (invoke2 == null && invoke != null) {
                                            int i19 = $10 + 9;
                                            $11 = i19 % 128;
                                            int i20 = i19 % 2;
                                            byte[] bArr10 = $$a;
                                            try {
                                                short s9 = (short) 833;
                                                invoke2 = Class.forName($$c(bArr10[89], s9, bArr10[i])).getDeclaredConstructor(Class.forName($$c(bArr10[89], s9, bArr10[i])), String.class).newInstance(invoke, $$c(bArr10[c], (short) 289, bArr10[206]));
                                            } catch (Throwable th4) {
                                                Throwable cause3 = th4.getCause();
                                                if (cause3 == null) {
                                                    throw th4;
                                                }
                                                throw cause3;
                                            }
                                        }
                                        byte[] bArr72222 = $$a;
                                        short s62222 = (short) 833;
                                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr72222[89], s62222, bArr72222[i])), 7);
                                        objArr[0] = null;
                                        objArr[1] = invoke2;
                                        objArr[2] = invoke;
                                        objArr[3] = invoke3;
                                        objArr[4] = invoke2;
                                        objArr[i] = invoke;
                                        objArr[6] = invoke3;
                                        zArr = new boolean[]{false, true, true, true, true, true, true};
                                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                                        zArr3 = new boolean[7];
                                        zArr3[0] = false;
                                        zArr3[1] = false;
                                        zArr3[2] = true;
                                        zArr3[3] = true;
                                        zArr3[4] = false;
                                        zArr3[i] = true;
                                        zArr3[6] = true;
                                        byte b42222 = bArr72222[c2];
                                        int i162222 = $$b;
                                        short s72222 = (short) ((i162222 & 2) + (i162222 | 2));
                                        short s82222 = 0;
                                        Class<?> cls72222 = Class.forName($$c(b42222, s72222, bArr72222[192]));
                                        i12 = cls72222.getDeclaredField($$c(bArr72222[45], (short) 599, bArr72222[151])).getInt(cls72222);
                                        if (i12 >= 34) {
                                            int i21 = 2 % 2;
                                            s = 1;
                                        } else {
                                            s = 0;
                                        }
                                        zArr3[0] = i12 != 29 && i12 >= 26;
                                        zArr3[1] = i12 < 21;
                                        if (i12 < 21) {
                                            int i22 = $10;
                                            int i23 = ((i22 | 105) << 1) - (i22 ^ 105);
                                            $11 = i23 % 128;
                                            if (i23 % 2 == 0) {
                                                int i24 = 5 % 3;
                                            } else {
                                                int i25 = 2 % 2;
                                            }
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        zArr3[4] = z4;
                                        s2 = s82222;
                                        i2 = s2;
                                        while (s2 == 0 && i2 < 9) {
                                            if (zArr3[i2]) {
                                                cls3 = cls5;
                                                zArr4 = zArr;
                                                str2 = $$c;
                                                s3 = s;
                                                clsArr = clsArr2;
                                                z = z5;
                                                objArr2 = objArr;
                                                s4 = s2;
                                                i3 = i2;
                                                zArr5 = zArr2;
                                                i4 = i13;
                                            } else {
                                                try {
                                                    boolean z6 = zArr[i2];
                                                    Object obj9 = objArr[i2];
                                                    boolean z7 = zArr2[i2];
                                                    if (z6) {
                                                        if (obj9 != null) {
                                                            try {
                                                                byte[] bArr11 = $$a;
                                                                i6 = i13;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                            try {
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                Throwable cause4 = th.getCause();
                                                                if (cause4 == null) {
                                                                    throw th;
                                                                }
                                                                throw cause4;
                                                            }
                                                        }
                                                        StringBuilder sb2 = new StringBuilder();
                                                        byte[] bArr12 = $$a;
                                                        String sb3 = sb2.append($$c(bArr12[c3], (short) 368, bArr12[19])).append(obj9).append($$c((byte) 78, (short) 269, bArr12[67])).toString();
                                                        int i26 = $11 + 71;
                                                        $10 = i26 % 128;
                                                        int i27 = i26 % 2;
                                                        try {
                                                            Class<?> cls9 = Class.forName($$c(bArr12[89], (short) 788, bArr12[83]));
                                                            Class<?>[] clsArr3 = new Class[1];
                                                            clsArr3[s82222] = String.class;
                                                            throw ((Throwable) cls9.getDeclaredConstructor(clsArr3).newInstance(sb3));
                                                        } catch (Throwable th7) {
                                                            Throwable cause5 = th7.getCause();
                                                            if (cause5 == null) {
                                                                throw th7;
                                                            }
                                                            throw cause5;
                                                        }
                                                    }
                                                    i6 = i13;
                                                    if (z6) {
                                                        Random random2 = new Random();
                                                        try {
                                                            byte[] bArr13 = $$a;
                                                            Class<?> cls10 = Class.forName($$c(bArr13[89], bArr13[c3], bArr13[650]));
                                                            byte b7 = bArr13[c];
                                                            cls3 = cls5;
                                                            try {
                                                                try {
                                                                    random2.setSeed(((Long) cls10.getMethod($$c(b7, (short) ((b7 & 866) | (b7 ^ 866)), bArr13[c4]), null).invoke(null, null)).longValue() ^ (-1560323895));
                                                                    Object obj10 = null;
                                                                    obj2 = null;
                                                                    obj3 = null;
                                                                    obj4 = null;
                                                                    while (obj10 == null) {
                                                                        if (obj2 == null) {
                                                                            i10 = 6;
                                                                            obj8 = obj10;
                                                                        } else if (obj3 == null) {
                                                                            obj8 = obj10;
                                                                            i10 = i;
                                                                        } else if (obj4 == null) {
                                                                            obj8 = obj10;
                                                                            i10 = 4;
                                                                        } else {
                                                                            obj8 = obj10;
                                                                            i10 = 3;
                                                                        }
                                                                        zArr4 = zArr;
                                                                        try {
                                                                            StringBuilder sb4 = new StringBuilder(i10 + 1);
                                                                            sb4.append('.');
                                                                            int i28 = s82222;
                                                                            while (i28 < i10) {
                                                                                int i29 = i28;
                                                                                int i30 = $10 + 97;
                                                                                str2 = $$c;
                                                                                $11 = i30 % 128;
                                                                                int i31 = i30 % 2;
                                                                                if (z7) {
                                                                                    try {
                                                                                        int nextInt = random2.nextInt(26);
                                                                                        if (random2.nextBoolean()) {
                                                                                            i11 = 64 - (~nextInt);
                                                                                        } else {
                                                                                            i11 = ((nextInt | 96) << 1) - (nextInt ^ 96);
                                                                                            int i32 = i6 % i6;
                                                                                        }
                                                                                        sb4.append((char) i11);
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        s3 = s;
                                                                                        objArr2 = objArr;
                                                                                        s4 = s2;
                                                                                        i3 = i2;
                                                                                        zArr5 = zArr2;
                                                                                        i5 = ((i3 | 1) << 1) - (i3 ^ 1);
                                                                                        while (i5 < 7) {
                                                                                        }
                                                                                        byte[] bArr14 = $$a;
                                                                                        try {
                                                                                            throw ((Throwable) Class.forName($$c(bArr14[89], (short) 788, bArr14[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(bArr14[c3], (short) 346, bArr14[c2]), th));
                                                                                        } catch (Throwable th9) {
                                                                                            Throwable cause6 = th9.getCause();
                                                                                            if (cause6 == null) {
                                                                                                throw th9;
                                                                                            }
                                                                                            throw cause6;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    int nextInt2 = random2.nextInt(12);
                                                                                    sb4.append((char) ((nextInt2 ^ 8192) + ((nextInt2 & 8192) << 1)));
                                                                                }
                                                                                i28 = i29 + 1;
                                                                                $$c = str2;
                                                                            }
                                                                            str2 = $$c;
                                                                            String sb5 = sb4.toString();
                                                                            if (obj2 == null) {
                                                                                try {
                                                                                    Object[] objArr4 = new Object[i6];
                                                                                    objArr4[1] = sb5;
                                                                                    objArr4[s82222] = obj9;
                                                                                    byte[] bArr15 = $$a;
                                                                                    Class<?> cls11 = Class.forName($$c(bArr15[89], s62222, bArr15[i]));
                                                                                    Class<?>[] clsArr4 = new Class[2];
                                                                                    clsArr4[s82222] = Class.forName($$c(bArr15[89], s62222, bArr15[i]));
                                                                                    clsArr4[1] = String.class;
                                                                                    obj2 = cls11.getDeclaredConstructor(clsArr4).newInstance(objArr4);
                                                                                    s3 = s;
                                                                                    random = random2;
                                                                                    obj10 = obj8;
                                                                                } catch (Throwable th10) {
                                                                                    Throwable cause7 = th10.getCause();
                                                                                    if (cause7 == null) {
                                                                                        throw th10;
                                                                                    }
                                                                                    throw cause7;
                                                                                }
                                                                            } else if (obj3 == null) {
                                                                                try {
                                                                                    Object[] objArr5 = new Object[2];
                                                                                    objArr5[1] = sb5;
                                                                                    objArr5[s82222] = obj9;
                                                                                    byte[] bArr16 = $$a;
                                                                                    Class<?> cls12 = Class.forName($$c(bArr16[89], s62222, bArr16[i]));
                                                                                    Class<?>[] clsArr5 = new Class[2];
                                                                                    clsArr5[s82222] = Class.forName($$c(bArr16[89], s62222, bArr16[i]));
                                                                                    clsArr5[1] = String.class;
                                                                                    Object newInstance2 = cls12.getDeclaredConstructor(clsArr5).newInstance(objArr5);
                                                                                    int i33 = 2 % 2;
                                                                                    obj3 = newInstance2;
                                                                                    s3 = s;
                                                                                    random = random2;
                                                                                    obj10 = obj8;
                                                                                } catch (Throwable th11) {
                                                                                    Throwable cause8 = th11.getCause();
                                                                                    if (cause8 == null) {
                                                                                        throw th11;
                                                                                    }
                                                                                    throw cause8;
                                                                                }
                                                                            } else if (obj4 == null) {
                                                                                try {
                                                                                    Object[] objArr6 = new Object[2];
                                                                                    objArr6[1] = sb5;
                                                                                    objArr6[s82222] = obj9;
                                                                                    byte[] bArr17 = $$a;
                                                                                    Class<?> cls13 = Class.forName($$c(bArr17[89], s62222, bArr17[i]));
                                                                                    Class<?>[] clsArr6 = new Class[2];
                                                                                    clsArr6[s82222] = Class.forName($$c(bArr17[89], s62222, bArr17[i]));
                                                                                    clsArr6[1] = String.class;
                                                                                    obj4 = cls13.getDeclaredConstructor(clsArr6).newInstance(objArr6);
                                                                                    s3 = s;
                                                                                    random = random2;
                                                                                    obj10 = obj8;
                                                                                } catch (Throwable th12) {
                                                                                    Throwable cause9 = th12.getCause();
                                                                                    if (cause9 == null) {
                                                                                        throw th12;
                                                                                    }
                                                                                    throw cause9;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    Object[] objArr7 = new Object[2];
                                                                                    objArr7[1] = sb5;
                                                                                    objArr7[s82222] = obj9;
                                                                                    byte[] bArr18 = $$a;
                                                                                    Class<?> cls14 = Class.forName($$c(bArr18[89], s62222, bArr18[i]));
                                                                                    Class<?>[] clsArr7 = new Class[2];
                                                                                    s3 = s;
                                                                                    try {
                                                                                        try {
                                                                                            clsArr7[s82222] = Class.forName($$c(bArr18[89], s62222, bArr18[i]));
                                                                                            clsArr7[1] = String.class;
                                                                                            obj10 = cls14.getDeclaredConstructor(clsArr7).newInstance(objArr7);
                                                                                            try {
                                                                                                short s10 = (short) 758;
                                                                                                Class<?> cls15 = Class.forName($$c(bArr18[89], s10, bArr18[192]));
                                                                                                random = random2;
                                                                                                Class<?>[] clsArr8 = new Class[1];
                                                                                                Object obj11 = obj2;
                                                                                                clsArr8[s82222] = Class.forName($$c(bArr18[89], s62222, bArr18[i]));
                                                                                                Object newInstance3 = cls15.getDeclaredConstructor(clsArr8).newInstance(obj10);
                                                                                                try {
                                                                                                    Class<?> cls16 = Class.forName($$c(bArr18[89], s10, bArr18[192]));
                                                                                                    byte b8 = bArr18[c];
                                                                                                    cls16.getMethod($$c(b8, (short) (b8 | 641), bArr18[19]), null).invoke(newInstance3, null);
                                                                                                    obj2 = obj11;
                                                                                                } catch (Throwable th13) {
                                                                                                    Throwable cause10 = th13.getCause();
                                                                                                    if (cause10 == null) {
                                                                                                        throw th13;
                                                                                                    }
                                                                                                    throw cause10;
                                                                                                }
                                                                                            } catch (Throwable th14) {
                                                                                                Throwable cause11 = th14.getCause();
                                                                                                if (cause11 == null) {
                                                                                                    throw th14;
                                                                                                }
                                                                                                throw cause11;
                                                                                            }
                                                                                        } catch (Exception e) {
                                                                                            try {
                                                                                                StringBuilder sb6 = new StringBuilder();
                                                                                                byte[] bArr19 = $$a;
                                                                                                String sb7 = sb6.append($$c(bArr19[c3], (short) 860, bArr19[19])).append(clsArr7).append($$c((byte) 78, (short) 269, bArr19[67])).toString();
                                                                                                try {
                                                                                                    Object[] objArr8 = new Object[2];
                                                                                                    objArr8[1] = e;
                                                                                                    objArr8[s82222] = sb7;
                                                                                                    Class<?> cls17 = Class.forName($$c(bArr19[89], (short) 788, bArr19[83]));
                                                                                                    Class<?>[] clsArr9 = new Class[2];
                                                                                                    clsArr9[s82222] = String.class;
                                                                                                    clsArr9[1] = Throwable.class;
                                                                                                    throw ((Throwable) cls17.getDeclaredConstructor(clsArr9).newInstance(objArr8));
                                                                                                } catch (Throwable th15) {
                                                                                                    Throwable cause12 = th15.getCause();
                                                                                                    if (cause12 == null) {
                                                                                                        throw th15;
                                                                                                    }
                                                                                                    throw cause12;
                                                                                                }
                                                                                            } catch (Throwable th16) {
                                                                                                th = th16;
                                                                                                objArr2 = objArr;
                                                                                                s4 = s2;
                                                                                                i3 = i2;
                                                                                                zArr5 = zArr2;
                                                                                                i5 = ((i3 | 1) << 1) - (i3 ^ 1);
                                                                                                while (i5 < 7) {
                                                                                                }
                                                                                                byte[] bArr142 = $$a;
                                                                                                throw ((Throwable) Class.forName($$c(bArr142[89], (short) 788, bArr142[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(bArr142[c3], (short) 346, bArr142[c2]), th));
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th17) {
                                                                                        th = th17;
                                                                                        Throwable cause13 = th.getCause();
                                                                                        if (cause13 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause13;
                                                                                    }
                                                                                } catch (Throwable th18) {
                                                                                    th = th18;
                                                                                }
                                                                            }
                                                                            zArr = zArr4;
                                                                            $$c = str2;
                                                                            s = s3;
                                                                            random2 = random;
                                                                            i6 = 2;
                                                                        } catch (Throwable th19) {
                                                                            th = th19;
                                                                            str2 = $$c;
                                                                            s3 = s;
                                                                            objArr2 = objArr;
                                                                            s4 = s2;
                                                                            i3 = i2;
                                                                            zArr5 = zArr2;
                                                                            i5 = ((i3 | 1) << 1) - (i3 ^ 1);
                                                                            while (i5 < 7) {
                                                                            }
                                                                            byte[] bArr1422 = $$a;
                                                                            throw ((Throwable) Class.forName($$c(bArr1422[89], (short) 788, bArr1422[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(bArr1422[c3], (short) 346, bArr1422[c2]), th));
                                                                        }
                                                                    }
                                                                    obj5 = obj10;
                                                                } catch (Throwable th20) {
                                                                    th = th20;
                                                                    zArr4 = zArr;
                                                                    str2 = $$c;
                                                                    s3 = s;
                                                                    objArr2 = objArr;
                                                                    s4 = s2;
                                                                    i3 = i2;
                                                                    zArr5 = zArr2;
                                                                    i5 = ((i3 | 1) << 1) - (i3 ^ 1);
                                                                    while (i5 < 7) {
                                                                    }
                                                                    byte[] bArr14222 = $$a;
                                                                    throw ((Throwable) Class.forName($$c(bArr14222[89], (short) 788, bArr14222[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(bArr14222[c3], (short) 346, bArr14222[c2]), th));
                                                                }
                                                            } catch (Throwable th21) {
                                                                th = th21;
                                                                Throwable cause14 = th.getCause();
                                                                if (cause14 == null) {
                                                                    throw th;
                                                                }
                                                                throw cause14;
                                                            }
                                                        } catch (Throwable th22) {
                                                            th = th22;
                                                        }
                                                    } else {
                                                        cls3 = cls5;
                                                        obj2 = null;
                                                        obj3 = null;
                                                        obj4 = null;
                                                        obj5 = null;
                                                    }
                                                    zArr4 = zArr;
                                                    str2 = $$c;
                                                    s3 = s;
                                                    byte[] bArr20 = new byte[6974];
                                                    byte[] bArr21 = $$a;
                                                    InputStream resourceAsStream = AFc1gSDK.class.getResourceAsStream($$c((byte) 72, (short) 665, bArr21[586]));
                                                    int i34 = $10;
                                                    int i35 = (i34 ^ 115) + ((i34 & 115) << 1);
                                                    $11 = i35 % 128;
                                                    int i36 = i35 % 2;
                                                    try {
                                                        short s11 = (short) 487;
                                                        Class<?> cls18 = Class.forName($$c(bArr21[89], s11, bArr21[c2]));
                                                        Class<?>[] clsArr10 = new Class[1];
                                                        byte b9 = bArr21[89];
                                                        int i37 = $$b;
                                                        Object obj12 = obj2;
                                                        clsArr10[s82222] = Class.forName($$c(b9, (short) ((i37 & 836) | (i37 ^ 836)), bArr21[83]));
                                                        Object newInstance4 = cls18.getDeclaredConstructor(clsArr10).newInstance(resourceAsStream);
                                                        int i38 = $10 + 19;
                                                        $11 = i38 % 128;
                                                        int i39 = i38 % 2;
                                                        try {
                                                            ?? cls19 = Class.forName($$c(bArr21[89], s11, bArr21[c2]));
                                                            String $$c5 = $$c(bArr21[13], (short) 234, bArr21[74]);
                                                            Class[] clsArr11 = new Class[1];
                                                            clsArr11[s82222] = cls3;
                                                            cls19.getMethod($$c5, clsArr11).invoke(newInstance4, bArr20);
                                                            try {
                                                                Class<?> cls20 = Class.forName($$c(bArr21[89], s11, bArr21[c2]));
                                                                byte b10 = bArr21[c];
                                                                cls20.getMethod($$c(b10, (short) ((b10 ^ 641) | (b10 & 641)), bArr21[19]), null).invoke(newInstance4, null);
                                                                int i40 = 22;
                                                                int i41 = 6932;
                                                                String str4 = str2;
                                                                Class cls21 = null;
                                                                while (true) {
                                                                    int i42 = (i40 & 280) + (i40 | 280);
                                                                    byte b11 = bArr20[((i40 | 6911) << 1) - (i40 ^ 6911)];
                                                                    bArr20[i42] = (byte) ((b11 ^ 94) + ((b11 & 94) << 1));
                                                                    try {
                                                                        Object[] objArr9 = new Object[3];
                                                                        objArr9[2] = Integer.valueOf((bArr20.length - (~(-i40))) - 1);
                                                                        objArr9[1] = Integer.valueOf(i40);
                                                                        objArr9[s82222] = bArr20;
                                                                        byte[] bArr22 = $$a;
                                                                        int i43 = i40;
                                                                        ?? cls22 = Class.forName($$c(bArr22[89], (short) 172, bArr22[902]));
                                                                        Class[] clsArr12 = new Class[3];
                                                                        clsArr12[s82222] = cls3;
                                                                        clsArr12[1] = Integer.TYPE;
                                                                        clsArr12[2] = Integer.TYPE;
                                                                        InputStream inputStream2 = (InputStream) cls22.getDeclaredConstructor(clsArr12).newInstance(objArr9);
                                                                        Object obj13 = afLogForce;
                                                                        if (obj13 == null) {
                                                                            int i44 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                            short s12 = (short) ((i44 & 8) + (i44 | 8));
                                                                            int edgeSlop = 2059891481 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                                            try {
                                                                                Object[] objArr10 = new Object[3];
                                                                                objArr10[2] = Float.valueOf(0.0f);
                                                                                objArr10[1] = Float.valueOf(0.0f);
                                                                                objArr10[s82222] = Integer.valueOf(s82222);
                                                                                byte b12 = bArr22[c2];
                                                                                s4 = s12;
                                                                                Class<?> cls23 = Class.forName($$c(b12, (short) 864, b12));
                                                                                i7 = i41;
                                                                                String $$c6 = $$c(bArr22[c], (short) 844, bArr22[c4]);
                                                                                Class<?>[] clsArr13 = new Class[3];
                                                                                clsArr13[s82222] = Integer.TYPE;
                                                                                clsArr13[1] = Float.TYPE;
                                                                                clsArr13[2] = Float.TYPE;
                                                                                int i45 = -(((Float) cls23.getMethod($$c6, clsArr13).invoke(null, objArr10)).floatValue() > 0.0f ? 1 : (((Float) cls23.getMethod($$c6, clsArr13).invoke(null, objArr10)).floatValue() == 0.0f ? 0 : -1));
                                                                                AFi1dSDK aFi1dSDK = new AFi1dSDK(inputStream2, init, edgeSlop, s4, onAppOpenAttributionNative, (i45 ^ (-12195791)) + ((i45 & (-12195791)) << 1));
                                                                                obj6 = obj3;
                                                                                objArr2 = objArr;
                                                                                inputStream = aFi1dSDK;
                                                                                str3 = str4;
                                                                            } catch (Throwable th23) {
                                                                                Throwable cause15 = th23.getCause();
                                                                                if (cause15 == null) {
                                                                                    throw th23;
                                                                                }
                                                                                throw cause15;
                                                                            }
                                                                        } else {
                                                                            i7 = i41;
                                                                            try {
                                                                                int i46 = -(((Integer) Class.forName($$c(bArr22[c2], (short) 82, bArr22[70])).getMethod($$c(bArr22[25], (short) 941, bArr22[19]), null).invoke(null, null)).intValue() >> 22);
                                                                                int i47 = (i46 & (-436613646)) + (i46 | (-436613646));
                                                                                int i48 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                                int i49 = (i48 ^ 1979587287) + ((i48 & 1979587287) << 1);
                                                                                int i50 = -(-ExpandableListView.getPackedPositionType(0L));
                                                                                short s13 = (short) ((i50 & 8) + (i50 | 8));
                                                                                try {
                                                                                    Object[] objArr11 = new Object[4];
                                                                                    objArr11[3] = Short.valueOf(s13);
                                                                                    objArr11[2] = Integer.valueOf(i49);
                                                                                    objArr11[1] = Integer.valueOf(i47);
                                                                                    objArr11[s82222] = inputStream2;
                                                                                    byte b13 = bArr22[c];
                                                                                    Class<?> cls24 = Class.forName($$c(b13, (short) (b13 | 97), bArr22[50]), true, (ClassLoader) AFLogger$LogLevel);
                                                                                    str3 = str4;
                                                                                    String $$c7 = $$c(bArr22[113], (short) 579, bArr22[c4]);
                                                                                    Class<?>[] clsArr14 = new Class[4];
                                                                                    byte b14 = bArr22[89];
                                                                                    obj6 = obj3;
                                                                                    int i51 = $$b;
                                                                                    objArr2 = objArr;
                                                                                    try {
                                                                                        clsArr14[s82222] = Class.forName($$c(b14, (short) ((i51 & 836) | (i51 ^ 836)), bArr22[83]));
                                                                                        clsArr14[1] = Integer.TYPE;
                                                                                        clsArr14[2] = Integer.TYPE;
                                                                                        clsArr14[3] = Short.TYPE;
                                                                                        inputStream = (InputStream) cls24.getMethod($$c7, clsArr14).invoke(obj13, objArr11);
                                                                                    } catch (Throwable th24) {
                                                                                        th = th24;
                                                                                        Throwable cause16 = th.getCause();
                                                                                        if (cause16 == null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause16;
                                                                                    }
                                                                                } catch (Throwable th25) {
                                                                                    th = th25;
                                                                                }
                                                                            } catch (Throwable th26) {
                                                                                Throwable cause17 = th26.getCause();
                                                                                if (cause17 == null) {
                                                                                    throw th26;
                                                                                }
                                                                                throw cause17;
                                                                            }
                                                                        }
                                                                        long j = 16;
                                                                        int i52 = $11;
                                                                        int i53 = ((i52 | 25) << 1) - (i52 ^ 25);
                                                                        $10 = i53 % 128;
                                                                        int i54 = i53 % 2;
                                                                        try {
                                                                            Object[] objArr12 = {Long.valueOf(j)};
                                                                            byte b15 = bArr22[89];
                                                                            int i55 = $$b;
                                                                            Class<?> cls25 = Class.forName($$c(b15, (short) ((i55 ^ 836) | (i55 & 836)), bArr22[83]));
                                                                            byte b16 = bArr22[19];
                                                                            String $$c8 = $$c(b16, (short) ((b16 ^ 544) | (b16 & 544)), bArr22[95]);
                                                                            Class<?>[] clsArr15 = new Class[1];
                                                                            clsArr15[s82222] = Long.TYPE;
                                                                            ((Long) cls25.getMethod($$c8, clsArr15).invoke(inputStream, objArr12)).longValue();
                                                                            if (z6) {
                                                                                int i56 = $10 + 15;
                                                                                int i57 = i56 % 128;
                                                                                $11 = i57;
                                                                                int i58 = i56 % 2;
                                                                                try {
                                                                                    Object obj14 = afLogForce;
                                                                                    Object obj15 = obj14 == null ? obj12 : obj6;
                                                                                    if (obj14 == null) {
                                                                                        int i59 = ((i57 | ModuleDescriptor.MODULE_VERSION) << 1) - (i57 ^ ModuleDescriptor.MODULE_VERSION);
                                                                                        $10 = i59 % 128;
                                                                                        if (i59 % 2 != 0) {
                                                                                            int i60 = 70 / 0;
                                                                                        }
                                                                                        obj7 = obj4;
                                                                                    } else {
                                                                                        obj7 = obj5;
                                                                                    }
                                                                                    int i61 = i57 + 29;
                                                                                    $10 = i61 % 128;
                                                                                    int i62 = i61 % 2;
                                                                                    try {
                                                                                        Object[] objArr13 = {obj15};
                                                                                        short s14 = (short) 758;
                                                                                        Class<?> cls26 = Class.forName($$c(bArr22[89], s14, bArr22[192]));
                                                                                        c5 = Typography.dollar;
                                                                                        try {
                                                                                            Class<?>[] clsArr16 = new Class[1];
                                                                                            s4 = s2;
                                                                                            try {
                                                                                                clsArr16[s82222] = Class.forName($$c(bArr22[89], s62222, bArr22[i]));
                                                                                                Object newInstance5 = cls26.getDeclaredConstructor(clsArr16).newInstance(objArr13);
                                                                                                if (s3 != 0) {
                                                                                                    int i63 = $10;
                                                                                                    int i64 = (i63 & 33) + (i63 | 33);
                                                                                                    $11 = i64 % 128;
                                                                                                    int i65 = i64 % 2;
                                                                                                    try {
                                                                                                        Class<?> cls27 = Class.forName($$c(bArr22[89], s62222, bArr22[i]));
                                                                                                        byte b17 = bArr22[19];
                                                                                                        ((Boolean) cls27.getMethod($$c(b17, (short) ((b17 ^ 473) | (b17 & 473)), bArr22[25]), null).invoke(obj15, null)).booleanValue();
                                                                                                    } catch (Throwable th27) {
                                                                                                        try {
                                                                                                            Throwable cause18 = th27.getCause();
                                                                                                            if (cause18 == null) {
                                                                                                                throw th27;
                                                                                                            }
                                                                                                            throw cause18;
                                                                                                        } catch (Exception e2) {
                                                                                                            e = e2;
                                                                                                            i3 = i2;
                                                                                                            zArr5 = zArr2;
                                                                                                            try {
                                                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                                                byte[] bArr23 = $$a;
                                                                                                                String sb9 = sb8.append($$c(bArr23[c3], (short) 372, bArr23[19])).append(obj15).append($$c((byte) 78, (short) 269, bArr23[67])).toString();
                                                                                                                try {
                                                                                                                    Object[] objArr14 = new Object[2];
                                                                                                                    objArr14[1] = e;
                                                                                                                    objArr14[s82222] = sb9;
                                                                                                                    Class<?> cls28 = Class.forName($$c(bArr23[89], (short) 788, bArr23[83]));
                                                                                                                    Class<?>[] clsArr17 = new Class[2];
                                                                                                                    clsArr17[s82222] = String.class;
                                                                                                                    clsArr17[1] = Throwable.class;
                                                                                                                    throw ((Throwable) cls28.getDeclaredConstructor(clsArr17).newInstance(objArr14));
                                                                                                                } catch (Throwable th28) {
                                                                                                                    Throwable cause19 = th28.getCause();
                                                                                                                    if (cause19 == null) {
                                                                                                                        throw th28;
                                                                                                                    }
                                                                                                                    throw cause19;
                                                                                                                }
                                                                                                            } catch (Throwable th29) {
                                                                                                                th = th29;
                                                                                                                try {
                                                                                                                    byte[] bArr24 = $$a;
                                                                                                                    short s15 = (short) 574;
                                                                                                                    ((Boolean) Class.forName($$c(bArr24[89], s62222, bArr24[i])).getMethod($$c(bArr24[c5], s15, bArr24[13]), null).invoke(obj15, null)).booleanValue();
                                                                                                                    try {
                                                                                                                        ((Boolean) Class.forName($$c(bArr24[89], s62222, bArr24[i])).getMethod($$c(bArr24[c5], s15, bArr24[13]), null).invoke(obj7, null)).booleanValue();
                                                                                                                        throw th;
                                                                                                                    } catch (Throwable th30) {
                                                                                                                        Throwable cause20 = th30.getCause();
                                                                                                                        if (cause20 == null) {
                                                                                                                            throw th30;
                                                                                                                        }
                                                                                                                        throw cause20;
                                                                                                                    }
                                                                                                                } catch (Throwable th31) {
                                                                                                                    Throwable cause21 = th31.getCause();
                                                                                                                    if (cause21 == null) {
                                                                                                                        throw th31;
                                                                                                                    }
                                                                                                                    throw cause21;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    byte[] bArr25 = new byte[1024];
                                                                                                    int i66 = i7;
                                                                                                    while (true) {
                                                                                                        if (i66 <= 0) {
                                                                                                            i3 = i2;
                                                                                                            break;
                                                                                                        }
                                                                                                        int i67 = $11;
                                                                                                        int i68 = (i67 ^ 13) + ((i67 & 13) << 1);
                                                                                                        $10 = i68 % 128;
                                                                                                        if (i68 % 2 != 0) {
                                                                                                            min = Math.min(1024, i66);
                                                                                                            s5 = 1;
                                                                                                        } else {
                                                                                                            min = Math.min(1024, i66);
                                                                                                            s5 = s82222;
                                                                                                        }
                                                                                                        int i69 = 2 % 2;
                                                                                                        byte[] bArr26 = bArr25;
                                                                                                        int i70 = i66;
                                                                                                        try {
                                                                                                            Object[] objArr15 = new Object[3];
                                                                                                            objArr15[2] = Integer.valueOf(min);
                                                                                                            objArr15[1] = Integer.valueOf(s5);
                                                                                                            objArr15[s82222] = bArr26;
                                                                                                            byte[] bArr27 = $$a;
                                                                                                            byte b18 = bArr27[89];
                                                                                                            int i71 = $$b;
                                                                                                            ?? cls29 = Class.forName($$c(b18, (short) ((i71 ^ 836) | (i71 & 836)), bArr27[83]));
                                                                                                            i3 = i2;
                                                                                                            try {
                                                                                                                String $$c9 = $$c(bArr27[13], (short) 266, bArr27[95]);
                                                                                                                Class[] clsArr18 = new Class[3];
                                                                                                                clsArr18[s82222] = cls3;
                                                                                                                clsArr18[1] = Integer.TYPE;
                                                                                                                clsArr18[2] = Integer.TYPE;
                                                                                                                int intValue = ((Integer) cls29.getMethod($$c9, clsArr18).invoke(inputStream, objArr15)).intValue();
                                                                                                                if (intValue == -1) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                try {
                                                                                                                    Object[] objArr16 = new Object[3];
                                                                                                                    objArr16[2] = Integer.valueOf(intValue);
                                                                                                                    objArr16[1] = Integer.valueOf(s82222);
                                                                                                                    objArr16[s82222] = bArr26;
                                                                                                                    ?? cls30 = Class.forName($$c(bArr27[89], s14, bArr27[192]));
                                                                                                                    byte b19 = bArr27[67];
                                                                                                                    boolean[] zArr6 = zArr2;
                                                                                                                    try {
                                                                                                                        String $$c10 = $$c(b19, (short) (b19 | 252), bArr27[19]);
                                                                                                                        Class[] clsArr19 = new Class[3];
                                                                                                                        clsArr19[s82222] = cls3;
                                                                                                                        clsArr19[1] = Integer.TYPE;
                                                                                                                        clsArr19[2] = Integer.TYPE;
                                                                                                                        cls30.getMethod($$c10, clsArr19).invoke(newInstance5, objArr16);
                                                                                                                        int i72 = -intValue;
                                                                                                                        i66 = (i70 ^ i72) + ((i70 & i72) << 1);
                                                                                                                        bArr25 = bArr26;
                                                                                                                        zArr2 = zArr6;
                                                                                                                        i2 = i3;
                                                                                                                    } catch (Throwable th32) {
                                                                                                                        th = th32;
                                                                                                                        Throwable cause22 = th.getCause();
                                                                                                                        if (cause22 == null) {
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                        throw cause22;
                                                                                                                    }
                                                                                                                } catch (Throwable th33) {
                                                                                                                    th = th33;
                                                                                                                }
                                                                                                            } catch (Throwable th34) {
                                                                                                                th = th34;
                                                                                                                Throwable cause23 = th.getCause();
                                                                                                                if (cause23 == null) {
                                                                                                                    throw th;
                                                                                                                }
                                                                                                                throw cause23;
                                                                                                            }
                                                                                                        } catch (Throwable th35) {
                                                                                                            th = th35;
                                                                                                        }
                                                                                                    }
                                                                                                    zArr5 = zArr2;
                                                                                                    try {
                                                                                                        byte[] bArr28 = $$a;
                                                                                                        Class<?> cls31 = Class.forName($$c(bArr28[89], s14, bArr28[192]));
                                                                                                        byte b20 = bArr28[c4];
                                                                                                        Object invoke7 = cls31.getMethod($$c(b20, (short) (b20 | 579), bArr28[19]), null).invoke(newInstance5, null);
                                                                                                        try {
                                                                                                            Class<?> cls32 = Class.forName($$c(bArr28[89], (short) TypedValues.Custom.TYPE_COLOR, bArr28[287]));
                                                                                                            byte b21 = bArr28[19];
                                                                                                            cls32.getMethod($$c(b21, (short) ((b21 ^ 339) | (b21 & 339)), bArr28[95]), null).invoke(invoke7, null);
                                                                                                            int i73 = $11 + 17;
                                                                                                            $10 = i73 % 128;
                                                                                                            int i74 = i73 % 2;
                                                                                                            try {
                                                                                                                Class<?> cls33 = Class.forName($$c(bArr28[89], s14, bArr28[192]));
                                                                                                                byte b22 = bArr28[c];
                                                                                                                cls33.getMethod($$c(b22, (short) ((b22 ^ 641) | (b22 & 641)), bArr28[19]), null).invoke(newInstance5, null);
                                                                                                                Class<?> cls34 = Class.forName($$c(bArr28[36], (short) 269, bArr28[c]));
                                                                                                                String $$c11 = $$c(bArr28[i], (short) 509, bArr28[151]);
                                                                                                                Class<?>[] clsArr20 = new Class[3];
                                                                                                                clsArr20[s82222] = String.class;
                                                                                                                clsArr20[1] = String.class;
                                                                                                                clsArr20[2] = Integer.TYPE;
                                                                                                                try {
                                                                                                                    short s16 = (short) 713;
                                                                                                                    try {
                                                                                                                        newInstance = cls34.getDeclaredMethod($$c11, clsArr20).invoke(null, Class.forName($$c(bArr28[89], s62222, bArr28[i])).getMethod($$c(bArr28[c4], s16, bArr28[9]), null).invoke(obj15, null), Class.forName($$c(bArr28[89], s62222, bArr28[i])).getMethod($$c(bArr28[c4], s16, bArr28[9]), null).invoke(obj7, null), Integer.valueOf(s82222));
                                                                                                                        try {
                                                                                                                            short s17 = (short) 574;
                                                                                                                            ((Boolean) Class.forName($$c(bArr28[89], s62222, bArr28[i])).getMethod($$c(bArr28[36], s17, bArr28[13]), null).invoke(obj15, null)).booleanValue();
                                                                                                                            try {
                                                                                                                                ((Boolean) Class.forName($$c(bArr28[89], s62222, bArr28[i])).getMethod($$c(bArr28[36], s17, bArr28[13]), null).invoke(obj7, null)).booleanValue();
                                                                                                                                if (AFLogger$LogLevel == null) {
                                                                                                                                    int i75 = 2 % 2;
                                                                                                                                    int i76 = $10 + 21;
                                                                                                                                    $11 = i76 % 128;
                                                                                                                                    int i77 = i76 % 2;
                                                                                                                                    try {
                                                                                                                                        AFLogger$LogLevel = Class.class.getMethod($$c(bArr28[c4], (short) 551, bArr28[89]), null).invoke(AFc1gSDK.class, null);
                                                                                                                                    } catch (Throwable th36) {
                                                                                                                                        Throwable cause24 = th36.getCause();
                                                                                                                                        if (cause24 == null) {
                                                                                                                                            throw th36;
                                                                                                                                        }
                                                                                                                                        throw cause24;
                                                                                                                                    }
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
                                                                                                                Throwable cause29 = th41.getCause();
                                                                                                                if (cause29 == null) {
                                                                                                                    throw th41;
                                                                                                                }
                                                                                                                throw cause29;
                                                                                                            }
                                                                                                        } catch (Throwable th42) {
                                                                                                            Throwable cause30 = th42.getCause();
                                                                                                            if (cause30 == null) {
                                                                                                                throw th42;
                                                                                                            }
                                                                                                            throw cause30;
                                                                                                        }
                                                                                                    } catch (Throwable th43) {
                                                                                                        Throwable cause31 = th43.getCause();
                                                                                                        if (cause31 == null) {
                                                                                                            throw th43;
                                                                                                        }
                                                                                                        throw cause31;
                                                                                                    }
                                                                                                } catch (Throwable th44) {
                                                                                                    th = th44;
                                                                                                    i3 = i2;
                                                                                                    zArr5 = zArr2;
                                                                                                    byte[] bArr242 = $$a;
                                                                                                    short s152 = (short) 574;
                                                                                                    ((Boolean) Class.forName($$c(bArr242[89], s62222, bArr242[i])).getMethod($$c(bArr242[c5], s152, bArr242[13]), null).invoke(obj15, null)).booleanValue();
                                                                                                    ((Boolean) Class.forName($$c(bArr242[89], s62222, bArr242[i])).getMethod($$c(bArr242[c5], s152, bArr242[13]), null).invoke(obj7, null)).booleanValue();
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Throwable th45) {
                                                                                                th = th45;
                                                                                                i3 = i2;
                                                                                                zArr5 = zArr2;
                                                                                                try {
                                                                                                    Throwable cause32 = th.getCause();
                                                                                                    if (cause32 == null) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                    throw cause32;
                                                                                                } catch (Exception e3) {
                                                                                                    e = e3;
                                                                                                    StringBuilder sb82 = new StringBuilder();
                                                                                                    byte[] bArr232 = $$a;
                                                                                                    String sb92 = sb82.append($$c(bArr232[c3], (short) 372, bArr232[19])).append(obj15).append($$c((byte) 78, (short) 269, bArr232[67])).toString();
                                                                                                    Object[] objArr142 = new Object[2];
                                                                                                    objArr142[1] = e;
                                                                                                    objArr142[s82222] = sb92;
                                                                                                    Class<?> cls282 = Class.forName($$c(bArr232[89], (short) 788, bArr232[83]));
                                                                                                    Class<?>[] clsArr172 = new Class[2];
                                                                                                    clsArr172[s82222] = String.class;
                                                                                                    clsArr172[1] = Throwable.class;
                                                                                                    throw ((Throwable) cls282.getDeclaredConstructor(clsArr172).newInstance(objArr142));
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th46) {
                                                                                            th = th46;
                                                                                            s4 = s2;
                                                                                        }
                                                                                    } catch (Throwable th47) {
                                                                                        th = th47;
                                                                                        s4 = s2;
                                                                                        i3 = i2;
                                                                                        zArr5 = zArr2;
                                                                                        c5 = Typography.dollar;
                                                                                    }
                                                                                } catch (Throwable th48) {
                                                                                    th = th48;
                                                                                    s4 = s2;
                                                                                    i3 = i2;
                                                                                    zArr5 = zArr2;
                                                                                    i5 = ((i3 | 1) << 1) - (i3 ^ 1);
                                                                                    while (i5 < 7) {
                                                                                        if (zArr3[i5]) {
                                                                                            clsArr = null;
                                                                                            afLogForce = null;
                                                                                            AFLogger$LogLevel = null;
                                                                                            i4 = 2;
                                                                                            s82222 = 0;
                                                                                            z = true;
                                                                                            s2 = s4;
                                                                                            i2 = i3 + 1;
                                                                                            i13 = i4;
                                                                                            clsArr2 = clsArr;
                                                                                            cls5 = cls3;
                                                                                            z5 = z;
                                                                                            zArr = zArr4;
                                                                                            $$c = str2;
                                                                                            s = s3;
                                                                                            objArr = objArr2;
                                                                                            zArr2 = zArr5;
                                                                                        } else {
                                                                                            int i78 = (i5 & (-29)) + (i5 | (-29));
                                                                                            i5 = ((i78 | 30) << 1) - (i78 ^ 30);
                                                                                        }
                                                                                    }
                                                                                    byte[] bArr142222 = $$a;
                                                                                    throw ((Throwable) Class.forName($$c(bArr142222[89], (short) 788, bArr142222[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(bArr142222[c3], (short) 346, bArr142222[c2]), th));
                                                                                }
                                                                            } else {
                                                                                s4 = s2;
                                                                                i3 = i2;
                                                                                zArr5 = zArr2;
                                                                                c5 = Typography.dollar;
                                                                                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                                                                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                                                try {
                                                                                    Class<?> cls35 = Class.forName($$c(bArr22[89], (short) (-bArr22[353]), bArr22[217]));
                                                                                    Class<?>[] clsArr21 = new Class[1];
                                                                                    clsArr21[s82222] = Class.forName($$c(bArr22[89], (short) (i55 | 836), bArr22[83]));
                                                                                    Object newInstance6 = cls35.getDeclaredConstructor(clsArr21).newInstance(zipInputStream);
                                                                                    try {
                                                                                        short s18 = (short) 515;
                                                                                        Object newInstance7 = Class.forName($$c(bArr22[89], s18, bArr22[146])).getDeclaredConstructor(null).newInstance(null);
                                                                                        byte[] bArr29 = new byte[1024];
                                                                                        int i79 = s82222;
                                                                                        while (true) {
                                                                                            try {
                                                                                                bArr3 = $$a;
                                                                                                ?? cls36 = Class.forName($$c(bArr3[89], (short) (-bArr3[353]), bArr3[217]));
                                                                                                String $$c12 = $$c(bArr3[13], (short) 266, bArr3[95]);
                                                                                                Class[] clsArr22 = new Class[1];
                                                                                                clsArr22[s82222] = cls3;
                                                                                                int intValue2 = ((Integer) cls36.getMethod($$c12, clsArr22).invoke(newInstance6, bArr29)).intValue();
                                                                                                if (intValue2 <= 0) {
                                                                                                    break;
                                                                                                }
                                                                                                try {
                                                                                                    if (i79 >= nextEntry.getSize()) {
                                                                                                        break;
                                                                                                    }
                                                                                                    try {
                                                                                                        Object[] objArr17 = new Object[3];
                                                                                                        try {
                                                                                                            objArr17[2] = Integer.valueOf(intValue2);
                                                                                                            objArr17[1] = Integer.valueOf(s82222);
                                                                                                            objArr17[s82222] = bArr29;
                                                                                                            ?? cls37 = Class.forName($$c(bArr3[89], s18, bArr3[146]));
                                                                                                            byte b23 = bArr3[67];
                                                                                                            ZipEntry zipEntry = nextEntry;
                                                                                                            String $$c13 = $$c(b23, (short) ((b23 & 252) | (b23 ^ 252)), bArr3[19]);
                                                                                                            try {
                                                                                                                Class[] clsArr23 = new Class[3];
                                                                                                                clsArr23[s82222] = cls3;
                                                                                                                clsArr23[1] = Integer.TYPE;
                                                                                                                clsArr23[2] = Integer.TYPE;
                                                                                                                cls37.getMethod($$c13, clsArr23).invoke(newInstance7, objArr17);
                                                                                                                int i80 = -(-intValue2);
                                                                                                                i79 = ((i79 | i80) << 1) - (i80 ^ i79);
                                                                                                                nextEntry = zipEntry;
                                                                                                            } catch (Throwable th49) {
                                                                                                                th = th49;
                                                                                                                Throwable cause33 = th.getCause();
                                                                                                                if (cause33 == null) {
                                                                                                                    throw th;
                                                                                                                }
                                                                                                                throw cause33;
                                                                                                            }
                                                                                                        } catch (Throwable th50) {
                                                                                                            th = th50;
                                                                                                        }
                                                                                                    } catch (Throwable th51) {
                                                                                                        th = th51;
                                                                                                    }
                                                                                                } catch (Throwable th52) {
                                                                                                    th = th52;
                                                                                                    i5 = ((i3 | 1) << 1) - (i3 ^ 1);
                                                                                                    while (i5 < 7) {
                                                                                                    }
                                                                                                    byte[] bArr1422222 = $$a;
                                                                                                    throw ((Throwable) Class.forName($$c(bArr1422222[89], (short) 788, bArr1422222[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(bArr1422222[c3], (short) 346, bArr1422222[c2]), th));
                                                                                                }
                                                                                            } catch (Throwable th53) {
                                                                                                Throwable cause34 = th53.getCause();
                                                                                                if (cause34 == null) {
                                                                                                    throw th53;
                                                                                                }
                                                                                                throw cause34;
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            Class<?> cls38 = Class.forName($$c(bArr3[89], s18, bArr3[146]));
                                                                                            byte b24 = bArr3[95];
                                                                                            Object invoke8 = cls38.getMethod($$c(b24, (short) ((b24 ^ 920) | (b24 & 920)), bArr3[25]), null).invoke(newInstance7, null);
                                                                                            try {
                                                                                                Class<?> cls39 = Class.forName($$c(bArr3[89], (short) (-bArr3[353]), bArr3[217]));
                                                                                                byte b25 = bArr3[c];
                                                                                                cls39.getMethod($$c(b25, (short) ((b25 ^ 641) | (b25 & 641)), bArr3[19]), null).invoke(newInstance6, null);
                                                                                                try {
                                                                                                    byte[] bArr30 = $$a;
                                                                                                    Class<?> cls40 = Class.forName($$c(bArr30[89], s18, bArr30[146]));
                                                                                                    byte b26 = bArr30[c];
                                                                                                    cls40.getMethod($$c(b26, (short) ((b26 ^ 641) | (b26 & 641)), bArr30[19]), null).invoke(newInstance7, null);
                                                                                                    try {
                                                                                                        byte[] bArr31 = $$a;
                                                                                                        invoke4 = Class.class.getMethod($$c(bArr31[c4], (short) 551, bArr31[89]), null).invoke(AFc1gSDK.class, null);
                                                                                                        Class<?> cls41 = Class.forName($$c(bArr31[36], (short) 199, (byte) (-bArr31[340])));
                                                                                                        Class<?>[] clsArr24 = new Class[2];
                                                                                                        short s19 = (short) 99;
                                                                                                        clsArr24[s82222] = Class.forName($$c(bArr31[89], s19, bArr31[83]));
                                                                                                        clsArr24[1] = Class.forName($$c(bArr31[89], (short) 404, bArr31[c]));
                                                                                                        Constructor<?> declaredConstructor = cls41.getDeclaredConstructor(clsArr24);
                                                                                                        try {
                                                                                                            ?? cls42 = Class.forName($$c(bArr31[89], s19, bArr31[83]));
                                                                                                            byte b27 = bArr31[67];
                                                                                                            String $$c14 = $$c(b27, (short) ((b27 ^ 957) | (b27 & 957)), bArr31[95]);
                                                                                                            Class[] clsArr25 = new Class[1];
                                                                                                            clsArr25[s82222] = cls3;
                                                                                                            newInstance = declaredConstructor.newInstance(cls42.getMethod($$c14, clsArr25).invoke(null, invoke8), invoke4);
                                                                                                            try {
                                                                                                                Class<?> cls43 = Class.forName($$c(bArr31[36], (short) 298, (byte) (-bArr31[242])));
                                                                                                                byte b28 = bArr31[69];
                                                                                                                Field declaredField = cls43.getDeclaredField($$c(b28, (short) 806, b28));
                                                                                                                declaredField.setAccessible(true);
                                                                                                                Object obj16 = declaredField.get(invoke4);
                                                                                                                Class<?> cls44 = obj16.getClass();
                                                                                                                Field declaredField2 = cls44.getDeclaredField($$c(bArr31[206], (short) 960, bArr31[192]));
                                                                                                                declaredField2.setAccessible(true);
                                                                                                                byte b29 = bArr31[206];
                                                                                                                Field declaredField3 = cls44.getDeclaredField($$c(b29, (short) ((b29 ^ 628) | (b29 & 628)), (byte) (-bArr31[353])));
                                                                                                                declaredField3.setAccessible(true);
                                                                                                                Object obj17 = declaredField2.get(obj16);
                                                                                                                Object obj18 = declaredField3.get(obj16);
                                                                                                                Object obj19 = declaredField.get(newInstance);
                                                                                                                ArrayList arrayList = new ArrayList((List) obj17);
                                                                                                                Class<?> componentType = obj18.getClass().getComponentType();
                                                                                                                length = Array.getLength(obj18);
                                                                                                                Object newInstance8 = Array.newInstance(componentType, length);
                                                                                                                while (i8 < length) {
                                                                                                                }
                                                                                                                declaredField2.set(obj19, arrayList);
                                                                                                                declaredField3.set(obj19, newInstance8);
                                                                                                                int i81 = $10;
                                                                                                                int i82 = (i81 & 23) + (i81 | 23);
                                                                                                                $11 = i82 % 128;
                                                                                                                int i83 = i82 % 2;
                                                                                                                if (AFLogger$LogLevel == null) {
                                                                                                                }
                                                                                                            } catch (Exception e4) {
                                                                                                                StringBuilder sb10 = new StringBuilder();
                                                                                                                byte[] bArr32 = $$a;
                                                                                                                try {
                                                                                                                    throw ((Throwable) Class.forName($$c(bArr32[89], (short) 788, bArr32[83])).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb10.append($$c(bArr32[c3], (short) 376, bArr32[19])).append(invoke4).append($$c((byte) 78, (short) 269, bArr32[67])).toString(), e4));
                                                                                                                } catch (Throwable th54) {
                                                                                                                    Throwable cause35 = th54.getCause();
                                                                                                                    if (cause35 == null) {
                                                                                                                        throw th54;
                                                                                                                    }
                                                                                                                    throw cause35;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th55) {
                                                                                                            Throwable cause36 = th55.getCause();
                                                                                                            if (cause36 == null) {
                                                                                                                throw th55;
                                                                                                            }
                                                                                                            throw cause36;
                                                                                                        }
                                                                                                    } catch (Throwable th56) {
                                                                                                        Throwable cause37 = th56.getCause();
                                                                                                        if (cause37 == null) {
                                                                                                            throw th56;
                                                                                                        }
                                                                                                        throw cause37;
                                                                                                    }
                                                                                                } catch (Throwable th57) {
                                                                                                    try {
                                                                                                        Throwable cause38 = th57.getCause();
                                                                                                        if (cause38 == null) {
                                                                                                            throw th57;
                                                                                                        }
                                                                                                        throw cause38;
                                                                                                    } catch (IOException unused8) {
                                                                                                        byte[] bArr312 = $$a;
                                                                                                        invoke4 = Class.class.getMethod($$c(bArr312[c4], (short) 551, bArr312[89]), null).invoke(AFc1gSDK.class, null);
                                                                                                        Class<?> cls412 = Class.forName($$c(bArr312[36], (short) 199, (byte) (-bArr312[340])));
                                                                                                        Class<?>[] clsArr242 = new Class[2];
                                                                                                        short s192 = (short) 99;
                                                                                                        clsArr242[s82222] = Class.forName($$c(bArr312[89], s192, bArr312[83]));
                                                                                                        clsArr242[1] = Class.forName($$c(bArr312[89], (short) 404, bArr312[c]));
                                                                                                        Constructor<?> declaredConstructor2 = cls412.getDeclaredConstructor(clsArr242);
                                                                                                        ?? cls422 = Class.forName($$c(bArr312[89], s192, bArr312[83]));
                                                                                                        byte b272 = bArr312[67];
                                                                                                        String $$c142 = $$c(b272, (short) ((b272 ^ 957) | (b272 & 957)), bArr312[95]);
                                                                                                        Class[] clsArr252 = new Class[1];
                                                                                                        clsArr252[s82222] = cls3;
                                                                                                        newInstance = declaredConstructor2.newInstance(cls422.getMethod($$c142, clsArr252).invoke(null, invoke8), invoke4);
                                                                                                        Class<?> cls432 = Class.forName($$c(bArr312[36], (short) 298, (byte) (-bArr312[242])));
                                                                                                        byte b282 = bArr312[69];
                                                                                                        Field declaredField4 = cls432.getDeclaredField($$c(b282, (short) 806, b282));
                                                                                                        declaredField4.setAccessible(true);
                                                                                                        Object obj162 = declaredField4.get(invoke4);
                                                                                                        Class<?> cls442 = obj162.getClass();
                                                                                                        Field declaredField22 = cls442.getDeclaredField($$c(bArr312[206], (short) 960, bArr312[192]));
                                                                                                        declaredField22.setAccessible(true);
                                                                                                        byte b292 = bArr312[206];
                                                                                                        Field declaredField32 = cls442.getDeclaredField($$c(b292, (short) ((b292 ^ 628) | (b292 & 628)), (byte) (-bArr312[353])));
                                                                                                        declaredField32.setAccessible(true);
                                                                                                        Object obj172 = declaredField22.get(obj162);
                                                                                                        Object obj182 = declaredField32.get(obj162);
                                                                                                        Object obj192 = declaredField4.get(newInstance);
                                                                                                        ArrayList arrayList2 = new ArrayList((List) obj172);
                                                                                                        Class<?> componentType2 = obj182.getClass().getComponentType();
                                                                                                        length = Array.getLength(obj182);
                                                                                                        Object newInstance82 = Array.newInstance(componentType2, length);
                                                                                                        for (i8 = s82222; i8 < length; i8++) {
                                                                                                            int i84 = $10;
                                                                                                            int i85 = ((i84 | 39) << 1) - (i84 ^ 39);
                                                                                                            $11 = i85 % 128;
                                                                                                            int i86 = i85 % 2;
                                                                                                            Array.set(newInstance82, i8, Array.get(obj182, i8));
                                                                                                        }
                                                                                                        declaredField22.set(obj192, arrayList2);
                                                                                                        declaredField32.set(obj192, newInstance82);
                                                                                                        int i812 = $10;
                                                                                                        int i822 = (i812 & 23) + (i812 | 23);
                                                                                                        $11 = i822 % 128;
                                                                                                        int i832 = i822 % 2;
                                                                                                        if (AFLogger$LogLevel == null) {
                                                                                                            AFLogger$LogLevel = newInstance;
                                                                                                        }
                                                                                                        if (z6) {
                                                                                                            int i87 = $11;
                                                                                                            int i88 = ((i87 | ComposerImplKt.nodeKey) << 1) - (i87 ^ ComposerImplKt.nodeKey);
                                                                                                            $10 = i88 % 128;
                                                                                                            int i89 = i88 % 2;
                                                                                                            try {
                                                                                                                byte[] bArr33 = $$a;
                                                                                                                Class<?> cls45 = Class.forName($$c(bArr33[c5], (short) 269, bArr33[c]));
                                                                                                                String $$c15 = $$c(bArr33[i], (short) 933, bArr33[74]);
                                                                                                                Class<?>[] clsArr26 = new Class[2];
                                                                                                                clsArr26[s82222] = String.class;
                                                                                                                clsArr26[1] = Class.forName($$c(bArr33[89], (short) 404, bArr33[c]));
                                                                                                                Method declaredMethod = cls45.getDeclaredMethod($$c15, clsArr26);
                                                                                                                declaredMethod.setAccessible(true);
                                                                                                                Object[] objArr18 = new Object[2];
                                                                                                                objArr18[s82222] = str3;
                                                                                                                int i90 = 2 % 2;
                                                                                                                int i91 = $11 + 99;
                                                                                                                $10 = i91 % 128;
                                                                                                                if (i91 % 2 != 0) {
                                                                                                                    try {
                                                                                                                        objArr18[1] = Class.class.getMethod($$c(bArr33[15346], (short) 27522, bArr33[42]), null).invoke(AFc1gSDK.class, null);
                                                                                                                        invoke5 = declaredMethod.invoke(newInstance, objArr18);
                                                                                                                    } catch (Throwable th58) {
                                                                                                                        Throwable cause39 = th58.getCause();
                                                                                                                        if (cause39 == null) {
                                                                                                                            throw th58;
                                                                                                                        }
                                                                                                                        throw cause39;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    objArr18[1] = Class.class.getMethod($$c(bArr33[c4], (short) 551, bArr33[89]), null).invoke(AFc1gSDK.class, null);
                                                                                                                    invoke5 = declaredMethod.invoke(newInstance, objArr18);
                                                                                                                }
                                                                                                            } catch (Throwable th59) {
                                                                                                                th = th59;
                                                                                                            }
                                                                                                        } else {
                                                                                                            byte[] bArr34 = $$a;
                                                                                                            Method declaredMethod2 = Class.forName($$c(bArr34[89], (short) 404, bArr34[c])).getDeclaredMethod($$c(bArr34[i], (short) 933, bArr34[74]), String.class);
                                                                                                            try {
                                                                                                                declaredMethod2.setAccessible(true);
                                                                                                                cls4 = declaredMethod2.invoke(newInstance, str3);
                                                                                                            } catch (InvocationTargetException e5) {
                                                                                                                try {
                                                                                                                    throw ((Exception) e5.getCause());
                                                                                                                } catch (ClassNotFoundException unused9) {
                                                                                                                    cls4 = null;
                                                                                                                    if (cls4 == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        if (cls4 == null) {
                                                                                                            int i92 = $10;
                                                                                                            int i93 = (i92 ^ 91) + ((i92 & 91) << 1);
                                                                                                            $11 = i93 % 128;
                                                                                                            int i94 = i93 % 2;
                                                                                                            cls21 = cls4;
                                                                                                            byte[] bArr35 = $$a;
                                                                                                            byte b30 = bArr35[c];
                                                                                                            str4 = $$c(b30, (short) (b30 | 585), bArr35[50]);
                                                                                                            Constructor declaredConstructor3 = cls21.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                            declaredConstructor3.setAccessible(true);
                                                                                                            if (z6) {
                                                                                                                z3 = false;
                                                                                                            } else {
                                                                                                                int i95 = $11 + 35;
                                                                                                                $10 = i95 % 128;
                                                                                                                int i96 = i95 % 2;
                                                                                                                z3 = true;
                                                                                                            }
                                                                                                            afLogForce = declaredConstructor3.newInstance(newInstance, Boolean.valueOf(z3));
                                                                                                            bArr4 = new byte[6934];
                                                                                                            try {
                                                                                                                short s20 = (short) 487;
                                                                                                                Object newInstance9 = Class.forName($$c(bArr35[89], s20, bArr35[c2])).getDeclaredConstructor(Class.forName($$c(bArr35[89], (short) ($$b | 836), bArr35[83]))).newInstance(AFc1gSDK.class.getResourceAsStream($$c((byte) 72, bArr35[10], bArr35[586])));
                                                                                                                try {
                                                                                                                    Class.forName($$c(bArr35[89], s20, bArr35[c2])).getMethod($$c(bArr35[13], (short) 234, bArr35[74]), cls3).invoke(newInstance9, bArr4);
                                                                                                                    int i97 = 2 % 2;
                                                                                                                    int i98 = $11;
                                                                                                                    int i99 = (i98 & 35) + (i98 | 35);
                                                                                                                    $10 = i99 % 128;
                                                                                                                    int i100 = i99 % 2;
                                                                                                                    try {
                                                                                                                        Class<?> cls46 = Class.forName($$c(bArr35[89], s20, bArr35[c2]));
                                                                                                                        byte b31 = bArr35[c];
                                                                                                                        cls46.getMethod($$c(b31, (short) ((b31 ^ 641) | (b31 & 641)), bArr35[19]), null).invoke(newInstance9, null);
                                                                                                                        i41 = 6891;
                                                                                                                        i40 = Math.abs(i43);
                                                                                                                        bArr20 = bArr4;
                                                                                                                        obj3 = obj6;
                                                                                                                        objArr = objArr2;
                                                                                                                        s2 = s4;
                                                                                                                        zArr2 = zArr5;
                                                                                                                        i2 = i3;
                                                                                                                        s82222 = 0;
                                                                                                                    } catch (Throwable th60) {
                                                                                                                        Throwable cause40 = th60.getCause();
                                                                                                                        if (cause40 == null) {
                                                                                                                            throw th60;
                                                                                                                        }
                                                                                                                        throw cause40;
                                                                                                                    }
                                                                                                                } catch (Throwable th61) {
                                                                                                                    Throwable cause41 = th61.getCause();
                                                                                                                    if (cause41 == null) {
                                                                                                                        throw th61;
                                                                                                                    }
                                                                                                                    throw cause41;
                                                                                                                }
                                                                                                            } catch (Throwable th62) {
                                                                                                                Throwable cause42 = th62.getCause();
                                                                                                                if (cause42 == null) {
                                                                                                                    throw th62;
                                                                                                                }
                                                                                                                throw cause42;
                                                                                                            }
                                                                                                        } else {
                                                                                                            Constructor declaredConstructor4 = cls21.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                            declaredConstructor4.setAccessible(true);
                                                                                                            if (z6) {
                                                                                                                i9 = 2;
                                                                                                                z2 = false;
                                                                                                            } else {
                                                                                                                int i101 = $10 + 19;
                                                                                                                $11 = i101 % 128;
                                                                                                                i9 = 2;
                                                                                                                int i102 = i101 % 2;
                                                                                                                z2 = true;
                                                                                                            }
                                                                                                            afLogForce = declaredConstructor4.newInstance(newInstance, Boolean.valueOf(z2));
                                                                                                            int i103 = i9 % i9;
                                                                                                            i4 = 2;
                                                                                                            s2 = 1;
                                                                                                            s82222 = 0;
                                                                                                            clsArr = null;
                                                                                                            z = true;
                                                                                                            i2 = i3 + 1;
                                                                                                            i13 = i4;
                                                                                                            clsArr2 = clsArr;
                                                                                                            cls5 = cls3;
                                                                                                            z5 = z;
                                                                                                            zArr = zArr4;
                                                                                                            $$c = str2;
                                                                                                            s = s3;
                                                                                                            objArr = objArr2;
                                                                                                            zArr2 = zArr5;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th63) {
                                                                                                try {
                                                                                                    Throwable cause43 = th63.getCause();
                                                                                                    if (cause43 == null) {
                                                                                                        throw th63;
                                                                                                    }
                                                                                                    throw cause43;
                                                                                                } catch (IOException unused10) {
                                                                                                    byte[] bArr302 = $$a;
                                                                                                    Class<?> cls402 = Class.forName($$c(bArr302[89], s18, bArr302[146]));
                                                                                                    byte b262 = bArr302[c];
                                                                                                    cls402.getMethod($$c(b262, (short) ((b262 ^ 641) | (b262 & 641)), bArr302[19]), null).invoke(newInstance7, null);
                                                                                                    byte[] bArr3122 = $$a;
                                                                                                    invoke4 = Class.class.getMethod($$c(bArr3122[c4], (short) 551, bArr3122[89]), null).invoke(AFc1gSDK.class, null);
                                                                                                    Class<?> cls4122 = Class.forName($$c(bArr3122[36], (short) 199, (byte) (-bArr3122[340])));
                                                                                                    Class<?>[] clsArr2422 = new Class[2];
                                                                                                    short s1922 = (short) 99;
                                                                                                    clsArr2422[s82222] = Class.forName($$c(bArr3122[89], s1922, bArr3122[83]));
                                                                                                    clsArr2422[1] = Class.forName($$c(bArr3122[89], (short) 404, bArr3122[c]));
                                                                                                    Constructor<?> declaredConstructor22 = cls4122.getDeclaredConstructor(clsArr2422);
                                                                                                    ?? cls4222 = Class.forName($$c(bArr3122[89], s1922, bArr3122[83]));
                                                                                                    byte b2722 = bArr3122[67];
                                                                                                    String $$c1422 = $$c(b2722, (short) ((b2722 ^ 957) | (b2722 & 957)), bArr3122[95]);
                                                                                                    Class[] clsArr2522 = new Class[1];
                                                                                                    clsArr2522[s82222] = cls3;
                                                                                                    newInstance = declaredConstructor22.newInstance(cls4222.getMethod($$c1422, clsArr2522).invoke(null, invoke8), invoke4);
                                                                                                    Class<?> cls4322 = Class.forName($$c(bArr3122[36], (short) 298, (byte) (-bArr3122[242])));
                                                                                                    byte b2822 = bArr3122[69];
                                                                                                    Field declaredField42 = cls4322.getDeclaredField($$c(b2822, (short) 806, b2822));
                                                                                                    declaredField42.setAccessible(true);
                                                                                                    Object obj1622 = declaredField42.get(invoke4);
                                                                                                    Class<?> cls4422 = obj1622.getClass();
                                                                                                    Field declaredField222 = cls4422.getDeclaredField($$c(bArr3122[206], (short) 960, bArr3122[192]));
                                                                                                    declaredField222.setAccessible(true);
                                                                                                    byte b2922 = bArr3122[206];
                                                                                                    Field declaredField322 = cls4422.getDeclaredField($$c(b2922, (short) ((b2922 ^ 628) | (b2922 & 628)), (byte) (-bArr3122[353])));
                                                                                                    declaredField322.setAccessible(true);
                                                                                                    Object obj1722 = declaredField222.get(obj1622);
                                                                                                    Object obj1822 = declaredField322.get(obj1622);
                                                                                                    Object obj1922 = declaredField42.get(newInstance);
                                                                                                    ArrayList arrayList22 = new ArrayList((List) obj1722);
                                                                                                    Class<?> componentType22 = obj1822.getClass().getComponentType();
                                                                                                    length = Array.getLength(obj1822);
                                                                                                    Object newInstance822 = Array.newInstance(componentType22, length);
                                                                                                    while (i8 < length) {
                                                                                                    }
                                                                                                    declaredField222.set(obj1922, arrayList22);
                                                                                                    declaredField322.set(obj1922, newInstance822);
                                                                                                    int i8122 = $10;
                                                                                                    int i8222 = (i8122 & 23) + (i8122 | 23);
                                                                                                    $11 = i8222 % 128;
                                                                                                    int i8322 = i8222 % 2;
                                                                                                    if (AFLogger$LogLevel == null) {
                                                                                                    }
                                                                                                    if (z6) {
                                                                                                    }
                                                                                                    if (cls4 == null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th64) {
                                                                                            Throwable cause44 = th64.getCause();
                                                                                            if (cause44 == null) {
                                                                                                throw th64;
                                                                                            }
                                                                                            throw cause44;
                                                                                        }
                                                                                    } catch (Throwable th65) {
                                                                                        Throwable cause45 = th65.getCause();
                                                                                        if (cause45 == null) {
                                                                                            throw th65;
                                                                                        }
                                                                                        throw cause45;
                                                                                    }
                                                                                } catch (Throwable th66) {
                                                                                    Throwable cause46 = th66.getCause();
                                                                                    if (cause46 == null) {
                                                                                        throw th66;
                                                                                    }
                                                                                    throw cause46;
                                                                                }
                                                                            }
                                                                            if (z6) {
                                                                            }
                                                                            if (cls4 == null) {
                                                                            }
                                                                            i41 = 6891;
                                                                            i40 = Math.abs(i43);
                                                                            bArr20 = bArr4;
                                                                            obj3 = obj6;
                                                                            objArr = objArr2;
                                                                            s2 = s4;
                                                                            zArr2 = zArr5;
                                                                            i2 = i3;
                                                                            s82222 = 0;
                                                                        } catch (Throwable th67) {
                                                                            Throwable cause47 = th67.getCause();
                                                                            if (cause47 == null) {
                                                                                throw th67;
                                                                            }
                                                                            throw cause47;
                                                                        }
                                                                    } catch (Throwable th68) {
                                                                        Throwable cause48 = th68.getCause();
                                                                        if (cause48 == null) {
                                                                            throw th68;
                                                                        }
                                                                        throw cause48;
                                                                    }
                                                                }
                                                            } catch (Throwable th69) {
                                                                Throwable cause49 = th69.getCause();
                                                                if (cause49 == null) {
                                                                    throw th69;
                                                                }
                                                                throw cause49;
                                                            }
                                                        } catch (Throwable th70) {
                                                            Throwable cause50 = th70.getCause();
                                                            if (cause50 == null) {
                                                                throw th70;
                                                            }
                                                            throw cause50;
                                                        }
                                                    } catch (Throwable th71) {
                                                        Throwable cause51 = th71.getCause();
                                                        if (cause51 == null) {
                                                            throw th71;
                                                        }
                                                        throw cause51;
                                                    }
                                                } catch (Throwable th72) {
                                                    th = th72;
                                                    cls3 = cls5;
                                                }
                                                i2 = i3 + 1;
                                                i13 = i4;
                                                clsArr2 = clsArr;
                                                cls5 = cls3;
                                                z5 = z;
                                                zArr = zArr4;
                                                $$c = str2;
                                                s = s3;
                                                objArr = objArr2;
                                                zArr2 = zArr5;
                                            }
                                            s2 = s4;
                                            i2 = i3 + 1;
                                            i13 = i4;
                                            clsArr2 = clsArr;
                                            cls5 = cls3;
                                            z5 = z;
                                            zArr = zArr4;
                                            $$c = str2;
                                            s = s3;
                                            objArr = objArr2;
                                            zArr2 = zArr5;
                                        }
                                        return;
                                    } catch (Throwable th73) {
                                        Throwable cause52 = th73.getCause();
                                        if (cause52 == null) {
                                            throw th73;
                                        }
                                        throw cause52;
                                    }
                                }
                                invoke = null;
                            }
                            i = 5;
                            if (invoke3 != null) {
                            }
                            if (invoke2 == null) {
                                int i192 = $10 + 9;
                                $11 = i192 % 128;
                                int i202 = i192 % 2;
                                byte[] bArr102 = $$a;
                                short s92 = (short) 833;
                                invoke2 = Class.forName($$c(bArr102[89], s92, bArr102[i])).getDeclaredConstructor(Class.forName($$c(bArr102[89], s92, bArr102[i])), String.class).newInstance(invoke, $$c(bArr102[c], (short) 289, bArr102[206]));
                            }
                            byte[] bArr722222 = $$a;
                            short s622222 = (short) 833;
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr722222[89], s622222, bArr722222[i])), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = invoke3;
                            objArr[4] = invoke2;
                            objArr[i] = invoke;
                            objArr[6] = invoke3;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[7];
                            zArr3[0] = false;
                            zArr3[1] = false;
                            zArr3[2] = true;
                            zArr3[3] = true;
                            zArr3[4] = false;
                            zArr3[i] = true;
                            zArr3[6] = true;
                            byte b422222 = bArr722222[c2];
                            int i1622222 = $$b;
                            short s722222 = (short) ((i1622222 & 2) + (i1622222 | 2));
                            short s822222 = 0;
                            Class<?> cls722222 = Class.forName($$c(b422222, s722222, bArr722222[192]));
                            i12 = cls722222.getDeclaredField($$c(bArr722222[45], (short) 599, bArr722222[151])).getInt(cls722222);
                            if (i12 >= 34) {
                            }
                            if (i12 != 29) {
                                zArr3[0] = i12 != 29 && i12 >= 26;
                                zArr3[1] = i12 < 21;
                                if (i12 < 21) {
                                }
                                zArr3[4] = z4;
                                s2 = s822222;
                                i2 = s2;
                                while (s2 == 0) {
                                    if (zArr3[i2]) {
                                    }
                                    s2 = s4;
                                    i2 = i3 + 1;
                                    i13 = i4;
                                    clsArr2 = clsArr;
                                    cls5 = cls3;
                                    z5 = z;
                                    zArr = zArr4;
                                    $$c = str2;
                                    s = s3;
                                    objArr = objArr2;
                                    zArr2 = zArr5;
                                }
                            }
                            zArr3[0] = i12 != 29 && i12 >= 26;
                            zArr3[1] = i12 < 21;
                            if (i12 < 21) {
                            }
                            zArr3[4] = z4;
                            s2 = s822222;
                            i2 = s2;
                            while (s2 == 0) {
                            }
                        }
                        c2 = 762;
                        invoke3 = null;
                        if (invoke == null) {
                        }
                        i = 5;
                        if (invoke3 != null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr7222222 = $$a;
                        short s6222222 = (short) 833;
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7222222[89], s6222222, bArr7222222[i])), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = invoke3;
                        objArr[4] = invoke2;
                        objArr[i] = invoke;
                        objArr[6] = invoke3;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[7];
                        zArr3[0] = false;
                        zArr3[1] = false;
                        zArr3[2] = true;
                        zArr3[3] = true;
                        zArr3[4] = false;
                        zArr3[i] = true;
                        zArr3[6] = true;
                        byte b4222222 = bArr7222222[c2];
                        int i16222222 = $$b;
                        short s7222222 = (short) ((i16222222 & 2) + (i16222222 | 2));
                        short s8222222 = 0;
                        Class<?> cls7222222 = Class.forName($$c(b4222222, s7222222, bArr7222222[192]));
                        i12 = cls7222222.getDeclaredField($$c(bArr7222222[45], (short) 599, bArr7222222[151])).getInt(cls7222222);
                        if (i12 >= 34) {
                        }
                        zArr3[0] = i12 != 29 && i12 >= 26;
                        zArr3[1] = i12 < 21;
                        if (i12 < 21) {
                        }
                        zArr3[4] = z4;
                        s2 = s8222222;
                        i2 = s2;
                        while (s2 == 0) {
                        }
                    }
                    c = 30;
                    invoke2 = null;
                    if (obj != null) {
                    }
                    c2 = 762;
                    invoke3 = null;
                    if (invoke == null) {
                    }
                    i = 5;
                    if (invoke3 != null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr72222222 = $$a;
                    short s62222222 = (short) 833;
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr72222222[89], s62222222, bArr72222222[i])), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = invoke3;
                    objArr[4] = invoke2;
                    objArr[i] = invoke;
                    objArr[6] = invoke3;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[7];
                    zArr3[0] = false;
                    zArr3[1] = false;
                    zArr3[2] = true;
                    zArr3[3] = true;
                    zArr3[4] = false;
                    zArr3[i] = true;
                    zArr3[6] = true;
                    byte b42222222 = bArr72222222[c2];
                    int i162222222 = $$b;
                    short s72222222 = (short) ((i162222222 & 2) + (i162222222 | 2));
                    short s82222222 = 0;
                    Class<?> cls72222222 = Class.forName($$c(b42222222, s72222222, bArr72222222[192]));
                    i12 = cls72222222.getDeclaredField($$c(bArr72222222[45], (short) 599, bArr72222222[151])).getInt(cls72222222);
                    if (i12 >= 34) {
                    }
                    zArr3[0] = i12 != 29 && i12 >= 26;
                    zArr3[1] = i12 < 21;
                    if (i12 < 21) {
                    }
                    zArr3[4] = z4;
                    s2 = s82222222;
                    i2 = s2;
                    while (s2 == 0) {
                    }
                }
                if (obj != null) {
                }
                c = 30;
                invoke2 = null;
                if (obj != null) {
                }
                c2 = 762;
                invoke3 = null;
                if (invoke == null) {
                }
                i = 5;
                if (invoke3 != null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr722222222 = $$a;
                short s622222222 = (short) 833;
                objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr722222222[89], s622222222, bArr722222222[i])), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = invoke3;
                objArr[4] = invoke2;
                objArr[i] = invoke;
                objArr[6] = invoke3;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[7];
                zArr3[0] = false;
                zArr3[1] = false;
                zArr3[2] = true;
                zArr3[3] = true;
                zArr3[4] = false;
                zArr3[i] = true;
                zArr3[6] = true;
                byte b422222222 = bArr722222222[c2];
                int i1622222222 = $$b;
                short s722222222 = (short) ((i1622222222 & 2) + (i1622222222 | 2));
                short s822222222 = 0;
                Class<?> cls722222222 = Class.forName($$c(b422222222, s722222222, bArr722222222[192]));
                i12 = cls722222222.getDeclaredField($$c(bArr722222222[45], (short) 599, bArr722222222[151])).getInt(cls722222222);
                if (i12 >= 34) {
                }
                zArr3[0] = i12 != 29 && i12 >= 26;
                zArr3[1] = i12 < 21;
                if (i12 < 21) {
                }
                zArr3[4] = z4;
                s2 = s822222222;
                i2 = s2;
                while (s2 == 0) {
                }
            }
            invoke = null;
            if (obj != null) {
            }
            c = 30;
            invoke2 = null;
            if (obj != null) {
            }
            c2 = 762;
            invoke3 = null;
            if (invoke == null) {
            }
            i = 5;
            if (invoke3 != null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr7222222222 = $$a;
            short s6222222222 = (short) 833;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr7222222222[89], s6222222222, bArr7222222222[i])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = invoke3;
            objArr[4] = invoke2;
            objArr[i] = invoke;
            objArr[6] = invoke3;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[7];
            zArr3[0] = false;
            zArr3[1] = false;
            zArr3[2] = true;
            zArr3[3] = true;
            zArr3[4] = false;
            zArr3[i] = true;
            zArr3[6] = true;
            byte b4222222222 = bArr7222222222[c2];
            int i16222222222 = $$b;
            short s7222222222 = (short) ((i16222222222 & 2) + (i16222222222 | 2));
            short s8222222222 = 0;
            Class<?> cls7222222222 = Class.forName($$c(b4222222222, s7222222222, bArr7222222222[192]));
            i12 = cls7222222222.getDeclaredField($$c(bArr7222222222[45], (short) 599, bArr7222222222[151])).getInt(cls7222222222);
            if (i12 >= 34) {
            }
            zArr3[0] = i12 != 29 && i12 >= 26;
            zArr3[1] = i12 < 21;
            if (i12 < 21) {
            }
            zArr3[4] = z4;
            s2 = s8222222222;
            i2 = s2;
            while (s2 == 0) {
            }
            if (obj != null) {
            }
            invoke = null;
            if (obj != null) {
            }
            c = 30;
            invoke2 = null;
            if (obj != null) {
            }
            c2 = 762;
            invoke3 = null;
            if (invoke == null) {
            }
            i = 5;
            if (invoke3 != null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr72222222222 = $$a;
            short s62222222222 = (short) 833;
            objArr = (Object[]) Array.newInstance(Class.forName($$c(bArr72222222222[89], s62222222222, bArr72222222222[i])), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = invoke3;
            objArr[4] = invoke2;
            objArr[i] = invoke;
            objArr[6] = invoke3;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[7];
            zArr3[0] = false;
            zArr3[1] = false;
            zArr3[2] = true;
            zArr3[3] = true;
            zArr3[4] = false;
            zArr3[i] = true;
            zArr3[6] = true;
            byte b42222222222 = bArr72222222222[c2];
            int i162222222222 = $$b;
            short s72222222222 = (short) ((i162222222222 & 2) + (i162222222222 | 2));
            short s82222222222 = 0;
            Class<?> cls72222222222 = Class.forName($$c(b42222222222, s72222222222, bArr72222222222[192]));
            i12 = cls72222222222.getDeclaredField($$c(bArr72222222222[45], (short) 599, bArr72222222222[151])).getInt(cls72222222222);
            if (i12 >= 34) {
            }
            zArr3[0] = i12 != 29 && i12 >= 26;
            zArr3[1] = i12 < 21;
            if (i12 < 21) {
            }
            zArr3[4] = z4;
            s2 = s82222222222;
            i2 = s2;
            while (s2 == 0) {
            }
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
