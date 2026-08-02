package com.squareup.cash.support.views.article;

import android.content.Context;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.support.backend.api.activities.Amount;
import com.squareup.cash.support.backend.api.activities.AmountTreatment;
import com.squareup.cash.support.backend.api.activities.Avatar;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$Severity;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.util.android.StringsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArticleViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ArticleViewKt.Loading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ScreenshotReviewViewKt.DisputesTracker(new SupportDisputeTrackerViewModel.Loaded(CollectionsKt__CollectionsJVMKt.listOf(new DisputeRow("id", "token", "With url", "In Dispute", "$49.97", "29 Mar 2025", DisputeRow.TransactionType.CASH_CARD, "fake:///BlueBottle.png")), false), null, gapComposer, 6, 2);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.ShimmerSupportTransactionRowView((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.LoadMoreProgress((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.DisputesTrackerLoadingContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Loading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SupportPhoneLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.support_article_error_message), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer7, R.string.support_article_error_title);
                    TextStyle textStyle = ((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).header;
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(6);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer7, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "Alert", colors.semantic.background.danger, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.AlertOffline32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer8, 199734, 0, 2000);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ArticleViewKt.LoadedArticle(new ArticleViewModel.Loaded(new Article("A Article", "", null, CollectionsKt__CollectionsKt.listOf((Object[]) new Link[]{new Link("article-token", "Article Link", new Link.Target.Article("token-2"), true, 48), new Link("client-route-token", "Client Route Link", new Link.Target.ClientRoute("https://internal.cash.app/dl/view/balance"), true, 48), new Link("client-scenario-token", "Client Scenario Link", new Link.Target.ClientScenario("CLIENT_SCENARIO"), true, 48), new Link("url-token", "External Link", new Link.Target.External("https://cash.app"), true, 48)}), null, 6120), "", CollectionsKt__CollectionsKt.listOf((Object[]) new ArticleViewModel.ContactOption[]{new ArticleViewModel.ContactOption(null, true, Article.ContactOption.CHAT), new ArticleViewModel.ContactOption("Available tomorrow 9:00 am", false, Article.ContactOption.PHONE), new ArticleViewModel.ContactOption(null, true, Article.ContactOption.EMAIL)}), null, 8), (RealImageLoader) gapComposer9.consume(LocalImageLoaderKt.LocalImageLoader), null, ArcadeArticleViewPreviewWebViewProvider.INSTANCE, new ScrollState(0), new ArticleViewKt$previewActivityItemLoader$1(), gapComposer9, 0, 4);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ArticleViewKt.LoadedArticle(new ArticleViewModel.Loaded(new Article("A Article", "WebView", new Article.Icon(Article.Glyph.BITCOIN, Article.Color.SKY), CollectionsKt__CollectionsJVMKt.listOf(new Link("article-token", "Article Link", new Link.Target.Article("token-2"), true, 48)), null, 5608), "", EmptyList.INSTANCE, null, 8), (RealImageLoader) gapComposer10.consume(LocalImageLoaderKt.LocalImageLoader), null, ArcadeArticleViewPreviewWebViewProvider.INSTANCE, new ScrollState(0), new ArticleViewKt$previewActivityItemLoader$1(), gapComposer10, 0, 4);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    ScrollState scrollState = new ScrollState(0);
                    RealImageLoader realImageLoader = (RealImageLoader) gapComposer11.consume(LocalImageLoaderKt.LocalImageLoader);
                    ArticleViewKt$previewActivityItemLoader$1 articleViewKt$previewActivityItemLoader$1 = new ArticleViewKt$previewActivityItemLoader$1();
                    Article.Appearance appearance = Article.Appearance.CATEGORY;
                    ArticleViewKt.LoadedArticle(new ArticleViewModel.Loaded(new Article("Pending", "Hello there", null, CollectionsKt__CollectionsJVMKt.listOf(new Link("article-token", "Article Link", new Link.Target.Article("token-2"), true, 48)), new Link("token", "Call to Action", new Link.Target.Article("token"), false, 48), 1992), "", null, new SupportTransaction("entity_id", "Commander Shepard", "For my favourite person on the Citadel", "Apr 30", new Avatar("N7", true, null, StringsKt.safeParseColor("#FF0000", null), null, StringsKt.safeParseColor("#FF0000", null)), new Amount("$79.80", AmountTreatment.STANDARD)), 4), realImageLoader, null, ArcadeArticleViewPreviewWebViewProvider.INSTANCE, scrollState, articleViewKt$previewActivityItemLoader$1, gapComposer11, 0, 4);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    ArticleViewKt.Article(new ArticleViewModel.Error(true), (RealImageLoader) gapComposer12.consume(LocalImageLoaderKt.LocalImageLoader), null, ArcadeArticleViewPreviewWebViewProvider.INSTANCE, new ArticleViewKt$previewActivityItemLoader$1(), gapComposer12, 6, 4);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.support_home_error_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.support_home_error_message), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    ProductSearchView productSearchView = new ProductSearchView((Context) gapComposer15.consume(AndroidCompositionLocals_androidKt.LocalContext), (RealImageLoader) gapComposer15.consume(LocalImageLoaderKt.LocalImageLoader), 4);
                    SupportHomeViewModel.Loaded loaded = new SupportHomeViewModel.Loaded(CollectionsKt__CollectionsKt.listOf((Object[]) new SupportHomeViewModel.ContactOption[]{new SupportHomeViewModel.ContactOption("Chat", "Available 24/7", SupportHomeViewModel.ContactOption.Type.CHAT, false, false, 24), new SupportHomeViewModel.ContactOption("Call", "Available daily, 8 AM-9:30 PM ET", SupportHomeViewModel.ContactOption.Type.PHONE, false, false, 16)}), CollectionsKt__CollectionsJVMKt.listOf(new SupportNotification("Service Outage", "Cash App is currently experiencing service outages. Please check again later.", new SupportNotification.Trigger.Incident("id", IncidentViewModel$Severity.ERROR), false)), "Search", CollectionsKt__CollectionsJVMKt.listOf(new SupportHomeViewModel.Category("token", "title", new Article.Icon(Article.Glyph.STAR, Article.Color.SUNSHINE))), CollectionsKt__CollectionsJVMKt.listOf(new SupportHomeViewModel.SuggestedAction(new Link("token", "title", new Link.Target.External("url"), true, 32), SupportHomeViewModel.SuggestedAction.Icon.EXTERNAL_LINK)), new SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes(null, null), 200);
                    Object rememberedValue2 = gapComposer15.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda28(7);
                        gapComposer15.updateRememberedValue(rememberedValue2);
                    }
                    productSearchView.Content(loaded, (Function1) rememberedValue2, gapComposer15, 48);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ProductSearchView productSearchView2 = new ProductSearchView((Context) gapComposer16.consume(AndroidCompositionLocals_androidKt.LocalContext), (RealImageLoader) gapComposer16.consume(LocalImageLoaderKt.LocalImageLoader), 4);
                    SupportHomeViewModel.Loaded loaded2 = new SupportHomeViewModel.Loaded(null, null, "", null, null, new SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes(null, null), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
                    Object rememberedValue3 = gapComposer16.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda28(9);
                        gapComposer16.updateRememberedValue(rememberedValue3);
                    }
                    productSearchView2.Content(loaded2, (Function1) rememberedValue3, gapComposer16, 48);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ProductSearchView productSearchView3 = new ProductSearchView((Context) gapComposer17.consume(AndroidCompositionLocals_androidKt.LocalContext), (RealImageLoader) gapComposer17.consume(LocalImageLoaderKt.LocalImageLoader), 4);
                    SupportHomeViewModel.Loaded loaded3 = new SupportHomeViewModel.Loaded(null, null, "", null, null, new SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes(null, null), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
                    Object rememberedValue4 = gapComposer17.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new TabToolbarsKt$$ExternalSyntheticLambda28(8);
                        gapComposer17.updateRememberedValue(rememberedValue4);
                    }
                    productSearchView3.Content(loaded3, (Function1) rememberedValue4, gapComposer17, 48);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.support_home_body_activity), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.DocumentCourtOrder24, (String) null, (Modifier) null, 0L, gapComposer19, 54, 12);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.support_home_disputes_cell_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.support_home_body_activity), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer22, 48);
                    int hashCode = Long.hashCode(gapComposer22.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer22.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer22, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer22.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer22.startReusableNode();
                    if (gapComposer22.inserting) {
                        gapComposer22.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer22.useNode();
                    }
                    Updater.m576setimpl(gapComposer22, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer22, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer22, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer22, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer22, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer22, null);
                    TextStyle textStyle2 = ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer22, (Modifier) null, textStyle2, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.support_activity_picker_empty_message), (Map) null, (Function1) null, false);
                    gapComposer22.end(true);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                SupportHomeViewKt.SupportHomeAlert((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer23, R.string.support_flow_search_title_bar_heading), (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda10(int i, int i2) {
        this.$r8$classId = i2;
    }
}
