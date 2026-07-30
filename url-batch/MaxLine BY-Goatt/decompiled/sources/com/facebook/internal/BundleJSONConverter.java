package com.facebook.internal;

import android.os.Bundle;
import defpackage.lh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class BundleJSONConverter {
    public static final BundleJSONConverter INSTANCE = new BundleJSONConverter();
    private static final Map<Class<?>, Setter> SETTERS;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Setter {
        void setOnBundle(Bundle bundle, String str, Object obj);

        void setOnJSON(JSONObject jSONObject, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        SETTERS = hashMap;
        hashMap.put(Boolean.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.1
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(Integer.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.2
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                bundle.putInt(str, ((Integer) obj).intValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(Long.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.3
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                bundle.putLong(str, ((Long) obj).longValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(Double.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.4
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(String.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.5
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                bundle.putString(str, (String) obj);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(String[].class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.6
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                JSONArray jSONArray = new JSONArray();
                for (String str2 : (String[]) obj) {
                    jSONArray.put(str2);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        hashMap.put(JSONArray.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(Bundle bundle, String str, Object obj) {
                bundle.getClass();
                str.getClass();
                obj.getClass();
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    if (!(obj2 instanceof String)) {
                        lh.d(obj2.getClass(), "Unexpected type in an array: ");
                        return;
                    }
                    arrayList.add(obj2);
                }
                bundle.putStringArrayList(str, arrayList);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
                jSONObject.getClass();
                str.getClass();
                obj.getClass();
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    private BundleJSONConverter() {
    }

    public static final Bundle convertToBundle(JSONObject jSONObject) {
        jSONObject.getClass();
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, convertToBundle((JSONObject) obj));
                } else {
                    Setter setter = SETTERS.get(obj.getClass());
                    if (setter == null) {
                        lh.d(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    next.getClass();
                    setter.setOnBundle(bundle, next, obj);
                }
            }
        }
        return bundle;
    }

    public static final JSONObject convertToJSON(Bundle bundle) {
        bundle.getClass();
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, convertToJSON((Bundle) obj));
                } else {
                    Setter setter = SETTERS.get(obj.getClass());
                    if (setter == null) {
                        lh.d(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    str.getClass();
                    setter.setOnJSON(jSONObject, str, obj);
                }
            }
        }
        return jSONObject;
    }
}
