package com.squareup.protos.cash.piggybank.api.v2;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.piggybank.api.v2.GetInterestSettingsResponse;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInterestSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInterestSettingsResponse((InterestYieldStatus) obj4, (Integer) obj5, (Integer) obj6, (YearMonthDay) obj7, (Boolean) obj8, (GetInterestSettingsResponse.AdditionalEnablementScope) obj9, (String) obj10, (BackupWithholdingStatus) obj11, (ResolveBNoticeSubmissionStatus) obj12, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = InterestYieldStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 2:
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 4:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(YearMonthDay.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = obj;
                        obj9 = GetInterestSettingsResponse.AdditionalEnablementScope.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 8:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj11 = BackupWithholdingStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 10:
                    try {
                        obj12 = ResolveBNoticeSubmissionStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 11:
                    m.add(GetInterestSettingsResponse.PreviousInterestEnrollment.ADAPTER.decode(protoReader));
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        reverseProtoWriter.getClass();
        getInterestSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(getInterestSettingsResponse.unknownFields());
        GetInterestSettingsResponse.PreviousInterestEnrollment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, getInterestSettingsResponse.previous_interest_enrollments);
        ResolveBNoticeSubmissionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 10, getInterestSettingsResponse.resolve_b_notice_submission_status);
        BackupWithholdingStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 9, getInterestSettingsResponse.backup_withholding_status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, getInterestSettingsResponse.interest_enrollment_token);
        GetInterestSettingsResponse.AdditionalEnablementScope.ADAPTER.encodeWithTag(reverseProtoWriter, 7, getInterestSettingsResponse.additional_enablement_scope);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, getInterestSettingsResponse.eligible_for_savings_yield);
        YearMonthDay.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getInterestSettingsResponse.current_apy_effective_date);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getInterestSettingsResponse.current_enhanced_yield_apy_bips);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getInterestSettingsResponse.current_apy_bips);
        InterestYieldStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getInterestSettingsResponse.interest_yield_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        getInterestSettingsResponse.getClass();
        int encodedSizeWithTag = InterestYieldStatus.ADAPTER.encodedSizeWithTag(1, getInterestSettingsResponse.interest_yield_status) + getInterestSettingsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return GetInterestSettingsResponse.PreviousInterestEnrollment.ADAPTER.asRepeated().encodedSizeWithTag(11, getInterestSettingsResponse.previous_interest_enrollments) + ResolveBNoticeSubmissionStatus.ADAPTER.encodedSizeWithTag(10, getInterestSettingsResponse.resolve_b_notice_submission_status) + BackupWithholdingStatus.ADAPTER.encodedSizeWithTag(9, getInterestSettingsResponse.backup_withholding_status) + ProtoAdapter.STRING.encodedSizeWithTag(8, getInterestSettingsResponse.interest_enrollment_token) + GetInterestSettingsResponse.AdditionalEnablementScope.ADAPTER.encodedSizeWithTag(7, getInterestSettingsResponse.additional_enablement_scope) + ProtoAdapter.BOOL.encodedSizeWithTag(6, getInterestSettingsResponse.eligible_for_savings_yield) + YearMonthDay.ADAPTER.encodedSizeWithTag(5, getInterestSettingsResponse.current_apy_effective_date) + protoAdapter.encodedSizeWithTag(4, getInterestSettingsResponse.current_enhanced_yield_apy_bips) + protoAdapter.encodedSizeWithTag(2, getInterestSettingsResponse.current_apy_bips) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        getInterestSettingsResponse.getClass();
        YearMonthDay yearMonthDay = getInterestSettingsResponse.current_apy_effective_date;
        YearMonthDay yearMonthDay2 = yearMonthDay != null ? (YearMonthDay) YearMonthDay.ADAPTER.redact(yearMonthDay) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getInterestSettingsResponse.previous_interest_enrollments, GetInterestSettingsResponse.PreviousInterestEnrollment.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        InterestYieldStatus interestYieldStatus = getInterestSettingsResponse.interest_yield_status;
        Integer num = getInterestSettingsResponse.current_apy_bips;
        Integer num2 = getInterestSettingsResponse.current_enhanced_yield_apy_bips;
        Boolean bool = getInterestSettingsResponse.eligible_for_savings_yield;
        GetInterestSettingsResponse.AdditionalEnablementScope additionalEnablementScope = getInterestSettingsResponse.additional_enablement_scope;
        String str = getInterestSettingsResponse.interest_enrollment_token;
        BackupWithholdingStatus backupWithholdingStatus = getInterestSettingsResponse.backup_withholding_status;
        ResolveBNoticeSubmissionStatus resolveBNoticeSubmissionStatus = getInterestSettingsResponse.resolve_b_notice_submission_status;
        byteString.getClass();
        return new GetInterestSettingsResponse(interestYieldStatus, num, num2, yearMonthDay2, bool, additionalEnablementScope, str, backupWithholdingStatus, resolveBNoticeSubmissionStatus, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        getInterestSettingsResponse.getClass();
        InterestYieldStatus.ADAPTER.encodeWithTag(protoWriter, 1, getInterestSettingsResponse.interest_yield_status);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, getInterestSettingsResponse.current_apy_bips);
        protoAdapter.encodeWithTag(protoWriter, 4, getInterestSettingsResponse.current_enhanced_yield_apy_bips);
        YearMonthDay.ADAPTER.encodeWithTag(protoWriter, 5, getInterestSettingsResponse.current_apy_effective_date);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, getInterestSettingsResponse.eligible_for_savings_yield);
        GetInterestSettingsResponse.AdditionalEnablementScope.ADAPTER.encodeWithTag(protoWriter, 7, getInterestSettingsResponse.additional_enablement_scope);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, getInterestSettingsResponse.interest_enrollment_token);
        BackupWithholdingStatus.ADAPTER.encodeWithTag(protoWriter, 9, getInterestSettingsResponse.backup_withholding_status);
        ResolveBNoticeSubmissionStatus.ADAPTER.encodeWithTag(protoWriter, 10, getInterestSettingsResponse.resolve_b_notice_submission_status);
        GetInterestSettingsResponse.PreviousInterestEnrollment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, getInterestSettingsResponse.previous_interest_enrollments);
        protoWriter.writeBytes(getInterestSettingsResponse.unknownFields());
    }
}
