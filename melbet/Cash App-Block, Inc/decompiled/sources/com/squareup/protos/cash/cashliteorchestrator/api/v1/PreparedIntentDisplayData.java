package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.PreparedIntentDisplayData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData;", "display_data", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData;", "Companion", "Builder", "DisplayData", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreparedIntentDisplayData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreparedIntentDisplayData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final DisplayData display_data;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "<init>", "()V", "display_data", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public DisplayData display_data;

        @Override // com.squareup.wire.Message.Builder
        public PreparedIntentDisplayData build() {
            return new PreparedIntentDisplayData(this.display_data, buildUnknownFields());
        }

        public final Builder display_data(DisplayData display_data) {
            this.display_data = display_data;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PreparedIntentDisplayData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.PreparedIntentDisplayData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PreparedIntentDisplayData decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                PreparedIntentDisplayData.DisplayData displayData = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PreparedIntentDisplayData(displayData, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        displayData = new PreparedIntentDisplayData.DisplayData.SendSparkPayment((SendSparkPaymentDisplayData) SendSparkPaymentDisplayData.ADAPTER.decode(reader));
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        displayData = new PreparedIntentDisplayData.DisplayData.Swap((SwapDisplayData) SwapDisplayData.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PreparedIntentDisplayData value) {
                writer.getClass();
                value.getClass();
                PreparedIntentDisplayData.DisplayData displayData = value.display_data;
                if (displayData instanceof PreparedIntentDisplayData.DisplayData.SendSparkPayment) {
                    SendSparkPaymentDisplayData.ADAPTER.encodeWithTag(writer, 1, ((PreparedIntentDisplayData.DisplayData.SendSparkPayment) displayData).getValue());
                } else if (displayData instanceof PreparedIntentDisplayData.DisplayData.Swap) {
                    SwapDisplayData.ADAPTER.encodeWithTag(writer, 2, ((PreparedIntentDisplayData.DisplayData.Swap) displayData).getValue());
                } else if (displayData != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PreparedIntentDisplayData value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                PreparedIntentDisplayData.DisplayData displayData = value.display_data;
                if (displayData instanceof PreparedIntentDisplayData.DisplayData.SendSparkPayment) {
                    encodedSizeWithTag = SendSparkPaymentDisplayData.ADAPTER.encodedSizeWithTag(1, ((PreparedIntentDisplayData.DisplayData.SendSparkPayment) displayData).getValue());
                } else {
                    if (!(displayData instanceof PreparedIntentDisplayData.DisplayData.Swap)) {
                        if (displayData == null) {
                            return size$okio;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag = SwapDisplayData.ADAPTER.encodedSizeWithTag(2, ((PreparedIntentDisplayData.DisplayData.Swap) displayData).getValue());
                }
                return encodedSizeWithTag + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PreparedIntentDisplayData redact(PreparedIntentDisplayData value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                PreparedIntentDisplayData.DisplayData displayData = value.display_data;
                value.getClass();
                byteString.getClass();
                return new PreparedIntentDisplayData(displayData, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PreparedIntentDisplayData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PreparedIntentDisplayData.DisplayData displayData = value.display_data;
                if (displayData instanceof PreparedIntentDisplayData.DisplayData.SendSparkPayment) {
                    SendSparkPaymentDisplayData.ADAPTER.encodeWithTag(writer, 1, ((PreparedIntentDisplayData.DisplayData.SendSparkPayment) displayData).getValue());
                } else if (displayData instanceof PreparedIntentDisplayData.DisplayData.Swap) {
                    SwapDisplayData.ADAPTER.encodeWithTag(writer, 2, ((PreparedIntentDisplayData.DisplayData.Swap) displayData).getValue());
                } else {
                    if (displayData == null) {
                        return;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparedIntentDisplayData(DisplayData displayData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_data = displayData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreparedIntentDisplayData)) {
            return false;
        }
        PreparedIntentDisplayData preparedIntentDisplayData = (PreparedIntentDisplayData) obj;
        return Intrinsics.areEqual(unknownFields(), preparedIntentDisplayData.unknownFields()) && Intrinsics.areEqual(this.display_data, preparedIntentDisplayData.display_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DisplayData displayData = this.display_data;
        int hashCode2 = hashCode + (displayData != null ? displayData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.display_data = this.display_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DisplayData displayData = this.display_data;
        if (displayData != null) {
            arrayList.add("display_data=" + displayData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreparedIntentDisplayData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PreparedIntentDisplayData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData;", "", "<init>", "()V", "SendSparkPayment", "Swap", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData$SendSparkPayment;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData$Swap;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DisplayData {

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SendSparkPaymentDisplayData#ADAPTER", declaredName = "send_spark_payment", tag = 1)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData$SendSparkPayment;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SendSparkPaymentDisplayData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SendSparkPayment extends DisplayData {
            private final SendSparkPaymentDisplayData value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendSparkPayment(SendSparkPaymentDisplayData sendSparkPaymentDisplayData) {
                super(null);
                sendSparkPaymentDisplayData.getClass();
                this.value = sendSparkPaymentDisplayData;
            }

            public static /* synthetic */ SendSparkPayment copy$default(SendSparkPayment sendSparkPayment, SendSparkPaymentDisplayData sendSparkPaymentDisplayData, int i, Object obj) {
                if ((i & 1) != 0) {
                    sendSparkPaymentDisplayData = sendSparkPayment.value;
                }
                return sendSparkPayment.copy(sendSparkPaymentDisplayData);
            }

            /* renamed from: component1, reason: from getter */
            public final SendSparkPaymentDisplayData getValue() {
                return this.value;
            }

            public final SendSparkPayment copy(SendSparkPaymentDisplayData value) {
                value.getClass();
                return new SendSparkPayment(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendSparkPayment) && Intrinsics.areEqual(this.value, ((SendSparkPayment) other).value);
            }

            public final SendSparkPaymentDisplayData getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SendSparkPayment(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapDisplayData#ADAPTER", declaredName = "swap", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData$Swap;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData$DisplayData;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Swap extends DisplayData {
            private final SwapDisplayData value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Swap(SwapDisplayData swapDisplayData) {
                super(null);
                swapDisplayData.getClass();
                this.value = swapDisplayData;
            }

            public static /* synthetic */ Swap copy$default(Swap swap, SwapDisplayData swapDisplayData, int i, Object obj) {
                if ((i & 1) != 0) {
                    swapDisplayData = swap.value;
                }
                return swap.copy(swapDisplayData);
            }

            /* renamed from: component1, reason: from getter */
            public final SwapDisplayData getValue() {
                return this.value;
            }

            public final Swap copy(SwapDisplayData value) {
                value.getClass();
                return new Swap(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Swap) && Intrinsics.areEqual(this.value, ((Swap) other).value);
            }

            public final SwapDisplayData getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Swap(value=" + this.value + ")";
            }
        }

        public /* synthetic */ DisplayData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DisplayData() {
        }
    }
}
