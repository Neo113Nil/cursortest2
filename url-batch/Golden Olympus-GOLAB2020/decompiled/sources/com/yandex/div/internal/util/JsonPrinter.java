package com.yandex.div.internal.util;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class JsonPrinter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int indentSpaces;
    private final int nestingLimit;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public JsonPrinter(int i4, int i5) {
        this.indentSpaces = i4;
        this.nestingLimit = i5;
    }

    private final JSONObject deepCopy(JSONObject jSONObject, int i4) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jSONObject.opt(key);
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (opt instanceof JSONObject) {
                if (i4 != 0) {
                    opt = deepCopy((JSONObject) opt, i4 - 1);
                    jSONObject2.put(key, opt);
                }
                opt = "...";
                jSONObject2.put(key, opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i4 != 0) {
                        opt = deepCopy((JSONArray) opt, i4 - 1);
                    }
                    opt = "...";
                }
                jSONObject2.put(key, opt);
            }
        }
        return jSONObject2;
    }

    @NotNull
    public final String print(@NotNull JSONObject json) {
        String jSONObject;
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject deepCopy = deepCopy(json, this.nestingLimit);
        int i4 = this.indentSpaces;
        if (i4 == 0) {
            jSONObject = deepCopy.toString();
            str = "copy.toString()";
        } else {
            jSONObject = deepCopy.toString(i4);
            str = "copy.toString(indentSpaces)";
        }
        Intrinsics.checkNotNullExpressionValue(jSONObject, str);
        return jSONObject;
    }

    @NotNull
    public final String print(@NotNull JSONArray json) {
        String jSONArray;
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray deepCopy = deepCopy(json, this.nestingLimit);
        int i4 = this.indentSpaces;
        if (i4 == 0) {
            jSONArray = deepCopy.toString();
            str = "copy.toString()";
        } else {
            jSONArray = deepCopy.toString(i4);
            str = "copy.toString(indentSpaces)";
        }
        Intrinsics.checkNotNullExpressionValue(jSONArray, str);
        return jSONArray;
    }

    private final JSONArray deepCopy(JSONArray jSONArray, int i4) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            Object opt = jSONArray.opt(i5);
            if (!(opt instanceof JSONObject)) {
                if (opt instanceof JSONArray) {
                    if (i4 != 0) {
                        opt = deepCopy((JSONArray) opt, i4 - 1);
                    }
                    opt = "...";
                }
                jSONArray2.put(opt);
            } else {
                if (i4 != 0) {
                    opt = deepCopy((JSONObject) opt, i4 - 1);
                    jSONArray2.put(opt);
                }
                opt = "...";
                jSONArray2.put(opt);
            }
        }
        return jSONArray2;
    }
}
