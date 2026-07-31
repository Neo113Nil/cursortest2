package x3;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    private final c current;

    public b(c current) {
        i.e(current, "current");
        this.current = current;
    }

    public final c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
