package com.appsflyer.internal;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.InputDeviceCompat;
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
import kotlin.jvm.internal.ByteCompanionObject;

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

    /* JADX WARN: Can't wrap try/catch for region: R(31:17|(30:1140|1141|(0)|21|(0)|23|24|(0)|(0)|(0)|71|72|73|74|75|(0)(0)|78|(0)|1127|83|84|(0)(0)|87|88|(0)(0)|91|92|(1:93)|1121|1122)|19|(0)|21|(0)|23|24|(0)|(0)|(0)|71|72|73|74|75|(0)(0)|78|(0)|1127|83|84|(0)(0)|87|88|(0)(0)|91|92|(1:93)|1121|1122) */
    /* JADX WARN: Code restructure failed: missing block: B:1130:0x0427, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0486, code lost:
    
        if (((java.lang.Boolean) r6.getMethod($$c(r8, r7, (short) 865), null).invoke(r14, null)).booleanValue() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x019f, code lost:
    
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1110:0x1e1b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1124:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:1128:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1135:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1140:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x1d49 A[Catch: Exception -> 0x1e44, TRY_LEAVE, TryCatch #128 {Exception -> 0x1e44, blocks: (B:10:0x0147, B:12:0x015a, B:28:0x0253, B:33:0x1e3b, B:35:0x1e42, B:36:0x1e43, B:38:0x029d, B:46:0x1e28, B:48:0x1e2e, B:49:0x1e2f, B:52:0x1e31, B:54:0x1e38, B:55:0x1e39, B:60:0x031f, B:67:0x0370, B:69:0x0376, B:70:0x0377, B:71:0x0378, B:74:0x03c7, B:84:0x040f, B:87:0x0418, B:91:0x0424, B:99:0x0440, B:129:0x1ceb, B:131:0x1d49, B:136:0x1d54, B:104:0x1e01, B:141:0x1d76, B:142:0x1d97, B:150:0x1dd6, B:152:0x1ddc, B:153:0x1ddd, B:154:0x1d87, B:1111:0x1e1b, B:1114:0x1e21, B:42:0x02e2, B:40:0x02ac, B:30:0x0275, B:63:0x0333, B:145:0x1d9d, B:146:0x1dd3), top: B:9:0x0147, inners: #4, #11, #17, #39, #105 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x1d76 A[Catch: Exception -> 0x1e44, TRY_ENTER, TryCatch #128 {Exception -> 0x1e44, blocks: (B:10:0x0147, B:12:0x015a, B:28:0x0253, B:33:0x1e3b, B:35:0x1e42, B:36:0x1e43, B:38:0x029d, B:46:0x1e28, B:48:0x1e2e, B:49:0x1e2f, B:52:0x1e31, B:54:0x1e38, B:55:0x1e39, B:60:0x031f, B:67:0x0370, B:69:0x0376, B:70:0x0377, B:71:0x0378, B:74:0x03c7, B:84:0x040f, B:87:0x0418, B:91:0x0424, B:99:0x0440, B:129:0x1ceb, B:131:0x1d49, B:136:0x1d54, B:104:0x1e01, B:141:0x1d76, B:142:0x1d97, B:150:0x1dd6, B:152:0x1ddc, B:153:0x1ddd, B:154:0x1d87, B:1111:0x1e1b, B:1114:0x1e21, B:42:0x02e2, B:40:0x02ac, B:30:0x0275, B:63:0x0333, B:145:0x1d9d, B:146:0x1dd3), top: B:9:0x0147, inners: #4, #11, #17, #39, #105 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x1d87 A[Catch: Exception -> 0x1e44, TryCatch #128 {Exception -> 0x1e44, blocks: (B:10:0x0147, B:12:0x015a, B:28:0x0253, B:33:0x1e3b, B:35:0x1e42, B:36:0x1e43, B:38:0x029d, B:46:0x1e28, B:48:0x1e2e, B:49:0x1e2f, B:52:0x1e31, B:54:0x1e38, B:55:0x1e39, B:60:0x031f, B:67:0x0370, B:69:0x0376, B:70:0x0377, B:71:0x0378, B:74:0x03c7, B:84:0x040f, B:87:0x0418, B:91:0x0424, B:99:0x0440, B:129:0x1ceb, B:131:0x1d49, B:136:0x1d54, B:104:0x1e01, B:141:0x1d76, B:142:0x1d97, B:150:0x1dd6, B:152:0x1ddc, B:153:0x1ddd, B:154:0x1d87, B:1111:0x1e1b, B:1114:0x1e21, B:42:0x02e2, B:40:0x02ac, B:30:0x0275, B:63:0x0333, B:145:0x1d9d, B:146:0x1dd3), top: B:9:0x0147, inners: #4, #11, #17, #39, #105 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029d A[Catch: Exception -> 0x1e44, TRY_ENTER, TRY_LEAVE, TryCatch #128 {Exception -> 0x1e44, blocks: (B:10:0x0147, B:12:0x015a, B:28:0x0253, B:33:0x1e3b, B:35:0x1e42, B:36:0x1e43, B:38:0x029d, B:46:0x1e28, B:48:0x1e2e, B:49:0x1e2f, B:52:0x1e31, B:54:0x1e38, B:55:0x1e39, B:60:0x031f, B:67:0x0370, B:69:0x0376, B:70:0x0377, B:71:0x0378, B:74:0x03c7, B:84:0x040f, B:87:0x0418, B:91:0x0424, B:99:0x0440, B:129:0x1ceb, B:131:0x1d49, B:136:0x1d54, B:104:0x1e01, B:141:0x1d76, B:142:0x1d97, B:150:0x1dd6, B:152:0x1ddc, B:153:0x1ddd, B:154:0x1d87, B:1111:0x1e1b, B:1114:0x1e21, B:42:0x02e2, B:40:0x02ac, B:30:0x0275, B:63:0x0333, B:145:0x1d9d, B:146:0x1dd3), top: B:9:0x0147, inners: #4, #11, #17, #39, #105 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x1813  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x19b1 A[EDGE_INSN: B:485:0x19b1->B:486:0x19b1 BREAK  A[LOOP:2: B:206:0x0b9d->B:437:0x195c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x1bbd A[Catch: all -> 0x1c5f, TryCatch #32 {all -> 0x1c5f, blocks: (B:367:0x1ac3, B:376:0x1b0a, B:378:0x1b10, B:379:0x1b11, B:559:0x1b17, B:561:0x1b26, B:562:0x1b27, B:594:0x1b52, B:596:0x1b5d, B:597:0x1b5e, B:603:0x1b60, B:605:0x1b71, B:606:0x1b72, B:774:0x1bb4, B:776:0x1bbd, B:777:0x1bbe, B:837:0x1bde, B:839:0x1bea, B:840:0x1beb, B:852:0x1c09, B:854:0x1c12, B:855:0x1c13, B:862:0x1c2c, B:864:0x1c33, B:865:0x1c34, B:871:0x1c36, B:873:0x1c48, B:874:0x1c49, B:877:0x1c4b, B:879:0x1c5d, B:880:0x1c5e, B:188:0x0aee, B:186:0x0ab5, B:290:0x13fb, B:370:0x1ad6, B:371:0x1b07, B:342:0x15cc), top: B:187:0x0aee, inners: #12, #24, #33, #121, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:777:0x1bbe A[Catch: all -> 0x1c5f, TryCatch #32 {all -> 0x1c5f, blocks: (B:367:0x1ac3, B:376:0x1b0a, B:378:0x1b10, B:379:0x1b11, B:559:0x1b17, B:561:0x1b26, B:562:0x1b27, B:594:0x1b52, B:596:0x1b5d, B:597:0x1b5e, B:603:0x1b60, B:605:0x1b71, B:606:0x1b72, B:774:0x1bb4, B:776:0x1bbd, B:777:0x1bbe, B:837:0x1bde, B:839:0x1bea, B:840:0x1beb, B:852:0x1c09, B:854:0x1c12, B:855:0x1c13, B:862:0x1c2c, B:864:0x1c33, B:865:0x1c34, B:871:0x1c36, B:873:0x1c48, B:874:0x1c49, B:877:0x1c4b, B:879:0x1c5d, B:880:0x1c5e, B:188:0x0aee, B:186:0x0ab5, B:290:0x13fb, B:370:0x1ad6, B:371:0x1b07, B:342:0x15cc), top: B:187:0x0aee, inners: #12, #24, #33, #121, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0dc7 A[Catch: all -> 0x1bbf, TryCatch #94 {all -> 0x1bbf, blocks: (B:268:0x0e6d, B:627:0x0eda, B:810:0x0dc1, B:812:0x0dc7, B:813:0x0dc8, B:250:0x0dd2), top: B:267:0x0e6d }] */
    /* JADX WARN: Removed duplicated region for block: B:813:0x0dc8 A[Catch: all -> 0x1bbf, TryCatch #94 {all -> 0x1bbf, blocks: (B:268:0x0e6d, B:627:0x0eda, B:810:0x0dc1, B:812:0x0dc7, B:813:0x0dc8, B:250:0x0dd2), top: B:267:0x0e6d }] */
    /* JADX WARN: Removed duplicated region for block: B:839:0x1bea A[Catch: all -> 0x1c5f, TryCatch #32 {all -> 0x1c5f, blocks: (B:367:0x1ac3, B:376:0x1b0a, B:378:0x1b10, B:379:0x1b11, B:559:0x1b17, B:561:0x1b26, B:562:0x1b27, B:594:0x1b52, B:596:0x1b5d, B:597:0x1b5e, B:603:0x1b60, B:605:0x1b71, B:606:0x1b72, B:774:0x1bb4, B:776:0x1bbd, B:777:0x1bbe, B:837:0x1bde, B:839:0x1bea, B:840:0x1beb, B:852:0x1c09, B:854:0x1c12, B:855:0x1c13, B:862:0x1c2c, B:864:0x1c33, B:865:0x1c34, B:871:0x1c36, B:873:0x1c48, B:874:0x1c49, B:877:0x1c4b, B:879:0x1c5d, B:880:0x1c5e, B:188:0x0aee, B:186:0x0ab5, B:290:0x13fb, B:370:0x1ad6, B:371:0x1b07, B:342:0x15cc), top: B:187:0x0aee, inners: #12, #24, #33, #121, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1beb A[Catch: all -> 0x1c5f, TryCatch #32 {all -> 0x1c5f, blocks: (B:367:0x1ac3, B:376:0x1b0a, B:378:0x1b10, B:379:0x1b11, B:559:0x1b17, B:561:0x1b26, B:562:0x1b27, B:594:0x1b52, B:596:0x1b5d, B:597:0x1b5e, B:603:0x1b60, B:605:0x1b71, B:606:0x1b72, B:774:0x1bb4, B:776:0x1bbd, B:777:0x1bbe, B:837:0x1bde, B:839:0x1bea, B:840:0x1beb, B:852:0x1c09, B:854:0x1c12, B:855:0x1c13, B:862:0x1c2c, B:864:0x1c33, B:865:0x1c34, B:871:0x1c36, B:873:0x1c48, B:874:0x1c49, B:877:0x1c4b, B:879:0x1c5d, B:880:0x1c5e, B:188:0x0aee, B:186:0x0ab5, B:290:0x13fb, B:370:0x1ad6, B:371:0x1b07, B:342:0x15cc), top: B:187:0x0aee, inners: #12, #24, #33, #121, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0440 A[Catch: Exception -> 0x1e44, TRY_ENTER, TRY_LEAVE, TryCatch #128 {Exception -> 0x1e44, blocks: (B:10:0x0147, B:12:0x015a, B:28:0x0253, B:33:0x1e3b, B:35:0x1e42, B:36:0x1e43, B:38:0x029d, B:46:0x1e28, B:48:0x1e2e, B:49:0x1e2f, B:52:0x1e31, B:54:0x1e38, B:55:0x1e39, B:60:0x031f, B:67:0x0370, B:69:0x0376, B:70:0x0377, B:71:0x0378, B:74:0x03c7, B:84:0x040f, B:87:0x0418, B:91:0x0424, B:99:0x0440, B:129:0x1ceb, B:131:0x1d49, B:136:0x1d54, B:104:0x1e01, B:141:0x1d76, B:142:0x1d97, B:150:0x1dd6, B:152:0x1ddc, B:153:0x1ddd, B:154:0x1d87, B:1111:0x1e1b, B:1114:0x1e21, B:42:0x02e2, B:40:0x02ac, B:30:0x0275, B:63:0x0333, B:145:0x1d9d, B:146:0x1dd3), top: B:9:0x0147, inners: #4, #11, #17, #39, #105 }] */
    /* JADX WARN: Type inference failed for: r10v46, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r11v85, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v165, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v119, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v150, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v236, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v179 */
    /* JADX WARN: Type inference failed for: r3v185, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v186 */
    /* JADX WARN: Type inference failed for: r3v189, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v192, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v332 */
    /* JADX WARN: Type inference failed for: r3v337 */
    /* JADX WARN: Type inference failed for: r3v352, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v355, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v361 */
    /* JADX WARN: Type inference failed for: r3v375 */
    /* JADX WARN: Type inference failed for: r3v383 */
    /* JADX WARN: Type inference failed for: r3v387 */
    /* JADX WARN: Type inference failed for: r4v169, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v175, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v184, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v89, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v319, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v191, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v63, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v190, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v136, types: [int, short] */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v162 */
    /* JADX WARN: Type inference failed for: r8v166, types: [int, short] */
    /* JADX WARN: Type inference failed for: r8v171, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v192 */
    /* JADX WARN: Type inference failed for: r8v206, types: [int, short] */
    /* JADX WARN: Type inference failed for: r8v251 */
    /* JADX WARN: Type inference failed for: r8v256 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v92, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v190, types: [java.lang.Class] */
    static {
        String $$c;
        String str;
        char c;
        Object obj;
        Object invoke;
        Object invoke2;
        Object invoke3;
        boolean z;
        boolean z2;
        int i2;
        Class<byte[]> cls;
        boolean z3;
        String str2;
        boolean z4;
        int i3;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        short s;
        boolean[] zArr3;
        char c2;
        Object obj2;
        boolean z5;
        char c3;
        int i4;
        int i5;
        int i6;
        byte b;
        byte b2;
        byte b3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object obj3;
        boolean z10;
        boolean z11;
        Random random;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean z12;
        Object obj8;
        Object obj9;
        Object obj10;
        int i7;
        boolean z13;
        boolean z14;
        int i8;
        Object obj11;
        Random random2;
        boolean z15;
        boolean z16;
        int i9;
        ZipFile zipFile;
        ZipFile zipFile2;
        Throwable th;
        ?? r8;
        byte[] bArr;
        char c4;
        ZipFile zipFile3;
        ZipFile zipFile4;
        byte[] bArr2;
        Object obj12;
        Object obj13;
        int i10;
        short s2;
        String str3;
        Class cls2;
        int i11;
        ZipFile zipFile5;
        Throwable cause;
        short s3;
        int i12;
        String str4;
        short s4;
        Throwable cause2;
        Object newInstance;
        short s5;
        Object obj14;
        Object obj15;
        Class[] clsArr;
        boolean z17;
        Object invoke4;
        int i13;
        short s6;
        ZipFile zipFile6;
        char c5;
        char c6;
        ZipFile zipFile7;
        Throwable th2;
        char c7;
        ZipFile zipFile8;
        Class cls3;
        boolean z18;
        byte[] bArr3;
        short s7;
        char c8;
        byte[] bArr4;
        Class<?> cls4;
        Method declaredMethod;
        byte b4;
        byte b5;
        Object newInstance2;
        char c9;
        Object invoke5;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        byte[] bArr5;
        int i14;
        int i15;
        ZipFile zipFile9;
        char c10;
        Exception exc;
        Throwable cause3;
        int i16;
        boolean z19;
        Class<byte[]> cls5 = byte[].class;
        init$0();
        try {
            boolean z20 = true;
            boolean z21 = false;
            byte[] bArr6 = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr6[194], bArr6[105], (short) 1169)).getMethod($$c(bArr6[26], bArr6[46], (short) 1136), Integer.TYPE, Integer.TYPE).invoke(null, 3, 7)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i17 = -(-((~(((-536873107) & currentTimeMillis) | ((-536873107) ^ currentTimeMillis))) * 623));
            int i18 = ((139775766 | i17) << 1) - (i17 ^ 139775766);
            int i19 = ((~currentTimeMillis) | 1354285828) * (-623);
            int i20 = (i18 & i19) + (i18 | i19);
            int i21 = -(-(((~((1405085453 ^ currentTimeMillis) | (1405085453 & currentTimeMillis))) | 536873106 | (~((-587672732) | currentTimeMillis))) * 623));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = ~intValue;
            int i24 = ~((283040942 ^ i23) | (i23 & 283040942));
            int i25 = (153092945 ^ i24) | (i24 & 153092945);
            int i26 = ((-281025673) ^ intValue) | ((-281025673) & intValue);
            int i27 = ~i26;
            int i28 = -(-(((i25 ^ i27) | (i25 & i27)) * (-252)));
            int i29 = (i22 ^ i28) + ((i28 & i22) << 1) + 2098992860;
            int i30 = ~intValue;
            int i31 = (~((i30 & 283040942) | (283040942 ^ i30) | 155108215)) | (~i26);
            int i32 = i31 * 252;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i33 = (((i31 * 216720) + (i29 * (-858))) - (~((i32 | currentTimeMillis2) * (-859)))) - 1;
            int i34 = ~currentTimeMillis2;
            int i35 = ~((i34 ^ i32) | (i34 & i32));
            int i36 = ~i32;
            int i37 = ~i29;
            int i38 = (i36 ^ i37) | (i36 & i37);
            int i39 = ~((i38 ^ currentTimeMillis2) | (i38 & currentTimeMillis2));
            int i40 = i33 + (((i35 ^ i39) | (i39 & i35)) * 859);
            int i41 = ~((~currentTimeMillis2) | i37);
            int i42 = ~i29;
            int i43 = ~((i32 & i42) | (i42 ^ i32));
            if ((i40 - (~(((i41 & i43) | (i41 ^ i43)) * 859))) - 1 == 0) {
                return;
            }
            v = -3847093770088650534L;
            afWarnLog = 578427012;
            afVerboseLog = 3;
            afErrorLogForExcManagerOnly = new byte[]{38, -99, -103, -111, 76, -9, -5, 67};
            AFInAppEventType = new HashMap();
            d = new HashMap();
            try {
                $$c = $$c(bArr6[511], bArr6[107], (short) 1123);
                if (i == null) {
                    str = $$c(bArr6[123], bArr6[107], (short) 1091);
                } else {
                    int i44 = 2 % 2;
                    str = null;
                }
                c = 4;
                try {
                    byte b6 = bArr6[23];
                    byte b7 = bArr6[105];
                    Class<?> cls6 = Class.forName($$c(b6, b7, (short) (b7 | 1057)));
                    byte b8 = bArr6[6];
                    byte b9 = bArr6[107];
                    Method method6 = cls6.getMethod($$c(b8, b9, (short) ((b9 & 1034) | (b9 ^ 1034))), new Class[0]);
                    obj = method6.invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            if (obj != null) {
                try {
                    Class<?> cls7 = obj.getClass();
                    byte[] bArr7 = $$a;
                    Method method7 = cls7.getMethod($$c(bArr7[79], bArr7[4], (short) 996), null);
                    invoke = method7.invoke(obj, null);
                } catch (Exception unused2) {
                    invoke = null;
                    if (obj != null) {
                        try {
                            Class<?> cls8 = obj.getClass();
                            byte[] bArr8 = $$a;
                            byte b10 = bArr8[12];
                            byte b11 = bArr8[4];
                            String $$c2 = $$c(b10, b11, (short) (b11 | 970));
                            Method method8 = cls8.getMethod($$c2, null);
                            invoke2 = method8.invoke(obj, null);
                            int i45 = 2 % 2;
                        } catch (Exception unused3) {
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
                            byte[] bArr9 = $$a;
                            short s8 = (short) 952;
                            Object[] objArr2 = (Object[]) Array.newInstance(Class.forName($$c(bArr9[80], bArr9[26], s8)), 7);
                            objArr2[0] = null;
                            objArr2[1] = invoke2;
                            objArr2[2] = invoke;
                            objArr2[3] = invoke3;
                            objArr2[4] = invoke2;
                            objArr2[5] = invoke;
                            objArr2[6] = invoke3;
                            boolean[] zArr4 = {false, true, true, true, true, true, true};
                            boolean[] zArr5 = {false, false, false, false, true, true, true};
                            boolean[] zArr6 = {false, false, true, true, false, true, true};
                            byte b12 = bArr9[114];
                            byte b13 = bArr9[105];
                            Class<?> cls9 = Class.forName($$c(b12, b13, (short) ((b13 & 872) | (b13 ^ 872))));
                            byte b14 = bArr9[56];
                            byte b15 = bArr9[44];
                            i16 = cls9.getDeclaredField($$c(b14, b15, (short) (b15 | 835))).getInt(cls9);
                            if (i16 < 34) {
                            }
                            zArr6[0] = i16 != 29 && i16 >= 26;
                            zArr6[1] = i16 >= 21;
                            if (i16 >= 21) {
                            }
                            zArr6[4] = z19;
                            z2 = false;
                            int i46 = 0;
                            boolean z22 = z;
                            while ((!z2) == z20) {
                            }
                        }
                        if (obj != null) {
                            try {
                                Class<?> cls10 = obj.getClass();
                                byte[] bArr10 = $$a;
                                String $$c3 = $$c(bArr10[79], bArr10[4], (short) 972);
                                Method method9 = cls10.getMethod($$c3, null);
                                invoke3 = method9.invoke(obj, null);
                            } catch (Exception unused4) {
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr92 = $$a;
                                short s82 = (short) 952;
                                Object[] objArr22 = (Object[]) Array.newInstance(Class.forName($$c(bArr92[80], bArr92[26], s82)), 7);
                                objArr22[0] = null;
                                objArr22[1] = invoke2;
                                objArr22[2] = invoke;
                                objArr22[3] = invoke3;
                                objArr22[4] = invoke2;
                                objArr22[5] = invoke;
                                objArr22[6] = invoke3;
                                boolean[] zArr42 = {false, true, true, true, true, true, true};
                                boolean[] zArr52 = {false, false, false, false, true, true, true};
                                boolean[] zArr62 = {false, false, true, true, false, true, true};
                                byte b122 = bArr92[114];
                                byte b132 = bArr92[105];
                                Class<?> cls92 = Class.forName($$c(b122, b132, (short) ((b132 & 872) | (b132 ^ 872))));
                                byte b142 = bArr92[56];
                                byte b152 = bArr92[44];
                                i16 = cls92.getDeclaredField($$c(b142, b152, (short) (b152 | 835))).getInt(cls92);
                                if (i16 < 34) {
                                }
                                zArr62[0] = i16 != 29 && i16 >= 26;
                                zArr62[1] = i16 >= 21;
                                if (i16 >= 21) {
                                }
                                zArr62[4] = z19;
                                z2 = false;
                                int i462 = 0;
                                boolean z222 = z;
                                while ((!z2) == z20) {
                                }
                            }
                            if (invoke == null) {
                                if (str == null) {
                                    invoke = null;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    byte[] bArr11 = $$a;
                                    try {
                                        invoke = Class.forName($$c(bArr11[80], bArr11[26], (short) 952)).getDeclaredConstructor(String.class).newInstance(sb.append($$c(bArr11[79], bArr11[694], (short) 962)).append(str).toString());
                                    } catch (Throwable th3) {
                                        Throwable cause4 = th3.getCause();
                                        if (cause4 == null) {
                                            throw th3;
                                        }
                                        throw cause4;
                                    }
                                }
                            }
                            if (invoke3 == null) {
                                byte[] bArr12 = $$a;
                                byte b16 = bArr12[26];
                                byte b17 = b16;
                                try {
                                    Object[] objArr3 = {$$c(b16, b17, (short) (b17 | 928))};
                                    Class<?> cls11 = Class.forName($$c(bArr12[0], bArr12[26], (short) 928));
                                    byte b18 = bArr12[79];
                                    byte b19 = bArr12[4];
                                    try {
                                        invoke3 = Class.forName($$c(bArr12[80], bArr12[26], (short) 952)).getDeclaredConstructor(String.class).newInstance(cls11.getMethod($$c(b18, b19, (short) ((b19 & 897) | (b19 ^ 897))), String.class).invoke(null, objArr3));
                                    } catch (Throwable th4) {
                                        Throwable cause5 = th4.getCause();
                                        if (cause5 == null) {
                                            throw th4;
                                        }
                                        throw cause5;
                                    }
                                } catch (Throwable th5) {
                                    Throwable cause6 = th5.getCause();
                                    if (cause6 == null) {
                                        throw th5;
                                    }
                                    throw cause6;
                                }
                            }
                            if (invoke2 == null) {
                                int i47 = $10;
                                int i48 = ((i47 | 1) << 1) - (i47 ^ 1);
                                int i49 = i48 % 128;
                                $11 = i49;
                                int i50 = i48 % 2;
                                if (invoke != null) {
                                    int i51 = i49 + 7;
                                    $10 = i51 % 128;
                                    int i52 = i51 % 2;
                                    byte[] bArr13 = $$a;
                                    try {
                                        short s9 = (short) 952;
                                        invoke2 = Class.forName($$c(bArr13[80], bArr13[26], s9)).getDeclaredConstructor(Class.forName($$c(bArr13[80], bArr13[26], s9)), String.class).newInstance(invoke, $$c(bArr13[47], bArr13[107], (short) 903));
                                    } catch (Throwable th6) {
                                        Throwable cause7 = th6.getCause();
                                        if (cause7 == null) {
                                            throw th6;
                                        }
                                        throw cause7;
                                    }
                                }
                            }
                            byte[] bArr922 = $$a;
                            short s822 = (short) 952;
                            Object[] objArr222 = (Object[]) Array.newInstance(Class.forName($$c(bArr922[80], bArr922[26], s822)), 7);
                            objArr222[0] = null;
                            objArr222[1] = invoke2;
                            objArr222[2] = invoke;
                            objArr222[3] = invoke3;
                            objArr222[4] = invoke2;
                            objArr222[5] = invoke;
                            objArr222[6] = invoke3;
                            boolean[] zArr422 = {false, true, true, true, true, true, true};
                            boolean[] zArr522 = {false, false, false, false, true, true, true};
                            boolean[] zArr622 = {false, false, true, true, false, true, true};
                            byte b1222 = bArr922[114];
                            byte b1322 = bArr922[105];
                            Class<?> cls922 = Class.forName($$c(b1222, b1322, (short) ((b1322 & 872) | (b1322 ^ 872))));
                            byte b1422 = bArr922[56];
                            byte b1522 = bArr922[44];
                            i16 = cls922.getDeclaredField($$c(b1422, b1522, (short) (b1522 | 835))).getInt(cls922);
                            if (i16 < 34) {
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                                z = true;
                            } else {
                                z = false;
                            }
                            zArr622[0] = i16 != 29 && i16 >= 26;
                            zArr622[1] = i16 >= 21;
                            if (i16 >= 21) {
                                z19 = true;
                            } else {
                                int i53 = 2 % 2;
                                z19 = false;
                            }
                            zArr622[4] = z19;
                            z2 = false;
                            int i4622 = 0;
                            boolean z2222 = z;
                            while ((!z2) == z20 && i4622 < 9) {
                                i2 = $11 + 97;
                                $10 = i2 % 128;
                                if (i2 % 2 == 0) {
                                    boolean z23 = zArr622[i4622];
                                    throw null;
                                }
                                if (zArr622[i4622]) {
                                    try {
                                        z8 = zArr422[i4622];
                                        try {
                                            obj3 = objArr222[i4622];
                                            z10 = zArr522[i4622];
                                            if (z8) {
                                                if (obj3 != null) {
                                                    try {
                                                        byte[] bArr14 = $$a;
                                                        Class<?> cls12 = Class.forName($$c(bArr14[80], bArr14[26], s822));
                                                        byte b20 = bArr14[274];
                                                        byte b21 = bArr14[107];
                                                        z3 = z2;
                                                        try {
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            Throwable th8 = th;
                                                            Throwable cause8 = th8.getCause();
                                                            if (cause8 == null) {
                                                                throw th8;
                                                            }
                                                            throw cause8;
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                    }
                                                } else {
                                                    z3 = z2;
                                                }
                                                try {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    byte[] bArr15 = $$a;
                                                    StringBuilder append = sb2.append($$c(bArr15[16], bArr15[126], (short) 858)).append(obj3);
                                                    short s10 = (short) 854;
                                                    try {
                                                        throw ((Throwable) Class.forName($$c(bArr15[14], bArr15[26], s10)).getDeclaredConstructor(String.class).newInstance(append.append($$c(bArr15[7], bArr15[3], s10)).toString()));
                                                    } catch (Throwable th10) {
                                                        Throwable cause9 = th10.getCause();
                                                        if (cause9 == null) {
                                                            throw th10;
                                                        }
                                                        throw cause9;
                                                    }
                                                } catch (Throwable th11) {
                                                    obj2 = th11;
                                                    cls = cls5;
                                                    str2 = $$c;
                                                    z16 = z2222 ? 1 : 0;
                                                    i3 = i4622;
                                                    objArr = objArr222;
                                                    zArr = zArr422;
                                                    zArr2 = zArr522;
                                                    s = s822;
                                                    zArr3 = zArr622;
                                                    c3 = 4;
                                                    z5 = z16;
                                                    int currentTimeMillis3 = (int) System.currentTimeMillis();
                                                    int i54 = -(-(i3 * (-69)));
                                                    int i55 = (71 & i54) + (i54 | 71);
                                                    int i56 = ~(((-2) & i3) | ((-2) ^ i3));
                                                    int i57 = ~((i3 ^ currentTimeMillis3) | (i3 & currentTimeMillis3));
                                                    int i58 = -(-(((i56 & i57) | (i56 ^ i57)) * (-140)));
                                                    int i59 = (i55 & i58) + (i58 | i55);
                                                    int i60 = (i3 ^ 1) | (i3 & 1);
                                                    int i61 = (i59 - (~(-(-((~((i60 & currentTimeMillis3) | (i60 ^ currentTimeMillis3))) * 70))))) - 1;
                                                    int i62 = ~(((-2) & i3) | ((-2) ^ i3));
                                                    i4 = i3;
                                                    int i63 = ~i4;
                                                    int i64 = i62 | (~((i63 & 1) | (i63 ^ 1)));
                                                    int i65 = ~((currentTimeMillis3 & 1) | (currentTimeMillis3 ^ 1));
                                                    int i66 = -(-(((i65 & i64) | (i64 ^ i65)) * 70));
                                                    i5 = (i61 & i66) + (i66 | i61);
                                                    while (i5 < 7) {
                                                    }
                                                    int i67 = $11;
                                                    i6 = (i67 & 57) + (i67 | 57);
                                                    $10 = i6 % 128;
                                                    if (i6 % 2 == 0) {
                                                    }
                                                    try {
                                                        Object[] objArr4 = {$$c(b, b2, b3), obj2};
                                                        byte[] bArr16 = $$a;
                                                        throw ((Throwable) Class.forName($$c(bArr16[14], bArr16[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4));
                                                    } catch (Throwable th12) {
                                                        Throwable cause10 = th12.getCause();
                                                        if (cause10 == null) {
                                                            throw th12;
                                                        }
                                                        throw cause10;
                                                    }
                                                }
                                            }
                                            z3 = z2;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            cls = cls5;
                                            z3 = z2;
                                            str2 = $$c;
                                            z9 = z2222 ? 1 : 0;
                                            i3 = i4622;
                                            objArr = objArr222;
                                            zArr = zArr422;
                                            zArr2 = zArr522;
                                            s = s822;
                                            zArr3 = zArr622;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        cls = cls5;
                                        z3 = z2;
                                        str2 = $$c;
                                        z4 = z2222 ? 1 : 0;
                                        i3 = i4622;
                                        objArr = objArr222;
                                        zArr = zArr422;
                                        zArr2 = zArr522;
                                        s = s822;
                                        zArr3 = zArr622;
                                        c2 = c;
                                    }
                                    if (z8) {
                                        try {
                                            random = new Random();
                                            int i68 = 2 % 2;
                                            try {
                                                byte[] bArr17 = $$a;
                                                str2 = $$c;
                                                try {
                                                    try {
                                                        random.setSeed(((Long) Class.forName($$c(bArr17[0], bArr17[26], (short) 928)).getMethod($$c(bArr17[4], bArr17[107], (short) 836), null).invoke(null, null)).longValue() ^ (-1617552406));
                                                        obj4 = null;
                                                        obj5 = null;
                                                        obj6 = null;
                                                        obj7 = null;
                                                        z12 = z2222;
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        z11 = z2222 ? 1 : 0;
                                                        i3 = i4622;
                                                        objArr = objArr222;
                                                        zArr = zArr422;
                                                        zArr2 = zArr522;
                                                        zArr3 = zArr622;
                                                        obj2 = th;
                                                        cls = cls5;
                                                        s = s822;
                                                        z16 = z11;
                                                        c3 = 4;
                                                        z5 = z16;
                                                        int currentTimeMillis32 = (int) System.currentTimeMillis();
                                                        int i542 = -(-(i3 * (-69)));
                                                        int i552 = (71 & i542) + (i542 | 71);
                                                        int i562 = ~(((-2) & i3) | ((-2) ^ i3));
                                                        int i572 = ~((i3 ^ currentTimeMillis32) | (i3 & currentTimeMillis32));
                                                        int i582 = -(-(((i562 & i572) | (i562 ^ i572)) * (-140)));
                                                        int i592 = (i552 & i582) + (i582 | i552);
                                                        int i602 = (i3 ^ 1) | (i3 & 1);
                                                        int i612 = (i592 - (~(-(-((~((i602 & currentTimeMillis32) | (i602 ^ currentTimeMillis32))) * 70))))) - 1;
                                                        int i622 = ~(((-2) & i3) | ((-2) ^ i3));
                                                        i4 = i3;
                                                        int i632 = ~i4;
                                                        int i642 = i622 | (~((i632 & 1) | (i632 ^ 1)));
                                                        int i652 = ~((currentTimeMillis32 & 1) | (currentTimeMillis32 ^ 1));
                                                        int i662 = -(-(((i652 & i642) | (i642 ^ i652)) * 70));
                                                        i5 = (i612 & i662) + (i662 | i612);
                                                        while (i5 < 7) {
                                                        }
                                                        int i672 = $11;
                                                        i6 = (i672 & 57) + (i672 | 57);
                                                        $10 = i6 % 128;
                                                        if (i6 % 2 == 0) {
                                                        }
                                                        Object[] objArr42 = {$$c(b, b2, b3), obj2};
                                                        byte[] bArr162 = $$a;
                                                        throw ((Throwable) Class.forName($$c(bArr162[14], bArr162[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42));
                                                    }
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                    boolean z24 = z2222 ? 1 : 0;
                                                    Throwable th17 = th;
                                                    Throwable cause11 = th17.getCause();
                                                    if (cause11 == null) {
                                                        throw th17;
                                                    }
                                                    throw cause11;
                                                }
                                            } catch (Throwable th18) {
                                                th = th18;
                                            }
                                        } catch (Throwable th19) {
                                            th = th19;
                                            str2 = $$c;
                                        }
                                        while (obj4 == null) {
                                            Object obj16 = obj4;
                                            int i69 = $11 + 25;
                                            objArr = objArr222;
                                            $10 = i69 % 128;
                                            if (i69 % 2 != 0) {
                                                z11 = z12;
                                                i3 = i4622;
                                                zArr = zArr422;
                                                zArr2 = zArr522;
                                                zArr3 = zArr622;
                                                Object obj17 = null;
                                                try {
                                                    obj17.hashCode();
                                                    throw null;
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                    obj2 = th;
                                                    cls = cls5;
                                                    s = s822;
                                                    z16 = z11;
                                                    c3 = 4;
                                                    z5 = z16;
                                                    int currentTimeMillis322 = (int) System.currentTimeMillis();
                                                    int i5422 = -(-(i3 * (-69)));
                                                    int i5522 = (71 & i5422) + (i5422 | 71);
                                                    int i5622 = ~(((-2) & i3) | ((-2) ^ i3));
                                                    int i5722 = ~((i3 ^ currentTimeMillis322) | (i3 & currentTimeMillis322));
                                                    int i5822 = -(-(((i5622 & i5722) | (i5622 ^ i5722)) * (-140)));
                                                    int i5922 = (i5522 & i5822) + (i5822 | i5522);
                                                    int i6022 = (i3 ^ 1) | (i3 & 1);
                                                    int i6122 = (i5922 - (~(-(-((~((i6022 & currentTimeMillis322) | (i6022 ^ currentTimeMillis322))) * 70))))) - 1;
                                                    int i6222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                    i4 = i3;
                                                    int i6322 = ~i4;
                                                    int i6422 = i6222 | (~((i6322 & 1) | (i6322 ^ 1)));
                                                    int i6522 = ~((currentTimeMillis322 & 1) | (currentTimeMillis322 ^ 1));
                                                    int i6622 = -(-(((i6522 & i6422) | (i6422 ^ i6522)) * 70));
                                                    i5 = (i6122 & i6622) + (i6622 | i6122);
                                                    while (i5 < 7) {
                                                    }
                                                    int i6722 = $11;
                                                    i6 = (i6722 & 57) + (i6722 | 57);
                                                    $10 = i6 % 128;
                                                    if (i6 % 2 == 0) {
                                                    }
                                                    Object[] objArr422 = {$$c(b, b2, b3), obj2};
                                                    byte[] bArr1622 = $$a;
                                                    throw ((Throwable) Class.forName($$c(bArr1622[14], bArr1622[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr422));
                                                }
                                            }
                                            if (obj5 == null) {
                                                z14 = z12;
                                                zArr = zArr422;
                                                zArr2 = zArr522;
                                                i7 = 6;
                                            } else if (obj6 == null) {
                                                boolean[] zArr7 = zArr422;
                                                int i70 = ~((int) System.currentTimeMillis());
                                                int i71 = (-1283983286) + ((321061583 | (~(((-124302408) ^ i70) | ((-124302408) & i70)))) * (-933));
                                                int i72 = ~(i70 | 321061583);
                                                int i73 = i71 + (((i72 ^ (-392935120)) | (i72 & (-392935120))) * 933);
                                                int i74 = (i73 & 1526217128) + (i73 | 1526217128);
                                                zArr = zArr7;
                                                boolean z25 = z12;
                                                int currentTimeMillis4 = (int) System.currentTimeMillis();
                                                int i75 = (1507632205 ^ currentTimeMillis4) | (1507632205 & currentTimeMillis4);
                                                zArr2 = zArr522;
                                                int i76 = -(-((291676384 | (~i75)) * (-668)));
                                                int i77 = (((-1369678672) | i76) << 1) - ((-1369678672) ^ i76);
                                                int i78 = ~((291676384 ^ currentTimeMillis4) | (currentTimeMillis4 & 291676384));
                                                int i79 = -(-(((1507632205 ^ i78) | (i78 & 1507632205)) * 1336));
                                                z13 = z25;
                                                if (i74 <= (i77 ^ i79) + ((i77 & i79) << 1) + ((i75 | 291676384) * 668)) {
                                                    i7 = 5;
                                                    z14 = z25;
                                                }
                                                i7 = 4;
                                                z14 = z13;
                                            } else {
                                                boolean z26 = z12;
                                                zArr = zArr422;
                                                zArr2 = zArr522;
                                                z13 = z26;
                                                if (obj7 != null) {
                                                    i7 = 3;
                                                    z14 = z26;
                                                }
                                                i7 = 4;
                                                z14 = z13;
                                            }
                                            try {
                                                StringBuilder sb3 = new StringBuilder((i7 ^ 1) + ((i7 & 1) << 1));
                                                sb3.append('.');
                                                int i80 = 0;
                                                boolean z27 = z14;
                                                while (i80 < i7) {
                                                    if (z10) {
                                                        i8 = i7;
                                                        try {
                                                            int nextInt = random.nextInt(26);
                                                            zArr3 = zArr622;
                                                            if (!(!random.nextBoolean())) {
                                                                int i81 = -(-nextInt);
                                                                i3 = i4622;
                                                                z15 = z27;
                                                                i9 = (i81 ^ 65) + ((i81 & 65) << 1);
                                                                obj11 = obj7;
                                                            } else {
                                                                obj11 = obj7;
                                                                z15 = z27;
                                                                try {
                                                                    int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                                    int i82 = 1057 - (~(nextInt * 530));
                                                                    int i83 = (i82 ^ 50880) + ((i82 & 50880) << 1);
                                                                    i3 = i4622;
                                                                    int i84 = ((~((nextInt ^ 96) | (nextInt & 96))) | (~((~currentTimeMillis5) | nextInt))) * 529;
                                                                    int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                                                                    int i86 = ~((nextInt & currentTimeMillis5) | (nextInt ^ currentTimeMillis5));
                                                                    int i87 = -(-(((i86 & (-97)) | ((-97) ^ i86)) * 529));
                                                                    i9 = (i87 | i85) + (i85 & i87);
                                                                    z15 = z15;
                                                                } catch (Throwable th21) {
                                                                    th = th21;
                                                                    i3 = i4622;
                                                                    obj2 = th;
                                                                    cls = cls5;
                                                                    s = s822;
                                                                    z16 = z15;
                                                                    c3 = 4;
                                                                    z5 = z16;
                                                                    int currentTimeMillis3222 = (int) System.currentTimeMillis();
                                                                    int i54222 = -(-(i3 * (-69)));
                                                                    int i55222 = (71 & i54222) + (i54222 | 71);
                                                                    int i56222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                    int i57222 = ~((i3 ^ currentTimeMillis3222) | (i3 & currentTimeMillis3222));
                                                                    int i58222 = -(-(((i56222 & i57222) | (i56222 ^ i57222)) * (-140)));
                                                                    int i59222 = (i55222 & i58222) + (i58222 | i55222);
                                                                    int i60222 = (i3 ^ 1) | (i3 & 1);
                                                                    int i61222 = (i59222 - (~(-(-((~((i60222 & currentTimeMillis3222) | (i60222 ^ currentTimeMillis3222))) * 70))))) - 1;
                                                                    int i62222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                    i4 = i3;
                                                                    int i63222 = ~i4;
                                                                    int i64222 = i62222 | (~((i63222 & 1) | (i63222 ^ 1)));
                                                                    int i65222 = ~((currentTimeMillis3222 & 1) | (currentTimeMillis3222 ^ 1));
                                                                    int i66222 = -(-(((i65222 & i64222) | (i64222 ^ i65222)) * 70));
                                                                    i5 = (i61222 & i66222) + (i66222 | i61222);
                                                                    while (i5 < 7) {
                                                                    }
                                                                    int i67222 = $11;
                                                                    i6 = (i67222 & 57) + (i67222 | 57);
                                                                    $10 = i6 % 128;
                                                                    if (i6 % 2 == 0) {
                                                                    }
                                                                    Object[] objArr4222 = {$$c(b, b2, b3), obj2};
                                                                    byte[] bArr16222 = $$a;
                                                                    throw ((Throwable) Class.forName($$c(bArr16222[14], bArr16222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4222));
                                                                }
                                                            }
                                                            try {
                                                                sb3.append((char) i9);
                                                                random2 = random;
                                                                z11 = z15 ? 1 : 0;
                                                            } catch (Throwable th22) {
                                                                th = th22;
                                                                obj2 = th;
                                                                cls = cls5;
                                                                s = s822;
                                                                z16 = z15;
                                                                c3 = 4;
                                                                z5 = z16;
                                                                int currentTimeMillis32222 = (int) System.currentTimeMillis();
                                                                int i542222 = -(-(i3 * (-69)));
                                                                int i552222 = (71 & i542222) + (i542222 | 71);
                                                                int i562222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                int i572222 = ~((i3 ^ currentTimeMillis32222) | (i3 & currentTimeMillis32222));
                                                                int i582222 = -(-(((i562222 & i572222) | (i562222 ^ i572222)) * (-140)));
                                                                int i592222 = (i552222 & i582222) + (i582222 | i552222);
                                                                int i602222 = (i3 ^ 1) | (i3 & 1);
                                                                int i612222 = (i592222 - (~(-(-((~((i602222 & currentTimeMillis32222) | (i602222 ^ currentTimeMillis32222))) * 70))))) - 1;
                                                                int i622222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                i4 = i3;
                                                                int i632222 = ~i4;
                                                                int i642222 = i622222 | (~((i632222 & 1) | (i632222 ^ 1)));
                                                                int i652222 = ~((currentTimeMillis32222 & 1) | (currentTimeMillis32222 ^ 1));
                                                                int i662222 = -(-(((i652222 & i642222) | (i642222 ^ i652222)) * 70));
                                                                i5 = (i612222 & i662222) + (i662222 | i612222);
                                                                while (i5 < 7) {
                                                                }
                                                                int i672222 = $11;
                                                                i6 = (i672222 & 57) + (i672222 | 57);
                                                                $10 = i6 % 128;
                                                                if (i6 % 2 == 0) {
                                                                }
                                                                Object[] objArr42222 = {$$c(b, b2, b3), obj2};
                                                                byte[] bArr162222 = $$a;
                                                                throw ((Throwable) Class.forName($$c(bArr162222[14], bArr162222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42222));
                                                            }
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            i3 = i4622;
                                                            zArr3 = zArr622;
                                                            z15 = z27;
                                                        }
                                                    } else {
                                                        i8 = i7;
                                                        i3 = i4622;
                                                        obj11 = obj7;
                                                        zArr3 = zArr622;
                                                        boolean z28 = z27;
                                                        try {
                                                            int nextInt2 = random.nextInt(12);
                                                            int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                            int i88 = nextInt2 * 70;
                                                            int i89 = (i88 & (-557056)) + (i88 | (-557056));
                                                            int i90 = ~nextInt2;
                                                            int i91 = (i90 & (-8193)) | (i90 ^ (-8193));
                                                            random2 = random;
                                                            int i92 = (nextInt2 & 8192) | (nextInt2 ^ 8192);
                                                            int i93 = ((~((i92 & currentTimeMillis6) | (i92 ^ currentTimeMillis6))) | (~((i91 & currentTimeMillis6) | (i91 ^ currentTimeMillis6)))) * 69;
                                                            int i94 = (i89 & i93) + (i89 | i93);
                                                            int i95 = ~nextInt2;
                                                            z11 = z28 ? 1 : 0;
                                                            int i96 = ~((i95 ^ 8192) | (i95 & 8192));
                                                            int i97 = ~((i95 & currentTimeMillis6) | (i95 ^ currentTimeMillis6));
                                                            try {
                                                                sb3.append((char) (i94 + (((i97 & i96) | (i96 ^ i97) | (~((currentTimeMillis6 & 8192) | (currentTimeMillis6 ^ 8192)))) * (-69)) + ((~((-8193) | nextInt2)) * 69)));
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                                obj2 = th;
                                                                cls = cls5;
                                                                s = s822;
                                                                z16 = z11;
                                                                c3 = 4;
                                                                z5 = z16;
                                                                int currentTimeMillis322222 = (int) System.currentTimeMillis();
                                                                int i5422222 = -(-(i3 * (-69)));
                                                                int i5522222 = (71 & i5422222) + (i5422222 | 71);
                                                                int i5622222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                int i5722222 = ~((i3 ^ currentTimeMillis322222) | (i3 & currentTimeMillis322222));
                                                                int i5822222 = -(-(((i5622222 & i5722222) | (i5622222 ^ i5722222)) * (-140)));
                                                                int i5922222 = (i5522222 & i5822222) + (i5822222 | i5522222);
                                                                int i6022222 = (i3 ^ 1) | (i3 & 1);
                                                                int i6122222 = (i5922222 - (~(-(-((~((i6022222 & currentTimeMillis322222) | (i6022222 ^ currentTimeMillis322222))) * 70))))) - 1;
                                                                int i6222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                i4 = i3;
                                                                int i6322222 = ~i4;
                                                                int i6422222 = i6222222 | (~((i6322222 & 1) | (i6322222 ^ 1)));
                                                                int i6522222 = ~((currentTimeMillis322222 & 1) | (currentTimeMillis322222 ^ 1));
                                                                int i6622222 = -(-(((i6522222 & i6422222) | (i6422222 ^ i6522222)) * 70));
                                                                i5 = (i6122222 & i6622222) + (i6622222 | i6122222);
                                                                while (i5 < 7) {
                                                                }
                                                                int i6722222 = $11;
                                                                i6 = (i6722222 & 57) + (i6722222 | 57);
                                                                $10 = i6 % 128;
                                                                if (i6 % 2 == 0) {
                                                                }
                                                                Object[] objArr422222 = {$$c(b, b2, b3), obj2};
                                                                byte[] bArr1622222 = $$a;
                                                                throw ((Throwable) Class.forName($$c(bArr1622222[14], bArr1622222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr422222));
                                                            }
                                                        } catch (Throwable th25) {
                                                            th = th25;
                                                            z11 = z28 ? 1 : 0;
                                                            obj2 = th;
                                                            cls = cls5;
                                                            s = s822;
                                                            z16 = z11;
                                                            c3 = 4;
                                                            z5 = z16;
                                                            int currentTimeMillis3222222 = (int) System.currentTimeMillis();
                                                            int i54222222 = -(-(i3 * (-69)));
                                                            int i55222222 = (71 & i54222222) + (i54222222 | 71);
                                                            int i56222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                            int i57222222 = ~((i3 ^ currentTimeMillis3222222) | (i3 & currentTimeMillis3222222));
                                                            int i58222222 = -(-(((i56222222 & i57222222) | (i56222222 ^ i57222222)) * (-140)));
                                                            int i59222222 = (i55222222 & i58222222) + (i58222222 | i55222222);
                                                            int i60222222 = (i3 ^ 1) | (i3 & 1);
                                                            int i61222222 = (i59222222 - (~(-(-((~((i60222222 & currentTimeMillis3222222) | (i60222222 ^ currentTimeMillis3222222))) * 70))))) - 1;
                                                            int i62222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                            i4 = i3;
                                                            int i63222222 = ~i4;
                                                            int i64222222 = i62222222 | (~((i63222222 & 1) | (i63222222 ^ 1)));
                                                            int i65222222 = ~((currentTimeMillis3222222 & 1) | (currentTimeMillis3222222 ^ 1));
                                                            int i66222222 = -(-(((i65222222 & i64222222) | (i64222222 ^ i65222222)) * 70));
                                                            i5 = (i61222222 & i66222222) + (i66222222 | i61222222);
                                                            while (i5 < 7) {
                                                                if (zArr3[i5]) {
                                                                    System.currentTimeMillis();
                                                                    System.currentTimeMillis();
                                                                    i = null;
                                                                    e = null;
                                                                    z6 = false;
                                                                    z7 = true;
                                                                    c6 = c3;
                                                                    z4 = z5;
                                                                    z18 = z3;
                                                                    i4622 = i4 + 1;
                                                                    c = c6;
                                                                    z21 = z6;
                                                                    z20 = z7;
                                                                    z2 = z18;
                                                                    $$c = str2;
                                                                    objArr222 = objArr;
                                                                    zArr422 = zArr;
                                                                    zArr522 = zArr2;
                                                                    zArr622 = zArr3;
                                                                    z2222 = z4;
                                                                    s822 = s;
                                                                    cls5 = cls;
                                                                } else {
                                                                    i5++;
                                                                    int i98 = 2 % 2;
                                                                }
                                                            }
                                                            int i67222222 = $11;
                                                            i6 = (i67222222 & 57) + (i67222222 | 57);
                                                            $10 = i6 % 128;
                                                            if (i6 % 2 == 0) {
                                                                byte[] bArr18 = $$a;
                                                                b = bArr18[116];
                                                                b2 = bArr18[92];
                                                                b3 = bArr18[1017];
                                                            } else {
                                                                byte[] bArr19 = $$a;
                                                                b = bArr19[105];
                                                                b2 = bArr19[126];
                                                                b3 = bArr19[151];
                                                            }
                                                            Object[] objArr4222222 = {$$c(b, b2, b3), obj2};
                                                            byte[] bArr16222222 = $$a;
                                                            throw ((Throwable) Class.forName($$c(bArr16222222[14], bArr16222222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4222222));
                                                        }
                                                    }
                                                    i80++;
                                                    obj7 = obj11;
                                                    i7 = i8;
                                                    zArr622 = zArr3;
                                                    z27 = z11;
                                                    random = random2;
                                                    i4622 = i3;
                                                }
                                                Random random3 = random;
                                                i3 = i4622;
                                                Object obj18 = obj7;
                                                z11 = z27;
                                                zArr3 = zArr622;
                                                String sb4 = sb3.toString();
                                                if (obj5 == null) {
                                                    try {
                                                        Object[] objArr5 = {obj3, sb4};
                                                        byte[] bArr20 = $$a;
                                                        obj5 = Class.forName($$c(bArr20[80], bArr20[26], s822)).getDeclaredConstructor(Class.forName($$c(bArr20[80], bArr20[26], s822)), String.class).newInstance(objArr5);
                                                    } catch (Throwable th26) {
                                                        Throwable cause12 = th26.getCause();
                                                        if (cause12 == null) {
                                                            throw th26;
                                                        }
                                                        throw cause12;
                                                    }
                                                } else {
                                                    if (obj6 == null) {
                                                        int i99 = $10;
                                                        int i100 = ((i99 | 85) << 1) - (i99 ^ 85);
                                                        $11 = i100 % 128;
                                                        int i101 = i100 % 2;
                                                        try {
                                                            Object[] objArr6 = {obj3, sb4};
                                                            byte[] bArr21 = $$a;
                                                            obj6 = Class.forName($$c(bArr21[80], bArr21[26], s822)).getDeclaredConstructor(Class.forName($$c(bArr21[80], bArr21[26], s822)), String.class).newInstance(objArr6);
                                                        } catch (Throwable th27) {
                                                            Throwable cause13 = th27.getCause();
                                                            if (cause13 == null) {
                                                                throw th27;
                                                            }
                                                            throw cause13;
                                                        }
                                                    } else if (obj18 == null) {
                                                        try {
                                                            Object[] objArr7 = {obj3, sb4};
                                                            byte[] bArr22 = $$a;
                                                            obj7 = Class.forName($$c(bArr22[80], bArr22[26], s822)).getDeclaredConstructor(Class.forName($$c(bArr22[80], bArr22[26], s822)), String.class).newInstance(objArr7);
                                                            obj4 = obj16;
                                                            objArr222 = objArr;
                                                            zArr422 = zArr;
                                                            zArr522 = zArr2;
                                                            zArr622 = zArr3;
                                                            z12 = z11 ? 1 : 0;
                                                            random = random3;
                                                            i4622 = i3;
                                                        } catch (Throwable th28) {
                                                            Throwable cause14 = th28.getCause();
                                                            if (cause14 == null) {
                                                                throw th28;
                                                            }
                                                            throw cause14;
                                                        }
                                                    } else {
                                                        try {
                                                            try {
                                                                Object[] objArr8 = {obj3, sb4};
                                                                byte[] bArr23 = $$a;
                                                                obj4 = Class.forName($$c(bArr23[80], bArr23[26], s822)).getDeclaredConstructor(Class.forName($$c(bArr23[80], bArr23[26], s822)), String.class).newInstance(objArr8);
                                                                try {
                                                                    short s11 = (short) 820;
                                                                    Object obj19 = obj5;
                                                                    Object newInstance3 = Class.forName($$c(bArr23[114], bArr23[26], s11)).getDeclaredConstructor(Class.forName($$c(bArr23[80], bArr23[26], s822))).newInstance(obj4);
                                                                    try {
                                                                        Class<?> cls13 = Class.forName($$c(bArr23[114], bArr23[26], s11));
                                                                        byte b22 = bArr23[16];
                                                                        byte b23 = bArr23[107];
                                                                        cls13.getMethod($$c(b22, b23, (short) ((b23 ^ 777) | (b23 & 777))), null).invoke(newInstance3, null);
                                                                        obj7 = obj18;
                                                                        obj5 = obj19;
                                                                        objArr222 = objArr;
                                                                        zArr422 = zArr;
                                                                        zArr522 = zArr2;
                                                                        zArr622 = zArr3;
                                                                        z12 = z11 ? 1 : 0;
                                                                        random = random3;
                                                                        i4622 = i3;
                                                                    } catch (Throwable th29) {
                                                                        Throwable cause15 = th29.getCause();
                                                                        if (cause15 == null) {
                                                                            throw th29;
                                                                        }
                                                                        throw cause15;
                                                                    }
                                                                } catch (Throwable th30) {
                                                                    Throwable cause16 = th30.getCause();
                                                                    if (cause16 == null) {
                                                                        throw th30;
                                                                    }
                                                                    throw cause16;
                                                                }
                                                            } catch (Throwable th31) {
                                                                Throwable cause17 = th31.getCause();
                                                                if (cause17 == null) {
                                                                    throw th31;
                                                                }
                                                                throw cause17;
                                                            }
                                                        } catch (Exception e3) {
                                                            StringBuilder sb5 = new StringBuilder();
                                                            byte[] bArr24 = $$a;
                                                            short s12 = (short) 854;
                                                            try {
                                                                throw ((Throwable) Class.forName($$c(bArr24[14], bArr24[26], s12)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb5.append($$c(bArr24[16], bArr24[126], (short) 793)).append((Object) 2).append($$c(bArr24[7], bArr24[3], s12)).toString(), e3));
                                                            } catch (Throwable th32) {
                                                                Throwable cause18 = th32.getCause();
                                                                if (cause18 == null) {
                                                                    throw th32;
                                                                }
                                                                throw cause18;
                                                            }
                                                        }
                                                    }
                                                    th = th24;
                                                }
                                                obj7 = obj18;
                                                obj4 = obj16;
                                                objArr222 = objArr;
                                                zArr422 = zArr;
                                                zArr522 = zArr2;
                                                zArr622 = zArr3;
                                                z12 = z11 ? 1 : 0;
                                                random = random3;
                                                i4622 = i3;
                                            } catch (Throwable th33) {
                                                th = th33;
                                                i3 = i4622;
                                                z11 = z14 ? 1 : 0;
                                                zArr3 = zArr622;
                                                obj2 = th;
                                                cls = cls5;
                                                s = s822;
                                                z16 = z11;
                                                c3 = 4;
                                                z5 = z16;
                                                int currentTimeMillis32222222 = (int) System.currentTimeMillis();
                                                int i542222222 = -(-(i3 * (-69)));
                                                int i552222222 = (71 & i542222222) + (i542222222 | 71);
                                                int i562222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                int i572222222 = ~((i3 ^ currentTimeMillis32222222) | (i3 & currentTimeMillis32222222));
                                                int i582222222 = -(-(((i562222222 & i572222222) | (i562222222 ^ i572222222)) * (-140)));
                                                int i592222222 = (i552222222 & i582222222) + (i582222222 | i552222222);
                                                int i602222222 = (i3 ^ 1) | (i3 & 1);
                                                int i612222222 = (i592222222 - (~(-(-((~((i602222222 & currentTimeMillis32222222) | (i602222222 ^ currentTimeMillis32222222))) * 70))))) - 1;
                                                int i622222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                i4 = i3;
                                                int i632222222 = ~i4;
                                                int i642222222 = i622222222 | (~((i632222222 & 1) | (i632222222 ^ 1)));
                                                int i652222222 = ~((currentTimeMillis32222222 & 1) | (currentTimeMillis32222222 ^ 1));
                                                int i662222222 = -(-(((i652222222 & i642222222) | (i642222222 ^ i652222222)) * 70));
                                                i5 = (i612222222 & i662222222) + (i662222222 | i612222222);
                                                while (i5 < 7) {
                                                }
                                                int i672222222 = $11;
                                                i6 = (i672222222 & 57) + (i672222222 | 57);
                                                $10 = i6 % 128;
                                                if (i6 % 2 == 0) {
                                                }
                                                Object[] objArr42222222 = {$$c(b, b2, b3), obj2};
                                                byte[] bArr162222222 = $$a;
                                                throw ((Throwable) Class.forName($$c(bArr162222222[14], bArr162222222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42222222));
                                            }
                                            obj2 = th;
                                            cls = cls5;
                                            s = s822;
                                            z16 = z11;
                                            c3 = 4;
                                            z5 = z16;
                                            int currentTimeMillis322222222 = (int) System.currentTimeMillis();
                                            int i5422222222 = -(-(i3 * (-69)));
                                            int i5522222222 = (71 & i5422222222) + (i5422222222 | 71);
                                            int i5622222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                            int i5722222222 = ~((i3 ^ currentTimeMillis322222222) | (i3 & currentTimeMillis322222222));
                                            int i5822222222 = -(-(((i5622222222 & i5722222222) | (i5622222222 ^ i5722222222)) * (-140)));
                                            int i5922222222 = (i5522222222 & i5822222222) + (i5822222222 | i5522222222);
                                            int i6022222222 = (i3 ^ 1) | (i3 & 1);
                                            int i6122222222 = (i5922222222 - (~(-(-((~((i6022222222 & currentTimeMillis322222222) | (i6022222222 ^ currentTimeMillis322222222))) * 70))))) - 1;
                                            int i6222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                            i4 = i3;
                                            int i6322222222 = ~i4;
                                            int i6422222222 = i6222222222 | (~((i6322222222 & 1) | (i6322222222 ^ 1)));
                                            int i6522222222 = ~((currentTimeMillis322222222 & 1) | (currentTimeMillis322222222 ^ 1));
                                            int i6622222222 = -(-(((i6522222222 & i6422222222) | (i6422222222 ^ i6522222222)) * 70));
                                            i5 = (i6122222222 & i6622222222) + (i6622222222 | i6122222222);
                                            while (i5 < 7) {
                                            }
                                            int i6722222222 = $11;
                                            i6 = (i6722222222 & 57) + (i6722222222 | 57);
                                            $10 = i6 % 128;
                                            if (i6 % 2 == 0) {
                                            }
                                            Object[] objArr422222222 = {$$c(b, b2, b3), obj2};
                                            byte[] bArr1622222222 = $$a;
                                            throw ((Throwable) Class.forName($$c(bArr1622222222[14], bArr1622222222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr422222222));
                                        }
                                        obj8 = obj4;
                                        z4 = z12;
                                        i3 = i4622;
                                        obj9 = obj5;
                                        objArr = objArr222;
                                        zArr = zArr422;
                                        zArr2 = zArr522;
                                        zArr3 = zArr622;
                                        obj10 = obj7;
                                    } else {
                                        str2 = $$c;
                                        z4 = z2222 ? 1 : 0;
                                        i3 = i4622;
                                        objArr = objArr222;
                                        zArr = zArr422;
                                        zArr2 = zArr522;
                                        zArr3 = zArr622;
                                        obj6 = null;
                                        obj10 = null;
                                        obj8 = null;
                                        obj9 = null;
                                    }
                                    try {
                                        byte[] bArr25 = $$a;
                                        String $$c4 = $$c(bArr25[426], bArr25[694], (short) 789);
                                        try {
                                            try {
                                                Object invoke6 = Class.class.getMethod($$c(bArr25[79], bArr25[4], (short) 741), String.class).invoke(AFa1hSDK.class, $$c4);
                                                try {
                                                    Class<?> cls14 = Class.forName($$c(bArr25[80], bArr25[26], (short) 731));
                                                    byte b24 = bArr25[56];
                                                    try {
                                                        byte b25 = bArr25[4];
                                                        String str5 = (String) cls14.getMethod($$c(b24, b25, (short) ((b25 ^ 704) | (b25 & 704))), null).invoke(invoke6, null);
                                                        StringBuilder sb6 = new StringBuilder();
                                                        byte b26 = bArr25[7];
                                                        short s13 = (short) 714;
                                                        ZipFile zipFile10 = new ZipFile(str5.substring(5, str5.lastIndexOf(sb6.append($$c(b26, (byte) ((b26 ^ 86) | (b26 & 86)), s13)).append($$c4).toString())));
                                                        try {
                                                            bArr2 = new byte[7308];
                                                            bArr = zipFile10.getInputStream(zipFile10.getEntry($$c4.substring(1)));
                                                            int i102 = $10 + 33;
                                                            $11 = i102 % 128;
                                                            r8 = 2;
                                                            int i103 = i102 % 2;
                                                        } catch (Throwable th34) {
                                                            th = th34;
                                                            cls = cls5;
                                                            zipFile = zipFile10;
                                                            s = s822;
                                                        }
                                                        try {
                                                            ?? cls15 = Class.forName($$c(bArr25[776], bArr25[26], s13));
                                                            short s14 = (short) 688;
                                                            r8 = Class.forName($$c(bArr25[14], bArr25[26], s14));
                                                            bArr = cls15.getDeclaredConstructor(new Class[]{r8}).newInstance(bArr);
                                                            try {
                                                                try {
                                                                    short s15 = (short) 670;
                                                                    obj12 = obj6;
                                                                    obj13 = obj10;
                                                                    r8 = 0;
                                                                    bArr = Class.forName($$c(bArr25[105], bArr25[26], s15)).getDeclaredConstructor(Class.forName($$c(bArr25[14], bArr25[26], s14))).newInstance(bArr);
                                                                    int i104 = $11 + 9;
                                                                    $10 = i104 % 128;
                                                                    int i105 = i104 % 2;
                                                                    try {
                                                                        try {
                                                                            Class.forName($$c(bArr25[105], bArr25[26], s15)).getMethod($$c(bArr25[49], bArr25[46], (short) 648), cls5).invoke(bArr, bArr2);
                                                                            try {
                                                                                Class<?> cls16 = Class.forName($$c(bArr25[105], bArr25[26], s15));
                                                                                byte b27 = bArr25[16];
                                                                                try {
                                                                                    byte b28 = bArr25[107];
                                                                                    cls16.getMethod($$c(b27, b28, (short) ((b28 ^ 777) | (b28 & 777))), null).invoke(bArr, null);
                                                                                    i10 = 20;
                                                                                    s2 = 7258;
                                                                                    str3 = str2;
                                                                                    cls2 = null;
                                                                                    i11 = 1;
                                                                                } catch (Throwable th35) {
                                                                                    th = th35;
                                                                                    Throwable th36 = th;
                                                                                    Throwable cause19 = th36.getCause();
                                                                                    if (cause19 == null) {
                                                                                        throw th36;
                                                                                    }
                                                                                    throw cause19;
                                                                                }
                                                                            } catch (Throwable th37) {
                                                                                th = th37;
                                                                            }
                                                                        } catch (Throwable th38) {
                                                                            th = th38;
                                                                            Throwable th39 = th;
                                                                            Throwable cause20 = th39.getCause();
                                                                            if (cause20 == null) {
                                                                                throw th39;
                                                                            }
                                                                            throw cause20;
                                                                        }
                                                                    } catch (Throwable th40) {
                                                                        th = th40;
                                                                    }
                                                                } catch (Throwable th41) {
                                                                    Throwable cause21 = th41.getCause();
                                                                    if (cause21 == null) {
                                                                        throw th41;
                                                                    }
                                                                    throw cause21;
                                                                }
                                                            } catch (Throwable th42) {
                                                                th = th42;
                                                            }
                                                            while (true) {
                                                                long j = i11;
                                                                int i106 = 0;
                                                                while (i106 < bArr2.length) {
                                                                    try {
                                                                        j = ((bArr2[i106] + (j << 6)) + (j << 16)) - j;
                                                                        int i107 = i106 + 52;
                                                                        i106 = (i107 ^ (-51)) + ((i107 & (-51)) << 1);
                                                                        zipFile10 = zipFile10;
                                                                        cls2 = cls2;
                                                                    } catch (Throwable th43) {
                                                                        th = th43;
                                                                        zipFile5 = zipFile10;
                                                                        cls = cls5;
                                                                        s = s822;
                                                                        zipFile = zipFile5;
                                                                        zipFile4 = zipFile;
                                                                        c4 = 4;
                                                                        zipFile3 = zipFile4;
                                                                        bArr = zipFile3;
                                                                        r8 = c4;
                                                                        th = th;
                                                                        zipFile2 = bArr;
                                                                        c2 = r8;
                                                                        try {
                                                                            try {
                                                                                zipFile2.close();
                                                                                throw th;
                                                                            } catch (Throwable th44) {
                                                                                th.addSuppressed(th44);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th45) {
                                                                            th = th45;
                                                                            obj2 = th;
                                                                            c3 = c2;
                                                                            z5 = z4;
                                                                            int currentTimeMillis3222222222 = (int) System.currentTimeMillis();
                                                                            int i54222222222 = -(-(i3 * (-69)));
                                                                            int i55222222222 = (71 & i54222222222) + (i54222222222 | 71);
                                                                            int i56222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                            int i57222222222 = ~((i3 ^ currentTimeMillis3222222222) | (i3 & currentTimeMillis3222222222));
                                                                            int i58222222222 = -(-(((i56222222222 & i57222222222) | (i56222222222 ^ i57222222222)) * (-140)));
                                                                            int i59222222222 = (i55222222222 & i58222222222) + (i58222222222 | i55222222222);
                                                                            int i60222222222 = (i3 ^ 1) | (i3 & 1);
                                                                            int i61222222222 = (i59222222222 - (~(-(-((~((i60222222222 & currentTimeMillis3222222222) | (i60222222222 ^ currentTimeMillis3222222222))) * 70))))) - 1;
                                                                            int i62222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                            i4 = i3;
                                                                            int i63222222222 = ~i4;
                                                                            int i64222222222 = i62222222222 | (~((i63222222222 & 1) | (i63222222222 ^ 1)));
                                                                            int i65222222222 = ~((currentTimeMillis3222222222 & 1) | (currentTimeMillis3222222222 ^ 1));
                                                                            int i66222222222 = -(-(((i65222222222 & i64222222222) | (i64222222222 ^ i65222222222)) * 70));
                                                                            i5 = (i61222222222 & i66222222222) + (i66222222222 | i61222222222);
                                                                            while (i5 < 7) {
                                                                            }
                                                                            int i67222222222 = $11;
                                                                            i6 = (i67222222222 & 57) + (i67222222222 | 57);
                                                                            $10 = i6 % 128;
                                                                            if (i6 % 2 == 0) {
                                                                            }
                                                                            Object[] objArr4222222222 = {$$c(b, b2, b3), obj2};
                                                                            byte[] bArr16222222222 = $$a;
                                                                            throw ((Throwable) Class.forName($$c(bArr16222222222[14], bArr16222222222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr4222222222));
                                                                        }
                                                                    }
                                                                }
                                                                zipFile5 = zipFile10;
                                                                Class cls17 = cls2;
                                                                try {
                                                                    bArr2[i10 + 86] = (byte) (bArr2[i10 + 7287] - 98);
                                                                    int length = bArr2.length;
                                                                    int i108 = -i10;
                                                                    int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                    int i109 = i108 * (-167);
                                                                    int i110 = length * (-167);
                                                                    int i111 = ((i109 | i110) << 1) - (i109 ^ i110);
                                                                    int i112 = ~i108;
                                                                    int i113 = ~length;
                                                                    int i114 = ~((i112 ^ i113) | (i112 & i113));
                                                                    int i115 = ~((i113 ^ currentTimeMillis7) | (i113 & currentTimeMillis7));
                                                                    int i116 = ((i114 ^ i115) | (i114 & i115)) * 336;
                                                                    int i117 = (i111 & i116) + (i111 | i116);
                                                                    int i118 = ~(i108 | length);
                                                                    s = s2;
                                                                    int i119 = ~(i108 | currentTimeMillis7);
                                                                    int i120 = -(-(((i118 ^ i119) | (i119 & i118)) * (-168)));
                                                                    int i121 = (i117 & i120) + (i120 | i117);
                                                                    int i122 = ~length;
                                                                    int i123 = ~((~currentTimeMillis7) | i108);
                                                                    int i124 = ((i122 & i123) | (i122 ^ i123)) * 168;
                                                                    try {
                                                                        Object[] objArr9 = new Object[3];
                                                                        try {
                                                                            objArr9[2] = Integer.valueOf((i121 & i124) + (i124 | i121));
                                                                            objArr9[1] = Integer.valueOf(i10);
                                                                            objArr9[0] = bArr2;
                                                                            bArr = $$a;
                                                                            ?? cls18 = Class.forName($$c((byte) bArr[228], (byte) bArr[26], (short) 640));
                                                                            try {
                                                                                Class[] clsArr2 = new Class[3];
                                                                                clsArr2[0] = cls5;
                                                                                clsArr2[1] = Integer.TYPE;
                                                                                clsArr2[2] = Integer.TYPE;
                                                                                Object newInstance4 = cls18.getDeclaredConstructor(clsArr2).newInstance(objArr9);
                                                                                Object obj20 = i;
                                                                                if (obj20 == null) {
                                                                                    try {
                                                                                        force = j;
                                                                                        int uptimeMillis = (int) (((SystemClock.uptimeMillis() >> 48) + 3427844526219725668L) ^ j);
                                                                                        int globalActionKeyTimeout = (int) (force ^ ((-3427844525716548099L) - (ViewConfiguration.getGlobalActionKeyTimeout() >> 32)));
                                                                                        int[] iArr = new int[(int) (force ^ ((SystemClock.currentThreadTimeMillis() >> 48) - 3427844525716548102L))];
                                                                                        int currentThreadTimeMillis = (int) (force ^ ((-3427844525716548104L) - (SystemClock.currentThreadTimeMillis() >> 48)));
                                                                                        long j2 = v;
                                                                                        i12 = i10;
                                                                                        int i125 = -View.getDefaultSize(0, 0);
                                                                                        s3 = s822;
                                                                                        try {
                                                                                            int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                                            str4 = str3;
                                                                                            int i126 = ~i125;
                                                                                            int i127 = ~((i126 ^ (-33)) | (i126 & (-33)) | currentTimeMillis8);
                                                                                            s4 = s13;
                                                                                            int i128 = (~currentTimeMillis8) | i125;
                                                                                            int i129 = ~((i128 ^ 32) | (i128 & 32));
                                                                                            int i130 = (i125 * (-317)) + 10208 + (((i127 ^ i129) | (i127 & i129)) * (-318));
                                                                                            int i131 = ~(((-33) & i125) | ((-33) ^ i125));
                                                                                            int i132 = ~(i125 | currentTimeMillis8);
                                                                                            int i133 = i130 + (((i131 ^ i132) | (i131 & i132)) * (-318));
                                                                                            int i134 = ~i125;
                                                                                            int i135 = ~((i134 & currentTimeMillis8) | (i134 ^ currentTimeMillis8));
                                                                                            int i136 = -(-(((i135 & (-33)) | ((-33) ^ i135)) * 318));
                                                                                            int i137 = (int) (j2 >>> ((byte) ((i133 & i136) + (i136 | i133))));
                                                                                            iArr[currentThreadTimeMillis] = (i137 | uptimeMillis) & (~(i137 & uptimeMillis));
                                                                                            int elapsedRealtimeNanos = (int) (force ^ ((SystemClock.elapsedRealtimeNanos() >> 60) - 3427844525716548103L));
                                                                                            int i138 = (int) v;
                                                                                            iArr[elapsedRealtimeNanos] = (uptimeMillis & (~i138)) | ((~uptimeMillis) & i138);
                                                                                            int i139 = afWarnLog;
                                                                                            byte[] bArr26 = afErrorLogForExcManagerOnly;
                                                                                            try {
                                                                                                Object[] objArr10 = new Object[6];
                                                                                                try {
                                                                                                    try {
                                                                                                        objArr10[5] = Integer.valueOf(afVerboseLog);
                                                                                                        objArr10[4] = Integer.valueOf(globalActionKeyTimeout);
                                                                                                        objArr10[3] = bArr26;
                                                                                                        objArr10[2] = Integer.valueOf(i139);
                                                                                                        objArr10[1] = iArr;
                                                                                                        objArr10[0] = newInstance4;
                                                                                                        ?? cls19 = Class.forName($$c((byte) bArr[74], (byte) bArr[107], (short) 613));
                                                                                                        try {
                                                                                                            Class[] clsArr3 = new Class[6];
                                                                                                            clsArr3[0] = Class.forName($$c((byte) bArr[14], (byte) bArr[26], (short) 688));
                                                                                                            clsArr3[1] = int[].class;
                                                                                                            clsArr3[2] = Integer.TYPE;
                                                                                                            clsArr3[3] = cls5;
                                                                                                            clsArr3[4] = Integer.TYPE;
                                                                                                            try {
                                                                                                                clsArr3[5] = Integer.TYPE;
                                                                                                                newInstance = cls19.getDeclaredConstructor(clsArr3).newInstance(objArr10);
                                                                                                            } catch (Throwable th46) {
                                                                                                                th = th46;
                                                                                                                Throwable th47 = th;
                                                                                                                cause2 = th47.getCause();
                                                                                                                if (cause2 != null) {
                                                                                                                    throw th47;
                                                                                                                }
                                                                                                                throw cause2;
                                                                                                            }
                                                                                                        } catch (Throwable th48) {
                                                                                                            th = th48;
                                                                                                            Throwable th472 = th;
                                                                                                            cause2 = th472.getCause();
                                                                                                            if (cause2 != null) {
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th49) {
                                                                                                        th = th49;
                                                                                                    }
                                                                                                } catch (Throwable th50) {
                                                                                                    th = th50;
                                                                                                }
                                                                                            } catch (Throwable th51) {
                                                                                                th = th51;
                                                                                            }
                                                                                        } catch (Throwable th52) {
                                                                                            th = th52;
                                                                                            cls = cls5;
                                                                                            zipFile = zipFile5;
                                                                                            s = s3;
                                                                                            zipFile4 = zipFile;
                                                                                            c4 = 4;
                                                                                            zipFile3 = zipFile4;
                                                                                            bArr = zipFile3;
                                                                                            r8 = c4;
                                                                                            th = th;
                                                                                            zipFile2 = bArr;
                                                                                            c2 = r8;
                                                                                            zipFile2.close();
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th53) {
                                                                                        th = th53;
                                                                                        s3 = s822;
                                                                                    }
                                                                                } else {
                                                                                    i12 = i10;
                                                                                    str4 = str3;
                                                                                    s4 = s13;
                                                                                    s3 = s822;
                                                                                    afDebugLog = j;
                                                                                    int zoomControlsTimeout = (int) (j ^ (8727893706528661794L - (ViewConfiguration.getZoomControlsTimeout() >> 32)));
                                                                                    try {
                                                                                        Object[] objArr11 = new Object[3];
                                                                                        try {
                                                                                            objArr11[2] = Short.valueOf((short) (afDebugLog ^ ((-8727893705603485974L) - (SystemClock.currentThreadTimeMillis() >> 48))));
                                                                                            objArr11[1] = Integer.valueOf(zoomControlsTimeout);
                                                                                            objArr11[0] = newInstance4;
                                                                                            try {
                                                                                                Class<?> cls20 = Class.forName($$c((byte) bArr[511], (byte) bArr[107], (short) 583), true, (ClassLoader) e);
                                                                                                String $$c5 = $$c((byte) bArr[12], (byte) bArr[85], (short) 551);
                                                                                                try {
                                                                                                    Class<?>[] clsArr4 = new Class[3];
                                                                                                    clsArr4[0] = Class.forName($$c((byte) bArr[14], (byte) bArr[26], (short) 688));
                                                                                                    clsArr4[1] = Integer.TYPE;
                                                                                                    clsArr4[2] = Short.TYPE;
                                                                                                    newInstance = cls20.getMethod($$c5, clsArr4).invoke(obj20, objArr11);
                                                                                                } catch (Throwable th54) {
                                                                                                    th = th54;
                                                                                                    Throwable th55 = th;
                                                                                                    cause3 = th55.getCause();
                                                                                                    if (cause3 == null) {
                                                                                                        throw th55;
                                                                                                    }
                                                                                                    throw cause3;
                                                                                                }
                                                                                            } catch (Throwable th56) {
                                                                                                th = th56;
                                                                                                Throwable th552 = th;
                                                                                                cause3 = th552.getCause();
                                                                                                if (cause3 == null) {
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th57) {
                                                                                            th = th57;
                                                                                            Throwable th5522 = th;
                                                                                            cause3 = th5522.getCause();
                                                                                            if (cause3 == null) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th58) {
                                                                                        th = th58;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    r8 = (short) 688;
                                                                                    Class.forName($$c((byte) bArr[14], (byte) bArr[26], r8)).getMethod($$c((byte) bArr[55], (byte) bArr[16], (short) 537), Long.TYPE).invoke(newInstance, 22);
                                                                                } catch (Throwable th59) {
                                                                                    th = th59;
                                                                                    cls = cls5;
                                                                                    zipFile = zipFile5;
                                                                                    s = s3;
                                                                                    zipFile4 = zipFile;
                                                                                    c4 = 4;
                                                                                    zipFile3 = zipFile4;
                                                                                    bArr = zipFile3;
                                                                                    r8 = c4;
                                                                                    th = th;
                                                                                    zipFile2 = bArr;
                                                                                    c2 = r8;
                                                                                    zipFile2.close();
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th60) {
                                                                                th = th60;
                                                                                Throwable th61 = th;
                                                                                cause = th61.getCause();
                                                                                if (cause != null) {
                                                                                    throw th61;
                                                                                }
                                                                                throw cause;
                                                                            }
                                                                        } catch (Throwable th62) {
                                                                            th = th62;
                                                                            Throwable th612 = th;
                                                                            cause = th612.getCause();
                                                                            if (cause != null) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th63) {
                                                                        th = th63;
                                                                    }
                                                                } catch (Throwable th64) {
                                                                    th = th64;
                                                                    cls = cls5;
                                                                    s = s822;
                                                                    zipFile = zipFile5;
                                                                    zipFile4 = zipFile;
                                                                    c4 = 4;
                                                                    zipFile3 = zipFile4;
                                                                    bArr = zipFile3;
                                                                    r8 = c4;
                                                                    th = th;
                                                                    zipFile2 = bArr;
                                                                    c2 = r8;
                                                                    zipFile2.close();
                                                                    throw th;
                                                                }
                                                                if (!(!z8)) {
                                                                    try {
                                                                        Object obj21 = i;
                                                                        if (obj21 == null) {
                                                                            int i140 = $10;
                                                                            int i141 = ((i140 | 125) << 1) - (i140 ^ 125);
                                                                            $11 = i141 % 128;
                                                                            int i142 = i141 % 2;
                                                                            obj14 = obj9;
                                                                        } else {
                                                                            obj14 = obj12;
                                                                        }
                                                                        if (obj21 == null) {
                                                                            int i143 = $10;
                                                                            int i144 = (i143 ^ 85) + ((i143 & 85) << 1);
                                                                            $11 = i144 % 128;
                                                                            if (i144 % 2 == 0) {
                                                                                int i145 = 87 / 0;
                                                                            }
                                                                            obj15 = obj13;
                                                                        } else {
                                                                            obj15 = obj8;
                                                                        }
                                                                        Method method10 = Class.forName($$c((byte) bArr[14], (byte) bArr[26], r8)).getMethod($$c((byte) bArr[55], (byte) bArr[46], (short) 534), cls5, Integer.TYPE, Integer.TYPE);
                                                                        ?? cls21 = Class.forName($$c((byte) bArr[114], (byte) bArr[26], (short) 820));
                                                                        try {
                                                                            clsArr = new Class[1];
                                                                            s5 = s3;
                                                                        } catch (Exception e4) {
                                                                            e = e4;
                                                                            cls = cls5;
                                                                            s5 = s3;
                                                                        } catch (Throwable th65) {
                                                                            th = th65;
                                                                            cls = cls5;
                                                                            s5 = s3;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                clsArr[0] = Class.forName($$c((byte) bArr[80], (byte) bArr[26], s5));
                                                                                Object newInstance5 = cls21.getConstructor(clsArr).newInstance(obj14);
                                                                                if (z4) {
                                                                                    int i146 = $10;
                                                                                    int i147 = (i146 & 123) + (i146 | 123);
                                                                                    $11 = i147 % 128;
                                                                                    int i148 = i147 % 2;
                                                                                    try {
                                                                                        ((Boolean) Class.forName($$c((byte) bArr[80], (byte) bArr[26], s5)).getMethod($$c((byte) bArr[79], (byte) bArr[16], (short) 531), null).invoke(obj14, null)).booleanValue();
                                                                                    } catch (Throwable th66) {
                                                                                        Throwable cause22 = th66.getCause();
                                                                                        if (cause22 == null) {
                                                                                            throw th66;
                                                                                        }
                                                                                        throw cause22;
                                                                                    }
                                                                                }
                                                                                byte[] bArr27 = new byte[1024];
                                                                                byte b29 = (byte) bArr[16];
                                                                                byte b30 = (byte) bArr[7];
                                                                                Method method11 = cls21.getMethod($$c(b29, b30, (short) ((b30 & 517) | (b30 ^ 517))), cls5, Integer.TYPE, Integer.TYPE);
                                                                                int i149 = s;
                                                                                while (i149 > 0) {
                                                                                    int intValue2 = ((Integer) method10.invoke(newInstance, bArr27, 0, Integer.valueOf(Math.min(1024, i149)))).intValue();
                                                                                    if (intValue2 == -1) {
                                                                                        break;
                                                                                    }
                                                                                    Method method12 = method10;
                                                                                    method11.invoke(newInstance5, bArr27, 0, Integer.valueOf(intValue2));
                                                                                    int i150 = -intValue2;
                                                                                    boolean z29 = z8;
                                                                                    int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                    Method method13 = method11;
                                                                                    int i151 = ~i150;
                                                                                    byte[] bArr28 = bArr27;
                                                                                    int i152 = ~i149;
                                                                                    int i153 = (i150 * (-209)) + (i149 * (-209)) + ((~((i151 ^ i152) | (i151 & i152))) * 210);
                                                                                    int i154 = ~i149;
                                                                                    Class<byte[]> cls22 = cls5;
                                                                                    int i155 = ~currentTimeMillis9;
                                                                                    int i156 = ~((i154 ^ i155) | (i155 & i154));
                                                                                    int i157 = ~((~i150) | currentTimeMillis9);
                                                                                    int i158 = -(-(((i156 ^ i157) | (i156 & i157)) * 210));
                                                                                    int i159 = (i153 & i158) + (i158 | i153);
                                                                                    int i160 = ~currentTimeMillis9;
                                                                                    int i161 = ~((i160 & i151) | (i151 ^ i160) | i149);
                                                                                    int i162 = ~((i152 ^ i150) | (i152 & i150) | currentTimeMillis9);
                                                                                    int i163 = ((i161 & i162) | (i161 ^ i162)) * 210;
                                                                                    i149 = (i159 & i163) + (i163 | i159);
                                                                                    method10 = method12;
                                                                                    method11 = method13;
                                                                                    bArr27 = bArr28;
                                                                                    cls5 = cls22;
                                                                                    z8 = z29;
                                                                                }
                                                                                cls = cls5;
                                                                                z17 = z8;
                                                                                try {
                                                                                    byte[] bArr29 = $$a;
                                                                                    Object invoke7 = cls21.getMethod($$c(bArr29[16], bArr29[4], (short) InputDeviceCompat.SOURCE_DPAD), new Class[0]).invoke(newInstance5, new Object[0]);
                                                                                    byte b31 = bArr29[72];
                                                                                    byte b32 = bArr29[26];
                                                                                    Class.forName($$c(b31, b32, (short) ((b32 ^ 496) | (b32 & 496)))).getMethod($$c(bArr29[55], bArr29[16], (short) 488), new Class[0]).invoke(invoke7, new Object[0]);
                                                                                    byte b33 = bArr29[16];
                                                                                    byte b34 = bArr29[107];
                                                                                    cls21.getMethod($$c(b33, b34, (short) ((b34 ^ 777) | (b34 & 777))), new Class[0]).invoke(newInstance5, new Object[0]);
                                                                                    Method declaredMethod2 = Class.forName($$c(bArr29[107], bArr29[18], (short) 485)).getDeclaredMethod($$c(bArr29[56], bArr29[80], (short) 465), String.class, String.class, Integer.TYPE);
                                                                                    try {
                                                                                        short s16 = (short) 459;
                                                                                        Object invoke8 = Class.forName($$c(bArr29[80], bArr29[26], s5)).getMethod($$c(bArr29[12], bArr29[4], s16), null).invoke(obj14, null);
                                                                                        int i164 = $11 + 73;
                                                                                        $10 = i164 % 128;
                                                                                        int i165 = i164 % 2;
                                                                                        try {
                                                                                            invoke4 = declaredMethod2.invoke(null, invoke8, Class.forName($$c(bArr29[80], bArr29[26], s5)).getMethod($$c(bArr29[12], bArr29[4], s16), null).invoke(obj15, null), 0);
                                                                                            int i166 = 2 % 2;
                                                                                            try {
                                                                                                try {
                                                                                                    short s17 = (short) 445;
                                                                                                    ((Boolean) Class.forName($$c(bArr29[80], bArr29[26], s5)).getMethod($$c(bArr29[46], bArr29[18], s17), null).invoke(obj14, null)).booleanValue();
                                                                                                    try {
                                                                                                        ((Boolean) Class.forName($$c(bArr29[80], bArr29[26], s5)).getMethod($$c(bArr29[46], bArr29[18], s17), null).invoke(obj15, null)).booleanValue();
                                                                                                        if (e == null) {
                                                                                                            int i167 = $10 + 105;
                                                                                                            $11 = i167 % 128;
                                                                                                            if (i167 % 2 == 0) {
                                                                                                                throw null;
                                                                                                            }
                                                                                                            try {
                                                                                                                byte b35 = bArr29[26];
                                                                                                                byte b36 = bArr29[4];
                                                                                                                e = Class.class.getMethod($$c(b35, b36, (short) ((b36 ^ 424) | (b36 & 424))), null).invoke(AFa1hSDK.class, null);
                                                                                                            } catch (Throwable th67) {
                                                                                                                Throwable cause23 = th67.getCause();
                                                                                                                if (cause23 == null) {
                                                                                                                    throw th67;
                                                                                                                }
                                                                                                                throw cause23;
                                                                                                            }
                                                                                                        }
                                                                                                        i13 = r8;
                                                                                                        s = s5;
                                                                                                        s6 = s4;
                                                                                                    } catch (Throwable th68) {
                                                                                                        Throwable cause24 = th68.getCause();
                                                                                                        if (cause24 == null) {
                                                                                                            throw th68;
                                                                                                        }
                                                                                                        throw cause24;
                                                                                                    }
                                                                                                } catch (Throwable th69) {
                                                                                                    Throwable cause25 = th69.getCause();
                                                                                                    if (cause25 == null) {
                                                                                                        throw th69;
                                                                                                    }
                                                                                                    throw cause25;
                                                                                                }
                                                                                            } catch (Throwable th70) {
                                                                                                th = th70;
                                                                                                th = th;
                                                                                                s = s5;
                                                                                                zipFile6 = zipFile5;
                                                                                                c5 = 4;
                                                                                                zipFile2 = zipFile6;
                                                                                                c2 = c5;
                                                                                                zipFile2.close();
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (Throwable th71) {
                                                                                            Throwable cause26 = th71.getCause();
                                                                                            if (cause26 == null) {
                                                                                                throw th71;
                                                                                            }
                                                                                            throw cause26;
                                                                                        }
                                                                                    } catch (Throwable th72) {
                                                                                        Throwable cause27 = th72.getCause();
                                                                                        if (cause27 == null) {
                                                                                            throw th72;
                                                                                        }
                                                                                        throw cause27;
                                                                                    }
                                                                                } catch (Throwable th73) {
                                                                                    th = th73;
                                                                                    Throwable th74 = th;
                                                                                    try {
                                                                                        byte[] bArr30 = $$a;
                                                                                        short s18 = (short) 445;
                                                                                        ((Boolean) Class.forName($$c(bArr30[80], bArr30[26], s5)).getMethod($$c(bArr30[46], bArr30[18], s18), null).invoke(obj14, null)).booleanValue();
                                                                                        try {
                                                                                            ((Boolean) Class.forName($$c(bArr30[80], bArr30[26], s5)).getMethod($$c(bArr30[46], bArr30[18], s18), null).invoke(obj15, null)).booleanValue();
                                                                                            throw th74;
                                                                                        } catch (Throwable th75) {
                                                                                            Throwable cause28 = th75.getCause();
                                                                                            if (cause28 == null) {
                                                                                                throw th75;
                                                                                            }
                                                                                            throw cause28;
                                                                                        }
                                                                                    } catch (Throwable th76) {
                                                                                        Throwable cause29 = th76.getCause();
                                                                                        if (cause29 == null) {
                                                                                            throw th76;
                                                                                        }
                                                                                        throw cause29;
                                                                                    }
                                                                                }
                                                                            } catch (Exception e5) {
                                                                                e = e5;
                                                                                cls = cls5;
                                                                                Exception exc2 = e;
                                                                                StringBuilder sb7 = new StringBuilder();
                                                                                byte[] bArr31 = $$a;
                                                                                short s19 = (short) 854;
                                                                                try {
                                                                                    throw ((Throwable) Class.forName($$c(bArr31[14], bArr31[26], s19)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb7.append($$c(bArr31[16], bArr31[126], (short) 521)).append(obj14).append($$c(bArr31[7], bArr31[3], s19)).toString(), exc2));
                                                                                } catch (Throwable th77) {
                                                                                    Throwable cause30 = th77.getCause();
                                                                                    if (cause30 == null) {
                                                                                        throw th77;
                                                                                    }
                                                                                    throw cause30;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th78) {
                                                                            th = th78;
                                                                            cls = cls5;
                                                                            Throwable th742 = th;
                                                                            byte[] bArr302 = $$a;
                                                                            short s182 = (short) 445;
                                                                            ((Boolean) Class.forName($$c(bArr302[80], bArr302[26], s5)).getMethod($$c(bArr302[46], bArr302[18], s182), null).invoke(obj14, null)).booleanValue();
                                                                            ((Boolean) Class.forName($$c(bArr302[80], bArr302[26], s5)).getMethod($$c(bArr302[46], bArr302[18], s182), null).invoke(obj15, null)).booleanValue();
                                                                            throw th742;
                                                                        }
                                                                    } catch (Throwable th79) {
                                                                        th = th79;
                                                                        cls = cls5;
                                                                        s5 = s3;
                                                                    }
                                                                } else {
                                                                    cls = cls5;
                                                                    z17 = z8;
                                                                    short s20 = s3;
                                                                    try {
                                                                        ?? cls23 = Class.forName($$c((byte) bArr[228], (byte) bArr[26], (short) 427));
                                                                        ?? cls24 = Class.forName($$c((byte) bArr[14], (byte) bArr[26], r8));
                                                                        newInstance2 = cls23.getConstructor(new Class[]{cls24}).newInstance(newInstance);
                                                                        byte b37 = (byte) bArr[80];
                                                                        try {
                                                                            byte b38 = (byte) bArr[4];
                                                                            invoke5 = cls23.getMethod($$c(b37, b38, (short) ((b38 ^ ByteCompanionObject.MIN_VALUE) | (b38 & ByteCompanionObject.MIN_VALUE))), new Class[0]).invoke(newInstance2, new Object[0]);
                                                                            Class<?> cls25 = Class.forName($$c((byte) bArr[72], (byte) bArr[26], (short) 389));
                                                                            byte b39 = (byte) bArr[56];
                                                                            try {
                                                                                byte b40 = (byte) bArr[4];
                                                                                method = cls25.getMethod($$c(b39, b40, (short) (b40 | 352)), new Class[0]);
                                                                                try {
                                                                                    method2 = cls24.getMethod($$c((byte) bArr[55], (byte) bArr[46], (short) 534), cls);
                                                                                } catch (Throwable th80) {
                                                                                    th = th80;
                                                                                    s = s20;
                                                                                    bArr = zipFile5;
                                                                                    r8 = 4;
                                                                                }
                                                                            } catch (Throwable th81) {
                                                                                th = th81;
                                                                                c9 = 4;
                                                                            }
                                                                        } catch (Throwable th82) {
                                                                            th = th82;
                                                                            c9 = 4;
                                                                        }
                                                                    } catch (Throwable th83) {
                                                                        th = th83;
                                                                        s = s20;
                                                                    }
                                                                    try {
                                                                        short s21 = s4;
                                                                        Object newInstance6 = Class.forName($$c((byte) bArr[776], (byte) bArr[26], s21)).getDeclaredConstructor(Class.forName($$c((byte) bArr[14], (byte) bArr[26], r8))).newInstance(newInstance2);
                                                                        try {
                                                                            byte b41 = (byte) bArr[26];
                                                                            try {
                                                                                byte b42 = (byte) bArr[4];
                                                                                Object invoke9 = Class.class.getMethod($$c(b41, b42, (short) ((b42 ^ 424) | (b42 & 424))), null).invoke(AFa1hSDK.class, null);
                                                                                ?? cls26 = Class.forName($$c((byte) (-bArr[587]), (byte) bArr[26], (short) 362));
                                                                                Object newInstance7 = cls26.getConstructor(new Class[0]).newInstance(new Object[0]);
                                                                                byte b43 = (byte) bArr[16];
                                                                                byte b44 = (byte) bArr[7];
                                                                                String $$c6 = $$c(b43, b44, (short) ((b44 ^ 517) | (b44 & 517)));
                                                                                try {
                                                                                    Class[] clsArr5 = new Class[3];
                                                                                    clsArr5[0] = cls;
                                                                                    clsArr5[1] = Integer.TYPE;
                                                                                    clsArr5[2] = Integer.TYPE;
                                                                                    method3 = cls26.getMethod($$c6, clsArr5);
                                                                                    method4 = cls26.getMethod($$c((byte) bArr[79], (byte) bArr[55], (short) 334), new Class[0]);
                                                                                    try {
                                                                                        Class<?> cls27 = Class.forName($$c((byte) bArr[4], (byte) bArr[26], (short) 324));
                                                                                        byte b45 = (byte) bArr[16];
                                                                                        try {
                                                                                            byte b46 = (byte) bArr[107];
                                                                                            method5 = cls27.getMethod($$c(b45, b46, (short) (b46 | 777)), new Class[0]);
                                                                                            bArr5 = new byte[1024];
                                                                                            i14 = 0;
                                                                                            i15 = r8;
                                                                                        } catch (Throwable th84) {
                                                                                            th = th84;
                                                                                            s = s20;
                                                                                        }
                                                                                    } catch (Throwable th85) {
                                                                                        th = th85;
                                                                                        c9 = 4;
                                                                                        s = s20;
                                                                                        zipFile3 = zipFile5;
                                                                                        c4 = c9;
                                                                                        bArr = zipFile3;
                                                                                        r8 = c4;
                                                                                        th = th;
                                                                                        zipFile2 = bArr;
                                                                                        c2 = r8;
                                                                                        zipFile2.close();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th86) {
                                                                                    th = th86;
                                                                                    s = s20;
                                                                                    zipFile4 = zipFile5;
                                                                                    c4 = 4;
                                                                                    zipFile3 = zipFile4;
                                                                                    bArr = zipFile3;
                                                                                    r8 = c4;
                                                                                    th = th;
                                                                                    zipFile2 = bArr;
                                                                                    c2 = r8;
                                                                                    zipFile2.close();
                                                                                    throw th;
                                                                                }
                                                                                while (true) {
                                                                                    int intValue3 = ((Integer) method2.invoke(newInstance6, bArr5)).intValue();
                                                                                    if (intValue3 <= 0) {
                                                                                        i13 = i15;
                                                                                        s6 = s21;
                                                                                        s = s20;
                                                                                        break;
                                                                                    }
                                                                                    Method method14 = method2;
                                                                                    int i168 = $10 + 17;
                                                                                    s = s20;
                                                                                    $11 = i168 % 128;
                                                                                    if (i168 % 2 == 0) {
                                                                                        i13 = i15;
                                                                                        s6 = s21;
                                                                                        try {
                                                                                            if (i14 >= ((Long) method.invoke(invoke5, new Object[1])).longValue()) {
                                                                                                break;
                                                                                            }
                                                                                            int i169 = $11 + 91;
                                                                                            $10 = i169 % 128;
                                                                                            int i170 = i169 % 2;
                                                                                            method3.invoke(newInstance7, bArr5, 0, Integer.valueOf(intValue3));
                                                                                            int i171 = -(-intValue3);
                                                                                            i14 = ((i14 | i171) << 1) - (i171 ^ i14);
                                                                                            s20 = s;
                                                                                            method2 = method14;
                                                                                            i15 = i13;
                                                                                            s21 = s6;
                                                                                        } catch (Throwable th87) {
                                                                                            th = th87;
                                                                                            zipFile6 = zipFile5;
                                                                                            c5 = 4;
                                                                                            zipFile2 = zipFile6;
                                                                                            c2 = c5;
                                                                                            zipFile2.close();
                                                                                            throw th;
                                                                                        }
                                                                                    } else {
                                                                                        i13 = i15;
                                                                                        s6 = s21;
                                                                                        if (i14 >= ((Long) method.invoke(invoke5, new Object[0])).longValue()) {
                                                                                            break;
                                                                                        }
                                                                                        int i1692 = $11 + 91;
                                                                                        $10 = i1692 % 128;
                                                                                        int i1702 = i1692 % 2;
                                                                                        method3.invoke(newInstance7, bArr5, 0, Integer.valueOf(intValue3));
                                                                                        int i1712 = -(-intValue3);
                                                                                        i14 = ((i14 | i1712) << 1) - (i1712 ^ i14);
                                                                                        s20 = s;
                                                                                        method2 = method14;
                                                                                        i15 = i13;
                                                                                        s21 = s6;
                                                                                    }
                                                                                    zipFile2.close();
                                                                                    throw th;
                                                                                }
                                                                                try {
                                                                                    byte[] bArr32 = (byte[]) method4.invoke(newInstance7, new Object[0]);
                                                                                    try {
                                                                                        method5.invoke(newInstance6, new Object[0]);
                                                                                        method5.invoke(newInstance7, new Object[0]);
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                    byte[] bArr33 = $$a;
                                                                                    ?? cls28 = Class.forName($$c((byte) (-bArr33[775]), bArr33[18], (short) 308));
                                                                                    ?? r5 = new Class[2];
                                                                                    r8 = (short) 273;
                                                                                    r5[0] = Class.forName($$c(bArr33[14], bArr33[26], r8));
                                                                                    try {
                                                                                        byte b47 = bArr33[107];
                                                                                        byte b48 = bArr33[26];
                                                                                        bArr = Class.forName($$c(b47, b48, (short) ((b48 ^ 242) | (b48 & 242))));
                                                                                        r5[1] = bArr;
                                                                                        Constructor declaredConstructor = cls28.getDeclaredConstructor(r5);
                                                                                        try {
                                                                                            Object[] objArr12 = {bArr32};
                                                                                            ?? cls29 = Class.forName($$c(bArr33[14], bArr33[26], r8));
                                                                                            byte b49 = bArr33[55];
                                                                                            byte b50 = bArr33[7];
                                                                                            r8 = new Class[]{cls};
                                                                                            bArr = cls29.getMethod($$c(b49, b50, (short) (b50 | 235)), r8).invoke(null, objArr12);
                                                                                            invoke4 = declaredConstructor.newInstance(bArr, invoke9);
                                                                                            try {
                                                                                                try {
                                                                                                    Class<?> cls30 = Class.forName($$c(bArr33[348], bArr33[18], (short) 232));
                                                                                                    byte b51 = bArr33[274];
                                                                                                    Field declaredField = cls30.getDeclaredField($$c(b51, b51, (short) 201));
                                                                                                    declaredField.setAccessible(true);
                                                                                                    Object obj22 = declaredField.get(invoke9);
                                                                                                    Class<?> cls31 = obj22.getClass();
                                                                                                    Field declaredField2 = cls31.getDeclaredField($$c(bArr33[114], bArr33[47], (short) ($$b & 971)));
                                                                                                    declaredField2.setAccessible(true);
                                                                                                    byte b52 = bArr33[222];
                                                                                                    byte b53 = bArr33[47];
                                                                                                    Field declaredField3 = cls31.getDeclaredField($$c(b52, b53, (short) ((b53 ^ 162) | (b53 & 162))));
                                                                                                    declaredField3.setAccessible(true);
                                                                                                    Object obj23 = declaredField2.get(obj22);
                                                                                                    Object obj24 = declaredField3.get(obj22);
                                                                                                    Object obj25 = declaredField.get(invoke4);
                                                                                                    ArrayList arrayList = new ArrayList((List) obj23);
                                                                                                    Class<?> cls32 = obj24.getClass();
                                                                                                    try {
                                                                                                        byte b54 = bArr33[0];
                                                                                                        try {
                                                                                                            byte b55 = bArr33[4];
                                                                                                            Class cls33 = (Class) Class.class.getMethod($$c(b54, b55, (short) (b55 | 131)), null).invoke(cls32, null);
                                                                                                            int length2 = Array.getLength(obj24);
                                                                                                            Object newInstance8 = Array.newInstance((Class<?>) cls33, length2);
                                                                                                            for (int i172 = 0; i172 < length2; i172++) {
                                                                                                                int i173 = $10;
                                                                                                                int i174 = (i173 ^ 3) + ((i173 & 3) << 1);
                                                                                                                $11 = i174 % 128;
                                                                                                                int i175 = i174 % 2;
                                                                                                                try {
                                                                                                                    Array.set(newInstance8, i172, Array.get(obj24, i172));
                                                                                                                } catch (Exception e6) {
                                                                                                                    exc = e6;
                                                                                                                    bArr = zipFile5;
                                                                                                                    r8 = 4;
                                                                                                                    try {
                                                                                                                        StringBuilder sb8 = new StringBuilder();
                                                                                                                        byte[] bArr34 = $$a;
                                                                                                                        short s22 = (short) 854;
                                                                                                                        try {
                                                                                                                            throw ((Throwable) Class.forName($$c(bArr34[14], bArr34[26], s22)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb8.append($$c(bArr34[16], bArr34[126], (short) ($$b & 909))).append(invoke9).append($$c(bArr34[7], bArr34[3], s22)).toString(), exc));
                                                                                                                        } catch (Throwable th88) {
                                                                                                                            Throwable cause31 = th88.getCause();
                                                                                                                            if (cause31 == null) {
                                                                                                                                throw th88;
                                                                                                                            }
                                                                                                                            throw cause31;
                                                                                                                        }
                                                                                                                    } catch (Throwable th89) {
                                                                                                                        th = th89;
                                                                                                                        th = th;
                                                                                                                        zipFile2 = bArr;
                                                                                                                        c2 = r8;
                                                                                                                        zipFile2.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            declaredField2.set(obj25, arrayList);
                                                                                                            declaredField3.set(obj25, newInstance8);
                                                                                                            int i176 = 2 % 2;
                                                                                                            int i177 = $10 + 63;
                                                                                                            $11 = i177 % 128;
                                                                                                            int i178 = i177 % 2;
                                                                                                            if (e == null) {
                                                                                                                e = invoke4;
                                                                                                            }
                                                                                                        } catch (Throwable th90) {
                                                                                                            th = th90;
                                                                                                            c10 = 4;
                                                                                                            zipFile9 = zipFile5;
                                                                                                            Throwable th91 = th;
                                                                                                            try {
                                                                                                                Throwable cause32 = th91.getCause();
                                                                                                                if (cause32 == null) {
                                                                                                                    throw th91;
                                                                                                                }
                                                                                                                throw cause32;
                                                                                                            } catch (Exception e7) {
                                                                                                                e = e7;
                                                                                                                exc = e;
                                                                                                                bArr = zipFile9;
                                                                                                                r8 = c10;
                                                                                                                StringBuilder sb82 = new StringBuilder();
                                                                                                                byte[] bArr342 = $$a;
                                                                                                                short s222 = (short) 854;
                                                                                                                throw ((Throwable) Class.forName($$c(bArr342[14], bArr342[26], s222)).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb82.append($$c(bArr342[16], bArr342[126], (short) ($$b & 909))).append(invoke9).append($$c(bArr342[7], bArr342[3], s222)).toString(), exc));
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th92) {
                                                                                                        th = th92;
                                                                                                        zipFile9 = zipFile5;
                                                                                                        c10 = 4;
                                                                                                    }
                                                                                                } catch (Throwable th93) {
                                                                                                    th2 = th93;
                                                                                                    zipFile8 = zipFile5;
                                                                                                    c7 = 4;
                                                                                                    zipFile7 = zipFile8;
                                                                                                    c6 = c7;
                                                                                                    th = th2;
                                                                                                    zipFile2 = zipFile7;
                                                                                                    c2 = c6;
                                                                                                    zipFile2.close();
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Exception e8) {
                                                                                                e = e8;
                                                                                                zipFile9 = zipFile5;
                                                                                                c10 = 4;
                                                                                            }
                                                                                        } catch (Throwable th94) {
                                                                                            Throwable cause33 = th94.getCause();
                                                                                            if (cause33 == null) {
                                                                                                throw th94;
                                                                                            }
                                                                                            throw cause33;
                                                                                        }
                                                                                    } catch (Throwable th95) {
                                                                                        th = th95;
                                                                                        bArr = zipFile5;
                                                                                        r8 = 4;
                                                                                        th = th;
                                                                                        zipFile2 = bArr;
                                                                                        c2 = r8;
                                                                                        zipFile2.close();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th96) {
                                                                                    th = th96;
                                                                                    zipFile = zipFile5;
                                                                                    zipFile4 = zipFile;
                                                                                    c4 = 4;
                                                                                    zipFile3 = zipFile4;
                                                                                    bArr = zipFile3;
                                                                                    r8 = c4;
                                                                                    th = th;
                                                                                    zipFile2 = bArr;
                                                                                    c2 = r8;
                                                                                    zipFile2.close();
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th97) {
                                                                                th = th97;
                                                                                Throwable th98 = th;
                                                                                Throwable cause34 = th98.getCause();
                                                                                if (cause34 == null) {
                                                                                    throw th98;
                                                                                }
                                                                                throw cause34;
                                                                            }
                                                                        } catch (Throwable th99) {
                                                                            th = th99;
                                                                        }
                                                                    } catch (Throwable th100) {
                                                                        Throwable cause35 = th100.getCause();
                                                                        if (cause35 == null) {
                                                                            throw th100;
                                                                        }
                                                                        throw cause35;
                                                                    }
                                                                }
                                                                if (z17) {
                                                                    int i179 = $11;
                                                                    int i180 = (i179 ^ 67) + ((i179 & 67) << 1);
                                                                    $10 = i180 % 128;
                                                                    int i181 = i180 % 2;
                                                                    try {
                                                                        bArr4 = $$a;
                                                                        cls4 = Class.forName($$c(bArr4[107], bArr4[18], (short) 485));
                                                                        String $$c7 = $$c(bArr4[49], bArr4[80], (short) ($$b & 896));
                                                                        byte b56 = bArr4[107];
                                                                        byte b57 = bArr4[26];
                                                                        declaredMethod = cls4.getDeclaredMethod($$c7, String.class, Class.forName($$c(b56, b57, (short) (b57 | 242))));
                                                                        declaredMethod.setAccessible(true);
                                                                        try {
                                                                            b4 = bArr4[26];
                                                                            c8 = 4;
                                                                            c6 = 4;
                                                                            try {
                                                                                b5 = bArr4[4];
                                                                            } catch (Throwable th101) {
                                                                                th = th101;
                                                                                Throwable th102 = th;
                                                                                Throwable cause36 = th102.getCause();
                                                                                if (cause36 == null) {
                                                                                    throw th102;
                                                                                }
                                                                                throw cause36;
                                                                            }
                                                                        } catch (Throwable th103) {
                                                                            th = th103;
                                                                        }
                                                                    } catch (Throwable th104) {
                                                                        th = th104;
                                                                        c8 = 4;
                                                                    }
                                                                    try {
                                                                        ?? invoke10 = declaredMethod.invoke(invoke4, str4, Class.class.getMethod($$c(b4, b5, (short) (b5 | 424)), null).invoke(AFa1hSDK.class, null));
                                                                        if (invoke10 != null) {
                                                                            int i182 = $10;
                                                                            int i183 = ((i182 | 63) << 1) - (i182 ^ 63);
                                                                            $11 = i183 % 128;
                                                                            int i184 = i183 % 2;
                                                                            byte b58 = bArr4[16];
                                                                            byte b59 = bArr4[107];
                                                                            cls4.getDeclaredMethod($$c(b58, b59, (short) ((b59 ^ 777) | (b59 & 777))), new Class[0]).invoke(invoke4, new Object[0]);
                                                                        }
                                                                        cls3 = invoke10;
                                                                    } catch (Throwable th105) {
                                                                        th = th105;
                                                                        th = th;
                                                                        zipFile6 = zipFile5;
                                                                        c5 = c8;
                                                                        zipFile2 = zipFile6;
                                                                        c2 = c5;
                                                                        zipFile2.close();
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    String str6 = str4;
                                                                    char c11 = 4;
                                                                    c6 = 4;
                                                                    c6 = 4;
                                                                    byte[] bArr35 = $$a;
                                                                    try {
                                                                        byte b60 = bArr35[107];
                                                                        byte b61 = bArr35[26];
                                                                        Method declaredMethod3 = Class.forName($$c(b60, b61, (short) ((b61 ^ 242) | (b61 & 242)))).getDeclaredMethod($$c(bArr35[49], bArr35[80], (short) ($$b & 896)), String.class);
                                                                        try {
                                                                            declaredMethod3.setAccessible(true);
                                                                            cls3 = declaredMethod3.invoke(invoke4, str6);
                                                                        } catch (InvocationTargetException e9) {
                                                                            try {
                                                                                throw ((Exception) e9.getCause());
                                                                            } catch (ClassNotFoundException unused6) {
                                                                                cls3 = null;
                                                                                if (cls3 == null) {
                                                                                    System.currentTimeMillis();
                                                                                    System.currentTimeMillis();
                                                                                    try {
                                                                                        cls2 = cls3;
                                                                                        bArr3 = $$a;
                                                                                    } catch (Throwable th106) {
                                                                                        th2 = th106;
                                                                                        zipFile8 = zipFile5;
                                                                                        c7 = c6;
                                                                                    }
                                                                                    try {
                                                                                        str3 = $$c(bArr3[511], bArr3[107], (short) 120);
                                                                                        Constructor declaredConstructor2 = cls2.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                        declaredConstructor2.setAccessible(true);
                                                                                        i = declaredConstructor2.newInstance(invoke4, Boolean.valueOf(z17 ^ true));
                                                                                        bArr2 = new byte[13452];
                                                                                        byte b62 = bArr3[426];
                                                                                        byte b63 = bArr3[694];
                                                                                        String substring = $$c(b62, b63, (short) ((b63 ^ 16) | (b63 & 16))).substring(1);
                                                                                        zipFile7 = zipFile5;
                                                                                        try {
                                                                                            try {
                                                                                                s7 = s6;
                                                                                                int i185 = i13;
                                                                                                Object newInstance9 = Class.forName($$c(bArr3[776], bArr3[26], s7)).getDeclaredConstructor(Class.forName($$c(bArr3[14], bArr3[26], i185))).newInstance(zipFile7.getInputStream(zipFile7.getEntry(substring)));
                                                                                                int i186 = $11 + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
                                                                                                $10 = i186 % 128;
                                                                                                int i187 = i186 % 2;
                                                                                                try {
                                                                                                    short s23 = (short) 670;
                                                                                                    Object newInstance10 = Class.forName($$c(bArr3[105], bArr3[26], s23)).getDeclaredConstructor(Class.forName($$c(bArr3[14], bArr3[26], i185))).newInstance(newInstance9);
                                                                                                    try {
                                                                                                        try {
                                                                                                            Class.forName($$c(bArr3[105], bArr3[26], s23)).getMethod($$c(bArr3[49], bArr3[46], (short) 648), cls).invoke(newInstance10, bArr2);
                                                                                                            try {
                                                                                                                Class<?> cls34 = Class.forName($$c(bArr3[105], bArr3[26], s23));
                                                                                                                byte b64 = bArr3[16];
                                                                                                                try {
                                                                                                                    byte b65 = bArr3[107];
                                                                                                                    cls34.getMethod($$c(b64, b65, (short) ((b65 ^ 777) | (b65 & 777))), null).invoke(newInstance10, null);
                                                                                                                    try {
                                                                                                                        i10 = Math.abs(i12);
                                                                                                                        zipFile10 = zipFile7;
                                                                                                                        s13 = s7;
                                                                                                                        s822 = s;
                                                                                                                        z8 = z17;
                                                                                                                        i11 = 1;
                                                                                                                        s2 = 13408;
                                                                                                                        cls5 = cls;
                                                                                                                    } catch (Throwable th107) {
                                                                                                                        th2 = th107;
                                                                                                                        th = th2;
                                                                                                                        zipFile2 = zipFile7;
                                                                                                                        c2 = c6;
                                                                                                                        zipFile2.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th108) {
                                                                                                                    th = th108;
                                                                                                                    Throwable th109 = th;
                                                                                                                    Throwable cause37 = th109.getCause();
                                                                                                                    if (cause37 == null) {
                                                                                                                        throw th109;
                                                                                                                    }
                                                                                                                    throw cause37;
                                                                                                                }
                                                                                                            } catch (Throwable th110) {
                                                                                                                th = th110;
                                                                                                            }
                                                                                                        } catch (Throwable th111) {
                                                                                                            th = th111;
                                                                                                            Throwable th112 = th;
                                                                                                            Throwable cause38 = th112.getCause();
                                                                                                            if (cause38 == null) {
                                                                                                                throw th112;
                                                                                                            }
                                                                                                            throw cause38;
                                                                                                        }
                                                                                                    } catch (Throwable th113) {
                                                                                                        th = th113;
                                                                                                    }
                                                                                                } catch (Throwable th114) {
                                                                                                    Throwable cause39 = th114.getCause();
                                                                                                    if (cause39 == null) {
                                                                                                        throw th114;
                                                                                                    }
                                                                                                    throw cause39;
                                                                                                }
                                                                                            } catch (Throwable th115) {
                                                                                                Throwable cause40 = th115.getCause();
                                                                                                if (cause40 == null) {
                                                                                                    throw th115;
                                                                                                }
                                                                                                throw cause40;
                                                                                            }
                                                                                        } catch (Throwable th116) {
                                                                                            th2 = th116;
                                                                                            zipFile8 = zipFile7;
                                                                                            c7 = c6;
                                                                                            zipFile7 = zipFile8;
                                                                                            c6 = c7;
                                                                                            th = th2;
                                                                                            zipFile2 = zipFile7;
                                                                                            c2 = c6;
                                                                                            zipFile2.close();
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th117) {
                                                                                        th2 = th117;
                                                                                        c11 = c6;
                                                                                        zipFile7 = zipFile5;
                                                                                        c6 = c11;
                                                                                        th = th2;
                                                                                        zipFile2 = zipFile7;
                                                                                        c2 = c6;
                                                                                        zipFile2.close();
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    Constructor declaredConstructor3 = cls17.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                    declaredConstructor3.setAccessible(true);
                                                                                    i = declaredConstructor3.newInstance(invoke4, Boolean.valueOf(!z17));
                                                                                    int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                                    int i188 = ~(((-1250256032) ^ currentTimeMillis10) | ((-1250256032) & currentTimeMillis10));
                                                                                    int i189 = 2131057976 - (~(((i188 & 226762495) | (226762495 ^ i188)) * 262));
                                                                                    int i190 = (i189 & (-626405422)) + ((-626405422) | i189);
                                                                                    int i191 = ~currentTimeMillis10;
                                                                                    int i192 = -(-(((~((i191 & (-1250256032)) | ((-1250256032) ^ i191))) | 226762495) * 262));
                                                                                    int i193 = (i190 & i192) + (i192 | i190);
                                                                                    int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                                    int i194 = ~((1195487659 & currentTimeMillis11) | (1195487659 ^ currentTimeMillis11));
                                                                                    int i195 = 1010254117 - (~(((i194 & 1652425198) | (1652425198 ^ i194)) * 398));
                                                                                    int i196 = ~currentTimeMillis11;
                                                                                    if (i193 > (i195 - (~(((~((i196 & 1195487659) | (1195487659 ^ i196))) | 1652425198) * 398))) - 1) {
                                                                                        try {
                                                                                            zipFile5.close();
                                                                                            int i197 = 81 / 0;
                                                                                        } catch (Throwable th118) {
                                                                                            obj2 = th118;
                                                                                            c3 = c6;
                                                                                            z5 = z4;
                                                                                            int currentTimeMillis32222222222 = (int) System.currentTimeMillis();
                                                                                            int i542222222222 = -(-(i3 * (-69)));
                                                                                            int i552222222222 = (71 & i542222222222) + (i542222222222 | 71);
                                                                                            int i562222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                                            int i572222222222 = ~((i3 ^ currentTimeMillis32222222222) | (i3 & currentTimeMillis32222222222));
                                                                                            int i582222222222 = -(-(((i562222222222 & i572222222222) | (i562222222222 ^ i572222222222)) * (-140)));
                                                                                            int i592222222222 = (i552222222222 & i582222222222) + (i582222222222 | i552222222222);
                                                                                            int i602222222222 = (i3 ^ 1) | (i3 & 1);
                                                                                            int i612222222222 = (i592222222222 - (~(-(-((~((i602222222222 & currentTimeMillis32222222222) | (i602222222222 ^ currentTimeMillis32222222222))) * 70))))) - 1;
                                                                                            int i622222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                                                                            i4 = i3;
                                                                                            int i632222222222 = ~i4;
                                                                                            int i642222222222 = i622222222222 | (~((i632222222222 & 1) | (i632222222222 ^ 1)));
                                                                                            int i652222222222 = ~((currentTimeMillis32222222222 & 1) | (currentTimeMillis32222222222 ^ 1));
                                                                                            int i662222222222 = -(-(((i652222222222 & i642222222222) | (i642222222222 ^ i652222222222)) * 70));
                                                                                            i5 = (i612222222222 & i662222222222) + (i662222222222 | i612222222222);
                                                                                            while (i5 < 7) {
                                                                                            }
                                                                                            int i672222222222 = $11;
                                                                                            i6 = (i672222222222 & 57) + (i672222222222 | 57);
                                                                                            $10 = i6 % 128;
                                                                                            if (i6 % 2 == 0) {
                                                                                            }
                                                                                            Object[] objArr42222222222 = {$$c(b, b2, b3), obj2};
                                                                                            byte[] bArr162222222222 = $$a;
                                                                                            throw ((Throwable) Class.forName($$c(bArr162222222222[14], bArr162222222222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr42222222222));
                                                                                        }
                                                                                    } else {
                                                                                        zipFile5.close();
                                                                                    }
                                                                                    i4 = i3;
                                                                                    z6 = false;
                                                                                    z7 = true;
                                                                                    z18 = true;
                                                                                    i4622 = i4 + 1;
                                                                                    c = c6;
                                                                                    z21 = z6;
                                                                                    z20 = z7;
                                                                                    z2 = z18;
                                                                                    $$c = str2;
                                                                                    objArr222 = objArr;
                                                                                    zArr422 = zArr;
                                                                                    zArr522 = zArr2;
                                                                                    zArr622 = zArr3;
                                                                                    z2222 = z4;
                                                                                    s822 = s;
                                                                                    cls5 = cls;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable th119) {
                                                                        th2 = th119;
                                                                        zipFile7 = zipFile5;
                                                                        c6 = c11;
                                                                        th = th2;
                                                                        zipFile2 = zipFile7;
                                                                        c2 = c6;
                                                                        zipFile2.close();
                                                                        throw th;
                                                                    }
                                                                }
                                                                if (cls3 == null) {
                                                                }
                                                                i10 = Math.abs(i12);
                                                                zipFile10 = zipFile7;
                                                                s13 = s7;
                                                                s822 = s;
                                                                z8 = z17;
                                                                i11 = 1;
                                                                s2 = 13408;
                                                                cls5 = cls;
                                                            }
                                                        } catch (Throwable th120) {
                                                            Throwable cause41 = th120.getCause();
                                                            if (cause41 == null) {
                                                                throw th120;
                                                            }
                                                            throw cause41;
                                                        }
                                                    } catch (Throwable th121) {
                                                        th = th121;
                                                        Throwable th122 = th;
                                                        Throwable cause42 = th122.getCause();
                                                        if (cause42 == null) {
                                                            throw th122;
                                                        }
                                                        throw cause42;
                                                    }
                                                } catch (Throwable th123) {
                                                    th = th123;
                                                }
                                            } catch (Throwable th124) {
                                                th = th124;
                                                Throwable th125 = th;
                                                Throwable cause43 = th125.getCause();
                                                if (cause43 == null) {
                                                    throw th125;
                                                }
                                                throw cause43;
                                            }
                                        } catch (Throwable th126) {
                                            th = th126;
                                        }
                                    } catch (Throwable th127) {
                                        th = th127;
                                        cls = cls5;
                                        s = s822;
                                        z9 = z4;
                                        c2 = 4;
                                        z4 = z9;
                                        obj2 = th;
                                        c3 = c2;
                                        z5 = z4;
                                        int currentTimeMillis322222222222 = (int) System.currentTimeMillis();
                                        int i5422222222222 = -(-(i3 * (-69)));
                                        int i5522222222222 = (71 & i5422222222222) + (i5422222222222 | 71);
                                        int i5622222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                        int i5722222222222 = ~((i3 ^ currentTimeMillis322222222222) | (i3 & currentTimeMillis322222222222));
                                        int i5822222222222 = -(-(((i5622222222222 & i5722222222222) | (i5622222222222 ^ i5722222222222)) * (-140)));
                                        int i5922222222222 = (i5522222222222 & i5822222222222) + (i5822222222222 | i5522222222222);
                                        int i6022222222222 = (i3 ^ 1) | (i3 & 1);
                                        int i6122222222222 = (i5922222222222 - (~(-(-((~((i6022222222222 & currentTimeMillis322222222222) | (i6022222222222 ^ currentTimeMillis322222222222))) * 70))))) - 1;
                                        int i6222222222222 = ~(((-2) & i3) | ((-2) ^ i3));
                                        i4 = i3;
                                        int i6322222222222 = ~i4;
                                        int i6422222222222 = i6222222222222 | (~((i6322222222222 & 1) | (i6322222222222 ^ 1)));
                                        int i6522222222222 = ~((currentTimeMillis322222222222 & 1) | (currentTimeMillis322222222222 ^ 1));
                                        int i6622222222222 = -(-(((i6522222222222 & i6422222222222) | (i6422222222222 ^ i6522222222222)) * 70));
                                        i5 = (i6122222222222 & i6622222222222) + (i6622222222222 | i6122222222222);
                                        while (i5 < 7) {
                                        }
                                        int i6722222222222 = $11;
                                        i6 = (i6722222222222 & 57) + (i6722222222222 | 57);
                                        $10 = i6 % 128;
                                        if (i6 % 2 == 0) {
                                        }
                                        Object[] objArr422222222222 = {$$c(b, b2, b3), obj2};
                                        byte[] bArr1622222222222 = $$a;
                                        throw ((Throwable) Class.forName($$c(bArr1622222222222[14], bArr1622222222222[26], (short) 854)).getDeclaredConstructor(String.class, Throwable.class).newInstance(objArr422222222222));
                                    }
                                } else {
                                    cls = cls5;
                                    z3 = z2;
                                    str2 = $$c;
                                    z4 = z2222 ? 1 : 0;
                                    i4 = i4622;
                                    objArr = objArr222;
                                    zArr = zArr422;
                                    zArr2 = zArr522;
                                    s = s822;
                                    zArr3 = zArr622;
                                    z7 = z20;
                                    z6 = z21;
                                    c6 = c;
                                }
                                z18 = z3;
                                i4622 = i4 + 1;
                                c = c6;
                                z21 = z6;
                                z20 = z7;
                                z2 = z18;
                                $$c = str2;
                                objArr222 = objArr;
                                zArr422 = zArr;
                                zArr522 = zArr2;
                                zArr622 = zArr3;
                                z2222 = z4;
                                s822 = s;
                                cls5 = cls;
                            }
                            return;
                        }
                        invoke3 = null;
                        if (invoke == null) {
                        }
                        if (invoke3 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr9222 = $$a;
                        short s8222 = (short) 952;
                        Object[] objArr2222 = (Object[]) Array.newInstance(Class.forName($$c(bArr9222[80], bArr9222[26], s8222)), 7);
                        objArr2222[0] = null;
                        objArr2222[1] = invoke2;
                        objArr2222[2] = invoke;
                        objArr2222[3] = invoke3;
                        objArr2222[4] = invoke2;
                        objArr2222[5] = invoke;
                        objArr2222[6] = invoke3;
                        boolean[] zArr4222 = {false, true, true, true, true, true, true};
                        boolean[] zArr5222 = {false, false, false, false, true, true, true};
                        boolean[] zArr6222 = {false, false, true, true, false, true, true};
                        byte b12222 = bArr9222[114];
                        byte b13222 = bArr9222[105];
                        Class<?> cls9222 = Class.forName($$c(b12222, b13222, (short) ((b13222 & 872) | (b13222 ^ 872))));
                        byte b14222 = bArr9222[56];
                        byte b15222 = bArr9222[44];
                        i16 = cls9222.getDeclaredField($$c(b14222, b15222, (short) (b15222 | 835))).getInt(cls9222);
                        if (i16 < 34) {
                        }
                        if (i16 != 29) {
                            zArr6222[0] = i16 != 29 && i16 >= 26;
                            zArr6222[1] = i16 >= 21;
                            if (i16 >= 21) {
                            }
                            zArr6222[4] = z19;
                            z2 = false;
                            int i46222 = 0;
                            boolean z22222 = z;
                            while ((!z2) == z20) {
                                i2 = $11 + 97;
                                $10 = i2 % 128;
                                if (i2 % 2 == 0) {
                                }
                            }
                        }
                        zArr6222[0] = i16 != 29 && i16 >= 26;
                        zArr6222[1] = i16 >= 21;
                        if (i16 >= 21) {
                        }
                        zArr6222[4] = z19;
                        z2 = false;
                        int i462222 = 0;
                        boolean z222222 = z;
                        while ((!z2) == z20) {
                        }
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
                    short s82222 = (short) 952;
                    Object[] objArr22222 = (Object[]) Array.newInstance(Class.forName($$c(bArr92222[80], bArr92222[26], s82222)), 7);
                    objArr22222[0] = null;
                    objArr22222[1] = invoke2;
                    objArr22222[2] = invoke;
                    objArr22222[3] = invoke3;
                    objArr22222[4] = invoke2;
                    objArr22222[5] = invoke;
                    objArr22222[6] = invoke3;
                    boolean[] zArr42222 = {false, true, true, true, true, true, true};
                    boolean[] zArr52222 = {false, false, false, false, true, true, true};
                    boolean[] zArr62222 = {false, false, true, true, false, true, true};
                    byte b122222 = bArr92222[114];
                    byte b132222 = bArr92222[105];
                    Class<?> cls92222 = Class.forName($$c(b122222, b132222, (short) ((b132222 & 872) | (b132222 ^ 872))));
                    byte b142222 = bArr92222[56];
                    byte b152222 = bArr92222[44];
                    i16 = cls92222.getDeclaredField($$c(b142222, b152222, (short) (b152222 | 835))).getInt(cls92222);
                    if (i16 < 34) {
                    }
                    zArr62222[0] = i16 != 29 && i16 >= 26;
                    zArr62222[1] = i16 >= 21;
                    if (i16 >= 21) {
                    }
                    zArr62222[4] = z19;
                    z2 = false;
                    int i4622222 = 0;
                    boolean z2222222 = z;
                    while ((!z2) == z20) {
                    }
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
                short s822222 = (short) 952;
                Object[] objArr222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr922222[80], bArr922222[26], s822222)), 7);
                objArr222222[0] = null;
                objArr222222[1] = invoke2;
                objArr222222[2] = invoke;
                objArr222222[3] = invoke3;
                objArr222222[4] = invoke2;
                objArr222222[5] = invoke;
                objArr222222[6] = invoke3;
                boolean[] zArr422222 = {false, true, true, true, true, true, true};
                boolean[] zArr522222 = {false, false, false, false, true, true, true};
                boolean[] zArr622222 = {false, false, true, true, false, true, true};
                byte b1222222 = bArr922222[114];
                byte b1322222 = bArr922222[105];
                Class<?> cls922222 = Class.forName($$c(b1222222, b1322222, (short) ((b1322222 & 872) | (b1322222 ^ 872))));
                byte b1422222 = bArr922222[56];
                byte b1522222 = bArr922222[44];
                i16 = cls922222.getDeclaredField($$c(b1422222, b1522222, (short) (b1522222 | 835))).getInt(cls922222);
                if (i16 < 34) {
                }
                zArr622222[0] = i16 != 29 && i16 >= 26;
                zArr622222[1] = i16 >= 21;
                if (i16 >= 21) {
                }
                zArr622222[4] = z19;
                z2 = false;
                int i46222222 = 0;
                boolean z22222222 = z;
                while ((!z2) == z20) {
                }
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
            short s8222222 = (short) 952;
            Object[] objArr2222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr9222222[80], bArr9222222[26], s8222222)), 7);
            objArr2222222[0] = null;
            objArr2222222[1] = invoke2;
            objArr2222222[2] = invoke;
            objArr2222222[3] = invoke3;
            objArr2222222[4] = invoke2;
            objArr2222222[5] = invoke;
            objArr2222222[6] = invoke3;
            boolean[] zArr4222222 = {false, true, true, true, true, true, true};
            boolean[] zArr5222222 = {false, false, false, false, true, true, true};
            boolean[] zArr6222222 = {false, false, true, true, false, true, true};
            byte b12222222 = bArr9222222[114];
            byte b13222222 = bArr9222222[105];
            Class<?> cls9222222 = Class.forName($$c(b12222222, b13222222, (short) ((b13222222 & 872) | (b13222222 ^ 872))));
            byte b14222222 = bArr9222222[56];
            byte b15222222 = bArr9222222[44];
            i16 = cls9222222.getDeclaredField($$c(b14222222, b15222222, (short) (b15222222 | 835))).getInt(cls9222222);
            if (i16 < 34) {
            }
            zArr6222222[0] = i16 != 29 && i16 >= 26;
            zArr6222222[1] = i16 >= 21;
            if (i16 >= 21) {
            }
            zArr6222222[4] = z19;
            z2 = false;
            int i462222222 = 0;
            boolean z222222222 = z;
            while ((!z2) == z20) {
            }
            try {
                byte[] bArr36 = $$a;
                Class<?> cls35 = Class.forName($$c(bArr36[72], bArr36[105], (short) 1037));
                byte b66 = bArr36[107];
                byte b67 = bArr36[4];
                obj = cls35.getMethod($$c(b66, b67, (short) ((b67 & 1000) | (b67 ^ 1000))), new Class[0]).invoke(null, null);
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
            short s82222222 = (short) 952;
            Object[] objArr22222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr92222222[80], bArr92222222[26], s82222222)), 7);
            objArr22222222[0] = null;
            objArr22222222[1] = invoke2;
            objArr22222222[2] = invoke;
            objArr22222222[3] = invoke3;
            objArr22222222[4] = invoke2;
            objArr22222222[5] = invoke;
            objArr22222222[6] = invoke3;
            boolean[] zArr42222222 = {false, true, true, true, true, true, true};
            boolean[] zArr52222222 = {false, false, false, false, true, true, true};
            boolean[] zArr62222222 = {false, false, true, true, false, true, true};
            byte b122222222 = bArr92222222[114];
            byte b132222222 = bArr92222222[105];
            Class<?> cls92222222 = Class.forName($$c(b122222222, b132222222, (short) ((b132222222 & 872) | (b132222222 ^ 872))));
            byte b142222222 = bArr92222222[56];
            byte b152222222 = bArr92222222[44];
            i16 = cls92222222.getDeclaredField($$c(b142222222, b152222222, (short) (b152222222 | 835))).getInt(cls92222222);
            if (i16 < 34) {
            }
            zArr62222222[0] = i16 != 29 && i16 >= 26;
            zArr62222222[1] = i16 >= 21;
            if (i16 >= 21) {
            }
            zArr62222222[4] = z19;
            z2 = false;
            int i4622222222 = 0;
            boolean z2222222222 = z;
            while ((!z2) == z20) {
            }
        } catch (Throwable th128) {
            Throwable cause44 = th128.getCause();
            if (cause44 == null) {
                throw th128;
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
