package com.squareup.cash.upsell.presenters;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.versioned.VersionedKt;
import com.squareup.cash.R;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.permissions.AndroidPermissionChecker$create$1$denied$$inlined$filter$1;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$special$$inlined$map$1$2;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.protos.cash.composer.app.ButtonElement;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.composer.app.Card$Asset$Image;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps;
import com.squareup.protos.cash.composer.app.CardWithBenefits;
import com.squareup.protos.cash.composer.app.CardWithBoosts;
import com.squareup.protos.cash.composer.app.CardWithSignatureStamps;
import com.squareup.protos.cash.composer.app.TextElement;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NullStateSwipeConfigProvider implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final Object fallback;

    public NullStateSwipeConfigProvider(AndroidStringManager androidStringManager) {
        this.$r8$classId = 0;
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement visualPageElement = visualPageElement(new CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card(new Card(new Card$Asset$Image(new Image("https://cash-f.squarecdn.com/static/swipe_summary_card_upsell_v2_light_04292021.png", "https://cash-f.squarecdn.com/static/swipe_summary_card_upsell_v2_dark_04292021.png", 4)))));
        String str = androidStringManager.get(R.string.swipe_page1_title_text_fallback);
        TextElement.TextStyle textStyle = TextElement.TextStyle.TITLE;
        CardTabNullStateSwipeConfig.SwipePage.SwipePageElement textPageElement = textPageElement(str, textStyle);
        String str2 = androidStringManager.get(R.string.swipe_page1_subtitle_text_fallback);
        TextElement.TextStyle textStyle2 = TextElement.TextStyle.SUBTITLE;
        CardTabNullStateSwipeConfig.SwipePage swipePage = new CardTabNullStateSwipeConfig.SwipePage(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement[]{visualPageElement, textPageElement, textPageElement(str2, textStyle2)}), "card-tab-null-state-swipe-page-1-offline-fallback");
        Card card = new Card(new Card$Asset$Image(new Image("https://cash-f.squarecdn.com/static/swipe_boosts_card_upsell_v2_light_04292021.png", "https://cash-f.squarecdn.com/static/swipe_boosts_card_upsell_v2_dark_04292021.png", 4)));
        ByteString byteString = ByteString.EMPTY;
        this.fallback = new CardTabNullStateSwipeConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTabNullStateSwipeConfig.SwipePage[]{swipePage, new CardTabNullStateSwipeConfig.SwipePage(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement[]{visualPageElement(new CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts(new CardWithBoosts(card, byteString))), textPageElement(androidStringManager.get(R.string.swipe_page2_title_text_fallback), textStyle), textPageElement(androidStringManager.get(R.string.swipe_page2_subtitle_text_fallback_offers), textStyle2)}), "card-tab-null-state-swipe-page-2-offline-fallback"), new CardTabNullStateSwipeConfig.SwipePage(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement[]{visualPageElement(new CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps(new CardWithSignatureStamps(new Card(new Card$Asset$Image(new Image("https://cash-f.squarecdn.com/static/swipe_personalization_card_upsell_v2_light_04292021.png", "https://cash-f.squarecdn.com/static/swipe_personalization_card_upsell_v2_dark_04292021.png", 4))), byteString))), textPageElement(androidStringManager.get(R.string.swipe_page3_title_text_fallback), textStyle), textPageElement(androidStringManager.get(R.string.swipe_page3_subtitle_text_fallback), textStyle2)}), "card-tab-null-state-swipe-page-3-offline-fallback"), new CardTabNullStateSwipeConfig.SwipePage(CollectionsKt__CollectionsKt.listOf((Object[]) new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement[]{visualPageElement(new CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits(new CardWithBenefits(new Card(new Card$Asset$Image(new Image("https://cash-f.squarecdn.com/static/swipe_banking_card_upsell_v2_light_04292021.png", "https://cash-f.squarecdn.com/static/swipe_banking_card_upsell_v2_dark_04292021.png", 4))), byteString))), textPageElement(androidStringManager.get(R.string.swipe_page4_title_text_fallback), textStyle), textPageElement(androidStringManager.get(R.string.swipe_page4_subtitle_text_fallback), textStyle2)}), "card-tab-null-state-swipe-page-4-offline-fallback")}), new ButtonElement(androidStringManager.get(R.string.swipe_cta_button_text_fallback), ButtonElement.ButtonStyle.PRIMARY, "https://internal.cash.app/dl/scenario/REQUEST_PHYSICAL_CARD", "card-tab-null-state-swipe-button-fallback", byteString), "card-tab-null-state-swipe-offline-fallback", byteString);
    }

    public static CardTabNullStateSwipeConfig.SwipePage.SwipePageElement textPageElement(String str, TextElement.TextStyle textStyle) {
        return new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement(new CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement(new TextElement(str, textStyle, ByteString.EMPTY)));
    }

    public static CardTabNullStateSwipeConfig.SwipePage.SwipePageElement visualPageElement(VersionedKt versionedKt) {
        return new CardTabNullStateSwipeConfig.SwipePage.SwipePageElement(new CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement(new CardTabNullStateSwipeConfig.VisualElement(versionedKt, ByteString.EMPTY)));
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 8;
        int i4 = 13;
        int i5 = 4;
        int i6 = 16;
        int i7 = 20;
        int i8 = 0;
        int i9 = 19;
        int i10 = 25;
        Object obj = this.fallback;
        switch (i) {
            case 0:
                Object emit = flowCollector.emit((CardTabNullStateSwipeConfig) obj, continuation);
                if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj).collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, 2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect2 = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj).collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, i5), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect3 = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj).collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, 6), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect4 = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj).collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect5 = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj).collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, 17), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect6 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, i2), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect7 = ((AndroidPermissionChecker$create$1$denied$$inlined$filter$1) obj).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, i3), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                ((StateFlowImpl) obj).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, 18), continuation);
                break;
            case 9:
                Object collect8 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, i7), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect9 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, 28), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect10 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, 1), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect11 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfilePrivacyPresenter$models$lambda$8$$inlined$map$1$2(0), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect12 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect13 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect14 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, 10), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect15 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect16 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, 15), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect17 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, 23), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect18 = ((CashQrScannerPresenter$special$$inlined$filter$1) obj).collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, i10), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect19 = ((RealContactRepository$contacts$$inlined$map$1) obj).collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i5), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect20 = ((RealRecipientRepository$suggestions$$inlined$map$1) obj).collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i6), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect21 = ((RealFeatureFlagManager$values$$inlined$map$1) obj).collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i9), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect22 = ((RealRecipientRepository$suggestions$$inlined$map$1) obj).collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 21), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect23 = ((RealRecipientRepository$suggestions$$inlined$map$1) obj).collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect24 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj).collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect25 = ((FlowKt__MergeKt$flatMapMerge$$inlined$map$1) obj).collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect26 = ((SquareAccountStore$userFlow$$inlined$map$1) obj).collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i9), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect27 = ((SquareAccountStore$userFlow$$inlined$map$1) obj).collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i10), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect28 = ((AssignedJobProviderKt$jobs$$inlined$map$1) obj).collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, i10), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ NullStateSwipeConfigProvider(Flow flow, int i) {
        this.$r8$classId = i;
        this.fallback = flow;
    }
}
