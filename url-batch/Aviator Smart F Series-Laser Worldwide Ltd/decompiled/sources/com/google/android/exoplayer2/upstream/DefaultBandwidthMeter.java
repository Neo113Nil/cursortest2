package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.baidu.ar.auth.FeatureCodes;
import com.baidu.ar.base.MsgField;
import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.ar.face.algo.FaceFrame;
import com.baidu.location.BDLocation;
import com.crrepa.ble.sifli.dfu.constants.General;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    private static final int COUNTRY_GROUP_INDEX_2G = 1;
    private static final int COUNTRY_GROUP_INDEX_3G = 2;
    private static final int COUNTRY_GROUP_INDEX_4G = 3;
    private static final int COUNTRY_GROUP_INDEX_5G_NSA = 4;
    private static final int COUNTRY_GROUP_INDEX_5G_SA = 5;
    private static final int COUNTRY_GROUP_INDEX_WIFI = 0;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;

    @Nullable
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c8 = 0;
                    break;
                }
                break;
            case General.SIFLI_DFU_PACKET_BODY_LEN_NAND /* 2084 */:
                if (str.equals("AE")) {
                    c8 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c8 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c8 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c8 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c8 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c8 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c8 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c8 = '\b';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c8 = '\t';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c8 = '\n';
                    break;
                }
                break;
            case FeatureCodes.TRACK_2D /* 2100 */:
                if (str.equals("AU")) {
                    c8 = 11;
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c8 = '\f';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c8 = '\r';
                    break;
                }
                break;
            case MsgField.MSG_ID_TRACK_MSG_ID_TRACK_LOST /* 2105 */:
                if (str.equals("AZ")) {
                    c8 = 14;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c8 = 15;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c8 = 16;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c8 = 17;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c8 = 18;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c8 = 19;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c8 = 20;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c8 = 21;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c8 = 22;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c8 = 23;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c8 = 24;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c8 = 25;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c8 = 26;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c8 = 27;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c8 = 28;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c8 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c8 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c8 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c8 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c8 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c8 = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_CA)) {
                    c8 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c8 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c8 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c8 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c8 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c8 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c8 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c8 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c8 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_CN)) {
                    c8 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c8 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c8 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c8 = cn.hutool.core.io.file.c.UNIX_SEPARATOR;
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c8 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c8 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c8 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c8 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c8 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c8 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c8 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c8 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c8 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c8 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c8 = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c8 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c8 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c8 = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c8 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c8 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c8 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c8 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c8 = 'B';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c8 = 'C';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c8 = 'D';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c8 = 'E';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c8 = 'F';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c8 = 'G';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c8 = 'H';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c8 = 'I';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c8 = 'J';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c8 = 'K';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c8 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c8 = 'M';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c8 = 'N';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c8 = 'O';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c8 = 'P';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c8 = 'Q';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c8 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c8 = 'S';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c8 = 'T';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c8 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c8 = 'V';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c8 = 'W';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c8 = 'X';
                    break;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    c8 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c8 = org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c8 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c8 = cn.hutool.core.io.file.c.WINDOWS_SEPARATOR;
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c8 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c8 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c8 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c8 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_IN)) {
                    c8 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c8 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c8 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c8 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c8 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c8 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c8 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c8 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c8 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_JP)) {
                    c8 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c8 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals(ExpandedProductParsedResult.KILOGRAM)) {
                    c8 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c8 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c8 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c8 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c8 = 'p';
                    break;
                }
                break;
            case 2407:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_KR)) {
                    c8 = 'q';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c8 = 'r';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c8 = 's';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c8 = 't';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c8 = 'u';
                    break;
                }
                break;
            case 2422:
                if (str.equals(ExpandedProductParsedResult.POUND)) {
                    c8 = 'v';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c8 = 'w';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c8 = 'x';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c8 = 'y';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c8 = 'z';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c8 = '{';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c8 = '|';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c8 = '}';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c8 = '~';
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c8 = Ascii.MAX;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c8 = 128;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c8 = 129;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c8 = 130;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c8 = 131;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c8 = 132;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c8 = 133;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c8 = 134;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c8 = 135;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c8 = 136;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c8 = 137;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c8 = 138;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c8 = 139;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c8 = 140;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c8 = 141;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c8 = 142;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c8 = 143;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c8 = 144;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c8 = 145;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c8 = 146;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c8 = 147;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c8 = 148;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c8 = 149;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c8 = 150;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c8 = 151;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c8 = 152;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c8 = 153;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c8 = 154;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c8 = 155;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c8 = 156;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c8 = 157;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c8 = 158;
                    break;
                }
                break;
            case DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS /* 2500 */:
                if (str.equals("NR")) {
                    c8 = 159;
                    break;
                }
                break;
            case MsgField.MSG_ON_DEVICE_IR_RESULT /* 2503 */:
                if (str.equals("NU")) {
                    c8 = 160;
                    break;
                }
                break;
            case MsgField.MSG_VOLUME_CLOSE /* 2508 */:
                if (str.equals("NZ")) {
                    c8 = 161;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c8 = 162;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c8 = 163;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c8 = 164;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c8 = 165;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c8 = 166;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c8 = 167;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c8 = 168;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c8 = 169;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c8 = 170;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c8 = 171;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c8 = 172;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c8 = 173;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c8 = 174;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c8 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c8 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c8 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c8 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c8 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c8 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c8 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c8 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c8 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c8 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c8 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c8 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c8 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c8 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c8 = 189;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c8 = 190;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c8 = 191;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c8 = 192;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c8 = 193;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c8 = 194;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c8 = 195;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c8 = 196;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c8 = 197;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c8 = 198;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c8 = 199;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c8 = 200;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c8 = 201;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c8 = 202;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c8 = 203;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c8 = 204;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c8 = 205;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c8 = 206;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c8 = 207;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c8 = 208;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c8 = 209;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c8 = 210;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c8 = 211;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c8 = 212;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c8 = 213;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c8 = 214;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c8 = 215;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c8 = 216;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c8 = 217;
                    break;
                }
                break;
            case FeatureCodes.DIGITAL /* 2700 */:
                if (str.equals("UA")) {
                    c8 = 218;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c8 = 219;
                    break;
                }
                break;
            case 2718:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_US)) {
                    c8 = 220;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c8 = 221;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c8 = 222;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c8 = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c8 = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c8 = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c8 = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c8 = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c8 = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c8 = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c8 = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c8 = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c8 = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c8 = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c8 = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals(com.moyoung.dafit.module.common.utils.u.COUNTRY_ZA)) {
                    c8 = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c8 = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c8 = 237;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case 25:
            case 28:
            case '8':
            case 'D':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case '\b':
            case '>':
            case TsExtractor.TS_PACKET_SIZE /* 188 */:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 3, 3, 2, 2};
            case '\n':
                return new int[]{1, 2, 1, 4, 1, 4};
            case 11:
                return new int[]{0, 2, 1, 1, 3, 0};
            case '\f':
            case 'U':
                return new int[]{1, 2, 4, 4, 2, 2};
            case '\r':
            case '2':
            case 'x':
            case 140:
            case GattError.GATT_CONGESTED /* 143 */:
            case 170:
            case 193:
            case 223:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case ':':
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case '^':
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 't':
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case '?':
            case 'S':
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case '[':
            case 133:
            case 153:
            case 204:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case 132:
            case 175:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 'v':
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case 150:
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{1, 1, 2, 3, 2, 2};
            case '\"':
            case ')':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 3, 3, 3, 3};
            case '$':
            case 'o':
                return new int[]{4, 3, 3, 2, 2, 2};
            case '%':
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case '&':
            case 'L':
                return new int[]{3, 3, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 0, 0, 3};
            case '(':
            case '=':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '*':
                return new int[]{1, 1, 2, 1, 3, 2};
            case '+':
                return new int[]{4, 3, 3, 4, 2, 2};
            case ',':
                return new int[]{2, 0, 4, 3, 3, 1};
            case '-':
                return new int[]{2, 3, 4, 2, 2, 2};
            case '.':
                return new int[]{2, 4, 4, 4, 2, 2};
            case '/':
            case 'n':
                return new int[]{4, 2, 4, 3, 2, 2};
            case '0':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '3':
            case 'Z':
            case '~':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 3, 2, 2, 2};
            case '6':
            case 201:
            case 207:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '7':
            case '<':
            case '\\':
            case '|':
            case GattError.GATT_DUP_REG /* 144 */:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
            case 194:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 'A':
                return new int[]{0, 0, 0, 2, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 3, 2, 2};
            case 'C':
                return new int[]{4, 2, 3, 0, 2, 2};
            case 'E':
                return new int[]{1, 1, 2, 1, 1, 2};
            case 'F':
            case 205:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 'G':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'H':
            case 'p':
            case 's':
            case 'w':
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 0, 0, 2, 2, 2};
            case 'J':
            case 168:
            case PsExtractor.AUDIO_STREAM /* 192 */:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'K':
                return new int[]{0, 2, 1, 0, 2, 2};
            case 'M':
            case 'g':
                return new int[]{1, 2, 0, 1, 2, 2};
            case 'N':
            case FAUEnum.PR_ANIMATE_FAILED /* 208 */:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 'O':
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'P':
                return new int[]{4, 4, 4, 2, 2, 2};
            case 'Q':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'R':
                return new int[]{4, 4, 3, 3, 2, 2};
            case 'T':
                return new int[]{2, 2, 2, 1, 1, 2};
            case 'V':
                return new int[]{4, 4, 2, 2, 2, 2};
            case 'W':
                return new int[]{3, 0, 1, 1, 2, 2};
            case 'X':
                return new int[]{0, 1, 1, 3, 2, 0};
            case 'Y':
                return new int[]{3, 3, 2, 2, 2, 2};
            case ']':
                return new int[]{3, 1, 1, 2, 3, 2};
            case '_':
                return new int[]{1, 2, 2, 3, 4, 2};
            case '`':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 2, 1, 2, 1};
            case 'b':
            case 215:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'c':
            case FaceFrame.FACE_LANDMARKS_COUNT /* 190 */:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'd':
                return new int[]{4, 2, 3, 3, 4, 2};
            case 'e':
                return new int[]{0, 0, 1, 0, 0, 2};
            case 'f':
                return new int[]{0, 0, 1, 1, 1, 2};
            case 'h':
                return new int[]{2, 4, 2, 1, 2, 2};
            case 'i':
                return new int[]{2, 0, 1, 1, 2, 2};
            case 'j':
                return new int[]{0, 3, 3, 3, 4, 4};
            case 'k':
                return new int[]{3, 2, 2, 1, 2, 2};
            case 'l':
            case GattError.GATT_ENCRYPED_NO_MITM /* 141 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'm':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'q':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'r':
                return new int[]{1, 0, 1, 0, 0, 2};
            case 'u':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'y':
                return new int[]{3, 2, 3, 4, 4, 2};
            case 'z':
                return new int[]{3, 4, 3, 4, 2, 2};
            case '{':
            case 219:
                return new int[]{3, 3, 3, 2, 2, 2};
            case '}':
                return new int[]{1, 1, 4, 2, 0, 2};
            case 127:
            case 212:
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case 129:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 130:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 131:
                return new int[]{2, 0, 0, 1, 1, 2};
            case 134:
                return new int[]{4, 2, 1, 3, 2, 2};
            case 135:
                return new int[]{2, 0, 0, 1, 3, 2};
            case GattError.GATT_PENDING /* 136 */:
            case 217:
                return new int[]{3, 4, 2, 2, 2, 2};
            case GattError.GATT_AUTH_FAIL /* 137 */:
                return new int[]{2, 2, 2, 3, 4, 2};
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                return new int[]{2, 0, 1, 2, 2, 2};
            case GattError.GATT_INVALID_CFG /* 139 */:
                return new int[]{0, 2, 4, 4, 4, 2};
            case GattError.GATT_NOT_ENCRYPTED /* 142 */:
                return new int[]{4, 2, 3, 4, 2, 2};
            case GattError.GATT_ALREADY_OPEN /* 145 */:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case GattError.GATT_CANCEL /* 146 */:
                return new int[]{3, 4, 1, 3, 3, 2};
            case GattError.GATT_CONNECTION_TIMEOUT /* 147 */:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case 151:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 152:
                return new int[]{3, 2, 3, 4, 2, 2};
            case 154:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 155:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 156:
                return new int[]{0, 2, 3, 3, 0, 4};
            case 157:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case BDLocation.TypeCoarseLocation /* 160 */:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case BDLocation.TypeServerDecryptError /* 162 */:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 164:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case 199:
                return new int[]{2, 3, 3, 1, 2, 2};
            case BDLocation.TypeServerError /* 167 */:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case 171:
                return new int[]{2, 0, 2, 0, 2, 1};
            case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 173:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 174:
                return new int[]{2, 2, 4, 2, 2, 2};
            case DfuAdapter.ConnectState.REQUEST_MTU /* 176 */:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 179:
                return new int[]{2, 0, 0, 0, 2, 2};
            case com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME /* 180 */:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 186:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case 191:
                return new int[]{1, 1, 1, 1, 3, 2};
            case 195:
                return new int[]{3, 2, 2, 4, 4, 2};
            case 196:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 197:
            case 210:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 198:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 202:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 203:
                return new int[]{2, 2, 1, 3, 2, 2};
            case 206:
                return new int[]{0, 1, 2, 1, 2, 2};
            case FAUEnum.PR_TIMEOUT /* 209 */:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
            case 221:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 214:
                return new int[]{1, 4, 0, 0, 2, 2};
            case 216:
                return new int[]{0, 2, 0, 0, 0, 0};
            case 218:
                return new int[]{0, 1, 1, 2, 4, 2};
            case 220:
                return new int[]{1, 1, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 2, 3, 4, 3, 2};
            case 226:
                return new int[]{2, 2, 0, 1, 2, 2};
            case 227:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 228:
                return new int[]{0, 0, 1, 2, 2, 1};
            case 229:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 232:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 234:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 235:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 236:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i8) {
        Long l8 = this.initialBitrateEstimates.get(Integer.valueOf(i8));
        if (l8 == null) {
            l8 = this.initialBitrateEstimates.get(0);
        }
        if (l8 == null) {
            l8 = 1000000L;
        }
        return l8.longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        DefaultBandwidthMeter defaultBandwidthMeter;
        synchronized (DefaultBandwidthMeter.class) {
            try {
                if (singletonInstance == null) {
                    singletonInstance = new Builder(context).build();
                }
                defaultBandwidthMeter = singletonInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return defaultBandwidthMeter;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z7) {
        return z7 && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i8, long j8, long j9) {
        if (i8 == 0 && j8 == 0 && j9 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j9;
        this.eventDispatcher.bandwidthSample(i8, j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i8) {
        int i9 = this.networkType;
        if (i9 == 0 || this.resetOnNetworkTypeChange) {
            if (this.networkTypeOverrideSet) {
                i8 = this.networkTypeOverride;
            }
            if (i9 == i8) {
                return;
            }
            this.networkType = i8;
            if (i8 != 1 && i8 != 0 && i8 != 8) {
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i8);
                long elapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = elapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return a.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z7, int i8) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z7)) {
            this.sampleBytesTransferred += i8;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z7) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z7)) {
                Assertions.checkState(this.streamCount > 0);
                long elapsedRealtime = this.clock.elapsedRealtime();
                int i8 = (int) (elapsedRealtime - this.sampleStartTimeMs);
                this.totalElapsedTimeMs += i8;
                long j8 = this.totalBytesTransferred;
                long j9 = this.sampleBytesTransferred;
                this.totalBytesTransferred = j8 + j9;
                if (i8 > 0) {
                    this.slidingPercentile.addSample((int) Math.sqrt(j9), (j9 * 8000.0f) / i8);
                    if (this.totalElapsedTimeMs < ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                        if (this.totalBytesTransferred >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        }
                        maybeNotifyBandwidthSample(i8, this.sampleBytesTransferred, this.bitrateEstimate);
                        this.sampleStartTimeMs = elapsedRealtime;
                        this.sampleBytesTransferred = 0L;
                    }
                    this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                    maybeNotifyBandwidthSample(i8, this.sampleBytesTransferred, this.bitrateEstimate);
                    this.sampleStartTimeMs = elapsedRealtime;
                    this.sampleBytesTransferred = 0L;
                }
                this.streamCount--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z7) {
    }

    @Override // com.google.android.exoplayer2.upstream.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z7) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z7)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public synchronized void setNetworkTypeOverride(int i8) {
        this.networkTypeOverride = i8;
        this.networkTypeOverrideSet = true;
        onNetworkTypeChanged(i8);
    }

    public static final class Builder {
        private Clock clock;

        @Nullable
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            ImmutableList<Long> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            hashMap.put(2, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            hashMap.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            hashMap.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            hashMap.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            hashMap.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            hashMap.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            hashMap.put(7, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            return hashMap;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        @CanIgnoreReturnValue
        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(long j8) {
            Iterator<Integer> it = this.initialBitrateEstimates.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j8);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setResetOnNetworkTypeChange(boolean z7) {
            this.resetOnNetworkTypeChange = z7;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSlidingWindowMaxWeight(int i8) {
            this.slidingWindowMaxWeight = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(int i8, long j8) {
            this.initialBitrateEstimates.put(Integer.valueOf(i8), Long.valueOf(j8));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitialBitrateEstimate(String str) {
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Ascii.toUpperCase(str));
            return this;
        }
    }

    private DefaultBandwidthMeter(@Nullable Context context, Map<Integer, Long> map, int i8, Clock clock, boolean z7) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i8);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z7;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: com.google.android.exoplayer2.upstream.j
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.Listener
            public final void onNetworkTypeChanged(int i9) {
                DefaultBandwidthMeter.this.onNetworkTypeChanged(i9);
            }
        });
    }
}
