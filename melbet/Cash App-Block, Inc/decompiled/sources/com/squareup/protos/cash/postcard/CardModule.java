package com.squareup.protos.cash.postcard;

import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzjy;
import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.nearby.api.v1.BroadcasterProfileData;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.protos.cash.nearby.api.v1.NearbySession;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.api.v1.FailedCategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.protos.cash.paychecks.api.v1.GetEarningStreamsSummaryRequest;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAugmentedActivityPageResponse;
import com.squareup.protos.cash.paychecks.api.v1.PayerOperation;
import com.squareup.protos.cash.paychecks.api.v1.PayerUpdate;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckAllocationAmountRequest;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.protos.cash.paychecks.api.v1.UpdateEarnerModeResponse;
import com.squareup.protos.cash.paymenttemplate.v1.OonPaymentMethod;
import com.squareup.protos.cash.paymenttemplate.v1.OonPaymentMethodType;
import com.squareup.protos.cash.plasma.callcontext.AuthorizationContext;
import com.squareup.protos.cash.plasma.callcontext.AuthorizedPrincipal;
import com.squareup.protos.cash.plasma.callcontext.AuthorizedRelationship;
import com.squareup.protos.cash.pools.AdminSyncAuthzRelationshipPoliciesResponse;
import com.squareup.protos.cash.pools.CreatePoolResponse;
import com.squareup.protos.cash.pools.GetMoneyPoolPublicPreviewResponse;
import com.squareup.protos.cash.pools.GetPoolsAppletRequest;
import com.squareup.protos.cash.pools.GetPoolsAppletResponse;
import com.squareup.protos.cash.pools.HighlightedPoolsSelectionMode;
import com.squareup.protos.cash.pools.LeaveMoneyPoolFlowParameters;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.MoneyPoolVisitOrigin;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.pools.PoolsAppletStats;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.postbank.api.DdaAccountNumbers;
import com.squareup.protos.cash.postbank.api.GetCustomerPrimaryDdaDetailsResponse;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.protos.cash.postcard.app.CardDetails;
import com.squareup.protos.cash.postcard.app.GetCardDetailsResponse;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeRequest;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Header;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.earnings.EarnerModeStatus;
import squareup.cash.earnings.EarningStreamIdentifier;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes7.dex */
public final class CardModule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardModule> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1328type;
    public final UseCase use_case;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        /* renamed from: type, reason: collision with root package name */
        public Object f1329type;
        public Object use_case;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CardModule((Type) this.f1329type, (UseCase) this.use_case, buildUnknownFields());
                case 1:
                    return new NearbyContext((NearbyContext.NearbyIntent) this.f1329type, (String) this.use_case, buildUnknownFields());
                case 2:
                    return new NearbySession((NearbyContext) this.f1329type, (BroadcasterProfileData) this.use_case, buildUnknownFields());
                case 3:
                    return new FailedCategoryPreferenceUpdate((String) this.f1329type, (CategoryPreferenceUpdate) this.use_case, buildUnknownFields());
                case 4:
                    return new NotificationCategoryExtraConfig((zzkb) this.f1329type, (NotificationCategoryExtraConfig.CategoryEligibility) this.use_case, buildUnknownFields());
                case 5:
                    return new NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus((String) this.f1329type, (NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus) this.use_case, buildUnknownFields());
                case 6:
                    return new CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration((Long) this.f1329type, (CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration.TimeUnit) this.use_case, buildUnknownFields());
                case 7:
                    return new GetEarningStreamsSummaryRequest((EarningsTimeFrame) this.f1329type, (EarningStreamIdentifier) this.use_case, buildUnknownFields());
                case 8:
                    return new PaychecksAugmentedActivityPageResponse((ActivityPageResponse) this.f1329type, (List) this.use_case, buildUnknownFields());
                case 9:
                    return new PayerUpdate((String) this.f1329type, (PayerOperation) this.use_case, buildUnknownFields());
                case 10:
                    return new SubmitSetPaycheckAllocationAmountRequest((RequestContext) this.f1329type, (SetPaycheckAllocationAmountInputs) this.use_case, buildUnknownFields());
                case 11:
                    return new SubmitSetPaycheckMultiAllocationRequest((RequestContext) this.f1329type, (zzkf) this.use_case, buildUnknownFields());
                case 12:
                    return new SubmitSetPaycheckMultiAllocationRequest.SubmitSingle((AllocationDistribution) this.f1329type, (Integer) this.use_case, buildUnknownFields());
                case 13:
                    return new UpdateEarnerModeResponse((EarnerModeStatus) this.f1329type, (ResponseContext) this.use_case, buildUnknownFields());
                case 14:
                    return new OonPaymentMethod((OonPaymentMethodType) this.f1329type, (zzkg) this.use_case, buildUnknownFields());
                case 15:
                    return new AuthorizationContext((AuthorizedPrincipal) this.f1329type, (AuthorizedRelationship) this.use_case, buildUnknownFields());
                case 16:
                    return new AdminSyncAuthzRelationshipPoliciesResponse((AdminSyncAuthzRelationshipPoliciesResponse.Status) this.f1329type, (String) this.use_case, buildUnknownFields());
                case 17:
                    return new CreatePoolResponse((CreatePoolResponse.FailureReason) this.f1329type, (MoneyPool) this.use_case, buildUnknownFields());
                case 18:
                    return new GetMoneyPoolPublicPreviewResponse((GetMoneyPoolPublicPreviewResponse.FailureReason) this.f1329type, (MoneyPool) this.use_case, buildUnknownFields());
                case 19:
                    return new GetPoolsAppletRequest((HighlightedPoolsSelectionMode) this.f1329type, (Integer) this.use_case, buildUnknownFields());
                case 20:
                    return new GetPoolsAppletResponse((List) this.f1329type, (PoolsAppletStats) this.use_case, buildUnknownFields());
                case 21:
                    return new LeaveMoneyPoolFlowParameters((String) this.f1329type, (MoneyPoolVisitOrigin) this.use_case, buildUnknownFields());
                case 22:
                    return new GetCustomerPrimaryDdaDetailsResponse((DdaAccountNumbers) this.f1329type, (ResponseContext) this.use_case, buildUnknownFields());
                case 23:
                    return new Button.Prominence((Button.Prominence.Type) this.f1329type, (Boolean) this.use_case, buildUnknownFields());
                case 24:
                    return new IssuedCardElement((Button) this.f1329type, (Button) this.use_case, buildUnknownFields());
                case 25:
                    return new Push((CardElementAction) this.f1329type, (LocalizedString) this.use_case, buildUnknownFields());
                case 26:
                    return new Toggle((CardElementAction) this.f1329type, (Boolean) this.use_case, buildUnknownFields());
                case 27:
                    return new GetCardDetailsResponse((CardDetails) this.f1329type, (ResponseContext) this.use_case, buildUnknownFields());
                case 28:
                    return new GetAvailableStatementsForStatementTypeRequest((String) this.f1329type, (StatementType) this.use_case, buildUnknownFields());
                default:
                    return new VerifyPasswordRequest((RequestContext) this.f1329type, (zzkp) this.use_case, buildUnknownFields());
            }
        }
    }

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final LocalizedString accessibility_text;
        public final CardElementAction card_element_action;
        public final Icon icon;
        public final Boolean is_disabled;
        public final Prominence prominence;
        public final LocalizedString text;

        public final class Prominence extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Prominence> CREATOR;
            public final Boolean is_destructive;

            /* renamed from: type, reason: collision with root package name */
            public final Type f1330type;

            public enum Type implements WireEnum {
                PROMINENCE_TYPE_UNSPECIFIED(0),
                STANDARD(1),
                PROMINENT(2),
                SUBTLE(3);

                public static final CardModule$Button$Prominence$Type$Companion$ADAPTER$1 ADAPTER;
                public static final TextSize.Companion Companion;
                public final int value;

                static {
                    Type type2 = PROMINENCE_TYPE_UNSPECIFIED;
                    Companion = new TextSize.Companion();
                    ADAPTER = new CardModule$Button$Prominence$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
                }

                Type(int i) {
                    this.value = i;
                }

                public static final Type fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return PROMINENCE_TYPE_UNSPECIFIED;
                    }
                    if (i == 1) {
                        return STANDARD;
                    }
                    if (i == 2) {
                        return PROMINENT;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return SUBTLE;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                TextSize.Companion companion = Type.Companion;
                CardModule$Button$Prominence$Companion$ADAPTER$1 cardModule$Button$Prominence$Companion$ADAPTER$1 = new CardModule$Button$Prominence$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Prominence.class), "type.googleapis.com/squareup.cash.postcard.CardModule.Button.Prominence", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$Button$Prominence$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$Button$Prominence$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prominence(Type type2, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.f1330type = type2;
                this.is_destructive = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Prominence)) {
                    return false;
                }
                Prominence prominence = (Prominence) obj;
                return Intrinsics.areEqual(unknownFields(), prominence.unknownFields()) && this.f1330type == prominence.f1330type && Intrinsics.areEqual(this.is_destructive, prominence.is_destructive);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Type type2 = this.f1330type;
                int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
                Boolean bool = this.is_destructive;
                int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(23);
                builder.f1329type = this.f1330type;
                builder.use_case = this.is_destructive;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Type type2 = this.f1330type;
                if (type2 != null) {
                    arrayList.add("type=" + type2);
                }
                Boolean bool = this.is_destructive;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_destructive=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Prominence{", "}", 0, null, null, 56);
            }
        }

        static {
            CardModule$Button$Companion$ADAPTER$1 cardModule$Button$Companion$ADAPTER$1 = new CardModule$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.postcard.CardModule.Button", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(Prominence prominence, CardElementAction cardElementAction, LocalizedString localizedString, LocalizedString localizedString2, Boolean bool, Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.prominence = prominence;
            this.card_element_action = cardElementAction;
            this.text = localizedString;
            this.accessibility_text = localizedString2;
            this.is_disabled = bool;
            this.icon = icon;
        }

        public static Button copy$default(Button button, Prominence prominence, CardElementAction cardElementAction, LocalizedString localizedString, LocalizedString localizedString2, Icon icon, ByteString byteString, int i) {
            if ((i & 1) != 0) {
                prominence = button.prominence;
            }
            Prominence prominence2 = prominence;
            if ((i & 2) != 0) {
                cardElementAction = button.card_element_action;
            }
            CardElementAction cardElementAction2 = cardElementAction;
            if ((i & 8) != 0) {
                localizedString2 = button.accessibility_text;
            }
            LocalizedString localizedString3 = localizedString2;
            Boolean bool = button.is_disabled;
            if ((i & 32) != 0) {
                icon = button.icon;
            }
            Icon icon2 = icon;
            if ((i & 64) != 0) {
                byteString = button.unknownFields();
            }
            ByteString byteString2 = byteString;
            button.getClass();
            byteString2.getClass();
            return new Button(prominence2, cardElementAction2, localizedString, localizedString3, bool, icon2, byteString2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.prominence, button.prominence) && Intrinsics.areEqual(this.card_element_action, button.card_element_action) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.accessibility_text, button.accessibility_text) && Intrinsics.areEqual(this.is_disabled, button.is_disabled) && Intrinsics.areEqual(this.icon, button.icon);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Prominence prominence = this.prominence;
            int hashCode2 = (hashCode + (prominence != null ? prominence.hashCode() : 0)) * 37;
            CardElementAction cardElementAction = this.card_element_action;
            int hashCode3 = (hashCode2 + (cardElementAction != null ? cardElementAction.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.text;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.accessibility_text;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Boolean bool = this.is_disabled;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Icon icon = this.icon;
            int hashCode7 = hashCode6 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ExpenseSlice.Builder builder = new ExpenseSlice.Builder(28);
            builder.requester = this.prominence;
            builder.responder = this.card_element_action;
            builder.amount = this.text;
            builder.status = this.accessibility_text;
            builder.slice_token = this.is_disabled;
            builder.action = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Prominence prominence = this.prominence;
            if (prominence != null) {
                arrayList.add("prominence=" + prominence);
            }
            CardElementAction cardElementAction = this.card_element_action;
            if (cardElementAction != null) {
                arrayList.add("card_element_action=" + cardElementAction);
            }
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.accessibility_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString2, arrayList);
            }
            Boolean bool = this.is_disabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    public final class CallToActionModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CallToActionModule> CREATOR;
        public final Button button;
        public final Image image;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            CardModule$CallToActionModule$Companion$ADAPTER$1 cardModule$CallToActionModule$Companion$ADAPTER$1 = new CardModule$CallToActionModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CallToActionModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CallToActionModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$CallToActionModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CallToActionModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallToActionModule(Image image, LocalizedString localizedString, LocalizedString localizedString2, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CallToActionModule)) {
                return false;
            }
            CallToActionModule callToActionModule = (CallToActionModule) obj;
            return Intrinsics.areEqual(unknownFields(), callToActionModule.unknownFields()) && Intrinsics.areEqual(this.image, callToActionModule.image) && Intrinsics.areEqual(this.title, callToActionModule.title) && Intrinsics.areEqual(this.subtitle, callToActionModule.subtitle) && Intrinsics.areEqual(this.button, callToActionModule.button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode5 = hashCode4 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Allowed.Builder builder = new Allowed.Builder(7);
            builder.card_encryption_data = this.image;
            builder.customer_token_hash_email = this.title;
            builder.device_metadata = this.subtitle;
            builder.success_screen = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CallToActionModule{", "}", 0, null, null, 56);
        }
    }

    public final class CardElementAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CardElementAction> CREATOR;

        /* renamed from: type, reason: collision with root package name */
        public final zzkk f1331type;

        public final class CopyCardNumber extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CopyCardNumber> CREATOR;

            static {
                CardModule$CardElementAction$CopyCardNumber$Companion$ADAPTER$1 cardModule$CardElementAction$CopyCardNumber$Companion$ADAPTER$1 = new CardModule$CardElementAction$CopyCardNumber$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CopyCardNumber.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CardElementAction.CopyCardNumber", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$CardElementAction$CopyCardNumber$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CardElementAction$CopyCardNumber$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CopyCardNumber(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof CopyCardNumber) && Intrinsics.areEqual(unknownFields(), ((CopyCardNumber) obj).unknownFields());
            }

            public final int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CopyCardNumber.Builder builder = new CopyCardNumber.Builder(24);
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                return "CopyCardNumber{}";
            }
        }

        public final class DoClientRoute extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DoClientRoute> CREATOR;
            public final String url;

            static {
                CardModule$CardElementAction$DoClientRoute$Companion$ADAPTER$1 cardModule$CardElementAction$DoClientRoute$Companion$ADAPTER$1 = new CardModule$CardElementAction$DoClientRoute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DoClientRoute.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CardElementAction.DoClientRoute", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$CardElementAction$DoClientRoute$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CardElementAction$DoClientRoute$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoClientRoute(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DoClientRoute)) {
                    return false;
                }
                DoClientRoute doClientRoute = (DoClientRoute) obj;
                return Intrinsics.areEqual(unknownFields(), doClientRoute.unknownFields()) && Intrinsics.areEqual(this.url, doClientRoute.url);
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
                ProfileDetails.Builder builder = new ProfileDetails.Builder(2);
                builder.bio = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DoClientRoute{", "}", 0, null, null, 56);
            }
        }

        public final class DoClientScenario extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DoClientScenario> CREATOR;
            public final ClientScenario client_scenario;

            static {
                CardModule$CardElementAction$DoClientScenario$Companion$ADAPTER$1 cardModule$CardElementAction$DoClientScenario$Companion$ADAPTER$1 = new CardModule$CardElementAction$DoClientScenario$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DoClientScenario.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CardElementAction.DoClientScenario", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$CardElementAction$DoClientScenario$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CardElementAction$DoClientScenario$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoClientScenario(ClientScenario clientScenario, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.client_scenario = clientScenario;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DoClientScenario)) {
                    return false;
                }
                DoClientScenario doClientScenario = (DoClientScenario) obj;
                return Intrinsics.areEqual(unknownFields(), doClientScenario.unknownFields()) && this.client_scenario == doClientScenario.client_scenario;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                ClientScenario clientScenario = this.client_scenario;
                int hashCode2 = hashCode + (clientScenario != null ? clientScenario.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(5);
                builder.pool_lifecycle_filter = this.client_scenario;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                ClientScenario clientScenario = this.client_scenario;
                if (clientScenario != null) {
                    Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DoClientScenario{", "}", 0, null, null, 56);
            }
        }

        public final class OpenDialog extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OpenDialog> CREATOR;
            public final LocalizedString main_text;
            public final OpenDialogButton primary_button;
            public final OpenDialogButton secondary_button;
            public final LocalizedString title_text;

            public final class OpenDialogButton extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<OpenDialogButton> CREATOR;
                public final String client_route;
                public final Boolean is_destructive;
                public final LocalizedString text;

                static {
                    CardModule$CardElementAction$OpenDialog$OpenDialogButton$Companion$ADAPTER$1 cardModule$CardElementAction$OpenDialog$OpenDialogButton$Companion$ADAPTER$1 = new CardModule$CardElementAction$OpenDialog$OpenDialogButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenDialogButton.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CardElementAction.OpenDialog.OpenDialogButton", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                    ADAPTER = cardModule$CardElementAction$OpenDialog$OpenDialogButton$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CardElementAction$OpenDialog$OpenDialogButton$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OpenDialogButton(LocalizedString localizedString, Boolean bool, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.text = localizedString;
                    this.is_destructive = bool;
                    this.client_route = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof OpenDialogButton)) {
                        return false;
                    }
                    OpenDialogButton openDialogButton = (OpenDialogButton) obj;
                    return Intrinsics.areEqual(unknownFields(), openDialogButton.unknownFields()) && Intrinsics.areEqual(this.text, openDialogButton.text) && Intrinsics.areEqual(this.is_destructive, openDialogButton.is_destructive) && Intrinsics.areEqual(this.client_route, openDialogButton.client_route);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.text;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    Boolean bool = this.is_destructive;
                    int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                    String str = this.client_route;
                    int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    CardSpendingInsightsHome.EntryPoint.Builder builder = new CardSpendingInsightsHome.EntryPoint.Builder(1);
                    builder.preview_text = this.text;
                    builder.visible = this.is_destructive;
                    builder.client_route = this.client_route;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.text;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                    }
                    Boolean bool = this.is_destructive;
                    if (bool != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("is_destructive=", bool, arrayList);
                    }
                    String str = this.client_route;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "OpenDialogButton{", "}", 0, null, null, 56);
                }
            }

            static {
                CardModule$CardElementAction$OpenDialog$Companion$ADAPTER$1 cardModule$CardElementAction$OpenDialog$Companion$ADAPTER$1 = new CardModule$CardElementAction$OpenDialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenDialog.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CardElementAction.OpenDialog", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$CardElementAction$OpenDialog$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CardElementAction$OpenDialog$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenDialog(LocalizedString localizedString, LocalizedString localizedString2, OpenDialogButton openDialogButton, OpenDialogButton openDialogButton2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title_text = localizedString;
                this.main_text = localizedString2;
                this.primary_button = openDialogButton;
                this.secondary_button = openDialogButton2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OpenDialog)) {
                    return false;
                }
                OpenDialog openDialog = (OpenDialog) obj;
                return Intrinsics.areEqual(unknownFields(), openDialog.unknownFields()) && Intrinsics.areEqual(this.title_text, openDialog.title_text) && Intrinsics.areEqual(this.main_text, openDialog.main_text) && Intrinsics.areEqual(this.primary_button, openDialog.primary_button) && Intrinsics.areEqual(this.secondary_button, openDialog.secondary_button);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.main_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                OpenDialogButton openDialogButton = this.primary_button;
                int hashCode4 = (hashCode3 + (openDialogButton != null ? openDialogButton.hashCode() : 0)) * 37;
                OpenDialogButton openDialogButton2 = this.secondary_button;
                int hashCode5 = hashCode4 + (openDialogButton2 != null ? openDialogButton2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Allowed.Builder builder = new Allowed.Builder(8);
                builder.card_encryption_data = this.title_text;
                builder.customer_token_hash_email = this.main_text;
                builder.device_metadata = this.primary_button;
                builder.success_screen = this.secondary_button;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.main_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("main_text=", localizedString2, arrayList);
                }
                OpenDialogButton openDialogButton = this.primary_button;
                if (openDialogButton != null) {
                    arrayList.add("primary_button=" + openDialogButton);
                }
                OpenDialogButton openDialogButton2 = this.secondary_button;
                if (openDialogButton2 != null) {
                    arrayList.add("secondary_button=" + openDialogButton2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OpenDialog{", "}", 0, null, null, 56);
            }
        }

        static {
            CardModule$CardElementAction$Companion$ADAPTER$1 cardModule$CardElementAction$Companion$ADAPTER$1 = new CardModule$CardElementAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardElementAction.class), "type.googleapis.com/squareup.cash.postcard.CardModule.CardElementAction", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$CardElementAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$CardElementAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardElementAction(zzkk zzkkVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1331type = zzkkVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CardElementAction)) {
                return false;
            }
            CardElementAction cardElementAction = (CardElementAction) obj;
            return Intrinsics.areEqual(unknownFields(), cardElementAction.unknownFields()) && Intrinsics.areEqual(this.f1331type, cardElementAction.f1331type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzkk zzkkVar = this.f1331type;
            int hashCode2 = hashCode + (zzkkVar != null ? zzkkVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(4);
            builder.pool_lifecycle_filter = this.f1331type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzkk zzkkVar = this.f1331type;
            if (zzkkVar != null) {
                arrayList.add("type=" + zzkkVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CardElementAction{", "}", 0, null, null, 56);
        }
    }

    public final class DeliveryStatusElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeliveryStatusElement> CREATOR;
        public final LocalizedString accessibility_text;
        public final Button button;
        public final LocalizedString info_text;
        public final LocalizedString main_text;
        public final Prominence prominence;
        public final Button secondary_button;

        public enum Prominence implements WireEnum {
            PROMINENCE_TYPE_UNSPECIFIED(0),
            PROMINENT(1),
            SUBTLE(2);

            public static final CardModule$DeliveryStatusElement$Prominence$Companion$ADAPTER$1 ADAPTER;
            public static final TransactionType.Companion Companion;
            public final int value;

            static {
                Prominence prominence = PROMINENCE_TYPE_UNSPECIFIED;
                Companion = new TransactionType.Companion();
                ADAPTER = new CardModule$DeliveryStatusElement$Prominence$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Prominence.class), Syntax.PROTO_2, prominence);
            }

            Prominence(int i) {
                this.value = i;
            }

            public static final Prominence fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return PROMINENCE_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return PROMINENT;
                }
                if (i != 2) {
                    return null;
                }
                return SUBTLE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            TransactionType.Companion companion = Prominence.Companion;
            CardModule$DeliveryStatusElement$Companion$ADAPTER$1 cardModule$DeliveryStatusElement$Companion$ADAPTER$1 = new CardModule$DeliveryStatusElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeliveryStatusElement.class), "type.googleapis.com/squareup.cash.postcard.CardModule.DeliveryStatusElement", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$DeliveryStatusElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$DeliveryStatusElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeliveryStatusElement(LocalizedString localizedString, LocalizedString localizedString2, Button button, Prominence prominence, LocalizedString localizedString3, Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.main_text = localizedString;
            this.info_text = localizedString2;
            this.button = button;
            this.prominence = prominence;
            this.accessibility_text = localizedString3;
            this.secondary_button = button2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeliveryStatusElement)) {
                return false;
            }
            DeliveryStatusElement deliveryStatusElement = (DeliveryStatusElement) obj;
            return Intrinsics.areEqual(unknownFields(), deliveryStatusElement.unknownFields()) && Intrinsics.areEqual(this.main_text, deliveryStatusElement.main_text) && Intrinsics.areEqual(this.info_text, deliveryStatusElement.info_text) && Intrinsics.areEqual(this.button, deliveryStatusElement.button) && this.prominence == deliveryStatusElement.prominence && Intrinsics.areEqual(this.accessibility_text, deliveryStatusElement.accessibility_text) && Intrinsics.areEqual(this.secondary_button, deliveryStatusElement.secondary_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.main_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.info_text;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
            Prominence prominence = this.prominence;
            int hashCode5 = (hashCode4 + (prominence != null ? prominence.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.accessibility_text;
            int hashCode6 = (hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode7 = hashCode6 + (button2 != null ? button2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ExpenseSlice.Builder builder = new ExpenseSlice.Builder(29);
            builder.requester = this.main_text;
            builder.responder = this.info_text;
            builder.amount = this.button;
            builder.status = this.prominence;
            builder.slice_token = this.accessibility_text;
            builder.action = this.secondary_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.main_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("main_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.info_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("info_text=", localizedString2, arrayList);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            Prominence prominence = this.prominence;
            if (prominence != null) {
                arrayList.add("prominence=" + prominence);
            }
            LocalizedString localizedString3 = this.accessibility_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString3, arrayList);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeliveryStatusElement{", "}", 0, null, null, 56);
        }
    }

    public final class DeliveryStatusModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DeliveryStatusModule> CREATOR;
        public final List elements;
        public final LocalizedString title;

        static {
            CardModule$DeliveryStatusModule$Companion$ADAPTER$1 cardModule$DeliveryStatusModule$Companion$ADAPTER$1 = new CardModule$DeliveryStatusModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DeliveryStatusModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.DeliveryStatusModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$DeliveryStatusModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$DeliveryStatusModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeliveryStatusModule(LocalizedString localizedString, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeliveryStatusModule)) {
                return false;
            }
            DeliveryStatusModule deliveryStatusModule = (DeliveryStatusModule) obj;
            return Intrinsics.areEqual(unknownFields(), deliveryStatusModule.unknownFields()) && Intrinsics.areEqual(this.title, deliveryStatusModule.title) && Intrinsics.areEqual(this.elements, deliveryStatusModule.elements);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = this.elements.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(6);
            builder.title = this.title;
            builder.lines = this.elements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            List list = this.elements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DeliveryStatusModule{", "}", 0, null, null, 56);
        }
    }

    public final class DividerModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DividerModule> CREATOR;

        static {
            CardModule$DividerModule$Companion$ADAPTER$1 cardModule$DividerModule$Companion$ADAPTER$1 = new CardModule$DividerModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DividerModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.DividerModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$DividerModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$DividerModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DividerModule(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof DividerModule) && Intrinsics.areEqual(unknownFields(), ((DividerModule) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CopyCardNumber.Builder builder = new CopyCardNumber.Builder(25);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "DividerModule{}";
        }
    }

    public final class HeaderModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeaderModule> CREATOR;
        public final LocalizedString title;

        static {
            CardModule$HeaderModule$Companion$ADAPTER$1 cardModule$HeaderModule$Companion$ADAPTER$1 = new CardModule$HeaderModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeaderModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeaderModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$HeaderModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeaderModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderModule(LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeaderModule)) {
                return false;
            }
            HeaderModule headerModule = (HeaderModule) obj;
            return Intrinsics.areEqual(unknownFields(), headerModule.unknownFields()) && Intrinsics.areEqual(this.title, headerModule.title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(6);
            builder.yield_current_rate_enhanced = this.title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderModule{", "}", 0, null, null, 56);
        }
    }

    public final class HeroIssuedCardModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeroIssuedCardModule> CREATOR;
        public final CardRenderingInfo card_rendering_info;
        public final IssuedCardElement element;
        public final CardElementAction on_rotate_to_back;

        static {
            CardModule$HeroIssuedCardModule$Companion$ADAPTER$1 cardModule$HeroIssuedCardModule$Companion$ADAPTER$1 = new CardModule$HeroIssuedCardModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroIssuedCardModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroIssuedCardModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$HeroIssuedCardModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroIssuedCardModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroIssuedCardModule(IssuedCardElement issuedCardElement, CardRenderingInfo cardRenderingInfo, CardElementAction cardElementAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = issuedCardElement;
            this.card_rendering_info = cardRenderingInfo;
            this.on_rotate_to_back = cardElementAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeroIssuedCardModule)) {
                return false;
            }
            HeroIssuedCardModule heroIssuedCardModule = (HeroIssuedCardModule) obj;
            return Intrinsics.areEqual(unknownFields(), heroIssuedCardModule.unknownFields()) && Intrinsics.areEqual(this.element, heroIssuedCardModule.element) && Intrinsics.areEqual(this.card_rendering_info, heroIssuedCardModule.card_rendering_info) && Intrinsics.areEqual(this.on_rotate_to_back, heroIssuedCardModule.on_rotate_to_back);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            IssuedCardElement issuedCardElement = this.element;
            int hashCode2 = (hashCode + (issuedCardElement != null ? issuedCardElement.hashCode() : 0)) * 37;
            CardRenderingInfo cardRenderingInfo = this.card_rendering_info;
            int hashCode3 = (hashCode2 + (cardRenderingInfo != null ? cardRenderingInfo.hashCode() : 0)) * 37;
            CardElementAction cardElementAction = this.on_rotate_to_back;
            int hashCode4 = hashCode3 + (cardElementAction != null ? cardElementAction.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardScheme.Builder builder = new CardScheme.Builder(8);
            builder.modules = this.element;
            builder.overflow_modules = this.card_rendering_info;
            builder.card_home_actions = this.on_rotate_to_back;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            IssuedCardElement issuedCardElement = this.element;
            if (issuedCardElement != null) {
                arrayList.add("element=" + issuedCardElement);
            }
            CardRenderingInfo cardRenderingInfo = this.card_rendering_info;
            if (cardRenderingInfo != null) {
                arrayList.add("card_rendering_info=" + cardRenderingInfo);
            }
            CardElementAction cardElementAction = this.on_rotate_to_back;
            if (cardElementAction != null) {
                arrayList.add("on_rotate_to_back=" + cardElementAction);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeroIssuedCardModule{", "}", 0, null, null, 56);
        }
    }

    public final class HeroNullStateModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeroNullStateModule> CREATOR;
        public final CardModule$HeroNullStateModule$Nux$UhchNux nux;

        public final class UnifiedCardHomeNUX extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<UnifiedCardHomeNUX> CREATOR;
            public final Content content;
            public final GridConfig grid_config;
            public final Content grid_content;
            public final List rotating_card_theme_tokens;
            public final UpsellCard upsell_card;

            public final class Content extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Content> CREATOR;
                public final ListUnordered benefits_list;
                public final LocalizedString body;
                public final List booklet_tiles;
                public final GreenContent green_content;
                public final ParentAsKidContent parent_as_kid_content;
                public final Button primary_button;
                public final Button secondary_button;
                public final Boolean show_disclosures;
                public final LocalizedString title;

                public final class GreenContent extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<GreenContent> CREATOR;
                    public final ListUnordered benefits_list;
                    public final List booklet_tiles;
                    public final LocalizedString title;

                    static {
                        CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$GreenContent$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$GreenContent$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$GreenContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GreenContent.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.GreenContent", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                        ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$GreenContent$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$GreenContent$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public GreenContent(LocalizedString localizedString, ListUnordered listUnordered, List list, ByteString byteString) {
                        super(ADAPTER, byteString);
                        list.getClass();
                        byteString.getClass();
                        this.title = localizedString;
                        this.benefits_list = listUnordered;
                        this.booklet_tiles = TransactorKt.immutableCopyOf("booklet_tiles", list);
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof GreenContent)) {
                            return false;
                        }
                        GreenContent greenContent = (GreenContent) obj;
                        return Intrinsics.areEqual(unknownFields(), greenContent.unknownFields()) && Intrinsics.areEqual(this.title, greenContent.title) && Intrinsics.areEqual(this.benefits_list, greenContent.benefits_list) && Intrinsics.areEqual(this.booklet_tiles, greenContent.booklet_tiles);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalizedString localizedString = this.title;
                        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                        ListUnordered listUnordered = this.benefits_list;
                        int hashCode3 = this.booklet_tiles.hashCode() + ((hashCode2 + (listUnordered != null ? listUnordered.hashCode() : 0)) * 37);
                        this.hashCode = hashCode3;
                        return hashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        CardScheme.Builder builder = new CardScheme.Builder(9);
                        builder.overflow_modules = this.title;
                        builder.card_home_actions = this.benefits_list;
                        builder.modules = this.booklet_tiles;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalizedString localizedString = this.title;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                        }
                        ListUnordered listUnordered = this.benefits_list;
                        if (listUnordered != null) {
                            arrayList.add("benefits_list=" + listUnordered);
                        }
                        List list = this.booklet_tiles;
                        if (!list.isEmpty()) {
                            re$$ExternalSyntheticOutline0.m("booklet_tiles=", arrayList, list);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "GreenContent{", "}", 0, null, null, 56);
                    }
                }

                public final class ParentAsKidContent extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<ParentAsKidContent> CREATOR;
                    public final ListUnordered benefits_list;
                    public final LocalizedString body;
                    public final List booklet_tiles;
                    public final Button primary_button;
                    public final LocalizedString title;

                    static {
                        CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$ParentAsKidContent$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$ParentAsKidContent$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$ParentAsKidContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ParentAsKidContent.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                        ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$ParentAsKidContent$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$ParentAsKidContent$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ParentAsKidContent(LocalizedString localizedString, ListUnordered listUnordered, List list, LocalizedString localizedString2, Button button, ByteString byteString) {
                        super(ADAPTER, byteString);
                        list.getClass();
                        byteString.getClass();
                        this.title = localizedString;
                        this.benefits_list = listUnordered;
                        this.body = localizedString2;
                        this.primary_button = button;
                        this.booklet_tiles = TransactorKt.immutableCopyOf("booklet_tiles", list);
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ParentAsKidContent)) {
                            return false;
                        }
                        ParentAsKidContent parentAsKidContent = (ParentAsKidContent) obj;
                        return Intrinsics.areEqual(unknownFields(), parentAsKidContent.unknownFields()) && Intrinsics.areEqual(this.title, parentAsKidContent.title) && Intrinsics.areEqual(this.benefits_list, parentAsKidContent.benefits_list) && Intrinsics.areEqual(this.booklet_tiles, parentAsKidContent.booklet_tiles) && Intrinsics.areEqual(this.body, parentAsKidContent.body) && Intrinsics.areEqual(this.primary_button, parentAsKidContent.primary_button);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        LocalizedString localizedString = this.title;
                        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                        ListUnordered listUnordered = this.benefits_list;
                        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (listUnordered != null ? listUnordered.hashCode() : 0)) * 37, 37, this.booklet_tiles);
                        LocalizedString localizedString2 = this.body;
                        int hashCode3 = (m + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                        Button button = this.primary_button;
                        int hashCode4 = hashCode3 + (button != null ? button.hashCode() : 0);
                        this.hashCode = hashCode4;
                        return hashCode4;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        DateTime.Builder builder = new DateTime.Builder(9, false);
                        builder.instant_usec = this.title;
                        builder.ordinal = this.benefits_list;
                        builder.tz_name = this.booklet_tiles;
                        builder.timezone_offset_min = this.body;
                        builder.posix_tz = this.primary_button;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        LocalizedString localizedString = this.title;
                        if (localizedString != null) {
                            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                        }
                        ListUnordered listUnordered = this.benefits_list;
                        if (listUnordered != null) {
                            arrayList.add("benefits_list=" + listUnordered);
                        }
                        List list = this.booklet_tiles;
                        if (!list.isEmpty()) {
                            re$$ExternalSyntheticOutline0.m("booklet_tiles=", arrayList, list);
                        }
                        LocalizedString localizedString2 = this.body;
                        if (localizedString2 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                        }
                        Button button = this.primary_button;
                        if (button != null) {
                            arrayList.add("primary_button=" + button);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "ParentAsKidContent{", "}", 0, null, null, 56);
                    }
                }

                static {
                    CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Content.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                    ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Content$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Content(LocalizedString localizedString, LocalizedString localizedString2, Button button, Button button2, List list, ListUnordered listUnordered, Boolean bool, GreenContent greenContent, ParentAsKidContent parentAsKidContent, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.title = localizedString;
                    this.body = localizedString2;
                    this.primary_button = button;
                    this.secondary_button = button2;
                    this.benefits_list = listUnordered;
                    this.show_disclosures = bool;
                    this.green_content = greenContent;
                    this.parent_as_kid_content = parentAsKidContent;
                    this.booklet_tiles = TransactorKt.immutableCopyOf("booklet_tiles", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Content)) {
                        return false;
                    }
                    Content content = (Content) obj;
                    return Intrinsics.areEqual(unknownFields(), content.unknownFields()) && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.body, content.body) && Intrinsics.areEqual(this.primary_button, content.primary_button) && Intrinsics.areEqual(this.secondary_button, content.secondary_button) && Intrinsics.areEqual(this.booklet_tiles, content.booklet_tiles) && Intrinsics.areEqual(this.benefits_list, content.benefits_list) && Intrinsics.areEqual(this.show_disclosures, content.show_disclosures) && Intrinsics.areEqual(this.green_content, content.green_content) && Intrinsics.areEqual(this.parent_as_kid_content, content.parent_as_kid_content);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.title;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.body;
                    int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    Button button = this.primary_button;
                    int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
                    Button button2 = this.secondary_button;
                    int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (button2 != null ? button2.hashCode() : 0)) * 37, 37, this.booklet_tiles);
                    ListUnordered listUnordered = this.benefits_list;
                    int hashCode5 = (m + (listUnordered != null ? listUnordered.hashCode() : 0)) * 37;
                    Boolean bool = this.show_disclosures;
                    int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                    GreenContent greenContent = this.green_content;
                    int hashCode7 = (hashCode6 + (greenContent != null ? greenContent.hashCode() : 0)) * 37;
                    ParentAsKidContent parentAsKidContent = this.parent_as_kid_content;
                    int hashCode8 = hashCode7 + (parentAsKidContent != null ? parentAsKidContent.hashCode() : 0);
                    this.hashCode = hashCode8;
                    return hashCode8;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(29, false);
                    builder.title = this.title;
                    builder.info_rows_header = this.body;
                    builder.locale = this.primary_button;
                    builder.footer_text = this.secondary_button;
                    builder.info_rows = this.booklet_tiles;
                    builder.loadable_subtitle = this.benefits_list;
                    builder.primary_footer_button_state = this.show_disclosures;
                    builder.secondary_footer_button_state = this.green_content;
                    builder.payment_plans_data = this.parent_as_kid_content;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.title;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.body;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                    }
                    Button button = this.primary_button;
                    if (button != null) {
                        arrayList.add("primary_button=" + button);
                    }
                    Button button2 = this.secondary_button;
                    if (button2 != null) {
                        arrayList.add("secondary_button=" + button2);
                    }
                    List list = this.booklet_tiles;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("booklet_tiles=", arrayList, list);
                    }
                    ListUnordered listUnordered = this.benefits_list;
                    if (listUnordered != null) {
                        arrayList.add("benefits_list=" + listUnordered);
                    }
                    Boolean bool = this.show_disclosures;
                    if (bool != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("show_disclosures=", bool, arrayList);
                    }
                    GreenContent greenContent = this.green_content;
                    if (greenContent != null) {
                        arrayList.add("green_content=" + greenContent);
                    }
                    ParentAsKidContent parentAsKidContent = this.parent_as_kid_content;
                    if (parentAsKidContent != null) {
                        arrayList.add("parent_as_kid_content=" + parentAsKidContent);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Content{", "}", 0, null, null, 56);
                }
            }

            public final class GridConfig extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<GridConfig> CREATOR;
                public final List items;

                public final class GridItem extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<GridItem> CREATOR;

                    /* renamed from: type, reason: collision with root package name */
                    public final zzkl f1332type;

                    public final class Card extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<Card> CREATOR;
                        public final String card_theme_id;
                        public final String skin_id;

                        static {
                            CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Card$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Card$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem.Card", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                            ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Card$Companion$ADAPTER$1;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Card$Companion$ADAPTER$1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public Card(String str, String str2, ByteString byteString) {
                            super(ADAPTER, byteString);
                            byteString.getClass();
                            this.card_theme_id = str;
                            this.skin_id = str2;
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (!(obj instanceof Card)) {
                                return false;
                            }
                            Card card = (Card) obj;
                            return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.card_theme_id, card.card_theme_id) && Intrinsics.areEqual(this.skin_id, card.skin_id);
                        }

                        public final int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int hashCode = unknownFields().hashCode() * 37;
                            String str = this.card_theme_id;
                            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                            String str2 = this.skin_id;
                            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                            this.hashCode = hashCode3;
                            return hashCode3;
                        }

                        @Override // com.squareup.wire.Message
                        public final Message.Builder newBuilder() {
                            Header.Builder builder = new Header.Builder(11);
                            builder.name = this.card_theme_id;
                            builder.value = this.skin_id;
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public final String toString() {
                            ArrayList arrayList = new ArrayList();
                            String str = this.card_theme_id;
                            if (str != null) {
                                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_theme_id=", arrayList);
                            }
                            String str2 = this.skin_id;
                            if (str2 != null) {
                                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "skin_id=", arrayList);
                            }
                            return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
                        }
                    }

                    public enum Tag implements WireEnum {
                        TAG_UNSPECIFIED(0),
                        WAND(1);

                        public static final CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Tag$Companion$ADAPTER$1 ADAPTER;
                        public static final ActionType.Companion Companion;
                        public final int value;

                        static {
                            Tag tag = TAG_UNSPECIFIED;
                            Companion = new ActionType.Companion();
                            ADAPTER = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Tag$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Tag.class), Syntax.PROTO_2, tag);
                        }

                        Tag(int i) {
                            this.value = i;
                        }

                        public static final Tag fromValue(int i) {
                            Companion.getClass();
                            if (i == 0) {
                                return TAG_UNSPECIFIED;
                            }
                            if (i != 1) {
                                return null;
                            }
                            return WAND;
                        }

                        @Override // com.squareup.wire.WireEnum
                        public final int getValue() {
                            return this.value;
                        }
                    }

                    static {
                        CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GridItem.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig.GridItem", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                        ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$GridItem$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public GridItem(zzkl zzklVar, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.f1332type = zzklVar;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof GridItem)) {
                            return false;
                        }
                        GridItem gridItem = (GridItem) obj;
                        return Intrinsics.areEqual(unknownFields(), gridItem.unknownFields()) && Intrinsics.areEqual(this.f1332type, gridItem.f1332type);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        zzkl zzklVar = this.f1332type;
                        int hashCode2 = hashCode + (zzklVar != null ? zzklVar.hashCode() : 0);
                        this.hashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(7);
                        builder.pool_lifecycle_filter = this.f1332type;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        zzkl zzklVar = this.f1332type;
                        if (zzklVar != null) {
                            arrayList.add("type=" + zzklVar);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "GridItem{", "}", 0, null, null, 56);
                    }
                }

                static {
                    CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GridConfig.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.GridConfig", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                    ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$GridConfig$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GridConfig(List list, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.items = TransactorKt.immutableCopyOf("items", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof GridConfig)) {
                        return false;
                    }
                    GridConfig gridConfig = (GridConfig) obj;
                    return Intrinsics.areEqual(unknownFields(), gridConfig.unknownFields()) && Intrinsics.areEqual(this.items, gridConfig.items);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
                    this.hashCode = hashCode;
                    return hashCode;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(13, false);
                    builder.pools = this.items;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    List list = this.items;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "GridConfig{", "}", 0, null, null, 56);
                }
            }

            public final class UpsellCard extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<UpsellCard> CREATOR;
                public final String card_theme_token;

                static {
                    CardModule$HeroNullStateModule$UnifiedCardHomeNUX$UpsellCard$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$UpsellCard$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$UpsellCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsellCard.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                    ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$UpsellCard$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$UpsellCard$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UpsellCard(String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.card_theme_token = str;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof UpsellCard)) {
                        return false;
                    }
                    UpsellCard upsellCard = (UpsellCard) obj;
                    return Intrinsics.areEqual(unknownFields(), upsellCard.unknownFields()) && Intrinsics.areEqual(this.card_theme_token, upsellCard.card_theme_token);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.card_theme_token;
                    int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ProfileDetails.Builder builder = new ProfileDetails.Builder(3);
                    builder.bio = this.card_theme_token;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.card_theme_token;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "card_theme_token=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellCard{", "}", 0, null, null, 56);
                }
            }

            static {
                CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Companion$ADAPTER$1 cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$UnifiedCardHomeNUX$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnifiedCardHomeNUX.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule.UnifiedCardHomeNUX", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$UnifiedCardHomeNUX$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnifiedCardHomeNUX(UpsellCard upsellCard, Content content, List list, GridConfig gridConfig, Content content2, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.upsell_card = upsellCard;
                this.content = content;
                this.grid_config = gridConfig;
                this.grid_content = content2;
                this.rotating_card_theme_tokens = TransactorKt.immutableCopyOf("rotating_card_theme_tokens", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UnifiedCardHomeNUX)) {
                    return false;
                }
                UnifiedCardHomeNUX unifiedCardHomeNUX = (UnifiedCardHomeNUX) obj;
                return Intrinsics.areEqual(unknownFields(), unifiedCardHomeNUX.unknownFields()) && Intrinsics.areEqual(this.upsell_card, unifiedCardHomeNUX.upsell_card) && Intrinsics.areEqual(this.content, unifiedCardHomeNUX.content) && Intrinsics.areEqual(this.rotating_card_theme_tokens, unifiedCardHomeNUX.rotating_card_theme_tokens) && Intrinsics.areEqual(this.grid_config, unifiedCardHomeNUX.grid_config) && Intrinsics.areEqual(this.grid_content, unifiedCardHomeNUX.grid_content);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                UpsellCard upsellCard = this.upsell_card;
                int hashCode2 = (hashCode + (upsellCard != null ? upsellCard.hashCode() : 0)) * 37;
                Content content = this.content;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (content != null ? content.hashCode() : 0)) * 37, 37, this.rotating_card_theme_tokens);
                GridConfig gridConfig = this.grid_config;
                int hashCode3 = (m + (gridConfig != null ? gridConfig.hashCode() : 0)) * 37;
                Content content2 = this.grid_content;
                int hashCode4 = hashCode3 + (content2 != null ? content2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                DateTime.Builder builder = new DateTime.Builder(8, false);
                builder.instant_usec = this.upsell_card;
                builder.ordinal = this.content;
                builder.tz_name = this.rotating_card_theme_tokens;
                builder.timezone_offset_min = this.grid_config;
                builder.posix_tz = this.grid_content;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                UpsellCard upsellCard = this.upsell_card;
                if (upsellCard != null) {
                    arrayList.add("upsell_card=" + upsellCard);
                }
                Content content = this.content;
                if (content != null) {
                    arrayList.add("content=" + content);
                }
                List list = this.rotating_card_theme_tokens;
                if (!list.isEmpty()) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("rotating_card_theme_tokens=", arrayList, list);
                }
                GridConfig gridConfig = this.grid_config;
                if (gridConfig != null) {
                    arrayList.add("grid_config=" + gridConfig);
                }
                Content content2 = this.grid_content;
                if (content2 != null) {
                    arrayList.add("grid_content=" + content2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UnifiedCardHomeNUX{", "}", 0, null, null, 56);
            }
        }

        static {
            CardModule$HeroNullStateModule$Companion$ADAPTER$1 cardModule$HeroNullStateModule$Companion$ADAPTER$1 = new CardModule$HeroNullStateModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroNullStateModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.HeroNullStateModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$HeroNullStateModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$HeroNullStateModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroNullStateModule(CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.nux = cardModule$HeroNullStateModule$Nux$UhchNux;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeroNullStateModule)) {
                return false;
            }
            HeroNullStateModule heroNullStateModule = (HeroNullStateModule) obj;
            return Intrinsics.areEqual(unknownFields(), heroNullStateModule.unknownFields()) && Intrinsics.areEqual(this.nux, heroNullStateModule.nux);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = this.nux;
            int hashCode2 = hashCode + (cardModule$HeroNullStateModule$Nux$UhchNux != null ? cardModule$HeroNullStateModule$Nux$UhchNux.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(6);
            builder.pool_lifecycle_filter = this.nux;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = this.nux;
            if (cardModule$HeroNullStateModule$Nux$UhchNux != null) {
                arrayList.add("nux=" + cardModule$HeroNullStateModule$Nux$UhchNux);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeroNullStateModule{", "}", 0, null, null, 56);
        }
    }

    public enum InformationSource implements WireEnum {
        INFORMATION_SOURCE_UNSPECIFIED(0),
        GENERIC(1),
        GIFT_CARDS(2),
        OFFERS(3),
        OVERDRAFT(4),
        ROUND_UPS(5),
        SPENDING_INSIGHTS(6),
        MERCHANT_BLOCKING(7),
        DIGITAL_WALLET(8),
        AFTERPAY(9),
        PREPURCHASE_CASH_CARD(10),
        ACTIVATE_TAG(11),
        SECURITY_RESOURCES(12),
        CASH_APP_TAG(13),
        CASH_LITE_DIGITAL_WALLET(14),
        BILLS_AND_SUBSCRIPTIONS(15);

        public static final CardModule$InformationSource$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            InformationSource informationSource = INFORMATION_SOURCE_UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new CardModule$InformationSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InformationSource.class), Syntax.PROTO_2, informationSource);
        }

        InformationSource(int i) {
            this.value = i;
        }

        public static final InformationSource fromValue(int i) {
            Companion.getClass();
            return PoolVisibility.Companion.m3913fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class IssuedCardElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IssuedCardElement> CREATOR;
        public final Button left_button;
        public final Button right_button;

        static {
            CardModule$IssuedCardElement$Companion$ADAPTER$1 cardModule$IssuedCardElement$Companion$ADAPTER$1 = new CardModule$IssuedCardElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IssuedCardElement.class), "type.googleapis.com/squareup.cash.postcard.CardModule.IssuedCardElement", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$IssuedCardElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$IssuedCardElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IssuedCardElement(Button button, Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.left_button = button;
            this.right_button = button2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IssuedCardElement)) {
                return false;
            }
            IssuedCardElement issuedCardElement = (IssuedCardElement) obj;
            return Intrinsics.areEqual(unknownFields(), issuedCardElement.unknownFields()) && Intrinsics.areEqual(this.left_button, issuedCardElement.left_button) && Intrinsics.areEqual(this.right_button, issuedCardElement.right_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Button button = this.left_button;
            int hashCode2 = (hashCode + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.right_button;
            int hashCode3 = hashCode2 + (button2 != null ? button2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(24);
            builder.f1329type = this.left_button;
            builder.use_case = this.right_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Button button = this.left_button;
            if (button != null) {
                arrayList.add("left_button=" + button);
            }
            Button button2 = this.right_button;
            if (button2 != null) {
                arrayList.add("right_button=" + button2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IssuedCardElement{", "}", 0, null, null, 56);
        }
    }

    public final class LineItemElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItemElement> CREATOR;
        public final LocalizedString accessibility_text;
        public final Icon icon;
        public final String icon_token;
        public final Boolean is_disabled;
        public final LocalizedString main_text;
        public final Push push;
        public final InformationSource source;

        static {
            CardModule$LineItemElement$Companion$ADAPTER$1 cardModule$LineItemElement$Companion$ADAPTER$1 = new CardModule$LineItemElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineItemElement.class), "type.googleapis.com/squareup.cash.postcard.CardModule.LineItemElement", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$LineItemElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$LineItemElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItemElement(InformationSource informationSource, String str, Push push, LocalizedString localizedString, Icon icon, LocalizedString localizedString2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.source = informationSource;
            this.icon_token = str;
            this.push = push;
            this.main_text = localizedString;
            this.icon = icon;
            this.accessibility_text = localizedString2;
            this.is_disabled = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineItemElement)) {
                return false;
            }
            LineItemElement lineItemElement = (LineItemElement) obj;
            return Intrinsics.areEqual(unknownFields(), lineItemElement.unknownFields()) && this.source == lineItemElement.source && Intrinsics.areEqual(this.icon_token, lineItemElement.icon_token) && Intrinsics.areEqual(this.push, lineItemElement.push) && Intrinsics.areEqual(this.main_text, lineItemElement.main_text) && Intrinsics.areEqual(this.icon, lineItemElement.icon) && Intrinsics.areEqual(this.accessibility_text, lineItemElement.accessibility_text) && Intrinsics.areEqual(this.is_disabled, lineItemElement.is_disabled);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            InformationSource informationSource = this.source;
            int hashCode2 = (hashCode + (informationSource != null ? informationSource.hashCode() : 0)) * 37;
            String str = this.icon_token;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Push push = this.push;
            int hashCode4 = (hashCode3 + (push != null ? push.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.main_text;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode6 = (hashCode5 + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.accessibility_text;
            int hashCode7 = (hashCode6 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Boolean bool = this.is_disabled;
            int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolParticipant.Builder builder = new PoolParticipant.Builder(15);
            builder.full_name = this.source;
            builder.customer_identifier = this.icon_token;
            builder.profile_photo_url = this.push;
            builder.cashtag = this.main_text;
            builder.added_at = this.icon;
            builder.participant_type = this.accessibility_text;
            builder.aggregated_contribution_amount = this.is_disabled;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            InformationSource informationSource = this.source;
            if (informationSource != null) {
                arrayList.add("source=" + informationSource);
            }
            String str = this.icon_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_token=", arrayList);
            }
            Push push = this.push;
            if (push != null) {
                arrayList.add("push=" + push);
            }
            LocalizedString localizedString = this.main_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("main_text=", localizedString, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            LocalizedString localizedString2 = this.accessibility_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString2, arrayList);
            }
            Boolean bool = this.is_disabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItemElement{", "}", 0, null, null, 56);
        }
    }

    public final class LineItemModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItemModule> CREATOR;
        public final LineItemElement element;

        static {
            CardModule$LineItemModule$Companion$ADAPTER$1 cardModule$LineItemModule$Companion$ADAPTER$1 = new CardModule$LineItemModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineItemModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.LineItemModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$LineItemModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$LineItemModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItemModule(LineItemElement lineItemElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = lineItemElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LineItemModule)) {
                return false;
            }
            LineItemModule lineItemModule = (LineItemModule) obj;
            return Intrinsics.areEqual(unknownFields(), lineItemModule.unknownFields()) && Intrinsics.areEqual(this.element, lineItemModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LineItemElement lineItemElement = this.element;
            int hashCode2 = hashCode + (lineItemElement != null ? lineItemElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(8);
            builder.pool_lifecycle_filter = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LineItemElement lineItemElement = this.element;
            if (lineItemElement != null) {
                arrayList.add("element=" + lineItemElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItemModule{", "}", 0, null, null, 56);
        }
    }

    public final class Push extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Push> CREATOR;
        public final CardElementAction action;
        public final LocalizedString text;

        static {
            CardModule$Push$Companion$ADAPTER$1 cardModule$Push$Companion$ADAPTER$1 = new CardModule$Push$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Push.class), "type.googleapis.com/squareup.cash.postcard.CardModule.Push", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$Push$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$Push$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Push(CardElementAction cardElementAction, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = cardElementAction;
            this.text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Push)) {
                return false;
            }
            Push push = (Push) obj;
            return Intrinsics.areEqual(unknownFields(), push.unknownFields()) && Intrinsics.areEqual(this.action, push.action) && Intrinsics.areEqual(this.text, push.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardElementAction cardElementAction = this.action;
            int hashCode2 = (hashCode + (cardElementAction != null ? cardElementAction.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.text;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(25);
            builder.f1329type = this.action;
            builder.use_case = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardElementAction cardElementAction = this.action;
            if (cardElementAction != null) {
                arrayList.add("action=" + cardElementAction);
            }
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Push{", "}", 0, null, null, 56);
        }
    }

    public final class StatusElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StatusElement> CREATOR;
        public final LocalizedString accessibility_text;
        public final Accessory accessory;
        public final Button button;
        public final Icon icon;
        public final LocalizedString info_text;
        public final Boolean is_disabled;
        public final LocalizedString main_text;
        public final InformationSource source;

        public final class Accessory extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Accessory> CREATOR;

            /* renamed from: type, reason: collision with root package name */
            public final zzkm f1333type;

            static {
                CardModule$StatusElement$Accessory$Companion$ADAPTER$1 cardModule$StatusElement$Accessory$Companion$ADAPTER$1 = new CardModule$StatusElement$Accessory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Accessory.class), "type.googleapis.com/squareup.cash.postcard.CardModule.StatusElement.Accessory", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$StatusElement$Accessory$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$StatusElement$Accessory$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Accessory(zzkm zzkmVar, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.f1333type = zzkmVar;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Accessory)) {
                    return false;
                }
                Accessory accessory = (Accessory) obj;
                return Intrinsics.areEqual(unknownFields(), accessory.unknownFields()) && Intrinsics.areEqual(this.f1333type, accessory.f1333type);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                zzkm zzkmVar = this.f1333type;
                int hashCode2 = hashCode + (zzkmVar != null ? zzkmVar.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(9);
                builder.pool_lifecycle_filter = this.f1333type;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                zzkm zzkmVar = this.f1333type;
                if (zzkmVar != null) {
                    arrayList.add("type=" + zzkmVar);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Accessory{", "}", 0, null, null, 56);
            }
        }

        public final class Icon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Icon> CREATOR;
            public final IconBackground background;
            public final com.squareup.protos.cash.ui.Icon icon;
            public final Image image;

            public enum IconBackground implements WireEnum {
                ICON_BACKGROUND_UNSPECIFIED(0),
                BRAND(1),
                DANGER(2),
                SUBTLE(3);

                public static final CardModule$StatusElement$Icon$IconBackground$Companion$ADAPTER$1 ADAPTER;
                public static final TaxEnvironment.Companion Companion;
                public final int value;

                static {
                    IconBackground iconBackground = ICON_BACKGROUND_UNSPECIFIED;
                    Companion = new TaxEnvironment.Companion();
                    ADAPTER = new CardModule$StatusElement$Icon$IconBackground$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IconBackground.class), Syntax.PROTO_2, iconBackground);
                }

                IconBackground(int i) {
                    this.value = i;
                }

                public static final IconBackground fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return ICON_BACKGROUND_UNSPECIFIED;
                    }
                    if (i == 1) {
                        return BRAND;
                    }
                    if (i == 2) {
                        return DANGER;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return SUBTLE;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                CardModule$StatusElement$Icon$Companion$ADAPTER$1 cardModule$StatusElement$Icon$Companion$ADAPTER$1 = new CardModule$StatusElement$Icon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Icon.class), "type.googleapis.com/squareup.cash.postcard.CardModule.StatusElement.Icon", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
                ADAPTER = cardModule$StatusElement$Icon$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$StatusElement$Icon$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(com.squareup.protos.cash.ui.Icon icon, IconBackground iconBackground, Image image, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.background = iconBackground;
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return Intrinsics.areEqual(unknownFields(), icon.unknownFields()) && Intrinsics.areEqual(this.icon, icon.icon) && this.background == icon.background && Intrinsics.areEqual(this.image, icon.image);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                com.squareup.protos.cash.ui.Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                IconBackground iconBackground = this.background;
                int hashCode3 = (hashCode2 + (iconBackground != null ? iconBackground.hashCode() : 0)) * 37;
                Image image = this.image;
                int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CardScheme.Builder builder = new CardScheme.Builder(10);
                builder.modules = this.icon;
                builder.overflow_modules = this.background;
                builder.card_home_actions = this.image;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                com.squareup.protos.cash.ui.Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                IconBackground iconBackground = this.background;
                if (iconBackground != null) {
                    arrayList.add("background=" + iconBackground);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Icon{", "}", 0, null, null, 56);
            }
        }

        static {
            PoolVisibility.Companion companion = InformationSource.Companion;
            CardModule$StatusElement$Companion$ADAPTER$1 cardModule$StatusElement$Companion$ADAPTER$1 = new CardModule$StatusElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusElement.class), "type.googleapis.com/squareup.cash.postcard.CardModule.StatusElement", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$StatusElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$StatusElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusElement(InformationSource informationSource, Icon icon, Accessory accessory, LocalizedString localizedString, LocalizedString localizedString2, Button button, LocalizedString localizedString3, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.source = informationSource;
            this.icon = icon;
            this.accessory = accessory;
            this.main_text = localizedString;
            this.info_text = localizedString2;
            this.button = button;
            this.accessibility_text = localizedString3;
            this.is_disabled = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusElement)) {
                return false;
            }
            StatusElement statusElement = (StatusElement) obj;
            return Intrinsics.areEqual(unknownFields(), statusElement.unknownFields()) && this.source == statusElement.source && Intrinsics.areEqual(this.icon, statusElement.icon) && Intrinsics.areEqual(this.accessory, statusElement.accessory) && Intrinsics.areEqual(this.main_text, statusElement.main_text) && Intrinsics.areEqual(this.info_text, statusElement.info_text) && Intrinsics.areEqual(this.button, statusElement.button) && Intrinsics.areEqual(this.accessibility_text, statusElement.accessibility_text) && Intrinsics.areEqual(this.is_disabled, statusElement.is_disabled);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            InformationSource informationSource = this.source;
            int hashCode2 = (hashCode + (informationSource != null ? informationSource.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
            Accessory accessory = this.accessory;
            int hashCode4 = (hashCode3 + (accessory != null ? accessory.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.main_text;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.info_text;
            int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.accessibility_text;
            int hashCode8 = (hashCode7 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Boolean bool = this.is_disabled;
            int hashCode9 = hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(13, false);
            builder.category = this.source;
            builder.token = this.icon;
            builder.title = this.accessory;
            builder.client_route = this.main_text;
            builder.url = this.info_text;
            builder.owner_token = this.button;
            builder.version_data = this.accessibility_text;
            builder.localizable_title = this.is_disabled;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            InformationSource informationSource = this.source;
            if (informationSource != null) {
                arrayList.add("source=" + informationSource);
            }
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            Accessory accessory = this.accessory;
            if (accessory != null) {
                arrayList.add("accessory=" + accessory);
            }
            LocalizedString localizedString = this.main_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("main_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.info_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("info_text=", localizedString2, arrayList);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            LocalizedString localizedString3 = this.accessibility_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString3, arrayList);
            }
            Boolean bool = this.is_disabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StatusElement{", "}", 0, null, null, 56);
        }
    }

    public final class StatusModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StatusModule> CREATOR;
        public final StatusElement element;

        static {
            CardModule$StatusModule$Companion$ADAPTER$1 cardModule$StatusModule$Companion$ADAPTER$1 = new CardModule$StatusModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.StatusModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$StatusModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$StatusModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusModule(StatusElement statusElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = statusElement;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusModule)) {
                return false;
            }
            StatusModule statusModule = (StatusModule) obj;
            return Intrinsics.areEqual(unknownFields(), statusModule.unknownFields()) && Intrinsics.areEqual(this.element, statusModule.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            StatusElement statusElement = this.element;
            int hashCode2 = hashCode + (statusElement != null ? statusElement.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(10);
            builder.pool_lifecycle_filter = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            StatusElement statusElement = this.element;
            if (statusElement != null) {
                arrayList.add("element=" + statusElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StatusModule{", "}", 0, null, null, 56);
        }
    }

    public final class Toggle extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Toggle> CREATOR;
        public final CardElementAction card_element_action;
        public final Boolean is_toggled;

        static {
            CardModule$Toggle$Companion$ADAPTER$1 cardModule$Toggle$Companion$ADAPTER$1 = new CardModule$Toggle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Toggle.class), "type.googleapis.com/squareup.cash.postcard.CardModule.Toggle", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$Toggle$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$Toggle$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toggle(CardElementAction cardElementAction, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.card_element_action = cardElementAction;
            this.is_toggled = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) obj;
            return Intrinsics.areEqual(unknownFields(), toggle.unknownFields()) && Intrinsics.areEqual(this.card_element_action, toggle.card_element_action) && Intrinsics.areEqual(this.is_toggled, toggle.is_toggled);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CardElementAction cardElementAction = this.card_element_action;
            int hashCode2 = (hashCode + (cardElementAction != null ? cardElementAction.hashCode() : 0)) * 37;
            Boolean bool = this.is_toggled;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(26);
            builder.f1329type = this.card_element_action;
            builder.use_case = this.is_toggled;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CardElementAction cardElementAction = this.card_element_action;
            if (cardElementAction != null) {
                arrayList.add("card_element_action=" + cardElementAction);
            }
            Boolean bool = this.is_toggled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_toggled=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Toggle{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes4.dex */
    public abstract class Type {

        /* loaded from: classes7.dex */
        public final class CallToAction extends Type {
            public final CallToActionModule value;

            public CallToAction(CallToActionModule callToActionModule) {
                callToActionModule.getClass();
                this.value = callToActionModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CallToAction) && Intrinsics.areEqual(this.value, ((CallToAction) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "CallToAction(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class DeliveryStatus extends Type {
            public final DeliveryStatusModule value;

            public DeliveryStatus(DeliveryStatusModule deliveryStatusModule) {
                deliveryStatusModule.getClass();
                this.value = deliveryStatusModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeliveryStatus) && Intrinsics.areEqual(this.value, ((DeliveryStatus) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DeliveryStatus(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class Divider extends Type {
            public final DividerModule value;

            public Divider(DividerModule dividerModule) {
                dividerModule.getClass();
                this.value = dividerModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Divider) && Intrinsics.areEqual(this.value, ((Divider) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Divider(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class Header extends Type {
            public final HeaderModule value;

            public Header(HeaderModule headerModule) {
                headerModule.getClass();
                this.value = headerModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Header) && Intrinsics.areEqual(this.value, ((Header) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Header(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class HeroIssuedCard extends Type {
            public final HeroIssuedCardModule value;

            public HeroIssuedCard(HeroIssuedCardModule heroIssuedCardModule) {
                heroIssuedCardModule.getClass();
                this.value = heroIssuedCardModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HeroIssuedCard) && Intrinsics.areEqual(this.value, ((HeroIssuedCard) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "HeroIssuedCard(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class HeroNullState extends Type {
            public final HeroNullStateModule value;

            public HeroNullState(HeroNullStateModule heroNullStateModule) {
                heroNullStateModule.getClass();
                this.value = heroNullStateModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HeroNullState) && Intrinsics.areEqual(this.value, ((HeroNullState) obj).value);
            }

            public final HeroNullStateModule getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "HeroNullState(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class LineItem extends Type {
            public final LineItemModule value;

            public LineItem(LineItemModule lineItemModule) {
                lineItemModule.getClass();
                this.value = lineItemModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LineItem) && Intrinsics.areEqual(this.value, ((LineItem) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "LineItem(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class Status extends Type {
            public final StatusModule value;

            public Status(StatusModule statusModule) {
                statusModule.getClass();
                this.value = statusModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Status) && Intrinsics.areEqual(this.value, ((Status) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Status(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class Upsell extends Type {
            public final UpsellModule value;

            public Upsell(UpsellModule upsellModule) {
                upsellModule.getClass();
                this.value = upsellModule;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Upsell) && Intrinsics.areEqual(this.value, ((Upsell) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Upsell(value=" + this.value + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v2, types: [com.datadog.android.rum.model.ErrorEvent$Resource] */
        /* JADX WARN: Type inference failed for: r17v0 */
        /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r17v2 */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r20v0 */
        /* JADX WARN: Type inference failed for: r20v1, types: [com.datadog.android.rum.model.ErrorEvent$Meta] */
        /* JADX WARN: Type inference failed for: r20v2 */
        /* JADX WARN: Type inference failed for: r21v0 */
        /* JADX WARN: Type inference failed for: r21v1, types: [com.datadog.android.rum.model.ErrorEvent$Csp] */
        /* JADX WARN: Type inference failed for: r21v2 */
        /* JADX WARN: Type inference failed for: r22v0 */
        /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r22v2 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
        public static ErrorEvent.Error fromJsonObject(JsonObject jsonObject) {
            ErrorEvent.Error error;
            ArrayList arrayList;
            String str;
            int i;
            Boolean bool;
            int i2;
            int i3;
            ?? r17;
            ArrayList arrayList2;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonArray asJsonArray;
            JsonArray asJsonArray2;
            JsonObject asJsonObject3;
            String asString;
            String asString2;
            String asString3;
            JsonArray asJsonArray3;
            jsonObject.getClass();
            try {
                JsonElement jsonElement = jsonObject.get("id");
                String asString4 = jsonElement != null ? jsonElement.getAsString() : null;
                String asString5 = jsonObject.get("message").getAsString();
                String asString6 = jsonObject.get("source").getAsString();
                asString6.getClass();
                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                int length = values.length;
                int i4 = 0;
                while (i4 < length) {
                    int[] iArr = values;
                    int i5 = iArr[i4];
                    if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$13(i5).equals(asString6)) {
                        JsonElement jsonElement2 = jsonObject.get("stack");
                        String asString7 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                        JsonElement jsonElement3 = jsonObject.get("causes");
                        if (jsonElement3 == null || (asJsonArray3 = jsonElement3.getAsJsonArray()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(asJsonArray3.size());
                            Iterator<JsonElement> it = asJsonArray3.iterator();
                            while (it.hasNext()) {
                                JsonObject asJsonObject4 = it.next().getAsJsonObject();
                                asJsonObject4.getClass();
                                arrayList.add(zzjz.fromJsonObject(asJsonObject4));
                            }
                        }
                        JsonElement jsonElement4 = jsonObject.get("is_crash");
                        Boolean valueOf = jsonElement4 != null ? Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
                        JsonElement jsonElement5 = jsonObject.get("fingerprint");
                        String asString8 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                        JsonElement jsonElement6 = jsonObject.get("type");
                        String asString9 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                        JsonElement jsonElement7 = jsonObject.get("category");
                        if (jsonElement7 != null && (asString3 = jsonElement7.getAsString()) != null) {
                            int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(6);
                            int length2 = values2.length;
                            str = null;
                            for (int i6 = 0; i6 < length2; i6++) {
                                i = values2[i6];
                                if (!RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$7(i).equals(asString3)) {
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        str = null;
                        i = 0;
                        JsonElement jsonElement8 = jsonObject.get("handling");
                        if (jsonElement8 != null && (asString2 = jsonElement8.getAsString()) != null) {
                            int[] values3 = CameraSelector$$ExternalSyntheticOutline0.values(2);
                            int length3 = values3.length;
                            int i7 = 0;
                            while (i7 < length3) {
                                int i8 = values3[i7];
                                bool = valueOf;
                                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$14(i8).equals(asString2)) {
                                    i2 = i8;
                                } else {
                                    i7++;
                                    valueOf = bool;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        bool = valueOf;
                        i2 = 0;
                        JsonElement jsonElement9 = jsonObject.get("handling_stack");
                        String asString10 = jsonElement9 != null ? jsonElement9.getAsString() : str;
                        JsonElement jsonElement10 = jsonObject.get("source_type");
                        if (jsonElement10 != null && (asString = jsonElement10.getAsString()) != null) {
                            int[] values4 = CameraSelector$$ExternalSyntheticOutline0.values(9);
                            int length4 = values4.length;
                            int i9 = 0;
                            while (i9 < length4) {
                                int i10 = values4[i9];
                                int[] iArr2 = values4;
                                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue(i10).equals(asString)) {
                                    i3 = i10;
                                } else {
                                    i9++;
                                    values4 = iArr2;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        i3 = 0;
                        JsonElement jsonElement11 = jsonObject.get("resource");
                        Object fromJsonObject = (jsonElement11 == null || (asJsonObject3 = jsonElement11.getAsJsonObject()) == null) ? str : zzku.fromJsonObject(asJsonObject3);
                        JsonElement jsonElement12 = jsonObject.get("threads");
                        if (jsonElement12 == null || (asJsonArray2 = jsonElement12.getAsJsonArray()) == null) {
                            r17 = str;
                        } else {
                            ArrayList arrayList3 = new ArrayList(asJsonArray2.size());
                            Iterator<JsonElement> it2 = asJsonArray2.iterator();
                            while (it2.hasNext()) {
                                JsonObject asJsonObject5 = it2.next().getAsJsonObject();
                                asJsonObject5.getClass();
                                arrayList3.add(zzkw.fromJsonObject(asJsonObject5));
                            }
                            r17 = arrayList3;
                        }
                        JsonElement jsonElement13 = jsonObject.get("binary_images");
                        if (jsonElement13 == null || (asJsonArray = jsonElement13.getAsJsonArray()) == null) {
                            arrayList2 = str;
                        } else {
                            arrayList2 = new ArrayList(asJsonArray.size());
                            Iterator<JsonElement> it3 = asJsonArray.iterator();
                            while (it3.hasNext()) {
                                JsonObject asJsonObject6 = it3.next().getAsJsonObject();
                                asJsonObject6.getClass();
                                arrayList2.add(zzjy.fromJsonObject(asJsonObject6));
                            }
                        }
                        JsonElement jsonElement14 = jsonObject.get("was_truncated");
                        ?? valueOf2 = jsonElement14 != null ? Boolean.valueOf(jsonElement14.getAsBoolean()) : str;
                        JsonElement jsonElement15 = jsonObject.get("meta");
                        ?? fromJsonObject2 = (jsonElement15 == null || (asJsonObject2 = jsonElement15.getAsJsonObject()) == null) ? str : ErrorEvent.Meta.Companion.fromJsonObject(asJsonObject2);
                        JsonElement jsonElement16 = jsonObject.get("csp");
                        ?? fromJsonObject3 = (jsonElement16 == null || (asJsonObject = jsonElement16.getAsJsonObject()) == null) ? str : ErrorEvent.Csp.Companion.fromJsonObject(asJsonObject);
                        JsonElement jsonElement17 = jsonObject.get("time_since_app_start");
                        ?? valueOf3 = jsonElement17 != null ? Long.valueOf(jsonElement17.getAsLong()) : str;
                        asString5.getClass();
                        return new ErrorEvent.Error(asString4, asString5, i5, asString7, arrayList, bool, asString8, asString9, i, i2, asString10, i3, fromJsonObject, r17, arrayList2, valueOf2, fromJsonObject2, fromJsonObject3, valueOf3);
                    }
                    try {
                        error = null;
                        i4++;
                        values = iArr;
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e);
                        return error;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e);
                        return error;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e);
                        return error;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (IllegalStateException e4) {
                e = e4;
                error = null;
            } catch (NullPointerException e5) {
                e = e5;
                error = null;
            } catch (NumberFormatException e6) {
                e = e6;
                error = null;
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewQrCode.deepLinkSpecs;
        }
    }

    public final class UpsellElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UpsellElement> CREATOR;
        public final LocalizedString accessibility_text;
        public final LocalizedString body;
        public final Button button;
        public final Icon icon;
        public final String id;
        public final Image image;
        public final Boolean is_disabled;
        public final Boolean is_dismissible;
        public final InformationSource source;
        public final LocalizedString title;

        static {
            PoolVisibility.Companion companion = InformationSource.Companion;
            CardModule$UpsellElement$Companion$ADAPTER$1 cardModule$UpsellElement$Companion$ADAPTER$1 = new CardModule$UpsellElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsellElement.class), "type.googleapis.com/squareup.cash.postcard.CardModule.UpsellElement", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$UpsellElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$UpsellElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellElement(String str, InformationSource informationSource, LocalizedString localizedString, LocalizedString localizedString2, Icon icon, Image image, Button button, LocalizedString localizedString3, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.source = informationSource;
            this.title = localizedString;
            this.body = localizedString2;
            this.icon = icon;
            this.image = image;
            this.button = button;
            this.accessibility_text = localizedString3;
            this.is_disabled = bool;
            this.is_dismissible = bool2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpsellElement)) {
                return false;
            }
            UpsellElement upsellElement = (UpsellElement) obj;
            return Intrinsics.areEqual(unknownFields(), upsellElement.unknownFields()) && Intrinsics.areEqual(this.id, upsellElement.id) && this.source == upsellElement.source && Intrinsics.areEqual(this.title, upsellElement.title) && Intrinsics.areEqual(this.body, upsellElement.body) && Intrinsics.areEqual(this.icon, upsellElement.icon) && Intrinsics.areEqual(this.image, upsellElement.image) && Intrinsics.areEqual(this.button, upsellElement.button) && Intrinsics.areEqual(this.accessibility_text, upsellElement.accessibility_text) && Intrinsics.areEqual(this.is_disabled, upsellElement.is_disabled) && Intrinsics.areEqual(this.is_dismissible, upsellElement.is_dismissible);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            InformationSource informationSource = this.source;
            int hashCode3 = (hashCode2 + (informationSource != null ? informationSource.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.body;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode6 = (hashCode5 + (icon != null ? icon.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode7 = (hashCode6 + (image != null ? image.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode8 = (hashCode7 + (button != null ? button.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.accessibility_text;
            int hashCode9 = (hashCode8 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            Boolean bool = this.is_disabled;
            int hashCode10 = (hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_dismissible;
            int hashCode11 = hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(18);
            builder.external_id = this.id;
            builder.request_context = this.source;
            builder.passcode_token = this.title;
            builder.external_client_transfer_token = this.body;
            builder.source = this.icon;
            builder.target = this.image;
            builder.amount = this.button;
            builder.call_context = this.accessibility_text;
            builder.forwarded_call_context = this.is_disabled;
            builder.client_verified_digital_wallet = this.is_dismissible;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            InformationSource informationSource = this.source;
            if (informationSource != null) {
                arrayList.add("source=" + informationSource);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.body;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            LocalizedString localizedString3 = this.accessibility_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString3, arrayList);
            }
            Boolean bool = this.is_disabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
            }
            Boolean bool2 = this.is_dismissible;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_dismissible=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellElement{", "}", 0, null, null, 56);
        }
    }

    public final class UpsellModule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UpsellModule> CREATOR;
        public final List elements;

        static {
            CardModule$UpsellModule$Companion$ADAPTER$1 cardModule$UpsellModule$Companion$ADAPTER$1 = new CardModule$UpsellModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsellModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule.UpsellModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
            ADAPTER = cardModule$UpsellModule$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$UpsellModule$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpsellModule(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.elements = TransactorKt.immutableCopyOf("elements", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpsellModule)) {
                return false;
            }
            UpsellModule upsellModule = (UpsellModule) obj;
            return Intrinsics.areEqual(unknownFields(), upsellModule.unknownFields()) && Intrinsics.areEqual(this.elements, upsellModule.elements);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.elements.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(14, false);
            builder.pools = this.elements;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.elements;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UpsellModule{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public enum UseCase implements WireEnum {
        USE_CASE_UNSPECIFIED(0),
        VIRTUAL_CARD_STATUS(1),
        ISSUED_CARD_NO_CARD_ORDER_STATUS(2),
        PHYSICAL_CARD_ORDER_STATUS(3),
        NO_VIRTUAL_CARD_UPSELL(4),
        OVERFLOW_UI_ELEMENT(5);

        public static final CardModule$UseCase$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            UseCase useCase = USE_CASE_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new CardModule$UseCase$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UseCase.class), Syntax.PROTO_2, useCase);
        }

        UseCase(int i) {
            this.value = i;
        }

        public static final UseCase fromValue(int i) {
            Companion.getClass();
            return TextSize.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CardModule$Companion$ADAPTER$1 cardModule$Companion$ADAPTER$1 = new CardModule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardModule.class), "type.googleapis.com/squareup.cash.postcard.CardModule", Syntax.PROTO_2, null, "squareup/cash/postcard/CardModules.proto");
        ADAPTER = cardModule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardModule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModule(Type type2, UseCase useCase, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1328type = type2;
        this.use_case = useCase;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardModule)) {
            return false;
        }
        CardModule cardModule = (CardModule) obj;
        return Intrinsics.areEqual(unknownFields(), cardModule.unknownFields()) && Intrinsics.areEqual(this.f1328type, cardModule.f1328type) && this.use_case == cardModule.use_case;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1328type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        UseCase useCase = this.use_case;
        int hashCode3 = hashCode2 + (useCase != null ? useCase.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1329type = this.f1328type;
        builder.use_case = this.use_case;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1328type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        UseCase useCase = this.use_case;
        if (useCase != null) {
            arrayList.add("use_case=" + useCase);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardModule{", "}", 0, null, null, 56);
    }
}
