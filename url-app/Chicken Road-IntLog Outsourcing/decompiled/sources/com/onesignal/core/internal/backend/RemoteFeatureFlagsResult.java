package com.onesignal.core.internal.backend;

import Q4.y;
import g4.C0471p;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RemoteFeatureFlagsResult {
    public static final Companion Companion = new Companion(null);
    private static final RemoteFeatureFlagsResult EMPTY = new RemoteFeatureFlagsResult(C0471p.f5750a, null);
    private final List<String> enabledKeys;
    private final y metadata;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final RemoteFeatureFlagsResult getEMPTY() {
            return RemoteFeatureFlagsResult.EMPTY;
        }

        private Companion() {
        }
    }

    public RemoteFeatureFlagsResult(List<String> enabledKeys, y yVar) {
        i.e(enabledKeys, "enabledKeys");
        this.enabledKeys = enabledKeys;
        this.metadata = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteFeatureFlagsResult copy$default(RemoteFeatureFlagsResult remoteFeatureFlagsResult, List list, y yVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = remoteFeatureFlagsResult.enabledKeys;
        }
        if ((i2 & 2) != 0) {
            yVar = remoteFeatureFlagsResult.metadata;
        }
        return remoteFeatureFlagsResult.copy(list, yVar);
    }

    public final List<String> component1() {
        return this.enabledKeys;
    }

    public final y component2() {
        return this.metadata;
    }

    public final RemoteFeatureFlagsResult copy(List<String> enabledKeys, y yVar) {
        i.e(enabledKeys, "enabledKeys");
        return new RemoteFeatureFlagsResult(enabledKeys, yVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteFeatureFlagsResult)) {
            return false;
        }
        RemoteFeatureFlagsResult remoteFeatureFlagsResult = (RemoteFeatureFlagsResult) obj;
        return i.a(this.enabledKeys, remoteFeatureFlagsResult.enabledKeys) && i.a(this.metadata, remoteFeatureFlagsResult.metadata);
    }

    public final List<String> getEnabledKeys() {
        return this.enabledKeys;
    }

    public final y getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.enabledKeys.hashCode() * 31;
        y yVar = this.metadata;
        return hashCode + (yVar == null ? 0 : yVar.f2563a.hashCode());
    }

    public String toString() {
        return "RemoteFeatureFlagsResult(enabledKeys=" + this.enabledKeys + ", metadata=" + this.metadata + ')';
    }
}
