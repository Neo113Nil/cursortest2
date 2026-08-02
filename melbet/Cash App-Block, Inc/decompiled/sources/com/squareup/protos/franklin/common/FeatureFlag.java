package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.FeatureFlag;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0014\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/common/FeatureFlag;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/FeatureFlag$Builder;", "", "name", "Ljava/lang/String;", AnnotatedPrivateKey.LABEL, "selected_option_value", "", "client_data_enabled", "Ljava/lang/Boolean;", "is_experiment", "Lcom/squareup/protos/franklin/common/FeatureFlagSource;", "feature_flag_source", "Lcom/squareup/protos/franklin/common/FeatureFlagSource;", "has_data_export", "", "Lcom/squareup/protos/franklin/common/FeatureFlag$Option;", "options", "Ljava/util/List;", "Companion", "Builder", "Option", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeatureFlag extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FeatureFlag> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean client_data_enabled;

    @WireField(adapter = "com.squareup.protos.franklin.common.FeatureFlagSource#ADAPTER", schemaIndex = 6, tag = 7)
    public final FeatureFlagSource feature_flag_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean has_data_export;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean is_experiment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.protos.franklin.common.FeatureFlag$Option#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Option> options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String selected_option_value;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0013J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/FeatureFlag$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/FeatureFlag;", "<init>", "()V", "name", "", AnnotatedPrivateKey.LABEL, "options", "", "Lcom/squareup/protos/franklin/common/FeatureFlag$Option;", "selected_option_value", "client_data_enabled", "", "Ljava/lang/Boolean;", "is_experiment", "feature_flag_source", "Lcom/squareup/protos/franklin/common/FeatureFlagSource;", "has_data_export", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/FeatureFlag$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public Boolean client_data_enabled;
        public FeatureFlagSource feature_flag_source;
        public Boolean has_data_export;
        public Boolean is_experiment;
        public String label;
        public String name;
        public List<Option> options = EmptyList.INSTANCE;
        public String selected_option_value;

        @Override // com.squareup.wire.Message.Builder
        public FeatureFlag build() {
            return new FeatureFlag(this.name, this.label, this.options, this.selected_option_value, this.client_data_enabled, this.is_experiment, this.feature_flag_source, this.has_data_export, buildUnknownFields());
        }

        public final Builder client_data_enabled(Boolean client_data_enabled) {
            this.client_data_enabled = client_data_enabled;
            return this;
        }

        public final Builder feature_flag_source(FeatureFlagSource feature_flag_source) {
            this.feature_flag_source = feature_flag_source;
            return this;
        }

        public final Builder has_data_export(Boolean has_data_export) {
            this.has_data_export = has_data_export;
            return this;
        }

        public final Builder is_experiment(Boolean is_experiment) {
            this.is_experiment = is_experiment;
            return this;
        }

        public final Builder label(String label) {
            this.label = label;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder options(List<Option> options) {
            options.getClass();
            TransactorKt.checkElementsNotNull(options);
            this.options = options;
            return this;
        }

        public final Builder selected_option_value(String selected_option_value) {
            this.selected_option_value = selected_option_value;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FeatureFlag.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.FeatureFlag$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public FeatureFlag decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                        return new FeatureFlag((String) obj, (String) obj2, m, (String) obj3, (Boolean) obj4, (Boolean) obj5, (FeatureFlagSource) obj6, (Boolean) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            m.add(FeatureFlag.Option.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 7:
                            try {
                                obj6 = FeatureFlagSource.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            obj7 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeatureFlag value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.name);
                protoAdapter2.encodeWithTag(writer, 2, value.label);
                FeatureFlag.Option.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.options);
                protoAdapter2.encodeWithTag(writer, 4, value.selected_option_value);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 5, value.client_data_enabled);
                protoAdapter3.encodeWithTag(writer, 6, value.is_experiment);
                FeatureFlagSource.ADAPTER.encodeWithTag(writer, 7, value.feature_flag_source);
                protoAdapter3.encodeWithTag(writer, 8, value.has_data_export);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeatureFlag value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(4, value.selected_option_value) + FeatureFlag.Option.ADAPTER.asRepeated().encodedSizeWithTag(3, value.options) + protoAdapter2.encodedSizeWithTag(2, value.label) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return protoAdapter3.encodedSizeWithTag(8, value.has_data_export) + FeatureFlagSource.ADAPTER.encodedSizeWithTag(7, value.feature_flag_source) + protoAdapter3.encodedSizeWithTag(6, value.is_experiment) + protoAdapter3.encodedSizeWithTag(5, value.client_data_enabled) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeatureFlag redact(FeatureFlag value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.options, FeatureFlag.Option.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.name;
                String str2 = value.label;
                String str3 = value.selected_option_value;
                Boolean bool = value.client_data_enabled;
                Boolean bool2 = value.is_experiment;
                FeatureFlagSource featureFlagSource = value.feature_flag_source;
                Boolean bool3 = value.has_data_export;
                byteString.getClass();
                return new FeatureFlag(str, str2, m1169redactElements, str3, bool, bool2, featureFlagSource, bool3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeatureFlag value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 8, value.has_data_export);
                FeatureFlagSource.ADAPTER.encodeWithTag(writer, 7, value.feature_flag_source);
                protoAdapter2.encodeWithTag(writer, 6, value.is_experiment);
                protoAdapter2.encodeWithTag(writer, 5, value.client_data_enabled);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.selected_option_value);
                FeatureFlag.Option.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.options);
                protoAdapter3.encodeWithTag(writer, 2, value.label);
                protoAdapter3.encodeWithTag(writer, 1, value.name);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlag(String str, String str2, List list, String str3, Boolean bool, Boolean bool2, FeatureFlagSource featureFlagSource, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.label = str2;
        this.selected_option_value = str3;
        this.client_data_enabled = bool;
        this.is_experiment = bool2;
        this.feature_flag_source = featureFlagSource;
        this.has_data_export = bool3;
        this.options = TransactorKt.immutableCopyOf("options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) obj;
        return Intrinsics.areEqual(unknownFields(), featureFlag.unknownFields()) && Intrinsics.areEqual(this.name, featureFlag.name) && Intrinsics.areEqual(this.label, featureFlag.label) && Intrinsics.areEqual(this.options, featureFlag.options) && Intrinsics.areEqual(this.selected_option_value, featureFlag.selected_option_value) && Intrinsics.areEqual(this.client_data_enabled, featureFlag.client_data_enabled) && Intrinsics.areEqual(this.is_experiment, featureFlag.is_experiment) && this.feature_flag_source == featureFlag.feature_flag_source && Intrinsics.areEqual(this.has_data_export, featureFlag.has_data_export);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.label;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.options);
        String str3 = this.selected_option_value;
        int hashCode3 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.client_data_enabled;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_experiment;
        int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        FeatureFlagSource featureFlagSource = this.feature_flag_source;
        int hashCode6 = (hashCode5 + (featureFlagSource != null ? featureFlagSource.hashCode() : 0)) * 37;
        Boolean bool3 = this.has_data_export;
        int hashCode7 = hashCode6 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.label = this.label;
        builder.options = this.options;
        builder.selected_option_value = this.selected_option_value;
        builder.client_data_enabled = this.client_data_enabled;
        builder.is_experiment = this.is_experiment;
        builder.feature_flag_source = this.feature_flag_source;
        builder.has_data_export = this.has_data_export;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label=", arrayList);
        }
        if (!this.options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
        }
        String str3 = this.selected_option_value;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "selected_option_value=", arrayList);
        }
        Boolean bool = this.client_data_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("client_data_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.is_experiment;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_experiment=", bool2, arrayList);
        }
        FeatureFlagSource featureFlagSource = this.feature_flag_source;
        if (featureFlagSource != null) {
            arrayList.add("feature_flag_source=" + featureFlagSource);
        }
        Boolean bool3 = this.has_data_export;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_data_export=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeatureFlag{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/FeatureFlag$Option;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/FeatureFlag$Option$Builder;", "value", "", AnnotatedPrivateKey.LABEL, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Option extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Option> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/common/FeatureFlag$Option$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/FeatureFlag$Option;", "<init>", "()V", "value", "", AnnotatedPrivateKey.LABEL, "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Builder extends Message.Builder {
            public String label;
            public String value;

            @Override // com.squareup.wire.Message.Builder
            public Option build() {
                return new Option(this.value, this.label, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder value(String value) {
                this.value = value;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Option.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.FeatureFlag$Option$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public FeatureFlag.Option decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new FeatureFlag.Option((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FeatureFlag.Option value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.value);
                    protoAdapter2.encodeWithTag(writer, 2, value.label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FeatureFlag.Option value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.label) + protoAdapter2.encodedSizeWithTag(1, value.value) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FeatureFlag.Option redact(FeatureFlag.Option value) {
                    value.getClass();
                    return FeatureFlag.Option.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FeatureFlag.Option value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.label);
                    protoAdapter2.encodeWithTag(writer, 1, value.value);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Option(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = option.value;
            }
            if ((i & 2) != 0) {
                str2 = option.label;
            }
            if ((i & 4) != 0) {
                byteString = option.unknownFields();
            }
            return option.copy(str, str2, byteString);
        }

        public final Option copy(String value, String label, ByteString unknownFields) {
            unknownFields.getClass();
            return new Option(value, label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(unknownFields(), option.unknownFields()) && Intrinsics.areEqual(this.value, option.value) && Intrinsics.areEqual(this.label, option.label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.value;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.label;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.value = this.value;
            builder.label = this.label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.value;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "value=", arrayList);
            }
            String str2 = this.label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Option{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/FeatureFlag$Option$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/FeatureFlag$Option$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/FeatureFlag$Option;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/FeatureFlag$Option;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Option build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Option() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Option(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.value = str;
            this.label = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/FeatureFlag$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/FeatureFlag$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/FeatureFlag;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/FeatureFlag;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ FeatureFlag build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
