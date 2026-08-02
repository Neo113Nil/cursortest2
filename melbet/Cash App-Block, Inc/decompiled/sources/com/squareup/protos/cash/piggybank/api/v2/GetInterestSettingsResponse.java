package com.squareup.protos.cash.piggybank.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.disputron.Pagination;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/piggybank/api/v2/GetInterestSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/moneta/api/v1_0/CashInRequest$Builder;", "Builder", "AdditionalEnablementScope", "PreviousInterestEnrollment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetInterestSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInterestSettingsResponse> CREATOR;
    public final AdditionalEnablementScope additional_enablement_scope;
    public final BackupWithholdingStatus backup_withholding_status;
    public final Integer current_apy_bips;
    public final YearMonthDay current_apy_effective_date;
    public final Integer current_enhanced_yield_apy_bips;
    public final Boolean eligible_for_savings_yield;
    public final String interest_enrollment_token;
    public final InterestYieldStatus interest_yield_status;
    public final List previous_interest_enrollments;
    public final ResolveBNoticeSubmissionStatus resolve_b_notice_submission_status;

    public enum AdditionalEnablementScope implements WireEnum {
        ADDITIONAL_ENABLEMENT_SCOPE_UNSPECIFIED(0),
        ADDITIONAL_ENABLEMENT_SCOPE_SELF(1),
        ADDITIONAL_ENABLEMENT_SCOPE_FAMILY(2);

        public static final GetInterestSettingsResponse$AdditionalEnablementScope$Companion$ADAPTER$1 ADAPTER;
        public static final TransactionType.Companion Companion;
        public final int value;

        static {
            AdditionalEnablementScope additionalEnablementScope = ADDITIONAL_ENABLEMENT_SCOPE_UNSPECIFIED;
            Companion = new TransactionType.Companion();
            ADAPTER = new GetInterestSettingsResponse$AdditionalEnablementScope$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AdditionalEnablementScope.class), Syntax.PROTO_2, additionalEnablementScope);
        }

        AdditionalEnablementScope(int i) {
            this.value = i;
        }

        public static final AdditionalEnablementScope fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ADDITIONAL_ENABLEMENT_SCOPE_UNSPECIFIED;
            }
            if (i == 1) {
                return ADDITIONAL_ENABLEMENT_SCOPE_SELF;
            }
            if (i != 2) {
                return null;
            }
            return ADDITIONAL_ENABLEMENT_SCOPE_FAMILY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class PreviousInterestEnrollment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PreviousInterestEnrollment> CREATOR;
        public final Long disabled_at;
        public final String interest_enrollment_token;

        static {
            GetInterestSettingsResponse$PreviousInterestEnrollment$Companion$ADAPTER$1 getInterestSettingsResponse$PreviousInterestEnrollment$Companion$ADAPTER$1 = new GetInterestSettingsResponse$PreviousInterestEnrollment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreviousInterestEnrollment.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.GetInterestSettingsResponse.PreviousInterestEnrollment", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/piggybank_service.proto");
            ADAPTER = getInterestSettingsResponse$PreviousInterestEnrollment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getInterestSettingsResponse$PreviousInterestEnrollment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreviousInterestEnrollment(String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.interest_enrollment_token = str;
            this.disabled_at = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PreviousInterestEnrollment)) {
                return false;
            }
            PreviousInterestEnrollment previousInterestEnrollment = (PreviousInterestEnrollment) obj;
            return Intrinsics.areEqual(unknownFields(), previousInterestEnrollment.unknownFields()) && Intrinsics.areEqual(this.interest_enrollment_token, previousInterestEnrollment.interest_enrollment_token) && Intrinsics.areEqual(this.disabled_at, previousInterestEnrollment.disabled_at);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.interest_enrollment_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.disabled_at;
            int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Pagination.Builder builder = new Pagination.Builder(7);
            builder.offset = this.interest_enrollment_token;
            builder.limit = this.disabled_at;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.interest_enrollment_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "interest_enrollment_token=", arrayList);
            }
            Long l = this.disabled_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("disabled_at=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PreviousInterestEnrollment{", "}", 0, null, null, 56);
        }
    }

    static {
        GetInterestSettingsResponse$Companion$ADAPTER$1 getInterestSettingsResponse$Companion$ADAPTER$1 = new GetInterestSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInterestSettingsResponse.class), "type.googleapis.com/squareup.cash.piggybank.api.v2.GetInterestSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/piggybank/api/v2/piggybank_service.proto");
        ADAPTER = getInterestSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInterestSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInterestSettingsResponse(InterestYieldStatus interestYieldStatus, Integer num, Integer num2, YearMonthDay yearMonthDay, Boolean bool, AdditionalEnablementScope additionalEnablementScope, String str, BackupWithholdingStatus backupWithholdingStatus, ResolveBNoticeSubmissionStatus resolveBNoticeSubmissionStatus, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.interest_yield_status = interestYieldStatus;
        this.current_apy_bips = num;
        this.current_enhanced_yield_apy_bips = num2;
        this.current_apy_effective_date = yearMonthDay;
        this.eligible_for_savings_yield = bool;
        this.additional_enablement_scope = additionalEnablementScope;
        this.interest_enrollment_token = str;
        this.backup_withholding_status = backupWithholdingStatus;
        this.resolve_b_notice_submission_status = resolveBNoticeSubmissionStatus;
        this.previous_interest_enrollments = TransactorKt.immutableCopyOf("previous_interest_enrollments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInterestSettingsResponse)) {
            return false;
        }
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInterestSettingsResponse.unknownFields()) && this.interest_yield_status == getInterestSettingsResponse.interest_yield_status && Intrinsics.areEqual(this.current_apy_bips, getInterestSettingsResponse.current_apy_bips) && Intrinsics.areEqual(this.current_enhanced_yield_apy_bips, getInterestSettingsResponse.current_enhanced_yield_apy_bips) && Intrinsics.areEqual(this.current_apy_effective_date, getInterestSettingsResponse.current_apy_effective_date) && Intrinsics.areEqual(this.eligible_for_savings_yield, getInterestSettingsResponse.eligible_for_savings_yield) && this.additional_enablement_scope == getInterestSettingsResponse.additional_enablement_scope && Intrinsics.areEqual(this.interest_enrollment_token, getInterestSettingsResponse.interest_enrollment_token) && this.backup_withholding_status == getInterestSettingsResponse.backup_withholding_status && this.resolve_b_notice_submission_status == getInterestSettingsResponse.resolve_b_notice_submission_status && Intrinsics.areEqual(this.previous_interest_enrollments, getInterestSettingsResponse.previous_interest_enrollments);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InterestYieldStatus interestYieldStatus = this.interest_yield_status;
        int hashCode2 = (hashCode + (interestYieldStatus != null ? interestYieldStatus.hashCode() : 0)) * 37;
        Integer num = this.current_apy_bips;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.current_enhanced_yield_apy_bips;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        YearMonthDay yearMonthDay = this.current_apy_effective_date;
        int hashCode5 = (hashCode4 + (yearMonthDay != null ? yearMonthDay.hashCode() : 0)) * 37;
        Boolean bool = this.eligible_for_savings_yield;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        AdditionalEnablementScope additionalEnablementScope = this.additional_enablement_scope;
        int hashCode7 = (hashCode6 + (additionalEnablementScope != null ? additionalEnablementScope.hashCode() : 0)) * 37;
        String str = this.interest_enrollment_token;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
        BackupWithholdingStatus backupWithholdingStatus = this.backup_withholding_status;
        int hashCode9 = (hashCode8 + (backupWithholdingStatus != null ? backupWithholdingStatus.hashCode() : 0)) * 37;
        ResolveBNoticeSubmissionStatus resolveBNoticeSubmissionStatus = this.resolve_b_notice_submission_status;
        int hashCode10 = this.previous_interest_enrollments.hashCode() + ((hashCode9 + (resolveBNoticeSubmissionStatus != null ? resolveBNoticeSubmissionStatus.hashCode() : 0)) * 37);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(14);
        builder.request_context = this.interest_yield_status;
        builder.passcode_token = this.current_apy_bips;
        builder.external_client_transfer_token = this.current_enhanced_yield_apy_bips;
        builder.source = this.current_apy_effective_date;
        builder.target = this.eligible_for_savings_yield;
        builder.amount = this.additional_enablement_scope;
        builder.external_id = this.interest_enrollment_token;
        builder.call_context = this.backup_withholding_status;
        builder.forwarded_call_context = this.resolve_b_notice_submission_status;
        builder.client_verified_digital_wallet = this.previous_interest_enrollments;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InterestYieldStatus interestYieldStatus = this.interest_yield_status;
        if (interestYieldStatus != null) {
            arrayList.add("interest_yield_status=" + interestYieldStatus);
        }
        Integer num = this.current_apy_bips;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("current_apy_bips=", num, arrayList);
        }
        Integer num2 = this.current_enhanced_yield_apy_bips;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("current_enhanced_yield_apy_bips=", num2, arrayList);
        }
        YearMonthDay yearMonthDay = this.current_apy_effective_date;
        if (yearMonthDay != null) {
            arrayList.add("current_apy_effective_date=" + yearMonthDay);
        }
        Boolean bool = this.eligible_for_savings_yield;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("eligible_for_savings_yield=", bool, arrayList);
        }
        AdditionalEnablementScope additionalEnablementScope = this.additional_enablement_scope;
        if (additionalEnablementScope != null) {
            arrayList.add("additional_enablement_scope=" + additionalEnablementScope);
        }
        String str = this.interest_enrollment_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "interest_enrollment_token=", arrayList);
        }
        BackupWithholdingStatus backupWithholdingStatus = this.backup_withholding_status;
        if (backupWithholdingStatus != null) {
            arrayList.add("backup_withholding_status=" + backupWithholdingStatus);
        }
        ResolveBNoticeSubmissionStatus resolveBNoticeSubmissionStatus = this.resolve_b_notice_submission_status;
        if (resolveBNoticeSubmissionStatus != null) {
            arrayList.add("resolve_b_notice_submission_status=" + resolveBNoticeSubmissionStatus);
        }
        List list = this.previous_interest_enrollments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("previous_interest_enrollments=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInterestSettingsResponse{", "}", 0, null, null, 56);
    }
}
