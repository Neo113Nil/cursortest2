package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public enum NavigationMessageType {
    NAVIGATION_ROUTE_CALCULATION_START(0, "导航开始算路回调"),
    NAVIGATION_ROUTE_CALCULATION_SUCCESS(1, "导航算路成功回调"),
    NAVIGATION_ROUTE_CALCULATION_FAILURE(2, "导航算路失败回调"),
    NAVIGATION_START(3, "导航开始回调"),
    NAVIGATION_EXIT(4, "导航退出回调"),
    NAVIGATION_GUIDANCE_INFO(5, "诱导信息回调"),
    NAVIGATION_GUIDANCE_IMAGE(6, "诱导图片回调"),
    NAVIGATION_REMAINING_TIME(7, "剩余时间回调"),
    NAVIGATION_REMAINING_DISTANCE(8, "剩余里程回调"),
    NAVIGATION_ROUTE(9, "路线回调"),
    NAVIGATION_USER_POSITION(10, "user在路线的索引及位置回调(导航行程中位置回调)"),
    NAVIGATION_YAW_START(11, "开始偏航"),
    NAVIGATION_YAW_ROUTE_CALCULATION(12, "偏航规划中回调"),
    NAVIGATION_YAW_ROUTE_CALCULATION_SUCCESS(13, "重新算路成功回调"),
    NAVIGATION_DESTINATION_ARRIVED(14, "到达目的地回调");

    private final int code;
    private final String description;

    NavigationMessageType(int i8, String str) {
        this.code = i8;
        this.description = str;
    }

    public static NavigationMessageType getInstance(int i8) {
        for (NavigationMessageType navigationMessageType : values()) {
            if (navigationMessageType.code == i8) {
                return navigationMessageType;
            }
        }
        return null;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
