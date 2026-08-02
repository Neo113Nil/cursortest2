package kotlinx.coroutines.guava;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownDimens;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.applets.common.views.SharedUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ListenableFutureKt {
    public static final void HoldingRow(Holding holding, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-243147428);
        int i2 = (gapComposer.changed(holding) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = holding.enabled;
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (!z) {
                modifier = AlphaKt.alpha(modifier, 0.7f);
            }
            String str = holding.name;
            String str2 = holding.ticker;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1646566294, new FormView$$ExternalSyntheticLambda0(holding, 27), gapComposer);
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TooltipBoxKt$$ExternalSyntheticLambda2(holding, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean z3 = (i4 == 4) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new IntentLauncher$$ExternalSyntheticLambda0(14, holding, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, function1, (Function0) rememberedValue2, modifier, null, str2, null, false, 0, 0L, gapComposer, 6, 1952);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(holding, function0, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        if (r7 == r6) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingEtfHoldingsComponent(InvestingEtfHoldingsViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        NeverEqualPolicy neverEqualPolicy;
        Function0 function0;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1563024040);
        int i2 = i | (gapComposer.changed(content) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = content.title;
            String str2 = content.description;
            String stringResource = Room.stringResource(gapComposer, R.string.investing_components_show_more_arcade);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, stringResource, (Function0) rememberedValue, str2, gapComposer, 0, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(1202947150);
            for (Holding holding : content.holdings) {
                String str3 = holding.token;
                if (str3 == null) {
                    gapComposer.startReplaceGroup(-1583300894);
                    gapComposer.end(false);
                    function0 = null;
                    neverEqualPolicy = neverEqualPolicy3;
                } else {
                    gapComposer.startReplaceGroup(-1583300893);
                    boolean changed = (i3 == 32) | gapComposer.changed(str3);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed) {
                        neverEqualPolicy = neverEqualPolicy3;
                    } else {
                        neverEqualPolicy = neverEqualPolicy3;
                    }
                    rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str3, 13);
                    gapComposer.updateRememberedValue(rememberedValue2);
                    function0 = (Function0) rememberedValue2;
                    gapComposer.end(false);
                }
                HoldingRow(holding, function0, gapComposer, 0);
                neverEqualPolicy3 = neverEqualPolicy;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1(content, function1, modifier2, i, 28);
        }
    }

    /* renamed from: MarkdownDivider-aM-cp0Q, reason: not valid java name */
    public static final void m4197MarkdownDivideraMcp0Q(Modifier modifier, long j, float f, Composer composer, int i, int i2) {
        int i3;
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1836373000);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (((i2 & 2) == 0 && gapComposer.changed(j)) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= ((i2 & 4) == 0 && gapComposer.changed(f)) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.Companion.$$INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    j = ((DefaultMarkdownColors) gapComposer.consume(ComposeLocalKt.LocalMarkdownColors)).dividerColor;
                }
                if ((i2 & 4) != 0) {
                    ((DefaultMarkdownDimens) gapComposer.consume(ComposeLocalKt.LocalMarkdownDimens)).getClass();
                    f = 1.0f;
                }
            } else {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            if (Dp.m1037equalsimpl0(f, RecyclerView.DECELERATION_RATE)) {
                gapComposer.startReplaceGroup(1905616180);
                f2 = 1.0f / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1905674801);
                gapComposer.end(false);
                f2 = f;
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), f2), j, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        long j2 = j;
        float f3 = f;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SharedUIKt$$ExternalSyntheticLambda0(modifier2, j2, f3, i, i2, 1);
        }
    }

    public static final Object await(ListenableFuture listenableFuture, ContinuationImpl continuationImpl) {
        try {
            if (listenableFuture.isDone()) {
                return KotlinGenericDeclarationKt.getUninterruptibly(listenableFuture);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
            cancellableContinuationImpl.initCancellability();
            listenableFuture.addListener(new ToContinuation(listenableFuture, cancellableContinuationImpl, 0), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new ListenableFutureKt$await$2$1(listenableFuture, 0));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static JobListenableFuture future$default(ContextScope contextScope, Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineStart coroutineStart2 = CoroutineStart.DEFAULT;
        ListenableFutureCoroutine listenableFutureCoroutine = new ListenableFutureCoroutine(CoroutineContextKt.newCoroutineContext(emptyCoroutineContext, contextScope));
        listenableFutureCoroutine.start(coroutineStart, listenableFutureCoroutine, function2);
        return listenableFutureCoroutine.future;
    }
}
