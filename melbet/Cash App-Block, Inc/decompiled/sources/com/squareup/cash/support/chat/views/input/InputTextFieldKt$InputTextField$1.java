package com.squareup.cash.support.chat.views.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.squareup.cash.R;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final class InputTextFieldKt$InputTextField$1 implements TextFieldDecorator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldState $textFieldState;

    public /* synthetic */ InputTextFieldKt$InputTextField$1(int i, TextFieldState textFieldState) {
        this.$r8$classId = i;
        this.$textFieldState = textFieldState;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2 = this.$r8$classId;
        TextFieldState textFieldState = this.$textFieldState;
        switch (i2) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(500589226);
                int i3 = (gapComposer.changed(this) ? 32 : 16) | i;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
                    if (textFieldState.getValue$foundation().text.length() == 0) {
                        gapComposer.startReplaceGroup(1467191719);
                        zzpc.PlaceholderText(gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1467233042);
                        gapComposer.end(false);
                    }
                    Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(this, composableLambdaImpl, i, 15);
                    return;
                }
                return;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(291309042);
                int i4 = i | (gapComposer2.changed(this) ? 32 : 16);
                if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 6);
                    if (textFieldState.getValue$foundation().text.length() == 0) {
                        gapComposer2.startReplaceGroup(-1741143759);
                        VisibleKt.HintCarousel(null, null, Tags.persistentListOf(Room.stringResource(gapComposer2, R.string.pools_description_hint_example_1), Room.stringResource(gapComposer2, R.string.pools_description_hint_example_2), Room.stringResource(gapComposer2, R.string.pools_description_hint_example_3), Room.stringResource(gapComposer2, R.string.pools_description_hint_example_4)), gapComposer2, 0, 3);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1740744944);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(this, composableLambdaImpl, i, 22);
                    return;
                }
                return;
        }
    }
}
