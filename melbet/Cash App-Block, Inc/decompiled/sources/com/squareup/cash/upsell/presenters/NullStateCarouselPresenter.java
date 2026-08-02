package com.squareup.cash.upsell.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.trifle.KeyHandle;
import app.cash.trifle.delegates.EndEntity$Factory;
import app.cash.versioned.VersionedKt;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class NullStateCarouselPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final Flow configFlow;
    public final RealRouter router;
    public final String token = Boxes$$ExternalSyntheticOutline1.m();

    public NullStateCarouselPresenter(Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        this.analytics = analytics;
        this.configFlow = flow;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127 A[EDGE_INSN: B:39:0x0127->B:40:0x0127 BREAK  A[LOOP:1: B:11:0x005b->B:73:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[LOOP:1: B:11:0x005b->B:73:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cf  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NullStateCarouselViewModel models(Flow flow, Composer composer, int i) {
        NullStateCarouselViewModel content;
        Image image;
        NullStateCarouselViewModel.Content.Page page;
        String str;
        Card card;
        KeyHandle.Companion companion;
        Card card2;
        KeyHandle.Companion companion2;
        Card card3;
        KeyHandle.Companion companion3;
        KeyHandle.Companion companion4;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-29869488);
        MutableState collectAsState = Updater.collectAsState(this.configFlow, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppPresenter$models$1$1(flow, (Continuation) null, (MoleculePresenter) this, (Object) collectAsState, 27));
        if (((CardTabNullStateSwipeConfig) collectAsState.getValue()) == null) {
            content = NullStateCarouselViewModel.Loading.INSTANCE;
        } else {
            CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig = (CardTabNullStateSwipeConfig) collectAsState.getValue();
            cardTabNullStateSwipeConfig.getClass();
            List<CardTabNullStateSwipeConfig.SwipePage> list = cardTabNullStateSwipeConfig.swipe_pages;
            ArrayList arrayList = new ArrayList();
            for (CardTabNullStateSwipeConfig.SwipePage swipePage : list) {
                Iterator it = swipePage.elements.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        image = null;
                        break;
                    }
                    EndEntity$Factory endEntity$Factory = ((CardTabNullStateSwipeConfig.SwipePage.SwipePageElement) it.next()).swipe_page_element;
                    if (endEntity$Factory != null) {
                        CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement = endEntity$Factory instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement ? (CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement) endEntity$Factory : null;
                        CardTabNullStateSwipeConfig.VisualElement visualElement = cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement != null ? cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$VisualElement.value : null;
                        if (visualElement != null) {
                            VersionedKt versionedKt = visualElement.visual_element;
                            if (versionedKt != null) {
                                CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card cardTabNullStateSwipeConfig$VisualElement$VisualElement$Card = versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card ? (CardTabNullStateSwipeConfig$VisualElement$VisualElement$Card) versionedKt : null;
                                Card card4 = cardTabNullStateSwipeConfig$VisualElement$VisualElement$Card != null ? cardTabNullStateSwipeConfig$VisualElement$VisualElement$Card.value : null;
                                if (card4 != null && (companion4 = card4.asset) != null) {
                                    Card$Asset$Image card$Asset$Image = companion4 instanceof Card$Asset$Image ? (Card$Asset$Image) companion4 : null;
                                    image = card$Asset$Image != null ? card$Asset$Image.value : null;
                                    if (image != null) {
                                        if (image == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (versionedKt != null) {
                                CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts = versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts ? (CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts) versionedKt : null;
                                CardWithBoosts cardWithBoosts = cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts != null ? cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBoosts.value : null;
                                if (cardWithBoosts != null && (card3 = cardWithBoosts.card) != null && (companion3 = card3.asset) != null) {
                                    Card$Asset$Image card$Asset$Image2 = companion3 instanceof Card$Asset$Image ? (Card$Asset$Image) companion3 : null;
                                    if (card$Asset$Image2 != null) {
                                        image = card$Asset$Image2.value;
                                        if (image == null) {
                                            if (versionedKt != null) {
                                                CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits = versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits ? (CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits) versionedKt : null;
                                                CardWithBenefits cardWithBenefits = cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits != null ? cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithBenefits.value : null;
                                                if (cardWithBenefits != null && (card2 = cardWithBenefits.card) != null && (companion2 = card2.asset) != null) {
                                                    Card$Asset$Image card$Asset$Image3 = companion2 instanceof Card$Asset$Image ? (Card$Asset$Image) companion2 : null;
                                                    if (card$Asset$Image3 != null) {
                                                        image = card$Asset$Image3.value;
                                                        if (image == null) {
                                                            if (versionedKt != null) {
                                                                CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps = versionedKt instanceof CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps ? (CardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps) versionedKt : null;
                                                                CardWithSignatureStamps cardWithSignatureStamps = cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps != null ? cardTabNullStateSwipeConfig$VisualElement$VisualElement$CardWithSignatureStamps.value : null;
                                                                if (cardWithSignatureStamps != null && (card = cardWithSignatureStamps.card) != null && (companion = card.asset) != null) {
                                                                    Card$Asset$Image card$Asset$Image4 = companion instanceof Card$Asset$Image ? (Card$Asset$Image) companion : null;
                                                                    if (card$Asset$Image4 != null) {
                                                                        image = card$Asset$Image4.value;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            image = null;
                                            if (image == null) {
                                            }
                                        }
                                        if (image == null) {
                                        }
                                    }
                                }
                            }
                            image = null;
                            if (image == null) {
                            }
                            if (image == null) {
                            }
                        }
                    }
                    image = null;
                    if (image == null) {
                    }
                }
                if (image != null) {
                    List list2 = swipePage.elements;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        EndEntity$Factory endEntity$Factory2 = ((CardTabNullStateSwipeConfig.SwipePage.SwipePageElement) it2.next()).swipe_page_element;
                        if (endEntity$Factory2 != null) {
                            CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement = endEntity$Factory2 instanceof CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement ? (CardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement) endEntity$Factory2 : null;
                            TextElement textElement = cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement != null ? cardTabNullStateSwipeConfig$SwipePage$SwipePageElement$SwipePageElement$TextElement.value : null;
                            if (textElement != null) {
                                str = textElement.text;
                                if (str == null) {
                                    arrayList2.add(str);
                                }
                            }
                        }
                        str = null;
                        if (str == null) {
                        }
                    }
                    if (arrayList2.size() >= 2) {
                        page = new NullStateCarouselViewModel.Content.Page(image, (String) arrayList2.get(0), (String) arrayList2.get(1));
                        if (page == null) {
                            arrayList.add(page);
                        }
                    }
                }
                page = null;
                if (page == null) {
                }
            }
            CardTabNullStateSwipeConfig cardTabNullStateSwipeConfig2 = (CardTabNullStateSwipeConfig) collectAsState.getValue();
            cardTabNullStateSwipeConfig2.getClass();
            ButtonElement buttonElement = cardTabNullStateSwipeConfig2.button;
            buttonElement.getClass();
            String str2 = buttonElement.text;
            str2.getClass();
            content = new NullStateCarouselViewModel.Content(str2, arrayList);
        }
        gapComposer.end(false);
        return content;
    }
}
