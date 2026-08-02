package com.squareup.protos.cash.local.client.v1;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings$Builder;", "", "enabled", "Ljava/lang/Boolean;", "", "instructions", "Ljava/lang/String;", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "vehicle_collection_config", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "pos_alerts_enabled", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurbsidePickupSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CurbsidePickupSettings> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String instructions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean pos_alerts_enabled;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.VehicleCollectionConfig#ADAPTER", schemaIndex = 2, tag = 3)
    public final VehicleCollectionConfig vehicle_collection_config;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "<init>", "()V", "enabled", "", "Ljava/lang/Boolean;", "instructions", "", "vehicle_collection_config", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "pos_alerts_enabled", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean enabled;
        public String instructions;
        public Boolean pos_alerts_enabled;
        public VehicleCollectionConfig vehicle_collection_config;

        @Override // com.squareup.wire.Message.Builder
        public CurbsidePickupSettings build() {
            return new CurbsidePickupSettings(this.enabled, this.instructions, this.vehicle_collection_config, this.pos_alerts_enabled, buildUnknownFields());
        }

        public final Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        public final Builder pos_alerts_enabled(Boolean pos_alerts_enabled) {
            this.pos_alerts_enabled = pos_alerts_enabled;
            return this;
        }

        public final Builder vehicle_collection_config(VehicleCollectionConfig vehicle_collection_config) {
            this.vehicle_collection_config = vehicle_collection_config;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CurbsidePickupSettings.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.CurbsidePickupSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CurbsidePickupSettings decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CurbsidePickupSettings((Boolean) obj, (String) obj2, (VehicleCollectionConfig) obj3, (Boolean) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(VehicleCollectionConfig.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CurbsidePickupSettings value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.enabled);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.instructions);
                VehicleCollectionConfig.ADAPTER.encodeWithTag(writer, 3, value.vehicle_collection_config);
                protoAdapter2.encodeWithTag(writer, 4, value.pos_alerts_enabled);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CurbsidePickupSettings value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(4, value.pos_alerts_enabled) + VehicleCollectionConfig.ADAPTER.encodedSizeWithTag(3, value.vehicle_collection_config) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.instructions) + protoAdapter2.encodedSizeWithTag(1, value.enabled) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CurbsidePickupSettings redact(CurbsidePickupSettings value) {
                value.getClass();
                VehicleCollectionConfig vehicleCollectionConfig = value.vehicle_collection_config;
                VehicleCollectionConfig vehicleCollectionConfig2 = vehicleCollectionConfig != null ? (VehicleCollectionConfig) VehicleCollectionConfig.ADAPTER.redact(vehicleCollectionConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.enabled;
                String str = value.instructions;
                Boolean bool2 = value.pos_alerts_enabled;
                byteString.getClass();
                return new CurbsidePickupSettings(bool, str, vehicleCollectionConfig2, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CurbsidePickupSettings value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 4, value.pos_alerts_enabled);
                VehicleCollectionConfig.ADAPTER.encodeWithTag(writer, 3, value.vehicle_collection_config);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.instructions);
                protoAdapter2.encodeWithTag(writer, 1, value.enabled);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurbsidePickupSettings(Boolean bool, String str, VehicleCollectionConfig vehicleCollectionConfig, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.instructions = str;
        this.vehicle_collection_config = vehicleCollectionConfig;
        this.pos_alerts_enabled = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CurbsidePickupSettings)) {
            return false;
        }
        CurbsidePickupSettings curbsidePickupSettings = (CurbsidePickupSettings) obj;
        return Intrinsics.areEqual(unknownFields(), curbsidePickupSettings.unknownFields()) && Intrinsics.areEqual(this.enabled, curbsidePickupSettings.enabled) && Intrinsics.areEqual(this.instructions, curbsidePickupSettings.instructions) && Intrinsics.areEqual(this.vehicle_collection_config, curbsidePickupSettings.vehicle_collection_config) && Intrinsics.areEqual(this.pos_alerts_enabled, curbsidePickupSettings.pos_alerts_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.instructions;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        VehicleCollectionConfig vehicleCollectionConfig = this.vehicle_collection_config;
        int hashCode4 = (hashCode3 + (vehicleCollectionConfig != null ? vehicleCollectionConfig.hashCode() : 0)) * 37;
        Boolean bool2 = this.pos_alerts_enabled;
        int hashCode5 = hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.instructions = this.instructions;
        builder.vehicle_collection_config = this.vehicle_collection_config;
        builder.pos_alerts_enabled = this.pos_alerts_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        String str = this.instructions;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instructions=", arrayList);
        }
        VehicleCollectionConfig vehicleCollectionConfig = this.vehicle_collection_config;
        if (vehicleCollectionConfig != null) {
            arrayList.add("vehicle_collection_config=" + vehicleCollectionConfig);
        }
        Boolean bool2 = this.pos_alerts_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pos_alerts_enabled=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurbsidePickupSettings{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/CurbsidePickupSettings;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CurbsidePickupSettings build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
