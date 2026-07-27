package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.IOutcomeEvent;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OutcomeEvent implements IOutcomeEvent {
    public static final Companion Companion = new Companion(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final InfluenceType session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final OutcomeEvent fromOutcomeEventParamstoOutcomeEvent(OutcomeEventParams outcomeEventParams) {
            JSONArray jSONArray;
            i.e(outcomeEventParams, "outcomeEventParams");
            InfluenceType influenceType = InfluenceType.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                OutcomeSource outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    OutcomeSourceBody directBody = outcomeSource.getDirectBody();
                    i.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        OutcomeSourceBody directBody2 = outcomeSource.getDirectBody();
                        i.b(directBody2);
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        i.b(notificationIds);
                        if (notificationIds.length() > 0) {
                            influenceType = InfluenceType.DIRECT;
                            OutcomeSourceBody directBody3 = outcomeSource.getDirectBody();
                            i.b(directBody3);
                            jSONArray = directBody3.getNotificationIds();
                            return new OutcomeEvent(influenceType, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    OutcomeSourceBody indirectBody = outcomeSource.getIndirectBody();
                    i.b(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        OutcomeSourceBody indirectBody2 = outcomeSource.getIndirectBody();
                        i.b(indirectBody2);
                        JSONArray notificationIds2 = indirectBody2.getNotificationIds();
                        i.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            influenceType = InfluenceType.INDIRECT;
                            OutcomeSourceBody indirectBody3 = outcomeSource.getIndirectBody();
                            i.b(indirectBody3);
                            jSONArray = indirectBody3.getNotificationIds();
                            return new OutcomeEvent(influenceType, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new OutcomeEvent(influenceType, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }

        private Companion() {
        }
    }

    public OutcomeEvent(InfluenceType session, JSONArray jSONArray, String name, long j2, long j6, float f3) {
        i.e(session, "session");
        i.e(name, "name");
        this.session = session;
        this.notificationIds = jSONArray;
        this.name = name;
        this.timestamp = j2;
        this.sessionTime = j6;
        this.weight = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !OutcomeEvent.class.equals(obj.getClass())) {
            return false;
        }
        OutcomeEvent outcomeEvent = (OutcomeEvent) obj;
        return getSession() == outcomeEvent.getSession() && i.a(getNotificationIds(), outcomeEvent.getNotificationIds()) && i.a(getName(), outcomeEvent.getName()) && getTimestamp() == outcomeEvent.getTimestamp() && getSessionTime() == outcomeEvent.getSessionTime() && getWeight() == outcomeEvent.getWeight();
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public String getName() {
        return this.name;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public InfluenceType getSession() {
        return this.session;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.onesignal.session.internal.outcomes.IOutcomeEvent
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int i2 = 1;
        for (int i3 = 0; i3 < 6; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session", getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put("id", getName());
        jSONObject.put("timestamp", getTimestamp());
        jSONObject.put("session_time", getSessionTime());
        jSONObject.put("weight", Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
