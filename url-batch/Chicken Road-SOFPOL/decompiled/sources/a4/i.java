package a4;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends w {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile s0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        w.j(i.class, iVar);
    }

    public static h D() {
        return (h) ((u) DEFAULT_INSTANCE.c(5));
    }

    public static void l(i iVar, long j7) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j7);
    }

    public static void m(i iVar, String str) {
        iVar.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void n(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void o(i iVar, double d8) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d8);
    }

    public static void p(i iVar, androidx.datastore.preferences.protobuf.g gVar) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = gVar;
    }

    public static void q(i iVar, boolean z3) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z3);
    }

    public static void r(i iVar, float f6) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f6);
    }

    public static void s(i iVar, int i) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i);
    }

    public static i v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w
    public final Object c(int i) {
        s0 s0Var;
        switch (w2.e.a(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new w0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new i();
            case LONG_FIELD_NUMBER /* 4 */:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                s0 s0Var2 = PARSER;
                if (s0Var2 != null) {
                    return s0Var2;
                }
                synchronized (i.class) {
                    try {
                        s0Var = PARSER;
                        if (s0Var == null) {
                            s0Var = new v();
                            PARSER = s0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s0Var;
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

    public final androidx.datastore.preferences.protobuf.g u() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.f682f;
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
