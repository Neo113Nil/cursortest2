package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ServiceProfileConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ServiceProfileConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ServiceProfileConfig((String) obj, m, arrayList, (Model) obj2, (Map) obj3, (Boolean) obj4, arrayList2, (Boolean) obj5, (String) obj6, (PromptConfigurationSettings) obj7, arrayList3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    m.add(ExtensionTools.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    arrayList.add(ExtensionConfig.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj2 = TransactorKt.decodeMessageOrMerge(Model.ADAPTER, protoReader, obj2);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.STRUCT_MAP, protoReader, obj3);
                    break;
                case 6:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    arrayList2.add(ExtensionTools.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(PromptConfigurationSettings.ADAPTER, protoReader, obj7);
                    break;
                case 11:
                    arrayList3.add(ExtensionDescriptionOverride.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ServiceProfileConfig serviceProfileConfig = (ServiceProfileConfig) obj;
        reverseProtoWriter.getClass();
        serviceProfileConfig.getClass();
        reverseProtoWriter.writeBytes(serviceProfileConfig.unknownFields());
        ExtensionDescriptionOverride.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, serviceProfileConfig.backend_extension_overrides);
        PromptConfigurationSettings.ADAPTER.encodeWithTag(reverseProtoWriter, 10, serviceProfileConfig.prompt_configuration_settings);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, serviceProfileConfig.system_prompt);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, serviceProfileConfig.enable_tool_picker);
        ProtoAdapter protoAdapter3 = ExtensionTools.ADAPTER;
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 7, serviceProfileConfig.disabled_backend_tools);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, serviceProfileConfig.no_backend_tools);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 5, serviceProfileConfig.extra_args);
        Model.ADAPTER.encodeWithTag(reverseProtoWriter, 4, serviceProfileConfig.preferred_model);
        ExtensionConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, serviceProfileConfig.client_tools);
        protoAdapter3.asRepeated().encodeWithTag(reverseProtoWriter, 2, serviceProfileConfig.preferred_backend_tools);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, serviceProfileConfig.system_preamble);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ServiceProfileConfig serviceProfileConfig = (ServiceProfileConfig) obj;
        serviceProfileConfig.getClass();
        int size$okio = serviceProfileConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, serviceProfileConfig.system_preamble) + size$okio;
        ProtoAdapter protoAdapter2 = ExtensionTools.ADAPTER;
        int encodedSizeWithTag2 = ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, serviceProfileConfig.extra_args) + Model.ADAPTER.encodedSizeWithTag(4, serviceProfileConfig.preferred_model) + ExtensionConfig.ADAPTER.asRepeated().encodedSizeWithTag(3, serviceProfileConfig.client_tools) + protoAdapter2.asRepeated().encodedSizeWithTag(2, serviceProfileConfig.preferred_backend_tools) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return ExtensionDescriptionOverride.ADAPTER.asRepeated().encodedSizeWithTag(11, serviceProfileConfig.backend_extension_overrides) + PromptConfigurationSettings.ADAPTER.encodedSizeWithTag(10, serviceProfileConfig.prompt_configuration_settings) + protoAdapter.encodedSizeWithTag(9, serviceProfileConfig.system_prompt) + protoAdapter3.encodedSizeWithTag(8, serviceProfileConfig.enable_tool_picker) + protoAdapter2.asRepeated().encodedSizeWithTag(7, serviceProfileConfig.disabled_backend_tools) + protoAdapter3.encodedSizeWithTag(6, serviceProfileConfig.no_backend_tools) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ServiceProfileConfig serviceProfileConfig = (ServiceProfileConfig) obj;
        serviceProfileConfig.getClass();
        List<ExtensionTools> list = serviceProfileConfig.preferred_backend_tools;
        ProtoAdapter protoAdapter = ExtensionTools.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(serviceProfileConfig.client_tools, ExtensionConfig.ADAPTER);
        Model model = serviceProfileConfig.preferred_model;
        Model model2 = model != null ? (Model) Model.ADAPTER.redact(model) : null;
        Map<String, ?> map = serviceProfileConfig.extra_args;
        Map map2 = map != null ? (Map) ProtoAdapter.STRUCT_MAP.redact(map) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(serviceProfileConfig.disabled_backend_tools, protoAdapter);
        PromptConfigurationSettings promptConfigurationSettings = serviceProfileConfig.prompt_configuration_settings;
        PromptConfigurationSettings promptConfigurationSettings2 = promptConfigurationSettings != null ? (PromptConfigurationSettings) PromptConfigurationSettings.ADAPTER.redact(promptConfigurationSettings) : null;
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(serviceProfileConfig.backend_extension_overrides, ExtensionDescriptionOverride.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = serviceProfileConfig.system_preamble;
        Boolean bool = serviceProfileConfig.no_backend_tools;
        Boolean bool2 = serviceProfileConfig.enable_tool_picker;
        String str2 = serviceProfileConfig.system_prompt;
        byteString.getClass();
        return new ServiceProfileConfig(str, m1169redactElements, m1169redactElements2, model2, map2, bool, m1169redactElements3, bool2, str2, promptConfigurationSettings2, m1169redactElements4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ServiceProfileConfig serviceProfileConfig = (ServiceProfileConfig) obj;
        serviceProfileConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, serviceProfileConfig.system_preamble);
        ProtoAdapter protoAdapter2 = ExtensionTools.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, serviceProfileConfig.preferred_backend_tools);
        ExtensionConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, serviceProfileConfig.client_tools);
        Model.ADAPTER.encodeWithTag(protoWriter, 4, serviceProfileConfig.preferred_model);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 5, serviceProfileConfig.extra_args);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 6, serviceProfileConfig.no_backend_tools);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, serviceProfileConfig.disabled_backend_tools);
        protoAdapter3.encodeWithTag(protoWriter, 8, serviceProfileConfig.enable_tool_picker);
        protoAdapter.encodeWithTag(protoWriter, 9, serviceProfileConfig.system_prompt);
        PromptConfigurationSettings.ADAPTER.encodeWithTag(protoWriter, 10, serviceProfileConfig.prompt_configuration_settings);
        ExtensionDescriptionOverride.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, serviceProfileConfig.backend_extension_overrides);
        protoWriter.writeBytes(serviceProfileConfig.unknownFields());
    }
}
