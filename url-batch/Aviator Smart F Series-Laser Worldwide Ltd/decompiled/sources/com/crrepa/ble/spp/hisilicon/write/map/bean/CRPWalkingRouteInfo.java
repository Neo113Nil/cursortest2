package com.crrepa.ble.spp.hisilicon.write.map.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPWalkingRouteInfo {
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
        private int direction;
        private int distance;
        private int duration;
        private Node entrace;
        private String entraceInstruction;
        private Node exit;
        private String exitInstruction;
        private String instruction;
        private String name;
        private List<LocationBean> points;
        private String turnType;

        public int getDirection() {
            return this.direction;
        }

        public int getDistance() {
            return this.distance;
        }

        public int getDuration() {
            return this.duration;
        }

        public Node getEntrace() {
            return this.entrace;
        }

        public String getEntraceInstruction() {
            return this.entraceInstruction;
        }

        public Node getExit() {
            return this.exit;
        }

        public String getExitInstruction() {
            return this.exitInstruction;
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

        public String getTurnType() {
            return this.turnType;
        }

        public void setDirection(int i8) {
            this.direction = i8;
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

        public void setEntraceInstruction(String str) {
            this.entraceInstruction = str;
        }

        public void setExit(Node node) {
            this.exit = node;
        }

        public void setExitInstruction(String str) {
            this.exitInstruction = str;
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

        public void setTurnType(String str) {
            this.turnType = str;
        }

        public String toString() {
            return "Step{distance=" + this.distance + ", duration=" + this.duration + ", points=" + this.points + ", name='" + this.name + "', direction=" + this.direction + ", entrace=" + this.entrace + ", entraceInstruction='" + this.entraceInstruction + "', exit=" + this.exit + ", exitInstruction='" + this.exitInstruction + "', instruction='" + this.instruction + "', turnType='" + this.turnType + "'}";
        }
    }

    public CRPWalkingRouteInfo(int i8, Result result) {
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
