package com.squareup.cash.work.webview.views;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class WorkWebViewKt {

    /* renamed from: lambda$-896487773, reason: not valid java name */
    public static final ComposableLambdaImpl f794lambda$896487773 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(15), false, -896487773);

    /* renamed from: lambda$-998691718, reason: not valid java name */
    public static final ComposableLambdaImpl f795lambda$998691718 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(16), false, -998691718);

    /* renamed from: lambda$-867270804, reason: not valid java name */
    public static final ComposableLambdaImpl f793lambda$867270804 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(17), false, -867270804);

    public static final void WorkWebView(WorkWebViewModel workWebViewModel, Function1 function1, WebViewProvider webViewProvider, String str, AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl, Composer composer, int i) {
        int i2;
        workWebViewModel.getClass();
        function1.getClass();
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(176360515);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(workWebViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(webViewProvider) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(androidDownloadManager$Factory$Impl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-105111666, new BasicShieetKt$$ExternalSyntheticLambda0(workWebViewModel, function1, webViewProvider, str, androidDownloadManager$Factory$Impl, mutableState, (MutableState) rememberedValue2, 20), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) workWebViewModel, function1, (Object) webViewProvider, (Object) str, (Object) androidDownloadManager$Factory$Impl, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public static final void WorkWebViewContent(String str, final boolean z, final boolean z2, final Function1 function1, final Function1 function12, final Function1 function13, final WebViewProvider webViewProvider, final String str2, final AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl, Composer composer, final int i) {
        String str3;
        GapComposer gapComposer;
        Function1 function14;
        MutableState mutableState;
        boolean z3;
        Throwable th;
        Object obj;
        MutableState mutableState2;
        ?? r11;
        boolean z4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-710115258);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changed(z2) ? 256 : 128) | (gapComposer2.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(webViewProvider) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(str2) ? 8388608 : 4194304) | (gapComposer2.changedInstance(androidDownloadManager$Factory$Impl) ? 67108864 : 33554432);
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            boolean changed = gapComposer2.changed(coroutineScope);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                rememberedValue3 = new WorkWebViewDownloadHandler(androidDownloadManager$Factory$Impl.create$1(coroutineScope));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            WorkWebViewDownloadHandler workWebViewDownloadHandler = (WorkWebViewDownloadHandler) rememberedValue3;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(z), gapComposer2);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(z2), gapComposer2);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj2) {
                mutableState = mutableState3;
                function14 = function12;
                rememberedValue4 = new WorkflowNode$tick$1$1(function14, function1, null, 25);
                gapComposer2.updateRememberedValue(rememberedValue4);
            } else {
                function14 = function12;
                mutableState = mutableState3;
            }
            int i3 = i2 & 14;
            Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue4);
            int i4 = i2 & 458752;
            boolean changed2 = (i4 == 131072) | gapComposer2.changed(rememberUpdatedState) | gapComposer2.changed(rememberUpdatedState2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == obj2) {
                z3 = false;
                th = null;
                WorkerWorkflow$render$1 workerWorkflow$render$1 = new WorkerWorkflow$render$1(function13, rememberUpdatedState, rememberUpdatedState2, (Continuation) null, 14);
                gapComposer2.updateRememberedValue(workerWorkflow$render$1);
                rememberedValue5 = workerWorkflow$render$1;
            } else {
                z3 = false;
                th = null;
            }
            Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue5);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z3);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw th;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer2.changedInstance(webViewProvider) | gapComposer2.changedInstance(context) | (i4 == 131072) | ((29360128 & i2) == 8388608) | gapComposer2.changedInstance(workWebViewDownloadHandler) | (i3 == 4);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue6 == obj2) {
                obj = obj2;
                mutableState2 = mutableState;
                r11 = 0;
                z4 = true;
                WorkWebViewKt$$ExternalSyntheticLambda8 workWebViewKt$$ExternalSyntheticLambda8 = new WorkWebViewKt$$ExternalSyntheticLambda8(webViewProvider, context, function13, str, str2, z2, function1, function14, workWebViewDownloadHandler, mutableState2);
                str3 = str;
                gapComposer2.updateRememberedValue(workWebViewKt$$ExternalSyntheticLambda8);
                rememberedValue6 = workWebViewKt$$ExternalSyntheticLambda8;
            } else {
                str3 = str;
                obj = obj2;
                mutableState2 = mutableState;
                r11 = 0;
                z4 = true;
            }
            GapComposer gapComposer3 = gapComposer2;
            AndroidView_androidKt.AndroidView((Function1) rememberedValue6, fillMaxSize, null, gapComposer3, 48, 4);
            if (z) {
                gapComposer3.startReplaceGroup(-1480679520);
                WorkWebViewLoading(gapComposer3, r11);
                gapComposer3.end(r11);
            } else {
                gapComposer3.startReplaceGroup(-1480646846);
                gapComposer3.end(r11);
            }
            gapComposer3.end(z4);
            Object rememberedValue7 = gapComposer3.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = new HeroTagViewKt$$ExternalSyntheticLambda7(14, mutableState2);
                gapComposer3.updateRememberedValue(rememberedValue7);
            }
            Updater.DisposableEffect(str3, (Function1) rememberedValue7, gapComposer3);
            gapComposer = gapComposer3;
        } else {
            str3 = str;
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final String str4 = str3;
            endRestartGroup.block = new Function2(str4, z, z2, function1, function12, function13, webViewProvider, str2, androidDownloadManager$Factory$Impl, i) { // from class: com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda10
                public final /* synthetic */ String f$0;
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ Function1 f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ Function1 f$5;
                public final /* synthetic */ WebViewProvider f$6;
                public final /* synthetic */ String f$7;
                public final /* synthetic */ AndroidDownloadManager$Factory$Impl f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(27649);
                    WorkWebViewKt.WorkWebViewContent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj3, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void WorkWebViewError(String str, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1593430602);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ModalKt.Dimmer(null, null, null, Expect_jvmKt.rememberComposableLambda(-431159057, new WorkWebViewKt$$ExternalSyntheticLambda5(z, str, function1, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda13(i, 1, str, function1, z);
        }
    }

    public static final void WorkWebViewInvalidUrl(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-435421256);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_webview_error_invalid_url), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda0(i, 18);
        }
    }

    public static final void WorkWebViewLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(696305192);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda0(i, 17);
        }
    }
}
