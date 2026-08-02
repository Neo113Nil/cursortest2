package com.squareup.protos.cash.cdpproxy.api;

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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/Device;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cdpproxy/api/Device$Builder;", "", "id", "Ljava/lang/String;", "advertising_id", "manufacturer", "model", "sim_country_iso", "sim_mcc", "sim_mnc", "", "screen_height", "Ljava/lang/Integer;", "screen_width", "screen_density_dpi", "Lcom/squareup/protos/cash/cdpproxy/api/ScreenOrientation;", "screen_orientation", "Lcom/squareup/protos/cash/cdpproxy/api/ScreenOrientation;", "", "screen_scale", "Ljava/lang/Float;", "type", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Device extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Device> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String advertising_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String manufacturer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String screen_density_dpi;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 7, tag = 8)
    public final Integer screen_height;

    @WireField(adapter = "com.squareup.protos.cash.cdpproxy.api.ScreenOrientation#ADAPTER", schemaIndex = 10, tag = 11)
    public final ScreenOrientation screen_orientation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 11, tag = 12)
    public final Float screen_scale;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 8, tag = 9)
    public final Integer screen_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String sim_country_iso;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String sim_mcc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String sim_mnc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final String type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0019J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/Device$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cdpproxy/api/Device;", "<init>", "()V", "id", "", "advertising_id", "manufacturer", "model", "sim_country_iso", "sim_mcc", "sim_mnc", "screen_height", "", "Ljava/lang/Integer;", "screen_width", "screen_density_dpi", "screen_orientation", "Lcom/squareup/protos/cash/cdpproxy/api/ScreenOrientation;", "screen_scale", "", "Ljava/lang/Float;", "type", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/cdpproxy/api/Device$Builder;", "(Ljava/lang/Float;)Lcom/squareup/protos/cash/cdpproxy/api/Device$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String advertising_id;
        public String id;
        public String manufacturer;
        public String model;
        public String screen_density_dpi;
        public Integer screen_height;
        public ScreenOrientation screen_orientation;
        public Float screen_scale;
        public Integer screen_width;
        public String sim_country_iso;
        public String sim_mcc;
        public String sim_mnc;
        public String type;

        public final Builder advertising_id(String advertising_id) {
            this.advertising_id = advertising_id;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Device build() {
            return new Device(this.id, this.advertising_id, this.manufacturer, this.model, this.sim_country_iso, this.sim_mcc, this.sim_mnc, this.screen_height, this.screen_width, this.screen_density_dpi, this.screen_orientation, this.screen_scale, this.type, buildUnknownFields());
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public final Builder model(String model) {
            this.model = model;
            return this;
        }

        public final Builder screen_density_dpi(String screen_density_dpi) {
            this.screen_density_dpi = screen_density_dpi;
            return this;
        }

        public final Builder screen_height(Integer screen_height) {
            this.screen_height = screen_height;
            return this;
        }

        public final Builder screen_orientation(ScreenOrientation screen_orientation) {
            this.screen_orientation = screen_orientation;
            return this;
        }

        public final Builder screen_scale(Float screen_scale) {
            this.screen_scale = screen_scale;
            return this;
        }

        public final Builder screen_width(Integer screen_width) {
            this.screen_width = screen_width;
            return this;
        }

        public final Builder sim_country_iso(String sim_country_iso) {
            this.sim_country_iso = sim_country_iso;
            return this;
        }

        public final Builder sim_mcc(String sim_mcc) {
            this.sim_mcc = sim_mcc;
            return this;
        }

        public final Builder sim_mnc(String sim_mnc) {
            this.sim_mnc = sim_mnc;
            return this;
        }

        public final Builder type(String type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Device.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cdpproxy.api.Device$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31 */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v35 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public Device decode(ProtoReader reader) {
                String str;
                String str2;
                String str3;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Integer num = null;
                Integer num2 = null;
                String str11 = null;
                ScreenOrientation screenOrientation = null;
                Float f = null;
                String str12 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Device(str4, str5, str6, str7, str8, str9, str10, num, num2, str11, screenOrientation, f, str12, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 3:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 4:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 5:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 6:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 7:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 8:
                            num = ProtoAdapter.INT32.decode(reader);
                            decode = str4;
                            break;
                        case 9:
                            num2 = ProtoAdapter.INT32.decode(reader);
                            decode = str4;
                            break;
                        case 10:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 11:
                            try {
                                screenOrientation = ScreenOrientation.ADAPTER.decode(reader);
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                str = str5;
                                str2 = str6;
                                str3 = str7;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 12:
                            f = ProtoAdapter.FLOAT.decode(reader);
                            decode = str4;
                            break;
                        case 13:
                            str12 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            decode = str4;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            break;
                    }
                    str4 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Device value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.id);
                protoAdapter2.encodeWithTag(writer, 2, value.advertising_id);
                protoAdapter2.encodeWithTag(writer, 3, value.manufacturer);
                protoAdapter2.encodeWithTag(writer, 4, value.model);
                protoAdapter2.encodeWithTag(writer, 5, value.sim_country_iso);
                protoAdapter2.encodeWithTag(writer, 6, value.sim_mcc);
                protoAdapter2.encodeWithTag(writer, 7, value.sim_mnc);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 8, value.screen_height);
                protoAdapter3.encodeWithTag(writer, 9, value.screen_width);
                protoAdapter2.encodeWithTag(writer, 10, value.screen_density_dpi);
                ScreenOrientation.ADAPTER.encodeWithTag(writer, 11, value.screen_orientation);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 12, value.screen_scale);
                protoAdapter2.encodeWithTag(writer, 13, value.type);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Device value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(7, value.sim_mnc) + protoAdapter2.encodedSizeWithTag(6, value.sim_mcc) + protoAdapter2.encodedSizeWithTag(5, value.sim_country_iso) + protoAdapter2.encodedSizeWithTag(4, value.model) + protoAdapter2.encodedSizeWithTag(3, value.manufacturer) + protoAdapter2.encodedSizeWithTag(2, value.advertising_id) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                return protoAdapter2.encodedSizeWithTag(13, value.type) + ProtoAdapter.FLOAT.encodedSizeWithTag(12, value.screen_scale) + ScreenOrientation.ADAPTER.encodedSizeWithTag(11, value.screen_orientation) + protoAdapter2.encodedSizeWithTag(10, value.screen_density_dpi) + protoAdapter3.encodedSizeWithTag(9, value.screen_width) + protoAdapter3.encodedSizeWithTag(8, value.screen_height) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Device redact(Device value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.manufacturer;
                String str2 = value.model;
                String str3 = value.sim_country_iso;
                String str4 = value.sim_mcc;
                String str5 = value.sim_mnc;
                Integer num = value.screen_height;
                Integer num2 = value.screen_width;
                String str6 = value.screen_density_dpi;
                ScreenOrientation screenOrientation = value.screen_orientation;
                Float f = value.screen_scale;
                String str7 = value.type;
                value.getClass();
                byteString.getClass();
                return new Device(null, null, str, str2, str3, str4, str5, num, num2, str6, screenOrientation, f, str7, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Device value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 13, value.type);
                ProtoAdapter.FLOAT.encodeWithTag(writer, 12, value.screen_scale);
                ScreenOrientation.ADAPTER.encodeWithTag(writer, 11, value.screen_orientation);
                protoAdapter2.encodeWithTag(writer, 10, value.screen_density_dpi);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 9, value.screen_width);
                protoAdapter3.encodeWithTag(writer, 8, value.screen_height);
                protoAdapter2.encodeWithTag(writer, 7, value.sim_mnc);
                protoAdapter2.encodeWithTag(writer, 6, value.sim_mcc);
                protoAdapter2.encodeWithTag(writer, 5, value.sim_country_iso);
                protoAdapter2.encodeWithTag(writer, 4, value.model);
                protoAdapter2.encodeWithTag(writer, 3, value.manufacturer);
                protoAdapter2.encodeWithTag(writer, 2, value.advertising_id);
                protoAdapter2.encodeWithTag(writer, 1, value.id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, ScreenOrientation screenOrientation, Float f, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.advertising_id = str2;
        this.manufacturer = str3;
        this.model = str4;
        this.sim_country_iso = str5;
        this.sim_mcc = str6;
        this.sim_mnc = str7;
        this.screen_height = num;
        this.screen_width = num2;
        this.screen_density_dpi = str8;
        this.screen_orientation = screenOrientation;
        this.screen_scale = f;
        this.type = str9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return Intrinsics.areEqual(unknownFields(), device.unknownFields()) && Intrinsics.areEqual(this.id, device.id) && Intrinsics.areEqual(this.advertising_id, device.advertising_id) && Intrinsics.areEqual(this.manufacturer, device.manufacturer) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.sim_country_iso, device.sim_country_iso) && Intrinsics.areEqual(this.sim_mcc, device.sim_mcc) && Intrinsics.areEqual(this.sim_mnc, device.sim_mnc) && Intrinsics.areEqual(this.screen_height, device.screen_height) && Intrinsics.areEqual(this.screen_width, device.screen_width) && Intrinsics.areEqual(this.screen_density_dpi, device.screen_density_dpi) && this.screen_orientation == device.screen_orientation && Intrinsics.areEqual(this.screen_scale, device.screen_scale) && Intrinsics.areEqual(this.type, device.type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.advertising_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.manufacturer;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.model;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.sim_country_iso;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.sim_mcc;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.sim_mnc;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Integer num = this.screen_height;
        int hashCode9 = (hashCode8 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.screen_width;
        int hashCode10 = (hashCode9 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str8 = this.screen_density_dpi;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 37;
        ScreenOrientation screenOrientation = this.screen_orientation;
        int hashCode12 = (hashCode11 + (screenOrientation != null ? screenOrientation.hashCode() : 0)) * 37;
        Float f = this.screen_scale;
        int hashCode13 = (hashCode12 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
        String str9 = this.type;
        int hashCode14 = hashCode13 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.advertising_id = this.advertising_id;
        builder.manufacturer = this.manufacturer;
        builder.model = this.model;
        builder.sim_country_iso = this.sim_country_iso;
        builder.sim_mcc = this.sim_mcc;
        builder.sim_mnc = this.sim_mnc;
        builder.screen_height = this.screen_height;
        builder.screen_width = this.screen_width;
        builder.screen_density_dpi = this.screen_density_dpi;
        builder.screen_orientation = this.screen_orientation;
        builder.screen_scale = this.screen_scale;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.id != null) {
            arrayList.add("id=██");
        }
        if (this.advertising_id != null) {
            arrayList.add("advertising_id=██");
        }
        String str = this.manufacturer;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "manufacturer=", arrayList);
        }
        String str2 = this.model;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "model=", arrayList);
        }
        String str3 = this.sim_country_iso;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "sim_country_iso=", arrayList);
        }
        String str4 = this.sim_mcc;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sim_mcc=", arrayList);
        }
        String str5 = this.sim_mnc;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "sim_mnc=", arrayList);
        }
        Integer num = this.screen_height;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("screen_height=", num, arrayList);
        }
        Integer num2 = this.screen_width;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("screen_width=", num2, arrayList);
        }
        String str6 = this.screen_density_dpi;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "screen_density_dpi=", arrayList);
        }
        ScreenOrientation screenOrientation = this.screen_orientation;
        if (screenOrientation != null) {
            arrayList.add("screen_orientation=" + screenOrientation);
        }
        Float f = this.screen_scale;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("screen_scale=", f, arrayList);
        }
        String str7 = this.type;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "type=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Device{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/Device$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cdpproxy/api/Device$Builder;", "", "body", "Lcom/squareup/protos/cash/cdpproxy/api/Device;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cdpproxy/api/Device;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Device build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
