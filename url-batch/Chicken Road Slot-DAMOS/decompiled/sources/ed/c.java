package ed;

import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private final String externalId;
    private final String onesignalId;

    public c(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.onesignalId = str;
        this.externalId = str2;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        put.getClass();
        return put;
    }
}
