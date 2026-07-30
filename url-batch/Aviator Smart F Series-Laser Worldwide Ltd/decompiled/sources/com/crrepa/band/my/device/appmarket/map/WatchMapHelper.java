package com.crrepa.band.my.device.appmarket.map;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import cn.hutool.core.text.l;
import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.ISVGLicenseListener;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.SVGLicenseManager;
import com.baidu.mapapi.SVGLicenseOption;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiDetailResult;
import com.baidu.mapapi.search.poi.PoiDetailSearchResult;
import com.baidu.mapapi.search.poi.PoiIndoorResult;
import com.baidu.mapapi.search.poi.PoiNearbySearchOption;
import com.baidu.mapapi.search.poi.PoiResult;
import com.baidu.mapapi.search.poi.PoiSearch;
import com.baidu.mapapi.search.route.BikingRoutePlanOption;
import com.baidu.mapapi.search.route.BikingRouteResult;
import com.baidu.mapapi.search.route.DrivingRouteResult;
import com.baidu.mapapi.search.route.IndoorRouteResult;
import com.baidu.mapapi.search.route.IntegralRouteResult;
import com.baidu.mapapi.search.route.MassTransitRouteResult;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapapi.search.route.RoutePlanSearch;
import com.baidu.mapapi.search.route.TransitRoutePlanOption;
import com.baidu.mapapi.search.route.TransitRouteResult;
import com.baidu.mapapi.search.route.WalkingRoutePlanOption;
import com.baidu.mapapi.search.route.WalkingRouteResult;
import com.baidu.mapapi.search.sug.OnGetSuggestionResultListener;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.baidu.mapapi.search.sug.SuggestionSearch;
import com.baidu.mapapi.search.sug.SuggestionSearchOption;
import com.baidu.mapapi.search.svg.OnGetSVGTileBatchSearchResultListener;
import com.baidu.mapapi.search.svg.OnGetSVGTileSearchResultListener;
import com.baidu.mapapi.search.svg.SVGTileResult;
import com.baidu.mapapi.search.svg.SVGTileSearch;
import com.baidu.mapapi.search.svg.SVGTileSearchOption;
import com.baidu.mapapi.walknavi.WalkNavigateHelper;
import com.baidu.mapapi.walknavi.adapter.IWEngineInitListener;
import com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener;
import com.baidu.mapapi.walknavi.adapter.IWRoutePlanListener;
import com.baidu.mapapi.walknavi.model.IWRouteIconInfo;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.mapapi.walknavi.model.WalkNaviLocationResult;
import com.baidu.mapapi.walknavi.model.WalkRoutePlanError;
import com.baidu.mapapi.walknavi.model.WalkRouteResult;
import com.baidu.mapapi.walknavi.model.WalkSimpleMapInfo;
import com.baidu.mapapi.walknavi.params.WalkNaviLaunchParam;
import com.baidu.mapapi.walknavi.params.WalkRouteNodeInfo;
import com.crrepa.band.my.training.RequestLocationActivity;
import com.crrepa.ble.spp.hisilicon.CRPHisiliconSPPManager;
import com.crrepa.ble.spp.hisilicon.CRPSPPConnectChangeListener;
import com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener;
import com.crrepa.ble.spp.hisilicon.receive.map.CRPMapManager;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestCyclingRouteInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestLicenseInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestNavigationInitInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestPoiInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestPoiSugInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestReverseGeoCodeInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestSVGInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestTransitRouteInfo;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestWalkingRouteInfo;
import com.crrepa.ble.spp.hisilicon.write.HisiliconFileType;
import com.crrepa.ble.spp.hisilicon.write.map.CRPMapMessageBuilder;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPLicenseResultInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPLocationInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPNatigationMessageInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPNavigationLocationInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRemainDistanceUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRemainRouteUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRemainTimeUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRoadGuideTextUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRouteFarAwayInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPRouteGuideIconUpdateInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.LocationBean;
import com.crrepa.ble.spp.hisilicon.write.map.bean.NavigationMessageType;
import com.google.android.exoplayer2.C;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.observers.BlockingBaseObserver;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class WatchMapHelper {
    private static boolean startConnect = false;
    private final com.crrepa.band.my.device.appmarket.map.b asrHelper;
    private i engineInitListener;
    private final GeoCoder geoCoder;
    private final OnGetGeoCoderResultListener geoCoderResultListener;
    private long lastRequestGeoTime;
    private final BDAbstractLocationListener locationListener;
    private final com.crrepa.band.my.device.appmarket.map.c locationProvider;
    private int navigationType;
    private final PoiSearch poiSearch;
    private final OnGetPoiSearchResultListener poiSearchResultListener;
    private boolean requestLocation;
    private final OnGetRoutePlanResultListener routePlanResultListener;
    private final RoutePlanSearch routePlanSearch;
    private final OnGetSuggestionResultListener suggestionResultListener;
    private final SuggestionSearch suggestionSearch;
    private final WalkNavigateHelper walkNavigateHelper;

    class a implements CRPSPPConnectChangeListener {

        /* renamed from: com.crrepa.band.my.device.appmarket.map.WatchMapHelper$a$a, reason: collision with other inner class name */
        class C0163a implements CRPMapChangeListener {

            /* renamed from: com.crrepa.band.my.device.appmarket.map.WatchMapHelper$a$a$a, reason: collision with other inner class name */
            class C0164a extends BlockingBaseObserver {
                C0164a() {
                }

                @Override // io.reactivex.Observer
                public void onError(Throwable th) {
                }

                @Override // io.reactivex.Observer
                public void onNext(CRPRequestNavigationInitInfo cRPRequestNavigationInitInfo) {
                    WatchMapHelper.this.startNavigation(cRPRequestNavigationInitInfo);
                }
            }

            C0163a() {
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onActivateRecording() {
                com.orhanobut.logger.f.d("WatchMapHelper onActivateRecording");
                WatchMapHelper.this.asrHelper.start();
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestLicense(CRPRequestLicenseInfo cRPRequestLicenseInfo) {
                WatchMapHelper.this.loadSVGLicense(cRPRequestLicenseInfo);
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestLocation(boolean z7) {
                com.orhanobut.logger.f.d("WatchMapHelper: " + z7);
                WatchMapHelper.this.requestLocation = z7;
                CRPHisiliconSPPManager.getInstance().reset();
                if (z7) {
                    WatchMapHelper.this.requestBackgroundLocation();
                    WatchMapHelper.this.startLocation();
                } else {
                    WatchMapHelper.this.stopLocation();
                    WatchMapHelper.this.stopNavigation(false);
                }
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestNavigationEnd() {
                com.orhanobut.logger.f.d("onRequestNavigationEnd");
                WatchMapHelper.this.sendNavigationMessage(NavigationMessageType.NAVIGATION_EXIT);
                WatchMapHelper.this.stopNavigation(true);
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestNavigationInit(CRPRequestNavigationInitInfo cRPRequestNavigationInitInfo) {
                com.orhanobut.logger.f.d("onRequestNaviInit: " + cRPRequestNavigationInitInfo);
                Observable.just(cRPRequestNavigationInitInfo).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0164a());
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestPoi(CRPRequestPoiInfo cRPRequestPoiInfo) {
                com.orhanobut.logger.f.d("onRequestPOI: " + cRPRequestPoiInfo);
                WatchMapHelper.this.stopLocation();
                WatchMapHelper.this.poiSearch.searchNearby(new PoiNearbySearchOption().location(new LatLng(cRPRequestPoiInfo.getLocation().getLatitude(), cRPRequestPoiInfo.getLocation().getLongitude())).radius(cRPRequestPoiInfo.getRadius()).keyword(cRPRequestPoiInfo.getKeywords()));
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestRegeocode(CRPRequestReverseGeoCodeInfo cRPRequestReverseGeoCodeInfo) {
                com.orhanobut.logger.f.d("onRequestRegeocode lastRequestGeoTime: " + WatchMapHelper.this.lastRequestGeoTime);
                if (System.currentTimeMillis() - WatchMapHelper.this.lastRequestGeoTime < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                    com.orhanobut.logger.f.d("onRequestRegeocode: too soon");
                    return;
                }
                com.orhanobut.logger.f.d("onRequestRegeocode: " + cRPRequestReverseGeoCodeInfo);
                WatchMapHelper.this.lastRequestGeoTime = System.currentTimeMillis();
                WatchMapHelper.this.geoCoder.reverseGeoCode(new ReverseGeoCodeOption().location(new LatLng(cRPRequestReverseGeoCodeInfo.getLocation().getLatitude(), cRPRequestReverseGeoCodeInfo.getLocation().getLongitude())).newVersion(cRPRequestReverseGeoCodeInfo.isIsLatestAdmin() ? 1 : 0).radius(cRPRequestReverseGeoCodeInfo.getRadius()).pageNum(cRPRequestReverseGeoCodeInfo.getPageNum()).pageSize(cRPRequestReverseGeoCodeInfo.getPageSize()));
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestRouteCycling(CRPRequestCyclingRouteInfo cRPRequestCyclingRouteInfo) {
                CRPRequestCyclingRouteInfo.FromBean from = cRPRequestCyclingRouteInfo.getFrom();
                CRPRequestCyclingRouteInfo.ToBean to = cRPRequestCyclingRouteInfo.getTo();
                if (from == null || to == null) {
                    return;
                }
                PlanNode withLocation = PlanNode.withLocation(new LatLng(from.getPt().getLatitude(), from.getPt().getLongitude()));
                WatchMapHelper.this.routePlanSearch.bikingSearch(new BikingRoutePlanOption().from(withLocation).to(PlanNode.withLocation(new LatLng(to.getPt().getLatitude(), to.getPt().getLongitude()))).ridingType(cRPRequestCyclingRouteInfo.getRidingType()));
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestRouteTransit(CRPRequestTransitRouteInfo cRPRequestTransitRouteInfo) {
                CRPRequestTransitRouteInfo.FromBean from = cRPRequestTransitRouteInfo.getFrom();
                CRPRequestTransitRouteInfo.ToBean to = cRPRequestTransitRouteInfo.getTo();
                if (from == null || to == null) {
                    return;
                }
                PlanNode withLocation = PlanNode.withLocation(new LatLng(from.getPt().getLatitude(), from.getPt().getLongitude()));
                WatchMapHelper.this.routePlanSearch.transitSearch(new TransitRoutePlanOption().from(withLocation).to(PlanNode.withLocation(new LatLng(to.getPt().getLatitude(), to.getPt().getLongitude()))).city(cRPRequestTransitRouteInfo.getCity()).policy(TransitRoutePlanOption.TransitPolicy.EBUS_TIME_FIRST));
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestRouteWalking(CRPRequestWalkingRouteInfo cRPRequestWalkingRouteInfo) {
                com.orhanobut.logger.f.d("onRequestRouteWalking: " + cRPRequestWalkingRouteInfo);
                CRPRequestWalkingRouteInfo.FromBean from = cRPRequestWalkingRouteInfo.getFrom();
                CRPRequestWalkingRouteInfo.ToBean to = cRPRequestWalkingRouteInfo.getTo();
                if (from == null || to == null) {
                    return;
                }
                WatchMapHelper.this.routePlanSearch.walkingSearch(new WalkingRoutePlanOption().from(PlanNode.withLocation(new LatLng(from.getPt().getLatitude(), from.getPt().getLongitude()))).to(PlanNode.withLocation(new LatLng(to.getPt().getLatitude(), to.getPt().getLongitude()))));
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestSug(CRPRequestPoiSugInfo cRPRequestPoiSugInfo) {
                com.orhanobut.logger.f.d("onRequestPoiSug: " + cRPRequestPoiSugInfo);
                SuggestionSearchOption keyword = new SuggestionSearchOption().city(cRPRequestPoiSugInfo.getCityname()).keyword(cRPRequestPoiSugInfo.getKeyword());
                CRPRequestPoiSugInfo.LocationBean location = cRPRequestPoiSugInfo.getLocation();
                if (location != null) {
                    keyword.location(new LatLng(location.getLatitude(), location.getLongitude()));
                }
                com.orhanobut.logger.f.d("suggestionSearch requestSuggestion: " + WatchMapHelper.this.suggestionSearch.requestSuggestion(keyword));
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onRequestSvg(CRPRequestSVGInfo cRPRequestSVGInfo) {
                com.orhanobut.logger.f.d("onRequestSvg: " + cRPRequestSVGInfo);
                WatchMapHelper.this.startLocation();
                SVGTileSearchOption sVGTileSearchOption = new SVGTileSearchOption();
                sVGTileSearchOption.akCipher(cRPRequestSVGInfo.getAk());
                sVGTileSearchOption.deviceIDCipher(cRPRequestSVGInfo.getDevice_id());
                sVGTileSearchOption.coordCipher("1");
                sVGTileSearchOption.sign(cRPRequestSVGInfo.getSign());
                sVGTileSearchOption.time(cRPRequestSVGInfo.getTime());
                CRPRequestSVGInfo.CoordBean coordBean = cRPRequestSVGInfo.getCoordBean();
                sVGTileSearchOption.x(coordBean.getX());
                sVGTileSearchOption.y(coordBean.getY());
                sVGTileSearchOption.z(coordBean.getZ());
                SVGTileSearch newInstance = SVGTileSearch.newInstance();
                if (TextUtils.equals(cRPRequestSVGInfo.getRequest(), "1")) {
                    WatchMapHelper.this.requestSVGTile(newInstance, sVGTileSearchOption);
                } else {
                    WatchMapHelper.this.searchBatchSVGTiles(newInstance, sVGTileSearchOption);
                }
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onStartRecording(byte[] bArr) {
                com.orhanobut.logger.f.d("WatchMapHelper onStartRecording：" + Arrays.toString(bArr));
                WatchMapHelper.this.asrHelper.recording(bArr);
            }

            @Override // com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener
            public void onStopRecording() {
                com.orhanobut.logger.f.d("WatchMapHelper onStopRecording");
                WatchMapHelper.this.asrHelper.stop();
            }
        }

        a() {
        }

        @Override // com.crrepa.ble.spp.hisilicon.CRPSPPConnectChangeListener
        public void onConnectionStateChanged(int i8) {
            com.orhanobut.logger.f.d("SPP onConnectionStateChanged: " + i8);
            if (2 == i8) {
                CRPMapManager.getInstance().setMapChangeListener(new C0163a());
            } else if (i8 == 0) {
                WatchMapHelper.this.stopLocation();
            }
        }
    }

    class b implements OnGetSVGTileBatchSearchResultListener {
        b() {
        }

        @Override // com.baidu.mapapi.search.svg.OnGetSVGTileBatchSearchResultListener
        public void onGetBatchSVGTilesResult(SVGTileResult sVGTileResult) {
            File[] listFiles;
            String tileZipPath = sVGTileResult.getTileZipPath();
            com.orhanobut.logger.f.d("svgTileSearch getBatchTileZipPath: " + tileZipPath);
            if (TextUtils.isEmpty(tileZipPath)) {
                com.crrepa.band.my.device.appmarket.map.e.ping("www.baidu.com");
                return;
            }
            com.orhanobut.logger.f.d("svgTileSearch file size: " + new File(tileZipPath).exists());
            String substring = tileZipPath.substring(0, tileZipPath.length() + (-4));
            k.unzip(tileZipPath, substring);
            File file = new File(substring);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                com.orhanobut.logger.f.d("svgTileSearch file count: " + listFiles.length);
                for (File file2 : listFiles) {
                    com.orhanobut.logger.f.d("svgTileSearch file name: " + file2.getName());
                    WatchMapHelper.this.sendSVG(file2);
                }
            }
        }
    }

    class c implements ISVGLicenseListener {
        c() {
        }

        @Override // com.baidu.mapapi.ISVGLicenseListener
        public void auth(int i8, int i9) {
            com.orhanobut.logger.f.d("license auth: " + i8 + l.SPACE + i9);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendLicenseResultCmd(new CRPLicenseResultInfo(i9)));
        }
    }

    class d extends BDAbstractLocationListener {
        d() {
        }

        @Override // com.baidu.location.BDAbstractLocationListener
        public void onReceiveLocation(BDLocation bDLocation) {
            com.orhanobut.logger.f.d("onReceiveLocation: " + bDLocation.toString());
            com.orhanobut.logger.f.d("onReceiveLocation LocationID: " + bDLocation.getLocationID());
            com.orhanobut.logger.f.d("onReceiveLocation CoorType: " + bDLocation.getCoorType());
            if (bDLocation.getLatitude() < 1.0d || bDLocation.getLongitude() < 1.0d) {
                return;
            }
            CRPLocationInfo cRPLocationInfo = new CRPLocationInfo();
            cRPLocationInfo.setError_code(0);
            CRPLocationInfo.Result result = new CRPLocationInfo.Result();
            result.setLatitude(bDLocation.getLatitude());
            result.setLongitude(bDLocation.getLongitude());
            result.setCoord_type(2);
            result.setSpeed(bDLocation.getSpeed());
            result.setDirection((int) bDLocation.getDirection());
            result.setTime(bDLocation.getTime());
            cRPLocationInfo.setResult(result);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendLocationCmd(cRPLocationInfo));
        }
    }

    class e implements OnGetGeoCoderResultListener {
        e() {
        }

        @Override // com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener
        public void onGetGeoCodeResult(GeoCodeResult geoCodeResult) {
            com.orhanobut.logger.f.d("onGetGeoCodeResult: " + geoCodeResult);
        }

        @Override // com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener
        public void onGetReverseGeoCodeResult(ReverseGeoCodeResult reverseGeoCodeResult) {
            com.orhanobut.logger.f.d("onGetReverseGeoCodeResult: " + reverseGeoCodeResult);
            CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.d.save(com.moyoung.dafit.module.common.utils.d.get(), s.bean2Json(com.crrepa.band.my.device.appmarket.map.g.build(reverseGeoCodeResult)), com.crrepa.band.my.device.appmarket.map.d.REGEOCODE_SEARCH_FILE_NAME), HisiliconFileType.RE_GEO_CODE);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendReverseGeoCodeCmd());
        }
    }

    class f implements OnGetSuggestionResultListener {
        f() {
        }

        @Override // com.baidu.mapapi.search.sug.OnGetSuggestionResultListener
        public void onGetSuggestionResult(SuggestionResult suggestionResult) {
            com.orhanobut.logger.f.d("onGetPoiSuggestionResult: " + suggestionResult.getAllSuggestions());
            CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.d.save(com.moyoung.dafit.module.common.utils.d.get(), s.bean2Json(com.crrepa.band.my.device.appmarket.map.i.build(suggestionResult)), com.crrepa.band.my.device.appmarket.map.d.POI_SUGGESTION_FILE_NAME), HisiliconFileType.POI_SUGGESTION);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendPoiSuggestionCmd());
        }
    }

    class g implements OnGetPoiSearchResultListener {
        g() {
        }

        @Override // com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener
        public void onGetPoiDetailResult(PoiDetailResult poiDetailResult) {
            com.orhanobut.logger.f.d("onGetPoiDetailResult: " + poiDetailResult);
        }

        @Override // com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener
        public void onGetPoiIndoorResult(PoiIndoorResult poiIndoorResult) {
            com.orhanobut.logger.f.d("onGetPoiIndoorResult: " + poiIndoorResult);
        }

        @Override // com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener
        public void onGetPoiResult(PoiResult poiResult) {
            com.orhanobut.logger.f.d("onGetPoiResult: " + s.bean2Json(poiResult));
            CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.d.save(com.moyoung.dafit.module.common.utils.d.get(), s.bean2Json(com.crrepa.band.my.device.appmarket.map.f.build(poiResult)), com.crrepa.band.my.device.appmarket.map.d.POI_FILE_NAME), HisiliconFileType.POI);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendPoiCmd());
        }

        @Override // com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener
        public void onGetPoiDetailResult(PoiDetailSearchResult poiDetailSearchResult) {
            com.orhanobut.logger.f.d("onGetPoiDetailResult: " + poiDetailSearchResult);
        }
    }

    class h implements OnGetRoutePlanResultListener {
        h() {
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetBikingRouteResult(BikingRouteResult bikingRouteResult) {
            com.orhanobut.logger.f.d("onGetBikingRouteResult: " + bikingRouteResult);
            CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.h.build(com.moyoung.dafit.module.common.utils.d.get(), bikingRouteResult), HisiliconFileType.ROUTE);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendCyclingRouteCmd());
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetDrivingRouteResult(DrivingRouteResult drivingRouteResult) {
            com.orhanobut.logger.f.d("onGetDrivingRouteResult: " + drivingRouteResult);
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetIndoorRouteResult(IndoorRouteResult indoorRouteResult) {
            com.orhanobut.logger.f.d("onGetIndoorRouteResult: " + indoorRouteResult);
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetIntegralRouteResult(IntegralRouteResult integralRouteResult) {
            com.orhanobut.logger.f.d("onGetIntegralRouteResult: " + integralRouteResult);
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetMassTransitRouteResult(MassTransitRouteResult massTransitRouteResult) {
            com.orhanobut.logger.f.d("onGetMassTransitRouteResult: " + massTransitRouteResult);
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetTransitRouteResult(TransitRouteResult transitRouteResult) {
            com.orhanobut.logger.f.d("onGetTransitRouteResult: " + transitRouteResult);
            CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.h.build(com.moyoung.dafit.module.common.utils.d.get(), transitRouteResult), HisiliconFileType.ROUTE);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendTransitRouteCmd());
        }

        @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
        public void onGetWalkingRouteResult(WalkingRouteResult walkingRouteResult) {
            com.orhanobut.logger.f.d("onGetWalkingRouteResult: " + s.bean2Json(walkingRouteResult));
            CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.h.build(com.moyoung.dafit.module.common.utils.d.get(), walkingRouteResult), HisiliconFileType.ROUTE);
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendWalkingRouteCmd());
        }
    }

    private class i implements IWEngineInitListener {
        private CRPRequestNavigationInitInfo info;

        class a implements IWRoutePlanListener {

            /* renamed from: com.crrepa.band.my.device.appmarket.map.WatchMapHelper$i$a$a, reason: collision with other inner class name */
            class C0165a implements IWRouteGuidanceListener {
                C0165a() {
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onArriveDest() {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onArriveDest");
                    WatchMapHelper.this.sendNavigationMessage(NavigationMessageType.NAVIGATION_DESTINATION_ARRIVED);
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onFinalEnd(Message message) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onFinalEnd: " + message);
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onGpsStatusChange(CharSequence charSequence, Drawable drawable) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onGpsStatusChange: " + ((Object) charSequence));
                    CRPNavigationLocationInfo cRPNavigationLocationInfo = new CRPNavigationLocationInfo();
                    cRPNavigationLocationInfo.setMsg_type(NavigationMessageType.NAVIGATION_USER_POSITION.getCode());
                    cRPNavigationLocationInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendNavigationLocationCmd(cRPNavigationLocationInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onIndoorEnd(Message message) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onIndoorEnd: " + message);
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onNaviLocationUpdate() {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onNaviLocationUpdate");
                    WalkNaviLocationResult walkNaviLocationInfo = WatchMapHelper.this.walkNavigateHelper.getWalkNaviLocationInfo();
                    CRPNavigationLocationInfo cRPNavigationLocationInfo = new CRPNavigationLocationInfo();
                    cRPNavigationLocationInfo.setMsg_type(NavigationMessageType.NAVIGATION_USER_POSITION.getCode());
                    cRPNavigationLocationInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPNavigationLocationInfo.setLink_id(walkNaviLocationInfo.getCurRouteShapeIdx());
                    cRPNavigationLocationInfo.setDirection(walkNaviLocationInfo.getPostDirection());
                    cRPNavigationLocationInfo.setLocation(new LocationBean(walkNaviLocationInfo.getPostLatitude(), walkNaviLocationInfo.getPostLongitude()));
                    cRPNavigationLocationInfo.setOrigin_location(new LocationBean(walkNaviLocationInfo.getGpsLatitude(), walkNaviLocationInfo.getGpsLongitude()));
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendNavigationLocationCmd(cRPNavigationLocationInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onReRouteComplete() {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onReRouteComplete");
                    WatchMapHelper.this.sendWalkRoute(NavigationMessageType.NAVIGATION_YAW_ROUTE_CALCULATION_SUCCESS.getCode());
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRemainDistanceUpdate(int i8) {
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRemainTimeUpdate(int i8) {
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRoadGuideTextUpdate(CharSequence charSequence, CharSequence charSequence2) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRoadGuideTextUpdate: " + ((Object) charSequence) + l.SPACE + ((Object) charSequence2));
                    CRPRoadGuideTextUpdateInfo cRPRoadGuideTextUpdateInfo = new CRPRoadGuideTextUpdateInfo();
                    cRPRoadGuideTextUpdateInfo.setMsg_type(NavigationMessageType.NAVIGATION_GUIDANCE_INFO.getCode());
                    cRPRoadGuideTextUpdateInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPRoadGuideTextUpdateInfo.setGuide_info(((Object) charSequence) + l.SPACE + ((Object) charSequence2));
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendRoadGuideTextUpdateCmd(cRPRoadGuideTextUpdateInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRouteFarAway(CharSequence charSequence, Drawable drawable) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRouteFarAway: " + ((Object) charSequence));
                    if (charSequence == null) {
                        return;
                    }
                    CRPRouteFarAwayInfo cRPRouteFarAwayInfo = new CRPRouteFarAwayInfo();
                    cRPRouteFarAwayInfo.setMsg_type(NavigationMessageType.NAVIGATION_YAW_START.getCode());
                    cRPRouteFarAwayInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPRouteFarAwayInfo.setYawing_msg(charSequence.toString());
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendRouteFarAwayCmd(cRPRouteFarAwayInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRouteGuideIconInfoUpdate(IWRouteIconInfo iWRouteIconInfo) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRouteGuideIconInfoUpdate: " + iWRouteIconInfo.getIconName());
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRouteGuideIconUpdate(Drawable drawable) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRouteGuideIconUpdate: " + drawable);
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRouteGuideKind(RouteGuideKind routeGuideKind) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRouteGuideKind: " + routeGuideKind.name());
                    CRPRouteGuideIconUpdateInfo cRPRouteGuideIconUpdateInfo = new CRPRouteGuideIconUpdateInfo();
                    cRPRouteGuideIconUpdateInfo.setMsg_type(NavigationMessageType.NAVIGATION_GUIDANCE_IMAGE.getCode());
                    cRPRouteGuideIconUpdateInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPRouteGuideIconUpdateInfo.setGuide_icon(routeGuideKind.ordinal());
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendRouteGuideIconUpdateCmd(cRPRouteGuideIconUpdateInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRoutePlanYawing(CharSequence charSequence, Drawable drawable) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRouteFarAway: " + ((Object) charSequence));
                    if (charSequence == null) {
                        return;
                    }
                    CRPRouteFarAwayInfo cRPRouteFarAwayInfo = new CRPRouteFarAwayInfo();
                    cRPRouteFarAwayInfo.setMsg_type(NavigationMessageType.NAVIGATION_YAW_ROUTE_CALCULATION.getCode());
                    cRPRouteFarAwayInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPRouteFarAwayInfo.setYawing_msg(charSequence.toString());
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendRouteFarAwayCmd(cRPRouteFarAwayInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onSimpleMapInfoUpdate(WalkSimpleMapInfo walkSimpleMapInfo) {
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onVibrate() {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onVibrate");
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRemainDistanceUpdate(CharSequence charSequence) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRemainDistanceUpdate: " + ((Object) charSequence));
                    if (charSequence == null) {
                        return;
                    }
                    CRPRemainDistanceUpdateInfo cRPRemainDistanceUpdateInfo = new CRPRemainDistanceUpdateInfo();
                    cRPRemainDistanceUpdateInfo.setMsg_type(NavigationMessageType.NAVIGATION_REMAINING_DISTANCE.getCode());
                    cRPRemainDistanceUpdateInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPRemainDistanceUpdateInfo.setRemain_distance(charSequence.toString());
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendRemainDistanceUpdateCmd(cRPRemainDistanceUpdateInfo));
                }

                @Override // com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener
                public void onRemainTimeUpdate(CharSequence charSequence) {
                    com.orhanobut.logger.f.d("IWRouteGuidanceListener onRemainTimeUpdate: " + ((Object) charSequence));
                    if (charSequence == null) {
                        return;
                    }
                    CRPRemainTimeUpdateInfo cRPRemainTimeUpdateInfo = new CRPRemainTimeUpdateInfo();
                    cRPRemainTimeUpdateInfo.setMsg_type(NavigationMessageType.NAVIGATION_REMAINING_TIME.getCode());
                    cRPRemainTimeUpdateInfo.setNavi_type(WatchMapHelper.this.navigationType);
                    cRPRemainTimeUpdateInfo.setRemain_time(charSequence.toString());
                    WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendRemainTimeUpdateCmd(cRPRemainTimeUpdateInfo));
                }
            }

            a() {
            }

            @Override // com.baidu.mapapi.walknavi.adapter.IWRoutePlanListener
            public void onRoutePlanFail(WalkRoutePlanError walkRoutePlanError) {
                com.orhanobut.logger.f.d("onRoutePlanFail: " + walkRoutePlanError);
                WatchMapHelper.this.sendNavigationMessage(NavigationMessageType.NAVIGATION_ROUTE_CALCULATION_FAILURE);
            }

            @Override // com.baidu.mapapi.walknavi.adapter.IWRoutePlanListener
            public void onRoutePlanStart() {
                com.orhanobut.logger.f.d("onRoutePlanStart");
                WatchMapHelper.this.sendNavigationMessage(NavigationMessageType.NAVIGATION_ROUTE_CALCULATION_START);
            }

            @Override // com.baidu.mapapi.walknavi.adapter.IWRoutePlanListener
            public void onRoutePlanSuccess() {
                com.orhanobut.logger.f.d("onRoutePlanSuccess");
                WatchMapHelper.this.sendNavigationMessage(NavigationMessageType.NAVIGATION_ROUTE_CALCULATION_SUCCESS);
                WatchMapHelper.this.walkNavigateHelper.setRouteGuidanceListener(com.moyoung.dafit.module.common.baseui.a.getInstance().getCurrentActivity(), new C0165a());
                WatchMapHelper.this.sendNavigationMessage(NavigationMessageType.NAVIGATION_START);
                WatchMapHelper.this.walkNavigateHelper.startWalkNavi(com.moyoung.dafit.module.common.baseui.a.getInstance().getCurrentActivity());
                WatchMapHelper.this.sendWalkRoute(NavigationMessageType.NAVIGATION_ROUTE.getCode());
            }
        }

        public i(CRPRequestNavigationInitInfo cRPRequestNavigationInitInfo) {
            this.info = cRPRequestNavigationInitInfo;
        }

        @Override // com.baidu.mapapi.walknavi.adapter.IWEngineInitListener
        public void engineInitFail() {
            com.orhanobut.logger.f.d("engineInitFail");
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendNavigationInitCmd(false));
        }

        @Override // com.baidu.mapapi.walknavi.adapter.IWEngineInitListener
        public void engineInitSuccess() {
            com.orhanobut.logger.f.d("engineInitSuccess");
            WatchMapHelper.this.sendMapMessage(CRPMapMessageBuilder.sendNavigationInitCmd(true));
            CRPRequestNavigationInitInfo.FromBean from = this.info.getFrom();
            LatLng latLng = new LatLng(from.getLatitude(), from.getLongitude());
            CRPRequestNavigationInitInfo.ToBean to = this.info.getTo();
            LatLng latLng2 = new LatLng(to.getLatitude(), to.getLongitude());
            WalkRouteNodeInfo walkRouteNodeInfo = new WalkRouteNodeInfo();
            walkRouteNodeInfo.setLocation(latLng);
            WalkRouteNodeInfo walkRouteNodeInfo2 = new WalkRouteNodeInfo();
            walkRouteNodeInfo2.setLocation(latLng2);
            WalkNaviLaunchParam walkNaviLaunchParam = new WalkNaviLaunchParam();
            walkNaviLaunchParam.startNodeInfo(walkRouteNodeInfo);
            walkNaviLaunchParam.endNodeInfo(walkRouteNodeInfo2);
            WatchMapHelper.this.walkNavigateHelper.routePlanWithRouteNode(walkNaviLaunchParam, new a());
        }
    }

    private static class j {
        private static final WatchMapHelper INSTANCE = new WatchMapHelper(null);

        private j() {
        }
    }

    /* synthetic */ WatchMapHelper(a aVar) {
        this();
    }

    private void exitNavigate() {
        com.orhanobut.logger.f.d("exitNormalNavi");
        try {
            WalkNavigateHelper walkNavigateHelper = this.walkNavigateHelper;
            if (walkNavigateHelper != null) {
                walkNavigateHelper.onDestroy(false);
                this.engineInitListener = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static WatchMapHelper getInstance() {
        return j.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestSVGTile$0(SVGTileResult sVGTileResult) {
        String tilePath = sVGTileResult.getTilePath();
        com.orhanobut.logger.f.d("svgTileSearch getTilePath: " + tilePath);
        if (TextUtils.isEmpty(tilePath)) {
            com.crrepa.band.my.device.appmarket.map.e.ping("www.baidu.com");
            return;
        }
        File file = new File(tilePath);
        com.orhanobut.logger.f.d("svgTileSearch file size: " + file.exists());
        sendSVG(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSVGLicense(CRPRequestLicenseInfo cRPRequestLicenseInfo) {
        com.orhanobut.logger.f.d("loadSVGLicense");
        SVGLicenseManager sVGLicenseManager = SVGLicenseManager.getInstance();
        sVGLicenseManager.setSVGLicenseListener(new c());
        SVGLicenseOption sVGLicenseOption = new SVGLicenseOption();
        sVGLicenseOption.setAkCipher(cRPRequestLicenseInfo.getAk());
        sVGLicenseOption.setDeviceIDCipher(cRPRequestLicenseInfo.getDevice_id());
        sVGLicenseOption.setSign(cRPRequestLicenseInfo.getSign());
        sVGLicenseOption.setTime(cRPRequestLicenseInfo.getTime());
        sVGLicenseManager.loadSVGLicense(com.moyoung.dafit.module.common.utils.d.get(), sVGLicenseOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestBackgroundLocation() {
        Activity currentActivity = com.moyoung.dafit.module.common.baseui.a.getInstance().getCurrentActivity();
        if (currentActivity == null || 29 > Build.VERSION.SDK_INT || c0.checkSelfPermission(currentActivity, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return;
        }
        currentActivity.startActivity(RequestLocationActivity.getCallingIntent(currentActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestSVGTile(SVGTileSearch sVGTileSearch, SVGTileSearchOption sVGTileSearchOption) {
        sVGTileSearch.setOnGetSVGTileSearchResultListener(new OnGetSVGTileSearchResultListener() { // from class: com.crrepa.band.my.device.appmarket.map.j
            @Override // com.baidu.mapapi.search.svg.OnGetSVGTileSearchResultListener
            public final void onGetSVGTileResult(SVGTileResult sVGTileResult) {
                WatchMapHelper.this.lambda$requestSVGTile$0(sVGTileResult);
            }
        });
        sVGTileSearch.requestSVGTile(sVGTileSearchOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void searchBatchSVGTiles(SVGTileSearch sVGTileSearch, SVGTileSearchOption sVGTileSearchOption) {
        sVGTileSearch.setOnGetSVGTileBatchSearchResultListener(new b());
        sVGTileSearch.searchBatchSVGTiles(sVGTileSearchOption, 3, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMapMessage(byte[] bArr) {
        if (this.requestLocation) {
            CRPHisiliconSPPManager.getInstance().send(bArr);
        } else {
            com.orhanobut.logger.f.d("sendMapMessage: not request location");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNavigationMessage(NavigationMessageType navigationMessageType) {
        CRPNatigationMessageInfo cRPNatigationMessageInfo = new CRPNatigationMessageInfo();
        cRPNatigationMessageInfo.setNavi_type(this.navigationType);
        cRPNatigationMessageInfo.setMsg_type(navigationMessageType.getCode());
        sendMapMessage(CRPMapMessageBuilder.sendNavigationMessageCmd(cRPNatigationMessageInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSVG(File file) {
        if (!this.requestLocation) {
            com.orhanobut.logger.f.d("sendSVG: not request location");
            return;
        }
        String[] split = file.getName().replace(".bin", "").split("_");
        CRPRequestSVGInfo.CoordBean coordBean = new CRPRequestSVGInfo.CoordBean();
        if (split.length != 3) {
            com.orhanobut.logger.f.d("sendSVG: invalid file name");
            return;
        }
        coordBean.setX(Integer.parseInt(split[0]));
        coordBean.setY(Integer.parseInt(split[1]));
        coordBean.setZ(Integer.parseInt(split[2]));
        CRPRequestSVGInfo cRPRequestSVGInfo = new CRPRequestSVGInfo();
        cRPRequestSVGInfo.setCoord(s.bean2Json(coordBean));
        CRPHisiliconSPPManager.getInstance().sendSVG(file, cRPRequestSVGInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWalkRoute(int i8) {
        WalkRouteResult walkNaviRouteInfo = this.walkNavigateHelper.getWalkNaviRouteInfo();
        if (walkNaviRouteInfo == null) {
            return;
        }
        CRPRemainRouteUpdateInfo cRPRemainRouteUpdateInfo = new CRPRemainRouteUpdateInfo();
        cRPRemainRouteUpdateInfo.setNavi_type(this.navigationType);
        cRPRemainRouteUpdateInfo.setMsg_type(i8);
        CRPRemainRouteUpdateInfo.Line line = new CRPRemainRouteUpdateInfo.Line();
        line.setDistance(walkNaviRouteInfo.getDistance());
        line.setDuration(walkNaviRouteInfo.getDuration());
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : walkNaviRouteInfo.getPositions()) {
            arrayList.add(new LocationBean(latLng.latitude, latLng.longitude));
        }
        line.setPoints(arrayList);
        cRPRemainRouteUpdateInfo.setLine(line);
        CRPHisiliconSPPManager.getInstance().send(com.crrepa.band.my.device.appmarket.map.d.save(com.moyoung.dafit.module.common.utils.d.get(), s.bean2Json(cRPRemainRouteUpdateInfo), com.crrepa.band.my.device.appmarket.map.d.REMAIN_ROUTE_FILE_NAME), HisiliconFileType.REMAIN_ROUTE);
        sendMapMessage(CRPMapMessageBuilder.sendRemainRouteCmd(i8 == NavigationMessageType.NAVIGATION_ROUTE.getCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLocation() {
        this.locationProvider.startLocation(this.locationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startNavigation(CRPRequestNavigationInitInfo cRPRequestNavigationInitInfo) {
        this.navigationType = cRPRequestNavigationInitInfo.getNavi_type();
        this.engineInitListener = new i(cRPRequestNavigationInitInfo);
        this.walkNavigateHelper.initNaviEngine(com.moyoung.dafit.module.common.utils.d.get(), this.engineInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopLocation() {
        this.locationProvider.stopLocation(this.locationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNavigation(boolean z7) {
        exitNavigate();
        if (z7) {
            startLocation();
        }
    }

    public void close() {
        com.orhanobut.logger.f.d("WatchMapHelper close");
        if (startConnect) {
            CRPHisiliconSPPManager.getInstance().disconnect();
            startConnect = false;
        }
        stopLocation();
        if (this.walkNavigateHelper.isInitEngine()) {
            exitNavigate();
        }
    }

    public void connect(String str) {
        com.orhanobut.logger.f.d("WatchMapHelper connect: " + startConnect);
        if (!com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon() || startConnect) {
            return;
        }
        startConnect = true;
        CRPHisiliconSPPManager.getInstance().connect(str, new a());
    }

    private WatchMapHelper() {
        this.asrHelper = new com.crrepa.band.my.device.appmarket.map.b();
        GeoCoder newInstance = GeoCoder.newInstance();
        this.geoCoder = newInstance;
        SuggestionSearch newInstance2 = SuggestionSearch.newInstance();
        this.suggestionSearch = newInstance2;
        PoiSearch newInstance3 = PoiSearch.newInstance();
        this.poiSearch = newInstance3;
        RoutePlanSearch newInstance4 = RoutePlanSearch.newInstance();
        this.routePlanSearch = newInstance4;
        WalkNavigateHelper walkNavigateHelper = WalkNavigateHelper.getInstance();
        this.walkNavigateHelper = walkNavigateHelper;
        this.navigationType = 0;
        this.lastRequestGeoTime = 0L;
        this.requestLocation = false;
        this.locationListener = new d();
        e eVar = new e();
        this.geoCoderResultListener = eVar;
        f fVar = new f();
        this.suggestionResultListener = fVar;
        g gVar = new g();
        this.poiSearchResultListener = gVar;
        h hVar = new h();
        this.routePlanResultListener = hVar;
        SDKInitializer.setAgreePrivacy(com.moyoung.dafit.module.common.utils.d.get(), true);
        SDKInitializer.initialize(com.moyoung.dafit.module.common.utils.d.get());
        this.locationProvider = new com.crrepa.band.my.device.appmarket.map.c(com.moyoung.dafit.module.common.utils.d.get());
        newInstance.setOnGetGeoCodeResultListener(eVar);
        newInstance2.setOnGetSuggestionResultListener(fVar);
        newInstance3.setOnGetPoiSearchResultListener(gVar);
        newInstance4.setOnGetRoutePlanResultListener(hVar);
        walkNavigateHelper.setWalkNaviDisplayOption(new WalkNaviDisplayOption().showDialogEnable(false).runInFragment(true));
    }
}
