package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig$Builder;", "", "collect_vehicle_type", "Ljava/lang/Boolean;", "collect_vehicle_color", "collect_parking_spot", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VehicleCollectionConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VehicleCollectionConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean collect_parking_spot;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean collect_vehicle_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean collect_vehicle_type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "<init>", "()V", "collect_vehicle_type", "", "Ljava/lang/Boolean;", "collect_vehicle_color", "collect_parking_spot", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean collect_parking_spot;
        public Boolean collect_vehicle_color;
        public Boolean collect_vehicle_type;

        @Override // com.squareup.wire.Message.Builder
        public VehicleCollectionConfig build() {
            return new VehicleCollectionConfig(this.collect_vehicle_type, this.collect_vehicle_color, this.collect_parking_spot, buildUnknownFields());
        }

        public final Builder collect_parking_spot(Boolean collect_parking_spot) {
            this.collect_parking_spot = collect_parking_spot;
            return this;
        }

        public final Builder collect_vehicle_color(Boolean collect_vehicle_color) {
            this.collect_vehicle_color = collect_vehicle_color;
            return this;
        }

        public final Builder collect_vehicle_type(Boolean collect_vehicle_type) {
            this.collect_vehicle_type = collect_vehicle_type;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VehicleCollectionConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.VehicleCollectionConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public VehicleCollectionConfig decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new VehicleCollectionConfig((Boolean) obj, (Boolean) obj2, (Boolean) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, VehicleCollectionConfig value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.collect_vehicle_type);
                protoAdapter2.encodeWithTag(writer, 2, value.collect_vehicle_color);
                protoAdapter2.encodeWithTag(writer, 3, value.collect_parking_spot);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(VehicleCollectionConfig value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(3, value.collect_parking_spot) + protoAdapter2.encodedSizeWithTag(2, value.collect_vehicle_color) + protoAdapter2.encodedSizeWithTag(1, value.collect_vehicle_type) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VehicleCollectionConfig redact(VehicleCollectionConfig value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.collect_vehicle_type;
                Boolean bool2 = value.collect_vehicle_color;
                Boolean bool3 = value.collect_parking_spot;
                value.getClass();
                byteString.getClass();
                return new VehicleCollectionConfig(bool, bool2, bool3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, VehicleCollectionConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 3, value.collect_parking_spot);
                protoAdapter2.encodeWithTag(writer, 2, value.collect_vehicle_color);
                protoAdapter2.encodeWithTag(writer, 1, value.collect_vehicle_type);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleCollectionConfig(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.collect_vehicle_type = bool;
        this.collect_vehicle_color = bool2;
        this.collect_parking_spot = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VehicleCollectionConfig)) {
            return false;
        }
        VehicleCollectionConfig vehicleCollectionConfig = (VehicleCollectionConfig) obj;
        return Intrinsics.areEqual(unknownFields(), vehicleCollectionConfig.unknownFields()) && Intrinsics.areEqual(this.collect_vehicle_type, vehicleCollectionConfig.collect_vehicle_type) && Intrinsics.areEqual(this.collect_vehicle_color, vehicleCollectionConfig.collect_vehicle_color) && Intrinsics.areEqual(this.collect_parking_spot, vehicleCollectionConfig.collect_parking_spot);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.collect_vehicle_type;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.collect_vehicle_color;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.collect_parking_spot;
        int hashCode4 = hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.collect_vehicle_type = this.collect_vehicle_type;
        builder.collect_vehicle_color = this.collect_vehicle_color;
        builder.collect_parking_spot = this.collect_parking_spot;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.collect_vehicle_type;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("collect_vehicle_type=", bool, arrayList);
        }
        Boolean bool2 = this.collect_vehicle_color;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("collect_vehicle_color=", bool2, arrayList);
        }
        Boolean bool3 = this.collect_parking_spot;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("collect_parking_spot=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VehicleCollectionConfig{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/VehicleCollectionConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ VehicleCollectionConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
