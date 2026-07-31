package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1581v4 {

    @Metadata
    /* renamed from: com.ironsource.v4$a */
    public static final class a implements InterfaceC1581v4 {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f19989a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.InterfaceC1581v4
        @NotNull
        public com.ironsource.mediationsdk.demandOnly.p a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject = this.f19989a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String optString = optJSONObject != null ? optJSONObject.optString("plumbus") : null;
            return optString != null ? new p.a(optString) : new p.b();
        }

        public a(@Nullable JSONObject jSONObject) {
            this.f19989a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    @NotNull
    com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str);
}
