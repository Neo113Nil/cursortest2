package Z3;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    private final c current;

    public b(c current) {
        Intrinsics.checkNotNullParameter(current, "current");
        this.current = current;
    }

    public final c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }
}
