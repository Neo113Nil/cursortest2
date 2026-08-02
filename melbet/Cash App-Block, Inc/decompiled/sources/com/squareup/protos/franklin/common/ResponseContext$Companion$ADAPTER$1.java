package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneySignals;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ResponseContext$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ScenarioPlan scenarioPlan;
        ArrayList arrayList;
        Object obj2;
        Object obj3;
        ArrayList arrayList2;
        Object obj4;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList3 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        ScenarioPlan scenarioPlan2 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Country country = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        SessionStatus sessionStatus = null;
        String str5 = null;
        String str6 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResponseContext(scenarioPlan2, (StatusResult) obj5, m, arrayList3, (Transfer) obj6, (IssuedCard) obj7, (DirectDepositAccount) obj8, (Instrument) obj9, (Instrument) obj10, str, country, str2, (SyncEntitiesResponse) obj11, (RewardsData) obj12, (Profile) obj13, str3, str4, sessionStatus, str5, str6, (JourneySignals) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    ScenarioPlan scenarioPlan3 = scenarioPlan2;
                    arrayList2 = m;
                    obj4 = obj14;
                    scenarioPlan = TransactorKt.decodeMessageOrMerge(ScenarioPlan.ADAPTER, protoReader, scenarioPlan3);
                    obj14 = obj4;
                    decode = str;
                    break;
                case 2:
                    scenarioPlan = scenarioPlan2;
                    arrayList2 = m;
                    obj4 = obj14;
                    obj5 = TransactorKt.decodeMessageOrMerge(StatusResult.ADAPTER, protoReader, obj5);
                    obj14 = obj4;
                    decode = str;
                    break;
                case 3:
                    scenarioPlan = scenarioPlan2;
                    ArrayList arrayList4 = m;
                    obj = obj14;
                    obj2 = obj10;
                    obj3 = obj11;
                    arrayList2 = arrayList4;
                    arrayList2.add(UiPayment.ADAPTER.decode(protoReader));
                    decode = str;
                    obj10 = obj2;
                    obj11 = obj3;
                    obj14 = obj;
                    break;
                case 4:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj = obj14;
                    obj2 = obj10;
                    obj3 = obj11;
                    arrayList3.add(UiCustomer.ADAPTER.decode(protoReader));
                    arrayList2 = arrayList;
                    decode = str;
                    obj10 = obj2;
                    obj11 = obj3;
                    obj14 = obj;
                    break;
                case 5:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj = obj14;
                    obj6 = TransactorKt.decodeMessageOrMerge(Transfer.ADAPTER, protoReader, obj6);
                    obj14 = obj;
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 6:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj = obj14;
                    obj7 = TransactorKt.decodeMessageOrMerge(IssuedCard.ADAPTER, protoReader, obj7);
                    obj14 = obj;
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 7:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj = obj14;
                    obj9 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj9);
                    obj14 = obj;
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 8:
                    scenarioPlan = scenarioPlan2;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    obj14 = obj14;
                    arrayList2 = m;
                    break;
                case 9:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj = obj14;
                    try {
                        country = Country.ADAPTER.decode(protoReader);
                        obj14 = obj;
                        arrayList2 = arrayList;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj2 = obj10;
                        obj3 = obj11;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 11:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj11 = TransactorKt.decodeMessageOrMerge(SyncEntitiesResponse.ADAPTER, protoReader, obj11);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 12:
                case 21:
                case 22:
                default:
                    protoReader.readUnknownField(nextTag);
                    scenarioPlan = scenarioPlan2;
                    arrayList2 = m;
                    obj = obj14;
                    obj2 = obj10;
                    obj3 = obj11;
                    decode = str;
                    obj10 = obj2;
                    obj11 = obj3;
                    obj14 = obj;
                    break;
                case 13:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj10 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj10);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 14:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj8 = TransactorKt.decodeMessageOrMerge(DirectDepositAccount.ADAPTER, protoReader, obj8);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 15:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj12 = TransactorKt.decodeMessageOrMerge(RewardsData.ADAPTER, protoReader, obj12);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 16:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    obj13 = TransactorKt.decodeMessageOrMerge(Profile.ADAPTER, protoReader, obj13);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 17:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 18:
                    scenarioPlan = scenarioPlan2;
                    arrayList = m;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList2 = arrayList;
                    decode = str;
                    break;
                case 19:
                    try {
                        sessionStatus = SessionStatus.ADAPTER.decode(protoReader);
                        scenarioPlan = scenarioPlan2;
                        arrayList2 = m;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj14;
                        scenarioPlan = scenarioPlan2;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        obj2 = obj10;
                        obj3 = obj11;
                        break;
                    }
                case 20:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    scenarioPlan = scenarioPlan2;
                    arrayList2 = m;
                    decode = str;
                    break;
                case 23:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    scenarioPlan = scenarioPlan2;
                    arrayList2 = m;
                    decode = str;
                    break;
                case 24:
                    obj14 = TransactorKt.decodeMessageOrMerge(JourneySignals.ADAPTER, protoReader, obj14);
                    scenarioPlan = scenarioPlan2;
                    arrayList2 = m;
                    decode = str;
                    break;
            }
            str = decode;
            m = arrayList2;
            scenarioPlan2 = scenarioPlan;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResponseContext responseContext = (ResponseContext) obj;
        reverseProtoWriter.getClass();
        responseContext.getClass();
        reverseProtoWriter.writeBytes(responseContext.unknownFields());
        JourneySignals.ADAPTER.encodeWithTag(reverseProtoWriter, 24, responseContext.journey_signals);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, responseContext.dialog_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, responseContext.session_account_token);
        SessionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 19, responseContext.session_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, responseContext.session_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, responseContext.profile_token);
        Profile.ADAPTER.encodeWithTag(reverseProtoWriter, 16, responseContext.profile);
        RewardsData.ADAPTER.encodeWithTag(reverseProtoWriter, 15, responseContext.rewards_data);
        SyncEntitiesResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 11, responseContext.sync_entities_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, responseContext.failure_message);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 9, responseContext.country_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, responseContext.dialog_message);
        ProtoAdapter protoAdapter2 = Instrument.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, responseContext.btc_balance_instrument);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, responseContext.balance_instrument);
        DirectDepositAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 14, responseContext.direct_deposit_account);
        IssuedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 6, responseContext.issued_card);
        Transfer.ADAPTER.encodeWithTag(reverseProtoWriter, 5, responseContext.transfer);
        UiCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, responseContext.customers);
        UiPayment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, responseContext.payments);
        StatusResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, responseContext.status_result);
        ScenarioPlan.ADAPTER.encodeWithTag(reverseProtoWriter, 1, responseContext.scenario_plan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ResponseContext responseContext = (ResponseContext) obj;
        responseContext.getClass();
        int encodedSizeWithTag = DirectDepositAccount.ADAPTER.encodedSizeWithTag(14, responseContext.direct_deposit_account) + IssuedCard.ADAPTER.encodedSizeWithTag(6, responseContext.issued_card) + Transfer.ADAPTER.encodedSizeWithTag(5, responseContext.transfer) + UiCustomer.ADAPTER.asRepeated().encodedSizeWithTag(4, responseContext.customers) + UiPayment.ADAPTER.asRepeated().encodedSizeWithTag(3, responseContext.payments) + StatusResult.ADAPTER.encodedSizeWithTag(2, responseContext.status_result) + ScenarioPlan.ADAPTER.encodedSizeWithTag(1, responseContext.scenario_plan) + responseContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Instrument.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(13, responseContext.btc_balance_instrument) + protoAdapter.encodedSizeWithTag(7, responseContext.balance_instrument) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return JourneySignals.ADAPTER.encodedSizeWithTag(24, responseContext.journey_signals) + protoAdapter2.encodedSizeWithTag(20, responseContext.dialog_title) + protoAdapter2.encodedSizeWithTag(23, responseContext.session_account_token) + SessionStatus.ADAPTER.encodedSizeWithTag(19, responseContext.session_status) + protoAdapter2.encodedSizeWithTag(18, responseContext.session_token) + protoAdapter2.encodedSizeWithTag(17, responseContext.profile_token) + Profile.ADAPTER.encodedSizeWithTag(16, responseContext.profile) + RewardsData.ADAPTER.encodedSizeWithTag(15, responseContext.rewards_data) + SyncEntitiesResponse.ADAPTER.encodedSizeWithTag(11, responseContext.sync_entities_data) + protoAdapter2.encodedSizeWithTag(10, responseContext.failure_message) + Country.ADAPTER.encodedSizeWithTag(9, responseContext.country_code) + protoAdapter2.encodedSizeWithTag(8, responseContext.dialog_message) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResponseContext responseContext = (ResponseContext) obj;
        responseContext.getClass();
        ScenarioPlan scenarioPlan = responseContext.scenario_plan;
        ScenarioPlan scenarioPlan2 = scenarioPlan != null ? (ScenarioPlan) ScenarioPlan.ADAPTER.redact(scenarioPlan) : null;
        StatusResult statusResult = responseContext.status_result;
        StatusResult statusResult2 = statusResult != null ? (StatusResult) StatusResult.ADAPTER.redact(statusResult) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(responseContext.payments, UiPayment.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(responseContext.customers, UiCustomer.ADAPTER);
        Transfer transfer = responseContext.transfer;
        Transfer transfer2 = transfer != null ? (Transfer) Transfer.ADAPTER.redact(transfer) : null;
        IssuedCard issuedCard = responseContext.issued_card;
        IssuedCard issuedCard2 = issuedCard != null ? (IssuedCard) IssuedCard.ADAPTER.redact(issuedCard) : null;
        DirectDepositAccount directDepositAccount = responseContext.direct_deposit_account;
        DirectDepositAccount directDepositAccount2 = directDepositAccount != null ? (DirectDepositAccount) DirectDepositAccount.ADAPTER.redact(directDepositAccount) : null;
        Instrument instrument = responseContext.balance_instrument;
        Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
        Instrument instrument3 = responseContext.btc_balance_instrument;
        Instrument instrument4 = instrument3 != null ? (Instrument) Instrument.ADAPTER.redact(instrument3) : null;
        SyncEntitiesResponse syncEntitiesResponse = responseContext.sync_entities_data;
        SyncEntitiesResponse syncEntitiesResponse2 = syncEntitiesResponse != null ? (SyncEntitiesResponse) SyncEntitiesResponse.ADAPTER.redact(syncEntitiesResponse) : null;
        RewardsData rewardsData = responseContext.rewards_data;
        RewardsData rewardsData2 = rewardsData != null ? (RewardsData) RewardsData.ADAPTER.redact(rewardsData) : null;
        Profile profile = responseContext.profile;
        Profile profile2 = profile != null ? (Profile) Profile.ADAPTER.redact(profile) : null;
        JourneySignals journeySignals = responseContext.journey_signals;
        JourneySignals journeySignals2 = journeySignals != null ? (JourneySignals) JourneySignals.ADAPTER.redact(journeySignals) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = responseContext.dialog_message;
        Country country = responseContext.country_code;
        String str2 = responseContext.failure_message;
        String str3 = responseContext.profile_token;
        SessionStatus sessionStatus = responseContext.session_status;
        String str4 = responseContext.session_account_token;
        String str5 = responseContext.dialog_title;
        byteString.getClass();
        return new ResponseContext(scenarioPlan2, statusResult2, m1169redactElements, m1169redactElements2, transfer2, issuedCard2, directDepositAccount2, instrument2, instrument4, str, country, str2, syncEntitiesResponse2, rewardsData2, profile2, str3, null, sessionStatus, str4, str5, journeySignals2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResponseContext responseContext = (ResponseContext) obj;
        responseContext.getClass();
        ScenarioPlan.ADAPTER.encodeWithTag(protoWriter, 1, responseContext.scenario_plan);
        StatusResult.ADAPTER.encodeWithTag(protoWriter, 2, responseContext.status_result);
        UiPayment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, responseContext.payments);
        UiCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, responseContext.customers);
        Transfer.ADAPTER.encodeWithTag(protoWriter, 5, responseContext.transfer);
        IssuedCard.ADAPTER.encodeWithTag(protoWriter, 6, responseContext.issued_card);
        DirectDepositAccount.ADAPTER.encodeWithTag(protoWriter, 14, responseContext.direct_deposit_account);
        ProtoAdapter protoAdapter = Instrument.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 7, responseContext.balance_instrument);
        protoAdapter.encodeWithTag(protoWriter, 13, responseContext.btc_balance_instrument);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 8, responseContext.dialog_message);
        Country.ADAPTER.encodeWithTag(protoWriter, 9, responseContext.country_code);
        protoAdapter2.encodeWithTag(protoWriter, 10, responseContext.failure_message);
        SyncEntitiesResponse.ADAPTER.encodeWithTag(protoWriter, 11, responseContext.sync_entities_data);
        RewardsData.ADAPTER.encodeWithTag(protoWriter, 15, responseContext.rewards_data);
        Profile.ADAPTER.encodeWithTag(protoWriter, 16, responseContext.profile);
        protoAdapter2.encodeWithTag(protoWriter, 17, responseContext.profile_token);
        protoAdapter2.encodeWithTag(protoWriter, 18, responseContext.session_token);
        SessionStatus.ADAPTER.encodeWithTag(protoWriter, 19, responseContext.session_status);
        protoAdapter2.encodeWithTag(protoWriter, 23, responseContext.session_account_token);
        protoAdapter2.encodeWithTag(protoWriter, 20, responseContext.dialog_title);
        JourneySignals.ADAPTER.encodeWithTag(protoWriter, 24, responseContext.journey_signals);
        protoWriter.writeBytes(responseContext.unknownFields());
    }
}
