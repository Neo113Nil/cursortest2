package com.crrepa.band.my.device.appmarket.map;

import android.content.Context;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.VehicleInfo;
import com.baidu.mapapi.search.route.BikingRouteLine;
import com.baidu.mapapi.search.route.BikingRouteResult;
import com.baidu.mapapi.search.route.TransitRouteLine;
import com.baidu.mapapi.search.route.TransitRouteResult;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import com.baidu.mapapi.search.route.WalkingRouteResult;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPCylingcRouteInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPTransitRouteInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPWalkingRouteInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.Duration;
import com.crrepa.ble.spp.hisilicon.write.map.bean.LocationBean;
import com.crrepa.ble.spp.hisilicon.write.map.bean.Node;
import com.moyoung.dafit.module.common.utils.s;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h {
    private static final int MAX_ROUTE_LENGTH = 61440;

    public static File build(Context context, WalkingRouteResult walkingRouteResult) {
        CRPWalkingRouteInfo cRPWalkingRouteInfo;
        CRPWalkingRouteInfo.Result result;
        if (walkingRouteResult == null || walkingRouteResult.error != SearchResult.ERRORNO.NO_ERROR) {
            cRPWalkingRouteInfo = new CRPWalkingRouteInfo(8, null);
        } else {
            CRPWalkingRouteInfo.Result result2 = new CRPWalkingRouteInfo.Result();
            ArrayList arrayList = new ArrayList();
            List<WalkingRouteLine> routeLines = walkingRouteResult.getRouteLines();
            if (routeLines != null && !routeLines.isEmpty()) {
                for (WalkingRouteLine walkingRouteLine : routeLines) {
                    CRPWalkingRouteInfo.Route route = new CRPWalkingRouteInfo.Route();
                    route.setDistance(walkingRouteLine.getDistance());
                    route.setDuration(buildDuration(walkingRouteLine.getDuration()));
                    route.setStarting(buildNode(walkingRouteLine.getStarting()));
                    route.setTerminal(buildNode(walkingRouteLine.getTerminal()));
                    route.setTitle(walkingRouteLine.getTitle() == null ? "" : walkingRouteLine.getTitle());
                    ArrayList arrayList2 = new ArrayList();
                    List<WalkingRouteLine.WalkingStep> allStep = walkingRouteLine.getAllStep();
                    if (allStep == null || allStep.isEmpty()) {
                        result = result2;
                    } else {
                        for (WalkingRouteLine.WalkingStep walkingStep : allStep) {
                            CRPWalkingRouteInfo.Step step = new CRPWalkingRouteInfo.Step();
                            step.setDistance(walkingStep.getDistance());
                            step.setDuration(walkingStep.getDuration());
                            ArrayList arrayList3 = new ArrayList();
                            for (LatLng latLng : walkingStep.getWayPoints()) {
                                arrayList3.add(new LocationBean(latLng.latitude, latLng.longitude));
                                result2 = result2;
                            }
                            CRPWalkingRouteInfo.Result result3 = result2;
                            step.setPoints(arrayList3);
                            step.setName(walkingStep.getName() == null ? "" : walkingStep.getName());
                            step.setDirection(walkingStep.getDirection());
                            step.setEntrace(buildNode(walkingStep.getEntrance()));
                            step.setEntraceInstruction(walkingStep.getEntranceInstructions());
                            step.setExit(buildNode(walkingStep.getExit()));
                            step.setExitInstruction(walkingStep.getExitInstructions());
                            step.setInstruction(walkingStep.getInstructions());
                            arrayList2.add(step);
                            result2 = result3;
                        }
                        result = result2;
                        route.setSteps(arrayList2);
                    }
                    arrayList.add(route);
                    result2 = result;
                }
            }
            CRPWalkingRouteInfo.Result result4 = result2;
            result4.setRoutes(arrayList);
            cRPWalkingRouteInfo = s.bean2Json(arrayList).getBytes(StandardCharsets.UTF_8).length < MAX_ROUTE_LENGTH ? new CRPWalkingRouteInfo(0, result4) : new CRPWalkingRouteInfo(15, null);
        }
        return d.save(context, s.bean2Json(cRPWalkingRouteInfo), d.WALKING_ROUTE_FILE_NAME);
    }

    private static Duration buildDuration(int i8) {
        return new Duration(i8 / 86400, (i8 % 86400) / 3600, (i8 % 3600) / 60, i8 % 60);
    }

    private static Node buildNode(RouteNode routeNode) {
        return new Node(routeNode.getUid(), routeNode.getTitle(), new LocationBean(routeNode.getLocation().latitude, routeNode.getLocation().longitude));
    }

    public static File build(Context context, BikingRouteResult bikingRouteResult) {
        CRPCylingcRouteInfo cRPCylingcRouteInfo;
        CRPCylingcRouteInfo.Result result;
        if (bikingRouteResult != null && bikingRouteResult.error == SearchResult.ERRORNO.NO_ERROR) {
            CRPCylingcRouteInfo.Result result2 = new CRPCylingcRouteInfo.Result();
            ArrayList arrayList = new ArrayList();
            List<BikingRouteLine> routeLines = bikingRouteResult.getRouteLines();
            if (routeLines != null && !routeLines.isEmpty()) {
                for (BikingRouteLine bikingRouteLine : routeLines) {
                    CRPCylingcRouteInfo.Route route = new CRPCylingcRouteInfo.Route();
                    route.setDistance(bikingRouteLine.getDistance());
                    route.setDuration(buildDuration(bikingRouteLine.getDuration()));
                    route.setStarting(buildNode(bikingRouteLine.getStarting()));
                    route.setTerminal(buildNode(bikingRouteLine.getTerminal()));
                    route.setTitle(bikingRouteLine.getTitle() == null ? "" : bikingRouteLine.getTitle());
                    ArrayList arrayList2 = new ArrayList();
                    List<BikingRouteLine.BikingStep> allStep = bikingRouteLine.getAllStep();
                    if (allStep == null || allStep.isEmpty()) {
                        result = result2;
                    } else {
                        for (BikingRouteLine.BikingStep bikingStep : allStep) {
                            CRPCylingcRouteInfo.Step step = new CRPCylingcRouteInfo.Step();
                            step.setDistance(bikingStep.getDistance());
                            step.setDuration(bikingStep.getDuration());
                            ArrayList arrayList3 = new ArrayList();
                            for (LatLng latLng : bikingStep.getWayPoints()) {
                                arrayList3.add(new LocationBean(latLng.latitude, latLng.longitude));
                                result2 = result2;
                            }
                            CRPCylingcRouteInfo.Result result3 = result2;
                            step.setPoints(arrayList3);
                            step.setName(bikingStep.getName() == null ? "" : bikingStep.getName());
                            step.setDirection(bikingStep.getDirection());
                            step.setEntrace(buildNode(bikingStep.getEntrance()));
                            step.setEntraceInstruction(bikingStep.getEntranceInstructions());
                            step.setExit(buildNode(bikingStep.getExit()));
                            step.setExitInstruction(bikingStep.getExitInstructions());
                            step.setInstruction(bikingStep.getInstructions());
                            step.setRestrictionsStatus(bikingStep.getRestrictionsStatus());
                            step.setRestrictionsInfo(bikingStep.getRestrictionsInfo());
                            arrayList2.add(step);
                            result2 = result3;
                        }
                        result = result2;
                        route.setSteps(arrayList2);
                    }
                    arrayList.add(route);
                    result2 = result;
                }
            }
            CRPCylingcRouteInfo.Result result4 = result2;
            result4.setRoutes(arrayList);
            if (s.bean2Json(arrayList).getBytes(StandardCharsets.UTF_8).length < MAX_ROUTE_LENGTH) {
                cRPCylingcRouteInfo = new CRPCylingcRouteInfo(0, result4);
            } else {
                cRPCylingcRouteInfo = new CRPCylingcRouteInfo(15, null);
            }
        } else {
            cRPCylingcRouteInfo = new CRPCylingcRouteInfo(8, null);
        }
        return d.save(context, s.bean2Json(cRPCylingcRouteInfo), d.CYCLING_ROUTE_FILE_NAME);
    }

    public static File build(Context context, TransitRouteResult transitRouteResult) {
        CRPTransitRouteInfo cRPTransitRouteInfo;
        CRPTransitRouteInfo.Result result;
        if (transitRouteResult != null && transitRouteResult.error == SearchResult.ERRORNO.NO_ERROR) {
            CRPTransitRouteInfo.Result result2 = new CRPTransitRouteInfo.Result();
            ArrayList arrayList = new ArrayList();
            List<TransitRouteLine> routeLines = transitRouteResult.getRouteLines();
            if (routeLines != null && !routeLines.isEmpty()) {
                for (TransitRouteLine transitRouteLine : routeLines) {
                    CRPTransitRouteInfo.Route route = new CRPTransitRouteInfo.Route();
                    route.setDistance(transitRouteLine.getDistance());
                    route.setDuration(buildDuration(transitRouteLine.getDuration()));
                    route.setStarting(buildNode(transitRouteLine.getStarting()));
                    route.setTerminal(buildNode(transitRouteLine.getTerminal()));
                    route.setTitle(transitRouteLine.getTitle() == null ? "" : transitRouteLine.getTitle());
                    ArrayList arrayList2 = new ArrayList();
                    List<TransitRouteLine.TransitStep> allStep = transitRouteLine.getAllStep();
                    if (allStep == null || allStep.isEmpty()) {
                        result = result2;
                    } else {
                        for (TransitRouteLine.TransitStep transitStep : allStep) {
                            CRPTransitRouteInfo.Step step = new CRPTransitRouteInfo.Step();
                            step.setDistance(transitStep.getDistance());
                            step.setDuration(transitStep.getDuration());
                            ArrayList arrayList3 = new ArrayList();
                            for (LatLng latLng : transitStep.getWayPoints()) {
                                arrayList3.add(new LocationBean(latLng.latitude, latLng.longitude));
                                result2 = result2;
                            }
                            CRPTransitRouteInfo.Result result3 = result2;
                            step.setPoints(arrayList3);
                            step.setName(transitStep.getName() == null ? "" : transitStep.getName());
                            step.setEntrace(buildNode(transitStep.getEntrance()));
                            step.setExit(buildNode(transitStep.getExit()));
                            step.setInstruction(transitStep.getInstructions());
                            step.setStepType(transitStep.getStepType().ordinal());
                            VehicleInfo vehicleInfo = transitStep.getVehicleInfo();
                            if (vehicleInfo != null) {
                                CRPTransitRouteInfo.VehicleInfo vehicleInfo2 = new CRPTransitRouteInfo.VehicleInfo();
                                vehicleInfo2.setUid(vehicleInfo.getUid());
                                vehicleInfo2.setTitle(vehicleInfo.getTitle());
                                vehicleInfo2.setPassStationNum(vehicleInfo.getPassStationNum());
                                vehicleInfo2.setTotalPrice(vehicleInfo.getTotalPrice());
                                vehicleInfo2.setZonePrice(vehicleInfo.getZonePrice());
                                step.setVehicleInfo(vehicleInfo2);
                            }
                            arrayList2.add(step);
                            result2 = result3;
                        }
                        result = result2;
                        route.setSteps(arrayList2);
                    }
                    arrayList.add(route);
                    result2 = result;
                }
            }
            CRPTransitRouteInfo.Result result4 = result2;
            result4.setRoutes(arrayList);
            if (s.bean2Json(arrayList).getBytes(StandardCharsets.UTF_8).length < MAX_ROUTE_LENGTH) {
                cRPTransitRouteInfo = new CRPTransitRouteInfo(0, result4);
            } else {
                cRPTransitRouteInfo = new CRPTransitRouteInfo(15, null);
            }
        } else {
            cRPTransitRouteInfo = new CRPTransitRouteInfo(8, null);
        }
        return d.save(context, s.bean2Json(cRPTransitRouteInfo), d.TRANSIT_ROUTE_FILE_NAME);
    }
}
