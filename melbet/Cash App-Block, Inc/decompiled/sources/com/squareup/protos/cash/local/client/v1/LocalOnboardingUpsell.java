package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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
public final class LocalOnboardingUpsell extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalOnboardingUpsell> CREATOR;
    public final String body;
    public final Button learn_more_button;
    public final LegalConsent legal_consent;
    public final String title;

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final String action_url;
        public final String label;

        static {
            LocalOnboardingUpsell$Button$Companion$ADAPTER$1 localOnboardingUpsell$Button$Companion$ADAPTER$1 = new LocalOnboardingUpsell$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalOnboardingUpsell.Button", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = localOnboardingUpsell$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localOnboardingUpsell$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.action_url = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.label, button.label) && Intrinsics.areEqual(this.action_url, button.action_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.action_url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FullName.Builder builder = new FullName.Builder(22);
            builder.given_name = this.label;
            builder.family_name = this.action_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.action_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalOnboardingUpsell$Companion$ADAPTER$1 localOnboardingUpsell$Companion$ADAPTER$1 = new LocalOnboardingUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalOnboardingUpsell.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalOnboardingUpsell", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = localOnboardingUpsell$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localOnboardingUpsell$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalOnboardingUpsell(String str, String str2, Button button, LegalConsent legalConsent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.body = str2;
        this.learn_more_button = button;
        this.legal_consent = legalConsent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalOnboardingUpsell)) {
            return false;
        }
        LocalOnboardingUpsell localOnboardingUpsell = (LocalOnboardingUpsell) obj;
        return Intrinsics.areEqual(unknownFields(), localOnboardingUpsell.unknownFields()) && Intrinsics.areEqual(this.title, localOnboardingUpsell.title) && Intrinsics.areEqual(this.body, localOnboardingUpsell.body) && Intrinsics.areEqual(this.learn_more_button, localOnboardingUpsell.learn_more_button) && Intrinsics.areEqual(this.legal_consent, localOnboardingUpsell.legal_consent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Button button = this.learn_more_button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        LegalConsent legalConsent = this.legal_consent;
        int hashCode5 = hashCode4 + (legalConsent != null ? legalConsent.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(13, false);
        builder.id = this.title;
        builder.last_4 = this.body;
        builder.gift_card_id = this.learn_more_button;
        builder.gift_card_amount = this.legal_consent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.body;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
        }
        Button button = this.learn_more_button;
        if (button != null) {
            arrayList.add("learn_more_button=" + button);
        }
        LegalConsent legalConsent = this.legal_consent;
        if (legalConsent != null) {
            arrayList.add("legal_consent=" + legalConsent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalOnboardingUpsell{", "}", 0, null, null, 56);
    }
}
