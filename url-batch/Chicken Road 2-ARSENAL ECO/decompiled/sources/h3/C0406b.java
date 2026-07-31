package h3;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406b {
    public static final a Companion = new a(null);
    public static final String INFLUENCE_CHANNEL = "influence_channel";
    public static final String INFLUENCE_IDS = "influence_ids";
    public static final String INFLUENCE_TYPE = "influence_type";
    private JSONArray ids;
    private EnumC0407c influenceChannel;
    private EnumC0408d influenceType;

    /* renamed from: h3.b$a */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public C0406b(String jsonString) {
        i.e(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String string3 = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = EnumC0407c.Companion.fromString(string);
        this.influenceType = EnumC0408d.Companion.fromString(string2);
        i.b(string3);
        this.ids = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final C0406b copy() {
        return new C0406b(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0406b.class.equals(obj.getClass())) {
            C0406b c0406b = (C0406b) obj;
            if (this.influenceChannel == c0406b.influenceChannel && this.influenceType == c0406b.influenceType) {
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

    public final EnumC0407c getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final EnumC0408d getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return this.influenceType.hashCode() + (this.influenceChannel.hashCode() * 31);
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(EnumC0408d enumC0408d) {
        i.e(enumC0408d, "<set-?>");
        this.influenceType = enumC0408d;
    }

    public final String toJSONString() {
        JSONObject put = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String jSONObject = put.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        i.d(jSONObject, "toString(...)");
        return jSONObject;
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    public C0406b(EnumC0407c influenceChannel, EnumC0408d influenceType, JSONArray jSONArray) {
        i.e(influenceChannel, "influenceChannel");
        i.e(influenceType, "influenceType");
        this.influenceChannel = influenceChannel;
        this.influenceType = influenceType;
        this.ids = jSONArray;
    }
}
