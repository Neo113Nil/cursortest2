package com.appsflyer.internal.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class SystemInitiatedCancellation {
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion implements Deserialize<SystemInitiatedCancellation> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final SystemInitiatedCancellation fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            return new SystemInitiatedCancellation();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(SystemInitiatedCancellation.class, obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return SystemInitiatedCancellation.class.hashCode();
    }
}
