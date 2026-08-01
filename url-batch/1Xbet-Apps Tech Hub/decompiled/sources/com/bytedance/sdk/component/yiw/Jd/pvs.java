package com.bytedance.sdk.component.yiw.Jd;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.Map;

/* compiled from: ContentTypeUtil.java */
/* loaded from: classes.dex */
public class pvs {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean pvs(Map<String, String> map) {
        String str;
        if (map == null) {
            return false;
        }
        String str2 = "content-type";
        if (TextUtils.isEmpty(map.get("content-type"))) {
            str2 = HttpHeaders.CONTENT_TYPE;
            if (TextUtils.isEmpty(map.get(HttpHeaders.CONTENT_TYPE))) {
                str = "";
                return !str.contains("application/octet-stream");
            }
        }
        str = map.get(str2);
        if (!str.contains("application/octet-stream")) {
        }
    }
}
