package com.squareup.cash.wallet.views;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda35 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda35(BoxScope boxScope, float f, FontFamily fontFamily, Shadow shadow, int i, List list, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails) {
        this.f$0 = boxScope;
        this.f$1 = f;
        this.f$2 = fontFamily;
        this.f$3 = shadow;
        this.f$4 = i;
        this.f$5 = list;
        this.f$6 = heroCardDetails;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                BoxScope boxScope = (BoxScope) obj7;
                FontFamily fontFamily = (FontFamily) obj6;
                Shadow shadow = (Shadow) obj5;
                List list = (List) obj4;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier align = boxScope.align(companion, biasAlignment);
                    float f = this.f$1;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(align, f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(18);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxWidth, (Function1) rememberedValue);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    HeroCardViewKt.m3792JustifiedTextcf5BqRc(graphicsLayer, list, ColorKt.Color(i2), TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).header, 0L, 0L, null, fontFamily, 0L, null, 0L, null, shadow, null, 0, 0L, null, null, 0, 16768991), gapComposer, 0);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(boxScope.align(companion, Alignment.Companion.BottomCenter), f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 28.0f, 7);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
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
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, 0L, 0L, null, fontFamily, 0L, null, 0L, null, shadow, null, 0, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium.spanStyle.fontSize, null, null, 0, 16637919);
                    Room.m1165Text25TpFw(3, 1, 0, 0, 1769472, 0, 3986, ColorKt.Color(i2), (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, heroCardDetails.name, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(3, 1, 0, 0, 1769472, 0, 3986, ColorKt.Color(i2), (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, CameraSelector$$ExternalSyntheticOutline0.m("CVV ", heroCardDetails.cvv, "  EXP ", heroCardDetails.exp), (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    VerticalAlignElement verticalAlignElement = new VerticalAlignElement(Alignment.Companion.Bottom);
                    Painter painterResource = Countries.painterResource(R.drawable.card_visa_logo, 0, gapComposer);
                    long Color = ColorKt.Color(i2);
                    ImageKt.Image(painterResource, null, verticalAlignElement, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(Color, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                ((SheetAppMessageView) obj7).m2983SheetContent3xixttE((SheetAppMessageModel.Loaded) obj6, (Function1) obj5, (PaddingValues) obj4, (RealSheetState) obj3, this.f$1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda35(SheetAppMessageView sheetAppMessageView, SheetAppMessageModel.Loaded loaded, Function1 function1, PaddingValues paddingValues, RealSheetState realSheetState, float f, int i) {
        this.f$0 = sheetAppMessageView;
        this.f$2 = loaded;
        this.f$3 = function1;
        this.f$5 = paddingValues;
        this.f$6 = realSheetState;
        this.f$1 = f;
        this.f$4 = i;
    }
}
