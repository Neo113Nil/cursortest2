package com.squareup.protos.common.location;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.script.Script;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003/.0R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u0012\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0005\u0012\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u0012\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u0012\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u0012\u0004\b\u001f\u0010\u0017R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0005\u0012\u0004\b!\u0010\u0017R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0005\u0012\u0004\b#\u0010\u0017R\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0005\u0012\u0004\b%\u0010\u0017R\u001c\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0005\u0012\u0004\b'\u0010\u0017R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010\u0017R\u001c\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0005\u0012\u0004\b-\u0010\u0017¨\u00061"}, d2 = {"Lcom/squareup/protos/common/location/GlobalAddress;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/location/GlobalAddress$Builder;", "", "address_line_1", "Ljava/lang/String;", "address_line_2", "address_line_3", "locality", "sublocality", "administrative_district_level_1", "postal_code", "Lcom/squareup/protos/common/countries/Country;", "country_code", "Lcom/squareup/protos/common/countries/Country;", "Lcom/squareup/protos/common/script/Script;", "script", "Lcom/squareup/protos/common/script/Script;", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "alternate_formats", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "address_line_4", "getAddress_line_4$annotations", "()V", "address_line_5", "getAddress_line_5$annotations", "sublocality_1", "getSublocality_1$annotations", "sublocality_2", "getSublocality_2$annotations", "sublocality_3", "getSublocality_3$annotations", "sublocality_4", "getSublocality_4$annotations", "sublocality_5", "getSublocality_5$annotations", "administrative_district_level_2", "getAdministrative_district_level_2$annotations", "administrative_district_level_3", "getAdministrative_district_level_3$annotations", "Lcom/squareup/protos/common/location/Coordinates;", "address_coordinates", "Lcom/squareup/protos/common/location/Coordinates;", "getAddress_coordinates$annotations", "neighborhood", "getNeighborhood$annotations", "Companion", "Builder", "AlternateFormats", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GlobalAddress> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.location.Coordinates#ADAPTER", redacted = true, schemaIndex = 19, tag = 18)
    public final Coordinates address_coordinates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String address_line_1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String address_line_2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String address_line_3;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 10, tag = 4)
    public final String address_line_4;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 11, tag = 5)
    public final String address_line_5;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 13)
    public final String administrative_district_level_1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 17, tag = 14)
    public final String administrative_district_level_2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 18, tag = 15)
    public final String administrative_district_level_3;

    @WireField(adapter = "com.squareup.protos.common.location.GlobalAddress$AlternateFormats#ADAPTER", schemaIndex = 9, tag = 21)
    public final AlternateFormats alternate_formats;

    @WireField(adapter = "com.squareup.protos.common.countries.Country#ADAPTER", schemaIndex = 7, tag = 17)
    public final Country country_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 6)
    public final String locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 20, tag = 19)
    public final String neighborhood;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 16)
    public final String postal_code;

    @WireField(adapter = "com.squareup.protos.common.script.Script#ADAPTER", schemaIndex = 8, tag = 20)
    public final Script script;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 7)
    public final String sublocality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 12, tag = 8)
    public final String sublocality_1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 13, tag = 9)
    public final String sublocality_2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 14, tag = 10)
    public final String sublocality_3;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 15, tag = 11)
    public final String sublocality_4;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 16, tag = 12)
    public final String sublocality_5;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/common/location/GlobalAddress$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/common/location/GlobalAddress;", "<init>", "()V", "address_line_1", "", "address_line_2", "address_line_3", "locality", "sublocality", "administrative_district_level_1", "postal_code", "country_code", "Lcom/squareup/protos/common/countries/Country;", "script", "Lcom/squareup/protos/common/script/Script;", "alternate_formats", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "address_line_4", "address_line_5", "sublocality_1", "sublocality_2", "sublocality_3", "sublocality_4", "sublocality_5", "administrative_district_level_2", "administrative_district_level_3", "address_coordinates", "Lcom/squareup/protos/common/location/Coordinates;", "neighborhood", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public Coordinates address_coordinates;
        public String address_line_1;
        public String address_line_2;
        public String address_line_3;
        public String address_line_4;
        public String address_line_5;
        public String administrative_district_level_1;
        public String administrative_district_level_2;
        public String administrative_district_level_3;
        public AlternateFormats alternate_formats;
        public Country country_code;
        public String locality;
        public String neighborhood;
        public String postal_code;
        public Script script;
        public String sublocality;
        public String sublocality_1;
        public String sublocality_2;
        public String sublocality_3;
        public String sublocality_4;
        public String sublocality_5;

        @Deprecated
        public final Builder address_coordinates(Coordinates address_coordinates) {
            this.address_coordinates = address_coordinates;
            return this;
        }

        public final Builder address_line_1(String address_line_1) {
            this.address_line_1 = address_line_1;
            return this;
        }

        public final Builder address_line_2(String address_line_2) {
            this.address_line_2 = address_line_2;
            return this;
        }

        public final Builder address_line_3(String address_line_3) {
            this.address_line_3 = address_line_3;
            return this;
        }

        @Deprecated
        public final Builder address_line_4(String address_line_4) {
            this.address_line_4 = address_line_4;
            return this;
        }

        @Deprecated
        public final Builder address_line_5(String address_line_5) {
            this.address_line_5 = address_line_5;
            return this;
        }

        public final Builder administrative_district_level_1(String administrative_district_level_1) {
            this.administrative_district_level_1 = administrative_district_level_1;
            return this;
        }

        @Deprecated
        public final Builder administrative_district_level_2(String administrative_district_level_2) {
            this.administrative_district_level_2 = administrative_district_level_2;
            return this;
        }

        @Deprecated
        public final Builder administrative_district_level_3(String administrative_district_level_3) {
            this.administrative_district_level_3 = administrative_district_level_3;
            return this;
        }

        public final Builder alternate_formats(AlternateFormats alternate_formats) {
            this.alternate_formats = alternate_formats;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public GlobalAddress build() {
            return new GlobalAddress(this.address_line_1, this.address_line_2, this.address_line_3, this.locality, this.sublocality, this.administrative_district_level_1, this.postal_code, this.country_code, this.script, this.alternate_formats, this.address_line_4, this.address_line_5, this.sublocality_1, this.sublocality_2, this.sublocality_3, this.sublocality_4, this.sublocality_5, this.administrative_district_level_2, this.administrative_district_level_3, this.address_coordinates, this.neighborhood, buildUnknownFields());
        }

        public final Builder country_code(Country country_code) {
            this.country_code = country_code;
            return this;
        }

        public final Builder locality(String locality) {
            this.locality = locality;
            return this;
        }

        @Deprecated
        public final Builder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public final Builder postal_code(String postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        public final Builder script(Script script) {
            this.script = script;
            return this;
        }

        public final Builder sublocality(String sublocality) {
            this.sublocality = sublocality;
            return this;
        }

        @Deprecated
        public final Builder sublocality_1(String sublocality_1) {
            this.sublocality_1 = sublocality_1;
            return this;
        }

        @Deprecated
        public final Builder sublocality_2(String sublocality_2) {
            this.sublocality_2 = sublocality_2;
            return this;
        }

        @Deprecated
        public final Builder sublocality_3(String sublocality_3) {
            this.sublocality_3 = sublocality_3;
            return this;
        }

        @Deprecated
        public final Builder sublocality_4(String sublocality_4) {
            this.sublocality_4 = sublocality_4;
            return this;
        }

        @Deprecated
        public final Builder sublocality_5(String sublocality_5) {
            this.sublocality_5 = sublocality_5;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GlobalAddress.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.location.GlobalAddress$Companion$ADAPTER$1
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
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v50 */
            /* JADX WARN: Type inference failed for: r0v53 */
            /* JADX WARN: Type inference failed for: r0v54 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public GlobalAddress decode(ProtoReader reader) {
                String str;
                String str2;
                String str3;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str4 = null;
                Object obj = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                Country country = null;
                Script script = null;
                Object obj2 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new GlobalAddress(str4, str20, str5, str6, str7, str8, str9, country, script, (GlobalAddress.AlternateFormats) obj2, str10, str11, str12, str13, str14, str15, str16, str17, str18, (Coordinates) obj, str19, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str20 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 3:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 4:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 5:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 6:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 7:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 8:
                            str12 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 9:
                            str13 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 10:
                            str14 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 11:
                            str15 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 12:
                            str16 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 13:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 14:
                            str17 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 15:
                            str18 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 16:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 17:
                            str = str5;
                            str2 = str6;
                            str3 = str7;
                            try {
                                country = Country.ADAPTER.decode(reader);
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 18:
                            obj = TransactorKt.decodeMessageOrMerge(Coordinates.ADAPTER, reader, obj);
                            decode = str4;
                            break;
                        case 19:
                            str19 = ProtoAdapter.STRING.decode(reader);
                            decode = str4;
                            break;
                        case 20:
                            try {
                                script = Script.ADAPTER.decode(reader);
                                decode = str4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                str = str5;
                                str2 = str6;
                                str3 = str7;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 21:
                            obj2 = TransactorKt.decodeMessageOrMerge(GlobalAddress.AlternateFormats.ADAPTER, reader, obj2);
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
            public void encode(ProtoWriter writer, GlobalAddress value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.address_line_1);
                protoAdapter2.encodeWithTag(writer, 2, value.address_line_2);
                protoAdapter2.encodeWithTag(writer, 3, value.address_line_3);
                protoAdapter2.encodeWithTag(writer, 6, value.locality);
                protoAdapter2.encodeWithTag(writer, 7, value.sublocality);
                protoAdapter2.encodeWithTag(writer, 13, value.administrative_district_level_1);
                protoAdapter2.encodeWithTag(writer, 16, value.postal_code);
                Country.ADAPTER.encodeWithTag(writer, 17, value.country_code);
                Script.ADAPTER.encodeWithTag(writer, 20, value.script);
                GlobalAddress.AlternateFormats.ADAPTER.encodeWithTag(writer, 21, value.alternate_formats);
                protoAdapter2.encodeWithTag(writer, 4, value.address_line_4);
                protoAdapter2.encodeWithTag(writer, 5, value.address_line_5);
                protoAdapter2.encodeWithTag(writer, 8, value.sublocality_1);
                protoAdapter2.encodeWithTag(writer, 9, value.sublocality_2);
                protoAdapter2.encodeWithTag(writer, 10, value.sublocality_3);
                protoAdapter2.encodeWithTag(writer, 11, value.sublocality_4);
                protoAdapter2.encodeWithTag(writer, 12, value.sublocality_5);
                protoAdapter2.encodeWithTag(writer, 14, value.administrative_district_level_2);
                protoAdapter2.encodeWithTag(writer, 15, value.administrative_district_level_3);
                Coordinates.ADAPTER.encodeWithTag(writer, 18, value.address_coordinates);
                protoAdapter2.encodeWithTag(writer, 19, value.neighborhood);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GlobalAddress value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(19, value.neighborhood) + Coordinates.ADAPTER.encodedSizeWithTag(18, value.address_coordinates) + protoAdapter2.encodedSizeWithTag(15, value.administrative_district_level_3) + protoAdapter2.encodedSizeWithTag(14, value.administrative_district_level_2) + protoAdapter2.encodedSizeWithTag(12, value.sublocality_5) + protoAdapter2.encodedSizeWithTag(11, value.sublocality_4) + protoAdapter2.encodedSizeWithTag(10, value.sublocality_3) + protoAdapter2.encodedSizeWithTag(9, value.sublocality_2) + protoAdapter2.encodedSizeWithTag(8, value.sublocality_1) + protoAdapter2.encodedSizeWithTag(5, value.address_line_5) + protoAdapter2.encodedSizeWithTag(4, value.address_line_4) + GlobalAddress.AlternateFormats.ADAPTER.encodedSizeWithTag(21, value.alternate_formats) + Script.ADAPTER.encodedSizeWithTag(20, value.script) + Country.ADAPTER.encodedSizeWithTag(17, value.country_code) + protoAdapter2.encodedSizeWithTag(16, value.postal_code) + protoAdapter2.encodedSizeWithTag(13, value.administrative_district_level_1) + protoAdapter2.encodedSizeWithTag(7, value.sublocality) + protoAdapter2.encodedSizeWithTag(6, value.locality) + protoAdapter2.encodedSizeWithTag(3, value.address_line_3) + protoAdapter2.encodedSizeWithTag(2, value.address_line_2) + protoAdapter2.encodedSizeWithTag(1, value.address_line_1) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GlobalAddress redact(GlobalAddress value) {
                value.getClass();
                GlobalAddress.AlternateFormats alternateFormats = value.alternate_formats;
                return GlobalAddress.copy$default(value, null, null, null, null, null, alternateFormats != null ? (GlobalAddress.AlternateFormats) GlobalAddress.AlternateFormats.ADAPTER.redact(alternateFormats) : null, ByteString.EMPTY, MLKEMEngine.KyberPolyBytes);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GlobalAddress value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 19, value.neighborhood);
                Coordinates.ADAPTER.encodeWithTag(writer, 18, value.address_coordinates);
                protoAdapter2.encodeWithTag(writer, 15, value.administrative_district_level_3);
                protoAdapter2.encodeWithTag(writer, 14, value.administrative_district_level_2);
                protoAdapter2.encodeWithTag(writer, 12, value.sublocality_5);
                protoAdapter2.encodeWithTag(writer, 11, value.sublocality_4);
                protoAdapter2.encodeWithTag(writer, 10, value.sublocality_3);
                protoAdapter2.encodeWithTag(writer, 9, value.sublocality_2);
                protoAdapter2.encodeWithTag(writer, 8, value.sublocality_1);
                protoAdapter2.encodeWithTag(writer, 5, value.address_line_5);
                protoAdapter2.encodeWithTag(writer, 4, value.address_line_4);
                GlobalAddress.AlternateFormats.ADAPTER.encodeWithTag(writer, 21, value.alternate_formats);
                Script.ADAPTER.encodeWithTag(writer, 20, value.script);
                Country.ADAPTER.encodeWithTag(writer, 17, value.country_code);
                protoAdapter2.encodeWithTag(writer, 16, value.postal_code);
                protoAdapter2.encodeWithTag(writer, 13, value.administrative_district_level_1);
                protoAdapter2.encodeWithTag(writer, 7, value.sublocality);
                protoAdapter2.encodeWithTag(writer, 6, value.locality);
                protoAdapter2.encodeWithTag(writer, 3, value.address_line_3);
                protoAdapter2.encodeWithTag(writer, 2, value.address_line_2);
                protoAdapter2.encodeWithTag(writer, 1, value.address_line_1);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ GlobalAddress(String str, String str2, String str3, String str4, String str5, Country country, Coordinates coordinates, String str6, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, null, (i & 8) != 0 ? null : str3, null, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : country, null, null, null, null, null, null, null, null, null, null, null, (524288 & i) != 0 ? null : coordinates, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str6, ByteString.EMPTY);
    }

    public static GlobalAddress copy$default(GlobalAddress globalAddress, String str, String str2, String str3, String str4, String str5, AlternateFormats alternateFormats, ByteString byteString, int i) {
        String str6 = (i & 1) != 0 ? globalAddress.address_line_1 : str;
        String str7 = (i & 2) != 0 ? globalAddress.address_line_2 : str2;
        String str8 = (i & 4) != 0 ? globalAddress.address_line_3 : null;
        String str9 = (i & 8) != 0 ? globalAddress.locality : str3;
        String str10 = (i & 16) != 0 ? globalAddress.sublocality : null;
        String str11 = (i & 32) != 0 ? globalAddress.administrative_district_level_1 : str4;
        String str12 = (i & 64) != 0 ? globalAddress.postal_code : str5;
        Country country = globalAddress.country_code;
        Script script = globalAddress.script;
        AlternateFormats alternateFormats2 = (i & 512) != 0 ? globalAddress.alternate_formats : alternateFormats;
        String str13 = (i & 1024) != 0 ? globalAddress.address_line_4 : null;
        String str14 = (i & 2048) != 0 ? globalAddress.address_line_5 : null;
        String str15 = (i & 4096) != 0 ? globalAddress.sublocality_1 : null;
        String str16 = (i & PKIFailureInfo.certRevoked) != 0 ? globalAddress.sublocality_2 : null;
        String str17 = (i & 16384) != 0 ? globalAddress.sublocality_3 : null;
        String str18 = (32768 & i) != 0 ? globalAddress.sublocality_4 : null;
        String str19 = (65536 & i) != 0 ? globalAddress.sublocality_5 : null;
        String str20 = (131072 & i) != 0 ? globalAddress.administrative_district_level_2 : null;
        String str21 = (262144 & i) != 0 ? globalAddress.administrative_district_level_3 : null;
        Coordinates coordinates = (524288 & i) != 0 ? globalAddress.address_coordinates : null;
        String str22 = (1048576 & i) != 0 ? globalAddress.neighborhood : null;
        ByteString unknownFields = (i & PKIFailureInfo.badSenderNonce) != 0 ? globalAddress.unknownFields() : byteString;
        globalAddress.getClass();
        unknownFields.getClass();
        return new GlobalAddress(str6, str7, str8, str9, str10, str11, str12, country, script, alternateFormats2, str13, str14, str15, str16, str17, str18, str19, str20, str21, coordinates, str22, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GlobalAddress)) {
            return false;
        }
        GlobalAddress globalAddress = (GlobalAddress) obj;
        return Intrinsics.areEqual(unknownFields(), globalAddress.unknownFields()) && Intrinsics.areEqual(this.address_line_1, globalAddress.address_line_1) && Intrinsics.areEqual(this.address_line_2, globalAddress.address_line_2) && Intrinsics.areEqual(this.address_line_3, globalAddress.address_line_3) && Intrinsics.areEqual(this.locality, globalAddress.locality) && Intrinsics.areEqual(this.sublocality, globalAddress.sublocality) && Intrinsics.areEqual(this.administrative_district_level_1, globalAddress.administrative_district_level_1) && Intrinsics.areEqual(this.postal_code, globalAddress.postal_code) && this.country_code == globalAddress.country_code && this.script == globalAddress.script && Intrinsics.areEqual(this.alternate_formats, globalAddress.alternate_formats) && Intrinsics.areEqual(this.address_line_4, globalAddress.address_line_4) && Intrinsics.areEqual(this.address_line_5, globalAddress.address_line_5) && Intrinsics.areEqual(this.sublocality_1, globalAddress.sublocality_1) && Intrinsics.areEqual(this.sublocality_2, globalAddress.sublocality_2) && Intrinsics.areEqual(this.sublocality_3, globalAddress.sublocality_3) && Intrinsics.areEqual(this.sublocality_4, globalAddress.sublocality_4) && Intrinsics.areEqual(this.sublocality_5, globalAddress.sublocality_5) && Intrinsics.areEqual(this.administrative_district_level_2, globalAddress.administrative_district_level_2) && Intrinsics.areEqual(this.administrative_district_level_3, globalAddress.administrative_district_level_3) && Intrinsics.areEqual(this.address_coordinates, globalAddress.address_coordinates) && Intrinsics.areEqual(this.neighborhood, globalAddress.neighborhood);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.address_line_1;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.address_line_2;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.address_line_3;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.locality;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.sublocality;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.administrative_district_level_1;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.postal_code;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Country country = this.country_code;
        int hashCode9 = (hashCode8 + (country != null ? country.hashCode() : 0)) * 37;
        Script script = this.script;
        int hashCode10 = (hashCode9 + (script != null ? script.hashCode() : 0)) * 37;
        AlternateFormats alternateFormats = this.alternate_formats;
        int hashCode11 = (hashCode10 + (alternateFormats != null ? alternateFormats.hashCode() : 0)) * 37;
        String str8 = this.address_line_4;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.address_line_5;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.sublocality_1;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.sublocality_2;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.sublocality_3;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.sublocality_4;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.sublocality_5;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.administrative_district_level_2;
        int hashCode19 = (hashCode18 + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.administrative_district_level_3;
        int hashCode20 = (hashCode19 + (str16 != null ? str16.hashCode() : 0)) * 37;
        Coordinates coordinates = this.address_coordinates;
        int hashCode21 = (hashCode20 + (coordinates != null ? coordinates.hashCode() : 0)) * 37;
        String str17 = this.neighborhood;
        int hashCode22 = hashCode21 + (str17 != null ? str17.hashCode() : 0);
        this.hashCode = hashCode22;
        return hashCode22;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.address_line_1 = this.address_line_1;
        builder.address_line_2 = this.address_line_2;
        builder.address_line_3 = this.address_line_3;
        builder.locality = this.locality;
        builder.sublocality = this.sublocality;
        builder.administrative_district_level_1 = this.administrative_district_level_1;
        builder.postal_code = this.postal_code;
        builder.country_code = this.country_code;
        builder.script = this.script;
        builder.alternate_formats = this.alternate_formats;
        builder.address_line_4 = this.address_line_4;
        builder.address_line_5 = this.address_line_5;
        builder.sublocality_1 = this.sublocality_1;
        builder.sublocality_2 = this.sublocality_2;
        builder.sublocality_3 = this.sublocality_3;
        builder.sublocality_4 = this.sublocality_4;
        builder.sublocality_5 = this.sublocality_5;
        builder.administrative_district_level_2 = this.administrative_district_level_2;
        builder.administrative_district_level_3 = this.administrative_district_level_3;
        builder.address_coordinates = this.address_coordinates;
        builder.neighborhood = this.neighborhood;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.address_line_1 != null) {
            arrayList.add("address_line_1=██");
        }
        if (this.address_line_2 != null) {
            arrayList.add("address_line_2=██");
        }
        if (this.address_line_3 != null) {
            arrayList.add("address_line_3=██");
        }
        if (this.locality != null) {
            arrayList.add("locality=██");
        }
        if (this.sublocality != null) {
            arrayList.add("sublocality=██");
        }
        if (this.administrative_district_level_1 != null) {
            arrayList.add("administrative_district_level_1=██");
        }
        if (this.postal_code != null) {
            arrayList.add("postal_code=██");
        }
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        Script script = this.script;
        if (script != null) {
            arrayList.add("script=" + script);
        }
        AlternateFormats alternateFormats = this.alternate_formats;
        if (alternateFormats != null) {
            arrayList.add("alternate_formats=" + alternateFormats);
        }
        if (this.address_line_4 != null) {
            arrayList.add("address_line_4=██");
        }
        if (this.address_line_5 != null) {
            arrayList.add("address_line_5=██");
        }
        if (this.sublocality_1 != null) {
            arrayList.add("sublocality_1=██");
        }
        if (this.sublocality_2 != null) {
            arrayList.add("sublocality_2=██");
        }
        if (this.sublocality_3 != null) {
            arrayList.add("sublocality_3=██");
        }
        if (this.sublocality_4 != null) {
            arrayList.add("sublocality_4=██");
        }
        if (this.sublocality_5 != null) {
            arrayList.add("sublocality_5=██");
        }
        if (this.administrative_district_level_2 != null) {
            arrayList.add("administrative_district_level_2=██");
        }
        if (this.administrative_district_level_3 != null) {
            arrayList.add("administrative_district_level_3=██");
        }
        if (this.address_coordinates != null) {
            arrayList.add("address_coordinates=██");
        }
        if (this.neighborhood != null) {
            arrayList.add("neighborhood=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GlobalAddress{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats$Builder;", "country_subdivision_code", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AlternateFormats extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AlternateFormats> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String country_subdivision_code;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "<init>", "()V", "country_subdivision_code", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String country_subdivision_code;

            @Override // com.squareup.wire.Message.Builder
            public AlternateFormats build() {
                return new AlternateFormats(this.country_subdivision_code, buildUnknownFields());
            }

            public final Builder country_subdivision_code(String country_subdivision_code) {
                this.country_subdivision_code = country_subdivision_code;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AlternateFormats.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.location.GlobalAddress$AlternateFormats$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GlobalAddress.AlternateFormats decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new GlobalAddress.AlternateFormats((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GlobalAddress.AlternateFormats value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.country_subdivision_code);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GlobalAddress.AlternateFormats value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.country_subdivision_code) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GlobalAddress.AlternateFormats redact(GlobalAddress.AlternateFormats value) {
                    value.getClass();
                    return GlobalAddress.AlternateFormats.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GlobalAddress.AlternateFormats value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.country_subdivision_code);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AlternateFormats(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AlternateFormats copy$default(AlternateFormats alternateFormats, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alternateFormats.country_subdivision_code;
            }
            if ((i & 2) != 0) {
                byteString = alternateFormats.unknownFields();
            }
            return alternateFormats.copy(str, byteString);
        }

        public final AlternateFormats copy(String country_subdivision_code, ByteString unknownFields) {
            unknownFields.getClass();
            return new AlternateFormats(country_subdivision_code, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AlternateFormats)) {
                return false;
            }
            AlternateFormats alternateFormats = (AlternateFormats) other;
            return Intrinsics.areEqual(unknownFields(), alternateFormats.unknownFields()) && Intrinsics.areEqual(this.country_subdivision_code, alternateFormats.country_subdivision_code);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.country_subdivision_code;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.country_subdivision_code = this.country_subdivision_code;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.country_subdivision_code;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "country_subdivision_code=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AlternateFormats{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats$Builder;", "", "body", "Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/common/location/GlobalAddress$AlternateFormats;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AlternateFormats build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AlternateFormats() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlternateFormats(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.country_subdivision_code = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/common/location/GlobalAddress$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/common/location/GlobalAddress$Builder;", "", "body", "Lcom/squareup/protos/common/location/GlobalAddress;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/common/location/GlobalAddress;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ GlobalAddress build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, Country country, Script script, AlternateFormats alternateFormats, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Coordinates coordinates, String str17, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address_line_1 = str;
        this.address_line_2 = str2;
        this.address_line_3 = str3;
        this.locality = str4;
        this.sublocality = str5;
        this.administrative_district_level_1 = str6;
        this.postal_code = str7;
        this.country_code = country;
        this.script = script;
        this.alternate_formats = alternateFormats;
        this.address_line_4 = str8;
        this.address_line_5 = str9;
        this.sublocality_1 = str10;
        this.sublocality_2 = str11;
        this.sublocality_3 = str12;
        this.sublocality_4 = str13;
        this.sublocality_5 = str14;
        this.administrative_district_level_2 = str15;
        this.administrative_district_level_3 = str16;
        this.address_coordinates = coordinates;
        this.neighborhood = str17;
    }
}
