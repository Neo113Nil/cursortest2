package i3;

import g2.InterfaceC0391a;
import h3.C0406b;
import h3.EnumC0407c;
import h3.EnumC0408d;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426a implements InterfaceC0427b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private EnumC0408d influenceType;
    private InterfaceC0391a timeProvider;

    public AbstractC0426a(f dataRepository, InterfaceC0391a timeProvider) {
        i.e(dataRepository, "dataRepository");
        i.e(timeProvider, "timeProvider");
        this.dataRepository = dataRepository;
        this.timeProvider = timeProvider;
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

    @Override // i3.InterfaceC0427b
    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            AbstractC0426a abstractC0426a = (AbstractC0426a) obj;
            if (getInfluenceType() == abstractC0426a.getInfluenceType() && i.a(abstractC0426a.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // i3.InterfaceC0427b
    public abstract /* synthetic */ EnumC0407c getChannelType();

    @Override // i3.InterfaceC0427b
    public C0406b getCurrentSessionInfluence() {
        EnumC0407c channelType = getChannelType();
        EnumC0408d enumC0408d = EnumC0408d.DISABLED;
        C0406b c0406b = new C0406b(channelType, enumC0408d, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        EnumC0408d influenceType = getInfluenceType();
        if (influenceType != null) {
            enumC0408d = influenceType;
        }
        if (enumC0408d.isDirect()) {
            if (isDirectSessionEnabled()) {
                c0406b.setIds(new JSONArray().put(getDirectId()));
                c0406b.setInfluenceType(EnumC0408d.DIRECT);
                return c0406b;
            }
        } else if (enumC0408d.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                c0406b.setIds(getIndirectIds());
                c0406b.setInfluenceType(EnumC0408d.INDIRECT);
                return c0406b;
            }
        } else if (isUnattributedSessionEnabled()) {
            c0406b.setInfluenceType(EnumC0408d.UNATTRIBUTED);
        }
        return c0406b;
    }

    public final f getDataRepository() {
        return this.dataRepository;
    }

    @Override // i3.InterfaceC0427b
    public String getDirectId() {
        return this.directId;
    }

    @Override // i3.InterfaceC0427b
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // i3.InterfaceC0427b
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // i3.InterfaceC0427b
    public EnumC0408d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // i3.InterfaceC0427b
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i7);
                if (currentTimeMillis - jSONObject.getLong(e.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
            return jSONArray;
        } catch (JSONException e4) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e4);
            return jSONArray;
        }
    }

    public int hashCode() {
        EnumC0408d influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // i3.InterfaceC0427b
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? EnumC0408d.INDIRECT : EnumC0408d.UNATTRIBUTED);
        cacheState();
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // i3.InterfaceC0427b
    public void saveLastId(String str) {
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId(id: " + str + "): idTag=" + getIdTag(), null, 2, null);
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
                    } catch (JSONException e4) {
                        com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e4);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e7) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e7);
        }
    }

    public final void setDataRepository(f fVar) {
        i.e(fVar, "<set-?>");
        this.dataRepository = fVar;
    }

    @Override // i3.InterfaceC0427b
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // i3.InterfaceC0427b
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // i3.InterfaceC0427b
    public void setInfluenceType(EnumC0408d enumC0408d) {
        this.influenceType = enumC0408d;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
