package com.squareup.cash.support.views.search;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.favorites.components.ListFavoritesViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.stripe.android.uicore.elements.FormLabelKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class SupportSearchViewKt {

    /* renamed from: lambda$-1496683404, reason: not valid java name */
    public static final ComposableLambdaImpl f715lambda$1496683404 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(29), false, -1496683404);

    public static final void ContactOption(final SupportSearchViewModel.SearchResultViewModel.ContactOption contactOption, Function0 function0, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        String str = contactOption.subtitle;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1731726471);
        int i2 = (gapComposer.changedInstance(contactOption) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (str == null) {
                gapComposer.startReplaceGroup(1284140093);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1284140094);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-558843267, new PastPaySectionKt$$ExternalSyntheticLambda1(str, 6), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
            boolean z = str == null || str.length() == 0;
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            boolean z2 = contactOption.enabled;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1048735847, new Function2() { // from class: com.squareup.cash.support.views.search.SupportSearchViewKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = r2;
                    SupportSearchViewModel.SearchResultViewModel.ContactOption contactOption2 = contactOption;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Trace.m1191Iconww6aTOc(SupportSearchViewKt.getArcadeIcon(contactOption2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactOption2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-885470552, new Function2() { // from class: com.squareup.cash.support.views.search.SupportSearchViewKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    SupportSearchViewModel.SearchResultViewModel.ContactOption contactOption2 = contactOption;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Trace.m1191Iconww6aTOc(SupportSearchViewKt.getArcadeIcon(contactOption2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactOption2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            r8 = (i2 & 112) == 32 ? 1 : 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r8 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(9, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, fillMaxWidth, (Function0) rememberedValue, z2, z, composableLambdaImpl, null, push, 0L, gapComposer, 805306806, 3344);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(contactOption, function0, i, 23);
        }
    }

    public static final void HeaderRow(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-619821374);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, false, (Function1) rememberedValue);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, semantics, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(str, modifier, i, 7, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ItemRow(final SupportSearchViewModel.HighlightedString highlightedString, SupportSearchViewModel.HighlightedString highlightedString2, Icons icons, boolean z, Function0 function0, Composer composer, int i, int i2) {
        final SupportSearchViewModel.HighlightedString highlightedString3;
        int i3;
        int i4;
        boolean z2;
        int i5;
        Function0 function02;
        int i6;
        GapComposer gapComposer;
        Icons icons2;
        SupportSearchViewModel.HighlightedString highlightedString4;
        boolean z3;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        Function0 function04;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-69115844);
        int i7 = (gapComposer2.changedInstance(highlightedString) ? 4 : 2) | i;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            highlightedString3 = highlightedString2;
        } else {
            highlightedString3 = highlightedString2;
            i3 = i7 | (gapComposer2.changedInstance(highlightedString3) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
        } else {
            i4 = i3 | (gapComposer2.changed(icons == null ? -1 : icons.ordinal()) ? 256 : 128);
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i4 |= gapComposer2.changed(z2) ? 2048 : 1024;
            i5 = i2 & 16;
            if (i5 == 0) {
                i6 = i4 | 24576;
                function02 = function0;
            } else {
                function02 = function0;
                i6 = i4 | (gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked);
            }
            final int i11 = 1;
            if (gapComposer2.shouldExecute(i6 & 1, (i6 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                icons2 = icons;
                highlightedString4 = highlightedString3;
                z3 = z2;
                function03 = function02;
            } else {
                if (i8 != 0) {
                    highlightedString3 = null;
                }
                icons2 = i9 != 0 ? null : icons;
                boolean z4 = i10 != 0 ? true : z2;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i5 != 0) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ArticleViewKt$$ExternalSyntheticLambda7(1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    function04 = (Function0) rememberedValue;
                } else {
                    function04 = function02;
                }
                CellDefaultAccessory.Push push = z4 ? CellDefaultAccessory.Push.INSTANCE : null;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1853552470, new InfoSectionKt$$ExternalSyntheticLambda6(icons2, 28), gapComposer2);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1589855445, new Function2() { // from class: com.squareup.cash.support.views.search.SupportSearchViewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = r2;
                        SupportSearchViewModel.HighlightedString highlightedString5 = highlightedString;
                        switch (i12) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    AnnotatedString annotatedString = new AnnotatedString(highlightedString5.text, SupportSearchViewKt.highlight(highlightedString5, true, gapComposer3));
                                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.cell.label.f175default, (Composer) gapComposer3, (Modifier) null, annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    if (highlightedString5 != null) {
                                        String str = highlightedString5.text;
                                        if (!Intrinsics.areEqual(str, "")) {
                                            gapComposer4.startReplaceGroup(-961786442);
                                            AnnotatedString annotatedString2 = new AnnotatedString(str, SupportSearchViewKt.highlight(highlightedString5, false, gapComposer4));
                                            TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                            Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                            } else {
                                                gapComposer4.startReplaceGroup(-1762997739);
                                                gapComposer4.end(false);
                                            }
                                            Room.m1164Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, annotatedString2, textStyle2, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                            gapComposer4.end(false);
                                        }
                                    }
                                    gapComposer4.startReplaceGroup(-961469157);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2);
                r14 = (i6 & 57344) == 16384 ? 1 : 0;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (r14 != 0 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda2(8, function04);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                gapComposer = gapComposer2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(-7673295, new Function2() { // from class: com.squareup.cash.support.views.search.SupportSearchViewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = i11;
                        SupportSearchViewModel.HighlightedString highlightedString5 = highlightedString3;
                        switch (i12) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    AnnotatedString annotatedString = new AnnotatedString(highlightedString5.text, SupportSearchViewKt.highlight(highlightedString5, true, gapComposer3));
                                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.cell.label.f175default, (Composer) gapComposer3, (Modifier) null, annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    if (highlightedString5 != null) {
                                        String str = highlightedString5.text;
                                        if (!Intrinsics.areEqual(str, "")) {
                                            gapComposer4.startReplaceGroup(-961786442);
                                            AnnotatedString annotatedString2 = new AnnotatedString(str, SupportSearchViewKt.highlight(highlightedString5, false, gapComposer4));
                                            TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                            Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                            } else {
                                                gapComposer4.startReplaceGroup(-1762997739);
                                                gapComposer4.end(false);
                                            }
                                            Room.m1164Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, annotatedString2, textStyle2, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                            gapComposer4.end(false);
                                        }
                                    }
                                    gapComposer4.startReplaceGroup(-961469157);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), null, push, 0L, gapComposer, 12582966, 3444);
                boolean z5 = z4;
                function03 = function04;
                highlightedString4 = highlightedString3;
                z3 = z5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(highlightedString, highlightedString4, icons2, z3, function03, i, i2, 13);
                return;
            }
            return;
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        final int i112 = 1;
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void Results(List list, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-866057679);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue);
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(list) | ((i2 & 896) == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ListFavoritesViewKt$$ExternalSyntheticLambda9(list, function1, function12, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(semantics, null, asPaddingValues, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 506);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(list, function1, function12, i, 29);
        }
    }

    public static final void SupportSearch(SupportSearchViewModel supportSearchViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        int i2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(634012914);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changedInstance(supportSearchViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer2, 6, 2);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer2);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i5 = i4 & 112;
            boolean changed = (i5 == 32) | gapComposer2.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 17);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, charSequence, (Function2) rememberedValue);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.imePadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1)), 1.0f);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda28(19);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxSize, false, (Function1) rememberedValue2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(companion);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, statusBarsPadding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$1;
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, m382rememberTextFieldStateLepunE.getValue$foundation().text.length() == 0, null, null, null, null, Expect_jvmKt.rememberComposableLambda(434873774, new WorkWebViewKt$$ExternalSyntheticLambda14(10, function1), gapComposer2), gapComposer2, 1572870, 30);
            boolean z = true;
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, Room.stringResource(gapComposer2, R.string.support_flow_search_placeholder_text), rememberSearchBarKeyboardState, null, null, m382rememberTextFieldStateLepunE.getValue$foundation().text.length() > 0 ? ShowNavigationBack.WhenKeyboardOpen : ShowNavigationBack.Never, null, null, null, null, true, null, gapComposer2, 0, 6, 7128);
            gapComposer = gapComposer2;
            re$$ExternalSyntheticOutline0.m(companion, 24.0f, gapComposer, true);
            if (supportSearchViewModel instanceof SupportSearchViewModel.Loaded) {
                gapComposer.startReplaceGroup(-2058739872);
                List list = ((SupportSearchViewModel.Loaded) supportSearchViewModel).results;
                boolean z2 = i5 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy) {
                    function12 = function1;
                    rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(20, function12);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    function12 = function1;
                }
                Function1 function13 = (Function1) rememberedValue3;
                boolean z3 = i5 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new ScoreHomeKt$$ExternalSyntheticLambda5(21, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Results(list, function13, (Function1) rememberedValue4, gapComposer, 0);
                gapComposer.end(false);
                i2 = 6;
            } else {
                function12 = function1;
                if (supportSearchViewModel instanceof SupportSearchViewModel.Loading) {
                    gapComposer.startReplaceGroup(-2058520082);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2)), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 50.0f));
                    gapComposer.end(true);
                    gapComposer.end(false);
                    i2 = 6;
                } else {
                    if (!(supportSearchViewModel instanceof SupportSearchViewModel.NoResults)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1734704492, false);
                    }
                    gapComposer.startReplaceGroup(-2058230294);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    String stringResource = Room.stringResource(gapComposer, R.string.support_flow_search_no_results_title);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TabToolbarsKt$$ExternalSyntheticLambda28(22);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    HeaderRow(0, gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue5), stringResource);
                    i2 = 6;
                    ItemRow(new SupportSearchViewModel.HighlightedString(Room.stringResource(gapComposer, R.string.support_flow_search_no_results_list_item), EmptyList.INSTANCE), null, null, false, null, gapComposer, 3072, 22);
                    gapComposer = gapComposer;
                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, 32.0f));
                    List list2 = ((SupportSearchViewModel.NoResults) supportSearchViewModel).contactOptions;
                    boolean z4 = i5 == 32;
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (z4 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ScoreHomeKt$$ExternalSyntheticLambda5(22, function12);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    Function1 function14 = (Function1) rememberedValue6;
                    boolean z5 = i5 == 32;
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ScoreHomeKt$$ExternalSyntheticLambda5(23, function12);
                        gapComposer.updateRememberedValue(rememberedValue7);
                    }
                    Results(list2, function14, (Function1) rememberedValue7, gapComposer, 0);
                    z = true;
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(z);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            i2 = 6;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(supportSearchViewModel, function12, i, i2);
        }
    }

    public static final Icons getArcadeIcon(SupportSearchViewModel.Icon icon) {
        int ordinal = icon.ordinal();
        if (ordinal == 0) {
            return Icons.DocumentFill24;
        }
        if (ordinal == 1) {
            return Icons.Hyperlink24;
        }
        if (ordinal == 2) {
            return Icons.LinkOut24;
        }
        if (ordinal == 3) {
            return Icons.CommSms24;
        }
        if (ordinal == 4) {
            return Icons.CommPhoneFill24;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final ArrayList highlight(SupportSearchViewModel.HighlightedString highlightedString, boolean z, GapComposer gapComposer) {
        SpanStyle spanStyle;
        gapComposer.startReplaceGroup(534097973);
        List<IntRange> list = highlightedString.highlights;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (IntRange intRange : list) {
            if (z) {
                gapComposer.startReplaceGroup(-1381841920);
                TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, FontWeight.Bold, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1381739744);
                TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-1381598632);
                spanStyle = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, FontWeight.Bold, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211).spanStyle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1381488520);
                spanStyle = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211).spanStyle;
                gapComposer.end(false);
            }
            arrayList.add(new AnnotatedString.Range(spanStyle, intRange.first, intRange.last));
        }
        gapComposer.end(false);
        return arrayList;
    }
}
