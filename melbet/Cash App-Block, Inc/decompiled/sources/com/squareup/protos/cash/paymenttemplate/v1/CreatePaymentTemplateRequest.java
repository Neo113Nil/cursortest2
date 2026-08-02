package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.signing.SigningData;
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
public final class CreatePaymentTemplateRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreatePaymentTemplateRequest> CREATOR;
    public final Money amount;
    public final CreationChannel creation_channel;
    public final String note;
    public final String payment_getter_phone_number;
    public final SigningData signing_data_;
    public final TransactionCategory transaction_category;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreatePaymentTemplateRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paymenttemplate.v1.CreatePaymentTemplateRequest$Companion$ADAPTER$1
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
                        return new CreatePaymentTemplateRequest((Money) obj, (String) obj2, (CreationChannel) obj3, (TransactionCategory) obj4, (String) obj5, (SigningData) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = CreationChannel.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 4) {
                        try {
                            obj4 = TransactionCategory.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (nextTag == 5) {
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 1337) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj6 = TransactorKt.decodeMessageOrMerge(SigningData.ADAPTER, protoReader, obj6);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreatePaymentTemplateRequest createPaymentTemplateRequest = (CreatePaymentTemplateRequest) obj;
                reverseProtoWriter.getClass();
                createPaymentTemplateRequest.getClass();
                reverseProtoWriter.writeBytes(createPaymentTemplateRequest.unknownFields());
                SigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 1337, createPaymentTemplateRequest.signing_data_);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, createPaymentTemplateRequest.payment_getter_phone_number);
                TransactionCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createPaymentTemplateRequest.transaction_category);
                CreationChannel.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createPaymentTemplateRequest.creation_channel);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createPaymentTemplateRequest.note);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createPaymentTemplateRequest.amount);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreatePaymentTemplateRequest createPaymentTemplateRequest = (CreatePaymentTemplateRequest) obj;
                createPaymentTemplateRequest.getClass();
                int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, createPaymentTemplateRequest.amount) + createPaymentTemplateRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return SigningData.ADAPTER.encodedSizeWithTag(1337, createPaymentTemplateRequest.signing_data_) + protoAdapter2.encodedSizeWithTag(5, createPaymentTemplateRequest.payment_getter_phone_number) + TransactionCategory.ADAPTER.encodedSizeWithTag(4, createPaymentTemplateRequest.transaction_category) + CreationChannel.ADAPTER.encodedSizeWithTag(3, createPaymentTemplateRequest.creation_channel) + protoAdapter2.encodedSizeWithTag(2, createPaymentTemplateRequest.note) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreatePaymentTemplateRequest createPaymentTemplateRequest = (CreatePaymentTemplateRequest) obj;
                createPaymentTemplateRequest.getClass();
                Money money = createPaymentTemplateRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                SigningData signingData = createPaymentTemplateRequest.signing_data_;
                SigningData signingData2 = signingData != null ? (SigningData) SigningData.ADAPTER.redact(signingData) : null;
                ByteString byteString = ByteString.EMPTY;
                CreationChannel creationChannel = createPaymentTemplateRequest.creation_channel;
                TransactionCategory transactionCategory = createPaymentTemplateRequest.transaction_category;
                byteString.getClass();
                return new CreatePaymentTemplateRequest(money2, null, creationChannel, transactionCategory, null, signingData2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreatePaymentTemplateRequest createPaymentTemplateRequest = (CreatePaymentTemplateRequest) obj;
                createPaymentTemplateRequest.getClass();
                Money.ADAPTER.encodeWithTag(protoWriter, 1, createPaymentTemplateRequest.amount);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, createPaymentTemplateRequest.note);
                CreationChannel.ADAPTER.encodeWithTag(protoWriter, 3, createPaymentTemplateRequest.creation_channel);
                TransactionCategory.ADAPTER.encodeWithTag(protoWriter, 4, createPaymentTemplateRequest.transaction_category);
                protoAdapter2.encodeWithTag(protoWriter, 5, createPaymentTemplateRequest.payment_getter_phone_number);
                SigningData.ADAPTER.encodeWithTag(protoWriter, 1337, createPaymentTemplateRequest.signing_data_);
                protoWriter.writeBytes(createPaymentTemplateRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePaymentTemplateRequest(Money money, String str, CreationChannel creationChannel, TransactionCategory transactionCategory, String str2, SigningData signingData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.note = str;
        this.creation_channel = creationChannel;
        this.transaction_category = transactionCategory;
        this.payment_getter_phone_number = str2;
        this.signing_data_ = signingData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatePaymentTemplateRequest)) {
            return false;
        }
        CreatePaymentTemplateRequest createPaymentTemplateRequest = (CreatePaymentTemplateRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createPaymentTemplateRequest.unknownFields()) && Intrinsics.areEqual(this.amount, createPaymentTemplateRequest.amount) && Intrinsics.areEqual(this.note, createPaymentTemplateRequest.note) && this.creation_channel == createPaymentTemplateRequest.creation_channel && this.transaction_category == createPaymentTemplateRequest.transaction_category && Intrinsics.areEqual(this.payment_getter_phone_number, createPaymentTemplateRequest.payment_getter_phone_number) && Intrinsics.areEqual(this.signing_data_, createPaymentTemplateRequest.signing_data_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.note;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        CreationChannel creationChannel = this.creation_channel;
        int hashCode4 = (hashCode3 + (creationChannel != null ? creationChannel.hashCode() : 0)) * 37;
        TransactionCategory transactionCategory = this.transaction_category;
        int hashCode5 = (hashCode4 + (transactionCategory != null ? transactionCategory.hashCode() : 0)) * 37;
        String str2 = this.payment_getter_phone_number;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SigningData signingData = this.signing_data_;
        int hashCode7 = hashCode6 + (signingData != null ? signingData.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(24);
        builder.amount = this.amount;
        builder.slice_token = this.note;
        builder.requester = this.creation_channel;
        builder.responder = this.transaction_category;
        builder.status = this.payment_getter_phone_number;
        builder.action = this.signing_data_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        CreationChannel creationChannel = this.creation_channel;
        if (creationChannel != null) {
            arrayList.add("creation_channel=" + creationChannel);
        }
        TransactionCategory transactionCategory = this.transaction_category;
        if (transactionCategory != null) {
            arrayList.add("transaction_category=" + transactionCategory);
        }
        if (this.payment_getter_phone_number != null) {
            arrayList.add("payment_getter_phone_number=██");
        }
        SigningData signingData = this.signing_data_;
        if (signingData != null) {
            arrayList.add("signing_data_=" + signingData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePaymentTemplateRequest{", "}", 0, null, null, 56);
    }
}
