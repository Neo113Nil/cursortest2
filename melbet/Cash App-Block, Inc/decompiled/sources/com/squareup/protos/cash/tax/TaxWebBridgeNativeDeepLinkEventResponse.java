package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\u0006\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Status;", "status", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Status;", "Companion", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxWebBridgeNativeDeepLinkEventResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxWebBridgeNativeDeepLinkEventResponse> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventResponse$Status#ADAPTER", schemaIndex = 0, tag = 1)
    public final Status status;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;", "<init>", "()V", "status", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Status;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Status status;

        @Override // com.squareup.wire.Message.Builder
        public TaxWebBridgeNativeDeepLinkEventResponse build() {
            return new TaxWebBridgeNativeDeepLinkEventResponse(this.status, buildUnknownFields());
        }

        public final Builder status(Status status) {
            this.status = status;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxWebBridgeNativeDeepLinkEventResponse.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeNativeDeepLinkEventResponse decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TaxWebBridgeNativeDeepLinkEventResponse((TaxWebBridgeNativeDeepLinkEventResponse.Status) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = TaxWebBridgeNativeDeepLinkEventResponse.Status.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxWebBridgeNativeDeepLinkEventResponse value) {
                writer.getClass();
                value.getClass();
                TaxWebBridgeNativeDeepLinkEventResponse.Status.ADAPTER.encodeWithTag(writer, 1, value.status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxWebBridgeNativeDeepLinkEventResponse value) {
                value.getClass();
                return TaxWebBridgeNativeDeepLinkEventResponse.Status.ADAPTER.encodedSizeWithTag(1, value.status) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxWebBridgeNativeDeepLinkEventResponse redact(TaxWebBridgeNativeDeepLinkEventResponse value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                TaxWebBridgeNativeDeepLinkEventResponse.Status status = value.status;
                value.getClass();
                byteString.getClass();
                return new TaxWebBridgeNativeDeepLinkEventResponse(status, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxWebBridgeNativeDeepLinkEventResponse value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TaxWebBridgeNativeDeepLinkEventResponse.Status.ADAPTER.encodeWithTag(writer, 1, value.status);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebBridgeNativeDeepLinkEventResponse(Status status, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxWebBridgeNativeDeepLinkEventResponse)) {
            return false;
        }
        TaxWebBridgeNativeDeepLinkEventResponse taxWebBridgeNativeDeepLinkEventResponse = (TaxWebBridgeNativeDeepLinkEventResponse) obj;
        return Intrinsics.areEqual(unknownFields(), taxWebBridgeNativeDeepLinkEventResponse.unknownFields()) && this.status == taxWebBridgeNativeDeepLinkEventResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = hashCode + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxWebBridgeNativeDeepLinkEventResponse{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HANDLED", "UNSUPPORTED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Status implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status HANDLED = new Status("HANDLED", 0, 1);
        public static final Status UNSUPPORTED = new Status("UNSUPPORTED", 1, 2);
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{HANDLED, UNSUPPORTED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Status.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.tax.TaxWebBridgeNativeDeepLinkEventResponse$Status$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TaxWebBridgeNativeDeepLinkEventResponse.Status fromValue(int value) {
                    return TaxWebBridgeNativeDeepLinkEventResponse.Status.INSTANCE.fromValue(value);
                }
            };
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Status fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Status;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status fromValue(int value) {
                if (value == 1) {
                    return Status.HANDLED;
                }
                if (value != 2) {
                    return null;
                }
                return Status.UNSUPPORTED;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse$Builder;", "", "body", "Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/tax/TaxWebBridgeNativeDeepLinkEventResponse;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TaxWebBridgeNativeDeepLinkEventResponse build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
