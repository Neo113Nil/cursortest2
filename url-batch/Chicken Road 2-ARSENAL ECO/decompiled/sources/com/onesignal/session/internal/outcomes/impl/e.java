package com.onesignal.session.internal.outcomes.impl;

import h3.EnumC0408d;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements j3.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final EnumC0408d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final e fromOutcomeEventParamstoOutcomeEvent(f outcomeEventParams) {
            JSONArray jSONArray;
            kotlin.jvm.internal.i.e(outcomeEventParams, "outcomeEventParams");
            EnumC0408d enumC0408d = EnumC0408d.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                m outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    kotlin.jvm.internal.i.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        kotlin.jvm.internal.i.b(directBody2);
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        kotlin.jvm.internal.i.b(notificationIds);
                        if (notificationIds.length() > 0) {
                            enumC0408d = EnumC0408d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            kotlin.jvm.internal.i.b(directBody3);
                            jSONArray = directBody3.getNotificationIds();
                            return new e(enumC0408d, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    n indirectBody = outcomeSource.getIndirectBody();
                    kotlin.jvm.internal.i.b(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody2 = outcomeSource.getIndirectBody();
                        kotlin.jvm.internal.i.b(indirectBody2);
                        JSONArray notificationIds2 = indirectBody2.getNotificationIds();
                        kotlin.jvm.internal.i.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            enumC0408d = EnumC0408d.INDIRECT;
                            n indirectBody3 = outcomeSource.getIndirectBody();
                            kotlin.jvm.internal.i.b(indirectBody3);
                            jSONArray = indirectBody3.getNotificationIds();
                            return new e(enumC0408d, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new e(enumC0408d, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }

        private a() {
        }
    }

    public e(EnumC0408d session, JSONArray jSONArray, String name, long j4, long j7, float f7) {
        kotlin.jvm.internal.i.e(session, "session");
        kotlin.jvm.internal.i.e(name, "name");
        this.session = session;
        this.notificationIds = jSONArray;
        this.name = name;
        this.timestamp = j4;
        this.sessionTime = j7;
        this.weight = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            if (getSession() == eVar.getSession() && kotlin.jvm.internal.i.a(getNotificationIds(), eVar.getNotificationIds()) && kotlin.jvm.internal.i.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime() && getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // j3.a
    public String getName() {
        return this.name;
    }

    @Override // j3.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // j3.a
    public EnumC0408d getSession() {
        return this.session;
    }

    @Override // j3.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // j3.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // j3.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int i7 = 1;
        for (int i8 = 0; i8 < 6; i8++) {
            Object obj = objArr[i8];
            i7 = (i7 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i7;
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
