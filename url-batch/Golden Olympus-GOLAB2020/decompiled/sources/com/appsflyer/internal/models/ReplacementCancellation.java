package com.appsflyer.internal.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class ReplacementCancellation {
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion implements Deserialize<ReplacementCancellation> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final ReplacementCancellation fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            return new ReplacementCancellation();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(ReplacementCancellation.class, obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return ReplacementCancellation.class.hashCode();
    }
}
