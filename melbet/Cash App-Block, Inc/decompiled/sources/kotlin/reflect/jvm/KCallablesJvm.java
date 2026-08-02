package kotlin.reflect.jvm;

import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsExplanationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewModel;
import com.squareup.cash.growtools.views.manager.GrowToolsCompleteActivityView$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.jvm.internal.ReflectKProperty;

/* loaded from: classes9.dex */
public abstract class KCallablesJvm {
    public static final void GrowToolsCompleteActivity(GrowToolsActivityViewModel growToolsActivityViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-328093802);
        int i2 = (gapComposer.changedInstance(growToolsActivityViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            String str = growToolsActivityViewModel.title;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda4(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            AvatarsKt.ActivityScrollableEmbeddedView(growToolsActivityViewModel.activityEmbeddedViewModel, (Modifier) null, (LazyListState) null, (PaddingValues) null, Expect_jvmKt.rememberComposableLambda(2064756465, new FormView$$ExternalSyntheticLambda0(growToolsActivityViewModel, 5), gapComposer), (Function2) null, (Function3) null, gapComposer, 24576, 494);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GrowToolsCompleteActivityView$$ExternalSyntheticLambda0(growToolsActivityViewModel, function1, i);
        }
    }

    public static final void StatsHeader(ArrayList arrayList, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1131029966);
        int i2 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i;
        int i3 = 3;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 8.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            gapComposer.startReplaceGroup(-1183067527);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GrowToolsActivityViewModel.TotalStat totalStat = (GrowToolsActivityViewModel.TotalStat) it.next();
                KTypesJvm.m4140StatViewxkNWiIY(totalStat.stat, totalStat.label, new LayoutWeightElement(1.0f, true), 3, gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsExplanationViewKt$$ExternalSyntheticLambda5(arrayList, i, i3);
        }
    }

    public static byte[] dbl(byte[] bArr) {
        if (bArr.length != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE)) ^ bArr2[15]);
        return bArr2;
    }

    public static final boolean isAccessible(ReflectKProperty reflectKProperty) {
        if (reflectKProperty instanceof KMutableProperty) {
            Field javaField = ReflectJvmMapping.getJavaField(reflectKProperty);
            if (!(javaField != null ? javaField.isAccessible() : true)) {
                return false;
            }
            Method javaMethod = ReflectJvmMapping.getJavaMethod(reflectKProperty.getGetter());
            if (!(javaMethod != null ? javaMethod.isAccessible() : true)) {
                return false;
            }
            Method javaMethod2 = ReflectJvmMapping.getJavaMethod(((KMutableProperty) reflectKProperty).getSetter());
            if (!(javaMethod2 != null ? javaMethod2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field javaField2 = ReflectJvmMapping.getJavaField(reflectKProperty);
            if (!(javaField2 != null ? javaField2.isAccessible() : true)) {
                return false;
            }
            Method javaMethod3 = ReflectJvmMapping.getJavaMethod(reflectKProperty.getGetter());
            if (!(javaMethod3 != null ? javaMethod3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
