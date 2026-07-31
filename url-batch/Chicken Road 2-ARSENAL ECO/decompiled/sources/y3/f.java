package y3;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {
    private final g current;
    private final g previous;

    public f(g previous, g current) {
        i.e(previous, "previous");
        i.e(current, "current");
        this.previous = previous;
        this.current = current;
    }

    public final g getCurrent() {
        return this.current;
    }

    public final g getPrevious() {
        return this.previous;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("previous", this.previous.toJSONObject()).put("current", this.current.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
