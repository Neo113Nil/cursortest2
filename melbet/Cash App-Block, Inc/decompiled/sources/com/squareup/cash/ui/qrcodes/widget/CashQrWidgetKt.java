package com.squareup.cash.ui.qrcodes.widget;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.glance.AndroidResourceImageProvider;
import androidx.glance.BackgroundModifier$Image;
import androidx.glance.GlanceModifier;
import androidx.glance.action.ActionModifier;
import androidx.glance.action.ActionParameters$Pair;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.appwidget.action.StartActivityIntentAction;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.BoxKt;
import androidx.glance.layout.PaddingDimension;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.layout.SizeModifiersKt;
import androidx.navigation.NavHostController;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.DialogNavigator;
import androidx.navigation.internal.NavControllerImpl;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import java.util.Arrays;
import kotlin.collections.EmptyList;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class CashQrWidgetKt {
    public static final void QrWidgetContent(Context context, CashQrWidgetData cashQrWidgetData, Intent intent, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2048510766);
        int i2 = i | (gapComposer.changedInstance(context) ? 4 : 2) | (gapComposer.changedInstance(cashQrWidgetData) ? 32 : 16) | (gapComposer.changedInstance(intent) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            GlanceModifier then = SizeModifiersKt.fillMaxSize(GlanceModifier.Companion.$$INSTANCE).then(new BackgroundModifier$Image(new AndroidResourceImageProvider(R.drawable.cash_qr_widget_background)));
            PaddingDimension paddingDimension = new PaddingDimension(2);
            BoxKt.Box(then.then(new PaddingModifier(new PaddingDimension(3), paddingDimension, paddingDimension, new PaddingDimension(3), paddingDimension, paddingDimension)).then(new ActionModifier(new StartActivityIntentAction(intent, ActionParametersKt.mutableActionParametersOf((ActionParameters$Pair[]) Arrays.copyOf(new ActionParameters$Pair[0], 0))))), Alignment.Center, Expect_jvmKt.rememberComposableLambda(-1194294992, new WorkViewFactory$$ExternalSyntheticLambda12(13, cashQrWidgetData, context), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(context, cashQrWidgetData, intent, i, 19);
        }
    }

    public static final NavHostController createNavController$NavHostControllerKt__NavHostController_androidKt(Context context) {
        context.getClass();
        NavHostController navHostController = new NavHostController(context);
        NavControllerImpl navControllerImpl = navHostController.impl;
        NavigatorProvider navigatorProvider = navControllerImpl._navigatorProvider;
        navigatorProvider.addNavigator(new ComposeNavGraphNavigator(navigatorProvider));
        NavigatorProvider navigatorProvider2 = navControllerImpl._navigatorProvider;
        navigatorProvider2.addNavigator(new ComposeNavigator());
        navigatorProvider2.addNavigator(new DialogNavigator());
        return navHostController;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBillsSubscriptionsHome.deepLinkSpecs;
    }
}
