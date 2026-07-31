package D0;

import android.text.TextUtils;
import com.huawei.hms.ads.installreferrer.commons.LogUtil;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public abstract class e {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            LogUtil.logError("StringUtils", "unsupport decoding, err: " + th.getClass().getSimpleName());
            return null;
        }
    }
}
