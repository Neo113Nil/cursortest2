package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount$Builder;", "", "amount_base_units", "Ljava/lang/String;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAsset;", "asset", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAsset;", "", "decimals", "Ljava/lang/Integer;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SwapAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SwapAmount> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String amount_base_units;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapAsset#ADAPTER", schemaIndex = 1, tag = 2)
    public final SwapAsset asset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 2, tag = 3)
    public final Integer decimals;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "<init>", "()V", "amount_base_units", "", "asset", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAsset;", "decimals", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String amount_base_units;
        public SwapAsset asset;
        public Integer decimals;

        public final Builder amount_base_units(String amount_base_units) {
            this.amount_base_units = amount_base_units;
            return this;
        }

        public final Builder asset(SwapAsset asset) {
            this.asset = asset;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SwapAmount build() {
            return new SwapAmount(this.amount_base_units, this.asset, this.decimals, buildUnknownFields());
        }

        public final Builder decimals(Integer decimals) {
            this.decimals = decimals;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SwapAmount.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapAmount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SwapAmount decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SwapAmount((String) obj, (SwapAsset) obj2, (Integer) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = SwapAsset.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.UINT32.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SwapAmount value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.amount_base_units);
                SwapAsset.ADAPTER.encodeWithTag(writer, 2, value.asset);
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.decimals);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SwapAmount value) {
                value.getClass();
                return ProtoAdapter.UINT32.encodedSizeWithTag(3, value.decimals) + SwapAsset.ADAPTER.encodedSizeWithTag(2, value.asset) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.amount_base_units) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwapAmount redact(SwapAmount value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.amount_base_units;
                SwapAsset swapAsset = value.asset;
                Integer num = value.decimals;
                value.getClass();
                byteString.getClass();
                return new SwapAmount(str, swapAsset, num, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SwapAmount value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.decimals);
                SwapAsset.ADAPTER.encodeWithTag(writer, 2, value.asset);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.amount_base_units);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapAmount(String str, SwapAsset swapAsset, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount_base_units = str;
        this.asset = swapAsset;
        this.decimals = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwapAmount)) {
            return false;
        }
        SwapAmount swapAmount = (SwapAmount) obj;
        return Intrinsics.areEqual(unknownFields(), swapAmount.unknownFields()) && Intrinsics.areEqual(this.amount_base_units, swapAmount.amount_base_units) && this.asset == swapAmount.asset && Intrinsics.areEqual(this.decimals, swapAmount.decimals);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.amount_base_units;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SwapAsset swapAsset = this.asset;
        int hashCode3 = (hashCode2 + (swapAsset != null ? swapAsset.hashCode() : 0)) * 37;
        Integer num = this.decimals;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.amount_base_units = this.amount_base_units;
        builder.asset = this.asset;
        builder.decimals = this.decimals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.amount_base_units;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "amount_base_units=", arrayList);
        }
        SwapAsset swapAsset = this.asset;
        if (swapAsset != null) {
            arrayList.add("asset=" + swapAsset);
        }
        Integer num = this.decimals;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("decimals=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwapAmount{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SwapAmount;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SwapAmount build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
