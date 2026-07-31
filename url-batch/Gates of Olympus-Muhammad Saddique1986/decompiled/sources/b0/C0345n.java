package b0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import r.AbstractC0856c;

/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0345n f5427a = new C0345n();

    public final BlendModeColorFilter a(long j3, int i3) {
        AbstractC0332a.g();
        return AbstractC0332a.f(M.D(j3), M.z(i3));
    }

    public final C0344m b(BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i3;
        color = blendModeColorFilter.getColor();
        long c2 = M.c(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = AbstractC0333b.f5404a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i3 = 0;
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                i3 = 1;
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = 2;
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
            default:
                i3 = 3;
                break;
            case 5:
                i3 = 4;
                break;
            case 6:
                i3 = 5;
                break;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                i3 = 6;
                break;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                i3 = 7;
                break;
            case AbstractC0856c.f8037c /* 9 */:
                i3 = 8;
                break;
            case AbstractC0856c.f8039e /* 10 */:
                i3 = 9;
                break;
            case 11:
                i3 = 10;
                break;
            case 12:
                i3 = 11;
                break;
            case 13:
                i3 = 12;
                break;
            case 14:
                i3 = 13;
                break;
            case AbstractC0856c.f8041g /* 15 */:
                i3 = 14;
                break;
            case 16:
                i3 = 15;
                break;
            case 17:
                i3 = 16;
                break;
            case 18:
                i3 = 17;
                break;
            case 19:
                i3 = 18;
                break;
            case 20:
                i3 = 19;
                break;
            case 21:
                i3 = 20;
                break;
            case 22:
                i3 = 21;
                break;
            case 23:
                i3 = 22;
                break;
            case 24:
                i3 = 23;
                break;
            case 25:
                i3 = 24;
                break;
            case 26:
                i3 = 25;
                break;
            case 27:
                i3 = 26;
                break;
            case 28:
                i3 = 27;
                break;
            case 29:
                i3 = 28;
                break;
        }
        return new C0344m(c2, i3, blendModeColorFilter);
    }
}
