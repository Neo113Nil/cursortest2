package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m {
    private n directBody;
    private n indirectBody;

    public m(n nVar, n nVar2) {
        this.directBody = nVar;
        this.indirectBody = nVar2;
    }

    public final n getDirectBody() {
        return this.directBody;
    }

    public final n getIndirectBody() {
        return this.indirectBody;
    }

    /* renamed from: setDirectBody, reason: collision with other method in class */
    public final void m39setDirectBody(n nVar) {
        this.directBody = nVar;
    }

    /* renamed from: setIndirectBody, reason: collision with other method in class */
    public final void m40setIndirectBody(n nVar) {
        this.indirectBody = nVar;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        n nVar = this.directBody;
        if (nVar != null) {
            jSONObject.put(H5.e.DIRECT_TAG, nVar.toJSONObject());
        }
        n nVar2 = this.indirectBody;
        if (nVar2 != null) {
            jSONObject.put("indirect", nVar2.toJSONObject());
        }
        return jSONObject;
    }

    public String toString() {
        return "OutcomeSource{directBody=" + this.directBody + ", indirectBody=" + this.indirectBody + '}';
    }

    public final m setDirectBody(n nVar) {
        this.directBody = nVar;
        return this;
    }

    public final m setIndirectBody(n nVar) {
        this.indirectBody = nVar;
        return this;
    }
}
