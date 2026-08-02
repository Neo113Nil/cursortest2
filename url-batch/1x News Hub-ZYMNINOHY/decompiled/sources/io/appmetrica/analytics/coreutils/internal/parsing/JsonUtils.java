package io.appmetrica.analytics.coreutils.internal.parsing;

import a.AbstractC0129a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.b;
import r2.a;
import r2.g;

/* loaded from: classes.dex */
public final class JsonUtils {
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean equals;
        if (!g.Y(g.V(jSONObject.keys())).equals(g.Y(g.V(jSONObject2.keys())))) {
            return false;
        }
        Iterator it = ((a) g.V(jSONObject.keys())).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!(obj2 instanceof JSONObject)) {
                    return false;
                }
                equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
            } else if (!(obj instanceof JSONArray)) {
                equals = obj.equals(obj2);
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    return false;
                }
                equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public static final boolean optBooleanOrDefault(JSONObject jSONObject, String str, boolean z) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull != null ? optBooleanOrNull.booleanValue() : z;
    }

    public static final Boolean optBooleanOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Boolean optBooleanOrNullable(JSONObject jSONObject, String str, Boolean bool) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull == null ? bool : optBooleanOrNull;
    }

    public static final float optFloatOrDefault(JSONObject jSONObject, String str, float f) {
        Float optFloatOrNull = optFloatOrNull(jSONObject, str);
        return optFloatOrNull != null ? optFloatOrNull.floatValue() : f;
    }

    public static final Float optFloatOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final byte[] optHexByteArray(JSONObject jSONObject, String str, byte[] bArr) {
        String optStringOrNull;
        byte[] bArr2;
        if (jSONObject == null || (optStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArr2 = StringUtils.hexToBytes(optStringOrNull);
        } catch (Throwable unused) {
            bArr2 = null;
        }
        return bArr2 != null ? bArr2 : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    public static final Integer optIntOrDefault(JSONObject jSONObject, String str, Integer num) {
        Integer optIntOrNull = optIntOrNull(jSONObject, str);
        return optIntOrNull == null ? num : optIntOrNull;
    }

    public static final Integer optIntOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final JSONObject optJsonObjectOrDefault(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final JSONObject optJsonObjectOrNull(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    public static final JSONObject optJsonObjectOrNullable(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    public static final Long optLongOrDefault(JSONObject jSONObject, String str, Long l3) {
        Long optLongOrNull = optLongOrNull(jSONObject, str);
        return optLongOrNull == null ? l3 : optLongOrNull;
    }

    public static final Long optLongOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String optStringOrNullable(JSONObject jSONObject, String str, String str2) {
        String optStringOrNull = optStringOrNull(jSONObject, str);
        return optStringOrNull == null ? str2 : optStringOrNull;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:11:0x0026->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isEqualTo(JSONArray jSONArray, JSONArray jSONArray2) {
        boolean equals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        Iterable G2 = AbstractC0129a.G(0, jSONArray.length());
        if ((G2 instanceof Collection) && ((Collection) G2).isEmpty()) {
            return true;
        }
        Iterator it = G2.iterator();
        while (((b) it).f10223c) {
            int a3 = ((b) it).a();
            Object obj = jSONArray.get(a3);
            Object obj2 = jSONArray2.get(a3);
            if (obj instanceof JSONObject) {
                if (!(obj2 instanceof JSONObject)) {
                    return false;
                }
                equals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                if (equals) {
                    return false;
                }
            } else {
                if (obj instanceof JSONArray) {
                    if (!(obj2 instanceof JSONArray)) {
                        return false;
                    }
                    equals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                } else {
                    equals = obj.equals(obj2);
                }
                if (equals) {
                }
            }
        }
        return true;
    }
}
