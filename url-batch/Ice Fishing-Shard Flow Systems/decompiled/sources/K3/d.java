package K3;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f dataRepository, I2.a timeProvider) {
        super(dataRepository, timeProvider);
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
    }

    @Override // K3.a, K3.b
    public void cacheState() {
        J3.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = J3.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == J3.d.DIRECT) {
            influenceType = J3.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // K3.a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // K3.a, K3.b
    public J3.c getChannelType() {
        return J3.c.IAM;
    }

    @Override // K3.a, K3.b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // K3.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // K3.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // K3.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (!Intrinsics.a(str, lastChannelObjects.getJSONObject(i2).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i2));
                    }
                }
                return jSONArray;
            } catch (JSONException e7) {
                com.onesignal.debug.internal.logging.b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e7);
                return lastChannelObjects;
            }
        } catch (JSONException e8) {
            com.onesignal.debug.internal.logging.b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e8);
            return new JSONArray();
        }
    }

    @Override // K3.a
    public void initInfluencedTypeFromCache() {
        J3.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // K3.a
    public void saveChannelObjects(JSONArray channelObjects) {
        Intrinsics.checkNotNullParameter(channelObjects, "channelObjects");
        getDataRepository().saveIAMs(channelObjects);
    }
}
