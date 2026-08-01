package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    private final String outcomeId;
    private final m outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String str, m mVar, float f3, long j, long j3) {
        str.getClass();
        this.outcomeId = str;
        this.outcomeSource = mVar;
        this.weight = f3;
        this.sessionTime = j;
        this.timestamp = j3;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final m getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        m mVar = this.outcomeSource;
        if (mVar != null) {
            return mVar.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null;
        }
        return true;
    }

    public final void setSessionTime(long j) {
        this.sessionTime = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setWeight(float f3) {
        this.weight = f3;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.outcomeId);
        m mVar = this.outcomeSource;
        if (mVar != null) {
            put.put("sources", mVar.toJSONObject());
        }
        float f3 = this.weight;
        if (f3 > 0.0f) {
            put.put("weight", Float.valueOf(f3));
        }
        long j = this.timestamp;
        if (j > 0) {
            put.put("timestamp", j);
        }
        long j3 = this.sessionTime;
        if (j3 > 0) {
            put.put("session_time", j3);
        }
        put.getClass();
        return put;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
