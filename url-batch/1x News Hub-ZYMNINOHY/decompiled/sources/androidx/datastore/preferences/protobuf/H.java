package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f2229a;

    public H(n0 n0Var, p0 p0Var, M.k kVar) {
        this.f2229a = new G(n0Var, p0Var, kVar);
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
    public static int a(G g3, Object obj, Object obj2) {
        int Z2;
        int size;
        int Y2;
        p0 p0Var;
        int size2;
        int Y3;
        int i3 = 1;
        int i4 = r.f2338c;
        int X2 = C0146m.X(1);
        o0 o0Var = r0.f2342d;
        n0 n0Var = g3.f2226a;
        if (n0Var == o0Var) {
            X2 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Z2 = 8;
                int i5 = Z2 + X2;
                int X3 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                    X3 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i3 = 8;
                        return i3 + X3 + i5;
                    case 1:
                        ((Float) obj2).getClass();
                        i3 = 4;
                        return i3 + X3 + i5;
                    case 2:
                        i3 = C0146m.Z(((Long) obj2).longValue());
                        return i3 + X3 + i5;
                    case 3:
                        i3 = C0146m.Z(((Long) obj2).longValue());
                        return i3 + X3 + i5;
                    case 4:
                        i3 = C0146m.Z(((Integer) obj2).intValue());
                        return i3 + X3 + i5;
                    case 5:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        return i3 + X3 + i5;
                    case 6:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + X3 + i5;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i3 + X3 + i5;
                    case 8:
                        if (!(obj2 instanceof C0140g)) {
                            i3 = C0146m.W((String) obj2);
                            return i3 + X3 + i5;
                        }
                        size2 = ((C0140g) obj2).size();
                        Y3 = C0146m.Y(size2);
                        i3 = Y3 + size2;
                        return i3 + X3 + i5;
                    case 9:
                        i3 = ((AbstractC0155w) ((AbstractC0134a) obj2)).a(null);
                        return i3 + X3 + i5;
                    case 10:
                        size2 = ((AbstractC0155w) ((AbstractC0134a) obj2)).a(null);
                        Y3 = C0146m.Y(size2);
                        i3 = Y3 + size2;
                        return i3 + X3 + i5;
                    case 11:
                        if (obj2 instanceof C0140g) {
                            size2 = ((C0140g) obj2).size();
                            Y3 = C0146m.Y(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            Y3 = C0146m.Y(size2);
                        }
                        i3 = Y3 + size2;
                        return i3 + X3 + i5;
                    case 12:
                        i3 = C0146m.Y(((Integer) obj2).intValue());
                        return i3 + X3 + i5;
                    case 13:
                        i3 = C0146m.Z(((Integer) obj2).intValue());
                        return i3 + X3 + i5;
                    case 14:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + X3 + i5;
                    case 15:
                        ((Long) obj2).getClass();
                        i3 = 8;
                        return i3 + X3 + i5;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i3 = C0146m.Y((intValue >> 31) ^ (intValue << 1));
                        return i3 + X3 + i5;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i3 = C0146m.Z((longValue >> 63) ^ (longValue << 1));
                        return i3 + X3 + i5;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                Z2 = 4;
                int i52 = Z2 + X2;
                int X32 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 2:
                Z2 = C0146m.Z(((Long) obj).longValue());
                int i522 = Z2 + X2;
                int X322 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 3:
                Z2 = C0146m.Z(((Long) obj).longValue());
                int i5222 = Z2 + X2;
                int X3222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 4:
                Z2 = C0146m.Z(((Integer) obj).intValue());
                int i52222 = Z2 + X2;
                int X32222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                Z2 = 8;
                int i522222 = Z2 + X2;
                int X322222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                Z2 = 4;
                int i5222222 = Z2 + X2;
                int X3222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                Z2 = 1;
                int i52222222 = Z2 + X2;
                int X32222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof C0140g) {
                    size = ((C0140g) obj).size();
                    Y2 = C0146m.Y(size);
                    Z2 = size + Y2;
                    int i522222222 = Z2 + X2;
                    int X322222222 = C0146m.X(2);
                    p0Var = g3.f2227b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    Z2 = C0146m.W((String) obj);
                    int i5222222222 = Z2 + X2;
                    int X3222222222 = C0146m.X(2);
                    p0Var = g3.f2227b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                Z2 = ((AbstractC0155w) ((AbstractC0134a) obj)).a(null);
                int i52222222222 = Z2 + X2;
                int X32222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0155w) ((AbstractC0134a) obj)).a(null);
                Y2 = C0146m.Y(size);
                Z2 = size + Y2;
                int i522222222222 = Z2 + X2;
                int X322222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0140g) {
                    size = ((C0140g) obj).size();
                    Y2 = C0146m.Y(size);
                } else {
                    size = ((byte[]) obj).length;
                    Y2 = C0146m.Y(size);
                }
                Z2 = size + Y2;
                int i5222222222222 = Z2 + X2;
                int X3222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                Z2 = C0146m.Y(((Integer) obj).intValue());
                int i52222222222222 = Z2 + X2;
                int X32222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                Z2 = C0146m.Z(((Integer) obj).intValue());
                int i522222222222222 = Z2 + X2;
                int X322222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                Z2 = 4;
                int i5222222222222222 = Z2 + X2;
                int X3222222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                Z2 = 8;
                int i52222222222222222 = Z2 + X2;
                int X32222222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                Z2 = C0146m.Y((intValue2 >> 31) ^ (intValue2 << 1));
                int i522222222222222222 = Z2 + X2;
                int X322222222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                Z2 = C0146m.Z((longValue2 >> 63) ^ (longValue2 << 1));
                int i5222222222222222222 = Z2 + X2;
                int X3222222222222222222 = C0146m.X(2);
                p0Var = g3.f2227b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
