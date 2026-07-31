package i3;

import g2.InterfaceC0391a;
import h3.EnumC0407c;
import h3.EnumC0408d;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class d extends AbstractC0426a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f dataRepository, InterfaceC0391a timeProvider) {
        super(dataRepository, timeProvider);
        i.e(dataRepository, "dataRepository");
        i.e(timeProvider, "timeProvider");
    }

    @Override // i3.AbstractC0426a, i3.InterfaceC0427b
    public void cacheState() {
        EnumC0408d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = EnumC0408d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == EnumC0408d.DIRECT) {
            influenceType = EnumC0408d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // i3.AbstractC0426a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // i3.AbstractC0426a, i3.InterfaceC0427b
    public EnumC0407c getChannelType() {
        return EnumC0407c.IAM;
    }

    @Override // i3.AbstractC0426a, i3.InterfaceC0427b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // i3.AbstractC0426a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // i3.AbstractC0426a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // i3.AbstractC0426a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i7 = 0; i7 < length; i7++) {
                    if (!i.a(str, lastChannelObjects.getJSONObject(i7).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i7));
                    }
                }
                return jSONArray;
            } catch (JSONException e4) {
                com.onesignal.debug.internal.logging.b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e4);
                return lastChannelObjects;
            }
        } catch (JSONException e7) {
            com.onesignal.debug.internal.logging.b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e7);
            return new JSONArray();
        }
    }

    @Override // i3.AbstractC0426a
    public void initInfluencedTypeFromCache() {
        EnumC0408d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // i3.AbstractC0426a
    public void saveChannelObjects(JSONArray channelObjects) {
        i.e(channelObjects, "channelObjects");
        getDataRepository().saveIAMs(channelObjects);
    }
}
