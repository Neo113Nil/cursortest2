package P1;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f1266a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1267b;

    public l(Object obj, String str) {
        this.f1266a = str;
        this.f1267b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f1267b;
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
