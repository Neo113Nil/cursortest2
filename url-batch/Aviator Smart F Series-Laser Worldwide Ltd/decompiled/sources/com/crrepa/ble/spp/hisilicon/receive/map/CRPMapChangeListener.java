package com.crrepa.ble.spp.hisilicon.receive.map;

import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestCyclingRouteInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestLicenseInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestNavigationInitInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestPoiInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestPoiSugInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestReverseGeoCodeInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestSVGInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestTransitRouteInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestWalkingRouteInfo;

/* loaded from: classes3.dex */
public interface CRPMapChangeListener {
    void onActivateRecording();

    void onRequestLicense(CRPRequestLicenseInfo cRPRequestLicenseInfo);

    void onRequestLocation(boolean z7);

    void onRequestNavigationEnd();

    void onRequestNavigationInit(CRPRequestNavigationInitInfo cRPRequestNavigationInitInfo);

    void onRequestPoi(CRPRequestPoiInfo cRPRequestPoiInfo);

    void onRequestRegeocode(CRPRequestReverseGeoCodeInfo cRPRequestReverseGeoCodeInfo);

    void onRequestRouteCycling(CRPRequestCyclingRouteInfo cRPRequestCyclingRouteInfo);

    void onRequestRouteTransit(CRPRequestTransitRouteInfo cRPRequestTransitRouteInfo);

    void onRequestRouteWalking(CRPRequestWalkingRouteInfo cRPRequestWalkingRouteInfo);

    void onRequestSug(CRPRequestPoiSugInfo cRPRequestPoiSugInfo);

    void onRequestSvg(CRPRequestSVGInfo cRPRequestSVGInfo);

    void onStartRecording(byte[] bArr);

    void onStopRecording();
}
