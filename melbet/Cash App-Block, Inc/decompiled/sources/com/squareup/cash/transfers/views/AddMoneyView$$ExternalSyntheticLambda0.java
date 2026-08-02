package com.squareup.cash.transfers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.navigation.NavDestination;
import androidx.navigation.NavInflater;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class AddMoneyView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ AddMoneyView f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ AddMoneyViewModel f$2;

    public /* synthetic */ AddMoneyView$$ExternalSyntheticLambda0(AddMoneyViewModel addMoneyViewModel, Function1 function1, AddMoneyView addMoneyView) {
        this.f$2 = addMoneyViewModel;
        this.f$1 = function1;
        this.f$0 = addMoneyView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AddMoneyViewModel addMoneyViewModel = this.f$2;
        Object obj3 = Composer.Companion.Empty;
        final AddMoneyView addMoneyView = this.f$0;
        final Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(addMoneyView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1661138256, new AddMoneyView$$ExternalSyntheticLambda0(addMoneyViewModel, function1, addMoneyView), gapComposer), gapComposer, 56);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(7, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                addMoneyView.Content(addMoneyViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj3) {
                        rememberedValue2 = ((LocalizedMoneyFormatter.Factory) addMoneyView.moneyFormatterFactory).createNoSymbolCompact();
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    final MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue2;
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    gapComposer2.startReplaceGroup(1373975963);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(Arrangement$End$1.current(gapComposer2).navigationBars.getInsets$foundation_layout().bottom);
                    gapComposer2.end(false);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == obj3) {
                        rememberedValue3 = new TaxReturnsView$$ExternalSyntheticLambda0(8, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function0 = (Function0) rememberedValue3;
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == obj3) {
                        rememberedValue4 = new TaxWebAppBridge$$ExternalSyntheticLambda1(15);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function12 = (Function1) rememberedValue4;
                    boolean changedInstance = gapComposer2.changedInstance(addMoneyView) | gapComposer2.changed(density) | gapComposer2.changed(mo233toDpu2uoSUM);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue5 == obj3) {
                        rememberedValue5 = new ThumbNode$$ExternalSyntheticLambda0(addMoneyView, density, mo233toDpu2uoSUM, 11);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function13 = (Function1) rememberedValue5;
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue6 == obj3) {
                        rememberedValue6 = new TaxReturnsView$$ExternalSyntheticLambda0(9, function1);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function02 = (Function0) rememberedValue6;
                    boolean changed4 = gapComposer2.changed(function1);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue7 == obj3) {
                        rememberedValue7 = new TaxReturnsView$$ExternalSyntheticLambda0(10, function1);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    final AddMoneyViewModel addMoneyViewModel2 = this.f$2;
                    NavInflater.Companion.TransferSheet(addMoneyViewModel2, function0, function12, function13, function02, (Function0) rememberedValue7, true, null, Expect_jvmKt.rememberComposableLambda(1648870774, new Function6() { // from class: com.squareup.cash.transfers.views.AddMoneyView$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function6
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                            int i2;
                            float f;
                            float floatValue = ((Float) obj4).floatValue();
                            PaddingValues paddingValues = (PaddingValues) obj5;
                            Function0 function03 = (Function0) obj6;
                            Function0 function04 = (Function0) obj7;
                            Composer composer3 = (Composer) obj8;
                            int intValue3 = ((Integer) obj9).intValue();
                            paddingValues.getClass();
                            function03.getClass();
                            function04.getClass();
                            if ((intValue3 & 6) == 0) {
                                i2 = (((GapComposer) composer3).changed(floatValue) ? 4 : 2) | intValue3;
                            } else {
                                i2 = intValue3;
                            }
                            if ((intValue3 & 48) == 0) {
                                i2 |= ((GapComposer) composer3).changed(paddingValues) ? 32 : 16;
                            }
                            if ((intValue3 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i2 |= ((GapComposer) composer3).changedInstance(function03) ? 256 : 128;
                            }
                            if ((intValue3 & 3072) == 0) {
                                i2 |= ((GapComposer) composer3).changedInstance(function04) ? 2048 : 1024;
                            }
                            int i3 = i2;
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            boolean shouldExecute = gapComposer3.shouldExecute(i3 & 1, (i3 & 9363) != 9362);
                            Applier applier = gapComposer3.applier;
                            if (shouldExecute) {
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j = colors.semantic.background.f1047app;
                                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                                Modifier modifier = Modifier.Companion.$$INSTANCE;
                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, j, rectangleShapeKt$RectangleShape$1);
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer3.startReusableNode();
                                if (gapComposer3.inserting) {
                                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer3.useNode();
                                }
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                                Integer valueOf = Integer.valueOf(hashCode);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                                Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                                AddMoneyViewModel addMoneyViewModel3 = AddMoneyViewModel.this;
                                if (addMoneyViewModel3.getAllowSheetExpansion()) {
                                    f = floatValue;
                                    modifier = new LayoutWeightElement(1.0f, true);
                                } else {
                                    f = floatValue;
                                }
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, modifier);
                                gapComposer3.startReusableNode();
                                if (gapComposer3.inserting) {
                                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer3.useNode();
                                }
                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                                Object rememberedValue8 = gapComposer3.rememberedValue();
                                if (rememberedValue8 == Composer.Companion.Empty) {
                                    rememberedValue8 = new TaxWebAppBridge$$ExternalSyntheticLambda1(14);
                                    gapComposer3.updateRememberedValue(rememberedValue8);
                                }
                                NavDestination.Companion.SheetCrossfade(addMoneyViewModel3, f, null, (Function1) rememberedValue8, Expect_jvmKt.rememberComposableLambda(-2056065983, new SsnViewKt$$ExternalSyntheticLambda7(paddingValues, function1, function03, moneyFormatter, addMoneyView, function04, 6), gapComposer3), gapComposer3, ((i3 << 3) & 112) | 27648);
                                gapComposer3.end(true);
                                gapComposer3.end(true);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 102236544, 128);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AddMoneyView$$ExternalSyntheticLambda0(AddMoneyView addMoneyView, AddMoneyViewModel addMoneyViewModel, Function1 function1, int i) {
        this.f$0 = addMoneyView;
        this.f$2 = addMoneyViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ AddMoneyView$$ExternalSyntheticLambda0(AddMoneyView addMoneyView, Function1 function1, AddMoneyViewModel addMoneyViewModel) {
        this.f$0 = addMoneyView;
        this.f$1 = function1;
        this.f$2 = addMoneyViewModel;
    }
}
