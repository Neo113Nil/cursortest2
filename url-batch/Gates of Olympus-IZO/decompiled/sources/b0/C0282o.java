package b0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import f.AbstractC0382a;
import h1.C0438i;

/* renamed from: b0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0282o f4285a = new C0282o();

    public final BlendModeColorFilter a(long j3, int i3) {
        AbstractC0269b.f();
        return AbstractC0269b.d(AbstractC0259J.E(j3), AbstractC0259J.B(i3));
    }

    public final C0281n b(BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i3;
        color = blendModeColorFilter.getColor();
        long b2 = AbstractC0259J.b(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = AbstractC0270c.f4262a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i3 = 0;
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                i3 = 1;
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = 2;
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
            default:
                i3 = 3;
                break;
            case 5:
                i3 = 4;
                break;
            case 6:
                i3 = 5;
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                i3 = 6;
                break;
            case 8:
                i3 = 7;
                break;
            case AbstractC0382a.f4777a /* 9 */:
                i3 = 8;
                break;
            case AbstractC0382a.f4779c /* 10 */:
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
            case AbstractC0382a.f4781e /* 15 */:
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
        return new C0281n(b2, i3, blendModeColorFilter);
    }
}
