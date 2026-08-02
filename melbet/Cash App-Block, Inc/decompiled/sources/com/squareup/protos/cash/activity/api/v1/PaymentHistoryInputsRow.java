package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow$Builder;", "", "entity_id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/ui/UiPayment;", "payment", "Lcom/squareup/protos/franklin/ui/UiPayment;", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "sender", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "recipient", "Lcom/squareup/protos/cash/syncentity/DomainType;", "domain_type", "Lcom/squareup/protos/cash/syncentity/DomainType;", "", "reference_ids", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaymentHistoryInputsRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentHistoryInputsRow> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.syncentity.DomainType#ADAPTER", schemaIndex = 4, tag = 8)
    public final DomainType domain_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String entity_id;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiPayment#ADAPTER", schemaIndex = 1, tag = 5)
    public final UiPayment payment;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", schemaIndex = 3, tag = 7)
    public final UiCustomer recipient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 9)
    public final List<String> reference_ids;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", schemaIndex = 2, tag = 6)
    public final UiCustomer sender;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "<init>", "()V", "entity_id", "", "payment", "Lcom/squareup/protos/franklin/ui/UiPayment;", "sender", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "recipient", "domain_type", "Lcom/squareup/protos/cash/syncentity/DomainType;", "reference_ids", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public DomainType domain_type;
        public String entity_id;
        public UiPayment payment;
        public UiCustomer recipient;
        public List<String> reference_ids = EmptyList.INSTANCE;
        public UiCustomer sender;

        @Override // com.squareup.wire.Message.Builder
        public PaymentHistoryInputsRow build() {
            return new PaymentHistoryInputsRow(this.entity_id, this.payment, this.sender, this.recipient, this.domain_type, this.reference_ids, buildUnknownFields());
        }

        public final Builder domain_type(DomainType domain_type) {
            this.domain_type = domain_type;
            return this;
        }

        public final Builder entity_id(String entity_id) {
            this.entity_id = entity_id;
            return this;
        }

        public final Builder payment(UiPayment payment) {
            this.payment = payment;
            return this;
        }

        public final Builder recipient(UiCustomer recipient) {
            this.recipient = recipient;
            return this;
        }

        public final Builder reference_ids(List<String> reference_ids) {
            reference_ids.getClass();
            TransactorKt.checkElementsNotNull(reference_ids);
            this.reference_ids = reference_ids;
            return this;
        }

        public final Builder sender(UiCustomer sender) {
            this.sender = sender;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentHistoryInputsRow.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryInputsRow decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentHistoryInputsRow((String) obj, (UiPayment) obj2, (UiCustomer) obj3, (UiCustomer) obj4, (DomainType) obj5, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag != 1) {
                        switch (nextTag) {
                            case 5:
                                obj2 = TransactorKt.decodeMessageOrMerge(UiPayment.ADAPTER, reader, obj2);
                                break;
                            case 6:
                                obj3 = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, reader, obj3);
                                break;
                            case 7:
                                obj4 = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, reader, obj4);
                                break;
                            case 8:
                                try {
                                    obj5 = DomainType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 9:
                                m.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    } else {
                        obj = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentHistoryInputsRow value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.entity_id);
                UiPayment.ADAPTER.encodeWithTag(writer, 5, value.payment);
                ProtoAdapter protoAdapter3 = UiCustomer.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 6, value.sender);
                protoAdapter3.encodeWithTag(writer, 7, value.recipient);
                DomainType.ADAPTER.encodeWithTag(writer, 8, value.domain_type);
                protoAdapter2.asRepeated().encodeWithTag(writer, 9, value.reference_ids);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentHistoryInputsRow value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = UiPayment.ADAPTER.encodedSizeWithTag(5, value.payment) + protoAdapter2.encodedSizeWithTag(1, value.entity_id) + size$okio;
                ProtoAdapter protoAdapter3 = UiCustomer.ADAPTER;
                return protoAdapter2.asRepeated().encodedSizeWithTag(9, value.reference_ids) + DomainType.ADAPTER.encodedSizeWithTag(8, value.domain_type) + protoAdapter3.encodedSizeWithTag(7, value.recipient) + protoAdapter3.encodedSizeWithTag(6, value.sender) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryInputsRow redact(PaymentHistoryInputsRow value) {
                value.getClass();
                UiPayment uiPayment = value.payment;
                UiPayment uiPayment2 = uiPayment != null ? (UiPayment) UiPayment.ADAPTER.redact(uiPayment) : null;
                UiCustomer uiCustomer = value.sender;
                UiCustomer uiCustomer2 = uiCustomer != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer) : null;
                UiCustomer uiCustomer3 = value.recipient;
                UiCustomer uiCustomer4 = uiCustomer3 != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.entity_id;
                DomainType domainType = value.domain_type;
                List<String> list = value.reference_ids;
                list.getClass();
                byteString.getClass();
                return new PaymentHistoryInputsRow(str, uiPayment2, uiCustomer2, uiCustomer4, domainType, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentHistoryInputsRow value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(writer, 9, value.reference_ids);
                DomainType.ADAPTER.encodeWithTag(writer, 8, value.domain_type);
                ProtoAdapter protoAdapter3 = UiCustomer.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 7, value.recipient);
                protoAdapter3.encodeWithTag(writer, 6, value.sender);
                UiPayment.ADAPTER.encodeWithTag(writer, 5, value.payment);
                protoAdapter2.encodeWithTag(writer, 1, value.entity_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryInputsRow(String str, UiPayment uiPayment, UiCustomer uiCustomer, UiCustomer uiCustomer2, DomainType domainType, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.entity_id = str;
        this.payment = uiPayment;
        this.sender = uiCustomer;
        this.recipient = uiCustomer2;
        this.domain_type = domainType;
        this.reference_ids = TransactorKt.immutableCopyOf("reference_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryInputsRow)) {
            return false;
        }
        PaymentHistoryInputsRow paymentHistoryInputsRow = (PaymentHistoryInputsRow) obj;
        return Intrinsics.areEqual(unknownFields(), paymentHistoryInputsRow.unknownFields()) && Intrinsics.areEqual(this.entity_id, paymentHistoryInputsRow.entity_id) && Intrinsics.areEqual(this.payment, paymentHistoryInputsRow.payment) && Intrinsics.areEqual(this.sender, paymentHistoryInputsRow.sender) && Intrinsics.areEqual(this.recipient, paymentHistoryInputsRow.recipient) && this.domain_type == paymentHistoryInputsRow.domain_type && Intrinsics.areEqual(this.reference_ids, paymentHistoryInputsRow.reference_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        UiPayment uiPayment = this.payment;
        int hashCode3 = (hashCode2 + (uiPayment != null ? uiPayment.hashCode() : 0)) * 37;
        UiCustomer uiCustomer = this.sender;
        int hashCode4 = (hashCode3 + (uiCustomer != null ? uiCustomer.hashCode() : 0)) * 37;
        UiCustomer uiCustomer2 = this.recipient;
        int hashCode5 = (hashCode4 + (uiCustomer2 != null ? uiCustomer2.hashCode() : 0)) * 37;
        DomainType domainType = this.domain_type;
        int hashCode6 = this.reference_ids.hashCode() + ((hashCode5 + (domainType != null ? domainType.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.entity_id = this.entity_id;
        builder.payment = this.payment;
        builder.sender = this.sender;
        builder.recipient = this.recipient;
        builder.domain_type = this.domain_type;
        builder.reference_ids = this.reference_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
        }
        UiPayment uiPayment = this.payment;
        if (uiPayment != null) {
            arrayList.add("payment=" + uiPayment);
        }
        UiCustomer uiCustomer = this.sender;
        if (uiCustomer != null) {
            arrayList.add("sender=" + uiCustomer);
        }
        UiCustomer uiCustomer2 = this.recipient;
        if (uiCustomer2 != null) {
            arrayList.add("recipient=" + uiCustomer2);
        }
        DomainType domainType = this.domain_type;
        if (domainType != null) {
            arrayList.add("domain_type=" + domainType);
        }
        if (!this.reference_ids.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reference_ids=", arrayList, this.reference_ids);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentHistoryInputsRow{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow$Builder;", "", "body", "Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/activity/api/v1/PaymentHistoryInputsRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentHistoryInputsRow build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public PaymentHistoryInputsRow() {
        this(null, null, null, null, null, EmptyList.INSTANCE, ByteString.EMPTY);
    }
}
