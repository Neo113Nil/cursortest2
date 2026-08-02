package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.Colors;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda7;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.components.DragHandleKt;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeShapes;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class LayoutKt {
    public static final ComposableLambdaImpl lambda$2070000352 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(5), false, 2070000352);

    /* renamed from: lambda$-1277661102, reason: not valid java name */
    public static final ComposableLambdaImpl f824lambda$1277661102 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(6), false, -1277661102);
    public static final ComposableLambdaImpl lambda$1030431689 = new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(7), false, 1030431689);

    static {
        new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda5(22), false, 1017990275);
        new ComposableLambdaImpl(new PhoneNumberController$$ExternalSyntheticLambda9(8), false, -1156338151);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Layout(Modifier modifier, PaddingValues paddingValues, boolean z, Arrangement$Vertical arrangement$Vertical, boolean z2, ScrollState scrollState, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        int i5;
        ScrollState scrollState2;
        int i6;
        Function2 function22;
        GapComposer gapComposer;
        Arrangement$Vertical arrangement$Vertical2;
        boolean z4;
        Modifier modifier3;
        PaddingValues paddingValues3;
        boolean z5;
        ScrollState scrollState3;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        Arrangement$Vertical arrangement$Vertical3;
        Modifier modifier4;
        boolean z6;
        boolean z7;
        Function2 function24;
        int i7;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(213151287);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer2.changed(paddingValues2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z3 = z;
                i3 |= gapComposer2.changed(z3) ? 256 : 128;
                i5 = i3 | 1797120;
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        scrollState2 = scrollState;
                        if (gapComposer2.changed(scrollState2)) {
                            i7 = 8388608;
                            i5 |= i7;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i7 = 4194304;
                    i5 |= i7;
                } else {
                    scrollState2 = scrollState;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    function22 = function2;
                    i5 |= gapComposer2.changedInstance(function22) ? 67108864 : 33554432;
                    if ((805306368 & i) == 0) {
                        i5 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        arrangement$Vertical2 = arrangement$Vertical;
                        z4 = z2;
                        modifier3 = modifier2;
                        paddingValues3 = paddingValues2;
                        z5 = z3;
                        scrollState3 = scrollState2;
                        function23 = function22;
                    } else {
                        gapComposer2.startDefaults();
                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                            if (i9 != 0) {
                                paddingValues2 = SpacerKt.m295PaddingValuesYgX7TsA$default(24.0f, RecyclerView.DECELERATION_RATE, 2);
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            arrangement$Vertical3 = SpacerKt.Top;
                            if ((i2 & 128) != 0) {
                                i5 &= -29360129;
                                scrollState2 = ImageKt.rememberScrollState(gapComposer2);
                            }
                            if (i6 != 0) {
                                modifier4 = modifier5;
                                z6 = z3;
                                z7 = true;
                                function24 = null;
                                gapComposer2.endDefaults();
                                ScrollState scrollState4 = scrollState2;
                                int i10 = i5 >> 3;
                                gapComposer = gapComposer2;
                                LayoutScaffold(scrollState4.getCanScrollForward(), scrollState4.getCanScrollBackward(), false, false, z6, z7, modifier4, function24, Expect_jvmKt.rememberComposableLambda(-1236895476, new WalletHomeViewKt$$ExternalSyntheticLambda4(scrollState4, arrangement$Vertical3, paddingValues2, function24, composableLambdaImpl, 8), gapComposer2), gapComposer, ((i5 << 18) & 3670016) | (i10 & 896) | 100663296 | (i10 & 7168) | (57344 & (i5 << 6)) | (458752 & i10) | (i10 & 29360128));
                                arrangement$Vertical2 = arrangement$Vertical3;
                                paddingValues3 = paddingValues2;
                                z5 = z6;
                                z4 = z7;
                                function23 = function24;
                                scrollState3 = scrollState4;
                                modifier3 = modifier4;
                            } else {
                                modifier4 = modifier5;
                                z6 = z3;
                                z7 = true;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            arrangement$Vertical3 = arrangement$Vertical;
                            z7 = z2;
                            modifier4 = modifier2;
                            z6 = z3;
                        }
                        function24 = function22;
                        gapComposer2.endDefaults();
                        ScrollState scrollState42 = scrollState2;
                        int i102 = i5 >> 3;
                        gapComposer = gapComposer2;
                        LayoutScaffold(scrollState42.getCanScrollForward(), scrollState42.getCanScrollBackward(), false, false, z6, z7, modifier4, function24, Expect_jvmKt.rememberComposableLambda(-1236895476, new WalletHomeViewKt$$ExternalSyntheticLambda4(scrollState42, arrangement$Vertical3, paddingValues2, function24, composableLambdaImpl, 8), gapComposer2), gapComposer, ((i5 << 18) & 3670016) | (i102 & 896) | 100663296 | (i102 & 7168) | (57344 & (i5 << 6)) | (458752 & i102) | (i102 & 29360128));
                        arrangement$Vertical2 = arrangement$Vertical3;
                        paddingValues3 = paddingValues2;
                        z5 = z6;
                        z4 = z7;
                        function23 = function24;
                        scrollState3 = scrollState42;
                        modifier3 = modifier4;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda7(modifier3, paddingValues3, z5, arrangement$Vertical2, z4, scrollState3, function23, composableLambdaImpl, i, i2);
                        return;
                    }
                    return;
                }
                function22 = function2;
                if ((805306368 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i3 | 1797120;
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((805306368 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i3 | 1797120;
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((805306368 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LayoutScaffold(final boolean z, final boolean z2, boolean z3, final boolean z4, final boolean z5, final boolean z6, final Modifier modifier, Function2 function2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        boolean z7;
        final boolean z8 = z3;
        final Function2 function22 = function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-764884893);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z8) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z5) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(z6) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = (FinancialConnectionsSheetNativeViewModel) gapComposer.consume(FinancialConnectionsSheetNativeActivityKt.LocalTopAppBarHost);
            State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI((z6 && z) ? 12.0f : RecyclerView.DECELERATION_RATE, null, null, null, gapComposer, 0, 14);
            Boolean valueOf = Boolean.valueOf(z2);
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(financialConnectionsSheetNativeViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealBadger2$scheduleBadgeClearingWork$3(financialConnectionsSheetNativeViewModel, z2, continuation, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            if (!z5) {
                SizeKt.fillMaxSize(modifier, 1.0f);
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m574initimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z5) {
                gapComposer.startReplaceGroup(933083297);
                companion = companion2;
                DragHandleKt.DragHandle(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5), gapComposer, 6);
                z7 = false;
            } else {
                companion = companion2;
                z7 = false;
                gapComposer.startReplaceGroup(926054357);
            }
            gapComposer.end(z7);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), !z5);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            Modifier.Companion companion3 = companion;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            SVG$Unit$EnumUnboxingLocalUtility.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i3 >> 24) & 14));
            gapComposer.end(true);
            boolean changed = gapComposer.changed(m155animateDpAsStateAjpBEmI);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda10(m155animateDpAsStateAjpBEmI, 28);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            z8 = z3;
            function22 = function2;
            CardKt.m472SurfaceFjzlyU(androidx.compose.ui.graphics.ColorKt.graphicsLayer(companion3, (Function1) rememberedValue2), null, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).background, 0L, null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(2105161585, new SlottedCardKt$$ExternalSyntheticLambda5(2, function22, z4, z8), gapComposer), gapComposer, 1572864, 58);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.stripe.android.financialconnections.ui.theme.LayoutKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    LayoutKt.LayoutScaffold(z, z2, z8, z4, z5, z6, modifier, function22, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyLayout(Modifier modifier, PaddingValues paddingValues, boolean z, boolean z2, boolean z3, Arrangement$Vertical arrangement$Vertical, boolean z4, LazyListState lazyListState, Function2 function2, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final Modifier modifier2;
        final Arrangement$Vertical arrangement$Vertical2;
        final LazyListState lazyListState2;
        final PaddingValues paddingValues3;
        final boolean z8;
        GapComposer gapComposer;
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final Function2 function22;
        RecomposeScopeImpl endRestartGroup;
        int i12;
        Arrangement$Vertical arrangement$Vertical3;
        LazyListState lazyListState3;
        Modifier modifier3;
        LazyListState lazyListState4;
        Function2 function23;
        boolean z12;
        int i13;
        boolean z13;
        boolean z14;
        int i14;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1348978779);
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer2.changed(paddingValues2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z5 = z;
                i3 |= gapComposer2.changed(z5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z6 = z2;
                    i3 |= gapComposer2.changed(z6) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z7 = z3;
                        i3 |= gapComposer2.changed(z7) ? 16384 : PKIFailureInfo.certRevoked;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= gapComposer2.changed(arrangement$Vertical) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                        i8 = i3 | 1572864;
                        if ((i & 12582912) == 0) {
                            i9 = i15;
                            if ((i2 & 128) == 0 && gapComposer2.changed(lazyListState)) {
                                i14 = 8388608;
                                i8 |= i14;
                            }
                            i14 = 4194304;
                            i8 |= i14;
                        } else {
                            i9 = i15;
                        }
                        i10 = i2 & 256;
                        if (i10 != 0) {
                            i8 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i11 = i10;
                            i8 |= gapComposer2.changedInstance(function2) ? 67108864 : 33554432;
                            if ((i & 805306368) == 0) {
                                i8 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            boolean z15 = true;
                            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
                                gapComposer2.skipToGroupEnd();
                                modifier2 = modifier;
                                arrangement$Vertical2 = arrangement$Vertical;
                                lazyListState2 = lazyListState;
                                paddingValues3 = paddingValues2;
                                z8 = z5;
                                gapComposer = gapComposer2;
                                z9 = z6;
                                z10 = z7;
                                z11 = z4;
                                function22 = function2;
                            } else {
                                gapComposer2.startDefaults();
                                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                    Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                                    if (i16 != 0) {
                                        i12 = -29360129;
                                        paddingValues2 = SpacerKt.m295PaddingValuesYgX7TsA$default(24.0f, RecyclerView.DECELERATION_RATE, 2);
                                    } else {
                                        i12 = -29360129;
                                    }
                                    if (i4 != 0) {
                                        z5 = false;
                                    }
                                    if (i5 != 0) {
                                        z6 = false;
                                    }
                                    if (i6 != 0) {
                                        z7 = false;
                                    }
                                    arrangement$Vertical3 = i7 != 0 ? SpacerKt.Top : arrangement$Vertical;
                                    if ((i2 & 128) != 0) {
                                        lazyListState3 = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
                                        i8 &= i12;
                                    } else {
                                        lazyListState3 = lazyListState;
                                    }
                                    if (i11 != 0) {
                                        boolean z16 = z5;
                                        function23 = null;
                                        z12 = z16;
                                        modifier3 = modifier4;
                                        lazyListState4 = lazyListState3;
                                        i13 = i8;
                                        z13 = z6;
                                        z14 = z7;
                                        gapComposer2.endDefaults();
                                        LazyListState lazyListState5 = lazyListState4;
                                        boolean canScrollForward = lazyListState5.getCanScrollForward();
                                        Arrangement$Vertical arrangement$Vertical4 = arrangement$Vertical3;
                                        boolean canScrollBackward = lazyListState5.getCanScrollBackward();
                                        PaddingValues paddingValues4 = paddingValues2;
                                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-487422544, new WalletHomeViewKt$$ExternalSyntheticLambda4(9, lazyListState5, paddingValues4, arrangement$Vertical4, function23, function1), gapComposer2);
                                        int i17 = i13 >> 3;
                                        boolean z17 = z15;
                                        LayoutScaffold(canScrollForward, canScrollBackward, z13, z14, z12, z17, modifier3, function23, rememberComposableLambda, gapComposer2, (i17 & 896) | 100663296 | (i17 & 7168) | ((i13 << 6) & 57344) | (i17 & 458752) | ((i13 << 18) & 3670016) | (29360128 & i17));
                                        modifier2 = modifier3;
                                        gapComposer = gapComposer2;
                                        arrangement$Vertical2 = arrangement$Vertical4;
                                        lazyListState2 = lazyListState5;
                                        function22 = function23;
                                        z11 = z17;
                                        z10 = z14;
                                        z8 = z12;
                                        z9 = z13;
                                        paddingValues3 = paddingValues4;
                                    } else {
                                        modifier3 = modifier4;
                                        lazyListState4 = lazyListState3;
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    if ((i2 & 128) != 0) {
                                        i8 &= -29360129;
                                    }
                                    modifier3 = modifier;
                                    arrangement$Vertical3 = arrangement$Vertical;
                                    z15 = z4;
                                    lazyListState4 = lazyListState;
                                }
                                i13 = i8;
                                z12 = z5;
                                z13 = z6;
                                z14 = z7;
                                function23 = function2;
                                gapComposer2.endDefaults();
                                LazyListState lazyListState52 = lazyListState4;
                                boolean canScrollForward2 = lazyListState52.getCanScrollForward();
                                Arrangement$Vertical arrangement$Vertical42 = arrangement$Vertical3;
                                boolean canScrollBackward2 = lazyListState52.getCanScrollBackward();
                                PaddingValues paddingValues42 = paddingValues2;
                                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-487422544, new WalletHomeViewKt$$ExternalSyntheticLambda4(9, lazyListState52, paddingValues42, arrangement$Vertical42, function23, function1), gapComposer2);
                                int i172 = i13 >> 3;
                                boolean z172 = z15;
                                LayoutScaffold(canScrollForward2, canScrollBackward2, z13, z14, z12, z172, modifier3, function23, rememberComposableLambda2, gapComposer2, (i172 & 896) | 100663296 | (i172 & 7168) | ((i13 << 6) & 57344) | (i172 & 458752) | ((i13 << 18) & 3670016) | (29360128 & i172));
                                modifier2 = modifier3;
                                gapComposer = gapComposer2;
                                arrangement$Vertical2 = arrangement$Vertical42;
                                lazyListState2 = lazyListState52;
                                function22 = function23;
                                z11 = z172;
                                z10 = z14;
                                z8 = z12;
                                z9 = z13;
                                paddingValues3 = paddingValues42;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new Function2() { // from class: com.stripe.android.financialconnections.ui.theme.LayoutKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        LayoutKt.LazyLayout(Modifier.this, paddingValues3, z8, z9, z10, arrangement$Vertical2, z11, lazyListState2, function22, function1, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if ((i & 805306368) == 0) {
                        }
                        boolean z152 = true;
                        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z7 = z3;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i3 | 1572864;
                    if ((i & 12582912) == 0) {
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i & 805306368) == 0) {
                    }
                    boolean z1522 = true;
                    if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z6 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z7 = z3;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i3 | 1572864;
                if ((i & 12582912) == 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i & 805306368) == 0) {
                }
                boolean z15222 = true;
                if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z6 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z7 = z3;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i3 | 1572864;
            if ((i & 12582912) == 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i & 805306368) == 0) {
            }
            boolean z152222 = true;
            if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z5 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z6 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z7 = z3;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i3 | 1572864;
        if ((i & 12582912) == 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i & 805306368) == 0) {
        }
        boolean z1522222 = true;
        if (gapComposer2.shouldExecute(i8 & 1, (i8 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void StripeThemeForConnections(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1479751569);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            StripeColors stripeColors = StripeThemeDefaults.colorsLight;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ThemeKt.LocalColors;
            long j = ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).background;
            long j2 = ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault;
            StripeColors stripeColors2 = new StripeColors(j, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).borderNeutral, stripeColors.componentDivider, j2, stripeColors.subtitle, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textDefault, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textSubdued, stripeColors.appBarIcon, Colors.m481copypvPzIIM$default(stripeColors.materialColors, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).border, ((FinancialConnectionsColors) gapComposer.consume(staticProvidableCompositionLocal)).textCritical, 8126));
            StripeShapes stripeShapes = StripeThemeDefaults.shapes;
            StripeThemeKt.StripeTheme(stripeColors2, new StripeShapes(12.0f, stripeShapes.bottomSheetCornerRadius, stripeShapes.borderStrokeWidth), StripeThemeDefaults.typography, StripeThemeDefaults.sectionStyle, StripeThemeDefaults.textFieldInsets, StripeThemeDefaults.iconStyle, Expect_jvmKt.rememberComposableLambda(50863641, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, 10), gapComposer), gapComposer, 12582912);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeThemeKt$$ExternalSyntheticLambda2(i, 11, composableLambdaImpl);
        }
    }

    public static FinancialConnectionsColors getColors(GapComposer gapComposer) {
        return (FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors);
    }
}
