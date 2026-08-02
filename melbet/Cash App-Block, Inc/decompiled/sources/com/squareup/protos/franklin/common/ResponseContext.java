package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneySignals;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ResponseContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResponseContext> CREATOR;
    public final Instrument balance_instrument;
    public final Instrument btc_balance_instrument;
    public final Country country_code;
    public final List customers;
    public final String dialog_message;
    public final String dialog_title;
    public final DirectDepositAccount direct_deposit_account;
    public final String failure_message;
    public final IssuedCard issued_card;
    public final JourneySignals journey_signals;
    public final List payments;
    public final Profile profile;
    public final String profile_token;
    public final RewardsData rewards_data;
    public final ScenarioPlan scenario_plan;
    public final String session_account_token;
    public final SessionStatus session_status;
    public final String session_token;
    public final StatusResult status_result;
    public final SyncEntitiesResponse sync_entities_data;
    public final Transfer transfer;

    /* loaded from: classes6.dex */
    public final class Builder extends Message.Builder {
        public Instrument balance_instrument;
        public Instrument btc_balance_instrument;
        public Country country_code;
        public List customers;
        public String dialog_message;
        public String dialog_title;
        public DirectDepositAccount direct_deposit_account;
        public String failure_message;
        public IssuedCard issued_card;
        public JourneySignals journey_signals;
        public List payments;
        public Profile profile;
        public String profile_token;
        public RewardsData rewards_data;
        public ScenarioPlan scenario_plan;
        public String session_account_token;
        public SessionStatus session_status;
        public String session_token;
        public StatusResult status_result;
        public SyncEntitiesResponse sync_entities_data;
        public Transfer transfer;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.payments = emptyList;
            this.customers = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final ResponseContext build() {
            return new ResponseContext(this.scenario_plan, this.status_result, this.payments, this.customers, this.transfer, this.issued_card, this.direct_deposit_account, this.balance_instrument, this.btc_balance_instrument, this.dialog_message, this.country_code, this.failure_message, this.sync_entities_data, this.rewards_data, this.profile, this.profile_token, this.session_token, this.session_status, this.session_account_token, this.dialog_title, this.journey_signals, buildUnknownFields());
        }
    }

    static {
        ResponseContext$Companion$ADAPTER$1 responseContext$Companion$ADAPTER$1 = new ResponseContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResponseContext.class), "type.googleapis.com/squareup.franklin.common.ResponseContext", Syntax.PROTO_2, null, "squareup/franklin/ResponseContextProto.proto");
        ADAPTER = responseContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(responseContext$Companion$ADAPTER$1);
    }

    public ResponseContext(ScenarioPlan scenarioPlan, StatusResult statusResult, EmptyList emptyList, EmptyList emptyList2, String str, SyncEntitiesResponse syncEntitiesResponse, Profile profile, String str2, int i) {
        this((i & 1) != 0 ? null : scenarioPlan, (i & 2) != 0 ? null : statusResult, (i & 4) != 0 ? EmptyList.INSTANCE : emptyList, (i & 8) != 0 ? EmptyList.INSTANCE : emptyList2, null, null, null, null, null, (i & 512) != 0 ? null : str, null, null, (i & 4096) != 0 ? null : syncEntitiesResponse, null, (i & 16384) != 0 ? null : profile, null, null, null, null, (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : str2, null, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseContext)) {
            return false;
        }
        ResponseContext responseContext = (ResponseContext) obj;
        return Intrinsics.areEqual(unknownFields(), responseContext.unknownFields()) && Intrinsics.areEqual(this.scenario_plan, responseContext.scenario_plan) && Intrinsics.areEqual(this.status_result, responseContext.status_result) && Intrinsics.areEqual(this.payments, responseContext.payments) && Intrinsics.areEqual(this.customers, responseContext.customers) && Intrinsics.areEqual(this.transfer, responseContext.transfer) && Intrinsics.areEqual(this.issued_card, responseContext.issued_card) && Intrinsics.areEqual(this.direct_deposit_account, responseContext.direct_deposit_account) && Intrinsics.areEqual(this.balance_instrument, responseContext.balance_instrument) && Intrinsics.areEqual(this.btc_balance_instrument, responseContext.btc_balance_instrument) && Intrinsics.areEqual(this.dialog_message, responseContext.dialog_message) && this.country_code == responseContext.country_code && Intrinsics.areEqual(this.failure_message, responseContext.failure_message) && Intrinsics.areEqual(this.sync_entities_data, responseContext.sync_entities_data) && Intrinsics.areEqual(this.rewards_data, responseContext.rewards_data) && Intrinsics.areEqual(this.profile, responseContext.profile) && Intrinsics.areEqual(this.profile_token, responseContext.profile_token) && Intrinsics.areEqual(this.session_token, responseContext.session_token) && this.session_status == responseContext.session_status && Intrinsics.areEqual(this.session_account_token, responseContext.session_account_token) && Intrinsics.areEqual(this.dialog_title, responseContext.dialog_title) && Intrinsics.areEqual(this.journey_signals, responseContext.journey_signals);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScenarioPlan scenarioPlan = this.scenario_plan;
        int hashCode2 = (hashCode + (scenarioPlan != null ? scenarioPlan.hashCode() : 0)) * 37;
        StatusResult statusResult = this.status_result;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (statusResult != null ? statusResult.hashCode() : 0)) * 37, 37, this.payments), 37, this.customers);
        Transfer transfer = this.transfer;
        int hashCode3 = (m + (transfer != null ? transfer.hashCode() : 0)) * 37;
        IssuedCard issuedCard = this.issued_card;
        int hashCode4 = (hashCode3 + (issuedCard != null ? issuedCard.hashCode() : 0)) * 37;
        DirectDepositAccount directDepositAccount = this.direct_deposit_account;
        int hashCode5 = (hashCode4 + (directDepositAccount != null ? directDepositAccount.hashCode() : 0)) * 37;
        Instrument instrument = this.balance_instrument;
        int hashCode6 = (hashCode5 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        Instrument instrument2 = this.btc_balance_instrument;
        int hashCode7 = (hashCode6 + (instrument2 != null ? instrument2.hashCode() : 0)) * 37;
        String str = this.dialog_message;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
        Country country = this.country_code;
        int hashCode9 = (hashCode8 + (country != null ? country.hashCode() : 0)) * 37;
        String str2 = this.failure_message;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SyncEntitiesResponse syncEntitiesResponse = this.sync_entities_data;
        int hashCode11 = (hashCode10 + (syncEntitiesResponse != null ? syncEntitiesResponse.hashCode() : 0)) * 37;
        RewardsData rewardsData = this.rewards_data;
        int hashCode12 = (hashCode11 + (rewardsData != null ? rewardsData.hashCode() : 0)) * 37;
        Profile profile = this.profile;
        int hashCode13 = (hashCode12 + (profile != null ? profile.hashCode() : 0)) * 37;
        String str3 = this.profile_token;
        int hashCode14 = (hashCode13 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.session_token;
        int hashCode15 = (hashCode14 + (str4 != null ? str4.hashCode() : 0)) * 37;
        SessionStatus sessionStatus = this.session_status;
        int hashCode16 = (hashCode15 + (sessionStatus != null ? sessionStatus.hashCode() : 0)) * 37;
        String str5 = this.session_account_token;
        int hashCode17 = (hashCode16 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.dialog_title;
        int hashCode18 = (hashCode17 + (str6 != null ? str6.hashCode() : 0)) * 37;
        JourneySignals journeySignals = this.journey_signals;
        int hashCode19 = hashCode18 + (journeySignals != null ? journeySignals.hashCode() : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.scenario_plan = this.scenario_plan;
        builder.status_result = this.status_result;
        builder.payments = this.payments;
        builder.customers = this.customers;
        builder.transfer = this.transfer;
        builder.issued_card = this.issued_card;
        builder.direct_deposit_account = this.direct_deposit_account;
        builder.balance_instrument = this.balance_instrument;
        builder.btc_balance_instrument = this.btc_balance_instrument;
        builder.dialog_message = this.dialog_message;
        builder.country_code = this.country_code;
        builder.failure_message = this.failure_message;
        builder.sync_entities_data = this.sync_entities_data;
        builder.rewards_data = this.rewards_data;
        builder.profile = this.profile;
        builder.profile_token = this.profile_token;
        builder.session_token = this.session_token;
        builder.session_status = this.session_status;
        builder.session_account_token = this.session_account_token;
        builder.dialog_title = this.dialog_title;
        builder.journey_signals = this.journey_signals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScenarioPlan scenarioPlan = this.scenario_plan;
        if (scenarioPlan != null) {
            arrayList.add("scenario_plan=" + scenarioPlan);
        }
        StatusResult statusResult = this.status_result;
        if (statusResult != null) {
            arrayList.add("status_result=" + statusResult);
        }
        List list = this.payments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payments=", arrayList, list);
        }
        List list2 = this.customers;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("customers=", arrayList, list2);
        }
        Transfer transfer = this.transfer;
        if (transfer != null) {
            arrayList.add("transfer=" + transfer);
        }
        IssuedCard issuedCard = this.issued_card;
        if (issuedCard != null) {
            arrayList.add("issued_card=" + issuedCard);
        }
        DirectDepositAccount directDepositAccount = this.direct_deposit_account;
        if (directDepositAccount != null) {
            arrayList.add("direct_deposit_account=" + directDepositAccount);
        }
        Instrument instrument = this.balance_instrument;
        if (instrument != null) {
            arrayList.add("balance_instrument=" + instrument);
        }
        Instrument instrument2 = this.btc_balance_instrument;
        if (instrument2 != null) {
            arrayList.add("btc_balance_instrument=" + instrument2);
        }
        String str = this.dialog_message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "dialog_message=", arrayList);
        }
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        String str2 = this.failure_message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "failure_message=", arrayList);
        }
        SyncEntitiesResponse syncEntitiesResponse = this.sync_entities_data;
        if (syncEntitiesResponse != null) {
            arrayList.add("sync_entities_data=" + syncEntitiesResponse);
        }
        RewardsData rewardsData = this.rewards_data;
        if (rewardsData != null) {
            arrayList.add("rewards_data=" + rewardsData);
        }
        Profile profile = this.profile;
        if (profile != null) {
            arrayList.add("profile=" + profile);
        }
        String str3 = this.profile_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "profile_token=", arrayList);
        }
        if (this.session_token != null) {
            arrayList.add("session_token=██");
        }
        SessionStatus sessionStatus = this.session_status;
        if (sessionStatus != null) {
            arrayList.add("session_status=" + sessionStatus);
        }
        String str4 = this.session_account_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "session_account_token=", arrayList);
        }
        String str5 = this.dialog_title;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "dialog_title=", arrayList);
        }
        JourneySignals journeySignals = this.journey_signals;
        if (journeySignals != null) {
            arrayList.add("journey_signals=" + journeySignals);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResponseContext{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseContext(ScenarioPlan scenarioPlan, StatusResult statusResult, List list, List list2, Transfer transfer, IssuedCard issuedCard, DirectDepositAccount directDepositAccount, Instrument instrument, Instrument instrument2, String str, Country country, String str2, SyncEntitiesResponse syncEntitiesResponse, RewardsData rewardsData, Profile profile, String str3, String str4, SessionStatus sessionStatus, String str5, String str6, JourneySignals journeySignals, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.scenario_plan = scenarioPlan;
        this.status_result = statusResult;
        this.transfer = transfer;
        this.issued_card = issuedCard;
        this.direct_deposit_account = directDepositAccount;
        this.balance_instrument = instrument;
        this.btc_balance_instrument = instrument2;
        this.dialog_message = str;
        this.country_code = country;
        this.failure_message = str2;
        this.sync_entities_data = syncEntitiesResponse;
        this.rewards_data = rewardsData;
        this.profile = profile;
        this.profile_token = str3;
        this.session_token = str4;
        this.session_status = sessionStatus;
        this.session_account_token = str5;
        this.dialog_title = str6;
        this.journey_signals = journeySignals;
        this.payments = TransactorKt.immutableCopyOf("payments", list);
        this.customers = TransactorKt.immutableCopyOf("customers", list2);
    }
}
