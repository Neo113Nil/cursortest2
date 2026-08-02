package com.squareup.cash.support.chat.views.transcript.message.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TextBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class MessageTextBotKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChatContentViewModel.MessageViewModel f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ BodyViewModel$TextBodyViewModel f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function1 f$4;

    public /* synthetic */ MessageTextBotKt$$ExternalSyntheticLambda1(ChatContentViewModel.MessageViewModel messageViewModel, MutableState mutableState, BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel, boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = messageViewModel;
        this.f$1 = mutableState;
        this.f$2 = bodyViewModel$TextBodyViewModel;
        this.f$3 = z;
        this.f$4 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Modifier modifier;
        Modifier modifier2;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$4;
        boolean z3 = this.f$3;
        BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = this.f$2;
        MutableState mutableState = this.f$1;
        ChatContentViewModel.MessageViewModel messageViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
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
                    ChatContentViewModel.MessageViewModel messageViewModel2 = this.f$0;
                    MutableState mutableState2 = this.f$1;
                    SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(-2079810051, new MessageTextBotKt$$ExternalSyntheticLambda1(messageViewModel2, mutableState2, this.f$2, this.f$3, this.f$4, 3), gapComposer), gapComposer, 48, 1);
                    MessageFileKt.MessageStatus(null, null, messageViewModel2.timestamp, ((Boolean) mutableState2.getValue()).booleanValue(), null, gapComposer, 54, 16);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Bottom, gapComposer2, 54);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    ChatContentViewModel.MessageViewModel messageViewModel3 = this.f$0;
                    boolean z4 = messageViewModel3.showSender;
                    if (z4) {
                        gapComposer2.startReplaceGroup(998999659);
                        z = false;
                        MessageFileKt.MessageAvatarAdvocate(null, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        z = false;
                        gapComposer2.startReplaceGroup(999042904);
                        gapComposer2.end(false);
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, z), !z4 ? 28.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    MutableState mutableState3 = this.f$1;
                    SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(164802497, new MessageTextBotKt$$ExternalSyntheticLambda1(messageViewModel3, mutableState3, this.f$2, this.f$3, this.f$4, 2), gapComposer2), gapComposer2, 48, 1);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                    if (z4) {
                        gapComposer2.startReplaceGroup(1445569278);
                        MessageFileKt.MessageSenderName(0, gapComposer2, null, Room.stringResource(gapComposer2, R.string.support_chat_message_sender_cash_app_advocate_uplift), messageViewModel3.timestamp, ((Boolean) mutableState3.getValue()).booleanValue());
                        gapComposer2.end(false);
                    } else if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        gapComposer2.startReplaceGroup(1155020394);
                        String str = messageViewModel3.timestamp;
                        if (str == null) {
                            gapComposer2.startReplaceGroup(1445893847);
                            z2 = false;
                        } else {
                            z2 = false;
                            gapComposer2.startReplaceGroup(1445893848);
                            MessageFileKt.MessageTimestamp(0, gapComposer2, null, str);
                        }
                        gapComposer2.end(z2);
                        gapComposer2.end(z2);
                    } else {
                        gapComposer2.startReplaceGroup(1445959444);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                    Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(SizeKt.m292widthInVpY3zN4$default(modifier3, 96.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer3).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    if (messageViewModel.isTalkBackEnabled) {
                        gapComposer3.startReplaceGroup(484083339);
                        gapComposer3.end(false);
                        modifier = modifier3;
                    } else {
                        gapComposer3.startReplaceGroup(483970003);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new OverlayKt$$ExternalSyntheticLambda1(23, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        modifier = ImageKt.m183clickableoSLSa3U$default(modifier3, false, null, null, (Function0) rememberedValue, 15);
                        gapComposer3.end(false);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(clip.then(modifier), 16.0f, 12.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode5 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer3, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    String str2 = bodyViewModel$TextBodyViewModel.text;
                    long j = Strings.getColors(gapComposer3).semantic.text.standard;
                    TextStyle textStyle = Strings.getTypography(gapComposer3).bodyMedium;
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer3).base.brandOcean, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                    if (z3) {
                        gapComposer3.startReplaceGroup(1050843889);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1050761305);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ChatSurveyKt$$ExternalSyntheticLambda11(18);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        modifier3 = SemanticsModifierKt.clearAndSetSemantics(modifier3, (Function1) rememberedValue2);
                        gapComposer3.end(false);
                    }
                    Modifier align = BoxScopeInstance.INSTANCE.align(modifier3, Alignment.Companion.Center);
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, false, 27);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    LazyDslKt.m305MultiblockMarkdown1kVgcOc(str2, (Function2) rememberedValue3, align, textStyle, j, markdownSpanValues, 5, null, gapComposer3, 0, 128);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean z5 = messageViewModel.isTalkBackEnabled;
                    Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                    if (z5) {
                        gapComposer4.startReplaceGroup(-422835521);
                        gapComposer4.end(false);
                        modifier2 = modifier4;
                    } else {
                        gapComposer4.startReplaceGroup(-422932985);
                        Object rememberedValue4 = gapComposer4.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new OverlayKt$$ExternalSyntheticLambda1(24, mutableState);
                            gapComposer4.updateRememberedValue(rememberedValue4);
                        }
                        modifier2 = ImageKt.m183clickableoSLSa3U$default(modifier4, false, null, null, (Function0) rememberedValue4, 15);
                        gapComposer4.end(false);
                    }
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode6 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer4, modifier2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    String str3 = bodyViewModel$TextBodyViewModel.text;
                    long j2 = Strings.getColors(gapComposer4).semantic.text.standard;
                    TextStyle textStyle2 = Strings.getTypography(gapComposer4).bodyMedium;
                    MarkdownSpanValues markdownSpanValues2 = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer4).base.brandOcean, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                    if (z3) {
                        gapComposer4.startReplaceGroup(659968449);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(659897769);
                        Object rememberedValue5 = gapComposer4.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new ChatSurveyKt$$ExternalSyntheticLambda11(19);
                            gapComposer4.updateRememberedValue(rememberedValue5);
                        }
                        modifier4 = SemanticsModifierKt.clearAndSetSemantics(modifier4, (Function1) rememberedValue5);
                        gapComposer4.end(false);
                    }
                    Modifier modifier5 = modifier4;
                    boolean changed2 = gapComposer4.changed(function1);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, false, 28);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    LazyDslKt.m305MultiblockMarkdown1kVgcOc(str3, (Function2) rememberedValue6, modifier5, textStyle2, j2, markdownSpanValues2, 5, null, gapComposer4, 0, 128);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
