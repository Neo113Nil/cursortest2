package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import defpackage.lh;
import defpackage.mi1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CameraEffectJSONUtility {
    public static final CameraEffectJSONUtility INSTANCE = new CameraEffectJSONUtility();
    private static final HashMap<Class<?>, Setter> SETTERS = mi1.e(new Pair(String.class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$1
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) {
            builder.getClass();
            str.getClass();
            obj.getClass();
            builder.putArgument(str, (String) obj);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
            jSONObject.getClass();
            str.getClass();
            jSONObject.put(str, obj);
        }
    }), new Pair(String[].class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$2
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) {
            builder.getClass();
            str.getClass();
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
            jSONObject.getClass();
            str.getClass();
            JSONArray jSONArray = new JSONArray();
            obj.getClass();
            for (String str2 : (String[]) obj) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
    }), new Pair(JSONArray.class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$3
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj) {
            builder.getClass();
            str.getClass();
            obj.getClass();
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj2 = jSONArray.get(i);
                if (!(obj2 instanceof String)) {
                    lh.d(obj2.getClass(), "Unexpected type in an array: ");
                    return;
                }
                arrayList.add(obj2);
            }
            builder.putArgument(str, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(JSONObject jSONObject, String str, Object obj) {
            jSONObject.getClass();
            str.getClass();
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }));

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Setter {
        void setOnArgumentsBuilder(CameraEffectArguments.Builder builder, String str, Object obj);

        void setOnJSON(JSONObject jSONObject, String str, Object obj);
    }

    private CameraEffectJSONUtility() {
    }

    public static final CameraEffectArguments convertToCameraEffectArguments(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    lh.d(obj.getClass(), "Unsupported type: ");
                    return null;
                }
                next.getClass();
                setter.setOnArgumentsBuilder(builder, next, obj);
            }
        }
        return builder.build();
    }

    public static final JSONObject convertToJSON(CameraEffectArguments cameraEffectArguments) {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.keySet()) {
            Object obj = cameraEffectArguments.get(str);
            if (obj != null) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    lh.d(obj.getClass(), "Unsupported type: ");
                    return null;
                }
                setter.setOnJSON(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}
