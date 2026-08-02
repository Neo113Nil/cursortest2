package com.squareup.cash.wallet.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface CardSchemeViewModel {

    public final class CardNullStateBooklet implements CardSchemeViewModel {
        public final Content content;

        public final class BenefitItem {
            public final Icons icon;
            public final String text;

            public BenefitItem(Icons icons, String str) {
                this.text = str;
                this.icon = icons;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BenefitItem)) {
                    return false;
                }
                BenefitItem benefitItem = (BenefitItem) obj;
                return this.text.equals(benefitItem.text) && this.icon == benefitItem.icon;
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                Icons icons = this.icon;
                return hashCode + (icons == null ? 0 : icons.hashCode());
            }

            public final String toString() {
                return "BenefitItem(text=" + this.text + ", icon=" + this.icon + ")";
            }
        }

        public interface BookletTile {
        }

        public final class Content {
            public final List benefitsList;
            public final String body;
            public final List bookletTiles;
            public final Module.Disclosure disclosures;
            public final Module.Accessory.Button primaryButton;
            public final List rotatingCards;
            public final boolean showCardGrid;
            public final String title;

            public Content(List list, boolean z, String str, String str2, List list2, List list3, Module.Accessory.Button button, Module.Disclosure disclosure) {
                list.getClass();
                str.getClass();
                list2.getClass();
                list3.getClass();
                this.rotatingCards = list;
                this.showCardGrid = z;
                this.title = str;
                this.body = str2;
                this.benefitsList = list2;
                this.bookletTiles = list3;
                this.primaryButton = button;
                this.disclosures = disclosure;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.areEqual(this.rotatingCards, content.rotatingCards) && this.showCardGrid == content.showCardGrid && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.body, content.body) && Intrinsics.areEqual(this.benefitsList, content.benefitsList) && Intrinsics.areEqual(this.bookletTiles, content.bookletTiles) && this.primaryButton.equals(content.primaryButton) && Intrinsics.areEqual(this.disclosures, content.disclosures);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rotatingCards.hashCode() * 31, 31, this.showCardGrid), 31, this.title);
                String str = this.body;
                int hashCode = (this.primaryButton.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.benefitsList), 31, this.bookletTiles)) * 31;
                Module.Disclosure disclosure = this.disclosures;
                return hashCode + (disclosure != null ? disclosure.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(rotatingCards=");
                sb.append(this.rotatingCards);
                sb.append(", showCardGrid=");
                sb.append(this.showCardGrid);
                sb.append(", title=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", body=", this.body, ", benefitsList=");
                Request$Priority$EnumUnboxingLocalUtility.m(sb, this.benefitsList, ", bookletTiles=", this.bookletTiles, ", primaryButton=");
                sb.append(this.primaryButton);
                sb.append(", disclosures=");
                sb.append(this.disclosures);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class Grid implements BookletTile {
            public final List items;
            public final String title;

            public final class Item {
                public final String body;
                public final Icons icon;
                public final String title;

                public Item(Icons icons, String str, String str2) {
                    this.title = str;
                    this.body = str2;
                    this.icon = icons;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) obj;
                    return this.title.equals(item.title) && this.body.equals(item.body) && this.icon == item.icon;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
                    Icons icons = this.icon;
                    return m + (icons == null ? 0 : icons.hashCode());
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Item(title=", this.title, ", body=", this.body, ", icon=");
                    m.append(this.icon);
                    m.append(")");
                    return m.toString();
                }
            }

            public Grid(String str, List list) {
                list.getClass();
                this.title = str;
                this.items = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Grid)) {
                    return false;
                }
                Grid grid = (Grid) obj;
                return this.title.equals(grid.title) && Intrinsics.areEqual(this.items, grid.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Grid(title=", this.title, ", items=", ")", this.items);
            }
        }

        public final class Tile implements BookletTile {
            public final String body;
            public final Image image;
            public final String title;

            public Tile(Image image, String str, String str2) {
                image.getClass();
                this.image = image;
                this.title = str;
                this.body = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tile)) {
                    return false;
                }
                Tile tile = (Tile) obj;
                return Intrinsics.areEqual(this.image, tile.image) && this.title.equals(tile.title) && this.body.equals(tile.body);
            }

            public final int hashCode() {
                return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "Tile(image=", ", title=", this.title, ", body="), this.body, ")");
            }
        }

        public CardNullStateBooklet(Content content) {
            this.content = content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardNullStateBooklet) && Intrinsics.areEqual(this.content, ((CardNullStateBooklet) obj).content);
        }

        public final int hashCode() {
            Content content = this.content;
            if (content == null) {
                return 0;
            }
            return content.hashCode();
        }

        public final String toString() {
            return "CardNullStateBooklet(content=" + this.content + ")";
        }
    }

    public final class Content implements CardSchemeViewModel {
        public final List cardHomeActions;
        public final List modules;
        public final List overflowModules;
        public final boolean scrollToTopForNewTag;

        public Content(List list, List list2, List list3, boolean z) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.modules = list;
            this.overflowModules = list2;
            this.cardHomeActions = list3;
            this.scrollToTopForNewTag = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.modules, content.modules) && Intrinsics.areEqual(this.overflowModules, content.overflowModules) && Intrinsics.areEqual(this.cardHomeActions, content.cardHomeActions) && this.scrollToTopForNewTag == content.scrollToTopForNewTag;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.scrollToTopForNewTag) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.modules.hashCode() * 31, 31, this.overflowModules), 31, this.cardHomeActions);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Content(modules=", ", overflowModules=", ", cardHomeActions=", this.modules, this.overflowModules);
            m.append(this.cardHomeActions);
            m.append(", scrollToTopForNewTag=");
            m.append(this.scrollToTopForNewTag);
            m.append(")");
            return m.toString();
        }
    }

    public final class HeroNullState implements CardSchemeViewModel {
        public final NullStateCarouselViewModel carouselViewModel;

        public HeroNullState(NullStateCarouselViewModel nullStateCarouselViewModel) {
            this.carouselViewModel = nullStateCarouselViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeroNullState) && this.carouselViewModel.equals(((HeroNullState) obj).carouselViewModel);
        }

        public final int hashCode() {
            return this.carouselViewModel.hashCode();
        }

        public final String toString() {
            return "HeroNullState(carouselViewModel=" + this.carouselViewModel + ")";
        }
    }

    public final class Loading implements CardSchemeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2071116417;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class RetryableError implements CardSchemeViewModel {
        public final String body;
        public final String buttonText;
        public final boolean isLoading;
        public final Function0 onClick;
        public final String title;

        public RetryableError(String str, String str2, String str3, boolean z, Function0 function0) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            function0.getClass();
            this.title = str;
            this.body = str2;
            this.buttonText = str3;
            this.isLoading = z;
            this.onClick = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetryableError)) {
                return false;
            }
            RetryableError retryableError = (RetryableError) obj;
            return Intrinsics.areEqual(this.title, retryableError.title) && Intrinsics.areEqual(this.body, retryableError.body) && Intrinsics.areEqual(this.buttonText, retryableError.buttonText) && this.isLoading == retryableError.isLoading && Intrinsics.areEqual(this.onClick, retryableError.onClick);
        }

        public final int hashCode() {
            return this.onClick.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.buttonText), 31, this.isLoading);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RetryableError(title=", this.title, ", body=", this.body, ", buttonText=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.buttonText, ", isLoading=", this.isLoading, ", onClick=");
            m.append(this.onClick);
            m.append(")");
            return m.toString();
        }
    }

    public interface Module {

        public final class CallToActionModule implements Module {
            public final Accessory.Button button;
            public final Image image;
            public final String subtitle;
            public final String title;

            public CallToActionModule(String str, String str2, Accessory.Button button, Image image) {
                this.title = str;
                this.subtitle = str2;
                this.button = button;
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CallToActionModule)) {
                    return false;
                }
                CallToActionModule callToActionModule = (CallToActionModule) obj;
                return Intrinsics.areEqual(this.title, callToActionModule.title) && Intrinsics.areEqual(this.subtitle, callToActionModule.subtitle) && this.button.equals(callToActionModule.button) && Intrinsics.areEqual(this.image, callToActionModule.image);
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                int hashCode2 = (this.button.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Image image = this.image;
                return hashCode2 + (image != null ? image.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CallToActionModule(title=", this.title, ", subtitle=", this.subtitle, ", button=");
                m.append(this.button);
                m.append(", image=");
                m.append(this.image);
                m.append(")");
                return m.toString();
            }
        }

        public abstract class CardAnimation {

            public final class Copy extends CardAnimation {
                public final int triggerCount;

                public Copy(int i) {
                    this.triggerCount = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Copy) && this.triggerCount == ((Copy) obj).triggerCount;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.triggerCount);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.triggerCount, "Copy(triggerCount=", ")");
                }
            }

            public final class Expired extends CardAnimation {
                public static final Expired INSTANCE = new Expired();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Expired);
                }

                public final int hashCode() {
                    return -1054628060;
                }

                public final String toString() {
                    return "Expired";
                }
            }

            public final class None extends CardAnimation {
                public final boolean previouslyEnabled;
                public final boolean previouslyFacingForward;

                public None(boolean z, boolean z2) {
                    this.previouslyFacingForward = z;
                    this.previouslyEnabled = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof None)) {
                        return false;
                    }
                    None none = (None) obj;
                    return this.previouslyFacingForward == none.previouslyFacingForward && this.previouslyEnabled == none.previouslyEnabled;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.previouslyEnabled) + (Boolean.hashCode(this.previouslyFacingForward) * 31);
                }

                public final String toString() {
                    return Request$Priority$EnumUnboxingLocalUtility.m("None(previouslyFacingForward=", ", previouslyEnabled=", ")", this.previouslyFacingForward, this.previouslyEnabled);
                }
            }

            public final class SpinToFront extends CardAnimation {
                public static final SpinToFront INSTANCE = new SpinToFront();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SpinToFront);
                }

                public final int hashCode() {
                    return 55889483;
                }

                public final String toString() {
                    return "SpinToFront";
                }
            }

            public final class Updated extends CardAnimation {
                public final CardTheme cardTheme;
                public final CustomizationImage customizationImage;
                public final boolean previouslyEnabled;
                public final boolean previouslyFacingForward;

                public Updated(CardTheme cardTheme, CustomizationImage customizationImage, boolean z, boolean z2) {
                    cardTheme.getClass();
                    this.cardTheme = cardTheme;
                    this.customizationImage = customizationImage;
                    this.previouslyFacingForward = z;
                    this.previouslyEnabled = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Updated)) {
                        return false;
                    }
                    Updated updated = (Updated) obj;
                    return Intrinsics.areEqual(this.cardTheme, updated.cardTheme) && Intrinsics.areEqual(this.customizationImage, updated.customizationImage) && this.previouslyFacingForward == updated.previouslyFacingForward && this.previouslyEnabled == updated.previouslyEnabled;
                }

                public final int hashCode() {
                    int hashCode = this.cardTheme.hashCode() * 31;
                    CustomizationImage customizationImage = this.customizationImage;
                    return Boolean.hashCode(this.previouslyEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (customizationImage == null ? 0 : Arrays.hashCode(customizationImage.bytes))) * 31, 31, this.previouslyFacingForward);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Updated(cardTheme=");
                    sb.append(this.cardTheme);
                    sb.append(", customizationImage=");
                    sb.append(this.customizationImage);
                    sb.append(", previouslyFacingForward=");
                    return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.previouslyFacingForward, ", previouslyEnabled=", this.previouslyEnabled, ")");
                }
            }
        }

        public final class CustomizationImage {
            public final byte[] bytes;

            public CustomizationImage(byte[] bArr) {
                bArr.getClass();
                this.bytes = bArr;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!CustomizationImage.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
                obj.getClass();
                return Arrays.equals(this.bytes, ((CustomizationImage) obj).bytes);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.bytes);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomizationImage(bytes=", Arrays.toString(this.bytes), ")");
            }
        }

        public final class Disclosure implements Module {
            public final boolean showIcon;
            public final String text;

            public Disclosure(String str, boolean z) {
                this.text = str;
                this.showIcon = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Disclosure)) {
                    return false;
                }
                Disclosure disclosure = (Disclosure) obj;
                return Intrinsics.areEqual(this.text, disclosure.text) && this.showIcon == disclosure.showIcon;
            }

            public final int hashCode() {
                String str = this.text;
                return Boolean.hashCode(this.showIcon) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Disclosure(text=", this.text, ", showIcon=", ")", this.showIcon);
            }
        }

        public final class Divider implements Module {
            public static final Divider INSTANCE = new Divider();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Divider);
            }

            public final int hashCode() {
                return 1004033170;
            }

            public final String toString() {
                return "Divider";
            }
        }

        public final class Header implements Module {
            public final String text;

            public Header(String str) {
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Header) && this.text.equals(((Header) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(text=", this.text, ")");
            }
        }

        public final class HeroPaymentDevices implements Module {
            public final int currentPage;
            public final List deliveryStatusRows;
            public final HeroCard heroCard;
            public final ArrayList heroTags;
            public final boolean shouldPeekFirstTag;

            public final class DeliveryStatusRowModel {
                public final PresentationAction buttonAction;
                public final String buttonLabel;
                public final String deviceId;
                public final String subtitle;
                public final String themeToken;
                public final PresentationTimelineViewModel timelineHalfsheet;
                public final String title;

                public DeliveryStatusRowModel(String str, String str2, String str3, PresentationAction presentationAction, PresentationTimelineViewModel presentationTimelineViewModel, String str4, String str5) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.buttonLabel = str3;
                    this.buttonAction = presentationAction;
                    this.timelineHalfsheet = presentationTimelineViewModel;
                    this.themeToken = str4;
                    this.deviceId = str5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DeliveryStatusRowModel)) {
                        return false;
                    }
                    DeliveryStatusRowModel deliveryStatusRowModel = (DeliveryStatusRowModel) obj;
                    return Intrinsics.areEqual(this.title, deliveryStatusRowModel.title) && Intrinsics.areEqual(this.subtitle, deliveryStatusRowModel.subtitle) && Intrinsics.areEqual(this.buttonLabel, deliveryStatusRowModel.buttonLabel) && Intrinsics.areEqual(this.buttonAction, deliveryStatusRowModel.buttonAction) && Intrinsics.areEqual(this.timelineHalfsheet, deliveryStatusRowModel.timelineHalfsheet) && Intrinsics.areEqual(this.themeToken, deliveryStatusRowModel.themeToken) && Intrinsics.areEqual(this.deviceId, deliveryStatusRowModel.deviceId);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
                    String str = this.buttonLabel;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    PresentationAction presentationAction = this.buttonAction;
                    int hashCode2 = (hashCode + (presentationAction == null ? 0 : presentationAction.hashCode())) * 31;
                    PresentationTimelineViewModel presentationTimelineViewModel = this.timelineHalfsheet;
                    int hashCode3 = (hashCode2 + (presentationTimelineViewModel == null ? 0 : presentationTimelineViewModel.hashCode())) * 31;
                    String str2 = this.themeToken;
                    int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.deviceId;
                    return hashCode4 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeliveryStatusRowModel(title=", this.title, ", subtitle=", this.subtitle, ", buttonLabel=");
                    m.append(this.buttonLabel);
                    m.append(", buttonAction=");
                    m.append(this.buttonAction);
                    m.append(", timelineHalfsheet=");
                    m.append(this.timelineHalfsheet);
                    m.append(", themeToken=");
                    m.append(this.themeToken);
                    m.append(", deviceId=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.deviceId, ")");
                }
            }

            public HeroPaymentDevices(HeroCard heroCard, ArrayList arrayList, List list, int i, boolean z) {
                list.getClass();
                this.heroCard = heroCard;
                this.heroTags = arrayList;
                this.deliveryStatusRows = list;
                this.currentPage = i;
                this.shouldPeekFirstTag = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeroPaymentDevices)) {
                    return false;
                }
                HeroPaymentDevices heroPaymentDevices = (HeroPaymentDevices) obj;
                return this.heroCard.equals(heroPaymentDevices.heroCard) && this.heroTags.equals(heroPaymentDevices.heroTags) && Intrinsics.areEqual(this.deliveryStatusRows, heroPaymentDevices.deliveryStatusRows) && this.currentPage == heroPaymentDevices.currentPage && this.shouldPeekFirstTag == heroPaymentDevices.shouldPeekFirstTag;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.shouldPeekFirstTag) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentPage, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.heroTags, this.heroCard.hashCode() * 31, 31), 31, this.deliveryStatusRows), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HeroPaymentDevices(heroCard=");
                sb.append(this.heroCard);
                sb.append(", heroTags=");
                sb.append(this.heroTags);
                sb.append(", deliveryStatusRows=");
                sb.append(this.deliveryStatusRows);
                sb.append(", currentPage=");
                sb.append(this.currentPage);
                sb.append(", shouldPeekFirstTag=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shouldPeekFirstTag, ")");
            }
        }

        public final class HeroTag {
            public final Image background;
            public final String copiedPan;
            public final int copyAnimationTrigger;
            public final String deviceId;
            public final TagFormFactor formFactor;
            public final boolean isActivated;
            public final boolean isLoading;
            public final boolean isLocked;
            public final boolean isPendingFirstActivation;
            public final boolean showRingText;
            public final PhysicalTagOrderState tagOrderState;
            public final String tagThemeToken;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class PhysicalTagOrderState {
                public static final /* synthetic */ PhysicalTagOrderState[] $VALUES;
                public static final PhysicalTagOrderState COMPLETE;
                public static final PhysicalTagOrderState PENDING_ACTIVATION;
                public static final PhysicalTagOrderState PREPARING;
                public static final PhysicalTagOrderState SHIPPED;

                static {
                    PhysicalTagOrderState physicalTagOrderState = new PhysicalTagOrderState("PREPARING", 0);
                    PREPARING = physicalTagOrderState;
                    PhysicalTagOrderState physicalTagOrderState2 = new PhysicalTagOrderState("SHIPPED", 1);
                    SHIPPED = physicalTagOrderState2;
                    PhysicalTagOrderState physicalTagOrderState3 = new PhysicalTagOrderState("PENDING_ACTIVATION", 2);
                    PENDING_ACTIVATION = physicalTagOrderState3;
                    PhysicalTagOrderState physicalTagOrderState4 = new PhysicalTagOrderState("COMPLETE", 3);
                    COMPLETE = physicalTagOrderState4;
                    $VALUES = new PhysicalTagOrderState[]{physicalTagOrderState, physicalTagOrderState2, physicalTagOrderState3, physicalTagOrderState4};
                }

                public static PhysicalTagOrderState valueOf(String str) {
                    return (PhysicalTagOrderState) Enum.valueOf(PhysicalTagOrderState.class, str);
                }

                public static PhysicalTagOrderState[] values() {
                    return (PhysicalTagOrderState[]) $VALUES.clone();
                }
            }

            public HeroTag(String str, String str2, TagFormFactor tagFormFactor, Image image, boolean z, boolean z2, boolean z3, PhysicalTagOrderState physicalTagOrderState, boolean z4, boolean z5, int i, String str3) {
                this.deviceId = str;
                this.tagThemeToken = str2;
                this.formFactor = tagFormFactor;
                this.background = image;
                this.isActivated = z;
                this.isLocked = z2;
                this.isPendingFirstActivation = z3;
                this.tagOrderState = physicalTagOrderState;
                this.isLoading = z4;
                this.showRingText = z5;
                this.copyAnimationTrigger = i;
                this.copiedPan = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeroTag)) {
                    return false;
                }
                HeroTag heroTag = (HeroTag) obj;
                return Intrinsics.areEqual(this.deviceId, heroTag.deviceId) && Intrinsics.areEqual(this.tagThemeToken, heroTag.tagThemeToken) && this.formFactor == heroTag.formFactor && Intrinsics.areEqual(this.background, heroTag.background) && this.isActivated == heroTag.isActivated && this.isLocked == heroTag.isLocked && this.isPendingFirstActivation == heroTag.isPendingFirstActivation && this.tagOrderState == heroTag.tagOrderState && this.isLoading == heroTag.isLoading && this.showRingText == heroTag.showRingText && this.copyAnimationTrigger == heroTag.copyAnimationTrigger && Intrinsics.areEqual(this.copiedPan, heroTag.copiedPan);
            }

            public final int hashCode() {
                String str = this.deviceId;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.tagThemeToken;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                TagFormFactor tagFormFactor = this.formFactor;
                int hashCode3 = (hashCode2 + (tagFormFactor == null ? 0 : tagFormFactor.hashCode())) * 31;
                Image image = this.background;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (image == null ? 0 : image.hashCode())) * 31, 31, this.isActivated), 31, this.isLocked), 31, this.isPendingFirstActivation);
                PhysicalTagOrderState physicalTagOrderState = this.tagOrderState;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.copyAnimationTrigger, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (physicalTagOrderState == null ? 0 : physicalTagOrderState.hashCode())) * 31, 31, this.isLoading), 31, this.showRingText), 31);
                String str3 = this.copiedPan;
                return m2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeroTag(deviceId=", this.deviceId, ", tagThemeToken=", this.tagThemeToken, ", formFactor=");
                m.append(this.formFactor);
                m.append(", background=");
                m.append(this.background);
                m.append(", isActivated=");
                re$$ExternalSyntheticOutline0.m(m, this.isActivated, ", isLocked=", this.isLocked, ", isPendingFirstActivation=");
                m.append(this.isPendingFirstActivation);
                m.append(", tagOrderState=");
                m.append(this.tagOrderState);
                m.append(", isLoading=");
                re$$ExternalSyntheticOutline0.m(m, this.isLoading, ", showRingText=", this.showRingText, ", copyAnimationTrigger=");
                m.append(this.copyAnimationTrigger);
                m.append(", copiedPan=");
                m.append(this.copiedPan);
                m.append(")");
                return m.toString();
            }
        }

        public interface Icon {

            public final class Avatar implements Icon {
                public final AvatarSize size;
                public final StackedAvatarViewModel stackedAvatarViewModel;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class AvatarSize {
                    public static final /* synthetic */ AvatarSize[] $VALUES;
                    public static final AvatarSize LARGE;

                    /* JADX INFO: Fake field, exist only in values array */
                    AvatarSize EF0;

                    static {
                        AvatarSize avatarSize = new AvatarSize("REGULAR", 0);
                        AvatarSize avatarSize2 = new AvatarSize("LARGE", 1);
                        LARGE = avatarSize2;
                        $VALUES = new AvatarSize[]{avatarSize, avatarSize2};
                    }

                    public static AvatarSize valueOf(String str) {
                        return (AvatarSize) Enum.valueOf(AvatarSize.class, str);
                    }

                    public static AvatarSize[] values() {
                        return (AvatarSize[]) $VALUES.clone();
                    }
                }

                public Avatar(StackedAvatarViewModel stackedAvatarViewModel) {
                    AvatarSize avatarSize = AvatarSize.LARGE;
                    this.stackedAvatarViewModel = stackedAvatarViewModel;
                    this.size = avatarSize;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Avatar)) {
                        return false;
                    }
                    Avatar avatar = (Avatar) obj;
                    return Intrinsics.areEqual(this.stackedAvatarViewModel, avatar.stackedAvatarViewModel) && this.size == avatar.size;
                }

                public final int hashCode() {
                    return this.size.hashCode() + (this.stackedAvatarViewModel.hashCode() * 31);
                }

                public final String toString() {
                    return "Avatar(badge=null, stackedAvatarViewModel=" + this.stackedAvatarViewModel + ", size=" + this.size + ")";
                }
            }

            public final class LegacyAvatar implements Icon {
                public final AvatarImage avatarImage;
                public final LegacyAvatarBackground background;
                public final AvatarImage badgeImage;
                public final String monogram;

                public interface AvatarImage {

                    public final class Local implements AvatarImage {
                        public final String iconId;

                        public Local(String str) {
                            str.getClass();
                            this.iconId = str;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Local) && Intrinsics.areEqual(this.iconId, ((Local) obj).iconId);
                        }

                        public final int hashCode() {
                            return this.iconId.hashCode();
                        }

                        public final String toString() {
                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Local(iconId=", this.iconId, ")");
                        }
                    }

                    public abstract class Remote implements AvatarImage {
                    }
                }

                public LegacyAvatar(LegacyAvatarBackground legacyAvatarBackground, AvatarImage avatarImage, AvatarImage.Local local, int i) {
                    local = (i & 16) != 0 ? null : local;
                    this.background = legacyAvatarBackground;
                    this.avatarImage = avatarImage;
                    this.monogram = "";
                    this.badgeImage = local;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LegacyAvatar)) {
                        return false;
                    }
                    LegacyAvatar legacyAvatar = (LegacyAvatar) obj;
                    return this.background == legacyAvatar.background && this.avatarImage.equals(legacyAvatar.avatarImage) && this.monogram.equals(legacyAvatar.monogram) && Intrinsics.areEqual(this.badgeImage, legacyAvatar.badgeImage);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatarImage.hashCode() + (this.background.hashCode() * 31)) * 31, 961, this.monogram);
                    AvatarImage avatarImage = this.badgeImage;
                    return m + (avatarImage == null ? 0 : avatarImage.hashCode());
                }

                public final String toString() {
                    return "LegacyAvatar(background=" + this.background + ", avatarImage=" + this.avatarImage + ", monogram=" + this.monogram + ", contentDescription=null, badgeImage=" + this.badgeImage + ")";
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class LegacyAvatarBackground {
                public static final /* synthetic */ LegacyAvatarBackground[] $VALUES;
                public static final LegacyAvatarBackground BRAND;
                public static final LegacyAvatarBackground DANGER;
                public static final LegacyAvatarBackground SUBTLE;

                static {
                    LegacyAvatarBackground legacyAvatarBackground = new LegacyAvatarBackground("BRAND", 0);
                    BRAND = legacyAvatarBackground;
                    LegacyAvatarBackground legacyAvatarBackground2 = new LegacyAvatarBackground("DANGER", 1);
                    DANGER = legacyAvatarBackground2;
                    LegacyAvatarBackground legacyAvatarBackground3 = new LegacyAvatarBackground("SUBTLE", 2);
                    SUBTLE = legacyAvatarBackground3;
                    $VALUES = new LegacyAvatarBackground[]{legacyAvatarBackground, legacyAvatarBackground2, legacyAvatarBackground3};
                }

                public static LegacyAvatarBackground valueOf(String str) {
                    return (LegacyAvatarBackground) Enum.valueOf(LegacyAvatarBackground.class, str);
                }

                public static LegacyAvatarBackground[] values() {
                    return (LegacyAvatarBackground[]) $VALUES.clone();
                }
            }
        }

        public final class KybRestrictionModel implements Module {
            public final UiCallbackModel uiCallbackModel;

            public KybRestrictionModel(UiCallbackModel uiCallbackModel) {
                uiCallbackModel.getClass();
                this.uiCallbackModel = uiCallbackModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof KybRestrictionModel) && Intrinsics.areEqual(this.uiCallbackModel, ((KybRestrictionModel) obj).uiCallbackModel);
            }

            public final int hashCode() {
                return this.uiCallbackModel.hashCode();
            }

            public final String toString() {
                return "KybRestrictionModel(uiCallbackModel=" + this.uiCallbackModel + ")";
            }
        }

        public final class ListItemModule implements Module {
            public final String accessibilityText;
            public final String iconToken;
            public final boolean isDisabled;
            public final String mainText;
            public final Accessory.Push push;

            public ListItemModule(String str, String str2, boolean z, String str3, Accessory.Push push) {
                str.getClass();
                str2.getClass();
                this.iconToken = str;
                this.mainText = str2;
                this.isDisabled = z;
                this.accessibilityText = str3;
                this.push = push;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ListItemModule)) {
                    return false;
                }
                ListItemModule listItemModule = (ListItemModule) obj;
                return Intrinsics.areEqual(this.iconToken, listItemModule.iconToken) && Intrinsics.areEqual(this.mainText, listItemModule.mainText) && this.isDisabled == listItemModule.isDisabled && Intrinsics.areEqual(this.accessibilityText, listItemModule.accessibilityText) && Intrinsics.areEqual(this.push, listItemModule.push);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.iconToken.hashCode() * 31, 31, this.mainText), 31, this.isDisabled);
                String str = this.accessibilityText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                Accessory.Push push = this.push;
                return hashCode + (push != null ? push.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ListItemModule(iconToken=", this.iconToken, ", mainText=", this.mainText, ", isDisabled=");
                NavAction$$ExternalSyntheticOutline0.m(m, this.isDisabled, ", accessibilityText=", this.accessibilityText, ", push=");
                m.append(this.push);
                m.append(")");
                return m.toString();
            }
        }

        public final class NextUpCard implements Module {
            public final String accessibilityText;
            public final String actionId;
            public final String ctaText;
            public final Icon.LegacyAvatar icon;
            public final String id;
            public final Image image;
            public final boolean isDisabled;
            public final boolean isDismissible;
            public final String subtitle;
            public final String title;

            public NextUpCard(String str, Icon.LegacyAvatar legacyAvatar, Image image, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
                this.id = str;
                this.icon = legacyAvatar;
                this.image = image;
                this.title = str2;
                this.subtitle = str3;
                this.ctaText = str4;
                this.accessibilityText = str5;
                this.isDisabled = z;
                this.isDismissible = z2;
                this.actionId = str6;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NextUpCard)) {
                    return false;
                }
                NextUpCard nextUpCard = (NextUpCard) obj;
                return this.id.equals(nextUpCard.id) && this.icon.equals(nextUpCard.icon) && Intrinsics.areEqual(this.image, nextUpCard.image) && this.title.equals(nextUpCard.title) && Intrinsics.areEqual(this.subtitle, nextUpCard.subtitle) && Intrinsics.areEqual(this.ctaText, nextUpCard.ctaText) && Intrinsics.areEqual(this.accessibilityText, nextUpCard.accessibilityText) && this.isDisabled == nextUpCard.isDisabled && this.isDismissible == nextUpCard.isDismissible && this.actionId.equals(nextUpCard.actionId);
            }

            public final int hashCode() {
                int hashCode = (this.icon.hashCode() + (this.id.hashCode() * 31)) * 31;
                Image image = this.image;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.title);
                String str = this.subtitle;
                int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.ctaText;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accessibilityText;
                return this.actionId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isDisabled), 31, this.isDismissible);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NextUpCard(id=");
                sb.append(this.id);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(", image=");
                sb.append(this.image);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", ctaText=", this.ctaText, ", accessibilityText=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.accessibilityText, ", isDisabled=", this.isDisabled, ", isDismissible=");
                sb.append(this.isDismissible);
                sb.append(", actionId=");
                sb.append(this.actionId);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class ShippingTimeline implements Module {
            public final ArrayList items;
            public final String title;

            public final class ShippingTimelineItem {
                public final Accessory.Button button;
                public final String infoText;
                public final String mainText;
                public final Prominence prominence;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Prominence {
                    public static final /* synthetic */ Prominence[] $VALUES;
                    public static final Prominence PROMINENT;
                    public static final Prominence SUBTLE;

                    static {
                        Prominence prominence = new Prominence("PROMINENT", 0);
                        PROMINENT = prominence;
                        Prominence prominence2 = new Prominence("SUBTLE", 1);
                        SUBTLE = prominence2;
                        $VALUES = new Prominence[]{prominence, prominence2};
                    }

                    public static Prominence valueOf(String str) {
                        return (Prominence) Enum.valueOf(Prominence.class, str);
                    }

                    public static Prominence[] values() {
                        return (Prominence[]) $VALUES.clone();
                    }
                }

                public ShippingTimelineItem(String str, String str2, Prominence prominence, Accessory.Button button) {
                    this.mainText = str;
                    this.infoText = str2;
                    this.prominence = prominence;
                    this.button = button;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ShippingTimelineItem)) {
                        return false;
                    }
                    ShippingTimelineItem shippingTimelineItem = (ShippingTimelineItem) obj;
                    return this.mainText.equals(shippingTimelineItem.mainText) && Intrinsics.areEqual(this.infoText, shippingTimelineItem.infoText) && this.prominence == shippingTimelineItem.prominence && Intrinsics.areEqual(this.button, shippingTimelineItem.button);
                }

                public final int hashCode() {
                    int hashCode = this.mainText.hashCode() * 31;
                    String str = this.infoText;
                    int hashCode2 = (this.prominence.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                    Accessory.Button button = this.button;
                    return hashCode2 + (button != null ? button.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShippingTimelineItem(mainText=", this.mainText, ", infoText=", this.infoText, ", prominence=");
                    m.append(this.prominence);
                    m.append(", button=");
                    m.append(this.button);
                    m.append(")");
                    return m.toString();
                }
            }

            public ShippingTimeline(String str, ArrayList arrayList) {
                this.title = str;
                this.items = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShippingTimeline)) {
                    return false;
                }
                ShippingTimeline shippingTimeline = (ShippingTimeline) obj;
                return this.title.equals(shippingTimeline.title) && this.items.equals(shippingTimeline.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.items, "ShippingTimeline(title=", this.title, ", items=", ")");
            }
        }

        public final class StatusModule implements Module {
            public final String accessibilityText;
            public final Accessory accessory;
            public final Accessory.Button bottomButton;
            public final Icon icon;
            public final String infoText;
            public final boolean isDisabled;
            public final String mainText;

            public StatusModule(Icon icon, String str, String str2, String str3, boolean z, Accessory accessory, Accessory.Button button, int i) {
                button = (i & 64) != 0 ? null : button;
                this.icon = icon;
                this.mainText = str;
                this.infoText = str2;
                this.accessibilityText = str3;
                this.isDisabled = z;
                this.accessory = accessory;
                this.bottomButton = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StatusModule)) {
                    return false;
                }
                StatusModule statusModule = (StatusModule) obj;
                return this.icon.equals(statusModule.icon) && Intrinsics.areEqual(this.mainText, statusModule.mainText) && Intrinsics.areEqual(this.infoText, statusModule.infoText) && Intrinsics.areEqual(this.accessibilityText, statusModule.accessibilityText) && this.isDisabled == statusModule.isDisabled && Intrinsics.areEqual(this.accessory, statusModule.accessory) && Intrinsics.areEqual(this.bottomButton, statusModule.bottomButton);
            }

            public final int hashCode() {
                int hashCode = this.icon.hashCode() * 31;
                String str = this.mainText;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.infoText;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accessibilityText;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isDisabled);
                Accessory accessory = this.accessory;
                int hashCode4 = (m + (accessory == null ? 0 : accessory.hashCode())) * 31;
                Accessory.Button button = this.bottomButton;
                return (hashCode4 + (button != null ? button.hashCode() : 0)) * 31;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StatusModule(icon=");
                sb.append(this.icon);
                sb.append(", mainText=");
                sb.append(this.mainText);
                sb.append(", infoText=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.infoText, ", accessibilityText=", this.accessibilityText, ", isDisabled=");
                sb.append(this.isDisabled);
                sb.append(", accessory=");
                sb.append(this.accessory);
                sb.append(", bottomButton=");
                sb.append(this.bottomButton);
                sb.append(", onFullyVisible=null)");
                return sb.toString();
            }
        }

        public final class HeroCard implements Module {
            public final HeroCardDetails cardDetails;
            public final boolean disableFilament;
            public final Accessory.Button leftButton;
            public final PrepurchaseCardData prepurchaseCardData;
            public final Accessory.Button rightButton;
            public final boolean showCardSpinner;
            public final boolean use3D;

            public HeroCard(HeroCardDetails heroCardDetails, boolean z, Accessory.Button button, Accessory.Button button2, boolean z2, boolean z3, PrepurchaseCardData prepurchaseCardData) {
                this.cardDetails = heroCardDetails;
                this.showCardSpinner = z;
                this.leftButton = button;
                this.rightButton = button2;
                this.use3D = z2;
                this.disableFilament = z3;
                this.prepurchaseCardData = prepurchaseCardData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeroCard)) {
                    return false;
                }
                HeroCard heroCard = (HeroCard) obj;
                return Intrinsics.areEqual(this.cardDetails, heroCard.cardDetails) && this.showCardSpinner == heroCard.showCardSpinner && Intrinsics.areEqual(this.leftButton, heroCard.leftButton) && Intrinsics.areEqual(this.rightButton, heroCard.rightButton) && this.use3D == heroCard.use3D && this.disableFilament == heroCard.disableFilament && Intrinsics.areEqual(this.prepurchaseCardData, heroCard.prepurchaseCardData);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cardDetails.hashCode() * 31, 31, this.showCardSpinner);
                Accessory.Button button = this.leftButton;
                int hashCode = (m + (button == null ? 0 : button.hashCode())) * 31;
                Accessory.Button button2 = this.rightButton;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (button2 == null ? 0 : button2.hashCode())) * 31, 31, this.use3D), 31, this.disableFilament);
                PrepurchaseCardData prepurchaseCardData = this.prepurchaseCardData;
                return m2 + (prepurchaseCardData != null ? prepurchaseCardData.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HeroCard(cardDetails=");
                sb.append(this.cardDetails);
                sb.append(", showCardSpinner=");
                sb.append(this.showCardSpinner);
                sb.append(", leftButton=");
                sb.append(this.leftButton);
                sb.append(", rightButton=");
                sb.append(this.rightButton);
                sb.append(", use3D=");
                re$$ExternalSyntheticOutline0.m(sb, this.use3D, ", disableFilament=", this.disableFilament, ", prepurchaseCardData=");
                sb.append(this.prepurchaseCardData);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ HeroCard(HeroCardDetails heroCardDetails, boolean z, boolean z2, int i) {
                this(heroCardDetails, false, null, null, z, (i & 32) != 0 ? false : z2, null);
            }
        }

        public final class HeroCardDetails {
            public final CardAnimation animation;
            public final CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardInteraction;
            public final CardTheme cardTheme;
            public final String cashtag;
            public final CustomizationImage customizationImage;
            public final String cvv;
            public final String exp;
            public final boolean isEnabled;
            public final boolean isLocked;
            public final String name;
            public final String pan;
            public final boolean showPrepurchaseContourText;

            public /* synthetic */ HeroCardDetails(CardTheme cardTheme, String str, String str2, String str3, String str4, CardAnimation.None none, int i) {
                this(cardTheme, null, str, str2, str3, "123", str4, true, false, false, (i & 1024) != 0 ? new CardAnimation.None(true, true) : none, null);
            }

            public static HeroCardDetails copy$default(HeroCardDetails heroCardDetails, CardTheme cardTheme, CustomizationImage customizationImage, boolean z) {
                String str = heroCardDetails.cashtag;
                String str2 = heroCardDetails.name;
                String str3 = heroCardDetails.pan;
                String str4 = heroCardDetails.cvv;
                String str5 = heroCardDetails.exp;
                boolean z2 = heroCardDetails.isLocked;
                boolean z3 = heroCardDetails.showPrepurchaseContourText;
                CardAnimation cardAnimation = heroCardDetails.animation;
                CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = heroCardDetails.cardInteraction;
                heroCardDetails.getClass();
                cardTheme.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                str5.getClass();
                cardAnimation.getClass();
                return new HeroCardDetails(cardTheme, customizationImage, str, str2, str3, str4, str5, z, z2, z3, cardAnimation, cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HeroCardDetails)) {
                    return false;
                }
                HeroCardDetails heroCardDetails = (HeroCardDetails) obj;
                return Intrinsics.areEqual(this.cardTheme, heroCardDetails.cardTheme) && Intrinsics.areEqual(this.customizationImage, heroCardDetails.customizationImage) && Intrinsics.areEqual(this.cashtag, heroCardDetails.cashtag) && Intrinsics.areEqual(this.name, heroCardDetails.name) && Intrinsics.areEqual(this.pan, heroCardDetails.pan) && Intrinsics.areEqual(this.cvv, heroCardDetails.cvv) && Intrinsics.areEqual(this.exp, heroCardDetails.exp) && this.isEnabled == heroCardDetails.isEnabled && this.isLocked == heroCardDetails.isLocked && this.showPrepurchaseContourText == heroCardDetails.showPrepurchaseContourText && Intrinsics.areEqual(this.animation, heroCardDetails.animation) && Intrinsics.areEqual(this.cardInteraction, heroCardDetails.cardInteraction);
            }

            public final int hashCode() {
                int hashCode = this.cardTheme.hashCode() * 31;
                CustomizationImage customizationImage = this.customizationImage;
                int hashCode2 = (hashCode + (customizationImage == null ? 0 : Arrays.hashCode(customizationImage.bytes))) * 31;
                String str = this.cashtag;
                int hashCode3 = (this.animation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.name), 31, this.pan), 31, this.cvv), 31, this.exp), 31, this.isEnabled), 31, this.isLocked), 31, this.showPrepurchaseContourText)) * 31;
                CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = this.cardInteraction;
                return hashCode3 + (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null ? cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HeroCardDetails(cardTheme=");
                sb.append(this.cardTheme);
                sb.append(", customizationImage=");
                sb.append(this.customizationImage);
                sb.append(", cashtag=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.cashtag, ", name=", this.name, ", pan=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.pan, ", cvv=", this.cvv, ", exp=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.exp, ", isEnabled=", this.isEnabled, ", isLocked=");
                re$$ExternalSyntheticOutline0.m(sb, this.isLocked, ", showPrepurchaseContourText=", this.showPrepurchaseContourText, ", animation=");
                sb.append(this.animation);
                sb.append(", cardInteraction=");
                sb.append(this.cardInteraction);
                sb.append(")");
                return sb.toString();
            }

            public HeroCardDetails(CardTheme cardTheme, CustomizationImage customizationImage, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, CardAnimation cardAnimation, CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1) {
                cardTheme.getClass();
                cardAnimation.getClass();
                this.cardTheme = cardTheme;
                this.customizationImage = customizationImage;
                this.cashtag = str;
                this.name = str2;
                this.pan = str3;
                this.cvv = str4;
                this.exp = str5;
                this.isEnabled = z;
                this.isLocked = z2;
                this.showPrepurchaseContourText = z3;
                this.animation = cardAnimation;
                this.cardInteraction = cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
            }
        }

        public interface Accessory {

            public final class Push implements Accessory {
                public final Function0 onClick;
                public final String text;

                public Push(String str, Function0 function0) {
                    function0.getClass();
                    this.text = str;
                    this.onClick = function0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Push)) {
                        return false;
                    }
                    Push push = (Push) obj;
                    return Intrinsics.areEqual(this.text, push.text) && Intrinsics.areEqual(this.onClick, push.onClick);
                }

                public final int hashCode() {
                    String str = this.text;
                    return this.onClick.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final String toString() {
                    return "Push(text=" + this.text + ", onClick=" + this.onClick + ")";
                }
            }

            public final class Button implements Accessory {
                public final String icon;
                public final boolean isDestructive;
                public final boolean isEnabled;
                public final boolean isLoading;
                public final Function0 onClick;
                public final Prominence prominence;
                public final String text;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Prominence {
                    public static final /* synthetic */ Prominence[] $VALUES;
                    public static final Prominence PROMINENT;
                    public static final Prominence STANDARD;
                    public static final Prominence SUBTLE;

                    static {
                        Prominence prominence = new Prominence("PROMINENT", 0);
                        PROMINENT = prominence;
                        Prominence prominence2 = new Prominence("STANDARD", 1);
                        STANDARD = prominence2;
                        Prominence prominence3 = new Prominence("SUBTLE", 2);
                        SUBTLE = prominence3;
                        $VALUES = new Prominence[]{prominence, prominence2, prominence3};
                    }

                    public static Prominence valueOf(String str) {
                        return (Prominence) Enum.valueOf(Prominence.class, str);
                    }

                    public static Prominence[] values() {
                        return (Prominence[]) $VALUES.clone();
                    }
                }

                public /* synthetic */ Button(String str, Prominence prominence, boolean z, boolean z2, String str2, Function0 function0, int i) {
                    this(str, (i & 2) != 0 ? Prominence.STANDARD : prominence, false, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? new AlertBannerKt$$ExternalSyntheticLambda0(15) : function0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return Intrinsics.areEqual(this.text, button.text) && this.prominence == button.prominence && this.isDestructive == button.isDestructive && this.isLoading == button.isLoading && this.isEnabled == button.isEnabled && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.onClick, button.onClick);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.prominence.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.isDestructive), 31, this.isLoading), 31, this.isEnabled);
                    String str = this.icon;
                    return this.onClick.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(text=");
                    sb.append(this.text);
                    sb.append(", prominence=");
                    sb.append(this.prominence);
                    sb.append(", isDestructive=");
                    re$$ExternalSyntheticOutline0.m(sb, this.isDestructive, ", isLoading=", this.isLoading, ", isEnabled=");
                    NavAction$$ExternalSyntheticOutline0.m(sb, this.isEnabled, ", icon=", this.icon, ", onClick=");
                    sb.append(this.onClick);
                    sb.append(")");
                    return sb.toString();
                }

                public Button(String str, Prominence prominence, boolean z, boolean z2, boolean z3, String str2, Function0 function0) {
                    str.getClass();
                    prominence.getClass();
                    function0.getClass();
                    this.text = str;
                    this.prominence = prominence;
                    this.isDestructive = z;
                    this.isLoading = z2;
                    this.isEnabled = z3;
                    this.icon = str2;
                    this.onClick = function0;
                }
            }
        }
    }
}
