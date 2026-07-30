package com.baidu.platform.comjni.bikenavi;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class JNIGuidanceControl {
    public native byte[] GetProtobufResult(long j8, int i8);

    public native int SearchRoutePlan(long j8, String str);

    public native int calcRoute(long j8, int i8, int i9, int i10, int i11, byte[] bArr, int i12, String str);

    public native int calcRouteForRouteBook(long j8, int i8, int i9, byte[] bArr);

    public native boolean cancelCalcRoute(long j8);

    public native boolean changePDRStrategyConfig(long j8, Bundle bundle);

    public native void changeWalkDirectionStrategyConfig(long j8, Bundle bundle);

    public native boolean checkPointNearbyRoute(long j8, double d8, double d9, int i8);

    public native void clearMapRender(long j8);

    public native void enterFreeStatus(long j8);

    public native void exchangeKeyForCarNavi(long j8, String str, String str2);

    public native boolean getAllNaviNodes(long j8, Bundle bundle);

    public native boolean getCarPoint(long j8, int[] iArr, int[] iArr2);

    public native boolean getCarPointMC(long j8, int[] iArr, int[] iArr2);

    public native void getConnectedPois(long j8, Bundle bundle);

    public native float getCurCorrectDirection(long j8);

    public native byte[] getCurPanoImage(long j8);

    public native boolean getCurPanoramaRoute(long j8, int i8, int i9, int i10, int i11, Bundle bundle);

    public native boolean getCurViaPoiPanoImage(long j8, Bundle bundle);

    public native void getFacePoiInfo(long j8, Bundle bundle);

    public native boolean getFirstParagraph(long j8, Bundle bundle);

    public native boolean getGPSMatchResult(long j8, Bundle bundle);

    public native boolean getGuideParagraph(long j8, int i8, int i9, Bundle bundle);

    public native void getIndoorAllPoi(long j8, Bundle bundle);

    public native void getLastLocationRouteInfo(long j8, Bundle bundle);

    public native boolean getLeftNaviRouteBound(long j8, Bundle bundle);

    public native Bundle[] getLightInfos(long j8);

    public native boolean getMapGraphItems(long j8, Bundle bundle);

    public native void getMatchRouteInfo(long j8, Bundle bundle);

    public native int getNavId(long j8);

    public native boolean getNaviRouteBoundWithNoMargin(long j8, Bundle bundle);

    public native boolean getNormalWalkSignDes(long j8, Bundle bundle, Bundle bundle2);

    public native boolean getPDRUsingStatusInTurningCorner(long j8);

    public native boolean getParagraphBound(long j8, int i8, Bundle bundle);

    public native void getPois(long j8, Bundle bundle);

    public native int getRealTimeInfo(long j8, Bundle bundle);

    public native byte[] getRouteDataBuffer(long j8);

    public native boolean getRouteIDInfo(long j8, Bundle bundle);

    public native boolean getRouteInfoItemPano(long j8, int i8, Bundle bundle);

    public native boolean getRouteResult(long j8, int i8, Bundle bundle);

    public native Bundle[] getRouteSegments(long j8);

    public native boolean getSimpleMapInfo(long j8, Bundle bundle);

    public native boolean getTrafficFacilities(long j8, Bundle bundle);

    public native boolean getTravelData(long j8, Bundle bundle);

    public native String getUploadParamBundle(long j8);

    public native boolean getViaNaviNodes(long j8, Bundle bundle);

    public native String getWalkCountData(long j8);

    public native void handleSingleTap(long j8, double d8, double d9, int i8);

    public native boolean isBrowseStatus(long j8);

    public native boolean isEngineIndoorNaviDefine(long j8);

    public native void leaveFreeStatus(long j8);

    public native void needShowPoiPanoImage(long j8, boolean z7);

    public native void pauseReRouteCalcRoute(long j8);

    public native boolean pauseRouteGuide(long j8);

    public native boolean playSound(long j8, String str);

    public native boolean prepareRouteGuide(long j8);

    public native void registerGetLaunchSystemTime(long j8);

    public native boolean removeRoute(long j8);

    public native void resumeReRouteCalcRoute(long j8);

    public native boolean resumeRouteGuide(long j8);

    public native boolean setARRouteResID(long j8, int i8, int i9);

    public native void setAvageSpeed(long j8, float f8);

    public native boolean setBrowseStatus(long j8, boolean z7);

    public native void setGPSDriftModeStatus(long j8, boolean z7);

    public native boolean setGpsTrackFile(long j8, String str);

    public native boolean setGuidanceSpeed(long j8, int i8);

    public native void setGuideTextMaxWordCnt(long j8, int i8);

    public native void setInitalGPS(long j8, double[] dArr, double[] dArr2, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2);

    public native boolean setLocateMode(long j8, int i8);

    public native void setMaterialConfigJson(long j8, String str);

    public native boolean setNaviMode(long j8, int i8);

    public native boolean setNaviNodes(long j8, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4);

    public native boolean setNaviScene(long j8, int i8);

    public native void setNaviSettings(long j8, Bundle bundle);

    public native boolean setNaviType(long j8, int i8);

    public native boolean setNetStatistics(long j8, String str);

    public native boolean setOperateStatus(long j8, int i8);

    public native boolean setOriNaviOverlooking(long j8, int i8);

    public native void setPDRModeStatus(long j8, boolean z7);

    public native void setPDRTurningCornerModeStatus(long j8, boolean z7);

    public native void setParagraphFocus(long j8, int i8);

    public native void setPhoneConfig(long j8, Bundle bundle);

    public native boolean setRotateMode(long j8, int i8);

    public native boolean setShowLight(long j8, boolean z7);

    public native void setTrackRecordValid(long j8, boolean z7);

    public native boolean setUserMapScale(long j8, int i8);

    public native void setVdJsonString(long j8, String str);

    public native boolean setVehiclePos(long j8, int i8, int i9, int i10, String str, String str2);

    public native boolean setViewAllStatus(long j8, boolean z7);

    public native void setYawByHMMStatus(long j8, boolean z7);

    public native void setYawConfigJson(long j8, String str);

    public native void showArLayerInVPS(long j8, boolean z7);

    public native void showFloor(long j8, String str, String str2);

    public native void showNPCModel(long j8, boolean z7);

    public native boolean startRouteGuide(long j8);

    public native boolean startWalkRecord(long j8, String str);

    public native boolean stopRouteGuide(long j8);

    public native boolean stopWalkRecord(long j8);

    public native void supportIndoorNavi(long j8, boolean z7);

    public native boolean triggerGPSDataChange(long j8, double d8, double d9, float f8, float f9, float f10, float f11, String str, String str2, int i8, int i9, int i10, int i11, int i12, float f12);

    public native boolean triggerNetStatusChange(long j8, int i8);

    public native boolean triggerPDRDataChange(long j8, double d8, double d9, float f8, float f9, float f10, float f11, String str, String str2, int i8, int i9, int i10, int i11, int i12, float f12);

    public native void triggerSensorVerification(long j8, boolean z7);

    public native void updateConfig(long j8, boolean z7);

    public native void updateSensor(long j8, double d8, double d9, double d10, double d11, double d12, double d13);

    public native int uploadOperationIntegral(long j8, long j9, int i8, String str, Bundle bundle);
}
