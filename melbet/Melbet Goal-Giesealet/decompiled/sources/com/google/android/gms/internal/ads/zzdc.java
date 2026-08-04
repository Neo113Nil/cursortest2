package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import androidx.sqlite.driver.bundled.BundledSQLite;
import com.facebook.soloader.Elf64;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdc {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(byte[] bArr) {
        zzef zzefVar = new zzef(bArr);
        if (!zzh(zzefVar, 31)) {
            return null;
        }
        zzefVar.zzk(4);
        int zzs = zzefVar.zzs();
        int zzs2 = zzefVar.zzs();
        if (!zzh(zzefVar, 0)) {
            return null;
        }
        zzefVar.zzQ();
        String zzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
        if (zzK.equals("mp4a")) {
            zzefVar.zzQ();
            zzefVar.zzk(2);
            zzee zzeeVar = new zzee();
            zzeeVar.zza(zzefVar);
            int zzj = zzeeVar.zzj(5);
            if (zzj == 31) {
                zzj = zzeeVar.zzj(6) + 32;
            }
            StringBuilder sb = new StringBuilder(zzK.length() + 4 + String.valueOf(zzj).length());
            sb.append(zzK);
            sb.append(".40.");
            sb.append(zzj);
            zzK = sb.toString();
        }
        Object[] objArr = {Integer.valueOf(zzs), Integer.valueOf(zzs2), zzK};
        String str = zzeo.zza;
        return String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
    }

    public static String zzb(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzeo.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzghc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        zzghc.zzd(b == 1, "Invalid APV CSD version: %s", b);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzeo.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03f7, code lost:
    
        if (r1.equals("ipcm") != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x044b, code lost:
    
        if (r8.equals("hvc1") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0454, code lost:
    
        if (r8.equals("hev1") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0465, code lost:
    
        if (r8.equals("avc2") != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0470, code lost:
    
        r0 = r23.zzk;
        r1 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0475, code lost:
    
        if (r1 >= 2) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0477, code lost:
    
        java.lang.String.valueOf(r0);
        com.google.android.gms.internal.ads.zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x048d, code lost:
    
        if (r3[1].length() != 6) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x048f, code lost:
    
        r1 = java.lang.Integer.parseInt(r3[1].substring(0, 2), 16);
        r0 = java.lang.Integer.parseInt(r3[1].substring(4), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04b4, code lost:
    
        if (r1 == 66) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04b8, code lost:
    
        if (r1 == 77) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04bc, code lost:
    
        if (r1 == 88) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04c0, code lost:
    
        if (r1 == 100) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04c4, code lost:
    
        if (r1 == 110) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04c8, code lost:
    
        if (r1 == 122) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04cc, code lost:
    
        if (r1 == 244) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04ce, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04d0, code lost:
    
        r5 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04d3, code lost:
    
        r5 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04d6, code lost:
    
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04d8, code lost:
    
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04da, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04dd, code lost:
    
        if (r5 != (-1)) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04df, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 21);
        r2.append("Unknown AVC profile: ");
        r2.append(r1);
        com.google.android.gms.internal.ads.zzds.zzc("CodecSpecificDataUtil", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04fd, code lost:
    
        switch(r0) {
            case 10: goto L307;
            case 11: goto L306;
            case 12: goto L305;
            case 13: goto L304;
            default: goto L287;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0500, code lost:
    
        switch(r0) {
            case 20: goto L303;
            case 21: goto L302;
            case 22: goto L301;
            default: goto L288;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0503, code lost:
    
        switch(r0) {
            case 30: goto L300;
            case 31: goto L299;
            case 32: goto L298;
            default: goto L289;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0506, code lost:
    
        switch(r0) {
            case 40: goto L297;
            case 41: goto L296;
            case 42: goto L295;
            default: goto L290;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0509, code lost:
    
        switch(r0) {
            case 50: goto L294;
            case 51: goto L293;
            case 52: goto L292;
            default: goto L291;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x050c, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x053a, code lost:
    
        if (r1 != (-1)) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x053c, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 19);
        r2.append("Unknown AVC level: ");
        r2.append(r0);
        com.google.android.gms.internal.ads.zzds.zzc("CodecSpecificDataUtil", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x050e, code lost:
    
        r1 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0511, code lost:
    
        r1 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0515, code lost:
    
        r1 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0518, code lost:
    
        r1 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x051b, code lost:
    
        r1 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x051e, code lost:
    
        r1 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0521, code lost:
    
        r1 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0524, code lost:
    
        r1 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0527, code lost:
    
        r1 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x052a, code lost:
    
        r1 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x052d, code lost:
    
        r1 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0530, code lost:
    
        r1 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0533, code lost:
    
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0535, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0537, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0539, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x04dc, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04a4, code lost:
    
        if (r1 < 3) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04a6, code lost:
    
        r1 = java.lang.Integer.parseInt(r3[1]);
        r0 = java.lang.Integer.parseInt(r3[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0569, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 37);
        r2.append("Ignoring malformed AVC codec string: ");
        r2.append(r0);
        com.google.android.gms.internal.ads.zzds.zzc("CodecSpecificDataUtil", r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0586, code lost:
    
        java.lang.String.valueOf(r0);
        com.google.android.gms.internal.ads.zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x046e, code lost:
    
        if (r8.equals("avc1") != false) goto L253;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zze(zzu zzuVar) {
        int i;
        int i2;
        int i3;
        Integer num;
        Integer num2;
        String str = zzuVar.zzk;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i4 = 8;
        int i5 = 3;
        int i6 = 2;
        if (!"video/dolby-vision".equals(zzuVar.zzo)) {
            int i7 = 0;
            String str2 = split[0];
            int i8 = 8192;
            switch (str2.hashCode()) {
                case 2986313:
                    if (str2.equals("ac-4")) {
                        String str3 = zzuVar.zzk;
                        if (split.length != 4) {
                            String.valueOf(str3);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str3)));
                            break;
                        } else {
                            try {
                                int parseInt = Integer.parseInt(split[1]);
                                int parseInt2 = Integer.parseInt(split[2]);
                                int parseInt3 = Integer.parseInt(split[3]);
                                if (parseInt != 0) {
                                    if (parseInt != 1) {
                                        if (parseInt == 2) {
                                            if (parseInt2 == 1) {
                                                i = 1026;
                                                i7 = 1;
                                            } else if (parseInt2 == 2) {
                                                i = 1028;
                                                i7 = 2;
                                            }
                                        }
                                        i7 = parseInt2;
                                        i = -1;
                                    } else if (parseInt2 == 0) {
                                        i = InputDeviceCompat.SOURCE_DPAD;
                                    } else {
                                        if (parseInt2 == 1) {
                                            i = 514;
                                            i7 = 1;
                                        }
                                        i7 = parseInt2;
                                        i = -1;
                                    }
                                    if (i != -1) {
                                        if (parseInt3 == 0) {
                                            i4 = 1;
                                        } else if (parseInt3 == 1) {
                                            i4 = 2;
                                        } else if (parseInt3 == 2) {
                                            i4 = 4;
                                        } else if (parseInt3 != 3) {
                                            i4 = parseInt3 != 4 ? -1 : 16;
                                        }
                                        if (i4 != -1) {
                                            break;
                                        } else {
                                            StringBuilder sb = new StringBuilder(String.valueOf(parseInt3).length() + 20);
                                            sb.append("Unknown AC-4 level: ");
                                            sb.append(parseInt3);
                                            zzds.zzc("CodecSpecificDataUtil", sb.toString());
                                            break;
                                        }
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(parseInt).length() + 23 + String.valueOf(i7).length());
                                        sb2.append("Unknown AC-4 profile: ");
                                        sb2.append(parseInt);
                                        sb2.append(".");
                                        sb2.append(i7);
                                        zzds.zzc("CodecSpecificDataUtil", sb2.toString());
                                        break;
                                    }
                                } else {
                                    if (parseInt2 == 0) {
                                        i = 257;
                                        if (i != -1) {
                                        }
                                    }
                                    i7 = parseInt2;
                                    i = -1;
                                    if (i != -1) {
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                String.valueOf(str3);
                                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str3)));
                                return null;
                            }
                        }
                    }
                    break;
                case 3001066:
                    if (str2.equals("apv1")) {
                        String str4 = zzuVar.zzk;
                        if (split.length < 4) {
                            String.valueOf(str4);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str4)));
                            break;
                        } else {
                            try {
                                int parseInt4 = Integer.parseInt(split[1].substring(4));
                                int parseInt5 = Integer.parseInt(split[2].substring(4));
                                int parseInt6 = Integer.parseInt(split[3].substring(4));
                                if (parseInt4 != 33) {
                                    if (parseInt4 != 44) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(parseInt4).length() + 30);
                                        sb3.append("Ignoring invalid APV profile: ");
                                        sb3.append(parseInt4);
                                        zzds.zzc("CodecSpecificDataUtil", sb3.toString());
                                        break;
                                    }
                                } else {
                                    i8 = 1;
                                }
                                int i9 = parseInt5 / 30;
                                int i10 = i9 + i9;
                                if (parseInt5 % 30 == 0) {
                                    i10--;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                String.valueOf(str4);
                                zzds.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str4)), e);
                                return null;
                            }
                        }
                    }
                    break;
                case 3004662:
                    if (str2.equals("av01")) {
                        String str5 = zzuVar.zzk;
                        zzh zzhVar = zzuVar.zzE;
                        if (split.length < 4) {
                            String.valueOf(str5);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str5)));
                            break;
                        } else {
                            try {
                                int parseInt7 = Integer.parseInt(split[1]);
                                int parseInt8 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt9 = Integer.parseInt(split[3]);
                                if (parseInt7 == 0) {
                                    if (parseInt9 == 8) {
                                        i2 = 1;
                                    } else if (parseInt9 != 10) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(parseInt9).length() + 23);
                                        sb4.append("Unknown AV1 bit depth: ");
                                        sb4.append(parseInt9);
                                        zzds.zzc("CodecSpecificDataUtil", sb4.toString());
                                        break;
                                    } else {
                                        i2 = (zzhVar == null || !(zzhVar.zze != null || (i3 = zzhVar.zzd) == 7 || i3 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt8) {
                                        case 0:
                                            i6 = 1;
                                            break;
                                        case 1:
                                            break;
                                        case 2:
                                            i6 = 4;
                                            break;
                                        case 3:
                                            i6 = 8;
                                            break;
                                        case 4:
                                            i6 = 16;
                                            break;
                                        case 5:
                                            i6 = 32;
                                            break;
                                        case 6:
                                            i6 = 64;
                                            break;
                                        case 7:
                                            i6 = 128;
                                            break;
                                        case 8:
                                            i6 = 256;
                                            break;
                                        case 9:
                                            i6 = 512;
                                            break;
                                        case 10:
                                            i6 = 1024;
                                            break;
                                        case 11:
                                            i6 = 2048;
                                            break;
                                        case 12:
                                            i6 = 4096;
                                            break;
                                        case 13:
                                            i6 = 8192;
                                            break;
                                        case 14:
                                            i6 = 16384;
                                            break;
                                        case 15:
                                            i6 = 32768;
                                            break;
                                        case 16:
                                            i6 = 65536;
                                            break;
                                        case 17:
                                            i6 = 131072;
                                            break;
                                        case 18:
                                            i6 = 262144;
                                            break;
                                        case 19:
                                            i6 = 524288;
                                            break;
                                        case 20:
                                            i6 = 1048576;
                                            break;
                                        case 21:
                                            i6 = 2097152;
                                            break;
                                        case 22:
                                            i6 = 4194304;
                                            break;
                                        case 23:
                                            i6 = 8388608;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    if (i6 != -1) {
                                        break;
                                    } else {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(parseInt8).length() + 19);
                                        sb5.append("Unknown AV1 level: ");
                                        sb5.append(parseInt8);
                                        zzds.zzc("CodecSpecificDataUtil", sb5.toString());
                                        break;
                                    }
                                } else {
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(parseInt7).length() + 21);
                                    sb6.append("Unknown AV1 profile: ");
                                    sb6.append(parseInt7);
                                    zzds.zzc("CodecSpecificDataUtil", sb6.toString());
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                String.valueOf(str5);
                                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str5)));
                                return null;
                            }
                        }
                    }
                    break;
                case 3006243:
                    break;
                case 3006244:
                    break;
                case 3199032:
                    break;
                case 3214780:
                    break;
                case 3224753:
                    if (str2.equals("iamf")) {
                        if (split.length < 4) {
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                            break;
                        } else {
                            try {
                                int parseInt10 = 1 << (Integer.parseInt(split[1]) + 16);
                                String str6 = split[3];
                                switch (str6.hashCode()) {
                                    case 2464863:
                                        if (str6.equals("Opus")) {
                                            i4 = 1;
                                            break;
                                        }
                                        String.valueOf(str6);
                                        zzds.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str6)));
                                        break;
                                    case 3114792:
                                        if (str6.equals("fLaC")) {
                                            i4 = 4;
                                            break;
                                        }
                                        String.valueOf(str6);
                                        zzds.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str6)));
                                        break;
                                    case 3238865:
                                        break;
                                    case 3356560:
                                        if (str6.equals("mp4a")) {
                                            i4 = 2;
                                            break;
                                        }
                                        String.valueOf(str6);
                                        zzds.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str6)));
                                        break;
                                    default:
                                        String.valueOf(str6);
                                        zzds.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str6)));
                                        break;
                                }
                            } catch (NumberFormatException e2) {
                                String str7 = split[1];
                                String.valueOf(str7);
                                zzds.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(str7)), e2);
                                return null;
                            }
                        }
                    }
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        String str8 = zzuVar.zzk;
                        if (split.length != 3) {
                            String.valueOf(str8);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                            break;
                        } else {
                            try {
                                if ("audio/mp4a-latm".equals(zzar.zzf(Integer.parseInt(split[1], 16)))) {
                                    int parseInt11 = Integer.parseInt(split[2]);
                                    if (parseInt11 == 17) {
                                        i5 = 17;
                                    } else if (parseInt11 == 20) {
                                        i5 = 20;
                                    } else if (parseInt11 == 23) {
                                        i5 = 23;
                                    } else if (parseInt11 == 29) {
                                        i5 = 29;
                                    } else if (parseInt11 == 39) {
                                        i5 = 39;
                                    } else if (parseInt11 != 42) {
                                        switch (parseInt11) {
                                            case 1:
                                                i5 = 1;
                                                break;
                                            case 2:
                                                i5 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i5 = 4;
                                                break;
                                            case 5:
                                                i5 = 5;
                                                break;
                                            case 6:
                                                i5 = 6;
                                                break;
                                            default:
                                                i5 = -1;
                                                break;
                                        }
                                    } else {
                                        i5 = 42;
                                    }
                                    if (i5 != -1) {
                                        break;
                                    }
                                }
                            } catch (NumberFormatException unused3) {
                                String.valueOf(str8);
                                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                                return null;
                            }
                        }
                    }
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        String str9 = zzuVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (split.length < 3) {
                            String.valueOf(str9);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str9)));
                            break;
                        } else {
                            try {
                                break;
                            } catch (NumberFormatException unused4) {
                                String.valueOf(str9);
                                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str9)));
                                return pair;
                            }
                        }
                    }
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        String str10 = zzuVar.zzk;
                        if (split.length < 3) {
                            String.valueOf(str10);
                            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str10)));
                            break;
                        } else {
                            try {
                                int parseInt12 = Integer.parseInt(split[1]);
                                int parseInt13 = Integer.parseInt(split[2]);
                                int i11 = parseInt12 != 0 ? parseInt12 != 1 ? parseInt12 != 2 ? parseInt12 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i11 != -1) {
                                    if (parseInt13 == 10) {
                                        i6 = 1;
                                    } else if (parseInt13 != 11) {
                                        if (parseInt13 == 20) {
                                            i6 = 4;
                                        } else if (parseInt13 == 21) {
                                            i6 = 8;
                                        } else if (parseInt13 == 30) {
                                            i6 = 16;
                                        } else if (parseInt13 == 31) {
                                            i6 = 32;
                                        } else if (parseInt13 == 40) {
                                            i6 = 64;
                                        } else if (parseInt13 == 41) {
                                            i6 = 128;
                                        } else if (parseInt13 == 50) {
                                            i6 = 256;
                                        } else if (parseInt13 != 51) {
                                            switch (parseInt13) {
                                                case 60:
                                                    i6 = 2048;
                                                    break;
                                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                    i6 = 4096;
                                                    break;
                                                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                                    i6 = 8192;
                                                    break;
                                                default:
                                                    i6 = -1;
                                                    break;
                                            }
                                        } else {
                                            i6 = 512;
                                        }
                                    }
                                    if (i6 != -1) {
                                        break;
                                    } else {
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(parseInt13).length() + 19);
                                        sb7.append("Unknown VP9 level: ");
                                        sb7.append(parseInt13);
                                        zzds.zzc("CodecSpecificDataUtil", sb7.toString());
                                        break;
                                    }
                                } else {
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(parseInt12).length() + 21);
                                    sb8.append("Unknown VP9 profile: ");
                                    sb8.append(parseInt12);
                                    zzds.zzc("CodecSpecificDataUtil", sb8.toString());
                                    break;
                                }
                            } catch (NumberFormatException unused5) {
                                String.valueOf(str10);
                                zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str10)));
                                return null;
                            }
                        }
                    }
                    break;
            }
            return null;
        }
        if (split.length < 3) {
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        Matcher matcher = zzd.matcher(split[1]);
        if (!matcher.matches()) {
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num = 1;
                            break;
                        }
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num = 2;
                            break;
                        }
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num = 4;
                            break;
                        }
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num = 8;
                            break;
                        }
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num = 16;
                            break;
                        }
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num = 32;
                            break;
                        }
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num = 64;
                            break;
                        }
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num = 128;
                            break;
                        }
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num = 256;
                            break;
                        }
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num = 512;
                            break;
                        }
                        break;
                }
                if (num == null) {
                    String.valueOf(group);
                    zzds.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                    return null;
                }
                String str11 = split[2];
                if (str11 != null) {
                    int hashCode2 = str11.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str11.equals("01")) {
                                num2 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str11.equals("02")) {
                                num2 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str11.equals("03")) {
                                num2 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str11.equals("04")) {
                                num2 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str11.equals("05")) {
                                num2 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str11.equals("06")) {
                                num2 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str11.equals("07")) {
                                num2 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str11.equals("08")) {
                                num2 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str11.equals("09")) {
                                num2 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str11.equals("10")) {
                                        num2 = 512;
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (str11.equals("11")) {
                                        num2 = 1024;
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str11.equals("12")) {
                                        num2 = 2048;
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str11.equals("13")) {
                                        num2 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num2 == null) {
                        return new Pair(num, num2);
                    }
                    String.valueOf(str11);
                    zzds.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str11)));
                    return null;
                }
                num2 = null;
                if (num2 == null) {
                }
            } else if (group.equals("10")) {
                num = 1024;
                if (num == null) {
                }
            }
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzf(String str, String[] strArr, zzh zzhVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            String.valueOf(str);
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            String.valueOf(str);
            zzds.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i = 1;
        } else {
            i = 6;
            if ("2".equals(group)) {
                i = (zzhVar == null || zzhVar.zzd != 6) ? 2 : 4096;
            } else if (!"6".equals(group)) {
                String.valueOf(group);
                zzds.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        num = 2;
                        break;
                    }
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        num = 8;
                        break;
                    }
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        num = 32;
                        break;
                    }
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        num = 128;
                        break;
                    }
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        num = 512;
                        break;
                    }
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        num = 1;
                        break;
                    }
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        num = 4;
                        break;
                    }
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        num = 16;
                        break;
                    }
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        num = 64;
                        break;
                    }
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        num = 256;
                        break;
                    }
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        num = 2048;
                        break;
                    }
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        num = 8192;
                        break;
                    }
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        num = 32768;
                        break;
                    }
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        num = 131072;
                        break;
                    }
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        num = 524288;
                        break;
                    }
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        num = 2097152;
                        break;
                    }
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        num = 8388608;
                        break;
                    }
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        num = Integer.valueOf(BundledSQLite.SQLITE_OPEN_EXRESCODE);
                        break;
                    }
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        num = 1024;
                        break;
                    }
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        num = 4096;
                        break;
                    }
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        num = 16384;
                        break;
                    }
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        num = 65536;
                        break;
                    }
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        num = 262144;
                        break;
                    }
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        num = 1048576;
                        break;
                    }
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        num = 4194304;
                        break;
                    }
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        num = 16777216;
                        break;
                    }
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            String.valueOf(str2);
            zzds.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static byte[] zzg(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static boolean zzh(zzef zzefVar, int i) {
        if ((zzefVar.zzs() >> 3) != i) {
            return false;
        }
        zzefVar.zzQ();
        return true;
    }
}
