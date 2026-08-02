package com.squareup.protos.cash.incidentalerts.app.v1;

import com.squareup.protos.cash.incidentalerts.app.v1.Incident;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Incident$Workflow$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Incident.Workflow.Companion.getClass();
        if (i == 0) {
            return Incident.Workflow.WORKFLOW_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return Incident.Workflow.SEND_VIA_FLACK;
    }
}
