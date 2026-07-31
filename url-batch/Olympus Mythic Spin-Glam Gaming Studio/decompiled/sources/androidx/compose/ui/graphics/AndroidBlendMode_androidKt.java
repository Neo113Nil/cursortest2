package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import androidx.compose.ui.graphics.BlendMode;
import kotlin.Metadata;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toAndroidBlendMode", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {
    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m1345toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m1390equalsimpl0(i, companion.m1394getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1417getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1400getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1421getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1404getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1419getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1402getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1420getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1403getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1418getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1401getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1422getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1413getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1415getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1412getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1398getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1408getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1410getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m1344toAndroidBlendModes9anfk8(int i) {
        android.graphics.BlendMode blendMode;
        android.graphics.BlendMode blendMode2;
        android.graphics.BlendMode blendMode3;
        android.graphics.BlendMode blendMode4;
        android.graphics.BlendMode blendMode5;
        android.graphics.BlendMode blendMode6;
        android.graphics.BlendMode blendMode7;
        android.graphics.BlendMode blendMode8;
        android.graphics.BlendMode blendMode9;
        android.graphics.BlendMode blendMode10;
        android.graphics.BlendMode blendMode11;
        android.graphics.BlendMode blendMode12;
        android.graphics.BlendMode blendMode13;
        android.graphics.BlendMode blendMode14;
        android.graphics.BlendMode blendMode15;
        android.graphics.BlendMode blendMode16;
        android.graphics.BlendMode blendMode17;
        android.graphics.BlendMode blendMode18;
        android.graphics.BlendMode blendMode19;
        android.graphics.BlendMode blendMode20;
        android.graphics.BlendMode blendMode21;
        android.graphics.BlendMode blendMode22;
        android.graphics.BlendMode blendMode23;
        android.graphics.BlendMode blendMode24;
        android.graphics.BlendMode blendMode25;
        android.graphics.BlendMode blendMode26;
        android.graphics.BlendMode blendMode27;
        android.graphics.BlendMode blendMode28;
        android.graphics.BlendMode blendMode29;
        android.graphics.BlendMode blendMode30;
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m1390equalsimpl0(i, companion.m1394getClear0nO6VwU())) {
            blendMode30 = android.graphics.BlendMode.CLEAR;
            return blendMode30;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1417getSrc0nO6VwU())) {
            blendMode29 = android.graphics.BlendMode.SRC;
            return blendMode29;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1400getDst0nO6VwU())) {
            blendMode28 = android.graphics.BlendMode.DST;
            return blendMode28;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1421getSrcOver0nO6VwU())) {
            blendMode27 = android.graphics.BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1404getDstOver0nO6VwU())) {
            blendMode26 = android.graphics.BlendMode.DST_OVER;
            return blendMode26;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1419getSrcIn0nO6VwU())) {
            blendMode25 = android.graphics.BlendMode.SRC_IN;
            return blendMode25;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1402getDstIn0nO6VwU())) {
            blendMode24 = android.graphics.BlendMode.DST_IN;
            return blendMode24;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1420getSrcOut0nO6VwU())) {
            blendMode23 = android.graphics.BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1403getDstOut0nO6VwU())) {
            blendMode22 = android.graphics.BlendMode.DST_OUT;
            return blendMode22;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1418getSrcAtop0nO6VwU())) {
            blendMode21 = android.graphics.BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1401getDstAtop0nO6VwU())) {
            blendMode20 = android.graphics.BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1422getXor0nO6VwU())) {
            blendMode19 = android.graphics.BlendMode.XOR;
            return blendMode19;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1413getPlus0nO6VwU())) {
            blendMode18 = android.graphics.BlendMode.PLUS;
            return blendMode18;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1410getModulate0nO6VwU())) {
            blendMode17 = android.graphics.BlendMode.MODULATE;
            return blendMode17;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1415getScreen0nO6VwU())) {
            blendMode16 = android.graphics.BlendMode.SCREEN;
            return blendMode16;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1412getOverlay0nO6VwU())) {
            blendMode15 = android.graphics.BlendMode.OVERLAY;
            return blendMode15;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1398getDarken0nO6VwU())) {
            blendMode14 = android.graphics.BlendMode.DARKEN;
            return blendMode14;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1408getLighten0nO6VwU())) {
            blendMode13 = android.graphics.BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1397getColorDodge0nO6VwU())) {
            blendMode12 = android.graphics.BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1396getColorBurn0nO6VwU())) {
            blendMode11 = android.graphics.BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1406getHardlight0nO6VwU())) {
            blendMode10 = android.graphics.BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1416getSoftlight0nO6VwU())) {
            blendMode9 = android.graphics.BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1399getDifference0nO6VwU())) {
            blendMode8 = android.graphics.BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1405getExclusion0nO6VwU())) {
            blendMode7 = android.graphics.BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1411getMultiply0nO6VwU())) {
            blendMode6 = android.graphics.BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1407getHue0nO6VwU())) {
            blendMode5 = android.graphics.BlendMode.HUE;
            return blendMode5;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1414getSaturation0nO6VwU())) {
            blendMode4 = android.graphics.BlendMode.SATURATION;
            return blendMode4;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1395getColor0nO6VwU())) {
            blendMode3 = android.graphics.BlendMode.COLOR;
            return blendMode3;
        }
        if (BlendMode.m1390equalsimpl0(i, companion.m1409getLuminosity0nO6VwU())) {
            blendMode2 = android.graphics.BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = android.graphics.BlendMode.SRC_OVER;
        return blendMode;
    }
}
