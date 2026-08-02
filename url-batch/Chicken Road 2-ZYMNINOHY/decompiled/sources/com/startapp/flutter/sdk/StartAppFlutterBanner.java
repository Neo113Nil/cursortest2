package com.startapp.flutter.sdk;

import E.AbstractC0005f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import java.util.Map;

/* loaded from: classes.dex */
public class StartAppFlutterBanner extends StartAppView {
    private static final String LOG_TAG = "StartAppFlutterBanner";
    private final StartAppKeeper<BannerStandard> bannerAdKeeper;
    public static final Integer TYPE_BANNER = 0;
    public static final Integer TYPE_MREC = 1;
    public static final Integer TYPE_COVER = 2;

    public StartAppFlutterBanner(StartAppKeeper<BannerStandard> startAppKeeper) {
        this.bannerAdKeeper = startAppKeeper;
    }

    @Override // com.startapp.flutter.sdk.StartAppView
    public View onCreateView(Context context, int i4, Map<String, Object> map) {
        String str;
        int i5 = StartAppView.getInt(map, "adId", 0);
        BannerStandard bannerStandard = null;
        if (i5 <= 0) {
            str = "no_ad_id";
        } else {
            BannerStandard bannerStandard2 = this.bannerAdKeeper.get(i5);
            bannerStandard = bannerStandard2;
            str = bannerStandard2 == null ? "no_ad_instance" : null;
        }
        if (bannerStandard != null) {
            return bannerStandard;
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setBackground(new StartAppErrorDrawable(context.getResources(), AbstractC0005f.n("Error: ", str)));
        return view;
    }
}
