package xyz.block.genie.state;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.internal.DebugUtils;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.ResolvedModifiers;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.wire.WireEnum;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes5.dex */
public abstract class StateBindingsKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0416 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0374 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ComposePlatformView(ComposePlatform composePlatform, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposePlatform composePlatform2;
        int i2;
        boolean z;
        Modifier.Companion companion;
        ResolvedModifiers resolvedModifiers;
        Iterator it;
        TextStyle textStyle;
        Modifier.Companion companion2;
        int i3;
        TextStyle textStyle2;
        ComposePlatform.Modifier.Background background;
        ComposePlatform.Modifier.Alpha alpha;
        ComposePlatform.Modifier.Clip clip;
        ComposePlatform.Modifier.Border border;
        ComposePlatform.Modifier.WrapContentSize wrapContentSize;
        ComposePlatform.Modifier.TextStyle textStyle3;
        Object failure;
        Object obj;
        TextStyle textStyle4;
        Double evalDouble;
        Expression expression;
        Object failure2;
        Object obj2;
        ComposePlatform.FontWeight fontWeight;
        Expression expression2;
        Object failure3;
        Object obj3;
        ComposePlatform.TextAlign textAlign;
        TextStyle textStyle5;
        boolean z2;
        TextAlign textAlign2;
        FontWeight fontWeight2;
        FontWeight fontWeight3;
        TextStyle textStyle6;
        ComposePlatform.Modifier.ContentColor contentColor;
        ComposePlatform.Modifier.Tint tint;
        ComposePlatform.Modifier.Overlay overlay;
        composePlatform.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1212241549);
        int i4 = (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(composePlatform) ? 4 : 2) | i;
        boolean z3 = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            List list = composePlatform.modifiers;
            list.getClass();
            gapComposer.startReplaceGroup(1981272712);
            boolean isEmpty = list.isEmpty();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (isEmpty) {
                resolvedModifiers = new ResolvedModifiers(companion3, ResolvedStyle.Empty, null);
                gapComposer.end(false);
                i2 = i4;
                z = false;
                companion = companion3;
            } else {
                ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
                GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
                Iterator it2 = list.iterator();
                Modifier modifier3 = companion3;
                TextStyle textStyle7 = null;
                Color color = null;
                Color color2 = null;
                Node node = null;
                while (it2.hasNext()) {
                    ComposePlatform.Modifier modifier4 = (ComposePlatform.Modifier) it2.next();
                    ComposePlatform.Modifier.Size size = modifier4.size;
                    if (size != null) {
                        Double evalDouble2 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, size.width);
                        Dp dp = evalDouble2 != null ? new Dp((float) evalDouble2.doubleValue()) : null;
                        Double evalDouble3 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, size.height);
                        Dp dp2 = evalDouble3 != null ? new Dp((float) evalDouble3.doubleValue()) : null;
                        if (dp != null && dp2 != null) {
                            modifier3 = SizeKt.m287sizeVpY3zN4(modifier3, dp.value, dp2.value);
                        } else if (dp != null) {
                            modifier3 = SizeKt.m290width3ABfNKs(modifier3, dp.value);
                        } else if (dp2 != null) {
                            modifier3 = SizeKt.m277height3ABfNKs(modifier3, dp2.value);
                        }
                        Double evalDouble4 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, size.min_width);
                        Dp dp3 = evalDouble4 != null ? new Dp((float) evalDouble4.doubleValue()) : null;
                        Double evalDouble5 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, size.max_width);
                        Dp dp4 = evalDouble5 != null ? new Dp((float) evalDouble5.doubleValue()) : null;
                        Double evalDouble6 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, size.min_height);
                        Iterator it3 = it2;
                        textStyle = textStyle7;
                        Dp dp5 = evalDouble6 != null ? new Dp((float) evalDouble6.doubleValue()) : null;
                        Double evalDouble7 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, size.max_height);
                        it = it3;
                        companion2 = companion3;
                        Dp dp6 = evalDouble7 != null ? new Dp((float) evalDouble7.doubleValue()) : null;
                        if (dp3 != null || dp4 != null || dp5 != null || dp6 != null) {
                            modifier3 = SizeKt.m288sizeInqDBjuR0(modifier3, dp3 != null ? dp3.value : Float.NaN, dp5 != null ? dp5.value : Float.NaN, dp4 != null ? dp4.value : Float.NaN, dp6 != null ? dp6.value : Float.NaN);
                        }
                        if (EvalHelpersKt.evalBool(expressionEvaluator, size.fill_max_width, genieViewState, false)) {
                            modifier3 = SizeKt.fillMaxWidth(modifier3, 1.0f);
                        }
                        if (EvalHelpersKt.evalBool(expressionEvaluator, size.fill_max_height, genieViewState, false)) {
                            modifier3 = SizeKt.fillMaxHeight(modifier3, 1.0f);
                        }
                    } else {
                        it = it2;
                        textStyle = textStyle7;
                        companion2 = companion3;
                    }
                    ComposePlatform.Modifier.Padding padding = modifier4.padding;
                    if (padding != null) {
                        Double evalDouble8 = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, padding.all);
                        if (evalDouble8 != null) {
                            modifier3 = SpacerKt.m298padding3ABfNKs(modifier3, (float) evalDouble8.doubleValue());
                        } else {
                            i3 = i4;
                            textStyle2 = textStyle;
                            modifier3 = SpacerKt.m301paddingqDBjuR0(modifier3, (float) EvalHelpersKt.evalDouble(expressionEvaluator, padding.start, genieViewState, 0.0d), (float) EvalHelpersKt.evalDouble(expressionEvaluator, padding.top, genieViewState, 0.0d), (float) EvalHelpersKt.evalDouble(expressionEvaluator, padding.end, genieViewState, 0.0d), (float) EvalHelpersKt.evalDouble(expressionEvaluator, padding.bottom, genieViewState, 0.0d));
                            background = modifier4.background;
                            if (background != null) {
                                gapComposer.startReplaceGroup(-1639534766);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-1639534765);
                                Color resolveColor = StringUtilsKt.resolveColor(background.color, expressionEvaluator, genieViewState, gapComposer);
                                if (resolveColor != null) {
                                    modifier3 = modifier3.then(ImageKt.m177backgroundbw27NRU(companion2, resolveColor.value, ColorKt.RectangleShape));
                                }
                                gapComposer.end(false);
                            }
                            alpha = modifier4.alpha;
                            if (alpha != null) {
                                modifier3 = modifier3.then(AlphaKt.alpha(companion2, (float) EvalHelpersKt.evalDouble(expressionEvaluator, alpha.alpha, genieViewState, 1.0d)));
                            }
                            clip = modifier4.clip;
                            if (clip != null) {
                                modifier3 = modifier3.then(ClipKt.clip(companion2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4((float) EvalHelpersKt.evalDouble(expressionEvaluator, clip.corner_radius, genieViewState, 0.0d))));
                            }
                            border = modifier4.border;
                            if (border != null) {
                                gapComposer.startReplaceGroup(-1639047043);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-1639047042);
                                Color resolveColor2 = StringUtilsKt.resolveColor(border.color, expressionEvaluator, genieViewState, gapComposer);
                                if (resolveColor2 != null) {
                                    long j = resolveColor2.value;
                                    float evalDouble9 = (float) EvalHelpersKt.evalDouble(expressionEvaluator, border.width, genieViewState, 1.0d);
                                    float evalDouble10 = (float) EvalHelpersKt.evalDouble(expressionEvaluator, border.corner_radius, genieViewState, 0.0d);
                                    modifier3 = modifier3.then(ClipKt.clip(companion2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(evalDouble10))).then(ImageKt.m178borderxT4_qwU(companion2, evalDouble9, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(evalDouble10)));
                                }
                                gapComposer.end(false);
                            }
                            wrapContentSize = modifier4.wrap_content_size;
                            if (wrapContentSize != null) {
                                boolean evalBool = EvalHelpersKt.evalBool(expressionEvaluator, wrapContentSize.horizontal, genieViewState, true);
                                boolean evalBool2 = EvalHelpersKt.evalBool(expressionEvaluator, wrapContentSize.vertical, genieViewState, true);
                                modifier3 = modifier3.then((evalBool && evalBool2) ? SizeKt.wrapContentSize$default(companion2, null, 3) : evalBool ? SizeKt.wrapContentWidth$default(companion2, null, 3) : evalBool2 ? SizeKt.wrapContentHeight(companion2, Alignment.Companion.CenterVertically, (r2 & 2) == 0) : companion2);
                            }
                            Modifier modifier5 = modifier3;
                            textStyle3 = modifier4.text_style;
                            if (textStyle3 != null) {
                                gapComposer.startReplaceGroup(-1638261689);
                                z2 = false;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-1638261688);
                                Expression expression3 = textStyle3.typography;
                                if (expression3 != null) {
                                    try {
                                        Result.Companion companion4 = Result.Companion;
                                        failure = Double.valueOf(expressionEvaluator.evaluate(expression3, genieViewState).numericValue());
                                    } catch (Throwable th) {
                                        Result.Companion companion5 = Result.Companion;
                                        failure = new Result.Failure(th);
                                    }
                                    if (failure instanceof Result.Failure) {
                                        failure = null;
                                    }
                                    Double d = (Double) failure;
                                    if (d != null) {
                                        int doubleValue = (int) d.doubleValue();
                                        Object[] objArr = (Enum[]) ComposePlatform.Typography.class.getEnumConstants();
                                        if (objArr != null) {
                                            for (Object obj4 : objArr) {
                                                obj4.getClass();
                                                if (((WireEnum) obj4).getValue() == doubleValue) {
                                                    obj = obj4;
                                                    ComposePlatform.Typography typography = (ComposePlatform.Typography) obj;
                                                    Typography typography2 = (Typography) gapComposer.consume(TypographyKt.LocalTypography);
                                                    if (textStyle2 != null) {
                                                        if (typography != null) {
                                                            typography2.getClass();
                                                            textStyle6 = typography2.bodyMedium;
                                                            switch (typography) {
                                                                case TYPOGRAPHY_UNSPECIFIED:
                                                                case TYPOGRAPHY_BODY_MEDIUM:
                                                                    break;
                                                                case TYPOGRAPHY_DISPLAY_LARGE:
                                                                    textStyle6 = typography2.displayLarge;
                                                                    break;
                                                                case TYPOGRAPHY_DISPLAY_MEDIUM:
                                                                    textStyle6 = typography2.displayMedium;
                                                                    break;
                                                                case TYPOGRAPHY_DISPLAY_SMALL:
                                                                    textStyle6 = typography2.displaySmall;
                                                                    break;
                                                                case TYPOGRAPHY_HEADLINE_LARGE:
                                                                    textStyle6 = typography2.headlineLarge;
                                                                    break;
                                                                case TYPOGRAPHY_HEADLINE_MEDIUM:
                                                                    textStyle6 = typography2.headlineMedium;
                                                                    break;
                                                                case TYPOGRAPHY_HEADLINE_SMALL:
                                                                    textStyle6 = typography2.headlineSmall;
                                                                    break;
                                                                case TYPOGRAPHY_TITLE_LARGE:
                                                                    textStyle6 = typography2.titleLarge;
                                                                    break;
                                                                case TYPOGRAPHY_TITLE_MEDIUM:
                                                                    textStyle6 = typography2.titleMedium;
                                                                    break;
                                                                case TYPOGRAPHY_TITLE_SMALL:
                                                                    textStyle6 = typography2.titleSmall;
                                                                    break;
                                                                case TYPOGRAPHY_BODY_LARGE:
                                                                    textStyle6 = typography2.bodyLarge;
                                                                    break;
                                                                case TYPOGRAPHY_BODY_SMALL:
                                                                    textStyle6 = typography2.bodySmall;
                                                                    break;
                                                                case TYPOGRAPHY_LABEL_LARGE:
                                                                    textStyle6 = typography2.labelLarge;
                                                                    break;
                                                                case TYPOGRAPHY_LABEL_MEDIUM:
                                                                    textStyle6 = typography2.labelMedium;
                                                                    break;
                                                                case TYPOGRAPHY_LABEL_SMALL:
                                                                    textStyle6 = typography2.labelSmall;
                                                                    break;
                                                                default:
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return;
                                                            }
                                                        } else {
                                                            textStyle6 = null;
                                                        }
                                                        textStyle4 = textStyle6 == null ? TextStyle.Default : textStyle6;
                                                    } else {
                                                        textStyle4 = textStyle2;
                                                    }
                                                    evalDouble = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, textStyle3.size);
                                                    if (evalDouble != null) {
                                                        textStyle4 = TextStyle.m994copyp1EtxEg$default(textStyle4, 0L, Room.getSp(evalDouble.doubleValue()), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                                                    }
                                                    TextStyle textStyle8 = textStyle4;
                                                    expression = textStyle3.weight;
                                                    if (expression != null) {
                                                        try {
                                                            Result.Companion companion6 = Result.Companion;
                                                            failure2 = Double.valueOf(expressionEvaluator.evaluate(expression, genieViewState).numericValue());
                                                        } catch (Throwable th2) {
                                                            Result.Companion companion7 = Result.Companion;
                                                            failure2 = new Result.Failure(th2);
                                                        }
                                                        if (failure2 instanceof Result.Failure) {
                                                            failure2 = null;
                                                        }
                                                        Double d2 = (Double) failure2;
                                                        if (d2 != null) {
                                                            int doubleValue2 = (int) d2.doubleValue();
                                                            Object[] objArr2 = (Enum[]) ComposePlatform.FontWeight.class.getEnumConstants();
                                                            if (objArr2 != null) {
                                                                for (Object obj5 : objArr2) {
                                                                    obj5.getClass();
                                                                    if (((WireEnum) obj5).getValue() == doubleValue2) {
                                                                        obj2 = obj5;
                                                                        fontWeight = (ComposePlatform.FontWeight) obj2;
                                                                        if (fontWeight != null) {
                                                                            switch (fontWeight) {
                                                                                case FONT_WEIGHT_UNSPECIFIED:
                                                                                    fontWeight2 = null;
                                                                                    if (fontWeight2 != null) {
                                                                                        textStyle8 = TextStyle.m994copyp1EtxEg$default(textStyle8, 0L, 0L, fontWeight2, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_THIN:
                                                                                    fontWeight3 = FontWeight.Thin;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_EXTRA_LIGHT:
                                                                                    fontWeight3 = FontWeight.ExtraLight;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_LIGHT:
                                                                                    fontWeight3 = FontWeight.Light;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_NORMAL:
                                                                                    fontWeight3 = FontWeight.Normal;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_MEDIUM:
                                                                                    fontWeight3 = FontWeight.Medium;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_SEMI_BOLD:
                                                                                    fontWeight3 = FontWeight.SemiBold;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_BOLD:
                                                                                    fontWeight3 = FontWeight.Bold;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_EXTRA_BOLD:
                                                                                    fontWeight3 = FontWeight.ExtraBold;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                case FONT_WEIGHT_BLACK:
                                                                                    fontWeight3 = FontWeight.Black;
                                                                                    fontWeight2 = fontWeight3;
                                                                                    if (fontWeight2 != null) {
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                    return;
                                                                            }
                                                                        }
                                                                        TextStyle textStyle9 = textStyle8;
                                                                        expression2 = textStyle3.text_align;
                                                                        if (expression2 != null) {
                                                                            try {
                                                                                Result.Companion companion8 = Result.Companion;
                                                                                failure3 = Double.valueOf(expressionEvaluator.evaluate(expression2, genieViewState).numericValue());
                                                                            } catch (Throwable th3) {
                                                                                Result.Companion companion9 = Result.Companion;
                                                                                failure3 = new Result.Failure(th3);
                                                                            }
                                                                            if (failure3 instanceof Result.Failure) {
                                                                                failure3 = null;
                                                                            }
                                                                            Double d3 = (Double) failure3;
                                                                            if (d3 != null) {
                                                                                int doubleValue3 = (int) d3.doubleValue();
                                                                                Object[] objArr3 = (Enum[]) ComposePlatform.TextAlign.class.getEnumConstants();
                                                                                if (objArr3 != null) {
                                                                                    for (Object obj6 : objArr3) {
                                                                                        obj6.getClass();
                                                                                        if (((WireEnum) obj6).getValue() == doubleValue3) {
                                                                                            obj3 = obj6;
                                                                                            textAlign = (ComposePlatform.TextAlign) obj3;
                                                                                            if (textAlign != null) {
                                                                                                int ordinal = textAlign.ordinal();
                                                                                                if (ordinal == 0) {
                                                                                                    textAlign2 = null;
                                                                                                } else if (ordinal == 1) {
                                                                                                    textAlign2 = new TextAlign(5);
                                                                                                } else if (ordinal == 2) {
                                                                                                    textAlign2 = new TextAlign(6);
                                                                                                } else if (ordinal == 3) {
                                                                                                    textAlign2 = new TextAlign(3);
                                                                                                } else {
                                                                                                    if (ordinal != 4) {
                                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                        return;
                                                                                                    }
                                                                                                    textAlign2 = new TextAlign(4);
                                                                                                }
                                                                                                if (textAlign2 != null) {
                                                                                                    textStyle5 = TextStyle.m994copyp1EtxEg$default(textStyle9, 0L, 0L, null, null, 0L, null, 0L, null, null, null, textAlign2.value, 0L, null, null, 0, 16744447);
                                                                                                    z2 = false;
                                                                                                    gapComposer.end(false);
                                                                                                    textStyle2 = textStyle5;
                                                                                                }
                                                                                            }
                                                                                            textStyle5 = textStyle9;
                                                                                            z2 = false;
                                                                                            gapComposer.end(false);
                                                                                            textStyle2 = textStyle5;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        obj3 = null;
                                                                        textAlign = (ComposePlatform.TextAlign) obj3;
                                                                        if (textAlign != null) {
                                                                        }
                                                                        textStyle5 = textStyle9;
                                                                        z2 = false;
                                                                        gapComposer.end(false);
                                                                        textStyle2 = textStyle5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    obj2 = null;
                                                    fontWeight = (ComposePlatform.FontWeight) obj2;
                                                    if (fontWeight != null) {
                                                    }
                                                    TextStyle textStyle92 = textStyle8;
                                                    expression2 = textStyle3.text_align;
                                                    if (expression2 != null) {
                                                    }
                                                    obj3 = null;
                                                    textAlign = (ComposePlatform.TextAlign) obj3;
                                                    if (textAlign != null) {
                                                    }
                                                    textStyle5 = textStyle92;
                                                    z2 = false;
                                                    gapComposer.end(false);
                                                    textStyle2 = textStyle5;
                                                }
                                            }
                                        }
                                    }
                                }
                                obj = null;
                                ComposePlatform.Typography typography3 = (ComposePlatform.Typography) obj;
                                Typography typography22 = (Typography) gapComposer.consume(TypographyKt.LocalTypography);
                                if (textStyle2 != null) {
                                }
                                evalDouble = EvalHelpersKt.evalDouble(expressionEvaluator, genieViewState, textStyle3.size);
                                if (evalDouble != null) {
                                }
                                TextStyle textStyle82 = textStyle4;
                                expression = textStyle3.weight;
                                if (expression != null) {
                                }
                                obj2 = null;
                                fontWeight = (ComposePlatform.FontWeight) obj2;
                                if (fontWeight != null) {
                                }
                                TextStyle textStyle922 = textStyle82;
                                expression2 = textStyle3.text_align;
                                if (expression2 != null) {
                                }
                                obj3 = null;
                                textAlign = (ComposePlatform.TextAlign) obj3;
                                if (textAlign != null) {
                                }
                                textStyle5 = textStyle922;
                                z2 = false;
                                gapComposer.end(false);
                                textStyle2 = textStyle5;
                            }
                            contentColor = modifier4.content_color;
                            if (contentColor != null) {
                                gapComposer.startReplaceGroup(-1638154646);
                            } else {
                                gapComposer.startReplaceGroup(-1638154645);
                                Color resolveColor3 = StringUtilsKt.resolveColor(contentColor.color, expressionEvaluator, genieViewState, gapComposer);
                                if (resolveColor3 != null) {
                                    color = resolveColor3;
                                }
                            }
                            gapComposer.end(z2);
                            tint = modifier4.tint;
                            if (tint != null) {
                                gapComposer.startReplaceGroup(-1638059910);
                            } else {
                                gapComposer.startReplaceGroup(-1638059909);
                                Color resolveColor4 = StringUtilsKt.resolveColor(tint.color, expressionEvaluator, genieViewState, gapComposer);
                                if (resolveColor4 != null) {
                                    color2 = resolveColor4;
                                }
                            }
                            gapComposer.end(z2);
                            overlay = modifier4.overlay;
                            if (overlay == null) {
                                node = overlay.content;
                            }
                            modifier3 = modifier5;
                            z3 = z2;
                            companion3 = companion2;
                            i4 = i3;
                            textStyle7 = textStyle2;
                            it2 = it;
                        }
                    }
                    i3 = i4;
                    textStyle2 = textStyle;
                    background = modifier4.background;
                    if (background != null) {
                    }
                    alpha = modifier4.alpha;
                    if (alpha != null) {
                    }
                    clip = modifier4.clip;
                    if (clip != null) {
                    }
                    border = modifier4.border;
                    if (border != null) {
                    }
                    wrapContentSize = modifier4.wrap_content_size;
                    if (wrapContentSize != null) {
                    }
                    Modifier modifier52 = modifier3;
                    textStyle3 = modifier4.text_style;
                    if (textStyle3 != null) {
                    }
                    contentColor = modifier4.content_color;
                    if (contentColor != null) {
                    }
                    gapComposer.end(z2);
                    tint = modifier4.tint;
                    if (tint != null) {
                    }
                    gapComposer.end(z2);
                    overlay = modifier4.overlay;
                    if (overlay == null) {
                    }
                    modifier3 = modifier52;
                    z3 = z2;
                    companion3 = companion2;
                    i4 = i3;
                    textStyle7 = textStyle2;
                    it2 = it;
                }
                i2 = i4;
                z = z3;
                TextStyle textStyle10 = textStyle7;
                companion = companion3;
                ResolvedModifiers resolvedModifiers2 = new ResolvedModifiers(modifier3, new ResolvedStyle(textStyle10, color, color2), node);
                gapComposer.end(z);
                resolvedModifiers = resolvedModifiers2;
            }
            modifier2 = modifier;
            Modifier then = modifier2.then(resolvedModifiers.modifier);
            ResolvedStyle resolvedStyle = resolvedModifiers.style;
            Node node2 = resolvedModifiers.overlay;
            if (node2 != null) {
                gapComposer.startReplaceGroup(-1802480245);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composePlatform2 = composePlatform;
                InnerView(composePlatform2, resolvedStyle, companion, gapComposer, (i2 & 14) | MLKEMEngine.KyberPolyBytes);
                MatrixExt.GenieNodeView(node2, companion, gapComposer, 48);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                boolean z4 = z;
                composePlatform2 = composePlatform;
                gapComposer.startReplaceGroup(-1802314302);
                InnerView(composePlatform2, resolvedStyle, then, gapComposer, i2 & 14);
                gapComposer.end(z4);
            }
        } else {
            modifier2 = modifier;
            composePlatform2 = composePlatform;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda0(composePlatform2, modifier2, i, 27);
        }
    }

    public static final void InnerView(ComposePlatform composePlatform, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1335020235);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composePlatform) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposePlatform.Column column = composePlatform.column;
            ComposePlatform.ProgressIndicator progressIndicator = composePlatform.progress_indicator;
            ComposePlatform.DatePicker datePicker = composePlatform.date_picker;
            ComposePlatform.DropdownMenu dropdownMenu = composePlatform.dropdown_menu;
            ComposePlatform.Slider slider = composePlatform.slider;
            ComposePlatform.Switch r12 = composePlatform.switch_control;
            ComposePlatform.TextField textField = composePlatform.text_field;
            ComposePlatform.Button button = composePlatform.button;
            ComposePlatform.Image image = composePlatform.image;
            ComposePlatform.Text text = composePlatform.text;
            ComposePlatform.Box box = composePlatform.box;
            ComposePlatform.Row row = composePlatform.row;
            if (column != null) {
                gapComposer.startReplaceGroup(1240796639);
                ComposePlatform.Column column2 = composePlatform.column;
                column2.getClass();
                CameraCaptureCallbacks.ComposeColumnView(column2, modifier, gapComposer, (i2 >> 3) & 112);
                gapComposer.end(false);
            } else if (row != null) {
                gapComposer.startReplaceGroup(1240798777);
                DynamicRanges.ComposeRowView(row, modifier, gapComposer, (i2 >> 3) & 112);
                gapComposer.end(false);
            } else if (box != null) {
                gapComposer.startReplaceGroup(1240800729);
                EvalHelpersKt.ComposeBoxView(box, modifier, gapComposer, (i2 >> 3) & 112);
                gapComposer.end(false);
            } else if (text != null) {
                gapComposer.startReplaceGroup(1240802715);
                TextViewKt.TextView(text, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (image != null) {
                gapComposer.startReplaceGroup(1240804797);
                UseCaseUtil.ImageView(image, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (button != null) {
                gapComposer.startReplaceGroup(1240806975);
                AnyUtilsKt.ButtonView(button, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (textField != null) {
                gapComposer.startReplaceGroup(1240809350);
                DebugUtils.TextFieldView(textField, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (r12 != null) {
                gapComposer.startReplaceGroup(1240812071);
                SwitchViewKt.SwitchView(r12, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (slider != null) {
                gapComposer.startReplaceGroup(1240814559);
                TargetUtils.SliderView(slider, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (dropdownMenu != null) {
                gapComposer.startReplaceGroup(1240817036);
                UseCaseAdditionSimulator.DropdownMenuView(dropdownMenu, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (datePicker != null) {
                gapComposer.startReplaceGroup(1240819848);
                QuirkSettingsLoader.DatePickerView(datePicker, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else if (progressIndicator != null) {
                gapComposer.startReplaceGroup(1240822774);
                ImageUtil.ProgressIndicatorView(progressIndicator, resolvedStyle, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1240825209);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(composePlatform, resolvedStyle, modifier, i, 2);
        }
    }

    public static void incrementAll(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((DeferrableSurface) list.get(i)).incrementUseCount();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((DeferrableSurface) list.get(i2)).decrementUseCount();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static final GenieStateBinding rememberStringBinding(Binding binding, String str, Composer composer, int i) {
        List list;
        KeyPath keyPath;
        if ((i & 2) != 0) {
            str = "";
        }
        GapComposer gapComposer = (GapComposer) composer;
        GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
        if (binding == null || (keyPath = binding.key_path) == null || (list = keyPath.segments) == null) {
            list = EmptyList.INSTANCE;
        }
        boolean changed = gapComposer.changed(genieViewState) | gapComposer.changed(list);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new GenieStateBinding(genieViewState, list, new StateBindingsKt$$ExternalSyntheticLambda0(str, 0), new ZipFilesKt$$ExternalSyntheticLambda4(6));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (GenieStateBinding) rememberedValue;
    }
}
