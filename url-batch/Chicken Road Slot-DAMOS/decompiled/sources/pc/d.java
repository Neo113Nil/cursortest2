package pc;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, sa.a aVar) {
        super(fVar, aVar);
        fVar.getClass();
        aVar.getClass();
    }

    @Override // pc.a, pc.b
    public void cacheState() {
        oc.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = oc.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == oc.d.DIRECT) {
            influenceType = oc.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // pc.a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // pc.a, pc.b
    public oc.c getChannelType() {
        return oc.c.IAM;
    }

    @Override // pc.a, pc.b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // pc.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // pc.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // pc.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i3 = 0; i3 < length; i3++) {
                    if (!Intrinsics.a(str, lastChannelObjects.getJSONObject(i3).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i3));
                    }
                }
                return jSONArray;
            } catch (JSONException e2) {
                com.onesignal.debug.internal.logging.b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e2);
                return lastChannelObjects;
            }
        } catch (JSONException e9) {
            com.onesignal.debug.internal.logging.b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e9);
            return new JSONArray();
        }
    }

    @Override // pc.a
    public void initInfluencedTypeFromCache() {
        oc.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // pc.a
    public void saveChannelObjects(JSONArray jSONArray) {
        jSONArray.getClass();
        getDataRepository().saveIAMs(jSONArray);
    }
}
