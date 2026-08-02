package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CreatePaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreatePaymentRequest> CREATOR;
    public final Money amount;
    public final zztw card_data;
    public final String idempotency_key;
    public final String initiator_note;
    public final SignedSerializedMRIContext signed_mri_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreatePaymentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentRequest$Companion$ADAPTER$1
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
                zztw zztwVar = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CreatePaymentRequest(zztwVar, (String) obj, (Money) obj2, (String) obj3, (SignedSerializedMRIContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            zztwVar = new CreatePaymentRequest$CardData$IosCardData((IOSCardData) IOSCardData.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            zztwVar = new CreatePaymentRequest$CardData$AndroidCardData((AndroidCardData) AndroidCardData.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            obj4 = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, protoReader, obj4);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest) obj;
                reverseProtoWriter.getClass();
                createPaymentRequest.getClass();
                reverseProtoWriter.writeBytes(createPaymentRequest.unknownFields());
                zztw zztwVar = createPaymentRequest.card_data;
                if (zztwVar instanceof CreatePaymentRequest$CardData$IosCardData) {
                    IOSCardData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CreatePaymentRequest$CardData$IosCardData) zztwVar).value);
                } else if (zztwVar instanceof CreatePaymentRequest$CardData$AndroidCardData) {
                    AndroidCardData.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CreatePaymentRequest$CardData$AndroidCardData) zztwVar).value);
                } else if (zztwVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, createPaymentRequest.signed_mri_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, createPaymentRequest.initiator_note);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createPaymentRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createPaymentRequest.idempotency_key);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest) obj;
                createPaymentRequest.getClass();
                int size$okio = createPaymentRequest.unknownFields().getSize$okio();
                zztw zztwVar = createPaymentRequest.card_data;
                if (zztwVar instanceof CreatePaymentRequest$CardData$IosCardData) {
                    encodedSizeWithTag = IOSCardData.ADAPTER.encodedSizeWithTag(1, ((CreatePaymentRequest$CardData$IosCardData) zztwVar).value);
                } else {
                    if (!(zztwVar instanceof CreatePaymentRequest$CardData$AndroidCardData)) {
                        if (zztwVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(6, createPaymentRequest.signed_mri_context) + protoAdapter2.encodedSizeWithTag(4, createPaymentRequest.initiator_note) + Money.ADAPTER.encodedSizeWithTag(3, createPaymentRequest.amount) + protoAdapter2.encodedSizeWithTag(2, createPaymentRequest.idempotency_key) + size$okio;
                    }
                    encodedSizeWithTag = AndroidCardData.ADAPTER.encodedSizeWithTag(5, ((CreatePaymentRequest$CardData$AndroidCardData) zztwVar).value);
                }
                size$okio += encodedSizeWithTag;
                ProtoAdapter protoAdapter22 = ProtoAdapter.STRING;
                return SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(6, createPaymentRequest.signed_mri_context) + protoAdapter22.encodedSizeWithTag(4, createPaymentRequest.initiator_note) + Money.ADAPTER.encodedSizeWithTag(3, createPaymentRequest.amount) + protoAdapter22.encodedSizeWithTag(2, createPaymentRequest.idempotency_key) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest) obj;
                createPaymentRequest.getClass();
                Money money = createPaymentRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                SignedSerializedMRIContext signedSerializedMRIContext = createPaymentRequest.signed_mri_context;
                SignedSerializedMRIContext signedSerializedMRIContext2 = signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null;
                ByteString byteString = ByteString.EMPTY;
                zztw zztwVar = createPaymentRequest.card_data;
                String str = createPaymentRequest.idempotency_key;
                byteString.getClass();
                return new CreatePaymentRequest(zztwVar, str, money2, null, signedSerializedMRIContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest) obj;
                createPaymentRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, createPaymentRequest.idempotency_key);
                Money.ADAPTER.encodeWithTag(protoWriter, 3, createPaymentRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 4, createPaymentRequest.initiator_note);
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(protoWriter, 6, createPaymentRequest.signed_mri_context);
                zztw zztwVar = createPaymentRequest.card_data;
                if (zztwVar instanceof CreatePaymentRequest$CardData$IosCardData) {
                    IOSCardData.ADAPTER.encodeWithTag(protoWriter, 1, ((CreatePaymentRequest$CardData$IosCardData) zztwVar).value);
                } else if (zztwVar instanceof CreatePaymentRequest$CardData$AndroidCardData) {
                    AndroidCardData.ADAPTER.encodeWithTag(protoWriter, 5, ((CreatePaymentRequest$CardData$AndroidCardData) zztwVar).value);
                } else if (zztwVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(createPaymentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePaymentRequest(zztw zztwVar, String str, Money money, String str2, SignedSerializedMRIContext signedSerializedMRIContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.card_data = zztwVar;
        this.idempotency_key = str;
        this.amount = money;
        this.initiator_note = str2;
        this.signed_mri_context = signedSerializedMRIContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatePaymentRequest)) {
            return false;
        }
        CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.card_data, createPaymentRequest.card_data) && Intrinsics.areEqual(this.idempotency_key, createPaymentRequest.idempotency_key) && Intrinsics.areEqual(this.amount, createPaymentRequest.amount) && Intrinsics.areEqual(this.initiator_note, createPaymentRequest.initiator_note) && Intrinsics.areEqual(this.signed_mri_context, createPaymentRequest.signed_mri_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zztw zztwVar = this.card_data;
        int hashCode2 = (hashCode + (zztwVar != null ? zztwVar.hashCode() : 0)) * 37;
        String str = this.idempotency_key;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.initiator_note;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        int hashCode6 = hashCode5 + (signedSerializedMRIContext != null ? signedSerializedMRIContext.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(29);
        builder.for_each = this.card_data;
        builder.moneybot_scaffold = this.idempotency_key;
        builder.compose_platform = this.amount;
        builder.is_included = this.initiator_note;
        builder.motion = this.signed_mri_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zztw zztwVar = this.card_data;
        if (zztwVar != null) {
            arrayList.add("card_data=" + zztwVar);
        }
        String str = this.idempotency_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotency_key=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.initiator_note != null) {
            arrayList.add("initiator_note=██");
        }
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        if (signedSerializedMRIContext != null) {
            arrayList.add("signed_mri_context=" + signedSerializedMRIContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePaymentRequest{", "}", 0, null, null, 56);
    }
}
