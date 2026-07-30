package com.onesignal.session.internal.outcomes.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements L3.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final J3.d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e fromOutcomeEventParamstoOutcomeEvent(f outcomeEventParams) {
            JSONArray jSONArray;
            Intrinsics.checkNotNullParameter(outcomeEventParams, "outcomeEventParams");
            J3.d dVar = J3.d.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                m outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    Intrinsics.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        Intrinsics.b(directBody2);
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        Intrinsics.b(notificationIds);
                        if (notificationIds.length() > 0) {
                            dVar = J3.d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            Intrinsics.b(directBody3);
                            jSONArray = directBody3.getNotificationIds();
                            return new e(dVar, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    n indirectBody = outcomeSource.getIndirectBody();
                    Intrinsics.b(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody2 = outcomeSource.getIndirectBody();
                        Intrinsics.b(indirectBody2);
                        JSONArray notificationIds2 = indirectBody2.getNotificationIds();
                        Intrinsics.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            dVar = J3.d.INDIRECT;
                            n indirectBody3 = outcomeSource.getIndirectBody();
                            Intrinsics.b(indirectBody3);
                            jSONArray = indirectBody3.getNotificationIds();
                            return new e(dVar, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new e(dVar, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }

        private a() {
        }
    }

    public e(J3.d session, JSONArray jSONArray, String name, long j, long j7, float f7) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        this.session = session;
        this.notificationIds = jSONArray;
        this.name = name;
        this.timestamp = j;
        this.sessionTime = j7;
        this.weight = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            if (getSession() == eVar.getSession() && Intrinsics.a(getNotificationIds(), eVar.getNotificationIds()) && Intrinsics.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime() && getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // L3.a
    public String getName() {
        return this.name;
    }

    @Override // L3.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // L3.a
    public J3.d getSession() {
        return this.session;
    }

    @Override // L3.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // L3.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // L3.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int i2 = 1;
        for (int i5 = 0; i5 < 6; i5++) {
            Object obj = objArr[i5];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put(OUTCOME_ID, getName());
        jSONObject.put(TIMESTAMP, getTimestamp());
        jSONObject.put(SESSION_TIME, getSessionTime());
        jSONObject.put(WEIGHT, Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
