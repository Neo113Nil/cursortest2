package fd;

import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    private final g current;
    private final g previous;

    public f(g gVar, g gVar2) {
        gVar.getClass();
        gVar2.getClass();
        this.previous = gVar;
        this.current = gVar2;
    }

    public final g getCurrent() {
        return this.current;
    }

    public final g getPrevious() {
        return this.previous;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("previous", this.previous.toJSONObject()).put("current", this.current.toJSONObject());
        put.getClass();
        return put;
    }
}
