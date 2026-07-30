package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f1369a;

    public H(n0 n0Var, p0 p0Var, F.k kVar) {
        this.f1369a = new G(n0Var, p0Var, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(G g2, Object obj, Object obj2) {
        int o02;
        int size;
        int m02;
        p0 p0Var;
        int size2;
        int m03;
        int i2 = 1;
        int i3 = r.f1484c;
        int k02 = C0083m.k0(1);
        o0 o0Var = r0.f1488h;
        n0 n0Var = g2.f1366a;
        if (n0Var == o0Var) {
            k02 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                o02 = 8;
                int i4 = o02 + k02;
                int k03 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                    k03 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i2 = 8;
                        return i2 + k03 + i4;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + k03 + i4;
                    case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = C0083m.o0(((Long) obj2).longValue());
                        return i2 + k03 + i4;
                    case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                        i2 = C0083m.o0(((Long) obj2).longValue());
                        return i2 + k03 + i4;
                    case F.k.LONG_FIELD_NUMBER /* 4 */:
                        i2 = C0083m.o0(((Integer) obj2).intValue());
                        return i2 + k03 + i4;
                    case F.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + k03 + i4;
                    case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + k03 + i4;
                    case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i2 + k03 + i4;
                    case F.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof C0077g)) {
                            i2 = C0083m.j0((String) obj2);
                            return i2 + k03 + i4;
                        }
                        size2 = ((C0077g) obj2).size();
                        m03 = C0083m.m0(size2);
                        i2 = m03 + size2;
                        return i2 + k03 + i4;
                    case 9:
                        i2 = ((AbstractC0092w) ((AbstractC0071a) obj2)).a(null);
                        return i2 + k03 + i4;
                    case 10:
                        size2 = ((AbstractC0092w) ((AbstractC0071a) obj2)).a(null);
                        m03 = C0083m.m0(size2);
                        i2 = m03 + size2;
                        return i2 + k03 + i4;
                    case 11:
                        if (obj2 instanceof C0077g) {
                            size2 = ((C0077g) obj2).size();
                            m03 = C0083m.m0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            m03 = C0083m.m0(size2);
                        }
                        i2 = m03 + size2;
                        return i2 + k03 + i4;
                    case 12:
                        i2 = C0083m.m0(((Integer) obj2).intValue());
                        return i2 + k03 + i4;
                    case 13:
                        i2 = C0083m.o0(((Integer) obj2).intValue());
                        return i2 + k03 + i4;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + k03 + i4;
                    case 15:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + k03 + i4;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = C0083m.m0((intValue >> 31) ^ (intValue << 1));
                        return i2 + k03 + i4;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = C0083m.o0((longValue >> 63) ^ (longValue << 1));
                        return i2 + k03 + i4;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                o02 = 4;
                int i42 = o02 + k02;
                int k032 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                o02 = C0083m.o0(((Long) obj).longValue());
                int i422 = o02 + k02;
                int k0322 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                o02 = C0083m.o0(((Long) obj).longValue());
                int i4222 = o02 + k02;
                int k03222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                o02 = C0083m.o0(((Integer) obj).intValue());
                int i42222 = o02 + k02;
                int k032222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                o02 = 8;
                int i422222 = o02 + k02;
                int k0322222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                o02 = 4;
                int i4222222 = o02 + k02;
                int k03222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                o02 = 1;
                int i42222222 = o02 + k02;
                int k032222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0077g) {
                    size = ((C0077g) obj).size();
                    m02 = C0083m.m0(size);
                    o02 = size + m02;
                    int i422222222 = o02 + k02;
                    int k0322222222 = C0083m.k0(2);
                    p0Var = g2.f1367b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    o02 = C0083m.j0((String) obj);
                    int i4222222222 = o02 + k02;
                    int k03222222222 = C0083m.k0(2);
                    p0Var = g2.f1367b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                o02 = ((AbstractC0092w) ((AbstractC0071a) obj)).a(null);
                int i42222222222 = o02 + k02;
                int k032222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0092w) ((AbstractC0071a) obj)).a(null);
                m02 = C0083m.m0(size);
                o02 = size + m02;
                int i422222222222 = o02 + k02;
                int k0322222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0077g) {
                    size = ((C0077g) obj).size();
                    m02 = C0083m.m0(size);
                } else {
                    size = ((byte[]) obj).length;
                    m02 = C0083m.m0(size);
                }
                o02 = size + m02;
                int i4222222222222 = o02 + k02;
                int k03222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                o02 = C0083m.m0(((Integer) obj).intValue());
                int i42222222222222 = o02 + k02;
                int k032222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                o02 = C0083m.o0(((Integer) obj).intValue());
                int i422222222222222 = o02 + k02;
                int k0322222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                o02 = 4;
                int i4222222222222222 = o02 + k02;
                int k03222222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                o02 = 8;
                int i42222222222222222 = o02 + k02;
                int k032222222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                o02 = C0083m.m0((intValue2 >> 31) ^ (intValue2 << 1));
                int i422222222222222222 = o02 + k02;
                int k0322222222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                o02 = C0083m.o0((longValue2 >> 63) ^ (longValue2 << 1));
                int i4222222222222222222 = o02 + k02;
                int k03222222222222222222 = C0083m.k0(2);
                p0Var = g2.f1367b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
