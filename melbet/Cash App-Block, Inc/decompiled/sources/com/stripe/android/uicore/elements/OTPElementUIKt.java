package com.stripe.android.uicore.elements;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.ShapesKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.Api33Impl;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class OTPElementUIKt {
    public static final void DisconnectedAlertIconAgsl(float f, int i, Composer composer, Modifier modifier) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1220614152);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Icons icons = Icons.AlertFill32;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, Api33Impl.m1075scanningPulseShaderosbwsH8(SizeKt.m285size3ABfNKs(modifier, 96.0f), f, 3.12f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.52f, gapComposer2, ((i2 << 3) & 112) | 1797504), colors.semantic.icon.standard, gapComposer2, 54, 0);
            gapComposer = gapComposer2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda4(f, modifier, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* renamed from: OTPElementUI-RE_urrM, reason: not valid java name */
    public static final void m4070OTPElementUIRE_urrM(final boolean z, final OTPElement oTPElement, Modifier modifier, Shape shape, final TextStyle textStyle, final float f, final String str, OTPElementColors oTPElementColors, float f2, final FocusRequester focusRequester, Composer composer, final int i) {
        GapComposer gapComposer;
        final Modifier modifier2;
        final Shape shape2;
        final OTPElementColors oTPElementColors2;
        final float f3;
        float f4;
        Shape shape3;
        Modifier modifier3;
        boolean z2;
        Modifier modifier4;
        int i2;
        ?? r6;
        float f5;
        boolean z3 = z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-280585760);
        TextStyle textStyle2 = textStyle;
        int i3 = i | (gapComposer2.changed(z3) ? 4 : 2) | (gapComposer2.changedInstance(oTPElement) ? 32 : 16) | 1408 | (gapComposer2.changed(textStyle2) ? 16384 : PKIFailureInfo.certRevoked) | 838860800;
        if (gapComposer2.shouldExecute(i3 & 1, ((306783379 & i3) == 306783378 && ((gapComposer2.changed(focusRequester) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            gapComposer2.startDefaults();
            int i4 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 == 0 || gapComposer2.getDefaultsInvalid()) {
                CornerBasedShape cornerBasedShape = ((Shapes) gapComposer2.consume(ShapesKt.LocalShapes)).medium;
                long m485getPrimary0d7_KjU = ((androidx.compose.material.Colors) gapComposer2.consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU();
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = StripeThemeKt.LocalColors;
                long j = ((StripeColors) gapComposer2.consume(staticProvidableCompositionLocal)).componentBorder;
                long j2 = ((StripeColors) gapComposer2.consume(staticProvidableCompositionLocal)).placeholderText;
                long j3 = Color.Transparent;
                OTPElementColors oTPElementColors3 = new OTPElementColors(m485getPrimary0d7_KjU, j2, j3, j3, j);
                f4 = 2.0f;
                oTPElementColors2 = oTPElementColors3;
                shape3 = cornerBasedShape;
                modifier3 = companion;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier;
                shape3 = shape;
                oTPElementColors2 = oTPElementColors;
                f4 = f2;
            }
            gapComposer2.endDefaults();
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.Companion.Empty) {
                obj = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj;
            gapComposer2.startReplaceGroup(-315718781);
            IntRange until = RangesKt___RangesKt.until(0, 6);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
            IntProgressionIterator it = until.iterator();
            while (it.hasNext) {
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                int nextInt = it.nextInt();
                boolean z4 = parcelableSnapshotMutableIntState2.getIntValue() == nextInt;
                if (nextInt == 0) {
                    gapComposer2.startReplaceGroup(187851538);
                    z2 = false;
                    gapComposer2.end(false);
                    modifier4 = modifier3;
                } else {
                    z2 = false;
                    z2 = false;
                    if (nextInt == 3) {
                        gapComposer2.startReplaceGroup(187853406);
                        modifier4 = modifier3;
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f));
                        gapComposer2.end(false);
                    } else {
                        modifier4 = modifier3;
                        gapComposer2.startReplaceGroup(187855739);
                        SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 8.0f));
                        gapComposer2.end(false);
                    }
                }
                if (z3) {
                    gapComposer2.startReplaceGroup(-1700894096);
                    gapComposer2.end(z2);
                    i2 = nextInt;
                    f5 = 1.0f;
                    r6 = z2;
                } else {
                    gapComposer2.startReplaceGroup(187861558);
                    i2 = nextInt;
                    long j4 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                    if (((androidx.compose.material.Colors) gapComposer2.consume(ColorsKt.LocalColors)).isLight()) {
                        ColorKt.m690luminance8_81llA(j4);
                    } else {
                        ColorKt.m690luminance8_81llA(j4);
                    }
                    r6 = 0;
                    gapComposer2.end(false);
                    f5 = 0.38f;
                }
                IntProgressionIterator intProgressionIterator = it;
                SectionUIKt.m4071SectionCardfWhpE4E(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, AlphaKt.alpha(companion, f5), true), shape3, false, StripeThemeKt.getStripeColors(gapComposer2).component, CanvasKt.m173BorderStrokecXLIe8U(z4 ? oTPElementColors2.selectedBorder : oTPElementColors2.unselectedBorder, StripeThemeKt.m4066getBorderStrokeWidth6a0pyJM(z4, f4, gapComposer2, MLKEMEngine.KyberPolyBytes, r6)), Expect_jvmKt.rememberComposableLambda(-1091924397, new OTPElementUIKt$$ExternalSyntheticLambda0(oTPElement, i2, z4, focusOwnerImpl, focusRequester, textStyle2, z3, oTPElementColors2, str, parcelableSnapshotMutableIntState2), gapComposer2), gapComposer2, 196608, 4);
                arrayList.add(Unit.INSTANCE);
                it = intProgressionIterator;
                textStyle2 = textStyle;
                oTPElementColors2 = oTPElementColors2;
                modifier3 = modifier4;
                f4 = f4;
                focusOwnerImpl = focusOwnerImpl;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                z3 = z;
            }
            gapComposer = gapComposer2;
            gapComposer.end(false);
            gapComposer.end(true);
            shape2 = shape3;
            modifier2 = modifier3;
            f3 = f4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            shape2 = shape;
            oTPElementColors2 = oTPElementColors;
            f3 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z, oTPElement, modifier2, shape2, textStyle, f, str, oTPElementColors2, f3, focusRequester, i) { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda1
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ OTPElement f$1;
                public final /* synthetic */ FocusRequester f$10;
                public final /* synthetic */ Modifier f$2;
                public final /* synthetic */ Shape f$3;
                public final /* synthetic */ TextStyle f$4;
                public final /* synthetic */ float f$6;
                public final /* synthetic */ String f$7;
                public final /* synthetic */ OTPElementColors f$8;
                public final /* synthetic */ float f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(14352449);
                    OTPElementUIKt.m4070OTPElementUIRE_urrM(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        if (r3 == r2) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OTPInputBox(String str, boolean z, TextStyle textStyle, OTPElement oTPElement, int i, FocusOwnerImpl focusOwnerImpl, Modifier modifier, boolean z2, OTPElementColors oTPElementColors, String str2, Composer composer, int i2) {
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        Object datePickerKt$$ExternalSyntheticLambda6;
        int i3;
        int i4;
        int i5;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1791721297);
        int i6 = i2 | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changed(textStyle) ? 256 : 128) | (gapComposer2.changedInstance(oTPElement) ? 2048 : 1024) | (gapComposer2.changed(i) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(focusOwnerImpl) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(z2) ? 8388608 : 4194304) | (gapComposer2.changed(oTPElementColors) ? 67108864 : 33554432) | (gapComposer2.changed(str2) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 306783379) != 306783378)) {
            int i7 = i6 & 14;
            boolean z3 = i7 == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default(str);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            SolidColor solidColor = new SolidColor(((StripeColors) gapComposer2.consume(StripeThemeKt.LocalColors)).textCursor);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 8, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            boolean changedInstance = gapComposer2.changedInstance(focusOwnerImpl);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            rememberedValue2 = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl, 2);
            gapComposer2.updateRememberedValue(rememberedValue2);
            Function1 function1 = (Function1) rememberedValue2;
            boolean changedInstance2 = gapComposer2.changedInstance(focusOwnerImpl);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl, 3);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            KeyboardActions keyboardActions = new KeyboardActions(function1, (Function1) rememberedValue3, null, 58);
            int i8 = i6 >> 12;
            int i9 = i8 & 7168;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1562088977, new OTPElementUIKt$$ExternalSyntheticLambda10(z, oTPElementColors, str, z2, str2), gapComposer2);
            boolean changed = gapComposer2.changed(mutableState) | (i7 == 4) | gapComposer2.changedInstance(oTPElement) | ((i6 & 57344) == 16384) | gapComposer2.changedInstance(focusOwnerImpl);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                i3 = i8;
                i4 = i7;
                i5 = i9;
                datePickerKt$$ExternalSyntheticLambda6 = new DatePickerKt$$ExternalSyntheticLambda6(str, oTPElement, i, mutableState, focusOwnerImpl, 5);
                gapComposer2.updateRememberedValue(datePickerKt$$ExternalSyntheticLambda6);
            } else {
                i4 = i7;
                datePickerKt$$ExternalSyntheticLambda6 = rememberedValue4;
                i3 = i8;
                i5 = i9;
            }
            int i10 = 100663296 | i4 | (i3 & 896) | i5 | ((i6 << 9) & 458752);
            gapComposer = gapComposer2;
            BasicTextFieldKt.BasicTextField(str, (Function1) datePickerKt$$ExternalSyntheticLambda6, modifier, z2, false, textStyle, keyboardOptions, keyboardActions, true, 0, 0, null, null, null, solidColor, rememberComposableLambda, gapComposer, i10, 0, 15888);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OTPElementUIKt$$ExternalSyntheticLambda0(str, z, textStyle, oTPElement, i, focusOwnerImpl, modifier, z2, oTPElementColors, str2, i2);
        }
    }

    public static boolean zze(byte b) {
        return b > -65;
    }
}
