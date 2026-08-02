package com.squareup.protos.cash.ui;

import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.protos.cash.usher.api.OnboardingInternalRouteRequest;
import com.squareup.protos.cash.weaver.api.DismissRecommendationCandidateRequest;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.cash.whimsicard.flows.v1.InitiationSource;
import com.squareup.protos.cash.whimsicard.flows.v1.OrderPaymentDeviceFlowParameters;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceConfig;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceOrderScenarioType;
import com.squareup.protos.cash.whimsicard.flows.v1.PaymentDeviceReportReason;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.address.Verification;
import com.squareup.protos.common.signing.AndroidKeyStoreException;
import com.squareup.protos.common.signing.AttestedKeyClientError;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.NotificationPreference;
import com.squareup.protos.franklin.api.SetNotificationPreferenceRequest;
import com.squareup.protos.franklin.app.AppIntroData;
import com.squareup.protos.franklin.app.ConfirmPaymentRequest;
import com.squareup.protos.franklin.app.CustomizationInputs;
import com.squareup.protos.franklin.app.PaymentDeviceCustomizationRequest;
import com.squareup.protos.franklin.app.PaymentDeviceType;
import com.squareup.protos.franklin.app.SetAppLockActivatedRequest;
import com.squareup.protos.franklin.app.SetProfilePhotoRequest;
import com.squareup.protos.franklin.app.SyncContactsResponse;
import com.squareup.protos.franklin.app.VerifyQrCodeRequest;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.CouponActivityRenderData;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.protos.franklin.common.InvestmentEntityRenderData;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.MerchantBlockingElement;
import com.squareup.protos.franklin.common.ReactionRenderData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SavingsInterestPaymentRenderData;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.protos.franklin.common.SettingsCategory;
import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes8.dex */
public final class ColoredButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ColoredButton> CREATOR;
    public final Action action;
    public final Color button_color;
    public final LocalizedString text;
    public final Color text_color;

    /* loaded from: classes4.dex */
    public abstract class Action {

        /* loaded from: classes8.dex */
        public final class ActionType extends Action {
            public final com.squareup.protos.cash.ui.ActionType value;

            public ActionType(com.squareup.protos.cash.ui.ActionType actionType) {
                actionType.getClass();
                this.value = actionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionType) && this.value == ((ActionType) obj).value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ActionType(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class ClientRoute extends Action {
            public final String value;

            public ClientRoute(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClientRoute) && Intrinsics.areEqual(this.value, ((ClientRoute) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
            }
        }

        public static LongTaskEvent.LongTaskEventSession fromJsonObject(JsonObject jsonObject) {
            jsonObject.getClass();
            try {
                String asString = jsonObject.get("id").getAsString();
                String asString2 = jsonObject.get("type").getAsString();
                asString2.getClass();
                for (int i : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$8(i).equals(asString2)) {
                        JsonElement jsonElement = jsonObject.get("has_replay");
                        Boolean valueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                        asString.getClass();
                        return new LongTaskEvent.LongTaskEventSession(i, valueOf, asString);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTaskEventSession", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTaskEventSession", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTaskEventSession", e3);
                return null;
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewShiftsTimecards.deepLinkSpecs;
        }
    }

    static {
        ColoredButton$Companion$ADAPTER$1 coloredButton$Companion$ADAPTER$1 = new ColoredButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColoredButton.class), "type.googleapis.com/squareup.cash.ui.ColoredButton", Syntax.PROTO_2, null, "squareup/cash/ui/common.proto");
        ADAPTER = coloredButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(coloredButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColoredButton(Color color, Color color2, LocalizedString localizedString, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button_color = color;
        this.text_color = color2;
        this.text = localizedString;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ColoredButton)) {
            return false;
        }
        ColoredButton coloredButton = (ColoredButton) obj;
        return Intrinsics.areEqual(unknownFields(), coloredButton.unknownFields()) && Intrinsics.areEqual(this.button_color, coloredButton.button_color) && Intrinsics.areEqual(this.text_color, coloredButton.text_color) && Intrinsics.areEqual(this.text, coloredButton.text) && Intrinsics.areEqual(this.action, coloredButton.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.button_color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.text_color;
        int hashCode3 = (hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.text;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.button_color = this.button_color;
        builder.text_color = this.text_color;
        builder.text = this.text;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.button_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("button_color=", color, arrayList);
        }
        Color color2 = this.text_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color2, arrayList);
        }
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ColoredButton{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object action;
        public Object button_color;
        public Object text;
        public Object text_color;

        public Builder() {
            this.$r8$classId = 13;
            this.text = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ColoredButton((Color) this.button_color, (Color) this.text_color, (LocalizedString) this.text, (Action) this.action, buildUnknownFields());
                case 1:
                    return new SplitButtons.Button((String) this.button_color, (LocalizableString) this.text_color, (SplitButtons.Button.Action) this.text, (CdfEvent) this.action, buildUnknownFields());
                case 2:
                    return new HorizontalBarGraph((LocalizedString) this.text, (List) this.action, (Color) this.button_color, (Color) this.text_color, buildUnknownFields());
                case 3:
                    return new LineGraph((List) this.button_color, (List) this.text_color, (List) this.text, (LineGraph.GraphLegend) this.action, buildUnknownFields());
                case 4:
                    return new LineGraph.GraphLegend.LegendItem((LocalizedString) this.text, (Color) this.button_color, (LocalizedString) this.text_color, (Integer) this.action, buildUnknownFields());
                case 5:
                    return new OnboardingInternalRouteRequest((String) this.button_color, (Integer) this.text_color, (RequestContext) this.text, (String) this.action, buildUnknownFields());
                case 6:
                    return new DismissRecommendationCandidateRequest((String) this.button_color, (RecommendationType) this.text_color, (String) this.text, (String) this.action, buildUnknownFields());
                case 7:
                    return new OrderPaymentDeviceFlowParameters((PaymentDeviceOrderScenarioType) this.button_color, (PaymentDeviceConfig) this.text_color, (InitiationSource) this.text, (PaymentDeviceReportReason) this.action, buildUnknownFields());
                case 8:
                    return new Verification((Verification.VerificationStatus) this.button_color, (Verification.VerificationLevel) this.text_color, (Long) this.text, (String) this.action, buildUnknownFields());
                case 9:
                    return new AttestedKeyClientError((String) this.button_color, (String) this.text_color, (String) this.text, (AndroidKeyStoreException) this.action, buildUnknownFields());
                case 10:
                    return new SigningData.AttestedKeySigningData((ByteString) this.button_color, (String) this.text_color, (List) this.text, (AttestedKeyClientError) this.action, buildUnknownFields());
                case 11:
                    return new SetNotificationPreferenceRequest((String) this.button_color, (String) this.text_color, (NotificationPreference) this.text, (RequestContext) this.action, buildUnknownFields());
                case 12:
                    String str = (String) this.button_color;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "content_id");
                        throw null;
                    }
                    AppIntroData.Panel panel = (AppIntroData.Panel) this.text_color;
                    if (panel == null) {
                        TransactorKt.missingRequiredFields(panel, "panel");
                        throw null;
                    }
                    String str2 = (String) this.text;
                    if (str2 == null) {
                        TransactorKt.missingRequiredFields(str2, "content_image_url");
                        throw null;
                    }
                    String str3 = (String) this.action;
                    if (str3 != null) {
                        return new AppIntroData.ScreenContent(str, panel, str2, str3, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str3, "title_text");
                    throw null;
                case 13:
                    return new ConfirmPaymentRequest((RequestContext) this.button_color, (String) this.text_color, (List) this.text, (InstrumentSelection) this.action, buildUnknownFields());
                case 14:
                    return new PaymentDeviceCustomizationRequest((RequestContext) this.button_color, (String) this.text_color, (PaymentDeviceType) this.text, (CustomizationInputs) this.action, buildUnknownFields());
                case 15:
                    return new SetAppLockActivatedRequest((RequestContext) this.button_color, (Boolean) this.text_color, (String) this.text, (String) this.action, buildUnknownFields());
                case 16:
                    return new SetProfilePhotoRequest((String) this.button_color, (ByteString) this.text_color, (String) this.text, (RequestContext) this.action, buildUnknownFields());
                case 17:
                    return new SyncContactsResponse((SyncContactsResponse.Status) this.button_color, (String) this.text_color, (List) this.text, (List) this.action, buildUnknownFields());
                case 18:
                    return new VerifyQrCodeRequest((RequestContext) this.button_color, (String) this.text_color, (Boolean) this.text, (Boolean) this.action, buildUnknownFields());
                case 19:
                    return new CardThemeDefinition((String) this.button_color, (String) this.text_color, (CardTheme) this.action, (LocalizedString) this.text, buildUnknownFields());
                case 20:
                    return new BalanceData.Dialog.Button((String) this.button_color, (LocalizableString) this.text_color, (BalanceData.Dialog.Button.Action) this.text, (ClientScenario) this.action, buildUnknownFields());
                case 21:
                    return new CouponActivityRenderData((CouponActivityRenderData.Type) this.button_color, (String) this.text_color, (String) this.text, (String) this.action, buildUnknownFields());
                case 22:
                    return new InstantPayRenderData.InstantPayout((String) this.button_color, (Money) this.text_color, (LocalizableString) this.text, (LocalizableString) this.action, buildUnknownFields());
                case 23:
                    return new InvestPaymentRenderData((InvestmentEntityRenderData) this.button_color, (String) this.text_color, (InvestPaymentRenderData.RecipientData) this.text, (InvestPaymentRenderData.SenderData) this.action, buildUnknownFields());
                case 24:
                    return new LendingRenderData.Breakdown((Money) this.button_color, (Money) this.text_color, (Money) this.text, (Money) this.action, buildUnknownFields());
                case 25:
                    return new MerchantBlockingElement((String) this.button_color, (LocalizableString) this.text_color, (UiControl.Icon) this.text, (String) this.action, buildUnknownFields());
                case 26:
                    return new ReactionRenderData((List) this.button_color, (List) this.text_color, (Long) this.text, (Boolean) this.action, buildUnknownFields());
                case 27:
                    return new SavingsInterestPaymentRenderData((SavingsInterestPaymentRenderData.SavingsInterestPaymentState) this.button_color, (Long) this.text_color, (String) this.text, (SavingsTransferRenderData.SavingsFolderMetadata) this.action, buildUnknownFields());
                case 28:
                    return new SettingsCategory((String) this.button_color, (LocalizableString) this.text_color, (List) this.text, (List) this.action, buildUnknownFields());
                default:
                    return new SponsoredAccountRenderData.Parent((SponsoredAccountRenderData.Parent.Type) this.button_color, (String) this.text_color, (String) this.text, (Boolean) this.action, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
