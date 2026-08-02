package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.person.Alias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StatusResultButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatusResultButton> CREATOR;
    public final ButtonAction action;
    public final BlockerAction blocker_action;
    public final ClientScenario client_scenario;
    public final LocalizableString localizable_text;
    public final String support_flow_node;
    public final String text;
    public final String url;

    public enum ButtonAction implements WireEnum {
        PAY_SCREEN(1),
        LINK_CARD(2),
        OPEN_URL(3),
        INVITATION_SCREEN(5),
        ADD_CASH(6),
        COMPLETE_CLIENT_SCENARIO(8),
        START_SUPPORT_FLOW(9),
        BLOCKER_ACTION(11);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final StatusResultButton$ButtonAction$Companion$ADAPTER$1 ADAPTER = new StatusResultButton$ButtonAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonAction.class), Syntax.PROTO_2, null);

        ButtonAction(int i) {
            this.value = i;
        }

        public static final ButtonAction fromValue(int i) {
            Companion.getClass();
            return ClientDriven.Companion.m3976fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        StatusResultButton$Companion$ADAPTER$1 statusResultButton$Companion$ADAPTER$1 = new StatusResultButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusResultButton.class), "type.googleapis.com/squareup.franklin.StatusResultButton", Syntax.PROTO_2, null, "squareup/franklin/status_result.proto");
        ADAPTER = statusResultButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statusResultButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusResultButton(ButtonAction buttonAction, String str, LocalizableString localizableString, String str2, ClientScenario clientScenario, String str3, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = buttonAction;
        this.text = str;
        this.localizable_text = localizableString;
        this.url = str2;
        this.client_scenario = clientScenario;
        this.support_flow_node = str3;
        this.blocker_action = blockerAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatusResultButton)) {
            return false;
        }
        StatusResultButton statusResultButton = (StatusResultButton) obj;
        return Intrinsics.areEqual(unknownFields(), statusResultButton.unknownFields()) && this.action == statusResultButton.action && Intrinsics.areEqual(this.text, statusResultButton.text) && Intrinsics.areEqual(this.localizable_text, statusResultButton.localizable_text) && Intrinsics.areEqual(this.url, statusResultButton.url) && this.client_scenario == statusResultButton.client_scenario && Intrinsics.areEqual(this.support_flow_node, statusResultButton.support_flow_node) && Intrinsics.areEqual(this.blocker_action, statusResultButton.blocker_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonAction buttonAction = this.action;
        int hashCode2 = (hashCode + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_text;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode6 = (hashCode5 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        String str3 = this.support_flow_node;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.blocker_action;
        int hashCode8 = hashCode7 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(9, false);
        builder.f1407type = this.action;
        builder.scope = this.text;
        builder.first_verified_at_ms = this.localizable_text;
        builder.value = this.url;
        builder.last_verified_at_ms = this.client_scenario;
        builder.created_at = this.support_flow_node;
        builder.updated_at = this.blocker_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonAction buttonAction = this.action;
        if (buttonAction != null) {
            arrayList.add("action=" + buttonAction);
        }
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        String str3 = this.support_flow_node;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "support_flow_node=", arrayList);
        }
        BlockerAction blockerAction = this.blocker_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("blocker_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatusResultButton{", "}", 0, null, null, 56);
    }

    public /* synthetic */ StatusResultButton(ButtonAction buttonAction, String str, int i) {
        this(buttonAction, str, null, null, null, null, null, ByteString.EMPTY);
    }
}
