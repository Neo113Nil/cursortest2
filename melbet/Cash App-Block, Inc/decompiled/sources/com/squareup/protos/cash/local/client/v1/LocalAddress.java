package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress$Builder;", "", "address_single_line", "Ljava/lang/String;", "locality", "state", "postal_code", "iso_alpha2_country_code", "", "latitude", "Ljava/lang/Double;", "longitude", "google_place_id", "address_line_1", "address_line_2", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalAddress> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String address_line_1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String address_line_2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String address_single_line;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String google_place_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String iso_alpha2_country_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 5, tag = 6)
    public final Double latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 6, tag = 7)
    public final Double longitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String postal_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String state;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalAddress$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "<init>", "()V", "address_single_line", "", "locality", "state", "postal_code", "iso_alpha2_country_code", "latitude", "", "Ljava/lang/Double;", "longitude", "google_place_id", "address_line_1", "address_line_2", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/local/client/v1/LocalAddress$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String address_line_1;
        public String address_line_2;
        public String address_single_line;
        public String google_place_id;
        public String iso_alpha2_country_code;
        public Double latitude;
        public String locality;
        public Double longitude;
        public String postal_code;
        public String state;

        public final Builder address_line_1(String address_line_1) {
            this.address_line_1 = address_line_1;
            return this;
        }

        public final Builder address_line_2(String address_line_2) {
            this.address_line_2 = address_line_2;
            return this;
        }

        public final Builder address_single_line(String address_single_line) {
            this.address_single_line = address_single_line;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LocalAddress build() {
            return new LocalAddress(this.address_single_line, this.locality, this.state, this.postal_code, this.iso_alpha2_country_code, this.latitude, this.longitude, this.google_place_id, this.address_line_1, this.address_line_2, buildUnknownFields());
        }

        public final Builder google_place_id(String google_place_id) {
            this.google_place_id = google_place_id;
            return this;
        }

        public final Builder iso_alpha2_country_code(String iso_alpha2_country_code) {
            this.iso_alpha2_country_code = iso_alpha2_country_code;
            return this;
        }

        public final Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public final Builder locality(String locality) {
            this.locality = locality;
            return this;
        }

        public final Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public final Builder postal_code(String postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        public final Builder state(String state) {
            this.state = state;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalAddress.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalAddress$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalAddress decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalAddress((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Double) obj6, (Double) obj7, (String) obj8, (String) obj9, (String) obj10, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalAddress value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.address_single_line);
                protoAdapter2.encodeWithTag(writer, 2, value.locality);
                protoAdapter2.encodeWithTag(writer, 3, value.state);
                protoAdapter2.encodeWithTag(writer, 4, value.postal_code);
                protoAdapter2.encodeWithTag(writer, 5, value.iso_alpha2_country_code);
                ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
                protoAdapter3.encodeWithTag(writer, 6, value.latitude);
                protoAdapter3.encodeWithTag(writer, 7, value.longitude);
                protoAdapter2.encodeWithTag(writer, 8, value.google_place_id);
                protoAdapter2.encodeWithTag(writer, 9, value.address_line_1);
                protoAdapter2.encodeWithTag(writer, 10, value.address_line_2);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalAddress value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, value.iso_alpha2_country_code) + protoAdapter2.encodedSizeWithTag(4, value.postal_code) + protoAdapter2.encodedSizeWithTag(3, value.state) + protoAdapter2.encodedSizeWithTag(2, value.locality) + protoAdapter2.encodedSizeWithTag(1, value.address_single_line) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
                return protoAdapter2.encodedSizeWithTag(10, value.address_line_2) + protoAdapter2.encodedSizeWithTag(9, value.address_line_1) + protoAdapter2.encodedSizeWithTag(8, value.google_place_id) + protoAdapter3.encodedSizeWithTag(7, value.longitude) + protoAdapter3.encodedSizeWithTag(6, value.latitude) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalAddress redact(LocalAddress value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.address_single_line;
                String str2 = value.locality;
                String str3 = value.state;
                String str4 = value.postal_code;
                String str5 = value.iso_alpha2_country_code;
                Double d = value.latitude;
                Double d2 = value.longitude;
                String str6 = value.google_place_id;
                String str7 = value.address_line_1;
                String str8 = value.address_line_2;
                value.getClass();
                byteString.getClass();
                return new LocalAddress(str, str2, str3, str4, str5, d, d2, str6, str7, str8, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalAddress value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 10, value.address_line_2);
                protoAdapter2.encodeWithTag(writer, 9, value.address_line_1);
                protoAdapter2.encodeWithTag(writer, 8, value.google_place_id);
                ProtoAdapter protoAdapter3 = ProtoAdapter.DOUBLE;
                protoAdapter3.encodeWithTag(writer, 7, value.longitude);
                protoAdapter3.encodeWithTag(writer, 6, value.latitude);
                protoAdapter2.encodeWithTag(writer, 5, value.iso_alpha2_country_code);
                protoAdapter2.encodeWithTag(writer, 4, value.postal_code);
                protoAdapter2.encodeWithTag(writer, 3, value.state);
                protoAdapter2.encodeWithTag(writer, 2, value.locality);
                protoAdapter2.encodeWithTag(writer, 1, value.address_single_line);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAddress(String str, String str2, String str3, String str4, String str5, Double d, Double d2, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address_single_line = str;
        this.locality = str2;
        this.state = str3;
        this.postal_code = str4;
        this.iso_alpha2_country_code = str5;
        this.latitude = d;
        this.longitude = d2;
        this.google_place_id = str6;
        this.address_line_1 = str7;
        this.address_line_2 = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalAddress)) {
            return false;
        }
        LocalAddress localAddress = (LocalAddress) obj;
        return Intrinsics.areEqual(unknownFields(), localAddress.unknownFields()) && Intrinsics.areEqual(this.address_single_line, localAddress.address_single_line) && Intrinsics.areEqual(this.locality, localAddress.locality) && Intrinsics.areEqual(this.state, localAddress.state) && Intrinsics.areEqual(this.postal_code, localAddress.postal_code) && Intrinsics.areEqual(this.iso_alpha2_country_code, localAddress.iso_alpha2_country_code) && Intrinsics.areEqual(this.latitude, localAddress.latitude) && Intrinsics.areEqual(this.longitude, localAddress.longitude) && Intrinsics.areEqual(this.google_place_id, localAddress.google_place_id) && Intrinsics.areEqual(this.address_line_1, localAddress.address_line_1) && Intrinsics.areEqual(this.address_line_2, localAddress.address_line_2);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.address_single_line;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.locality;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.state;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.postal_code;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.iso_alpha2_country_code;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Double d = this.latitude;
        int hashCode7 = (hashCode6 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Double d2 = this.longitude;
        int hashCode8 = (hashCode7 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
        String str6 = this.google_place_id;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.address_line_1;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.address_line_2;
        int hashCode11 = hashCode10 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.address_single_line = this.address_single_line;
        builder.locality = this.locality;
        builder.state = this.state;
        builder.postal_code = this.postal_code;
        builder.iso_alpha2_country_code = this.iso_alpha2_country_code;
        builder.latitude = this.latitude;
        builder.longitude = this.longitude;
        builder.google_place_id = this.google_place_id;
        builder.address_line_1 = this.address_line_1;
        builder.address_line_2 = this.address_line_2;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.address_single_line;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "address_single_line=", arrayList);
        }
        String str2 = this.locality;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "locality=", arrayList);
        }
        String str3 = this.state;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "state=", arrayList);
        }
        String str4 = this.postal_code;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "postal_code=", arrayList);
        }
        String str5 = this.iso_alpha2_country_code;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "iso_alpha2_country_code=", arrayList);
        }
        Double d = this.latitude;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("latitude=", d, arrayList);
        }
        Double d2 = this.longitude;
        if (d2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("longitude=", d2, arrayList);
        }
        String str6 = this.google_place_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "google_place_id=", arrayList);
        }
        String str7 = this.address_line_1;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "address_line_1=", arrayList);
        }
        String str8 = this.address_line_2;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "address_line_2=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalAddress{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalAddress$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalAddress;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalAddress build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
