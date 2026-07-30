package y;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h {
    public static String a(String str) {
        return a(str, 4);
    }

    public static String a(String str, int i8) {
        try {
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char charAt = str.charAt(i9);
                if (charAt == '{') {
                    return new JSONObject(str).toString(i8);
                }
                if (charAt == '[') {
                    return new JSONArray(str).toString(i8);
                }
                if (!Character.isWhitespace(charAt)) {
                    return str;
                }
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return str;
    }
}
