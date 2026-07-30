package z0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f10013a = new n();

    public final BlendModeColorFilter a(long j8, int i7) {
        b.h();
        return b.e(l0.w(j8), l0.s(i7));
    }

    public final m b(BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i7;
        color = blendModeColorFilter.getColor();
        long c4 = l0.c(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = c.f9983a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i7 = 0;
                break;
            case 2:
                i7 = 1;
                break;
            case 3:
                i7 = 2;
                break;
            case 4:
            default:
                i7 = 3;
                break;
            case 5:
                i7 = 4;
                break;
            case 6:
                i7 = 5;
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                i7 = 6;
                break;
            case 8:
                i7 = 7;
                break;
            case q.c.f7259c /* 9 */:
                i7 = 8;
                break;
            case q.c.f7261e /* 10 */:
                i7 = 9;
                break;
            case 11:
                i7 = 10;
                break;
            case 12:
                i7 = 11;
                break;
            case 13:
                i7 = 12;
                break;
            case 14:
                i7 = 13;
                break;
            case q.c.f7263g /* 15 */:
                i7 = 14;
                break;
            case 16:
                i7 = 15;
                break;
            case 17:
                i7 = 16;
                break;
            case 18:
                i7 = 17;
                break;
            case 19:
                i7 = 18;
                break;
            case 20:
                i7 = 19;
                break;
            case 21:
                i7 = 20;
                break;
            case 22:
                i7 = 21;
                break;
            case 23:
                i7 = 22;
                break;
            case 24:
                i7 = 23;
                break;
            case 25:
                i7 = 24;
                break;
            case 26:
                i7 = 25;
                break;
            case 27:
                i7 = 26;
                break;
            case 28:
                i7 = 27;
                break;
            case 29:
                i7 = 28;
                break;
        }
        return new m(c4, i7, blendModeColorFilter);
    }
}
