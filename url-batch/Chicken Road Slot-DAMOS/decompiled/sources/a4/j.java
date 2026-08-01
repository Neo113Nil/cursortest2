package a4;

import a2.r;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile r0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        v.j(j.class, jVar);
    }

    public static h D() {
        return (h) ((t) DEFAULT_INSTANCE.c(5));
    }

    public static void l(j jVar, long j) {
        jVar.valueCase_ = 4;
        jVar.value_ = Long.valueOf(j);
    }

    public static void m(j jVar, String str) {
        jVar.getClass();
        jVar.valueCase_ = 5;
        jVar.value_ = str;
    }

    public static void n(j jVar, g gVar) {
        jVar.getClass();
        jVar.value_ = gVar;
        jVar.valueCase_ = 6;
    }

    public static void o(j jVar, double d10) {
        jVar.valueCase_ = 7;
        jVar.value_ = Double.valueOf(d10);
    }

    public static void p(j jVar, androidx.datastore.preferences.protobuf.f fVar) {
        jVar.getClass();
        jVar.valueCase_ = 8;
        jVar.value_ = fVar;
    }

    public static void q(j jVar, boolean z10) {
        jVar.valueCase_ = 1;
        jVar.value_ = Boolean.valueOf(z10);
    }

    public static void r(j jVar, float f3) {
        jVar.valueCase_ = 2;
        jVar.value_ = Float.valueOf(f3);
    }

    public static void s(j jVar, int i3) {
        jVar.valueCase_ = 3;
        jVar.value_ = Integer.valueOf(i3);
    }

    public static j v() {
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
            case 2:
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

    @Override // androidx.datastore.preferences.protobuf.v
    public final Object c(int i3) {
        r0 r0Var;
        switch (i.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new v0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new j();
            case LONG_FIELD_NUMBER /* 4 */:
                return new h(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                r0 r0Var2 = PARSER;
                if (r0Var2 != null) {
                    return r0Var2;
                }
                synchronized (j.class) {
                    try {
                        r0Var = PARSER;
                        if (r0Var == null) {
                            r0Var = new u();
                            PARSER = r0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return r0Var;
            default:
                r.a();
                return null;
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final androidx.datastore.preferences.protobuf.f u() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.f) this.value_ : androidx.datastore.preferences.protobuf.f.f533i;
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
