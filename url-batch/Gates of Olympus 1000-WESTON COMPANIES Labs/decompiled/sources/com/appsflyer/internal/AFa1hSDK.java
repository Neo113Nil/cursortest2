package com.appsflyer.internal;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.google.common.base.Ascii;
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
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class AFa1hSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static int afInfoLog;
    private static int afVerboseLog;
    private static int afWarnLog;
    public static final Map d;
    private static Object e;
    private static long force;
    private static Object i;
    private static byte[] unregisterClient;
    private static long v;
    private static byte[] w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:7:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i2) {
        short s3;
        int i3 = 2 % 2;
        int i4 = $13;
        int i5 = i4 + 115;
        $12 = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr = $$a;
        int i7 = 1173 - i2;
        int i8 = 119 - s2;
        byte[] bArr2 = new byte[s + 1];
        if (bArr == null) {
            int i9 = i4 + 121;
            $12 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 60 / 0;
            }
            int i11 = i7;
            short s4 = 0;
            i8 = (i8 + i7) - 3;
            i7 = i11 + 1;
            s3 = s4;
            bArr2[s3] = (byte) i8;
            if (s3 == s) {
                return new String(bArr2, 0);
            }
            ?? r0 = s3 + 1;
            i11 = i7;
            i7 = bArr[i7];
            s4 = r0;
            i8 = (i8 + i7) - 3;
            i7 = i11 + 1;
            s3 = s4;
            bArr2[s3] = (byte) i8;
            if (s3 == s) {
            }
        } else {
            s3 = 0;
            bArr2[s3] = (byte) i8;
            if (s3 == s) {
            }
        }
    }

    static void init$0() {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = ((i3 | 113) << 1) - (i3 ^ 113);
        $10 = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = new byte[1194];
        System.arraycopy("\u000f×sN\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ3õô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u00063Ø\u0004\u0001\u00042Î\u00073Ô\u00030Ð\u00056ÿÏ\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉDäô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓ3õô\n\u000b\u0003\bþ&ñ\u0016\u0014ò\f\nóâ \u0016ðû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓ:îô\nÜL5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ9\u0003\u0000\u0004Ó\u0006\u0004\u0003\u0005ý\u0003\u0007þ\u00060\u0002\u0004Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006ü\u0001\u0012Ò5\u0000\u0003ö\fø\u0019Ó-ÿÈ\u0001\u0002\t\u000f/ø\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1194);
        $$a = bArr;
        $$b = 246;
        int i6 = $10;
        int i7 = (i6 & 45) + (i6 | 45);
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 21 / 0;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:981|982|971|972|973|974|975|22|(35:967|968|(0)|26|27|(0)|29|30|(0)|32|(0)|(0)|65|66|67|68|69|70|71|72|(0)(0)|75|(0)|930|79|80|(0)(0)|83|84|(0)(0)|87|88|(1:89)|924|925)|24|(0)|26|27|(0)|29|30|(0)|32|(0)|(0)|65|66|67|68|69|70|71|72|(0)(0)|75|(0)|930|79|80|(0)(0)|83|84|(0)(0)|87|88|(1:89)|924|925) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x047f, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r30[r23], r30[r32], r13)).getMethod($$c(r30[274(0x112, float:3.84E-43)], r30[r18], (short) 865), null).invoke(r0, null)).booleanValue() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x019f, code lost:
    
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x18fc, code lost:
    
        r0 = r51.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x1917, code lost:
    
        if (r50 == true) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x1919, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x191c, code lost:
    
        com.appsflyer.internal.AFa1hSDK.i = r0.newInstance(r1, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x192a, code lost:
    
        r0 = (int) java.lang.System.currentTimeMillis();
        r2 = ~(((-1250256032) ^ r0) | ((-1250256032) & r0));
        r4 = 2131057976 - (~(((r2 & 226762495) | (226762495 ^ r2)) * 262));
        r5 = (r4 & (-626405422)) + ((-626405422) | r4);
        r0 = ~r0;
        r0 = -(-(((~((r0 & (-1250256032)) | ((-1250256032) ^ r0))) | 226762495) * 262));
        r1 = (r5 & r0) + (r0 | r5);
        r0 = (int) java.lang.System.currentTimeMillis();
        r2 = ~((1195487659 & r0) | (1195487659 ^ r0));
        r4 = 1010254117 - (~(((r2 & 1652425198) | (1652425198 ^ r2)) * 398));
        r0 = ~r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x198f, code lost:
    
        if (r1 <= ((r4 - (~(((~((r0 & 1195487659) | (1195487659 ^ r0))) | 1652425198) * 398))) - 1)) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x19a0, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x19a3, code lost:
    
        r1 = r25;
        r4 = r49;
        r2 = 2;
        r6 = 1;
        r17 = 3;
        r22 = false;
        r32 = 26;
        r33 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x1991, code lost:
    
        r3.close();
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x199b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x199c, code lost:
    
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x191b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x0421, code lost:
    
        r3 = r22 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x041f, code lost:
    
        r25 = 7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x1c18 A[Catch: Exception -> 0x1d12, TRY_LEAVE, TryCatch #18 {Exception -> 0x1d12, blocks: (B:8:0x0144, B:10:0x0157, B:34:0x02b1, B:41:0x1cf8, B:43:0x1cfe, B:45:0x1cff, B:48:0x1d01, B:50:0x1d07, B:51:0x1d08, B:56:0x032a, B:61:0x0372, B:63:0x0378, B:64:0x0379, B:65:0x037a, B:68:0x03be, B:71:0x03cc, B:80:0x0406, B:83:0x0410, B:87:0x041c, B:95:0x043b, B:159:0x1bb5, B:161:0x1c18, B:166:0x1c24, B:170:0x1ccf, B:174:0x1c49, B:175:0x1c68, B:182:0x1ca8, B:184:0x1cae, B:185:0x1caf, B:186:0x1c5a, B:915:0x1cec, B:918:0x1cf3, B:939:0x0267, B:944:0x1d0a, B:946:0x1d10, B:947:0x1d11, B:58:0x033b, B:178:0x1c6e, B:179:0x1ca6, B:38:0x02f1, B:36:0x02be, B:941:0x028b), top: B:7:0x0144, inners: #36, #65, #103, #105, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x1c49 A[Catch: Exception -> 0x1d12, TRY_ENTER, TryCatch #18 {Exception -> 0x1d12, blocks: (B:8:0x0144, B:10:0x0157, B:34:0x02b1, B:41:0x1cf8, B:43:0x1cfe, B:45:0x1cff, B:48:0x1d01, B:50:0x1d07, B:51:0x1d08, B:56:0x032a, B:61:0x0372, B:63:0x0378, B:64:0x0379, B:65:0x037a, B:68:0x03be, B:71:0x03cc, B:80:0x0406, B:83:0x0410, B:87:0x041c, B:95:0x043b, B:159:0x1bb5, B:161:0x1c18, B:166:0x1c24, B:170:0x1ccf, B:174:0x1c49, B:175:0x1c68, B:182:0x1ca8, B:184:0x1cae, B:185:0x1caf, B:186:0x1c5a, B:915:0x1cec, B:918:0x1cf3, B:939:0x0267, B:944:0x1d0a, B:946:0x1d10, B:947:0x1d11, B:58:0x033b, B:178:0x1c6e, B:179:0x1ca6, B:38:0x02f1, B:36:0x02be, B:941:0x028b), top: B:7:0x0144, inners: #36, #65, #103, #105, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1c5a A[Catch: Exception -> 0x1d12, TryCatch #18 {Exception -> 0x1d12, blocks: (B:8:0x0144, B:10:0x0157, B:34:0x02b1, B:41:0x1cf8, B:43:0x1cfe, B:45:0x1cff, B:48:0x1d01, B:50:0x1d07, B:51:0x1d08, B:56:0x032a, B:61:0x0372, B:63:0x0378, B:64:0x0379, B:65:0x037a, B:68:0x03be, B:71:0x03cc, B:80:0x0406, B:83:0x0410, B:87:0x041c, B:95:0x043b, B:159:0x1bb5, B:161:0x1c18, B:166:0x1c24, B:170:0x1ccf, B:174:0x1c49, B:175:0x1c68, B:182:0x1ca8, B:184:0x1cae, B:185:0x1caf, B:186:0x1c5a, B:915:0x1cec, B:918:0x1cf3, B:939:0x0267, B:944:0x1d0a, B:946:0x1d10, B:947:0x1d11, B:58:0x033b, B:178:0x1c6e, B:179:0x1ca6, B:38:0x02f1, B:36:0x02be, B:941:0x028b), top: B:7:0x0144, inners: #36, #65, #103, #105, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b1 A[Catch: Exception -> 0x1d12, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x1d12, blocks: (B:8:0x0144, B:10:0x0157, B:34:0x02b1, B:41:0x1cf8, B:43:0x1cfe, B:45:0x1cff, B:48:0x1d01, B:50:0x1d07, B:51:0x1d08, B:56:0x032a, B:61:0x0372, B:63:0x0378, B:64:0x0379, B:65:0x037a, B:68:0x03be, B:71:0x03cc, B:80:0x0406, B:83:0x0410, B:87:0x041c, B:95:0x043b, B:159:0x1bb5, B:161:0x1c18, B:166:0x1c24, B:170:0x1ccf, B:174:0x1c49, B:175:0x1c68, B:182:0x1ca8, B:184:0x1cae, B:185:0x1caf, B:186:0x1c5a, B:915:0x1cec, B:918:0x1cf3, B:939:0x0267, B:944:0x1d0a, B:946:0x1d10, B:947:0x1d11, B:58:0x033b, B:178:0x1c6e, B:179:0x1ca6, B:38:0x02f1, B:36:0x02be, B:941:0x028b), top: B:7:0x0144, inners: #36, #65, #103, #105, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1776  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x18fc A[EDGE_INSN: B:510:0x18fc->B:511:0x18fc BREAK  A[LOOP:4: B:330:0x0b09->B:475:0x18b5], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0400 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:816:0x1adc A[Catch: all -> 0x1b3f, TryCatch #12 {all -> 0x1b3f, blocks: (B:558:0x19f2, B:566:0x1a3a, B:568:0x1a40, B:569:0x1a41, B:579:0x1a45, B:581:0x1a4f, B:582:0x1a50, B:601:0x1a5a, B:603:0x1a66, B:604:0x1a67, B:607:0x1a69, B:609:0x1a75, B:610:0x1a76, B:766:0x1a99, B:768:0x1aa1, B:769:0x1aa2, B:814:0x1ad2, B:816:0x1adc, B:817:0x1add, B:830:0x1ae2, B:832:0x1af2, B:833:0x1af3, B:838:0x1b05, B:840:0x1b0d, B:841:0x1b0e, B:848:0x1b14, B:850:0x1b24, B:851:0x1b25, B:857:0x1b2b, B:859:0x1b3d, B:860:0x1b3e, B:561:0x1a05, B:562:0x1a38, B:424:0x1552, B:395:0x13bc, B:392:0x1385, B:328:0x0ad4), top: B:423:0x1552, inners: #10, #15, #24, #31, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:817:0x1add A[Catch: all -> 0x1b3f, TryCatch #12 {all -> 0x1b3f, blocks: (B:558:0x19f2, B:566:0x1a3a, B:568:0x1a40, B:569:0x1a41, B:579:0x1a45, B:581:0x1a4f, B:582:0x1a50, B:601:0x1a5a, B:603:0x1a66, B:604:0x1a67, B:607:0x1a69, B:609:0x1a75, B:610:0x1a76, B:766:0x1a99, B:768:0x1aa1, B:769:0x1aa2, B:814:0x1ad2, B:816:0x1adc, B:817:0x1add, B:830:0x1ae2, B:832:0x1af2, B:833:0x1af3, B:838:0x1b05, B:840:0x1b0d, B:841:0x1b0e, B:848:0x1b14, B:850:0x1b24, B:851:0x1b25, B:857:0x1b2b, B:859:0x1b3d, B:860:0x1b3e, B:561:0x1a05, B:562:0x1a38, B:424:0x1552, B:395:0x13bc, B:392:0x1385, B:328:0x0ad4), top: B:423:0x1552, inners: #10, #15, #24, #31, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x0492 A[Catch: all -> 0x1b9c, TryCatch #62 {all -> 0x1b9c, blocks: (B:99:0x0441, B:104:0x0498, B:111:0x04f0, B:113:0x04f6, B:114:0x04f7, B:125:0x04fe, B:900:0x048c, B:902:0x0492, B:903:0x0493, B:106:0x04cb, B:107:0x04ee), top: B:98:0x0441, inners: #99 }] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x0493 A[Catch: all -> 0x1b9c, TryCatch #62 {all -> 0x1b9c, blocks: (B:99:0x0441, B:104:0x0498, B:111:0x04f0, B:113:0x04f6, B:114:0x04f7, B:125:0x04fe, B:900:0x048c, B:902:0x0492, B:903:0x0493, B:106:0x04cb, B:107:0x04ee), top: B:98:0x0441, inners: #99 }] */
    /* JADX WARN: Removed duplicated region for block: B:914:0x1cec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:937:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:948:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:957:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x043b A[Catch: Exception -> 0x1d12, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x1d12, blocks: (B:8:0x0144, B:10:0x0157, B:34:0x02b1, B:41:0x1cf8, B:43:0x1cfe, B:45:0x1cff, B:48:0x1d01, B:50:0x1d07, B:51:0x1d08, B:56:0x032a, B:61:0x0372, B:63:0x0378, B:64:0x0379, B:65:0x037a, B:68:0x03be, B:71:0x03cc, B:80:0x0406, B:83:0x0410, B:87:0x041c, B:95:0x043b, B:159:0x1bb5, B:161:0x1c18, B:166:0x1c24, B:170:0x1ccf, B:174:0x1c49, B:175:0x1c68, B:182:0x1ca8, B:184:0x1cae, B:185:0x1caf, B:186:0x1c5a, B:915:0x1cec, B:918:0x1cf3, B:939:0x0267, B:944:0x1d0a, B:946:0x1d10, B:947:0x1d11, B:58:0x033b, B:178:0x1c6e, B:179:0x1ca6, B:38:0x02f1, B:36:0x02be, B:941:0x028b), top: B:7:0x0144, inners: #36, #65, #103, #105, #106 }] */
    /* JADX WARN: Removed duplicated region for block: B:967:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v212, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v50, types: [int, short] */
    /* JADX WARN: Type inference failed for: r13v51, types: [int] */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54, types: [int] */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r1v103, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v194, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r22v30 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v82 */
    /* JADX WARN: Type inference failed for: r2v200, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r2v225, types: [java.util.Random] */
    /* JADX WARN: Type inference failed for: r2v227, types: [java.util.Random] */
    /* JADX WARN: Type inference failed for: r2v281 */
    /* JADX WARN: Type inference failed for: r2v303 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v13 */
    /* JADX WARN: Type inference failed for: r39v15 */
    /* JADX WARN: Type inference failed for: r39v16 */
    /* JADX WARN: Type inference failed for: r39v17 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v20 */
    /* JADX WARN: Type inference failed for: r39v28 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v31 */
    /* JADX WARN: Type inference failed for: r39v32 */
    /* JADX WARN: Type inference failed for: r39v33 */
    /* JADX WARN: Type inference failed for: r39v34 */
    /* JADX WARN: Type inference failed for: r39v35 */
    /* JADX WARN: Type inference failed for: r39v36 */
    /* JADX WARN: Type inference failed for: r39v38 */
    /* JADX WARN: Type inference failed for: r39v39 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v40 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Type inference failed for: r42v23, types: [int] */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v42 */
    /* JADX WARN: Type inference failed for: r42v43 */
    /* JADX WARN: Type inference failed for: r44v51 */
    /* JADX WARN: Type inference failed for: r4v196, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v223, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v65, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v159, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v197, types: [int, short] */
    /* JADX WARN: Type inference failed for: r9v123, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v65, types: [java.lang.Class] */
    static {
        String str;
        char c;
        int i2;
        Object obj;
        int i3;
        Object invoke;
        Class<?> cls;
        byte b;
        byte b2;
        char c2;
        Object invoke2;
        char c3;
        Class<?> cls2;
        byte[] bArr;
        boolean z;
        Object invoke3;
        char c4;
        boolean z2;
        int i4;
        int i5;
        Class<byte[]> cls3;
        boolean z3;
        boolean[] zArr;
        int i6;
        int i7;
        ?? r39;
        String str2;
        boolean[] zArr2;
        int i8;
        boolean[] zArr3;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        byte b3;
        byte b4;
        byte b5;
        int i14;
        int i15;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z5;
        boolean[] zArr4;
        Throwable th;
        byte[] bArr3;
        Object[] objArr;
        Class<?> cls4;
        Class<?>[] clsArr;
        short s;
        Throwable cause;
        Object newInstance;
        Object obj6;
        byte[] bArr4;
        byte[] bArr5;
        Object obj7;
        Object obj8;
        char c5;
        Class cls5;
        boolean z6;
        Object invoke4;
        short s2;
        short s3;
        String str3;
        Class cls6;
        Throwable th2;
        Object obj9;
        int i16;
        int i17;
        boolean[] zArr5;
        ?? r392;
        boolean[] zArr6;
        ?? r393;
        Object[] objArr2;
        int i18;
        int i19;
        Object obj10;
        ?? r42;
        int i20;
        Throwable cause2;
        int i21;
        boolean z7;
        Class<byte[]> cls7 = byte[].class;
        init$0();
        int i22 = 2;
        try {
            int i23 = 1;
            byte[] bArr6 = $$a;
            int i24 = 26;
            int intValue = ((Integer) Class.forName($$c(bArr6[194], bArr6[105], (short) 1169)).getMethod($$c(bArr6[26], bArr6[46], (short) 1136), Integer.TYPE, Integer.TYPE).invoke(null, 3, 7)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i25 = -(-((~(((-536873107) & currentTimeMillis) | ((-536873107) ^ currentTimeMillis))) * 623));
            int i26 = ((139775766 | i25) << 1) - (i25 ^ 139775766);
            int i27 = ((~currentTimeMillis) | 1354285828) * (-623);
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = -(-(((~((1405085453 ^ currentTimeMillis) | (currentTimeMillis & 1405085453))) | (~((-587672732) | currentTimeMillis)) | 536873106) * 623));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = ~intValue;
            int i32 = ~((i31 & 283040942) | (283040942 ^ i31));
            int i33 = (i32 & 153092945) | (153092945 ^ i32);
            int i34 = ((-281025673) & intValue) | ((-281025673) ^ intValue);
            int i35 = ~i34;
            int i36 = -(-(((i33 ^ i35) | (i33 & i35)) * (-252)));
            int i37 = (i30 ^ i36) + ((i36 & i30) << 1) + 2098992860;
            int i38 = ~intValue;
            int i39 = (~((i38 & 283040942) | (283040942 ^ i38) | 155108215)) | (~i34);
            int i40 = i39 * 252;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i41 = (((i39 * 216720) + (i37 * (-858))) - (~((i40 | currentTimeMillis2) * (-859)))) - 1;
            int i42 = ~currentTimeMillis2;
            int i43 = ~((i42 ^ i40) | (i42 & i40));
            int i44 = ~i40;
            int i45 = 3;
            int i46 = ~i37;
            int i47 = (i44 ^ i46) | (i44 & i46);
            int i48 = ~((i47 ^ currentTimeMillis2) | (i47 & currentTimeMillis2));
            int i49 = i41 + (((i43 ^ i48) | (i48 & i43)) * 859);
            int i50 = ~(i46 | (~currentTimeMillis2));
            int i51 = ~i37;
            int i52 = ~((i40 & i51) | (i51 ^ i40));
            if ((i49 - (~(((i50 & i52) | (i50 ^ i52)) * 859))) - 1 == 0) {
                return;
            }
            v = -3847093770088650534L;
            afWarnLog = 578427012;
            afVerboseLog = 3;
            afErrorLogForExcManagerOnly = new byte[]{38, -99, -103, -111, 76, -9, -5, 67};
            AFInAppEventType = new HashMap();
            d = new HashMap();
            try {
                String $$c = $$c(bArr6[511], bArr6[107], (short) 1123);
                if (i == null) {
                    str = $$c(bArr6[123], bArr6[107], (short) 1091);
                } else {
                    int i53 = 2 % 2;
                    str = null;
                }
                try {
                    byte b6 = bArr6[23];
                    byte b7 = bArr6[105];
                    c = 'k';
                    try {
                        Class<?> cls8 = Class.forName($$c(b6, b7, (short) (b7 | 1057)));
                        byte b8 = bArr6[6];
                        byte b9 = bArr6[107];
                        i2 = 4;
                        try {
                            Method method = cls8.getMethod($$c(b8, b9, (short) ((b9 & 1034) | (b9 ^ 1034))), new Class[0]);
                            obj = method.invoke(null, null);
                            c = 'k';
                        } catch (Exception unused) {
                            obj = null;
                            c = c;
                            try {
                                byte[] bArr7 = $$a;
                                Class<?> cls9 = Class.forName($$c(bArr7[72], bArr7[105], (short) 1037));
                                byte b10 = bArr7[c == true ? 1 : 0];
                                byte b11 = bArr7[i2];
                                i3 = 6;
                                try {
                                    Method method2 = cls9.getMethod($$c(b10, b11, (short) ((b11 & 1000) | (b11 ^ 1000))), new Class[0]);
                                    obj = method2.invoke(null, null);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                i3 = 6;
                                if (obj != null) {
                                }
                                invoke = null;
                                if (obj != null) {
                                }
                                c2 = 'O';
                                invoke2 = null;
                                c3 = c2;
                                if (obj != null) {
                                }
                                z = false;
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                c4 = 'P';
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr8 = $$a;
                                ?? r13 = (short) 952;
                                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c(bArr8[c4], bArr8[26], r13)), 7);
                                objArr3[z ? 1 : 0] = null;
                                objArr3[1] = invoke2;
                                objArr3[2] = invoke;
                                objArr3[3] = invoke3;
                                objArr3[i2] = invoke2;
                                objArr3[5] = invoke;
                                objArr3[i3] = invoke3;
                                boolean[] zArr7 = {false, true, true, true, true, true, true};
                                boolean[] zArr8 = {false, false, false, false, true, true, true};
                                boolean[] zArr9 = new boolean[7];
                                zArr9[z ? 1 : 0] = z;
                                zArr9[1] = z;
                                zArr9[2] = true;
                                zArr9[3] = true;
                                zArr9[i2] = z;
                                zArr9[5] = true;
                                zArr9[i3] = true;
                                byte b12 = bArr8[114];
                                byte b13 = bArr8[105];
                                int i54 = 7;
                                Class<?> cls10 = Class.forName($$c(b12, b13, (short) ((b13 ^ 872) | (b13 & 872))));
                                byte b14 = bArr8[56];
                                byte b15 = bArr8[44];
                                i21 = cls10.getDeclaredField($$c(b14, b15, (short) (b15 | 835))).getInt(cls10);
                                if (i21 < 34) {
                                }
                                zArr9[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                zArr9[1] = i21 >= 21 ? true : z ? 1 : 0;
                                if (i21 >= 21) {
                                }
                                zArr9[i2] = z7;
                                i4 = z ? 1 : 0;
                                int i55 = i4;
                                boolean z8 = z2;
                                boolean z9 = z;
                                while ((i4 ^ 1) == i23) {
                                }
                            }
                            if (obj != null) {
                                try {
                                    Class<?> cls11 = obj.getClass();
                                    byte[] bArr9 = $$a;
                                    Method method3 = cls11.getMethod($$c(bArr9[79], bArr9[i2], (short) 996), null);
                                    invoke = method3.invoke(obj, null);
                                } catch (Exception unused4) {
                                    invoke = null;
                                    if (obj != null) {
                                        try {
                                            cls = obj.getClass();
                                            byte[] bArr10 = $$a;
                                            b = bArr10[12];
                                            b2 = bArr10[i2];
                                            c2 = 'O';
                                        } catch (Exception unused5) {
                                            c2 = 'O';
                                            invoke2 = null;
                                            c3 = c2;
                                            if (obj != null) {
                                            }
                                            z = false;
                                            invoke3 = null;
                                            if (invoke == null) {
                                            }
                                            c4 = 'P';
                                            if (invoke3 == null) {
                                            }
                                            if (invoke2 == null) {
                                            }
                                            byte[] bArr82 = $$a;
                                            ?? r132 = (short) 952;
                                            Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c(bArr82[c4], bArr82[26], r132)), 7);
                                            objArr32[z ? 1 : 0] = null;
                                            objArr32[1] = invoke2;
                                            objArr32[2] = invoke;
                                            objArr32[3] = invoke3;
                                            objArr32[i2] = invoke2;
                                            objArr32[5] = invoke;
                                            objArr32[i3] = invoke3;
                                            boolean[] zArr72 = {false, true, true, true, true, true, true};
                                            boolean[] zArr82 = {false, false, false, false, true, true, true};
                                            boolean[] zArr92 = new boolean[7];
                                            zArr92[z ? 1 : 0] = z;
                                            zArr92[1] = z;
                                            zArr92[2] = true;
                                            zArr92[3] = true;
                                            zArr92[i2] = z;
                                            zArr92[5] = true;
                                            zArr92[i3] = true;
                                            byte b122 = bArr82[114];
                                            byte b132 = bArr82[105];
                                            int i542 = 7;
                                            Class<?> cls102 = Class.forName($$c(b122, b132, (short) ((b132 ^ 872) | (b132 & 872))));
                                            byte b142 = bArr82[56];
                                            byte b152 = bArr82[44];
                                            i21 = cls102.getDeclaredField($$c(b142, b152, (short) (b152 | 835))).getInt(cls102);
                                            if (i21 < 34) {
                                            }
                                            zArr92[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                            zArr92[1] = i21 >= 21 ? true : z ? 1 : 0;
                                            if (i21 >= 21) {
                                            }
                                            zArr92[i2] = z7;
                                            i4 = z ? 1 : 0;
                                            int i552 = i4;
                                            boolean z82 = z2;
                                            boolean z92 = z;
                                            while ((i4 ^ 1) == i23) {
                                            }
                                        }
                                        try {
                                            String $$c2 = $$c(b, b2, (short) (b2 | 970));
                                            Method method4 = cls.getMethod($$c2, null);
                                            invoke2 = method4.invoke(obj, null);
                                            int i56 = 2 % 2;
                                            c3 = 'O';
                                        } catch (Exception unused6) {
                                            invoke2 = null;
                                            c3 = c2;
                                            if (obj != null) {
                                            }
                                            z = false;
                                            invoke3 = null;
                                            if (invoke == null) {
                                            }
                                            c4 = 'P';
                                            if (invoke3 == null) {
                                            }
                                            if (invoke2 == null) {
                                            }
                                            byte[] bArr822 = $$a;
                                            ?? r1322 = (short) 952;
                                            Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c(bArr822[c4], bArr822[26], r1322)), 7);
                                            objArr322[z ? 1 : 0] = null;
                                            objArr322[1] = invoke2;
                                            objArr322[2] = invoke;
                                            objArr322[3] = invoke3;
                                            objArr322[i2] = invoke2;
                                            objArr322[5] = invoke;
                                            objArr322[i3] = invoke3;
                                            boolean[] zArr722 = {false, true, true, true, true, true, true};
                                            boolean[] zArr822 = {false, false, false, false, true, true, true};
                                            boolean[] zArr922 = new boolean[7];
                                            zArr922[z ? 1 : 0] = z;
                                            zArr922[1] = z;
                                            zArr922[2] = true;
                                            zArr922[3] = true;
                                            zArr922[i2] = z;
                                            zArr922[5] = true;
                                            zArr922[i3] = true;
                                            byte b1222 = bArr822[114];
                                            byte b1322 = bArr822[105];
                                            int i5422 = 7;
                                            Class<?> cls1022 = Class.forName($$c(b1222, b1322, (short) ((b1322 ^ 872) | (b1322 & 872))));
                                            byte b1422 = bArr822[56];
                                            byte b1522 = bArr822[44];
                                            i21 = cls1022.getDeclaredField($$c(b1422, b1522, (short) (b1522 | 835))).getInt(cls1022);
                                            if (i21 < 34) {
                                            }
                                            zArr922[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                            zArr922[1] = i21 >= 21 ? true : z ? 1 : 0;
                                            if (i21 >= 21) {
                                            }
                                            zArr922[i2] = z7;
                                            i4 = z ? 1 : 0;
                                            int i5522 = i4;
                                            boolean z822 = z2;
                                            boolean z922 = z;
                                            while ((i4 ^ 1) == i23) {
                                            }
                                        }
                                        if (obj != null) {
                                            try {
                                                cls2 = obj.getClass();
                                                bArr = $$a;
                                                z = false;
                                            } catch (Exception unused7) {
                                                z = false;
                                                invoke3 = null;
                                                if (invoke == null) {
                                                }
                                                c4 = 'P';
                                                if (invoke3 == null) {
                                                }
                                                if (invoke2 == null) {
                                                }
                                                byte[] bArr8222 = $$a;
                                                ?? r13222 = (short) 952;
                                                Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c(bArr8222[c4], bArr8222[26], r13222)), 7);
                                                objArr3222[z ? 1 : 0] = null;
                                                objArr3222[1] = invoke2;
                                                objArr3222[2] = invoke;
                                                objArr3222[3] = invoke3;
                                                objArr3222[i2] = invoke2;
                                                objArr3222[5] = invoke;
                                                objArr3222[i3] = invoke3;
                                                boolean[] zArr7222 = {false, true, true, true, true, true, true};
                                                boolean[] zArr8222 = {false, false, false, false, true, true, true};
                                                boolean[] zArr9222 = new boolean[7];
                                                zArr9222[z ? 1 : 0] = z;
                                                zArr9222[1] = z;
                                                zArr9222[2] = true;
                                                zArr9222[3] = true;
                                                zArr9222[i2] = z;
                                                zArr9222[5] = true;
                                                zArr9222[i3] = true;
                                                byte b12222 = bArr8222[114];
                                                byte b13222 = bArr8222[105];
                                                int i54222 = 7;
                                                Class<?> cls10222 = Class.forName($$c(b12222, b13222, (short) ((b13222 ^ 872) | (b13222 & 872))));
                                                byte b14222 = bArr8222[56];
                                                byte b15222 = bArr8222[44];
                                                i21 = cls10222.getDeclaredField($$c(b14222, b15222, (short) (b15222 | 835))).getInt(cls10222);
                                                if (i21 < 34) {
                                                }
                                                zArr9222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                                zArr9222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                                if (i21 >= 21) {
                                                }
                                                zArr9222[i2] = z7;
                                                i4 = z ? 1 : 0;
                                                int i55222 = i4;
                                                boolean z8222 = z2;
                                                boolean z9222 = z;
                                                while ((i4 ^ 1) == i23) {
                                                }
                                            }
                                            try {
                                                String $$c3 = $$c(bArr[c3], bArr[i2], (short) 972);
                                                Method method5 = cls2.getMethod($$c3, null);
                                                invoke3 = method5.invoke(obj, null);
                                            } catch (Exception unused8) {
                                                invoke3 = null;
                                                if (invoke == null) {
                                                }
                                                c4 = 'P';
                                                if (invoke3 == null) {
                                                }
                                                if (invoke2 == null) {
                                                }
                                                byte[] bArr82222 = $$a;
                                                ?? r132222 = (short) 952;
                                                Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName($$c(bArr82222[c4], bArr82222[26], r132222)), 7);
                                                objArr32222[z ? 1 : 0] = null;
                                                objArr32222[1] = invoke2;
                                                objArr32222[2] = invoke;
                                                objArr32222[3] = invoke3;
                                                objArr32222[i2] = invoke2;
                                                objArr32222[5] = invoke;
                                                objArr32222[i3] = invoke3;
                                                boolean[] zArr72222 = {false, true, true, true, true, true, true};
                                                boolean[] zArr82222 = {false, false, false, false, true, true, true};
                                                boolean[] zArr92222 = new boolean[7];
                                                zArr92222[z ? 1 : 0] = z;
                                                zArr92222[1] = z;
                                                zArr92222[2] = true;
                                                zArr92222[3] = true;
                                                zArr92222[i2] = z;
                                                zArr92222[5] = true;
                                                zArr92222[i3] = true;
                                                byte b122222 = bArr82222[114];
                                                byte b132222 = bArr82222[105];
                                                int i542222 = 7;
                                                Class<?> cls102222 = Class.forName($$c(b122222, b132222, (short) ((b132222 ^ 872) | (b132222 & 872))));
                                                byte b142222 = bArr82222[56];
                                                byte b152222 = bArr82222[44];
                                                i21 = cls102222.getDeclaredField($$c(b142222, b152222, (short) (b152222 | 835))).getInt(cls102222);
                                                if (i21 < 34) {
                                                }
                                                zArr92222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                                zArr92222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                                if (i21 >= 21) {
                                                }
                                                zArr92222[i2] = z7;
                                                i4 = z ? 1 : 0;
                                                int i552222 = i4;
                                                boolean z82222 = z2;
                                                boolean z92222 = z;
                                                while ((i4 ^ 1) == i23) {
                                                }
                                            }
                                            if (invoke == null) {
                                                if (str != null) {
                                                    StringBuilder sb = new StringBuilder();
                                                    byte[] bArr11 = $$a;
                                                    c4 = 'P';
                                                    try {
                                                        Object[] objArr4 = {sb.append($$c(bArr11[c3], bArr11[694], (short) 962)).append(str).toString()};
                                                        Class<?> cls12 = Class.forName($$c(bArr11[80], bArr11[26], (short) 952));
                                                        Class<?>[] clsArr2 = new Class[1];
                                                        clsArr2[z ? 1 : 0] = String.class;
                                                        invoke = cls12.getDeclaredConstructor(clsArr2).newInstance(objArr4);
                                                        if (invoke3 == null) {
                                                            byte[] bArr12 = $$a;
                                                            byte b16 = bArr12[26];
                                                            byte b17 = b16;
                                                            try {
                                                                Object[] objArr5 = {$$c(b16, b17, (short) (b17 | 928))};
                                                                Class<?> cls13 = Class.forName($$c(bArr12[z ? 1 : 0], bArr12[26], (short) 928));
                                                                byte b18 = bArr12[c3];
                                                                byte b19 = bArr12[i2];
                                                                String $$c4 = $$c(b18, b19, (short) ((b19 & 897) | (b19 ^ 897)));
                                                                Class<?>[] clsArr3 = new Class[1];
                                                                clsArr3[z ? 1 : 0] = String.class;
                                                                try {
                                                                    Object[] objArr6 = {cls13.getMethod($$c4, clsArr3).invoke(null, objArr5)};
                                                                    Class<?> cls14 = Class.forName($$c(bArr12[c4], bArr12[26], (short) 952));
                                                                    Class<?>[] clsArr4 = new Class[1];
                                                                    clsArr4[z ? 1 : 0] = String.class;
                                                                    invoke3 = cls14.getDeclaredConstructor(clsArr4).newInstance(objArr6);
                                                                } catch (Throwable th3) {
                                                                    Throwable cause3 = th3.getCause();
                                                                    if (cause3 == null) {
                                                                        throw th3;
                                                                    }
                                                                    throw cause3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                Throwable cause4 = th4.getCause();
                                                                if (cause4 == null) {
                                                                    throw th4;
                                                                }
                                                                throw cause4;
                                                            }
                                                        }
                                                        if (invoke2 == null) {
                                                            int i57 = $10;
                                                            int i58 = ((i57 | 1) << 1) - (i57 ^ 1);
                                                            int i59 = i58 % 128;
                                                            $11 = i59;
                                                            int i60 = i58 % 2;
                                                            if (invoke != null) {
                                                                int i61 = i59 + 7;
                                                                $10 = i61 % 128;
                                                                int i62 = i61 % 2;
                                                                byte[] bArr13 = $$a;
                                                                try {
                                                                    Object[] objArr7 = new Object[2];
                                                                    objArr7[1] = $$c(bArr13[47], bArr13[c], (short) TypedValues.Custom.TYPE_STRING);
                                                                    objArr7[z ? 1 : 0] = invoke;
                                                                    short s4 = (short) 952;
                                                                    Class<?> cls15 = Class.forName($$c(bArr13[c4], bArr13[26], s4));
                                                                    Class<?>[] clsArr5 = new Class[2];
                                                                    clsArr5[z ? 1 : 0] = Class.forName($$c(bArr13[c4], bArr13[26], s4));
                                                                    clsArr5[1] = String.class;
                                                                    invoke2 = cls15.getDeclaredConstructor(clsArr5).newInstance(objArr7);
                                                                } catch (Throwable th5) {
                                                                    Throwable cause5 = th5.getCause();
                                                                    if (cause5 == null) {
                                                                        throw th5;
                                                                    }
                                                                    throw cause5;
                                                                }
                                                            }
                                                        }
                                                        byte[] bArr822222 = $$a;
                                                        ?? r1322222 = (short) 952;
                                                        Object[] objArr322222 = (Object[]) Array.newInstance(Class.forName($$c(bArr822222[c4], bArr822222[26], r1322222)), 7);
                                                        objArr322222[z ? 1 : 0] = null;
                                                        objArr322222[1] = invoke2;
                                                        objArr322222[2] = invoke;
                                                        objArr322222[3] = invoke3;
                                                        objArr322222[i2] = invoke2;
                                                        objArr322222[5] = invoke;
                                                        objArr322222[i3] = invoke3;
                                                        boolean[] zArr722222 = {false, true, true, true, true, true, true};
                                                        boolean[] zArr822222 = {false, false, false, false, true, true, true};
                                                        boolean[] zArr922222 = new boolean[7];
                                                        zArr922222[z ? 1 : 0] = z;
                                                        zArr922222[1] = z;
                                                        zArr922222[2] = true;
                                                        zArr922222[3] = true;
                                                        zArr922222[i2] = z;
                                                        zArr922222[5] = true;
                                                        zArr922222[i3] = true;
                                                        byte b1222222 = bArr822222[114];
                                                        byte b1322222 = bArr822222[105];
                                                        int i5422222 = 7;
                                                        Class<?> cls1022222 = Class.forName($$c(b1222222, b1322222, (short) ((b1322222 ^ 872) | (b1322222 & 872))));
                                                        byte b1422222 = bArr822222[56];
                                                        byte b1522222 = bArr822222[44];
                                                        i21 = cls1022222.getDeclaredField($$c(b1422222, b1522222, (short) (b1522222 | 835))).getInt(cls1022222);
                                                        if (i21 < 34) {
                                                            System.currentTimeMillis();
                                                            System.currentTimeMillis();
                                                            z2 = true;
                                                        } else {
                                                            z2 = z ? 1 : 0;
                                                        }
                                                        zArr922222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                                        zArr922222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                                        if (i21 >= 21) {
                                                            z7 = true;
                                                        } else {
                                                            int i63 = 2 % 2;
                                                            z7 = z ? 1 : 0;
                                                        }
                                                        zArr922222[i2] = z7;
                                                        i4 = z ? 1 : 0;
                                                        int i5522222 = i4;
                                                        boolean z822222 = z2;
                                                        boolean z922222 = z;
                                                        while ((i4 ^ 1) == i23 && i5522222 < 9) {
                                                            i5 = $11 + 97;
                                                            $10 = i5 % 128;
                                                            if (i5 % i22 == 0) {
                                                                boolean z10 = zArr922222[i5522222];
                                                                throw null;
                                                            }
                                                            if (zArr922222[i5522222]) {
                                                                try {
                                                                    boolean z11 = zArr722222[i5522222];
                                                                    Object obj11 = objArr322222[i5522222];
                                                                    boolean z12 = zArr822222[i5522222];
                                                                    if (z11) {
                                                                        if (obj11 != null) {
                                                                            try {
                                                                                byte[] bArr14 = $$a;
                                                                                i14 = i22;
                                                                                try {
                                                                                    i15 = i24;
                                                                                    try {
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        cause2 = th.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw th;
                                                                                        }
                                                                                        throw cause2;
                                                                                    }
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    cause2 = th.getCause();
                                                                                    if (cause2 != null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                            }
                                                                        } else {
                                                                            i15 = i24;
                                                                        }
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        byte[] bArr15 = $$a;
                                                                        short s5 = (short) 854;
                                                                        try {
                                                                            Object[] objArr8 = {sb2.append($$c(bArr15[16], bArr15[126], (short) 858)).append(obj11).append($$c(bArr15[i5422222], bArr15[i45], s5)).toString()};
                                                                            Class<?> cls16 = Class.forName($$c(bArr15[14], bArr15[i15], s5));
                                                                            Class<?>[] clsArr6 = new Class[1];
                                                                            clsArr6[z922222 ? 1 : 0] = String.class;
                                                                            throw ((Throwable) cls16.getDeclaredConstructor(clsArr6).newInstance(objArr8));
                                                                        } catch (Throwable th9) {
                                                                            Throwable cause6 = th9.getCause();
                                                                            if (cause6 == null) {
                                                                                throw th9;
                                                                            }
                                                                            throw cause6;
                                                                        }
                                                                    }
                                                                    i14 = i22;
                                                                    i15 = i24;
                                                                    if (z11) {
                                                                        ?? random = new Random();
                                                                        int i64 = i14 % i14;
                                                                        try {
                                                                            byte[] bArr16 = $$a;
                                                                            cls3 = cls7;
                                                                            try {
                                                                                ?? r35 = -1617552406;
                                                                                try {
                                                                                    random.setSeed(((Long) Class.forName($$c(bArr16[z922222 ? 1 : 0], bArr16[i15], (short) 928)).getMethod($$c(bArr16[i2], bArr16[c], (short) 836), null).invoke(null, null)).longValue() ^ (-1617552406));
                                                                                    Object obj12 = null;
                                                                                    Object obj13 = null;
                                                                                    obj2 = null;
                                                                                    obj3 = null;
                                                                                    String str4 = random;
                                                                                    boolean z13 = z822222;
                                                                                    Object[] objArr9 = r39;
                                                                                    boolean[] zArr10 = zArr2;
                                                                                    byte[] bArr17 = bArr2;
                                                                                    while (obj12 == null) {
                                                                                        Object obj14 = obj12;
                                                                                        int i65 = $11 + 25;
                                                                                        z3 = z13 ? 1 : 0;
                                                                                        $10 = i65 % 128;
                                                                                        if (i65 % 2 != 0) {
                                                                                            Object obj15 = null;
                                                                                            obj15.hashCode();
                                                                                            throw null;
                                                                                        }
                                                                                        if (obj13 == null) {
                                                                                            zArr = zArr722222;
                                                                                            obj9 = obj13;
                                                                                            i16 = i4;
                                                                                            i17 = i3;
                                                                                            r393 = objArr9;
                                                                                            zArr6 = zArr10;
                                                                                        } else if (obj2 == null) {
                                                                                            boolean[] zArr11 = zArr722222;
                                                                                            int i66 = ~((int) System.currentTimeMillis());
                                                                                            int i67 = (-1283983286) + ((321061583 | (~(((-124302408) ^ i66) | ((-124302408) & i66)))) * (-933));
                                                                                            int i68 = ~(i66 | 321061583);
                                                                                            int i69 = i67 + (((i68 ^ (-392935120)) | (i68 & (-392935120))) * 933);
                                                                                            int i70 = (i69 & 1526217128) + (i69 | 1526217128);
                                                                                            obj9 = obj13;
                                                                                            i16 = i4;
                                                                                            int currentTimeMillis3 = (int) System.currentTimeMillis();
                                                                                            int i71 = (1507632205 ^ currentTimeMillis3) | (1507632205 & currentTimeMillis3);
                                                                                            zArr = zArr11;
                                                                                            r392 = 291676384;
                                                                                            r393 = 291676384;
                                                                                            int i72 = -(-((291676384 | (~i71)) * (-668)));
                                                                                            ?? r422 = (((-1369678672) | i72) << 1) - ((-1369678672) ^ i72);
                                                                                            int i73 = ~((291676384 ^ currentTimeMillis3) | (291676384 & currentTimeMillis3));
                                                                                            int i74 = -(-(((1507632205 & i73) | (1507632205 ^ i73)) * 1336));
                                                                                            int i75 = (r422 ^ i74) + ((r422 & i74) << 1) + ((i71 | 291676384) * 668);
                                                                                            zArr5 = r422;
                                                                                            if (i70 <= i75) {
                                                                                                i17 = 5;
                                                                                                zArr6 = r422;
                                                                                            }
                                                                                            i17 = i2;
                                                                                            r393 = r392;
                                                                                            zArr6 = zArr5;
                                                                                        } else {
                                                                                            zArr = zArr722222;
                                                                                            obj9 = obj13;
                                                                                            i16 = i4;
                                                                                            r392 = objArr9;
                                                                                            zArr5 = zArr10;
                                                                                            if (obj3 != null) {
                                                                                                i17 = i45;
                                                                                                r393 = objArr9;
                                                                                                zArr6 = zArr10;
                                                                                            }
                                                                                            i17 = i2;
                                                                                            r393 = r392;
                                                                                            zArr6 = zArr5;
                                                                                        }
                                                                                        try {
                                                                                            StringBuilder sb3 = new StringBuilder((i17 ^ 1) + ((i17 & 1) << 1));
                                                                                            sb3.append('.');
                                                                                            int i76 = z922222 ? 1 : 0;
                                                                                            ?? r2 = str4;
                                                                                            r39 = r393;
                                                                                            boolean[] zArr12 = zArr6;
                                                                                            byte[] bArr18 = bArr17;
                                                                                            while (i76 < i17) {
                                                                                                if (z12) {
                                                                                                    i18 = i17;
                                                                                                    int nextInt = r2.nextInt(i15);
                                                                                                    i7 = i16;
                                                                                                    if (!(!r2.nextBoolean())) {
                                                                                                        int i77 = -(-nextInt);
                                                                                                        i20 = (i77 ^ 65) + ((i77 & 65) << 1);
                                                                                                        i19 = i76;
                                                                                                        r42 = zArr12;
                                                                                                        bArr18 = bArr18;
                                                                                                    } else {
                                                                                                        i19 = i76;
                                                                                                        try {
                                                                                                            int currentTimeMillis4 = (int) System.currentTimeMillis();
                                                                                                            int i78 = 1057 - (~(nextInt * 530));
                                                                                                            int i79 = (i78 ^ 50880) + ((i78 & 50880) << 1);
                                                                                                            ?? r44 = nextInt;
                                                                                                            int i80 = ((~((nextInt ^ 96) | (nextInt & 96))) | (~((~currentTimeMillis4) | nextInt))) * 529;
                                                                                                            int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                                                                                                            int i82 = ~((r44 ^ currentTimeMillis4) | (r44 & currentTimeMillis4));
                                                                                                            int i83 = -(-((((-97) ^ i82) | (i82 & (-97))) * 529));
                                                                                                            i20 = (i81 & i83) + (i83 | i81);
                                                                                                            r42 = i79;
                                                                                                            bArr18 = r44;
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                            z3 = z3;
                                                                                                            r39 = objArr322222;
                                                                                                            str2 = $$c;
                                                                                                            zArr2 = zArr822222;
                                                                                                            zArr3 = zArr922222;
                                                                                                            bArr2 = r1322222;
                                                                                                            i11 = i5522222;
                                                                                                            int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                                                                            int i84 = -(-(i11 * (-69)));
                                                                                                            int i85 = (71 & i84) + (i84 | 71);
                                                                                                            int i86 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                                                            int i87 = ~((i11 ^ currentTimeMillis5) | (i11 & currentTimeMillis5));
                                                                                                            int i88 = -(-(((i86 & i87) | (i86 ^ i87)) * (-140)));
                                                                                                            int i89 = (i85 & i88) + (i88 | i85);
                                                                                                            int i90 = (i11 ^ 1) | (i11 & 1);
                                                                                                            int i91 = (i89 - (~(-(-((~((i90 & currentTimeMillis5) | (i90 ^ currentTimeMillis5))) * 70))))) - 1;
                                                                                                            int i92 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                                                            i9 = i11;
                                                                                                            int i93 = ~i9;
                                                                                                            int i94 = i92 | (~((i93 & 1) | (i93 ^ 1)));
                                                                                                            int i95 = ~((currentTimeMillis5 & 1) | (currentTimeMillis5 ^ 1));
                                                                                                            int i96 = -(-(((i95 & i94) | (i94 ^ i95)) * 70));
                                                                                                            i12 = (i91 & i96) + (i96 | i91);
                                                                                                            i10 = i5422222;
                                                                                                            while (i12 < i10) {
                                                                                                                if (zArr3[i12]) {
                                                                                                                    System.currentTimeMillis();
                                                                                                                    System.currentTimeMillis();
                                                                                                                    i = null;
                                                                                                                    e = null;
                                                                                                                    i22 = 2;
                                                                                                                    z4 = false;
                                                                                                                    i8 = 26;
                                                                                                                    i6 = 1;
                                                                                                                    z3 = z3;
                                                                                                                    r39 = r39;
                                                                                                                    zArr2 = zArr2;
                                                                                                                    bArr2 = bArr2;
                                                                                                                    i4 = i7;
                                                                                                                    i5522222 = i9 + 1;
                                                                                                                    i5422222 = i10;
                                                                                                                    i24 = i8;
                                                                                                                    i23 = i6;
                                                                                                                    cls7 = cls3;
                                                                                                                    z822222 = z3;
                                                                                                                    zArr722222 = zArr;
                                                                                                                    objArr322222 = r39;
                                                                                                                    $$c = str2;
                                                                                                                    zArr822222 = zArr2;
                                                                                                                    r1322222 = bArr2;
                                                                                                                    zArr922222 = zArr3;
                                                                                                                    i3 = 6;
                                                                                                                    z922222 = z4;
                                                                                                                } else {
                                                                                                                    i12++;
                                                                                                                    int i97 = 2 % 2;
                                                                                                                }
                                                                                                            }
                                                                                                            int i98 = $11;
                                                                                                            i13 = (i98 & 57) + (i98 | 57);
                                                                                                            $10 = i13 % 128;
                                                                                                            if (i13 % 2 != 0) {
                                                                                                                byte[] bArr19 = $$a;
                                                                                                                b3 = bArr19[116];
                                                                                                                b4 = bArr19[92];
                                                                                                                b5 = bArr19[1017];
                                                                                                            } else {
                                                                                                                byte[] bArr20 = $$a;
                                                                                                                b3 = bArr20[105];
                                                                                                                b4 = bArr20[126];
                                                                                                                b5 = bArr20[151];
                                                                                                            }
                                                                                                            try {
                                                                                                                Object[] objArr10 = {$$c(b3, b4, b5), th};
                                                                                                                byte[] bArr21 = $$a;
                                                                                                                throw ((Throwable) Class.forName($$c(bArr21[14], bArr21[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr10));
                                                                                                            } catch (Throwable th11) {
                                                                                                                Throwable cause7 = th11.getCause();
                                                                                                                if (cause7 == null) {
                                                                                                                    throw th11;
                                                                                                                }
                                                                                                                throw cause7;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    sb3.append((char) i20);
                                                                                                    obj10 = r2;
                                                                                                } else {
                                                                                                    i18 = i17;
                                                                                                    i7 = i16;
                                                                                                    i19 = i76;
                                                                                                    int nextInt2 = r2.nextInt(12);
                                                                                                    int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                                                    int i99 = nextInt2 * 70;
                                                                                                    int i100 = (i99 & (-557056)) + (i99 | (-557056));
                                                                                                    int i101 = ~nextInt2;
                                                                                                    obj10 = r2;
                                                                                                    int i102 = (i101 ^ (-8193)) | (i101 & (-8193));
                                                                                                    int i103 = ~((i102 & currentTimeMillis6) | (i102 ^ currentTimeMillis6));
                                                                                                    int i104 = (nextInt2 & 8192) | (nextInt2 ^ 8192);
                                                                                                    int i105 = (i103 | (~((i104 & currentTimeMillis6) | (i104 ^ currentTimeMillis6)))) * 69;
                                                                                                    int i106 = (i100 & i105) + (i100 | i105);
                                                                                                    int i107 = ~nextInt2;
                                                                                                    r42 = nextInt2;
                                                                                                    int i108 = ~((i107 ^ 8192) | (i107 & 8192));
                                                                                                    int i109 = ~((i107 ^ currentTimeMillis6) | (i107 & currentTimeMillis6));
                                                                                                    sb3.append((char) (i106 + (((i108 ^ i109) | (i108 & i109) | (~((currentTimeMillis6 ^ 8192) | (currentTimeMillis6 & 8192)))) * (-69)) + ((~((-8193) | (r42 == true ? 1 : 0))) * 69)));
                                                                                                }
                                                                                                i76 = i19 + 1;
                                                                                                i17 = i18;
                                                                                                i16 = i7;
                                                                                                r2 = obj10;
                                                                                                i15 = 26;
                                                                                                r39 = i18;
                                                                                                zArr12 = r42;
                                                                                                bArr18 = bArr18;
                                                                                            }
                                                                                            str2 = r2;
                                                                                            i7 = i16;
                                                                                            String sb4 = sb3.toString();
                                                                                            if (obj9 == null) {
                                                                                                try {
                                                                                                    Object[] objArr11 = new Object[i14];
                                                                                                    objArr11[1] = sb4;
                                                                                                    objArr11[z922222 ? 1 : 0] = obj11;
                                                                                                    byte[] bArr22 = $$a;
                                                                                                    Class<?> cls17 = Class.forName($$c(bArr22[c4], bArr22[26], r1322222));
                                                                                                    Class<?>[] clsArr7 = new Class[2];
                                                                                                    clsArr7[z922222 ? 1 : 0] = Class.forName($$c(bArr22[c4], bArr22[26], r1322222));
                                                                                                    clsArr7[1] = String.class;
                                                                                                    obj13 = cls17.getDeclaredConstructor(clsArr7).newInstance(objArr11);
                                                                                                    objArr2 = objArr322222;
                                                                                                    obj12 = obj14;
                                                                                                    z13 = z3;
                                                                                                    zArr722222 = zArr;
                                                                                                    objArr322222 = objArr2;
                                                                                                    i4 = i7;
                                                                                                    str4 = str2;
                                                                                                    i14 = 2;
                                                                                                    i15 = 26;
                                                                                                    r35 = z3;
                                                                                                    objArr9 = objArr2;
                                                                                                    zArr10 = zArr12;
                                                                                                    bArr17 = bArr18;
                                                                                                } catch (Throwable th12) {
                                                                                                    Throwable cause8 = th12.getCause();
                                                                                                    if (cause8 == null) {
                                                                                                        throw th12;
                                                                                                    }
                                                                                                    throw cause8;
                                                                                                }
                                                                                            } else {
                                                                                                if (obj2 == null) {
                                                                                                    int i110 = $10;
                                                                                                    int i111 = ((i110 | 85) << 1) - (i110 ^ 85);
                                                                                                    $11 = i111 % 128;
                                                                                                    int i112 = i111 % 2;
                                                                                                    try {
                                                                                                        Object[] objArr12 = new Object[2];
                                                                                                        objArr12[1] = sb4;
                                                                                                        objArr12[z922222 ? 1 : 0] = obj11;
                                                                                                        byte[] bArr23 = $$a;
                                                                                                        Class<?> cls18 = Class.forName($$c(bArr23[c4], bArr23[26], r1322222));
                                                                                                        Class<?>[] clsArr8 = new Class[2];
                                                                                                        clsArr8[z922222 ? 1 : 0] = Class.forName($$c(bArr23[c4], bArr23[26], r1322222));
                                                                                                        clsArr8[1] = String.class;
                                                                                                        obj2 = cls18.getDeclaredConstructor(clsArr8).newInstance(objArr12);
                                                                                                        objArr2 = objArr322222;
                                                                                                        obj12 = obj14;
                                                                                                    } catch (Throwable th13) {
                                                                                                        Throwable cause9 = th13.getCause();
                                                                                                        if (cause9 == null) {
                                                                                                            throw th13;
                                                                                                        }
                                                                                                        throw cause9;
                                                                                                    }
                                                                                                } else if (obj3 == null) {
                                                                                                    try {
                                                                                                        Object[] objArr13 = new Object[2];
                                                                                                        objArr13[1] = sb4;
                                                                                                        objArr13[z922222 ? 1 : 0] = obj11;
                                                                                                        byte[] bArr24 = $$a;
                                                                                                        Class<?> cls19 = Class.forName($$c(bArr24[c4], bArr24[26], r1322222));
                                                                                                        Class<?>[] clsArr9 = new Class[2];
                                                                                                        clsArr9[z922222 ? 1 : 0] = Class.forName($$c(bArr24[c4], bArr24[26], r1322222));
                                                                                                        clsArr9[1] = String.class;
                                                                                                        obj3 = cls19.getDeclaredConstructor(clsArr9).newInstance(objArr13);
                                                                                                        objArr2 = objArr322222;
                                                                                                        obj12 = obj14;
                                                                                                    } catch (Throwable th14) {
                                                                                                        Throwable cause10 = th14.getCause();
                                                                                                        if (cause10 == null) {
                                                                                                            throw th14;
                                                                                                        }
                                                                                                        throw cause10;
                                                                                                    }
                                                                                                } else {
                                                                                                    try {
                                                                                                        try {
                                                                                                            Object[] objArr14 = new Object[2];
                                                                                                            objArr14[1] = sb4;
                                                                                                            objArr14[z922222 ? 1 : 0] = obj11;
                                                                                                            byte[] bArr25 = $$a;
                                                                                                            Class<?> cls20 = Class.forName($$c(bArr25[c4], bArr25[26], r1322222));
                                                                                                            Class<?>[] clsArr10 = new Class[2];
                                                                                                            clsArr10[z922222 ? 1 : 0] = Class.forName($$c(bArr25[c4], bArr25[26], r1322222));
                                                                                                            clsArr10[1] = String.class;
                                                                                                            Object newInstance2 = cls20.getDeclaredConstructor(clsArr10).newInstance(objArr14);
                                                                                                            try {
                                                                                                                Object[] objArr15 = {newInstance2};
                                                                                                                short s6 = (short) 820;
                                                                                                                Class<?> cls21 = Class.forName($$c(bArr25[114], bArr25[26], s6));
                                                                                                                Class<?>[] clsArr11 = new Class[1];
                                                                                                                r39 = objArr322222;
                                                                                                                try {
                                                                                                                    clsArr11[z922222 ? 1 : 0] = Class.forName($$c(bArr25[c4], bArr25[26], r1322222));
                                                                                                                    Object newInstance3 = cls21.getDeclaredConstructor(clsArr11).newInstance(objArr15);
                                                                                                                    try {
                                                                                                                        Class<?> cls22 = Class.forName($$c(bArr25[114], bArr25[26], s6));
                                                                                                                        byte b20 = bArr25[16];
                                                                                                                        byte b21 = bArr25[c];
                                                                                                                        cls22.getMethod($$c(b20, b21, (short) ((b21 ^ Ascii.HT) | (b21 & Ascii.HT))), null).invoke(newInstance3, null);
                                                                                                                        obj12 = newInstance2;
                                                                                                                        objArr2 = r39;
                                                                                                                    } catch (Throwable th15) {
                                                                                                                        Throwable cause11 = th15.getCause();
                                                                                                                        if (cause11 == null) {
                                                                                                                            throw th15;
                                                                                                                        }
                                                                                                                        throw cause11;
                                                                                                                    }
                                                                                                                } catch (Throwable th16) {
                                                                                                                    th = th16;
                                                                                                                    Throwable cause12 = th.getCause();
                                                                                                                    if (cause12 == null) {
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    throw cause12;
                                                                                                                }
                                                                                                            } catch (Throwable th17) {
                                                                                                                th = th17;
                                                                                                            }
                                                                                                        } catch (Throwable th18) {
                                                                                                            Throwable cause13 = th18.getCause();
                                                                                                            if (cause13 == null) {
                                                                                                                throw th18;
                                                                                                            }
                                                                                                            throw cause13;
                                                                                                        }
                                                                                                    } catch (Exception e2) {
                                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                                        byte[] bArr26 = $$a;
                                                                                                        short s7 = (short) 854;
                                                                                                        String sb6 = sb5.append($$c(bArr26[16], bArr26[126], (short) 793)).append((Object) 2).append($$c(bArr26[i5422222], bArr26[i45], s7)).toString();
                                                                                                        try {
                                                                                                            Object[] objArr16 = new Object[2];
                                                                                                            objArr16[1] = e2;
                                                                                                            objArr16[z922222 ? 1 : 0] = sb6;
                                                                                                            Class<?> cls23 = Class.forName($$c(bArr26[14], bArr26[26], s7));
                                                                                                            Class<?>[] clsArr12 = new Class[2];
                                                                                                            clsArr12[z922222 ? 1 : 0] = String.class;
                                                                                                            clsArr12[1] = Throwable.class;
                                                                                                            throw ((Throwable) cls23.getDeclaredConstructor(clsArr12).newInstance(objArr16));
                                                                                                        } catch (Throwable th19) {
                                                                                                            Throwable cause14 = th19.getCause();
                                                                                                            if (cause14 == null) {
                                                                                                                throw th19;
                                                                                                            }
                                                                                                            throw cause14;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                obj13 = obj9;
                                                                                                z13 = z3;
                                                                                                zArr722222 = zArr;
                                                                                                objArr322222 = objArr2;
                                                                                                i4 = i7;
                                                                                                str4 = str2;
                                                                                                i14 = 2;
                                                                                                i15 = 26;
                                                                                                r35 = z3;
                                                                                                objArr9 = objArr2;
                                                                                                zArr10 = zArr12;
                                                                                                bArr17 = bArr18;
                                                                                            }
                                                                                        } catch (Throwable th20) {
                                                                                            th = th20;
                                                                                            i7 = i16;
                                                                                            z3 = z3;
                                                                                        }
                                                                                    }
                                                                                    obj4 = obj12;
                                                                                    obj5 = obj13;
                                                                                    z5 = z13;
                                                                                    z3 = r35;
                                                                                    r39 = objArr9;
                                                                                    zArr2 = zArr10;
                                                                                    bArr2 = bArr17;
                                                                                } catch (Throwable th21) {
                                                                                    th = th21;
                                                                                    z3 = z822222 ? 1 : 0;
                                                                                    zArr = zArr722222;
                                                                                    i7 = i4;
                                                                                    r39 = objArr322222;
                                                                                    str2 = $$c;
                                                                                    zArr2 = zArr822222;
                                                                                    zArr3 = zArr922222;
                                                                                    bArr2 = r1322222;
                                                                                    i11 = i5522222;
                                                                                    int currentTimeMillis52 = (int) System.currentTimeMillis();
                                                                                    int i842 = -(-(i11 * (-69)));
                                                                                    int i852 = (71 & i842) + (i842 | 71);
                                                                                    int i862 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                                    int i872 = ~((i11 ^ currentTimeMillis52) | (i11 & currentTimeMillis52));
                                                                                    int i882 = -(-(((i862 & i872) | (i862 ^ i872)) * (-140)));
                                                                                    int i892 = (i852 & i882) + (i882 | i852);
                                                                                    int i902 = (i11 ^ 1) | (i11 & 1);
                                                                                    int i912 = (i892 - (~(-(-((~((i902 & currentTimeMillis52) | (i902 ^ currentTimeMillis52))) * 70))))) - 1;
                                                                                    int i922 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                                    i9 = i11;
                                                                                    int i932 = ~i9;
                                                                                    int i942 = i922 | (~((i932 & 1) | (i932 ^ 1)));
                                                                                    int i952 = ~((currentTimeMillis52 & 1) | (currentTimeMillis52 ^ 1));
                                                                                    int i962 = -(-(((i952 & i942) | (i942 ^ i952)) * 70));
                                                                                    i12 = (i912 & i962) + (i962 | i912);
                                                                                    i10 = i5422222;
                                                                                    while (i12 < i10) {
                                                                                    }
                                                                                    int i982 = $11;
                                                                                    i13 = (i982 & 57) + (i982 | 57);
                                                                                    $10 = i13 % 128;
                                                                                    if (i13 % 2 != 0) {
                                                                                    }
                                                                                    Object[] objArr102 = {$$c(b3, b4, b5), th};
                                                                                    byte[] bArr212 = $$a;
                                                                                    throw ((Throwable) Class.forName($$c(bArr212[14], bArr212[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr102));
                                                                                }
                                                                            } catch (Throwable th22) {
                                                                                th = th22;
                                                                                boolean z14 = z822222 ? 1 : 0;
                                                                                Throwable cause15 = th.getCause();
                                                                                if (cause15 == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause15;
                                                                            }
                                                                        } catch (Throwable th23) {
                                                                            th = th23;
                                                                        }
                                                                    } else {
                                                                        cls3 = cls7;
                                                                        obj2 = null;
                                                                        obj3 = null;
                                                                        obj4 = null;
                                                                        obj5 = null;
                                                                        z5 = z822222;
                                                                        z3 = z3;
                                                                        r39 = r39;
                                                                        zArr2 = zArr2;
                                                                        bArr2 = bArr2;
                                                                    }
                                                                    try {
                                                                        z3 = z5;
                                                                        zArr = zArr722222;
                                                                        i7 = i4;
                                                                        r39 = objArr322222;
                                                                        byte[] bArr27 = $$a;
                                                                        String $$c5 = $$c(bArr27[426], bArr27[694], (short) 789);
                                                                        try {
                                                                            String $$c6 = $$c(bArr27[c3], bArr27[i2], (short) 741);
                                                                            Class[] clsArr13 = new Class[1];
                                                                            clsArr13[z922222 ? 1 : 0] = String.class;
                                                                            Object invoke5 = Class.class.getMethod($$c6, clsArr13).invoke(AFa1hSDK.class, $$c5);
                                                                            try {
                                                                                Class<?> cls24 = Class.forName($$c(bArr27[c4], bArr27[26], (short) 731));
                                                                                byte b22 = bArr27[56];
                                                                                byte b23 = bArr27[i2];
                                                                                String str5 = (String) cls24.getMethod($$c(b22, b23, (short) ((b23 ^ 704) | (b23 & 704))), null).invoke(invoke5, null);
                                                                                StringBuilder sb7 = new StringBuilder();
                                                                                byte b24 = bArr27[i5422222];
                                                                                short s8 = (short) 714;
                                                                                try {
                                                                                    ZipFile zipFile = new ZipFile(str5.substring(5, str5.lastIndexOf(sb7.append($$c(b24, (byte) ((b24 ^ 86) | (b24 & 86)), s8)).append($$c5).toString())));
                                                                                    try {
                                                                                        bArr3 = new byte[7308];
                                                                                        InputStream inputStream = zipFile.getInputStream(zipFile.getEntry($$c5.substring(1)));
                                                                                        int i113 = $10 + 33;
                                                                                        $11 = i113 % 128;
                                                                                        int i114 = i113 % 2;
                                                                                        try {
                                                                                            objArr = new Object[]{inputStream};
                                                                                            cls4 = Class.forName($$c(bArr27[776], bArr27[26], s8));
                                                                                            clsArr = new Class[1];
                                                                                            str2 = $$c;
                                                                                            s = (short) 688;
                                                                                            try {
                                                                                                clsArr[z922222 ? 1 : 0] = Class.forName($$c(bArr27[14], bArr27[26], s));
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
                                                                                        th = th26;
                                                                                        str2 = $$c;
                                                                                        zArr4 = zArr822222;
                                                                                    }
                                                                                    try {
                                                                                        Object[] objArr17 = {cls4.getDeclaredConstructor(clsArr).newInstance(objArr)};
                                                                                        short s9 = (short) 670;
                                                                                        Class<?> cls25 = Class.forName($$c(bArr27[105], bArr27[26], s9));
                                                                                        Class<?>[] clsArr14 = new Class[1];
                                                                                        zArr2 = zArr822222;
                                                                                        try {
                                                                                            clsArr14[z922222 ? 1 : 0] = Class.forName($$c(bArr27[14], bArr27[26], s));
                                                                                            Object newInstance4 = cls25.getDeclaredConstructor(clsArr14).newInstance(objArr17);
                                                                                            int i115 = $11 + 9;
                                                                                            $10 = i115 % 128;
                                                                                            int i116 = i115 % 2;
                                                                                            try {
                                                                                                Object[] objArr18 = {bArr3};
                                                                                                ?? cls26 = Class.forName($$c(bArr27[105], bArr27[26], s9));
                                                                                                try {
                                                                                                    String $$c7 = $$c(bArr27[49], bArr27[46], (short) 648);
                                                                                                    Class[] clsArr15 = new Class[1];
                                                                                                    clsArr15[z922222 ? 1 : 0] = cls3;
                                                                                                    cls26.getMethod($$c7, clsArr15).invoke(newInstance4, objArr18);
                                                                                                    try {
                                                                                                        Class<?> cls27 = Class.forName($$c(bArr27[105], bArr27[26], s9));
                                                                                                        byte b25 = bArr27[16];
                                                                                                        byte b26 = bArr27[c];
                                                                                                        cls27.getMethod($$c(b25, b26, (short) ((b26 ^ Ascii.HT) | (b26 & Ascii.HT))), null).invoke(newInstance4, null);
                                                                                                        int i117 = 20;
                                                                                                        int i118 = 7258;
                                                                                                        Object obj16 = obj2;
                                                                                                        byte[] bArr28 = bArr3;
                                                                                                        String str6 = str2;
                                                                                                        Class cls28 = null;
                                                                                                        ?? r22 = z922222;
                                                                                                        while (true) {
                                                                                                            long j = 1;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        Object obj17 = obj16;
                                                                                                                        int i119 = r22;
                                                                                                                        for (int length = bArr28.length; i119 < length; length = length) {
                                                                                                                            try {
                                                                                                                                j = ((bArr28[r43] + (j << i3)) + (j << 16)) - j;
                                                                                                                                int i120 = i119 + 52;
                                                                                                                                i119 = ((i120 & (-51)) << 1) + (i120 ^ (-51));
                                                                                                                            } catch (Throwable th27) {
                                                                                                                                th = th27;
                                                                                                                                zArr3 = zArr922222;
                                                                                                                                bArr2 = r1322222;
                                                                                                                                i11 = i5522222;
                                                                                                                                zArr2 = zArr2;
                                                                                                                                zipFile.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        bArr28[i117 + 86] = (byte) (bArr28[i117 + 7287] - 98);
                                                                                                                        int length2 = bArr28.length;
                                                                                                                        int i121 = -i117;
                                                                                                                        int i122 = i117;
                                                                                                                        byte[] bArr29 = bArr28;
                                                                                                                        int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                                                                        int i123 = i121 * (-167);
                                                                                                                        int i124 = length2 * (-167);
                                                                                                                        int i125 = ((i123 | i124) << 1) - (i123 ^ i124);
                                                                                                                        int i126 = ~i121;
                                                                                                                        int i127 = ~length2;
                                                                                                                        int i128 = ~((i126 ^ i127) | (i126 & i127));
                                                                                                                        int i129 = ~((i127 ^ currentTimeMillis7) | (i127 & currentTimeMillis7));
                                                                                                                        int i130 = ((i128 ^ i129) | (i128 & i129)) * 336;
                                                                                                                        int i131 = (i125 & i130) + (i125 | i130);
                                                                                                                        int i132 = ~(i121 | length2);
                                                                                                                        int i133 = ~(i121 | currentTimeMillis7);
                                                                                                                        int i134 = -(-(((i132 ^ i133) | (i132 & i133)) * (-168)));
                                                                                                                        int i135 = (i131 & i134) + (i131 | i134);
                                                                                                                        int i136 = ~length2;
                                                                                                                        int i137 = ~((~currentTimeMillis7) | i121);
                                                                                                                        int i138 = ((i137 & i136) | (i136 ^ i137)) * 168;
                                                                                                                        try {
                                                                                                                            Object[] objArr19 = new Object[i45];
                                                                                                                            try {
                                                                                                                                objArr19[2] = Integer.valueOf((i135 & i138) + (i135 | i138));
                                                                                                                                objArr19[1] = Integer.valueOf(i122);
                                                                                                                                objArr19[r22] = bArr29;
                                                                                                                                bArr2 = $$a;
                                                                                                                                ?? cls29 = Class.forName($$c(r1[228], r1[26], (short) 640));
                                                                                                                                try {
                                                                                                                                    Class[] clsArr16 = new Class[3];
                                                                                                                                    clsArr16[r22] = cls3;
                                                                                                                                    clsArr16[1] = Integer.TYPE;
                                                                                                                                    clsArr16[2] = Integer.TYPE;
                                                                                                                                    Object newInstance5 = cls29.getDeclaredConstructor(clsArr16).newInstance(objArr19);
                                                                                                                                    try {
                                                                                                                                        Object obj18 = i;
                                                                                                                                        if (obj18 == null) {
                                                                                                                                            try {
                                                                                                                                                force = j;
                                                                                                                                                int uptimeMillis = (int) (((SystemClock.uptimeMillis() >> 48) + 3427844526219725668L) ^ j);
                                                                                                                                                int globalActionKeyTimeout = (int) (force ^ ((-3427844525716548099L) - (ViewConfiguration.getGlobalActionKeyTimeout() >> 32)));
                                                                                                                                                int[] iArr = new int[(int) (force ^ ((SystemClock.currentThreadTimeMillis() >> 48) - 3427844525716548102L))];
                                                                                                                                                int currentThreadTimeMillis = (int) (force ^ ((-3427844525716548104L) - (SystemClock.currentThreadTimeMillis() >> 48)));
                                                                                                                                                long j2 = v;
                                                                                                                                                int i139 = r22;
                                                                                                                                                int i140 = -View.getDefaultSize(i139, i139);
                                                                                                                                                int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                                                                                                int i141 = ~i140;
                                                                                                                                                int i142 = ~((i141 ^ (-33)) | (i141 & (-33)) | currentTimeMillis8);
                                                                                                                                                int i143 = (~currentTimeMillis8) | i140;
                                                                                                                                                int i144 = ~((i143 ^ 32) | (i143 & 32));
                                                                                                                                                int i145 = ~(((-33) ^ i140) | ((-33) & i140));
                                                                                                                                                int i146 = ~(i140 | currentTimeMillis8);
                                                                                                                                                int i147 = (i140 * (-317)) + 10208 + (((i142 ^ i144) | (i142 & i144)) * (-318)) + (((i145 ^ i146) | (i145 & i146)) * (-318));
                                                                                                                                                int i148 = ~i140;
                                                                                                                                                int i149 = ~((i148 & currentTimeMillis8) | (i148 ^ currentTimeMillis8));
                                                                                                                                                int i150 = -(-((((-33) ^ i149) | (i149 & (-33))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                                                                                                                                int i151 = (int) (j2 >>> ((byte) ((i147 & i150) + (i150 | i147))));
                                                                                                                                                iArr[currentThreadTimeMillis] = (i151 | uptimeMillis) & (~(i151 & uptimeMillis));
                                                                                                                                                int elapsedRealtimeNanos = (int) (force ^ ((SystemClock.elapsedRealtimeNanos() >> 60) - 3427844525716548103L));
                                                                                                                                                int i152 = (int) v;
                                                                                                                                                iArr[elapsedRealtimeNanos] = (uptimeMillis & (~i152)) | ((~uptimeMillis) & i152);
                                                                                                                                                int i153 = afWarnLog;
                                                                                                                                                byte[] bArr30 = afErrorLogForExcManagerOnly;
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr20 = new Object[i3];
                                                                                                                                                    try {
                                                                                                                                                        objArr20[5] = Integer.valueOf(afVerboseLog);
                                                                                                                                                        objArr20[i2] = Integer.valueOf(globalActionKeyTimeout);
                                                                                                                                                        objArr20[3] = bArr30;
                                                                                                                                                        objArr20[2] = Integer.valueOf(i153);
                                                                                                                                                        objArr20[1] = iArr;
                                                                                                                                                        objArr20[0] = newInstance5;
                                                                                                                                                        ?? cls30 = Class.forName($$c(bArr2[74], bArr2[c], (short) 613));
                                                                                                                                                        Class[] clsArr17 = new Class[6];
                                                                                                                                                        clsArr17[0] = Class.forName($$c(bArr2[14], bArr2[26], (short) 688));
                                                                                                                                                        clsArr17[1] = int[].class;
                                                                                                                                                        clsArr17[2] = Integer.TYPE;
                                                                                                                                                        i45 = 3;
                                                                                                                                                        clsArr17[3] = cls3;
                                                                                                                                                        clsArr17[i2] = Integer.TYPE;
                                                                                                                                                        clsArr17[5] = Integer.TYPE;
                                                                                                                                                        newInstance = cls30.getDeclaredConstructor(clsArr17).newInstance(objArr20);
                                                                                                                                                        obj6 = obj3;
                                                                                                                                                        zArr3 = zArr922222;
                                                                                                                                                    } catch (Throwable th28) {
                                                                                                                                                        th = th28;
                                                                                                                                                        try {
                                                                                                                                                            Throwable cause17 = th.getCause();
                                                                                                                                                            if (cause17 == null) {
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                            throw cause17;
                                                                                                                                                        } catch (Throwable th29) {
                                                                                                                                                            th = th29;
                                                                                                                                                            th = th;
                                                                                                                                                            zArr3 = zArr922222;
                                                                                                                                                            bArr5 = r1322222;
                                                                                                                                                            i11 = i5522222;
                                                                                                                                                            i45 = 3;
                                                                                                                                                            zArr2 = zArr2;
                                                                                                                                                            bArr2 = bArr5;
                                                                                                                                                            zipFile.close();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th30) {
                                                                                                                                                    th = th30;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th31) {
                                                                                                                                                th = th31;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            try {
                                                                                                                                                afDebugLog = j;
                                                                                                                                                int zoomControlsTimeout = (int) (j ^ (8727893706528661794L - (ViewConfiguration.getZoomControlsTimeout() >> 32)));
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr21 = new Object[3];
                                                                                                                                                    try {
                                                                                                                                                        objArr21[2] = Short.valueOf((short) (afDebugLog ^ ((-8727893705603485974L) - (SystemClock.currentThreadTimeMillis() >> 48))));
                                                                                                                                                        objArr21[1] = Integer.valueOf(zoomControlsTimeout);
                                                                                                                                                        objArr21[0] = newInstance5;
                                                                                                                                                        Class<?> cls31 = Class.forName($$c(bArr2[511], bArr2[c], (short) 583), true, (ClassLoader) e);
                                                                                                                                                        String $$c8 = $$c(bArr2[12], bArr2[85], (short) 551);
                                                                                                                                                        Class<?>[] clsArr18 = new Class[3];
                                                                                                                                                        obj6 = obj3;
                                                                                                                                                        zArr3 = zArr922222;
                                                                                                                                                        try {
                                                                                                                                                            clsArr18[0] = Class.forName($$c(bArr2[14], bArr2[26], (short) 688));
                                                                                                                                                            clsArr18[1] = Integer.TYPE;
                                                                                                                                                            clsArr18[2] = Short.TYPE;
                                                                                                                                                            newInstance = cls31.getMethod($$c8, clsArr18).invoke(obj18, objArr21);
                                                                                                                                                        } catch (Throwable th32) {
                                                                                                                                                            th = th32;
                                                                                                                                                            Throwable cause18 = th.getCause();
                                                                                                                                                            if (cause18 == null) {
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                            throw cause18;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th33) {
                                                                                                                                                        th = th33;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th34) {
                                                                                                                                                    th = th34;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th35) {
                                                                                                                                                th = th35;
                                                                                                                                                zArr3 = zArr922222;
                                                                                                                                                bArr4 = r1322222;
                                                                                                                                                i11 = i5522222;
                                                                                                                                                i45 = 3;
                                                                                                                                                bArr2 = bArr4;
                                                                                                                                                th = th;
                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                zipFile.close();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            short s10 = (short) 688;
                                                                                                                                            Class.forName($$c(bArr2[14], bArr2[26], s10)).getMethod($$c(bArr2[55], bArr2[16], (short) 537), Long.TYPE).invoke(newInstance, 22);
                                                                                                                                            if (!(!z11)) {
                                                                                                                                                try {
                                                                                                                                                    Object obj19 = i;
                                                                                                                                                    if (obj19 == null) {
                                                                                                                                                        int i154 = $10;
                                                                                                                                                        int i155 = ((i154 | 125) << 1) - (i154 ^ 125);
                                                                                                                                                        $11 = i155 % 128;
                                                                                                                                                        int i156 = i155 % 2;
                                                                                                                                                        obj7 = obj5;
                                                                                                                                                    } else {
                                                                                                                                                        obj7 = obj17;
                                                                                                                                                    }
                                                                                                                                                    if (obj19 == null) {
                                                                                                                                                        int i157 = $10;
                                                                                                                                                        int i158 = (i157 ^ 85) + ((i157 & 85) << 1);
                                                                                                                                                        $11 = i158 % 128;
                                                                                                                                                        if (i158 % 2 == 0) {
                                                                                                                                                            try {
                                                                                                                                                                int i159 = 87 / 0;
                                                                                                                                                            } catch (Throwable th36) {
                                                                                                                                                                th = th36;
                                                                                                                                                                bArr5 = r1322222;
                                                                                                                                                                i11 = i5522222;
                                                                                                                                                                i45 = 3;
                                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                                bArr2 = bArr5;
                                                                                                                                                                zipFile.close();
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        obj8 = obj6;
                                                                                                                                                    } else {
                                                                                                                                                        obj8 = obj4;
                                                                                                                                                    }
                                                                                                                                                    c5 = 18;
                                                                                                                                                    Method method6 = Class.forName($$c(bArr2[14], bArr2[26], s10)).getMethod($$c(bArr2[55], bArr2[46], (short) 534), cls3, Integer.TYPE, Integer.TYPE);
                                                                                                                                                    ?? cls32 = Class.forName($$c(bArr2[114], bArr2[26], (short) 820));
                                                                                                                                                    try {
                                                                                                                                                        Class[] clsArr19 = new Class[1];
                                                                                                                                                        i11 = i5522222;
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                clsArr19[0] = Class.forName($$c(bArr2[c4], bArr2[26], r1322222));
                                                                                                                                                                Object newInstance6 = cls32.getConstructor(clsArr19).newInstance(obj7);
                                                                                                                                                                if (z3) {
                                                                                                                                                                    int i160 = $10;
                                                                                                                                                                    int i161 = (i160 & 123) + (i160 | 123);
                                                                                                                                                                    $11 = i161 % 128;
                                                                                                                                                                    int i162 = i161 % 2;
                                                                                                                                                                    try {
                                                                                                                                                                        z6 = z11;
                                                                                                                                                                        cls5 = cls28;
                                                                                                                                                                        ((Boolean) Class.forName($$c(bArr2[c4], bArr2[26], r1322222)).getMethod($$c(bArr2[c3], bArr2[16], (short) 531), null).invoke(obj7, null)).booleanValue();
                                                                                                                                                                    } catch (Throwable th37) {
                                                                                                                                                                        Throwable cause19 = th37.getCause();
                                                                                                                                                                        if (cause19 == null) {
                                                                                                                                                                            throw th37;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause19;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    cls5 = cls28;
                                                                                                                                                                    z6 = z11;
                                                                                                                                                                }
                                                                                                                                                                byte[] bArr31 = new byte[1024];
                                                                                                                                                                byte b27 = bArr2[16];
                                                                                                                                                                byte b28 = bArr2[i5422222];
                                                                                                                                                                Method method7 = cls32.getMethod($$c(b27, b28, (short) ((b28 ^ Ascii.ENQ) | (b28 & Ascii.ENQ))), cls3, Integer.TYPE, Integer.TYPE);
                                                                                                                                                                while (i118 > 0) {
                                                                                                                                                                    int intValue2 = ((Integer) method6.invoke(newInstance, bArr31, 0, Integer.valueOf(Math.min(1024, i118)))).intValue();
                                                                                                                                                                    if (intValue2 == -1) {
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    Object obj20 = newInstance;
                                                                                                                                                                    method7.invoke(newInstance6, bArr31, 0, Integer.valueOf(intValue2));
                                                                                                                                                                    int i163 = -intValue2;
                                                                                                                                                                    int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                                                                                                    Method method8 = method7;
                                                                                                                                                                    int i164 = ~i163;
                                                                                                                                                                    int i165 = ~i118;
                                                                                                                                                                    int i166 = (i163 * (-209)) + (i118 * (-209)) + ((~((i164 ^ i165) | (i164 & i165))) * 210);
                                                                                                                                                                    int i167 = ~i118;
                                                                                                                                                                    int i168 = ~currentTimeMillis9;
                                                                                                                                                                    int i169 = ~((i167 ^ i168) | (i167 & i168));
                                                                                                                                                                    int i170 = ~((~i163) | currentTimeMillis9);
                                                                                                                                                                    int i171 = -(-(((i169 ^ i170) | (i169 & i170)) * 210));
                                                                                                                                                                    int i172 = (i166 & i171) + (i171 | i166);
                                                                                                                                                                    int i173 = ~currentTimeMillis9;
                                                                                                                                                                    int i174 = ~(i118 | (i164 & i173) | (i164 ^ i173));
                                                                                                                                                                    int i175 = ~((i165 & i163) | (i165 ^ i163) | currentTimeMillis9);
                                                                                                                                                                    int i176 = ((i174 & i175) | (i174 ^ i175)) * 210;
                                                                                                                                                                    i118 = (i172 | i176) + (i172 & i176);
                                                                                                                                                                    method7 = method8;
                                                                                                                                                                    newInstance = obj20;
                                                                                                                                                                }
                                                                                                                                                                byte[] bArr32 = $$a;
                                                                                                                                                                Object invoke6 = cls32.getMethod($$c(bArr32[16], bArr32[i2], (short) InputDeviceCompat.SOURCE_DPAD), new Class[0]).invoke(newInstance6, new Object[0]);
                                                                                                                                                                byte b29 = bArr32[72];
                                                                                                                                                                byte b30 = bArr32[26];
                                                                                                                                                                Class.forName($$c(b29, b30, (short) ((b30 ^ 496) | (b30 & 496)))).getMethod($$c(bArr32[55], bArr32[16], (short) 488), new Class[0]).invoke(invoke6, new Object[0]);
                                                                                                                                                                byte b31 = bArr32[16];
                                                                                                                                                                byte b32 = bArr32[c];
                                                                                                                                                                cls32.getMethod($$c(b31, b32, (short) ((b32 ^ Ascii.HT) | (b32 & Ascii.HT))), new Class[0]).invoke(newInstance6, new Object[0]);
                                                                                                                                                                Method declaredMethod = Class.forName($$c(bArr32[c], bArr32[18], (short) 485)).getDeclaredMethod($$c(bArr32[56], bArr32[c4], (short) 465), String.class, String.class, Integer.TYPE);
                                                                                                                                                                try {
                                                                                                                                                                    short s11 = (short) 459;
                                                                                                                                                                    Object invoke7 = Class.forName($$c(bArr32[c4], bArr32[26], r1322222)).getMethod($$c(bArr32[12], bArr32[i2], s11), null).invoke(obj7, null);
                                                                                                                                                                    int i177 = $11 + 73;
                                                                                                                                                                    $10 = i177 % 128;
                                                                                                                                                                    int i178 = i177 % 2;
                                                                                                                                                                    try {
                                                                                                                                                                        invoke4 = declaredMethod.invoke(null, invoke7, Class.forName($$c(bArr32[c4], bArr32[26], r1322222)).getMethod($$c(bArr32[12], bArr32[i2], s11), null).invoke(obj8, null), 0);
                                                                                                                                                                        int i179 = 2 % 2;
                                                                                                                                                                        try {
                                                                                                                                                                            short s12 = (short) 445;
                                                                                                                                                                            ((Boolean) Class.forName($$c(bArr32[c4], bArr32[26], r1322222)).getMethod($$c(bArr32[46], bArr32[18], s12), null).invoke(obj7, null)).booleanValue();
                                                                                                                                                                            try {
                                                                                                                                                                                ((Boolean) Class.forName($$c(bArr32[c4], bArr32[26], r1322222)).getMethod($$c(bArr32[46], bArr32[18], s12), null).invoke(obj8, null)).booleanValue();
                                                                                                                                                                                if (e == null) {
                                                                                                                                                                                    int i180 = $10 + 105;
                                                                                                                                                                                    $11 = i180 % 128;
                                                                                                                                                                                    if (i180 % 2 == 0) {
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            byte b33 = bArr32[26];
                                                                                                                                                                                            byte b34 = bArr32[i2];
                                                                                                                                                                                            e = Class.class.getMethod($$c(b33, b34, (short) ((b34 ^ 424) | (b34 & 424))), null).invoke(AFa1hSDK.class, null);
                                                                                                                                                                                        } catch (Throwable th38) {
                                                                                                                                                                                            Throwable cause20 = th38.getCause();
                                                                                                                                                                                            if (cause20 == null) {
                                                                                                                                                                                                throw th38;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw cause20;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th39) {
                                                                                                                                                                                        th = th39;
                                                                                                                                                                                        th = th;
                                                                                                                                                                                        bArr5 = r1322222;
                                                                                                                                                                                        i45 = 3;
                                                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                                                        bArr2 = bArr5;
                                                                                                                                                                                        zipFile.close();
                                                                                                                                                                                        throw th;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                s2 = s8;
                                                                                                                                                                                s3 = s10;
                                                                                                                                                                                bArr2 = r1322222;
                                                                                                                                                                                str3 = str6;
                                                                                                                                                                            } catch (Throwable th40) {
                                                                                                                                                                                Throwable cause21 = th40.getCause();
                                                                                                                                                                                if (cause21 == null) {
                                                                                                                                                                                    throw th40;
                                                                                                                                                                                }
                                                                                                                                                                                throw cause21;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th41) {
                                                                                                                                                                            Throwable cause22 = th41.getCause();
                                                                                                                                                                            if (cause22 == null) {
                                                                                                                                                                                throw th41;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause22;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th42) {
                                                                                                                                                                        Throwable cause23 = th42.getCause();
                                                                                                                                                                        if (cause23 == null) {
                                                                                                                                                                            throw th42;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause23;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th43) {
                                                                                                                                                                    Throwable cause24 = th43.getCause();
                                                                                                                                                                    if (cause24 == null) {
                                                                                                                                                                        throw th43;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause24;
                                                                                                                                                                }
                                                                                                                                                            } catch (Exception e3) {
                                                                                                                                                                e = e3;
                                                                                                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                                                                                                byte[] bArr33 = $$a;
                                                                                                                                                                short s13 = (short) 854;
                                                                                                                                                                try {
                                                                                                                                                                    throw ((Throwable) Class.forName($$c(bArr33[14], bArr33[26], s13)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb8.append($$c(bArr33[16], bArr33[126], (short) 521)).append(obj7).append($$c(bArr33[i5422222], bArr33[3], s13)).toString(), e));
                                                                                                                                                                } catch (Throwable th44) {
                                                                                                                                                                    Throwable cause25 = th44.getCause();
                                                                                                                                                                    if (cause25 == null) {
                                                                                                                                                                        throw th44;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause25;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th45) {
                                                                                                                                                            th = th45;
                                                                                                                                                            try {
                                                                                                                                                                byte[] bArr34 = $$a;
                                                                                                                                                                short s14 = (short) 445;
                                                                                                                                                                ((Boolean) Class.forName($$c(bArr34[c4], bArr34[26], r1322222)).getMethod($$c(bArr34[46], bArr34[18], s14), null).invoke(obj7, null)).booleanValue();
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) Class.forName($$c(bArr34[c4], bArr34[26], r1322222)).getMethod($$c(bArr34[46], bArr34[18], s14), null).invoke(obj8, null)).booleanValue();
                                                                                                                                                                    throw th;
                                                                                                                                                                } catch (Throwable th46) {
                                                                                                                                                                    Throwable cause26 = th46.getCause();
                                                                                                                                                                    if (cause26 == null) {
                                                                                                                                                                        throw th46;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause26;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th47) {
                                                                                                                                                                Throwable cause27 = th47.getCause();
                                                                                                                                                                if (cause27 == null) {
                                                                                                                                                                    throw th47;
                                                                                                                                                                }
                                                                                                                                                                throw cause27;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Exception e4) {
                                                                                                                                                        e = e4;
                                                                                                                                                        i11 = i5522222;
                                                                                                                                                    } catch (Throwable th48) {
                                                                                                                                                        th = th48;
                                                                                                                                                        i11 = i5522222;
                                                                                                                                                        byte[] bArr342 = $$a;
                                                                                                                                                        short s142 = (short) 445;
                                                                                                                                                        ((Boolean) Class.forName($$c(bArr342[c4], bArr342[26], r1322222)).getMethod($$c(bArr342[46], bArr342[18], s142), null).invoke(obj7, null)).booleanValue();
                                                                                                                                                        ((Boolean) Class.forName($$c(bArr342[c4], bArr342[26], r1322222)).getMethod($$c(bArr342[46], bArr342[18], s142), null).invoke(obj8, null)).booleanValue();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th49) {
                                                                                                                                                    th = th49;
                                                                                                                                                    i11 = i5522222;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                Object obj21 = newInstance;
                                                                                                                                                cls5 = cls28;
                                                                                                                                                i11 = i5522222;
                                                                                                                                                z6 = z11;
                                                                                                                                                c5 = 18;
                                                                                                                                                try {
                                                                                                                                                    ?? cls33 = Class.forName($$c(bArr2[228], bArr2[26], (short) 427));
                                                                                                                                                    ?? cls34 = Class.forName($$c(bArr2[14], bArr2[26], s10));
                                                                                                                                                    Object newInstance7 = cls33.getConstructor(new Class[]{cls34}).newInstance(obj21);
                                                                                                                                                    byte b35 = bArr2[c4];
                                                                                                                                                    byte b36 = bArr2[i2];
                                                                                                                                                    Object invoke8 = cls33.getMethod($$c(b35, b36, (short) ((b36 ^ 384) | (b36 & 384))), new Class[0]).invoke(newInstance7, new Object[0]);
                                                                                                                                                    Class<?> cls35 = Class.forName($$c(bArr2[72], bArr2[26], (short) 389));
                                                                                                                                                    byte b37 = bArr2[56];
                                                                                                                                                    byte b38 = bArr2[i2];
                                                                                                                                                    Method method9 = cls35.getMethod($$c(b37, b38, (short) (b38 | 352)), new Class[0]);
                                                                                                                                                    try {
                                                                                                                                                        Method method10 = cls34.getMethod($$c(bArr2[55], bArr2[46], (short) 534), cls3);
                                                                                                                                                        try {
                                                                                                                                                            Object newInstance8 = Class.forName($$c(bArr2[776], bArr2[26], s8)).getDeclaredConstructor(Class.forName($$c(bArr2[14], bArr2[26], s10))).newInstance(newInstance7);
                                                                                                                                                            try {
                                                                                                                                                                byte b39 = bArr2[26];
                                                                                                                                                                byte b40 = bArr2[i2];
                                                                                                                                                                Object invoke9 = Class.class.getMethod($$c(b39, b40, (short) ((b40 ^ 424) | (b40 & 424))), null).invoke(AFa1hSDK.class, null);
                                                                                                                                                                ?? cls36 = Class.forName($$c((byte) (-bArr2[587]), bArr2[26], (short) 362));
                                                                                                                                                                Object newInstance9 = cls36.getConstructor(new Class[0]).newInstance(new Object[0]);
                                                                                                                                                                byte b41 = bArr2[16];
                                                                                                                                                                byte b42 = bArr2[i5422222];
                                                                                                                                                                String $$c9 = $$c(b41, b42, (short) ((b42 ^ Ascii.ENQ) | (b42 & Ascii.ENQ)));
                                                                                                                                                                try {
                                                                                                                                                                    Class[] clsArr20 = new Class[3];
                                                                                                                                                                    clsArr20[0] = cls3;
                                                                                                                                                                    clsArr20[1] = Integer.TYPE;
                                                                                                                                                                    clsArr20[2] = Integer.TYPE;
                                                                                                                                                                    Method method11 = cls36.getMethod($$c9, clsArr20);
                                                                                                                                                                    Method method12 = cls36.getMethod($$c(bArr2[c3], bArr2[55], (short) 334), new Class[0]);
                                                                                                                                                                    Class<?> cls37 = Class.forName($$c(bArr2[i2], bArr2[26], (short) 324));
                                                                                                                                                                    byte b43 = bArr2[16];
                                                                                                                                                                    byte b44 = bArr2[c];
                                                                                                                                                                    bArr2 = r1322222;
                                                                                                                                                                    try {
                                                                                                                                                                        Method method13 = cls37.getMethod($$c(b43, b44, (short) (b44 | Ascii.HT)), new Class[0]);
                                                                                                                                                                        byte[] bArr35 = new byte[1024];
                                                                                                                                                                        int i181 = 0;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            int intValue3 = ((Integer) method10.invoke(newInstance8, bArr35)).intValue();
                                                                                                                                                                            if (intValue3 <= 0) {
                                                                                                                                                                                s2 = s8;
                                                                                                                                                                                s3 = s10;
                                                                                                                                                                                str3 = str6;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            Method method14 = method10;
                                                                                                                                                                            int i182 = $10 + 17;
                                                                                                                                                                            s3 = s10;
                                                                                                                                                                            $11 = i182 % 128;
                                                                                                                                                                            if (i182 % 2 == 0) {
                                                                                                                                                                                str3 = str6;
                                                                                                                                                                                s2 = s8;
                                                                                                                                                                                if (i181 >= ((Long) method9.invoke(invoke8, new Object[1])).longValue()) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                int i183 = $11 + 91;
                                                                                                                                                                                $10 = i183 % 128;
                                                                                                                                                                                int i184 = i183 % 2;
                                                                                                                                                                                method11.invoke(newInstance9, bArr35, 0, Integer.valueOf(intValue3));
                                                                                                                                                                                int i185 = -(-intValue3);
                                                                                                                                                                                i181 = ((i181 | i185) << 1) - (i185 ^ i181);
                                                                                                                                                                                str6 = str3;
                                                                                                                                                                                s10 = s3;
                                                                                                                                                                                method10 = method14;
                                                                                                                                                                                s8 = s2;
                                                                                                                                                                            } else {
                                                                                                                                                                                str3 = str6;
                                                                                                                                                                                s2 = s8;
                                                                                                                                                                                if (i181 >= ((Long) method9.invoke(invoke8, new Object[0])).longValue()) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                int i1832 = $11 + 91;
                                                                                                                                                                                $10 = i1832 % 128;
                                                                                                                                                                                int i1842 = i1832 % 2;
                                                                                                                                                                                method11.invoke(newInstance9, bArr35, 0, Integer.valueOf(intValue3));
                                                                                                                                                                                int i1852 = -(-intValue3);
                                                                                                                                                                                i181 = ((i181 | i1852) << 1) - (i1852 ^ i181);
                                                                                                                                                                                str6 = str3;
                                                                                                                                                                                s10 = s3;
                                                                                                                                                                                method10 = method14;
                                                                                                                                                                                s8 = s2;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        byte[] bArr36 = (byte[]) method12.invoke(newInstance9, new Object[0]);
                                                                                                                                                                        try {
                                                                                                                                                                            method13.invoke(newInstance8, new Object[0]);
                                                                                                                                                                            method13.invoke(newInstance9, new Object[0]);
                                                                                                                                                                        } catch (Exception unused9) {
                                                                                                                                                                        }
                                                                                                                                                                        byte[] bArr37 = $$a;
                                                                                                                                                                        Class<?> cls38 = Class.forName($$c((byte) (-bArr37[775]), bArr37[18], (short) 308));
                                                                                                                                                                        short s15 = (short) 273;
                                                                                                                                                                        byte b45 = bArr37[c];
                                                                                                                                                                        byte b46 = bArr37[26];
                                                                                                                                                                        Constructor<?> declaredConstructor = cls38.getDeclaredConstructor(Class.forName($$c(bArr37[14], bArr37[26], s15)), Class.forName($$c(b45, b46, (short) ((b46 ^ 242) | (b46 & 242)))));
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                ?? cls39 = Class.forName($$c(bArr37[14], bArr37[26], s15));
                                                                                                                                                                                byte b47 = bArr37[55];
                                                                                                                                                                                byte b48 = bArr37[i5422222];
                                                                                                                                                                                Object newInstance10 = declaredConstructor.newInstance(cls39.getMethod($$c(b47, b48, (short) (b48 | 235)), cls3).invoke(null, bArr36), invoke9);
                                                                                                                                                                                try {
                                                                                                                                                                                    Class<?> cls40 = Class.forName($$c(bArr37[348], bArr37[18], (short) 232));
                                                                                                                                                                                    byte b49 = bArr37[274];
                                                                                                                                                                                    Field declaredField = cls40.getDeclaredField($$c(b49, b49, (short) 201));
                                                                                                                                                                                    declaredField.setAccessible(true);
                                                                                                                                                                                    Object obj22 = declaredField.get(invoke9);
                                                                                                                                                                                    Class<?> cls41 = obj22.getClass();
                                                                                                                                                                                    Field declaredField2 = cls41.getDeclaredField($$c(bArr37[114], bArr37[47], (short) ($$b & 971)));
                                                                                                                                                                                    declaredField2.setAccessible(true);
                                                                                                                                                                                    byte b50 = bArr37[222];
                                                                                                                                                                                    byte b51 = bArr37[47];
                                                                                                                                                                                    Field declaredField3 = cls41.getDeclaredField($$c(b50, b51, (short) ((b51 ^ 162) | (b51 & 162))));
                                                                                                                                                                                    declaredField3.setAccessible(true);
                                                                                                                                                                                    Object obj23 = declaredField2.get(obj22);
                                                                                                                                                                                    Object obj24 = declaredField3.get(obj22);
                                                                                                                                                                                    Object obj25 = declaredField.get(newInstance10);
                                                                                                                                                                                    ArrayList arrayList = new ArrayList((List) obj23);
                                                                                                                                                                                    Class<?> cls42 = obj24.getClass();
                                                                                                                                                                                    try {
                                                                                                                                                                                        byte b52 = bArr37[0];
                                                                                                                                                                                        byte b53 = bArr37[i2];
                                                                                                                                                                                        Class cls43 = (Class) Class.class.getMethod($$c(b52, b53, (short) (b53 | 131)), null).invoke(cls42, null);
                                                                                                                                                                                        int length3 = Array.getLength(obj24);
                                                                                                                                                                                        Object newInstance11 = Array.newInstance((Class<?>) cls43, length3);
                                                                                                                                                                                        for (int i186 = 0; i186 < length3; i186++) {
                                                                                                                                                                                            int i187 = $10;
                                                                                                                                                                                            int i188 = (i187 ^ 3) + ((i187 & 3) << 1);
                                                                                                                                                                                            $11 = i188 % 128;
                                                                                                                                                                                            int i189 = i188 % 2;
                                                                                                                                                                                            Array.set(newInstance11, i186, Array.get(obj24, i186));
                                                                                                                                                                                        }
                                                                                                                                                                                        declaredField2.set(obj25, arrayList);
                                                                                                                                                                                        declaredField3.set(obj25, newInstance11);
                                                                                                                                                                                        int i190 = 2 % 2;
                                                                                                                                                                                        int i191 = $10 + 63;
                                                                                                                                                                                        $11 = i191 % 128;
                                                                                                                                                                                        int i192 = i191 % 2;
                                                                                                                                                                                        if (e == null) {
                                                                                                                                                                                            e = newInstance10;
                                                                                                                                                                                        }
                                                                                                                                                                                        invoke4 = newInstance10;
                                                                                                                                                                                        bArr2 = bArr2;
                                                                                                                                                                                    } catch (Throwable th50) {
                                                                                                                                                                                        try {
                                                                                                                                                                                            Throwable cause28 = th50.getCause();
                                                                                                                                                                                            if (cause28 == null) {
                                                                                                                                                                                                throw th50;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw cause28;
                                                                                                                                                                                        } catch (Exception e5) {
                                                                                                                                                                                            e = e5;
                                                                                                                                                                                            try {
                                                                                                                                                                                                StringBuilder sb9 = new StringBuilder();
                                                                                                                                                                                                byte[] bArr38 = $$a;
                                                                                                                                                                                                i45 = 3;
                                                                                                                                                                                                short s16 = (short) 854;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    throw ((Throwable) Class.forName($$c(bArr38[14], bArr38[26], s16)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb9.append($$c(bArr38[16], bArr38[126], (short) ($$b & 909))).append(invoke9).append($$c(bArr38[i5422222], bArr38[3], s16)).toString(), e));
                                                                                                                                                                                                } catch (Throwable th51) {
                                                                                                                                                                                                    Throwable cause29 = th51.getCause();
                                                                                                                                                                                                    if (cause29 == null) {
                                                                                                                                                                                                        throw th51;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw cause29;
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th52) {
                                                                                                                                                                                                th = th52;
                                                                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                                                                i45 = 3;
                                                                                                                                                                                                th = th;
                                                                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                                                                zipFile.close();
                                                                                                                                                                                                throw th;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Exception e6) {
                                                                                                                                                                                    e = e6;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th53) {
                                                                                                                                                                                th = th53;
                                                                                                                                                                                th = th;
                                                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                                                zipFile.close();
                                                                                                                                                                                throw th;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th54) {
                                                                                                                                                                            Throwable cause30 = th54.getCause();
                                                                                                                                                                            if (cause30 == null) {
                                                                                                                                                                                throw th54;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause30;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th55) {
                                                                                                                                                                        th = th55;
                                                                                                                                                                        bArr4 = bArr2;
                                                                                                                                                                        i45 = 3;
                                                                                                                                                                        bArr2 = bArr4;
                                                                                                                                                                        th = th;
                                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                                        bArr2 = bArr2;
                                                                                                                                                                        zipFile.close();
                                                                                                                                                                        throw th;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th56) {
                                                                                                                                                                    th = th56;
                                                                                                                                                                    bArr2 = r1322222;
                                                                                                                                                                    i45 = 3;
                                                                                                                                                                    th = th;
                                                                                                                                                                    zArr2 = zArr2;
                                                                                                                                                                    bArr2 = bArr2;
                                                                                                                                                                    zipFile.close();
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th57) {
                                                                                                                                                                Throwable cause31 = th57.getCause();
                                                                                                                                                                if (cause31 == null) {
                                                                                                                                                                    throw th57;
                                                                                                                                                                }
                                                                                                                                                                throw cause31;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th58) {
                                                                                                                                                            Throwable cause32 = th58.getCause();
                                                                                                                                                            if (cause32 == null) {
                                                                                                                                                                throw th58;
                                                                                                                                                            }
                                                                                                                                                            throw cause32;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th59) {
                                                                                                                                                        th = th59;
                                                                                                                                                        bArr2 = r1322222;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th60) {
                                                                                                                                                    th = th60;
                                                                                                                                                    bArr4 = r1322222;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            if (z6) {
                                                                                                                                                int i193 = $11;
                                                                                                                                                int i194 = (i193 ^ 67) + ((i193 & 67) << 1);
                                                                                                                                                $10 = i194 % 128;
                                                                                                                                                int i195 = i194 % 2;
                                                                                                                                                try {
                                                                                                                                                    byte[] bArr39 = $$a;
                                                                                                                                                    Class<?> cls44 = Class.forName($$c(bArr39[c], bArr39[c5], (short) 485));
                                                                                                                                                    String $$c10 = $$c(bArr39[49], bArr39[c4], (short) ($$b & 896));
                                                                                                                                                    byte b54 = bArr39[c];
                                                                                                                                                    byte b55 = bArr39[26];
                                                                                                                                                    Method declaredMethod2 = cls44.getDeclaredMethod($$c10, String.class, Class.forName($$c(b54, b55, (short) (b55 | 242))));
                                                                                                                                                    declaredMethod2.setAccessible(true);
                                                                                                                                                    try {
                                                                                                                                                        byte b56 = bArr39[26];
                                                                                                                                                        byte b57 = bArr39[i2];
                                                                                                                                                        ?? invoke10 = declaredMethod2.invoke(invoke4, str3, Class.class.getMethod($$c(b56, b57, (short) (b57 | 424)), null).invoke(AFa1hSDK.class, null));
                                                                                                                                                        if (invoke10 != null) {
                                                                                                                                                            int i196 = $10;
                                                                                                                                                            int i197 = ((i196 | 63) << 1) - (i196 ^ 63);
                                                                                                                                                            $11 = i197 % 128;
                                                                                                                                                            int i198 = i197 % 2;
                                                                                                                                                            byte b58 = bArr39[16];
                                                                                                                                                            byte b59 = bArr39[c];
                                                                                                                                                            cls44.getDeclaredMethod($$c(b58, b59, (short) ((b59 ^ Ascii.HT) | (b59 & Ascii.HT))), new Class[0]).invoke(invoke4, new Object[0]);
                                                                                                                                                        }
                                                                                                                                                        cls6 = invoke10;
                                                                                                                                                    } catch (Throwable th61) {
                                                                                                                                                        Throwable cause33 = th61.getCause();
                                                                                                                                                        if (cause33 == null) {
                                                                                                                                                            throw th61;
                                                                                                                                                        }
                                                                                                                                                        throw cause33;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th62) {
                                                                                                                                                    th = th62;
                                                                                                                                                    bArr5 = bArr2;
                                                                                                                                                    i45 = 3;
                                                                                                                                                    zArr2 = zArr2;
                                                                                                                                                    bArr2 = bArr5;
                                                                                                                                                    zipFile.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                byte[] bArr40 = $$a;
                                                                                                                                                byte b60 = bArr40[c];
                                                                                                                                                byte b61 = bArr40[26];
                                                                                                                                                Method declaredMethod3 = Class.forName($$c(b60, b61, (short) ((b61 ^ 242) | (b61 & 242)))).getDeclaredMethod($$c(bArr40[49], bArr40[c4], (short) ($$b & 896)), String.class);
                                                                                                                                                try {
                                                                                                                                                    declaredMethod3.setAccessible(true);
                                                                                                                                                    cls6 = declaredMethod3.invoke(invoke4, str3);
                                                                                                                                                } catch (InvocationTargetException e7) {
                                                                                                                                                    try {
                                                                                                                                                        throw ((Exception) e7.getCause());
                                                                                                                                                    } catch (ClassNotFoundException unused10) {
                                                                                                                                                        cls6 = null;
                                                                                                                                                        if (cls6 != null) {
                                                                                                                                                        }
                                                                                                                                                        th2 = th;
                                                                                                                                                        th = th2;
                                                                                                                                                        i45 = 3;
                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                        bArr2 = bArr2;
                                                                                                                                                        zipFile.close();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            if (cls6 != null) {
                                                                                                                                                try {
                                                                                                                                                    break;
                                                                                                                                                } catch (Throwable th63) {
                                                                                                                                                    th2 = th63;
                                                                                                                                                    th = th2;
                                                                                                                                                    i45 = 3;
                                                                                                                                                    zArr2 = zArr2;
                                                                                                                                                    bArr2 = bArr2;
                                                                                                                                                    zipFile.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            System.currentTimeMillis();
                                                                                                                                            System.currentTimeMillis();
                                                                                                                                            try {
                                                                                                                                                cls28 = cls6;
                                                                                                                                                byte[] bArr41 = $$a;
                                                                                                                                                str6 = $$c(bArr41[511], bArr41[c], (short) 120);
                                                                                                                                                Constructor declaredConstructor2 = cls28.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                                declaredConstructor2.setAccessible(true);
                                                                                                                                                i = declaredConstructor2.newInstance(invoke4, Boolean.valueOf(z6 ^ true));
                                                                                                                                                bArr28 = new byte[13452];
                                                                                                                                                byte b62 = bArr41[426];
                                                                                                                                                byte b63 = bArr41[694];
                                                                                                                                                try {
                                                                                                                                                    short s17 = s2;
                                                                                                                                                    short s18 = s3;
                                                                                                                                                    Object newInstance12 = Class.forName($$c(bArr41[776], bArr41[26], s17)).getDeclaredConstructor(Class.forName($$c(bArr41[14], bArr41[26], s18))).newInstance(zipFile.getInputStream(zipFile.getEntry($$c(b62, b63, (short) ((b63 ^ Ascii.DLE) | (b63 & Ascii.DLE))).substring(1))));
                                                                                                                                                    int i199 = $11 + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
                                                                                                                                                    $10 = i199 % 128;
                                                                                                                                                    int i200 = i199 % 2;
                                                                                                                                                    try {
                                                                                                                                                        short s19 = (short) 670;
                                                                                                                                                        Object newInstance13 = Class.forName($$c(bArr41[105], bArr41[26], s19)).getDeclaredConstructor(Class.forName($$c(bArr41[14], bArr41[26], s18))).newInstance(newInstance12);
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                Class.forName($$c(bArr41[105], bArr41[26], s19)).getMethod($$c(bArr41[49], bArr41[46], (short) 648), cls3).invoke(newInstance13, bArr28);
                                                                                                                                                                try {
                                                                                                                                                                    Class<?> cls45 = Class.forName($$c(bArr41[105], bArr41[26], s19));
                                                                                                                                                                    byte b64 = bArr41[16];
                                                                                                                                                                    byte b65 = bArr41[c];
                                                                                                                                                                    cls45.getMethod($$c(b64, b65, (short) ((b65 ^ Ascii.HT) | (b65 & Ascii.HT))), null).invoke(newInstance13, null);
                                                                                                                                                                    i117 = Math.abs(i122);
                                                                                                                                                                    i118 = 13408;
                                                                                                                                                                    s8 = s17;
                                                                                                                                                                    obj16 = obj17;
                                                                                                                                                                    r1322222 = bArr2;
                                                                                                                                                                    obj3 = obj6;
                                                                                                                                                                    zArr922222 = zArr3;
                                                                                                                                                                    i5522222 = i11;
                                                                                                                                                                    z11 = z6;
                                                                                                                                                                    i45 = 3;
                                                                                                                                                                    i3 = 6;
                                                                                                                                                                    r22 = 0;
                                                                                                                                                                } catch (Throwable th64) {
                                                                                                                                                                    Throwable cause34 = th64.getCause();
                                                                                                                                                                    if (cause34 == null) {
                                                                                                                                                                        throw th64;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause34;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th65) {
                                                                                                                                                                th = th65;
                                                                                                                                                                Throwable cause35 = th.getCause();
                                                                                                                                                                if (cause35 == null) {
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                                throw cause35;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th66) {
                                                                                                                                                            th = th66;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th67) {
                                                                                                                                                        Throwable cause36 = th67.getCause();
                                                                                                                                                        if (cause36 == null) {
                                                                                                                                                            throw th67;
                                                                                                                                                        }
                                                                                                                                                        throw cause36;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th68) {
                                                                                                                                                    Throwable cause37 = th68.getCause();
                                                                                                                                                    if (cause37 == null) {
                                                                                                                                                        throw th68;
                                                                                                                                                    }
                                                                                                                                                    throw cause37;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th69) {
                                                                                                                                                th2 = th69;
                                                                                                                                                th = th2;
                                                                                                                                                i45 = 3;
                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                bArr2 = bArr2;
                                                                                                                                                zipFile.close();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                            th2 = th63;
                                                                                                                                            th = th2;
                                                                                                                                            i45 = 3;
                                                                                                                                            zArr2 = zArr2;
                                                                                                                                            bArr2 = bArr2;
                                                                                                                                        } catch (Throwable th70) {
                                                                                                                                            th = th70;
                                                                                                                                            bArr4 = r1322222;
                                                                                                                                            i11 = i5522222;
                                                                                                                                            i45 = 3;
                                                                                                                                            bArr2 = bArr4;
                                                                                                                                            th = th;
                                                                                                                                            zArr2 = zArr2;
                                                                                                                                            bArr2 = bArr2;
                                                                                                                                            zipFile.close();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th71) {
                                                                                                                                        th = th71;
                                                                                                                                        zArr3 = zArr922222;
                                                                                                                                        bArr2 = r1322222;
                                                                                                                                        i11 = i5522222;
                                                                                                                                        i45 = 3;
                                                                                                                                        zArr2 = zArr2;
                                                                                                                                        th = th;
                                                                                                                                        zArr2 = zArr2;
                                                                                                                                        bArr2 = bArr2;
                                                                                                                                        zipFile.close();
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th72) {
                                                                                                                                    th = th72;
                                                                                                                                    cause = th.getCause();
                                                                                                                                    if (cause != null) {
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                    throw cause;
                                                                                                                                }
                                                                                                                            } catch (Throwable th73) {
                                                                                                                                th = th73;
                                                                                                                                cause = th.getCause();
                                                                                                                                if (cause != null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (Throwable th74) {
                                                                                                                            th = th74;
                                                                                                                        }
                                                                                                                    } catch (Throwable th75) {
                                                                                                                        th = th75;
                                                                                                                        zArr4 = zArr2;
                                                                                                                        zArr3 = zArr922222;
                                                                                                                        bArr2 = r1322222;
                                                                                                                        i11 = i5522222;
                                                                                                                        zArr2 = zArr4;
                                                                                                                        th = th;
                                                                                                                        zArr2 = zArr2;
                                                                                                                        bArr2 = bArr2;
                                                                                                                        zipFile.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                    zipFile.close();
                                                                                                                    throw th;
                                                                                                                } catch (Throwable th76) {
                                                                                                                    th.addSuppressed(th76);
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th77) {
                                                                                                                th = th77;
                                                                                                                int currentTimeMillis522 = (int) System.currentTimeMillis();
                                                                                                                int i8422 = -(-(i11 * (-69)));
                                                                                                                int i8522 = (71 & i8422) + (i8422 | 71);
                                                                                                                int i8622 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                                                                int i8722 = ~((i11 ^ currentTimeMillis522) | (i11 & currentTimeMillis522));
                                                                                                                int i8822 = -(-(((i8622 & i8722) | (i8622 ^ i8722)) * (-140)));
                                                                                                                int i8922 = (i8522 & i8822) + (i8822 | i8522);
                                                                                                                int i9022 = (i11 ^ 1) | (i11 & 1);
                                                                                                                int i9122 = (i8922 - (~(-(-((~((i9022 & currentTimeMillis522) | (i9022 ^ currentTimeMillis522))) * 70))))) - 1;
                                                                                                                int i9222 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                                                                i9 = i11;
                                                                                                                int i9322 = ~i9;
                                                                                                                int i9422 = i9222 | (~((i9322 & 1) | (i9322 ^ 1)));
                                                                                                                int i9522 = ~((currentTimeMillis522 & 1) | (currentTimeMillis522 ^ 1));
                                                                                                                int i9622 = -(-(((i9522 & i9422) | (i9422 ^ i9522)) * 70));
                                                                                                                i12 = (i9122 & i9622) + (i9622 | i9122);
                                                                                                                i10 = i5422222;
                                                                                                                while (i12 < i10) {
                                                                                                                }
                                                                                                                int i9822 = $11;
                                                                                                                i13 = (i9822 & 57) + (i9822 | 57);
                                                                                                                $10 = i13 % 128;
                                                                                                                if (i13 % 2 != 0) {
                                                                                                                }
                                                                                                                Object[] objArr1022 = {$$c(b3, b4, b5), th};
                                                                                                                byte[] bArr2122 = $$a;
                                                                                                                throw ((Throwable) Class.forName($$c(bArr2122[14], bArr2122[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr1022));
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th78) {
                                                                                                        Throwable cause38 = th78.getCause();
                                                                                                        if (cause38 == null) {
                                                                                                            throw th78;
                                                                                                        }
                                                                                                        throw cause38;
                                                                                                    }
                                                                                                } catch (Throwable th79) {
                                                                                                    th = th79;
                                                                                                    Throwable cause39 = th.getCause();
                                                                                                    if (cause39 == null) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                    throw cause39;
                                                                                                }
                                                                                            } catch (Throwable th80) {
                                                                                                th = th80;
                                                                                            }
                                                                                        } catch (Throwable th81) {
                                                                                            th = th81;
                                                                                            Throwable cause40 = th.getCause();
                                                                                            if (cause40 == null) {
                                                                                                throw th;
                                                                                            }
                                                                                            throw cause40;
                                                                                        }
                                                                                    } catch (Throwable th82) {
                                                                                        th = th82;
                                                                                    }
                                                                                } catch (Throwable th83) {
                                                                                    th = th83;
                                                                                    str2 = $$c;
                                                                                    zArr2 = zArr822222;
                                                                                    zArr3 = zArr922222;
                                                                                    bArr2 = r1322222;
                                                                                    i11 = i5522222;
                                                                                }
                                                                            } catch (Throwable th84) {
                                                                                Throwable cause41 = th84.getCause();
                                                                                if (cause41 == null) {
                                                                                    throw th84;
                                                                                }
                                                                                throw cause41;
                                                                            }
                                                                        } catch (Throwable th85) {
                                                                            Throwable cause42 = th85.getCause();
                                                                            if (cause42 == null) {
                                                                                throw th85;
                                                                            }
                                                                            throw cause42;
                                                                        }
                                                                    } catch (Throwable th86) {
                                                                        th = th86;
                                                                        str2 = $$c;
                                                                        zArr2 = zArr822222;
                                                                        zArr3 = zArr922222;
                                                                        bArr2 = r1322222;
                                                                        i11 = i5522222;
                                                                        int currentTimeMillis5222 = (int) System.currentTimeMillis();
                                                                        int i84222 = -(-(i11 * (-69)));
                                                                        int i85222 = (71 & i84222) + (i84222 | 71);
                                                                        int i86222 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                        int i87222 = ~((i11 ^ currentTimeMillis5222) | (i11 & currentTimeMillis5222));
                                                                        int i88222 = -(-(((i86222 & i87222) | (i86222 ^ i87222)) * (-140)));
                                                                        int i89222 = (i85222 & i88222) + (i88222 | i85222);
                                                                        int i90222 = (i11 ^ 1) | (i11 & 1);
                                                                        int i91222 = (i89222 - (~(-(-((~((i90222 & currentTimeMillis5222) | (i90222 ^ currentTimeMillis5222))) * 70))))) - 1;
                                                                        int i92222 = ~(((-2) & i11) | ((-2) ^ i11));
                                                                        i9 = i11;
                                                                        int i93222 = ~i9;
                                                                        int i94222 = i92222 | (~((i93222 & 1) | (i93222 ^ 1)));
                                                                        int i95222 = ~((currentTimeMillis5222 & 1) | (currentTimeMillis5222 ^ 1));
                                                                        int i96222 = -(-(((i95222 & i94222) | (i94222 ^ i95222)) * 70));
                                                                        i12 = (i91222 & i96222) + (i96222 | i91222);
                                                                        i10 = i5422222;
                                                                        while (i12 < i10) {
                                                                        }
                                                                        int i98222 = $11;
                                                                        i13 = (i98222 & 57) + (i98222 | 57);
                                                                        $10 = i13 % 128;
                                                                        if (i13 % 2 != 0) {
                                                                        }
                                                                        Object[] objArr10222 = {$$c(b3, b4, b5), th};
                                                                        byte[] bArr21222 = $$a;
                                                                        throw ((Throwable) Class.forName($$c(bArr21222[14], bArr21222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr10222));
                                                                    }
                                                                } catch (Throwable th87) {
                                                                    th = th87;
                                                                    cls3 = cls7;
                                                                }
                                                            } else {
                                                                cls3 = cls7;
                                                                z3 = z822222 ? 1 : 0;
                                                                zArr = zArr722222;
                                                                i6 = i23;
                                                                i7 = i4;
                                                                r39 = objArr322222;
                                                                str2 = $$c;
                                                                zArr2 = zArr822222;
                                                                i8 = i24;
                                                                zArr3 = zArr922222;
                                                                bArr2 = r1322222;
                                                                i9 = i5522222;
                                                                i10 = i5422222;
                                                                z4 = z922222;
                                                            }
                                                            i4 = i7;
                                                            i5522222 = i9 + 1;
                                                            i5422222 = i10;
                                                            i24 = i8;
                                                            i23 = i6;
                                                            cls7 = cls3;
                                                            z822222 = z3;
                                                            zArr722222 = zArr;
                                                            objArr322222 = r39;
                                                            $$c = str2;
                                                            zArr822222 = zArr2;
                                                            r1322222 = bArr2;
                                                            zArr922222 = zArr3;
                                                            i3 = 6;
                                                            z922222 = z4;
                                                        }
                                                        return;
                                                    } catch (Throwable th88) {
                                                        Throwable cause43 = th88.getCause();
                                                        if (cause43 == null) {
                                                            throw th88;
                                                        }
                                                        throw cause43;
                                                    }
                                                }
                                                invoke = null;
                                            }
                                            c4 = 'P';
                                            if (invoke3 == null) {
                                            }
                                            if (invoke2 == null) {
                                            }
                                            byte[] bArr8222222 = $$a;
                                            ?? r13222222 = (short) 952;
                                            Object[] objArr3222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr8222222[c4], bArr8222222[26], r13222222)), 7);
                                            objArr3222222[z ? 1 : 0] = null;
                                            objArr3222222[1] = invoke2;
                                            objArr3222222[2] = invoke;
                                            objArr3222222[3] = invoke3;
                                            objArr3222222[i2] = invoke2;
                                            objArr3222222[5] = invoke;
                                            objArr3222222[i3] = invoke3;
                                            boolean[] zArr7222222 = {false, true, true, true, true, true, true};
                                            boolean[] zArr8222222 = {false, false, false, false, true, true, true};
                                            boolean[] zArr9222222 = new boolean[7];
                                            zArr9222222[z ? 1 : 0] = z;
                                            zArr9222222[1] = z;
                                            zArr9222222[2] = true;
                                            zArr9222222[3] = true;
                                            zArr9222222[i2] = z;
                                            zArr9222222[5] = true;
                                            zArr9222222[i3] = true;
                                            byte b12222222 = bArr8222222[114];
                                            byte b13222222 = bArr8222222[105];
                                            int i54222222 = 7;
                                            Class<?> cls10222222 = Class.forName($$c(b12222222, b13222222, (short) ((b13222222 ^ 872) | (b13222222 & 872))));
                                            byte b14222222 = bArr8222222[56];
                                            byte b15222222 = bArr8222222[44];
                                            i21 = cls10222222.getDeclaredField($$c(b14222222, b15222222, (short) (b15222222 | 835))).getInt(cls10222222);
                                            if (i21 < 34) {
                                            }
                                            if (i21 != 29) {
                                                zArr9222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                                zArr9222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                                if (i21 >= 21) {
                                                }
                                                zArr9222222[i2] = z7;
                                                i4 = z ? 1 : 0;
                                                int i55222222 = i4;
                                                boolean z8222222 = z2;
                                                boolean z9222222 = z;
                                                while ((i4 ^ 1) == i23) {
                                                    i5 = $11 + 97;
                                                    $10 = i5 % 128;
                                                    if (i5 % i22 == 0) {
                                                    }
                                                }
                                            }
                                            zArr9222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                            zArr9222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                            if (i21 >= 21) {
                                            }
                                            zArr9222222[i2] = z7;
                                            i4 = z ? 1 : 0;
                                            int i552222222 = i4;
                                            boolean z82222222 = z2;
                                            boolean z92222222 = z;
                                            while ((i4 ^ 1) == i23) {
                                            }
                                        }
                                        z = false;
                                        invoke3 = null;
                                        if (invoke == null) {
                                        }
                                        c4 = 'P';
                                        if (invoke3 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr82222222 = $$a;
                                        ?? r132222222 = (short) 952;
                                        Object[] objArr32222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr82222222[c4], bArr82222222[26], r132222222)), 7);
                                        objArr32222222[z ? 1 : 0] = null;
                                        objArr32222222[1] = invoke2;
                                        objArr32222222[2] = invoke;
                                        objArr32222222[3] = invoke3;
                                        objArr32222222[i2] = invoke2;
                                        objArr32222222[5] = invoke;
                                        objArr32222222[i3] = invoke3;
                                        boolean[] zArr72222222 = {false, true, true, true, true, true, true};
                                        boolean[] zArr82222222 = {false, false, false, false, true, true, true};
                                        boolean[] zArr92222222 = new boolean[7];
                                        zArr92222222[z ? 1 : 0] = z;
                                        zArr92222222[1] = z;
                                        zArr92222222[2] = true;
                                        zArr92222222[3] = true;
                                        zArr92222222[i2] = z;
                                        zArr92222222[5] = true;
                                        zArr92222222[i3] = true;
                                        byte b122222222 = bArr82222222[114];
                                        byte b132222222 = bArr82222222[105];
                                        int i542222222 = 7;
                                        Class<?> cls102222222 = Class.forName($$c(b122222222, b132222222, (short) ((b132222222 ^ 872) | (b132222222 & 872))));
                                        byte b142222222 = bArr82222222[56];
                                        byte b152222222 = bArr82222222[44];
                                        i21 = cls102222222.getDeclaredField($$c(b142222222, b152222222, (short) (b152222222 | 835))).getInt(cls102222222);
                                        if (i21 < 34) {
                                        }
                                        zArr92222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                        zArr92222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                        if (i21 >= 21) {
                                        }
                                        zArr92222222[i2] = z7;
                                        i4 = z ? 1 : 0;
                                        int i5522222222 = i4;
                                        boolean z822222222 = z2;
                                        boolean z922222222 = z;
                                        while ((i4 ^ 1) == i23) {
                                        }
                                    }
                                    c2 = 'O';
                                    invoke2 = null;
                                    c3 = c2;
                                    if (obj != null) {
                                    }
                                    z = false;
                                    invoke3 = null;
                                    if (invoke == null) {
                                    }
                                    c4 = 'P';
                                    if (invoke3 == null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr822222222 = $$a;
                                    ?? r1322222222 = (short) 952;
                                    Object[] objArr322222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr822222222[c4], bArr822222222[26], r1322222222)), 7);
                                    objArr322222222[z ? 1 : 0] = null;
                                    objArr322222222[1] = invoke2;
                                    objArr322222222[2] = invoke;
                                    objArr322222222[3] = invoke3;
                                    objArr322222222[i2] = invoke2;
                                    objArr322222222[5] = invoke;
                                    objArr322222222[i3] = invoke3;
                                    boolean[] zArr722222222 = {false, true, true, true, true, true, true};
                                    boolean[] zArr822222222 = {false, false, false, false, true, true, true};
                                    boolean[] zArr922222222 = new boolean[7];
                                    zArr922222222[z ? 1 : 0] = z;
                                    zArr922222222[1] = z;
                                    zArr922222222[2] = true;
                                    zArr922222222[3] = true;
                                    zArr922222222[i2] = z;
                                    zArr922222222[5] = true;
                                    zArr922222222[i3] = true;
                                    byte b1222222222 = bArr822222222[114];
                                    byte b1322222222 = bArr822222222[105];
                                    int i5422222222 = 7;
                                    Class<?> cls1022222222 = Class.forName($$c(b1222222222, b1322222222, (short) ((b1322222222 ^ 872) | (b1322222222 & 872))));
                                    byte b1422222222 = bArr822222222[56];
                                    byte b1522222222 = bArr822222222[44];
                                    i21 = cls1022222222.getDeclaredField($$c(b1422222222, b1522222222, (short) (b1522222222 | 835))).getInt(cls1022222222);
                                    if (i21 < 34) {
                                    }
                                    zArr922222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                    zArr922222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                    if (i21 >= 21) {
                                    }
                                    zArr922222222[i2] = z7;
                                    i4 = z ? 1 : 0;
                                    int i55222222222 = i4;
                                    boolean z8222222222 = z2;
                                    boolean z9222222222 = z;
                                    while ((i4 ^ 1) == i23) {
                                    }
                                }
                                if (obj != null) {
                                }
                                c2 = 'O';
                                invoke2 = null;
                                c3 = c2;
                                if (obj != null) {
                                }
                                z = false;
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                c4 = 'P';
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr8222222222 = $$a;
                                ?? r13222222222 = (short) 952;
                                Object[] objArr3222222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr8222222222[c4], bArr8222222222[26], r13222222222)), 7);
                                objArr3222222222[z ? 1 : 0] = null;
                                objArr3222222222[1] = invoke2;
                                objArr3222222222[2] = invoke;
                                objArr3222222222[3] = invoke3;
                                objArr3222222222[i2] = invoke2;
                                objArr3222222222[5] = invoke;
                                objArr3222222222[i3] = invoke3;
                                boolean[] zArr7222222222 = {false, true, true, true, true, true, true};
                                boolean[] zArr8222222222 = {false, false, false, false, true, true, true};
                                boolean[] zArr9222222222 = new boolean[7];
                                zArr9222222222[z ? 1 : 0] = z;
                                zArr9222222222[1] = z;
                                zArr9222222222[2] = true;
                                zArr9222222222[3] = true;
                                zArr9222222222[i2] = z;
                                zArr9222222222[5] = true;
                                zArr9222222222[i3] = true;
                                byte b12222222222 = bArr8222222222[114];
                                byte b13222222222 = bArr8222222222[105];
                                int i54222222222 = 7;
                                Class<?> cls10222222222 = Class.forName($$c(b12222222222, b13222222222, (short) ((b13222222222 ^ 872) | (b13222222222 & 872))));
                                byte b14222222222 = bArr8222222222[56];
                                byte b15222222222 = bArr8222222222[44];
                                i21 = cls10222222222.getDeclaredField($$c(b14222222222, b15222222222, (short) (b15222222222 | 835))).getInt(cls10222222222);
                                if (i21 < 34) {
                                }
                                zArr9222222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                                zArr9222222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                                if (i21 >= 21) {
                                }
                                zArr9222222222[i2] = z7;
                                i4 = z ? 1 : 0;
                                int i552222222222 = i4;
                                boolean z82222222222 = z2;
                                boolean z92222222222 = z;
                                while ((i4 ^ 1) == i23) {
                                }
                            }
                            invoke = null;
                            if (obj != null) {
                            }
                            c2 = 'O';
                            invoke2 = null;
                            c3 = c2;
                            if (obj != null) {
                            }
                            z = false;
                            invoke3 = null;
                            if (invoke == null) {
                            }
                            c4 = 'P';
                            if (invoke3 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr82222222222 = $$a;
                            ?? r132222222222 = (short) 952;
                            Object[] objArr32222222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr82222222222[c4], bArr82222222222[26], r132222222222)), 7);
                            objArr32222222222[z ? 1 : 0] = null;
                            objArr32222222222[1] = invoke2;
                            objArr32222222222[2] = invoke;
                            objArr32222222222[3] = invoke3;
                            objArr32222222222[i2] = invoke2;
                            objArr32222222222[5] = invoke;
                            objArr32222222222[i3] = invoke3;
                            boolean[] zArr72222222222 = {false, true, true, true, true, true, true};
                            boolean[] zArr82222222222 = {false, false, false, false, true, true, true};
                            boolean[] zArr92222222222 = new boolean[7];
                            zArr92222222222[z ? 1 : 0] = z;
                            zArr92222222222[1] = z;
                            zArr92222222222[2] = true;
                            zArr92222222222[3] = true;
                            zArr92222222222[i2] = z;
                            zArr92222222222[5] = true;
                            zArr92222222222[i3] = true;
                            byte b122222222222 = bArr82222222222[114];
                            byte b132222222222 = bArr82222222222[105];
                            int i542222222222 = 7;
                            Class<?> cls102222222222 = Class.forName($$c(b122222222222, b132222222222, (short) ((b132222222222 ^ 872) | (b132222222222 & 872))));
                            byte b142222222222 = bArr82222222222[56];
                            byte b152222222222 = bArr82222222222[44];
                            i21 = cls102222222222.getDeclaredField($$c(b142222222222, b152222222222, (short) (b152222222222 | 835))).getInt(cls102222222222);
                            if (i21 < 34) {
                            }
                            zArr92222222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                            zArr92222222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                            if (i21 >= 21) {
                            }
                            zArr92222222222[i2] = z7;
                            i4 = z ? 1 : 0;
                            int i5522222222222 = i4;
                            boolean z822222222222 = z2;
                            boolean z922222222222 = z;
                            while ((i4 ^ 1) == i23) {
                            }
                        }
                    } catch (Exception unused11) {
                        i2 = 4;
                        obj = null;
                        c = c;
                        byte[] bArr72 = $$a;
                        Class<?> cls92 = Class.forName($$c(bArr72[72], bArr72[105], (short) 1037));
                        byte b102 = bArr72[c == true ? 1 : 0];
                        byte b112 = bArr72[i2];
                        i3 = 6;
                        Method method22 = cls92.getMethod($$c(b102, b112, (short) ((b112 & 1000) | (b112 ^ 1000))), new Class[0]);
                        obj = method22.invoke(null, null);
                        if (obj != null) {
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        c2 = 'O';
                        invoke2 = null;
                        c3 = c2;
                        if (obj != null) {
                        }
                        z = false;
                        invoke3 = null;
                        if (invoke == null) {
                        }
                        c4 = 'P';
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr822222222222 = $$a;
                        ?? r1322222222222 = (short) 952;
                        Object[] objArr322222222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr822222222222[c4], bArr822222222222[26], r1322222222222)), 7);
                        objArr322222222222[z ? 1 : 0] = null;
                        objArr322222222222[1] = invoke2;
                        objArr322222222222[2] = invoke;
                        objArr322222222222[3] = invoke3;
                        objArr322222222222[i2] = invoke2;
                        objArr322222222222[5] = invoke;
                        objArr322222222222[i3] = invoke3;
                        boolean[] zArr722222222222 = {false, true, true, true, true, true, true};
                        boolean[] zArr822222222222 = {false, false, false, false, true, true, true};
                        boolean[] zArr922222222222 = new boolean[7];
                        zArr922222222222[z ? 1 : 0] = z;
                        zArr922222222222[1] = z;
                        zArr922222222222[2] = true;
                        zArr922222222222[3] = true;
                        zArr922222222222[i2] = z;
                        zArr922222222222[5] = true;
                        zArr922222222222[i3] = true;
                        byte b1222222222222 = bArr822222222222[114];
                        byte b1322222222222 = bArr822222222222[105];
                        int i5422222222222 = 7;
                        Class<?> cls1022222222222 = Class.forName($$c(b1222222222222, b1322222222222, (short) ((b1322222222222 ^ 872) | (b1322222222222 & 872))));
                        byte b1422222222222 = bArr822222222222[56];
                        byte b1522222222222 = bArr822222222222[44];
                        i21 = cls1022222222222.getDeclaredField($$c(b1422222222222, b1522222222222, (short) (b1522222222222 | 835))).getInt(cls1022222222222);
                        if (i21 < 34) {
                        }
                        zArr922222222222[z ? 1 : 0] = (i21 != 29 && i21 >= 26) ? true : z ? 1 : 0;
                        zArr922222222222[1] = i21 >= 21 ? true : z ? 1 : 0;
                        if (i21 >= 21) {
                        }
                        zArr922222222222[i2] = z7;
                        i4 = z ? 1 : 0;
                        int i55222222222222 = i4;
                        boolean z8222222222222 = z2;
                        boolean z9222222222222 = z;
                        while ((i4 ^ 1) == i23) {
                        }
                    }
                } catch (Exception unused12) {
                    c = 'k';
                }
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        } catch (Throwable th89) {
            Throwable cause44 = th89.getCause();
            if (cause44 == null) {
                throw th89;
            }
            throw cause44;
        }
    }

    public static int getMonetizationNetwork(int i2) {
        int i3 = 2 % 2;
        int i4 = $10 + 85;
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object obj = i;
        int i6 = (i5 ^ 63) + ((i5 & 63) << 1);
        $10 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) e).getMethod($$c(bArr[72], bArr[4], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = i3 + 7;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = i;
        int i6 = ((i3 | 39) << 1) - (i3 ^ 39);
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 2;
        }
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) e).getMethod($$c(bArr[12], bArr[85], (short) 551), Object.class).invoke(obj2, obj)).intValue();
            int i8 = $10 + 103;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
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

    public static Object getRevenue(int i2, char c, int i3) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 & 63) + (i5 | 63);
        int i7 = i6 % 128;
        $11 = i7;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = i;
        int i8 = i7 + 67;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 43;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Character.valueOf(c), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[511], bArr[107], (short) 583), true, (ClassLoader) e);
            byte b = bArr[14];
            Object invoke = cls.getMethod($$c(b, bArr[4], b), Integer.TYPE, Character.TYPE, Integer.TYPE).invoke(obj2, objArr);
            int i12 = $10 + 27;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFa1hSDK() {
    }

    private static void AFAdRevenueData(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10 + 77;
        $11 = i5 % 128;
        int i6 = i5 % 2;
    }
}
