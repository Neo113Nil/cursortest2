package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "rate_plan_config", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "Lcom/squareup/protos/franklin/common/scenarios/ForcedRatePlanConfig;", "forced_rate_plan_config", "Lcom/squareup/protos/franklin/common/scenarios/ForcedRatePlanConfig;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RatePlanBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RatePlanBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ForcedRatePlanConfig#ADAPTER", schemaIndex = 1, tag = 2)
    public final ForcedRatePlanConfig forced_rate_plan_config;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.RatePlanConfig#ADAPTER", schemaIndex = 0, tag = 1)
    public final RatePlanConfig rate_plan_config;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "<init>", "()V", "rate_plan_config", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "forced_rate_plan_config", "Lcom/squareup/protos/franklin/common/scenarios/ForcedRatePlanConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ForcedRatePlanConfig forced_rate_plan_config;
        public RatePlanConfig rate_plan_config;

        @Override // com.squareup.wire.Message.Builder
        public RatePlanBlockerSupplement build() {
            return new RatePlanBlockerSupplement(this.rate_plan_config, this.forced_rate_plan_config, buildUnknownFields());
        }

        public final Builder forced_rate_plan_config(ForcedRatePlanConfig forced_rate_plan_config) {
            this.forced_rate_plan_config = forced_rate_plan_config;
            return this;
        }

        public final Builder rate_plan_config(RatePlanConfig rate_plan_config) {
            this.rate_plan_config = rate_plan_config;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RatePlanBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.RatePlanBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RatePlanBlockerSupplement decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RatePlanBlockerSupplement((RatePlanConfig) obj, (ForcedRatePlanConfig) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RatePlanConfig.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(ForcedRatePlanConfig.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RatePlanBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                RatePlanConfig.ADAPTER.encodeWithTag(writer, 1, value.rate_plan_config);
                ForcedRatePlanConfig.ADAPTER.encodeWithTag(writer, 2, value.forced_rate_plan_config);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RatePlanBlockerSupplement value) {
                value.getClass();
                return ForcedRatePlanConfig.ADAPTER.encodedSizeWithTag(2, value.forced_rate_plan_config) + RatePlanConfig.ADAPTER.encodedSizeWithTag(1, value.rate_plan_config) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RatePlanBlockerSupplement redact(RatePlanBlockerSupplement value) {
                value.getClass();
                RatePlanConfig ratePlanConfig = value.rate_plan_config;
                RatePlanConfig ratePlanConfig2 = ratePlanConfig != null ? (RatePlanConfig) RatePlanConfig.ADAPTER.redact(ratePlanConfig) : null;
                ForcedRatePlanConfig forcedRatePlanConfig = value.forced_rate_plan_config;
                ForcedRatePlanConfig forcedRatePlanConfig2 = forcedRatePlanConfig != null ? (ForcedRatePlanConfig) ForcedRatePlanConfig.ADAPTER.redact(forcedRatePlanConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RatePlanBlockerSupplement(ratePlanConfig2, forcedRatePlanConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RatePlanBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ForcedRatePlanConfig.ADAPTER.encodeWithTag(writer, 2, value.forced_rate_plan_config);
                RatePlanConfig.ADAPTER.encodeWithTag(writer, 1, value.rate_plan_config);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatePlanBlockerSupplement(RatePlanConfig ratePlanConfig, ForcedRatePlanConfig forcedRatePlanConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rate_plan_config = ratePlanConfig;
        this.forced_rate_plan_config = forcedRatePlanConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RatePlanBlockerSupplement)) {
            return false;
        }
        RatePlanBlockerSupplement ratePlanBlockerSupplement = (RatePlanBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), ratePlanBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.rate_plan_config, ratePlanBlockerSupplement.rate_plan_config) && Intrinsics.areEqual(this.forced_rate_plan_config, ratePlanBlockerSupplement.forced_rate_plan_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RatePlanConfig ratePlanConfig = this.rate_plan_config;
        int hashCode2 = (hashCode + (ratePlanConfig != null ? ratePlanConfig.hashCode() : 0)) * 37;
        ForcedRatePlanConfig forcedRatePlanConfig = this.forced_rate_plan_config;
        int hashCode3 = hashCode2 + (forcedRatePlanConfig != null ? forcedRatePlanConfig.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.rate_plan_config = this.rate_plan_config;
        builder.forced_rate_plan_config = this.forced_rate_plan_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RatePlanConfig ratePlanConfig = this.rate_plan_config;
        if (ratePlanConfig != null) {
            arrayList.add("rate_plan_config=" + ratePlanConfig);
        }
        ForcedRatePlanConfig forcedRatePlanConfig = this.forced_rate_plan_config;
        if (forcedRatePlanConfig != null) {
            arrayList.add("forced_rate_plan_config=" + forcedRatePlanConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RatePlanBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RatePlanBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
