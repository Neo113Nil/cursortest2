package fd;

import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: id, reason: collision with root package name */
    private final String f4213id;
    private final boolean optedIn;
    private final String token;

    public g(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        this.f4213id = str;
        this.token = str2;
        this.optedIn = z10;
    }

    public final String getId() {
        return this.f4213id;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    public final String getToken() {
        return this.token;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.f4213id).put("token", this.token).put("optedIn", this.optedIn);
        put.getClass();
        return put;
    }
}
