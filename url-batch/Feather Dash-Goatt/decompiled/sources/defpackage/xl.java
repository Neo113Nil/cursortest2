package defpackage;

import android.graphics.PathMeasure;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xl extends pc0 implements Function0 {
    public static final xl e;
    public static final xl g;
    public static final xl h;
    public static final xl i;
    public static final xl j;
    public static final xl k;
    public static final xl l;
    public static final xl m;
    public static final xl n;
    public static final xl o;
    public final /* synthetic */ int d;

    static {
        int i2 = 0;
        e = new xl(i2, 0);
        g = new xl(i2, 1);
        h = new xl(i2, 2);
        i = new xl(i2, 3);
        j = new xl(i2, 4);
        k = new xl(i2, 5);
        l = new xl(i2, 6);
        m = new xl(i2, 7);
        n = new xl(i2, 8);
        o = new xl(i2, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                yl.b("LocalUriHandler");
                throw null;
            case 1:
                yl.b("LocalViewConfiguration");
                throw null;
            case 2:
                yl.b("LocalWindowInfo");
                throw null;
            case 3:
                return Boolean.FALSE;
            case 4:
                return new jd0(3);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return null;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d6(new PathMeasure());
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            default:
                return Unit.a;
        }
    }
}
