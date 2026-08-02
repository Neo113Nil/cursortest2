package com.squareup.cash.work.tinygraph;

import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BaseEntityOperation {
    public final IBaseEntity entity;

    public BaseEntityOperation(IBaseEntity iBaseEntity) {
        EntityOperationType entityOperationType = EntityOperationType.UPSERT;
        iBaseEntity.getClass();
        this.entity = iBaseEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseEntityOperation) || !Intrinsics.areEqual(this.entity, ((BaseEntityOperation) obj).entity)) {
            return false;
        }
        EntityOperationType entityOperationType = EntityOperationType.UPSERT;
        return true;
    }

    public final int hashCode() {
        return EntityOperationType.UPSERT.hashCode() + (this.entity.hashCode() * 31);
    }

    public final String toString() {
        return "BaseEntityOperation(entity=" + this.entity + ", entityOperationType=" + EntityOperationType.UPSERT + ")";
    }
}
