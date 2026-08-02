package com.squareup.cash.treehouse.android.broadway;

import android.net.Uri;
import app.cash.broadway.screen.Screen;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.ClientRoutesConfig;
import com.squareup.cash.clientroutes.Matcher;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealTreehouseNavigatorFactory {
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealClientRouteFormatter clientRouteFormatter;
    public final RealClientRouteParser clientRouteParser;
    public final FlowStarter flowStarter;
    public final RealRouter$Factory$Impl routerFactory;
    public final TreehouseScreenFactory treehouseScreenFactory;
    public final CoroutineContext uiDispatcher;

    public RealTreehouseNavigatorFactory(RealRouter$Factory$Impl realRouter$Factory$Impl, RealClientRouteFormatter realClientRouteFormatter, RealClientRouteParser realClientRouteParser, ClientRoutesConfig clientRoutesConfig, TreehouseScreenFactory treehouseScreenFactory, RealMoneyNavigatorHelper realMoneyNavigatorHelper, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, CoroutineContext coroutineContext) {
        this.routerFactory = realRouter$Factory$Impl;
        this.clientRouteFormatter = realClientRouteFormatter;
        this.clientRouteParser = realClientRouteParser;
        this.treehouseScreenFactory = treehouseScreenFactory;
        this.flowStarter = flowStarter;
        this.blockersDataNavigator = blockersDataNavigator;
        this.uiDispatcher = coroutineContext;
    }

    public final Screen toScreen(ClientRouteUrl clientRouteUrl) {
        Uri build = new Uri.Builder().path(clientRouteUrl.getUrl()).build();
        Function1 function1 = Matcher.treehouseAppLinkClientRoute.match;
        build.getClass();
        ClientRoute clientRoute = (ClientRoute) function1.invoke(build);
        if (clientRoute == null) {
            clientRoute = this.clientRouteParser.parse(clientRouteUrl.getUrl());
        }
        if (clientRoute instanceof ClientRoute.TreehouseAppLink) {
            ClientRoute.TreehouseAppLink treehouseAppLink = (ClientRoute.TreehouseAppLink) clientRoute;
            return TreehouseScreenFactory.create$default(this.treehouseScreenFactory, treehouseAppLink.getApp(), treehouseAppLink.getLink(), 12);
        }
        if (clientRoute instanceof ClientRoute.ViewBalance) {
            return RealMoneyNavigatorHelper.moneyTabScreen();
        }
        if (clientRoute instanceof ClientRoute.ViewPaychecksHome) {
            return PaychecksHomeScreen.INSTANCE;
        }
        if (clientRoute instanceof ClientRoute.ViewActivity) {
            return ActivityScreen.INSTANCE;
        }
        if (clientRoute != null) {
            Timber.Forest.w("Client route %s is not supported as an exitScreen in RealTreehouseNavigatorFactory", zzjr.formatForLogging(this.clientRouteFormatter, clientRoute));
        }
        return null;
    }
}
