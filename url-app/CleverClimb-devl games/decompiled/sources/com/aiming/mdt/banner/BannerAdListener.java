package com.aiming.mdt.banner;

import android.view.View;
import com.aiming.mdt.core.AdListener;

/* loaded from: classes.dex */
public interface BannerAdListener extends AdListener {
    void onAdClicked();

    void onAdReady(View view);
}
