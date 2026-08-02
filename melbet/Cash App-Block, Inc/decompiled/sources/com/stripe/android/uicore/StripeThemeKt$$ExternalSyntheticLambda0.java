package com.stripe.android.uicore;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.Colors;
import androidx.compose.material.Shapes;
import androidx.compose.material.ShapesKt;
import androidx.compose.material.Typography;
import androidx.compose.material.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public final /* synthetic */ class StripeThemeKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ StripeThemeKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                StripeColors stripeColors = (StripeColors) obj6;
                StripeTypography stripeTypography = (StripeTypography) obj5;
                StripeShapes stripeShapes = (StripeShapes) obj4;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Colors colors = stripeColors.materialColors;
                    stripeTypography.getClass();
                    long j = stripeTypography.mediumFontSize;
                    int i3 = stripeTypography.fontWeightNormal;
                    int i4 = stripeTypography.fontWeightMedium;
                    TextStyle compat = StripeThemeKt.toCompat(TextStyle.Default);
                    long j2 = stripeTypography.xLargeFontSize;
                    Room.m1167checkArithmeticR2X_6o(j2);
                    long pack = Room.pack(1095216660480L & j2, TextUnit.m1059getValueimpl(j2) * 1.0f);
                    FontWeight fontWeight = new FontWeight(stripeTypography.fontWeightBold);
                    long j3 = compat.spanStyle.letterSpacing;
                    DefaultFontFamily defaultFontFamily = FontFamily.Default;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(compat, 0L, pack, fontWeight, defaultFontFamily, j3, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777049);
                    long j4 = stripeTypography.largeFontSize;
                    Room.m1167checkArithmeticR2X_6o(j4);
                    TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(compat, 0L, Room.pack(1095216660480L & j4, TextUnit.m1059getValueimpl(j4) * 1.0f), new FontWeight(i4), defaultFontFamily, Room.getSp(-0.32d), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777049);
                    long j5 = stripeTypography.smallFontSize;
                    Room.m1167checkArithmeticR2X_6o(j5);
                    TextStyle m994copyp1EtxEg$default3 = TextStyle.m994copyp1EtxEg$default(compat, 0L, Room.pack(1095216660480L & j5, TextUnit.m1059getValueimpl(j5) * 1.0f), new FontWeight(i4), defaultFontFamily, Room.getSp(-0.15d), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777049);
                    Room.m1167checkArithmeticR2X_6o(j);
                    long j6 = 1095216660480L & j;
                    TextStyle m994copyp1EtxEg$default4 = TextStyle.m994copyp1EtxEg$default(compat, 0L, Room.pack(j6, TextUnit.m1059getValueimpl(j) * 1.0f), new FontWeight(i3), defaultFontFamily, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777177);
                    Room.m1167checkArithmeticR2X_6o(j);
                    TextStyle m994copyp1EtxEg$default5 = TextStyle.m994copyp1EtxEg$default(compat, 0L, Room.pack(j6, TextUnit.m1059getValueimpl(j) * 1.0f), new FontWeight(i3), defaultFontFamily, Room.getSp(-0.15d), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777049);
                    long j7 = stripeTypography.xSmallFontSize;
                    Room.m1167checkArithmeticR2X_6o(j7);
                    TextStyle m994copyp1EtxEg$default6 = TextStyle.m994copyp1EtxEg$default(compat, 0L, Room.pack(1095216660480L & j7, TextUnit.m1059getValueimpl(j7) * 1.0f), new FontWeight(i4), defaultFontFamily, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777177);
                    long j8 = stripeTypography.xxSmallFontSize;
                    Room.m1167checkArithmeticR2X_6o(j8);
                    TextStyle m994copyp1EtxEg$default7 = TextStyle.m994copyp1EtxEg$default(compat, 0L, Room.pack(1095216660480L & j8, TextUnit.m1059getValueimpl(j8) * 1.0f), new FontWeight(i3), defaultFontFamily, Room.getSp(-0.15d), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777049);
                    Typography typography = (Typography) gapComposer.consume(TypographyKt.LocalTypography);
                    Typography typography2 = new Typography(StripeThemeKt.toCompat(typography.h1), StripeThemeKt.toCompat(typography.h2), StripeThemeKt.toCompat(typography.h3), m994copyp1EtxEg$default, m994copyp1EtxEg$default2, m994copyp1EtxEg$default3, m994copyp1EtxEg$default5, StripeThemeKt.toCompat(typography.subtitle2), m994copyp1EtxEg$default4, m994copyp1EtxEg$default7, StripeThemeKt.toCompat(typography.button), m994copyp1EtxEg$default6, StripeThemeKt.toCompat(typography.overline));
                    stripeShapes.getClass();
                    Shapes shapes = (Shapes) gapComposer.consume(ShapesKt.LocalShapes);
                    float f = stripeShapes.cornerRadius;
                    CardKt.MaterialTheme(colors, typography2, new Shapes(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f), shapes.large), Expect_jvmKt.rememberComposableLambda(-1175408073, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, i2), gapComposer), gapComposer, 3072, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SectionStyle sectionStyle = (SectionStyle) obj6;
                BorderStroke borderStroke = (BorderStroke) obj5;
                Shape shape = (Shape) obj4;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = sectionStyle.ordinal();
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    if (ordinal == 0) {
                        modifier = ClipKt.clip(SpacerKt.m298padding3ABfNKs(modifier, borderStroke.width), shape);
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl2, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (GovernmentIdState.FinalizeLocalVideoCapture) obj6;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj5;
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) obj4;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj3;
                File file = (File) obj;
                CameraProperties cameraProperties = (CameraProperties) obj2;
                file.getClass();
                cameraProperties.getClass();
                List list = finalizeLocalVideoCapture.uploadingIds;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GovernmentId) it.next()).getSide());
                }
                GovernmentId.Side side = GovernmentId.Side.FRONT;
                boolean contains = arrayList.contains(side);
                GovernmentId.Side side2 = GovernmentId.Side.BACK;
                boolean contains2 = arrayList.contains(side2);
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Frame(absolutePath, "video/*"));
                if (contains && contains2) {
                    side = GovernmentId.Side.FRONT_AND_BACK;
                } else if (!contains && contains2) {
                    side = side2;
                }
                GovernmentIdWorkflowUtilsKt.moveToNextStep$default(finalizeLocalVideoCapture, renderContext, input, new GovernmentId.GovernmentIdVideo(listOf, side, finalizeLocalVideoCapture.id.idClassKey, GovernmentId.CaptureMethod.MANUAL), finalizeLocalVideoCapture.id, pOPMatchingFactory, cameraProperties, false, null, 0, null, 3840);
                return Unit.INSTANCE;
        }
    }
}
