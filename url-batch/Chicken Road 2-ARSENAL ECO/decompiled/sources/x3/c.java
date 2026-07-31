package x3;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    private final String externalId;
    private final String onesignalId;

    public c(String onesignalId, String externalId) {
        i.e(onesignalId, "onesignalId");
        i.e(externalId, "externalId");
        this.onesignalId = onesignalId;
        this.externalId = externalId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        i.d(put, "put(...)");
        return put;
    }
}
