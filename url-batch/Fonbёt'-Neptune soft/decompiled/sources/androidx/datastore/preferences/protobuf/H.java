package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f1617a;

    public H(n0 n0Var, p0 p0Var, K.k kVar) {
        this.f1617a = new G(n0Var, p0Var, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(G g2, Object obj, Object obj2) {
        int r02;
        int size;
        int p02;
        p0 p0Var;
        int size2;
        int p03;
        int i2 = 1;
        int i3 = r.f1733c;
        int n02 = C0150m.n0(1);
        o0 o0Var = r0.f1737h;
        n0 n0Var = g2.f1614a;
        if (n0Var == o0Var) {
            n02 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                r02 = 8;
                int i4 = r02 + n02;
                int n03 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                    n03 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i2 = 8;
                        return i2 + n03 + i4;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + n03 + i4;
                    case 2:
                        i2 = C0150m.r0(((Long) obj2).longValue());
                        return i2 + n03 + i4;
                    case 3:
                        i2 = C0150m.r0(((Long) obj2).longValue());
                        return i2 + n03 + i4;
                    case K.k.LONG_FIELD_NUMBER /* 4 */:
                        i2 = C0150m.r0(((Integer) obj2).intValue());
                        return i2 + n03 + i4;
                    case K.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + n03 + i4;
                    case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + n03 + i4;
                    case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i2 + n03 + i4;
                    case K.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof C0144g)) {
                            i2 = C0150m.m0((String) obj2);
                            return i2 + n03 + i4;
                        }
                        size2 = ((C0144g) obj2).size();
                        p03 = C0150m.p0(size2);
                        i2 = p03 + size2;
                        return i2 + n03 + i4;
                    case 9:
                        i2 = ((AbstractC0159w) ((AbstractC0138a) obj2)).a(null);
                        return i2 + n03 + i4;
                    case 10:
                        size2 = ((AbstractC0159w) ((AbstractC0138a) obj2)).a(null);
                        p03 = C0150m.p0(size2);
                        i2 = p03 + size2;
                        return i2 + n03 + i4;
                    case 11:
                        if (obj2 instanceof C0144g) {
                            size2 = ((C0144g) obj2).size();
                            p03 = C0150m.p0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            p03 = C0150m.p0(size2);
                        }
                        i2 = p03 + size2;
                        return i2 + n03 + i4;
                    case 12:
                        i2 = C0150m.p0(((Integer) obj2).intValue());
                        return i2 + n03 + i4;
                    case 13:
                        i2 = C0150m.r0(((Integer) obj2).intValue());
                        return i2 + n03 + i4;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + n03 + i4;
                    case 15:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + n03 + i4;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = C0150m.p0((intValue >> 31) ^ (intValue << 1));
                        return i2 + n03 + i4;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = C0150m.r0((longValue >> 63) ^ (longValue << 1));
                        return i2 + n03 + i4;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                r02 = 4;
                int i42 = r02 + n02;
                int n032 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 2:
                r02 = C0150m.r0(((Long) obj).longValue());
                int i422 = r02 + n02;
                int n0322 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 3:
                r02 = C0150m.r0(((Long) obj).longValue());
                int i4222 = r02 + n02;
                int n03222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                r02 = C0150m.r0(((Integer) obj).intValue());
                int i42222 = r02 + n02;
                int n032222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                r02 = 8;
                int i422222 = r02 + n02;
                int n0322222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                r02 = 4;
                int i4222222 = r02 + n02;
                int n03222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                r02 = 1;
                int i42222222 = r02 + n02;
                int n032222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0144g) {
                    size = ((C0144g) obj).size();
                    p02 = C0150m.p0(size);
                    r02 = size + p02;
                    int i422222222 = r02 + n02;
                    int n0322222222 = C0150m.n0(2);
                    p0Var = g2.f1615b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    r02 = C0150m.m0((String) obj);
                    int i4222222222 = r02 + n02;
                    int n03222222222 = C0150m.n0(2);
                    p0Var = g2.f1615b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                r02 = ((AbstractC0159w) ((AbstractC0138a) obj)).a(null);
                int i42222222222 = r02 + n02;
                int n032222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0159w) ((AbstractC0138a) obj)).a(null);
                p02 = C0150m.p0(size);
                r02 = size + p02;
                int i422222222222 = r02 + n02;
                int n0322222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0144g) {
                    size = ((C0144g) obj).size();
                    p02 = C0150m.p0(size);
                } else {
                    size = ((byte[]) obj).length;
                    p02 = C0150m.p0(size);
                }
                r02 = size + p02;
                int i4222222222222 = r02 + n02;
                int n03222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                r02 = C0150m.p0(((Integer) obj).intValue());
                int i42222222222222 = r02 + n02;
                int n032222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                r02 = C0150m.r0(((Integer) obj).intValue());
                int i422222222222222 = r02 + n02;
                int n0322222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                r02 = 4;
                int i4222222222222222 = r02 + n02;
                int n03222222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                r02 = 8;
                int i42222222222222222 = r02 + n02;
                int n032222222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                r02 = C0150m.p0((intValue2 >> 31) ^ (intValue2 << 1));
                int i422222222222222222 = r02 + n02;
                int n0322222222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                r02 = C0150m.r0((longValue2 >> 63) ^ (longValue2 << 1));
                int i4222222222222222222 = r02 + n02;
                int n03222222222222222222 = C0150m.n0(2);
                p0Var = g2.f1615b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
