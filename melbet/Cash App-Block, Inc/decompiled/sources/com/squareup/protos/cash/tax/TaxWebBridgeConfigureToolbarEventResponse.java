package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse$Builder;", "", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;", "supported_item_types", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxWebBridgeConfigureToolbarEventResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxWebBridgeConfigureToolbarEventResponse> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType> supported_item_types;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;", "<init>", "()V", "supported_item_types", "", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventRequest$ToolbarItemType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<? extends TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType> supported_item_types = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public TaxWebBridgeConfigureToolbarEventResponse build() {
            return new TaxWebBridgeConfigureToolbarEventResponse(this.supported_item_types, buildUnknownFields());
        }

        public final Builder supported_item_types(List<? extends TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType> supported_item_types) {
            supported_item_types.getClass();
            TransactorKt.checkElementsNotNull(supported_item_types);
            this.supported_item_types = supported_item_types;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxWebBridgeConfigureToolbarEventResponse.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeConfigureToolbarEventResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeConfigureToolbarEventResponse decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TaxWebBridgeConfigureToolbarEventResponse(m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.tryDecode(reader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxWebBridgeConfigureToolbarEventResponse value) {
                writer.getClass();
                value.getClass();
                TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.supported_item_types);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxWebBridgeConfigureToolbarEventResponse value) {
                value.getClass();
                return TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.supported_item_types) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeConfigureToolbarEventResponse redact(TaxWebBridgeConfigureToolbarEventResponse value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                List<TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType> list = value.supported_item_types;
                value.getClass();
                list.getClass();
                byteString.getClass();
                return new TaxWebBridgeConfigureToolbarEventResponse(list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxWebBridgeConfigureToolbarEventResponse value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TaxWebBridgeConfigureToolbarEventRequest.ToolbarItemType.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.supported_item_types);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeConfigureToolbarEventResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.supported_item_types = TransactorKt.immutableCopyOf("supported_item_types", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxWebBridgeConfigureToolbarEventResponse)) {
            return false;
        }
        TaxWebBridgeConfigureToolbarEventResponse taxWebBridgeConfigureToolbarEventResponse = (TaxWebBridgeConfigureToolbarEventResponse) obj;
        return Intrinsics.areEqual(unknownFields(), taxWebBridgeConfigureToolbarEventResponse.unknownFields()) && Intrinsics.areEqual(this.supported_item_types, taxWebBridgeConfigureToolbarEventResponse.supported_item_types);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.supported_item_types.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.supported_item_types = this.supported_item_types;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.supported_item_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_item_types=", arrayList, this.supported_item_types);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxWebBridgeConfigureToolbarEventResponse{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeConfigureToolbarEventResponse;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TaxWebBridgeConfigureToolbarEventResponse build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
