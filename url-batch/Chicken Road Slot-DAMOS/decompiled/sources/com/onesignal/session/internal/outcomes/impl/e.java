package com.onesignal.session.internal.outcomes.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements qc.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final oc.d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public e(oc.d dVar, JSONArray jSONArray, String str, long j, long j3, float f3) {
        dVar.getClass();
        str.getClass();
        this.session = dVar;
        this.notificationIds = jSONArray;
        this.name = str;
        this.timestamp = j;
        this.sessionTime = j3;
        this.weight = f3;
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

    @Override // qc.a
    public String getName() {
        return this.name;
    }

    @Override // qc.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // qc.a
    public oc.d getSession() {
        return this.session;
    }

    @Override // qc.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // qc.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // qc.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int i3 = 1;
        for (int i10 = 0; i10 < 6; i10++) {
            Object obj = objArr[i10];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e fromOutcomeEventParamstoOutcomeEvent(f fVar) {
            JSONArray jSONArray;
            fVar.getClass();
            oc.d dVar = oc.d.UNATTRIBUTED;
            if (fVar.getOutcomeSource() != null) {
                m outcomeSource = fVar.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    directBody.getClass();
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        directBody2.getClass();
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        notificationIds.getClass();
                        if (notificationIds.length() > 0) {
                            dVar = oc.d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            directBody3.getClass();
                            jSONArray = directBody3.getNotificationIds();
                            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    n indirectBody = outcomeSource.getIndirectBody();
                    indirectBody.getClass();
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody2 = outcomeSource.getIndirectBody();
                        indirectBody2.getClass();
                        JSONArray notificationIds2 = indirectBody2.getNotificationIds();
                        notificationIds2.getClass();
                        if (notificationIds2.length() > 0) {
                            dVar = oc.d.INDIRECT;
                            n indirectBody3 = outcomeSource.getIndirectBody();
                            indirectBody3.getClass();
                            jSONArray = indirectBody3.getNotificationIds();
                            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
        }

        private a() {
        }
    }
}
