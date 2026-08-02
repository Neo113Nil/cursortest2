package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry$Builder;", "Lcom/squareup/protos/common/countries/Country;", "country_code", "Lcom/squareup/protos/common/countries/Country;", "", "icon_url", "Ljava/lang/String;", "getIcon_url$annotations", "()V", "country_name", "", "supported", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DisplayCountry extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisplayCountry> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.countries.Country#ADAPTER", schemaIndex = 0, tag = 1)
    public final Country country_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String country_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean supported;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry;", "<init>", "()V", "country_code", "Lcom/squareup/protos/common/countries/Country;", "icon_url", "", "country_name", "supported", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Country country_code;
        public String country_name;
        public String icon_url;
        public Boolean supported;

        @Override // com.squareup.wire.Message.Builder
        public DisplayCountry build() {
            return new DisplayCountry(this.country_code, this.icon_url, this.country_name, this.supported, buildUnknownFields());
        }

        public final Builder country_code(Country country_code) {
            this.country_code = country_code;
            return this;
        }

        public final Builder country_name(String country_name) {
            this.country_name = country_name;
            return this;
        }

        @Deprecated
        public final Builder icon_url(String icon_url) {
            this.icon_url = icon_url;
            return this;
        }

        public final Builder supported(Boolean supported) {
            this.supported = supported;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DisplayCountry.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.DisplayCountry$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public DisplayCountry decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new DisplayCountry((Country) obj, (String) obj2, (String) obj3, (Boolean) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = Country.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisplayCountry value) {
                writer.getClass();
                value.getClass();
                Country.ADAPTER.encodeWithTag(writer, 1, value.country_code);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.icon_url);
                protoAdapter2.encodeWithTag(writer, 3, value.country_name);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.supported);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisplayCountry value) {
                value.getClass();
                int encodedSizeWithTag = Country.ADAPTER.encodedSizeWithTag(1, value.country_code) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, value.supported) + protoAdapter2.encodedSizeWithTag(3, value.country_name) + protoAdapter2.encodedSizeWithTag(2, value.icon_url) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayCountry redact(DisplayCountry value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Country country = value.country_code;
                String str = value.icon_url;
                String str2 = value.country_name;
                Boolean bool = value.supported;
                value.getClass();
                byteString.getClass();
                return new DisplayCountry(country, str, str2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisplayCountry value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.supported);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.country_name);
                protoAdapter2.encodeWithTag(writer, 2, value.icon_url);
                Country.ADAPTER.encodeWithTag(writer, 1, value.country_code);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayCountry(Country country, String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.country_code = country;
        this.icon_url = str;
        this.country_name = str2;
        this.supported = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisplayCountry)) {
            return false;
        }
        DisplayCountry displayCountry = (DisplayCountry) obj;
        return Intrinsics.areEqual(unknownFields(), displayCountry.unknownFields()) && this.country_code == displayCountry.country_code && Intrinsics.areEqual(this.icon_url, displayCountry.icon_url) && Intrinsics.areEqual(this.country_name, displayCountry.country_name) && Intrinsics.areEqual(this.supported, displayCountry.supported);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Country country = this.country_code;
        int hashCode2 = (hashCode + (country != null ? country.hashCode() : 0)) * 37;
        String str = this.icon_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.country_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.supported;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.country_code = this.country_code;
        builder.icon_url = this.icon_url;
        builder.country_name = this.country_name;
        builder.supported = this.supported;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        String str = this.icon_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_url=", arrayList);
        }
        String str2 = this.country_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "country_name=", arrayList);
        }
        Boolean bool = this.supported;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("supported=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayCountry{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/DisplayCountry;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ DisplayCountry build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
