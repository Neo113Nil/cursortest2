package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.common.appmessaging.AppMessagePayload;
import com.squareup.protos.franklin.ui.BackNavigationPrompt;
import com.squareup.protos.hieroglyph.KeyScope;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import xyz.block.protos.genie.IdValue;

/* loaded from: classes.dex */
public final class StatusResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatusResult> CREATOR;
    public final Action action;
    public final BackNavigationPrompt back_navigation_prompt;
    public final BlockerAction.EndActivityAction end_activity_action;
    public final Icon icon;
    public final LocalizableString localizable_promo_text;
    public final LocalizableString localizable_text;
    public final StatusResultButton primary_button;
    public final AppMessagePayload promo_payload;
    public final String promo_text;
    public final String redirect_uri;
    public final StatusResultButton secondary_button;
    public final Boolean show_confetti;
    public final SupportAction support_action;
    public final String text;

    /* loaded from: classes8.dex */
    public enum Action implements WireEnum {
        SHOW_DIALOG(1),
        INSTANT_REDIRECT(2),
        START_SUPPORT_FLOW(3),
        INSTANT_INTERNAL_REDIRECT(4),
        INSTANT_BACK_NAVIGATION(5),
        END_ACTIVITY(6);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final StatusResult$Action$Companion$ADAPTER$1 ADAPTER = new StatusResult$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return SHOW_DIALOG;
                case 2:
                    return INSTANT_REDIRECT;
                case 3:
                    return START_SUPPORT_FLOW;
                case 4:
                    return INSTANT_INTERNAL_REDIRECT;
                case 5:
                    return INSTANT_BACK_NAVIGATION;
                case 6:
                    return END_ACTIVITY;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public Action action;
        public BackNavigationPrompt back_navigation_prompt;
        public BlockerAction.EndActivityAction end_activity_action;
        public Icon icon;
        public LocalizableString localizable_promo_text;
        public LocalizableString localizable_text;
        public StatusResultButton primary_button;
        public AppMessagePayload promo_payload;
        public String promo_text;
        public String redirect_uri;
        public StatusResultButton secondary_button;
        public Boolean show_confetti;
        public SupportAction support_action;
        public String text;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new StatusResult(this.icon, this.text, this.localizable_text, this.primary_button, this.secondary_button, this.promo_text, this.localizable_promo_text, this.promo_payload, this.action, this.redirect_uri, this.show_confetti, this.support_action, this.end_activity_action, this.back_navigation_prompt, buildUnknownFields());
        }
    }

    /* loaded from: classes8.dex */
    public enum Icon implements WireEnum {
        SUCCESS(1),
        INSTANT(6),
        BANK(2),
        FAILURE(3),
        ACTION_REQUIRED(4),
        PENDING(7),
        VERIFICATION_REQUIRED(8),
        PACKAGE(9),
        ACCOUNT_LOCKED(10),
        NONE(5);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final StatusResult$Icon$Companion$ADAPTER$1 ADAPTER = new StatusResult$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

        Icon(int i) {
            this.value = i;
        }

        public static final Icon fromValue(int i) {
            Companion.getClass();
            return KeyScope.Companion.m3971fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public final class SupportAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SupportAction> CREATOR;
        public final String entity_id;
        public final String support_flow_node;

        static {
            StatusResult$SupportAction$Companion$ADAPTER$1 statusResult$SupportAction$Companion$ADAPTER$1 = new StatusResult$SupportAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportAction.class), "type.googleapis.com/squareup.franklin.StatusResult.SupportAction", Syntax.PROTO_2, null, "squareup/franklin/status_result.proto");
            ADAPTER = statusResult$SupportAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(statusResult$SupportAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportAction(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.support_flow_node = str;
            this.entity_id = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportAction)) {
                return false;
            }
            SupportAction supportAction = (SupportAction) obj;
            return Intrinsics.areEqual(unknownFields(), supportAction.unknownFields()) && Intrinsics.areEqual(this.support_flow_node, supportAction.support_flow_node) && Intrinsics.areEqual(this.entity_id, supportAction.entity_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.support_flow_node;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.entity_id;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            IdValue.Builder builder = new IdValue.Builder(7);
            builder.server = this.support_flow_node;
            builder.local = this.entity_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.support_flow_node;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "support_flow_node=", arrayList);
            }
            String str2 = this.entity_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SupportAction{", "}", 0, null, null, 56);
        }
    }

    static {
        StatusResult$Companion$ADAPTER$1 statusResult$Companion$ADAPTER$1 = new StatusResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusResult.class), "type.googleapis.com/squareup.franklin.StatusResult", Syntax.PROTO_2, null, "squareup/franklin/status_result.proto");
        ADAPTER = statusResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(statusResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusResult(Icon icon, String str, LocalizableString localizableString, StatusResultButton statusResultButton, StatusResultButton statusResultButton2, String str2, LocalizableString localizableString2, AppMessagePayload appMessagePayload, Action action, String str3, Boolean bool, SupportAction supportAction, BlockerAction.EndActivityAction endActivityAction, BackNavigationPrompt backNavigationPrompt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.text = str;
        this.localizable_text = localizableString;
        this.primary_button = statusResultButton;
        this.secondary_button = statusResultButton2;
        this.promo_text = str2;
        this.localizable_promo_text = localizableString2;
        this.promo_payload = appMessagePayload;
        this.action = action;
        this.redirect_uri = str3;
        this.show_confetti = bool;
        this.support_action = supportAction;
        this.end_activity_action = endActivityAction;
        this.back_navigation_prompt = backNavigationPrompt;
    }

    public static StatusResult copy$default(StatusResult statusResult, String str, StatusResultButton statusResultButton, StatusResultButton statusResultButton2, String str2, LocalizableString localizableString, AppMessagePayload appMessagePayload, SupportAction supportAction, BlockerAction.EndActivityAction endActivityAction, BackNavigationPrompt backNavigationPrompt, ByteString byteString, int i) {
        Icon icon = statusResult.icon;
        LocalizableString localizableString2 = (i & 4) != 0 ? statusResult.localizable_text : null;
        StatusResultButton statusResultButton3 = (i & 8) != 0 ? statusResult.primary_button : statusResultButton;
        StatusResultButton statusResultButton4 = (i & 16) != 0 ? statusResult.secondary_button : statusResultButton2;
        String str3 = (i & 32) != 0 ? statusResult.promo_text : str2;
        LocalizableString localizableString3 = (i & 64) != 0 ? statusResult.localizable_promo_text : localizableString;
        AppMessagePayload appMessagePayload2 = (i & 128) != 0 ? statusResult.promo_payload : appMessagePayload;
        Action action = statusResult.action;
        String str4 = statusResult.redirect_uri;
        Boolean bool = statusResult.show_confetti;
        SupportAction supportAction2 = (i & 2048) != 0 ? statusResult.support_action : supportAction;
        BlockerAction.EndActivityAction endActivityAction2 = (i & 4096) != 0 ? statusResult.end_activity_action : endActivityAction;
        BackNavigationPrompt backNavigationPrompt2 = (i & PKIFailureInfo.certRevoked) != 0 ? statusResult.back_navigation_prompt : backNavigationPrompt;
        ByteString unknownFields = (i & 16384) != 0 ? statusResult.unknownFields() : byteString;
        statusResult.getClass();
        unknownFields.getClass();
        return new StatusResult(icon, str, localizableString2, statusResultButton3, statusResultButton4, str3, localizableString3, appMessagePayload2, action, str4, bool, supportAction2, endActivityAction2, backNavigationPrompt2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatusResult)) {
            return false;
        }
        StatusResult statusResult = (StatusResult) obj;
        return Intrinsics.areEqual(unknownFields(), statusResult.unknownFields()) && this.icon == statusResult.icon && Intrinsics.areEqual(this.text, statusResult.text) && Intrinsics.areEqual(this.localizable_text, statusResult.localizable_text) && Intrinsics.areEqual(this.primary_button, statusResult.primary_button) && Intrinsics.areEqual(this.secondary_button, statusResult.secondary_button) && Intrinsics.areEqual(this.promo_text, statusResult.promo_text) && Intrinsics.areEqual(this.localizable_promo_text, statusResult.localizable_promo_text) && Intrinsics.areEqual(this.promo_payload, statusResult.promo_payload) && this.action == statusResult.action && Intrinsics.areEqual(this.redirect_uri, statusResult.redirect_uri) && Intrinsics.areEqual(this.show_confetti, statusResult.show_confetti) && Intrinsics.areEqual(this.support_action, statusResult.support_action) && Intrinsics.areEqual(this.end_activity_action, statusResult.end_activity_action) && Intrinsics.areEqual(this.back_navigation_prompt, statusResult.back_navigation_prompt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_text;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        StatusResultButton statusResultButton = this.primary_button;
        int hashCode5 = (hashCode4 + (statusResultButton != null ? statusResultButton.hashCode() : 0)) * 37;
        StatusResultButton statusResultButton2 = this.secondary_button;
        int hashCode6 = (hashCode5 + (statusResultButton2 != null ? statusResultButton2.hashCode() : 0)) * 37;
        String str2 = this.promo_text;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_promo_text;
        int hashCode8 = (hashCode7 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        AppMessagePayload appMessagePayload = this.promo_payload;
        int hashCode9 = (hashCode8 + (appMessagePayload != null ? appMessagePayload.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode10 = (hashCode9 + (action != null ? action.hashCode() : 0)) * 37;
        String str3 = this.redirect_uri;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.show_confetti;
        int hashCode12 = (hashCode11 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        SupportAction supportAction = this.support_action;
        int hashCode13 = (hashCode12 + (supportAction != null ? supportAction.hashCode() : 0)) * 37;
        BlockerAction.EndActivityAction endActivityAction = this.end_activity_action;
        int hashCode14 = (hashCode13 + (endActivityAction != null ? endActivityAction.hashCode() : 0)) * 37;
        BackNavigationPrompt backNavigationPrompt = this.back_navigation_prompt;
        int hashCode15 = hashCode14 + (backNavigationPrompt != null ? backNavigationPrompt.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.icon = this.icon;
        builder.text = this.text;
        builder.localizable_text = this.localizable_text;
        builder.primary_button = this.primary_button;
        builder.secondary_button = this.secondary_button;
        builder.promo_text = this.promo_text;
        builder.localizable_promo_text = this.localizable_promo_text;
        builder.promo_payload = this.promo_payload;
        builder.action = this.action;
        builder.redirect_uri = this.redirect_uri;
        builder.show_confetti = this.show_confetti;
        builder.support_action = this.support_action;
        builder.end_activity_action = this.end_activity_action;
        builder.back_navigation_prompt = this.back_navigation_prompt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        if (this.text != null) {
            arrayList.add("text=██");
        }
        if (this.localizable_text != null) {
            arrayList.add("localizable_text=██");
        }
        StatusResultButton statusResultButton = this.primary_button;
        if (statusResultButton != null) {
            arrayList.add("primary_button=" + statusResultButton);
        }
        StatusResultButton statusResultButton2 = this.secondary_button;
        if (statusResultButton2 != null) {
            arrayList.add("secondary_button=" + statusResultButton2);
        }
        String str = this.promo_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "promo_text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_promo_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_promo_text=", localizableString, arrayList);
        }
        AppMessagePayload appMessagePayload = this.promo_payload;
        if (appMessagePayload != null) {
            arrayList.add("promo_payload=" + appMessagePayload);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        String str2 = this.redirect_uri;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "redirect_uri=", arrayList);
        }
        Boolean bool = this.show_confetti;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_confetti=", bool, arrayList);
        }
        SupportAction supportAction = this.support_action;
        if (supportAction != null) {
            arrayList.add("support_action=" + supportAction);
        }
        BlockerAction.EndActivityAction endActivityAction = this.end_activity_action;
        if (endActivityAction != null) {
            arrayList.add("end_activity_action=" + endActivityAction);
        }
        BackNavigationPrompt backNavigationPrompt = this.back_navigation_prompt;
        if (backNavigationPrompt != null) {
            arrayList.add("back_navigation_prompt=" + backNavigationPrompt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatusResult{", "}", 0, null, null, 56);
    }

    public /* synthetic */ StatusResult(Icon icon, String str, StatusResultButton statusResultButton) {
        this(icon, str, null, statusResultButton, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY);
    }
}
