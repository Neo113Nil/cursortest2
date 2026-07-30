package com.baidu.platform.comapi.walknavi;

/* loaded from: classes2.dex */
public interface IWNavigatorListener {
    void onNaviExit();

    void onPageJump(int i8, Object obj);

    void onWalkNaviModeChange(int i8, WalkNaviModeSwitchListener walkNaviModeSwitchListener);
}
