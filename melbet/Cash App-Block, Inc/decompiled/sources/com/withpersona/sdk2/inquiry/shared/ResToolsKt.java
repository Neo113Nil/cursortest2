package com.withpersona.sdk2.inquiry.shared;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.android.instantapps.InstantApps;
import com.google.android.material.shape.ShapePath;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.squareup.cash.R;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class ResToolsKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TwoColumnRowWidget(final GenericComponentViewModel.TwoColumnRowViewModel twoColumnRowViewModel, final Function1 function1, Composer composer, int i) {
        int i2;
        Modifier wrapContentHeight;
        Modifier weight;
        Modifier.Companion companion;
        Modifier modifier;
        Iterator it;
        int ordinal;
        Modifier weight2;
        Iterator it2;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        twoColumnRowViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1380487874);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(twoColumnRowViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            wrapContentHeight = SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            int i6 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(twoColumnRowViewModel) | (i6 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.genericelements.components.components.TwoColumnRowWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i5;
                        Function1 function12 = function1;
                        GenericComponentViewModel.TwoColumnRowViewModel twoColumnRowViewModel2 = twoColumnRowViewModel;
                        switch (i7) {
                            case 0:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = twoColumnRowViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = twoColumnRowViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(wrapContentHeight, false, null, null, (Function0) rememberedValue, 15);
            boolean changedInstance2 = gapComposer.changedInstance(twoColumnRowViewModel) | (i6 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == obj) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.genericelements.components.components.TwoColumnRowWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i4;
                        Function1 function12 = function1;
                        GenericComponentViewModel.TwoColumnRowViewModel twoColumnRowViewModel2 = twoColumnRowViewModel;
                        switch (i7) {
                            case 0:
                                GenericTreeElementsViewEvent genericTreeElementsViewEvent = twoColumnRowViewModel2.event;
                                if (genericTreeElementsViewEvent != null) {
                                    function12.invoke(genericTreeElementsViewEvent);
                                }
                                break;
                            default:
                                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = twoColumnRowViewModel2.viewAnalyticsEvent;
                                if (viewAnalyticsEvent != null) {
                                    function12.invoke(viewAnalyticsEvent);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(m183clickableoSLSa3U$default, (Function0) rememberedValue2);
            VerticalAlignment verticalAlignment = twoColumnRowViewModel.verticalAlignment;
            ColumnWidth columnWidth = twoColumnRowViewModel.columnWidth;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, zzat.toAlignment(verticalAlignment), gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onVisible$default);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            Object obj2 = obj;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
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
            int ordinal2 = columnWidth.ordinal();
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (ordinal2 == 0) {
                SizeKt.wrapContentWidth$default(companion2, null, 3);
                weight = rowScopeInstance.weight(1.0f, companion2, true);
            } else if (ordinal2 == 1) {
                companion = companion2;
                modifier = SizeKt.wrapContentWidth$default(companion2, null, 3);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
                gapComposer.startReusableNode();
                RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                if (gapComposer.inserting) {
                    gapComposer.useNode();
                } else {
                    gapComposer.createNode(function0);
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ArrayList arrayList = twoColumnRowViewModel.left;
                gapComposer.startReplaceGroup(-1853149710);
                gapComposer.startReplaceGroup(-1168156231);
                it = CollectionsKt.filterNotNull(arrayList).iterator();
                while (it.hasNext()) {
                    GenericBaseViewModel genericBaseViewModel = (GenericBaseViewModel) it.next();
                    Modifier.Companion companion3 = companion;
                    Object obj3 = obj2;
                    RowScopeInstance rowScopeInstance3 = rowScopeInstance2;
                    Iterator it3 = it;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    boolean z = i6 == 256;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z || rememberedValue3 == obj3) {
                        rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda3(27, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    InstantApps.GenericBaseElement(genericBaseViewModel, m302paddingqDBjuR0$default, (Function1) rememberedValue3, gapComposer, 48);
                    obj2 = obj3;
                    it = it3;
                    rowScopeInstance2 = rowScopeInstance3;
                    companion = companion3;
                }
                Modifier.Companion companion4 = companion;
                Object obj4 = obj2;
                RowScopeInstance rowScopeInstance4 = rowScopeInstance2;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, false, true);
                if (twoColumnRowViewModel.spacingBetween != null) {
                    gapComposer.startReplaceGroup(2131676421);
                } else {
                    gapComposer.startReplaceGroup(2131676422);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion4, r6.value));
                }
                gapComposer.end(false);
                ordinal = columnWidth.ordinal();
                if (ordinal != 0) {
                    SizeKt.wrapContentWidth$default(companion4, null, 3);
                    weight2 = rowScopeInstance4.weight(1.0f, companion4, true);
                } else if (ordinal == 1) {
                    SizeKt.fillMaxWidth(companion4, 1.0f);
                    weight2 = rowScopeInstance4.weight(1.0f, companion4, true);
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    weight2 = SizeKt.wrapContentWidth$default(companion4, null, 3);
                }
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, weight2);
                ComposeUiNode.Companion.getClass();
                Function0 function02 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.useNode();
                } else {
                    gapComposer.createNode(function02);
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                ArrayList arrayList2 = twoColumnRowViewModel.right;
                gapComposer.startReplaceGroup(436119867);
                gapComposer.startReplaceGroup(291164496);
                it2 = CollectionsKt.filterNotNull(arrayList2).iterator();
                while (it2.hasNext()) {
                    GenericBaseViewModel genericBaseViewModel2 = (GenericBaseViewModel) it2.next();
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    boolean z2 = i6 == 256;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (z2 || rememberedValue4 == obj4) {
                        rememberedValue4 = new ComposeDialogKt$$ExternalSyntheticLambda3(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    InstantApps.GenericBaseElement(genericBaseViewModel2, m302paddingqDBjuR0$default2, (Function1) rememberedValue4, gapComposer, 48);
                }
                gapComposer.end(false);
                gapComposer.end(false);
                gapComposer.end(true);
                gapComposer.end(true);
            } else if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                SizeKt.fillMaxWidth(companion2, 1.0f);
                weight = rowScopeInstance.weight(1.0f, companion2, true);
            }
            companion = companion2;
            modifier = weight;
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, modifier);
            gapComposer.startReusableNode();
            RowScopeInstance rowScopeInstance22 = rowScopeInstance;
            if (gapComposer.inserting) {
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode22, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier22, composeUiNode$Companion$SetModifier$14);
            ArrayList arrayList3 = twoColumnRowViewModel.left;
            gapComposer.startReplaceGroup(-1853149710);
            gapComposer.startReplaceGroup(-1168156231);
            it = CollectionsKt.filterNotNull(arrayList3).iterator();
            while (it.hasNext()) {
            }
            Modifier.Companion companion42 = companion;
            Object obj42 = obj2;
            RowScopeInstance rowScopeInstance42 = rowScopeInstance22;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, false, true);
            if (twoColumnRowViewModel.spacingBetween != null) {
            }
            gapComposer.end(false);
            ordinal = columnWidth.ordinal();
            if (ordinal != 0) {
            }
            ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode32 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope32 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier32 = PlatformKt.materializeModifier(gapComposer, weight2);
            ComposeUiNode.Companion.getClass();
            Function0 function022 = ComposeUiNode.Companion.Constructor;
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy22, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope32, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode32), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier32, ComposeUiNode.Companion.SetModifier);
            ArrayList arrayList22 = twoColumnRowViewModel.right;
            gapComposer.startReplaceGroup(436119867);
            gapComposer.startReplaceGroup(291164496);
            it2 = CollectionsKt.filterNotNull(arrayList22).iterator();
            while (it2.hasNext()) {
            }
            gapComposer.end(false);
            gapComposer.end(false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(twoColumnRowViewModel, function1, i);
        }
    }

    public static boolean boolFromAttr$default(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getClass();
        return context.getTheme().resolveAttribute(i, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    public static int getColorFromAttr$default(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getClass();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static Integer resourceIdFromAttr$default(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getClass();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static final Integer resourceIdFromName(Context context, String str, ResourceType resourceType) {
        String replace;
        context.getClass();
        str.getClass();
        DisplayMetrics displayMetrics = ExtensionsKt.displayMetrics;
        Locale locale = Locale.US;
        replace = new Regex("[- ]").replace(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale), "_");
        String resourcePackageName = context.getResources().getResourcePackageName(R.id.pi2_dummy_package_resource);
        int identifier = context.getResources().getIdentifier(replace, resourceType.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = resourceType.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            identifier = resources.getIdentifier(replace, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }

    public abstract void getCornerPath(ShapePath shapePath, float f, float f2);
}
