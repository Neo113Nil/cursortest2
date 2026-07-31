package io.appmetrica.analytics.reactnative;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class ExternalAttributionSerializer {
    private ExternalAttributionSerializer() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseSource(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1793460750:
                if (str.equals("Tenjin")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 82339054:
                if (str.equals("AppsFlyer")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 570897463:
                if (str.equals("Singular")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 1115758915:
                if (str.equals("Kochava")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 1956520879:
                if (str.equals("Adjust")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case 2096405811:
                if (str.equals("Airbridge")) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
        }
        return -1;
    }

    public static String parseValue(ReadableMap readableMap) {
        if (readableMap == null) {
            return "";
        }
        return new JSONObject(readableMap.toHashMap()).toString();
    }
}
