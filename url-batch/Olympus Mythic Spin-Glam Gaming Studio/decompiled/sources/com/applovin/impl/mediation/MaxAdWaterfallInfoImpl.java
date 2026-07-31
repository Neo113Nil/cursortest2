package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes13.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final y2 a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final a3 f;
    private final List g;
    private final String h;
    private final String i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.g;
    }

    public a3 getRequestParameters() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable y2 y2Var, String str, String str2, long j, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.a = y2Var;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.d = list;
        this.f = a3Var;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }
}
