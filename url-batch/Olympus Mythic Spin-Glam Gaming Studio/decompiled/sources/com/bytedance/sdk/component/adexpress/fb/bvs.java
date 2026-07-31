package com.bytedance.sdk.component.adexpress.fb;

import android.net.Uri;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* loaded from: classes5.dex */
public class bvs {
    public static zmn zmn(String str) {
        zmn zmnVar = zmn.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        zmnVar = zmn.CSS;
                    } else if (path.endsWith(".js")) {
                        zmnVar = zmn.JS;
                    } else if (!path.endsWith(BrandSafetyUtils.a) && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            zmnVar = zmn.HTML;
                        } else if (path.endsWith(".mp4")) {
                            zmnVar = zmn.VIDEO;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return zmnVar;
    }

    public enum zmn {
        HTML(POBCommonConstants.CONTENT_TYPE_HTML),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*"),
        VIDEO("video/mp4");

        private String hhw;

        zmn(String str) {
            this.hhw = str;
        }

        public String zmn() {
            return this.hhw;
        }
    }
}
