package com.squareup.cash.support.presenters;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;

/* loaded from: classes7.dex */
public final class RealSupportLinkNavigator {
    public final IntentLauncher launcher;
    public final RealRouter$Factory$Impl routerFactory;

    public RealSupportLinkNavigator(RealRouter$Factory$Impl realRouter$Factory$Impl, IntentLauncher intentLauncher) {
        this.routerFactory = realRouter$Factory$Impl;
        this.launcher = intentLauncher;
    }

    public final Unit navigateWith(BetterNavigator.ScreenNavigator screenNavigator, SupportScreens.FlowScreens flowScreens, Link.Target target, SupportTransaction supportTransaction, BlockersData.AnalyticsData.Source source) {
        SupportScreens.FlowScreens.ArticleScreen articleScreen;
        RealRouter create$1 = this.routerFactory.create$1(screenNavigator);
        if (target instanceof Link.Target.Article) {
            String str = ((Link.Target.Article) target).token;
            SupportScreens.FlowScreens.SupportArticleConfig supportArticleConfig = !(flowScreens instanceof SupportScreens.FlowScreens.ArticleScreen) ? null : ((SupportScreens.FlowScreens.ArticleScreen) flowScreens).articleConfig;
            int i = 28;
            boolean z = false;
            if (supportArticleConfig == null || (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken)) {
                articleScreen = new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken(str), flowScreens.getData(), z, i);
            } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction) {
                articleScreen = new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction(((SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction) supportArticleConfig).transaction, str), flowScreens.getData(), z, i);
            } else if (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) {
                articleScreen = new SupportScreens.FlowScreens.ArticleScreen(new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction(((SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction) supportArticleConfig).transaction, str), flowScreens.getData(), z, i);
            } else {
                if (!(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId) && !(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                articleScreen = new SupportScreens.FlowScreens.ArticleScreen(supportTransaction != null ? new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction(new RedactedParcelable(supportTransaction), str) : new SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId(str), flowScreens.getData(), z, i);
            }
            screenNavigator.goTo(articleScreen);
        } else if (target instanceof Link.Target.ClientRoute) {
            create$1.route(new RoutingParams(null, source.getAnalyticsName(), flowScreens, null, null, null, 501), ((Link.Target.ClientRoute) target).url);
        } else if (target instanceof Link.Target.External) {
            this.launcher.launchUrlInExternalApp(((Link.Target.External) target).url);
        } else {
            if (!(target instanceof Link.Target.ClientScenario)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(new SupportScreens.SupportLoadClientScenarioScreen(((Link.Target.ClientScenario) target).stringRepresentation, SupportScreens.FlowScreens.Data.copy$default(flowScreens.getData(), null, null, null, flowScreens, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE)));
        }
        return Unit.INSTANCE;
    }
}
