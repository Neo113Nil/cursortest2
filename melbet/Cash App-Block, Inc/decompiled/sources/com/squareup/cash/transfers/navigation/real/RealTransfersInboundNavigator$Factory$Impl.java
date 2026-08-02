package com.squareup.cash.transfers.navigation.real;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class RealTransfersInboundNavigator$Factory$Impl {
    public final ConnectionPool delegateFactory;

    public RealTransfersInboundNavigator$Factory$Impl(ConnectionPool connectionPool) {
        this.delegateFactory = connectionPool;
    }

    public final Lazy create$1(Navigator navigator) {
        navigator.getClass();
        return new Lazy(navigator, (KeyValue) ((BreadcrumbListener.MetroFactory) this.delegateFactory.delegate).invoke());
    }
}
