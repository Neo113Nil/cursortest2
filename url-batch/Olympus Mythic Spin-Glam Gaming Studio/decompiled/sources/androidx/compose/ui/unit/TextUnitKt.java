package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\"!\u0010\u001f\u001a\u00020\u001b*\u00020\u00048FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d\"!\u0010$\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\"!\u0010$\u001a\u00020\u0004*\u00020%8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010'\u001a\u0004\b \u0010&\"!\u0010$\u001a\u00020\u0004*\u00020(8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010*\u001a\u0004\b \u0010)\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "", "unitType", "v", "pack", "(JF)J", "a", "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "", "isUnspecified--R2X_6o", "(J)Z", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "", "(D)J", "(D)V", "", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TextUnitKt {
    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m2584TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m2587isUnspecifiedR2X_6o(long j) {
        return TextUnit.m2577getRawTypeimpl(j) == 0;
    }

    public static final long getSp(float f) {
        return pack(4294967296L, f);
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }

    public static final long pack(long j, float f) {
        return TextUnit.m2574constructorimpl(j | (Float.floatToIntBits(f) & 4294967295L));
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m2585checkArithmeticR2X_6o(long j) {
        if (m2587isUnspecifiedR2X_6o(j)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m2586checkArithmeticNB67dxo(long j, long j2) {
        if (m2587isUnspecifiedR2X_6o(j) || m2587isUnspecifiedR2X_6o(j2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m2592equalsimpl0(TextUnit.m2578getTypeUIouoOA(j), TextUnit.m2578getTypeUIouoOA(j2))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m2594toStringimpl(TextUnit.m2578getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m2594toStringimpl(TextUnit.m2578getTypeUIouoOA(j2)))).toString());
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m2588lerpC3pnCVY(long j, long j2, float f) {
        m2586checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m2577getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m2579getValueimpl(j), TextUnit.m2579getValueimpl(j2), f));
    }
}
