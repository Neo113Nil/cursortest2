package k1;

import androidx.datastore.preferences.protobuf.AbstractC0265t;
import androidx.datastore.preferences.protobuf.AbstractC0267v;
import androidx.datastore.preferences.protobuf.C0253g;
import androidx.datastore.preferences.protobuf.C0266u;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.Y;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class i extends AbstractC0267v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile U PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC0267v.l(i.class, iVar);
    }

    public static h F() {
        return (h) ((AbstractC0265t) DEFAULT_INSTANCE.e(5));
    }

    public static void n(i iVar, long j3) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j3);
    }

    public static void o(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void p(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void q(i iVar, double d3) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d3);
    }

    public static void r(i iVar, C0253g c0253g) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = c0253g;
    }

    public static void s(i iVar, boolean z3) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z3);
    }

    public static void t(i iVar, float f3) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f3);
    }

    public static void u(i iVar, int i3) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i3);
    }

    public static i x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g D() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.o();
    }

    public final int E() {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0267v
    public final Object e(int i3) {
        switch (AbstractC0625j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new Y(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new i();
            case LONG_FIELD_NUMBER /* 4 */:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u3 = PARSER;
                if (u3 == null) {
                    synchronized (i.class) {
                        try {
                            u3 = PARSER;
                            if (u3 == null) {
                                u3 = new C0266u();
                                PARSER = u3;
                            }
                        } finally {
                        }
                    }
                }
                return u3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0253g w() {
        return this.valueCase_ == 8 ? (C0253g) this.value_ : C0253g.f5064f;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
