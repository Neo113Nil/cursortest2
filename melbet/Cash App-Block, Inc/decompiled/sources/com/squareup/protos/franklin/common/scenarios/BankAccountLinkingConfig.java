package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0014\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "bank_account_oauth_config", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "", "yodlee_enabled", "Ljava/lang/Boolean;", "manual_ach_enabled", "force_manual_ach", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "plaid_linking_config", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$SupportedLinkingFlow;", "preferred_linking_flow", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$SupportedLinkingFlow;", "", "supported_linking_flows", "Ljava/util/List;", "Companion", "Builder", "SupportedLinkingFlow", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BankAccountLinkingConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankAccountLinkingConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final boolean DEFAULT_MANUAL_ACH_ENABLED = true;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.OAuthConfig#ADAPTER", schemaIndex = 0, tag = 25)
    public final OAuthConfig bank_account_oauth_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 28)
    public final Boolean force_manual_ach;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 27)
    public final Boolean manual_ach_enabled;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig#ADAPTER", schemaIndex = 4, tag = 29)
    public final PlaidLinkingConfig plaid_linking_config;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig$SupportedLinkingFlow#ADAPTER", schemaIndex = 6, tag = 31)
    public final SupportedLinkingFlow preferred_linking_flow;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig$SupportedLinkingFlow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 30)
    public final List<SupportedLinkingFlow> supported_linking_flows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 26)
    public final Boolean yodlee_enabled;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "<init>", "()V", "bank_account_oauth_config", "Lcom/squareup/protos/franklin/common/scenarios/OAuthConfig;", "yodlee_enabled", "", "Ljava/lang/Boolean;", "manual_ach_enabled", "force_manual_ach", "plaid_linking_config", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "supported_linking_flows", "", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$SupportedLinkingFlow;", "preferred_linking_flow", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public OAuthConfig bank_account_oauth_config;
        public Boolean force_manual_ach;
        public Boolean manual_ach_enabled;
        public PlaidLinkingConfig plaid_linking_config;
        public SupportedLinkingFlow preferred_linking_flow;
        public List<? extends SupportedLinkingFlow> supported_linking_flows = EmptyList.INSTANCE;
        public Boolean yodlee_enabled;

        public final Builder bank_account_oauth_config(OAuthConfig bank_account_oauth_config) {
            this.bank_account_oauth_config = bank_account_oauth_config;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BankAccountLinkingConfig build() {
            return new BankAccountLinkingConfig(this.bank_account_oauth_config, this.yodlee_enabled, this.manual_ach_enabled, this.force_manual_ach, this.plaid_linking_config, this.supported_linking_flows, this.preferred_linking_flow, buildUnknownFields());
        }

        public final Builder force_manual_ach(Boolean force_manual_ach) {
            this.force_manual_ach = force_manual_ach;
            return this;
        }

        public final Builder manual_ach_enabled(Boolean manual_ach_enabled) {
            this.manual_ach_enabled = manual_ach_enabled;
            return this;
        }

        public final Builder plaid_linking_config(PlaidLinkingConfig plaid_linking_config) {
            this.plaid_linking_config = plaid_linking_config;
            return this;
        }

        public final Builder preferred_linking_flow(SupportedLinkingFlow preferred_linking_flow) {
            this.preferred_linking_flow = preferred_linking_flow;
            return this;
        }

        public final Builder supported_linking_flows(List<? extends SupportedLinkingFlow> supported_linking_flows) {
            supported_linking_flows.getClass();
            TransactorKt.checkElementsNotNull(supported_linking_flows);
            this.supported_linking_flows = supported_linking_flows;
            return this;
        }

        public final Builder yodlee_enabled(Boolean yodlee_enabled) {
            this.yodlee_enabled = yodlee_enabled;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BankAccountLinkingConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BankAccountLinkingConfig decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BankAccountLinkingConfig((OAuthConfig) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (PlaidLinkingConfig) obj5, m, (BankAccountLinkingConfig.SupportedLinkingFlow) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 25:
                            obj = TransactorKt.decodeMessageOrMerge(OAuthConfig.ADAPTER, reader, obj);
                            break;
                        case 26:
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 27:
                            obj3 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 28:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 29:
                            obj5 = TransactorKt.decodeMessageOrMerge(PlaidLinkingConfig.ADAPTER, reader, obj5);
                            break;
                        case 30:
                            try {
                                BankAccountLinkingConfig.SupportedLinkingFlow.ADAPTER.tryDecode(reader, m);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 31:
                            try {
                                obj6 = BankAccountLinkingConfig.SupportedLinkingFlow.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BankAccountLinkingConfig value) {
                writer.getClass();
                value.getClass();
                OAuthConfig.ADAPTER.encodeWithTag(writer, 25, value.bank_account_oauth_config);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 26, value.yodlee_enabled);
                protoAdapter2.encodeWithTag(writer, 27, value.manual_ach_enabled);
                protoAdapter2.encodeWithTag(writer, 28, value.force_manual_ach);
                PlaidLinkingConfig.ADAPTER.encodeWithTag(writer, 29, value.plaid_linking_config);
                ProtoAdapter protoAdapter3 = BankAccountLinkingConfig.SupportedLinkingFlow.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 30, value.supported_linking_flows);
                protoAdapter3.encodeWithTag(writer, 31, value.preferred_linking_flow);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BankAccountLinkingConfig value) {
                value.getClass();
                int encodedSizeWithTag = OAuthConfig.ADAPTER.encodedSizeWithTag(25, value.bank_account_oauth_config) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                int encodedSizeWithTag2 = PlaidLinkingConfig.ADAPTER.encodedSizeWithTag(29, value.plaid_linking_config) + protoAdapter2.encodedSizeWithTag(28, value.force_manual_ach) + protoAdapter2.encodedSizeWithTag(27, value.manual_ach_enabled) + protoAdapter2.encodedSizeWithTag(26, value.yodlee_enabled) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = BankAccountLinkingConfig.SupportedLinkingFlow.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(31, value.preferred_linking_flow) + protoAdapter3.asRepeated().encodedSizeWithTag(30, value.supported_linking_flows) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BankAccountLinkingConfig redact(BankAccountLinkingConfig value) {
                value.getClass();
                OAuthConfig oAuthConfig = value.bank_account_oauth_config;
                OAuthConfig oAuthConfig2 = oAuthConfig != null ? (OAuthConfig) OAuthConfig.ADAPTER.redact(oAuthConfig) : null;
                PlaidLinkingConfig plaidLinkingConfig = value.plaid_linking_config;
                PlaidLinkingConfig plaidLinkingConfig2 = plaidLinkingConfig != null ? (PlaidLinkingConfig) PlaidLinkingConfig.ADAPTER.redact(plaidLinkingConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.yodlee_enabled;
                Boolean bool2 = value.manual_ach_enabled;
                Boolean bool3 = value.force_manual_ach;
                List<BankAccountLinkingConfig.SupportedLinkingFlow> list = value.supported_linking_flows;
                BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow = value.preferred_linking_flow;
                list.getClass();
                byteString.getClass();
                return new BankAccountLinkingConfig(oAuthConfig2, bool, bool2, bool3, plaidLinkingConfig2, list, supportedLinkingFlow, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BankAccountLinkingConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = BankAccountLinkingConfig.SupportedLinkingFlow.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 31, value.preferred_linking_flow);
                protoAdapter2.asRepeated().encodeWithTag(writer, 30, value.supported_linking_flows);
                PlaidLinkingConfig.ADAPTER.encodeWithTag(writer, 29, value.plaid_linking_config);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 28, value.force_manual_ach);
                protoAdapter3.encodeWithTag(writer, 27, value.manual_ach_enabled);
                protoAdapter3.encodeWithTag(writer, 26, value.yodlee_enabled);
                OAuthConfig.ADAPTER.encodeWithTag(writer, 25, value.bank_account_oauth_config);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountLinkingConfig(OAuthConfig oAuthConfig, Boolean bool, Boolean bool2, Boolean bool3, PlaidLinkingConfig plaidLinkingConfig, List list, SupportedLinkingFlow supportedLinkingFlow, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.bank_account_oauth_config = oAuthConfig;
        this.yodlee_enabled = bool;
        this.manual_ach_enabled = bool2;
        this.force_manual_ach = bool3;
        this.plaid_linking_config = plaidLinkingConfig;
        this.preferred_linking_flow = supportedLinkingFlow;
        this.supported_linking_flows = TransactorKt.immutableCopyOf("supported_linking_flows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankAccountLinkingConfig)) {
            return false;
        }
        BankAccountLinkingConfig bankAccountLinkingConfig = (BankAccountLinkingConfig) obj;
        return Intrinsics.areEqual(unknownFields(), bankAccountLinkingConfig.unknownFields()) && Intrinsics.areEqual(this.bank_account_oauth_config, bankAccountLinkingConfig.bank_account_oauth_config) && Intrinsics.areEqual(this.yodlee_enabled, bankAccountLinkingConfig.yodlee_enabled) && Intrinsics.areEqual(this.manual_ach_enabled, bankAccountLinkingConfig.manual_ach_enabled) && Intrinsics.areEqual(this.force_manual_ach, bankAccountLinkingConfig.force_manual_ach) && Intrinsics.areEqual(this.plaid_linking_config, bankAccountLinkingConfig.plaid_linking_config) && Intrinsics.areEqual(this.supported_linking_flows, bankAccountLinkingConfig.supported_linking_flows) && this.preferred_linking_flow == bankAccountLinkingConfig.preferred_linking_flow;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OAuthConfig oAuthConfig = this.bank_account_oauth_config;
        int hashCode2 = (hashCode + (oAuthConfig != null ? oAuthConfig.hashCode() : 0)) * 37;
        Boolean bool = this.yodlee_enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.manual_ach_enabled;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.force_manual_ach;
        int hashCode5 = (hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        PlaidLinkingConfig plaidLinkingConfig = this.plaid_linking_config;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (plaidLinkingConfig != null ? plaidLinkingConfig.hashCode() : 0)) * 37, 37, this.supported_linking_flows);
        SupportedLinkingFlow supportedLinkingFlow = this.preferred_linking_flow;
        int hashCode6 = m + (supportedLinkingFlow != null ? supportedLinkingFlow.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.bank_account_oauth_config = this.bank_account_oauth_config;
        builder.yodlee_enabled = this.yodlee_enabled;
        builder.manual_ach_enabled = this.manual_ach_enabled;
        builder.force_manual_ach = this.force_manual_ach;
        builder.plaid_linking_config = this.plaid_linking_config;
        builder.supported_linking_flows = this.supported_linking_flows;
        builder.preferred_linking_flow = this.preferred_linking_flow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OAuthConfig oAuthConfig = this.bank_account_oauth_config;
        if (oAuthConfig != null) {
            arrayList.add("bank_account_oauth_config=" + oAuthConfig);
        }
        Boolean bool = this.yodlee_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("yodlee_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.manual_ach_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("manual_ach_enabled=", bool2, arrayList);
        }
        Boolean bool3 = this.force_manual_ach;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("force_manual_ach=", bool3, arrayList);
        }
        PlaidLinkingConfig plaidLinkingConfig = this.plaid_linking_config;
        if (plaidLinkingConfig != null) {
            arrayList.add("plaid_linking_config=" + plaidLinkingConfig);
        }
        if (!this.supported_linking_flows.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_linking_flows=", arrayList, this.supported_linking_flows);
        }
        SupportedLinkingFlow supportedLinkingFlow = this.preferred_linking_flow;
        if (supportedLinkingFlow != null) {
            arrayList.add("preferred_linking_flow=" + supportedLinkingFlow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankAccountLinkingConfig{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$SupportedLinkingFlow;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MANUAL", "PLAID", "STRIPE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SupportedLinkingFlow implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SupportedLinkingFlow[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SupportedLinkingFlow MANUAL = new SupportedLinkingFlow("MANUAL", 0, 1);
        public static final SupportedLinkingFlow PLAID = new SupportedLinkingFlow("PLAID", 1, 2);
        public static final SupportedLinkingFlow STRIPE = new SupportedLinkingFlow("STRIPE", 2, 3);
        private final int value;

        private static final /* synthetic */ SupportedLinkingFlow[] $values() {
            return new SupportedLinkingFlow[]{MANUAL, PLAID, STRIPE};
        }

        static {
            SupportedLinkingFlow[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SupportedLinkingFlow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig$SupportedLinkingFlow$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public BankAccountLinkingConfig.SupportedLinkingFlow fromValue(int value) {
                    return BankAccountLinkingConfig.SupportedLinkingFlow.INSTANCE.fromValue(value);
                }
            };
        }

        private SupportedLinkingFlow(String str, int i, int i2) {
            this.value = i2;
        }

        public static final SupportedLinkingFlow fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static SupportedLinkingFlow valueOf(String str) {
            return (SupportedLinkingFlow) Enum.valueOf(SupportedLinkingFlow.class, str);
        }

        public static SupportedLinkingFlow[] values() {
            return (SupportedLinkingFlow[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$SupportedLinkingFlow$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$SupportedLinkingFlow;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SupportedLinkingFlow fromValue(int value) {
                if (value == 1) {
                    return SupportedLinkingFlow.MANUAL;
                }
                if (value == 2) {
                    return SupportedLinkingFlow.PLAID;
                }
                if (value != 3) {
                    return null;
                }
                return SupportedLinkingFlow.STRIPE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BankAccountLinkingConfig;", "", "DEFAULT_MANUAL_ACH_ENABLED", "Z", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BankAccountLinkingConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
