package com.withpersona.sdk2.inquiry.shared;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.instantapps.InstantApps;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public abstract class RetryKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TwoColumnWidget(GenericComponentViewModel.TwoColumnViewModel twoColumnViewModel, Modifier modifier, boolean z, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Function1 function12;
        boolean z3;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Modifier wrapContentHeight;
        Modifier weight;
        int i5;
        Modifier weight2;
        twoColumnViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2082743630);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(twoColumnViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 = i3 | 432;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i6 |= gapComposer.changed(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i6 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i6 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
                if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
                    if (i7 != 0) {
                        z2 = true;
                    }
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (i4 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda1(18);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function12 = (Function1) rememberedValue;
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    boolean changedInstance = ((i6 & 7168) == 2048) | gapComposer.changedInstance(twoColumnViewModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(24, twoColumnViewModel, function12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Modifier onVisible$default = VisibleKt.onVisible$default(wrapContentHeight, (Function0) rememberedValue2);
                    if (z2) {
                        gapComposer.startReplaceGroup(-1917566998);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new GpsConfigQueries$$ExternalSyntheticLambda1(19);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        onVisible$default = SemanticsModifierKt.semantics(onVisible$default, true, (Function1) rememberedValue3);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1917492784);
                        gapComposer.end(false);
                    }
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onVisible$default);
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
                    GenericBaseViewModel genericBaseViewModel = twoColumnViewModel.left;
                    ColumnWidth columnWidth = twoColumnViewModel.columnWidth;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (genericBaseViewModel == null) {
                        gapComposer.startReplaceGroup(-798277048);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-798277047);
                        int ordinal = columnWidth.ordinal();
                        if (ordinal == 0) {
                            SizeKt.wrapContentWidth$default(companion, null, 3);
                            weight = rowScopeInstance.weight(1.0f, companion, true);
                        } else if (ordinal == 1) {
                            weight = SizeKt.wrapContentWidth$default(companion, null, 3);
                        } else if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        } else {
                            SizeKt.fillMaxWidth(companion, 1.0f);
                            weight = rowScopeInstance.weight(1.0f, companion, true);
                        }
                        InstantApps.GenericBaseElement(genericBaseViewModel, weight, function12, gapComposer, (i6 >> 3) & 896);
                        gapComposer.end(false);
                    }
                    if (twoColumnViewModel.spacingBetween == null) {
                        gapComposer.startReplaceGroup(-798083267);
                    } else {
                        gapComposer.startReplaceGroup(-798083266);
                        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, r6.value));
                    }
                    gapComposer.end(false);
                    GenericBaseViewModel genericBaseViewModel2 = twoColumnViewModel.right;
                    if (genericBaseViewModel2 == null) {
                        gapComposer.startReplaceGroup(-798007131);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-798007130);
                        int ordinal2 = columnWidth.ordinal();
                        if (ordinal2 == 0) {
                            i5 = 3;
                            SizeKt.wrapContentWidth$default(companion, null, 3);
                            weight2 = rowScopeInstance.weight(1.0f, companion, true);
                        } else if (ordinal2 == 1) {
                            i5 = 3;
                            SizeKt.fillMaxWidth(companion, 1.0f);
                            weight2 = rowScopeInstance.weight(1.0f, companion, true);
                        } else if (ordinal2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        } else {
                            i5 = 3;
                            weight2 = SizeKt.wrapContentWidth$default(companion, null, 3);
                        }
                        InstantApps.GenericBaseElement(genericBaseViewModel2, weight2, function12, gapComposer, (i6 >> i5) & 896);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    z3 = z2;
                    modifier2 = companion;
                } else {
                    gapComposer.skipToGroupEnd();
                    z3 = z2;
                    modifier2 = modifier;
                }
                Function1 function13 = function12;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(twoColumnViewModel, modifier2, z3, function13, i, i2, 17);
                    return;
                }
                return;
            }
            function12 = function1;
            if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            }
            Function1 function132 = function12;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
        }
        Function1 function1322 = function12;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static ResToolsKt createCornerTreatment(int i) {
        if (i != 0 && i == 1) {
            return new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retry(int i, InquiryApiHelper$makeInquiryCallWithRetry$2 inquiryApiHelper$makeInquiryCallWithRetry$2, ContinuationImpl continuationImpl) {
        RetryKt$retry$1 retryKt$retry$1;
        int i2;
        int i3;
        int i4;
        Function2 function2;
        if (continuationImpl instanceof RetryKt$retry$1) {
            retryKt$retry$1 = (RetryKt$retry$1) continuationImpl;
            int i5 = retryKt$retry$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                retryKt$retry$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj = retryKt$retry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = retryKt$retry$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    i3 = i;
                    i4 = 0;
                    function2 = inquiryApiHelper$makeInquiryCallWithRetry$2;
                    if (i4 < i3) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = retryKt$retry$1.I$1;
                i3 = retryKt$retry$1.I$0;
                Function2 function22 = retryKt$retry$1.L$0;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    i4++;
                    function2 = function22;
                    if (i4 < i3) {
                        Integer num = new Integer(i4);
                        retryKt$retry$1.L$0 = function2;
                        retryKt$retry$1.I$0 = i3;
                        retryKt$retry$1.I$1 = i4;
                        retryKt$retry$1.label = 1;
                        Object invoke = function2.invoke(num, retryKt$retry$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        function22 = function2;
                        obj = invoke;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        retryKt$retry$1 = new RetryKt$retry$1(continuationImpl);
        Object obj2 = retryKt$retry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = retryKt$retry$1.label;
        if (i2 != 0) {
        }
    }

    public static void setParentAbsoluteElevation(View view, MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.drawableState.elevationOverlayProvider;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.elevationOverlayEnabled) {
            return;
        }
        float f = RecyclerView.DECELERATION_RATE;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.drawableState;
        if (materialShapeDrawableState.parentAbsoluteElevation != f) {
            materialShapeDrawableState.parentAbsoluteElevation = f;
            materialShapeDrawable.updateZ();
        }
    }

    public static void setParentAbsoluteElevation(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            setParentAbsoluteElevation(viewGroup, (MaterialShapeDrawable) background);
        }
    }
}
