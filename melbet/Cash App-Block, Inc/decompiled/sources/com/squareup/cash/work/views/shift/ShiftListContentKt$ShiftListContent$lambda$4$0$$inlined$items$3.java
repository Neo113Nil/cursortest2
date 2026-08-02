package com.squareup.cash.work.views.shift;

import _COROUTINE.ArtificialStackFrames;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1;
import androidx.compose.material3.TooltipKt$animateTooltip$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewEvent;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.cart.CartBannerViewKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactMethod;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorRowViewModel;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeRowViewModel;
import com.squareup.cash.investing.viewmodels.search.CategoryTile$CategoryCarousel;
import com.squareup.cash.investing.viewmodels.search.DisclosureModel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchRow;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.investing.viewmodels.search.SearchRowHeader;
import com.squareup.cash.investing.viewmodels.search.SecurityCarousel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.OverflowMenuItem;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.Entry;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$2;

/* loaded from: classes6.dex */
public final class ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3 implements Function4 {
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function1 $onEvent$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(int i, Function1 function1, List list) {
        this.$r8$classId = i;
        this.$items = list;
        this.$onEvent$inlined = function1;
    }

    private final Object invoke$com$squareup$cash$moneybot$views$menu$MoneybotOverflowMenuViewKt$buildLoadedRecentChatHistory$lambda$10$0$$inlined$items$default$4(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            RecentChatHistoryViewModel$Loaded.Session session = (RecentChatHistoryViewModel$Loaded.Session) this.$items.get(intValue);
            gapComposer.startReplaceGroup(1128864110);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2074824237, new DateInputKt$DateInputTextField$3(session, 6), gapComposer);
            Function1 function1 = this.$onEvent$inlined;
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(session);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CardModelView$1$3$4$2(14, function1, session);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(session);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new KClassImpl$Data$$Lambda$23(7, function1, session, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, animateItem$default, function0, false, false, null, null, 0L, push, (Function0) rememberedValue3, gapComposer, 805306374, 504);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$nearby$NearbyPeopleOverflowSheetViewKt$NearbyPeopleOverflowSheetContent$lambda$0$0$0$$inlined$items$default$4(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        final int i2 = 0;
        final int i3 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            final NearbyPerson nearbyPerson = (NearbyPerson) this.$items.get(intValue);
            gapComposer.startReplaceGroup(180425175);
            final Function1 function1 = this.$onEvent$inlined;
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(nearbyPerson);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj5 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj5) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.payments.views.nearby.NearbyPeopleOverflowSheetViewKt$NearbyPeopleOverflowSheetContent$1$1$1$2$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                function1.invoke(new NearbyPeopleOverflowSheetViewEvent.OnPersonClicked(nearbyPerson));
                                break;
                            default:
                                function1.invoke(new NearbyPeopleOverflowSheetViewEvent.OnAvatarClicked(nearbyPerson));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(nearbyPerson);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj5) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.payments.views.nearby.NearbyPeopleOverflowSheetViewKt$NearbyPeopleOverflowSheetContent$1$1$1$2$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                function1.invoke(new NearbyPeopleOverflowSheetViewEvent.OnPersonClicked(nearbyPerson));
                                break;
                            default:
                                function1.invoke(new NearbyPeopleOverflowSheetViewEvent.OnAvatarClicked(nearbyPerson));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            NearbyPayRequestViewKt.NearbyPersonRow(nearbyPerson, function0, (Function0) rememberedValue2, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE), gapComposer, 0);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$notifications$ChannelListViewKt$ChannelList$lambda$0$0$0$2$0$$inlined$items$default$8(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            SponsoredFamilyMember sponsoredFamilyMember = (SponsoredFamilyMember) this.$items.get(intValue);
            gapComposer.startReplaceGroup(-619471259);
            ChannelListViewKt.SponsoredAccountCellItem(this.$onEvent$inlined, sponsoredFamilyMember, sponsoredFamilyMember.notificationsEnabled, true, gapComposer, 3072);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$taptopay$views$components$DescriptionSuggestionsKt$ScrollingCarousel$lambda$0$0$$inlined$items$default$4(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            String str = (String) this.$items.get(intValue);
            gapComposer.startReplaceGroup(1516252118);
            Object obj5 = this.$onEvent$inlined;
            boolean changed = gapComposer.changed(obj5) | gapComposer.changed(str);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardModelView$1$3$4$2(25, obj5, str);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-362079296, new DatePickerKt$IconButtonWithTooltip$1(str, 5), gapComposer), gapComposer, 1572864, 62);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$stripe$android$financialconnections$features$common$SharedPartnerAuthKt$PrePaneContent$lambda$2$0$$inlined$items$default$4(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            Entry entry = (Entry) this.$items.get(intValue);
            gapComposer.startReplaceGroup(1865382624);
            if (entry instanceof Entry.Image) {
                gapComposer.startReplaceGroup(-2018035076);
                ListItemKt.PrepaneImage((Entry.Image) entry, gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(entry instanceof Entry.Text)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2018036349, false);
                }
                gapComposer.startReplaceGroup(1865494502);
                TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(((Entry.Text) entry).content)), this.$onEvent$inlined, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 24.0f, RecyclerView.DECELERATION_RATE, 2), null, 0, 0, gapComposer, 3072, 112);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Icons icons;
        long j;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.$r8$classId;
        int i19 = 8;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final Function1 function1 = this.$onEvent$inlined;
        List list = this.$items;
        int i20 = 6;
        final int i21 = 0;
        final int i22 = 1;
        switch (i18) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    ShiftListDayViewModel shiftListDayViewModel = (ShiftListDayViewModel) list.get(intValue);
                    gapComposer.startReplaceGroup(1723294993);
                    ShiftListViewKt.ShiftListDaySection(shiftListDayViewModel, function1, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    CreateCartErrorViewModel createCartErrorViewModel = (CreateCartErrorViewModel) list.get(intValue3);
                    gapComposer2.startReplaceGroup(-2144955010);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 8.0f, gapComposer2);
                    CartBannerViewKt.CreateCartErrorBanner(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), createCartErrorViewModel, function1, gapComposer2, 6);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((GapComposer) composer3).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    LocalBrandLocationCartViewModel.Selection selection = (LocalBrandLocationCartViewModel.Selection) list.get(intValue5);
                    gapComposer3.startReplaceGroup(-1202570393);
                    LocalBrandLocationCartViewKt.CartSelectionItem(selection, function1, gapComposer3, 0);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                LazyItemScopeImpl lazyItemScopeImpl4 = (LazyItemScopeImpl) obj;
                int intValue7 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((GapComposer) composer4).changed(lazyItemScopeImpl4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((GapComposer) composer4).changed(intValue7) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    CreateCartErrorViewModel createCartErrorViewModel2 = (CreateCartErrorViewModel) list.get(intValue7);
                    gapComposer4.startReplaceGroup(-342955145);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
                    boolean changed = gapComposer4.changed(function1) | gapComposer4.changedInstance(createCartErrorViewModel2);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    Object obj5 = rememberedValue;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(r14, function1, createCartErrorViewModel2);
                        gapComposer4.updateRememberedValue(cardModelView$1$3$4$2);
                        obj5 = cardModelView$1$3$4$2;
                    }
                    CartBannerViewKt.CreateCartErrorBanner(m302paddingqDBjuR0$default, createCartErrorViewModel2, (Function0) obj5, gapComposer4, 6);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                LazyItemScopeImpl lazyItemScopeImpl5 = (LazyItemScopeImpl) obj;
                int intValue9 = ((Number) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((GapComposer) composer5).changed(lazyItemScopeImpl5) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((GapComposer) composer5).changed(intValue9) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    LocalCashBalanceViewModel.Activity.Row row = (LocalCashBalanceViewModel.Activity.Row) list.get(intValue9);
                    gapComposer5.startReplaceGroup(1370604960);
                    boolean changed2 = gapComposer5.changed(function1);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(r13, function1);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    LocalMapKt.LocalCashActivityRow(row, (Function1) rememberedValue2, gapComposer5, 0);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LazyItemScopeImpl lazyItemScopeImpl6 = (LazyItemScopeImpl) obj;
                int intValue11 = ((Number) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((GapComposer) composer6).changed(lazyItemScopeImpl6) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((GapComposer) composer6).changed(intValue11) ? 32 : 16;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                    BrandCollectionModel.Location location = (BrandCollectionModel.Location) list.get(intValue11);
                    gapComposer6.startReplaceGroup(881684360);
                    LocalHomeViewKt.LocalBrandCollectionLocation(new PaddingValuesImpl(16.0f, 12.0f, 16.0f, 12.0f), location, function1, gapComposer6, 48);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj;
                int intValue13 = ((Number) obj2).intValue();
                Composer composer7 = (Composer) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((GapComposer) composer7).changed(lazyGridItemScopeImpl) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((GapComposer) composer7).changed(intValue13) ? 32 : 16;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                    final MarketingMessagesViewModel.MessageTile messageTile = (MarketingMessagesViewModel.MessageTile) list.get(intValue13);
                    gapComposer7.startReplaceGroup(-293240706);
                    boolean changed3 = gapComposer7.changed(function1) | gapComposer7.changedInstance(messageTile);
                    Object rememberedValue3 = gapComposer7.rememberedValue();
                    Object obj6 = rememberedValue3;
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        Function0 function0 = new Function0() { // from class: app.cash.local.views.marketingmessages.MarketingMessagesKt$MarketingMessages$1$4$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i23 = i21;
                                MarketingMessagesViewModel.MessageTile messageTile2 = messageTile;
                                Function1 function12 = function1;
                                switch (i23) {
                                    case 0:
                                        function12.invoke(new MarketingMessagesViewEvent.MessageClicked(messageTile2.marketingMessage));
                                        break;
                                    default:
                                        function12.invoke(new MarketingMessagesViewEvent.BrandProfileClicked(messageTile2.marketingMessage.brandSpot));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer7.updateRememberedValue(function0);
                        obj6 = function0;
                    }
                    Function0 function02 = (Function0) obj6;
                    boolean changed4 = gapComposer7.changed(function1) | gapComposer7.changedInstance(messageTile);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    Object obj7 = rememberedValue4;
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        Function0 function03 = new Function0() { // from class: app.cash.local.views.marketingmessages.MarketingMessagesKt$MarketingMessages$1$4$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i23 = i22;
                                MarketingMessagesViewModel.MessageTile messageTile2 = messageTile;
                                Function1 function12 = function1;
                                switch (i23) {
                                    case 0:
                                        function12.invoke(new MarketingMessagesViewEvent.MessageClicked(messageTile2.marketingMessage));
                                        break;
                                    default:
                                        function12.invoke(new MarketingMessagesViewEvent.BrandProfileClicked(messageTile2.marketingMessage.brandSpot));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer7.updateRememberedValue(function03);
                        obj7 = function03;
                    }
                    MarketingMessageKt.MarketingMessageTile(null, messageTile, function02, (Function0) obj7, gapComposer7, 0);
                    gapComposer7.end(false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LazyItemScopeImpl lazyItemScopeImpl7 = (LazyItemScopeImpl) obj;
                int intValue15 = ((Number) obj2).intValue();
                Composer composer8 = (Composer) obj3;
                int intValue16 = ((Number) obj4).intValue();
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (((GapComposer) composer8).changed(lazyItemScopeImpl7) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= ((GapComposer) composer8).changed(intValue15) ? 32 : 16;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                    AvatarCarouselEntry avatarCarouselEntry = (AvatarCarouselEntry) list.get(intValue15);
                    gapComposer8.startReplaceGroup(-1452250350);
                    AvatarEntry avatarEntry = avatarCarouselEntry.avatarEntry;
                    String str = avatarCarouselEntry.name;
                    String str2 = avatarCarouselEntry.onClickLabel;
                    boolean changed5 = gapComposer8.changed(function1) | gapComposer8.changed(avatarCarouselEntry);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    Object obj8 = rememberedValue5;
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$22 = new CardModelView$1$3$4$2(7, function1, avatarCarouselEntry);
                        gapComposer8.updateRememberedValue(cardModelView$1$3$4$22);
                        obj8 = cardModelView$1$3$4$22;
                    }
                    DebugUtils.AvatarCarouselItem(avatarEntry, (Function0) obj8, null, str, str2, gapComposer8, 0);
                    gapComposer8.end(false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LazyItemScopeImpl lazyItemScopeImpl8 = (LazyItemScopeImpl) obj;
                int intValue17 = ((Number) obj2).intValue();
                Composer composer9 = (Composer) obj3;
                int intValue18 = ((Number) obj4).intValue();
                if ((intValue18 & 6) == 0) {
                    i9 = intValue18 | (((GapComposer) composer9).changed(lazyItemScopeImpl8) ? 4 : 2);
                } else {
                    i9 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i9 |= ((GapComposer) composer9).changed(intValue17) ? 32 : 16;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                    Merchant merchant = (Merchant) list.get(intValue17);
                    gapComposer9.startReplaceGroup(-1873325289);
                    boolean changed6 = gapComposer9.changed(function1) | gapComposer9.changedInstance(merchant);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    Object obj9 = rememberedValue6;
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$23 = new CardModelView$1$3$4$2(i19, function1, merchant);
                        gapComposer9.updateRememberedValue(cardModelView$1$3$4$23);
                        obj9 = cardModelView$1$3$4$23;
                    }
                    BillsSubscriptionsMerchantListViewKt.MerchantRow(merchant, (Function0) obj9, gapComposer9, 0);
                    gapComposer9.end(false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                LazyItemScopeImpl lazyItemScopeImpl9 = (LazyItemScopeImpl) obj;
                int intValue19 = ((Number) obj2).intValue();
                Composer composer10 = (Composer) obj3;
                int intValue20 = ((Number) obj4).intValue();
                if ((intValue20 & 6) == 0) {
                    i10 = intValue20 | (((GapComposer) composer10).changed(lazyItemScopeImpl9) ? 4 : 2);
                } else {
                    i10 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i10 |= ((GapComposer) composer10).changed(intValue19) ? 32 : 16;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                    ContactMethod contactMethod = (ContactMethod) list.get(intValue19);
                    gapComposer10.startReplaceGroup(-1418612008);
                    SponsorRowViewKt.ContactMethodRow(contactMethod, function1, gapComposer10, 0);
                    gapComposer10.end(false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                LazyItemScopeImpl lazyItemScopeImpl10 = (LazyItemScopeImpl) obj;
                int intValue21 = ((Number) obj2).intValue();
                Composer composer11 = (Composer) obj3;
                int intValue22 = ((Number) obj4).intValue();
                if ((intValue22 & 6) == 0) {
                    i11 = intValue22 | (((GapComposer) composer11).changed(lazyItemScopeImpl10) ? 4 : 2);
                } else {
                    i11 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i11 |= ((GapComposer) composer11).changed(intValue21) ? 32 : 16;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                    SponsorRowViewModel sponsorRowViewModel = (SponsorRowViewModel) list.get(intValue21);
                    gapComposer11.startReplaceGroup(919020430);
                    boolean changed7 = gapComposer11.changed(function1);
                    Object rememberedValue7 = gapComposer11.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(i19, function1);
                        gapComposer11.updateRememberedValue(rememberedValue7);
                    }
                    SponsorRowViewKt.SponsorRow(sponsorRowViewModel, (Function1) rememberedValue7, gapComposer11, 0);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                LazyItemScopeImpl lazyItemScopeImpl11 = (LazyItemScopeImpl) obj;
                int intValue23 = ((Number) obj2).intValue();
                Composer composer12 = (Composer) obj3;
                int intValue24 = ((Number) obj4).intValue();
                if ((intValue24 & 6) == 0) {
                    i12 = intValue24 | (((GapComposer) composer12).changed(lazyItemScopeImpl11) ? 4 : 2);
                } else {
                    i12 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    i12 |= ((GapComposer) composer12).changed(intValue23) ? 32 : 16;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                    InvestingSearchRow investingSearchRow = (InvestingSearchRow) list.get(intValue23);
                    gapComposer12.startReplaceGroup(-342318218);
                    if ((investingSearchRow instanceof SearchResult.CategoryResult) || (investingSearchRow instanceof CategoryTile$CategoryCarousel) || (investingSearchRow instanceof SearchRowHeader) || (investingSearchRow instanceof SecurityCarousel) || (investingSearchRow instanceof DisclosureModel)) {
                        gapComposer12.startReplaceGroup(266059807);
                        gapComposer12.end(false);
                    } else if (investingSearchRow instanceof InvestingFilterResultViewModel) {
                        gapComposer12.startReplaceGroup(-342000872);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer12, 0);
                        int hashCode = Long.hashCode(gapComposer12.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer12.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer12, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer12.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer12.startReusableNode();
                        if (gapComposer12.inserting) {
                            gapComposer12.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer12.useNode();
                        }
                        Updater.m576setimpl(gapComposer12, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer12, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer12, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        InvestingFilterResultViewModel investingFilterResultViewModel = (InvestingFilterResultViewModel) investingSearchRow;
                        String str3 = investingFilterResultViewModel.countLabel;
                        String str4 = investingFilterResultViewModel.resetLabel;
                        boolean changed8 = gapComposer12.changed(function1);
                        Object rememberedValue8 = gapComposer12.rememberedValue();
                        Object obj10 = rememberedValue8;
                        if (changed8 || rememberedValue8 == neverEqualPolicy) {
                            QuickPayViewKt$QuickPay$1$1$1$2$2$1$1 quickPayViewKt$QuickPay$1$1$1$2$2$1$1 = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(3, function1);
                            gapComposer12.updateRememberedValue(quickPayViewKt$QuickPay$1$1$1$2$2$1$1);
                            obj10 = quickPayViewKt$QuickPay$1$1$1$2$2$1$1;
                        }
                        ViewfinderDefaults.SectionHeader(str3, (Modifier) null, str4, (Function0) obj10, (String) null, gapComposer12, 0, 18);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer12, null);
                        gapComposer12.end(true);
                        gapComposer12.end(false);
                    } else {
                        if (!(investingSearchRow instanceof SearchResult.StockResult)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, 266052141, false);
                        }
                        gapComposer12.startReplaceGroup(-341423249);
                        SearchResult.StockResult stockResult = (SearchResult.StockResult) investingSearchRow;
                        StockContentModel stockContentModel = stockResult.contentModel;
                        String str5 = stockContentModel.title;
                        String str6 = stockContentModel.subTitle;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-936389951, new TooltipKt$animateTooltip$2(stockContentModel, i20), gapComposer12);
                        boolean changedInstance = gapComposer12.changedInstance(stockContentModel);
                        Object rememberedValue9 = gapComposer12.rememberedValue();
                        Object obj11 = rememberedValue9;
                        if (changedInstance || rememberedValue9 == neverEqualPolicy) {
                            KClasses$$Lambda$2 kClasses$$Lambda$2 = new KClasses$$Lambda$2(stockContentModel, 17);
                            gapComposer12.updateRememberedValue(kClasses$$Lambda$2);
                            obj11 = kClasses$$Lambda$2;
                        }
                        Function1 function12 = (Function1) obj11;
                        boolean changedInstance2 = gapComposer12.changedInstance(investingSearchRow) | gapComposer12.changed(function1) | gapComposer12.changedInstance(stockContentModel);
                        Object rememberedValue10 = gapComposer12.rememberedValue();
                        Object obj12 = rememberedValue10;
                        if (changedInstance2 || rememberedValue10 == neverEqualPolicy) {
                            KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23 = new KClassImpl$Data$$Lambda$23(5, function1, stockContentModel, stockResult);
                            gapComposer12.updateRememberedValue(kClassImpl$Data$$Lambda$23);
                            obj12 = kClassImpl$Data$$Lambda$23;
                        }
                        CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str5, function12, (Function0) obj12, null, null, str6, null, false, 0, 0L, gapComposer12, 6, 1968);
                        gapComposer12.end(false);
                    }
                    gapComposer12.end(false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                LazyItemScopeImpl lazyItemScopeImpl12 = (LazyItemScopeImpl) obj;
                int intValue25 = ((Number) obj2).intValue();
                Composer composer13 = (Composer) obj3;
                int intValue26 = ((Number) obj4).intValue();
                if ((intValue26 & 6) == 0) {
                    i13 = intValue26 | (((GapComposer) composer13).changed(lazyItemScopeImpl12) ? 4 : 2);
                } else {
                    i13 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    i13 |= ((GapComposer) composer13).changed(intValue25) ? 32 : 16;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(i13 & 1, (i13 & 147) != 146)) {
                    final InvestingOrderTypeRowViewModel investingOrderTypeRowViewModel = (InvestingOrderTypeRowViewModel) list.get(intValue25);
                    gapComposer13.startReplaceGroup(-1132502990);
                    int ordinal = investingOrderTypeRowViewModel.icon.ordinal();
                    if (ordinal == 0) {
                        icons = Icons.RecurringAutomatic24;
                    } else if (ordinal == 1) {
                        icons = Icons.InvestingCustomBuy24;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icons = Icons.InvestingCustomSell24;
                    }
                    Icons icons2 = icons;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer13.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    long j2 = colors.semantic.icon.inverse;
                    Color forTheme = ThemablesKt.forTheme(investingOrderTypeRowViewModel.accentColor, gapComposer13);
                    if (forTheme == null) {
                        gapComposer13.startReplaceGroup(-452159594);
                        Colors colors2 = (Colors) gapComposer13.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                        } else {
                            gapComposer13.startReplaceGroup(-1762997739);
                            gapComposer13.end(false);
                        }
                        j = colors2.semantic.icon.standard;
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(-452161516);
                        gapComposer13.end(false);
                        j = forTheme.value;
                    }
                    long j3 = j;
                    CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2078545495, new Function2() { // from class: com.squareup.cash.investing.components.ordertype.selection.OrderTypeSelectionKt$OrderTypeSelection$2$2$3$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj13, Object obj14) {
                            int i23 = i21;
                            InvestingOrderTypeRowViewModel investingOrderTypeRowViewModel2 = investingOrderTypeRowViewModel;
                            switch (i23) {
                                case 0:
                                    Composer composer14 = (Composer) obj13;
                                    int intValue27 = ((Number) obj14).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(intValue27 & 1, (intValue27 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingOrderTypeRowViewModel2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer15 = (Composer) obj13;
                                    int intValue28 = ((Number) obj14).intValue();
                                    GapComposer gapComposer15 = (GapComposer) composer15;
                                    if (gapComposer15.shouldExecute(intValue28 & 1, (intValue28 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingOrderTypeRowViewModel2.description, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer13);
                    boolean changedInstance3 = gapComposer13.changedInstance(investingOrderTypeRowViewModel) | gapComposer13.changed(function1);
                    Object rememberedValue11 = gapComposer13.rememberedValue();
                    Object obj13 = rememberedValue11;
                    if (changedInstance3 || rememberedValue11 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$24 = new CardModelView$1$3$4$2(12, investingOrderTypeRowViewModel, function1);
                        gapComposer13.updateRememberedValue(cardModelView$1$3$4$24);
                        obj13 = cardModelView$1$3$4$24;
                    }
                    CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons2, null, j3, rememberComposableLambda2, null, j2, (Function0) obj13, null, false, false, Expect_jvmKt.rememberComposableLambda(-1748950571, new Function2() { // from class: com.squareup.cash.investing.components.ordertype.selection.OrderTypeSelectionKt$OrderTypeSelection$2$2$3$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj132, Object obj14) {
                            int i23 = i22;
                            InvestingOrderTypeRowViewModel investingOrderTypeRowViewModel2 = investingOrderTypeRowViewModel;
                            switch (i23) {
                                case 0:
                                    Composer composer14 = (Composer) obj132;
                                    int intValue27 = ((Number) obj14).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(intValue27 & 1, (intValue27 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingOrderTypeRowViewModel2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer15 = (Composer) obj132;
                                    int intValue28 = ((Number) obj14).intValue();
                                    GapComposer gapComposer15 = (GapComposer) composer15;
                                    if (gapComposer15.shouldExecute(intValue28 & 1, (intValue28 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingOrderTypeRowViewModel2.description, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer15.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer13), null, push, 0L, null, gapComposer13, 3120, 390, 27536);
                    gapComposer13.end(false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                LazyItemScopeImpl lazyItemScopeImpl13 = (LazyItemScopeImpl) obj;
                int intValue27 = ((Number) obj2).intValue();
                Composer composer14 = (Composer) obj3;
                int intValue28 = ((Number) obj4).intValue();
                if ((intValue28 & 6) == 0) {
                    i14 = intValue28 | (((GapComposer) composer14).changed(lazyItemScopeImpl13) ? 4 : 2);
                } else {
                    i14 = intValue28;
                }
                if ((intValue28 & 48) == 0) {
                    i14 |= ((GapComposer) composer14).changed(intValue27) ? 32 : 16;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(i14 & 1, (i14 & 147) != 146)) {
                    InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = (InvestingCryptoNewsArticleViewModel) list.get(intValue27);
                    gapComposer14.startReplaceGroup(-950541985);
                    int i23 = (gapComposer14.changed(function1) ? 1 : 0) | (gapComposer14.changedInstance(investingCryptoNewsArticleViewModel) ? 1 : 0);
                    if ((((i14 & 112) ^ 48) <= 32 || !gapComposer14.changed(intValue27)) && (i14 & 48) != 32) {
                        i22 = 0;
                    }
                    int i24 = i23 | i22;
                    Object rememberedValue12 = gapComposer14.rememberedValue();
                    Object obj14 = rememberedValue12;
                    if (i24 != 0 || rememberedValue12 == neverEqualPolicy) {
                        AbstractSignatureParts$$Lambda$2 abstractSignatureParts$$Lambda$2 = new AbstractSignatureParts$$Lambda$2(function1, investingCryptoNewsArticleViewModel, intValue27, 2);
                        gapComposer14.updateRememberedValue(abstractSignatureParts$$Lambda$2);
                        obj14 = abstractSignatureParts$$Lambda$2;
                    }
                    ArtificialStackFrames.InvestingCryptoNewsArticleOutline(investingCryptoNewsArticleViewModel, (Function0) obj14, null, gapComposer14, 0);
                    gapComposer14.end(false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                LazyItemScopeImpl lazyItemScopeImpl14 = (LazyItemScopeImpl) obj;
                int intValue29 = ((Number) obj2).intValue();
                Composer composer15 = (Composer) obj3;
                int intValue30 = ((Number) obj4).intValue();
                if ((intValue30 & 6) == 0) {
                    i15 = intValue30 | (((GapComposer) composer15).changed(lazyItemScopeImpl14) ? 4 : 2);
                } else {
                    i15 = intValue30;
                }
                if ((intValue30 & 48) == 0) {
                    i15 |= ((GapComposer) composer15).changed(intValue29) ? 32 : 16;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(i15 & 1, (i15 & 147) != 146)) {
                    final MoneybotChatHistoryViewModel.Content.Session session = (MoneybotChatHistoryViewModel.Content.Session) list.get(intValue29);
                    gapComposer15.startReplaceGroup(-1897135660);
                    Object rememberedValue13 = gapComposer15.rememberedValue();
                    Object obj15 = rememberedValue13;
                    if (rememberedValue13 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer15.updateRememberedValue(mutableStateOf$default);
                        obj15 = mutableStateOf$default;
                    }
                    MutableState mutableState = (MutableState) obj15;
                    CellDefaultAccessory.Push push2 = CellDefaultAccessory.Push.INSTANCE;
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1633659130, new Function2() { // from class: com.squareup.cash.moneybot.views.history.MoneybotChatHistoryViewKt$ChatHistory$4$1$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj16, Object obj17) {
                            int i25 = i21;
                            MoneybotChatHistoryViewModel.Content.Session session2 = session;
                            switch (i25) {
                                case 0:
                                    Composer composer16 = (Composer) obj16;
                                    int intValue31 = ((Number) obj17).intValue();
                                    GapComposer gapComposer16 = (GapComposer) composer16;
                                    if (gapComposer16.shouldExecute(1 & intValue31, (intValue31 & 3) != 2)) {
                                        String str7 = session2.title;
                                        if (str7 == null) {
                                            str7 = re$$ExternalSyntheticOutline0.m(gapComposer16, 2011608839, R.string.moneybot_chat_history_item_default_title, gapComposer16, false);
                                        } else {
                                            gapComposer16.startReplaceGroup(2011608312);
                                            gapComposer16.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer17 = (Composer) obj16;
                                    int intValue32 = ((Number) obj17).intValue();
                                    GapComposer gapComposer17 = (GapComposer) composer17;
                                    if (gapComposer17.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, session2.date, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer17.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer15);
                    boolean changed9 = gapComposer15.changed(function1) | gapComposer15.changedInstance(session);
                    Object rememberedValue14 = gapComposer15.rememberedValue();
                    Object obj16 = rememberedValue14;
                    if (changed9 || rememberedValue14 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$25 = new CardModelView$1$3$4$2(13, function1, session);
                        gapComposer15.updateRememberedValue(cardModelView$1$3$4$25);
                        obj16 = cardModelView$1$3$4$25;
                    }
                    Function0 function04 = (Function0) obj16;
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-1769676224, new Function2() { // from class: com.squareup.cash.moneybot.views.history.MoneybotChatHistoryViewKt$ChatHistory$4$1$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj162, Object obj17) {
                            int i25 = i22;
                            MoneybotChatHistoryViewModel.Content.Session session2 = session;
                            switch (i25) {
                                case 0:
                                    Composer composer16 = (Composer) obj162;
                                    int intValue31 = ((Number) obj17).intValue();
                                    GapComposer gapComposer16 = (GapComposer) composer16;
                                    if (gapComposer16.shouldExecute(1 & intValue31, (intValue31 & 3) != 2)) {
                                        String str7 = session2.title;
                                        if (str7 == null) {
                                            str7 = re$$ExternalSyntheticOutline0.m(gapComposer16, 2011608839, R.string.moneybot_chat_history_item_default_title, gapComposer16, false);
                                        } else {
                                            gapComposer16.startReplaceGroup(2011608312);
                                            gapComposer16.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer16.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer17 = (Composer) obj162;
                                    int intValue32 = ((Number) obj17).intValue();
                                    GapComposer gapComposer17 = (GapComposer) composer17;
                                    if (gapComposer17.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, session2.date, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer17.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer15);
                    boolean changed10 = gapComposer15.changed(function1) | gapComposer15.changedInstance(session);
                    Object rememberedValue15 = gapComposer15.rememberedValue();
                    Object obj17 = rememberedValue15;
                    if (changed10 || rememberedValue15 == neverEqualPolicy) {
                        KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$232 = new KClassImpl$Data$$Lambda$23(6, function1, session, mutableState);
                        gapComposer15.updateRememberedValue(kClassImpl$Data$$Lambda$232);
                        obj17 = kClassImpl$Data$$Lambda$232;
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda3, null, function04, false, false, rememberComposableLambda4, null, 0L, push2, (Function0) obj17, gapComposer15, 806879238, 442);
                    gapComposer15.end(false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                LazyItemScopeImpl lazyItemScopeImpl15 = (LazyItemScopeImpl) obj;
                int intValue31 = ((Number) obj2).intValue();
                Composer composer16 = (Composer) obj3;
                int intValue32 = ((Number) obj4).intValue();
                if ((intValue32 & 6) == 0) {
                    i16 = intValue32 | (((GapComposer) composer16).changed(lazyItemScopeImpl15) ? 4 : 2);
                } else {
                    i16 = intValue32;
                }
                if ((intValue32 & 48) == 0) {
                    i16 |= ((GapComposer) composer16).changed(intValue31) ? 32 : 16;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(i16 & 1, (i16 & 147) != 146)) {
                    final OverflowMenuItem overflowMenuItem = (OverflowMenuItem) list.get(intValue31);
                    gapComposer16.startReplaceGroup(-1280699598);
                    int ordinal2 = overflowMenuItem.ordinal();
                    if (ordinal2 == 0) {
                        gapComposer16.startReplaceGroup(-734047594);
                        Icons icons3 = Icons.NavigationNewConversation;
                        String stringResource = Room.stringResource(gapComposer16, R.string.moneybot_overflow_menu_new_chat);
                        String stringResource2 = Room.stringResource(gapComposer16, R.string.moneybot_overflow_menu_new_chat);
                        boolean changed11 = gapComposer16.changed(function1) | gapComposer16.changed(overflowMenuItem.ordinal());
                        Object rememberedValue16 = gapComposer16.rememberedValue();
                        if (changed11 || rememberedValue16 == neverEqualPolicy) {
                            rememberedValue16 = new Function0() { // from class: com.squareup.cash.moneybot.views.menu.MoneybotOverflowMenuViewKt$MoneybotOverflowMenuView$2$1$3$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i25 = i21;
                                    OverflowMenuItem overflowMenuItem2 = overflowMenuItem;
                                    Function1 function13 = function1;
                                    switch (i25) {
                                        case 0:
                                            function13.invoke(new MoneybotOverflowMenuViewEvent.MenuItemClickEvent(overflowMenuItem2));
                                            break;
                                        default:
                                            function13.invoke(new MoneybotOverflowMenuViewEvent.MenuItemClickEvent(overflowMenuItem2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer16.updateRememberedValue(rememberedValue16);
                        }
                        ExpandableContentKt.MoneybotOverflowMenuItem(null, icons3, stringResource, stringResource2, false, (Function0) rememberedValue16, gapComposer16, 48);
                        gapComposer16.end(false);
                    } else {
                        if (ordinal2 != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer16, -734049551, false);
                        }
                        gapComposer16.startReplaceGroup(-734034313);
                        Icons icons4 = Icons.RecurringAutomatic24;
                        String stringResource3 = Room.stringResource(gapComposer16, R.string.moneybot_overflow_menu_automations);
                        String stringResource4 = Room.stringResource(gapComposer16, R.string.moneybot_overflow_menu_automations);
                        boolean changed12 = gapComposer16.changed(function1) | gapComposer16.changed(overflowMenuItem.ordinal());
                        Object rememberedValue17 = gapComposer16.rememberedValue();
                        if (changed12 || rememberedValue17 == neverEqualPolicy) {
                            rememberedValue17 = new Function0() { // from class: com.squareup.cash.moneybot.views.menu.MoneybotOverflowMenuViewKt$MoneybotOverflowMenuView$2$1$3$1$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i25 = i22;
                                    OverflowMenuItem overflowMenuItem2 = overflowMenuItem;
                                    Function1 function13 = function1;
                                    switch (i25) {
                                        case 0:
                                            function13.invoke(new MoneybotOverflowMenuViewEvent.MenuItemClickEvent(overflowMenuItem2));
                                            break;
                                        default:
                                            function13.invoke(new MoneybotOverflowMenuViewEvent.MenuItemClickEvent(overflowMenuItem2));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer16.updateRememberedValue(rememberedValue17);
                        }
                        ExpandableContentKt.MoneybotOverflowMenuItem(null, icons4, stringResource3, stringResource4, false, (Function0) rememberedValue17, gapComposer16, 48);
                        gapComposer16.end(false);
                    }
                    gapComposer16.end(false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return invoke$com$squareup$cash$moneybot$views$menu$MoneybotOverflowMenuViewKt$buildLoadedRecentChatHistory$lambda$10$0$$inlined$items$default$4(obj, obj2, obj3, obj4);
            case 17:
                return invoke$com$squareup$cash$payments$views$nearby$NearbyPeopleOverflowSheetViewKt$NearbyPeopleOverflowSheetContent$lambda$0$0$0$$inlined$items$default$4(obj, obj2, obj3, obj4);
            case 18:
                return invoke$com$squareup$cash$profile$views$notifications$ChannelListViewKt$ChannelList$lambda$0$0$0$2$0$$inlined$items$default$8(obj, obj2, obj3, obj4);
            case 19:
                return invoke$com$squareup$cash$taptopay$views$components$DescriptionSuggestionsKt$ScrollingCarousel$lambda$0$0$$inlined$items$default$4(obj, obj2, obj3, obj4);
            case 20:
                return invoke$com$stripe$android$financialconnections$features$common$SharedPartnerAuthKt$PrePaneContent$lambda$2$0$$inlined$items$default$4(obj, obj2, obj3, obj4);
            default:
                LazyItemScopeImpl lazyItemScopeImpl16 = (LazyItemScopeImpl) obj;
                int intValue33 = ((Number) obj2).intValue();
                Composer composer17 = (Composer) obj3;
                int intValue34 = ((Number) obj4).intValue();
                if ((intValue34 & 6) == 0) {
                    i17 = intValue34 | (((GapComposer) composer17).changed(lazyItemScopeImpl16) ? 4 : 2);
                } else {
                    i17 = intValue34;
                }
                if ((intValue34 & 48) == 0) {
                    i17 |= ((GapComposer) composer17).changed(intValue33) ? 32 : 16;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(i17 & 1, (i17 & 147) != 146)) {
                    BulletUI bulletUI = (BulletUI) list.get(intValue33);
                    gapComposer17.startReplaceGroup(-1076849880);
                    ListItemKt.ListItem(bulletUI, function1, gapComposer17, 0);
                    SpacerKt.Spacer(gapComposer17, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 24.0f));
                    gapComposer17.end(false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
