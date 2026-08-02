package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
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
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class UiP2pSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiP2pSettings> CREATOR;
    public final Boolean can_upgrade_to_business;
    public final Boolean cash_balance_home_screen_button_enabled;
    public final DepositPreference deposit_preference;
    public final DepositPreferenceData deposit_preference_data;
    public final IncomingRequestPolicy incoming_request_policy;
    public final NearbyVisibility nearby_visibility;
    public final RatePlan rate_plan;
    public final Integer require_minimum_initiator_notes_length_for_requests;

    static {
        UiP2pSettings$Companion$ADAPTER$1 uiP2pSettings$Companion$ADAPTER$1 = new UiP2pSettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiP2pSettings.class), "type.googleapis.com/squareup.franklin.ui.UiP2pSettings", Syntax.PROTO_2, null, "squareup/franklin/ui/p2p_settings.proto");
        ADAPTER = uiP2pSettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiP2pSettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiP2pSettings(Integer num, IncomingRequestPolicy incomingRequestPolicy, NearbyVisibility nearbyVisibility, RatePlan ratePlan, Boolean bool, DepositPreference depositPreference, DepositPreferenceData depositPreferenceData, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.require_minimum_initiator_notes_length_for_requests = num;
        this.incoming_request_policy = incomingRequestPolicy;
        this.nearby_visibility = nearbyVisibility;
        this.rate_plan = ratePlan;
        this.can_upgrade_to_business = bool;
        this.deposit_preference = depositPreference;
        this.deposit_preference_data = depositPreferenceData;
        this.cash_balance_home_screen_button_enabled = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiP2pSettings)) {
            return false;
        }
        UiP2pSettings uiP2pSettings = (UiP2pSettings) obj;
        return Intrinsics.areEqual(unknownFields(), uiP2pSettings.unknownFields()) && Intrinsics.areEqual(this.require_minimum_initiator_notes_length_for_requests, uiP2pSettings.require_minimum_initiator_notes_length_for_requests) && this.incoming_request_policy == uiP2pSettings.incoming_request_policy && this.nearby_visibility == uiP2pSettings.nearby_visibility && this.rate_plan == uiP2pSettings.rate_plan && Intrinsics.areEqual(this.can_upgrade_to_business, uiP2pSettings.can_upgrade_to_business) && this.deposit_preference == uiP2pSettings.deposit_preference && Intrinsics.areEqual(this.deposit_preference_data, uiP2pSettings.deposit_preference_data) && Intrinsics.areEqual(this.cash_balance_home_screen_button_enabled, uiP2pSettings.cash_balance_home_screen_button_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.require_minimum_initiator_notes_length_for_requests;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        int hashCode3 = (hashCode2 + (incomingRequestPolicy != null ? incomingRequestPolicy.hashCode() : 0)) * 37;
        NearbyVisibility nearbyVisibility = this.nearby_visibility;
        int hashCode4 = (hashCode3 + (nearbyVisibility != null ? nearbyVisibility.hashCode() : 0)) * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode5 = (hashCode4 + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        Boolean bool = this.can_upgrade_to_business;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode7 = (hashCode6 + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        DepositPreferenceData depositPreferenceData = this.deposit_preference_data;
        int hashCode8 = (hashCode7 + (depositPreferenceData != null ? depositPreferenceData.hashCode() : 0)) * 37;
        Boolean bool2 = this.cash_balance_home_screen_button_enabled;
        int hashCode9 = hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(6);
        builder.goal_progress_percentage = this.require_minimum_initiator_notes_length_for_requests;
        builder.token = this.incoming_request_policy;
        builder.icon_unicode = this.nearby_visibility;
        builder.completion_token = this.rate_plan;
        builder.met_goal = this.can_upgrade_to_business;
        builder.label = this.deposit_preference;
        builder.goal_flow_parameters = this.deposit_preference_data;
        builder.goal_amount = this.cash_balance_home_screen_button_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.require_minimum_initiator_notes_length_for_requests;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("require_minimum_initiator_notes_length_for_requests=", num, arrayList);
        }
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        if (incomingRequestPolicy != null) {
            arrayList.add("incoming_request_policy=" + incomingRequestPolicy);
        }
        NearbyVisibility nearbyVisibility = this.nearby_visibility;
        if (nearbyVisibility != null) {
            arrayList.add("nearby_visibility=" + nearbyVisibility);
        }
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        Boolean bool = this.can_upgrade_to_business;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_upgrade_to_business=", bool, arrayList);
        }
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        DepositPreferenceData depositPreferenceData = this.deposit_preference_data;
        if (depositPreferenceData != null) {
            arrayList.add("deposit_preference_data=" + depositPreferenceData);
        }
        Boolean bool2 = this.cash_balance_home_screen_button_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cash_balance_home_screen_button_enabled=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiP2pSettings{", "}", 0, null, null, 56);
    }
}
