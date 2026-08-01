package oc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);
    public static final String INFLUENCE_CHANNEL = "influence_channel";
    public static final String INFLUENCE_IDS = "influence_ids";
    public static final String INFLUENCE_TYPE = "influence_type";
    private JSONArray ids;
    private c influenceChannel;
    private d influenceType;

    public b(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String string3 = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = c.Companion.fromString(string);
        this.influenceType = d.Companion.fromString(string2);
        string3.getClass();
        this.ids = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final b copy() {
        return new b(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class.equals(obj.getClass())) {
            b bVar = (b) obj;
            if (this.influenceChannel == bVar.influenceChannel && this.influenceType == bVar.influenceType) {
                return true;
            }
        }
        return false;
    }

    public final String getDirectId() {
        JSONArray jSONArray = this.ids;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    public final JSONArray getIds() {
        return this.ids;
    }

    public final c getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final d getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return this.influenceType.hashCode() + (this.influenceChannel.hashCode() * 31);
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(d dVar) {
        dVar.getClass();
        this.influenceType = dVar;
    }

    public final String toJSONString() {
        JSONObject put = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String jSONObject = put.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        jSONObject.getClass();
        return jSONObject;
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(c cVar, d dVar, JSONArray jSONArray) {
        cVar.getClass();
        dVar.getClass();
        this.influenceChannel = cVar;
        this.influenceType = dVar;
        this.ids = jSONArray;
    }
}
