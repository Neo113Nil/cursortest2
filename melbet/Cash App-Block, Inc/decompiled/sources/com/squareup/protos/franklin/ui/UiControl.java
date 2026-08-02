package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.android.gms.internal.mlkit_vision_face.zzed;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuHours;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOpenStatus;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.papermate.api.PaperMoneyDeposit;
import com.squareup.protos.cash.papermate.enums.ExternalSystem;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.papermate.states.PaperMoneyDepositState;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.protos.cash.shop.rendering.api.CountdownCaption;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.BitcoinState;
import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessage;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiControl extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiControl> CREATOR;
    public final Color accent_color;
    public final String accessibility_text;
    public final Action action;
    public final String action_url_to_open;
    public final Button button;
    public final ClientScenario client_scenario;
    public final Dialog dialog;
    public final Boolean enabled;
    public final Icon icon;
    public final String info_text;
    public final InfoTextStyle info_text_style;
    public final LocalizableString localizable_accessibility_text;
    public final LocalizableString localizable_info_text;
    public final LocalizableString localizable_main_text;
    public final LocalizableString localizable_sub_text;
    public final LocalizableString localizable_text;
    public final String main_text;
    public final Color main_text_color_override;
    public final State state;
    public final StatusResult status_result;
    public final String sub_text;
    public final String support_node_token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1400type;

    public enum Action implements WireEnum {
        DO_CLIENT_SCENARIO(1),
        COPY_CARD_NUMBER(2),
        BOOST_SCREEN(4),
        SHOW_OVERFLOW_CONTROLS(5),
        STATUS_RESULT(6),
        OPEN_DIGITAL_WALLET(7),
        START_SUPPORT_FLOW(8),
        SHOW_DIALOG(9),
        HIDE_OVERFLOW_CONTROLS(10),
        OFFERS_HOME_SCREEN(11),
        OPEN_URL(12);

        public final int value;
        public static final Type.Companion Companion = new Type.Companion();
        public static final UiControl$Action$Companion$ADAPTER$1 ADAPTER = new UiControl$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            return Type.Companion.m3968fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable accent_color;
        public String accessibility_text;
        public Serializable action;
        public Object action_url_to_open;
        public Object button;
        public Object client_scenario;
        public Object dialog;
        public Object enabled;
        public Object icon;
        public Object info_text;
        public Object info_text_style;
        public Object localizable_accessibility_text;
        public Serializable localizable_info_text;
        public Serializable localizable_main_text;
        public Object localizable_sub_text;
        public Serializable localizable_text;
        public String main_text;
        public Object main_text_color_override;
        public Serializable state;
        public Object status_result;
        public String sub_text;
        public Serializable support_node_token;

        /* renamed from: type, reason: collision with root package name */
        public Serializable f1401type;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiControl((Type) this.f1401type, (State) this.state, (LocalizableString) this.localizable_text, this.main_text, (LocalizableString) this.localizable_main_text, this.sub_text, (LocalizableString) this.localizable_sub_text, (Color) this.main_text_color_override, (Button) this.button, (Icon) this.icon, this.accessibility_text, (LocalizableString) this.localizable_accessibility_text, (Action) this.action, (ClientScenario) this.client_scenario, (String) this.action_url_to_open, (StatusResult) this.status_result, (String) this.support_node_token, (Dialog) this.dialog, (Boolean) this.enabled, (Color) this.accent_color, (String) this.info_text, (LocalizableString) this.localizable_info_text, (InfoTextStyle) this.info_text_style, buildUnknownFields());
                case 1:
                    return new BrandCollection.Location((LocalColor) this.f1401type, (LocalColor) this.state, this.main_text, this.sub_text, this.accessibility_text, (LocalOpenStatus) this.localizable_text, (LocalOpenHours) this.localizable_main_text, (LocalAddress) this.localizable_sub_text, (String) this.action_url_to_open, (String) this.support_node_token, (String) this.info_text, (String) this.localizable_accessibility_text, (Integer) this.localizable_info_text, (Integer) this.main_text_color_override, (String) this.accent_color, (LocalColor) this.button, (LocalColor) this.icon, (LocalBrand.Banner) this.action, (LocalImage) this.client_scenario, (LocalImage) this.status_result, (String) this.dialog, (String) this.enabled, (List) this.info_text_style, buildUnknownFields());
                case 2:
                    return new LocalMenuItem(this.main_text, this.sub_text, (LocalImage) this.f1401type, (LocalMoney) this.state, (LocalMenuItemDeal) this.localizable_text, (Integer) this.localizable_main_text, this.accessibility_text, (List) this.localizable_sub_text, (List) this.localizable_accessibility_text, (LocalMenuAvailability) this.localizable_info_text, (List) this.action_url_to_open, (Boolean) this.enabled, (LocalMenuHours) this.support_node_token, (List) this.info_text, (List) this.main_text_color_override, (Integer) this.accent_color, (List) this.button, (List) this.icon, (LocalMenuItem.ReservationData) this.action, (List) this.client_scenario, (List) this.status_result, (List) this.dialog, (LocalMenuItem.PreorderingItemSummary) this.info_text_style, buildUnknownFields());
                case 3:
                    return new PaperMoneyDeposit(this.main_text, this.sub_text, this.accessibility_text, (PaperMoneyDepositState) this.f1401type, (Money) this.state, (Money) this.localizable_text, (Long) this.localizable_main_text, (String) this.action_url_to_open, (Long) this.localizable_sub_text, (Long) this.localizable_accessibility_text, (Long) this.localizable_info_text, (Long) this.main_text_color_override, (String) this.support_node_token, (Long) this.accent_color, (String) this.info_text, (String) this.button, (Long) this.icon, (Long) this.action, (Long) this.client_scenario, (FeeType) this.status_result, (ExternalSystem) this.dialog, (String) this.enabled, (String) this.info_text_style, buildUnknownFields());
                default:
                    return new HeroSection.HeroTile((AnalyticsEvent) this.f1401type, (TapAction) this.state, (Image) this.localizable_text, (Avatar) this.localizable_main_text, (LocalizedString) this.localizable_sub_text, (LocalizedString) this.localizable_accessibility_text, (FormattedDetail) this.localizable_info_text, (Boolean) this.enabled, (HeroSection.HeroTile.HeroOverlayColor) this.action_url_to_open, (AnalyticsMetadata) this.support_node_token, (EngagedItemToken) this.info_text, this.main_text, (Long) this.accent_color, (Long) this.button, (HeroSection.HeroTile.DisplayStyle) this.icon, (Image) this.action, (StyledText) this.client_scenario, (StyledText) this.status_result, (CountdownCaption) this.dialog, (HeroSection.HeroTile.FooterDetail) this.info_text_style, (Color) this.main_text_color_override, this.sub_text, this.accessibility_text, buildUnknownFields());
            }
        }
    }

    /* loaded from: classes4.dex */
    public abstract class Button {

        /* loaded from: classes8.dex */
        public final class IconButton extends Button {
            public final IconButton value;

            public IconButton(IconButton iconButton) {
                iconButton.getClass();
                this.value = iconButton;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof IconButton) && Intrinsics.areEqual(this.value, ((IconButton) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "IconButton(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class TextButton extends Button {
            public final TextButton value;

            public TextButton(TextButton textButton) {
                textButton.getClass();
                this.value = textButton;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TextButton) && Intrinsics.areEqual(this.value, ((TextButton) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "TextButton(value=" + this.value + ")";
            }
        }

        public static ResourceEvent.Graphql fromJsonObject(JsonObject jsonObject) {
            ArrayList arrayList;
            JsonArray asJsonArray;
            try {
                String asString = jsonObject.get("operationType").getAsString();
                asString.getClass();
                for (int i : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$16(i).equals(asString)) {
                        JsonElement jsonElement = jsonObject.get("operationName");
                        String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                        JsonElement jsonElement2 = jsonObject.get("payload");
                        String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                        JsonElement jsonElement3 = jsonObject.get("variables");
                        String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                        JsonElement jsonElement4 = jsonObject.get("error_count");
                        Long valueOf = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
                        JsonElement jsonElement5 = jsonObject.get("errors");
                        if (jsonElement5 == null || (asJsonArray = jsonElement5.getAsJsonArray()) == null) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList(asJsonArray.size());
                            Iterator<JsonElement> it = asJsonArray.iterator();
                            while (it.hasNext()) {
                                JsonObject asJsonObject = it.next().getAsJsonObject();
                                asJsonObject.getClass();
                                arrayList2.add(zzed.fromJsonObject(asJsonObject));
                            }
                            arrayList = arrayList2;
                        }
                        return new ResourceEvent.Graphql(i, asString2, asString3, asString4, valueOf, arrayList);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Graphql", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Graphql", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Graphql", e3);
                return null;
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewSystemSettingsLocation.deepLinkSpecs;
        }
    }

    public final class Dialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Dialog> CREATOR;
        public final LocalizableString localizable_main_text;
        public final LocalizableString localizable_title_text;
        public final String main_text;
        public final Button primary_button;
        public final Button secondary_button;
        public final String title_text;

        public final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;
            public final Action action;
            public final Money add_cash_suggested_amount;
            public final LocalizableString localizable_text;
            public final String text;
            public final String url_to_open;

            public enum Action implements WireEnum {
                ADD_CASH(1),
                DISMISS(2),
                OPEN_URL(3);

                public final int value;
                public static final LinkResult.Companion Companion = new LinkResult.Companion();
                public static final UiControl$Dialog$Button$Action$Companion$ADAPTER$1 ADAPTER = new UiControl$Dialog$Button$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

                Action(int i) {
                    this.value = i;
                }

                public static final Action fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return ADD_CASH;
                    }
                    if (i == 2) {
                        return DISMISS;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return OPEN_URL;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                UiControl$Dialog$Button$Companion$ADAPTER$1 uiControl$Dialog$Button$Companion$ADAPTER$1 = new UiControl$Dialog$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.franklin.ui.UiControl.Dialog.Button", Syntax.PROTO_2, null, "squareup/franklin/ui/control.proto");
                ADAPTER = uiControl$Dialog$Button$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(uiControl$Dialog$Button$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, LocalizableString localizableString, Action action, Money money, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.localizable_text = localizableString;
                this.action = action;
                this.add_cash_suggested_amount = money;
                this.url_to_open = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.localizable_text, button.localizable_text) && this.action == button.action && Intrinsics.areEqual(this.add_cash_suggested_amount, button.add_cash_suggested_amount) && Intrinsics.areEqual(this.url_to_open, button.url_to_open);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_text;
                int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                Action action = this.action;
                int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
                Money money = this.add_cash_suggested_amount;
                int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
                String str2 = this.url_to_open;
                int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ProfileAlias.Builder builder = new ProfileAlias.Builder(23, false);
                builder.alias = this.text;
                builder.verified = this.localizable_text;
                builder.expires_at = this.action;
                builder.version = this.add_cash_suggested_amount;
                builder.display_date = this.url_to_open;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                LocalizableString localizableString = this.localizable_text;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
                }
                Action action = this.action;
                if (action != null) {
                    arrayList.add("action=" + action);
                }
                Money money = this.add_cash_suggested_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("add_cash_suggested_amount=", money, arrayList);
                }
                String str2 = this.url_to_open;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url_to_open=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }
        }

        static {
            UiControl$Dialog$Companion$ADAPTER$1 uiControl$Dialog$Companion$ADAPTER$1 = new UiControl$Dialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Dialog.class), "type.googleapis.com/squareup.franklin.ui.UiControl.Dialog", Syntax.PROTO_2, null, "squareup/franklin/ui/control.proto");
            ADAPTER = uiControl$Dialog$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiControl$Dialog$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(String str, LocalizableString localizableString, Button button, Button button2, String str2, LocalizableString localizableString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.main_text = str;
            this.localizable_main_text = localizableString;
            this.primary_button = button;
            this.secondary_button = button2;
            this.title_text = str2;
            this.localizable_title_text = localizableString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.areEqual(unknownFields(), dialog.unknownFields()) && Intrinsics.areEqual(this.main_text, dialog.main_text) && Intrinsics.areEqual(this.localizable_main_text, dialog.localizable_main_text) && Intrinsics.areEqual(this.primary_button, dialog.primary_button) && Intrinsics.areEqual(this.secondary_button, dialog.secondary_button) && Intrinsics.areEqual(this.title_text, dialog.title_text) && Intrinsics.areEqual(this.localizable_title_text, dialog.localizable_title_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.main_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_main_text;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode5 = (hashCode4 + (button2 != null ? button2.hashCode() : 0)) * 37;
            String str2 = this.title_text;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_title_text;
            int hashCode7 = hashCode6 + (localizableString2 != null ? localizableString2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(13, false);
            builder.full_name = this.main_text;
            builder.synopsis = this.localizable_main_text;
            builder.full_cashtag = this.primary_button;
            builder.cashtag_url_enabled = this.secondary_button;
            builder.photo_url = this.title_text;
            builder.is_verified_account = this.localizable_title_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.main_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_main_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString, arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            String str2 = this.title_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localizable_title_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title_text=", localizableString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dialog{", "}", 0, null, null, 56);
        }
    }

    public enum Icon implements WireEnum {
        EXCLAMATION_MARK(1),
        ELLIPSIS(2),
        PACKAGE(3),
        LOCK(5),
        CARD_SHOP(6),
        CIRCLE_OUTLINED_PLUS(7),
        CIRCLE_FILLED_QUESTION_MARK(8),
        CHECK_MARK(9),
        CIRCLE_PLUS(10),
        ENVELOPE(11),
        CARD(12),
        KEYPAD(13),
        INFO(14),
        ATM(15),
        PRICE_TAG(16),
        CIRCLE_SLASH(17),
        INSIGHTS(18);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final UiControl$Icon$Companion$ADAPTER$1 ADAPTER = new UiControl$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

        Icon(int i) {
            this.value = i;
        }

        public static final Icon fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.m3955fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class IconButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IconButton> CREATOR;
        public final Icon icon;

        static {
            UiControl$IconButton$Companion$ADAPTER$1 uiControl$IconButton$Companion$ADAPTER$1 = new UiControl$IconButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IconButton.class), "type.googleapis.com/squareup.franklin.ui.UiControl.IconButton", Syntax.PROTO_2, null, "squareup/franklin/ui/control.proto");
            ADAPTER = uiControl$IconButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiControl$IconButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconButton(Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IconButton)) {
                return false;
            }
            IconButton iconButton = (IconButton) obj;
            return Intrinsics.areEqual(unknownFields(), iconButton.unknownFields()) && this.icon == iconButton.icon;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = hashCode + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiCashLimits.Builder builder = new UiCashLimits.Builder(19);
            builder.cash_limit_group = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IconButton{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InfoTextStyle implements WireEnum {
        public static final /* synthetic */ InfoTextStyle[] $VALUES;
        public static final UiControl$InfoTextStyle$Companion$ADAPTER$1 ADAPTER;
        public static final KeyScope.Companion Companion;
        public static final InfoTextStyle NEW;

        static {
            InfoTextStyle infoTextStyle = new InfoTextStyle("NEW", 0);
            NEW = infoTextStyle;
            $VALUES = new InfoTextStyle[]{infoTextStyle};
            Companion = new KeyScope.Companion();
            ADAPTER = new UiControl$InfoTextStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InfoTextStyle.class), Syntax.PROTO_2, null);
        }

        public static final InfoTextStyle fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return NEW;
            }
            return null;
        }

        public static InfoTextStyle valueOf(String str) {
            return (InfoTextStyle) Enum.valueOf(InfoTextStyle.class, str);
        }

        public static InfoTextStyle[] values() {
            return (InfoTextStyle[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    public enum State implements WireEnum {
        ON(1),
        OFF(2);

        public final int value;
        public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
        public static final UiControl$State$Companion$ADAPTER$1 ADAPTER = new UiControl$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ON;
            }
            if (i != 2) {
                return null;
            }
            return OFF;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class TextButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextButton> CREATOR;
        public final LocalizableString localizable_text;
        public final String text;

        static {
            UiControl$TextButton$Companion$ADAPTER$1 uiControl$TextButton$Companion$ADAPTER$1 = new UiControl$TextButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextButton.class), "type.googleapis.com/squareup.franklin.ui.UiControl.TextButton", Syntax.PROTO_2, null, "squareup/franklin/ui/control.proto");
            ADAPTER = uiControl$TextButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiControl$TextButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextButton(String str, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.localizable_text = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextButton)) {
                return false;
            }
            TextButton textButton = (TextButton) obj;
            return Intrinsics.areEqual(unknownFields(), textButton.unknownFields()) && Intrinsics.areEqual(this.text, textButton.text) && Intrinsics.areEqual(this.localizable_text, textButton.localizable_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_text;
            int hashCode3 = hashCode2 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(5);
            builder.text = this.text;
            builder.localizable_text = this.localizable_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextButton{", "}", 0, null, null, 56);
        }
    }

    static {
        UiControl$Companion$ADAPTER$1 uiControl$Companion$ADAPTER$1 = new UiControl$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiControl.class), "type.googleapis.com/squareup.franklin.ui.UiControl", Syntax.PROTO_2, null, "squareup/franklin/ui/control.proto");
        ADAPTER = uiControl$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiControl$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiControl(Type type2, State state, LocalizableString localizableString, String str, LocalizableString localizableString2, String str2, LocalizableString localizableString3, Color color, Button button, Icon icon, String str3, LocalizableString localizableString4, Action action, ClientScenario clientScenario, String str4, StatusResult statusResult, String str5, Dialog dialog, Boolean bool, Color color2, String str6, LocalizableString localizableString5, InfoTextStyle infoTextStyle, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1400type = type2;
        this.state = state;
        this.localizable_text = localizableString;
        this.main_text = str;
        this.localizable_main_text = localizableString2;
        this.sub_text = str2;
        this.localizable_sub_text = localizableString3;
        this.main_text_color_override = color;
        this.button = button;
        this.icon = icon;
        this.accessibility_text = str3;
        this.localizable_accessibility_text = localizableString4;
        this.action = action;
        this.client_scenario = clientScenario;
        this.action_url_to_open = str4;
        this.status_result = statusResult;
        this.support_node_token = str5;
        this.dialog = dialog;
        this.enabled = bool;
        this.accent_color = color2;
        this.info_text = str6;
        this.localizable_info_text = localizableString5;
        this.info_text_style = infoTextStyle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiControl)) {
            return false;
        }
        UiControl uiControl = (UiControl) obj;
        return Intrinsics.areEqual(unknownFields(), uiControl.unknownFields()) && this.f1400type == uiControl.f1400type && this.state == uiControl.state && Intrinsics.areEqual(this.localizable_text, uiControl.localizable_text) && Intrinsics.areEqual(this.main_text, uiControl.main_text) && Intrinsics.areEqual(this.localizable_main_text, uiControl.localizable_main_text) && Intrinsics.areEqual(this.sub_text, uiControl.sub_text) && Intrinsics.areEqual(this.localizable_sub_text, uiControl.localizable_sub_text) && Intrinsics.areEqual(this.main_text_color_override, uiControl.main_text_color_override) && Intrinsics.areEqual(this.button, uiControl.button) && this.icon == uiControl.icon && Intrinsics.areEqual(this.accessibility_text, uiControl.accessibility_text) && Intrinsics.areEqual(this.localizable_accessibility_text, uiControl.localizable_accessibility_text) && this.action == uiControl.action && this.client_scenario == uiControl.client_scenario && Intrinsics.areEqual(this.action_url_to_open, uiControl.action_url_to_open) && Intrinsics.areEqual(this.status_result, uiControl.status_result) && Intrinsics.areEqual(this.support_node_token, uiControl.support_node_token) && Intrinsics.areEqual(this.dialog, uiControl.dialog) && Intrinsics.areEqual(this.enabled, uiControl.enabled) && Intrinsics.areEqual(this.accent_color, uiControl.accent_color) && Intrinsics.areEqual(this.info_text, uiControl.info_text) && Intrinsics.areEqual(this.localizable_info_text, uiControl.localizable_info_text) && this.info_text_style == uiControl.info_text_style;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1400type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_text;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str = this.main_text;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_main_text;
        int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        String str2 = this.sub_text;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_sub_text;
        int hashCode8 = (hashCode7 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
        Color color = this.main_text_color_override;
        int hashCode9 = (hashCode8 + (color != null ? color.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode10 = (hashCode9 + (button != null ? button.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode11 = (hashCode10 + (icon != null ? icon.hashCode() : 0)) * 37;
        String str3 = this.accessibility_text;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString4 = this.localizable_accessibility_text;
        int hashCode13 = (hashCode12 + (localizableString4 != null ? localizableString4.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode14 = (hashCode13 + (action != null ? action.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode15 = (hashCode14 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        String str4 = this.action_url_to_open;
        int hashCode16 = (hashCode15 + (str4 != null ? str4.hashCode() : 0)) * 37;
        StatusResult statusResult = this.status_result;
        int hashCode17 = (hashCode16 + (statusResult != null ? statusResult.hashCode() : 0)) * 37;
        String str5 = this.support_node_token;
        int hashCode18 = (hashCode17 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Dialog dialog = this.dialog;
        int hashCode19 = (hashCode18 + (dialog != null ? dialog.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode20 = (hashCode19 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Color color2 = this.accent_color;
        int hashCode21 = (hashCode20 + (color2 != null ? color2.hashCode() : 0)) * 37;
        String str6 = this.info_text;
        int hashCode22 = (hashCode21 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalizableString localizableString5 = this.localizable_info_text;
        int hashCode23 = (hashCode22 + (localizableString5 != null ? localizableString5.hashCode() : 0)) * 37;
        InfoTextStyle infoTextStyle = this.info_text_style;
        int hashCode24 = hashCode23 + (infoTextStyle != null ? infoTextStyle.hashCode() : 0);
        this.hashCode = hashCode24;
        return hashCode24;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1401type = this.f1400type;
        builder.state = this.state;
        builder.localizable_text = this.localizable_text;
        builder.main_text = this.main_text;
        builder.localizable_main_text = this.localizable_main_text;
        builder.sub_text = this.sub_text;
        builder.localizable_sub_text = this.localizable_sub_text;
        builder.main_text_color_override = this.main_text_color_override;
        builder.button = this.button;
        builder.icon = this.icon;
        builder.accessibility_text = this.accessibility_text;
        builder.localizable_accessibility_text = this.localizable_accessibility_text;
        builder.action = this.action;
        builder.client_scenario = this.client_scenario;
        builder.action_url_to_open = this.action_url_to_open;
        builder.status_result = this.status_result;
        builder.support_node_token = this.support_node_token;
        builder.dialog = this.dialog;
        builder.enabled = this.enabled;
        builder.accent_color = this.accent_color;
        builder.info_text = this.info_text;
        builder.localizable_info_text = this.localizable_info_text;
        builder.info_text_style = this.info_text_style;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1400type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        LocalizableString localizableString = this.localizable_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
        }
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_main_text;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_main_text=", localizableString2, arrayList);
        }
        String str2 = this.sub_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sub_text=", arrayList);
        }
        LocalizableString localizableString3 = this.localizable_sub_text;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_sub_text=", localizableString3, arrayList);
        }
        Color color = this.main_text_color_override;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("main_text_color_override=", color, arrayList);
        }
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str3 = this.accessibility_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accessibility_text=", arrayList);
        }
        LocalizableString localizableString4 = this.localizable_accessibility_text;
        if (localizableString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_accessibility_text=", localizableString4, arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        String str4 = this.action_url_to_open;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "action_url_to_open=", arrayList);
        }
        StatusResult statusResult = this.status_result;
        if (statusResult != null) {
            arrayList.add("status_result=" + statusResult);
        }
        String str5 = this.support_node_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "support_node_token=", arrayList);
        }
        Dialog dialog = this.dialog;
        if (dialog != null) {
            arrayList.add("dialog=" + dialog);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Color color2 = this.accent_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accent_color=", color2, arrayList);
        }
        String str6 = this.info_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "info_text=", arrayList);
        }
        LocalizableString localizableString5 = this.localizable_info_text;
        if (localizableString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_info_text=", localizableString5, arrayList);
        }
        InfoTextStyle infoTextStyle = this.info_text_style;
        if (infoTextStyle != null) {
            arrayList.add("info_text_style=" + infoTextStyle);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiControl{", "}", 0, null, null, 56);
    }

    public enum Type implements WireEnum {
        LABEL(1),
        BUTTON(2),
        TOGGLE(3);

        public final int value;
        public static final Companion Companion = new Companion();
        public static final UiControl$Type$Companion$ADAPTER$1 ADAPTER = new UiControl$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LABEL;
            }
            if (i == 2) {
                return BUTTON;
            }
            if (i != 3) {
                return null;
            }
            return TOGGLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        public final class Companion {
            /* renamed from: fromValue, reason: collision with other method in class */
            public static CryptoOrderRenderData.OrderFeature m3963fromValue(int i) {
                switch (i) {
                    case 1:
                        return CryptoOrderRenderData.OrderFeature.MANUAL;
                    case 2:
                        return CryptoOrderRenderData.OrderFeature.MANUAL_RECURRING;
                    case 3:
                        return CryptoOrderRenderData.OrderFeature.CASH_CARD_BOOST;
                    case 4:
                        return CryptoOrderRenderData.OrderFeature.P2P_GIFTING;
                    case 5:
                        return CryptoOrderRenderData.OrderFeature.PAYROLL_CONVERSION;
                    case 6:
                        return CryptoOrderRenderData.OrderFeature.CASH_CARD_ROUND_UP;
                    case 7:
                        return CryptoOrderRenderData.OrderFeature.SQUARE_BITCOIN_SAVINGS;
                    case 8:
                        return CryptoOrderRenderData.OrderFeature.CANCELED_SPONSORSHIP;
                    case 9:
                        return CryptoOrderRenderData.OrderFeature.REVERSAL;
                    case 10:
                        return CryptoOrderRenderData.OrderFeature.BITKEY_TRANSFER;
                    case 11:
                        return CryptoOrderRenderData.OrderFeature.USD_ON_LN_PAYMENT;
                    case 12:
                        return CryptoOrderRenderData.OrderFeature.BTC_CARD_SPEND;
                    case 13:
                        return CryptoOrderRenderData.OrderFeature.ACH_CLAWBACK;
                    case 14:
                        return CryptoOrderRenderData.OrderFeature.BITCOIN_MODE_REWARD;
                    case 15:
                        return CryptoOrderRenderData.OrderFeature.P2P_RECEIVE;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static SyncEntitiesResponse.RefreshAllEntitiesType m3965fromValue(int i) {
                if (i == 0) {
                    return SyncEntitiesResponse.RefreshAllEntitiesType.DO_NOT_USE;
                }
                if (i == 1) {
                    return SyncEntitiesResponse.RefreshAllEntitiesType.IMMEDIATE;
                }
                if (i == 2) {
                    return SyncEntitiesResponse.RefreshAllEntitiesType.GRADUAL;
                }
                if (i != 3) {
                    return null;
                }
                return SyncEntitiesResponse.RefreshAllEntitiesType.NONE;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static CardOrderData.State m3966fromValue(int i) {
                switch (i) {
                    case 1:
                        return CardOrderData.State.DRAFT;
                    case 2:
                        return CardOrderData.State.PENDING_SUBMISSION;
                    case 3:
                        return CardOrderData.State.PENDING_REVIEW;
                    case 4:
                        return CardOrderData.State.PENDING_ISSUE;
                    case 5:
                        return CardOrderData.State.ISSUED;
                    case 6:
                        return CardOrderData.State.SUSPENDED;
                    case 7:
                        return CardOrderData.State.SHIPPED;
                    case 8:
                        return CardOrderData.State.COMPLETED;
                    case 9:
                        return CardOrderData.State.CANCELED;
                    case 10:
                        return CardOrderData.State.OUT_FOR_DELIVERY;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static LimitsPageletInlineMessage.Icon m3967fromValue(int i) {
                if (i == 1) {
                    return LimitsPageletInlineMessage.Icon.VERIFYING;
                }
                if (i == 2) {
                    return LimitsPageletInlineMessage.Icon.DECREASE;
                }
                if (i == 3) {
                    return LimitsPageletInlineMessage.Icon.FAILED;
                }
                if (i == 4) {
                    return LimitsPageletInlineMessage.Icon.ALERT;
                }
                if (i != 5) {
                    return null;
                }
                return LimitsPageletInlineMessage.Icon.REPORTED;
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static DisputedTransactionRenderData.DisputeStatus m3964fromValue(int i) {
                switch (i) {
                    case 1:
                        return DisputedTransactionRenderData.DisputeStatus.PENDING;
                    case 2:
                        return DisputedTransactionRenderData.DisputeStatus.IN_PROGRESS;
                    case 3:
                        return DisputedTransactionRenderData.DisputeStatus.PARTIALLY_REFUNDED;
                    case 4:
                        return DisputedTransactionRenderData.DisputeStatus.REFUNDED;
                    case 5:
                        return DisputedTransactionRenderData.DisputeStatus.DECLINED;
                    case 6:
                        return DisputedTransactionRenderData.DisputeStatus.REMOVED;
                    case 7:
                        return DisputedTransactionRenderData.DisputeStatus.CAPTURE_AMOUNT_MISMATCH;
                    case 8:
                        return DisputedTransactionRenderData.DisputeStatus.WITHDRAWN;
                    case 9:
                        return DisputedTransactionRenderData.DisputeStatus.TRANSACTION_CANCELED;
                    default:
                        return null;
                }
            }

            public static BitcoinState fromValue(int i) {
                switch (i) {
                    case 1:
                        return BitcoinState.SUBMITTED;
                    case 2:
                        return BitcoinState.PROCESSING;
                    case 3:
                        return BitcoinState.COMPLETE;
                    case 4:
                        return BitcoinState.REVIEWING;
                    case 5:
                        return BitcoinState.REVIEW_APPROVED;
                    case 6:
                        return BitcoinState.REVIEW_DECLINED;
                    case 7:
                        return BitcoinState.INCOMPLETE;
                    case 8:
                        return BitcoinState.REVIEW_FROZEN;
                    case 9:
                        return BitcoinState.INCOMPLETE_DECLINED;
                    case 10:
                        return BitcoinState.INCOMPLETE_FROZEN;
                    case 11:
                        return BitcoinState.CANCELED;
                    case 12:
                        return BitcoinState.SALE_COMPLETE;
                    case 13:
                        return BitcoinState.RISK_REVIEWING;
                    default:
                        return null;
                }
            }

            /* renamed from: fromValue, reason: collision with other method in class */
            public static Action m3968fromValue(int i) {
                switch (i) {
                    case 1:
                        return Action.DO_CLIENT_SCENARIO;
                    case 2:
                        return Action.COPY_CARD_NUMBER;
                    case 3:
                    default:
                        return null;
                    case 4:
                        return Action.BOOST_SCREEN;
                    case 5:
                        return Action.SHOW_OVERFLOW_CONTROLS;
                    case 6:
                        return Action.STATUS_RESULT;
                    case 7:
                        return Action.OPEN_DIGITAL_WALLET;
                    case 8:
                        return Action.START_SUPPORT_FLOW;
                    case 9:
                        return Action.SHOW_DIALOG;
                    case 10:
                        return Action.HIDE_OVERFLOW_CONTROLS;
                    case 11:
                        return Action.OFFERS_HOME_SCREEN;
                    case 12:
                        return Action.OPEN_URL;
                }
            }
        }
    }
}
