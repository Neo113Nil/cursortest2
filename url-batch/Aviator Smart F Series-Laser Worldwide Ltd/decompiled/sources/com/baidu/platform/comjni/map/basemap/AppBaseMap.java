package com.baidu.platform.comjni.map.basemap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import com.baidu.platform.comapi.map.j;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class AppBaseMap {

    /* renamed from: b, reason: collision with root package name */
    private NABaseMap f10567b;

    /* renamed from: a, reason: collision with root package name */
    private long f10566a = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ReadWriteLock f10568c = new ReentrantReadWriteLock(true);

    public AppBaseMap() {
        this.f10567b = null;
        this.f10567b = new NABaseMap();
    }

    public static void renderClearShaderCache(String str) {
        NABaseMap.renderClearShaderCache(str);
    }

    public void AddItemData(Bundle bundle) {
        AddItemData(bundle, false);
    }

    public long AddLayer(int i8, int i9, String str) {
        return this.f10567b.addLayer(i8, i9, str);
    }

    public void AddPopupData(Bundle bundle) {
        this.f10567b.addPopupData(bundle);
    }

    public void AddRtPopData(Bundle bundle) {
        this.f10567b.addRtPopData(bundle);
    }

    public void AddStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
        if (this.f10566a != 0) {
            this.f10567b.addStreetCustomMarker(bundle, bitmap);
        }
    }

    public void BeginLocationLayerAnimation() {
        this.f10567b.beginLocationLayerAnimation();
    }

    public void ClearLayer(long j8) {
        this.f10567b.clearLayer(j8);
    }

    public void ClearLocationLayerData(Bundle bundle) {
        this.f10567b.clearLocationLayerData(bundle);
    }

    public void ClearMistmapLayer() {
        this.f10567b.clearMistmapLayer();
    }

    public void ClearSDKLayer(long j8) {
        this.f10567b.clearSDKLayer(j8);
    }

    public boolean CloseCache() {
        return this.f10567b.closeCache();
    }

    public boolean Create() {
        try {
            this.f10568c.writeLock().lock();
            this.f10566a = this.f10567b.create();
            this.f10568c.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.f10568c.writeLock().unlock();
            throw th;
        }
    }

    public boolean CreateByDuplicate(long j8) {
        long createByDuplicate = this.f10567b.createByDuplicate(j8);
        this.f10566a = createByDuplicate;
        return createByDuplicate != 0;
    }

    public long CreateDuplicate() {
        return this.f10567b.createDuplicate();
    }

    public int Draw() {
        if (this.f10566a != 0) {
            return this.f10567b.draw();
        }
        return 0;
    }

    public String GeoPtToScrPoint(int i8, int i9) {
        return this.f10567b.geoPtToScrPoint(i8, i9);
    }

    public float GetAdapterZoomUnitsEx() {
        return this.f10567b.getAdapterZoomUnitsEx();
    }

    public int GetCacheSize(int i8) {
        return this.f10567b.getCacheSize(i8);
    }

    public String GetCityInfoByID(int i8) {
        return this.f10567b.getCityInfoByID(i8);
    }

    public Bundle GetDrawingMapStatus() {
        return this.f10567b.getDrawingMapStatus();
    }

    public float GetFZoomToBoundF(Bundle bundle, Bundle bundle2) {
        return this.f10567b.getFZoomToBoundF(bundle, bundle2);
    }

    public String GetFocusedBaseIndoorMapInfo() {
        if (this.f10566a != 0) {
            return this.f10567b.getFocusedBaseIndoorMapInfo();
        }
        return null;
    }

    public long GetId() {
        return this.f10566a;
    }

    public int GetMapRenderType() {
        return this.f10567b.getMapRenderType();
    }

    public Bundle GetMapStatus(boolean z7) {
        return this.f10567b.getMapStatus(z7);
    }

    public String GetNearlyObjID(long j8, int i8, int i9, int i10) {
        return this.f10567b.getNearlyObjID(j8, i8, i9, i10);
    }

    public int GetVMPMapCityInfo(Bundle bundle) {
        return this.f10567b.getVMPMapCityInfo(bundle);
    }

    public float GetZoomToBound(Bundle bundle, int i8, int i9) {
        return this.f10567b.getZoomToBound(bundle, i8, i9);
    }

    public float GetZoomToBoundF(Bundle bundle) {
        return this.f10567b.getZoomToBoundF(bundle);
    }

    @Deprecated
    public boolean Init(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, boolean z8) {
        return this.f10566a != 0 && this.f10567b.init(str, str2, str3, str4, str5, str6, str7, i8, i9, i10, i11, i12, i13, i14, z7, z8);
    }

    public boolean IsBaseIndoorMapMode() {
        return this.f10566a != 0 && this.f10567b.isBaseIndoorMapMode();
    }

    public boolean IsPointInFocusBarBorder(double d8, double d9, double d10) {
        return this.f10566a != 0 && this.f10567b.isPointInFocusBarBorder(d8, d9, d10);
    }

    public boolean IsPointInFocusIDRBorder(double d8, double d9) {
        return this.f10566a != 0 && this.f10567b.isPointInFocusIDRBorder(d8, d9);
    }

    public boolean IsStreetArrowShown() {
        return this.f10567b.isStreetArrowShown();
    }

    public boolean IsStreetCustomMarkerShown() {
        return this.f10567b.isStreetCustomMarkerShown();
    }

    public boolean IsStreetPOIMarkerShown() {
        return this.f10566a != 0 && this.f10567b.isStreetPOIMarkerShown();
    }

    public boolean IsStreetRoadClickable() {
        return this.f10567b.isStreetRoadClickable();
    }

    public boolean LayersIsShow(long j8) {
        return this.f10567b.layersIsShow(j8);
    }

    public void MoveToScrPoint(int i8, int i9) {
        this.f10567b.moveToScrPoint(i8, i9);
    }

    public void OnBackground() {
        try {
            this.f10568c.readLock().lock();
            if (this.f10566a != 0) {
                this.f10567b.onBackground();
            }
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public void OnForeground() {
        try {
            this.f10568c.readLock().lock();
            if (this.f10566a != 0) {
                this.f10567b.onForeground();
            }
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public String OnHotcityGet() {
        return this.f10567b.onHotcityGet();
    }

    public void OnPause() {
        try {
            this.f10568c.readLock().lock();
            if (this.f10566a != 0) {
                this.f10567b.onPause();
            }
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public boolean OnRecordAdd(int i8) {
        return this.f10567b.onRecordAdd(i8);
    }

    public String OnRecordGetAll() {
        return this.f10567b.onRecordGetAll();
    }

    public String OnRecordGetAt(int i8) {
        return this.f10567b.onRecordGetAt(i8);
    }

    public boolean OnRecordImport(boolean z7, boolean z8) {
        return this.f10567b.onRecordImport(z7, z8);
    }

    public boolean OnRecordReload(int i8, boolean z7) {
        return this.f10567b.onRecordReload(i8, z7);
    }

    public boolean OnRecordRemove(int i8, boolean z7) {
        return this.f10567b.onRecordRemove(i8, z7);
    }

    public boolean OnRecordStart(int i8, boolean z7, int i9) {
        return this.f10567b.onRecordStart(i8, z7, i9);
    }

    public boolean OnRecordSuspend(int i8, boolean z7, int i9) {
        return this.f10567b.onRecordSuspend(i8, z7, i9);
    }

    public void OnResume() {
        try {
            this.f10568c.readLock().lock();
            if (this.f10566a != 0) {
                this.f10567b.onResume();
            }
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public String OnSchcityGet(String str) {
        return this.f10567b.onSchcityGet(str);
    }

    public boolean OnUsrcityMsgInterval(int i8) {
        return this.f10567b.onUsrcityMsgInterval(i8);
    }

    public int OnWifiRecordAdd(int i8) {
        return this.f10567b.onWifiRecordAdd(i8);
    }

    public boolean Release() {
        try {
            this.f10568c.writeLock().lock();
            long j8 = this.f10566a;
            if (j8 == 0) {
                this.f10568c.writeLock().unlock();
                return false;
            }
            BaseMapCallback.release(j8);
            this.f10567b.dispose();
            this.f10566a = 0L;
            this.f10568c.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.f10568c.writeLock().unlock();
            throw th;
        }
    }

    public void Remo() {
    }

    public boolean RemoveItemData(Bundle bundle) {
        return this.f10567b.removeItemData(bundle);
    }

    public void RemoveLayer(long j8) {
        this.f10567b.removeLayer(j8);
    }

    public void RemoveStreetAllCustomMarker() {
        this.f10567b.removeStreetAllCustomMarker();
    }

    public void RemoveStreetCustomMaker(String str) {
        this.f10567b.removeStreetCustomMaker(str);
    }

    public void ResetImageRes() {
        if (this.f10566a != 0) {
            this.f10567b.resetImageRes();
        }
    }

    public boolean ResumeCache() {
        return this.f10567b.resumeCache();
    }

    public boolean SaveCache() {
        try {
            return this.f10567b.saveCache();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void SaveScreenToLocal(String str, String str2) {
        this.f10567b.saveScreenToLocal(str, str2);
    }

    public String ScrPtToGeoPoint(int i8, int i9) {
        return this.f10567b.scrPtToGeoPoint(i8, i9);
    }

    public void SetAllStreetCustomMarkerVisibility(boolean z7) {
        if (this.f10566a != 0) {
            this.f10567b.setAllStreetCustomMarkerVisibility(z7);
        }
    }

    public boolean SetCallback(a aVar) {
        if (aVar != null) {
            long j8 = this.f10566a;
            if (j8 != 0 && BaseMapCallback.setMapCallback(j8, aVar)) {
                return true;
            }
        }
        return false;
    }

    public void SetFocus(long j8, long j9, boolean z7, Bundle bundle) {
        this.f10567b.setFocus(j8, j9, z7, bundle);
    }

    public boolean SetItsPreTime(int i8, int i9, int i10) {
        return this.f10567b.setItsPreTime(i8, i9, i10);
    }

    public boolean SetLayerSceneMode(long j8, int i8) {
        return this.f10567b.setLayerSceneMode(j8, i8);
    }

    public void SetLayersClickable(long j8, boolean z7) {
        this.f10567b.setLayersClickable(j8, z7);
    }

    public void SetLocationLayerData(Bundle bundle) {
        this.f10567b.setLocationLayerData(bundle);
    }

    public int SetMapControlMode(int i8) {
        return this.f10567b.setMapControlMode(i8);
    }

    public void SetMapStatus(Bundle bundle) {
        this.f10567b.setMapStatus(bundle);
    }

    public void SetNewMapStatus(Bundle bundle) {
        this.f10567b.setNewMapStatus(bundle);
    }

    public boolean SetSDKLayerCallback(com.baidu.mapsdkplatform.a.a.a.a aVar) {
        if (aVar != null) {
            long j8 = this.f10566a;
            if (j8 != 0 && BaseMapCallback.setMapSDKCallback(j8, aVar)) {
                return true;
            }
        }
        return false;
    }

    public void SetStreetArrowShow(boolean z7) {
        this.f10567b.setStreetArrowShow(z7);
    }

    public void SetStreetMarkerClickable(String str, boolean z7) {
        this.f10567b.setStreetMarkerClickable(str, z7);
    }

    public void SetStreetRoadClickable(boolean z7) {
        this.f10567b.setStreetRoadClickable(z7);
    }

    public void SetStyleMode(int i8) {
        this.f10567b.setStyleMode(i8);
    }

    public void SetTargetStreetCustomMarkerVisibility(boolean z7, String str) {
        if (this.f10566a != 0) {
            this.f10567b.setTargetStreetCustomMarkerVisibility(z7, str);
        }
    }

    public void ShowBaseIndoorMap(boolean z7) {
        this.f10567b.showBaseIndoorMap(z7);
    }

    public void ShowHotMap(boolean z7, int i8) {
        this.f10567b.showHotMap(z7, i8);
    }

    public void ShowLayers(long j8, boolean z7) {
        if (this.f10566a != 0) {
            this.f10567b.showLayers(j8, z7);
        }
    }

    public void ShowMistMap(boolean z7, String str) {
        this.f10567b.showMistMap(z7, str);
    }

    public void ShowSatelliteMap(boolean z7) {
        this.f10567b.showSatelliteMap(z7);
    }

    public void ShowStreetPOIMarker(boolean z7) {
        if (this.f10566a != 0) {
            this.f10567b.showStreetPOIMarker(z7);
        }
    }

    public void ShowStreetRoadMap(boolean z7) {
        this.f10567b.showStreetRoadMap(z7);
    }

    public void ShowTrafficMap(boolean z7) {
        this.f10567b.showTrafficMap(z7);
    }

    public void StartIndoorAnimation() {
        this.f10567b.startIndoorAnimation();
    }

    public boolean SwitchBaseIndoorMapFloor(String str, String str2) {
        return this.f10567b.switchBaseIndoorMapFloor(str, str2);
    }

    public boolean SwitchLayer(long j8, long j9) {
        return this.f10567b.switchLayer(j8, j9);
    }

    public void UpdateLayers(long j8) {
        this.f10567b.updateLayers(j8);
    }

    public void add3DModelIDForFilterList(String str) {
        this.f10567b.add3DModelIDForFilterList(str);
    }

    public boolean addBmLayerBelow(long j8, long j9, int i8, int i9) {
        return this.f10567b.addBmLayerBelow(j8, j9, i8, i9);
    }

    public void addHexagonMapData(long j8, Bundle bundle) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.addHexagonMapData(j8, bundle);
    }

    public void addOneOverlayItem(Bundle bundle) {
        this.f10567b.addOneOverlayItem(bundle);
    }

    public void addOverlayItems(Bundle[] bundleArr, int i8) {
        this.f10567b.addOverlayItems(bundleArr, i8);
    }

    public boolean addSDKTileData(Bundle bundle) {
        return this.f10567b.nativeAddTileOverlay(this.f10566a, bundle);
    }

    public void cancelPreload(int i8) {
        this.f10567b.cancelPreload(i8);
    }

    public boolean cleanCache(int i8, boolean z7) {
        return this.f10567b.cleanCache(i8, z7);
    }

    public boolean cleanSDKTileDataCache(long j8) {
        return this.f10567b.nativeCleanSDKTileDataCache(this.f10566a, j8);
    }

    public void clearFullscreenMaskColor() {
        this.f10567b.clearFullscreenMaskColor();
    }

    public void clearHeatMapLayerCache(long j8) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.clearHeatMapLayerCache(j8);
    }

    public void clearHexagonLayerCache(long j8) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.clearHexagonLayerCache(j8);
    }

    public void clearParticleSystemMemory() {
        this.f10567b.clearParticleSystemMemory();
    }

    public void clearUniversalLayer() {
        this.f10567b.clearUniversalLayer();
    }

    public void closeParticleEffect(String str) {
        this.f10567b.closeParticleEffect(str);
    }

    public void closeParticleEffectByType(int i8) {
        this.f10567b.closeParticleEffectByType(i8);
    }

    public boolean customParticleEffectByType(int i8, Bundle bundle) {
        return this.f10567b.customParticleEffectByType(i8, bundle);
    }

    public boolean downloadMapStyle(String str) {
        return this.f10567b.downloadMapStyle(str);
    }

    public void enablePOIAnimation(boolean z7) {
        try {
            this.f10568c.readLock().lock();
            this.f10567b.enablePOIAnimation(z7);
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public void entryFeedTopic(int i8, String str, String str2) {
        this.f10567b.entrySearchTopic(i8, str, str2);
    }

    public void entrySearchTopic(int i8) {
        this.f10567b.entrySearchTopic(i8, "", "");
    }

    public void exitSearchTopic() {
        this.f10567b.exitSearchTopic();
    }

    public void focusTrafficUGCLabel() {
        this.f10567b.focusTrafficUGCLabel();
    }

    public String geoPt3ToScrPoint(int i8, int i9, int i10) {
        return this.f10567b.geoPt3ToScrPoint(i8, i9, i10);
    }

    public boolean get3DModelEnable() {
        return this.f10567b.get3DModelEnable();
    }

    public Bundle getBaseRoadData() {
        NABaseMap nABaseMap;
        if (isSupBackgroundDraw() && (nABaseMap = this.f10567b) != null) {
            return nABaseMap.getBaseRoadData();
        }
        return null;
    }

    public boolean getCityInfoByBound(Bundle bundle) {
        return this.f10567b.getCityInfoByBound(bundle);
    }

    public String getCurDrawPoiInfo(int i8) {
        return this.f10567b.getCurDrawPoiInfo(i8);
    }

    public boolean getCustomTrafficColorEnable() {
        return this.f10567b.getCustomTrafficColorEnable();
    }

    public boolean getDEMEnable() {
        return this.f10567b.getDEMEnable();
    }

    public float getDpiScale() {
        return this.f10567b.getDpiScale();
    }

    public boolean getDrawHouseHeightEnable() {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return false;
        }
        return nABaseMap.getDrawHouseHeightEnable();
    }

    public int getFontSizeLevel() {
        return this.f10567b.getFontSizeLevel();
    }

    public int getHouseSmoothLevel() {
        return this.f10567b.getHouseSmoothLevel();
    }

    public int getIndoorMapShowMode(String str) {
        return this.f10567b.getIndoorMapShowMode(str);
    }

    public long getLayerIDByTag(String str) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return 0L;
        }
        return nABaseMap.getLayerIDByTag(str);
    }

    public boolean getMapBarData(Bundle bundle) {
        return this.f10567b.getMapBarData(bundle);
    }

    public int getMapLanguage() {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return 0;
        }
        return nABaseMap.getMapLanguage();
    }

    public int getMapScene() {
        return this.f10567b.getMapScene();
    }

    public int getMapSceneAttr() {
        return this.f10567b.getMapSceneAttr();
    }

    public Bundle getMapStatusLimits() {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return null;
        }
        return nABaseMap.getMapStatusLimits();
    }

    public boolean getMapStatusLimitsLevel(int[] iArr) {
        return this.f10567b.getMapStatusLimitsLevel(iArr);
    }

    public int getMapTheme() {
        return this.f10567b.getMapTheme();
    }

    public String getPoiMarkData(int i8, int i9, int i10, int i11, boolean z7) {
        return this.f10567b.getPoiMarkData(i8, i9, i10, i11, z7);
    }

    public boolean getPoiTagEnable(int i8) {
        return this.f10567b.getPoiTagEnable(i8);
    }

    public float[] getProjectionMatrix() {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return null;
        }
        float[] fArr = new float[16];
        nABaseMap.getProjectMatrix(fArr);
        return fArr;
    }

    public String getProjectionPt(String str) {
        return this.f10567b.getProjectionPt(str);
    }

    public int getScaleLevel(int i8, int i9) {
        return this.f10567b.getScaleLevel(i8, i9);
    }

    public int getSkyboxStyle() {
        return this.f10567b.getSkyboxStyle();
    }

    public String getStreetRoadNearPointFromCenter(double d8, double d9, int i8) {
        return this.f10567b.getStreetRoadNearPointFromCenter(d8, d9, i8);
    }

    public float[] getViewMatrix() {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return null;
        }
        float[] fArr = new float[16];
        nABaseMap.getViewMatrix(fArr);
        return fArr;
    }

    public boolean getVirtualPoiShowEnable() {
        return this.f10567b.getVirtualPoiShowEnable();
    }

    public boolean importMapTheme(int i8) {
        return this.f10567b.importMapTheme(i8);
    }

    public boolean initCustomStyle(String str, String str2) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return false;
        }
        return nABaseMap.initCustomStyle(str, str2);
    }

    public void initHeatMapData(long j8, Bundle bundle) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.initHeatMapData(j8, bundle);
    }

    public boolean initWithOptions(Bundle bundle, boolean z7) {
        return this.f10566a != 0 && this.f10567b.initWithOptions(bundle, z7);
    }

    public void interruptDraw(boolean z7) {
        this.f10567b.interruptDraw(z7);
    }

    public boolean isAnimationRunning() {
        return this.f10567b.isAnimationRunning();
    }

    public boolean isBaseIndoorMapShow() {
        return this.f10566a != 0 && this.f10567b.isBaseIndoorMapShow();
    }

    public boolean isEnableIndoor3D() {
        return this.f10567b.isEnableIndoor3D();
    }

    public boolean isNaviMode() {
        return this.f10567b.isNaviMode();
    }

    public boolean isSupBackgroundDraw() {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return false;
        }
        return nABaseMap.isSupBackgroundDraw();
    }

    public boolean moveLayerBelow(long j8, String str) {
        return this.f10567b.moveLayerBelow(j8, str);
    }

    public boolean moveLayerBelowTo(long j8, int i8) {
        return this.f10567b.moveLayerBelowTo(j8, i8);
    }

    public boolean performAction(String str) {
        return this.f10567b.performAction(str);
    }

    public boolean preLoad(int i8, List<j> list) {
        return this.f10567b.preLoad(i8, list);
    }

    public void preLoadParticleFile(String str) {
        this.f10567b.preLoadParticleFile(str);
    }

    public byte[] readMapResData(String str) {
        return this.f10567b.readMapResData(str);
    }

    public void recycleMemory(int i8) {
        this.f10567b.recycleMemory(i8);
    }

    public boolean releaseFromOfflineMap() {
        try {
            this.f10568c.writeLock().lock();
            if (this.f10566a == 0) {
                this.f10568c.writeLock().unlock();
                return false;
            }
            this.f10567b.dispose();
            this.f10566a = 0L;
            this.f10568c.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.f10568c.writeLock().unlock();
            throw th;
        }
    }

    public void remove3DModelIDForFilterList(String str) {
        this.f10567b.remove3DModelIDForFilterList(str);
    }

    public void removeBmLayer(long j8) {
        this.f10567b.removeBmLayer(j8);
    }

    public void removeOneOverlayItem(Bundle bundle) {
        this.f10567b.removeOneOverlayItem(bundle);
    }

    public void removeOverlayItems(Bundle[] bundleArr) {
        this.f10567b.removeOneOverlayItems(bundleArr);
    }

    public void renderDone() {
        try {
            this.f10568c.readLock().lock();
            this.f10567b.renderDone();
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public void renderInit(int i8, int i9, Surface surface, int i10) {
        try {
            this.f10568c.readLock().lock();
            this.f10567b.renderInit(i8, i9, surface, i10);
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public int renderRender() {
        try {
            this.f10568c.readLock().lock();
            return this.f10567b.renderRender();
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public void renderResize(int i8, int i9) {
        try {
            this.f10568c.readLock().lock();
            this.f10567b.renderResize(i8, i9);
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public void resize(int i8, int i9) {
        if (this.f10566a != 0) {
            this.f10567b.renderResize(i8, i9);
        }
    }

    public void set3DModelEnable(boolean z7) {
        this.f10567b.set3DModelEnable(z7);
    }

    public void setAutoEnter3DByZoomIn(boolean z7) {
        this.f10567b.setAutoEnter3DByZoomIn(z7);
    }

    public void setBackgroundColor(int i8) {
        this.f10567b.setBackgroundColor(i8);
    }

    public void setCustomStyleEnable(boolean z7) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setCustomStyleEnable(z7);
    }

    public void setCustomTrafficColor(int i8, int i9, int i10, int i11) {
        this.f10567b.setCustomTrafficColor(i8, i9, i10, i11);
    }

    public void setCustomTrafficColorEnable(boolean z7) {
        this.f10567b.setCustomTrafficColorEnable(z7);
    }

    public void setDEMEnable(boolean z7) {
        this.f10567b.setDEMEnable(z7);
    }

    public void setDpiScale(float f8) {
        this.f10567b.setDpiScale(f8);
    }

    public void setDrawHouseHeightEnable(boolean z7) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setDrawHouseHeightEnable(z7);
    }

    public void setEnableIndoor3D(boolean z7) {
        this.f10567b.setEnableIndoor3D(z7);
    }

    public void setFeatureConfig(String str) {
        this.f10567b.setFeatureConfig(str);
    }

    public void setFontSizeLevel(int i8) {
        this.f10567b.setFontSizeLevel(i8);
    }

    public void setFullscreenMaskColor(int i8) {
        this.f10567b.setFullscreenMaskColor(i8);
    }

    public void setGlobalLightEnable(boolean z7) {
        this.f10567b.setGlobalLightEnable(z7);
    }

    public void setHeatMapFrameAnimationIndex(long j8, int i8) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setHeatMapFrameAnimationIndex(j8, i8);
    }

    public void setHouseSmoothLevel(int i8) {
        this.f10567b.setHouseSmoothLevel(i8);
    }

    public void setIndoorMapShowMode(String str, int i8) {
        this.f10567b.setIndoorMapShowMode(str, i8);
    }

    public void setLittle3DEnable(boolean z7) {
        this.f10567b.setLittle3DEnable(z7);
    }

    public void setMapBackgroundImage(Bundle bundle) {
        this.f10567b.setMapBackgroundImage(bundle);
    }

    public void setMapLanguage(int i8, boolean z7) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setMapLanguage(i8, z7);
    }

    public void setMapScene(int i8) {
        this.f10567b.setMapScene(i8);
    }

    public boolean setMapSceneAttr(int i8) {
        return this.f10567b.setMapSceneAttr(i8);
    }

    public void setMapStatusLimits(Bundle bundle) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setMapStatusLimits(bundle);
    }

    public boolean setMapStatusLimitsLevel(int i8, int i9) {
        return this.f10567b.setMapStatusLimitsLevel(i8, i9);
    }

    public boolean setMapTheme(int i8, Bundle bundle) {
        return this.f10567b.setMapTheme(i8, bundle);
    }

    public boolean setMapThemeScene(int i8, int i9, Bundle bundle) {
        return this.f10567b.setMapThemeScene(i8, i9, bundle);
    }

    public void setMaxAndMinZoomLevel(Bundle bundle) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setMaxAndMinZoomLevel(bundle);
    }

    public void setPoiTagEnable(int i8, boolean z7) {
        this.f10567b.setPoiTagEnable(i8, z7);
    }

    public void setRecommendPOIScene(int i8) {
        this.f10567b.setRecommendPOIScene(i8);
    }

    public void setSkyboxStyle(int i8) {
        this.f10567b.setSkyboxStyle(i8);
    }

    public void setStreetLayerNewDesignFlag(boolean z7) {
        this.f10567b.setStreetLayerNewDesignFlag(z7);
    }

    public void setSupBackgroundDraw(boolean z7) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setSupBackgroundDraw(z7);
    }

    public boolean setTestSwitch(boolean z7) {
        return this.f10567b.setTestSwitch(z7);
    }

    public void setTrafficUGCData(String str) {
        this.f10567b.setTrafficUGCData(str);
    }

    public void setUniversalFilter(String str) {
        this.f10567b.setUniversalFilter(str);
    }

    public void setVirtualPoiShowEnable(boolean z7) {
        this.f10567b.setVirtualPoiShowEnable(z7);
    }

    public void showFootMarkGrid(boolean z7, String str) {
        this.f10567b.showFootMarkGrid(z7, str);
    }

    public void showOperatorDataByType(boolean z7, int i8) {
        this.f10567b.showOperatorDataByType(z7, i8);
    }

    public boolean showParticleEffect(int i8) {
        return this.f10567b.showParticleEffect(i8);
    }

    public boolean showParticleEffectByFileName(String str) {
        return this.f10567b.showParticleEffectByFileName(str);
    }

    public boolean showParticleEffectByFilenameAndPos(String str, float f8, float f9, float f10) {
        return this.f10567b.showParticleEffectByFilenameAndPos(str, f8, f9, f10);
    }

    public boolean showParticleEffectByName(String str, boolean z7) {
        return this.f10567b.showParticleEffectByName(str, z7);
    }

    public boolean showParticleEffectByType(int i8) {
        return this.f10567b.showParticleEffectByType(i8);
    }

    public boolean showParticleEffectByTypeAndPos(int i8, float f8, float f9, float f10) {
        return this.f10567b.showParticleEffectByTypeAndPos(i8, f8, f9, f10);
    }

    public boolean showParticleEffectByTypeAndStyleID(int i8, int i9) {
        return this.f10567b.showParticleEffectByTypeAndStyleID(i8, i9);
    }

    public void showStreetPopup(boolean z7) {
        this.f10567b.showStreetPopup(z7);
    }

    public void showTopicPOI(String str, boolean z7, String str2, boolean z8) {
        this.f10567b.showTopicPOI(str, z7, str2, z8);
    }

    public void showTrafficUGCMap(boolean z7) {
        this.f10567b.showTrafficUGCMap(z7);
    }

    public void showUniversalLayer(Bundle bundle) {
        this.f10567b.showUniversalLayer(bundle);
    }

    public void startHeatMapFrameAnimation(long j8) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.startHeatMapFrameAnimation(j8);
    }

    public void stopHeatMapFrameAnimation(long j8) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.stopHeatMapFrameAnimation(j8);
    }

    public void surfaceDestroyed(Surface surface) {
        try {
            this.f10568c.readLock().lock();
            this.f10567b.surfaceDestroyed(surface);
        } finally {
            this.f10568c.readLock().unlock();
        }
    }

    public void switchDayOrDarkTheme(int i8, boolean z7) {
        this.f10567b.switchDayOrDarkTheme(i8, z7);
    }

    public void unFocusTrafficUGCLabel() {
        this.f10567b.unFocusTrafficUGCLabel();
    }

    public void updateBaseLayers() {
        this.f10567b.updateBaseLayers();
    }

    public void updateDrawFPS() {
        this.f10567b.updateDrawFPS();
    }

    public void updateFootMarkGrid() {
        this.f10567b.updateFootMarkGrid();
    }

    public void updateHeatMapData(long j8, Bundle bundle) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.updateHeatMapData(j8, bundle);
    }

    public void updateOneOverlayItem(Bundle bundle) {
        this.f10567b.updateOneOverlayItem(bundle);
    }

    public boolean updateSDKTile(Bundle bundle) {
        return this.f10567b.nativeUpdateSDKTile(this.f10566a, bundle);
    }

    public String worldPointToScreenPoint(float f8, float f9, float f10) {
        return this.f10567b.worldPointToScreenPoint(f8, f9, f10);
    }

    public void AddItemData(Bundle bundle, boolean z7) {
        this.f10567b.addItemData(bundle, z7);
    }

    public Bundle GetMapStatus() {
        return this.f10567b.getMapStatus(true);
    }

    public void ShowHotMap(boolean z7, int i8, String str) {
        this.f10567b.showHotMap(z7, i8, str);
    }

    public void setCustomTrafficColor(int i8, int i9, int i10, int i11, boolean z7) {
        NABaseMap nABaseMap = this.f10567b;
        if (nABaseMap == null) {
            return;
        }
        nABaseMap.setCustomTrafficColorEnable(z7);
        this.f10567b.setCustomTrafficColor(i8, i9, i10, i11);
    }
}
