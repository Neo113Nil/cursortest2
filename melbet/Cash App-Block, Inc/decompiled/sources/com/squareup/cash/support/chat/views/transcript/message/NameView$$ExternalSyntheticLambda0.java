package com.squareup.cash.support.chat.views.transcript.message;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class NameView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NameView f$0;

    public /* synthetic */ NameView$$ExternalSyntheticLambda0(NameView nameView) {
        this.$r8$classId = 1;
        this.f$0 = nameView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        long j;
        int i = this.$r8$classId;
        NameView nameView = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = NameView.$r8$clinit;
                nameView.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = NameView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    int ordinal = nameView.getModel().spaceBetween.ordinal();
                    if (ordinal == 0) {
                        f = 4.0f;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        f = 8.0f;
                    }
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Integer num = nameView.getModel().avatarRes;
                    if (num == null) {
                        gapComposer.startReplaceGroup(-372238227);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-372238226);
                        ImageKt.Image(Countries.painterResource(num.intValue(), 0, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 24.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                        gapComposer.end(false);
                    }
                    String str = nameView.getModel().name;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-372036975);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-372036974);
                        TextStyle textStyle = Strings.getTypography(gapComposer).bodySmall;
                        int ordinal2 = nameView.getModel().nameColorType.ordinal();
                        if (ordinal2 == 0) {
                            gapComposer.startReplaceGroup(519893201);
                            j = Strings.getColors(gapComposer).semantic.text.subtle;
                            gapComposer.end(false);
                        } else {
                            if (ordinal2 != 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 519890139, false);
                            }
                            gapComposer.startReplaceGroup(519895827);
                            j = Strings.getColors(gapComposer).semantic.text.standard;
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i4 = NameView.$r8$clinit;
                nameView.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NameView$$ExternalSyntheticLambda0(NameView nameView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = nameView;
    }
}
