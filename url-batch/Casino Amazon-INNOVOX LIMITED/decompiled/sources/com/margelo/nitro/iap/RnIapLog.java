package com.margelo.nitro.iap;

import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RnIapLog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J&\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/RnIapLog;", "", "<init>", "()V", "TAG", "", "payload", "", "name", "result", "value", "failure", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "debug", "message", "warn", "stringify", "sanitize", "sanitizeMap", "", "source", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RnIapLog {
    public static final RnIapLog INSTANCE = new RnIapLog();
    private static final String TAG = "RnIap";

    private RnIapLog() {
    }

    public final void payload(String name, Object payload) {
        Intrinsics.checkNotNullParameter(name, "name");
        debug(name + " payload: " + stringify(payload));
    }

    public final void result(String name, Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        debug(name + " result: " + stringify(value));
    }

    public final void failure(String name, Throwable error) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(error, "error");
        Log.e(TAG, name + " failed: " + error.getLocalizedMessage(), error);
    }

    public final void debug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, message);
    }

    public final void warn(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w(TAG, message);
    }

    private final String stringify(Object value) {
        Object sanitize = sanitize(value);
        if (sanitize == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (sanitize instanceof String) {
            return (String) sanitize;
        }
        if ((sanitize instanceof Number) || (sanitize instanceof Boolean)) {
            return sanitize.toString();
        }
        if (sanitize instanceof Map) {
            String jSONObject = new JSONObject((Map) sanitize).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            return jSONObject;
        }
        if (sanitize instanceof List) {
            String jSONArray = new JSONArray((Collection) sanitize).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            return jSONArray;
        }
        if (!(sanitize instanceof Object[])) {
            return sanitize.toString();
        }
        String jSONArray2 = new JSONArray(sanitize).toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    private final Object sanitize(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Map) {
            return sanitizeMap((Map) value);
        }
        if (!(value instanceof List)) {
            if (!(value instanceof Object[])) {
                return value;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Object[]) value) {
                Object sanitize = INSTANCE.sanitize(obj);
                if (sanitize != null) {
                    arrayList.add(sanitize);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) value).iterator();
        while (it.hasNext()) {
            Object sanitize2 = INSTANCE.sanitize(it.next());
            if (sanitize2 != null) {
                arrayList2.add(sanitize2);
            }
        }
        return arrayList2;
    }

    private final Map<String, Object> sanitizeMap(Map<?, ?> source) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : source.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "token", false, 2, (Object) null)) {
                    linkedHashMap.put(str, ViewProps.HIDDEN);
                } else {
                    linkedHashMap.put(str, sanitize(value));
                }
            }
        }
        return linkedHashMap;
    }
}
