package com.squareup.protos.cash.usher.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.common.Header;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.lending.OpaqueRoute;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/usher/api/GetPreSignInDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/ClaimData$Builder;", "Builder", "androidx/room/util/DBUtil", "StaffInvitationIntroData", "ContextualOnboardingIntroData", "InvitationIntroData", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetPreSignInDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPreSignInDataResponse> CREATOR;
    public final DBUtil intro_data;

    /* loaded from: classes8.dex */
    public final class ContextualOnboardingIntroData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ContextualOnboardingIntroData> CREATOR;
        public final String image_url;
        public final String video_url;

        static {
            GetPreSignInDataResponse$ContextualOnboardingIntroData$Companion$ADAPTER$1 getPreSignInDataResponse$ContextualOnboardingIntroData$Companion$ADAPTER$1 = new GetPreSignInDataResponse$ContextualOnboardingIntroData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContextualOnboardingIntroData.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.ContextualOnboardingIntroData", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
            ADAPTER = getPreSignInDataResponse$ContextualOnboardingIntroData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$ContextualOnboardingIntroData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContextualOnboardingIntroData(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_url = str;
            this.video_url = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContextualOnboardingIntroData)) {
                return false;
            }
            ContextualOnboardingIntroData contextualOnboardingIntroData = (ContextualOnboardingIntroData) obj;
            return Intrinsics.areEqual(unknownFields(), contextualOnboardingIntroData.unknownFields()) && Intrinsics.areEqual(this.image_url, contextualOnboardingIntroData.image_url) && Intrinsics.areEqual(this.video_url, contextualOnboardingIntroData.video_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.image_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.video_url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(19);
            builder.name = this.image_url;
            builder.value = this.video_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_url=", arrayList);
            }
            String str2 = this.video_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "video_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ContextualOnboardingIntroData{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class InvitationIntroData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InvitationIntroData> CREATOR;
        public final zzlt content;

        public final class AcceptInvitationAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AcceptInvitationAction> CREATOR;
            public final String prospect_token;

            static {
                GetPreSignInDataResponse$InvitationIntroData$AcceptInvitationAction$Companion$ADAPTER$1 getPreSignInDataResponse$InvitationIntroData$AcceptInvitationAction$Companion$ADAPTER$1 = new GetPreSignInDataResponse$InvitationIntroData$AcceptInvitationAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AcceptInvitationAction.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.InvitationIntroData.AcceptInvitationAction", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
                ADAPTER = getPreSignInDataResponse$InvitationIntroData$AcceptInvitationAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$InvitationIntroData$AcceptInvitationAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AcceptInvitationAction(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.prospect_token = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AcceptInvitationAction)) {
                    return false;
                }
                AcceptInvitationAction acceptInvitationAction = (AcceptInvitationAction) obj;
                return Intrinsics.areEqual(unknownFields(), acceptInvitationAction.unknownFields()) && Intrinsics.areEqual(this.prospect_token, acceptInvitationAction.prospect_token);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.prospect_token;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OpaqueRoute.Builder builder = new OpaqueRoute.Builder(5);
                builder.client_route = this.prospect_token;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.prospect_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prospect_token=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AcceptInvitationAction{", "}", 0, null, null, 56);
            }
        }

        public final class CloseScreenDialog extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CloseScreenDialog> CREATOR;
            public final String continue_button_text;
            public final String dismiss_button_text;
            public final String message;
            public final String title;

            static {
                GetPreSignInDataResponse$InvitationIntroData$CloseScreenDialog$Companion$ADAPTER$1 getPreSignInDataResponse$InvitationIntroData$CloseScreenDialog$Companion$ADAPTER$1 = new GetPreSignInDataResponse$InvitationIntroData$CloseScreenDialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CloseScreenDialog.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
                ADAPTER = getPreSignInDataResponse$InvitationIntroData$CloseScreenDialog$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$InvitationIntroData$CloseScreenDialog$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CloseScreenDialog(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.message = str2;
                this.continue_button_text = str3;
                this.dismiss_button_text = str4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CloseScreenDialog)) {
                    return false;
                }
                CloseScreenDialog closeScreenDialog = (CloseScreenDialog) obj;
                return Intrinsics.areEqual(unknownFields(), closeScreenDialog.unknownFields()) && Intrinsics.areEqual(this.title, closeScreenDialog.title) && Intrinsics.areEqual(this.message, closeScreenDialog.message) && Intrinsics.areEqual(this.continue_button_text, closeScreenDialog.continue_button_text) && Intrinsics.areEqual(this.dismiss_button_text, closeScreenDialog.dismiss_button_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.message;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.continue_button_text;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.dismiss_button_text;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PoolOwner.Builder builder = new PoolOwner.Builder(15);
                builder.customer_token = this.title;
                builder.full_name = this.message;
                builder.profile_photo_url = this.continue_button_text;
                builder.cashtag = this.dismiss_button_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.message;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
                }
                String str3 = this.continue_button_text;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "continue_button_text=", arrayList);
                }
                String str4 = this.dismiss_button_text;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dismiss_button_text=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CloseScreenDialog{", "}", 0, null, null, 56);
            }
        }

        public final class SponsorSponsorshipRequestContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SponsorSponsorshipRequestContent> CREATOR;
            public final CloseScreenDialog close_screen_dialog;
            public final List elements;
            public final AcceptInvitationAction primary_button_action;
            public final String primary_button_text;

            public final class Builder extends Message.Builder {
                public CloseScreenDialog close_screen_dialog;
                public List elements;
                public AcceptInvitationAction primary_button_action;
                public String primary_button_text;

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    return new SponsorSponsorshipRequestContent(this.elements, this.primary_button_text, this.primary_button_action, this.close_screen_dialog, buildUnknownFields());
                }
            }

            static {
                GetPreSignInDataResponse$InvitationIntroData$SponsorSponsorshipRequestContent$Companion$ADAPTER$1 getPreSignInDataResponse$InvitationIntroData$SponsorSponsorshipRequestContent$Companion$ADAPTER$1 = new GetPreSignInDataResponse$InvitationIntroData$SponsorSponsorshipRequestContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SponsorSponsorshipRequestContent.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
                ADAPTER = getPreSignInDataResponse$InvitationIntroData$SponsorSponsorshipRequestContent$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$InvitationIntroData$SponsorSponsorshipRequestContent$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SponsorSponsorshipRequestContent(List list, String str, AcceptInvitationAction acceptInvitationAction, CloseScreenDialog closeScreenDialog, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.primary_button_text = str;
                this.primary_button_action = acceptInvitationAction;
                this.close_screen_dialog = closeScreenDialog;
                this.elements = TransactorKt.immutableCopyOf("elements", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SponsorSponsorshipRequestContent)) {
                    return false;
                }
                SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent = (SponsorSponsorshipRequestContent) obj;
                return Intrinsics.areEqual(unknownFields(), sponsorSponsorshipRequestContent.unknownFields()) && Intrinsics.areEqual(this.elements, sponsorSponsorshipRequestContent.elements) && Intrinsics.areEqual(this.primary_button_text, sponsorSponsorshipRequestContent.primary_button_text) && Intrinsics.areEqual(this.primary_button_action, sponsorSponsorshipRequestContent.primary_button_action) && Intrinsics.areEqual(this.close_screen_dialog, sponsorSponsorshipRequestContent.close_screen_dialog);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.elements);
                String str = this.primary_button_text;
                int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
                AcceptInvitationAction acceptInvitationAction = this.primary_button_action;
                int hashCode2 = (hashCode + (acceptInvitationAction != null ? acceptInvitationAction.hashCode() : 0)) * 37;
                CloseScreenDialog closeScreenDialog = this.close_screen_dialog;
                int hashCode3 = hashCode2 + (closeScreenDialog != null ? closeScreenDialog.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.elements = this.elements;
                builder.primary_button_text = this.primary_button_text;
                builder.primary_button_action = this.primary_button_action;
                builder.close_screen_dialog = this.close_screen_dialog;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.elements;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
                }
                String str = this.primary_button_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_button_text=", arrayList);
                }
                AcceptInvitationAction acceptInvitationAction = this.primary_button_action;
                if (acceptInvitationAction != null) {
                    arrayList.add("primary_button_action=" + acceptInvitationAction);
                }
                CloseScreenDialog closeScreenDialog = this.close_screen_dialog;
                if (closeScreenDialog != null) {
                    arrayList.add("close_screen_dialog=" + closeScreenDialog);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SponsorSponsorshipRequestContent{", "}", 0, null, null, 56);
            }
        }

        public final class TeenSponsorshipRequestContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TeenSponsorshipRequestContent> CREATOR;
            public final CloseScreenDialog close_screen_dialog;
            public final FormBlocker.Element.TextElement legal_text_above_primary_button;
            public final AcceptInvitationAction primary_button_action;
            public final String primary_button_text;
            public final FormBlocker.Element.SpacerElement spacer_under_subtitle;
            public final FormBlocker.Element.RemoteImageElement splash_image;
            public final FormBlocker.Element.TextElement subtitle;
            public final FormBlocker.Element.TextElement title;

            public final class Builder extends Message.Builder {
                public CloseScreenDialog close_screen_dialog;
                public FormBlocker.Element.TextElement legal_text_above_primary_button;
                public AcceptInvitationAction primary_button_action;
                public String primary_button_text;
                public FormBlocker.Element.SpacerElement spacer_under_subtitle;
                public FormBlocker.Element.RemoteImageElement splash_image;
                public FormBlocker.Element.TextElement subtitle;
                public FormBlocker.Element.TextElement title;

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    return new TeenSponsorshipRequestContent(this.splash_image, this.title, this.subtitle, this.spacer_under_subtitle, this.legal_text_above_primary_button, this.primary_button_text, this.primary_button_action, this.close_screen_dialog, buildUnknownFields());
                }
            }

            static {
                GetPreSignInDataResponse$InvitationIntroData$TeenSponsorshipRequestContent$Companion$ADAPTER$1 getPreSignInDataResponse$InvitationIntroData$TeenSponsorshipRequestContent$Companion$ADAPTER$1 = new GetPreSignInDataResponse$InvitationIntroData$TeenSponsorshipRequestContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TeenSponsorshipRequestContent.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
                ADAPTER = getPreSignInDataResponse$InvitationIntroData$TeenSponsorshipRequestContent$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$InvitationIntroData$TeenSponsorshipRequestContent$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TeenSponsorshipRequestContent(FormBlocker.Element.RemoteImageElement remoteImageElement, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, FormBlocker.Element.SpacerElement spacerElement, FormBlocker.Element.TextElement textElement3, String str, AcceptInvitationAction acceptInvitationAction, CloseScreenDialog closeScreenDialog, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.splash_image = remoteImageElement;
                this.title = textElement;
                this.subtitle = textElement2;
                this.spacer_under_subtitle = spacerElement;
                this.legal_text_above_primary_button = textElement3;
                this.primary_button_text = str;
                this.primary_button_action = acceptInvitationAction;
                this.close_screen_dialog = closeScreenDialog;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TeenSponsorshipRequestContent)) {
                    return false;
                }
                TeenSponsorshipRequestContent teenSponsorshipRequestContent = (TeenSponsorshipRequestContent) obj;
                return Intrinsics.areEqual(unknownFields(), teenSponsorshipRequestContent.unknownFields()) && Intrinsics.areEqual(this.splash_image, teenSponsorshipRequestContent.splash_image) && Intrinsics.areEqual(this.title, teenSponsorshipRequestContent.title) && Intrinsics.areEqual(this.subtitle, teenSponsorshipRequestContent.subtitle) && Intrinsics.areEqual(this.spacer_under_subtitle, teenSponsorshipRequestContent.spacer_under_subtitle) && Intrinsics.areEqual(this.legal_text_above_primary_button, teenSponsorshipRequestContent.legal_text_above_primary_button) && Intrinsics.areEqual(this.primary_button_text, teenSponsorshipRequestContent.primary_button_text) && Intrinsics.areEqual(this.primary_button_action, teenSponsorshipRequestContent.primary_button_action) && Intrinsics.areEqual(this.close_screen_dialog, teenSponsorshipRequestContent.close_screen_dialog);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                FormBlocker.Element.RemoteImageElement remoteImageElement = this.splash_image;
                int hashCode2 = (hashCode + (remoteImageElement != null ? remoteImageElement.hashCode() : 0)) * 37;
                FormBlocker.Element.TextElement textElement = this.title;
                int hashCode3 = (hashCode2 + (textElement != null ? textElement.hashCode() : 0)) * 37;
                FormBlocker.Element.TextElement textElement2 = this.subtitle;
                int hashCode4 = (hashCode3 + (textElement2 != null ? textElement2.hashCode() : 0)) * 37;
                FormBlocker.Element.SpacerElement spacerElement = this.spacer_under_subtitle;
                int hashCode5 = (hashCode4 + (spacerElement != null ? spacerElement.hashCode() : 0)) * 37;
                FormBlocker.Element.TextElement textElement3 = this.legal_text_above_primary_button;
                int hashCode6 = (hashCode5 + (textElement3 != null ? textElement3.hashCode() : 0)) * 37;
                String str = this.primary_button_text;
                int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
                AcceptInvitationAction acceptInvitationAction = this.primary_button_action;
                int hashCode8 = (hashCode7 + (acceptInvitationAction != null ? acceptInvitationAction.hashCode() : 0)) * 37;
                CloseScreenDialog closeScreenDialog = this.close_screen_dialog;
                int hashCode9 = hashCode8 + (closeScreenDialog != null ? closeScreenDialog.hashCode() : 0);
                this.hashCode = hashCode9;
                return hashCode9;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.splash_image = this.splash_image;
                builder.title = this.title;
                builder.subtitle = this.subtitle;
                builder.spacer_under_subtitle = this.spacer_under_subtitle;
                builder.legal_text_above_primary_button = this.legal_text_above_primary_button;
                builder.primary_button_text = this.primary_button_text;
                builder.primary_button_action = this.primary_button_action;
                builder.close_screen_dialog = this.close_screen_dialog;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                FormBlocker.Element.RemoteImageElement remoteImageElement = this.splash_image;
                if (remoteImageElement != null) {
                    arrayList.add("splash_image=" + remoteImageElement);
                }
                FormBlocker.Element.TextElement textElement = this.title;
                if (textElement != null) {
                    arrayList.add("title=" + textElement);
                }
                FormBlocker.Element.TextElement textElement2 = this.subtitle;
                if (textElement2 != null) {
                    arrayList.add("subtitle=" + textElement2);
                }
                FormBlocker.Element.SpacerElement spacerElement = this.spacer_under_subtitle;
                if (spacerElement != null) {
                    arrayList.add("spacer_under_subtitle=" + spacerElement);
                }
                FormBlocker.Element.TextElement textElement3 = this.legal_text_above_primary_button;
                if (textElement3 != null) {
                    arrayList.add("legal_text_above_primary_button=" + textElement3);
                }
                String str = this.primary_button_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_button_text=", arrayList);
                }
                AcceptInvitationAction acceptInvitationAction = this.primary_button_action;
                if (acceptInvitationAction != null) {
                    arrayList.add("primary_button_action=" + acceptInvitationAction);
                }
                CloseScreenDialog closeScreenDialog = this.close_screen_dialog;
                if (closeScreenDialog != null) {
                    arrayList.add("close_screen_dialog=" + closeScreenDialog);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TeenSponsorshipRequestContent{", "}", 0, null, null, 56);
            }
        }

        static {
            GetPreSignInDataResponse$InvitationIntroData$Companion$ADAPTER$1 getPreSignInDataResponse$InvitationIntroData$Companion$ADAPTER$1 = new GetPreSignInDataResponse$InvitationIntroData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvitationIntroData.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.InvitationIntroData", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
            ADAPTER = getPreSignInDataResponse$InvitationIntroData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$InvitationIntroData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvitationIntroData(zzlt zzltVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = zzltVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InvitationIntroData)) {
                return false;
            }
            InvitationIntroData invitationIntroData = (InvitationIntroData) obj;
            return Intrinsics.areEqual(unknownFields(), invitationIntroData.unknownFields()) && Intrinsics.areEqual(this.content, invitationIntroData.content);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzlt zzltVar = this.content;
            int hashCode2 = hashCode + (zzltVar != null ? zzltVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(8);
            builder.claimable_payment = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzlt zzltVar = this.content;
            if (zzltVar != null) {
                arrayList.add("content=" + zzltVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InvitationIntroData{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class StaffInvitationIntroData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StaffInvitationIntroData> CREATOR;
        public final FormBlocker form_blocker;

        static {
            GetPreSignInDataResponse$StaffInvitationIntroData$Companion$ADAPTER$1 getPreSignInDataResponse$StaffInvitationIntroData$Companion$ADAPTER$1 = new GetPreSignInDataResponse$StaffInvitationIntroData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StaffInvitationIntroData.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse.StaffInvitationIntroData", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
            ADAPTER = getPreSignInDataResponse$StaffInvitationIntroData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$StaffInvitationIntroData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StaffInvitationIntroData(FormBlocker formBlocker, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.form_blocker = formBlocker;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StaffInvitationIntroData)) {
                return false;
            }
            StaffInvitationIntroData staffInvitationIntroData = (StaffInvitationIntroData) obj;
            return Intrinsics.areEqual(unknownFields(), staffInvitationIntroData.unknownFields()) && Intrinsics.areEqual(this.form_blocker, staffInvitationIntroData.form_blocker);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FormBlocker formBlocker = this.form_blocker;
            int hashCode2 = hashCode + (formBlocker != null ? formBlocker.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(9);
            builder.claimable_payment = this.form_blocker;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            FormBlocker formBlocker = this.form_blocker;
            if (formBlocker != null) {
                arrayList.add("form_blocker=" + formBlocker);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StaffInvitationIntroData{", "}", 0, null, null, 56);
        }
    }

    static {
        GetPreSignInDataResponse$Companion$ADAPTER$1 getPreSignInDataResponse$Companion$ADAPTER$1 = new GetPreSignInDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPreSignInDataResponse.class), "type.googleapis.com/squareup.cash.usher.api.v1.GetPreSignInDataResponse", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/get_pre_sign_in_data.proto");
        ADAPTER = getPreSignInDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPreSignInDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPreSignInDataResponse(DBUtil dBUtil, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.intro_data = dBUtil;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPreSignInDataResponse)) {
            return false;
        }
        GetPreSignInDataResponse getPreSignInDataResponse = (GetPreSignInDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPreSignInDataResponse.unknownFields()) && Intrinsics.areEqual(this.intro_data, getPreSignInDataResponse.intro_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DBUtil dBUtil = this.intro_data;
        int hashCode2 = hashCode + (dBUtil != null ? dBUtil.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(7);
        builder.claimable_payment = this.intro_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DBUtil dBUtil = this.intro_data;
        if (dBUtil != null) {
            arrayList.add("intro_data=" + dBUtil);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPreSignInDataResponse{", "}", 0, null, null, 56);
    }
}
