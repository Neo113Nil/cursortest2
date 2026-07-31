package m5;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f19247a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19248b;

    public j(String str, Object obj) {
        this.f19247a = str;
        this.f19248b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f19248b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f19248b;
    }
}
