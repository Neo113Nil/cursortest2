package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c3.e;
import r2.h;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends d3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull d3.b bVar, String str, @RecentlyNonNull h hVar, @RecentlyNonNull e eVar, Bundle bundle);
}
