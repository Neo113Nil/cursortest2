package com.crrepa.ble.spp.hisilicon.write.map.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPTransitRouteInfo {
    private int error_code;
    private Result result;

    public static class Result {
        private List<Route> routes;

        public List<Route> getRoutes() {
            return this.routes;
        }

        public void setRoutes(List<Route> list) {
            this.routes = list;
        }
    }

    public static class Route {
        private int distance;
        private Duration duration;
        private Node starting;
        private List<Step> steps;
        private Node terminal;
        private String title;

        public int getDistance() {
            return this.distance;
        }

        public Duration getDuration() {
            return this.duration;
        }

        public Node getStarting() {
            return this.starting;
        }

        public List<Step> getSteps() {
            return this.steps;
        }

        public Node getTerminal() {
            return this.terminal;
        }

        public String getTitle() {
            return this.title;
        }

        public void setDistance(int i8) {
            this.distance = i8;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        public void setStarting(Node node) {
            this.starting = node;
        }

        public void setSteps(List<Step> list) {
            this.steps = list;
        }

        public void setTerminal(Node node) {
            this.terminal = node;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "Route{distance=" + this.distance + ", duration=" + this.duration + ", starting=" + this.starting + ", terminal=" + this.terminal + ", title='" + this.title + "', steps=" + this.steps + '}';
        }
    }

    public static class Step {
        private int distance;
        private int duration;
        private Node entrace;
        private Node exit;
        private String instruction;
        private String name;
        private List<LocationBean> points;
        private int stepType;
        private VehicleInfo vehicleInfo;

        public int getDistance() {
            return this.distance;
        }

        public int getDuration() {
            return this.duration;
        }

        public Node getEntrace() {
            return this.entrace;
        }

        public Node getExit() {
            return this.exit;
        }

        public String getInstruction() {
            return this.instruction;
        }

        public String getName() {
            return this.name;
        }

        public List<LocationBean> getPoints() {
            return this.points;
        }

        public int getStepType() {
            return this.stepType;
        }

        public VehicleInfo getVehicleInfo() {
            return this.vehicleInfo;
        }

        public void setDistance(int i8) {
            this.distance = i8;
        }

        public void setDuration(int i8) {
            this.duration = i8;
        }

        public void setEntrace(Node node) {
            this.entrace = node;
        }

        public void setExit(Node node) {
            this.exit = node;
        }

        public void setInstruction(String str) {
            this.instruction = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPoints(List<LocationBean> list) {
            this.points = list;
        }

        public void setStepType(int i8) {
            this.stepType = i8;
        }

        public void setVehicleInfo(VehicleInfo vehicleInfo) {
            this.vehicleInfo = vehicleInfo;
        }

        public String toString() {
            return "Step{distance=" + this.distance + ", duration=" + this.duration + ", points=" + this.points + ", name='" + this.name + "', entrace=" + this.entrace + ", exit=" + this.exit + ", instruction='" + this.instruction + "', stepType=" + this.stepType + ", vehicleInfo=" + this.vehicleInfo + '}';
        }
    }

    public static class VehicleInfo {
        private int passStationNum;
        private String title;
        private int totalPrice;
        private String uid;
        private int zonePrice;

        public int getPassStationNum() {
            return this.passStationNum;
        }

        public String getTitle() {
            return this.title;
        }

        public int getTotalPrice() {
            return this.totalPrice;
        }

        public String getUid() {
            return this.uid;
        }

        public int getZonePrice() {
            return this.zonePrice;
        }

        public void setPassStationNum(int i8) {
            this.passStationNum = i8;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTotalPrice(int i8) {
            this.totalPrice = i8;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public void setZonePrice(int i8) {
            this.zonePrice = i8;
        }

        public String toString() {
            return "VehicleInfo{uid='" + this.uid + "', title='" + this.title + "', passStationNum=" + this.passStationNum + ", totalPrice=" + this.totalPrice + ", zonePrice=" + this.zonePrice + '}';
        }
    }

    public CRPTransitRouteInfo(int i8, Result result) {
        this.error_code = i8;
        this.result = result;
    }

    public int getError_code() {
        return this.error_code;
    }

    public Result getResult() {
        return this.result;
    }

    public void setError_code(int i8) {
        this.error_code = i8;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return "CRPWalkingRouteInfo{error_code=" + this.error_code + ", result=" + this.result + '}';
    }
}
