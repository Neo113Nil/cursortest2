package com.bytedance.sdk.component.adexpress.Jd;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: UrlUtils.java */
/* loaded from: classes.dex */
public class so {
    public static pvs pvs(String str) {
        pvs pvsVar = pvs.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        pvsVar = pvs.CSS;
                    } else if (path.endsWith(".js")) {
                        pvsVar = pvs.JS;
                    } else {
                        if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                            if (path.endsWith(".html")) {
                                pvsVar = pvs.HTML;
                            }
                        }
                        pvsVar = pvs.IMAGE;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return pvsVar;
    }

    public static boolean icD(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    /* compiled from: UrlUtils.java */
    public enum pvs {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String NB;

        pvs(String str) {
            this.NB = str;
        }

        public String pvs() {
            return this.NB;
        }
    }
}
