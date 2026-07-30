package com.baidu.ar;

import com.baidu.ar.baidumap.MapDuMix;
import com.baidu.ar.marker.model.LocationMarkerData;
import java.util.List;

/* loaded from: classes.dex */
public class VpasManager {

    /* renamed from: a, reason: collision with root package name */
    public NavigationController f1617a;

    /* renamed from: b, reason: collision with root package name */
    public MapDuMix f1618b;

    public VpasManager(NavigationController navigationController) {
        this.f1617a = navigationController;
        this.f1618b = navigationController.getMapDuMixInstance();
    }

    public boolean chioceOneCoordinate(LocationMarkerData locationMarkerData) {
        MapDuMix mapDuMix;
        h.b("VpasManager", "chioceOneCoordinate");
        NavigationController navigationController = this.f1617a;
        if (navigationController == null || !navigationController.mMapDuMixSetuped || (mapDuMix = this.f1618b) == null || mapDuMix.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().choiceOneCoordinate(locationMarkerData);
        this.f1617a.choseFloor();
        return true;
    }

    public boolean clearRoute() {
        NavigationController navigationController;
        h.b("VpasManager", "clearRoute");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().clearRoute();
        this.f1617a.updateUIByClearRoute();
        return true;
    }

    public boolean hideFinalPoi() {
        NavigationController navigationController;
        h.b("VpasManager", "hideFinalPoi");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().hideFinalPoint();
        return true;
    }

    public boolean hideNavigationContent() {
        NavigationController navigationController;
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().hideNavigationContent();
        return true;
    }

    public boolean mockArrow(float f8, float f9, float f10, float f11, int i8) {
        NavigationController navigationController;
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate()) {
            return false;
        }
        this.f1618b.getMarkerManager().postArrow(f8, f9, f10, f11, i8);
        return false;
    }

    public boolean postArrow(String str, int i8, double[] dArr, double[] dArr2, double[] dArr3, float f8, float f9) {
        NavigationController navigationController;
        h.b("VpasManager", "postArrow");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().postArrow(str, i8, dArr, dArr2, dArr3, f8, f9);
        return true;
    }

    public boolean postFinalArrow(String str, double[] dArr) {
        NavigationController navigationController;
        h.b("VpasManager", "postFinalArrow");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().postFinalArrow(str, dArr);
        return true;
    }

    public boolean postLiftDown(double[] dArr, float f8) {
        h.b("VpasManager", "postLiftDown");
        if (this.f1618b == null || !this.f1617a.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().postLiftDown(dArr, f8);
        return true;
    }

    public boolean postLiftUp(double[] dArr, float f8) {
        NavigationController navigationController;
        h.b("VpasManager", "postLiftUp");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().postLiftUp(dArr, f8);
        return true;
    }

    public boolean postRouteByList(List<double[]> list) {
        NavigationController navigationController;
        if (list == null || list.size() <= 0 || this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().postRoute(list);
        return true;
    }

    public boolean removeAllArrow() {
        NavigationController navigationController;
        h.b("VpasManager", "removeAllArrow");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().removeAllArrow();
        return true;
    }

    public boolean removeArrowByArrowId(String str) {
        NavigationController navigationController;
        h.b("VpasManager", "removeArrowByArrowId");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().removeArrowByArrowId(str);
        return true;
    }

    public boolean removeLiftDown() {
        NavigationController navigationController;
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().removeLiftDown();
        return true;
    }

    public boolean removeLiftUp() {
        NavigationController navigationController;
        h.b("VpasManager", "removeLiftUp");
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().removeLiftUp();
        return true;
    }

    public void resetMarkerAR() {
        NavigationController navigationController;
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return;
        }
        this.f1618b.getMarkerManager().resetMarker();
    }

    public boolean showNavigationContent() {
        NavigationController navigationController;
        if (this.f1618b == null || (navigationController = this.f1617a) == null || !navigationController.resourceIsCreate() || this.f1618b.getMarkerManager() == null) {
            return false;
        }
        this.f1618b.getMarkerManager().showNavigationContent();
        return true;
    }
}
