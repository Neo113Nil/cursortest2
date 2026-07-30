package com.baidu.platform.comapi.wnplatform.mulitmap;

import android.graphics.Bitmap;
import com.baidu.mapapi.map.LogoPosition;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;

/* loaded from: classes2.dex */
public interface IMultiNaviView {
    public static final int LIFE_ATTACHED_TO_WINDOW = 0;
    public static final int LIFE_DESTROY = 5;
    public static final int LIFE_DETACHED_FROM_WINDOW = 1;
    public static final int LIFE_NONE = -1;
    public static final int LIFE_PAUSE = 4;
    public static final int LIFE_RESUME = 3;
    public static final int TYPE_NAVI_NONE = -1;
    public static final int TYPE_NAVI_RIDE = 1;
    public static final int TYPE_NAVI_WALK = 0;

    public enum Map_Rotate_Mode {
        Map_Rotate_Route,
        Map_Rotate_North
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    MapTextureView getMapTextureView();

    boolean isSetBackgroundDraw();

    void onDestroy();

    void onPause();

    void onResume();

    void screenshot(SnapshotReadyCallback snapshotReadyCallback);

    boolean setDefaultLevel(float f8);

    boolean setDefaultOverlooking(OverLookingMode overLookingMode);

    void setLogoPosition(LogoPosition logoPosition);

    void setMapDpiScale(float f8);

    void setMapPausedDraw(boolean z7);

    boolean setNaviType(int i8);

    void setPadding(int i8, int i9, int i10, int i11);

    boolean setRotateMode(Map_Rotate_Mode map_Rotate_Mode);

    boolean setSupBackgroundDraw(boolean z7);
}
