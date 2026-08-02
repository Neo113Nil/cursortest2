package kotlinx.coroutines;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.ComposableSingletons$MarkdownKt;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.model.DefaultMarkdownAnimation;
import com.mikepenz.markdown.model.DefaultMarkdownAnnotator;
import com.mikepenz.markdown.model.DefaultMarkdownAnnotatorConfig;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownDimens;
import com.mikepenz.markdown.model.DefaultMarkdownExtendedSpans;
import com.mikepenz.markdown.model.DefaultMarkdownInlineContent;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.mikepenz.markdown.model.MarkdownStateImpl;
import com.mikepenz.markdown.model.NoOpImageTransformerImpl;
import com.mikepenz.markdown.model.State;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.drip.DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.util.cash.Countries;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.InterruptibleKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public abstract class InterruptibleKt {
    public static final void DividendReinvestmentSettingViewContent(DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel, Function1 function1, Composer composer, int i) {
        dividendReinvestmentSettingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1917901753);
        int i2 = (gapComposer.changedInstance(dividendReinvestmentSettingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(295974836, new DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda0(function1, dividendReinvestmentSettingViewModel), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda0(dividendReinvestmentSettingViewModel, function1, i);
        }
    }

    public static final void EntryRow(final DividendReinvestmentSettingViewModel.Entry entry, Function1 function1, Composer composer, int i) {
        Modifier wrapContentHeight;
        entry.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(238086339);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(entry) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            long j = MooncakeTheme.getColors(gapComposer).background;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            boolean z = entry.checked;
            Role role = new Role(2);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            wrapContentHeight = SizeKt.wrapContentHeight(SelectableKt.m337toggleableoSLSa3U$default(m177backgroundbw27NRU, z, true, role, (Function1) rememberedValue, 8), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            boolean z3 = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda2(entry, 28);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(wrapContentHeight, (Function1) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 20.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Painter painterResource = Countries.painterResource(R.drawable.icon_recurring_automatic_32, 0, gapComposer);
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 24.0f), 24.0f), MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1);
            long j2 = MooncakeTheme.getColors(gapComposer).icon;
            ImageKt.Image(painterResource, null, m177backgroundbw27NRU2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(24.0f, 24.0f, 24.0f, 24.0f);
            boolean z4 = entry.checked;
            final int i4 = 0;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-90235001, new Function2() { // from class: com.squareup.cash.investing.components.drip.DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    DividendReinvestmentSettingViewModel.Entry entry2 = entry;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer2).mainTitle, (TextLineBalancing) null, entry2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer3).secondaryLabel, (Composer) gapComposer3, (Modifier) null, MooncakeTheme.getTypography(gapComposer3).smallBody, (TextLineBalancing) null, entry2.subLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean z5 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z5 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(9, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            final int i5 = 1;
            KeypadKt.MooncakeSwitch(rememberComposableLambda, z4, (Function1) rememberedValue3, null, Expect_jvmKt.rememberComposableLambda(1972796043, new Function2() { // from class: com.squareup.cash.investing.components.drip.DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    DividendReinvestmentSettingViewModel.Entry entry2 = entry;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer2).mainTitle, (TextLineBalancing) null, entry2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer3).secondaryLabel, (Composer) gapComposer3, (Modifier) null, MooncakeTheme.getTypography(gapComposer3).smallBody, (TextLineBalancing) null, entry2.subLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), false, paddingValuesImpl, false, gapComposer, 1597446);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(entry, function1, i, 27);
        }
    }

    public static final void Markdown(final State state, final DefaultMarkdownColors defaultMarkdownColors, final DefaultMarkdownTypography defaultMarkdownTypography, final Modifier modifier, final DefaultMarkdownPadding defaultMarkdownPadding, final DefaultMarkdownDimens defaultMarkdownDimens, final NoOpImageTransformerImpl noOpImageTransformerImpl, final DefaultMarkdownAnnotator defaultMarkdownAnnotator, final DefaultMarkdownExtendedSpans defaultMarkdownExtendedSpans, final DefaultMarkdownInlineContent defaultMarkdownInlineContent, final DefaultMarkdownComponents defaultMarkdownComponents, final DefaultMarkdownAnimation defaultMarkdownAnimation, final Function3 function3, final Function5 function5, final Function3 function32, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        GapComposer gapComposer;
        state.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1321379459);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer2.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownColors) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownTypography) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 24576;
        int i6 = PKIFailureInfo.certRevoked;
        if (i5 == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownPadding) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownDimens) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= (2097152 & i) == 0 ? gapComposer2.changed(noOpImageTransformerImpl) : gapComposer2.changedInstance(noOpImageTransformerImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownAnnotator) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownExtendedSpans) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer2.changed(defaultMarkdownInlineContent) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(defaultMarkdownComponents) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(defaultMarkdownAnimation) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(function5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (gapComposer2.changedInstance(function32)) {
                i6 = 16384;
            }
            i4 |= i6;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(1026839980);
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            Updater.CompositionLocalProvider(new ProvidedValue[]{ComposeLocalKt.LocalReferenceLinkHandler.defaultProvidedValue$runtime(state.getReferenceLinkHandler()), ComposeLocalKt.LocalMarkdownPadding.defaultProvidedValue$runtime(defaultMarkdownPadding), ComposeLocalKt.LocalMarkdownDimens.defaultProvidedValue$runtime(defaultMarkdownDimens), ComposeLocalKt.LocalMarkdownColors.defaultProvidedValue$runtime(defaultMarkdownColors), ComposeLocalKt.LocalMarkdownTypography.defaultProvidedValue$runtime(defaultMarkdownTypography), ComposeLocalKt.LocalImageTransformer.defaultProvidedValue$runtime(noOpImageTransformerImpl), ComposeLocalKt.LocalMarkdownAnnotator.defaultProvidedValue$runtime(defaultMarkdownAnnotator), ComposeLocalKt.LocalMarkdownExtendedSpans.defaultProvidedValue$runtime(defaultMarkdownExtendedSpans), ComposeLocalKt.LocalMarkdownInlineContent.defaultProvidedValue$runtime(defaultMarkdownInlineContent), ComposeLocalKt.LocalMarkdownComponents.defaultProvidedValue$runtime(defaultMarkdownComponents), ComposeLocalKt.LocalMarkdownAnimations.defaultProvidedValue$runtime(defaultMarkdownAnimation)}, Expect_jvmKt.rememberComposableLambda(-312968381, new Function2() { // from class: com.mikepenz.markdown.compose.MarkdownKt$Markdown$10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        State state2 = State.this;
                        boolean z = state2 instanceof State.Error;
                        Modifier modifier3 = modifier2;
                        if (z) {
                            gapComposer3.startReplaceGroup(-114901646);
                            function32.invoke(modifier3, gapComposer3, 0);
                            gapComposer3.end(false);
                        } else if (state2 instanceof State.Loading) {
                            gapComposer3.startReplaceGroup(-114900108);
                            function3.invoke(modifier3, gapComposer3, 0);
                            gapComposer3.end(false);
                        } else {
                            if (!(state2 instanceof State.Success)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -114902912, false);
                            }
                            gapComposer3.startReplaceGroup(-114898489);
                            function5.invoke(State.this, defaultMarkdownComponents, modifier2, gapComposer3, 0);
                            gapComposer3.end(false);
                        }
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    InterruptibleKt.Markdown(State.this, defaultMarkdownColors, defaultMarkdownTypography, modifier, defaultMarkdownPadding, defaultMarkdownDimens, noOpImageTransformerImpl, defaultMarkdownAnnotator, defaultMarkdownExtendedSpans, defaultMarkdownInlineContent, defaultMarkdownComponents, defaultMarkdownAnimation, function3, function5, function32, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void MarkdownSuccess(State.Success success, DefaultMarkdownComponents defaultMarkdownComponents, Modifier modifier, Composer composer, int i) {
        int i2;
        success.getClass();
        defaultMarkdownComponents.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-38298049);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(defaultMarkdownComponents) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-978381299);
            Iterator it = success.node.getChildren().iterator();
            while (it.hasNext()) {
                MarkdownExtensionKt.MarkdownElement((ASTNodeImpl) it.next(), defaultMarkdownComponents, success.content, false, gapComposer, i2 & 112, 8);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(success, defaultMarkdownComponents, modifier, i, 0);
        }
    }

    public static final Object runInterruptible(CoroutineContext coroutineContext, Function0 function0, ContinuationImpl continuationImpl) {
        return JobKt.withContext(coroutineContext, new InterruptibleKt$runInterruptible$2(function0, null), continuationImpl);
    }

    public static final void Markdown(final MarkdownStateImpl markdownStateImpl, final DefaultMarkdownColors defaultMarkdownColors, final DefaultMarkdownTypography defaultMarkdownTypography, final Modifier modifier, final DefaultMarkdownPadding defaultMarkdownPadding, final DefaultMarkdownDimens defaultMarkdownDimens, NoOpImageTransformerImpl noOpImageTransformerImpl, DefaultMarkdownAnnotator defaultMarkdownAnnotator, final DefaultMarkdownExtendedSpans defaultMarkdownExtendedSpans, DefaultMarkdownInlineContent defaultMarkdownInlineContent, final DefaultMarkdownComponents defaultMarkdownComponents, DefaultMarkdownAnimation defaultMarkdownAnimation, Function3 function3, Function5 function5, Function3 function32, Composer composer, final int i) {
        GapComposer gapComposer;
        final NoOpImageTransformerImpl noOpImageTransformerImpl2;
        final DefaultMarkdownAnnotator defaultMarkdownAnnotator2;
        final DefaultMarkdownInlineContent defaultMarkdownInlineContent2;
        final DefaultMarkdownAnimation defaultMarkdownAnimation2;
        final Function3 function33;
        final Function5 function52;
        final Function3 function34;
        NoOpImageTransformerImpl noOpImageTransformerImpl3;
        DefaultMarkdownAnimation defaultMarkdownAnimation3;
        Function5 function53;
        int i2;
        Function3 function35;
        DefaultMarkdownAnnotator defaultMarkdownAnnotator3;
        DefaultMarkdownInlineContent defaultMarkdownInlineContent3;
        int i3;
        Function3 function36;
        markdownStateImpl.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1544006766);
        int i4 = i | (gapComposer2.changed(markdownStateImpl) ? 4 : 2) | (gapComposer2.changed(defaultMarkdownColors) ? 32 : 16) | (gapComposer2.changed(defaultMarkdownTypography) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024) | (gapComposer2.changed(defaultMarkdownPadding) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(defaultMarkdownDimens) ? PKIFailureInfo.unsupportedVersion : 65536) | 4718592 | (gapComposer2.changed(defaultMarkdownExtendedSpans) ? 67108864 : 33554432) | 268435456;
        int i5 = (gapComposer2.changed(defaultMarkdownComponents) ? 4 : 2) | 28048;
        if (gapComposer2.shouldExecute(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
                i3 = i4 & (-1912078337);
                i2 = i5 & (-113);
                noOpImageTransformerImpl3 = noOpImageTransformerImpl;
                defaultMarkdownAnnotator3 = defaultMarkdownAnnotator;
                defaultMarkdownInlineContent3 = defaultMarkdownInlineContent;
                defaultMarkdownAnimation3 = defaultMarkdownAnimation;
                function36 = function3;
                function53 = function5;
                function35 = function32;
            } else {
                noOpImageTransformerImpl3 = new NoOpImageTransformerImpl();
                DefaultMarkdownAnnotator defaultMarkdownAnnotator4 = new DefaultMarkdownAnnotator(new DefaultMarkdownAnnotatorConfig());
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                DefaultMarkdownInlineContent defaultMarkdownInlineContent4 = new DefaultMarkdownInlineContent(emptyMap);
                int i6 = i4 & (-1912078337);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(12);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                defaultMarkdownAnimation3 = new DefaultMarkdownAnimation((Function1) rememberedValue);
                int i7 = i5 & (-113);
                final int i8 = 0;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-166159701, new Function3() { // from class: com.mikepenz.markdown.compose.MarkdownKt$Markdown$4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i9 = i8;
                        Modifier modifier2 = modifier;
                        switch (i9) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Number) obj3).intValue();
                                ((Modifier) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    BoxKt.Box(modifier2, gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Number) obj3).intValue();
                                ((Modifier) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    BoxKt.Box(modifier2, gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                function53 = ComposableSingletons$MarkdownKt.f84lambda$2063790006;
                final int i9 = 1;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1557401975, new Function3() { // from class: com.mikepenz.markdown.compose.MarkdownKt$Markdown$4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i92 = i9;
                        Modifier modifier2 = modifier;
                        switch (i92) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Number) obj3).intValue();
                                ((Modifier) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    BoxKt.Box(modifier2, gapComposer3, 0);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Number) obj3).intValue();
                                ((Modifier) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    BoxKt.Box(modifier2, gapComposer4, 0);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                i2 = i7;
                function35 = rememberComposableLambda2;
                defaultMarkdownAnnotator3 = defaultMarkdownAnnotator4;
                defaultMarkdownInlineContent3 = defaultMarkdownInlineContent4;
                i3 = i6;
                function36 = rememberComposableLambda;
            }
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            NoOpImageTransformerImpl noOpImageTransformerImpl4 = noOpImageTransformerImpl3;
            Markdown((State) Updater.collectAsState(markdownStateImpl.state, null, gapComposer2, 1).getValue(), defaultMarkdownColors, defaultMarkdownTypography, modifier, defaultMarkdownPadding, defaultMarkdownDimens, noOpImageTransformerImpl4, defaultMarkdownAnnotator3, defaultMarkdownExtendedSpans, defaultMarkdownInlineContent3, defaultMarkdownComponents, defaultMarkdownAnimation3, function36, function53, function35, gapComposer, i3 & 2147483632, i2 & JpegConstants.COM_MARKER);
            noOpImageTransformerImpl2 = noOpImageTransformerImpl4;
            defaultMarkdownAnnotator2 = defaultMarkdownAnnotator3;
            defaultMarkdownInlineContent2 = defaultMarkdownInlineContent3;
            defaultMarkdownAnimation2 = defaultMarkdownAnimation3;
            function33 = function36;
            function52 = function53;
            function34 = function35;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            noOpImageTransformerImpl2 = noOpImageTransformerImpl;
            defaultMarkdownAnnotator2 = defaultMarkdownAnnotator;
            defaultMarkdownInlineContent2 = defaultMarkdownInlineContent;
            defaultMarkdownAnimation2 = defaultMarkdownAnimation;
            function33 = function3;
            function52 = function5;
            function34 = function32;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(defaultMarkdownColors, defaultMarkdownTypography, modifier, defaultMarkdownPadding, defaultMarkdownDimens, noOpImageTransformerImpl2, defaultMarkdownAnnotator2, defaultMarkdownExtendedSpans, defaultMarkdownInlineContent2, defaultMarkdownComponents, defaultMarkdownAnimation2, function33, function52, function34, i) { // from class: com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda0
                public final /* synthetic */ DefaultMarkdownColors f$1;
                public final /* synthetic */ DefaultMarkdownComponents f$10;
                public final /* synthetic */ DefaultMarkdownAnimation f$11;
                public final /* synthetic */ Function3 f$12;
                public final /* synthetic */ Function5 f$13;
                public final /* synthetic */ Function3 f$14;
                public final /* synthetic */ DefaultMarkdownTypography f$2;
                public final /* synthetic */ Modifier f$3;
                public final /* synthetic */ DefaultMarkdownPadding f$4;
                public final /* synthetic */ DefaultMarkdownDimens f$5;
                public final /* synthetic */ NoOpImageTransformerImpl f$6;
                public final /* synthetic */ DefaultMarkdownAnnotator f$7;
                public final /* synthetic */ DefaultMarkdownExtendedSpans f$8;
                public final /* synthetic */ DefaultMarkdownInlineContent f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    InterruptibleKt.Markdown(MarkdownStateImpl.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
