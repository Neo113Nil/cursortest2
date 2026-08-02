package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "estimate", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "", "expires_at", "Ljava/lang/String;", "", "lightning_fee_sats", "Ljava/lang/Long;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SwapDisplayData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SwapDisplayData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapEstimate#ADAPTER", schemaIndex = 0, tag = 1)
    public final SwapEstimate estimate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String expires_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 2, tag = 3)
    public final Long lightning_fee_sats;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;", "<init>", "()V", "estimate", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapEstimate;", "expires_at", "", "lightning_fee_sats", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public SwapEstimate estimate;
        public String expires_at;
        public Long lightning_fee_sats;

        @Override // com.squareup.wire.Message.Builder
        public SwapDisplayData build() {
            return new SwapDisplayData(this.estimate, this.expires_at, this.lightning_fee_sats, buildUnknownFields());
        }

        public final Builder estimate(SwapEstimate estimate) {
            this.estimate = estimate;
            return this;
        }

        public final Builder expires_at(String expires_at) {
            this.expires_at = expires_at;
            return this;
        }

        public final Builder lightning_fee_sats(Long lightning_fee_sats) {
            this.lightning_fee_sats = lightning_fee_sats;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SwapDisplayData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapDisplayData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SwapDisplayData decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SwapDisplayData((SwapEstimate) obj, (String) obj2, (Long) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(SwapEstimate.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.UINT64.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SwapDisplayData value) {
                writer.getClass();
                value.getClass();
                SwapEstimate.ADAPTER.encodeWithTag(writer, 1, value.estimate);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.expires_at);
                ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.lightning_fee_sats);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SwapDisplayData value) {
                value.getClass();
                return ProtoAdapter.UINT64.encodedSizeWithTag(3, value.lightning_fee_sats) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.expires_at) + SwapEstimate.ADAPTER.encodedSizeWithTag(1, value.estimate) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwapDisplayData redact(SwapDisplayData value) {
                value.getClass();
                SwapEstimate swapEstimate = value.estimate;
                SwapEstimate swapEstimate2 = swapEstimate != null ? (SwapEstimate) SwapEstimate.ADAPTER.redact(swapEstimate) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.expires_at;
                Long l = value.lightning_fee_sats;
                byteString.getClass();
                return new SwapDisplayData(swapEstimate2, str, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SwapDisplayData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.UINT64.encodeWithTag(writer, 3, value.lightning_fee_sats);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.expires_at);
                SwapEstimate.ADAPTER.encodeWithTag(writer, 1, value.estimate);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapDisplayData(SwapEstimate swapEstimate, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.estimate = swapEstimate;
        this.expires_at = str;
        this.lightning_fee_sats = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwapDisplayData)) {
            return false;
        }
        SwapDisplayData swapDisplayData = (SwapDisplayData) obj;
        return Intrinsics.areEqual(unknownFields(), swapDisplayData.unknownFields()) && Intrinsics.areEqual(this.estimate, swapDisplayData.estimate) && Intrinsics.areEqual(this.expires_at, swapDisplayData.expires_at) && Intrinsics.areEqual(this.lightning_fee_sats, swapDisplayData.lightning_fee_sats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SwapEstimate swapEstimate = this.estimate;
        int hashCode2 = (hashCode + (swapEstimate != null ? swapEstimate.hashCode() : 0)) * 37;
        String str = this.expires_at;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.lightning_fee_sats;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.estimate = this.estimate;
        builder.expires_at = this.expires_at;
        builder.lightning_fee_sats = this.lightning_fee_sats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SwapEstimate swapEstimate = this.estimate;
        if (swapEstimate != null) {
            arrayList.add("estimate=" + swapEstimate);
        }
        String str = this.expires_at;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "expires_at=", arrayList);
        }
        Long l = this.lightning_fee_sats;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("lightning_fee_sats=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwapDisplayData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapDisplayData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SwapDisplayData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
