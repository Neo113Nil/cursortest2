package W5;

import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    private final String externalId;
    private final String onesignalId;

    public c(String onesignalId, String externalId) {
        h.e(onesignalId, "onesignalId");
        h.e(externalId, "externalId");
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
        h.d(put, "put(...)");
        return put;
    }
}
