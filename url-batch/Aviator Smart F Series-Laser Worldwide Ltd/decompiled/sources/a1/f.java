package a1;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class f {
    private static final String SCORE_SEPARATOR = "/";

    private f() {
    }

    public static int getCricketScore(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.contains("/") ? Integer.parseInt(str.split("/")[0]) : Integer.parseInt(str);
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0;
        }
    }
}
