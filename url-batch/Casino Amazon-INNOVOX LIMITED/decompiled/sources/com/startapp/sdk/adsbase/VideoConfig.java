package com.startapp.sdk.adsbase;

import com.facebook.hermes.intl.Constants;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class VideoConfig implements Serializable {
    private static final long serialVersionUID = -1042577501006885021L;
    private int companionAdCloseDelay;
    private int rewardGrantPercentage = 100;
    private int videoErrorsThreshold = 2;
    private String videoErrorsPeriod = "3d";

    @TypeInfo(type = BackMode.class)
    private BackMode backMode = BackMode.DISABLED;
    private int minTimeForCachingIndicator = 1;
    private int maxTimeForCachingIndicator = 10;
    private boolean videoFallback = false;
    private String soundMode = Constants.COLLATION_DEFAULT;
    private int maxVastLevels = 7;
    private int vastRetryTimeout = 60000;
    private int maxVastCampaignExclude = 10;
    private long vastDefaultSkipIntervalMilli = 5000;
    private String downloadTimeout = "1m";
    private String downloadConnectTimeout = "15s";
    private String downloadReadTimeout = "30s";
    private String downloadCacheTtl = "7d";
    private int downloadEstimatedBytes = 20971520;
    private int downloadBufferSizeBytes = 16384;
    private int downloadChunkSizeBytes = 2097152;
    private int downloadMaxChunks = 4;
    private int downloadProgressFlushBytes = 262144;

    /* compiled from: Sta */
    public enum BackMode {
        DISABLED,
        SKIP,
        CLOSE,
        BOTH
    }

    public final BackMode a() {
        return this.backMode;
    }

    public final long b() {
        return this.companionAdCloseDelay;
    }

    public final int c() {
        return this.downloadBufferSizeBytes;
    }

    public final String d() {
        return this.downloadCacheTtl;
    }

    public final int e() {
        return this.downloadChunkSizeBytes;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            VideoConfig videoConfig = (VideoConfig) obj;
            if (this.rewardGrantPercentage == videoConfig.rewardGrantPercentage && this.videoErrorsThreshold == videoConfig.videoErrorsThreshold && this.minTimeForCachingIndicator == videoConfig.minTimeForCachingIndicator && this.maxTimeForCachingIndicator == videoConfig.maxTimeForCachingIndicator && this.videoFallback == videoConfig.videoFallback && this.maxVastLevels == videoConfig.maxVastLevels && this.vastRetryTimeout == videoConfig.vastRetryTimeout && this.maxVastCampaignExclude == videoConfig.maxVastCampaignExclude && this.vastDefaultSkipIntervalMilli == videoConfig.vastDefaultSkipIntervalMilli && this.companionAdCloseDelay == videoConfig.companionAdCloseDelay && this.downloadEstimatedBytes == videoConfig.downloadEstimatedBytes && this.downloadBufferSizeBytes == videoConfig.downloadBufferSizeBytes && this.downloadChunkSizeBytes == videoConfig.downloadChunkSizeBytes && this.downloadMaxChunks == videoConfig.downloadMaxChunks && this.downloadProgressFlushBytes == videoConfig.downloadProgressFlushBytes && zh.a((Object) this.videoErrorsPeriod, (Object) videoConfig.videoErrorsPeriod) && this.backMode == videoConfig.backMode && zh.a((Object) this.soundMode, (Object) videoConfig.soundMode) && zh.a((Object) this.downloadTimeout, (Object) videoConfig.downloadTimeout) && zh.a((Object) this.downloadConnectTimeout, (Object) videoConfig.downloadConnectTimeout) && zh.a((Object) this.downloadReadTimeout, (Object) videoConfig.downloadReadTimeout) && zh.a((Object) this.downloadCacheTtl, (Object) videoConfig.downloadCacheTtl)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.downloadConnectTimeout;
    }

    public final int g() {
        return this.downloadEstimatedBytes;
    }

    public final int h() {
        return this.downloadMaxChunks;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.rewardGrantPercentage), Integer.valueOf(this.videoErrorsThreshold), this.videoErrorsPeriod, this.backMode, Integer.valueOf(this.minTimeForCachingIndicator), Integer.valueOf(this.maxTimeForCachingIndicator), Boolean.valueOf(this.videoFallback), this.soundMode, Integer.valueOf(this.maxVastLevels), Integer.valueOf(this.vastRetryTimeout), Integer.valueOf(this.maxVastCampaignExclude), Long.valueOf(this.vastDefaultSkipIntervalMilli), Integer.valueOf(this.companionAdCloseDelay), this.downloadTimeout, this.downloadConnectTimeout, this.downloadReadTimeout, this.downloadCacheTtl, Integer.valueOf(this.downloadEstimatedBytes), Integer.valueOf(this.downloadBufferSizeBytes), Integer.valueOf(this.downloadChunkSizeBytes), Integer.valueOf(this.downloadMaxChunks), Integer.valueOf(this.downloadProgressFlushBytes)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public final int i() {
        return this.downloadProgressFlushBytes;
    }

    public final String j() {
        return this.downloadReadTimeout;
    }

    public final String k() {
        return this.downloadTimeout;
    }

    public final int l() {
        return this.maxVastCampaignExclude;
    }

    public final int m() {
        return this.maxVastLevels;
    }

    public final int n() {
        return this.rewardGrantPercentage;
    }

    public final String o() {
        return this.soundMode;
    }

    public final long p() {
        return this.vastDefaultSkipIntervalMilli;
    }

    public final int q() {
        return this.vastRetryTimeout;
    }

    public final String r() {
        return this.videoErrorsPeriod;
    }

    public final int s() {
        return this.videoErrorsThreshold;
    }

    public final boolean t() {
        return this.videoFallback;
    }
}
