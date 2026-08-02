package com.squareup.protos.cash.cashidv.flows;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashidv.common.EIdvIntroScreenOption;
import com.squareup.protos.cash.cashidv.common.IdvRenderConfig;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IdvFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Boolean bool;
        CollectSsnOption collectSsnOption;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Boolean bool2 = null;
        Object obj2 = null;
        Object obj3 = null;
        Boolean bool3 = null;
        CollectSsnOption collectSsnOption2 = null;
        FlowBehavior flowBehavior = null;
        Boolean bool4 = null;
        String str = null;
        Object obj4 = null;
        String str2 = null;
        String str3 = null;
        EIdvIntroScreenOption eIdvIntroScreenOption = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IdvFlowParameters((IdvRenderConfig) obj2, bool2, bool8, bool3, collectSsnOption2, flowBehavior, bool4, str, (IdvEndResultScreenConfig) obj4, str2, str3, eIdvIntroScreenOption, (BlockerDescriptor.Theme) obj3, bool5, bool6, bool7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = TransactorKt.decodeMessageOrMerge(IdvRenderConfig.ADAPTER, protoReader, obj2);
                    decode = bool2;
                    break;
                case 2:
                case 3:
                case 4:
                case 6:
                case 9:
                case 17:
                case 21:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    bool = bool3;
                    collectSsnOption = collectSsnOption2;
                    decode = bool2;
                    obj3 = obj;
                    bool3 = bool;
                    collectSsnOption2 = collectSsnOption;
                    break;
                case 5:
                    decode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    bool8 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 8:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 10:
                    obj = obj3;
                    bool = bool3;
                    collectSsnOption = collectSsnOption2;
                    try {
                        collectSsnOption2 = CollectSsnOption.ADAPTER.decode(protoReader);
                        obj3 = obj;
                        bool3 = bool;
                        decode = bool2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 11:
                    obj = obj3;
                    bool = bool3;
                    collectSsnOption = collectSsnOption2;
                    try {
                        flowBehavior = FlowBehavior.ADAPTER.decode(protoReader);
                        obj3 = obj;
                        bool3 = bool;
                        collectSsnOption2 = collectSsnOption;
                        decode = bool2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 12:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 13:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 14:
                    obj4 = TransactorKt.decodeMessageOrMerge(IdvEndResultScreenConfig.ADAPTER, protoReader, obj4);
                    decode = bool2;
                    break;
                case 15:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 16:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 18:
                    try {
                        eIdvIntroScreenOption = EIdvIntroScreenOption.ADAPTER.decode(protoReader);
                        decode = bool2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj3;
                        bool = bool3;
                        collectSsnOption = collectSsnOption2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 19:
                    obj3 = TransactorKt.decodeMessageOrMerge(BlockerDescriptor.Theme.ADAPTER, protoReader, obj3);
                    decode = bool2;
                    break;
                case 20:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 22:
                    bool6 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 23:
                    bool7 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
            }
            bool2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IdvFlowParameters idvFlowParameters = (IdvFlowParameters) obj;
        reverseProtoWriter.getClass();
        idvFlowParameters.getClass();
        reverseProtoWriter.writeBytes(idvFlowParameters.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, idvFlowParameters.allow_itins);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, idvFlowParameters.skip_idv_if_underage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, idvFlowParameters.suppress_ssa_consent);
        BlockerDescriptor.Theme.ADAPTER.encodeWithTag(reverseProtoWriter, 19, idvFlowParameters.color_theme_override);
        EIdvIntroScreenOption.ADAPTER.encodeWithTag(reverseProtoWriter, 18, idvFlowParameters.eidv_intro_screen_option);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, idvFlowParameters.persona_theme_set_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, idvFlowParameters.persona_theme_sets);
        IdvEndResultScreenConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 14, idvFlowParameters.idv_end_result_screen_config);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, idvFlowParameters.caller_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, idvFlowParameters.show_idv_end_result_screen);
        FlowBehavior.ADAPTER.encodeWithTag(reverseProtoWriter, 11, idvFlowParameters.override_flow_behavior);
        CollectSsnOption.ADAPTER.encodeWithTag(reverseProtoWriter, 10, idvFlowParameters.collect_ssn_option);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, idvFlowParameters.allow_didv_step_up);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, idvFlowParameters.allow_sponsored_customers);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, idvFlowParameters.fail_on_dismissals);
        IdvRenderConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 1, idvFlowParameters.render_config);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IdvFlowParameters idvFlowParameters = (IdvFlowParameters) obj;
        idvFlowParameters.getClass();
        int encodedSizeWithTag = IdvRenderConfig.ADAPTER.encodedSizeWithTag(1, idvFlowParameters.render_config) + idvFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(12, idvFlowParameters.show_idv_end_result_screen) + FlowBehavior.ADAPTER.encodedSizeWithTag(11, idvFlowParameters.override_flow_behavior) + CollectSsnOption.ADAPTER.encodedSizeWithTag(10, idvFlowParameters.collect_ssn_option) + protoAdapter.encodedSizeWithTag(8, idvFlowParameters.allow_didv_step_up) + protoAdapter.encodedSizeWithTag(7, idvFlowParameters.allow_sponsored_customers) + protoAdapter.encodedSizeWithTag(5, idvFlowParameters.fail_on_dismissals) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(23, idvFlowParameters.allow_itins) + protoAdapter.encodedSizeWithTag(22, idvFlowParameters.skip_idv_if_underage) + protoAdapter.encodedSizeWithTag(20, idvFlowParameters.suppress_ssa_consent) + BlockerDescriptor.Theme.ADAPTER.encodedSizeWithTag(19, idvFlowParameters.color_theme_override) + EIdvIntroScreenOption.ADAPTER.encodedSizeWithTag(18, idvFlowParameters.eidv_intro_screen_option) + protoAdapter2.encodedSizeWithTag(16, idvFlowParameters.persona_theme_set_id) + protoAdapter2.encodedSizeWithTag(15, idvFlowParameters.persona_theme_sets) + IdvEndResultScreenConfig.ADAPTER.encodedSizeWithTag(14, idvFlowParameters.idv_end_result_screen_config) + protoAdapter2.encodedSizeWithTag(13, idvFlowParameters.caller_identifier) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IdvFlowParameters idvFlowParameters = (IdvFlowParameters) obj;
        idvFlowParameters.getClass();
        IdvRenderConfig idvRenderConfig = idvFlowParameters.render_config;
        IdvRenderConfig idvRenderConfig2 = idvRenderConfig != null ? (IdvRenderConfig) IdvRenderConfig.ADAPTER.redact(idvRenderConfig) : null;
        IdvEndResultScreenConfig idvEndResultScreenConfig = idvFlowParameters.idv_end_result_screen_config;
        IdvEndResultScreenConfig idvEndResultScreenConfig2 = idvEndResultScreenConfig != null ? (IdvEndResultScreenConfig) IdvEndResultScreenConfig.ADAPTER.redact(idvEndResultScreenConfig) : null;
        BlockerDescriptor.Theme theme = idvFlowParameters.color_theme_override;
        BlockerDescriptor.Theme theme2 = theme != null ? (BlockerDescriptor.Theme) BlockerDescriptor.Theme.ADAPTER.redact(theme) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = idvFlowParameters.fail_on_dismissals;
        Boolean bool2 = idvFlowParameters.allow_sponsored_customers;
        Boolean bool3 = idvFlowParameters.allow_didv_step_up;
        CollectSsnOption collectSsnOption = idvFlowParameters.collect_ssn_option;
        FlowBehavior flowBehavior = idvFlowParameters.override_flow_behavior;
        Boolean bool4 = idvFlowParameters.show_idv_end_result_screen;
        String str = idvFlowParameters.caller_identifier;
        String str2 = idvFlowParameters.persona_theme_sets;
        String str3 = idvFlowParameters.persona_theme_set_id;
        EIdvIntroScreenOption eIdvIntroScreenOption = idvFlowParameters.eidv_intro_screen_option;
        Boolean bool5 = idvFlowParameters.suppress_ssa_consent;
        Boolean bool6 = idvFlowParameters.skip_idv_if_underage;
        Boolean bool7 = idvFlowParameters.allow_itins;
        byteString.getClass();
        return new IdvFlowParameters(idvRenderConfig2, bool, bool2, bool3, collectSsnOption, flowBehavior, bool4, str, idvEndResultScreenConfig2, str2, str3, eIdvIntroScreenOption, theme2, bool5, bool6, bool7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IdvFlowParameters idvFlowParameters = (IdvFlowParameters) obj;
        idvFlowParameters.getClass();
        IdvRenderConfig.ADAPTER.encodeWithTag(protoWriter, 1, idvFlowParameters.render_config);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 5, idvFlowParameters.fail_on_dismissals);
        protoAdapter.encodeWithTag(protoWriter, 7, idvFlowParameters.allow_sponsored_customers);
        protoAdapter.encodeWithTag(protoWriter, 8, idvFlowParameters.allow_didv_step_up);
        CollectSsnOption.ADAPTER.encodeWithTag(protoWriter, 10, idvFlowParameters.collect_ssn_option);
        FlowBehavior.ADAPTER.encodeWithTag(protoWriter, 11, idvFlowParameters.override_flow_behavior);
        protoAdapter.encodeWithTag(protoWriter, 12, idvFlowParameters.show_idv_end_result_screen);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 13, idvFlowParameters.caller_identifier);
        IdvEndResultScreenConfig.ADAPTER.encodeWithTag(protoWriter, 14, idvFlowParameters.idv_end_result_screen_config);
        protoAdapter2.encodeWithTag(protoWriter, 15, idvFlowParameters.persona_theme_sets);
        protoAdapter2.encodeWithTag(protoWriter, 16, idvFlowParameters.persona_theme_set_id);
        EIdvIntroScreenOption.ADAPTER.encodeWithTag(protoWriter, 18, idvFlowParameters.eidv_intro_screen_option);
        BlockerDescriptor.Theme.ADAPTER.encodeWithTag(protoWriter, 19, idvFlowParameters.color_theme_override);
        protoAdapter.encodeWithTag(protoWriter, 20, idvFlowParameters.suppress_ssa_consent);
        protoAdapter.encodeWithTag(protoWriter, 22, idvFlowParameters.skip_idv_if_underage);
        protoAdapter.encodeWithTag(protoWriter, 23, idvFlowParameters.allow_itins);
        protoWriter.writeBytes(idvFlowParameters.unknownFields());
    }
}
