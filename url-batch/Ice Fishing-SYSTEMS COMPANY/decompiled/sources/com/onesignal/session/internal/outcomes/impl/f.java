package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {
    private final String outcomeId;
    private final m outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String outcomeId, m mVar, float f6, long j9, long j10) {
        kotlin.jvm.internal.h.e(outcomeId, "outcomeId");
        this.outcomeId = outcomeId;
        this.outcomeSource = mVar;
        this.weight = f6;
        this.sessionTime = j9;
        this.timestamp = j10;
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

    public final void setSessionTime(long j9) {
        this.sessionTime = j9;
    }

    public final void setTimestamp(long j9) {
        this.timestamp = j9;
    }

    public final void setWeight(float f6) {
        this.weight = f6;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.outcomeId);
        m mVar = this.outcomeSource;
        if (mVar != null) {
            put.put("sources", mVar.toJSONObject());
        }
        float f6 = this.weight;
        if (f6 > 0.0f) {
            put.put("weight", Float.valueOf(f6));
        }
        long j9 = this.timestamp;
        if (j9 > 0) {
            put.put(com.anythink.expressad.foundation.d.d.f18754u, j9);
        }
        long j10 = this.sessionTime;
        if (j10 > 0) {
            put.put("session_time", j10);
        }
        kotlin.jvm.internal.h.b(put);
        return put;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
