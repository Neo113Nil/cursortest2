package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.Point;

/* loaded from: classes2.dex */
public interface NaviMapViewListener {
    void onAction(int i8, Object obj);

    boolean onItemClick(String str, int i8, int i9);

    void onMapAnimationFinish();

    void onMapRenderModeChange(int i8);

    Point onTapInterception(Point point);

    void resizeScreen(int i8, int i9);
}
