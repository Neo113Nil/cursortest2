package com.squareup.protos.cash.grantly.api;

import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$Metadata$AgentConnection extends HttpHeaderParser {
    public final Action.OAuth.Metadata.AgentConnection value;

    public Action$OAuth$Metadata$Metadata$AgentConnection(Action.OAuth.Metadata.AgentConnection agentConnection) {
        agentConnection.getClass();
        this.value = agentConnection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OAuth$Metadata$Metadata$AgentConnection) && Intrinsics.areEqual(this.value, ((Action$OAuth$Metadata$Metadata$AgentConnection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AgentConnection(value=" + this.value + ")";
    }
}
