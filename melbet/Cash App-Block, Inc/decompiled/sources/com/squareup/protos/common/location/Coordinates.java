package com.squareup.protos.common.location;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/common/location/Coordinates;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/location/Coordinates$Builder;", "", "latitude", "Ljava/lang/Double;", "longitude", "altitude", "geographic_accuracy", "altitudinal_accuracy", "heading", "speed", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Coordinates extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Coordinates> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", redacted = true, schemaIndex = 2, tag = 3)
    public final Double altitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 4, tag = 5)
    public final Double altitudinal_accuracy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 3, tag = 4)
    public final Double geographic_accuracy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 5, tag = 6)
    public final Double heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", redacted = true, schemaIndex = 0, tag = 1)
    public final Double latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", redacted = true, schemaIndex = 1, tag = 2)
    public final Double longitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 6, tag = 7)
    public final Double speed;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/common/location/Coordinates$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/common/location/Coordinates;", "<init>", "()V", "latitude", "", "Ljava/lang/Double;", "longitude", "altitude", "geographic_accuracy", "altitudinal_accuracy", "heading", "speed", "(Ljava/lang/Double;)Lcom/squareup/protos/common/location/Coordinates$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Double altitude;
        public Double altitudinal_accuracy;
        public Double geographic_accuracy;
        public Double heading;
        public Double latitude;
        public Double longitude;
        public Double speed;

        public final Builder altitude(Double altitude) {
            this.altitude = altitude;
            return this;
        }

        public final Builder altitudinal_accuracy(Double altitudinal_accuracy) {
            this.altitudinal_accuracy = altitudinal_accuracy;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Coordinates build() {
            return new Coordinates(this.latitude, this.longitude, this.altitude, this.geographic_accuracy, this.altitudinal_accuracy, this.heading, this.speed, buildUnknownFields());
        }

        public final Builder geographic_accuracy(Double geographic_accuracy) {
            this.geographic_accuracy = geographic_accuracy;
            return this;
        }

        public final Builder heading(Double heading) {
            this.heading = heading;
            return this;
        }

        public final Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public final Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public final Builder speed(Double speed) {
            this.speed = speed;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Coordinates.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.location.Coordinates$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Coordinates decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Coordinates((Double) obj, (Double) obj2, (Double) obj3, (Double) obj4, (Double) obj5, (Double) obj6, (Double) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Coordinates value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
                protoAdapter2.encodeWithTag(writer, 1, value.latitude);
                protoAdapter2.encodeWithTag(writer, 2, value.longitude);
                protoAdapter2.encodeWithTag(writer, 3, value.altitude);
                protoAdapter2.encodeWithTag(writer, 4, value.geographic_accuracy);
                protoAdapter2.encodeWithTag(writer, 5, value.altitudinal_accuracy);
                protoAdapter2.encodeWithTag(writer, 6, value.heading);
                protoAdapter2.encodeWithTag(writer, 7, value.speed);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Coordinates value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
                return protoAdapter2.encodedSizeWithTag(7, value.speed) + protoAdapter2.encodedSizeWithTag(6, value.heading) + protoAdapter2.encodedSizeWithTag(5, value.altitudinal_accuracy) + protoAdapter2.encodedSizeWithTag(4, value.geographic_accuracy) + protoAdapter2.encodedSizeWithTag(3, value.altitude) + protoAdapter2.encodedSizeWithTag(2, value.longitude) + protoAdapter2.encodedSizeWithTag(1, value.latitude) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Coordinates redact(Coordinates value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Double d = value.geographic_accuracy;
                Double d2 = value.altitudinal_accuracy;
                Double d3 = value.heading;
                Double d4 = value.speed;
                value.getClass();
                byteString.getClass();
                return new Coordinates(null, null, null, d, d2, d3, d4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Coordinates value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.DOUBLE;
                protoAdapter2.encodeWithTag(writer, 7, value.speed);
                protoAdapter2.encodeWithTag(writer, 6, value.heading);
                protoAdapter2.encodeWithTag(writer, 5, value.altitudinal_accuracy);
                protoAdapter2.encodeWithTag(writer, 4, value.geographic_accuracy);
                protoAdapter2.encodeWithTag(writer, 3, value.altitude);
                protoAdapter2.encodeWithTag(writer, 2, value.longitude);
                protoAdapter2.encodeWithTag(writer, 1, value.latitude);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Coordinates(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.geographic_accuracy = d4;
        this.altitudinal_accuracy = d5;
        this.heading = d6;
        this.speed = d7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return Intrinsics.areEqual(unknownFields(), coordinates.unknownFields()) && Intrinsics.areEqual(this.latitude, coordinates.latitude) && Intrinsics.areEqual(this.longitude, coordinates.longitude) && Intrinsics.areEqual(this.altitude, coordinates.altitude) && Intrinsics.areEqual(this.geographic_accuracy, coordinates.geographic_accuracy) && Intrinsics.areEqual(this.altitudinal_accuracy, coordinates.altitudinal_accuracy) && Intrinsics.areEqual(this.heading, coordinates.heading) && Intrinsics.areEqual(this.speed, coordinates.speed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.latitude;
        int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Double d2 = this.longitude;
        int hashCode3 = (hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
        Double d3 = this.altitude;
        int hashCode4 = (hashCode3 + (d3 != null ? Double.hashCode(d3.doubleValue()) : 0)) * 37;
        Double d4 = this.geographic_accuracy;
        int hashCode5 = (hashCode4 + (d4 != null ? Double.hashCode(d4.doubleValue()) : 0)) * 37;
        Double d5 = this.altitudinal_accuracy;
        int hashCode6 = (hashCode5 + (d5 != null ? Double.hashCode(d5.doubleValue()) : 0)) * 37;
        Double d6 = this.heading;
        int hashCode7 = (hashCode6 + (d6 != null ? Double.hashCode(d6.doubleValue()) : 0)) * 37;
        Double d7 = this.speed;
        int hashCode8 = hashCode7 + (d7 != null ? Double.hashCode(d7.doubleValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.latitude = this.latitude;
        builder.longitude = this.longitude;
        builder.altitude = this.altitude;
        builder.geographic_accuracy = this.geographic_accuracy;
        builder.altitudinal_accuracy = this.altitudinal_accuracy;
        builder.heading = this.heading;
        builder.speed = this.speed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.latitude != null) {
            arrayList.add("latitude=██");
        }
        if (this.longitude != null) {
            arrayList.add("longitude=██");
        }
        if (this.altitude != null) {
            arrayList.add("altitude=██");
        }
        Double d = this.geographic_accuracy;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("geographic_accuracy=", d, arrayList);
        }
        Double d2 = this.altitudinal_accuracy;
        if (d2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("altitudinal_accuracy=", d2, arrayList);
        }
        Double d3 = this.heading;
        if (d3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("heading=", d3, arrayList);
        }
        Double d4 = this.speed;
        if (d4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("speed=", d4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Coordinates{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/common/location/Coordinates$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/common/location/Coordinates$Builder;", "", "body", "Lcom/squareup/protos/common/location/Coordinates;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/common/location/Coordinates;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Coordinates build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Coordinates(Double d, Double d2) {
        this(d, d2, null, null, null, null, null, ByteString.EMPTY);
    }
}
