package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c3.f;
import c3.p;
import c3.s;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull s sVar, Bundle bundle2);
}
