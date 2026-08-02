package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "", "", "id", "Lcom/squareup/cash/work/tinygraph/models/EntityType;", "entityType", "", "updatedAt", "<init>", "(Ljava/lang/String;Lcom/squareup/cash/work/tinygraph/models/EntityType;J)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Lcom/squareup/cash/work/tinygraph/models/EntityType;", "getEntityType", "()Lcom/squareup/cash/work/tinygraph/models/EntityType;", "getEntityType$annotations", "J", "getUpdatedAt", "()J", "getUpdatedAt$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public class EntityReference {
    public final EntityType entityType;
    public final String id;
    public final long updatedAt;

    public EntityReference(@Json(name = "id") String str, @Json(name = "entityType") EntityType entityType, @Json(name = "updatedAt") long j) {
        str.getClass();
        entityType.getClass();
        this.id = str;
        this.entityType = entityType;
        this.updatedAt = j;
    }

    @Json(name = "entityType")
    public static /* synthetic */ void getEntityType$annotations() {
    }

    @Json(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Json(name = "updatedAt")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public /* synthetic */ EntityReference(String str, EntityType entityType, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, entityType, (i & 4) != 0 ? 0L : j);
    }
}
