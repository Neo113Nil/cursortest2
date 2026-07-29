package com.xsj.crasheye;

import com.umeng.analytics.pro.b;
import com.xsj.crasheye.util.Utils;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class CrasheyeUrls {
    public static final String baseURL = Utils.getSendReportUrl();

    CrasheyeUrls() {
    }

    public static String getURL(EnumActionType enumActionType, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(baseURL);
        String str2 = "";
        if (enumActionType == EnumActionType.ping) {
            sb.append("/session?appkey=");
            str2 = b.ac;
        } else if (enumActionType == EnumActionType.error || enumActionType == EnumActionType.ndkerror) {
            sb.append("/crash?appkey=");
            str2 = "crash";
        }
        sb.append(Properties.APP_KEY);
        sb.append("&uid=");
        sb.append(Properties.UID);
        sb.append("&sig=");
        sb.append(getPostSig(str2, Properties.APP_KEY, Properties.UID, str));
        return sb.toString();
    }

    public static String getURL(EnumActionType enumActionType, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(baseURL);
        String str = "";
        if (enumActionType == EnumActionType.ping) {
            sb.append("/session?appkey=");
            str = b.ac;
        } else if (enumActionType == EnumActionType.error || enumActionType == EnumActionType.ndkerror) {
            sb.append("/crash?appkey=");
            str = "crash";
        }
        sb.append(Properties.APP_KEY);
        sb.append("&uid=");
        sb.append(Properties.UID);
        sb.append("&sig=");
        sb.append(getPostSig(str, Properties.APP_KEY, Properties.UID, bArr));
        return sb.toString();
    }

    private static String getPostSig(String str, String str2, String str3, String str4) {
        try {
            return Utils.MD5(String.format("_uri=%s&appkey=%s&uid=%s&request_body=%s", str, str2, str3, str4));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getPostSig(String str, String str2, String str3, byte[] bArr) {
        String format = String.format("_uri=%s&appkey=%s&uid=%s&request_body=", str, str2, str3);
        ByteBuffer allocate = ByteBuffer.allocate(format.length() + bArr.length);
        allocate.put(format.getBytes());
        allocate.put(bArr);
        try {
            return Utils.MD5(allocate);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
