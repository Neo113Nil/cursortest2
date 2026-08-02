package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class C4BIdentityHubState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<C4BIdentityHubState> CREATOR;
    public final AccountVerification account_verification;
    public final LocalizedString security_verify_identity_control_label;
    public final C4BIdentityVerificationBadgeStyle security_verify_identity_control_label_style;
    public final LocalizedString security_verify_identity_description;
    public final Boolean should_show_badge;
    public final Long version;

    public final class AccountVerification extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AccountVerification> CREATOR;
        public final ClientRouteAction client_route;
        public final C4BIdentityVerificationBadgeIcon image;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            C4BIdentityHubState$AccountVerification$Companion$ADAPTER$1 c4BIdentityHubState$AccountVerification$Companion$ADAPTER$1 = new C4BIdentityHubState$AccountVerification$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AccountVerification.class), "type.googleapis.com/squareup.franklin.ui.C4BIdentityHubState.AccountVerification", Syntax.PROTO_2, null, "squareup/franklin/ui/c4b_identity_hub_state.proto");
            ADAPTER = c4BIdentityHubState$AccountVerification$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(c4BIdentityHubState$AccountVerification$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountVerification(LocalizedString localizedString, LocalizedString localizedString2, C4BIdentityVerificationBadgeIcon c4BIdentityVerificationBadgeIcon, ClientRouteAction clientRouteAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.image = c4BIdentityVerificationBadgeIcon;
            this.client_route = clientRouteAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountVerification)) {
                return false;
            }
            AccountVerification accountVerification = (AccountVerification) obj;
            return Intrinsics.areEqual(unknownFields(), accountVerification.unknownFields()) && Intrinsics.areEqual(this.title, accountVerification.title) && Intrinsics.areEqual(this.subtitle, accountVerification.subtitle) && this.image == accountVerification.image && Intrinsics.areEqual(this.client_route, accountVerification.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            C4BIdentityVerificationBadgeIcon c4BIdentityVerificationBadgeIcon = this.image;
            int hashCode4 = (hashCode3 + (c4BIdentityVerificationBadgeIcon != null ? c4BIdentityVerificationBadgeIcon.hashCode() : 0)) * 37;
            ClientRouteAction clientRouteAction = this.client_route;
            int hashCode5 = hashCode4 + (clientRouteAction != null ? clientRouteAction.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiDda.Builder builder = new UiDda.Builder(7);
            builder.account = this.title;
            builder.enabled = this.subtitle;
            builder.button = this.image;
            builder.dda_form = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            C4BIdentityVerificationBadgeIcon c4BIdentityVerificationBadgeIcon = this.image;
            if (c4BIdentityVerificationBadgeIcon != null) {
                arrayList.add("image=" + c4BIdentityVerificationBadgeIcon);
            }
            ClientRouteAction clientRouteAction = this.client_route;
            if (clientRouteAction != null) {
                arrayList.add("client_route=" + clientRouteAction);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AccountVerification{", "}", 0, null, null, 56);
        }
    }

    public enum C4BIdentityVerificationBadgeIcon implements WireEnum {
        UNSPECIFIED_ICON(0),
        LOCKED_SHIELD(1),
        CALL_TO_ACTION_SHIELD(2);

        public static final C4BIdentityHubState$C4BIdentityVerificationBadgeIcon$Companion$ADAPTER$1 ADAPTER;
        public static final Trigger.Companion Companion;
        public final int value;

        static {
            C4BIdentityVerificationBadgeIcon c4BIdentityVerificationBadgeIcon = UNSPECIFIED_ICON;
            Companion = new Trigger.Companion();
            ADAPTER = new C4BIdentityHubState$C4BIdentityVerificationBadgeIcon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(C4BIdentityVerificationBadgeIcon.class), Syntax.PROTO_2, c4BIdentityVerificationBadgeIcon);
        }

        C4BIdentityVerificationBadgeIcon(int i) {
            this.value = i;
        }

        public static final C4BIdentityVerificationBadgeIcon fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED_ICON;
            }
            if (i == 1) {
                return LOCKED_SHIELD;
            }
            if (i != 2) {
                return null;
            }
            return CALL_TO_ACTION_SHIELD;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum C4BIdentityVerificationBadgeStyle implements WireEnum {
        DEFAULT(1),
        COMPLETE(2),
        CRITICAL(3);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final C4BIdentityHubState$C4BIdentityVerificationBadgeStyle$Companion$ADAPTER$1 ADAPTER = new C4BIdentityHubState$C4BIdentityVerificationBadgeStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(C4BIdentityVerificationBadgeStyle.class), Syntax.PROTO_2, null);

        C4BIdentityVerificationBadgeStyle(int i) {
            this.value = i;
        }

        public static final C4BIdentityVerificationBadgeStyle fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return COMPLETE;
            }
            if (i != 3) {
                return null;
            }
            return CRITICAL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;
        public final String url;

        static {
            C4BIdentityHubState$ClientRouteAction$Companion$ADAPTER$1 c4BIdentityHubState$ClientRouteAction$Companion$ADAPTER$1 = new C4BIdentityHubState$ClientRouteAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class), "type.googleapis.com/squareup.franklin.ui.C4BIdentityHubState.ClientRouteAction", Syntax.PROTO_2, null, "squareup/franklin/ui/c4b_identity_hub_state.proto");
            ADAPTER = c4BIdentityHubState$ClientRouteAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(c4BIdentityHubState$ClientRouteAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientRouteAction)) {
                return false;
            }
            ClientRouteAction clientRouteAction = (ClientRouteAction) obj;
            return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.url, clientRouteAction.url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(26);
            builder.client_route = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
        }
    }

    static {
        C4BIdentityHubState$Companion$ADAPTER$1 c4BIdentityHubState$Companion$ADAPTER$1 = new C4BIdentityHubState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(C4BIdentityHubState.class), "type.googleapis.com/squareup.franklin.ui.C4BIdentityHubState", Syntax.PROTO_2, null, "squareup/franklin/ui/c4b_identity_hub_state.proto");
        ADAPTER = c4BIdentityHubState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(c4BIdentityHubState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4BIdentityHubState(Long l, Boolean bool, LocalizedString localizedString, LocalizedString localizedString2, C4BIdentityVerificationBadgeStyle c4BIdentityVerificationBadgeStyle, AccountVerification accountVerification, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.version = l;
        this.should_show_badge = bool;
        this.security_verify_identity_description = localizedString;
        this.security_verify_identity_control_label = localizedString2;
        this.security_verify_identity_control_label_style = c4BIdentityVerificationBadgeStyle;
        this.account_verification = accountVerification;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4BIdentityHubState)) {
            return false;
        }
        C4BIdentityHubState c4BIdentityHubState = (C4BIdentityHubState) obj;
        return Intrinsics.areEqual(unknownFields(), c4BIdentityHubState.unknownFields()) && Intrinsics.areEqual(this.version, c4BIdentityHubState.version) && Intrinsics.areEqual(this.should_show_badge, c4BIdentityHubState.should_show_badge) && Intrinsics.areEqual(this.security_verify_identity_description, c4BIdentityHubState.security_verify_identity_description) && Intrinsics.areEqual(this.security_verify_identity_control_label, c4BIdentityHubState.security_verify_identity_control_label) && this.security_verify_identity_control_label_style == c4BIdentityHubState.security_verify_identity_control_label_style && Intrinsics.areEqual(this.account_verification, c4BIdentityHubState.account_verification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.version;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.should_show_badge;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalizedString localizedString = this.security_verify_identity_description;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.security_verify_identity_control_label;
        int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        C4BIdentityVerificationBadgeStyle c4BIdentityVerificationBadgeStyle = this.security_verify_identity_control_label_style;
        int hashCode6 = (hashCode5 + (c4BIdentityVerificationBadgeStyle != null ? c4BIdentityVerificationBadgeStyle.hashCode() : 0)) * 37;
        AccountVerification accountVerification = this.account_verification;
        int hashCode7 = hashCode6 + (accountVerification != null ? accountVerification.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(11, false);
        builder.full_name = this.version;
        builder.cashtag_url_enabled = this.should_show_badge;
        builder.photo_url = this.security_verify_identity_description;
        builder.synopsis = this.security_verify_identity_control_label;
        builder.full_cashtag = this.security_verify_identity_control_label_style;
        builder.is_verified_account = this.account_verification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Boolean bool = this.should_show_badge;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_show_badge=", bool, arrayList);
        }
        LocalizedString localizedString = this.security_verify_identity_description;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("security_verify_identity_description=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.security_verify_identity_control_label;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("security_verify_identity_control_label=", localizedString2, arrayList);
        }
        C4BIdentityVerificationBadgeStyle c4BIdentityVerificationBadgeStyle = this.security_verify_identity_control_label_style;
        if (c4BIdentityVerificationBadgeStyle != null) {
            arrayList.add("security_verify_identity_control_label_style=" + c4BIdentityVerificationBadgeStyle);
        }
        AccountVerification accountVerification = this.account_verification;
        if (accountVerification != null) {
            arrayList.add("account_verification=" + accountVerification);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "C4BIdentityHubState{", "}", 0, null, null, 56);
    }
}
