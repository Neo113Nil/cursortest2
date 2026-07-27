package com.onesignal.session.internal.influence.impl;

import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class InAppMessageTracker extends ChannelTracker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageTracker(InfluenceDataRepository dataRepository, ITime timeProvider) {
        super(dataRepository, timeProvider);
        i.e(dataRepository, "dataRepository");
        i.e(timeProvider, "timeProvider");
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public void cacheState() {
        InfluenceType influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = InfluenceType.UNATTRIBUTED;
        }
        InfluenceDataRepository dataRepository = getDataRepository();
        if (influenceType == InfluenceType.DIRECT) {
            influenceType = InfluenceType.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public InfluenceChannel getChannelType() {
        return InfluenceChannel.IAM;
    }

    @Override // com.onesignal.session.internal.influence.impl.IChannelTracker
    public String getIdTag() {
        return InfluenceConstants.IAM_ID_TAG;
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (!i.a(str, lastChannelObjects.getJSONObject(i2).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i2));
                    }
                }
                return jSONArray;
            } catch (JSONException e3) {
                Logging.error("Generating tracker lastChannelObjectReceived get JSONObject ", e3);
                return lastChannelObjects;
            }
        } catch (JSONException e6) {
            Logging.error("Generating IAM tracker getLastChannelObjects JSONObject ", e6);
            return new JSONArray();
        }
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public void initInfluencedTypeFromCache() {
        InfluenceType iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        Logging.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // com.onesignal.session.internal.influence.impl.ChannelTracker
    public void saveChannelObjects(JSONArray channelObjects) {
        i.e(channelObjects, "channelObjects");
        getDataRepository().saveIAMs(channelObjects);
    }
}
