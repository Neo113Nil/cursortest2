package com.squareup.cash.stablecoin.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.glance.appwidget.WidgetLayoutKt;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class StablecoinHomeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProductSearchView f$0;
    public final /* synthetic */ StablecoinHomeViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ StablecoinHomeView$$ExternalSyntheticLambda0(Function1 function1, StablecoinHomeViewModel stablecoinHomeViewModel, ProductSearchView productSearchView) {
        this.$r8$classId = 1;
        this.f$2 = function1;
        this.f$1 = stablecoinHomeViewModel;
        this.f$0 = productSearchView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        StablecoinHomeViewModel stablecoinHomeViewModel = this.f$1;
        ProductSearchView productSearchView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                productSearchView.Content(stablecoinHomeViewModel, function1, composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
                    NavigationIconType navigationIconType = NavigationIconType.BACK;
                    Function1 function12 = this.f$2;
                    boolean changed = gapComposer.changed(function12);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda6(28, function12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    WidgetLayoutKt.StablecoinToolbar(6, gapComposer, null, (Function0) rememberedValue);
                    WidgetLayoutKt.HomeContent(this.f$1, (RealImageLoader) productSearchView.imageLoader, null, function12, gapComposer, 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                productSearchView.Content(stablecoinHomeViewModel, function1, composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ StablecoinHomeView$$ExternalSyntheticLambda0(ProductSearchView productSearchView, StablecoinHomeViewModel stablecoinHomeViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = productSearchView;
        this.f$1 = stablecoinHomeViewModel;
        this.f$2 = function1;
    }
}
