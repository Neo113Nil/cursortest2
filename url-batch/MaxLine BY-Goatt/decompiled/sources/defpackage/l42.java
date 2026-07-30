package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l42 extends vu0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final l42 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile oz1 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        l42 l42Var = new l42();
        DEFAULT_INSTANCE = l42Var;
        vu0.j(l42.class, l42Var);
    }

    public static k42 D() {
        return (k42) ((tu0) DEFAULT_INSTANCE.c(5));
    }

    public static void l(l42 l42Var, long j) {
        l42Var.valueCase_ = 4;
        l42Var.value_ = Long.valueOf(j);
    }

    public static void m(l42 l42Var, String str) {
        l42Var.getClass();
        l42Var.valueCase_ = 5;
        l42Var.value_ = str;
    }

    public static void n(l42 l42Var, j42 j42Var) {
        l42Var.getClass();
        l42Var.value_ = j42Var;
        l42Var.valueCase_ = 6;
    }

    public static void o(l42 l42Var, double d) {
        l42Var.valueCase_ = 7;
        l42Var.value_ = Double.valueOf(d);
    }

    public static void p(l42 l42Var, cr crVar) {
        l42Var.getClass();
        l42Var.valueCase_ = 8;
        l42Var.value_ = crVar;
    }

    public static void q(l42 l42Var, boolean z) {
        l42Var.valueCase_ = 1;
        l42Var.value_ = Boolean.valueOf(z);
    }

    public static void r(l42 l42Var, float f) {
        l42Var.valueCase_ = 2;
        l42Var.value_ = Float.valueOf(f);
    }

    public static void s(l42 l42Var, int i) {
        l42Var.valueCase_ = 3;
        l42Var.value_ = Integer.valueOf(i);
    }

    public static l42 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : BuildConfig.FLAVOR;
    }

    public final j42 B() {
        return this.valueCase_ == 6 ? (j42) this.value_ : j42.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.vu0
    public final Object c(int i) {
        oz1 oz1Var;
        switch (q40.u(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new f62(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", j42.class});
            case 3:
                return new l42();
            case 4:
                return new k42(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                oz1 oz1Var2 = PARSER;
                if (oz1Var2 != null) {
                    return oz1Var2;
                }
                synchronized (l42.class) {
                    try {
                        oz1Var = PARSER;
                        if (oz1Var == null) {
                            oz1Var = new uu0();
                            PARSER = oz1Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return oz1Var;
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

    public final er u() {
        return this.valueCase_ == 8 ? (er) this.value_ : er.n;
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
