package com.chartboost.sdk.impl;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class qd {
    public static final /* synthetic */ qd[] S;
    public static final /* synthetic */ EnumEntries T;
    public static final a c;
    public static final Map d;
    public final String b;
    public static final qd e = new qd("GET_PARAMETERS", 0, "getParameters");
    public static final qd f = new qd("GET_MAX_SIZE", 1, "getMaxSize");
    public static final qd g = new qd("GET_SCREEN_SIZE", 2, "getScreenSize");
    public static final qd h = new qd("GET_CURRENT_POSITION", 3, "getCurrentPosition");
    public static final qd i = new qd("GET_DEFAULT_POSITION", 4, "getDefaultPosition");
    public static final qd j = new qd("GET_ORIENTATION_PROPERTIES", 5, "getOrientationProperties");
    public static final qd k = new qd("CLICK", 6, "click");
    public static final qd l = new qd("CLOSE", 7, "close");
    public static final qd m = new qd("SKIPPED", 8, "skipped");
    public static final qd n = new qd("VIDEO_COMPLETED", 9, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.al);
    public static final qd o = new qd("VIDEO_RESUMED", 10, "videoResumed");
    public static final qd p = new qd("VIDEO_PAUSED", 11, "videoPaused");
    public static final qd q = new qd("VIDEO_REPLAY", 12, "videoReplay");
    public static final qd r = new qd("CURRENT_VIDEO_DURATION", 13, "currentVideoDuration");
    public static final qd s = new qd("TOTAL_VIDEO_DURATION", 14, "totalVideoDuration");
    public static final qd t = new qd("SHOW", 15, "show");
    public static final qd u = new qd("ERROR", 16, "error");
    public static final qd v = new qd("WARNING", 17, "warning");
    public static final qd w = new qd("DEBUG", 18, "debug");
    public static final qd x = new qd("TRACKING", 19, "tracking");
    public static final qd y = new qd("OPEN_URL", 20, "openUrl");
    public static final qd z = new qd("SET_ORIENTATION_PROPERTIES", 21, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h);
    public static final qd A = new qd("REWARD", 22, "reward");
    public static final qd B = new qd("REWARDED_VIDEO_COMPLETED", 23, "rewardedVideoCompleted");
    public static final qd C = new qd("PLAY_VIDEO", 24, "playVideo");
    public static final qd D = new qd("PAUSE_VIDEO", 25, "pauseVideo");
    public static final qd E = new qd("CLOSE_VIDEO", 26, "closeVideo");
    public static final qd F = new qd("MUTE_VIDEO", 27, "mute");
    public static final qd G = new qd("UNMUTE_VIDEO", 28, "unmute");
    public static final qd H = new qd("OM_MEASUREMENT_RESOURCES", 29, "OMMeasurementResources");
    public static final qd I = new qd(POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, 30, "start");
    public static final qd J = new qd("BUFFER_START", 31, "bufferStart");
    public static final qd K = new qd("BUFFER_END", 32, "bufferEnd");
    public static final qd L = new qd("VIDEO_FINISHED", 33, "videoFinished");
    public static final qd M = new qd("VIDEO_STARTED", 34, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.am);
    public static final qd N = new qd("VIDEO_ENDED", 35, "videoEnded");
    public static final qd O = new qd("VIDEO_FAILED", 36, "videoFailed");
    public static final qd P = new qd("PLAYBACK_TIME", 37, "playbackTime");
    public static final qd Q = new qd("ON_BACKGROUND", 38, "onBackground");
    public static final qd R = new qd("ON_FOREGROUND", 39, "onForeground");

    static {
        qd[] a2 = a();
        S = a2;
        T = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
        EnumEntries d2 = d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(d2, 10)), 16));
        for (Object obj : d2) {
            linkedHashMap.put(((qd) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public static final /* synthetic */ qd[] a() {
        return new qd[]{e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R};
    }

    public static EnumEntries d() {
        return T;
    }

    public static qd valueOf(String str) {
        return (qd) Enum.valueOf(qd.class, str);
    }

    public static qd[] values() {
        return (qd[]) S.clone();
    }

    public qd(String str, int i2, String str2) {
        this.b = str2;
    }

    public final String c() {
        return this.b;
    }

    public static final class a {
        public final qd a(String cmdName) {
            Intrinsics.checkNotNullParameter(cmdName, "cmdName");
            return (qd) qd.d.get(cmdName);
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
