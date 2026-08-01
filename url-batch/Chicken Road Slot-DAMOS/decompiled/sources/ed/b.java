package ed;

import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    private final c current;

    public b(c cVar) {
        cVar.getClass();
        this.current = cVar;
    }

    public final c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        put.getClass();
        return put;
    }
}
