package com.baidu.mapapi.search.route.v2.bus;

/* loaded from: classes2.dex */
public class BusRoutePlanConstant {

    public static final class ErrorCode {
        public static final int ERROR_CODE_CLIENT_EXCEPTION = -5;
        public static final int ERROR_CODE_EMPTY_RESULT = -4;
        public static final int ERROR_CODE_EMPTY_TOKEN = -2;
        public static final int ERROR_CODE_HOST_NOT_EXIST = -6;
        public static final int ERROR_CODE_MISS_PARAM = -3;
        public static final int ERROR_CODE_SIGN_FAILED = -1;
        public static final int PARAMS_ERROR = 400;
        public static final int SERVER_ERROR = 500;
        public static final int SUCCESS = 0;
    }

    public static final class ErrorMsg {
        public static final String ERROR_MSG_EMPTY_RESULT = "EMPTY_RESULT";
        public static final String ERROR_MSG_EMPTY_TOKEN = "EMPTY_TOKEN";
        public static final String ERROR_MSG_HOST_NOT_EXIST = "HOST_NOT_EXIST";
        public static final String ERROR_MSG_MISS_PARAM = "MISS_PARAM";
    }

    public static final class IntercityRoutePrefer {
        public static final int CSY_TYPE_EARLY_TIME = 5;
        public static final int CSY_TYPE_HIGH_PRICE = 8;
        public static final int CSY_TYPE_LATE_TIME = 6;
        public static final int CSY_TYPE_LESS_TIME = 3;
        public static final int CSY_TYPE_LOW_PRICE = 7;
        public static final int CSY_TYPE_MORE_TIME = 4;
        public static final int CSY_TYPE_NEAREST_STATION = 9;
        public static final int CSY_TYPE_RECOMMEND = 10;
    }

    public static final class IntercityVehiclePrefer {
        public static final int CTY_TYPE_AIRPLANE = 1;
        public static final int CTY_TYPE_COACH = 2;
        public static final int CTY_TYPE_TRAIN = 0;
        public static final int CTY_TYPE_TRAIN_AIRPLANE = 3;
    }

    public static final class Language {
        public static final String CHINESE = "zh";
        public static final String ENGLISH = "en";
    }

    public static final class PlanType {
        public static final int BUS_LEG_TYPE_BUS = 4;
        public static final int BUS_LEG_TYPE_COACH = 3;
        public static final int BUS_LEG_TYPE_RIDE = 6;
        public static final int BUS_LEG_TYPE_TAXI = 7;
        public static final int BUS_LEG_TYPE_TRAIN = 0;
        public static final int BUS_LEG_TYPE_TRAIN_AIRPLANE = 2;
        public static final int BUS_LEG_TYPE_TRAIN_HIGHSPEED = 1;
        public static final int BUS_LEG_TYPE_WALK = 5;
    }

    public static final class StepType {
        public static final int BUS_STEP_TYPE_AIRPLANE = 2;
        public static final int BUS_STEP_TYPE_BUS = 3;
        public static final int BUS_STEP_TYPE_COACH = 6;
        public static final int BUS_STEP_TYPE_DRIVE = 4;
        public static final int BUS_STEP_TYPE_RIDE = 7;
        public static final int BUS_STEP_TYPE_TAXI = 8;
        public static final int BUS_STEP_TYPE_TRAIN = 1;
        public static final int BUS_STEP_TYPE_WALK = 5;
    }

    public static final class TransType {
        public static final int TRANS_DIFF_STATION = 4;
        public static final int TRANS_IN_SUBWAY = 1;
        public static final int TRANS_NORMAL = 0;
        public static final int TRANS_OUT_SUBWAY = 2;
        public static final int TRANS_SAME_STATION = 3;
    }

    public static final class UrbanRoutePrefer {
        public static final int SY_TYPE_LESS_TRANSFER = 2;
        public static final int SY_TYPE_LESS_WALK = 3;
        public static final int SY_TYPE_NO_SUBWAY = 4;
        public static final int SY_TYPE_RECOMMEND = 0;
        public static final int SY_TYPE_SHORT_TIME = 5;
        public static final int SY_TYPE_SUBWAY_FIRST = 6;
    }
}
