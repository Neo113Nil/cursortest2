package com.baidu.platform.comapi.map;

import android.view.MotionEvent;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.MapBound;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.map.MapStatus;
import java.util.List;

/* loaded from: classes2.dex */
public interface MapViewInterface {
    boolean addBmLayer(BmLayer bmLayer);

    boolean addBmLayerBelow(Overlay overlay, BmLayer bmLayer);

    boolean addOverlay(Overlay overlay);

    boolean enable3D();

    List<BmLayer> getBmlayers();

    MapController getController();

    MapStatus getCurrentMapStatus();

    float getCurrentZoomLevel();

    MapStatus.GeoBound getGeoRound();

    int getLatitudeSpan();

    int getLongitudeSpan();

    GeoPoint getMapCenter();

    int getMapRotation();

    MapStatus getMapStatus();

    List<Overlay> getOverlays();

    double getOverlooking();

    Projection getProjection();

    MapStatus.WinRound getWinRound();

    float getZoomLevel();

    float getZoomToBound(MapBound mapBound);

    float getZoomToBound(MapBound mapBound, int i8, int i9);

    float getZoomToBoundF(MapBound mapBound);

    float getZoomToBoundF(MapBound mapBound, int i8, int i9);

    boolean isBaseIndoorMap();

    boolean isSatellite();

    boolean isStreetRoad();

    boolean isTraffic();

    boolean onTouchEvent(MotionEvent motionEvent);

    void refresh(Overlay overlay);

    boolean removeBmLayer(BmLayer bmLayer);

    boolean removeOverlay(Overlay overlay);

    void saveScreenToLocal(String str);

    void setBaseIndoorMap(boolean z7);

    void setGeoRound(MapStatus.GeoBound geoBound);

    void setMapCenter(GeoPoint geoPoint);

    void setMapStatus(MapStatus mapStatus);

    void setMapTo2D(boolean z7);

    void setOverlooking(int i8);

    void setRotation(int i8);

    void setSatellite(boolean z7);

    void setStreetRoad(boolean z7);

    void setTraffic(boolean z7);

    void setWinRound(MapStatus.WinRound winRound);

    void setZoomLevel(float f8);

    void setZoomLevel(int i8);

    boolean switchOverlay(Overlay overlay, Overlay overlay2);
}
