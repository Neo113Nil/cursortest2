package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import cn.hutool.core.util.g1;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.ar.face.algo.FaceFrame;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.location.BDLocation;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapController;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moyoung.dafit.module.common.utils.u;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@Deprecated
/* loaded from: classes3.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;
    public static final String DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_PATH_PATTERN;
    public static final String MANUFACTURER;
    public static final String MODEL;
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoLegacyTagReplacements;

    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    @RequiresApi(21)
    private static final class Api21 {
        private Api21() {
        }

        @DoNotInline
        public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i8) {
            return resources.getDrawable(i8, context.getTheme());
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        SDK_INT = i8;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i8;
        EMPTY_BYTE_ARRAY = new byte[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", u.LANGUAGE_DE, "gre", "el", "fre", u.LANGUAGE_FR, MapBundleKey.MapObjKey.OBJ_GEO, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, FAUEnum.PR_TIMEOUT, 196, 195, 202, 205, GattError.GATT_DUP_REG, 151, 158, 153, 140, GattError.GATT_INVALID_CFG, 130, 133, 168, 175, 166, 161, com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, GpsTrainingDaoProxy.GPS_TYPE, 246, 227, 228, 237, 234, 183, DfuAdapter.ConnectState.REQUEST_MTU, 185, FaceFrame.FACE_LANDMARKS_COUNT, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, BDLocation.TypeServerDecryptError, GattError.GATT_CONGESTED, GattError.GATT_PENDING, 129, 134, GattError.GATT_CONNECTION_TIMEOUT, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, GattError.GATT_AUTH_FAIL, GattError.GATT_NOT_ENCRYPTED, 135, 128, 149, GattError.GATT_CANCEL, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, GattError.GATT_PRC_IN_PROGRESS, SerialTrans.MTU_MAX, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, BDLocation.TypeCoarseLocation, BDLocation.TypeServerError, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, 150, GattError.GATT_ALREADY_OPEN, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, GattError.GATT_ENCRYPED_NO_MITM, 132, 131, 222, 217, FAUEnum.PR_ANIMATE_FAILED, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, GattError.GATT_CCC_CFG_ERR, 244, 243};
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j8, long j9, long j10) {
        long j11 = j8 + j9;
        return ((j8 ^ j11) & (j9 ^ j11)) < 0 ? j10 : j11;
    }

    public static boolean areEqual(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int binarySearchCeil(int[] iArr, int i8, boolean z7, boolean z8) {
        int i9;
        int i10;
        int binarySearch = Arrays.binarySearch(iArr, i8);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            while (true) {
                i9 = binarySearch + 1;
                if (i9 >= iArr.length || iArr[i9] != i8) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z7 ? binarySearch : i9;
        }
        return z8 ? Math.min(iArr.length - 1, i10) : i10;
    }

    public static int binarySearchFloor(int[] iArr, int i8, boolean z7, boolean z8) {
        int i9;
        int i10;
        int binarySearch = Arrays.binarySearch(iArr, i8);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                i9 = binarySearch - 1;
                if (i9 < 0 || iArr[i9] != i8) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z7 ? binarySearch : i9;
        }
        return z8 ? Math.max(0, i10) : i10;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(@Nullable T t7) {
        return t7;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static int ceilDivide(int i8, int i9) {
        return ((i8 + i9) - 1) / i9;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i8 = 0; i8 < mediaItem.localConfiguration.subtitleConfigurations.size(); i8++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i8).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int compareLong(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 == j9 ? 0 : 1;
    }

    public static int constrainValue(int i8, int i9, int i10) {
        return Math.max(i9, Math.min(i8, i10));
    }

    public static boolean contains(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int crc32(byte[] bArr, int i8, int i9, int i10) {
        while (i8 < i9) {
            i10 = CRC32_BYTES_MSBF[((i10 >>> 24) ^ (bArr[i8] & 255)) & 255] ^ (i10 << 8);
            i8++;
        }
        return i10;
    }

    public static int crc8(byte[] bArr, int i8, int i9, int i10) {
        while (i8 < i9) {
            i10 = CRC8_BYTES_MSBF[i10 ^ (bArr[i8] & 255)];
            i8++;
        }
        return i10;
    }

    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i8 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i8 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i8], strArr[i8 + 1]);
            i8 += 2;
        }
    }

    public static File createTempDirectory(Context context, String str) {
        File createTempFile = createTempFile(context, str);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    public static File createTempFile(Context context, String str) {
        return File.createTempFile(str, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    public static long durationUsToSampleCount(long j8, int i8) {
        return ceilDivide(j8 * i8, 1000000L);
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (shouldEscapeCharacter(str.charAt(i10))) {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i9 * 2) + length);
        while (i9 > 0) {
            int i11 = i8 + 1;
            char charAt = str.charAt(i8);
            if (shouldEscapeCharacter(charAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(charAt));
                i9--;
            } else {
                sb.append(charAt);
            }
            i8 = i11;
        }
        if (i8 < length) {
            sb.append((CharSequence) str, i8, length);
        }
        return sb.toString();
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    @RequiresApi(21)
    public static int generateAudioSessionIdV21(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int i8) {
        if (i8 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (i8 == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (i8 != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    public static int getAudioContentTypeForStreamType(int i8) {
        if (i8 != 0) {
            return (i8 == 1 || i8 == 2 || i8 == 4 || i8 == 5 || i8 == 8) ? 4 : 2;
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getAudioTrackChannelConfig(int i8) {
        switch (i8) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (SDK_INT >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
    }

    public static int getAudioUsageForStreamType(int i8) {
        if (i8 == 0) {
            return 2;
        }
        if (i8 == 1) {
            return 13;
        }
        if (i8 == 2) {
            return 6;
        }
        int i9 = 4;
        if (i8 != 4) {
            i9 = 5;
            if (i8 != 5) {
                return i8 != 8 ? 1 : 3;
            }
        }
        return i9;
    }

    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean isPlayingAd = player.isPlayingAd();
        boolean isCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean hasNextMediaItem = player.hasNextMediaItem();
        boolean isCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean isEmpty = player.getCurrentTimeline().isEmpty();
        boolean z7 = false;
        Player.Commands.Builder addIf = new Player.Commands.Builder().addAll(commands).addIf(4, !isPlayingAd).addIf(5, isCurrentMediaItemSeekable && !isPlayingAd).addIf(6, hasPreviousMediaItem && !isPlayingAd).addIf(7, !isEmpty && (hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd).addIf(8, hasNextMediaItem && !isPlayingAd).addIf(9, !isEmpty && (hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd).addIf(10, !isPlayingAd).addIf(11, isCurrentMediaItemSeekable && !isPlayingAd);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z7 = true;
        }
        return addIf.addIf(12, z7).build();
    }

    public static int getBigEndianInt(ByteBuffer byteBuffer, int i8) {
        int i9 = byteBuffer.getInt(i8);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i9 : Integer.reverseBytes(i9);
    }

    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) ((Character.digit(str.charAt(i9), 16) << 4) + Character.digit(str.charAt(i9 + 1), 16));
        }
        return bArr;
    }

    public static int getCodecCountOfType(@Nullable String str, int i8) {
        int i9 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i8 == MimeTypes.getTrackTypeOfCodec(str2)) {
                i9++;
            }
        }
        return i9;
    }

    @Nullable
    public static String getCodecsOfType(@Nullable String str, int i8) {
        String[] splitCodecs = splitCodecs(str);
        if (splitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : splitCodecs) {
            if (i8 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(SystemInfoUtil.COMMA);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < objArr.length; i8++) {
            sb.append(objArr[i8].getClass().getSimpleName());
            if (i8 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager;
        Display display = (SDK_INT < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    public static Looper getCurrentOrMainLooper() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    public static Locale getDefaultDisplayLocale() {
        Locale.Category category;
        Locale locale;
        if (SDK_INT < 24) {
            return Locale.getDefault();
        }
        category = Locale.Category.DISPLAY;
        locale = Locale.getDefault(category);
        return locale;
    }

    private static void getDisplaySizeV16(Display display, Point point) {
        display.getSize(point);
    }

    @RequiresApi(17)
    private static void getDisplaySizeV17(Display display, Point point) {
        display.getRealSize(point);
    }

    @RequiresApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode;
        int physicalWidth;
        int physicalHeight;
        mode = display.getMode();
        physicalWidth = mode.getPhysicalWidth();
        point.x = physicalWidth;
        physicalHeight = mode.getPhysicalHeight();
        point.y = physicalHeight;
    }

    public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i8) {
        return SDK_INT >= 21 ? Api21.getDrawable(context, resources, i8) : resources.getDrawable(i8);
    }

    @Nullable
    public static UUID getDrmUuid(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "playready":
                return C.PLAYREADY_UUID;
            case "widevine":
                return C.WIDEVINE_UUID;
            case "clearkey":
                return C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i8) {
        if (i8 == 2 || i8 == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i8 == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i8 == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i8 == 8) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i8) {
            case 15:
                return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i8) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z7 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(str2));
            return z7 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String getFormatSupportString(int i8) {
        if (i8 == 0) {
            return "NO";
        }
        if (i8 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i8 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i8 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i8 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        Assertions.checkArgument(length <= 4);
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 = (i8 << 8) | str.charAt(i9);
        }
        return i8;
    }

    public static String getLocaleLanguageTag(Locale locale) {
        return SDK_INT >= 21 ? getLocaleLanguageTagV21(locale) : locale.toString();
    }

    @RequiresApi(21)
    private static String getLocaleLanguageTagV21(Locale locale) {
        return locale.toLanguageTag();
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context, String str, boolean z7) {
        return (SDK_INT < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) ? 1 : 5;
    }

    public static long getMediaDurationForPlayoutDuration(long j8, float f8) {
        return f8 == 1.0f ? j8 : Math.round(j8 * f8);
    }

    public static long getNowUnixTimeMs(long j8) {
        return j8 == C.TIME_UNSET ? System.currentTimeMillis() : j8 + android.os.SystemClock.elapsedRealtime();
    }

    public static int getPcmEncoding(int i8) {
        if (i8 == 8) {
            return 3;
        }
        if (i8 == 16) {
            return 2;
        }
        if (i8 == 24) {
            return 536870912;
        }
        if (i8 != 32) {
            return 0;
        }
        return C.ENCODING_PCM_32BIT;
    }

    public static Format getPcmFormat(int i8, int i9, int i10) {
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(i9).setSampleRate(i10).setPcmEncoding(i8).build();
    }

    public static int getPcmFrameSize(int i8, int i9) {
        if (i8 != 2) {
            if (i8 == 3) {
                return i9;
            }
            if (i8 != 4) {
                if (i8 != 268435456) {
                    if (i8 == 536870912) {
                        return i9 * 3;
                    }
                    if (i8 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i9 * 4;
        }
        return i9 * 2;
    }

    public static long getPlayoutDurationForMediaDuration(long j8, float f8) {
        return f8 == 1.0f ? j8 : Math.round(j8 / f8);
    }

    public static int getStreamTypeForAudioUsage(int i8) {
        if (i8 == 13) {
            return 1;
        }
        switch (i8) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j8) {
        if (j8 == C.TIME_UNSET) {
            j8 = 0;
        }
        String str = j8 < 0 ? "-" : "";
        long abs = (Math.abs(j8) + 500) / 1000;
        long j9 = abs % 60;
        long j10 = (abs / 60) % 60;
        long j11 = abs / 3600;
        sb.setLength(0);
        return j11 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(j9)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j9)).toString();
    }

    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i8 = 0; i8 < systemLocales.length; i8++) {
            systemLocales[i8] = normalizeLanguageCode(systemLocales[i8]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @RequiresApi(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return split(languageTags, SystemInfoUtil.COMMA);
    }

    @Nullable
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            Log.e(TAG, "Failed to read system property " + str, e8);
            return null;
        }
    }

    public static String getTrackTypeString(int i8) {
        switch (i8) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return MapController.DEFAULT_LAYER_TAG;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i8 < 10000) {
                    return "?";
                }
                return "custom (" + i8 + ")";
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + ExoPlayerLibraryInfo.VERSION_SLASHY;
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static boolean handlePauseButtonAction(@Nullable Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean handlePlayButtonAction(@Nullable Player player) {
        boolean z7 = false;
        if (player == null) {
            return false;
        }
        int playbackState = player.getPlaybackState();
        if (playbackState != 1 || !player.isCommandAvailable(2)) {
            if (playbackState == 4 && player.isCommandAvailable(4)) {
                player.seekToDefaultPosition();
            }
            if (player.isCommandAvailable(1)) {
                return z7;
            }
            player.play();
            return true;
        }
        player.prepare();
        z7 = true;
        if (player.isCommandAvailable(1)) {
        }
    }

    public static boolean handlePlayPauseButtonAction(@Nullable Player player) {
        return shouldShowPlayButton(player) ? handlePlayButtonAction(player) : handlePauseButtonAction(player);
    }

    @Deprecated
    public static int inferContentType(Uri uri, @Nullable String str) {
        return TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int i8 = 0;
        while (true) {
            try {
                i8 += inflater.inflate(parsableByteArray2.getData(), i8, parsableByteArray2.capacity() - i8);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i8 == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                    }
                } else {
                    parsableByteArray2.setLimit(i8);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static String intToStringMaxRadix(int i8) {
        return Integer.toString(i8, 36);
    }

    public static boolean isAutomotive(Context context) {
        return SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean isEncodingHighResolutionPcm(int i8) {
        return i8 == 536870912 || i8 == 805306368 || i8 == 4;
    }

    public static boolean isEncodingLinearPcm(int i8) {
        return i8 == 3 || i8 == 2 || i8 == 268435456 || i8 == 536870912 || i8 == 805306368 || i8 == 4;
    }

    public static boolean isLinebreak(int i8) {
        return i8 == 10 || i8 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || g1.URL_PROTOCOL_FILE.equals(scheme);
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    @RequiresApi(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        if ("http".equals(uri.getScheme())) {
            networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()));
            if (!isCleartextTrafficPermitted) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$newSingleThreadExecutor$3(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$newSingleThreadScheduledExecutor$4(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postOrRunWithCompletion$0(SettableFuture settableFuture, Runnable runnable, Object obj) {
        try {
            if (settableFuture.isCancelled()) {
                return;
            }
            runnable.run();
            settableFuture.set(obj);
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transformFutureAsync$1(SettableFuture settableFuture, ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$transformFutureAsync$2(ListenableFuture listenableFuture, SettableFuture settableFuture, AsyncFunction asyncFunction) {
        try {
            try {
                settableFuture.setFuture(asyncFunction.apply(Futures.getDone(listenableFuture)));
            } catch (Throwable th) {
                settableFuture.setException(th);
            }
        } catch (Error e8) {
            e = e8;
            settableFuture.setException(e);
        } catch (CancellationException unused) {
            settableFuture.cancel(false);
        } catch (RuntimeException e9) {
            e = e9;
            settableFuture.setException(e);
        } catch (ExecutionException e10) {
            e = e10;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            settableFuture.setException(e);
        }
    }

    public static int linearSearch(int[] iArr, int i8) {
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (iArr[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    @RequiresApi(18)
    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long j8 = Long.MIN_VALUE;
        for (int i8 = 0; i8 < sparseLongArray.size(); i8++) {
            j8 = Math.max(j8, sparseLongArray.valueAt(i8));
        }
        return j8;
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i8 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i8 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i8])) {
                return strArr[i8 + 1] + str.substring(strArr[i8].length());
            }
            i8 += 2;
        }
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (maybeRequestReadExternalStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(18)
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long j8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < sparseLongArray.size(); i8++) {
            j8 = Math.min(j8, sparseLongArray.valueAt(i8));
        }
        return j8;
    }

    public static <T> void moveItems(List<T> list, int i8, int i9, int i10) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i11 = (i9 - i8) - 1; i11 >= 0; i11--) {
            arrayDeque.addFirst(list.remove(i8 + i11));
        }
        list.addAll(Math.min(i10, list.size()), arrayDeque);
    }

    public static long msToUs(long j8) {
        return (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? j8 : j8 * 1000;
    }

    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$newSingleThreadExecutor$3;
                lambda$newSingleThreadExecutor$3 = Util.lambda$newSingleThreadExecutor$3(str, runnable);
                return lambda$newSingleThreadExecutor$3;
            }
        });
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.android.exoplayer2.util.s
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$newSingleThreadScheduledExecutor$4;
                lambda$newSingleThreadScheduledExecutor$4 = Util.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
                return lambda$newSingleThreadScheduledExecutor$4;
            }
        });
    }

    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = splitAtFirst(lowerCase, "-")[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(lowerCase) : lowerCase;
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t7) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t7;
        return (T[]) castNonNullTypeArray(copyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i8) {
        Assertions.checkArgument(i8 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i8);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i8, int i9) {
        Assertions.checkArgument(i8 >= 0);
        Assertions.checkArgument(i9 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i8, i9);
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        Assertions.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static long parseXsDateTime(String str) {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i8 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i8 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i8 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i8 != 0 ? timeInMillis - (i8 * 60000) : timeInMillis;
    }

    public static long parseXsDuration(String str) {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d8 = Double.parseDouble(group6);
        }
        long j8 = (long) ((parseDouble5 + d8) * 1000.0d);
        return isEmpty ? -j8 : j8;
    }

    public static boolean postOrRun(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> ListenableFuture<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t7) {
        final SettableFuture create = SettableFuture.create();
        postOrRun(handler, new Runnable() { // from class: com.google.android.exoplayer2.util.r
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$postOrRunWithCompletion$0(SettableFuture.this, runnable, t7);
            }
        });
        return create;
    }

    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void recursiveDelete(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    @Nullable
    public static Intent registerReceiverNotExported(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (SDK_INT < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 4);
        return registerReceiver;
    }

    public static <T> void removeRange(List<T> list, int i8, int i9) {
        if (i8 < 0 || i9 > list.size() || i8 > i9) {
            throw new IllegalArgumentException();
        }
        if (i8 != i9) {
            list.subList(i8, i9).clear();
        }
    }

    @RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
        int checkSelfPermission;
        checkSelfPermission = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        if (checkSelfPermission == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static long sampleCountToDurationUs(long j8, int i8) {
        return (j8 * 1000000) / i8;
    }

    public static long scaleLargeTimestamp(long j8, long j9, long j10) {
        if (j10 >= j9 && j10 % j9 == 0) {
            return j8 / (j10 / j9);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return j8 * (j9 / j10);
        }
        return (long) (j8 * (j9 / j10));
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j8, long j9) {
        int size = list.size();
        long[] jArr = new long[size];
        int i8 = 0;
        if (j9 >= j8 && j9 % j8 == 0) {
            long j10 = j9 / j8;
            while (i8 < size) {
                jArr[i8] = list.get(i8).longValue() / j10;
                i8++;
            }
        } else if (j9 >= j8 || j8 % j9 != 0) {
            double d8 = j8 / j9;
            while (i8 < size) {
                jArr[i8] = (long) (list.get(i8).longValue() * d8);
                i8++;
            }
        } else {
            long j11 = j8 / j9;
            while (i8 < size) {
                jArr[i8] = list.get(i8).longValue() * j11;
                i8++;
            }
        }
        return jArr;
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j8, long j9) {
        int i8 = 0;
        if (j9 >= j8 && j9 % j8 == 0) {
            long j10 = j9 / j8;
            while (i8 < jArr.length) {
                jArr[i8] = jArr[i8] / j10;
                i8++;
            }
            return;
        }
        if (j9 >= j8 || j8 % j9 != 0) {
            double d8 = j8 / j9;
            while (i8 < jArr.length) {
                jArr[i8] = (long) (jArr[i8] * d8);
                i8++;
            }
            return;
        }
        long j11 = j8 / j9;
        while (i8 < jArr.length) {
            jArr[i8] = jArr[i8] * j11;
            i8++;
        }
    }

    private static boolean shouldEscapeCharacter(char c8) {
        return c8 == '\"' || c8 == '%' || c8 == '*' || c8 == '/' || c8 == ':' || c8 == '<' || c8 == '\\' || c8 == '|' || c8 == '>' || c8 == '?';
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(@Nullable Player player) {
        return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4;
    }

    public static void sneakyThrow(Throwable th) {
        sneakyThrowInternal(th);
    }

    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] splitCodecs(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    @Nullable
    public static ComponentName startForegroundService(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (SDK_INT < 26) {
            return context.startService(intent);
        }
        startForegroundService = context.startForegroundService(intent);
        return startForegroundService;
    }

    public static long subtractWithOverflowDefault(long j8, long j9, long j10) {
        long j11 = j8 - j9;
        return ((j8 ^ j11) & (j9 ^ j8)) < 0 ? j10 : j11;
    }

    public static long sum(long... jArr) {
        long j8 = 0;
        for (long j9 : jArr) {
            j8 += j9;
        }
        return j8;
    }

    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static byte[] toByteArray(int i8) {
        return new byte[]{(byte) (i8 >> 24), (byte) (i8 >> 16), (byte) (i8 >> 8), (byte) i8};
    }

    public static float toFloat(byte[] bArr) {
        Assertions.checkArgument(bArr.length == 4);
        return Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i8 = 0; i8 < bArr.length; i8++) {
            sb.append(Character.forDigit((bArr[i8] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i8] & 15, 16));
        }
        return sb.toString();
    }

    public static int toInteger(byte[] bArr) {
        Assertions.checkArgument(bArr.length == 4);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8);
    }

    public static long toLong(int i8, int i9) {
        return toUnsignedLong(i9) | (toUnsignedLong(i8) << 32);
    }

    public static long toUnsignedLong(int i8) {
        return i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
    }

    public static <T, U> ListenableFuture<T> transformFutureAsync(final ListenableFuture<U> listenableFuture, final AsyncFunction<U, T> asyncFunction) {
        final SettableFuture create = SettableFuture.create();
        create.addListener(new Runnable() { // from class: com.google.android.exoplayer2.util.p
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$transformFutureAsync$1(SettableFuture.this, listenableFuture);
            }
        }, MoreExecutors.directExecutor());
        listenableFuture.addListener(new Runnable() { // from class: com.google.android.exoplayer2.util.q
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$transformFutureAsync$2(ListenableFuture.this, create, asyncFunction);
            }
        }, MoreExecutors.directExecutor());
        return create;
    }

    @Nullable
    public static String unescapeFileName(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == '%') {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        int i11 = length - (i9 * 2);
        StringBuilder sb = new StringBuilder(i11);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i9 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16);
            sb.append((CharSequence) str, i8, matcher.start());
            sb.append(parseInt);
            i8 = matcher.end();
            i9--;
        }
        if (i8 < length) {
            sb.append((CharSequence) str, i8, length);
        }
        if (sb.length() != i11) {
            return null;
        }
        return sb.toString();
    }

    public static long usToMs(long j8) {
        return (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000;
    }

    public static void writeBoolean(Parcel parcel, boolean z7) {
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static long ceilDivide(long j8, long j9) {
        return ((j8 + j9) - 1) / j9;
    }

    public static long constrainValue(long j8, long j9, long j10) {
        return Math.max(j9, Math.min(j8, j10));
    }

    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    public static String fromUtf8Bytes(byte[] bArr, int i8, int i9) {
        return new String(bArr, i8, i9, Charsets.UTF_8);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static float constrainValue(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f8, f10));
    }

    public static int linearSearch(long[] jArr, long j8) {
        for (int i8 = 0; i8 < jArr.length; i8++) {
            if (jArr[i8] == j8) {
                return i8;
            }
        }
        return -1;
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadExternalStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                ImmutableList<MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i8 = 0; i8 < immutableList.size(); i8++) {
                    if (maybeRequestReadExternalStoragePermission(activity, immutableList.get(i8).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int binarySearchCeil(long[] jArr, long j8, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j8);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            while (true) {
                i8 = binarySearch + 1;
                if (i8 >= jArr.length || jArr[i8] != j8) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z7 ? binarySearch : i8;
        }
        return z8 ? Math.min(jArr.length - 1, i9) : i9;
    }

    public static int binarySearchFloor(long[] jArr, long j8, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j8);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || jArr[i8] != j8) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z7 ? binarySearch : i8;
        }
        return z8 ? Math.max(0, i9) : i9;
    }

    public static int inferContentType(Uri uri) {
        int inferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (inferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return inferContentTypeForExtension;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher((CharSequence) Assertions.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains(ISM_DASH_FORMAT_EXTENSION)) {
                return 0;
            }
            if (group.contains(ISM_HLS_FORMAT_EXTENSION)) {
                return 2;
            }
        }
        return 1;
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] split = split(systemProperty.trim(), "x");
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i8 = SDK_INT;
        if (i8 >= 23) {
            getDisplaySizeV23(display, point);
        } else if (i8 >= 17) {
            getDisplaySizeV17(display, point);
        } else {
            getDisplaySizeV16(display, point);
        }
        return point;
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i8 = 0;
        for (int i9 : iArr) {
            byte[] byteArray = toByteArray(i9);
            bArr[i8] = byteArray[0];
            bArr[i8 + 1] = byteArray[1];
            int i10 = i8 + 3;
            bArr[i8 + 2] = byteArray[2];
            i8 += 4;
            bArr[i10] = byteArray[3];
        }
        return bArr;
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Collections.binarySearch(list, t7);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i8 = binarySearch + 1;
                if (i8 >= size || list.get(i8).compareTo(t7) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z7 ? binarySearch : i8;
        }
        return z8 ? Math.min(list.size() - 1, i9) : i9;
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Collections.binarySearch(list, t7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || list.get(i8).compareTo(t7) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z7 ? binarySearch : i8;
        }
        return z8 ? Math.max(0, i9) : i9;
    }

    private static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri uri) {
        return SDK_INT >= 23 && (isLocalFileUri(uri) || isMediaStoreExternalContentUri(uri)) && requestExternalStoragePermission(activity);
    }

    public static int binarySearchFloor(LongArray longArray, long j8, boolean z7, boolean z8) {
        int i8;
        int size = longArray.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            if (longArray.get(i10) < j8) {
                i9 = i10 + 1;
            } else {
                size = i10 - 1;
            }
        }
        if (z7 && (i8 = size + 1) < longArray.size() && longArray.get(i8) == j8) {
            return i8;
        }
        if (z8 && size == -1) {
            return 0;
        }
        return size;
    }

    public static byte[] toByteArray(float f8) {
        return toByteArray(Float.floatToIntBits(f8));
    }

    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) {
        throw th;
    }
}
