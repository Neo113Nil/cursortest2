package com.squareup.protos.cash.balancemover.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SavingsCashInRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsCashInRequest> CREATOR;
    public final Money amount;
    public final String external_id;
    public final BalanceSnapshot main_cash_balance_snapshot;
    public final String passcode_token;
    public final BalanceSnapshot preferred_source_balance;
    public final RequestContext request_context;
    public final String savings_balance_token;
    public final String target_savings_balance_token;
    public final SavingsTransferContext transfer_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SavingsCashInRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.balancemover.api.v1.SavingsCashInRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SavingsCashInRequest((RequestContext) obj, (String) obj2, (String) obj3, (BalanceSnapshot) obj4, (Money) obj5, (String) obj6, (SavingsTransferContext) obj7, (String) obj8, (BalanceSnapshot) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                            break;
                        case 5:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj4 = TransactorKt.decodeMessageOrMerge(BalanceSnapshot.ADAPTER, protoReader, obj4);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(SavingsTransferContext.ADAPTER, protoReader, obj7);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            obj9 = TransactorKt.decodeMessageOrMerge(BalanceSnapshot.ADAPTER, protoReader, obj9);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SavingsCashInRequest savingsCashInRequest = (SavingsCashInRequest) obj;
                reverseProtoWriter.getClass();
                savingsCashInRequest.getClass();
                reverseProtoWriter.writeBytes(savingsCashInRequest.unknownFields());
                ProtoAdapter protoAdapter2 = BalanceSnapshot.ADAPTER;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, savingsCashInRequest.preferred_source_balance);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 8, savingsCashInRequest.target_savings_balance_token);
                SavingsTransferContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, savingsCashInRequest.transfer_context);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 5, savingsCashInRequest.passcode_token);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsCashInRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, savingsCashInRequest.main_cash_balance_snapshot);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, savingsCashInRequest.savings_balance_token);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, savingsCashInRequest.external_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsCashInRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SavingsCashInRequest savingsCashInRequest = (SavingsCashInRequest) obj;
                savingsCashInRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, savingsCashInRequest.request_context) + savingsCashInRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, savingsCashInRequest.savings_balance_token) + protoAdapter2.encodedSizeWithTag(2, savingsCashInRequest.external_id) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = BalanceSnapshot.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(9, savingsCashInRequest.preferred_source_balance) + protoAdapter2.encodedSizeWithTag(8, savingsCashInRequest.target_savings_balance_token) + SavingsTransferContext.ADAPTER.encodedSizeWithTag(7, savingsCashInRequest.transfer_context) + protoAdapter2.encodedSizeWithTag(5, savingsCashInRequest.passcode_token) + Money.ADAPTER.encodedSizeWithTag(4, savingsCashInRequest.amount) + protoAdapter3.encodedSizeWithTag(6, savingsCashInRequest.main_cash_balance_snapshot) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SavingsCashInRequest savingsCashInRequest = (SavingsCashInRequest) obj;
                savingsCashInRequest.getClass();
                RequestContext requestContext = savingsCashInRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                BalanceSnapshot balanceSnapshot = savingsCashInRequest.main_cash_balance_snapshot;
                BalanceSnapshot balanceSnapshot2 = balanceSnapshot != null ? (BalanceSnapshot) BalanceSnapshot.ADAPTER.redact(balanceSnapshot) : null;
                Money money = savingsCashInRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                SavingsTransferContext savingsTransferContext = savingsCashInRequest.transfer_context;
                SavingsTransferContext savingsTransferContext2 = savingsTransferContext != null ? (SavingsTransferContext) SavingsTransferContext.ADAPTER.redact(savingsTransferContext) : null;
                BalanceSnapshot balanceSnapshot3 = savingsCashInRequest.preferred_source_balance;
                return SavingsCashInRequest.copy$default(savingsCashInRequest, requestContext2, balanceSnapshot2, money2, savingsTransferContext2, balanceSnapshot3 != null ? (BalanceSnapshot) BalanceSnapshot.ADAPTER.redact(balanceSnapshot3) : null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SavingsCashInRequest savingsCashInRequest = (SavingsCashInRequest) obj;
                savingsCashInRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, savingsCashInRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, savingsCashInRequest.external_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, savingsCashInRequest.savings_balance_token);
                ProtoAdapter protoAdapter3 = BalanceSnapshot.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 6, savingsCashInRequest.main_cash_balance_snapshot);
                Money.ADAPTER.encodeWithTag(protoWriter, 4, savingsCashInRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 5, savingsCashInRequest.passcode_token);
                SavingsTransferContext.ADAPTER.encodeWithTag(protoWriter, 7, savingsCashInRequest.transfer_context);
                protoAdapter2.encodeWithTag(protoWriter, 8, savingsCashInRequest.target_savings_balance_token);
                protoAdapter3.encodeWithTag(protoWriter, 9, savingsCashInRequest.preferred_source_balance);
                protoWriter.writeBytes(savingsCashInRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsCashInRequest(RequestContext requestContext, String str, String str2, BalanceSnapshot balanceSnapshot, Money money, String str3, SavingsTransferContext savingsTransferContext, String str4, BalanceSnapshot balanceSnapshot2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.external_id = str;
        this.savings_balance_token = str2;
        this.main_cash_balance_snapshot = balanceSnapshot;
        this.amount = money;
        this.passcode_token = str3;
        this.transfer_context = savingsTransferContext;
        this.target_savings_balance_token = str4;
        this.preferred_source_balance = balanceSnapshot2;
    }

    public static SavingsCashInRequest copy$default(SavingsCashInRequest savingsCashInRequest, RequestContext requestContext, BalanceSnapshot balanceSnapshot, Money money, SavingsTransferContext savingsTransferContext, BalanceSnapshot balanceSnapshot2, ByteString byteString, int i) {
        String str = savingsCashInRequest.external_id;
        String str2 = savingsCashInRequest.savings_balance_token;
        if ((i & 8) != 0) {
            balanceSnapshot = savingsCashInRequest.main_cash_balance_snapshot;
        }
        BalanceSnapshot balanceSnapshot3 = balanceSnapshot;
        if ((i & 16) != 0) {
            money = savingsCashInRequest.amount;
        }
        Money money2 = money;
        String str3 = savingsCashInRequest.passcode_token;
        if ((i & 64) != 0) {
            savingsTransferContext = savingsCashInRequest.transfer_context;
        }
        SavingsTransferContext savingsTransferContext2 = savingsTransferContext;
        String str4 = savingsCashInRequest.target_savings_balance_token;
        BalanceSnapshot balanceSnapshot4 = (i & 256) != 0 ? savingsCashInRequest.preferred_source_balance : balanceSnapshot2;
        ByteString unknownFields = (i & 512) != 0 ? savingsCashInRequest.unknownFields() : byteString;
        savingsCashInRequest.getClass();
        unknownFields.getClass();
        return new SavingsCashInRequest(requestContext, str, str2, balanceSnapshot3, money2, str3, savingsTransferContext2, str4, balanceSnapshot4, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsCashInRequest)) {
            return false;
        }
        SavingsCashInRequest savingsCashInRequest = (SavingsCashInRequest) obj;
        return Intrinsics.areEqual(unknownFields(), savingsCashInRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, savingsCashInRequest.request_context) && Intrinsics.areEqual(this.external_id, savingsCashInRequest.external_id) && Intrinsics.areEqual(this.savings_balance_token, savingsCashInRequest.savings_balance_token) && Intrinsics.areEqual(this.main_cash_balance_snapshot, savingsCashInRequest.main_cash_balance_snapshot) && Intrinsics.areEqual(this.amount, savingsCashInRequest.amount) && Intrinsics.areEqual(this.passcode_token, savingsCashInRequest.passcode_token) && Intrinsics.areEqual(this.transfer_context, savingsCashInRequest.transfer_context) && Intrinsics.areEqual(this.target_savings_balance_token, savingsCashInRequest.target_savings_balance_token) && Intrinsics.areEqual(this.preferred_source_balance, savingsCashInRequest.preferred_source_balance);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.external_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.savings_balance_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BalanceSnapshot balanceSnapshot = this.main_cash_balance_snapshot;
        int hashCode5 = (hashCode4 + (balanceSnapshot != null ? balanceSnapshot.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        String str3 = this.passcode_token;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        SavingsTransferContext savingsTransferContext = this.transfer_context;
        int hashCode8 = (hashCode7 + (savingsTransferContext != null ? savingsTransferContext.hashCode() : 0)) * 37;
        String str4 = this.target_savings_balance_token;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        BalanceSnapshot balanceSnapshot2 = this.preferred_source_balance;
        int hashCode10 = hashCode9 + (balanceSnapshot2 != null ? balanceSnapshot2.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(4, false);
        builder.locale = this.request_context;
        builder.title = this.external_id;
        builder.info_rows_header = this.savings_balance_token;
        builder.footer_text = this.main_cash_balance_snapshot;
        builder.loadable_subtitle = this.amount;
        builder.info_rows = this.passcode_token;
        builder.primary_footer_button_state = this.transfer_context;
        builder.secondary_footer_button_state = this.target_savings_balance_token;
        builder.payment_plans_data = this.preferred_source_balance;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        String str2 = this.savings_balance_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "savings_balance_token=", arrayList);
        }
        BalanceSnapshot balanceSnapshot = this.main_cash_balance_snapshot;
        if (balanceSnapshot != null) {
            arrayList.add("main_cash_balance_snapshot=" + balanceSnapshot);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str3 = this.passcode_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "passcode_token=", arrayList);
        }
        SavingsTransferContext savingsTransferContext = this.transfer_context;
        if (savingsTransferContext != null) {
            arrayList.add("transfer_context=" + savingsTransferContext);
        }
        String str4 = this.target_savings_balance_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "target_savings_balance_token=", arrayList);
        }
        BalanceSnapshot balanceSnapshot2 = this.preferred_source_balance;
        if (balanceSnapshot2 != null) {
            arrayList.add("preferred_source_balance=" + balanceSnapshot2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsCashInRequest{", "}", 0, null, null, 56);
    }
}
