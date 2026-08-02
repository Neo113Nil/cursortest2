package kotlinx.coroutines.channels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.tracing.Trace;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.model.DefaultMarkdownColors;
import com.mikepenz.markdown.model.DefaultMarkdownDimens;
import com.mikepenz.markdown.model.DefaultMarkdownPadding;
import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.components.families.DependentAutoInvestViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.MoshiJsonIntegration;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final void DependentAutoInvestView(DependentAutoInvestViewModel dependentAutoInvestViewModel, RealImageLoader realImageLoader, Function1 function1, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(445033323);
        int i2 = (gapComposer.changed(dependentAutoInvestViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(realImageLoader) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1782415728, new MoneyUiFactory$$ExternalSyntheticLambda1(dependentAutoInvestViewModel, function0, function1, realImageLoader, 15), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(dependentAutoInvestViewModel, realImageLoader, function1, function0, i);
        }
    }

    public static final void Icon(LinkScanner linkScanner, char c, RealImageLoader realImageLoader, Composer composer, int i) {
        char c2;
        RealImageLoader realImageLoader2;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-705780761);
        int i3 = (gapComposer.changed(linkScanner) ? 4 : 2) | i | (gapComposer.changed(c) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            c2 = c;
            realImageLoader2 = realImageLoader;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else if (linkScanner instanceof InvestingCryptoAvatarContentModel$Icon) {
            gapComposer.startReplaceGroup(-2049555338);
            gapComposer.end(false);
            c2 = c;
            realImageLoader2 = realImageLoader;
            i2 = i;
        } else if (linkScanner instanceof InvestingCryptoAvatarContentModel$Image) {
            gapComposer.startReplaceGroup(-2049427897);
            if (realImageLoader == null) {
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new DependentAutoInvestViewKt$$ExternalSyntheticLambda4(linkScanner, c, realImageLoader, i, 0);
                    return;
                }
                return;
            }
            c2 = c;
            realImageLoader2 = realImageLoader;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(1940785318, new DependentAutoInvestViewKt$$ExternalSyntheticLambda4(realImageLoader2, linkScanner, c2), gapComposer), gapComposer, 56);
            gapComposer.end(false);
            linkScanner = linkScanner;
            i2 = i;
        } else {
            c2 = c;
            realImageLoader2 = realImageLoader;
            if (linkScanner instanceof InvestingCryptoAvatarContentModel$ImageWithBackground) {
                gapComposer.startReplaceGroup(-2049059555);
                if (realImageLoader2 == null) {
                    gapComposer.end(false);
                    RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.block = new DependentAutoInvestViewKt$$ExternalSyntheticLambda4(linkScanner, c2, realImageLoader2, i, 2);
                        return;
                    }
                    return;
                }
                linkScanner = linkScanner;
                i2 = i;
                InvestingCryptoAvatarContentModel$ImageWithBackground investingCryptoAvatarContentModel$ImageWithBackground = (InvestingCryptoAvatarContentModel$ImageWithBackground) linkScanner;
                StackedAvatars(realImageLoader2, investingCryptoAvatarContentModel$ImageWithBackground.image, MoshiJsonIntegration.toModel(investingCryptoAvatarContentModel$ImageWithBackground.bgColor), c2, gapComposer, ((i3 >> 6) & 14) | ((i3 << 6) & 7168));
                gapComposer.end(false);
            } else {
                linkScanner = linkScanner;
                i2 = i;
                if (linkScanner != null) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 349525961, false);
                }
                gapComposer.startReplaceGroup(-2048832263);
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup3 = gapComposer.endRestartGroup();
        if (endRestartGroup3 != null) {
            endRestartGroup3.block = new DependentAutoInvestViewKt$$ExternalSyntheticLambda4(linkScanner, c2, realImageLoader2, i2, 3);
        }
    }

    public static final void MarkdownBlockQuote(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Composer composer, int i) {
        long j;
        PaddingValuesImpl paddingValuesImpl;
        DefaultMarkdownComponents defaultMarkdownComponents;
        boolean z;
        boolean z2;
        String str2 = str;
        str2.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(925655087);
        int i2 = (i & 6) == 0 ? (gapComposer.changed(str2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(aSTNodeImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(textStyle) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            if (textStyle.m996getColor0d7_KjU() != 16) {
                gapComposer.startReplaceGroup(-1794126440);
                gapComposer.end(false);
                j = textStyle.m996getColor0d7_KjU();
            } else {
                gapComposer.startReplaceGroup(-1794093053);
                j = ((DefaultMarkdownColors) gapComposer.consume(ComposeLocalKt.LocalMarkdownColors)).text;
                gapComposer.end(false);
            }
            ((DefaultMarkdownDimens) gapComposer.consume(ComposeLocalKt.LocalMarkdownDimens)).getClass();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ComposeLocalKt.LocalMarkdownPadding;
            PaddingValuesImpl paddingValuesImpl2 = ((DefaultMarkdownPadding) gapComposer.consume(staticProvidableCompositionLocal)).blockQuote;
            PaddingValuesImpl paddingValuesImpl3 = ((DefaultMarkdownPadding) gapComposer.consume(staticProvidableCompositionLocal)).blockQuoteText;
            float f = paddingValuesImpl3.bottom;
            PaddingValues.Absolute absolute = ((DefaultMarkdownPadding) gapComposer.consume(staticProvidableCompositionLocal)).blockQuoteBar;
            DefaultMarkdownComponents defaultMarkdownComponents2 = (DefaultMarkdownComponents) gapComposer.consume(ComposeLocalKt.LocalMarkdownComponents);
            boolean changed = gapComposer.changed(2.0f) | gapComposer.changed(absolute) | gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(absolute, j, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier padding = SpacerKt.padding(ClipKt.drawBehind(companion, (Function1) rememberedValue), paddingValuesImpl2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            PaddingValuesImpl paddingValuesImpl4 = paddingValuesImpl3;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
            gapComposer.startReplaceGroup(-1311315795);
            float mo231toDpGaN1DYA = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(((DefaultMarkdownTypography) gapComposer.consume(ComposeLocalKt.LocalMarkdownTypography)).quote.spanStyle.fontSize);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-1311310050);
            int i4 = 0;
            boolean z3 = false;
            for (Object obj : aSTNodeImpl.getChildren()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj;
                if (Intrinsics.areEqual(aSTNodeImpl2.f1630type, MarkdownTokenTypes.BLOCK_QUOTE$1)) {
                    gapComposer.startReplaceGroup(255258854);
                    if (z3 || i4 == 0) {
                        z2 = false;
                        gapComposer.startReplaceGroup(255455456);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer, -545950814, companion, f, gapComposer);
                        z2 = false;
                    }
                    gapComposer.end(z2);
                    MarkdownBlockQuote(str2, aSTNodeImpl2, textStyle, gapComposer, i3 & 910);
                    gapComposer.end(z2);
                    defaultMarkdownComponents = defaultMarkdownComponents2;
                    z3 = true;
                } else if (Intrinsics.areEqual(aSTNodeImpl2.f1630type, MarkdownTokenTypes.EOL)) {
                    re$$ExternalSyntheticOutline0.m(gapComposer, 255622639, companion, mo231toDpGaN1DYA, gapComposer);
                    gapComposer.end(false);
                    defaultMarkdownComponents = defaultMarkdownComponents2;
                } else {
                    gapComposer.startReplaceGroup(255726675);
                    if (i4 == 0 || z3) {
                        gapComposer.startReplaceGroup(-545935969);
                        paddingValuesImpl = paddingValuesImpl4;
                        re$$ExternalSyntheticOutline0.m(companion, paddingValuesImpl.top, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(255912768);
                        gapComposer.end(false);
                        paddingValuesImpl = paddingValuesImpl4;
                    }
                    defaultMarkdownComponents = defaultMarkdownComponents2;
                    int i6 = i4;
                    paddingValuesImpl4 = paddingValuesImpl;
                    MarkdownExtensionKt.MarkdownElement(aSTNodeImpl2, defaultMarkdownComponents, str, false, gapComposer, ((i3 << 6) & 896) | 3072, 0);
                    if (i6 == CollectionsKt__CollectionsKt.getLastIndex(aSTNodeImpl.getChildren())) {
                        re$$ExternalSyntheticOutline0.m(gapComposer, -545922270, companion, f, gapComposer);
                        z = false;
                    } else {
                        z = false;
                        gapComposer.startReplaceGroup(256340320);
                    }
                    gapComposer.end(z);
                    gapComposer.end(z);
                    z3 = z;
                }
                defaultMarkdownComponents2 = defaultMarkdownComponents;
                i4 = i5;
                str2 = str;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(str, aSTNodeImpl, textStyle, i, 16);
        }
    }

    public static final void StackedAvatars(final RealImageLoader realImageLoader, final Image image, final ColorModel colorModel, final char c, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        Image image2;
        ColorModel colorModel2;
        char c2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(818689999);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(image) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(colorModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(c) ? 2048 : 1024;
        }
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer = gapComposer2;
            image2 = image;
            colorModel2 = colorModel;
            c2 = c;
            gapComposer.skipToGroupEnd();
        } else {
            if (realImageLoader == null) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.investing.components.families.DependentAutoInvestViewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    ChannelsKt__ChannelsKt.StackedAvatars(realImageLoader, image, colorModel, c, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    ChannelsKt__ChannelsKt.StackedAvatars(realImageLoader, image, colorModel, c, (Composer) obj, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            image2 = image;
            colorModel2 = colorModel;
            c2 = c;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomEnd, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1953964693, new DependentAutoInvestViewKt$$ExternalSyntheticLambda4(colorModel2, c2, image2), gapComposer2), gapComposer2, 56);
            Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(companion, 8.0f, 8.0f);
            long j = MooncakeTheme.getColors(gapComposer2).behindBackground;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(m272offsetVpY3zN4, j, roundedCornerShape), 2.0f, MooncakeTheme.getColors(gapComposer2).tertiaryBackground, roundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m178borderxT4_qwU);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer = gapComposer2;
            Trace.m1191Iconww6aTOc(Icons.RecurringAutomatic16, (String) null, SpacerKt.m298padding3ABfNKs(companion, 4.0f), 0L, gapComposer, 438, 8);
            gapComposer.end(true);
            gapComposer.end(true);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            final Image image3 = image2;
            final ColorModel colorModel3 = colorModel2;
            final char c3 = c2;
            function2 = new Function2() { // from class: com.squareup.cash.investing.components.families.DependentAutoInvestViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).intValue();
                            ChannelsKt__ChannelsKt.StackedAvatars(realImageLoader, image3, colorModel3, c3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            ChannelsKt__ChannelsKt.StackedAvatars(realImageLoader, image3, colorModel3, c3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final Object trySendBlocking(Object obj, SendChannel sendChannel) {
        Object mo1159trySendJP2dKIU = sendChannel.mo1159trySendJP2dKIU(obj);
        if (!(mo1159trySendJP2dKIU instanceof ChannelResult.Failed)) {
            return Unit.INSTANCE;
        }
        return ((ChannelResult) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new Logger$log$1(sendChannel, obj, (Continuation) null, 23))).holder;
    }
}
