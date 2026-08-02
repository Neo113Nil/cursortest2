package com.stripe.android.uicore.navigation;

import android.app.Activity;
import android.view.View;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class NavigationEffectsKt {
    public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(9);

    public static final void NavigationEffects(SharedFlow sharedFlow, NavHostController navHostController, RealWebSocket$connect$1 realWebSocket$connect$1, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer;
        Function1 function13;
        NavBackStackEntry navBackStackEntry;
        NavHostController navHostController2;
        Object navHostKt$NavHost$33$1;
        Function1 function14;
        NavHostController navHostController3 = navHostController;
        sharedFlow.getClass();
        navHostController3.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-814812707);
        int i2 = i | (gapComposer2.changedInstance(sharedFlow) ? 4 : 2) | (gapComposer2.changedInstance(navHostController3) ? 32 : 16) | (gapComposer2.changed(realWebSocket$connect$1) ? 256 : 128) | 3072 | (gapComposer2.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(17);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function15 = (Function1) rememberedValue;
            Activity activity = (Activity) gapComposer2.consume(LocalActivityKt.LocalActivity);
            MutableState collectAsState = Updater.collectAsState(FlowKt.asSharedFlow(navHostController3.impl._currentBackStackEntryFlow), null, null, gapComposer2, 48, 2);
            gapComposer = gapComposer2;
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) collectAsState.getValue();
            boolean changedInstance = gapComposer.changedInstance(navHostController3) | gapComposer.changed(collectAsState) | ((57344 & i2) == 16384);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                navBackStackEntry = navBackStackEntry2;
                navHostController2 = navHostController;
                Object logger$_log$2 = new Logger$_log$2(navHostController2, function12, collectAsState, null, 23);
                gapComposer.updateRememberedValue(logger$_log$2);
                rememberedValue2 = logger$_log$2;
            } else {
                navBackStackEntry = navBackStackEntry2;
                navHostController2 = navHostController3;
            }
            Updater.LaunchedEffect(gapComposer, navBackStackEntry, (Function2) rememberedValue2);
            boolean changedInstance2 = gapComposer.changedInstance(sharedFlow) | gapComposer.changedInstance(activity) | ((i2 & 896) == 256) | gapComposer.changedInstance(navHostController2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                NavHostController navHostController4 = navHostController2;
                function14 = function15;
                navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(sharedFlow, activity, realWebSocket$connect$1, navHostController4, function14, (Continuation) null);
                navHostController3 = navHostController4;
                gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
            } else {
                navHostKt$NavHost$33$1 = rememberedValue3;
                navHostController3 = navHostController2;
                function14 = function15;
            }
            Updater.LaunchedEffect(activity, navHostController3, sharedFlow, (Function2) navHostKt$NavHost$33$1, gapComposer);
            function13 = function14;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function13 = function1;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WalletHomeViewKt$$ExternalSyntheticLambda4(sharedFlow, navHostController3, realWebSocket$connect$1, function13, function12, i);
        }
    }

    public static final RealWebSocket$connect$1 rememberKeyboardController(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
        View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(view);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new HCaptcha$$ExternalSyntheticLambda1(6, view, mutableState);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(view, (Function1) rememberedValue2, gapComposer);
        boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new HCaptcha$$ExternalSyntheticLambda0(delegatingSoftwareKeyboardController, 25);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        return new RealWebSocket$connect$1((Function0) rememberedValue3, mutableState);
    }
}
