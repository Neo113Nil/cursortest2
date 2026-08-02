package utils;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.WireEnum;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes5.dex */
public abstract class StringUtilsKt {
    public static int sMinLogLevel = 3;

    public static void d(String str, String str2) {
        if (isLogLevelEnabled(3, str)) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (isLogLevelEnabled(6, str)) {
            Log.e(str, str2);
        }
    }

    public static final double getDoubleOrZero(String str) {
        str.getClass();
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return 0.0d;
    }

    public static void i(String str, String str2) {
        if (isLogLevelEnabled(4, str)) {
            Log.i(str, str2);
        }
    }

    public static boolean isLogLevelEnabled(int i, String str) {
        return sMinLogLevel <= i || Log.isLoggable(str, i);
    }

    public static final Color resolveColor(ComposePlatform.Color color, ExpressionEvaluator expressionEvaluator, GenieViewState genieViewState, Composer composer) {
        ComposePlatform.Color.ColorValue colorValue;
        Object failure;
        Object obj;
        long j;
        Long longOrNull;
        expressionEvaluator.getClass();
        genieViewState.getClass();
        if (color != null) {
            if (!ImageKt.isSystemInDarkTheme(composer) || (colorValue = color.dark) == null) {
                colorValue = color.light;
            }
            if (colorValue != null) {
                Expression expression = colorValue.hex;
                if (expression == null) {
                    Expression expression2 = colorValue.named;
                    GapComposer gapComposer = (GapComposer) composer;
                    if (expression2 == null) {
                        gapComposer.startReplaceGroup(-256836598);
                        gapComposer.end(false);
                        return null;
                    }
                    gapComposer.startReplaceGroup(-256836597);
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = Double.valueOf(expressionEvaluator.evaluate(expression2, genieViewState).numericValue());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    Double d = (Double) failure;
                    if (d != null) {
                        int doubleValue = (int) d.doubleValue();
                        Object[] objArr = (Enum[]) ComposePlatform.Color.NamedColor.class.getEnumConstants();
                        if (objArr != null) {
                            int length = objArr.length;
                            for (int i = 0; i < length; i++) {
                                obj = objArr[i];
                                obj.getClass();
                                if (((WireEnum) obj).getValue() == doubleValue) {
                                    break;
                                }
                            }
                        }
                    }
                    obj = null;
                    ComposePlatform.Color.NamedColor namedColor = (ComposePlatform.Color.NamedColor) obj;
                    if (namedColor == null) {
                        gapComposer.end(false);
                        return null;
                    }
                    ColorScheme colorScheme = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                    switch (namedColor.ordinal()) {
                        case 0:
                            j = Color.Unspecified;
                            break;
                        case 1:
                            j = colorScheme.primary;
                            break;
                        case 2:
                            j = colorScheme.onPrimary;
                            break;
                        case 3:
                            j = colorScheme.primaryContainer;
                            break;
                        case 4:
                            j = colorScheme.onPrimaryContainer;
                            break;
                        case 5:
                            j = colorScheme.secondary;
                            break;
                        case 6:
                            j = colorScheme.onSecondary;
                            break;
                        case 7:
                            j = colorScheme.secondaryContainer;
                            break;
                        case 8:
                            j = colorScheme.onSecondaryContainer;
                            break;
                        case 9:
                            j = colorScheme.tertiary;
                            break;
                        case 10:
                            j = colorScheme.onTertiary;
                            break;
                        case 11:
                            j = colorScheme.background;
                            break;
                        case 12:
                            j = colorScheme.onBackground;
                            break;
                        case 13:
                            j = colorScheme.surface;
                            break;
                        case 14:
                            j = colorScheme.onSurface;
                            break;
                        case 15:
                            j = colorScheme.surfaceVariant;
                            break;
                        case 16:
                            j = colorScheme.onSurfaceVariant;
                            break;
                        case 17:
                            j = colorScheme.error;
                            break;
                        case 18:
                            j = colorScheme.onError;
                            break;
                        case 19:
                            j = colorScheme.outline;
                            break;
                        case 20:
                            j = Color.Red;
                            break;
                        case 21:
                            j = Color.Green;
                            break;
                        case 22:
                            j = Color.Blue;
                            break;
                        case 23:
                            j = Color.Black;
                            break;
                        case 24:
                            j = Color.White;
                            break;
                        case 25:
                            j = Color.Gray;
                            break;
                        case 26:
                            j = Color.Transparent;
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                    }
                    return Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, j);
                }
                String evalString = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, expression);
                if (evalString != null) {
                    String removePrefix = StringsKt.removePrefix("#", StringsKt.trim(evalString).toString());
                    int length2 = removePrefix.length();
                    if (length2 == 6) {
                        Long longOrNull2 = StringsKt.toLongOrNull(16, removePrefix);
                        if (longOrNull2 != null) {
                            return new Color(ColorKt.Color((int) ((longOrNull2.longValue() | 4278190080L) & BodyPartID.bodyIdMax)));
                        }
                    } else if (length2 == 8 && (longOrNull = StringsKt.toLongOrNull(16, removePrefix)) != null) {
                        return new Color(ColorKt.Color((int) (longOrNull.longValue() & BodyPartID.bodyIdMax)));
                    }
                }
            }
        }
        return null;
    }

    public static void w(String str, String str2) {
        if (isLogLevelEnabled(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (isLogLevelEnabled(6, str)) {
            Log.e(str, str2, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isLogLevelEnabled(5, str)) {
            Log.w(str, str2, th);
        }
    }
}
