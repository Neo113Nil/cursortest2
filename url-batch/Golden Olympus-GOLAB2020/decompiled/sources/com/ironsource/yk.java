package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class yk {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20437a = 100;

    private static final boolean a(Object obj, Object obj2, int i4) {
        return ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) ? a((JSONObject) obj, (JSONObject) obj2, i4 + 1) : ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) ? a((JSONArray) obj, (JSONArray) obj2, i4 + 1) : ((obj instanceof Number) && (obj2 instanceof Number)) ? ((Number) obj).doubleValue() == ((Number) obj2).doubleValue() : Intrinsics.areEqual(obj, obj2);
    }

    public static final boolean a(@NotNull JSONArray lhs, @NotNull JSONArray rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i4 > 100) {
            return false;
        }
        Iterable p4 = kotlin.ranges.g.p(0, jSONArray.length());
        if (!(p4 instanceof Collection) || !((Collection) p4).isEmpty()) {
            Iterator it = p4.iterator();
            while (it.hasNext()) {
                int a4 = ((kotlin.collections.E) it).a();
                if (!a(jSONArray.get(a4), jSONArray2.get(a4), i4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean a(@NotNull JSONObject lhs, @NotNull JSONObject rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i4) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i4 > 100) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "lhs.keys()");
        for (String str : kotlin.sequences.k.c(keys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i4)) {
                return false;
            }
        }
        return true;
    }
}
