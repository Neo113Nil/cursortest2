package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c3.s;
import d3.e;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends d3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull e eVar, String str, @RecentlyNonNull s sVar, Bundle bundle);
}
