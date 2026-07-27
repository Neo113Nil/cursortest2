package Z;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import com.appsflyer.attribution.RequestError;
import q.AbstractC1024c;

/* renamed from: Z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0317n f4537a = new C0317n();

    public final BlendModeColorFilter a(long j4, int i2) {
        AbstractC0304a.i();
        return AbstractC0304a.f(K.D(j4), K.z(i2));
    }

    public final C0316m b(BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i2;
        color = blendModeColorFilter.getColor();
        long c4 = K.c(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = AbstractC0305b.f4514a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
            default:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                i2 = 6;
                break;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                i2 = 7;
                break;
            case AbstractC1024c.f9242c /* 9 */:
                i2 = 8;
                break;
            case 10:
                i2 = 9;
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                i2 = 10;
                break;
            case 12:
                i2 = 11;
                break;
            case 13:
                i2 = 12;
                break;
            case 14:
                i2 = 13;
                break;
            case AbstractC1024c.f9246g /* 15 */:
                i2 = 14;
                break;
            case 16:
                i2 = 15;
                break;
            case 17:
                i2 = 16;
                break;
            case 18:
                i2 = 17;
                break;
            case 19:
                i2 = 18;
                break;
            case 20:
                i2 = 19;
                break;
            case 21:
                i2 = 20;
                break;
            case 22:
                i2 = 21;
                break;
            case 23:
                i2 = 22;
                break;
            case 24:
                i2 = 23;
                break;
            case 25:
                i2 = 24;
                break;
            case 26:
                i2 = 25;
                break;
            case 27:
                i2 = 26;
                break;
            case 28:
                i2 = 27;
                break;
            case 29:
                i2 = 28;
                break;
        }
        return new C0316m(c4, i2, blendModeColorFilter);
    }
}
