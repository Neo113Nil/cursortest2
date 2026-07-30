package com.baidu.platform.comapi.walknavi.f;

import android.content.Context;
import android.os.Bundle;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comapi.wnplatform.walkmap.WNaviBaiduMap;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static MapController f9943a;

    /* renamed from: b, reason: collision with root package name */
    private MapTextureView f9944b;

    public b(Context context) {
        this.f9944b = null;
        this.f9944b = new MapTextureView(context);
        if (f9943a == null) {
            MapController mapController = new MapController();
            f9943a = mapController;
            mapController.createByDuplicateAppBaseMap(WNaviBaiduMap.getId());
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", 18.0d);
        bundle.putDouble("centerptx", 1.295815798E7d);
        bundle.putDouble("centerpty", 4825999.74d);
        bundle.putDouble("centerptz", i.DOUBLE_EPSILON);
        bundle.putInt(TtmlNode.LEFT, 0);
        bundle.putInt("top", 0);
        int screenHeight = SysOSUtil.getInstance().getScreenHeight();
        bundle.putInt(TtmlNode.RIGHT, SysOSUtil.getInstance().getScreenWidth());
        bundle.putInt("bottom", screenHeight);
        bundle.putString("modulePath", SysOSUtil.getInstance().getOutputDirPath());
        bundle.putString("appSdcardPath", SysOSUtil.getInstance().getExternalFilesDir());
        bundle.putString("appCachePath", SysOSUtil.getInstance().getOutputCache());
        bundle.putString("appSecondCachePath", SysOSUtil.getInstance().getOutputCache());
        bundle.putInt("mapTmpMax", EnvironmentUtilities.getMapTmpStgMax());
        bundle.putInt("domTmpMax", EnvironmentUtilities.getDomTmpStgMax());
        bundle.putInt("itsTmpMax", EnvironmentUtilities.getItsTmpStgMax());
        bundle.putInt("ssgTmpMax", EnvironmentUtilities.getSsgTmpStgMax());
        MapController mapController2 = f9943a;
        if (mapController2 != null) {
            mapController2.initMapResources(bundle);
            this.f9944b.attachBaseMapController(f9943a);
        }
    }

    public MapTextureView a() {
        return this.f9944b;
    }

    public void b() {
        MapController mapController = f9943a;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        f9943a.getBaseMap().ResetImageRes();
    }
}
