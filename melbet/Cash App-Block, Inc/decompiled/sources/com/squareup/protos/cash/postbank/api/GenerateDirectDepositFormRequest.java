package com.squareup.protos.cash.postbank.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.common.Money;
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
public final class GenerateDirectDepositFormRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenerateDirectDepositFormRequest> CREATOR;
    public final Boolean add_signature;
    public final String amount;
    public final Money amount_money;
    public final String customer_name;
    public final String employer_name;
    public final String percentage;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GenerateDirectDepositFormRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postbank.api.GenerateDirectDepositFormRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GenerateDirectDepositFormRequest((Money) obj6, (Boolean) obj5, (String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj5 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GenerateDirectDepositFormRequest generateDirectDepositFormRequest = (GenerateDirectDepositFormRequest) obj;
                reverseProtoWriter.getClass();
                generateDirectDepositFormRequest.getClass();
                reverseProtoWriter.writeBytes(generateDirectDepositFormRequest.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 6, generateDirectDepositFormRequest.amount_money);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, generateDirectDepositFormRequest.add_signature);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, generateDirectDepositFormRequest.percentage);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, generateDirectDepositFormRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, generateDirectDepositFormRequest.employer_name);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, generateDirectDepositFormRequest.customer_name);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GenerateDirectDepositFormRequest generateDirectDepositFormRequest = (GenerateDirectDepositFormRequest) obj;
                generateDirectDepositFormRequest.getClass();
                int size$okio = generateDirectDepositFormRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Money.ADAPTER.encodedSizeWithTag(6, generateDirectDepositFormRequest.amount_money) + ProtoAdapter.BOOL.encodedSizeWithTag(5, generateDirectDepositFormRequest.add_signature) + protoAdapter2.encodedSizeWithTag(4, generateDirectDepositFormRequest.percentage) + protoAdapter2.encodedSizeWithTag(3, generateDirectDepositFormRequest.amount) + protoAdapter2.encodedSizeWithTag(2, generateDirectDepositFormRequest.employer_name) + protoAdapter2.encodedSizeWithTag(1, generateDirectDepositFormRequest.customer_name) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GenerateDirectDepositFormRequest generateDirectDepositFormRequest = (GenerateDirectDepositFormRequest) obj;
                generateDirectDepositFormRequest.getClass();
                Money money = generateDirectDepositFormRequest.amount_money;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = generateDirectDepositFormRequest.add_signature;
                byteString.getClass();
                return new GenerateDirectDepositFormRequest(money2, bool, null, null, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GenerateDirectDepositFormRequest generateDirectDepositFormRequest = (GenerateDirectDepositFormRequest) obj;
                generateDirectDepositFormRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, generateDirectDepositFormRequest.customer_name);
                protoAdapter2.encodeWithTag(protoWriter, 2, generateDirectDepositFormRequest.employer_name);
                protoAdapter2.encodeWithTag(protoWriter, 3, generateDirectDepositFormRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 4, generateDirectDepositFormRequest.percentage);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, generateDirectDepositFormRequest.add_signature);
                Money.ADAPTER.encodeWithTag(protoWriter, 6, generateDirectDepositFormRequest.amount_money);
                protoWriter.writeBytes(generateDirectDepositFormRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateDirectDepositFormRequest(Money money, Boolean bool, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_name = str;
        this.employer_name = str2;
        this.amount = str3;
        this.percentage = str4;
        this.add_signature = bool;
        this.amount_money = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateDirectDepositFormRequest)) {
            return false;
        }
        GenerateDirectDepositFormRequest generateDirectDepositFormRequest = (GenerateDirectDepositFormRequest) obj;
        return Intrinsics.areEqual(unknownFields(), generateDirectDepositFormRequest.unknownFields()) && Intrinsics.areEqual(this.customer_name, generateDirectDepositFormRequest.customer_name) && Intrinsics.areEqual(this.employer_name, generateDirectDepositFormRequest.employer_name) && Intrinsics.areEqual(this.amount, generateDirectDepositFormRequest.amount) && Intrinsics.areEqual(this.percentage, generateDirectDepositFormRequest.percentage) && Intrinsics.areEqual(this.add_signature, generateDirectDepositFormRequest.add_signature) && Intrinsics.areEqual(this.amount_money, generateDirectDepositFormRequest.amount_money);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.employer_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.amount;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.percentage;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.add_signature;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.amount_money;
        int hashCode7 = hashCode6 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(27);
        builder.slice_token = this.customer_name;
        builder.requester = this.employer_name;
        builder.responder = this.amount;
        builder.status = this.percentage;
        builder.action = this.add_signature;
        builder.amount = this.amount_money;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenerateDirectDepositFormRequest{", "}", 0, null, null, 56);
    }
}
