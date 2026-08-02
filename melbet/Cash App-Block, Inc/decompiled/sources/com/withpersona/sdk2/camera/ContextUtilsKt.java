package com.withpersona.sdk2.camera;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.play.core.splitcompat.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.util.Strings;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class ContextUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericTreeElements(final GenericTreeElementsViewModel genericTreeElementsViewModel, Modifier modifier, final RealImageLoader realImageLoader, boolean z, Function3 function3, final Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function3 function32;
        GapComposer gapComposer;
        boolean z3;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        genericTreeElementsViewModel.getClass();
        realImageLoader.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(427597828);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(genericTreeElementsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changedInstance(realImageLoader) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function32 = function3;
                    i3 |= gapComposer2.changedInstance(function32) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i) == 0) {
                        i3 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        gapComposer2.skipToGroupEnd();
                        gapComposer = gapComposer2;
                        z3 = z2;
                        function33 = function32;
                    } else {
                        final Modifier modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        boolean z4 = i4 != 0 ? false : z2;
                        final Function3 function34 = i5 != 0 ? null : function32;
                        if (z4) {
                            gapComposer2.startReplaceGroup(-305776239);
                            final int i7 = 0;
                            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(925463338, new Function2() { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i8 = i7;
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    RealImageLoader realImageLoader2 = realImageLoader;
                                    switch (i8) {
                                        case 0:
                                            Composer composer2 = (Composer) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                                ComposeUiNode.Companion.getClass();
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer3.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer3.startReusableNode();
                                                if (gapComposer3.inserting) {
                                                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                                } else {
                                                    gapComposer3.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                final GenericTreeElementsViewModel genericTreeElementsViewModel2 = genericTreeElementsViewModel;
                                                if (genericTreeElementsViewModel2 instanceof GenericTreeElementsViewModel.Loading) {
                                                    gapComposer3.startReplaceGroup(931624072);
                                                    TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer3, 54, 0);
                                                    gapComposer3.end(false);
                                                } else {
                                                    if (!(genericTreeElementsViewModel2 instanceof GenericTreeElementsViewModel.Loaded)) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 931622867, false);
                                                    }
                                                    gapComposer3.startReplaceGroup(931629646);
                                                    ProvidedValue defaultProvidedValue$runtime = LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2);
                                                    final int i9 = 0;
                                                    final Modifier modifier4 = modifier3;
                                                    final Function3 function35 = function34;
                                                    final Function1 function12 = function1;
                                                    Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(1524471907, new Function2() { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj3, Object obj4) {
                                                            int i10 = i9;
                                                            GenericTreeElementsViewModel genericTreeElementsViewModel3 = genericTreeElementsViewModel2;
                                                            Composer composer3 = (Composer) obj3;
                                                            int intValue2 = ((Integer) obj4).intValue();
                                                            switch (i10) {
                                                                case 0:
                                                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                                                    if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel3, modifier4, true, function35, function12, gapComposer4, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer4.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                                default:
                                                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel3, modifier4, false, function35, function12, gapComposer5, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer5.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, gapComposer3), gapComposer3, 56);
                                                    gapComposer3.end(false);
                                                }
                                                gapComposer3.end(true);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            Composer composer3 = (Composer) obj;
                                            int intValue2 = ((Integer) obj2).intValue();
                                            GapComposer gapComposer4 = (GapComposer) composer3;
                                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
                                                ComposeUiNode.Companion.getClass();
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer4.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer4.startReusableNode();
                                                if (gapComposer4.inserting) {
                                                    gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                                                } else {
                                                    gapComposer4.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                final GenericTreeElementsViewModel genericTreeElementsViewModel3 = genericTreeElementsViewModel;
                                                if (genericTreeElementsViewModel3 instanceof GenericTreeElementsViewModel.Loading) {
                                                    gapComposer4.startReplaceGroup(1186346859);
                                                    TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer4, 54, 0);
                                                    gapComposer4.end(false);
                                                } else {
                                                    if (!(genericTreeElementsViewModel3 instanceof GenericTreeElementsViewModel.Loaded)) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1186345655, false);
                                                    }
                                                    gapComposer4.startReplaceGroup(1186352434);
                                                    ProvidedValue defaultProvidedValue$runtime2 = LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2);
                                                    final int i10 = 1;
                                                    final Modifier modifier5 = modifier3;
                                                    final Function3 function36 = function34;
                                                    final Function1 function13 = function1;
                                                    Updater.CompositionLocalProvider(defaultProvidedValue$runtime2, Expect_jvmKt.rememberComposableLambda(-1214924794, new Function2() { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj3, Object obj4) {
                                                            int i102 = i10;
                                                            GenericTreeElementsViewModel genericTreeElementsViewModel32 = genericTreeElementsViewModel3;
                                                            Composer composer32 = (Composer) obj3;
                                                            int intValue22 = ((Integer) obj4).intValue();
                                                            switch (i102) {
                                                                case 0:
                                                                    GapComposer gapComposer42 = (GapComposer) composer32;
                                                                    if (gapComposer42.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel32, modifier5, true, function36, function13, gapComposer42, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer42.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                                default:
                                                                    GapComposer gapComposer5 = (GapComposer) composer32;
                                                                    if (gapComposer5.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel32, modifier5, false, function36, function13, gapComposer5, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer5.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, gapComposer4), gapComposer4, 56);
                                                    gapComposer4.end(false);
                                                }
                                                gapComposer4.end(true);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, gapComposer2), gapComposer2, 3072, 7);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-305122418);
                            final int i8 = 1;
                            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1813933363, new Function2() { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i82 = i8;
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    RealImageLoader realImageLoader2 = realImageLoader;
                                    switch (i82) {
                                        case 0:
                                            Composer composer2 = (Composer) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                                ComposeUiNode.Companion.getClass();
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer3.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer3.startReusableNode();
                                                if (gapComposer3.inserting) {
                                                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                                } else {
                                                    gapComposer3.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                final GenericTreeElementsViewModel genericTreeElementsViewModel2 = genericTreeElementsViewModel;
                                                if (genericTreeElementsViewModel2 instanceof GenericTreeElementsViewModel.Loading) {
                                                    gapComposer3.startReplaceGroup(931624072);
                                                    TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer3, 54, 0);
                                                    gapComposer3.end(false);
                                                } else {
                                                    if (!(genericTreeElementsViewModel2 instanceof GenericTreeElementsViewModel.Loaded)) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 931622867, false);
                                                    }
                                                    gapComposer3.startReplaceGroup(931629646);
                                                    ProvidedValue defaultProvidedValue$runtime = LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2);
                                                    final int i9 = 0;
                                                    final Modifier modifier4 = modifier3;
                                                    final Function3 function35 = function34;
                                                    final Function1 function12 = function1;
                                                    Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(1524471907, new Function2() { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj3, Object obj4) {
                                                            int i102 = i9;
                                                            GenericTreeElementsViewModel genericTreeElementsViewModel32 = genericTreeElementsViewModel2;
                                                            Composer composer32 = (Composer) obj3;
                                                            int intValue22 = ((Integer) obj4).intValue();
                                                            switch (i102) {
                                                                case 0:
                                                                    GapComposer gapComposer42 = (GapComposer) composer32;
                                                                    if (gapComposer42.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel32, modifier4, true, function35, function12, gapComposer42, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer42.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                                default:
                                                                    GapComposer gapComposer5 = (GapComposer) composer32;
                                                                    if (gapComposer5.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel32, modifier4, false, function35, function12, gapComposer5, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer5.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, gapComposer3), gapComposer3, 56);
                                                    gapComposer3.end(false);
                                                }
                                                gapComposer3.end(true);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            Composer composer3 = (Composer) obj;
                                            int intValue2 = ((Integer) obj2).intValue();
                                            GapComposer gapComposer4 = (GapComposer) composer3;
                                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
                                                ComposeUiNode.Companion.getClass();
                                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                                if (gapComposer4.applier == null) {
                                                    Updater.invalidApplier();
                                                    throw null;
                                                }
                                                gapComposer4.startReusableNode();
                                                if (gapComposer4.inserting) {
                                                    gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                                                } else {
                                                    gapComposer4.useNode();
                                                }
                                                Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                                Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                                final GenericTreeElementsViewModel genericTreeElementsViewModel3 = genericTreeElementsViewModel;
                                                if (genericTreeElementsViewModel3 instanceof GenericTreeElementsViewModel.Loading) {
                                                    gapComposer4.startReplaceGroup(1186346859);
                                                    TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(companion, 1.0f), LoadingIndicatorPosition.CENTER, gapComposer4, 54, 0);
                                                    gapComposer4.end(false);
                                                } else {
                                                    if (!(genericTreeElementsViewModel3 instanceof GenericTreeElementsViewModel.Loaded)) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1186345655, false);
                                                    }
                                                    gapComposer4.startReplaceGroup(1186352434);
                                                    ProvidedValue defaultProvidedValue$runtime2 = LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2);
                                                    final int i10 = 1;
                                                    final Modifier modifier5 = modifier3;
                                                    final Function3 function36 = function34;
                                                    final Function1 function13 = function1;
                                                    Updater.CompositionLocalProvider(defaultProvidedValue$runtime2, Expect_jvmKt.rememberComposableLambda(-1214924794, new Function2() { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj3, Object obj4) {
                                                            int i102 = i10;
                                                            GenericTreeElementsViewModel genericTreeElementsViewModel32 = genericTreeElementsViewModel3;
                                                            Composer composer32 = (Composer) obj3;
                                                            int intValue22 = ((Integer) obj4).intValue();
                                                            switch (i102) {
                                                                case 0:
                                                                    GapComposer gapComposer42 = (GapComposer) composer32;
                                                                    if (gapComposer42.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel32, modifier5, true, function36, function13, gapComposer42, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer42.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                                default:
                                                                    GapComposer gapComposer5 = (GapComposer) composer32;
                                                                    if (gapComposer5.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                                                                        ContextUtilsKt.GenericTreeElementsLoaded((GenericTreeElementsViewModel.Loaded) genericTreeElementsViewModel32, modifier5, false, function36, function13, gapComposer5, MLKEMEngine.KyberPolyBytes);
                                                                    } else {
                                                                        gapComposer5.skipToGroupEnd();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }, gapComposer4), gapComposer4, 56);
                                                    gapComposer4.end(false);
                                                }
                                                gapComposer4.end(true);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, gapComposer2), gapComposer2, 6);
                            gapComposer2.end(false);
                        }
                        gapComposer = gapComposer2;
                        modifier2 = modifier3;
                        function33 = function34;
                        z3 = z4;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(genericTreeElementsViewModel, modifier2, realImageLoader, z3, function33, function1, i, i2, 7);
                        return;
                    }
                    return;
                }
                function32 = function3;
                if ((196608 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((196608 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((196608 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void GenericTreeElementsEmpty(int i, Composer composer, Modifier modifier, String str, String str2, boolean z) {
        int i2;
        String str3;
        String str4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1370331132);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            str3 = str2;
            str4 = str;
            gapComposer.skipToGroupEnd();
        } else if (z) {
            gapComposer.startReplaceGroup(129562346);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, i2 & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            str4 = str;
            Room.m1165Text25TpFw(0, 0, 0, 3, (i2 >> 3) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            str3 = str2;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f));
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            str3 = str2;
            boolean z2 = true;
            int i3 = 14;
            str4 = str;
            gapComposer.startReplaceGroup(130213811);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda1(i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean z3 = (i2 & 14) == 4;
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str4, str3, 19);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, gapComposer, ((i2 >> 3) & 112) | 6, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(str4, str3, modifier, z, i, 15);
        }
    }

    public static final void GenericTreeElementsLoaded(GenericTreeElementsViewModel.Loaded loaded, Modifier modifier, boolean z, Function3 function3, Function1 function1, Composer composer, int i) {
        boolean z2;
        Function1 function12;
        Modifier modifier2;
        Function3 function32;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(730810234);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function3) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (loaded.error != null) {
                gapComposer.startReplaceGroup(-273172951);
                GenericTreeElementsEmpty((i2 << 3) & 8064, gapComposer, modifier, Room.stringResource(gapComposer, R.string.generic_elements_error_title), Room.stringResource(gapComposer, R.string.generic_elements_error_description), z);
                modifier2 = modifier;
                z2 = z;
                gapComposer.end(false);
                function12 = function1;
                function32 = function3;
            } else {
                z2 = z;
                modifier2 = modifier;
                gapComposer.startReplaceGroup(-272873987);
                Iterator it = loaded.containers.iterator();
                while (it.hasNext()) {
                    Function1 function13 = function1;
                    GapComposer gapComposer2 = gapComposer;
                    Function3 function33 = function3;
                    zzd.GenericContainerWidget((GenericContainerViewModel) it.next(), function33, function13, z2, gapComposer2, ((i2 >> 6) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION) | 3072);
                    function3 = function33;
                    function1 = function13;
                    gapComposer = gapComposer2;
                }
                function12 = function1;
                function32 = function3;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            z2 = z;
            function12 = function1;
            modifier2 = modifier;
            function32 = function3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(loaded, modifier2, z2, function32, function12, i);
        }
    }

    public static final AppCompatActivity getActivity(Context context) {
        context.getClass();
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return getActivity(baseContext);
    }

    public static void zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = ImageToAnalyzeKt.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza = ImageToAnalyzeKt.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static void zzc(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzd(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : ImageToAnalyzeKt.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzd(int i, int i2, String str) {
        if (i < 0) {
            return ImageToAnalyzeKt.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ImageToAnalyzeKt.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }
}
