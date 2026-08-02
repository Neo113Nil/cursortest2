package com.stripe.android.financialconnections.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class AuthorizationRepairResponse {
    public static final Companion Companion = new Companion();
    public final Display display;
    public final String flow;
    public final String id;
    public final FinancialConnectionsInstitution institution;
    public final boolean isOAuth;
    public final String url;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/AuthorizationRepairResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AuthorizationRepairResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthorizationRepairResponse(int i, String str, String str2, String str3, FinancialConnectionsInstitution financialConnectionsInstitution, Display display, boolean z) {
        if (63 != (i & 63)) {
            TuplesKt.throwMissingFieldException(i, 63, AuthorizationRepairResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.url = str2;
        this.flow = str3;
        this.institution = financialConnectionsInstitution;
        this.display = display;
        this.isOAuth = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizationRepairResponse)) {
            return false;
        }
        AuthorizationRepairResponse authorizationRepairResponse = (AuthorizationRepairResponse) obj;
        return Intrinsics.areEqual(this.id, authorizationRepairResponse.id) && Intrinsics.areEqual(this.url, authorizationRepairResponse.url) && Intrinsics.areEqual(this.flow, authorizationRepairResponse.flow) && Intrinsics.areEqual(this.institution, authorizationRepairResponse.institution) && Intrinsics.areEqual(this.display, authorizationRepairResponse.display) && this.isOAuth == authorizationRepairResponse.isOAuth;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isOAuth) + ((this.display.hashCode() + ((this.institution.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.url), 31, this.flow)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthorizationRepairResponse(id=", this.id, ", url=", this.url, ", flow=");
        m.append(this.flow);
        m.append(", institution=");
        m.append(this.institution);
        m.append(", display=");
        m.append(this.display);
        m.append(", isOAuth=");
        m.append(this.isOAuth);
        m.append(")");
        return m.toString();
    }
}
