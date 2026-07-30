package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ry0 extends m40 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final ry0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile dv0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ry0 ry0Var = new ry0();
        DEFAULT_INSTANCE = ry0Var;
        m40.j(ry0.class, ry0Var);
    }

    public static py0 D() {
        return (py0) ((k40) DEFAULT_INSTANCE.c(5));
    }

    public static void l(ry0 ry0Var, long j) {
        ry0Var.valueCase_ = 4;
        ry0Var.value_ = Long.valueOf(j);
    }

    public static void m(ry0 ry0Var, String str) {
        ry0Var.getClass();
        ry0Var.valueCase_ = 5;
        ry0Var.value_ = str;
    }

    public static void n(ry0 ry0Var, oy0 oy0Var) {
        ry0Var.getClass();
        ry0Var.value_ = oy0Var;
        ry0Var.valueCase_ = 6;
    }

    public static void o(ry0 ry0Var, double d) {
        ry0Var.valueCase_ = 7;
        ry0Var.value_ = Double.valueOf(d);
    }

    public static void p(ry0 ry0Var, ff ffVar) {
        ry0Var.getClass();
        ry0Var.valueCase_ = 8;
        ry0Var.value_ = ffVar;
    }

    public static void q(ry0 ry0Var, boolean z) {
        ry0Var.valueCase_ = 1;
        ry0Var.value_ = Boolean.valueOf(z);
    }

    public static void r(ry0 ry0Var, float f) {
        ry0Var.valueCase_ = 2;
        ry0Var.value_ = Float.valueOf(f);
    }

    public static void s(ry0 ry0Var, int i) {
        ry0Var.valueCase_ = 3;
        ry0Var.value_ = Integer.valueOf(i);
    }

    public static ry0 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final oy0 B() {
        return this.valueCase_ == 6 ? (oy0) this.value_ : oy0.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.m40
    public final Object c(int i) {
        dv0 dv0Var;
        switch (qy0.v(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c11(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", oy0.class});
            case 3:
                return new ry0();
            case 4:
                return new py0(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                dv0 dv0Var2 = PARSER;
                if (dv0Var2 != null) {
                    return dv0Var2;
                }
                synchronized (ry0.class) {
                    try {
                        dv0Var = PARSER;
                        if (dv0Var == null) {
                            dv0Var = new l40();
                            PARSER = dv0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return dv0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final ff u() {
        return this.valueCase_ == 8 ? (ff) this.value_ : ff.g;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
