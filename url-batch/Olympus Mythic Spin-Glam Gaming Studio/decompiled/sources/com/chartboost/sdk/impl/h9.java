package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.internal.Networking.okhttp.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class h9 {
    public static final ChartboostError a(com.chartboost.sdk.internal.Networking.okhttp.a aVar, String url) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        return aVar instanceof a.i ? new ChartboostError.Load.AssetUnavailable(url, "Asset not found.", aVar) : ((aVar instanceof a.b) || (aVar instanceof a.n) || (aVar instanceof a.f) || (aVar instanceof a.e)) ? new ChartboostError.Load.InvalidRequest(aVar.getMessage(), aVar) : ((aVar instanceof a.l) || (aVar instanceof a.C0236a) || (aVar instanceof a.h) || (aVar instanceof a.k)) ? new ChartboostError.Connectivity.ServerError(aVar.getMessage(), aVar) : ((aVar instanceof a.j) || (aVar instanceof a.g)) ? ChartboostError.Connectivity.TimedOut.INSTANCE : aVar instanceof a.m ? ChartboostError.Load.RateLimited.INSTANCE : aVar instanceof a.c ? new ChartboostError.Load.InvalidRequest(aVar.getMessage(), aVar) : aVar instanceof a.o ? new ChartboostError.Connectivity.Unknown(aVar.getMessage(), aVar) : new ChartboostError.Connectivity.Unknown(aVar.getMessage(), aVar);
    }
}
