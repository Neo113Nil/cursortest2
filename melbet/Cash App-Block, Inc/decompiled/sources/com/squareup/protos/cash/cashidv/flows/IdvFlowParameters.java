package com.squareup.protos.cash.cashidv.flows;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashidv.common.EIdvIntroScreenOption;
import com.squareup.protos.cash.cashidv.common.IdvRenderConfig;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IdvFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IdvFlowParameters> CREATOR;
    public final Boolean allow_didv_step_up;
    public final Boolean allow_itins;
    public final Boolean allow_sponsored_customers;
    public final String caller_identifier;
    public final CollectSsnOption collect_ssn_option;
    public final BlockerDescriptor.Theme color_theme_override;
    public final EIdvIntroScreenOption eidv_intro_screen_option;
    public final Boolean fail_on_dismissals;
    public final IdvEndResultScreenConfig idv_end_result_screen_config;
    public final FlowBehavior override_flow_behavior;
    public final String persona_theme_set_id;
    public final String persona_theme_sets;
    public final IdvRenderConfig render_config;
    public final Boolean show_idv_end_result_screen;
    public final Boolean skip_idv_if_underage;
    public final Boolean suppress_ssa_consent;

    public final class Builder extends Message.Builder {
        public Boolean allow_didv_step_up;
        public Boolean allow_itins;
        public Boolean allow_sponsored_customers;
        public String caller_identifier;
        public CollectSsnOption collect_ssn_option;
        public BlockerDescriptor.Theme color_theme_override;
        public EIdvIntroScreenOption eidv_intro_screen_option;
        public Boolean fail_on_dismissals;
        public IdvEndResultScreenConfig idv_end_result_screen_config;
        public FlowBehavior override_flow_behavior;
        public String persona_theme_set_id;
        public String persona_theme_sets;
        public IdvRenderConfig render_config;
        public Boolean show_idv_end_result_screen;
        public Boolean skip_idv_if_underage;
        public Boolean suppress_ssa_consent;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new IdvFlowParameters(this.render_config, this.fail_on_dismissals, this.allow_sponsored_customers, this.allow_didv_step_up, this.collect_ssn_option, this.override_flow_behavior, this.show_idv_end_result_screen, this.caller_identifier, this.idv_end_result_screen_config, this.persona_theme_sets, this.persona_theme_set_id, this.eidv_intro_screen_option, this.color_theme_override, this.suppress_ssa_consent, this.skip_idv_if_underage, this.allow_itins, buildUnknownFields());
        }
    }

    static {
        IdvFlowParameters$Companion$ADAPTER$1 idvFlowParameters$Companion$ADAPTER$1 = new IdvFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IdvFlowParameters.class), "type.googleapis.com/squareup.cash.cashidv.flows.IdvFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashidv/flows/FlowParameters.proto");
        ADAPTER = idvFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(idvFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdvFlowParameters(IdvRenderConfig idvRenderConfig, Boolean bool, Boolean bool2, Boolean bool3, CollectSsnOption collectSsnOption, FlowBehavior flowBehavior, Boolean bool4, String str, IdvEndResultScreenConfig idvEndResultScreenConfig, String str2, String str3, EIdvIntroScreenOption eIdvIntroScreenOption, BlockerDescriptor.Theme theme, Boolean bool5, Boolean bool6, Boolean bool7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.render_config = idvRenderConfig;
        this.fail_on_dismissals = bool;
        this.allow_sponsored_customers = bool2;
        this.allow_didv_step_up = bool3;
        this.collect_ssn_option = collectSsnOption;
        this.override_flow_behavior = flowBehavior;
        this.show_idv_end_result_screen = bool4;
        this.caller_identifier = str;
        this.idv_end_result_screen_config = idvEndResultScreenConfig;
        this.persona_theme_sets = str2;
        this.persona_theme_set_id = str3;
        this.eidv_intro_screen_option = eIdvIntroScreenOption;
        this.color_theme_override = theme;
        this.suppress_ssa_consent = bool5;
        this.skip_idv_if_underage = bool6;
        this.allow_itins = bool7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdvFlowParameters)) {
            return false;
        }
        IdvFlowParameters idvFlowParameters = (IdvFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), idvFlowParameters.unknownFields()) && Intrinsics.areEqual(this.render_config, idvFlowParameters.render_config) && Intrinsics.areEqual(this.fail_on_dismissals, idvFlowParameters.fail_on_dismissals) && Intrinsics.areEqual(this.allow_sponsored_customers, idvFlowParameters.allow_sponsored_customers) && Intrinsics.areEqual(this.allow_didv_step_up, idvFlowParameters.allow_didv_step_up) && this.collect_ssn_option == idvFlowParameters.collect_ssn_option && this.override_flow_behavior == idvFlowParameters.override_flow_behavior && Intrinsics.areEqual(this.show_idv_end_result_screen, idvFlowParameters.show_idv_end_result_screen) && Intrinsics.areEqual(this.caller_identifier, idvFlowParameters.caller_identifier) && Intrinsics.areEqual(this.idv_end_result_screen_config, idvFlowParameters.idv_end_result_screen_config) && Intrinsics.areEqual(this.persona_theme_sets, idvFlowParameters.persona_theme_sets) && Intrinsics.areEqual(this.persona_theme_set_id, idvFlowParameters.persona_theme_set_id) && this.eidv_intro_screen_option == idvFlowParameters.eidv_intro_screen_option && Intrinsics.areEqual(this.color_theme_override, idvFlowParameters.color_theme_override) && Intrinsics.areEqual(this.suppress_ssa_consent, idvFlowParameters.suppress_ssa_consent) && Intrinsics.areEqual(this.skip_idv_if_underage, idvFlowParameters.skip_idv_if_underage) && Intrinsics.areEqual(this.allow_itins, idvFlowParameters.allow_itins);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        IdvRenderConfig idvRenderConfig = this.render_config;
        int hashCode2 = (hashCode + (idvRenderConfig != null ? idvRenderConfig.hashCode() : 0)) * 37;
        Boolean bool = this.fail_on_dismissals;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.allow_sponsored_customers;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.allow_didv_step_up;
        int hashCode5 = (hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        CollectSsnOption collectSsnOption = this.collect_ssn_option;
        int hashCode6 = (hashCode5 + (collectSsnOption != null ? collectSsnOption.hashCode() : 0)) * 37;
        FlowBehavior flowBehavior = this.override_flow_behavior;
        int hashCode7 = (hashCode6 + (flowBehavior != null ? flowBehavior.hashCode() : 0)) * 37;
        Boolean bool4 = this.show_idv_end_result_screen;
        int hashCode8 = (hashCode7 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str = this.caller_identifier;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 37;
        IdvEndResultScreenConfig idvEndResultScreenConfig = this.idv_end_result_screen_config;
        int hashCode10 = (hashCode9 + (idvEndResultScreenConfig != null ? idvEndResultScreenConfig.hashCode() : 0)) * 37;
        String str2 = this.persona_theme_sets;
        int hashCode11 = (hashCode10 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.persona_theme_set_id;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EIdvIntroScreenOption eIdvIntroScreenOption = this.eidv_intro_screen_option;
        int hashCode13 = (hashCode12 + (eIdvIntroScreenOption != null ? eIdvIntroScreenOption.hashCode() : 0)) * 37;
        BlockerDescriptor.Theme theme = this.color_theme_override;
        int hashCode14 = (hashCode13 + (theme != null ? theme.hashCode() : 0)) * 37;
        Boolean bool5 = this.suppress_ssa_consent;
        int hashCode15 = (hashCode14 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.skip_idv_if_underage;
        int hashCode16 = (hashCode15 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.allow_itins;
        int hashCode17 = hashCode16 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0);
        this.hashCode = hashCode17;
        return hashCode17;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.render_config = this.render_config;
        builder.fail_on_dismissals = this.fail_on_dismissals;
        builder.allow_sponsored_customers = this.allow_sponsored_customers;
        builder.allow_didv_step_up = this.allow_didv_step_up;
        builder.collect_ssn_option = this.collect_ssn_option;
        builder.override_flow_behavior = this.override_flow_behavior;
        builder.show_idv_end_result_screen = this.show_idv_end_result_screen;
        builder.caller_identifier = this.caller_identifier;
        builder.idv_end_result_screen_config = this.idv_end_result_screen_config;
        builder.persona_theme_sets = this.persona_theme_sets;
        builder.persona_theme_set_id = this.persona_theme_set_id;
        builder.eidv_intro_screen_option = this.eidv_intro_screen_option;
        builder.color_theme_override = this.color_theme_override;
        builder.suppress_ssa_consent = this.suppress_ssa_consent;
        builder.skip_idv_if_underage = this.skip_idv_if_underage;
        builder.allow_itins = this.allow_itins;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        IdvRenderConfig idvRenderConfig = this.render_config;
        if (idvRenderConfig != null) {
            arrayList.add("render_config=" + idvRenderConfig);
        }
        Boolean bool = this.fail_on_dismissals;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fail_on_dismissals=", bool, arrayList);
        }
        Boolean bool2 = this.allow_sponsored_customers;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_sponsored_customers=", bool2, arrayList);
        }
        Boolean bool3 = this.allow_didv_step_up;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_didv_step_up=", bool3, arrayList);
        }
        CollectSsnOption collectSsnOption = this.collect_ssn_option;
        if (collectSsnOption != null) {
            arrayList.add("collect_ssn_option=" + collectSsnOption);
        }
        FlowBehavior flowBehavior = this.override_flow_behavior;
        if (flowBehavior != null) {
            arrayList.add("override_flow_behavior=" + flowBehavior);
        }
        Boolean bool4 = this.show_idv_end_result_screen;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_idv_end_result_screen=", bool4, arrayList);
        }
        String str = this.caller_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "caller_identifier=", arrayList);
        }
        IdvEndResultScreenConfig idvEndResultScreenConfig = this.idv_end_result_screen_config;
        if (idvEndResultScreenConfig != null) {
            arrayList.add("idv_end_result_screen_config=" + idvEndResultScreenConfig);
        }
        String str2 = this.persona_theme_sets;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "persona_theme_sets=", arrayList);
        }
        String str3 = this.persona_theme_set_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "persona_theme_set_id=", arrayList);
        }
        EIdvIntroScreenOption eIdvIntroScreenOption = this.eidv_intro_screen_option;
        if (eIdvIntroScreenOption != null) {
            arrayList.add("eidv_intro_screen_option=" + eIdvIntroScreenOption);
        }
        BlockerDescriptor.Theme theme = this.color_theme_override;
        if (theme != null) {
            arrayList.add("color_theme_override=" + theme);
        }
        Boolean bool5 = this.suppress_ssa_consent;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_ssa_consent=", bool5, arrayList);
        }
        Boolean bool6 = this.skip_idv_if_underage;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_idv_if_underage=", bool6, arrayList);
        }
        Boolean bool7 = this.allow_itins;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_itins=", bool7, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdvFlowParameters{", "}", 0, null, null, 56);
    }
}
