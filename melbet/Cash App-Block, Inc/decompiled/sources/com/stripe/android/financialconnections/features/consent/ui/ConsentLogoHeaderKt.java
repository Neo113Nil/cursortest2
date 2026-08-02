package com.stripe.android.financialconnections.features.consent.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.collection.internal.Lock;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.charting.components.ChartWithYAxisKt$$ExternalSyntheticLambda6;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.financialconnections.navigation.ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public abstract class ConsentLogoHeaderKt {
    public static final ComposableLambdaImpl lambda$230959578 = new ComposableLambdaImpl(new ComposableSingletons$DestinationKt$$ExternalSyntheticLambda0(1), false, 230959578);

    /* renamed from: AnimatedDotsWithFixedGradient-RIQooxk, reason: not valid java name */
    public static final void m4015AnimatedDotsWithFixedGradientRIQooxk(Modifier modifier, long j, long j2, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1141289636);
        int i2 = i | 6 | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(j2) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("animated-dots-transition", gapComposer, 0), RecyclerView.DECELERATION_RATE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(10.0f), AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), "animated-dots", gapComposer, 28728, 0);
            LinearGradient m131horizontalGradient8A3gB4$default = Lock.m131horizontalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(j), new Color(j2)}), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 32.0f), 6.0f), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).background, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
            boolean changed = gapComposer.changed(animateFloat) | gapComposer.changed(m131horizontalGradient8A3gB4$default);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda0(16, animateFloat, m131horizontalGradient8A3gB4$default);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(0, gapComposer, matchParentSize, (Function1) rememberedValue);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ConsentLogoHeaderKt$$ExternalSyntheticLambda5(modifier2, j, j2, i);
        }
    }

    public static final void BackgroundRow(int i, Composer composer, List list) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1433738522);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            gapComposer.startReplaceGroup(1248331421);
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = i3 + 1;
                AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) it.next();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 72.0f));
                if (i3 != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    gapComposer.startReplaceGroup(43707424);
                    m4015AnimatedDotsWithFixedGradientRIQooxk(null, getPrevalentColorCloseToDots(ColorKt.asAndroidBitmap(androidImageBitmap), false), getPrevalentColorCloseToDots(ColorKt.asAndroidBitmap((AndroidImageBitmap) list.get(i4)), true), gapComposer, 0);
                } else {
                    gapComposer.startReplaceGroup(39473816);
                }
                gapComposer.end(false);
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, 10, list);
        }
    }

    public static final void ConsentLogoHeader(Modifier modifier, List list, boolean z, Composer composer, int i) {
        ArrayList arrayList;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-723600925);
        int i2 = i | (gapComposer.changedInstance(list) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Integer.valueOf((int) density.mo236toPx0680j_4(36.0f));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            DefaultStripeImageLoader defaultStripeImageLoader = (DefaultStripeImageLoader) gapComposer.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader);
            long j = ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).backgroundSecondary;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                createBitmap.eraseColor(ColorKt.m694toArgb8_81llA(j));
                AndroidImageBitmap androidImageBitmap = new AndroidImageBitmap(createBitmap);
                gapComposer.updateRememberedValue(androidImageBitmap);
                rememberedValue2 = androidImageBitmap;
            }
            AndroidImageBitmap androidImageBitmap2 = (AndroidImageBitmap) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                if (booleanValue) {
                    List take = CollectionsKt.take(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.Red), new Color(Color.Blue), new Color(Color.Green)}), list.size());
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                    Iterator it = take.iterator();
                    while (it.hasNext()) {
                        long j2 = ((Color) it.next()).value;
                        Bitmap createBitmap2 = Bitmap.createBitmap(intValue, intValue, Bitmap.Config.ARGB_8888);
                        createBitmap2.getClass();
                        new Canvas(createBitmap2).drawColor(ColorKt.m694toArgb8_81llA(j2));
                        arrayList.add(new AndroidImageBitmap(createBitmap2));
                    }
                } else {
                    int size = list.size();
                    arrayList = new ArrayList(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList.add(androidImageBitmap2);
                    }
                }
                rememberedValue3 = Updater.mutableStateOf$default(arrayList);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changedInstance(defaultStripeImageLoader) | gapComposer.changedInstance(androidImageBitmap2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                RealClientRouteRouter$route$1 realClientRouteRouter$route$1 = new RealClientRouteRouter$route$1(list, defaultStripeImageLoader, intValue, androidImageBitmap2, mutableState, null);
                gapComposer.updateRememberedValue(realClientRouteRouter$route$1);
                rememberedValue4 = realClientRouteRouter$route$1;
            }
            Updater.LaunchedEffect(gapComposer, list, (Function2) rememberedValue4);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(modifier, 72.0f), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (z) {
                gapComposer.startReplaceGroup(-498310930);
                BackgroundRow(0, gapComposer, (List) mutableState.getValue());
            } else {
                gapComposer.startReplaceGroup(-502047515);
            }
            gapComposer.end(false);
            m4016ForegroundRowziNgDLE((List) mutableState.getValue(), z ? 32.0f : 16.0f, gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(modifier, list, z, i, 8);
        }
    }

    /* renamed from: ForegroundRow-ziNgDLE, reason: not valid java name */
    public static final void m4016ForegroundRowziNgDLE(List list, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1739757965);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            gapComposer.startReplaceGroup(-318952493);
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = i3 + 1;
                Logo((AndroidImageBitmap) it.next(), gapComposer, 0);
                if (i3 != CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    gapComposer.startReplaceGroup(-1297485367);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, f));
                } else {
                    gapComposer.startReplaceGroup(-1302492301);
                }
                gapComposer.end(false);
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChartWithYAxisKt$$ExternalSyntheticLambda6(list, f, i, 2);
        }
    }

    public static final void Logo(AndroidImageBitmap androidImageBitmap, Composer composer, int i) {
        AndroidImageBitmap androidImageBitmap2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1297041747);
        int i2 = (gapComposer.changedInstance(androidImageBitmap) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(18.0f);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(ShadowKt.m591shadows4CzXII$default(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 72.0f), 8.0f, m340RoundedCornerShape0680j_4, false, 28), m340RoundedCornerShape0680j_4), ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).backgroundSecondary, m340RoundedCornerShape0680j_4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            androidImageBitmap2 = androidImageBitmap;
            CrossfadeKt.Crossfade(androidImageBitmap2, (Modifier) null, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), (String) null, lambda$230959578, gapComposer, (i2 & 14) | 24960, 10);
            gapComposer.end(true);
        } else {
            androidImageBitmap2 = androidImageBitmap;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda5(androidImageBitmap2, i, 12);
        }
    }

    public static final long getPrevalentColorCloseToDots(Bitmap bitmap, boolean z) {
        Object obj;
        HashMap hashMap = new HashMap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (z) {
            width /= 4;
        }
        int i = (height * 2) / 5;
        int i2 = (height * 3) / 5;
        for (int i3 = z ? 0 : (width * 3) / 4; i3 < width; i3++) {
            for (int i4 = i; i4 < i2; i4++) {
                int pixel = bitmap.getPixel(i3, i4);
                Integer valueOf = Integer.valueOf(pixel);
                Integer num = (Integer) hashMap.get(Integer.valueOf(pixel));
                hashMap.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        return entry != null ? ColorKt.Color(((Number) entry.getKey()).intValue()) : Color.Black;
    }
}
