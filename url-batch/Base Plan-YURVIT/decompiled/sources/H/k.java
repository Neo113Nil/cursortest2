package H;

import androidx.datastore.preferences.protobuf.AbstractC0108u;
import androidx.datastore.preferences.protobuf.AbstractC0110w;
import androidx.datastore.preferences.protobuf.C0095g;
import androidx.datastore.preferences.protobuf.C0109v;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.V;

/* loaded from: classes.dex */
public final class k extends AbstractC0110w {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC0110w.j(k.class, kVar);
    }

    public static i D() {
        return (i) ((AbstractC0108u) DEFAULT_INSTANCE.c(5));
    }

    public static void l(k kVar, long j2) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j2);
    }

    public static void m(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void n(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void o(k kVar, double d2) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d2);
    }

    public static void p(k kVar, C0095g c0095g) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0095g;
    }

    public static void q(k kVar, boolean z2) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z2);
    }

    public static void r(k kVar, float f2) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f2);
    }

    public static void s(k kVar, int i2) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i2);
    }

    public static k v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h B() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.m();
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0110w
    public final Object c(int i2) {
        S s2;
        switch (j.a(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new V(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new k();
            case LONG_FIELD_NUMBER /* 4 */:
                return new i(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                S s3 = PARSER;
                if (s3 != null) {
                    return s3;
                }
                synchronized (k.class) {
                    try {
                        s2 = PARSER;
                        if (s2 == null) {
                            s2 = new C0109v();
                            PARSER = s2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s2;
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

    public final C0095g u() {
        return this.valueCase_ == 8 ? (C0095g) this.value_ : C0095g.f1525g;
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
