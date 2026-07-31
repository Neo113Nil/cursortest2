package com.bytedance.sdk.component.nps.zn;

import android.text.TextUtils;
import io.bidmachine.util.MimeTypes;
import java.util.Map;

/* loaded from: classes12.dex */
public class zmn {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zmn(Map<String, String> map) {
        String str;
        if (map == null) {
            return false;
        }
        String str2 = "content-type";
        if (TextUtils.isEmpty(map.get("content-type"))) {
            str2 = "Content-Type";
            if (TextUtils.isEmpty(map.get("Content-Type"))) {
                str = "";
                return !str.contains(MimeTypes.APPLICATION_OCTET_STREAM);
            }
        }
        str = map.get(str2);
        if (!str.contains(MimeTypes.APPLICATION_OCTET_STREAM)) {
        }
    }
}
