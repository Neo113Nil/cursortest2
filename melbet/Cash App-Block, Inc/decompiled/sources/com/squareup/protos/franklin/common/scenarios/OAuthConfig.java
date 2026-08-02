package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0012\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$Builder;", "", "launch_url", "Ljava/lang/String;", "success_url_regex", "cancel_url_regex", "skip_url_regex", "start_url_regex", "search_url_regex", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$FlowType;", "flow_type", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$FlowType;", "onload", "Lcom/squareup/protos/franklin/api/FormBlocker;", "privacy_blocker", "Lcom/squareup/protos/franklin/api/FormBlocker;", "Companion", "Builder", "FlowType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OAuthConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OAuthConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String cancel_url_regex;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.OAuthConfig$FlowType#ADAPTER", schemaIndex = 6, tag = 4)
    public final FlowType flow_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String launch_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 5)
    public final String onload;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker#ADAPTER", schemaIndex = 8, tag = 9)
    public final FormBlocker privacy_blocker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 8)
    public final String search_url_regex;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 6)
    public final String skip_url_regex;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 7)
    public final String start_url_regex;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String success_url_regex;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "<init>", "()V", "launch_url", "", "success_url_regex", "cancel_url_regex", "skip_url_regex", "start_url_regex", "search_url_regex", "flow_type", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$FlowType;", "onload", "privacy_blocker", "Lcom/squareup/protos/franklin/api/FormBlocker;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String cancel_url_regex;
        public FlowType flow_type;
        public String launch_url;
        public String onload;
        public FormBlocker privacy_blocker;
        public String search_url_regex;
        public String skip_url_regex;
        public String start_url_regex;
        public String success_url_regex;

        @Override // com.squareup.wire.Message.Builder
        public OAuthConfig build() {
            return new OAuthConfig(this.launch_url, this.success_url_regex, this.cancel_url_regex, this.skip_url_regex, this.start_url_regex, this.search_url_regex, this.flow_type, this.onload, this.privacy_blocker, buildUnknownFields());
        }

        public final Builder cancel_url_regex(String cancel_url_regex) {
            this.cancel_url_regex = cancel_url_regex;
            return this;
        }

        public final Builder flow_type(FlowType flow_type) {
            this.flow_type = flow_type;
            return this;
        }

        public final Builder launch_url(String launch_url) {
            this.launch_url = launch_url;
            return this;
        }

        public final Builder onload(String onload) {
            this.onload = onload;
            return this;
        }

        public final Builder privacy_blocker(FormBlocker privacy_blocker) {
            this.privacy_blocker = privacy_blocker;
            return this;
        }

        public final Builder search_url_regex(String search_url_regex) {
            this.search_url_regex = search_url_regex;
            return this;
        }

        public final Builder skip_url_regex(String skip_url_regex) {
            this.skip_url_regex = skip_url_regex;
            return this;
        }

        public final Builder start_url_regex(String start_url_regex) {
            this.start_url_regex = start_url_regex;
            return this;
        }

        public final Builder success_url_regex(String success_url_regex) {
            this.success_url_regex = success_url_regex;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OAuthConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.OAuthConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public OAuthConfig decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new OAuthConfig((String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (OAuthConfig.FlowType) obj9, (String) obj10, (FormBlocker) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 2:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 3:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 4:
                            try {
                                obj9 = OAuthConfig.FlowType.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj3;
                                obj2 = obj4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 9:
                            obj11 = TransactorKt.decodeMessageOrMerge(FormBlocker.ADAPTER, reader, obj11);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj2 = obj4;
                            break;
                    }
                    obj3 = obj;
                    obj4 = obj2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OAuthConfig value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.launch_url);
                protoAdapter2.encodeWithTag(writer, 2, value.success_url_regex);
                protoAdapter2.encodeWithTag(writer, 3, value.cancel_url_regex);
                protoAdapter2.encodeWithTag(writer, 6, value.skip_url_regex);
                protoAdapter2.encodeWithTag(writer, 7, value.start_url_regex);
                protoAdapter2.encodeWithTag(writer, 8, value.search_url_regex);
                OAuthConfig.FlowType.ADAPTER.encodeWithTag(writer, 4, value.flow_type);
                protoAdapter2.encodeWithTag(writer, 5, value.onload);
                FormBlocker.ADAPTER.encodeWithTag(writer, 9, value.privacy_blocker);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OAuthConfig value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return FormBlocker.ADAPTER.encodedSizeWithTag(9, value.privacy_blocker) + protoAdapter2.encodedSizeWithTag(5, value.onload) + OAuthConfig.FlowType.ADAPTER.encodedSizeWithTag(4, value.flow_type) + protoAdapter2.encodedSizeWithTag(8, value.search_url_regex) + protoAdapter2.encodedSizeWithTag(7, value.start_url_regex) + protoAdapter2.encodedSizeWithTag(6, value.skip_url_regex) + protoAdapter2.encodedSizeWithTag(3, value.cancel_url_regex) + protoAdapter2.encodedSizeWithTag(2, value.success_url_regex) + protoAdapter2.encodedSizeWithTag(1, value.launch_url) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OAuthConfig redact(OAuthConfig value) {
                value.getClass();
                FormBlocker formBlocker = value.privacy_blocker;
                FormBlocker formBlocker2 = formBlocker != null ? (FormBlocker) FormBlocker.ADAPTER.redact(formBlocker) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.launch_url;
                String str2 = value.success_url_regex;
                String str3 = value.cancel_url_regex;
                String str4 = value.skip_url_regex;
                String str5 = value.start_url_regex;
                String str6 = value.search_url_regex;
                OAuthConfig.FlowType flowType = value.flow_type;
                String str7 = value.onload;
                byteString.getClass();
                return new OAuthConfig(str, str2, str3, str4, str5, str6, flowType, str7, formBlocker2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OAuthConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                FormBlocker.ADAPTER.encodeWithTag(writer, 9, value.privacy_blocker);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.onload);
                OAuthConfig.FlowType.ADAPTER.encodeWithTag(writer, 4, value.flow_type);
                protoAdapter2.encodeWithTag(writer, 8, value.search_url_regex);
                protoAdapter2.encodeWithTag(writer, 7, value.start_url_regex);
                protoAdapter2.encodeWithTag(writer, 6, value.skip_url_regex);
                protoAdapter2.encodeWithTag(writer, 3, value.cancel_url_regex);
                protoAdapter2.encodeWithTag(writer, 2, value.success_url_regex);
                protoAdapter2.encodeWithTag(writer, 1, value.launch_url);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthConfig(String str, String str2, String str3, String str4, String str5, String str6, FlowType flowType, String str7, FormBlocker formBlocker, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.launch_url = str;
        this.success_url_regex = str2;
        this.cancel_url_regex = str3;
        this.skip_url_regex = str4;
        this.start_url_regex = str5;
        this.search_url_regex = str6;
        this.flow_type = flowType;
        this.onload = str7;
        this.privacy_blocker = formBlocker;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OAuthConfig)) {
            return false;
        }
        OAuthConfig oAuthConfig = (OAuthConfig) obj;
        return Intrinsics.areEqual(unknownFields(), oAuthConfig.unknownFields()) && Intrinsics.areEqual(this.launch_url, oAuthConfig.launch_url) && Intrinsics.areEqual(this.success_url_regex, oAuthConfig.success_url_regex) && Intrinsics.areEqual(this.cancel_url_regex, oAuthConfig.cancel_url_regex) && Intrinsics.areEqual(this.skip_url_regex, oAuthConfig.skip_url_regex) && Intrinsics.areEqual(this.start_url_regex, oAuthConfig.start_url_regex) && Intrinsics.areEqual(this.search_url_regex, oAuthConfig.search_url_regex) && this.flow_type == oAuthConfig.flow_type && Intrinsics.areEqual(this.onload, oAuthConfig.onload) && Intrinsics.areEqual(this.privacy_blocker, oAuthConfig.privacy_blocker);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.launch_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.success_url_regex;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.cancel_url_regex;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.skip_url_regex;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.start_url_regex;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.search_url_regex;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        FlowType flowType = this.flow_type;
        int hashCode8 = (hashCode7 + (flowType != null ? flowType.hashCode() : 0)) * 37;
        String str7 = this.onload;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        FormBlocker formBlocker = this.privacy_blocker;
        int hashCode10 = hashCode9 + (formBlocker != null ? formBlocker.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.launch_url = this.launch_url;
        builder.success_url_regex = this.success_url_regex;
        builder.cancel_url_regex = this.cancel_url_regex;
        builder.skip_url_regex = this.skip_url_regex;
        builder.start_url_regex = this.start_url_regex;
        builder.search_url_regex = this.search_url_regex;
        builder.flow_type = this.flow_type;
        builder.onload = this.onload;
        builder.privacy_blocker = this.privacy_blocker;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.launch_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "launch_url=", arrayList);
        }
        String str2 = this.success_url_regex;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "success_url_regex=", arrayList);
        }
        String str3 = this.cancel_url_regex;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cancel_url_regex=", arrayList);
        }
        String str4 = this.skip_url_regex;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "skip_url_regex=", arrayList);
        }
        String str5 = this.start_url_regex;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "start_url_regex=", arrayList);
        }
        String str6 = this.search_url_regex;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "search_url_regex=", arrayList);
        }
        FlowType flowType = this.flow_type;
        if (flowType != null) {
            arrayList.add("flow_type=" + flowType);
        }
        String str7 = this.onload;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "onload=", arrayList);
        }
        FormBlocker formBlocker = this.privacy_blocker;
        if (formBlocker != null) {
            arrayList.add("privacy_blocker=" + formBlocker);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OAuthConfig{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$FlowType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PLAID_AUTH", "PLAID_RELINK", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FlowType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FlowType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FlowType PLAID_AUTH = new FlowType("PLAID_AUTH", 0, 1);
        public static final FlowType PLAID_RELINK = new FlowType("PLAID_RELINK", 1, 2);
        private final int value;

        private static final /* synthetic */ FlowType[] $values() {
            return new FlowType[]{PLAID_AUTH, PLAID_RELINK};
        }

        static {
            FlowType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FlowType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.OAuthConfig$FlowType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public OAuthConfig.FlowType fromValue(int value) {
                    return OAuthConfig.FlowType.INSTANCE.fromValue(value);
                }
            };
        }

        private FlowType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final FlowType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$FlowType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$FlowType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FlowType fromValue(int value) {
                if (value == 1) {
                    return FlowType.PLAID_AUTH;
                }
                if (value != 2) {
                    return null;
                }
                return FlowType.PLAID_RELINK;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ OAuthConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
