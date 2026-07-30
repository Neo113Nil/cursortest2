package com.baidu.mapapi.map;

import com.baidu.mapapi.map.BackgroundDrawMapView;

/* loaded from: classes2.dex */
interface IBackgroundDrawLayer {
    void onCreate();

    void onDestroy();

    void onDraw(BackgroundDrawMapView.CanvasProxy canvasProxy);

    void onSizeChanged(int i8, int i9);

    void onUpdated();
}
