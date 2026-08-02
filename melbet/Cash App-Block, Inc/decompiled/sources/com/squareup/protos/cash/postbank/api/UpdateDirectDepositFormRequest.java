package com.squareup.protos.cash.postbank.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.StopTimecardRequest;
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
public final class UpdateDirectDepositFormRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateDirectDepositFormRequest> CREATOR;
    public final Boolean add_signature;
    public final String amount;
    public final Money amount_money;
    public final String customer_name;
    public final String document_token;
    public final String employer_name;
    public final String percentage;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateDirectDepositFormRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postbank.api.UpdateDirectDepositFormRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateDirectDepositFormRequest((Money) obj7, (Boolean) obj6, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateDirectDepositFormRequest updateDirectDepositFormRequest = (UpdateDirectDepositFormRequest) obj;
                reverseProtoWriter.getClass();
                updateDirectDepositFormRequest.getClass();
                reverseProtoWriter.writeBytes(updateDirectDepositFormRequest.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 7, updateDirectDepositFormRequest.amount_money);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, updateDirectDepositFormRequest.add_signature);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, updateDirectDepositFormRequest.percentage);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, updateDirectDepositFormRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, updateDirectDepositFormRequest.employer_name);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, updateDirectDepositFormRequest.customer_name);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, updateDirectDepositFormRequest.document_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateDirectDepositFormRequest updateDirectDepositFormRequest = (UpdateDirectDepositFormRequest) obj;
                updateDirectDepositFormRequest.getClass();
                int size$okio = updateDirectDepositFormRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Money.ADAPTER.encodedSizeWithTag(7, updateDirectDepositFormRequest.amount_money) + ProtoAdapter.BOOL.encodedSizeWithTag(6, updateDirectDepositFormRequest.add_signature) + protoAdapter2.encodedSizeWithTag(5, updateDirectDepositFormRequest.percentage) + protoAdapter2.encodedSizeWithTag(4, updateDirectDepositFormRequest.amount) + protoAdapter2.encodedSizeWithTag(3, updateDirectDepositFormRequest.employer_name) + protoAdapter2.encodedSizeWithTag(2, updateDirectDepositFormRequest.customer_name) + protoAdapter2.encodedSizeWithTag(1, updateDirectDepositFormRequest.document_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateDirectDepositFormRequest updateDirectDepositFormRequest = (UpdateDirectDepositFormRequest) obj;
                updateDirectDepositFormRequest.getClass();
                Money money = updateDirectDepositFormRequest.amount_money;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = updateDirectDepositFormRequest.document_token;
                Boolean bool = updateDirectDepositFormRequest.add_signature;
                byteString.getClass();
                return new UpdateDirectDepositFormRequest(money2, bool, str, null, null, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateDirectDepositFormRequest updateDirectDepositFormRequest = (UpdateDirectDepositFormRequest) obj;
                updateDirectDepositFormRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, updateDirectDepositFormRequest.document_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, updateDirectDepositFormRequest.customer_name);
                protoAdapter2.encodeWithTag(protoWriter, 3, updateDirectDepositFormRequest.employer_name);
                protoAdapter2.encodeWithTag(protoWriter, 4, updateDirectDepositFormRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 5, updateDirectDepositFormRequest.percentage);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, updateDirectDepositFormRequest.add_signature);
                Money.ADAPTER.encodeWithTag(protoWriter, 7, updateDirectDepositFormRequest.amount_money);
                protoWriter.writeBytes(updateDirectDepositFormRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDirectDepositFormRequest(Money money, Boolean bool, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.document_token = str;
        this.customer_name = str2;
        this.employer_name = str3;
        this.amount = str4;
        this.percentage = str5;
        this.add_signature = bool;
        this.amount_money = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateDirectDepositFormRequest)) {
            return false;
        }
        UpdateDirectDepositFormRequest updateDirectDepositFormRequest = (UpdateDirectDepositFormRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateDirectDepositFormRequest.unknownFields()) && Intrinsics.areEqual(this.document_token, updateDirectDepositFormRequest.document_token) && Intrinsics.areEqual(this.customer_name, updateDirectDepositFormRequest.customer_name) && Intrinsics.areEqual(this.employer_name, updateDirectDepositFormRequest.employer_name) && Intrinsics.areEqual(this.amount, updateDirectDepositFormRequest.amount) && Intrinsics.areEqual(this.percentage, updateDirectDepositFormRequest.percentage) && Intrinsics.areEqual(this.add_signature, updateDirectDepositFormRequest.add_signature) && Intrinsics.areEqual(this.amount_money, updateDirectDepositFormRequest.amount_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.document_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.employer_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.amount;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.percentage;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.add_signature;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.amount_money;
        int hashCode8 = hashCode7 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        StopTimecardRequest.Builder builder = new StopTimecardRequest.Builder(1);
        builder.merchant_token = this.document_token;
        builder.timecard_token = this.customer_name;
        builder.initiating_employee_token = this.employer_name;
        builder.clockout_unit_token = this.amount;
        builder.fallback_time_zone = this.percentage;
        builder.should_also_end_breaks = this.add_signature;
        builder.declared_tip = this.amount_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.document_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "document_token=", arrayList);
        }
        if (this.customer_name != null) {
            arrayList.add("customer_name=██");
        }
        if (this.employer_name != null) {
            arrayList.add("employer_name=██");
        }
        if (this.amount != null) {
            arrayList.add("amount=██");
        }
        if (this.percentage != null) {
            arrayList.add("percentage=██");
        }
        Boolean bool = this.add_signature;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("add_signature=", bool, arrayList);
        }
        Money money = this.amount_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount_money=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateDirectDepositFormRequest{", "}", 0, null, null, 56);
    }
}
