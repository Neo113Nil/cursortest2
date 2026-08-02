package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig$Builder;", "", "system_preamble", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "preferred_model", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "", "no_backend_tools", "Ljava/lang/Boolean;", "enable_tool_picker", "system_prompt", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings;", "prompt_configuration_settings", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionTools;", "preferred_backend_tools", "Ljava/util/List;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "client_tools", "", "extra_args", "Ljava/util/Map;", "disabled_backend_tools", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionDescriptionOverride;", "backend_extension_overrides", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ServiceProfileConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ServiceProfileConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExtensionDescriptionOverride#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    public final List<ExtensionDescriptionOverride> backend_extension_overrides;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExtensionConfig#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ExtensionConfig> client_tools;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExtensionTools#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<ExtensionTools> disabled_backend_tools;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean enable_tool_picker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", schemaIndex = 4, tag = 5)
    public final Map<String, ?> extra_args;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean no_backend_tools;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ExtensionTools#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<ExtensionTools> preferred_backend_tools;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Model#ADAPTER", schemaIndex = 3, tag = 4)
    public final Model preferred_model;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PromptConfigurationSettings#ADAPTER", schemaIndex = 9, tag = 10)
    public final PromptConfigurationSettings prompt_configuration_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String system_preamble;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String system_prompt;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig;", "<init>", "()V", "system_preamble", "", "preferred_backend_tools", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionTools;", "client_tools", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "preferred_model", "Lcom/squareup/protos/cash/kgoose/api/v3/Model;", "extra_args", "", "no_backend_tools", "", "Ljava/lang/Boolean;", "disabled_backend_tools", "enable_tool_picker", "system_prompt", "prompt_configuration_settings", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings;", "backend_extension_overrides", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionDescriptionOverride;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<ExtensionDescriptionOverride> backend_extension_overrides;
        public List<ExtensionConfig> client_tools;
        public List<ExtensionTools> disabled_backend_tools;
        public Boolean enable_tool_picker;
        public Map<String, ?> extra_args;
        public Boolean no_backend_tools;
        public List<ExtensionTools> preferred_backend_tools;
        public Model preferred_model;
        public PromptConfigurationSettings prompt_configuration_settings;
        public String system_preamble;
        public String system_prompt;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.preferred_backend_tools = emptyList;
            this.client_tools = emptyList;
            this.disabled_backend_tools = emptyList;
            this.backend_extension_overrides = emptyList;
        }

        public final Builder backend_extension_overrides(List<ExtensionDescriptionOverride> backend_extension_overrides) {
            backend_extension_overrides.getClass();
            TransactorKt.checkElementsNotNull(backend_extension_overrides);
            this.backend_extension_overrides = backend_extension_overrides;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ServiceProfileConfig build() {
            return new ServiceProfileConfig(this.system_preamble, this.preferred_backend_tools, this.client_tools, this.preferred_model, this.extra_args, this.no_backend_tools, this.disabled_backend_tools, this.enable_tool_picker, this.system_prompt, this.prompt_configuration_settings, this.backend_extension_overrides, buildUnknownFields());
        }

        public final Builder client_tools(List<ExtensionConfig> client_tools) {
            client_tools.getClass();
            TransactorKt.checkElementsNotNull(client_tools);
            this.client_tools = client_tools;
            return this;
        }

        public final Builder disabled_backend_tools(List<ExtensionTools> disabled_backend_tools) {
            disabled_backend_tools.getClass();
            TransactorKt.checkElementsNotNull(disabled_backend_tools);
            this.disabled_backend_tools = disabled_backend_tools;
            return this;
        }

        public final Builder enable_tool_picker(Boolean enable_tool_picker) {
            this.enable_tool_picker = enable_tool_picker;
            return this;
        }

        public final Builder extra_args(Map<String, ?> extra_args) {
            this.extra_args = extra_args;
            return this;
        }

        public final Builder no_backend_tools(Boolean no_backend_tools) {
            this.no_backend_tools = no_backend_tools;
            return this;
        }

        public final Builder preferred_backend_tools(List<ExtensionTools> preferred_backend_tools) {
            preferred_backend_tools.getClass();
            TransactorKt.checkElementsNotNull(preferred_backend_tools);
            this.preferred_backend_tools = preferred_backend_tools;
            return this;
        }

        public final Builder preferred_model(Model preferred_model) {
            this.preferred_model = preferred_model;
            return this;
        }

        public final Builder prompt_configuration_settings(PromptConfigurationSettings prompt_configuration_settings) {
            this.prompt_configuration_settings = prompt_configuration_settings;
            return this;
        }

        public final Builder system_preamble(String system_preamble) {
            this.system_preamble = system_preamble;
            return this;
        }

        public final Builder system_prompt(String system_prompt) {
            this.system_prompt = system_prompt;
            return this;
        }
    }

    static {
        ServiceProfileConfig$Companion$ADAPTER$1 serviceProfileConfig$Companion$ADAPTER$1 = new ServiceProfileConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ServiceProfileConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ServiceProfileConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/profile_messages.proto");
        ADAPTER = serviceProfileConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(serviceProfileConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceProfileConfig(String str, List list, List list2, Model model, Map map, Boolean bool, List list3, Boolean bool2, String str2, PromptConfigurationSettings promptConfigurationSettings, List list4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.system_preamble = str;
        this.preferred_model = model;
        this.no_backend_tools = bool;
        this.enable_tool_picker = bool2;
        this.system_prompt = str2;
        this.prompt_configuration_settings = promptConfigurationSettings;
        this.preferred_backend_tools = TransactorKt.immutableCopyOf("preferred_backend_tools", list);
        this.client_tools = TransactorKt.immutableCopyOf("client_tools", list2);
        this.extra_args = (Map) TransactorKt.immutableCopyOfStruct(map, "extra_args");
        this.disabled_backend_tools = TransactorKt.immutableCopyOf("disabled_backend_tools", list3);
        this.backend_extension_overrides = TransactorKt.immutableCopyOf("backend_extension_overrides", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServiceProfileConfig)) {
            return false;
        }
        ServiceProfileConfig serviceProfileConfig = (ServiceProfileConfig) obj;
        return Intrinsics.areEqual(unknownFields(), serviceProfileConfig.unknownFields()) && Intrinsics.areEqual(this.system_preamble, serviceProfileConfig.system_preamble) && Intrinsics.areEqual(this.preferred_backend_tools, serviceProfileConfig.preferred_backend_tools) && Intrinsics.areEqual(this.client_tools, serviceProfileConfig.client_tools) && Intrinsics.areEqual(this.preferred_model, serviceProfileConfig.preferred_model) && Intrinsics.areEqual(this.extra_args, serviceProfileConfig.extra_args) && Intrinsics.areEqual(this.no_backend_tools, serviceProfileConfig.no_backend_tools) && Intrinsics.areEqual(this.disabled_backend_tools, serviceProfileConfig.disabled_backend_tools) && Intrinsics.areEqual(this.enable_tool_picker, serviceProfileConfig.enable_tool_picker) && Intrinsics.areEqual(this.system_prompt, serviceProfileConfig.system_prompt) && Intrinsics.areEqual(this.prompt_configuration_settings, serviceProfileConfig.prompt_configuration_settings) && Intrinsics.areEqual(this.backend_extension_overrides, serviceProfileConfig.backend_extension_overrides);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.system_preamble;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.preferred_backend_tools), 37, this.client_tools);
        Model model = this.preferred_model;
        int hashCode2 = (m + (model != null ? model.hashCode() : 0)) * 37;
        Map<String, ?> map = this.extra_args;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 37;
        Boolean bool = this.no_backend_tools;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.disabled_backend_tools);
        Boolean bool2 = this.enable_tool_picker;
        int hashCode4 = (m2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str2 = this.system_prompt;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        PromptConfigurationSettings promptConfigurationSettings = this.prompt_configuration_settings;
        int hashCode6 = this.backend_extension_overrides.hashCode() + ((hashCode5 + (promptConfigurationSettings != null ? promptConfigurationSettings.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.system_preamble = this.system_preamble;
        builder.preferred_backend_tools = this.preferred_backend_tools;
        builder.client_tools = this.client_tools;
        builder.preferred_model = this.preferred_model;
        builder.extra_args = this.extra_args;
        builder.no_backend_tools = this.no_backend_tools;
        builder.disabled_backend_tools = this.disabled_backend_tools;
        builder.enable_tool_picker = this.enable_tool_picker;
        builder.system_prompt = this.system_prompt;
        builder.prompt_configuration_settings = this.prompt_configuration_settings;
        builder.backend_extension_overrides = this.backend_extension_overrides;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.system_preamble;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "system_preamble=", arrayList);
        }
        if (!this.preferred_backend_tools.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("preferred_backend_tools=", arrayList, this.preferred_backend_tools);
        }
        if (!this.client_tools.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_tools=", arrayList, this.client_tools);
        }
        Model model = this.preferred_model;
        if (model != null) {
            arrayList.add("preferred_model=" + model);
        }
        Map<String, ?> map = this.extra_args;
        if (map != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("extra_args=", map, arrayList);
        }
        Boolean bool = this.no_backend_tools;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("no_backend_tools=", bool, arrayList);
        }
        if (!this.disabled_backend_tools.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("disabled_backend_tools=", arrayList, this.disabled_backend_tools);
        }
        Boolean bool2 = this.enable_tool_picker;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enable_tool_picker=", bool2, arrayList);
        }
        String str2 = this.system_prompt;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "system_prompt=", arrayList);
        }
        PromptConfigurationSettings promptConfigurationSettings = this.prompt_configuration_settings;
        if (promptConfigurationSettings != null) {
            arrayList.add("prompt_configuration_settings=" + promptConfigurationSettings);
        }
        if (!this.backend_extension_overrides.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("backend_extension_overrides=", arrayList, this.backend_extension_overrides);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ServiceProfileConfig{", "}", 0, null, null, 56);
    }
}
