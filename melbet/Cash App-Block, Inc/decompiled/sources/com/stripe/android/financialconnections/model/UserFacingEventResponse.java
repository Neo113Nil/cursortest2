package com.stripe.android.financialconnections.model;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class UserFacingEventResponse {
    public static final Companion Companion = new Companion();
    public final Error error;
    public final InstitutionSelected institutionSelected;
    public final Success success;

    /* renamed from: type, reason: collision with root package name */
    public final String f1434type;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return UserFacingEventResponse$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class Error {
        public static final Companion Companion = new Companion();
        public final String errorCode;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse$Error$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return UserFacingEventResponse$Error$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Error(int i, String str) {
            if (1 == (i & 1)) {
                this.errorCode = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, UserFacingEventResponse$Error$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.errorCode, ((Error) obj).errorCode);
        }

        public final int hashCode() {
            return this.errorCode.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(errorCode=", this.errorCode, ")");
        }
    }

    @Serializable
    public final class InstitutionSelected {
        public static final Companion Companion = new Companion();
        public final String institutionName;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InstitutionSelected(int i, String str) {
            if (1 == (i & 1)) {
                this.institutionName = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstitutionSelected) && Intrinsics.areEqual(this.institutionName, ((InstitutionSelected) obj).institutionName);
        }

        public final int hashCode() {
            return this.institutionName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstitutionSelected(institutionName=", this.institutionName, ")");
        }
    }

    @Serializable
    public final class Success {
        public static final Companion Companion = new Companion();
        public final boolean manualEntry;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse$Success$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return UserFacingEventResponse$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, boolean z) {
            if (1 == (i & 1)) {
                this.manualEntry = z;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, UserFacingEventResponse$Success$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.manualEntry == ((Success) obj).manualEntry;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.manualEntry);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Success(manualEntry=", ")", this.manualEntry);
        }
    }

    public /* synthetic */ UserFacingEventResponse(int i, String str, InstitutionSelected institutionSelected, Error error, Success success) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, UserFacingEventResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f1434type = str;
        if ((i & 2) == 0) {
            this.institutionSelected = null;
        } else {
            this.institutionSelected = institutionSelected;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = error;
        }
        if ((i & 8) == 0) {
            this.success = null;
        } else {
            this.success = success;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFacingEventResponse)) {
            return false;
        }
        UserFacingEventResponse userFacingEventResponse = (UserFacingEventResponse) obj;
        return Intrinsics.areEqual(this.f1434type, userFacingEventResponse.f1434type) && Intrinsics.areEqual(this.institutionSelected, userFacingEventResponse.institutionSelected) && Intrinsics.areEqual(this.error, userFacingEventResponse.error) && Intrinsics.areEqual(this.success, userFacingEventResponse.success);
    }

    public final int hashCode() {
        int hashCode = this.f1434type.hashCode() * 31;
        InstitutionSelected institutionSelected = this.institutionSelected;
        int hashCode2 = (hashCode + (institutionSelected == null ? 0 : institutionSelected.institutionName.hashCode())) * 31;
        Error error = this.error;
        int hashCode3 = (hashCode2 + (error == null ? 0 : error.errorCode.hashCode())) * 31;
        Success success = this.success;
        return hashCode3 + (success != null ? Boolean.hashCode(success.manualEntry) : 0);
    }

    public final String toString() {
        return "UserFacingEventResponse(type=" + this.f1434type + ", institutionSelected=" + this.institutionSelected + ", error=" + this.error + ", success=" + this.success + ")";
    }
}
