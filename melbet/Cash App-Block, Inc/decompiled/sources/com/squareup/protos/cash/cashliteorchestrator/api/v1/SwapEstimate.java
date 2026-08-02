package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapQuoteRoute;", "route", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapQuoteRoute;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "source_amount", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "estimated_destination_amount", "fee_amount", "", "fee_bps", "Ljava/lang/Integer;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SwapEstimate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SwapEstimate> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapAmount#ADAPTER", schemaIndex = 2, tag = 4)
    public final SwapAmount estimated_destination_amount;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapAmount#ADAPTER", schemaIndex = 3, tag = 5)
    public final SwapAmount fee_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 4, tag = 6)
    public final Integer fee_bps;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapQuoteRoute#ADAPTER", schemaIndex = 0, tag = 2)
    public final SwapQuoteRoute route;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapAmount#ADAPTER", schemaIndex = 1, tag = 3)
    public final SwapAmount source_amount;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "<init>", "()V", "route", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapQuoteRoute;", "source_amount", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "estimated_destination_amount", "fee_amount", "fee_bps", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public SwapAmount estimated_destination_amount;
        public SwapAmount fee_amount;
        public Integer fee_bps;
        public SwapQuoteRoute route;
        public SwapAmount source_amount;

        @Override // com.squareup.wire.Message.Builder
        public SwapEstimate build() {
            return new SwapEstimate(this.route, this.source_amount, this.estimated_destination_amount, this.fee_amount, this.fee_bps, buildUnknownFields());
        }

        public final Builder estimated_destination_amount(SwapAmount estimated_destination_amount) {
            this.estimated_destination_amount = estimated_destination_amount;
            return this;
        }

        public final Builder fee_amount(SwapAmount fee_amount) {
            this.fee_amount = fee_amount;
            return this;
        }

        public final Builder fee_bps(Integer fee_bps) {
            this.fee_bps = fee_bps;
            return this;
        }

        public final Builder route(SwapQuoteRoute route) {
            this.route = route;
            return this;
        }

        public final Builder source_amount(SwapAmount source_amount) {
            this.source_amount = source_amount;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SwapEstimate.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapEstimate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SwapEstimate decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SwapEstimate((SwapQuoteRoute) obj, (SwapAmount) obj2, (SwapAmount) obj3, (SwapAmount) obj4, (Integer) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        try {
                            obj = SwapQuoteRoute.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(SwapAmount.ADAPTER, reader, obj2);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(SwapAmount.ADAPTER, reader, obj3);
                    } else if (nextTag == 5) {
                        obj4 = TransactorKt.decodeMessageOrMerge(SwapAmount.ADAPTER, reader, obj4);
                    } else if (nextTag != 6) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.UINT32.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SwapEstimate value) {
                writer.getClass();
                value.getClass();
                SwapQuoteRoute.ADAPTER.encodeWithTag(writer, 2, value.route);
                ProtoAdapter protoAdapter2 = SwapAmount.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.source_amount);
                protoAdapter2.encodeWithTag(writer, 4, value.estimated_destination_amount);
                protoAdapter2.encodeWithTag(writer, 5, value.fee_amount);
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.fee_bps);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SwapEstimate value) {
                value.getClass();
                int encodedSizeWithTag = SwapQuoteRoute.ADAPTER.encodedSizeWithTag(2, value.route) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = SwapAmount.ADAPTER;
                return ProtoAdapter.UINT32.encodedSizeWithTag(6, value.fee_bps) + protoAdapter2.encodedSizeWithTag(5, value.fee_amount) + protoAdapter2.encodedSizeWithTag(4, value.estimated_destination_amount) + protoAdapter2.encodedSizeWithTag(3, value.source_amount) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwapEstimate redact(SwapEstimate value) {
                value.getClass();
                SwapAmount swapAmount = value.source_amount;
                SwapAmount swapAmount2 = swapAmount != null ? (SwapAmount) SwapAmount.ADAPTER.redact(swapAmount) : null;
                SwapAmount swapAmount3 = value.estimated_destination_amount;
                SwapAmount swapAmount4 = swapAmount3 != null ? (SwapAmount) SwapAmount.ADAPTER.redact(swapAmount3) : null;
                SwapAmount swapAmount5 = value.fee_amount;
                SwapAmount swapAmount6 = swapAmount5 != null ? (SwapAmount) SwapAmount.ADAPTER.redact(swapAmount5) : null;
                ByteString byteString = ByteString.EMPTY;
                SwapQuoteRoute swapQuoteRoute = value.route;
                Integer num = value.fee_bps;
                byteString.getClass();
                return new SwapEstimate(swapQuoteRoute, swapAmount2, swapAmount4, swapAmount6, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SwapEstimate value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, value.fee_bps);
                ProtoAdapter protoAdapter2 = SwapAmount.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, value.fee_amount);
                protoAdapter2.encodeWithTag(writer, 4, value.estimated_destination_amount);
                protoAdapter2.encodeWithTag(writer, 3, value.source_amount);
                SwapQuoteRoute.ADAPTER.encodeWithTag(writer, 2, value.route);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapEstimate(SwapQuoteRoute swapQuoteRoute, SwapAmount swapAmount, SwapAmount swapAmount2, SwapAmount swapAmount3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.route = swapQuoteRoute;
        this.source_amount = swapAmount;
        this.estimated_destination_amount = swapAmount2;
        this.fee_amount = swapAmount3;
        this.fee_bps = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwapEstimate)) {
            return false;
        }
        SwapEstimate swapEstimate = (SwapEstimate) obj;
        return Intrinsics.areEqual(unknownFields(), swapEstimate.unknownFields()) && this.route == swapEstimate.route && Intrinsics.areEqual(this.source_amount, swapEstimate.source_amount) && Intrinsics.areEqual(this.estimated_destination_amount, swapEstimate.estimated_destination_amount) && Intrinsics.areEqual(this.fee_amount, swapEstimate.fee_amount) && Intrinsics.areEqual(this.fee_bps, swapEstimate.fee_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SwapQuoteRoute swapQuoteRoute = this.route;
        int hashCode2 = (hashCode + (swapQuoteRoute != null ? swapQuoteRoute.hashCode() : 0)) * 37;
        SwapAmount swapAmount = this.source_amount;
        int hashCode3 = (hashCode2 + (swapAmount != null ? swapAmount.hashCode() : 0)) * 37;
        SwapAmount swapAmount2 = this.estimated_destination_amount;
        int hashCode4 = (hashCode3 + (swapAmount2 != null ? swapAmount2.hashCode() : 0)) * 37;
        SwapAmount swapAmount3 = this.fee_amount;
        int hashCode5 = (hashCode4 + (swapAmount3 != null ? swapAmount3.hashCode() : 0)) * 37;
        Integer num = this.fee_bps;
        int hashCode6 = hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.route = this.route;
        builder.source_amount = this.source_amount;
        builder.estimated_destination_amount = this.estimated_destination_amount;
        builder.fee_amount = this.fee_amount;
        builder.fee_bps = this.fee_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SwapQuoteRoute swapQuoteRoute = this.route;
        if (swapQuoteRoute != null) {
            arrayList.add("route=" + swapQuoteRoute);
        }
        SwapAmount swapAmount = this.source_amount;
        if (swapAmount != null) {
            arrayList.add("source_amount=" + swapAmount);
        }
        SwapAmount swapAmount2 = this.estimated_destination_amount;
        if (swapAmount2 != null) {
            arrayList.add("estimated_destination_amount=" + swapAmount2);
        }
        SwapAmount swapAmount3 = this.fee_amount;
        if (swapAmount3 != null) {
            arrayList.add("fee_amount=" + swapAmount3);
        }
        Integer num = this.fee_bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("fee_bps=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwapEstimate{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SwapEstimate build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
