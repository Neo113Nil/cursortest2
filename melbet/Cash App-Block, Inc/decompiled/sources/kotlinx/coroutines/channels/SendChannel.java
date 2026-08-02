package kotlinx.coroutines.channels;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import com.mikepenz.markdown.compose.elements.MarkdownCheckBoxKt$MarkdownCheckBox$1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.components.families.DependentDisabledStateViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.families.DependentDisabledStateViewModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.ASTUtilKt;

/* loaded from: classes3.dex */
public interface SendChannel {

    /* loaded from: classes6.dex */
    public abstract class DefaultImpls {
        public static final void DependentDisabledStateView(DependentDisabledStateViewModel dependentDisabledStateViewModel, Function1 function1, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1665618514);
            int i2 = (gapComposer.changed(dependentDisabledStateViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2113603225, new DependentDisabledStateViewKt$$ExternalSyntheticLambda0(dependentDisabledStateViewModel, function1), gapComposer), gapComposer, 3072, 7);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new DependentDisabledStateViewKt$$ExternalSyntheticLambda0(dependentDisabledStateViewModel, function1, i);
            }
        }

        public static final void MarkdownCheckBox(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Function4 function4, Composer composer, int i) {
            Function4 function42;
            str.getClass();
            aSTNodeImpl.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-738035122);
            int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(aSTNodeImpl) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | 3072;
            int i3 = 0;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-565052515, new MarkdownCheckBoxKt$MarkdownCheckBox$1(i3, aSTNodeImpl, textStyle), gapComposer);
                boolean contains = StringsKt.contains(ASTUtilKt.getTextInNode(aSTNodeImpl, str), (CharSequence) "[x]", false);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                rememberComposableLambda.invoke((Object) Boolean.valueOf(contains), (Object) SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), (Object) gapComposer, (Object) 432);
                gapComposer.end(true);
                function42 = rememberComposableLambda;
            } else {
                gapComposer.skipToGroupEnd();
                function42 = function4;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(str, i, aSTNodeImpl, textStyle, function42, 5);
            }
        }
    }

    boolean close(Throwable th);

    void invokeOnClose(Function1 function1);

    default boolean offer(Object obj) {
        Object mo1159trySendJP2dKIU = mo1159trySendJP2dKIU(obj);
        if (!(mo1159trySendJP2dKIU instanceof ChannelResult.Failed)) {
            return true;
        }
        Throwable m4190exceptionOrNullimpl = ChannelResult.m4190exceptionOrNullimpl(mo1159trySendJP2dKIU);
        if (m4190exceptionOrNullimpl == null) {
            return false;
        }
        int i = StackTraceRecoveryKt.$r8$clinit;
        throw m4190exceptionOrNullimpl;
    }

    Object send(Object obj, Continuation continuation);

    /* renamed from: trySend-JP2dKIU */
    Object mo1159trySendJP2dKIU(Object obj);
}
