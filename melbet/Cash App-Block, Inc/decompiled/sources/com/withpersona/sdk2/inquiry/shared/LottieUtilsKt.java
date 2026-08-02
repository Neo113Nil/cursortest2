package com.withpersona.sdk2.inquiry.shared;

import android.graphics.Typeface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.android.instantapps.InstantApps;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class LottieUtilsKt {
    public static final void TwoColumnCardWidget(final GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel, final Function1 function1, Composer composer, int i) {
        int i2;
        String str;
        long j;
        twoColumnCardViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1376457858);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(twoColumnCardViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5);
            if (twoColumnCardViewModel.showDropShadow) {
                modifier = KeypadKt.m3658mooncakeShadowWMci_g0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f), 23);
            }
            int i5 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(twoColumnCardViewModel) | (i5 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                Function0 function0 = new Function0() { // from class: com.squareup.cash.genericelements.components.components.TwoColumnCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = r3;
                        Function1 function12 = function1;
                        GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel2 = twoColumnCardViewModel;
                        switch (i6) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = twoColumnCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = twoColumnCardViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function0);
                obj = function0;
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(modifier, (Function0) obj);
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = twoColumnCardViewModel.event;
            Color color = null;
            if (genericTreeElementsViewEvent == null) {
                gapComposer.startReplaceGroup(-2002715695);
                gapComposer.end(false);
                str = null;
            } else {
                gapComposer.startReplaceGroup(73943600);
                String clickableLabel = zzbk.toClickableLabel(genericTreeElementsViewEvent, gapComposer);
                gapComposer.end(false);
                str = clickableLabel;
            }
            ColorModel colorModel = twoColumnCardViewModel.backgroundColor;
            if (colorModel == null) {
                gapComposer.startReplaceGroup(-2002645201);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(73945874);
                long backgroundColor = zzai.getBackgroundColor(colorModel, gapComposer);
                gapComposer.end(false);
                color = new Color(backgroundColor);
            }
            if (color == null) {
                gapComposer.startReplaceGroup(73947304);
                j = MooncakeTheme.getColors(gapComposer).background;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(73945196);
                gapComposer.end(false);
                j = color.value;
            }
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            int i6 = (gapComposer.changedInstance(twoColumnCardViewModel) ? 1 : 0) | (i5 == 256 ? 1 : 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj2 = rememberedValue2;
            if (i6 != 0 || rememberedValue2 == neverEqualPolicy) {
                Function0 function02 = new Function0() { // from class: com.squareup.cash.genericelements.components.components.TwoColumnCardWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i4;
                        Function1 function12 = function1;
                        GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel2 = twoColumnCardViewModel;
                        switch (i62) {
                            case 0:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = twoColumnCardViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = twoColumnCardViewModel2.event;
                                if (genericTreeElementsViewEvent2 != null) {
                                    function12.invoke(genericTreeElementsViewEvent2);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function02);
                obj2 = function02;
            }
            KeypadKt.m3641CardIkByU14(onVisible$default, m340RoundedCornerShape0680j_4, j, false, (Function0) obj2, str, null, Expect_jvmKt.rememberComposableLambda(244818114, new MoneyTabBookletKt$$ExternalSyntheticLambda4(twoColumnCardViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(twoColumnCardViewModel, function1, i);
        }
    }

    public static final void TwoColumnRow(GenericComponentViewModel.TwoColumnCardViewModel twoColumnCardViewModel, Function1 function1, Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        Modifier wrapContentHeight;
        int i2;
        ColumnWidth columnWidth;
        Modifier.Companion companion;
        Modifier weight;
        NeverEqualPolicy neverEqualPolicy;
        Modifier weight2;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1897597211);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(twoColumnCardViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            VerticalAlignment verticalAlignment = twoColumnCardViewModel.verticalAlignment;
            ColumnWidth columnWidth2 = twoColumnCardViewModel.columnWidth;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, zzat.toAlignment(verticalAlignment), gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int ordinal = columnWidth2.ordinal();
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (ordinal != 0) {
                i2 = i3;
                if (ordinal == 1) {
                    columnWidth = columnWidth2;
                    companion = companion2;
                    weight = SizeKt.wrapContentWidth$default(companion, null, 3);
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    SizeKt.fillMaxWidth(companion2, 1.0f);
                    columnWidth = columnWidth2;
                    companion = companion2;
                    weight = rowScopeInstance.weight(1.0f, companion, true);
                }
            } else {
                i2 = i3;
                columnWidth = columnWidth2;
                companion = companion2;
                SizeKt.wrapContentWidth$default(companion, null, 3);
                weight = rowScopeInstance.weight(1.0f, companion, true);
            }
            Modifier modifier = weight;
            Modifier.Companion companion3 = companion;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ArrayList arrayList = twoColumnCardViewModel.left;
            gapComposer.startReplaceGroup(-661871251);
            gapComposer.startReplaceGroup(-1545369890);
            Iterator it = CollectionsKt.filterNotNull(arrayList).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                neverEqualPolicy = Composer.Companion.Empty;
                if (!hasNext) {
                    break;
                }
                GenericBaseViewModel genericBaseViewModel = (GenericBaseViewModel) it.next();
                Modifier.Companion companion4 = companion3;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                InstantApps.GenericBaseElement(genericBaseViewModel, m302paddingqDBjuR0$default, (Function1) rememberedValue, gapComposer, 48);
                companion3 = companion4;
            }
            Modifier.Companion companion5 = companion3;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, false, true);
            if (twoColumnCardViewModel.spacingBetween == null) {
                gapComposer.startReplaceGroup(816702036);
            } else {
                gapComposer.startReplaceGroup(816702037);
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion5, r2.value));
            }
            gapComposer.end(false);
            int ordinal2 = columnWidth.ordinal();
            if (ordinal2 == 0) {
                SizeKt.wrapContentWidth$default(companion5, null, 3);
                weight2 = rowScopeInstance.weight(1.0f, companion5, true);
            } else if (ordinal2 == 1) {
                SizeKt.fillMaxWidth(companion5, 1.0f);
                weight2 = rowScopeInstance.weight(1.0f, companion5, true);
            } else {
                if (ordinal2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                weight2 = SizeKt.wrapContentWidth$default(companion5, null, 3);
            }
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, weight2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
            ArrayList arrayList2 = twoColumnCardViewModel.right;
            gapComposer.startReplaceGroup(-920757436);
            gapComposer.startReplaceGroup(-1276626393);
            Iterator it2 = CollectionsKt.filterNotNull(arrayList2).iterator();
            while (it2.hasNext()) {
                GenericBaseViewModel genericBaseViewModel2 = (GenericBaseViewModel) it2.next();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion5, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean z2 = (i2 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda3(26, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                InstantApps.GenericBaseElement(genericBaseViewModel2, m302paddingqDBjuR0$default2, (Function1) rememberedValue2, gapComposer, 48);
            }
            gapComposer.end(false);
            gapComposer.end(false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(twoColumnCardViewModel, function1, i, 23);
        }
    }

    public static final boolean isAboutEqual(double d, double d2) {
        return d < d2 + 0.01d && d > d2 - 0.01d;
    }

    public static final boolean isColorSubArray(int i, JSONArray jSONArray) {
        int i2 = i + 3;
        if (i2 > jSONArray.length()) {
            return false;
        }
        while (i < i2) {
            double optDouble = jSONArray.optDouble(i, Double.NaN);
            if (Double.isNaN(optDouble) || optDouble < 0.0d || optDouble > 1.0d) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final void replaceColorInPlace(JSONArray jSONArray, int i, ArrayList arrayList) {
        Object obj;
        if (i + 3 > jSONArray.length()) {
            return;
        }
        double d = jSONArray.getDouble(i);
        int i2 = i + 1;
        double d2 = jSONArray.getDouble(i2);
        int i3 = i + 2;
        double d3 = jSONArray.getDouble(i3);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ColorMapping colorMapping = (ColorMapping) obj;
            if (isAboutEqual(d, colorMapping.srcR) && isAboutEqual(d2, colorMapping.srcG) && isAboutEqual(d3, colorMapping.srcB)) {
                break;
            }
        }
        ColorMapping colorMapping2 = (ColorMapping) obj;
        if (colorMapping2 == null) {
            return;
        }
        jSONArray.put(i, colorMapping2.destR);
        jSONArray.put(i2, colorMapping2.destG);
        jSONArray.put(i3, colorMapping2.destB);
    }

    public static final void replaceColorsInArray(JSONArray jSONArray, ArrayList arrayList) {
        if (jSONArray.length() != 3 ? false : isColorSubArray(0, jSONArray)) {
            replaceColorInPlace(jSONArray, 0, arrayList);
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                replaceColorsInObject((JSONObject) obj, arrayList);
            } else if (obj instanceof JSONArray) {
                replaceColorsInArray((JSONArray) obj, arrayList);
            }
        }
    }

    public static final void replaceColorsInGradientData(JSONArray jSONArray, int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (i2 * 4) + 1;
            if (isColorSubArray(i3, jSONArray)) {
                replaceColorInPlace(jSONArray, i3, arrayList);
            }
        }
    }

    public static final void replaceColorsInObject(JSONObject jSONObject, ArrayList arrayList) {
        if (!Intrinsics.areEqual(jSONObject.optString("ty"), "gf")) {
            Iterator<String> keys = jSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                Object obj = jSONObject.get(keys.next());
                if (obj instanceof JSONObject) {
                    replaceColorsInObject((JSONObject) obj, arrayList);
                } else if (obj instanceof JSONArray) {
                    replaceColorsInArray((JSONArray) obj, arrayList);
                }
            }
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("g");
        if (optJSONObject == null) {
            return;
        }
        int optInt = optJSONObject.optInt("p", 0);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("k");
        if (optJSONObject2 == null) {
            return;
        }
        if (optJSONObject2.optInt("a", 0) == 0) {
            JSONArray optJSONArray = optJSONObject2.optJSONArray("k");
            if (optJSONArray == null) {
                return;
            }
            replaceColorsInGradientData(optJSONArray, optInt, arrayList);
            return;
        }
        JSONArray optJSONArray2 = optJSONObject2.optJSONArray("k");
        if (optJSONArray2 == null) {
            return;
        }
        int length = optJSONArray2.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i);
            if (optJSONObject3 != null) {
                JSONArray optJSONArray3 = optJSONObject3.optJSONArray("s");
                if (optJSONArray3 != null) {
                    replaceColorsInGradientData(optJSONArray3, optInt, arrayList);
                }
                JSONArray optJSONArray4 = optJSONObject3.optJSONArray("e");
                if (optJSONArray4 != null) {
                    replaceColorsInGradientData(optJSONArray4, optInt, arrayList);
                }
            }
        }
    }

    public abstract void onFontRetrievalFailed(int i);

    public abstract void onFontRetrieved(Typeface typeface, boolean z);
}
