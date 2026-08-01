package pc;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a implements b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private oc.d influenceType;
    private sa.a timeProvider;

    public a(f fVar, sa.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this.dataRepository = fVar;
        this.timeProvider = aVar;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    @Override // pc.b
    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (getInfluenceType() == aVar.getInfluenceType() && Intrinsics.a(aVar.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // pc.b
    public abstract /* synthetic */ oc.c getChannelType();

    @Override // pc.b
    public oc.b getCurrentSessionInfluence() {
        oc.c channelType = getChannelType();
        oc.d dVar = oc.d.DISABLED;
        oc.b bVar = new oc.b(channelType, dVar, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        oc.d influenceType = getInfluenceType();
        if (influenceType != null) {
            dVar = influenceType;
        }
        if (dVar.isDirect()) {
            if (isDirectSessionEnabled()) {
                bVar.setIds(new JSONArray().put(getDirectId()));
                bVar.setInfluenceType(oc.d.DIRECT);
                return bVar;
            }
        } else if (dVar.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                bVar.setIds(getIndirectIds());
                bVar.setInfluenceType(oc.d.INDIRECT);
                return bVar;
            }
        } else if (isUnattributedSessionEnabled()) {
            bVar.setInfluenceType(oc.d.UNATTRIBUTED);
        }
        return bVar;
    }

    public final f getDataRepository() {
        return this.dataRepository;
    }

    @Override // pc.b
    public String getDirectId() {
        return this.directId;
    }

    @Override // pc.b
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // pc.b
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // pc.b
    public oc.d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // pc.b
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i3);
                if (currentTimeMillis - jSONObject.getLong(e.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
            return jSONArray;
        } catch (JSONException e2) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e2);
            return jSONArray;
        }
    }

    public int hashCode() {
        oc.d influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // pc.b
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? oc.d.INDIRECT : oc.d.UNATTRIBUTED);
        cacheState();
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // pc.b
    public void saveLastId(String str) {
        StringBuilder q3 = v4.a.q("ChannelTracker.saveLastId(id: ", str, "): idTag=");
        q3.append(getIdTag());
        com.onesignal.debug.internal.logging.b.debug$default(q3.toString(), null, 2, null);
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
        try {
            lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put(e.TIME, this.timeProvider.getCurrentTimeMillis()));
            if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjectsReceivedByNewId.length();
                for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                    try {
                        jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                    } catch (JSONException e2) {
                        com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e2);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e9) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e9);
        }
    }

    public final void setDataRepository(f fVar) {
        fVar.getClass();
        this.dataRepository = fVar;
    }

    @Override // pc.b
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // pc.b
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // pc.b
    public void setInfluenceType(oc.d dVar) {
        this.influenceType = dVar;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
