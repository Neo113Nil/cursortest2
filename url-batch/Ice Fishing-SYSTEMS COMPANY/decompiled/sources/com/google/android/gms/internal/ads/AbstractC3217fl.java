package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaFormat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdError;
import java.lang.Character;
import java.math.RoundingMode;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.fl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3217fl implements R0 {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f30872K = 0;

    /* renamed from: n, reason: collision with root package name */
    public static ExecutorService f30873n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f30874u = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: v, reason: collision with root package name */
    public static final C3940t8 f30875v = new C3940t8(0);

    /* renamed from: w, reason: collision with root package name */
    public static final C3940t8 f30876w = new C3940t8(1);

    /* renamed from: x, reason: collision with root package name */
    public static final C3940t8 f30877x = new C3940t8(15);

    /* renamed from: y, reason: collision with root package name */
    public static final C3940t8 f30878y = new C3940t8(29);

    /* renamed from: z, reason: collision with root package name */
    public static final C2945am f30879z = new C2945am(9);

    /* renamed from: A, reason: collision with root package name */
    public static final C2945am f30863A = new C2945am(16);

    /* renamed from: B, reason: collision with root package name */
    public static final Object f30864B = new Object();

    /* renamed from: C, reason: collision with root package name */
    public static final C3225ft f30865C = new C3225ft(2);

    /* renamed from: D, reason: collision with root package name */
    public static final C3225ft f30866D = new C3225ft(8);

    /* renamed from: E, reason: collision with root package name */
    public static final C3225ft f30867E = new C3225ft(13);

    /* renamed from: F, reason: collision with root package name */
    public static final C3225ft f30868F = new C3225ft(19);

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f30869G = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f30870H = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f30871I = {67108863, 33554431};
    public static final int[] J = {26, 25};

    public static boolean A(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (true != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
    
        if (true != r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] B(String str, boolean z8) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z9 = false;
        int i4 = 0;
        while (i < str.length()) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (of.equals(Character.UnicodeBlock.BOPOMOFO) || of.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || of.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || of.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || of.equals(Character.UnicodeBlock.HANGUL_JAMO) || of.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || of.equals(Character.UnicodeBlock.HIRAGANA) || of.equals(Character.UnicodeBlock.KATAKANA) || of.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500))) {
                    if (z9) {
                        arrayList.add(new String(charArray, i4, i - i4));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                    z9 = false;
                    i += charCount;
                }
            }
            if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                if (!z8 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                    if (z9) {
                        arrayList.add(new String(charArray, i4, i - i4));
                    }
                    z9 = false;
                }
            }
            i += charCount;
        }
        if (z9) {
            arrayList.add(new String(charArray, i4, i - i4));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static long C(long j9, long j10) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j9) + Long.numberOfLeadingZeros(j9);
        if (numberOfLeadingZeros > 65) {
            return j9 * j10;
        }
        long j11 = j9 ^ j10;
        long j12 = (j11 >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j9 < 0)))) {
            long j13 = j9 * j10;
            if (j9 == 0 || j13 / j9 == j10) {
                return j13;
            }
        }
        return j12;
    }

    public static final ResolveInfo D(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, com.anythink.basead.exoplayer.b.aX);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static C2881Yl E(Lr lr) {
        lr.G(1);
        int O8 = lr.O();
        long j9 = lr.f26234b;
        long j10 = O8;
        int i = O8 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            long d2 = lr.d();
            if (d2 == -1) {
                jArr = Arrays.copyOf(jArr, i4);
                jArr2 = Arrays.copyOf(jArr2, i4);
                break;
            }
            jArr[i4] = d2;
            jArr2[i4] = lr.d();
            lr.G(2);
            i4++;
        }
        lr.G((int) ((j9 + j10) - lr.f26234b));
        return new C2881Yl(4, jArr, jArr2);
    }

    public static C4927z0 F(int i, C4927z0 c4927z0) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.v9)).intValue() > 0) {
                return c4927z0;
            }
            i = 8;
        }
        return M(i, null, c4927z0);
    }

    public static void G(int i, int i4, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i4;
        } else {
            ((int[]) obj)[i] = i4;
        }
    }

    public static void H(int i, Lr lr) {
        lr.y(7);
        byte[] bArr = lr.f26233a;
        bArr[0] = -84;
        bArr[1] = com.anythink.core.common.s.a.c.f16475b;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[5] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[6] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
    }

    public static void I(String str, String str2) {
        synchronized (f30864B) {
            Log.w(str, a0(str2, null));
        }
    }

    public static void J(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j9 = jArr[8];
        long j10 = jArr[18];
        long j11 = j9 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j10 + j10 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j14 + j14 + j15;
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j18 + j18 + j19;
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j22 + j22 + j23;
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j26 + j26 + j27;
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j30 + j30 + j31;
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j34 + j34 + j35;
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j38 + j38 + j39;
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j42 + j42 + j43;
        jArr[0] = j44;
        jArr[0] = j44 + j42;
        P(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static final Intent K(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static C3071d2 L(int i, String str, Lr lr) {
        int b9 = lr.b();
        if (lr.b() == 1684108385) {
            lr.G(8);
            return new C3071d2(str, null, UB.j(lr.l(b9 - 16)));
        }
        I("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC3551lx.g(i)));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C4927z0 M(int i, String str, C4927z0 c4927z0) {
        String str2;
        int i4 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i4) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.y9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i9 = 0;
        int i10 = 2;
        switch (i4) {
            case 0:
            case 11:
            case 15:
                i10 = i9;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i10 = 1;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 2:
            case 10:
            case 18:
                i10 = 3;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 3:
                i9 = 8;
                i10 = i9;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 4:
            case 8:
            case 17:
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 7:
                i9 = 4;
                i10 = i9;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 12:
                if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.y9)).intValue() <= 0) {
                    i9 = 9;
                    i10 = i9;
                    return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
                }
                i10 = 3;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 13:
                i9 = 10;
                i10 = i9;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            case 14:
                i9 = 11;
                i10 = i9;
                return new C4927z0(i10, str3, "com.google.android.gms.ads", c4927z0, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static void N(Er er, A0 a02) {
        int h9 = er.h(5);
        er.f(2);
        if (er.g()) {
            er.f(5);
        }
        if (h9 >= 7 && h9 <= 10) {
            er.e();
        }
        if (er.g()) {
            int h10 = er.h(3);
            if (a02.f23792b == -1 && h9 >= 0 && h9 <= 15 && (h10 == 0 || h10 == 1)) {
                a02.f23792b = h9;
            }
            if (er.g()) {
                W(er);
            }
        }
    }

    public static void O(String str, String str2, Throwable th) {
        synchronized (f30864B) {
            Log.w(str, a0(str2, th));
        }
    }

    public static void P(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j9 = jArr[i];
            long j10 = j9 / 67108864;
            jArr[i] = j9 - (j10 << 26);
            int i4 = i + 1;
            long j11 = jArr[i4] + j10;
            jArr[i4] = j11;
            long j12 = j11 / 33554432;
            jArr[i4] = j11 - (j12 << 25);
            i += 2;
            jArr[i] = jArr[i] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j14 + j14 + j15;
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        G(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Q(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int p6 = AbstractC3194fG.p(obj);
        int i4 = p6 & i;
        int s3 = s(i4, obj3);
        if (s3 != 0) {
            int i9 = ~i;
            int i10 = p6 & i9;
            int i11 = -1;
            while (true) {
                int i12 = s3 - 1;
                int i13 = iArr[i12];
                int i14 = i13 & i;
                if ((i13 & i9) != i10 || !Objects.equals(obj, objArr[i12]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i12]))) {
                    if (i14 == 0) {
                        break;
                    }
                    i11 = i12;
                    s3 = i14;
                }
            }
        }
        return -1;
    }

    public static Y1 R(int i, String str, Lr lr, boolean z8, boolean z9) {
        int V8 = V(lr);
        if (z9) {
            V8 = Math.min(1, V8);
        }
        if (V8 >= 0) {
            return z8 ? new C3071d2(str, null, UB.j(Integer.toString(V8))) : new W1(com.anythink.basead.exoplayer.b.ar, str, Integer.toString(V8));
        }
        I("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC3551lx.g(i)));
        return null;
    }

    public static void S(Er er, A0 a02) {
        er.f(2);
        boolean g9 = er.g();
        int h9 = er.h(8);
        for (int i = 0; i < h9; i++) {
            er.f(2);
            if (er.g()) {
                er.f(5);
            }
            if (g9) {
                er.f(24);
            } else {
                if (er.g()) {
                    if (!er.g()) {
                        er.f(4);
                    }
                    a02.f23793c = er.h(6) + 1;
                }
                er.f(4);
            }
        }
        if (er.g()) {
            er.f(3);
            if (er.g()) {
                W(er);
            }
        }
    }

    public static void T(String str, String str2) {
        synchronized (f30864B) {
            Log.e(str, a0(str2, null));
        }
    }

    public static void U(long[] jArr, long[] jArr2, long[] jArr3) {
        long j9 = jArr2[0];
        long j10 = jArr3[0];
        long j11 = j9 * j10;
        long j12 = jArr3[1];
        long j13 = jArr2[1];
        long j14 = (j13 * j10) + (j9 * j12);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        long j17 = ((j13 + j13) * j12) + (j9 * j15) + (j16 * j10);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        long j20 = (j13 * j15) + (j16 * j12) + (j9 * j18) + (j19 * j10);
        long j21 = jArr3[4];
        long j22 = jArr2[4];
        long j23 = (j13 * j18) + (j19 * j12);
        long j24 = j23 + j23 + (j16 * j15) + (j9 * j21) + (j22 * j10);
        long j25 = jArr3[5];
        long j26 = jArr2[5];
        long j27 = (j16 * j18) + (j19 * j15) + (j13 * j21) + (j22 * j12) + (j9 * j25) + (j26 * j10);
        long j28 = jArr3[6];
        long j29 = jArr2[6];
        long j30 = (j19 * j18) + (j13 * j25) + (j26 * j12);
        long j31 = j30 + j30 + (j16 * j21) + (j22 * j15) + (j9 * j28) + (j29 * j10);
        long j32 = jArr3[7];
        long j33 = jArr2[7];
        long j34 = (j19 * j21) + (j22 * j18) + (j16 * j25) + (j26 * j15) + (j13 * j28) + (j29 * j12) + (j9 * j32) + (j33 * j10);
        long j35 = jArr3[8];
        long j36 = jArr2[8];
        long j37 = (j19 * j25) + (j26 * j18) + (j13 * j32) + (j33 * j12);
        long j38 = j37 + j37 + (j22 * j21) + (j16 * j28) + (j29 * j15) + (j9 * j35) + (j36 * j10);
        long j39 = jArr3[9];
        long j40 = jArr2[9];
        long j41 = (j22 * j25) + (j26 * j21) + (j19 * j28) + (j29 * j18) + (j16 * j32) + (j33 * j15) + (j13 * j35) + (j36 * j12) + (j9 * j39) + (j10 * j40);
        long j42 = (j26 * j25) + (j19 * j32) + (j33 * j18) + (j13 * j39) + (j12 * j40);
        long j43 = (j26 * j32) + (j33 * j25) + (j19 * j39) + (j18 * j40);
        long j44 = (j33 * j32) + (j26 * j39) + (j25 * j40);
        long j45 = (j33 * j35) + (j36 * j32) + (j29 * j39) + (j28 * j40);
        long j46 = (j32 * j40) + (j33 * j39);
        J(new long[]{j11, j14, j17, j20, j24, j27, j31, j34, j38, j41, j42 + j42 + (j22 * j28) + (j29 * j21) + (j16 * j35) + (j36 * j15), (j26 * j28) + (j29 * j25) + (j22 * j32) + (j33 * j21) + (j19 * j35) + (j36 * j18) + (j16 * j39) + (j15 * j40), j43 + j43 + (j29 * j28) + (j22 * j35) + (j36 * j21), (j29 * j32) + (j33 * j28) + (j26 * j35) + (j36 * j25) + (j22 * j39) + (j21 * j40), j44 + j44 + (j29 * j35) + (j36 * j28), j45, j46 + j46 + (j36 * j35), (j35 * j40) + (j36 * j39), (j40 + j40) * j39}, jArr);
    }

    public static int V(Lr lr) {
        int b9 = lr.b();
        if (lr.b() == 1684108385) {
            lr.G(8);
            int i = b9 - 16;
            if (i == 1) {
                return lr.K();
            }
            if (i == 2) {
                return lr.L();
            }
            if (i == 3) {
                return lr.O();
            }
            if (i == 4 && (lr.I() & 128) == 0) {
                return lr.h();
            }
        }
        I("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void W(Er er) {
        int h9 = er.h(6);
        if (h9 < 2 || h9 > 42) {
            throw W4.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h9)));
        }
        er.f(h9 * 8);
    }

    public static void X(String str, String str2, Throwable th) {
        synchronized (f30864B) {
            Log.e(str, a0(str2, th));
        }
    }

    public static void Y(long[] jArr, long[] jArr2) {
        long j9 = jArr2[0];
        long j10 = j9 * j9;
        long j11 = jArr2[1];
        long j12 = (j9 + j9) * j11;
        long j13 = jArr2[2];
        long j14 = (j9 * j13) + (j11 * j11);
        long j15 = jArr2[3];
        long j16 = (j9 * j15) + (j11 * j13);
        long j17 = jArr2[4];
        long j18 = (j13 * j13) + (j11 * 4 * j15) + ((j9 + j9) * j17);
        long j19 = jArr2[5];
        long j20 = (j13 * j15) + (j11 * j17) + (j9 * j19);
        long j21 = jArr2[6];
        long j22 = (j15 * j15) + (j13 * j17) + (j9 * j21) + ((j11 + j11) * j19);
        long j23 = jArr2[7];
        long j24 = (j15 * j17) + (j13 * j19) + (j11 * j21) + (j9 * j23);
        long j25 = jArr2[8];
        long j26 = (j15 * j19) + (j11 * j23);
        long j27 = j26 + j26 + (j13 * j21) + (j9 * j25);
        long j28 = j27 + j27 + (j17 * j17);
        long j29 = jArr2[9];
        long j30 = (j17 * j19) + (j15 * j21) + (j13 * j23) + (j11 * j25) + (j9 * j29);
        long j31 = (j11 * j29) + (j15 * j23);
        long j32 = j31 + j31 + (j19 * j19) + (j17 * j21) + (j13 * j25);
        long j33 = (j19 * j21) + (j17 * j23) + (j15 * j25) + (j13 * j29);
        long j34 = (j15 * j29) + (j19 * j23);
        long j35 = j34 + j34 + (j17 * j25);
        long j36 = j35 + j35 + (j21 * j21);
        long j37 = (j21 * j23) + (j19 * j25) + (j17 * j29);
        long j38 = (j23 * j23) + (j21 * j25) + ((j19 + j19) * j29);
        long j39 = (j21 * j29) + (j23 * j25);
        J(new long[]{j10, j12, j14 + j14, j16 + j16, j18, j20 + j20, j22 + j22, j24 + j24, j28, j30 + j30, j32 + j32, j33 + j33, j36, j37 + j37, j38 + j38, j39 + j39, (j23 * 4 * j29) + (j25 * j25), (j25 + j25) * j29, (j29 + j29) * j29}, jArr);
    }

    public static C3071d2 Z(int i, String str, Lr lr) {
        int b9 = lr.b();
        if (lr.b() == 1684108385 && b9 >= 22) {
            lr.G(10);
            int L8 = lr.L();
            if (L8 > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(L8).length());
                sb.append(L8);
                String sb2 = sb.toString();
                int L9 = lr.L();
                if (L9 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(L9).length());
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(L9);
                    sb2 = sb3.toString();
                }
                return new C3071d2(str, null, UB.j(sb2));
            }
        }
        I("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC3551lx.g(i)));
        return null;
    }

    public static String a0(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f30864B) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String replace2 = replace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(replace2).length() + length + 3 + 1), str, "\n  ", replace2, "\n");
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static long[] b0(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i4 = f30869G[i];
            jArr[i] = (((((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8)) | ((bArr[i4 + 2] & 255) << 16)) | ((bArr[i4 + 3] & 255) << 24)) >> f30870H[i]) & f30871I[i & 1];
        }
        return jArr;
    }

    public static int c(String str) {
        int i;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i4 = 0;
        int i9 = 0;
        while (true) {
            i = length & (-4);
            if (i4 >= i) {
                break;
            }
            int i10 = ((bytes[i4] & 255) | ((bytes[i4 + 1] & 255) << 8) | ((bytes[i4 + 2] & 255) << 16) | (bytes[i4 + 3] << 24)) * (-862048943);
            int i11 = i9 ^ (((i10 >>> 17) | (i10 << 15)) * 461845907);
            i9 = (((i11 >>> 19) | (i11 << 13)) * 5) - 430675100;
            i4 += 4;
        }
        int i12 = length & 3;
        if (i12 != 1) {
            if (i12 != 2) {
                r1 = i12 == 3 ? (bytes[i + 2] & 255) << 16 : 0;
                int i13 = i9 ^ length;
                int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
                int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
                return i15 ^ (i15 >>> 16);
            }
            r1 |= (bytes[i + 1] & 255) << 8;
        }
        int i16 = ((bytes[i] & 255) | r1) * (-862048943);
        i9 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        int i132 = i9 ^ length;
        int i142 = (i132 ^ (i132 >>> 16)) * (-2048144789);
        int i152 = (i142 ^ (i142 >>> 13)) * (-1028477387);
        return i152 ^ (i152 >>> 16);
    }

    public static byte[] c0(long[] jArr) {
        int[] iArr;
        char c4;
        int i;
        long j9;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i4 = 0;
        int i9 = 0;
        while (true) {
            iArr = J;
            c4 = 25;
            i = 2;
            j9 = 19;
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j10 = copyOf[i10];
                int i11 = -((int) (((j10 >> 31) & j10) >> iArr[i10 & 1]));
                copyOf[i10] = j10 + (i11 << r15);
                i10++;
                copyOf[i10] = copyOf[i10] - i11;
            }
            long j11 = copyOf[9];
            copyOf[9] = j11 + (r4 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j11 >> 31) & j11) >> 25))) * 19);
            i9++;
        }
        long j12 = copyOf[0];
        copyOf[0] = j12 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j12 >> 31) & j12) >> 26)));
        int i12 = 0;
        while (true) {
            iArr2 = f30871I;
            if (i12 >= i) {
                break;
            }
            int i13 = i4;
            while (i13 < 9) {
                long j13 = copyOf[i13];
                int i14 = i4;
                long j14 = j13 >> iArr[i13 & 1];
                copyOf[i13] = j13 & iArr2[r16];
                i13++;
                copyOf[i13] = copyOf[i13] + ((int) j14);
                i4 = i14;
                c4 = c4;
                i12 = i12;
                j9 = j9;
            }
            i12++;
            i = 2;
        }
        int i15 = i4;
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[i15] = (((int) (r2 >> c4)) * j9) + copyOf[i15];
        int i16 = ~((((int) r4) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) copyOf[i17]) ^ iArr2[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 + i22)) >> 31;
        }
        copyOf[i15] = copyOf[i15] - (67108845 & i16);
        long j15 = 33554431 & i16;
        copyOf[1] = copyOf[1] - j15;
        for (int i23 = 2; i23 < 10; i23 += 2) {
            copyOf[i23] = copyOf[i23] - (67108863 & i16);
            int i24 = i23 + 1;
            copyOf[i24] = copyOf[i24] - j15;
        }
        for (int i25 = i15; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << f30870H[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = i15; i26 < 10; i26++) {
            int i27 = f30869G[i26];
            long j16 = bArr[i27];
            long j17 = copyOf[i26];
            bArr[i27] = (byte) (j16 | (j17 & 255));
            bArr[i27 + 1] = (byte) (bArr[r5] | ((j17 >> 8) & 255));
            bArr[i27 + 2] = (byte) (bArr[r5] | ((j17 >> 16) & 255));
            bArr[i27 + 3] = (byte) (bArr[r4] | ((j17 >> 24) & 255));
        }
        return bArr;
    }

    public static long e(long j9, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j9 / j10;
        long j12 = j9 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i = ((int) ((j9 ^ j10) >> 63)) | 1;
        switch (SC.f27512a[roundingMode.ordinal()]) {
            case 1:
                PA.v(false);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i >= 0) {
                    return j11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j11;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j12);
                long abs2 = abs - (Math.abs(j10) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (abs2 <= 0) {
                    return j11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j11 + i;
    }

    public static long f(String str) {
        String str2 = AbstractC3548lu.f32613a;
        String[] split = str.split("\\.", 2);
        long j9 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j9 = (j9 * 60) + Long.parseLong(str3);
        }
        long j10 = j9 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j10 += Long.parseLong(trim);
        }
        return j10 * 1000;
    }

    public static T4 g(C2965b5 c2965b5) {
        long j9;
        boolean z8;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c2965b5.f29403c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long u7 = str != null ? u(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z8 = false;
            j10 = 0;
            j11 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z8 = true;
                }
                i++;
            }
            j9 = 0;
            i = 1;
        } else {
            j9 = 0;
            z8 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long u9 = str3 != null ? u(str3) : j9;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j12 = currentTimeMillis;
            j13 = u(str4);
        } else {
            j12 = currentTimeMillis;
            j13 = j9;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j16 = (j11 * 1000) + j12;
            j15 = z8 ? j16 : (j10 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (u7 <= j9 || u9 < u7) ? j9 : (u9 - u7) + j12;
            j15 = j14;
        }
        T4 t42 = new T4(0);
        t42.f27709a = c2965b5.f29402b;
        t42.f27710b = str5;
        t42.f27714f = j14;
        t42.f27713e = j15;
        t42.f27711c = u7;
        t42.f27712d = j13;
        t42.f27715g = map;
        t42.f27716h = c2965b5.f29404d;
        return t42;
    }

    public static Object h(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(D.y.j(i, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i).length() + 41)));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static String i(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static synchronized Executor j() {
        ExecutorService executorService;
        synchronized (AbstractC3217fl.class) {
            try {
                if (f30873n == null) {
                    String str = AbstractC3548lu.f32613a;
                    f30873n = Executors.newSingleThreadExecutor(new ThreadFactoryC3062cu("ExoPlayer:BackgroundExecutor"));
                }
                executorService = f30873n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static C4927z0 k(Throwable th) {
        if (th instanceof C3652nq) {
            C3652nq c3652nq = (C3652nq) th;
            return F(c3652nq.f31103n, c3652nq.f33032u);
        }
        if (th instanceof C3275gp) {
            return th.getMessage() == null ? M(((C3275gp) th).f31103n, null, null) : M(((C3275gp) th).f31103n, th.getMessage(), null);
        }
        if (!(th instanceof t2.m)) {
            return M(1, null, null);
        }
        t2.m mVar = (t2.m) th;
        int i = mVar.f40919n;
        String message = mVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new C4927z0(i, message, "com.google.android.gms.ads", null, null);
    }

    public static void l(int i, R3 r32, C4065vP c4065vP, R3 r33, R3... r3Arr) {
        if (r33 == null) {
            r33 = new R3(new InterfaceC4043v3[0]);
        }
        if (r32 != null) {
            SB sb = UB.f27942u;
            AbstractC2720Pd.p(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i4 = 0;
            for (InterfaceC4043v3 interfaceC4043v3 : r32.f27306a) {
                if (C4143ww.class.isAssignableFrom(interfaceC4043v3.getClass())) {
                    InterfaceC4043v3 interfaceC4043v32 = (InterfaceC4043v3) C4143ww.class.cast(interfaceC4043v3);
                    interfaceC4043v32.getClass();
                    int length = objArr.length;
                    int i9 = i4 + 1;
                    int d2 = PB.d(length, i9);
                    if (d2 > length) {
                        objArr = Arrays.copyOf(objArr, d2);
                    }
                    objArr[i4] = interfaceC4043v32;
                    i4 = i9;
                }
            }
            C3675oC p6 = UB.p(objArr, i4);
            int i10 = p6.f33117w;
            for (int i11 = 0; i11 < i10; i11++) {
                C4143ww c4143ww = (C4143ww) p6.get(i11);
                if (!c4143ww.f35092a.equals("com.android.capture.fps") || i == 2) {
                    r33 = r33.c(c4143ww);
                }
            }
        }
        for (R3 r34 : r3Arr) {
            r33 = r33.b(r34);
        }
        if (r33.f27306a.length > 0) {
            c4065vP.f34782k = r33;
        }
    }

    public static void m(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(D.y.j(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void n(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i4) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i4, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i4 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i4, 33);
    }

    public static void o(String str, String str2) {
        synchronized (f30864B) {
            Log.d(str, a0(str2, null));
        }
    }

    public static void p(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static boolean q(String str) {
        return str == null || str.isEmpty();
    }

    public static float r(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static int s(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static long t(long j9, long j10) {
        PA.m("a", j9);
        PA.m("b", j10);
        if (j9 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j9;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
        long j11 = j9 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j12 = j10 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
            j12 += j14;
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long u(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e6) {
            if ("0".equals(str) || "-1".equals(str)) {
                AbstractC3346i5.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", AbstractC3346i5.d("Unable to parse dateStr: %s, falling back to 0", str), e6);
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r10 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static W2.b v(Er er) {
        int i;
        int i4;
        int h9 = er.h(16);
        int h10 = er.h(16);
        if (h10 == 65535) {
            h10 = er.h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i9 = h10 + i;
        if (h9 == 44097) {
            i9 += 2;
        }
        if (er.h(2) == 3) {
            do {
                er.h(2);
            } while (er.g());
        }
        int h11 = er.h(10);
        if (er.g() && er.h(3) > 0) {
            er.f(2);
        }
        int i10 = true != er.g() ? 44100 : 48000;
        int h12 = er.h(4);
        int[] iArr = f30874u;
        if (i10 == 44100 && h12 == 13) {
            i4 = iArr[13];
        } else if (i10 != 48000 || h12 >= 14) {
            i4 = 0;
        } else {
            int i11 = iArr[h12];
            int i12 = h11 % 5;
            if (i12 != 1) {
                if (i12 == 2) {
                    if (h12 != 8) {
                    }
                    i4 = i11 + 1;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (h12 != 3) {
                            if (h12 != 8) {
                            }
                        }
                        i4 = i11 + 1;
                    }
                    i4 = i11;
                }
            }
            if (h12 != 3) {
            }
            i4 = i11 + 1;
        }
        return new W2.b(i10, i9, i4, false);
    }

    public static C4927z0 w(Throwable th, C3706oq c3706oq) {
        C4927z0 c4927z0;
        C4927z0 k6 = k(th);
        int i = k6.f40122n;
        if ((i == 3 || i == 0) && (c4927z0 = k6.f40125w) != null && !c4927z0.f40124v.equals("com.google.android.gms.ads")) {
            k6.f40125w = null;
        }
        if (c3706oq != null) {
            k6.f40126x = new BinderC3754pk(c3706oq.f33225e, "", c3706oq, c3706oq.f33224d, c3706oq.f33223c);
        }
        return k6;
    }

    public static void x(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void y(String str, String str2) {
        synchronized (f30864B) {
            Log.i(str, a0(str2, null));
        }
    }

    public static void z(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }
}
