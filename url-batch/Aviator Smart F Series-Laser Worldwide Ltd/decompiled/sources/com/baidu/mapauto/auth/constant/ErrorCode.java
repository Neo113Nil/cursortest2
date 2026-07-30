package com.baidu.mapauto.auth.constant;

/* loaded from: classes2.dex */
public final class ErrorCode {
    public static final int CODE_CHECK_SIGN_ERROR = -1006;
    public static final int CODE_INNER_ERROR = -1001;
    public static final int CODE_MULTI_FUNC_ERROR = -1007;
    public static final int CODE_NET_WORK_ERROR = -1003;
    public static final int CODE_NET_WORK_TIMEOUT = -1004;
    public static final int CODE_PARAMETER_ERROR = -1002;
    public static final int CODE_SERVER_ERROR = -1005;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_UNKNOWN_ERROR = -1000;

    public static String getCodeDesc(int i8) {
        if (i8 == 0) {
            return "成功";
        }
        if (i8 == -1001) {
            return "内部错误";
        }
        if (i8 == -1002) {
            return "参数错误";
        }
        if (i8 == -1003) {
            return "网络错误";
        }
        if (i8 == -1004) {
            return "网络超时错误";
        }
        if (i8 == -1005) {
            return "服务错误";
        }
        if (i8 == -1006) {
            return "校验错误";
        }
        if (i8 == -1007) {
            return "所申请一个或多个LICENSE没有权限";
        }
        if (i8 == -1000) {
            return "未知错误";
        }
        throw new UnsupportedOperationException();
    }
}
