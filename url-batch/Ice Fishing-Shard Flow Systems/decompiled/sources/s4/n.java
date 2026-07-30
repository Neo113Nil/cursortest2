package s4;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f7767a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7768b;

    public n(Object obj, String str) {
        this.f7767a = str;
        this.f7768b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f7768b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
