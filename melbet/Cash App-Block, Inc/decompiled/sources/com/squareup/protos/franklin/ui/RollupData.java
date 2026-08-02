package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.RollupData;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/RollupData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/RollupData$Builder;", "Lcom/squareup/protos/franklin/ui/RollupData$Subtype;", "subtype", "Lcom/squareup/protos/franklin/ui/RollupData$Subtype;", "Companion", "Builder", "Subtype", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RollupData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RollupData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Subtype subtype;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/RollupData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/RollupData;", "<init>", "()V", "subtype", "Lcom/squareup/protos/franklin/ui/RollupData$Subtype;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Subtype subtype;

        @Override // com.squareup.wire.Message.Builder
        public RollupData build() {
            return new RollupData(this.subtype, buildUnknownFields());
        }

        public final Builder subtype(Subtype subtype) {
            this.subtype = subtype;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RollupData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.RollupData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RollupData decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                RollupData.Subtype.InvestmentOrderType investmentOrderType = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RollupData(investmentOrderType, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            investmentOrderType = new RollupData.Subtype.InvestmentOrderType((InvestmentOrderType) InvestmentOrderType.ADAPTER.decode(reader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RollupData value) {
                writer.getClass();
                value.getClass();
                RollupData.Subtype subtype = value.subtype;
                if (subtype instanceof RollupData.Subtype.InvestmentOrderType) {
                    InvestmentOrderType.ADAPTER.encodeWithTag(writer, 1, ((RollupData.Subtype.InvestmentOrderType) subtype).getValue());
                } else if (subtype != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RollupData value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                RollupData.Subtype subtype = value.subtype;
                if (subtype instanceof RollupData.Subtype.InvestmentOrderType) {
                    return InvestmentOrderType.ADAPTER.encodedSizeWithTag(1, ((RollupData.Subtype.InvestmentOrderType) subtype).getValue()) + size$okio;
                }
                if (subtype == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RollupData redact(RollupData value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                RollupData.Subtype subtype = value.subtype;
                value.getClass();
                byteString.getClass();
                return new RollupData(subtype, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RollupData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                RollupData.Subtype subtype = value.subtype;
                if (subtype instanceof RollupData.Subtype.InvestmentOrderType) {
                    InvestmentOrderType.ADAPTER.encodeWithTag(writer, 1, ((RollupData.Subtype.InvestmentOrderType) subtype).getValue());
                } else {
                    if (subtype == null) {
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
    public RollupData(Subtype subtype, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.subtype = subtype;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RollupData)) {
            return false;
        }
        RollupData rollupData = (RollupData) obj;
        return Intrinsics.areEqual(unknownFields(), rollupData.unknownFields()) && Intrinsics.areEqual(this.subtype, rollupData.subtype);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Subtype subtype = this.subtype;
        int hashCode2 = hashCode + (subtype != null ? subtype.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.subtype = this.subtype;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Subtype subtype = this.subtype;
        if (subtype != null) {
            arrayList.add("subtype=" + subtype);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RollupData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/RollupData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/RollupData$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/RollupData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/RollupData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RollupData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/ui/RollupData$Subtype;", "", "<init>", "()V", "InvestmentOrderType", "Lcom/squareup/protos/franklin/ui/RollupData$Subtype$InvestmentOrderType;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Subtype {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.InvestmentOrderType#ADAPTER", declaredName = "investment_order_type", tag = 1)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/RollupData$Subtype$InvestmentOrderType;", "Lcom/squareup/protos/franklin/ui/RollupData$Subtype;", "value", "Lcom/squareup/protos/franklin/ui/InvestmentOrderType;", "<init>", "(Lcom/squareup/protos/franklin/ui/InvestmentOrderType;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/InvestmentOrderType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvestmentOrderType extends Subtype {
            private final com.squareup.protos.franklin.ui.InvestmentOrderType value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvestmentOrderType(com.squareup.protos.franklin.ui.InvestmentOrderType investmentOrderType) {
                super(null);
                investmentOrderType.getClass();
                this.value = investmentOrderType;
            }

            public static /* synthetic */ InvestmentOrderType copy$default(InvestmentOrderType investmentOrderType, com.squareup.protos.franklin.ui.InvestmentOrderType investmentOrderType2, int i, Object obj) {
                if ((i & 1) != 0) {
                    investmentOrderType2 = investmentOrderType.value;
                }
                return investmentOrderType.copy(investmentOrderType2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.protos.franklin.ui.InvestmentOrderType getValue() {
                return this.value;
            }

            public final InvestmentOrderType copy(com.squareup.protos.franklin.ui.InvestmentOrderType value) {
                value.getClass();
                return new InvestmentOrderType(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvestmentOrderType) && this.value == ((InvestmentOrderType) other).value;
            }

            public final com.squareup.protos.franklin.ui.InvestmentOrderType getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InvestmentOrderType(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Subtype(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Subtype() {
        }
    }
}
