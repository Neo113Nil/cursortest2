package com.onesignal.core.internal.backend;

import com.onesignal.core.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;

/* compiled from: IFeatureFlagsBackendService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;", "", "enabledKeys", "", "", "metadata", "Lkotlinx/serialization/json/JsonObject;", "(Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)V", "getEnabledKeys", "()Ljava/util/List;", "getMetadata", "()Lkotlinx/serialization/json/JsonObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RemoteFeatureFlagsResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RemoteFeatureFlagsResult EMPTY = new RemoteFeatureFlagsResult(CollectionsKt.emptyList(), null);
    private final List<String> enabledKeys;
    private final JsonObject metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteFeatureFlagsResult copy$default(RemoteFeatureFlagsResult remoteFeatureFlagsResult, List list, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            list = remoteFeatureFlagsResult.enabledKeys;
        }
        if ((i & 2) != 0) {
            jsonObject = remoteFeatureFlagsResult.metadata;
        }
        return remoteFeatureFlagsResult.copy(list, jsonObject);
    }

    public final List<String> component1() {
        return this.enabledKeys;
    }

    /* renamed from: component2, reason: from getter */
    public final JsonObject getMetadata() {
        return this.metadata;
    }

    public final RemoteFeatureFlagsResult copy(List<String> enabledKeys, JsonObject metadata) {
        Intrinsics.checkNotNullParameter(enabledKeys, "enabledKeys");
        return new RemoteFeatureFlagsResult(enabledKeys, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteFeatureFlagsResult)) {
            return false;
        }
        RemoteFeatureFlagsResult remoteFeatureFlagsResult = (RemoteFeatureFlagsResult) other;
        return Intrinsics.areEqual(this.enabledKeys, remoteFeatureFlagsResult.enabledKeys) && Intrinsics.areEqual(this.metadata, remoteFeatureFlagsResult.metadata);
    }

    public int hashCode() {
        int hashCode = this.enabledKeys.hashCode() * 31;
        JsonObject jsonObject = this.metadata;
        return hashCode + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    public String toString() {
        return "RemoteFeatureFlagsResult(enabledKeys=" + this.enabledKeys + ", metadata=" + this.metadata + ')';
    }

    public RemoteFeatureFlagsResult(List<String> enabledKeys, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(enabledKeys, "enabledKeys");
        this.enabledKeys = enabledKeys;
        this.metadata = jsonObject;
    }

    public final List<String> getEnabledKeys() {
        return this.enabledKeys;
    }

    public final JsonObject getMetadata() {
        return this.metadata;
    }

    /* compiled from: IFeatureFlagsBackendService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult$Companion;", "", "()V", "EMPTY", "Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;", "getEMPTY", "()Lcom/onesignal/core/internal/backend/RemoteFeatureFlagsResult;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RemoteFeatureFlagsResult getEMPTY() {
            return RemoteFeatureFlagsResult.EMPTY;
        }
    }
}
