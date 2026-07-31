package h1;

import androidx.datastore.preferences.protobuf.AbstractC0209t;
import androidx.datastore.preferences.protobuf.AbstractC0211v;
import androidx.datastore.preferences.protobuf.C0197g;
import androidx.datastore.preferences.protobuf.C0210u;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.Y;
import m.AbstractC0600j;

/* renamed from: h1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438i extends AbstractC0211v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C0438i DEFAULT_INSTANCE;
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
        C0438i c0438i = new C0438i();
        DEFAULT_INSTANCE = c0438i;
        AbstractC0211v.l(C0438i.class, c0438i);
    }

    public static C0437h F() {
        return (C0437h) ((AbstractC0209t) DEFAULT_INSTANCE.e(5));
    }

    public static void n(C0438i c0438i, long j3) {
        c0438i.valueCase_ = 4;
        c0438i.value_ = Long.valueOf(j3);
    }

    public static void o(C0438i c0438i, String str) {
        c0438i.getClass();
        str.getClass();
        c0438i.valueCase_ = 5;
        c0438i.value_ = str;
    }

    public static void p(C0438i c0438i, C0436g c0436g) {
        c0438i.getClass();
        c0438i.value_ = c0436g;
        c0438i.valueCase_ = 6;
    }

    public static void q(C0438i c0438i, double d3) {
        c0438i.valueCase_ = 7;
        c0438i.value_ = Double.valueOf(d3);
    }

    public static void r(C0438i c0438i, C0197g c0197g) {
        c0438i.getClass();
        c0438i.valueCase_ = 8;
        c0438i.value_ = c0197g;
    }

    public static void s(C0438i c0438i, boolean z3) {
        c0438i.valueCase_ = 1;
        c0438i.value_ = Boolean.valueOf(z3);
    }

    public static void t(C0438i c0438i, float f3) {
        c0438i.valueCase_ = 2;
        c0438i.value_ = Float.valueOf(f3);
    }

    public static void u(C0438i c0438i, int i3) {
        c0438i.valueCase_ = 3;
        c0438i.value_ = Integer.valueOf(i3);
    }

    public static C0438i x() {
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

    public final C0436g D() {
        return this.valueCase_ == 6 ? (C0436g) this.value_ : C0436g.o();
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
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0211v
    public final Object e(int i3) {
        switch (AbstractC0600j.a(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new Y(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C0436g.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new C0438i();
            case LONG_FIELD_NUMBER /* 4 */:
                return new C0437h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                U u3 = PARSER;
                if (u3 == null) {
                    synchronized (C0438i.class) {
                        try {
                            u3 = PARSER;
                            if (u3 == null) {
                                u3 = new C0210u();
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

    public final C0197g w() {
        return this.valueCase_ == 8 ? (C0197g) this.value_ : C0197g.f3863f;
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
