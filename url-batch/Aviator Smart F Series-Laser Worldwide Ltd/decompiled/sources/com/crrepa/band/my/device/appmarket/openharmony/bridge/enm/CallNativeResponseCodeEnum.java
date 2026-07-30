package com.crrepa.band.my.device.appmarket.openharmony.bridge.enm;

/* loaded from: classes2.dex */
public enum CallNativeResponseCodeEnum {
    OK("1", "服务正常"),
    PARAM_ERROR("5002", "参数错误"),
    CANOT_FIND("5003", "没有找到相应配置"),
    SYSTEM_ERROR("50004", "系统错误");

    private final String code;
    private final String message;

    CallNativeResponseCodeEnum(String str, String str2) {
        this.code = str;
        this.message = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
