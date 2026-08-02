package com.squareup.protos.cash.incidentalerts.app.v1;

import com.squareup.protos.cash.incidentalerts.app.v1.Incident;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Incident$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Incident.Status.Companion.getClass();
        if (i == 0) {
            return Incident.Status.INCIDENT_UNSPECIFIED;
        }
        if (i == 1) {
            return Incident.Status.INVESTIGATING;
        }
        if (i == 2) {
            return Incident.Status.IDENTIFIED;
        }
        if (i != 3) {
            return null;
        }
        return Incident.Status.RESOLVED;
    }
}
