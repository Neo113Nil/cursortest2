package com.squareup.cash.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.navigation.IntNavType;
import androidx.navigation.NavType;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.ui.overlays.viewmodels.BannerStyle;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class AlertBannerKt {
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertBanner(AlertBannerViewModel alertBannerViewModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        BannerColors bannerColors;
        BannerColors bannerColors2;
        boolean z;
        boolean z2;
        Object rememberedValue;
        Modifier modifier3;
        Icons icons;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2024534579);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(alertBannerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(null) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Typography typography = (Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography);
            DefaultSizes defaultSizes = (DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes);
            boolean z4 = (i3 & 7168) == 2048;
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z4 || rememberedValue2 == obj) {
                rememberedValue2 = new CachedPagingDataKt$cachedIn$4(2, null, 11);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, alertBannerViewModel, (Function2) rememberedValue2);
            BannerStyle bannerStyle = alertBannerViewModel.style;
            boolean changed = gapComposer.changed(bannerStyle.ordinal());
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                int ordinal = bannerStyle.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        Colors.Semantic semantic = colors.semantic;
                        Colors.Semantic.Background background = semantic.background;
                        bannerColors2 = new BannerColors(background.danger, semantic.text.inverse, background.f1047app, colors.component.cell.background.f171default);
                    } else if (ordinal == 2) {
                        Colors.Semantic semantic2 = colors.semantic;
                        bannerColors = new BannerColors(semantic2.background.f1047app, semantic2.text.standard, semantic2.icon.success, colors.component.cell.controls.icon.f174default);
                    } else if (ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else {
                        Colors.Semantic semantic3 = colors.semantic;
                        bannerColors2 = new BannerColors(semantic3.background.standard, semantic3.text.standard, semantic3.icon.standard, colors.component.cell.controls.icon.f174default);
                    }
                    rememberedValue3 = bannerColors2;
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    Colors.Semantic semantic4 = colors.semantic;
                    Colors.Semantic.Background background2 = semantic4.background;
                    bannerColors = new BannerColors(background2.f1047app, semantic4.text.standard, background2.danger, colors.component.cell.controls.icon.f174default);
                }
                rememberedValue3 = bannerColors;
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            BannerColors bannerColors3 = (BannerColors) rememberedValue3;
            int ordinal2 = bannerStyle.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    z = true;
                    ChromeConfigKt.ChromeConfig(z, (Boolean) null, gapComposer, 0, 14);
                    z2 = (i3 & 112) != 32;
                    rememberedValue = gapComposer.rememberedValue();
                    if (!z2 || rememberedValue == obj) {
                        rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(0, function0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier statusBarsPadding = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15), 1.0f), bannerColors3.backgroundColor, ColorKt.RectangleShape));
                    if (bannerStyle != BannerStyle.SEVERE) {
                        gapComposer.startReplaceGroup(-1313712697);
                        boolean changed2 = gapComposer.changed(colors);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue4 == obj) {
                            z3 = false;
                            rememberedValue4 = new AlertBannerKt$$ExternalSyntheticLambda3(colors, 0);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        } else {
                            z3 = false;
                        }
                        Modifier drawBehind = ClipKt.drawBehind(companion, (Function1) rememberedValue4);
                        gapComposer.end(z3);
                        modifier3 = drawBehind;
                    } else {
                        gapComposer.startReplaceGroup(-1313421359);
                        gapComposer.end(false);
                        modifier3 = companion;
                    }
                    Modifier then = statusBarsPadding.then(modifier3);
                    defaultSizes.getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(then, 8.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
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
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                    int ordinal3 = bannerStyle.ordinal();
                    if (ordinal3 == 0 || ordinal3 == 1) {
                        icons = Icons.AlertFill24;
                    } else if (ordinal3 == 2) {
                        icons = Icons.CheckFill24;
                    } else {
                        if (ordinal3 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        icons = Icons.InformationOutline24;
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m298padding3ABfNKs2, bannerColors3.alertIconColor, gapComposer, 48, 0);
                    Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4016, bannerColors3.contentColor, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(new LayoutWeightElement(1.0f, true), 8.0f), typography.bodyMedium, (TextLineBalancing) null, alertBannerViewModel.message, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, SpacerKt.m298padding3ABfNKs(companion, 8.0f), bannerColors3.chevronIconColor, gapComposer, 54, 0);
                    gapComposer.end(true);
                    modifier2 = companion;
                } else if (ordinal2 != 2 && ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            z = false;
            ChromeConfigKt.ChromeConfig(z, (Boolean) null, gapComposer, 0, 14);
            if ((i3 & 112) != 32) {
            }
            rememberedValue = gapComposer.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(0, function0);
            gapComposer.updateRememberedValue(rememberedValue);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier statusBarsPadding2 = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15), 1.0f), bannerColors3.backgroundColor, ColorKt.RectangleShape));
            if (bannerStyle != BannerStyle.SEVERE) {
            }
            Modifier then2 = statusBarsPadding2.then(modifier3);
            defaultSizes.getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(then2, 8.0f);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs3);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(alertBannerViewModel, function0, modifier2, i, 0);
        }
    }

    public static final void AlertBannerContainer(AlertBannerViewModel alertBannerViewModel, Modifier modifier, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Function2 function2;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1463199991);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(alertBannerViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changedInstance(function0) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (alertBannerViewModel == null) {
                gapComposer.startReplaceGroup(1961199954);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1961199955);
                if (function0 == null) {
                    gapComposer.startReplaceGroup(1296768460);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda0(0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function02 = (Function0) rememberedValue;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1565851367);
                    gapComposer.end(false);
                    function02 = function0;
                }
                AlertBanner(alertBannerViewModel, function02, null, gapComposer, 3072);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(478911960);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            if (alertBannerViewModel != null) {
                gapComposer.startReplaceGroup(1438294198);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                fillMaxSize2 = OffsetKt.consumeWindowInsets(fillMaxSize2, Arrangement$End$1.current(gapComposer).systemBars);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1438368350);
                gapComposer.end(false);
            }
            gapComposer.end(false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            function2 = composableLambdaImpl;
            function2.invoke(gapComposer, 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(alertBannerViewModel, i, modifier, function0, function2, 0);
        }
    }

    public static NavType fromArgType(String str, String str2) {
        boolean equals = InquiryField.IntegerField.TYPE.equals(str);
        IntNavType intNavType = NavType.StringType;
        NavType navType = equals ? NavType.IntType : "integer[]".equals(str) ? NavType.IntArrayType : "List<Int>".equals(str) ? NavType.IntListType : "long".equals(str) ? NavType.LongType : "long[]".equals(str) ? NavType.LongArrayType : "List<Long>".equals(str) ? NavType.LongListType : InquiryField.BooleanField.TYPE.equals(str) ? NavType.BoolType : "boolean[]".equals(str) ? NavType.BoolArrayType : "List<Boolean>".equals(str) ? NavType.BoolListType : InquiryField.StringField.TYPE.equals(str) ? intNavType : "string[]".equals(str) ? NavType.StringArrayType : "List<String>".equals(str) ? NavType.StringListType : InquiryField.FloatField.TYPE.equals(str) ? NavType.FloatType : "float[]".equals(str) ? NavType.FloatArrayType : "List<Float>".equals(str) ? NavType.FloatListType : null;
        if (navType != null) {
            return navType;
        }
        if ("reference".equals(str)) {
            return NavType.ReferenceType;
        }
        if (str.length() == 0) {
            return intNavType;
        }
        try {
            String concat = (!StringsKt__StringsJVMKt.startsWith(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean endsWith = StringsKt__StringsJVMKt.endsWith(str, "[]", false);
            if (endsWith) {
                concat = concat.substring(0, concat.length() - 2);
            }
            NavType parseSerializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(Class.forName(concat), endsWith);
            if (parseSerializableOrParcelableType$navigation_common_release != null) {
                return parseSerializableOrParcelableType$navigation_common_release;
            }
            throw new IllegalArgumentException(concat.concat(" is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBenefitsHome.deepLinkSpecs;
    }

    public static NavType parseSerializableOrParcelableType$navigation_common_release(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new NavType.ParcelableArrayType(cls) : new NavType.ParcelableType(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new NavType.EnumType(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new NavType.SerializableArrayType(cls) : new NavType.SerializableType(cls);
        }
        return null;
    }
}
