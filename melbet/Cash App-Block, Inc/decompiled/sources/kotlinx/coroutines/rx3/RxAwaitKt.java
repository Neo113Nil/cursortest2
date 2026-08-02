package kotlinx.coroutines.rx3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.elements.MarkdownImageKt$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.model.NoOpImageTransformerImpl;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.components.metrics.InvestingEarningsTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import io.reactivex.rxjava3.core.Single;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public abstract class RxAwaitKt {
    public static final void InvestingEarningsTile(InvestingEarningsViewModel investingEarningsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        investingEarningsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1683625548);
        int i2 = (gapComposer.changedInstance(investingEarningsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(investingEarningsViewModel instanceof InvestingEarningsViewModel.Content)) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InvestingEarningsTileKt$$ExternalSyntheticLambda0(investingEarningsViewModel, function1, i);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1031736535, new InvestingEarningsTileKt$$ExternalSyntheticLambda0(investingEarningsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 4, modifier2, investingEarningsViewModel, function1);
        }
    }

    public static final void MarkdownInlineImage(String str, ASTNodeImpl aSTNodeImpl, Composer composer, int i) {
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1484442365);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((NoOpImageTransformerImpl) gapComposer.consume(ComposeLocalKt.LocalImageTransformer)).getClass();
            gapComposer.startReplaceGroup(1643297092);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(2039367566);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownImageKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, i, 2);
        }
    }

    public static final Object await(Single single, ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        single.subscribe(new RxAwaitKt$await$5$1(cancellableContinuationImpl, 0));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
