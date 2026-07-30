package com.crrepa.ble.spp.hisilicon.receive.map;

import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestCyclingRouteInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestLicenseInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestLocationInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestNavigationInitInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestPoiInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestPoiSugInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestReverseGeoCodeInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestSVGInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestTransitRouteInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestWalkingRouteInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import com.crrepa.n.d;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class CRPMapManager {
    private CRPMapChangeListener mapChangeListener;

    private static class Holder {
        private static final CRPMapManager INSTANCE = new CRPMapManager();

        private Holder() {
        }
    }

    private CRPMapManager() {
    }

    public static CRPMapManager getInstance() {
        return Holder.INSTANCE;
    }

    private void parseRequestLicense(String str) {
        CRPRequestLicenseInfo cRPRequestLicenseInfo = (CRPRequestLicenseInfo) k.a(str, CRPRequestLicenseInfo.class);
        if (cRPRequestLicenseInfo != null) {
            this.mapChangeListener.onRequestLicense(cRPRequestLicenseInfo);
        }
    }

    private void parseRequestLocation(String str) {
        CRPRequestLocationInfo cRPRequestLocationInfo = (CRPRequestLocationInfo) k.a(str, CRPRequestLocationInfo.class);
        if (cRPRequestLocationInfo != null) {
            this.mapChangeListener.onRequestLocation(cRPRequestLocationInfo.isOn_location());
        }
    }

    private void parseRequestNavigationInit(String str) {
        CRPRequestNavigationInitInfo cRPRequestNavigationInitInfo = (CRPRequestNavigationInitInfo) k.a(str, CRPRequestNavigationInitInfo.class);
        if (cRPRequestNavigationInitInfo != null) {
            this.mapChangeListener.onRequestNavigationInit(cRPRequestNavigationInitInfo);
        }
    }

    private void parseRequestPoi(String str) {
        CRPRequestPoiInfo cRPRequestPoiInfo = (CRPRequestPoiInfo) k.a(str, CRPRequestPoiInfo.class);
        if (cRPRequestPoiInfo != null) {
            this.mapChangeListener.onRequestPoi(cRPRequestPoiInfo);
        }
    }

    private void parseRequestRegeocode(String str) {
        CRPRequestReverseGeoCodeInfo cRPRequestReverseGeoCodeInfo = (CRPRequestReverseGeoCodeInfo) k.a(str, CRPRequestReverseGeoCodeInfo.class);
        if (cRPRequestReverseGeoCodeInfo != null) {
            this.mapChangeListener.onRequestRegeocode(cRPRequestReverseGeoCodeInfo);
        }
    }

    private void parseRequestRouteCycling(String str) {
        CRPRequestCyclingRouteInfo cRPRequestCyclingRouteInfo = (CRPRequestCyclingRouteInfo) k.a(str, CRPRequestCyclingRouteInfo.class);
        if (cRPRequestCyclingRouteInfo != null) {
            this.mapChangeListener.onRequestRouteCycling(cRPRequestCyclingRouteInfo);
        }
    }

    private void parseRequestRouteTransit(String str) {
        CRPRequestTransitRouteInfo cRPRequestTransitRouteInfo = (CRPRequestTransitRouteInfo) k.a(str, CRPRequestTransitRouteInfo.class);
        if (cRPRequestTransitRouteInfo != null) {
            this.mapChangeListener.onRequestRouteTransit(cRPRequestTransitRouteInfo);
        }
    }

    private void parseRequestRouteWalking(String str) {
        CRPRequestWalkingRouteInfo cRPRequestWalkingRouteInfo = (CRPRequestWalkingRouteInfo) k.a(str, CRPRequestWalkingRouteInfo.class);
        if (cRPRequestWalkingRouteInfo != null) {
            this.mapChangeListener.onRequestRouteWalking(cRPRequestWalkingRouteInfo);
        }
    }

    private void parseRequestSug(String str) {
        CRPRequestPoiSugInfo cRPRequestPoiSugInfo = (CRPRequestPoiSugInfo) k.a(str, CRPRequestPoiSugInfo.class);
        if (cRPRequestPoiSugInfo != null) {
            this.mapChangeListener.onRequestSug(cRPRequestPoiSugInfo);
        }
    }

    private void parseRequestSvg(String str) {
        CRPRequestSVGInfo cRPRequestSVGInfo = (CRPRequestSVGInfo) k.a(str, CRPRequestSVGInfo.class);
        if (cRPRequestSVGInfo != null) {
            this.mapChangeListener.onRequestSvg(cRPRequestSVGInfo);
        }
    }

    public void parseMap(byte b8, byte[] bArr) {
        if (this.mapChangeListener == null) {
            BleLog.d("mapChangeListener is null");
        }
        String str = new String(bArr, StandardCharsets.UTF_8);
        BleLog.d("parseMap type:" + ((int) b8) + " msg:" + str);
        switch (b8) {
            case 3:
                parseRequestSvg(str);
                break;
            case 10:
                parseRequestPoi(str);
                break;
            case 14:
                parseRequestLicense(str);
                break;
            case 16:
                parseRequestLocation(str);
                break;
            case 18:
                parseRequestNavigationInit(str);
                break;
            case 50:
                parseRequestSug(str);
                break;
            case 52:
                parseRequestRouteCycling(str);
                break;
            case 54:
                parseRequestRouteWalking(str);
                break;
            case 56:
                parseRequestRouteTransit(str);
                break;
            case 60:
                parseRequestRegeocode(str);
                break;
            case 66:
                this.mapChangeListener.onRequestNavigationEnd();
                break;
        }
    }

    public void setMapChangeListener(CRPMapChangeListener cRPMapChangeListener) {
        this.mapChangeListener = cRPMapChangeListener;
        d.a().a(cRPMapChangeListener);
    }
}
