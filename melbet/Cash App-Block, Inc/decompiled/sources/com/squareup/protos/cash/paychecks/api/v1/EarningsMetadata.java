package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata$Builder;", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsTag;", "earnings_tag", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsTag;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EarningsMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsMetadata> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.paychecks.api.v1.EarningsTag#ADAPTER", schemaIndex = 0, tag = 1)
    public final EarningsTag earnings_tag;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "<init>", "()V", "earnings_tag", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsTag;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public EarningsTag earnings_tag;

        @Override // com.squareup.wire.Message.Builder
        public EarningsMetadata build() {
            return new EarningsMetadata(this.earnings_tag, buildUnknownFields());
        }

        public final Builder earnings_tag(EarningsTag earnings_tag) {
            this.earnings_tag = earnings_tag;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EarningsMetadata.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.paychecks.api.v1.EarningsMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public EarningsMetadata decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new EarningsMetadata((EarningsTag) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = EarningsTag.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EarningsMetadata value) {
                writer.getClass();
                value.getClass();
                EarningsTag.ADAPTER.encodeWithTag(writer, 1, value.earnings_tag);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EarningsMetadata value) {
                value.getClass();
                return EarningsTag.ADAPTER.encodedSizeWithTag(1, value.earnings_tag) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EarningsMetadata redact(EarningsMetadata value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                EarningsTag earningsTag = value.earnings_tag;
                value.getClass();
                byteString.getClass();
                return new EarningsMetadata(earningsTag, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EarningsMetadata value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                EarningsTag.ADAPTER.encodeWithTag(writer, 1, value.earnings_tag);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsMetadata(EarningsTag earningsTag, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.earnings_tag = earningsTag;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsMetadata)) {
            return false;
        }
        EarningsMetadata earningsMetadata = (EarningsMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), earningsMetadata.unknownFields()) && this.earnings_tag == earningsMetadata.earnings_tag;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningsTag earningsTag = this.earnings_tag;
        int hashCode2 = hashCode + (earningsTag != null ? earningsTag.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.earnings_tag = this.earnings_tag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningsTag earningsTag = this.earnings_tag;
        if (earningsTag != null) {
            arrayList.add("earnings_tag=" + earningsTag);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsMetadata{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata$Builder;", "", "body", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ EarningsMetadata build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
