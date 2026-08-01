package z2;

import j1.c;
import x2.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {
    public static final float a(float f3) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f3) & 8589934591L) / 3)) + 709952852);
        float f10 = intBitsToFloat - ((intBitsToFloat - (f3 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f3 / (f10 * f10))) * 0.33333334f);
    }

    public static final j b(c cVar) {
        return new j(Math.round(cVar.f4916a), Math.round(cVar.f4917b), Math.round(cVar.f4918c), Math.round(cVar.f4919d));
    }
}
