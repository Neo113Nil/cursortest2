package com.baidu.mapapi.bikenavi.adapter;

import android.graphics.drawable.Drawable;
import com.baidu.mapapi.bikenavi.model.BikeRouteDetailInfo;
import com.baidu.mapapi.bikenavi.model.BikeSimpleMapInfo;
import com.baidu.mapapi.bikenavi.model.IBRouteIconInfo;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;

/* loaded from: classes2.dex */
public interface IBRouteGuidanceListener {
    void onArriveDest();

    void onGetRouteDetailInfo(BikeRouteDetailInfo bikeRouteDetailInfo);

    void onGpsStatusChange(CharSequence charSequence, Drawable drawable);

    void onNaviLocationUpdate();

    void onReRouteComplete();

    void onRemainDistanceUpdate(int i8);

    void onRemainDistanceUpdate(CharSequence charSequence);

    void onRemainTimeUpdate(int i8);

    void onRemainTimeUpdate(CharSequence charSequence);

    void onRoadGuideTextUpdate(CharSequence charSequence, CharSequence charSequence2);

    void onRouteFarAway(CharSequence charSequence, Drawable drawable);

    void onRouteGuideIconInfoUpdate(IBRouteIconInfo iBRouteIconInfo);

    void onRouteGuideIconUpdate(Drawable drawable);

    void onRouteGuideKind(RouteGuideKind routeGuideKind);

    void onRoutePlanYawing(CharSequence charSequence, Drawable drawable);

    void onSimpleMapInfoUpdate(BikeSimpleMapInfo bikeSimpleMapInfo);

    void onVibrate();
}
