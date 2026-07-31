package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.av0;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class av0 {

    /* renamed from: a, reason: collision with root package name */
    private static final bv0 f23460a;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f23461b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<a, List<su0>> f23462c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f23463d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f23464e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f23465f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f23466g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f23467h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f23468i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f23469j;

    /* renamed from: k, reason: collision with root package name */
    private static int f23470k;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f23471a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23472b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f23473c;

        public a(String str, boolean z4, boolean z5) {
            this.f23471a = str;
            this.f23472b = z4;
            this.f23473c = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f23471a, aVar.f23471a) && this.f23472b == aVar.f23472b && this.f23473c == aVar.f23473c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((C1842c3.a(this.f23471a, 31, 31) + (this.f23472b ? 1231 : 1237)) * 31) + (this.f23473c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        private b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    private interface c {
        int a();

        MediaCodecInfo a(int i4);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    private static final class d implements c {
        @Override // com.yandex.mobile.ads.impl.av0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final boolean b() {
            return false;
        }

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final MediaCodecInfo a(int i4) {
            return MediaCodecList.getCodecInfoAt(i4);
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f<T> {
        int a(T t4);
    }

    static {
        bv0 g4 = hm1.g();
        f23460a = g4;
        f23461b = Pattern.compile("^\\D?(\\d+)$");
        f23462c = new HashMap<>();
        f23463d = g4.b();
        f23464e = g4.c();
        f23465f = g4.O();
        f23466g = g4.q();
        f23467h = g4.r();
        f23468i = g4.a();
        f23469j = g4.F();
        f23470k = -1;
    }

    public static String a(yb0 yb0Var) {
        Pair<Integer, Integer> b4;
        if ("audio/eac3-joc".equals(yb0Var.f34991m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(yb0Var.f34991m) || (b4 = b(yb0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) b4.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x041e A[Catch: NumberFormatException -> 0x042e, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x042e, blocks: (B:270:0x03c7, B:272:0x03db, B:283:0x03f7, B:286:0x041e), top: B:269:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x06b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> b(yb0 yb0Var) {
        int i4;
        int i5;
        int parseInt;
        int parseInt2;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num2;
        Integer num3;
        char c4;
        char c5;
        int i15 = 1;
        int i16 = 2;
        String str = yb0Var.f34988j;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if ("video/dolby-vision".equals(yb0Var.f34991m)) {
            String str2 = yb0Var.f34988j;
            if (split.length < 3) {
                zu0.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = f23461b.matcher(split[1]);
            if (!matcher.matches()) {
                zu0.a("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String group = matcher.group(1);
            if (group != null) {
                switch (group.hashCode()) {
                    case 1536:
                        if (group.equals("00")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1537:
                        if (group.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        num2 = 1;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = 16;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
                        break;
                    case '\b':
                        num2 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                        break;
                    case '\t':
                        num2 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                        break;
                }
                if (num2 != null) {
                    zu0.a("Unknown Dolby Vision profile string: ", group, "MediaCodecUtil");
                    return null;
                }
                String str3 = split[2];
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case 1537:
                            if (str3.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1538:
                            if (str3.equals("02")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1539:
                            if (str3.equals("03")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1540:
                            if (str3.equals("04")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1541:
                            if (str3.equals("05")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1542:
                            if (str3.equals("06")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1543:
                            if (str3.equals("07")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1544:
                            if (str3.equals("08")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1545:
                            if (str3.equals("09")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1567:
                            if (str3.equals("10")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1568:
                            if (str3.equals("11")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1569:
                            if (str3.equals("12")) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1570:
                            if (str3.equals("13")) {
                                c4 = '\f';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            num3 = 1;
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
                            break;
                        case '\b':
                            num3 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                            break;
                        case '\t':
                            num3 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                            break;
                        case '\n':
                            num3 = 1024;
                            break;
                        case 11:
                            num3 = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f17688n);
                            break;
                        case '\f':
                            num3 = Integer.valueOf(Base64Utils.IO_BUFFER_SIZE);
                            break;
                    }
                    if (num3 == null) {
                        return new Pair<>(num2, num3);
                    }
                    zu0.a("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                    return null;
                }
                num3 = null;
                if (num3 == null) {
                }
            }
            num2 = null;
            if (num2 != null) {
            }
        } else if (f23463d.equals(split[0]) || f23464e.equals(split[0])) {
            String str4 = yb0Var.f34988j;
            if (split.length < 2) {
                zu0.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                return null;
            }
            try {
                if (split[1].length() == 6) {
                    i4 = 16;
                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                    i5 = 4;
                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                } else {
                    i4 = 16;
                    i5 = 4;
                    if (split.length < 3) {
                        ms0.d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                        return null;
                    }
                    parseInt = Integer.parseInt(split[1]);
                    parseInt2 = Integer.parseInt(split[2]);
                }
                if (parseInt == 66) {
                    i16 = 1;
                } else if (parseInt != 77) {
                    if (parseInt == 88) {
                        i16 = i5;
                    } else if (parseInt == 100) {
                        i16 = 8;
                    } else if (parseInt == 110) {
                        i16 = i4;
                    } else if (parseInt == 122) {
                        i16 = 32;
                    } else {
                        if (parseInt != 244) {
                            i6 = -1;
                            i16 = -1;
                            if (i16 != i6) {
                                fr0.a("Unknown AVC profile: ", parseInt, "MediaCodecUtil");
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i7 = 1;
                                    i8 = -1;
                                    break;
                                case 11:
                                    i7 = i5;
                                    i8 = -1;
                                    break;
                                case 12:
                                    i7 = 8;
                                    i8 = -1;
                                    break;
                                case 13:
                                    i7 = i4;
                                    i8 = -1;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i7 = 32;
                                            i8 = -1;
                                            break;
                                        case 21:
                                            i7 = 64;
                                            i8 = -1;
                                            break;
                                        case 22:
                                            i7 = 128;
                                            i8 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                                    i7 = 256;
                                                    i8 = -1;
                                                    break;
                                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                                    i7 = 512;
                                                    i8 = -1;
                                                    break;
                                                case 32:
                                                    i7 = 1024;
                                                    i8 = -1;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i7 = 2048;
                                                            i8 = -1;
                                                            break;
                                                        case 41:
                                                            i7 = 4096;
                                                            i8 = -1;
                                                            break;
                                                        case 42:
                                                            i7 = 8192;
                                                            i8 = -1;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i7 = 16384;
                                                                    i8 = -1;
                                                                    break;
                                                                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                                                                    i7 = 32768;
                                                                    i8 = -1;
                                                                    break;
                                                                case IronSourceConstants.SET_USER_ID /* 52 */:
                                                                    i7 = 65536;
                                                                    i8 = -1;
                                                                    break;
                                                                default:
                                                                    i8 = -1;
                                                                    i7 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i7 != i8) {
                                return new Pair<>(Integer.valueOf(i16), Integer.valueOf(i7));
                            }
                            fr0.a("Unknown AVC level: ", parseInt2, "MediaCodecUtil");
                            return null;
                        }
                        i16 = 64;
                    }
                }
                i6 = -1;
                if (i16 != i6) {
                }
            } catch (NumberFormatException unused) {
                zu0.a("Ignoring malformed AVC codec string: ", str4, "MediaCodecUtil");
                return null;
            }
        } else if (f23465f.equals(split[0])) {
            String str5 = yb0Var.f34988j;
            if (split.length < 3) {
                zu0.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                return null;
            }
            try {
                int parseInt3 = Integer.parseInt(split[1]);
                int parseInt4 = Integer.parseInt(split[2]);
                int i17 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                if (i17 == -1) {
                    fr0.a("Unknown VP9 profile: ", parseInt3, "MediaCodecUtil");
                    return null;
                }
                if (parseInt4 != 10) {
                    if (parseInt4 == 11) {
                        i15 = 2;
                    } else if (parseInt4 == 20) {
                        i15 = 4;
                    } else if (parseInt4 == 21) {
                        i15 = 8;
                    } else if (parseInt4 == 30) {
                        i15 = 16;
                    } else if (parseInt4 == 31) {
                        i15 = 32;
                    } else if (parseInt4 == 40) {
                        i15 = 64;
                    } else if (parseInt4 == 41) {
                        i15 = 128;
                    } else if (parseInt4 == 50) {
                        i15 = 256;
                    } else {
                        if (parseInt4 != 51) {
                            switch (parseInt4) {
                                case 60:
                                    i15 = 2048;
                                    break;
                                case 61:
                                    i15 = 4096;
                                    break;
                                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                                    i15 = 8192;
                                    break;
                                default:
                                    i14 = -1;
                                    i15 = -1;
                                    break;
                            }
                            if (i15 == i14) {
                                return new Pair<>(Integer.valueOf(i17), Integer.valueOf(i15));
                            }
                            fr0.a("Unknown VP9 level: ", parseInt4, "MediaCodecUtil");
                            return null;
                        }
                        i15 = 512;
                    }
                }
                i14 = -1;
                if (i15 == i14) {
                }
            } catch (NumberFormatException unused2) {
                zu0.a("Ignoring malformed VP9 codec string: ", str5, "MediaCodecUtil");
                return null;
            }
        } else {
            if (!f23466g.equals(split[0]) && !f23467h.equals(split[0])) {
                if (!f23468i.equals(split[0])) {
                    if (f23469j.equals(split[0])) {
                        String str6 = yb0Var.f34988j;
                        if (split.length != 3) {
                            zu0.a("Ignoring malformed MP4A codec string: ", str6, "MediaCodecUtil");
                            return null;
                        }
                        try {
                            if ("audio/mp4a-latm".equals(i01.a(Integer.parseInt(split[1], 16)))) {
                                int parseInt5 = Integer.parseInt(split[2]);
                                if (parseInt5 == 17) {
                                    i16 = 17;
                                } else if (parseInt5 == 20) {
                                    i16 = 20;
                                } else if (parseInt5 == 23) {
                                    i16 = 23;
                                } else if (parseInt5 == 29) {
                                    i16 = 29;
                                } else if (parseInt5 == 39) {
                                    i16 = 39;
                                } else if (parseInt5 != 42) {
                                    switch (parseInt5) {
                                        case 1:
                                            i16 = 1;
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            i16 = 3;
                                            break;
                                        case 4:
                                            i10 = -1;
                                            i16 = 4;
                                            break;
                                        case 5:
                                            i10 = -1;
                                            i16 = 5;
                                            break;
                                        case 6:
                                            i10 = -1;
                                            i16 = 6;
                                            break;
                                        default:
                                            i10 = -1;
                                            i16 = -1;
                                            break;
                                    }
                                    if (i16 != i10) {
                                        return new Pair<>(Integer.valueOf(i16), 0);
                                    }
                                } else {
                                    i16 = 42;
                                }
                                i10 = -1;
                                if (i16 != i10) {
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            zu0.a("Ignoring malformed MP4A codec string: ", str6, "MediaCodecUtil");
                        }
                    }
                    return null;
                }
                String str7 = yb0Var.f34988j;
                eq eqVar = yb0Var.f35003y;
                if (split.length < 4) {
                    zu0.a("Ignoring malformed AV1 codec string: ", str7, "MediaCodecUtil");
                    return null;
                }
                try {
                    int parseInt6 = Integer.parseInt(split[1]);
                    int parseInt7 = Integer.parseInt(split[2].substring(0, 2));
                    int parseInt8 = Integer.parseInt(split[3]);
                    if (parseInt6 != 0) {
                        fr0.a("Unknown AV1 profile: ", parseInt6, "MediaCodecUtil");
                        return null;
                    }
                    if (parseInt8 != 8 && parseInt8 != 10) {
                        fr0.a("Unknown AV1 bit depth: ", parseInt8, "MediaCodecUtil");
                        return null;
                    }
                    int i18 = parseInt8 == 8 ? 1 : (eqVar == null || !(eqVar.f25389e != null || (i11 = eqVar.f25388d) == 7 || i11 == 6)) ? 2 : 4096;
                    switch (parseInt7) {
                        case 0:
                            i12 = 1;
                            i13 = -1;
                            break;
                        case 1:
                            i12 = 2;
                            i13 = -1;
                            break;
                        case 2:
                            i13 = -1;
                            i12 = 4;
                            break;
                        case 3:
                            i13 = -1;
                            i12 = 8;
                            break;
                        case 4:
                            i12 = 16;
                            i13 = -1;
                            break;
                        case 5:
                            i12 = 32;
                            i13 = -1;
                            break;
                        case 6:
                            i12 = 64;
                            i13 = -1;
                            break;
                        case 7:
                            i12 = 128;
                            i13 = -1;
                            break;
                        case 8:
                            i12 = 256;
                            i13 = -1;
                            break;
                        case 9:
                            i12 = 512;
                            i13 = -1;
                            break;
                        case 10:
                            i12 = 1024;
                            i13 = -1;
                            break;
                        case 11:
                            i12 = 2048;
                            i13 = -1;
                            break;
                        case 12:
                            i12 = 4096;
                            i13 = -1;
                            break;
                        case 13:
                            i12 = 8192;
                            i13 = -1;
                            break;
                        case 14:
                            i12 = 16384;
                            i13 = -1;
                            break;
                        case 15:
                            i12 = 32768;
                            i13 = -1;
                            break;
                        case 16:
                            i12 = 65536;
                            i13 = -1;
                            break;
                        case 17:
                            i12 = 131072;
                            i13 = -1;
                            break;
                        case 18:
                            i12 = 262144;
                            i13 = -1;
                            break;
                        case 19:
                            i12 = 524288;
                            i13 = -1;
                            break;
                        case 20:
                            i12 = 1048576;
                            i13 = -1;
                            break;
                        case 21:
                            i12 = 2097152;
                            i13 = -1;
                            break;
                        case 22:
                            i12 = 4194304;
                            i13 = -1;
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            i12 = 8388608;
                            i13 = -1;
                            break;
                        default:
                            i13 = -1;
                            i12 = -1;
                            break;
                    }
                    if (i12 != i13) {
                        return new Pair<>(Integer.valueOf(i18), Integer.valueOf(i12));
                    }
                    fr0.a("Unknown AV1 level: ", parseInt7, "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    zu0.a("Ignoring malformed AV1 codec string: ", str7, "MediaCodecUtil");
                    return null;
                }
            }
            String str8 = yb0Var.f34988j;
            if (split.length < 4) {
                zu0.a("Ignoring malformed HEVC codec string: ", str8, "MediaCodecUtil");
                return null;
            }
            Matcher matcher2 = f23461b.matcher(split[1]);
            if (!matcher2.matches()) {
                zu0.a("Ignoring malformed HEVC codec string: ", str8, "MediaCodecUtil");
                return null;
            }
            String group2 = matcher2.group(1);
            if ("1".equals(group2)) {
                i9 = 1;
            } else {
                if (!"2".equals(group2)) {
                    zu0.a("Unknown HEVC profile string: ", group2, "MediaCodecUtil");
                    return null;
                }
                i9 = 2;
            }
            String str9 = split[3];
            if (str9 != null) {
                bv0 bv0Var = f23460a;
                if (bv0Var.A().equals(str9)) {
                    num = 1;
                } else if (bv0Var.B().equals(str9)) {
                    num = 4;
                } else if (bv0Var.C().equals(str9)) {
                    num = 16;
                } else if (bv0Var.D().equals(str9)) {
                    num = 64;
                } else if (bv0Var.E().equals(str9)) {
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                } else if (bv0Var.s().equals(str9)) {
                    num = 1024;
                } else if (bv0Var.t().equals(str9)) {
                    num = Integer.valueOf(Base64Utils.IO_BUFFER_SIZE);
                } else if (bv0Var.u().equals(str9)) {
                    num = 16384;
                } else if (bv0Var.v().equals(str9)) {
                    num = 65536;
                } else if (bv0Var.w().equals(str9)) {
                    num = 262144;
                } else if (bv0Var.x().equals(str9)) {
                    num = 1048576;
                } else if (bv0Var.y().equals(str9)) {
                    num = 4194304;
                } else if (bv0Var.z().equals(str9)) {
                    num = 16777216;
                } else if (bv0Var.l().equals(str9)) {
                    num = 2;
                } else if (bv0Var.m().equals(str9)) {
                    num = 8;
                } else if (bv0Var.n().equals(str9)) {
                    num = 32;
                } else if (bv0Var.o().equals(str9)) {
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
                } else if (bv0Var.p().equals(str9)) {
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                } else if (bv0Var.d().equals(str9)) {
                    num = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f17688n);
                } else if (bv0Var.e().equals(str9)) {
                    num = 8192;
                } else if (bv0Var.f().equals(str9)) {
                    num = 32768;
                } else if (bv0Var.g().equals(str9)) {
                    num = 131072;
                } else if (bv0Var.h().equals(str9)) {
                    num = 524288;
                } else if (bv0Var.i().equals(str9)) {
                    num = 2097152;
                } else if (bv0Var.j().equals(str9)) {
                    num = 8388608;
                } else if (bv0Var.k().equals(str9)) {
                    num = 33554432;
                }
                if (num == null) {
                    return new Pair<>(Integer.valueOf(i9), num);
                }
                zu0.a("Unknown HEVC level string: ", str9, "MediaCodecUtil");
                return null;
            }
            num = null;
            if (num == null) {
            }
        }
    }

    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f23474a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f23475b;

        public e(boolean z4, boolean z5) {
            this.f23474a = (z4 || z5) ? 1 : 0;
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final int a() {
            if (this.f23475b == null) {
                this.f23475b = new MediaCodecList(this.f23474a).getCodecInfos();
            }
            return this.f23475b.length;
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final MediaCodecInfo a(int i4) {
            if (this.f23475b == null) {
                this.f23475b = new MediaCodecList(this.f23474a).getCodecInfos();
            }
            return this.f23475b[i4];
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.yandex.mobile.ads.impl.av0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            bv0 bv0Var = f23460a;
            byte[] a4 = yu0.a(bv0Var, "T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0, "decode(...)");
            Charset charset = Charsets.UTF_8;
            if (new String(a4, charset).equals(str)) {
                return new String(yu0.a(bv0Var, "dmlkZW8vaGV2Y2R2", 0, "decode(...)"), charset);
            }
            if (xu0.a(yu0.a(bv0Var, "T01YLlJUSy52aWRlby5kZWNvZGVy", 0, "decode(...)"), charset, str) || xu0.a(yu0.a(bv0Var, "T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0, "decode(...)"), charset, str)) {
                return new String(yu0.a(bv0Var, "dmlkZW8vZHZfaGV2Yw==", 0, "decode(...)"), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(yu0.a(f23460a, "T01YLmxnZS5hbGFjLmRlY29kZXI=", 0, "decode(...)"), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(yu0.a(f23460a, "T01YLmxnZS5mbGFjLmRlY29kZXI=", 0, "decode(...)"), Charsets.UTF_8).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(yu0.a(f23460a, "T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0, "decode(...)"), Charsets.UTF_8).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:32|(1:34)(2:112|113)|35|(3:36|37|(1:39)(9:88|89|90|91|92|93|94|95|(1:102)(1:101)))|(12:79|80|(1:82)|44|45|46|47|48|49|50|51|12)|(3:70|(2:73|75)|12)|44|45|46|47|48|49|50|51|12) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r11 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140 A[Catch: Exception -> 0x018a, TRY_ENTER, TryCatch #3 {Exception -> 0x018a, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:12:0x015f, B:13:0x0031, B:16:0x003c, B:54:0x0138, B:57:0x0140, B:59:0x0146, B:62:0x0167, B:63:0x0188), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<su0> a(a aVar, c cVar) {
        String str;
        String str2;
        int i4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean a4;
        boolean a5;
        boolean z4;
        boolean z5;
        boolean a6;
        byte[] decode;
        boolean z6;
        boolean isVendor;
        boolean isAlias;
        c cVar2 = cVar;
        String str3 = "secure-playback";
        try {
            ArrayList<su0> arrayList = new ArrayList<>();
            String str4 = aVar.f23471a;
            int a7 = cVar2.a();
            boolean b4 = cVar2.b();
            int i5 = 0;
            while (i5 < a7) {
                MediaCodecInfo a8 = cVar2.a(i5);
                int i6 = u82.f32873a;
                if (i6 >= 29) {
                    isAlias = a8.isAlias();
                }
                String name = a8.getName();
                if (a(a8, name, b4, str4)) {
                    int i7 = i5;
                    String a9 = a(a8, name, str4);
                    if (a9 != null) {
                        try {
                            capabilitiesForType = a8.getCapabilitiesForType(a9);
                            a4 = cVar2.a("tunneled-playback", a9, capabilitiesForType);
                            a5 = cVar2.a("tunneled-playback", capabilitiesForType);
                            z4 = aVar.f23473c;
                        } catch (Exception e4) {
                            e = e4;
                            str = str3;
                            str2 = name;
                            i4 = i7;
                        }
                        if ((z4 || !a5) && (!z4 || a4)) {
                            boolean a10 = cVar2.a(str3, a9, capabilitiesForType);
                            boolean a11 = cVar2.a(str3, capabilitiesForType);
                            boolean z7 = aVar.f23472b;
                            if ((z7 || !a11) && (!z7 || a10)) {
                                if (i6 >= 29) {
                                    z5 = a8.isHardwareAccelerated();
                                } else {
                                    z5 = !a(a8, str4);
                                }
                                try {
                                    a6 = a(a8, str4);
                                    if (i6 >= 29) {
                                        isVendor = a8.isVendor();
                                        str = str3;
                                        i4 = i7;
                                        z6 = isVendor;
                                    } else {
                                        String b5 = C2207rf.b(a8.getName());
                                        f23460a.getClass();
                                        try {
                                            decode = Base64.decode("b214Lmdvb2dsZS4=", 0);
                                            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                                            str = str3;
                                        } catch (Exception e5) {
                                            e = e5;
                                            str = str3;
                                            i4 = i7;
                                            str2 = name;
                                            if (u82.f32873a <= 23 && !arrayList.isEmpty()) {
                                                ms0.b("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i5 = i4 + 1;
                                                cVar2 = cVar;
                                                str3 = str;
                                            } else {
                                                ms0.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + a9 + ")");
                                                throw e;
                                            }
                                        }
                                        try {
                                            if (b5.startsWith(new String(decode, Charsets.UTF_8)) || b5.startsWith("c2.android.") || b5.startsWith("c2.google.")) {
                                                i4 = i7;
                                                z6 = false;
                                            } else {
                                                i4 = i7;
                                                z6 = true;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            i4 = i7;
                                            str2 = name;
                                            if (u82.f32873a <= 23) {
                                            }
                                            ms0.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + a9 + ")");
                                            throw e;
                                        }
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    str = str3;
                                }
                                if (b4) {
                                    try {
                                        if (aVar.f23472b != a10) {
                                        }
                                        str2 = name;
                                        arrayList.add(su0.a(name, str4, a9, capabilitiesForType, z5, a6, z6, false));
                                    } catch (Exception e8) {
                                        e = e8;
                                        str2 = name;
                                        if (u82.f32873a <= 23) {
                                        }
                                        ms0.b("MediaCodecUtil", "Failed to query codec " + str2 + " (" + a9 + ")");
                                        throw e;
                                    }
                                    i5 = i4 + 1;
                                    cVar2 = cVar;
                                    str3 = str;
                                }
                                if (b4 || aVar.f23472b) {
                                    str2 = name;
                                    if (!b4 && a10) {
                                        arrayList.add(su0.a(str2 + ".secure", str4, a9, capabilitiesForType, z5, a6, z6, true));
                                        break;
                                    }
                                    i5 = i4 + 1;
                                    cVar2 = cVar;
                                    str3 = str;
                                }
                                str2 = name;
                                arrayList.add(su0.a(name, str4, a9, capabilitiesForType, z5, a6, z6, false));
                                i5 = i4 + 1;
                                cVar2 = cVar;
                                str3 = str;
                            }
                        }
                    }
                    str = str3;
                    i4 = i7;
                    i5 = i4 + 1;
                    cVar2 = cVar;
                    str3 = str;
                } else {
                    str = str3;
                    i4 = i5;
                    i5 = i4 + 1;
                    cVar2 = cVar;
                    str3 = str;
                }
            }
            return arrayList;
        } catch (Exception e9) {
            throw new b(e9);
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z4 && str.endsWith(".secure"))) {
            return false;
        }
        int i4 = u82.f32873a;
        if (i4 < 21) {
            bv0 bv0Var = f23460a;
            byte[] a4 = yu0.a(bv0Var, "Q0lQQUFDRGVjb2Rlcg==", 0, "decode(...)");
            Charset charset = Charsets.UTF_8;
            if (new String(a4, charset).equals(str) || xu0.a(yu0.a(bv0Var, "Q0lQTVAzRGVjb2Rlcg==", 0, "decode(...)"), charset, str) || xu0.a(yu0.a(bv0Var, "Q0lQVm9yYmlzRGVjb2Rlcg==", 0, "decode(...)"), charset, str) || xu0.a(yu0.a(bv0Var, "Q0lQQU1STkJEZWNvZGVy", 0, "decode(...)"), charset, str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i4 < 18) {
            bv0 bv0Var2 = f23460a;
            byte[] a5 = yu0.a(bv0Var2, "T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0, "decode(...)");
            Charset charset2 = Charsets.UTF_8;
            if (new String(a5, charset2).equals(str)) {
                String str3 = new String(yu0.a(bv0Var2, "YTcw", 0, "decode(...)"), charset2);
                String str4 = u82.f32874b;
                if (str3.equals(str4) || (new String(yu0.a(bv0Var2, "WGlhb21p", 0, "decode(...)"), charset2).equals(u82.f32875c) && str4.startsWith(new String(yu0.a(bv0Var2, "SE0=", 0, "decode(...)"), charset2)))) {
                    return false;
                }
            }
        }
        if (i4 == 16) {
            bv0 bv0Var3 = f23460a;
            byte[] a6 = yu0.a(bv0Var3, "T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0, "decode(...)");
            Charset charset3 = Charsets.UTF_8;
            if (new String(a6, charset3).equals(str)) {
                String str5 = new String(yu0.a(bv0Var3, "ZGx4dQ==", 0, "decode(...)"), charset3);
                String str6 = u82.f32874b;
                if (str5.equals(str6) || xu0.a(yu0.a(bv0Var3, "cHJvdG91", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "dmlsbGU=", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "dmlsbGVwbHVz", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "dmlsbGVjMg==", 0, "decode(...)"), charset3, str6) || str6.startsWith(new String(yu0.a(bv0Var3, "Z2Vl", 0, "decode(...)"), charset3)) || xu0.a(yu0.a(bv0Var3, "QzY2MDI=", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "QzY2MDM=", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "QzY2MDY=", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "QzY2MTY=", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "TDM2aA==", 0, "decode(...)"), charset3, str6) || xu0.a(yu0.a(bv0Var3, "U08tMDJF", 0, "decode(...)"), charset3, str6)) {
                    return false;
                }
            }
        }
        if (i4 == 16) {
            bv0 bv0Var4 = f23460a;
            byte[] a7 = yu0.a(bv0Var4, "T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0, "decode(...)");
            Charset charset4 = Charsets.UTF_8;
            if (new String(a7, charset4).equals(str)) {
                String str7 = new String(yu0.a(bv0Var4, "QzE1MDQ=", 0, "decode(...)"), charset4);
                String str8 = u82.f32874b;
                if (str7.equals(str8) || xu0.a(yu0.a(bv0Var4, "QzE1MDU=", 0, "decode(...)"), charset4, str8) || xu0.a(yu0.a(bv0Var4, "QzE2MDQ=", 0, "decode(...)"), charset4, str8) || xu0.a(yu0.a(bv0Var4, "QzE2MDU=", 0, "decode(...)"), charset4, str8)) {
                    return false;
                }
            }
        }
        if (i4 < 24) {
            bv0 bv0Var5 = f23460a;
            byte[] a8 = yu0.a(bv0Var5, "T01YLlNFQy5hYWMuZGVj", 0, "decode(...)");
            Charset charset5 = Charsets.UTF_8;
            if ((new String(a8, charset5).equals(str) || xu0.a(yu0.a(bv0Var5, "T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0, "decode(...)"), charset5, str)) && new String(yu0.a(bv0Var5, "c2Ftc3VuZw==", 0, "decode(...)"), charset5).equals(u82.f32875c)) {
                String str9 = u82.f32874b;
                if (str9.startsWith(new String(yu0.a(bv0Var5, "emVyb2ZsdGU=", 0, "decode(...)"), charset5)) || str9.startsWith(new String(yu0.a(bv0Var5, "emVyb2x0ZQ==", 0, "decode(...)"), charset5)) || str9.startsWith(new String(yu0.a(bv0Var5, "emVubHRl", 0, "decode(...)"), charset5)) || xu0.a(yu0.a(bv0Var5, "U0MtMDVH", 0, "decode(...)"), charset5, str9) || xu0.a(yu0.a(bv0Var5, "bWFyaW5lbHRlYXR0", 0, "decode(...)"), charset5, str9) || xu0.a(yu0.a(bv0Var5, "NDA0U0M=", 0, "decode(...)"), charset5, str9) || xu0.a(yu0.a(bv0Var5, "U0MtMDRH", 0, "decode(...)"), charset5, str9) || xu0.a(yu0.a(bv0Var5, "U0NWMzE=", 0, "decode(...)"), charset5, str9)) {
                    return false;
                }
            }
        }
        if (i4 <= 19) {
            bv0 bv0Var6 = f23460a;
            byte[] a9 = yu0.a(bv0Var6, "T01YLlNFQy52cDguZGVj", 0, "decode(...)");
            Charset charset6 = Charsets.UTF_8;
            if (new String(a9, charset6).equals(str) && new String(yu0.a(bv0Var6, "c2Ftc3VuZw==", 0, "decode(...)"), charset6).equals(u82.f32875c)) {
                String str10 = u82.f32874b;
                if (str10.startsWith("d2") || str10.startsWith(new String(yu0.a(bv0Var6, "c2VycmFubw==", 0, "decode(...)"), charset6)) || str10.startsWith(new String(yu0.a(bv0Var6, "amZsdGU=", 0, "decode(...)"), charset6)) || str10.startsWith(new String(yu0.a(bv0Var6, "c2FudG9z", 0, "decode(...)"), charset6)) || str10.startsWith(new String(yu0.a(bv0Var6, "dDA=", 0, "decode(...)"), charset6))) {
                    return false;
                }
            }
        }
        if (i4 <= 19) {
            String str11 = u82.f32874b;
            bv0 bv0Var7 = f23460a;
            byte[] a10 = yu0.a(bv0Var7, "amZsdGU=", 0, "decode(...)");
            Charset charset7 = Charsets.UTF_8;
            if (str11.startsWith(new String(a10, charset7)) && xu0.a(yu0.a(bv0Var7, "T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0, "decode(...)"), charset7, str)) {
                return false;
            }
        }
        return (i4 <= 23 && "audio/eac3-joc".equals(str2) && new String(yu0.a(f23460a, "T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0, "decode(...)"), Charsets.UTF_8).equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(su0 su0Var) {
        return su0Var.f31947a.startsWith(f23460a.K()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(su0 su0Var) {
        String str = su0Var.f31947a;
        bv0 bv0Var = f23460a;
        if (str.startsWith(bv0Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (u82.f32873a >= 26 || !str.equals(bv0Var.G())) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(yb0 yb0Var, su0 su0Var) {
        try {
            return su0Var.a(yb0Var) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    private static void a(ArrayList arrayList, final f fVar) {
        Collections.sort(arrayList, new Comparator() { // from class: com.yandex.mobile.ads.impl.U
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a4;
                a4 = av0.a(av0.f.this, obj, obj2);
                return a4;
            }
        });
    }

    public static synchronized List<su0> a(String str, boolean z4, boolean z5) {
        c dVar;
        synchronized (av0.class) {
            try {
                a aVar = new a(str, z4, z5);
                HashMap<a, List<su0>> hashMap = f23462c;
                List<su0> list = hashMap.get(aVar);
                if (list != null) {
                    return list;
                }
                int i4 = u82.f32873a;
                if (i4 >= 21) {
                    dVar = new e(z4, z5);
                } else {
                    dVar = new d();
                }
                ArrayList<su0> a4 = a(aVar, dVar);
                if (z4 && a4.isEmpty() && 21 <= i4 && i4 <= 23) {
                    a4 = a(aVar, new d());
                    if (!a4.isEmpty()) {
                        ms0.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a4.get(0).f31947a);
                    }
                }
                a(str, a4);
                sj0 a5 = sj0.a((Collection) a4);
                hashMap.put(aVar, a5);
                return a5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList a(sj0 sj0Var, final yb0 yb0Var) {
        ArrayList arrayList = new ArrayList(sj0Var);
        a(arrayList, new f() { // from class: com.yandex.mobile.ads.impl.Q
            @Override // com.yandex.mobile.ads.impl.av0.f
            public final int a(Object obj) {
                int a4;
                a4 = av0.a(yb0.this, (su0) obj);
                return a4;
            }
        });
        return arrayList;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i4;
        if (f23470k == -1) {
            int i5 = 0;
            List<su0> a4 = a("video/avc", false, false);
            su0 su0Var = a4.isEmpty() ? null : a4.get(0);
            if (su0Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = su0Var.f31950d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = codecProfileLevelArr[i5].level;
                    if (i7 != 1 && i7 != 2) {
                        switch (i7) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                i4 = 202752;
                                break;
                            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                            case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                                i4 = 414720;
                                break;
                            case UserVerificationMethods.USER_VERIFY_NONE /* 512 */:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case com.ironsource.mediationsdk.metadata.a.f17688n /* 2048 */:
                            case Base64Utils.IO_BUFFER_SIZE /* 4096 */:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i4 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i4 = 35651584;
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i6 = Math.max(i4, i6);
                    i5++;
                }
                i5 = Math.max(i6, u82.f32873a >= 21 ? 345600 : 172800);
            }
            f23470k = i5;
        }
        return f23470k;
    }

    private static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (u82.f32873a < 26) {
                String str2 = u82.f32874b;
                bv0 bv0Var = f23460a;
                if (str2.equals(bv0Var.N()) && arrayList.size() == 1 && ((su0) arrayList.get(0)).f31947a.equals(bv0Var.G())) {
                    arrayList.add(su0.a(bv0Var.L(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new f() { // from class: com.yandex.mobile.ads.impl.S
                @Override // com.yandex.mobile.ads.impl.av0.f
                public final int a(Object obj) {
                    int a4;
                    a4 = av0.a((su0) obj);
                    return a4;
                }
            });
        }
        int i4 = u82.f32873a;
        if (i4 < 21 && arrayList.size() > 1) {
            String str3 = ((su0) arrayList.get(0)).f31947a;
            bv0 bv0Var2 = f23460a;
            if (bv0Var2.I().equals(str3) || bv0Var2.H().equals(str3) || bv0Var2.J().equals(str3)) {
                a(arrayList, new f() { // from class: com.yandex.mobile.ads.impl.T
                    @Override // com.yandex.mobile.ads.impl.av0.f
                    public final int a(Object obj) {
                        int b4;
                        b4 = av0.b((su0) obj);
                        return b4;
                    }
                });
            }
        }
        if (i4 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (f23460a.M().equals(((su0) arrayList.get(0)).f31947a)) {
            arrayList.add((su0) arrayList.remove(0));
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (u82.f32873a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (i01.d(str)) {
            return true;
        }
        String b4 = C2207rf.b(mediaCodecInfo.getName());
        if (b4.startsWith("arc.")) {
            return false;
        }
        bv0 bv0Var = f23460a;
        byte[] a4 = yu0.a(bv0Var, "b214Lmdvb2dsZS4=", 0, "decode(...)");
        Charset charset = Charsets.UTF_8;
        return b4.startsWith(new String(a4, charset)) || b4.startsWith(new String(yu0.a(bv0Var, "b214LmZmbXBlZy4=", 0, "decode(...)"), charset)) || (b4.startsWith(new String(yu0.a(bv0Var, "b214LnNlYy4=", 0, "decode(...)"), charset)) && b4.contains(".sw.")) || b4.equals(new String(yu0.a(bv0Var, "b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0, "decode(...)"), charset)) || b4.startsWith("c2.android.") || b4.startsWith("c2.google.") || !(b4.startsWith(new String(yu0.a(bv0Var, "b214Lg==", 0, "decode(...)"), charset)) || b4.startsWith("c2."));
    }
}
