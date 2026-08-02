package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.RatePlan;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem$Builder;", "", "intended_usage", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/RatePlan;", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "display_text", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmRatePlanConfig;", "confirm_rate_plan_config", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmRatePlanConfig;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntendedUsageItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IntendedUsageItem> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ConfirmRatePlanConfig#ADAPTER", schemaIndex = 3, tag = 4)
    public final ConfirmRatePlanConfig confirm_rate_plan_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String display_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String intended_usage;

    @WireField(adapter = "com.squareup.protos.franklin.api.RatePlan#ADAPTER", schemaIndex = 1, tag = 2)
    public final RatePlan rate_plan;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem;", "<init>", "()V", "intended_usage", "", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "display_text", "confirm_rate_plan_config", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmRatePlanConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ConfirmRatePlanConfig confirm_rate_plan_config;
        public String display_text;
        public String intended_usage;
        public RatePlan rate_plan;

        @Override // com.squareup.wire.Message.Builder
        public IntendedUsageItem build() {
            return new IntendedUsageItem(this.intended_usage, this.rate_plan, this.display_text, this.confirm_rate_plan_config, buildUnknownFields());
        }

        public final Builder confirm_rate_plan_config(ConfirmRatePlanConfig confirm_rate_plan_config) {
            this.confirm_rate_plan_config = confirm_rate_plan_config;
            return this;
        }

        public final Builder display_text(String display_text) {
            this.display_text = display_text;
            return this;
        }

        public final Builder intended_usage(String intended_usage) {
            this.intended_usage = intended_usage;
            return this;
        }

        public final Builder rate_plan(RatePlan rate_plan) {
            this.rate_plan = rate_plan;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IntendedUsageItem.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.IntendedUsageItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public IntendedUsageItem decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new IntendedUsageItem((String) obj, (RatePlan) obj2, (String) obj3, (ConfirmRatePlanConfig) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = RatePlan.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(ConfirmRatePlanConfig.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IntendedUsageItem value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.intended_usage);
                RatePlan.ADAPTER.encodeWithTag(writer, 2, value.rate_plan);
                protoAdapter2.encodeWithTag(writer, 3, value.display_text);
                ConfirmRatePlanConfig.ADAPTER.encodeWithTag(writer, 4, value.confirm_rate_plan_config);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IntendedUsageItem value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ConfirmRatePlanConfig.ADAPTER.encodedSizeWithTag(4, value.confirm_rate_plan_config) + protoAdapter2.encodedSizeWithTag(3, value.display_text) + RatePlan.ADAPTER.encodedSizeWithTag(2, value.rate_plan) + protoAdapter2.encodedSizeWithTag(1, value.intended_usage) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IntendedUsageItem redact(IntendedUsageItem value) {
                value.getClass();
                ConfirmRatePlanConfig confirmRatePlanConfig = value.confirm_rate_plan_config;
                ConfirmRatePlanConfig confirmRatePlanConfig2 = confirmRatePlanConfig != null ? (ConfirmRatePlanConfig) ConfirmRatePlanConfig.ADAPTER.redact(confirmRatePlanConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.intended_usage;
                RatePlan ratePlan = value.rate_plan;
                String str2 = value.display_text;
                byteString.getClass();
                return new IntendedUsageItem(str, ratePlan, str2, confirmRatePlanConfig2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IntendedUsageItem value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ConfirmRatePlanConfig.ADAPTER.encodeWithTag(writer, 4, value.confirm_rate_plan_config);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.display_text);
                RatePlan.ADAPTER.encodeWithTag(writer, 2, value.rate_plan);
                protoAdapter2.encodeWithTag(writer, 1, value.intended_usage);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntendedUsageItem(String str, RatePlan ratePlan, String str2, ConfirmRatePlanConfig confirmRatePlanConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.intended_usage = str;
        this.rate_plan = ratePlan;
        this.display_text = str2;
        this.confirm_rate_plan_config = confirmRatePlanConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntendedUsageItem)) {
            return false;
        }
        IntendedUsageItem intendedUsageItem = (IntendedUsageItem) obj;
        return Intrinsics.areEqual(unknownFields(), intendedUsageItem.unknownFields()) && Intrinsics.areEqual(this.intended_usage, intendedUsageItem.intended_usage) && this.rate_plan == intendedUsageItem.rate_plan && Intrinsics.areEqual(this.display_text, intendedUsageItem.display_text) && Intrinsics.areEqual(this.confirm_rate_plan_config, intendedUsageItem.confirm_rate_plan_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.intended_usage;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode3 = (hashCode2 + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        String str2 = this.display_text;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ConfirmRatePlanConfig confirmRatePlanConfig = this.confirm_rate_plan_config;
        int hashCode5 = hashCode4 + (confirmRatePlanConfig != null ? confirmRatePlanConfig.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.intended_usage = this.intended_usage;
        builder.rate_plan = this.rate_plan;
        builder.display_text = this.display_text;
        builder.confirm_rate_plan_config = this.confirm_rate_plan_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.intended_usage;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "intended_usage=", arrayList);
        }
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        String str2 = this.display_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_text=", arrayList);
        }
        ConfirmRatePlanConfig confirmRatePlanConfig = this.confirm_rate_plan_config;
        if (confirmRatePlanConfig != null) {
            arrayList.add("confirm_rate_plan_config=" + confirmRatePlanConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IntendedUsageItem{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ IntendedUsageItem build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
