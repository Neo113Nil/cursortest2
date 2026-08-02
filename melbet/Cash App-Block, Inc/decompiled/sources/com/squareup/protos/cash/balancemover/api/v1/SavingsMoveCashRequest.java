package com.squareup.protos.cash.balancemover.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
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
public final class SavingsMoveCashRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsMoveCashRequest> CREATOR;
    public final Money amount;
    public final String external_id;
    public final BalanceSnapshot main_cash_balance_snapshot;
    public final RequestContext request_context;
    public final String savings_balance_token;
    public final String source_savings_balance_token;
    public final String target_cash_balance_token;
    public final SavingsTransferContext transfer_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SavingsMoveCashRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.balancemover.api.v1.SavingsMoveCashRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SavingsMoveCashRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, (Money) obj5, (SavingsTransferContext) obj6, (BalanceSnapshot) obj7, (String) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(SavingsTransferContext.ADAPTER, protoReader, obj6);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(BalanceSnapshot.ADAPTER, protoReader, obj7);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SavingsMoveCashRequest savingsMoveCashRequest = (SavingsMoveCashRequest) obj;
                reverseProtoWriter.getClass();
                savingsMoveCashRequest.getClass();
                reverseProtoWriter.writeBytes(savingsMoveCashRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, savingsMoveCashRequest.source_savings_balance_token);
                BalanceSnapshot.ADAPTER.encodeWithTag(reverseProtoWriter, 7, savingsMoveCashRequest.main_cash_balance_snapshot);
                SavingsTransferContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, savingsMoveCashRequest.transfer_context);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsMoveCashRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, savingsMoveCashRequest.target_cash_balance_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, savingsMoveCashRequest.savings_balance_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, savingsMoveCashRequest.external_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsMoveCashRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SavingsMoveCashRequest savingsMoveCashRequest = (SavingsMoveCashRequest) obj;
                savingsMoveCashRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, savingsMoveCashRequest.request_context) + savingsMoveCashRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, savingsMoveCashRequest.source_savings_balance_token) + BalanceSnapshot.ADAPTER.encodedSizeWithTag(7, savingsMoveCashRequest.main_cash_balance_snapshot) + SavingsTransferContext.ADAPTER.encodedSizeWithTag(6, savingsMoveCashRequest.transfer_context) + Money.ADAPTER.encodedSizeWithTag(4, savingsMoveCashRequest.amount) + protoAdapter2.encodedSizeWithTag(5, savingsMoveCashRequest.target_cash_balance_token) + protoAdapter2.encodedSizeWithTag(3, savingsMoveCashRequest.savings_balance_token) + protoAdapter2.encodedSizeWithTag(2, savingsMoveCashRequest.external_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SavingsMoveCashRequest savingsMoveCashRequest = (SavingsMoveCashRequest) obj;
                savingsMoveCashRequest.getClass();
                RequestContext requestContext = savingsMoveCashRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Money money = savingsMoveCashRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                SavingsTransferContext savingsTransferContext = savingsMoveCashRequest.transfer_context;
                SavingsTransferContext savingsTransferContext2 = savingsTransferContext != null ? (SavingsTransferContext) SavingsTransferContext.ADAPTER.redact(savingsTransferContext) : null;
                BalanceSnapshot balanceSnapshot = savingsMoveCashRequest.main_cash_balance_snapshot;
                return SavingsMoveCashRequest.copy$default(savingsMoveCashRequest, requestContext2, money2, savingsTransferContext2, balanceSnapshot != null ? (BalanceSnapshot) BalanceSnapshot.ADAPTER.redact(balanceSnapshot) : null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SavingsMoveCashRequest savingsMoveCashRequest = (SavingsMoveCashRequest) obj;
                savingsMoveCashRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, savingsMoveCashRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, savingsMoveCashRequest.external_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, savingsMoveCashRequest.savings_balance_token);
                protoAdapter2.encodeWithTag(protoWriter, 5, savingsMoveCashRequest.target_cash_balance_token);
                Money.ADAPTER.encodeWithTag(protoWriter, 4, savingsMoveCashRequest.amount);
                SavingsTransferContext.ADAPTER.encodeWithTag(protoWriter, 6, savingsMoveCashRequest.transfer_context);
                BalanceSnapshot.ADAPTER.encodeWithTag(protoWriter, 7, savingsMoveCashRequest.main_cash_balance_snapshot);
                protoAdapter2.encodeWithTag(protoWriter, 8, savingsMoveCashRequest.source_savings_balance_token);
                protoWriter.writeBytes(savingsMoveCashRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsMoveCashRequest(RequestContext requestContext, String str, String str2, String str3, Money money, SavingsTransferContext savingsTransferContext, BalanceSnapshot balanceSnapshot, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.external_id = str;
        this.savings_balance_token = str2;
        this.target_cash_balance_token = str3;
        this.amount = money;
        this.transfer_context = savingsTransferContext;
        this.main_cash_balance_snapshot = balanceSnapshot;
        this.source_savings_balance_token = str4;
    }

    public static SavingsMoveCashRequest copy$default(SavingsMoveCashRequest savingsMoveCashRequest, RequestContext requestContext, Money money, SavingsTransferContext savingsTransferContext, BalanceSnapshot balanceSnapshot, ByteString byteString, int i) {
        String str = savingsMoveCashRequest.external_id;
        String str2 = savingsMoveCashRequest.savings_balance_token;
        String str3 = savingsMoveCashRequest.target_cash_balance_token;
        if ((i & 16) != 0) {
            money = savingsMoveCashRequest.amount;
        }
        Money money2 = money;
        if ((i & 32) != 0) {
            savingsTransferContext = savingsMoveCashRequest.transfer_context;
        }
        SavingsTransferContext savingsTransferContext2 = savingsTransferContext;
        if ((i & 64) != 0) {
            balanceSnapshot = savingsMoveCashRequest.main_cash_balance_snapshot;
        }
        BalanceSnapshot balanceSnapshot2 = balanceSnapshot;
        String str4 = savingsMoveCashRequest.source_savings_balance_token;
        if ((i & 256) != 0) {
            byteString = savingsMoveCashRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        savingsMoveCashRequest.getClass();
        byteString2.getClass();
        return new SavingsMoveCashRequest(requestContext, str, str2, str3, money2, savingsTransferContext2, balanceSnapshot2, str4, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsMoveCashRequest)) {
            return false;
        }
        SavingsMoveCashRequest savingsMoveCashRequest = (SavingsMoveCashRequest) obj;
        return Intrinsics.areEqual(unknownFields(), savingsMoveCashRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, savingsMoveCashRequest.request_context) && Intrinsics.areEqual(this.external_id, savingsMoveCashRequest.external_id) && Intrinsics.areEqual(this.savings_balance_token, savingsMoveCashRequest.savings_balance_token) && Intrinsics.areEqual(this.target_cash_balance_token, savingsMoveCashRequest.target_cash_balance_token) && Intrinsics.areEqual(this.amount, savingsMoveCashRequest.amount) && Intrinsics.areEqual(this.transfer_context, savingsMoveCashRequest.transfer_context) && Intrinsics.areEqual(this.main_cash_balance_snapshot, savingsMoveCashRequest.main_cash_balance_snapshot) && Intrinsics.areEqual(this.source_savings_balance_token, savingsMoveCashRequest.source_savings_balance_token);
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
        String str3 = this.target_cash_balance_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        SavingsTransferContext savingsTransferContext = this.transfer_context;
        int hashCode7 = (hashCode6 + (savingsTransferContext != null ? savingsTransferContext.hashCode() : 0)) * 37;
        BalanceSnapshot balanceSnapshot = this.main_cash_balance_snapshot;
        int hashCode8 = (hashCode7 + (balanceSnapshot != null ? balanceSnapshot.hashCode() : 0)) * 37;
        String str4 = this.source_savings_balance_token;
        int hashCode9 = hashCode8 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(7, false);
        builder.external_version = this.request_context;
        builder.external_token = this.external_id;
        builder.customer_token = this.savings_balance_token;
        builder.updated_at = this.target_cash_balance_token;
        builder.created_at = this.amount;
        builder.is_badged = this.transfer_context;
        builder.item_type = this.main_cash_balance_snapshot;
        builder.count_groups = this.source_savings_balance_token;
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
        String str3 = this.target_cash_balance_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "target_cash_balance_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        SavingsTransferContext savingsTransferContext = this.transfer_context;
        if (savingsTransferContext != null) {
            arrayList.add("transfer_context=" + savingsTransferContext);
        }
        BalanceSnapshot balanceSnapshot = this.main_cash_balance_snapshot;
        if (balanceSnapshot != null) {
            arrayList.add("main_cash_balance_snapshot=" + balanceSnapshot);
        }
        String str4 = this.source_savings_balance_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "source_savings_balance_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsMoveCashRequest{", "}", 0, null, null, 56);
    }
}
