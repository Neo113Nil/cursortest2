package W5;

import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    private final c current;

    public b(c current) {
        h.e(current, "current");
        this.current = current;
    }

    public final c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        h.d(put, "put(...)");
        return put;
    }
}
