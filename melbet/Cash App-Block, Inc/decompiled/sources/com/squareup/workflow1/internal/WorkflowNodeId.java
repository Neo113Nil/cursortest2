package com.squareup.workflow1.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.workflow1.WorkflowIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WorkflowNodeId {
    public final WorkflowIdentifier identifier;
    public final String name;

    public WorkflowNodeId(WorkflowIdentifier workflowIdentifier, String str) {
        str.getClass();
        this.identifier = workflowIdentifier;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowNodeId)) {
            return false;
        }
        WorkflowNodeId workflowNodeId = (WorkflowNodeId) obj;
        return this.identifier.equals(workflowNodeId.identifier) && Intrinsics.areEqual(this.name, workflowNodeId.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.identifier.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkflowNodeId(identifier=");
        sb.append(this.identifier);
        sb.append(", name=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.name, ')');
    }
}
