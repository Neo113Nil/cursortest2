package a3;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.wr2;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0<Map<String, ?>> f39a = new y0();

    public static Bundle a(JSONObject jSONObject) {
        String valueOf;
        String str;
        String str2;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i7 = 0;
                        Object obj = null;
                        for (int i8 = 0; obj == null && i8 < length; i8++) {
                            obj = !jSONArray.isNull(i8) ? jSONArray.opt(i8) : null;
                        }
                        if (obj == null) {
                            valueOf = String.valueOf(next);
                            str = "Expected JSONArray with at least 1 non-null element for key:";
                            if (valueOf.length() == 0) {
                                str2 = new String("Expected JSONArray with at least 1 non-null element for key:");
                            }
                            str2 = str.concat(valueOf);
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i7 < length) {
                                bundleArr[i7] = !jSONArray.isNull(i7) ? a(jSONArray.optJSONObject(i7)) : null;
                                i7++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i7 < length) {
                                dArr[i7] = jSONArray.optDouble(i7);
                                i7++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i7 < length) {
                                strArr[i7] = !jSONArray.isNull(i7) ? jSONArray.optString(i7) : null;
                                i7++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i7 < length) {
                                zArr[i7] = jSONArray.optBoolean(i7);
                                i7++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            str2 = String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                        }
                        io0.g(str2);
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) opt));
                } else {
                    valueOf = String.valueOf(next);
                    str = "Unsupported type for key:";
                    if (valueOf.length() == 0) {
                        str2 = new String("Unsupported type for key:");
                        io0.g(str2);
                    }
                    str2 = str.concat(valueOf);
                    io0.g(str2);
                }
            }
        }
        return bundle;
    }

    public static String b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject m7 = m(jSONObject, strArr);
        return m7 == null ? "" : m7.optString(strArr[0], "");
    }

    public static List<String> c(JSONArray jSONArray, List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                list.add(jSONArray.getString(i7));
            }
        }
        return list;
    }

    public static List<String> d(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray e(JsonReader jsonReader) {
        Object e7;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                e7 = e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                e7 = h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                e7 = jsonReader.nextString();
            }
            jSONArray.put(e7);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject f(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject g(JSONObject jSONObject, String... strArr) {
        JSONObject m7 = m(jSONObject, strArr);
        if (m7 == null) {
            return null;
        }
        return m7.optJSONObject(strArr[1]);
    }

    public static JSONObject h(JsonReader jsonReader) {
        Object e7;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                e7 = e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                e7 = h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                e7 = jsonReader.nextString();
            }
            jSONObject.put(nextName, e7);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void i(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                Object obj = jSONArray.get(i7);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    j(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    i(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static void j(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    j(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    i(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static boolean k(boolean z6, JSONObject jSONObject, String... strArr) {
        JSONObject m7 = m(jSONObject, strArr);
        if (m7 == null) {
            return false;
        }
        return m7.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String l(wr2 wr2Var) {
        if (wr2Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            n(jsonWriter, wr2Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e7) {
            io0.e("Error when writing JSON.", e7);
            return null;
        }
    }

    private static JSONObject m(JSONObject jSONObject, String[] strArr) {
        for (int i7 = 0; i7 < strArr.length - 1; i7++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i7]);
        }
        return jSONObject;
    }

    private static void n(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof wr2) {
            j(jsonWriter, ((wr2) obj).f13929d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                n(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
